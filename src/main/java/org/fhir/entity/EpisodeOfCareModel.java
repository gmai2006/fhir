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
* "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time."
*/
@Entity
@Table(name="episodeofcare")
public class EpisodeOfCareModel  implements Serializable {
	private static final long serialVersionUID = 151967883158022799L;
  /**
  * Description: "This is a EpisodeOfCare resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "planned | waitlist | active | onhold | finished | cancelled."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)."
  */
  @javax.persistence.Basic
  @Column(name="\"statushistory_id\"")
  private String statushistory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="statushistory_id", insertable=false, updatable=false)
  private java.util.List<EpisodeOfCareStatusHistoryModel> statusHistory;

  /**
  * Description: "A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "The list of diagnosis relevant to this episode of care."
  */
  @javax.persistence.Basic
  @Column(name="\"diagnosis_id\"")
  private String diagnosis_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="diagnosis_id", insertable=false, updatable=false)
  private java.util.List<EpisodeOfCareDiagnosisModel> diagnosis;

  /**
  * Description: "The patient who is the focus of this episode of care."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "The organization that has assumed the specific responsibilities for the specified duration."
  */
  @javax.persistence.Basic
  @Column(name="\"managingorganization_id\"")
  private String managingorganization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="managingorganization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> managingOrganization;

  /**
  * Description: "The interval during which the managing organization assumes the defined responsibility."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals."
  */
  @javax.persistence.Basic
  @Column(name="\"referralrequest_id\"")
  private String referralrequest_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="referralrequest_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> referralRequest;

  /**
  * Description: "The practitioner that is the care manager/care co-ordinator for this patient."
  */
  @javax.persistence.Basic
  @Column(name="\"caremanager_id\"")
  private String caremanager_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="caremanager_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> careManager;

  /**
  * Description: "The list of practitioners that may be facilitating this episode of care for specific purposes."
  */
  @javax.persistence.Basic
  @Column(name="\"team_id\"")
  private String team_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="team_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> team;

  /**
  * Description: "The set of accounts that may be used for billing for this EpisodeOfCare."
  */
  @javax.persistence.Basic
  @Column(name="\"account_id\"")
  private String account_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="account_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> account;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public EpisodeOfCareModel() {
  }

  public EpisodeOfCareModel(EpisodeOfCare o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getStatusHistory() && !o.getStatusHistory().isEmpty()) {
    	this.statushistory_id = "statushistory" + this.id;
    	this.statusHistory = EpisodeOfCareStatusHistoryHelper.toModelFromArray(o.getStatusHistory(), this.statushistory_id);
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModelFromArray(o.getType(), this.type_id);
    }
    if (null != o.getDiagnosis() && !o.getDiagnosis().isEmpty()) {
    	this.diagnosis_id = "diagnosis" + this.id;
    	this.diagnosis = EpisodeOfCareDiagnosisHelper.toModelFromArray(o.getDiagnosis(), this.diagnosis_id);
    }
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    if (null != o.getManagingOrganization() ) {
    	this.managingorganization_id = "managingorganization" + this.id;
    	this.managingOrganization = ReferenceHelper.toModel(o.getManagingOrganization(), this.managingorganization_id);
    }
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    if (null != o.getReferralRequest() && !o.getReferralRequest().isEmpty()) {
    	this.referralrequest_id = "referralrequest" + this.id;
    	this.referralRequest = ReferenceHelper.toModelFromArray(o.getReferralRequest(), this.referralrequest_id);
    }
    if (null != o.getCareManager() ) {
    	this.caremanager_id = "caremanager" + this.id;
    	this.careManager = ReferenceHelper.toModel(o.getCareManager(), this.caremanager_id);
    }
    if (null != o.getTeam() && !o.getTeam().isEmpty()) {
    	this.team_id = "team" + this.id;
    	this.team = ReferenceHelper.toModelFromArray(o.getTeam(), this.team_id);
    }
    if (null != o.getAccount() && !o.getAccount().isEmpty()) {
    	this.account_id = "account" + this.id;
    	this.account = ReferenceHelper.toModelFromArray(o.getAccount(), this.account_id);
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
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<EpisodeOfCareStatusHistoryModel> getStatusHistory() {
    return this.statusHistory;
  }
  public void setStatusHistory( java.util.List<EpisodeOfCareStatusHistoryModel> value) {
    this.statusHistory = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<EpisodeOfCareDiagnosisModel> getDiagnosis() {
    return this.diagnosis;
  }
  public void setDiagnosis( java.util.List<EpisodeOfCareDiagnosisModel> value) {
    this.diagnosis = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
  }
  public java.util.List<ReferenceModel> getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setManagingOrganization( java.util.List<ReferenceModel> value) {
    this.managingOrganization = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public java.util.List<ReferenceModel> getReferralRequest() {
    return this.referralRequest;
  }
  public void setReferralRequest( java.util.List<ReferenceModel> value) {
    this.referralRequest = value;
  }
  public java.util.List<ReferenceModel> getCareManager() {
    return this.careManager;
  }
  public void setCareManager( java.util.List<ReferenceModel> value) {
    this.careManager = value;
  }
  public java.util.List<ReferenceModel> getTeam() {
    return this.team;
  }
  public void setTeam( java.util.List<ReferenceModel> value) {
    this.team = value;
  }
  public java.util.List<ReferenceModel> getAccount() {
    return this.account;
  }
  public void setAccount( java.util.List<ReferenceModel> value) {
    this.account = value;
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
    builder.append("[EpisodeOfCareModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
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
    builder.append("[EpisodeOfCareModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("statusHistory" + "->" + this.statusHistory + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("diagnosis" + "->" + this.diagnosis + "\n"); 
     builder.append("patient" + "->" + this.patient + "\n"); 
     builder.append("managingOrganization" + "->" + this.managingOrganization + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("referralRequest" + "->" + this.referralRequest + "\n"); 
     builder.append("careManager" + "->" + this.careManager + "\n"); 
     builder.append("team" + "->" + this.team + "\n"); 
     builder.append("account" + "->" + this.account + "\n"); 
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