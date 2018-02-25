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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Measurements and simple assertions made about a patient, device or other subject."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ObservationReferenceRange  extends BackboneElement  {
  /**
  * Description: "The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3)."
  */
  protected Quantity low;

  /**
  * Description: "The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3)."
  */
  protected Quantity high;

  /**
  * Description: "Codes to indicate the what part of the targeted reference population it applies to. For example, the normal or therapeutic range."
  */
  protected CodeableConcept type;

  /**
  * Description: "Codes to indicate the target population this reference range applies to.  For example, a reference range may be based on the normal population or a particular sex or race."
  */
  protected java.util.List<CodeableConcept> appliesTo;

  /**
  * Description: "The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so."
  */
  protected Range age;

  /**
  * Description: "Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of \"Negative\" or a list or table of 'normals'."
  */
  protected String text;

  /**
  * Description: "Extensions for text"
  */
  protected transient Element _text;

  public ObservationReferenceRange() {
  }

  public ObservationReferenceRange(ObservationReferenceRangeModel o) {
    this.id = o.getId();
    if (null != o.getLow() && !o.getLow().isEmpty()) {
      this.low = new Quantity(o.getLow().get(0));
    }
    if (null != o.getHigh() && !o.getHigh().isEmpty()) {
      this.high = new Quantity(o.getHigh().get(0));
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getAppliesTo() && !o.getAppliesTo().isEmpty()) {
    	this.appliesTo = CodeableConceptHelper.fromArray2Array(o.getAppliesTo());
    }
    this.age = RangeHelper.fromJson(o.getAge());
    if (null != o.getText()) {
      this.text = o.getText();
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
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); ;
    return builder.toString();
  }


}