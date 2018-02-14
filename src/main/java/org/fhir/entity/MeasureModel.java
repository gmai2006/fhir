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
/**
* "The Measure resource provides the definition of a quality measure."
*/
@Entity
@Table(name="measure")
public class MeasureModel  implements Serializable {
	private static final long serialVersionUID = 151857669649095587L;
  /**
  * Description: "This is a Measure resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this measure when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this measure is (or will be) published. The URL SHOULD include the major version of the measure. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "A formal identifier that is used to identify this measure when it is represented in other formats, or referenced in a specification, model, design or an instance."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The identifier that is used to identify this version of the measure when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the measure author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "A natural language name identifying the measure. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "A short, descriptive, user-friendly title for the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "The status of this measure. Enables tracking the life-cycle of the content."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A boolean value to indicate that this measure is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  @javax.persistence.Basic
  @Column(name="\"experimental\"")
  private Boolean experimental;

  /**
  * Description: "The date  (and optionally time) when the measure was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the measure changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"date\"")
  private String date;

  /**
  * Description: "The name of the individual or organization that published the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"publisher\"")
  private String publisher;

  /**
  * Description: "A free text natural language description of the measure from a consumer's perspective."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Explaination of why this measure is needed and why it has been designed as it has."
  */
  @javax.persistence.Basic
  @Column(name="\"purpose\"")
  private String purpose;

