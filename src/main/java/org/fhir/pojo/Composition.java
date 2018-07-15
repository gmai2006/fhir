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
import org.fhir.entity.CompositionModel;
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
public class Composition  extends DomainResource  {
  /**
  * Description: "This is a Composition resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time."
  */
  protected Identifier identifier;

  /**
  * Description: "The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept type;

  /**
  * Description: "A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type."
  */
  protected CodeableConcept FHIRclass;

  /**
  * Description: "Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure)."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "Describes the clinical encounter or type of care this documentation is associated with."
  */
  protected Reference encounter;

  /**
  * Description: "The composition editing time, when the composition was last logically changed by the author."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Identifies who is responsible for the information in the composition, not necessarily who typed it in."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<Reference> author;

  /**
  * Description: "Official human-readable label for the composition."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "The code specifying the level of confidentiality of the Composition."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String confidentiality;

  /**
  * Description: "Extensions for confidentiality"
  */
  protected transient Element _confidentiality;

  /**
  * Description: "A participant who has attested to the accuracy of the composition/document."
  */
  protected java.util.List<CompositionAttester> attester;

  /**
  * Description: "Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information."
  */
  protected Reference custodian;

  /**
  * Description: "Relationships that this composition has with other compositions or documents that already exist."
  */
  protected java.util.List<CompositionRelatesTo> relatesTo;

  /**
  * Description: "The clinical service, such as a colonoscopy or an appendectomy, being documented."
  */
  protected java.util.List<CompositionEvent> event;

  /**
  * Description: "The root of the sections that make up the composition."
  */
  protected java.util.List<CompositionSection> section;

  public Composition() {
  }

  public Composition(CompositionModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getFHIRclass() && !o.getFHIRclass().isEmpty()) {
      this.FHIRclass = new CodeableConcept(o.getFHIRclass().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getEncounter() && !o.getEncounter().isEmpty()) {
      this.encounter = new Reference(o.getEncounter().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
    	this.author = ReferenceHelper.fromArray2Array(o.getAuthor());
    }
    if (null != o.getTitle()) {
      this.title = o.getTitle();
    }
    if (null != o.getConfidentiality()) {
      this.confidentiality = o.getConfidentiality();
    }
    if (null != o.getAttester() && !o.getAttester().isEmpty()) {
    	this.attester = CompositionAttesterHelper.fromArray2Array(o.getAttester());
    }
    if (null != o.getCustodian() && !o.getCustodian().isEmpty()) {
      this.custodian = new Reference(o.getCustodian().get(0));
    }
    if (null != o.getRelatesTo() && !o.getRelatesTo().isEmpty()) {
    	this.relatesTo = CompositionRelatesToHelper.fromArray2Array(o.getRelatesTo());
    }
    if (null != o.getEvent() && !o.getEvent().isEmpty()) {
    	this.event = CompositionEventHelper.fromArray2Array(o.getEvent());
    }
    if (null != o.getSection() && !o.getSection().isEmpty()) {
    	this.section = CompositionSectionHelper.fromArray2Array(o.getSection());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setFHIRclass( CodeableConcept value) {
    this.FHIRclass = value;
  }
  public CodeableConcept getFHIRclass() {
    return this.FHIRclass;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setEncounter( Reference value) {
    this.encounter = value;
  }
  public Reference getEncounter() {
    return this.encounter;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setAuthor( java.util.List<Reference> value) {
    this.author = value;
  }
  public java.util.List<Reference> getAuthor() {
    return this.author;
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
  public void setConfidentiality( String value) {
    this.confidentiality = value;
  }
  public String getConfidentiality() {
    return this.confidentiality;
  }
  public void set_confidentiality( Element value) {
    this._confidentiality = value;
  }
  public Element get_confidentiality() {
    return this._confidentiality;
  }
  public void setAttester( java.util.List<CompositionAttester> value) {
    this.attester = value;
  }
  public java.util.List<CompositionAttester> getAttester() {
    return this.attester;
  }
  public void setCustodian( Reference value) {
    this.custodian = value;
  }
  public Reference getCustodian() {
    return this.custodian;
  }
  public void setRelatesTo( java.util.List<CompositionRelatesTo> value) {
    this.relatesTo = value;
  }
  public java.util.List<CompositionRelatesTo> getRelatesTo() {
    return this.relatesTo;
  }
  public void setEvent( java.util.List<CompositionEvent> value) {
    this.event = value;
  }
  public java.util.List<CompositionEvent> getEvent() {
    return this.event;
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
    builder.append("[Composition]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.FHIRclass != null) builder.append("FHIRclass" + "->" + this.FHIRclass.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.encounter != null) builder.append("encounter" + "->" + this.encounter.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.author != null) builder.append("author" + "->" + this.author.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
     if(this.confidentiality != null) builder.append("confidentiality" + "->" + this.confidentiality.toString() + "\n"); 
     if(this._confidentiality != null) builder.append("_confidentiality" + "->" + this._confidentiality.toString() + "\n"); 
     if(this.attester != null) builder.append("attester" + "->" + this.attester.toString() + "\n"); 
     if(this.custodian != null) builder.append("custodian" + "->" + this.custodian.toString() + "\n"); 
     if(this.relatesTo != null) builder.append("relatesTo" + "->" + this.relatesTo.toString() + "\n"); 
     if(this.event != null) builder.append("event" + "->" + this.event.toString() + "\n"); 
     if(this.section != null) builder.append("section" + "->" + this.section.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	Composition,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Composition" : { return Composition.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum StatusEnum {
  	preliminary,
  	FHIRfinal,
  	amended,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "preliminary" : { return preliminary.toString(); }
  			case "final" : { return FHIRfinal.toString(); }
  			case "amended" : { return amended.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}