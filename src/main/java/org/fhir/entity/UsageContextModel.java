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
* "Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care)."
*/
@Entity
@Table(name="usagecontext")
public class UsageContextModel  implements Serializable {
	private static final long serialVersionUID = 151967883193841948L;
  /**
  * Description: "A code that identifies the type of context being specified by this usage context."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> code;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  */
  @javax.persistence.Basic
  @Column(name="\"valuecodeableconcept_id\"")
  private String valuecodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuecodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> valueCodeableConcept;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  */
  @javax.persistence.Basic
  @Column(name="\"valuequantity_id\"")
  private String valuequantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="valuequantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> valueQuantity;

  /**
  * Description: "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueRange\"", length = 16777215)
  private String valueRange;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public UsageContextModel() {
  }

  public UsageContextModel(UsageContext o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodingHelper.toModel(o.getCode(), this.code_id);
    }
    if (null != o.getValueCodeableConcept() ) {
    	this.valuecodeableconcept_id = "valuecodeableconcept" + this.id;
    	this.valueCodeableConcept = CodeableConceptHelper.toModel(o.getValueCodeableConcept(), this.valuecodeableconcept_id);
    }
    if (null != o.getValueQuantity() ) {
    	this.valuequantity_id = "valuequantity" + this.id;
    	this.valueQuantity = QuantityHelper.toModel(o.getValueQuantity(), this.valuequantity_id);
    }
    if (null != o.getValueRange()) {
    	this.valueRange = JsonUtils.toJson(o.getValueRange());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodingModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodingModel> value) {
    this.code = value;
  }
  public java.util.List<CodeableConceptModel> getValueCodeableConcept() {
    return this.valueCodeableConcept;
  }
  public void setValueCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.valueCodeableConcept = value;
  }
  public java.util.List<QuantityModel> getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueQuantity( java.util.List<QuantityModel> value) {
    this.valueQuantity = value;
  }
  public String getValueRange() {
    return this.valueRange;
  }
  public void setValueRange( String value) {
    this.valueRange = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[UsageContextModel]:" + "\n");
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[UsageContextModel]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept + "\n"); 
     builder.append("valueQuantity" + "->" + this.valueQuantity + "\n"); 
     builder.append("valueRange" + "->" + this.valueRange + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}