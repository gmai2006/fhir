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
* "Raw data describing a biological sequence."
*/
@Entity
@Table(name="sequencerepository")
public class SequenceRepositoryModel  implements Serializable {
	private static final long serialVersionUID = 151967883213652713L;
  /**
  * Description: "Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "URI of an external repository which contains further details about the genetics data."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "URI of an external repository which contains further details about the genetics data."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "Id of the variant in this external repository. The server will understand how to use this id to call for more info about datasets in external repository."
  */
  @javax.persistence.Basic
  @Column(name="\"datasetId\"")
  private String datasetId;

  /**
  * Description: "Id of the variantset in this external repository. The server will understand how to use this id to call for more info about variantsets in external repository."
  */
  @javax.persistence.Basic
  @Column(name="\"variantsetId\"")
  private String variantsetId;

  /**
  * Description: "Id of the read in this external repository."
  */
  @javax.persistence.Basic
  @Column(name="\"readsetId\"")
  private String readsetId;

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

  public SequenceRepositoryModel() {
  }

  public SequenceRepositoryModel(SequenceRepository o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.type = o.getType();
    this.url = o.getUrl();
    this.name = o.getName();
    this.datasetId = o.getDatasetId();
    this.variantsetId = o.getVariantsetId();
    this.readsetId = o.getReadsetId();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getDatasetId() {
    return this.datasetId;
  }
  public void setDatasetId( String value) {
    this.datasetId = value;
  }
  public String getVariantsetId() {
    return this.variantsetId;
  }
  public void setVariantsetId( String value) {
    this.variantsetId = value;
  }
  public String getReadsetId() {
    return this.readsetId;
  }
  public void setReadsetId( String value) {
    this.readsetId = value;
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
    builder.append("[SequenceRepositoryModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("datasetId" + "->" + this.datasetId + "\n"); 
     builder.append("variantsetId" + "->" + this.variantsetId + "\n"); 
     builder.append("readsetId" + "->" + this.readsetId + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SequenceRepositoryModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("datasetId" + "->" + this.datasetId + "\n"); 
     builder.append("variantsetId" + "->" + this.variantsetId + "\n"); 
     builder.append("readsetId" + "->" + this.readsetId + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}