  /**
  * Description: "A detailed description of how the measure is used from a clinical perspective."
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
  * Description: "The period during which the measure content was or is planned to be in active use."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"effectivePeriod\"", length = 16777215)
  private String effectivePeriod;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate measure instances."
  */
  @javax.persistence.Basic
  @Column(name="\"usecontext_id\"")
  private String usecontext_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="usecontext_id", insertable=false, updatable=false)
  private java.util.List<UsageContextModel> useContext;

  /**
  * Description: "A legal or geographic region in which the measure is intended to be used."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction\"", length = 16777215)
  private String jurisdiction;

  /**
  * Description: "Descriptive topics related to the content of the measure. Topics provide a high-level categorization of the type of the measure that can be useful for filtering and searching."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"topic\"", length = 16777215)
  private String topic;

  /**
  * Description: "A contributor to the content of the measure, including authors, editors, reviewers, and endorsers."
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
  * Description: "A copyright statement relating to the measure and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the measure."
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
  * Description: "A reference to a Library resource containing the formal logic used by the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"library_id\"")
  private String library_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="library_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> library;

  /**
  * Description: "Notices and disclaimers regarding the use of the measure, or related to intellectual property (such as code systems) referenced by the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"disclaimer\"")
  private String disclaimer;

  /**
  * Description: "Indicates how the calculation is performed for the measure, including proportion, ratio, continuous variable, and cohort. The value set is extensible, allowing additional measure scoring types to be represented."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"scoring\"", length = 16777215)
  private String scoring;

  /**
  * Description: "If this is a composite measure, the scoring method used to combine the component measures to determine the composite score."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"compositeScoring\"", length = 16777215)
  private String compositeScoring;

  /**
  * Description: "Indicates whether the measure is used to examine a process, an outcome over time, a patient-reported outcome, or a structure measure such as utilization."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "A description of the risk adjustment factors that may impact the resulting score for the measure and how they may be accounted for when computing and reporting measure results."
  */
  @javax.persistence.Basic
  @Column(name="\"riskAdjustment\"")
  private String riskAdjustment;

  /**
  * Description: "Describes how to combine the information calculated, based on logic in each of several populations, into one summarized result."
  */
  @javax.persistence.Basic
  @Column(name="\"rateAggregation\"")
  private String rateAggregation;

  /**
  * Description: "Provides a succint statement of the need for the measure. Usually includes statements pertaining to importance criterion: impact, gap in care, and evidence."
  */
  @javax.persistence.Basic
  @Column(name="\"rationale\"")
  private String rationale;

  /**
  * Description: "Provides a summary of relevant clinical guidelines or other clinical recommendations supporting the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"clinicalRecommendationStatement\"")
  private String clinicalRecommendationStatement;

  /**
  * Description: "Information on whether an increase or decrease in score is the preferred result (e.g., a higher score indicates better quality OR a lower score indicates better quality OR quality is whthin a range)."
  */
  @javax.persistence.Basic
  @Column(name="\"improvementNotation\"")
  private String improvementNotation;

  /**
  * Description: "Provides a description of an individual term used within the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"definition\"")
  private String definition;

  /**
  * Description: "Additional guidance for the measure including how it can be used in a clinical context, and the intent of the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"guidance\"")
  private String guidance;

  /**
  * Description: "The measure set, e.g. Preventive Care and Screening."
  */
  @javax.persistence.Basic
  @Column(name="\"set\"")
  private String set;

  /**
  * Description: "A group of population criteria for the measure."
  */
  @javax.persistence.Basic
  @Column(name="\"group_id\"")
  private String group_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="group_id", insertable=false, updatable=false)
  private java.util.List<MeasureGroupModel> group;

  /**
  * Description: "The supplemental data criteria for the measure report, specified as either the name of a valid CQL expression within a referenced library, or a valid FHIR Resource Path."
  */
  @javax.persistence.Basic
  @Column(name="\"supplementaldata_id\"")
  private String supplementaldata_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="supplementaldata_id", insertable=false, updatable=false)
  private java.util.List<MeasureSupplementalDataModel> supplementalData;

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

  public MeasureModel() {
  }

  public MeasureModel(Measure o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.url = o.getUrl();
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
    this.effectivePeriod = PeriodHelper.toJson(o.getEffectivePeriod());
    if (null != o.getUseContext() && !o.getUseContext().isEmpty()) {
    	this.usecontext_id = "usecontext" + this.id;
    	this.useContext = UsageContextHelper.toModelFromArray(o.getUseContext(), this.usecontext_id);
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
    this.disclaimer = o.getDisclaimer();
    this.scoring = CodeableConceptHelper.toJson(o.getScoring());
    this.compositeScoring = CodeableConceptHelper.toJson(o.getCompositeScoring());
    this.riskAdjustment = o.getRiskAdjustment();
    this.rateAggregation = o.getRateAggregation();
    this.rationale = o.getRationale();
    this.clinicalRecommendationStatement = o.getClinicalRecommendationStatement();
    this.improvementNotation = o.getImprovementNotation();
    this.definition = org.fhir.utils.JsonUtils.write2String(o.getDefinition());
    this.guidance = o.getGuidance();
    this.set = o.getSet();
    if (null != o.getGroup() && !o.getGroup().isEmpty()) {
    	this.group_id = "group" + this.id;
    	this.group = MeasureGroupHelper.toModelFromArray(o.getGroup(), this.group_id);
    }
    if (null != o.getSupplementalData() && !o.getSupplementalData().isEmpty()) {
    	this.supplementaldata_id = "supplementaldata" + this.id;
    	this.supplementalData = MeasureSupplementalDataHelper.toModelFromArray(o.getSupplementalData(), this.supplementaldata_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
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
  public String getJurisdiction() {
    return this.jurisdiction;
  }
  public void setJurisdiction( String value) {
    this.jurisdiction = value;
  }
  public String getTopic() {
    return this.topic;
  }
  public void setTopic( String value) {
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
  public String getDisclaimer() {
    return this.disclaimer;
  }
  public void setDisclaimer( String value) {
    this.disclaimer = value;
  }
  public String getScoring() {
    return this.scoring;
  }
  public void setScoring( String value) {
    this.scoring = value;
  }
  public String getCompositeScoring() {
    return this.compositeScoring;
  }
  public void setCompositeScoring( String value) {
    this.compositeScoring = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getRiskAdjustment() {
    return this.riskAdjustment;
  }
  public void setRiskAdjustment( String value) {
    this.riskAdjustment = value;
  }
  public String getRateAggregation() {
    return this.rateAggregation;
  }
  public void setRateAggregation( String value) {
    this.rateAggregation = value;
  }
  public String getRationale() {
    return this.rationale;
  }
  public void setRationale( String value) {
    this.rationale = value;
  }
  public String getClinicalRecommendationStatement() {
    return this.clinicalRecommendationStatement;
  }
  public void setClinicalRecommendationStatement( String value) {
    this.clinicalRecommendationStatement = value;
  }
  public String getImprovementNotation() {
    return this.improvementNotation;
  }
  public void setImprovementNotation( String value) {
    this.improvementNotation = value;
  }
  public String getDefinition() {
    return this.definition;
  }
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getGuidance() {
    return this.guidance;
  }
  public void setGuidance( String value) {
    this.guidance = value;
  }
  public String getSet() {
    return this.set;
  }
  public void setSet( String value) {
    this.set = value;
  }
  public java.util.List<MeasureGroupModel> getGroup() {
    return this.group;
  }
  public void setGroup( java.util.List<MeasureGroupModel> value) {
    this.group = value;
  }
  public java.util.List<MeasureSupplementalDataModel> getSupplementalData() {
    return this.supplementalData;
  }
  public void setSupplementalData( java.util.List<MeasureSupplementalDataModel> value) {
    this.supplementalData = value;
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
    builder.append("[MeasureModel]:" + "\n");
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
     builder.append("jurisdiction" + "->" + this.jurisdiction + "\n"); 
     builder.append("topic" + "->" + this.topic + "\n"); 
     builder.append("copyright" + "->" + this.copyright + "\n"); 
     builder.append("disclaimer" + "->" + this.disclaimer + "\n"); 
     builder.append("scoring" + "->" + this.scoring + "\n"); 
     builder.append("compositeScoring" + "->" + this.compositeScoring + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("riskAdjustment" + "->" + this.riskAdjustment + "\n"); 
     builder.append("rateAggregation" + "->" + this.rateAggregation + "\n"); 
     builder.append("rationale" + "->" + this.rationale + "\n"); 
     builder.append("clinicalRecommendationStatement" + "->" + this.clinicalRecommendationStatement + "\n"); 
     builder.append("improvementNotation" + "->" + this.improvementNotation + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("guidance" + "->" + this.guidance + "\n"); 
     builder.append("set" + "->" + this.set + "\n"); 
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
    builder.append("[MeasureModel]:" + "\n");
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
     builder.append("disclaimer" + "->" + this.disclaimer + "\n"); 
     builder.append("scoring" + "->" + this.scoring + "\n"); 
     builder.append("compositeScoring" + "->" + this.compositeScoring + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("riskAdjustment" + "->" + this.riskAdjustment + "\n"); 
     builder.append("rateAggregation" + "->" + this.rateAggregation + "\n"); 
     builder.append("rationale" + "->" + this.rationale + "\n"); 
     builder.append("clinicalRecommendationStatement" + "->" + this.clinicalRecommendationStatement + "\n"); 
     builder.append("improvementNotation" + "->" + this.improvementNotation + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("guidance" + "->" + this.guidance + "\n"); 
     builder.append("set" + "->" + this.set + "\n"); 
     builder.append("group" + "->" + this.group + "\n"); 
     builder.append("supplementalData" + "->" + this.supplementalData + "\n"); 
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