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
* "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context."
*/
@Entity
@Table(name="activitydefinition")
public class ActivityDefinitionModel  implements Serializable {
	private static final long serialVersionUID = 151910893768923558L;
  /**
  * Description: "This is a ActivityDefinition resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this activity definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this activity definition is (or will be) published. The URL SHOULD include the major version of the activity definition. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The identifier that is used to identify this version of the activity definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the activity definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active assets."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "A natural language name identifying the activity definition. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "A short, descriptive, user-friendly title for the activity definition."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "The status of this activity definition. Enables tracking the life-cycle of the content."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A boolean value to indicate that this activity definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  @javax.persistence.Basic
  @Column(name="\"experimental\"")
  private Boolean experimental;

  /**
  * Description: "The date  (and optionally time) when the activity definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the activity definition changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "The name of the individual or organization that published the activity definition."
  */
  @javax.persistence.Basic
  @Column(name="\"publisher\"")
  private String publisher;

  /**
  * Description: "A free text natural language description of the activity definition from a consumer's perspective."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Explaination of why this activity definition is needed and why it has been designed as it has."
  */
  @javax.persistence.Basic
  @Column(name="\"purpose\"")
  private String purpose;

  /**
  * Description: "A detailed description of how the asset is used from a clinical perspective."
  */
  @javax.persistence.Basic
  @Column(name="\"usage\"")
  private String usage;

