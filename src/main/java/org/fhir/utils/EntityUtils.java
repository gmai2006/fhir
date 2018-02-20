package org.fhir.utils;

import java.util.Random;

public class EntityUtils {
	public static int generateRandom() {
		return (int)(Math.random() * 100000);
	}
	
 public static String generateRandomString(int length) {
	 Random random = new Random();
   return random.ints(48,122)
           .filter(i-> (i<57 || i>65) && (i <90 || i>97))
           .mapToObj(i -> (char) i)
           .limit(length)
           .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
           .toString();
 }
}
