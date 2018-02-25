package org.fhir.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class QueryBuilder {
	Map<String, Object> params;
	
	public QueryBuilder() {
		params = new HashMap<>();
	}
	
	public QueryBuilder(Map<String, String> map) {
		params = Collections.unmodifiableMap(map);
	}
	
	public String getWhereClause() {
		if (params.isEmpty()) return "";
		StringBuilder builder = new StringBuilder(" where ");
		params.keySet().stream()
		.filter(key -> null != params.get(key) && StringUtils.isNoneEmpty((String)params.get(key)))
		.forEach(key -> {
			builder.append(" " + key + OperatorUtils.buildQueryRhs(key, (String)params.get(key)) + " and ");
		});
		
		String result = builder.toString().trim();
		if (result.endsWith("and")) result = result.substring(0, result.length() - "and".length());
		return result;
	}
	
	public Map<String, Object> getParams() {
		return params.entrySet().stream()
		.collect(Collectors.toMap(entry -> (String)entry.getKey() 
				, entry -> OperatorUtils.buildValue(entry.getKey(), (String)entry.getValue())));
	}	
}
