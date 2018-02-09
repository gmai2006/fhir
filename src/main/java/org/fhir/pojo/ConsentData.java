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
import org.fhir.entity.ConsentDataModel;
import com.google.gson.GsonBuilder;

/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
*/
public class ConsentData  {
  /**
  * Description: "How the resource reference is interpreted when testing consent restrictions."
  */
  private String meaning;

  /**
  * Description: "Extensions for meaning"
  */
  private transient Element _meaning;

  /**
  * Description: "A reference to a specific resource that defines which resources are covered by this consent."
  */
  @javax.validation.constraints.NotNull
  private Reference reference;

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

  public ConsentData() {
  }

  public ConsentData(ConsentDataModel o) {
    this.id = o.getId();
      if (null != o.getMeaning()) {
        this.meaning = new String(o.getMeaning());
      }

      if (null != o.getReference()) {
        this.reference = new Reference(o.getReference());
        this.reference.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setMeaning( String value) {
    this.meaning = MeaningEnum.fromCode(value);
  }
  public String getMeaning() {
    return this.meaning;
  }
  public void set_meaning( Element value) {
    this._meaning = value;
  }
  public Element get_meaning() {
    return this._meaning;
  }
  public void setReference( Reference value) {
    this.reference = value;
  }
  public Reference getReference() {
    return this.reference;
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
     builder.append("meaning" + "[" + String.valueOf(this.meaning) + "]\n"); 
     builder.append("_meaning" + "[" + String.valueOf(this._meaning) + "]\n"); 
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum MeaningEnum {
  	instance,
  	related,
  	dependents,
  	authoredby,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "instance" : { return instance.toString(); }
  			case "related" : { return related.toString(); }
  			case "dependents" : { return dependents.toString(); }
  			case "authoredby" : { return authoredby.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ConsentData> fromArray(java.util.List<ConsentDataModel> list) {
    return (java.util.List<ConsentData>)list.stream()
      .map(model -> new ConsentData(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ConsentDataModel> toModelArray(java.util.List<ConsentData> list) {
    return (java.util.List<ConsentDataModel>)list.stream()
      .map(model -> new ConsentDataModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ConsentData fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ConsentData.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ConsentData o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ConsentData> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}