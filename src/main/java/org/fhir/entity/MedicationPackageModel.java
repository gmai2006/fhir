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
* "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
*/
@Entity
@Table(name="medicationpackage")
public class MedicationPackageModel  implements Serializable {
	private static final long serialVersionUID = 151910893727732309L;
  /**
  * Description: "The kind of container that this package comes as."
  */
  @javax.persistence.Basic
  @Column(name="\"container_id\"")
  private String container_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="container_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> container;

  /**
  * Description: "A set of components that go to make up the described item."
  */
  @javax.persistence.Basic
  @Column(name="\"content_id\"")
  private String content_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="content_id", insertable=false, updatable=false)
  private java.util.List<MedicationContentModel> content;

  /**
  * Description: "Information about a group of medication produced or packaged from one production run."
  */
  @javax.persistence.Basic
  @Column(name="\"batch_id\"")
  private String batch_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="batch_id", insertable=false, updatable=false)
  private java.util.List<MedicationBatchModel> batch;

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

  public MedicationPackageModel() {
  }

  public MedicationPackageModel(MedicationPackage o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getContainer() ) {
    	this.container_id = "container" + this.parent_id;
    	this.container = CodeableConceptHelper.toModel(o.getContainer(), this.container_id);
    }
    if (null != o.getContent() && !o.getContent().isEmpty()) {
    	this.content_id = "content" + this.parent_id;
    	this.content = MedicationContentHelper.toModelFromArray(o.getContent(), this.content_id);
    }
    if (null != o.getBatch() && !o.getBatch().isEmpty()) {
    	this.batch_id = "batch" + this.parent_id;
    	this.batch = MedicationBatchHelper.toModelFromArray(o.getBatch(), this.batch_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getContainer() {
    return this.container;
  }
  public void setContainer( java.util.List<CodeableConceptModel> value) {
    this.container = value;
  }
  public java.util.List<MedicationContentModel> getContent() {
    return this.content;
  }
  public void setContent( java.util.List<MedicationContentModel> value) {
    this.content = value;
  }
  public java.util.List<MedicationBatchModel> getBatch() {
    return this.batch;
  }
  public void setBatch( java.util.List<MedicationBatchModel> value) {
    this.batch = value;
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
    builder.append("[MedicationPackageModel]:" + "\n");
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationPackageModel]:" + "\n");
     builder.append("container" + "->" + this.container + "\n"); 
     builder.append("content" + "->" + this.content + "\n"); 
     builder.append("batch" + "->" + this.batch + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}