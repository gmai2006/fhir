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
import org.fhir.entity.EpisodeOfCareModel;
import com.google.gson.GsonBuilder;

/**
* "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time."
*/
public class EpisodeOfCare  {
  /**
  * Description: "This is a EpisodeOfCare resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "planned | waitlist | active | onhold | finished | cancelled."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)."
  */
  private java.util.List<EpisodeOfCareStatusHistory> statusHistory = new java.util.ArrayList<>();

  /**
  * Description: "A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care."
  */
  private java.util.List<CodeableConcept> type = new java.util.ArrayList<>();

  /**
  * Description: "The list of diagnosis relevant to this episode of care."
  */
  private java.util.List<EpisodeOfCareDiagnosis> diagnosis = new java.util.ArrayList<>();

  /**
  * Description: "The patient who is the focus of this episode of care."
  */
  @javax.validation.constraints.NotNull
  private Reference patient;

  /**
  * Description: "The organization that has assumed the specific responsibilities for the specified duration."
  */
  private Reference managingOrganization;

  /**
  * Description: "The interval during which the managing organization assumes the defined responsibility."
  */
  private Period period;

  /**
  * Description: "Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals."
  */
  private java.util.List<Reference> referralRequest = new java.util.ArrayList<>();

  /**
  * Description: "The practitioner that is the care manager/care co-ordinator for this patient."
  */
  private Reference careManager;

  /**
  * Description: "The list of practitioners that may be facilitating this episode of care for specific purposes."
  */
  private java.util.List<Reference> team = new java.util.ArrayList<>();

  /**
  * Description: "The set of accounts that may be used for billing for this EpisodeOfCare."
  */
  private java.util.List<Reference> account = new java.util.ArrayList<>();

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

  public EpisodeOfCare() {
  }

  public EpisodeOfCare(EpisodeOfCareModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.statusHistory = EpisodeOfCareStatusHistory.fromArray(o.getStatusHistory());

      this.type = CodeableConcept.fromArray(o.getType());
      this.diagnosis = EpisodeOfCareDiagnosis.fromArray(o.getDiagnosis());

      if (null != o.getPatient()) {
        this.patient = new Reference(o.getPatient());
        this.patient.setId(this.getId());
      }

      if (null != o.getManagingOrganization()) {
        this.managingOrganization = new Reference(o.getManagingOrganization());
        this.managingOrganization.setId(this.getId());
      }

      this.period = Period.fromJson(o.getPeriod());
      this.referralRequest = Reference.fromArray(o.getReferralRequest());

      if (null != o.getCareManager()) {
        this.careManager = new Reference(o.getCareManager());
        this.careManager.setId(this.getId());
      }

      this.team = Reference.fromArray(o.getTeam());

      this.account = Reference.fromArray(o.getAccount());

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
  public void setStatusHistory( java.util.List<EpisodeOfCareStatusHistory> value) {
    this.statusHistory = value;
  }
  public java.util.List<EpisodeOfCareStatusHistory> getStatusHistory() {
    return this.statusHistory;
  }
  public void setType( java.util.List<CodeableConcept> value) {
    this.type = value;
  }
  public java.util.List<CodeableConcept> getType() {
    return this.type;
  }
  public void setDiagnosis( java.util.List<EpisodeOfCareDiagnosis> value) {
    this.diagnosis = value;
  }
  public java.util.List<EpisodeOfCareDiagnosis> getDiagnosis() {
    return this.diagnosis;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setManagingOrganization( Reference value) {
    this.managingOrganization = value;
  }
  public Reference getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setReferralRequest( java.util.List<Reference> value) {
    this.referralRequest = value;
  }
  public java.util.List<Reference> getReferralRequest() {
    return this.referralRequest;
  }
  public void setCareManager( Reference value) {
    this.careManager = value;
  }
  public Reference getCareManager() {
    return this.careManager;
  }
  public void setTeam( java.util.List<Reference> value) {
    this.team = value;
  }
  public java.util.List<Reference> getTeam() {
    return this.team;
  }
  public void setAccount( java.util.List<Reference> value) {
    this.account = value;
  }
  public java.util.List<Reference> getAccount() {
    return this.account;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("statusHistory" + "[" + String.valueOf(this.statusHistory) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("diagnosis" + "[" + String.valueOf(this.diagnosis) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("managingOrganization" + "[" + String.valueOf(this.managingOrganization) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("referralRequest" + "[" + String.valueOf(this.referralRequest) + "]\n"); 
     builder.append("careManager" + "[" + String.valueOf(this.careManager) + "]\n"); 
     builder.append("team" + "[" + String.valueOf(this.team) + "]\n"); 
     builder.append("account" + "[" + String.valueOf(this.account) + "]\n"); 
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
  	EpisodeOfCare,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "EpisodeOfCare" : { return EpisodeOfCare.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	planned,
  	waitlist,
  	active,
  	onhold,
  	finished,
  	cancelled,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "planned" : { return planned.toString(); }
  			case "waitlist" : { return waitlist.toString(); }
  			case "active" : { return active.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			case "finished" : { return finished.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<EpisodeOfCare> fromArray(java.util.List<EpisodeOfCareModel> list) {
    return (java.util.List<EpisodeOfCare>)list.stream()
      .map(model -> new EpisodeOfCare(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<EpisodeOfCareModel> toModelArray(java.util.List<EpisodeOfCare> list) {
    return (java.util.List<EpisodeOfCareModel>)list.stream()
      .map(model -> new EpisodeOfCareModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static EpisodeOfCare fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, EpisodeOfCare.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(EpisodeOfCare o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<EpisodeOfCare> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}