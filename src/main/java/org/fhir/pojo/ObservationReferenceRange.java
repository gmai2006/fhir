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
  @javax.validation.constraints.NotNull
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
    this.low = QuantityHelper.fromJson(o.getLow());
    this.high = QuantityHelper.fromJson(o.getHigh());
    this.type = CodeableConceptHelper.fromJson(o.getType());
    this.age = RangeHelper.fromJson(o.getAge());
    if (null != o.getText()) {
      this.text = o.getText();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[ObservationReferenceRange]:" + "\n");
     if(this.low != null) builder.append("low" + "->" + this.low.toString() + "\n"); 
     if(this.high != null) builder.append("high" + "->" + this.high.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.appliesTo != null) builder.append("appliesTo" + "->" + this.appliesTo.toString() + "\n"); 
     if(this.age != null) builder.append("age" + "->" + this.age.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}