package com.ocp.capitulo_9;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FileReadWrite {
	public static void main(String[] args) {
		try {
			Date januaryFirts = new GregorianCalendar(2013, Calendar.JANUARY, 1).getTime();
			File file = new File("c:temp\\file");
			file.createNewFile();
			file.setLastModified(januaryFirts.getTime());
			System.out.println(file.lastModified());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
