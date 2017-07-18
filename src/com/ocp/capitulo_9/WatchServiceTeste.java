package com.ocp.capitulo_9;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;

public class WatchServiceTeste extends SimpleFileVisitorTeste {
	public static void main(String[] args) throws IOException {

		Path dir = Paths.get("c:\\dir");

		WatchService watcher = FileSystems.getDefault().newWatchService();
		dir.register(watcher, ENTRY_DELETE);

		while (true) {
			WatchKey key;
			try {
				key = watcher.take();
			} catch (InterruptedException e) {
				return;
			}

			for (WatchEvent<?> event : key.pollEvents()) {
				WatchEvent.Kind<?> kind = event.kind();

				System.out.println(kind.name());
				System.out.println(kind.type());
				System.out.println(event.context());
				String nome = event.context().toString();
				if (nome.equals("directoryToDelete")) {
					System.out.println("Directory deleted");
					return;
				}
			}
			key.reset();
		}
	}
}
