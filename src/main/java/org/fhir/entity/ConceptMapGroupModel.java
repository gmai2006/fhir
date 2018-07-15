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
@Table(name="conceptmapgroup")
public class ConceptMapGroupModel  implements Serializable {
	private static final long serialVersionUID = 153159210225554232L;
  /**
  * Description: "An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system)."
  */
  @javax.persistence.Basic
  @Column(name="\"source\"")
  private String source;

  /**
  * Description: "The specific version of the code system, as determined by the code system authority."
  */
  @javax.persistence.Basic
  @Column(name="\"sourceVersion\"")
  private String sourceVersion;

  /**
  * Description: "An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems)."
  */
  @javax.persistence.Basic
  @Column(name="\"target\"")
  private String target;

  /**
  * Description: "The specific version of the code system, as determined by the code system authority."
  */
  @javax.persistence.Basic
  @Column(name="\"targetVersion\"")
  private String targetVersion;

  /**
  * Description: "Mappings for an individual concept in the source to one or more concepts in the target."
  */
  @javax.persistence.Basic
  @Column(name="\"element_id\"")
  private String element_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="element_id", insertable=false, updatable=false)
  private java.util.List<ConceptMapElementModel> element;

  /**
  * Description: "What to do when there is no match in the mappings in the group."
  */
  @javax.persistence.Basic
  @Column(name="\"unmapped_id\"")
  private String unmapped_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="unmapped_id", insertable=false, updatable=false)
  private java.util.List<ConceptMapUnmappedModel> unmapped;

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

  public ConceptMapGroupModel() {
  }

  public ConceptMapGroupModel(ConceptMapGroup o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.source = o.getSource();
    this.sourceVersion = o.getSourceVersion();
    this.target = o.getTarget();
    this.targetVersion = o.getTargetVersion();
    if (null != o.getElement() && !o.getElement().isEmpty()) {
    	this.element_id = "element" + this.id;
    	this.element = ConceptMapElementHelper.toModelFromArray(o.getElement(), this.element_id);
    }
    if (null != o.getUnmapped() ) {
    	this.unmapped_id = "unmapped" + this.id;
    	this.unmapped = ConceptMapUnmappedHelper.toModel(o.getUnmapped(), this.unmapped_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getSource() {
    return this.source;
  }
  public void setSource( String value) {
    this.source = value;
  }
  public String getSourceVersion() {
    return this.sourceVersion;
  }
  public void setSourceVersion( String value) {
    this.sourceVersion = value;
  }
  public String getTarget() {
    return this.target;
  }
  public void setTarget( String value) {
    this.target = value;
  }
  public String getTargetVersion() {
    return this.targetVersion;
  }
  public void setTargetVersion( String value) {
    this.targetVersion = value;
  }
  public java.util.List<ConceptMapElementModel> getElement() {
    return this.element;
  }
  public void setElement( java.util.List<ConceptMapElementModel> value) {
    this.element = value;
  }
  public java.util.List<ConceptMapUnmappedModel> getUnmapped() {
    return this.unmapped;
  }
  public void setUnmapped( java.util.List<ConceptMapUnmappedModel> value) {
    this.unmapped = value;
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
    builder.append("[ConceptMapGroupModel]:" + "\n");
     builder.append("source" + "->" + this.source + "\n"); 
     builder.append("sourceVersion" + "->" + this.sourceVersion + "\n"); 
     builder.append("target" + "->" + this.target + "\n"); 
     builder.append("targetVersion" + "->" + this.targetVersion + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConceptMapGroupModel]:" + "\n");
     builder.append("source" + "->" + this.source + "\n"); 
     builder.append("sourceVersion" + "->" + this.sourceVersion + "\n"); 
     builder.append("target" + "->" + this.target + "\n"); 
     builder.append("targetVersion" + "->" + this.targetVersion + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}