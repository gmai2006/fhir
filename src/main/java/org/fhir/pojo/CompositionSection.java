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
import org.fhir.entity.CompositionSectionModel;
import com.google.gson.GsonBuilder;

/**
* "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
*/
public class CompositionSection  {
  /**
  * Description: "The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "A code identifying the kind of content contained within the section. This must be consistent with the section title."
  */
  private CodeableConcept code;

  /**
  * Description: "A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative."
  */
  private Narrative text;

  /**
  * Description: "How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String mode;

  /**
  * Description: "Extensions for mode"
  */
  private transient Element _mode;

  /**
  * Description: "Specifies the order applied to the items in the section entries."
  */
  private CodeableConcept orderedBy;

  /**
  * Description: "A reference to the actual resource from which the narrative in the section is derived."
  */
  private java.util.List<Reference> entry = new java.util.ArrayList<>();

  /**
  * Description: "If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason."
  */
  private CodeableConcept emptyReason;

  /**
  * Description: "A nested sub-section within this section."
  */
  private java.util.List<CompositionSection> section = new java.util.ArrayList<>();

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

  public CompositionSection() {
  }

  public CompositionSection(CompositionSectionModel o) {
    this.id = o.getId();
    if (null != o.getTitle()) {
      this.title = o.getTitle();
    }
    this.code = CodeableConceptHelper.fromJson(o.getCode());
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getMode()) {
      this.mode = o.getMode();
    }
    this.orderedBy = CodeableConceptHelper.fromJson(o.getOrderedBy());
    if (null != o.getEntry() && !o.getEntry().isEmpty()) {
    	this.entry = ReferenceHelper.fromArray2Array(o.getEntry());
    }
    this.emptyReason = CodeableConceptHelper.fromJson(o.getEmptyReason());
    if (null != o.getSection() && !o.getSection().isEmpty()) {
    	this.section = CompositionSectionHelper.fromArray2Array(o.getSection());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void set_title( Element value) {
    this._title = value;
  }
  public Element get_title() {
    return this._title;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setMode( String value) {
    this.mode = value;
  }
  public String getMode() {
    return this.mode;
  }
  public void set_mode( Element value) {
    this._mode = value;
  }
  public Element get_mode() {
    return this._mode;
  }
  public void setOrderedBy( CodeableConcept value) {
    this.orderedBy = value;
  }
  public CodeableConcept getOrderedBy() {
    return this.orderedBy;
  }
  public void setEntry( java.util.List<Reference> value) {
    this.entry = value;
  }
  public java.util.List<Reference> getEntry() {
    return this.entry;
  }
  public void setEmptyReason( CodeableConcept value) {
    this.emptyReason = value;
  }
  public CodeableConcept getEmptyReason() {
    return this.emptyReason;
  }
  public void setSection( java.util.List<CompositionSection> value) {
    this.section = value;
  }
  public java.util.List<CompositionSection> getSection() {
    return this.section;
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
    builder.append("[CompositionSection]:" + "\n");
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.mode != null) builder.append("mode" + "->" + this.mode.toString() + "\n"); 
     if(this._mode != null) builder.append("_mode" + "->" + this._mode.toString() + "\n"); 
     if(this.orderedBy != null) builder.append("orderedBy" + "->" + this.orderedBy.toString() + "\n"); 
     if(this.entry != null) builder.append("entry" + "->" + this.entry.toString() + "\n"); 
     if(this.emptyReason != null) builder.append("emptyReason" + "->" + this.emptyReason.toString() + "\n"); 
     if(this.section != null) builder.append("section" + "->" + this.section.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}