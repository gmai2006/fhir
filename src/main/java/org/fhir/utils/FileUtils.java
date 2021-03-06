package org.fhir.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileUtils {

	private static Log logger = LogFactory.getLog(FileUtils.class);

	public static void writeStringToFile(Path path, String s) throws Exception {

		if (null == path)
			throw new IllegalArgumentException("Input file required!");

		BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()));
		writer.write(s);
		writer.flush();
		writer.close();
	}

	public static void writeListOfStringToFile(File filename, List<String> list) throws Exception {

		if (null == filename)
			throw new IllegalArgumentException("Input file required!");

		if (!filename.exists()) filename.getParentFile().mkdirs();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

		for (String s : list) {
			writer.write(s);
			writer.newLine();
		}
		writer.flush();
		writer.close();
	}

	public static List<String> readFiletoListOfString(String path, Charset encoding) throws Exception {
		return Files.readAllLines(Paths.get(path), encoding);
	}

	public static String readFile2String(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
}
