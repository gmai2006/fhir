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
* "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
*/
@Entity
@Table(name="compositionsection")
public class CompositionSectionModel  implements Serializable {
	private static final long serialVersionUID = 151873631135297094L;
  /**
  * Description: "The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "A code identifying the kind of content contained within the section. This must be consistent with the section title."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative."
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"mode\"")
  private String mode;

  /**
  * Description: "Specifies the order applied to the items in the section entries."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"orderedBy\"", length = 16777215)
  private String orderedBy;

  /**
  * Description: "A reference to the actual resource from which the narrative in the section is derived."
  */
  @javax.persistence.Basic
  @Column(name="\"entry_id\"")
  private String entry_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="entry_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> entry;

  /**
  * Description: "If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"emptyReason\"", length = 16777215)
  private String emptyReason;

  /**
  * Description: "A nested sub-section within this section."
  */
  @javax.persistence.Basic
  @Column(name="\"section_id\"")
  private String section_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="section_id", insertable=false, updatable=false)
  private java.util.List<CompositionSectionModel> section;

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

  public CompositionSectionModel() {
  }

  public CompositionSectionModel(CompositionSection o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.title = o.getTitle();
    this.code = JsonUtils.toJson(o.getCode());
    if (null != o.getText() ) {
    	this.text_id = "text" + this.parent_id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    this.mode = o.getMode();
    this.orderedBy = JsonUtils.toJson(o.getOrderedBy());
    if (null != o.getEntry() && !o.getEntry().isEmpty()) {
    	this.entry_id = "entry" + this.parent_id;
    	this.entry = ReferenceHelper.toModelFromArray(o.getEntry(), this.entry_id);
    }
    this.emptyReason = JsonUtils.toJson(o.getEmptyReason());
    if (null != o.getSection() && !o.getSection().isEmpty()) {
    	this.section_id = "section" + this.parent_id;
    	this.section = CompositionSectionHelper.toModelFromArray(o.getSection(), this.section_id);
    }
  }

  public String getTitle() {
    return this.title;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getMode() {
    return this.mode;
  }
  public void setMode( String value) {
    this.mode = value;
  }
  public String getOrderedBy() {
    return this.orderedBy;
  }
  public void setOrderedBy( String value) {
    this.orderedBy = value;
  }
  public java.util.List<ReferenceModel> getEntry() {
    return this.entry;
  }
  public void setEntry( java.util.List<ReferenceModel> value) {
    this.entry = value;
  }
  public String getEmptyReason() {
    return this.emptyReason;
  }
  public void setEmptyReason( String value) {
    this.emptyReason = value;
  }
  public java.util.List<CompositionSectionModel> getSection() {
    return this.section;
  }
  public void setSection( java.util.List<CompositionSectionModel> value) {
    this.section = value;
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
    builder.append("[CompositionSectionModel]:" + "\n");
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("mode" + "->" + this.mode + "\n"); 
     builder.append("orderedBy" + "->" + this.orderedBy + "\n"); 
     builder.append("emptyReason" + "->" + this.emptyReason + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CompositionSectionModel]:" + "\n");
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("mode" + "->" + this.mode + "\n"); 
     builder.append("orderedBy" + "->" + this.orderedBy + "\n"); 
     builder.append("entry" + "->" + this.entry + "\n"); 
     builder.append("emptyReason" + "->" + this.emptyReason + "\n"); 
     builder.append("section" + "->" + this.section + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}