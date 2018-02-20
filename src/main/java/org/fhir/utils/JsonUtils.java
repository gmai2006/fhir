package org.fhir.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JsonUtils {
	private final static Logger logger = Logger.getLogger(JsonUtils.class.getName());
	private static Gson gson;
	
	public static Gson getGson() {
		if (null == gson) gson = new GsonBuilder().create();
		return gson;
	}

	public static JsonObject parseJson(Path inputFile) {
		try {
			return getGson().fromJson(new BufferedReader(new FileReader(inputFile.toFile())), JsonObject.class);
		} catch (Exception ex) {
			logger.severe("Unable to read from [" + ex.getMessage() + "]");
			return null;
		}
	}
	
	public static String toJson(Object o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
	
	public static java.util.List json2Array(String json) {
		if (null == json) return null;
		if ( "[]".equals(json)) return new ArrayList<>();
		return getGson().fromJson(json, java.util.List.class);
	}
}
