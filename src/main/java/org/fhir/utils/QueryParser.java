package org.fhir.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class QueryParser {
	private static final Logger logger = Logger.getLogger(QueryParser.class.getName());
	
	/**
	 * http://hl7.org/fhir/search.html
	 * Servers may receive parameters from the client that they do not recognise, or may receive parameters they recognise but do not support (either in general, or for a specific search). 
	 * In general, servers SHOULD ignore unknown or unsupported parameters for the following reasons:
	 * @param params
	 * @param valid
	 * @return
	 */
	public static Map<String, String> parse(String params, String valid) {
		Map<String, String> map = parse(params);
		java.util.List<String> unknownParams = map.keySet().stream()
				.filter(key -> !valid.contains(key))
				.collect(Collectors.toList());
		
		logger.info("Unknown params " + unknownParams.toString());
		
		return map.keySet().stream()
				.filter(key -> valid.contains(key))
				.collect(Collectors.toMap(key -> key, key -> map.get(key)));
	}
	
	//https://stackoverflow.com/questions/13592236/parse-a-uri-string-into-name-value-collection
	private static Map<String, String> parse(String params) {
		return 
        Pattern.compile("&").splitAsStream(params)
        .map(s -> Arrays.copyOf(s.split("="), 2))
        .collect(Collectors.toMap(arr -> decode(arr[0]), arr -> decode(arr[1])));
	}
	
	private static String decode(final String encoded) {
    try {
        return encoded == null ? null : URLDecoder.decode(encoded, "UTF-8");
    } catch(final UnsupportedEncodingException e) {
        throw new RuntimeException("Impossible: UTF-8 is a required encoding", e);
    }
}
}
