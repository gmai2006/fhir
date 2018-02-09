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

/**
* "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
*/
@Entity
@Table(name="conceptmapgroup")
public class ConceptMapGroupModel  {
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
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ConceptMapElementModel> element = new java.util.ArrayList<>();

  /**
  * Description: "What to do when there is no match in the mappings in the group."
  */
  @javax.persistence.Basic
  @Column(name="\"unmapped_id\"")
  private String unmapped_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`unmapped_id`", insertable=false, updatable=false)
  private ConceptMapUnmappedModel unmapped;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public ConceptMapGroupModel() {
  }

  public ConceptMapGroupModel(ConceptMapGroup o) {
    this.id = o.getId();
      this.source = o.getSource();

      this.sourceVersion = o.getSourceVersion();

      this.target = o.getTarget();

      this.targetVersion = o.getTargetVersion();

      this.element = ConceptMapElement.toModelArray(o.getElement());

      if (null != o.getUnmapped()) {
      	this.unmapped_id = "unmapped" + this.getId();
        this.unmapped = new ConceptMapUnmappedModel(o.getUnmapped());
        this.unmapped.setId(this.unmapped_id);
        this.unmapped.parent_id = this.unmapped.getId();
      }

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setSource( String value) {
    this.source = value;
  }
  public String getSource() {
    return this.source;
  }
  public void setSourceVersion( String value) {
    this.sourceVersion = value;
  }
  public String getSourceVersion() {
    return this.sourceVersion;
  }
  public void setTarget( String value) {
    this.target = value;
  }
  public String getTarget() {
    return this.target;
  }
  public void setTargetVersion( String value) {
    this.targetVersion = value;
  }
  public String getTargetVersion() {
    return this.targetVersion;
  }
  public void setElement( java.util.List<ConceptMapElementModel> value) {
    this.element = value;
  }
  public java.util.List<ConceptMapElementModel> getElement() {
    return this.element;
  }
  public void setUnmapped( ConceptMapUnmappedModel value) {
    this.unmapped = value;
  }
  public ConceptMapUnmappedModel getUnmapped() {
    return this.unmapped;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("source" + "[" + String.valueOf(this.source) + "]\n"); 
     builder.append("sourceVersion" + "[" + String.valueOf(this.sourceVersion) + "]\n"); 
     builder.append("target" + "[" + String.valueOf(this.target) + "]\n"); 
     builder.append("targetVersion" + "[" + String.valueOf(this.targetVersion) + "]\n"); 
     builder.append("element" + "[" + String.valueOf(this.element) + "]\n"); 
     builder.append("unmapped" + "[" + String.valueOf(this.unmapped) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}