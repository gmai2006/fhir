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

/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
*/
@Entity
@Table(name="consent")
public class ConsentModel  {
  /**
  * Description: "This is a Consent resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Unique identifier for this copy of the Consent Statement."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Indicates the current state of this consent."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "The patient/healthcare consumer to whom this consent applies."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`patient_id`", insertable=false, updatable=false)
  private ReferenceModel patient;

  /**
  * Description: "Relevant time or time-period when this Consent is applicable."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "When this  Consent was issued / created / indexed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"dateTime\"")
  private String dateTime;

  /**
  * Description: "Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> consentingParty = new java.util.ArrayList<>();

  /**
  * Description: "Who or what is controlled by this consent. Use group to identify a set of actors by some property they share (e.g. 'admitting officers')."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ConsentActorModel> actor = new java.util.ArrayList<>();

  /**
  * Description: "Actions controlled by this consent."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"action\"", length = 16777215)
  private String action;

  /**
  * Description: "The organization that manages the consent, and the framework within which it is executed."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> organization = new java.util.ArrayList<>();

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  * Actual type: Attachment
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"sourceAttachment\"", length = 16777215)
  private String sourceAttachment;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"sourceIdentifier\"", length = 16777215)
  private String sourceIdentifier;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  */
  @javax.persistence.Basic
  @Column(name="\"sourcereference_id\"")
  private String sourcereference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`sourcereference_id`", insertable=false, updatable=false)
  private ReferenceModel sourceReference;

  /**
  * Description: "The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ConsentPolicyModel> policy = new java.util.ArrayList<>();

  /**
  * Description: "A referece to the specific computable policy."
  */
  @javax.persistence.Basic
  @Column(name="\"policyRule\"")
  private String policyRule;

