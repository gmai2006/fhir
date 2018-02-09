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
import org.fhir.entity.MedicationAdministrationModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
*/
public class MedicationAdministration  {
  /**
  * Description: "This is a MedicationAdministration resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A protocol, guideline, orderset or other definition that was adhered to in whole or in part by this event."
  */
  private java.util.List<Reference> definition = new java.util.ArrayList<>();

  /**
  * Description: "A larger event of which this particular event is a component or step."
  */
  private java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Indicates the type of medication administration and where the medication is expected to be consumed or administered."
  */
  private CodeableConcept category;

  /**
  * Description: "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  */
  private CodeableConcept medicationCodeableConcept;

  /**
  * Description: "Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
  */
  private Reference medicationReference;

  /**
  * Description: "The person or animal or group receiving the medication."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "The visit, admission or other contact between patient and health care provider the medication administration was performed as part of."
  */
  private Reference context;

  /**
  * Description: "Additional information (for example, patient height and weight) that supports the administration of the medication."
  */
  private java.util.List<Reference> supportingInformation = new java.util.ArrayList<>();

  /**
  * Description: "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String effectiveDateTime;

  /**
  * Description: "Extensions for effectiveDateTime"
  */
  private transient Element _effectiveDateTime;

  /**
  * Description: "A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate."
  */
  private Period effectivePeriod;

  /**
  * Description: "The individual who was responsible for giving the medication to the patient."
  */
  private java.util.List<MedicationAdministrationPerformer> performer = new java.util.ArrayList<>();

  /**
  * Description: "Set this to true if the record is saying that the medication was NOT administered."
  */
  private Boolean notGiven;

  /**
  * Description: "Extensions for notGiven"
  */
  private transient Element _notGiven;

  /**
  * Description: "A code indicating why the administration was not performed."
  */
  private java.util.List<CodeableConcept> reasonNotGiven = new java.util.ArrayList<>();

  /**
  * Description: "A code indicating why the medication was given."
  */
  private java.util.List<CodeableConcept> reasonCode = new java.util.ArrayList<>();

  /**
  * Description: "Condition or observation that supports why the medication was administered."
  */
  private java.util.List<Reference> reasonReference = new java.util.ArrayList<>();

  /**
  * Description: "The original request, instruction or authority to perform the administration."
  */
  private Reference prescription;

  /**
  * Description: "The device used in administering the medication to the patient.  For example, a particular infusion pump."
  */
  private java.util.List<Reference> device = new java.util.ArrayList<>();

  /**
  * Description: "Extra information about the medication administration that is not conveyed by the other attributes."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Describes the medication dosage information details e.g. dose, rate, site, route, etc."
  */
  private MedicationAdministrationDosage dosage;

  /**
  * Description: "A summary of the events of interest that have occurred, such as when the administration was verified."
  */
  private java.util.List<Reference> eventHistory = new java.util.ArrayList<>();

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

  public MedicationAdministration() {
  }

