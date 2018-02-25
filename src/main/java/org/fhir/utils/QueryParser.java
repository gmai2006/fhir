package org.fhir.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.ws.rs.core.MultivaluedMap;

public class QueryParser {
	private static final Logger logger = Logger.getLogger(QueryParser.class.getName());
	
	public static String convertMap2Str(MultivaluedMap<String, String> map) {
		return map.entrySet()
        .stream()
        .map(entry -> entry.getKey() + "=" + entry.getValue().get(0))
        .collect(Collectors.joining("&"));
	}
	/**
	 * http://hl7.org/fhir/search.html
	 * Servers may receive parameters from the client that they do not recognise, or may receive parameters they recognise but do not support (either in general, or for a specific search). 
	 * In general, servers SHOULD ignore unknown or unsupported parameters for the following reasons:
	 * @param params
	 * @param valid
	 * @return
	 */

	//https://stackoverflow.com/questions/13592236/parse-a-uri-string-into-name-value-collection
	public static Map<String, String> parse(String params) {
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
