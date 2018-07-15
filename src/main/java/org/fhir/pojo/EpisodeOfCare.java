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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EpisodeOfCare  extends DomainResource  {
  /**
  * Description: "This is a EpisodeOfCare resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "planned | waitlist | active | onhold | finished | cancelled."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)."
  */
  protected java.util.List<EpisodeOfCareStatusHistory> statusHistory;

  /**
  * Description: "A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care."
  */
  protected java.util.List<CodeableConcept> type;

  /**
  * Description: "The list of diagnosis relevant to this episode of care."
  */
  protected java.util.List<EpisodeOfCareDiagnosis> diagnosis;

  /**
  * Description: "The patient who is the focus of this episode of care."
  */
  @javax.validation.constraints.NotNull
  protected Reference patient;

  /**
  * Description: "The organization that has assumed the specific responsibilities for the specified duration."
  */
  protected Reference managingOrganization;

  /**
  * Description: "The interval during which the managing organization assumes the defined responsibility."
  */
  protected Period period;

  /**
  * Description: "Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals."
  */
  protected java.util.List<Reference> referralRequest;

  /**
  * Description: "The practitioner that is the care manager/care co-ordinator for this patient."
  */
  protected Reference careManager;

  /**
  * Description: "The list of practitioners that may be facilitating this episode of care for specific purposes."
  */
  protected java.util.List<Reference> team;

  /**
  * Description: "The set of accounts that may be used for billing for this EpisodeOfCare."
  */
  protected java.util.List<Reference> account;

  public EpisodeOfCare() {
  }

  public EpisodeOfCare(EpisodeOfCareModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getStatusHistory() && !o.getStatusHistory().isEmpty()) {
    	this.statusHistory = EpisodeOfCareStatusHistoryHelper.fromArray2Array(o.getStatusHistory());
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type = CodeableConceptHelper.fromArray2Array(o.getType());
    }
    if (null != o.getDiagnosis() && !o.getDiagnosis().isEmpty()) {
    	this.diagnosis = EpisodeOfCareDiagnosisHelper.fromArray2Array(o.getDiagnosis());
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getManagingOrganization() && !o.getManagingOrganization().isEmpty()) {
      this.managingOrganization = new Reference(o.getManagingOrganization().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getReferralRequest() && !o.getReferralRequest().isEmpty()) {
    	this.referralRequest = ReferenceHelper.fromArray2Array(o.getReferralRequest());
    }
    if (null != o.getCareManager() && !o.getCareManager().isEmpty()) {
      this.careManager = new Reference(o.getCareManager().get(0));
    }
    if (null != o.getTeam() && !o.getTeam().isEmpty()) {
    	this.team = ReferenceHelper.fromArray2Array(o.getTeam());
    }
    if (null != o.getAccount() && !o.getAccount().isEmpty()) {
    	this.account = ReferenceHelper.fromArray2Array(o.getAccount());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EpisodeOfCare]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.statusHistory != null) builder.append("statusHistory" + "->" + this.statusHistory.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.diagnosis != null) builder.append("diagnosis" + "->" + this.diagnosis.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.managingOrganization != null) builder.append("managingOrganization" + "->" + this.managingOrganization.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.referralRequest != null) builder.append("referralRequest" + "->" + this.referralRequest.toString() + "\n"); 
     if(this.careManager != null) builder.append("careManager" + "->" + this.careManager.toString() + "\n"); 
     if(this.team != null) builder.append("team" + "->" + this.team.toString() + "\n"); 
     if(this.account != null) builder.append("account" + "->" + this.account.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

}