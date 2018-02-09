import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class TestJsonParser {
	private final static Logger logger = Logger.getLogger(TestJsonParser.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonObject o = parseJson(Paths.get("/media/paul/workspace/fhir-data/definitions.json/fhir.schema.json/Account.schema.json"));
		JsonObject definitions = o.getAsJsonObject("definitions");
		definitions.entrySet().forEach(x -> {
			JsonObject clazz = x.getValue().getAsJsonObject();
			printClass(clazz);
		});
	}
	
	private static void printClass(JsonObject clazz) {
		JsonArray arr = clazz.getAsJsonArray("allOf");
		List<JsonObject> list = new ArrayList<>();
		arr.forEach(x -> list.add((JsonObject)x));
		
		
		List<JsonObject> properties = list.stream()
		.filter(x -> x.get("$ref") == null)
		.collect(Collectors.toList());

//		logger.info("size " + list);
		logger.info("class description:[ " + properties.get(0).get("description"));
		printProperties((JsonObject)properties.get(0).get("properties"));
		
		
	}
	
	private static void printProperties(JsonObject properties) {
		properties.entrySet().stream()
		.forEach(x -> {
			logger.info("Field name :" + x);
			printField((JsonObject)x.getValue().getAsJsonObject() );
		});
	}
	
	private static void printField(JsonObject field) {
//		logger.info("Descr:" + field.get("description").toString());
		field.entrySet().stream()
		.forEach(x -> {
			if ("description".equals(x.getKey())) logger.info("Descr:" + x.getValue().toString());
			else if ("$ref".equals(x.getKey())) logger.info("Type" + getTypeFromRef(x.getValue().toString()));
			else if ("type".equals(x.getKey())) logger.info("Type:" + x.getValue().toString());
			else if ("enum".equals(x.getKey())) logger.info("Enum:" + x.getValue().toString());
			else if ("items".equals(x.getKey())) logger.info("Type Array of:" + getTypeFromRef(((JsonObject)x.getValue()).get("$ref").toString()));
			else logger.info(x + ":" + x.getValue().toString());
		});
	}
	
	private static String getTypeFromRef(String ref) {
		return ref.substring(ref.lastIndexOf("/") + 1);
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

}
