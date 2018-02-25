package org.fhir.utils;

import java.util.Map;

//https://www.hl7.org/fhir/search_filter.html
public class OperatorUtils {
//'eq' | 'ne' | 'ew' | 'sw' | 'co' | 'gt' | 'le' | 'ge' | 'le' | 'ap' | 'sa' | 'eb' | 'pr' | 'po' | 'ss' | 'sb' | 'in' | 'ni' | 're' ;
	private static Map<String, String> booleanOperators() {
    return Maps.<String, String>builder().
      put("eq", "=").
      put("ne", "<>").
      put("gt", ">").
      put("le", "<").
      put("ge", ">=").
      put("le", "<=").
      put("co", "like").
      put("sw", "startsWith").
      put("ew", "endsWith").
      unmodifiable(false).
      build();
	}
	
	public static String buildQueryRhs(String key, String value) {
		String operator = value.substring(0,  2);
		if (booleanOperators().containsKey(operator)) {
			if ("co".equals(operator)) { return "LIKE CONCAT( '%',:" + key + ",'%')"; } 
			else if ("sw".equals(operator)) { return "LIKE CONCAT( '%',:" + key + ")"; } 
			else if ("ew".equals(operator)) { return "LIKE CONCAT( :" + key + ", '%')"; } 	
			else return operator + " :" + key;
		}
		return "= :" + key;
	}
	
	public static String buildValue(String key, String value) {
		String operator = value.substring(0,  2);
		if (booleanOperators().containsKey(operator)) {
			return value.substring(0, 2);
		} 
		return value;
	}
}
