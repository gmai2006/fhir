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
import org.fhir.entity.SpecimenModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A sample to be used for analysis."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Specimen  extends DomainResource  {
  /**
  * Description: "This is a Specimen resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Id for specimen."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures."
  */
  protected Identifier accessionIdentifier;

  /**
  * Description: "The availability of the specimen."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The kind of material that forms the specimen."
  */
  protected CodeableConcept type;

  /**
  * Description: "Where the specimen came from. This may be from the patient(s) or from the environment or a device."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "Time when specimen was received for processing or testing."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String receivedTime;

  /**
  * Description: "Extensions for receivedTime"
  */
  protected transient Element _receivedTime;

  /**
  * Description: "Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen."
  */
  protected java.util.List<Reference> parent;

  /**
  * Description: "Details concerning a test or procedure request that required a specimen to be collected."
  */
  protected java.util.List<Reference> request;

  /**
  * Description: "Details concerning the specimen collection."
  */
  protected SpecimenCollection collection;

  /**
  * Description: "Details concerning processing and processing steps for the specimen."
  */
  protected java.util.List<SpecimenProcessing> processing;

  /**
  * Description: "The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here."
  */
  protected java.util.List<SpecimenContainer> container;

  /**
  * Description: "To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen)."
  */
  protected java.util.List<Annotation> note;

  public Specimen() {
  }

  public Specimen(SpecimenModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.accessionIdentifier = IdentifierHelper.fromJson(o.getAccessionIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getReceivedTime()) {
      this.receivedTime = o.getReceivedTime();
    }
    if (null != o.getParent() && !o.getParent().isEmpty()) {
    	this.parent = ReferenceHelper.fromArray2Array(o.getParent());
    }
    if (null != o.getRequest() && !o.getRequest().isEmpty()) {
    	this.request = ReferenceHelper.fromArray2Array(o.getRequest());
    }
    if (null != o.getCollection() && !o.getCollection().isEmpty()) {
      this.collection = new SpecimenCollection(o.getCollection().get(0));
    }
    if (null != o.getProcessing() && !o.getProcessing().isEmpty()) {
    	this.processing = SpecimenProcessingHelper.fromArray2Array(o.getProcessing());
    }
    if (null != o.getContainer() && !o.getContainer().isEmpty()) {
    	this.container = SpecimenContainerHelper.fromArray2Array(o.getContainer());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setAccessionIdentifier( Identifier value) {
    this.accessionIdentifier = value;
  }
  public Identifier getAccessionIdentifier() {
    return this.accessionIdentifier;
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
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setReceivedTime( String value) {
    this.receivedTime = value;
  }
  public String getReceivedTime() {
    return this.receivedTime;
  }
  public void set_receivedTime( Element value) {
    this._receivedTime = value;
  }
  public Element get_receivedTime() {
    return this._receivedTime;
  }
  public void setParent( java.util.List<Reference> value) {
    this.parent = value;
  }
  public java.util.List<Reference> getParent() {
    return this.parent;
  }
  public void setRequest( java.util.List<Reference> value) {
    this.request = value;
  }
  public java.util.List<Reference> getRequest() {
    return this.request;
  }
  public void setCollection( SpecimenCollection value) {
    this.collection = value;
  }
  public SpecimenCollection getCollection() {
    return this.collection;
  }
  public void setProcessing( java.util.List<SpecimenProcessing> value) {
    this.processing = value;
  }
  public java.util.List<SpecimenProcessing> getProcessing() {
    return this.processing;
  }
  public void setContainer( java.util.List<SpecimenContainer> value) {
    this.container = value;
  }
  public java.util.List<SpecimenContainer> getContainer() {
    return this.container;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Specimen]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.accessionIdentifier != null) builder.append("accessionIdentifier" + "->" + this.accessionIdentifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.receivedTime != null) builder.append("receivedTime" + "->" + this.receivedTime.toString() + "\n"); 
     if(this._receivedTime != null) builder.append("_receivedTime" + "->" + this._receivedTime.toString() + "\n"); 
     if(this.parent != null) builder.append("parent" + "->" + this.parent.toString() + "\n"); 
     if(this.request != null) builder.append("request" + "->" + this.request.toString() + "\n"); 
     if(this.collection != null) builder.append("collection" + "->" + this.collection.toString() + "\n"); 
     if(this.processing != null) builder.append("processing" + "->" + this.processing.toString() + "\n"); 
     if(this.container != null) builder.append("container" + "->" + this.container.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Specimen,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Specimen" : { return Specimen.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	available,
  	unavailable,
  	unsatisfactory,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "available" : { return available.toString(); }
  			case "unavailable" : { return unavailable.toString(); }
  			case "unsatisfactory" : { return unsatisfactory.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}