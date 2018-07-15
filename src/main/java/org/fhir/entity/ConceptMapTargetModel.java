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
* "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
* generated on 07/14/2018
*/
@Entity
@Table(name="conceptmaptarget")
public class ConceptMapTargetModel  implements Serializable {
	private static final long serialVersionUID = 153159210223084352L;
  /**
  * Description: "Identity (code or path) or the element/item that the map refers to."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"code\"")
  private String code;

  /**
  * Description: "The display for the code. The display is only provided to help editors when editing the concept map."
  */
  @javax.persistence.Basic
  @Column(name="\"display\"")
  private String display;

  /**
  * Description: "The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source)."
  */
  @javax.persistence.Basic
  @Column(name="\"equivalence\"")
  private String equivalence;

  /**
  * Description: "A description of status/issues in mapping that conveys additional information not represented in  the structured data."
  */
  @javax.persistence.Basic
  @Column(name="\"comment\"")
  private String comment;

  /**
  * Description: "A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value."
  */
  @javax.persistence.Basic
  @Column(name="\"dependson_id\"")
  private String dependson_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="dependson_id", insertable=false, updatable=false)
  private java.util.List<ConceptMapDependsOnModel> dependsOn;

  /**
  * Description: "A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on."
  */
  @javax.persistence.Basic
  @Column(name="\"product_id\"")
  private String product_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="product_id", insertable=false, updatable=false)
  private java.util.List<ConceptMapDependsOnModel> product;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public ConceptMapTargetModel() {
  }

  public ConceptMapTargetModel(ConceptMapTarget o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.code = o.getCode();
    this.display = o.getDisplay();
    this.equivalence = o.getEquivalence();
    this.comment = o.getComment();
    if (null != o.getDependsOn() && !o.getDependsOn().isEmpty()) {
    	this.dependson_id = "dependson" + this.id;
    	this.dependsOn = ConceptMapDependsOnHelper.toModelFromArray(o.getDependsOn(), this.dependson_id);
    }
    if (null != o.getProduct() && !o.getProduct().isEmpty()) {
    	this.product_id = "product" + this.id;
    	this.product = ConceptMapDependsOnHelper.toModelFromArray(o.getProduct(), this.product_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getEquivalence() {
    return this.equivalence;
  }
  public void setEquivalence( String value) {
    this.equivalence = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public java.util.List<ConceptMapDependsOnModel> getDependsOn() {
    return this.dependsOn;
  }
  public void setDependsOn( java.util.List<ConceptMapDependsOnModel> value) {
    this.dependsOn = value;
  }
  public java.util.List<ConceptMapDependsOnModel> getProduct() {
    return this.product;
  }
  public void setProduct( java.util.List<ConceptMapDependsOnModel> value) {
    this.product = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConceptMapTargetModel]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("equivalence" + "->" + this.equivalence + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConceptMapTargetModel]:" + "\n");
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("equivalence" + "->" + this.equivalence + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}