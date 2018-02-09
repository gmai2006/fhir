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
import org.fhir.entity.NamingSystemUniqueIdModel;
import com.google.gson.GsonBuilder;

/**
* "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types."
*/
public class NamingSystemUniqueId  {
  /**
  * Description: "Identifies the unique identifier scheme used for this particular identifier."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "The string that should be sent over the wire to identify the code system or identifier system."
  */
  private String value;

  /**
  * Description: "Extensions for value"
  */
  private transient Element _value;

  /**
  * Description: "Indicates whether this identifier is the \"preferred\" identifier of this type."
  */
  private Boolean preferred;

  /**
  * Description: "Extensions for preferred"
  */
  private transient Element _preferred;

  /**
  * Description: "Notes about the past or intended usage of this identifier."
  */
  private String comment;

  /**
  * Description: "Extensions for comment"
  */
  private transient Element _comment;

  /**
  * Description: "Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic."
  */
  private Period period;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public NamingSystemUniqueId() {
  }

  public NamingSystemUniqueId(NamingSystemUniqueIdModel o) {
    this.id = o.getId();
      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      if (null != o.getValue()) {
        this.value = new String(o.getValue());
      }

      if (null != o.getPreferred()) {
        this.preferred = new Boolean(o.getPreferred());
      }

      if (null != o.getComment()) {
        this.comment = new String(o.getComment());
      }

      this.period = Period.fromJson(o.getPeriod());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void set_value( Element value) {
    this._value = value;
  }
  public Element get_value() {
    return this._value;
  }
  public void setPreferred( Boolean value) {
    this.preferred = value;
  }
  public Boolean getPreferred() {
    return this.preferred;
  }
  public void set_preferred( Element value) {
    this._preferred = value;
  }
  public Element get_preferred() {
    return this._preferred;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("value" + "[" + String.valueOf(this.value) + "]\n"); 
     builder.append("_value" + "[" + String.valueOf(this._value) + "]\n"); 
     builder.append("preferred" + "[" + String.valueOf(this.preferred) + "]\n"); 
     builder.append("_preferred" + "[" + String.valueOf(this._preferred) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
     builder.append("_comment" + "[" + String.valueOf(this._comment) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	oid,
  	uuid,
  	uri,
  	other,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "oid" : { return oid.toString(); }
  			case "uuid" : { return uuid.toString(); }
  			case "uri" : { return uri.toString(); }
  			case "other" : { return other.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<NamingSystemUniqueId> fromArray(java.util.List<NamingSystemUniqueIdModel> list) {
    return (java.util.List<NamingSystemUniqueId>)list.stream()
      .map(model -> new NamingSystemUniqueId(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<NamingSystemUniqueIdModel> toModelArray(java.util.List<NamingSystemUniqueId> list) {
    return (java.util.List<NamingSystemUniqueIdModel>)list.stream()
      .map(model -> new NamingSystemUniqueIdModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static NamingSystemUniqueId fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, NamingSystemUniqueId.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(NamingSystemUniqueId o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<NamingSystemUniqueId> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}