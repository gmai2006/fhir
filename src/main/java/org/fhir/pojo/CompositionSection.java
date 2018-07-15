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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CompositionSection  extends BackboneElement  {
  /**
  * Description: "The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "A code identifying the kind of content contained within the section. This must be consistent with the section title."
  */
  protected CodeableConcept code;

  /**
  * Description: "A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative."
  */
  protected Narrative text;

  /**
  * Description: "How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String mode;

  /**
  * Description: "Extensions for mode"
  */
  protected transient Element _mode;

  /**
  * Description: "Specifies the order applied to the items in the section entries."
  */
  protected CodeableConcept orderedBy;

  /**
  * Description: "A reference to the actual resource from which the narrative in the section is derived."
  */
  protected java.util.List<Reference> entry;

  /**
  * Description: "If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason."
  */
  protected CodeableConcept emptyReason;

  /**
  * Description: "A nested sub-section within this section."
  */
  protected java.util.List<CompositionSection> section;

  public CompositionSection() {
  }

  public CompositionSection(CompositionSectionModel o) {
    this.id = o.getId();
    if (null != o.getTitle()) {
      this.title = o.getTitle();
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getMode()) {
      this.mode = o.getMode();
    }
    if (null != o.getOrderedBy() && !o.getOrderedBy().isEmpty()) {
      this.orderedBy = new CodeableConcept(o.getOrderedBy().get(0));
    }
    if (null != o.getEntry() && !o.getEntry().isEmpty()) {
    	this.entry = ReferenceHelper.fromArray2Array(o.getEntry());
    }
    if (null != o.getEmptyReason() && !o.getEmptyReason().isEmpty()) {
      this.emptyReason = new CodeableConcept(o.getEmptyReason().get(0));
    }
    if (null != o.getSection() && !o.getSection().isEmpty()) {
    	this.section = CompositionSectionHelper.fromArray2Array(o.getSection());
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
     if(this.section != null) builder.append("section" + "->" + this.section.toString() + "\n"); ;
    return builder.toString();
  }


}