  /**
  * Description: "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"approvalDate\"")
  private String approvalDate;

  /**
  * Description: "The date on which the resource content was last reviewed. Review happens periodically after approval, but doesn't change the original approval date."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"lastReviewDate\"")
  private String lastReviewDate;

  /**
  * Description: "The period during which the activity definition content was or is planned to be in active use."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"effectivePeriod\"", length = 16777215)
  private String effectivePeriod;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate activity definition instances."
  */
  @javax.persistence.Basic
  @Column(name="\"usecontext_id\"")
  private String usecontext_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="usecontext_id", insertable=false, updatable=false)
  private java.util.List<UsageContextModel> useContext;

  /**
  * Description: "A legal or geographic region in which the activity definition is intended to be used."
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction_id\"")
  private String jurisdiction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="jurisdiction_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> jurisdiction;

  /**
  * Description: "Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching."
  */
  @javax.persistence.Basic
  @Column(name="\"topic_id\"")
  private String topic_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="topic_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> topic;

  /**
  * Description: "A contributor to the content of the asset, including authors, editors, reviewers, and endorsers."
  */
  @javax.persistence.Basic
  @Column(name="\"contributor_id\"")
  private String contributor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="contributor_id", insertable=false, updatable=false)
  private java.util.List<ContributorModel> contributor;

  /**
  * Description: "Contact details to assist a user in finding and communicating with the publisher."
  */
  @javax.persistence.Basic
  @Column(name="\"contact_id\"")
  private String contact_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="contact_id", insertable=false, updatable=false)
  private java.util.List<ContactDetailModel> contact;

  /**
  * Description: "A copyright statement relating to the activity definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the activity definition."
  */
  @javax.persistence.Basic
  @Column(name="\"copyright\"")
  private String copyright;

  /**
  * Description: "Related artifacts such as additional documentation, justification, or bibliographic references."
  */
  @javax.persistence.Basic
  @Column(name="\"relatedartifact_id\"")
  private String relatedartifact_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="relatedartifact_id", insertable=false, updatable=false)
  private java.util.List<RelatedArtifactModel> relatedArtifact;

  /**
  * Description: "A reference to a Library resource containing any formal logic used by the asset."
  */
  @javax.persistence.Basic
  @Column(name="\"library_id\"")
  private String library_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="library_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> library;

  /**
  * Description: "A description of the kind of resource the activity definition is representing. For example, a MedicationRequest, a ProcedureRequest, or a CommunicationRequest. Typically, but not always, this is a Request resource."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"kind\"")
  private String kind;

  /**
  * Description: "Detailed description of the type of activity; e.g. What lab test, what procedure, what kind of encounter."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingTiming\"", length = 16777215)
  private String timingTiming;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"timingDateTime\"")
  private String timingDateTime;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingPeriod\"", length = 16777215)
  private String timingPeriod;

  /**
  * Description: "The period, timing or frequency upon which the described activity is to occur."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingRange\"", length = 16777215)
  private String timingRange;

  /**
  * Description: "Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="location_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> location;

  /**
  * Description: "Indicates who should participate in performing the action described."
  */
  @javax.persistence.Basic
  @Column(name="\"participant_id\"")
  private String participant_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="participant_id", insertable=false, updatable=false)
  private java.util.List<ActivityDefinitionParticipantModel> participant;

  /**
  * Description: "Identifies the food, drug or other product being consumed or supplied in the activity."
  */
  @javax.persistence.Basic
  @Column(name="\"productreference_id\"")
  private String productreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="productreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> productReference;

  /**
  * Description: "Identifies the food, drug or other product being consumed or supplied in the activity."
  */
  @javax.persistence.Basic
  @Column(name="\"productcodeableconcept_id\"")
  private String productcodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="productcodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> productCodeableConcept;

  /**
  * Description: "Identifies the quantity expected to be consumed at once (per dose, per meal, etc.)."
  */
  @javax.persistence.Basic
  @Column(name="\"quantity_id\"")
  private String quantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="quantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> quantity;

  /**
  * Description: "Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources."
  */
  @javax.persistence.Basic
  @Column(name="\"dosage_id\"")
  private String dosage_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dosage_id", insertable=false, updatable=false)
  private java.util.List<DosageModel> dosage;

  /**
  * Description: "Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites)."
  */
  @javax.persistence.Basic
  @Column(name="\"bodysite_id\"")
  private String bodysite_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="bodysite_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> bodySite;

  /**
  * Description: "A reference to a StructureMap resource that defines a transform that can be executed to produce the intent resource using the ActivityDefinition instance as the input."
  */
  @javax.persistence.Basic
  @Column(name="\"transform_id\"")
  private String transform_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="transform_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> transform;

  /**
  * Description: "Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the intent resource that would contain the result."
  */
  @javax.persistence.Basic
  @Column(name="\"dynamicvalue_id\"")
  private String dynamicvalue_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="dynamicvalue_id", insertable=false, updatable=false)
  private java.util.List<ActivityDefinitionDynamicValueModel> dynamicValue;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public ActivityDefinitionModel() {
  }

  public ActivityDefinitionModel(ActivityDefinition o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.url = o.getUrl();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.version = o.getVersion();
    this.name = o.getName();
    this.title = o.getTitle();
    this.status = o.getStatus();
    this.experimental = o.getExperimental();
    this.date = o.getDate();
    this.publisher = o.getPublisher();
    this.description = o.getDescription();
    this.purpose = o.getPurpose();
    this.usage = o.getUsage();
    this.approvalDate = o.getApprovalDate();
    this.lastReviewDate = o.getLastReviewDate();
    if (null != o.getEffectivePeriod()) {
    	this.effectivePeriod = JsonUtils.toJson(o.getEffectivePeriod());
    }
    if (null != o.getUseContext() && !o.getUseContext().isEmpty()) {
    	this.usecontext_id = "usecontext" + this.id;
    	this.useContext = UsageContextHelper.toModelFromArray(o.getUseContext(), this.usecontext_id);
    }
    if (null != o.getJurisdiction() && !o.getJurisdiction().isEmpty()) {
    	this.jurisdiction_id = "jurisdiction" + this.id;
    	this.jurisdiction = CodeableConceptHelper.toModelFromArray(o.getJurisdiction(), this.jurisdiction_id);
    }
    if (null != o.getTopic() && !o.getTopic().isEmpty()) {
    	this.topic_id = "topic" + this.id;
    	this.topic = CodeableConceptHelper.toModelFromArray(o.getTopic(), this.topic_id);
    }
    if (null != o.getContributor() && !o.getContributor().isEmpty()) {
    	this.contributor_id = "contributor" + this.id;
    	this.contributor = ContributorHelper.toModelFromArray(o.getContributor(), this.contributor_id);
    }
    if (null != o.getContact() && !o.getContact().isEmpty()) {
    	this.contact_id = "contact" + this.id;
    	this.contact = ContactDetailHelper.toModelFromArray(o.getContact(), this.contact_id);
    }
    this.copyright = o.getCopyright();
    if (null != o.getRelatedArtifact() && !o.getRelatedArtifact().isEmpty()) {
    	this.relatedartifact_id = "relatedartifact" + this.id;
    	this.relatedArtifact = RelatedArtifactHelper.toModelFromArray(o.getRelatedArtifact(), this.relatedartifact_id);
    }
    if (null != o.getLibrary() && !o.getLibrary().isEmpty()) {
    	this.library_id = "library" + this.id;
    	this.library = ReferenceHelper.toModelFromArray(o.getLibrary(), this.library_id);
    }
    this.kind = o.getKind();
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    if (null != o.getTimingTiming()) {
    	this.timingTiming = JsonUtils.toJson(o.getTimingTiming());
    }
    this.timingDateTime = o.getTimingDateTime();
    if (null != o.getTimingPeriod()) {
    	this.timingPeriod = JsonUtils.toJson(o.getTimingPeriod());
    }
    if (null != o.getTimingRange()) {
    	this.timingRange = JsonUtils.toJson(o.getTimingRange());
    }
    if (null != o.getLocation() ) {
    	this.location_id = "location" + this.id;
    	this.location = ReferenceHelper.toModel(o.getLocation(), this.location_id);
    }
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant_id = "participant" + this.id;
    	this.participant = ActivityDefinitionParticipantHelper.toModelFromArray(o.getParticipant(), this.participant_id);
    }
    if (null != o.getProductReference() ) {
    	this.productreference_id = "productreference" + this.id;
    	this.productReference = ReferenceHelper.toModel(o.getProductReference(), this.productreference_id);
    }
    if (null != o.getProductCodeableConcept() ) {
    	this.productcodeableconcept_id = "productcodeableconcept" + this.id;
    	this.productCodeableConcept = CodeableConceptHelper.toModel(o.getProductCodeableConcept(), this.productcodeableconcept_id);
    }
    if (null != o.getQuantity() ) {
    	this.quantity_id = "quantity" + this.id;
    	this.quantity = QuantityHelper.toModel(o.getQuantity(), this.quantity_id);
    }
    if (null != o.getDosage() && !o.getDosage().isEmpty()) {
    	this.dosage_id = "dosage" + this.id;
    	this.dosage = DosageHelper.toModelFromArray(o.getDosage(), this.dosage_id);
    }
    if (null != o.getBodySite() && !o.getBodySite().isEmpty()) {
    	this.bodysite_id = "bodysite" + this.id;
    	this.bodySite = CodeableConceptHelper.toModelFromArray(o.getBodySite(), this.bodysite_id);
    }
    if (null != o.getTransform() ) {
    	this.transform_id = "transform" + this.id;
    	this.transform = ReferenceHelper.toModel(o.getTransform(), this.transform_id);
    }
    if (null != o.getDynamicValue() && !o.getDynamicValue().isEmpty()) {
    	this.dynamicvalue_id = "dynamicvalue" + this.id;
    	this.dynamicValue = ActivityDefinitionDynamicValueHelper.toModelFromArray(o.getDynamicValue(), this.dynamicvalue_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public Boolean getExperimental() {
    return this.experimental;
  }
  public void setExperimental( Boolean value) {
    this.experimental = value;
  }
  public String getDate() {
    return this.date;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getPublisher() {
    return this.publisher;
  }
  public void setPublisher( String value) {
    this.publisher = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getPurpose() {
    return this.purpose;
  }
  public void setPurpose( String value) {
    this.purpose = value;
  }
  public String getUsage() {
    return this.usage;
  }
  public void setUsage( String value) {
    this.usage = value;
  }
  public String getApprovalDate() {
    return this.approvalDate;
  }
  public void setApprovalDate( String value) {
    this.approvalDate = value;
  }
  public String getLastReviewDate() {
    return this.lastReviewDate;
  }
  public void setLastReviewDate( String value) {
    this.lastReviewDate = value;
  }
  public String getEffectivePeriod() {
    return this.effectivePeriod;
  }
  public void setEffectivePeriod( String value) {
    this.effectivePeriod = value;
  }
  public java.util.List<UsageContextModel> getUseContext() {
    return this.useContext;
  }
  public void setUseContext( java.util.List<UsageContextModel> value) {
    this.useContext = value;
  }
  public java.util.List<CodeableConceptModel> getJurisdiction() {
    return this.jurisdiction;
  }
  public void setJurisdiction( java.util.List<CodeableConceptModel> value) {
    this.jurisdiction = value;
  }
  public java.util.List<CodeableConceptModel> getTopic() {
    return this.topic;
  }
  public void setTopic( java.util.List<CodeableConceptModel> value) {
    this.topic = value;
  }
  public java.util.List<ContributorModel> getContributor() {
    return this.contributor;
  }
  public void setContributor( java.util.List<ContributorModel> value) {
    this.contributor = value;
  }
  public java.util.List<ContactDetailModel> getContact() {
    return this.contact;
  }
  public void setContact( java.util.List<ContactDetailModel> value) {
    this.contact = value;
  }
  public String getCopyright() {
    return this.copyright;
  }
  public void setCopyright( String value) {
    this.copyright = value;
  }
  public java.util.List<RelatedArtifactModel> getRelatedArtifact() {
    return this.relatedArtifact;
  }
  public void setRelatedArtifact( java.util.List<RelatedArtifactModel> value) {
    this.relatedArtifact = value;
  }
  public java.util.List<ReferenceModel> getLibrary() {
    return this.library;
  }
  public void setLibrary( java.util.List<ReferenceModel> value) {
    this.library = value;
  }
  public String getKind() {
    return this.kind;
  }
  public void setKind( String value) {
    this.kind = value;
  }
  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
  }
  public String getTimingTiming() {
    return this.timingTiming;
  }
  public void setTimingTiming( String value) {
    this.timingTiming = value;
  }
  public String getTimingDateTime() {
    return this.timingDateTime;
  }
  public void setTimingDateTime( String value) {
    this.timingDateTime = value;
  }
  public String getTimingPeriod() {
    return this.timingPeriod;
  }
  public void setTimingPeriod( String value) {
    this.timingPeriod = value;
  }
  public String getTimingRange() {
    return this.timingRange;
  }
  public void setTimingRange( String value) {
    this.timingRange = value;
  }
  public java.util.List<ReferenceModel> getLocation() {
    return this.location;
  }
  public void setLocation( java.util.List<ReferenceModel> value) {
    this.location = value;
  }
  public java.util.List<ActivityDefinitionParticipantModel> getParticipant() {
    return this.participant;
  }
  public void setParticipant( java.util.List<ActivityDefinitionParticipantModel> value) {
    this.participant = value;
  }
  public java.util.List<ReferenceModel> getProductReference() {
    return this.productReference;
  }
  public void setProductReference( java.util.List<ReferenceModel> value) {
    this.productReference = value;
  }
  public java.util.List<CodeableConceptModel> getProductCodeableConcept() {
    return this.productCodeableConcept;
  }
  public void setProductCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.productCodeableConcept = value;
  }
  public java.util.List<QuantityModel> getQuantity() {
    return this.quantity;
  }
  public void setQuantity( java.util.List<QuantityModel> value) {
    this.quantity = value;
  }
  public java.util.List<DosageModel> getDosage() {
    return this.dosage;
  }
  public void setDosage( java.util.List<DosageModel> value) {
    this.dosage = value;
  }
  public java.util.List<CodeableConceptModel> getBodySite() {
    return this.bodySite;
  }
  public void setBodySite( java.util.List<CodeableConceptModel> value) {
    this.bodySite = value;
  }
  public java.util.List<ReferenceModel> getTransform() {
    return this.transform;
  }
  public void setTransform( java.util.List<ReferenceModel> value) {
    this.transform = value;
  }
  public java.util.List<ActivityDefinitionDynamicValueModel> getDynamicValue() {
    return this.dynamicValue;
  }
  public void setDynamicValue( java.util.List<ActivityDefinitionDynamicValueModel> value) {
    this.dynamicValue = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ActivityDefinitionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("purpose" + "->" + this.purpose + "\n"); 
     builder.append("usage" + "->" + this.usage + "\n"); 
     builder.append("approvalDate" + "->" + this.approvalDate + "\n"); 
     builder.append("lastReviewDate" + "->" + this.lastReviewDate + "\n"); 
     builder.append("effectivePeriod" + "->" + this.effectivePeriod + "\n"); 
     builder.append("copyright" + "->" + this.copyright + "\n"); 
     builder.append("kind" + "->" + this.kind + "\n"); 
     builder.append("timingTiming" + "->" + this.timingTiming + "\n"); 
     builder.append("timingDateTime" + "->" + this.timingDateTime + "\n"); 
     builder.append("timingPeriod" + "->" + this.timingPeriod + "\n"); 
     builder.append("timingRange" + "->" + this.timingRange + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ActivityDefinitionModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("experimental" + "->" + this.experimental + "\n"); 
     builder.append("date" + "->" + this.date + "\n"); 
     builder.append("publisher" + "->" + this.publisher + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("purpose" + "->" + this.purpose + "\n"); 
     builder.append("usage" + "->" + this.usage + "\n"); 
     builder.append("approvalDate" + "->" + this.approvalDate + "\n"); 
     builder.append("lastReviewDate" + "->" + this.lastReviewDate + "\n"); 
     builder.append("effectivePeriod" + "->" + this.effectivePeriod + "\n"); 
     builder.append("useContext" + "->" + this.useContext + "\n"); 
     builder.append("jurisdiction" + "->" + this.jurisdiction + "\n"); 
     builder.append("topic" + "->" + this.topic + "\n"); 
     builder.append("contributor" + "->" + this.contributor + "\n"); 
     builder.append("contact" + "->" + this.contact + "\n"); 
     builder.append("copyright" + "->" + this.copyright + "\n"); 
     builder.append("relatedArtifact" + "->" + this.relatedArtifact + "\n"); 
     builder.append("library" + "->" + this.library + "\n"); 
     builder.append("kind" + "->" + this.kind + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("timingTiming" + "->" + this.timingTiming + "\n"); 
     builder.append("timingDateTime" + "->" + this.timingDateTime + "\n"); 
     builder.append("timingPeriod" + "->" + this.timingPeriod + "\n"); 
     builder.append("timingRange" + "->" + this.timingRange + "\n"); 
     builder.append("location" + "->" + this.location + "\n"); 
     builder.append("participant" + "->" + this.participant + "\n"); 
     builder.append("productReference" + "->" + this.productReference + "\n"); 
     builder.append("productCodeableConcept" + "->" + this.productCodeableConcept + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("dosage" + "->" + this.dosage + "\n"); 
     builder.append("bodySite" + "->" + this.bodySite + "\n"); 
     builder.append("transform" + "->" + this.transform + "\n"); 
     builder.append("dynamicValue" + "->" + this.dynamicValue + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}