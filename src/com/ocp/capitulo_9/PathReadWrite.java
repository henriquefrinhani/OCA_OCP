package com.ocp.capitulo_9;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.IOException;
import java.nio.file.Files;

public class PathReadWrite {
	public static void main(String[] args){
		
		try{
			Date januaryFirts = new GregorianCalendar(2013, Calendar.JANUARY, 1).getTime();
			Path path = Paths.get("c:temp\\file2");
			Files.createFile(path);
			FileTime fileTime = FileTime.fromMillis(januaryFirts.getTime());
			Files.setLastModifiedTime(path, fileTime);
			System.out.println(Files.getLastModifiedTime(path));
			System.out.println(Files.isExecutable(path));
			System.out.println(Files.isReadable(path));
			System.out.println(Files.isWritable(path));
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
