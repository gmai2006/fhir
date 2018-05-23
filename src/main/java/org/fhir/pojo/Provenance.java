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
import org.fhir.entity.ProvenanceModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Provenance  extends DomainResource  {
  /**
  * Description: "This is a Provenance resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<Reference> target;

  /**
  * Description: "The period during which the activity occurred."
  */
  protected Period period;

  /**
  * Description: "The instant of time at which the activity was recorded."
  */
  protected String recorded;

  /**
  * Description: "Extensions for recorded"
  */
  protected transient Element _recorded;

  /**
  * Description: "Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc."
  */
  protected java.util.List<String> policy;

  /**
  * Description: "Extensions for policy"
  */
  protected transient java.util.List<Element> _policy;

  /**
  * Description: "Where the activity occurred, if relevant."
  */
  protected Reference location;

  /**
  * Description: "The reason that the activity was taking place."
  */
  protected java.util.List<Coding> reason;

  /**
  * Description: "An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities."
  */
  protected Coding activity;

  /**
  * Description: "An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<ProvenanceAgent> agent;

  /**
  * Description: "An entity used in this activity."
  */
  protected java.util.List<ProvenanceEntity> entity;

  /**
  * Description: "A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated."
  */
  protected java.util.List<Signature> signature;

  public Provenance() {
  }

  public Provenance(ProvenanceModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getTarget() && !o.getTarget().isEmpty()) {
    	this.target = ReferenceHelper.fromArray2Array(o.getTarget());
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getRecorded()) {
      this.recorded = o.getRecorded();
    }
    if (o.getPolicy() != null) {
    	this.policy = org.fhir.utils.JsonUtils.json2Array(o.getPolicy());
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
      this.location = new Reference(o.getLocation().get(0));
    }
    if (null != o.getReason() && !o.getReason().isEmpty()) {
    	this.reason = CodingHelper.fromArray2Array(o.getReason());
    }
    if (null != o.getActivity() && !o.getActivity().isEmpty()) {
      this.activity = new Coding(o.getActivity().get(0));
    }
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
    	this.agent = ProvenanceAgentHelper.fromArray2Array(o.getAgent());
    }
    if (null != o.getEntity() && !o.getEntity().isEmpty()) {
    	this.entity = ProvenanceEntityHelper.fromArray2Array(o.getEntity());
    }
    if (o.getSignature() != null) {
    	this.signature = org.fhir.utils.JsonUtils.json2Array(o.getSignature());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setTarget( java.util.List<Reference> value) {
    this.target = value;
  }
  public java.util.List<Reference> getTarget() {
    return this.target;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setRecorded( String value) {
    this.recorded = value;
  }
  public String getRecorded() {
    return this.recorded;
  }
  public void set_recorded( Element value) {
    this._recorded = value;
  }
  public Element get_recorded() {
    return this._recorded;
  }
  public void setPolicy( java.util.List<String> value) {
    this.policy = value;
  }
  public java.util.List<String> getPolicy() {
    return this.policy;
  }
  public void set_policy( java.util.List<Element> value) {
    this._policy = value;
  }
  public java.util.List<Element> get_policy() {
    return this._policy;
  }
  public void setLocation( Reference value) {
    this.location = value;
  }
  public Reference getLocation() {
    return this.location;
  }
  public void setReason( java.util.List<Coding> value) {
    this.reason = value;
  }
  public java.util.List<Coding> getReason() {
    return this.reason;
  }
  public void setActivity( Coding value) {
    this.activity = value;
  }
  public Coding getActivity() {
    return this.activity;
  }
  public void setAgent( java.util.List<ProvenanceAgent> value) {
    this.agent = value;
  }
  public java.util.List<ProvenanceAgent> getAgent() {
    return this.agent;
  }
  public void setEntity( java.util.List<ProvenanceEntity> value) {
    this.entity = value;
  }
  public java.util.List<ProvenanceEntity> getEntity() {
    return this.entity;
  }
  public void setSignature( java.util.List<Signature> value) {
    this.signature = value;
  }
  public java.util.List<Signature> getSignature() {
    return this.signature;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Provenance]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.target != null) builder.append("target" + "->" + this.target.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.recorded != null) builder.append("recorded" + "->" + this.recorded.toString() + "\n"); 
     if(this._recorded != null) builder.append("_recorded" + "->" + this._recorded.toString() + "\n"); 
     if(this.policy != null) builder.append("policy" + "->" + this.policy.toString() + "\n"); 
     if(this._policy != null) builder.append("_policy" + "->" + this._policy.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.activity != null) builder.append("activity" + "->" + this.activity.toString() + "\n"); 
     if(this.agent != null) builder.append("agent" + "->" + this.agent.toString() + "\n"); 
     if(this.entity != null) builder.append("entity" + "->" + this.entity.toString() + "\n"); 
     if(this.signature != null) builder.append("signature" + "->" + this.signature.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Provenance,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Provenance" : { return Provenance.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}