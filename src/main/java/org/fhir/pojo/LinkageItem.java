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
import org.fhir.entity.LinkageItemModel;
import com.google.gson.GsonBuilder;

/**
* "Identifies two or more records (resource instances) that are referring to the same real-world \"occurrence\"."
*/
public class LinkageItem  extends BackboneElement  {
  /**
  * Description: "Distinguishes which item is \"source of truth\" (if any) and which items are no longer considered to be current representations."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "The resource instance being linked as part of the group."
  */
  @javax.validation.constraints.NotNull
  protected Reference resource;

  public LinkageItem() {
  }

  public LinkageItem(LinkageItemModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getResource() && !o.getResource().isEmpty()) {
      this.resource = new Reference(o.getResource().get(0));
    }
  }

  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setResource( Reference value) {
    this.resource = value;
  }
  public Reference getResource() {
    return this.resource;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[LinkageItem]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	source,
  	alternate,
  	historical,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "source" : { return source.toString(); }
  			case "alternate" : { return alternate.toString(); }
  			case "historical" : { return historical.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}