  /**
  * Description: "A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"securityLabel\"", length = 16777215)
  private String securityLabel;

  /**
  * Description: "The context of the activities a user is taking - why the user is accessing the data - that are controlled by this consent."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"purpose\"", length = 16777215)
  private String purpose;

  /**
  * Description: "Clinical or Operational Relevant period of time that bounds the data controlled by this consent."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dataPeriod\"", length = 16777215)
  private String dataPeriod;

  /**
  * Description: "The resources controlled by this consent, if specific resources are referenced."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ConsentDataModel> data = new java.util.ArrayList<>();

  /**
  * Description: "An exception to the base policy of this consent. An exception can be an addition or removal of access permissions."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ConsentExceptModel> except = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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


  public ConsentModel() {
  }

  public ConsentModel(Consent o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.category = CodeableConcept.toJson(o.getCategory());
      if (null != o.getPatient()) {
      	this.patient_id = "patient" + this.getId();
        this.patient = new ReferenceModel(o.getPatient());
        this.patient.setId(this.patient_id);
        this.patient.parent_id = this.patient.getId();
      }

      this.period = Period.toJson(o.getPeriod());
      this.dateTime = o.getDateTime();

      this.consentingParty = Reference.toModelArray(o.getConsentingParty());

      this.actor = ConsentActor.toModelArray(o.getActor());

      this.action = CodeableConcept.toJson(o.getAction());
      this.organization = Reference.toModelArray(o.getOrganization());

      this.sourceAttachment = Attachment.toJson(o.getSourceAttachment());
      this.sourceIdentifier = Identifier.toJson(o.getSourceIdentifier());
      if (null != o.getSourceReference()) {
      	this.sourcereference_id = "sourceReference" + this.getId();
        this.sourceReference = new ReferenceModel(o.getSourceReference());
        this.sourceReference.setId(this.sourcereference_id);
        this.sourceReference.parent_id = this.sourceReference.getId();
      }

      this.policy = ConsentPolicy.toModelArray(o.getPolicy());

      this.policyRule = o.getPolicyRule();

      this.securityLabel = Coding.toJson(o.getSecurityLabel());
      this.purpose = Coding.toJson(o.getPurpose());
      this.dataPeriod = Period.toJson(o.getDataPeriod());
      this.data = ConsentData.toModelArray(o.getData());

      this.except = ConsentExcept.toModelArray(o.getExcept());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setPatient( ReferenceModel value) {
    this.patient = value;
  }
  public ReferenceModel getPatient() {
    return this.patient;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setDateTime( String value) {
    this.dateTime = value;
  }
  public String getDateTime() {
    return this.dateTime;
  }
  public void setConsentingParty( java.util.List<ReferenceModel> value) {
    this.consentingParty = value;
  }
  public java.util.List<ReferenceModel> getConsentingParty() {
    return this.consentingParty;
  }
  public void setActor( java.util.List<ConsentActorModel> value) {
    this.actor = value;
  }
  public java.util.List<ConsentActorModel> getActor() {
    return this.actor;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setOrganization( java.util.List<ReferenceModel> value) {
    this.organization = value;
  }
  public java.util.List<ReferenceModel> getOrganization() {
    return this.organization;
  }
  public void setSourceAttachment( String value) {
    this.sourceAttachment = value;
  }
  public String getSourceAttachment() {
    return this.sourceAttachment;
  }
  public void setSourceIdentifier( String value) {
    this.sourceIdentifier = value;
  }
  public String getSourceIdentifier() {
    return this.sourceIdentifier;
  }
  public void setSourceReference( ReferenceModel value) {
    this.sourceReference = value;
  }
  public ReferenceModel getSourceReference() {
    return this.sourceReference;
  }
  public void setPolicy( java.util.List<ConsentPolicyModel> value) {
    this.policy = value;
  }
  public java.util.List<ConsentPolicyModel> getPolicy() {
    return this.policy;
  }
  public void setPolicyRule( String value) {
    this.policyRule = value;
  }
  public String getPolicyRule() {
    return this.policyRule;
  }
  public void setSecurityLabel( String value) {
    this.securityLabel = value;
  }
  public String getSecurityLabel() {
    return this.securityLabel;
  }
  public void setPurpose( String value) {
    this.purpose = value;
  }
  public String getPurpose() {
    return this.purpose;
  }
  public void setDataPeriod( String value) {
    this.dataPeriod = value;
  }
  public String getDataPeriod() {
    return this.dataPeriod;
  }
  public void setData( java.util.List<ConsentDataModel> value) {
    this.data = value;
  }
  public java.util.List<ConsentDataModel> getData() {
    return this.data;
  }
  public void setExcept( java.util.List<ConsentExceptModel> value) {
    this.except = value;
  }
  public java.util.List<ConsentExceptModel> getExcept() {
    return this.except;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("dateTime" + "[" + String.valueOf(this.dateTime) + "]\n"); 
     builder.append("consentingParty" + "[" + String.valueOf(this.consentingParty) + "]\n"); 
     builder.append("actor" + "[" + String.valueOf(this.actor) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("sourceAttachment" + "[" + String.valueOf(this.sourceAttachment) + "]\n"); 
     builder.append("sourceIdentifier" + "[" + String.valueOf(this.sourceIdentifier) + "]\n"); 
     builder.append("sourceReference" + "[" + String.valueOf(this.sourceReference) + "]\n"); 
     builder.append("policy" + "[" + String.valueOf(this.policy) + "]\n"); 
     builder.append("policyRule" + "[" + String.valueOf(this.policyRule) + "]\n"); 
     builder.append("securityLabel" + "[" + String.valueOf(this.securityLabel) + "]\n"); 
     builder.append("purpose" + "[" + String.valueOf(this.purpose) + "]\n"); 
     builder.append("dataPeriod" + "[" + String.valueOf(this.dataPeriod) + "]\n"); 
     builder.append("data" + "[" + String.valueOf(this.data) + "]\n"); 
     builder.append("except" + "[" + String.valueOf(this.except) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}