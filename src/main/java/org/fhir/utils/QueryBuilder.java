package org.fhir.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class QueryBuilder {
	Map<String, Object> params;
	
	public QueryBuilder() {
		params = new HashMap<>();
	}
	
	public QueryBuilder(Map<String, String> map) {
		params = Collections.unmodifiableMap(map);
	}
	
	public String getWhereClause() {
		StringBuilder builder = new StringBuilder(" where ");
		if (params.isEmpty()) return "";
		params.keySet().stream()
		.forEach(key -> {
			builder.append(" " + key + "=" + params.get(key) + " and ");
		});
		String result = builder.toString().trim();
		if (result.endsWith("and")) result.substring(result.length() - "and".length());
		return result;
	}
	
	public Map<String, Object> getParams() {
		return params;
	}	
}
