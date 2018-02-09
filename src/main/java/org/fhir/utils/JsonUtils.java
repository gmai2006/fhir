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
	
	public static String write2String(Object o) {
		try {
	    Gson gson = new GsonBuilder().create();
	    return gson.toJson(o);
		} catch (Exception ex) {
			logger.severe("Unable to write object to json [" + ex.getMessage() + "]");
			return "";
		}
	}
	
	public static JsonObject parseJson(Path inputFile) {
		try {
			Gson gson = new GsonBuilder().create();
			return gson.fromJson(new BufferedReader(new FileReader(inputFile.toFile())), JsonObject.class);
		} catch (Exception ex) {
			logger.severe("Unable to read from [" + ex.getMessage() + "]");
			return null;
		}
	}
	
	public static java.util.List json2Array(String json) {
		if ( "[]".equals(json)) return new ArrayList<>();
		
		System.out.println("input json " + json);
		return getGson().fromJson(json, java.util.List.class);
	}
}
