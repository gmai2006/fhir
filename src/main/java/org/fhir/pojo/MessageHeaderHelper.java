/*
 * #%L
 * FHIR Implementation
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
 
/**
 * This code is 100% AUTO generated. Please do not modify it DIRECTLY
 * If you need new features or function or changes please update the templates
 * then submit the template through our web interface.  
 */
package org.fhir.pojo;
import org.fhir.entity.MessageHeaderModel;
import com.google.gson.GsonBuilder;

public class MessageHeaderHelper {
	public static java.util.List<MessageHeader> fromArray2Array(java.util.List<MessageHeaderModel> list) {
    return
    		list.stream()
    		.map(x -> new MessageHeader(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static MessageHeader fromArray2Object(java.util.List<MessageHeaderModel> list) {
    return new MessageHeader(list.get(0));
  }

  public static java.util.List<MessageHeaderModel> toModel(MessageHeader reference) {
  	MessageHeaderModel model = new MessageHeaderModel(reference);
  	return java.util.Arrays.asList(new MessageHeaderModel[] { model });
  }

  public static java.util.List<MessageHeaderModel> toModelFromArray(java.util.List<MessageHeader> list) {
    return (java.util.List<MessageHeaderModel>)list.stream()
    	.map(x -> new MessageHeaderModel(x))
      .collect(java.util.stream.Collectors.toList());
  }
  public static MessageHeader fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MessageHeader.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MessageHeader o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MessageHeader> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}