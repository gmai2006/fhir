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
import org.fhir.entity.ActivityDefinitionModel;
import com.google.gson.GsonBuilder;

/**
* "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context."
*/
public class ActivityDefinition  {
  /**
  * Description: "This is a ActivityDefinition resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this activity definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this activity definition is (or will be) published. The URL SHOULD include the major version of the activity definition. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The identifier that is used to identify this version of the activity definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the activity definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active assets."
  */
  private String version;

  /**
  * Description: "Extensions for version"
  */
  private transient Element _version;

  /**
  * Description: "A natural language name identifying the activity definition. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "A short, descriptive, user-friendly title for the activity definition."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

  /**
  * Description: "The status of this activity definition. Enables tracking the life-cycle of the content."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A boolean value to indicate that this activity definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  private Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  private transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the activity definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the activity definition changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the activity definition."
  */
  private String publisher;

  /**
  * Description: "Extensions for publisher"
  */
  private transient Element _publisher;

  /**
  * Description: "A free text natural language description of the activity definition from a consumer's perspective."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Explaination of why this activity definition is needed and why it has been designed as it has."
  */
  private String purpose;

  /**
  * Description: "Extensions for purpose"
  */
  private transient Element _purpose;

  /**
  * Description: "A detailed description of how the asset is used from a clinical perspective."
  */
  private String usage;

  /**
  * Description: "Extensions for usage"
  */
  private transient Element _usage;

  /**
  * Description: "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String approvalDate;

  /**
  * Description: "Extensions for approvalDate"
  */
  private transient Element _approvalDate;

  /**
  * Description: "The date on which the resource content was last reviewed. Review happens periodically after approval, but doesn't change the original approval date."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String lastReviewDate;

  /**
  * Description: "Extensions for lastReviewDate"
  */
  private transient Element _lastReviewDate;

  /**
  * Description: "The period during which the activity definition content was or is planned to be in active use."
  */
  private Period effectivePeriod;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate activity definition instances."
  */
  private java.util.List<UsageContext> useContext = new java.util.ArrayList<>();

  /**
  * Description: "A legal or geographic region in which the activity definition is intended to be used."
  */
  private java.util.List<CodeableConcept> jurisdiction = new java.util.ArrayList<>();

  /**
  * Description: "Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching."
  */
  private java.util.List<CodeableConcept> topic = new java.util.ArrayList<>();

  /**
  * Description: "A contributor to the content of the asset, including authors, editors, reviewers, and endorsers."
  */
  private java.util.List<Contributor> contributor = new java.util.ArrayList<>();

  /**
  * Description: "Contact details to assist a user in finding and communicating with the publisher."
  */
  private java.util.List<ContactDetail> contact = new java.util.ArrayList<>();

  /**
  * Description: "A copyright statement relating to the activity definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the activity definition."
  */
  private String copyright;

  /**
  * Description: "Extensions for copyright"
  */
  private transient Element _copyright;

  /**
  * Description: "Related artifacts such as additional documentation, justification, or bibliographic references."
  */
  private java.util.List<RelatedArtifact> relatedArtifact = new java.util.ArrayList<>();

  /**
  * Description: "A reference to a Library resource containing any formal logic used by the asset."
  */
  private java.util.List<Reference> library = new java.util.ArrayList<>();

  /**
  * Description: "A description of the kind of resource the activity definition is representing. For example, a MedicationRequest, a ProcedureRequest, or a CommunicationRequest. Typically, but not always, this is a Request resource."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String kind;

  /**
  * Description: "Extensions for kind"
  */
  private transient Element _kind;

  /**
  * Description: "Detailed description of the type of activity; e.g. What lab test, what procedure, what kind of encounter."
  */
  private CodeableConcept code;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  */
  private Timing timingTiming;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String timingDateTime;

  /**
  * Description: "Extensions for timingDateTime"
  */
  private transient Element _timingDateTime;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  */
  private Period timingPeriod;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  */
  private Range timingRange;

  /**
  * Description: "Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc."
  */
  private Reference location;

  /**
  * Description: "Indicates who should participate in performing the action described."
  */
  private java.util.List<ActivityDefinitionParticipant> participant = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the food, drug or other product being consumed or supplied in the activity."
  */
  private Reference productReference;

  /**
  * Description: "Identifies the food, drug or other product being consumed or supplied in the activity."
  */
  private CodeableConcept productCodeableConcept;

  /**
  * Description: "Identifies the quantity expected to be consumed at once (per dose, per meal, etc.)."
  */
  private Quantity quantity;

