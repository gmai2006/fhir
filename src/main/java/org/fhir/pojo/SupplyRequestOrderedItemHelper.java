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
import org.fhir.entity.SupplyRequestOrderedItemModel;
import com.google.gson.GsonBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class SupplyRequestOrderedItemHelper {
	public static java.util.List<SupplyRequestOrderedItem> fromArray2Array(java.util.List<SupplyRequestOrderedItemModel> list) {
    return
    		list.stream()
    		.map(x -> new SupplyRequestOrderedItem(x))
    		.collect(java.util.stream.Collectors.toList());
  }

  public static SupplyRequestOrderedItem fromArray2Object(java.util.List<SupplyRequestOrderedItemModel> list) {
    return new SupplyRequestOrderedItem(list.get(0));
  }

  public static java.util.List<SupplyRequestOrderedItemModel> toModel(SupplyRequestOrderedItem reference, String parentId) {
  	SupplyRequestOrderedItemModel model = new SupplyRequestOrderedItemModel(reference, parentId);
  	return java.util.Arrays.asList(new SupplyRequestOrderedItemModel[] { model });
  }

  public static java.util.List<SupplyRequestOrderedItemModel> toModelFromArray(java.util.List<SupplyRequestOrderedItem> list, String parentId) {
    return (java.util.List<SupplyRequestOrderedItemModel>)list.stream()
    	.map(x -> new SupplyRequestOrderedItemModel(x, parentId))
      .collect(java.util.stream.Collectors.toList());
  }
  public static SupplyRequestOrderedItem fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, SupplyRequestOrderedItem.class);
  }
}