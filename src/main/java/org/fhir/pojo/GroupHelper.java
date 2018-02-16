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
import org.fhir.entity.GroupModel;
import com.google.gson.GsonBuilder;

public class GroupHelper {
	public static java.util.List<Group> fromArray2Array(java.util.List<GroupModel> list) {
    return
    		list.stream()
    		.map(x -> new Group(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static Group fromArray2Object(java.util.List<GroupModel> list) {
    return new Group(list.get(0));
  }

  public static java.util.List<GroupModel> toModel(Group reference) {
  	GroupModel model = new GroupModel(reference);
  	return java.util.Arrays.asList(new GroupModel[] { model });
  }

  public static java.util.List<GroupModel> toModelFromArray(java.util.List<Group> list) {
    return (java.util.List<GroupModel>)list.stream()
    	.map(x -> new GroupModel(x))
      .collect(java.util.stream.Collectors.toList());
  }
  public static Group fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Group.class);
  }
}