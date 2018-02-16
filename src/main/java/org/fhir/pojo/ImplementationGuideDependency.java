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
import org.fhir.entity.ImplementationGuideDependencyModel;
import com.google.gson.GsonBuilder;

/**
* "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
*/
public class ImplementationGuideDependency  extends BackboneElement  {
  /**
  * Description: "How the dependency is represented when the guide is published."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "Where the dependency is located."
  */
  protected String uri;

  /**
  * Description: "Extensions for uri"
  */
  protected transient Element _uri;

  public ImplementationGuideDependency() {
  }

  public ImplementationGuideDependency(ImplementationGuideDependencyModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getUri()) {
      this.uri = o.getUri();
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
  public void setUri( String value) {
    this.uri = value;
  }
  public String getUri() {
    return this.uri;
  }
  public void set_uri( Element value) {
    this._uri = value;
  }
  public Element get_uri() {
    return this._uri;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImplementationGuideDependency]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.uri != null) builder.append("uri" + "->" + this.uri.toString() + "\n"); 
     if(this._uri != null) builder.append("_uri" + "->" + this._uri.toString() + "\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	reference,
  	inclusion,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "reference" : { return reference.toString(); }
  			case "inclusion" : { return inclusion.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}