  /**
  * Description: "Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources."
  */
  private java.util.List<Dosage> dosage = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites)."
  */
  private java.util.List<CodeableConcept> bodySite = new java.util.ArrayList<>();

  /**
  * Description: "A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input."
  */
  private Reference transform;

  /**
  * Description: "Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the intent resource that would contain the result."
  */
  private java.util.List<ActivityDefinitionDynamicValue> dynamicValue = new java.util.ArrayList<>();

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

  public ActivityDefinition() {
  }

  public ActivityDefinition(ActivityDefinitionModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      if (null != o.getUrl()) {
        this.url = new String(o.getUrl());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getVersion()) {
        this.version = new String(o.getVersion());
      }

      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getTitle()) {
        this.title = new String(o.getTitle());
      }

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getExperimental()) {
        this.experimental = new Boolean(o.getExperimental());
      }

      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      if (null != o.getPublisher()) {
        this.publisher = new String(o.getPublisher());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getPurpose()) {
        this.purpose = new String(o.getPurpose());
      }

      if (null != o.getUsage()) {
        this.usage = new String(o.getUsage());
      }

      if (null != o.getApprovalDate()) {
        this.approvalDate = new String(o.getApprovalDate());
      }

      if (null != o.getLastReviewDate()) {
        this.lastReviewDate = new String(o.getLastReviewDate());
      }

      this.effectivePeriod = Period.fromJson(o.getEffectivePeriod());
      this.useContext = UsageContext.fromArray(o.getUseContext());

      this.jurisdiction = CodeableConcept.fromArray(o.getJurisdiction());
      this.topic = CodeableConcept.fromArray(o.getTopic());
      this.contributor = Contributor.fromArray(o.getContributor());

      this.contact = ContactDetail.fromArray(o.getContact());

      if (null != o.getCopyright()) {
        this.copyright = new String(o.getCopyright());
      }

      this.relatedArtifact = RelatedArtifact.fromArray(o.getRelatedArtifact());

      this.library = Reference.fromArray(o.getLibrary());

      if (null != o.getKind()) {
        this.kind = new String(o.getKind());
      }

      this.code = CodeableConcept.fromJson(o.getCode());
      this.timingTiming = Timing.fromJson(o.getTimingTiming());
      if (null != o.getTimingDateTime()) {
        this.timingDateTime = new String(o.getTimingDateTime());
      }

      this.timingPeriod = Period.fromJson(o.getTimingPeriod());
      this.timingRange = Range.fromJson(o.getTimingRange());
      if (null != o.getLocation()) {
        this.location = new Reference(o.getLocation());
        this.location.setId(this.getId());
      }

      this.participant = ActivityDefinitionParticipant.fromArray(o.getParticipant());

      if (null != o.getProductReference()) {
        this.productReference = new Reference(o.getProductReference());
        this.productReference.setId(this.getId());
      }

      this.productCodeableConcept = CodeableConcept.fromJson(o.getProductCodeableConcept());
      this.quantity = Quantity.fromJson(o.getQuantity());
      this.dosage = Dosage.fromArray(o.getDosage());

      this.bodySite = CodeableConcept.fromArray(o.getBodySite());
      if (null != o.getTransform()) {
        this.transform = new Reference(o.getTransform());
        this.transform.setId(this.getId());
      }

      this.dynamicValue = ActivityDefinitionDynamicValue.fromArray(o.getDynamicValue());

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
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void set_url( Element value) {
    this._url = value;
  }
  public Element get_url() {
    return this._url;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void set_version( Element value) {
    this._version = value;
  }
  public Element get_version() {
    return this._version;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
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
  public void setExperimental( Boolean value) {
    this.experimental = value;
  }
  public Boolean getExperimental() {
    return this.experimental;
  }
  public void set_experimental( Element value) {
    this._experimental = value;
  }
  public Element get_experimental() {
    return this._experimental;
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
  public void setPublisher( String value) {
    this.publisher = value;
  }
  public String getPublisher() {
    return this.publisher;
  }
  public void set_publisher( Element value) {
    this._publisher = value;
  }
  public Element get_publisher() {
    return this._publisher;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setPurpose( String value) {
    this.purpose = value;
  }
  public String getPurpose() {
    return this.purpose;
  }
  public void set_purpose( Element value) {
    this._purpose = value;
  }
  public Element get_purpose() {
    return this._purpose;
  }
  public void setUsage( String value) {
    this.usage = value;
  }
  public String getUsage() {
    return this.usage;
  }
  public void set_usage( Element value) {
    this._usage = value;
  }
  public Element get_usage() {
    return this._usage;
  }
  public void setApprovalDate( String value) {
    this.approvalDate = value;
  }
  public String getApprovalDate() {
    return this.approvalDate;
  }
  public void set_approvalDate( Element value) {
    this._approvalDate = value;
  }
  public Element get_approvalDate() {
    return this._approvalDate;
  }
  public void setLastReviewDate( String value) {
    this.lastReviewDate = value;
  }
  public String getLastReviewDate() {
    return this.lastReviewDate;
  }
  public void set_lastReviewDate( Element value) {
    this._lastReviewDate = value;
  }
  public Element get_lastReviewDate() {
    return this._lastReviewDate;
  }
  public void setEffectivePeriod( Period value) {
    this.effectivePeriod = value;
  }
  public Period getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setUseContext( java.util.List<UsageContext> value) {
    this.useContext = value;
  }
  public java.util.List<UsageContext> getUseContext() {
    return this.useContext;
  }
  public void setJurisdiction( java.util.List<CodeableConcept> value) {
    this.jurisdiction = value;
  }
  public java.util.List<CodeableConcept> getJurisdiction() {
    return this.jurisdiction;
  }
  public void setTopic( java.util.List<CodeableConcept> value) {
    this.topic = value;
  }
  public java.util.List<CodeableConcept> getTopic() {
    return this.topic;
  }
  public void setContributor( java.util.List<Contributor> value) {
    this.contributor = value;
  }
  public java.util.List<Contributor> getContributor() {
    return this.contributor;
  }
  public void setContact( java.util.List<ContactDetail> value) {
    this.contact = value;
  }
  public java.util.List<ContactDetail> getContact() {
    return this.contact;
  }
  public void setCopyright( String value) {
    this.copyright = value;
  }
  public String getCopyright() {
    return this.copyright;
  }
  public void set_copyright( Element value) {
    this._copyright = value;
  }
  public Element get_copyright() {
    return this._copyright;
  }
  public void setRelatedArtifact( java.util.List<RelatedArtifact> value) {
    this.relatedArtifact = value;
  }
  public java.util.List<RelatedArtifact> getRelatedArtifact() {
    return this.relatedArtifact;
  }
  public void setLibrary( java.util.List<Reference> value) {
    this.library = value;
  }
  public java.util.List<Reference> getLibrary() {
    return this.library;
  }
  public void setKind( String value) {
    this.kind = value;
  }
  public String getKind() {
    return this.kind;
  }
  public void set_kind( Element value) {
    this._kind = value;
  }
  public Element get_kind() {
    return this._kind;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setTimingTiming( Timing value) {
    this.timingTiming = value;
  }
  public Timing getTimingTiming() {
    return this.timingTiming;
  }
  public void setTimingDateTime( String value) {
    this.timingDateTime = value;
  }
  public String getTimingDateTime() {
    return this.timingDateTime;
  }
  public void set_timingDateTime( Element value) {
    this._timingDateTime = value;
  }
  public Element get_timingDateTime() {
    return this._timingDateTime;
  }
  public void setTimingPeriod( Period value) {
    this.timingPeriod = value;
  }
  public Period getTimingPeriod() {
    return this.timingPeriod;
  }
  public void setTimingRange( Range value) {
    this.timingRange = value;
  }
  public Range getTimingRange() {
    return this.timingRange;
  }
  public void setLocation( Reference value) {
    this.location = value;
  }
  public Reference getLocation() {
    return this.location;
  }
  public void setParticipant( java.util.List<ActivityDefinitionParticipant> value) {
    this.participant = value;
  }
  public java.util.List<ActivityDefinitionParticipant> getParticipant() {
    return this.participant;
  }
  public void setProductReference( Reference value) {
    this.productReference = value;
  }
  public Reference getProductReference() {
    return this.productReference;
  }
  public void setProductCodeableConcept( CodeableConcept value) {
    this.productCodeableConcept = value;
  }
  public CodeableConcept getProductCodeableConcept() {
    return this.productCodeableConcept;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setDosage( java.util.List<Dosage> value) {
    this.dosage = value;
  }
  public java.util.List<Dosage> getDosage() {
    return this.dosage;
  }
  public void setBodySite( java.util.List<CodeableConcept> value) {
    this.bodySite = value;
  }
  public java.util.List<CodeableConcept> getBodySite() {
    return this.bodySite;
  }
  public void setTransform( Reference value) {
    this.transform = value;
  }
  public Reference getTransform() {
    return this.transform;
  }
  public void setDynamicValue( java.util.List<ActivityDefinitionDynamicValue> value) {
    this.dynamicValue = value;
  }
  public java.util.List<ActivityDefinitionDynamicValue> getDynamicValue() {
    return this.dynamicValue;
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
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("_url" + "[" + String.valueOf(this._url) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("version" + "[" + String.valueOf(this.version) + "]\n"); 
     builder.append("_version" + "[" + String.valueOf(this._version) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("_title" + "[" + String.valueOf(this._title) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("experimental" + "[" + String.valueOf(this.experimental) + "]\n"); 
     builder.append("_experimental" + "[" + String.valueOf(this._experimental) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("publisher" + "[" + String.valueOf(this.publisher) + "]\n"); 
     builder.append("_publisher" + "[" + String.valueOf(this._publisher) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("purpose" + "[" + String.valueOf(this.purpose) + "]\n"); 
     builder.append("_purpose" + "[" + String.valueOf(this._purpose) + "]\n"); 
     builder.append("usage" + "[" + String.valueOf(this.usage) + "]\n"); 
     builder.append("_usage" + "[" + String.valueOf(this._usage) + "]\n"); 
     builder.append("approvalDate" + "[" + String.valueOf(this.approvalDate) + "]\n"); 
     builder.append("_approvalDate" + "[" + String.valueOf(this._approvalDate) + "]\n"); 
     builder.append("lastReviewDate" + "[" + String.valueOf(this.lastReviewDate) + "]\n"); 
     builder.append("_lastReviewDate" + "[" + String.valueOf(this._lastReviewDate) + "]\n"); 
     builder.append("effectivePeriod" + "[" + String.valueOf(this.effectivePeriod) + "]\n"); 
     builder.append("useContext" + "[" + String.valueOf(this.useContext) + "]\n"); 
     builder.append("jurisdiction" + "[" + String.valueOf(this.jurisdiction) + "]\n"); 
     builder.append("topic" + "[" + String.valueOf(this.topic) + "]\n"); 
     builder.append("contributor" + "[" + String.valueOf(this.contributor) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("copyright" + "[" + String.valueOf(this.copyright) + "]\n"); 
     builder.append("_copyright" + "[" + String.valueOf(this._copyright) + "]\n"); 
     builder.append("relatedArtifact" + "[" + String.valueOf(this.relatedArtifact) + "]\n"); 
     builder.append("library" + "[" + String.valueOf(this.library) + "]\n"); 
     builder.append("kind" + "[" + String.valueOf(this.kind) + "]\n"); 
     builder.append("_kind" + "[" + String.valueOf(this._kind) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("timingTiming" + "[" + String.valueOf(this.timingTiming) + "]\n"); 
     builder.append("timingDateTime" + "[" + String.valueOf(this.timingDateTime) + "]\n"); 
     builder.append("_timingDateTime" + "[" + String.valueOf(this._timingDateTime) + "]\n"); 
     builder.append("timingPeriod" + "[" + String.valueOf(this.timingPeriod) + "]\n"); 
     builder.append("timingRange" + "[" + String.valueOf(this.timingRange) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("participant" + "[" + String.valueOf(this.participant) + "]\n"); 
     builder.append("productReference" + "[" + String.valueOf(this.productReference) + "]\n"); 
     builder.append("productCodeableConcept" + "[" + String.valueOf(this.productCodeableConcept) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("dosage" + "[" + String.valueOf(this.dosage) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("transform" + "[" + String.valueOf(this.transform) + "]\n"); 
     builder.append("dynamicValue" + "[" + String.valueOf(this.dynamicValue) + "]\n"); 
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
  	ActivityDefinition,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ActivityDefinition" : { return ActivityDefinition.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	draft,
  	active,
  	retired,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "draft" : { return draft.toString(); }
  			case "active" : { return active.toString(); }
  			case "retired" : { return retired.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ActivityDefinition> fromArray(java.util.List<ActivityDefinitionModel> list) {
    return (java.util.List<ActivityDefinition>)list.stream()
      .map(model -> new ActivityDefinition(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ActivityDefinitionModel> toModelArray(java.util.List<ActivityDefinition> list) {
    return (java.util.List<ActivityDefinitionModel>)list.stream()
      .map(model -> new ActivityDefinitionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ActivityDefinition fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ActivityDefinition.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ActivityDefinition o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ActivityDefinition> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}