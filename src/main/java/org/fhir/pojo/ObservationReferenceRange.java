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
import org.fhir.entity.ObservationReferenceRangeModel;
import com.google.gson.GsonBuilder;

/**
* "Measurements and simple assertions made about a patient, device or other subject."
*/
public class ObservationReferenceRange  {
  /**
  * Description: "The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3)."
  */
  private Quantity low;

  /**
  * Description: "The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3)."
  */
  private Quantity high;

  /**
  * Description: "Codes to indicate the what part of the targeted reference population it applies to. For example, the normal or therapeutic range."
  */
  private CodeableConcept type;

  /**
  * Description: "Codes to indicate the target population this reference range applies to.  For example, a reference range may be based on the normal population or a particular sex or race."
  */
  private java.util.List<CodeableConcept> appliesTo = new java.util.ArrayList<>();

  /**
  * Description: "The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so."
  */
  private Range age;

  /**
  * Description: "Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of \"Negative\" or a list or table of 'normals'."
  */
  private String text;

  /**
  * Description: "Extensions for text"
  */
  private transient Element _text;

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

  public ObservationReferenceRange() {
  }

  public ObservationReferenceRange(ObservationReferenceRangeModel o) {
    this.id = o.getId();
      this.low = Quantity.fromJson(o.getLow());
      this.high = Quantity.fromJson(o.getHigh());
      this.type = CodeableConcept.fromJson(o.getType());
      this.appliesTo = CodeableConcept.fromArray(o.getAppliesTo());
      this.age = Range.fromJson(o.getAge());
      if (null != o.getText()) {
        this.text = new String(o.getText());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setLow( Quantity value) {
    this.low = value;
  }
  public Quantity getLow() {
    return this.low;
  }
  public void setHigh( Quantity value) {
    this.high = value;
  }
  public Quantity getHigh() {
    return this.high;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setAppliesTo( java.util.List<CodeableConcept> value) {
    this.appliesTo = value;
  }
  public java.util.List<CodeableConcept> getAppliesTo() {
    return this.appliesTo;
  }
  public void setAge( Range value) {
    this.age = value;
  }
  public Range getAge() {
    return this.age;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void set_text( Element value) {
    this._text = value;
  }
  public Element get_text() {
    return this._text;
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
     builder.append("low" + "[" + String.valueOf(this.low) + "]\n"); 
     builder.append("high" + "[" + String.valueOf(this.high) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("appliesTo" + "[" + String.valueOf(this.appliesTo) + "]\n"); 
     builder.append("age" + "[" + String.valueOf(this.age) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("_text" + "[" + String.valueOf(this._text) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ObservationReferenceRange> fromArray(java.util.List<ObservationReferenceRangeModel> list) {
    return (java.util.List<ObservationReferenceRange>)list.stream()
      .map(model -> new ObservationReferenceRange(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ObservationReferenceRangeModel> toModelArray(java.util.List<ObservationReferenceRange> list) {
    return (java.util.List<ObservationReferenceRangeModel>)list.stream()
      .map(model -> new ObservationReferenceRangeModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ObservationReferenceRange fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ObservationReferenceRange.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ObservationReferenceRange o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ObservationReferenceRange> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}