  public MedicationAdministration(MedicationAdministrationModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.definition = Reference.fromArray(o.getDefinition());

      this.partOf = Reference.fromArray(o.getPartOf());

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.category = CodeableConcept.fromJson(o.getCategory());
      this.medicationCodeableConcept = CodeableConcept.fromJson(o.getMedicationCodeableConcept());
      if (null != o.getMedicationReference()) {
        this.medicationReference = new Reference(o.getMedicationReference());
        this.medicationReference.setId(this.getId());
      }

      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      this.supportingInformation = Reference.fromArray(o.getSupportingInformation());

      if (null != o.getEffectiveDateTime()) {
        this.effectiveDateTime = new String(o.getEffectiveDateTime());
      }

      this.effectivePeriod = Period.fromJson(o.getEffectivePeriod());
      this.performer = MedicationAdministrationPerformer.fromArray(o.getPerformer());

      if (null != o.getNotGiven()) {
        this.notGiven = new Boolean(o.getNotGiven());
      }

      this.reasonNotGiven = CodeableConcept.fromArray(o.getReasonNotGiven());
      this.reasonCode = CodeableConcept.fromArray(o.getReasonCode());
      this.reasonReference = Reference.fromArray(o.getReasonReference());

      if (null != o.getPrescription()) {
        this.prescription = new Reference(o.getPrescription());
        this.prescription.setId(this.getId());
      }

      this.device = Reference.fromArray(o.getDevice());

      this.note = Annotation.fromArray(o.getNote());
      if (null != o.getDosage()) {
        this.dosage = new MedicationAdministrationDosage(o.getDosage());
        this.dosage.setId(this.getId());
      }

      this.eventHistory = Reference.fromArray(o.getEventHistory());

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
  public void setDefinition( java.util.List<Reference> value) {
    this.definition = value;
  }
  public java.util.List<Reference> getDefinition() {
    return this.definition;
  }
  public void setPartOf( java.util.List<Reference> value) {
    this.partOf = value;
  }
  public java.util.List<Reference> getPartOf() {
    return this.partOf;
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
  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setMedicationCodeableConcept( CodeableConcept value) {
    this.medicationCodeableConcept = value;
  }
  public CodeableConcept getMedicationCodeableConcept() {
    return this.medicationCodeableConcept;
  }
  public void setMedicationReference( Reference value) {
    this.medicationReference = value;
  }
  public Reference getMedicationReference() {
    return this.medicationReference;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setSupportingInformation( java.util.List<Reference> value) {
    this.supportingInformation = value;
  }
  public java.util.List<Reference> getSupportingInformation() {
    return this.supportingInformation;
  }
  public void setEffectiveDateTime( String value) {
    this.effectiveDateTime = value;
  }
  public String getEffectiveDateTime() {
    return this.effectiveDateTime;
  }
  public void set_effectiveDateTime( Element value) {
    this._effectiveDateTime = value;
  }
  public Element get_effectiveDateTime() {
    return this._effectiveDateTime;
  }
  public void setEffectivePeriod( Period value) {
    this.effectivePeriod = value;
  }
  public Period getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setPerformer( java.util.List<MedicationAdministrationPerformer> value) {
    this.performer = value;
  }
  public java.util.List<MedicationAdministrationPerformer> getPerformer() {
    return this.performer;
  }
  public void setNotGiven( Boolean value) {
    this.notGiven = value;
  }
  public Boolean getNotGiven() {
    return this.notGiven;
  }
  public void set_notGiven( Element value) {
    this._notGiven = value;
  }
  public Element get_notGiven() {
    return this._notGiven;
  }
  public void setReasonNotGiven( java.util.List<CodeableConcept> value) {
    this.reasonNotGiven = value;
  }
  public java.util.List<CodeableConcept> getReasonNotGiven() {
    return this.reasonNotGiven;
  }
  public void setReasonCode( java.util.List<CodeableConcept> value) {
    this.reasonCode = value;
  }
  public java.util.List<CodeableConcept> getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonReference( java.util.List<Reference> value) {
    this.reasonReference = value;
  }
  public java.util.List<Reference> getReasonReference() {
    return this.reasonReference;
  }
  public void setPrescription( Reference value) {
    this.prescription = value;
  }
  public Reference getPrescription() {
    return this.prescription;
  }
  public void setDevice( java.util.List<Reference> value) {
    this.device = value;
  }
  public java.util.List<Reference> getDevice() {
    return this.device;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setDosage( MedicationAdministrationDosage value) {
    this.dosage = value;
  }
  public MedicationAdministrationDosage getDosage() {
    return this.dosage;
  }
  public void setEventHistory( java.util.List<Reference> value) {
    this.eventHistory = value;
  }
  public java.util.List<Reference> getEventHistory() {
    return this.eventHistory;
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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("partOf" + "[" + String.valueOf(this.partOf) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("medicationCodeableConcept" + "[" + String.valueOf(this.medicationCodeableConcept) + "]\n"); 
     builder.append("medicationReference" + "[" + String.valueOf(this.medicationReference) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("supportingInformation" + "[" + String.valueOf(this.supportingInformation) + "]\n"); 
     builder.append("effectiveDateTime" + "[" + String.valueOf(this.effectiveDateTime) + "]\n"); 
     builder.append("_effectiveDateTime" + "[" + String.valueOf(this._effectiveDateTime) + "]\n"); 
     builder.append("effectivePeriod" + "[" + String.valueOf(this.effectivePeriod) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("notGiven" + "[" + String.valueOf(this.notGiven) + "]\n"); 
     builder.append("_notGiven" + "[" + String.valueOf(this._notGiven) + "]\n"); 
     builder.append("reasonNotGiven" + "[" + String.valueOf(this.reasonNotGiven) + "]\n"); 
     builder.append("reasonCode" + "[" + String.valueOf(this.reasonCode) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("prescription" + "[" + String.valueOf(this.prescription) + "]\n"); 
     builder.append("device" + "[" + String.valueOf(this.device) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("dosage" + "[" + String.valueOf(this.dosage) + "]\n"); 
     builder.append("eventHistory" + "[" + String.valueOf(this.eventHistory) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	MedicationAdministration,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "MedicationAdministration" : { return MedicationAdministration.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	inprogress,
  	onhold,
  	completed,
  	enteredinerror,
  	stopped,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "inprogress" : { return inprogress.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<MedicationAdministration> fromArray(java.util.List<MedicationAdministrationModel> list) {
    return (java.util.List<MedicationAdministration>)list.stream()
      .map(model -> new MedicationAdministration(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MedicationAdministrationModel> toModelArray(java.util.List<MedicationAdministration> list) {
    return (java.util.List<MedicationAdministrationModel>)list.stream()
      .map(model -> new MedicationAdministrationModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MedicationAdministration fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MedicationAdministration.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MedicationAdministration o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MedicationAdministration> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}