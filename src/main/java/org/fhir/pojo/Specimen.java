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
import com.google.gson.GsonBuilder;

/**
* "A sample to be used for analysis."
*/
public class Specimen  {
  /**
  * Description: "This is a Specimen resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Id for specimen."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures."
  */
  private Identifier accessionIdentifier;

  /**
  * Description: "The availability of the specimen."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The kind of material that forms the specimen."
  */
  private CodeableConcept type;

  /**
  * Description: "Where the specimen came from. This may be from the patient(s) or from the environment or a device."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "Time when specimen was received for processing or testing."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String receivedTime;

  /**
  * Description: "Extensions for receivedTime"
  */
  private transient Element _receivedTime;

  /**
  * Description: "Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen."
  */
  private java.util.List<Reference> parent = new java.util.ArrayList<>();

  /**
  * Description: "Details concerning a test or procedure request that required a specimen to be collected."
  */
  private java.util.List<Reference> request = new java.util.ArrayList<>();

  /**
  * Description: "Details concerning the specimen collection."
  */
  private SpecimenCollection collection;

  /**
  * Description: "Details concerning processing and processing steps for the specimen."
  */
  private java.util.List<SpecimenProcessing> processing = new java.util.ArrayList<>();

  /**
  * Description: "The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here."
  */
  private java.util.List<SpecimenContainer> container = new java.util.ArrayList<>();

  /**
  * Description: "To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen)."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

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
    this.type = CodeableConceptHelper.fromJson(o.getType());
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
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
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
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
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