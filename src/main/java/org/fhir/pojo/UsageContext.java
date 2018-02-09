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
import org.fhir.entity.UsageContextModel;
import com.google.gson.GsonBuilder;

/**
* "Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care)."
*/
public class UsageContext  {
  /**
  * Description: "A code that identifies the type of context being specified by this usage context."
  */
  @javax.validation.constraints.NotNull
  private Coding code;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  */
  private CodeableConcept valueCodeableConcept;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  */
  private Quantity valueQuantity;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  */
  private Range valueRange;

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

  public UsageContext() {
  }

  public UsageContext(UsageContextModel o) {
    this.id = o.getId();
      this.code = Coding.fromJson(o.getCode());
      this.valueCodeableConcept = CodeableConcept.fromJson(o.getValueCodeableConcept());
      this.valueQuantity = Quantity.fromJson(o.getValueQuantity());
      this.valueRange = Range.fromJson(o.getValueRange());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCode( Coding value) {
    this.code = value;
  }
  public Coding getCode() {
    return this.code;
  }
  public void setValueCodeableConcept( CodeableConcept value) {
    this.valueCodeableConcept = value;
  }
  public CodeableConcept getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueQuantity( Quantity value) {
    this.valueQuantity = value;
  }
  public Quantity getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueRange( Range value) {
    this.valueRange = value;
  }
  public Range getValueRange() {
    return this.valueRange;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("valueCodeableConcept" + "[" + String.valueOf(this.valueCodeableConcept) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueRange" + "[" + String.valueOf(this.valueRange) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<UsageContext> fromArray(java.util.List<UsageContextModel> list) {
    return (java.util.List<UsageContext>)list.stream()
      .map(model -> new UsageContext(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<UsageContextModel> toModelArray(java.util.List<UsageContext> list) {
    return (java.util.List<UsageContextModel>)list.stream()
      .map(model -> new UsageContextModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static UsageContext fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, UsageContext.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(UsageContext o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<UsageContext> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}