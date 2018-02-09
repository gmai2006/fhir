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
import org.fhir.entity.NarrativeModel;
import com.google.gson.GsonBuilder;

/**
* "A human-readable formatted text, including images."
*/
public class Narrative  {
  /**
  * Description: "The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The actual narrative content, a stripped down version of XHTML."
  */
  @javax.validation.constraints.NotNull
  private String div;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public Narrative() {
  }

  public Narrative(NarrativeModel o) {
    this.id = o.getId();
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getDiv()) {
        this.div = new String(o.getDiv());
      }

      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setDiv( String value) {
    this.div = value;
  }
  public String getDiv() {
    return this.div;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("div" + "[" + String.valueOf(this.div) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum StatusEnum {
  	generated,
  	extensions,
  	additional,
  	empty,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "generated" : { return generated.toString(); }
  			case "extensions" : { return extensions.toString(); }
  			case "additional" : { return additional.toString(); }
  			case "empty" : { return empty.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Narrative> fromArray(java.util.List<NarrativeModel> list) {
    return (java.util.List<Narrative>)list.stream()
      .map(model -> new Narrative(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<NarrativeModel> toModelArray(java.util.List<Narrative> list) {
    return (java.util.List<NarrativeModel>)list.stream()
      .map(model -> new NarrativeModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Narrative fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Narrative.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Narrative o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Narrative> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}