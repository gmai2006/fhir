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
import org.fhir.entity.PlanDefinitionModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanDefinition  extends DomainResource  {
  /**
  * Description: "This is a PlanDefinition resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "An absolute URI that is used to identify this plan definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this plan definition is (or will be) published. The URL SHOULD include the major version of the plan definition. For more information see [Technical and Business Versions](resource.html#versions)."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "A formal identifier that is used to identify this plan definition when it is represented in other formats, or referenced in a specification, model, design or an instance."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The identifier that is used to identify this version of the plan definition when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the plan definition author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence. To provide a version consistent with the Decision Support Service specification, use the format Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision Support Service specification. Note that a version is required for non-experimental active artifacts."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "A natural language name identifying the plan definition. This name should be usable as an identifier for the module by machine processing applications such as code generation."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "A short, descriptive, user-friendly title for the plan definition."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "The type of asset the plan definition represents, e.g. an order set, protocol, or event-condition-action rule."
  */
  protected CodeableConcept type;

  /**
  * Description: "The status of this plan definition. Enables tracking the life-cycle of the content."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A boolean value to indicate that this plan definition is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage."
  */
  protected Boolean experimental;

  /**
  * Description: "Extensions for experimental"
  */
  protected transient Element _experimental;

  /**
  * Description: "The date  (and optionally time) when the plan definition was published. The date must change if and when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the plan definition changes."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "The name of the individual or organization that published the plan definition."
  */
  protected String publisher;

  /**
  * Description: "Extensions for publisher"
  */
  protected transient Element _publisher;

  /**
  * Description: "A free text natural language description of the plan definition from a consumer's perspective."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Explaination of why this plan definition is needed and why it has been designed as it has."
  */
  protected String purpose;

  /**
  * Description: "Extensions for purpose"
  */
  protected transient Element _purpose;

  /**
  * Description: "A detailed description of how the asset is used from a clinical perspective."
  */
  protected String usage;

  /**
  * Description: "Extensions for usage"
  */
  protected transient Element _usage;

  /**
  * Description: "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String approvalDate;

  /**
  * Description: "Extensions for approvalDate"
  */
  protected transient Element _approvalDate;

  /**
  * Description: "The date on which the resource content was last reviewed. Review happens periodically after approval, but doesn't change the original approval date."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String lastReviewDate;

  /**
  * Description: "Extensions for lastReviewDate"
  */
  protected transient Element _lastReviewDate;

  /**
  * Description: "The period during which the plan definition content was or is planned to be in active use."
  */
  protected Period effectivePeriod;

  /**
  * Description: "The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching for appropriate plan definition instances."
  */
  protected java.util.List<UsageContext> useContext;

  /**
  * Description: "A legal or geographic region in which the plan definition is intended to be used."
  */
  protected java.util.List<CodeableConcept> jurisdiction;

  /**
  * Description: "Descriptive topics related to the content of the plan definition. Topics provide a high-level categorization of the definition that can be useful for filtering and searching."
  */
  protected java.util.List<CodeableConcept> topic;

  /**
  * Description: "A contributor to the content of the asset, including authors, editors, reviewers, and endorsers."
  */
  protected java.util.List<Contributor> contributor;

  /**
  * Description: "Contact details to assist a user in finding and communicating with the publisher."
  */
  protected java.util.List<ContactDetail> contact;

  /**
  * Description: "A copyright statement relating to the plan definition and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the plan definition."
  */
  protected String copyright;

  /**
  * Description: "Extensions for copyright"
  */
  protected transient Element _copyright;

  /**
  * Description: "Related artifacts such as additional documentation, justification, or bibliographic references."
  */
  protected java.util.List<RelatedArtifact> relatedArtifact;

  /**
  * Description: "A reference to a Library resource containing any formal logic used by the plan definition."
  */
  protected java.util.List<Reference> library;

  /**
  * Description: "Goals that describe what the activities within the plan are intended to achieve. For example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
  */
  protected java.util.List<PlanDefinitionGoal> goal;

  /**
  * Description: "An action to be taken as part of the plan."
  */
  protected java.util.List<PlanDefinitionAction> action;

  public PlanDefinition() {
  }

  public PlanDefinition(PlanDefinitionModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getUrl()) {
      this.url = o.getUrl();
    }
    if (null != o.getVersion()) {
      this.version = o.getVersion();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getTitle()) {
      this.title = o.getTitle();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getExperimental()) {
      this.experimental = o.getExperimental();
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getPublisher()) {
      this.publisher = o.getPublisher();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getPurpose()) {
      this.purpose = o.getPurpose();
    }
    if (null != o.getUsage()) {
      this.usage = o.getUsage();
    }
    if (null != o.getApprovalDate()) {
      this.approvalDate = o.getApprovalDate();
    }
    if (null != o.getLastReviewDate()) {
      this.lastReviewDate = o.getLastReviewDate();
    }
    this.effectivePeriod = PeriodHelper.fromJson(o.getEffectivePeriod());
    if (null != o.getUseContext() && !o.getUseContext().isEmpty()) {
    	this.useContext = UsageContextHelper.fromArray2Array(o.getUseContext());
    }
    if (null != o.getJurisdiction() && !o.getJurisdiction().isEmpty()) {
    	this.jurisdiction = CodeableConceptHelper.fromArray2Array(o.getJurisdiction());
    }
    if (null != o.getTopic() && !o.getTopic().isEmpty()) {
    	this.topic = CodeableConceptHelper.fromArray2Array(o.getTopic());
    }
    if (null != o.getContributor() && !o.getContributor().isEmpty()) {
    	this.contributor = ContributorHelper.fromArray2Array(o.getContributor());
    }
    if (null != o.getContact() && !o.getContact().isEmpty()) {
    	this.contact = ContactDetailHelper.fromArray2Array(o.getContact());
    }
    if (null != o.getCopyright()) {
      this.copyright = o.getCopyright();
    }
    if (null != o.getRelatedArtifact() && !o.getRelatedArtifact().isEmpty()) {
    	this.relatedArtifact = RelatedArtifactHelper.fromArray2Array(o.getRelatedArtifact());
    }
    if (null != o.getLibrary() && !o.getLibrary().isEmpty()) {
    	this.library = ReferenceHelper.fromArray2Array(o.getLibrary());
    }
    if (null != o.getGoal() && !o.getGoal().isEmpty()) {
    	this.goal = PlanDefinitionGoalHelper.fromArray2Array(o.getGoal());
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action = PlanDefinitionActionHelper.fromArray2Array(o.getAction());
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
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
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
  public void setGoal( java.util.List<PlanDefinitionGoal> value) {
    this.goal = value;
  }
  public java.util.List<PlanDefinitionGoal> getGoal() {
    return this.goal;
  }
  public void setAction( java.util.List<PlanDefinitionAction> value) {
    this.action = value;
  }
  public java.util.List<PlanDefinitionAction> getAction() {
    return this.action;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PlanDefinition]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.version != null) builder.append("version" + "->" + this.version.toString() + "\n"); 
     if(this._version != null) builder.append("_version" + "->" + this._version.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.experimental != null) builder.append("experimental" + "->" + this.experimental.toString() + "\n"); 
     if(this._experimental != null) builder.append("_experimental" + "->" + this._experimental.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.publisher != null) builder.append("publisher" + "->" + this.publisher.toString() + "\n"); 
     if(this._publisher != null) builder.append("_publisher" + "->" + this._publisher.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.purpose != null) builder.append("purpose" + "->" + this.purpose.toString() + "\n"); 
     if(this._purpose != null) builder.append("_purpose" + "->" + this._purpose.toString() + "\n"); 
     if(this.usage != null) builder.append("usage" + "->" + this.usage.toString() + "\n"); 
     if(this._usage != null) builder.append("_usage" + "->" + this._usage.toString() + "\n"); 
     if(this.approvalDate != null) builder.append("approvalDate" + "->" + this.approvalDate.toString() + "\n"); 
     if(this._approvalDate != null) builder.append("_approvalDate" + "->" + this._approvalDate.toString() + "\n"); 
     if(this.lastReviewDate != null) builder.append("lastReviewDate" + "->" + this.lastReviewDate.toString() + "\n"); 
     if(this._lastReviewDate != null) builder.append("_lastReviewDate" + "->" + this._lastReviewDate.toString() + "\n"); 
     if(this.effectivePeriod != null) builder.append("effectivePeriod" + "->" + this.effectivePeriod.toString() + "\n"); 
     if(this.useContext != null) builder.append("useContext" + "->" + this.useContext.toString() + "\n"); 
     if(this.jurisdiction != null) builder.append("jurisdiction" + "->" + this.jurisdiction.toString() + "\n"); 
     if(this.topic != null) builder.append("topic" + "->" + this.topic.toString() + "\n"); 
     if(this.contributor != null) builder.append("contributor" + "->" + this.contributor.toString() + "\n"); 
     if(this.contact != null) builder.append("contact" + "->" + this.contact.toString() + "\n"); 
     if(this.copyright != null) builder.append("copyright" + "->" + this.copyright.toString() + "\n"); 
     if(this._copyright != null) builder.append("_copyright" + "->" + this._copyright.toString() + "\n"); 
     if(this.relatedArtifact != null) builder.append("relatedArtifact" + "->" + this.relatedArtifact.toString() + "\n"); 
     if(this.library != null) builder.append("library" + "->" + this.library.toString() + "\n"); 
     if(this.goal != null) builder.append("goal" + "->" + this.goal.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	PlanDefinition,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "PlanDefinition" : { return PlanDefinition.toString(); }
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

}