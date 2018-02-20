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
package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "Measurements and simple assertions made about a patient, device or other subject."
*/
@Entity
@Table(name="observationreferencerange")
public class ObservationReferenceRangeModel  implements Serializable {
	private static final long serialVersionUID = 151910893765711083L;
  /**
  * Description: "The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3)."
  */
  @javax.persistence.Basic
  @Column(name="\"low_id\"")
  private String low_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="low_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> low;

  /**
  * Description: "The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3)."
  */
  @javax.persistence.Basic
  @Column(name="\"high_id\"")
  private String high_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="high_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> high;

  /**
  * Description: "Codes to indicate the what part of the targeted reference population it applies to. For example, the normal or therapeutic range."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "Codes to indicate the target population this reference range applies to.  For example, a reference range may be based on the normal population or a particular sex or race."
  */
  @javax.persistence.Basic
  @Column(name="\"appliesto_id\"")
  private String appliesto_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="appliesto_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> appliesTo;

  /**
  * Description: "The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"age\"", length = 16777215)
  private String age;

  /**
  * Description: "Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of \"Negative\" or a list or table of 'normals'."
  */
  @javax.persistence.Basic
  @Column(name="\"text\"")
  private String text;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public ObservationReferenceRangeModel() {
  }

  public ObservationReferenceRangeModel(ObservationReferenceRange o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getLow() ) {
    	this.low_id = "low" + this.parent_id;
    	this.low = QuantityHelper.toModel(o.getLow(), this.low_id);
    }
    if (null != o.getHigh() ) {
    	this.high_id = "high" + this.parent_id;
    	this.high = QuantityHelper.toModel(o.getHigh(), this.high_id);
    }
    if (null != o.getType() ) {
    	this.type_id = "type" + this.parent_id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getAppliesTo() && !o.getAppliesTo().isEmpty()) {
    	this.appliesto_id = "appliesto" + this.parent_id;
    	this.appliesTo = CodeableConceptHelper.toModelFromArray(o.getAppliesTo(), this.appliesto_id);
    }
    if (null != o.getAge()) {
    	this.age = JsonUtils.toJson(o.getAge());
    }
    this.text = o.getText();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<QuantityModel> getLow() {
    return this.low;
  }
  public void setLow( java.util.List<QuantityModel> value) {
    this.low = value;
  }
  public java.util.List<QuantityModel> getHigh() {
    return this.high;
  }
  public void setHigh( java.util.List<QuantityModel> value) {
    this.high = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<CodeableConceptModel> getAppliesTo() {
    return this.appliesTo;
  }
  public void setAppliesTo( java.util.List<CodeableConceptModel> value) {
    this.appliesTo = value;
  }
  public String getAge() {
    return this.age;
  }
  public void setAge( String value) {
    this.age = value;
  }
  public String getText() {
    return this.text;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ObservationReferenceRangeModel]:" + "\n");
     builder.append("age" + "->" + this.age + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ObservationReferenceRangeModel]:" + "\n");
     builder.append("low" + "->" + this.low + "\n"); 
     builder.append("high" + "->" + this.high + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("appliesTo" + "->" + this.appliesTo + "\n"); 
     builder.append("age" + "->" + this.age + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}