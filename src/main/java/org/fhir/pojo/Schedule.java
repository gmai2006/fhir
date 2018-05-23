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
import org.fhir.entity.ScheduleModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A container for slots of time that may be available for booking appointments."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Schedule  extends DomainResource  {
  /**
  * Description: "This is a Schedule resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "External Ids for this item."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Whether this schedule record is in active use, or should not be used (such as was entered in error)."
  */
  protected Boolean active;

  /**
  * Description: "Extensions for active"
  */
  protected transient Element _active;

  /**
  * Description: "A broad categorisation of the service that is to be performed during this appointment."
  */
  protected CodeableConcept serviceCategory;

  /**
  * Description: "The specific service that is to be performed during this appointment."
  */
  protected java.util.List<CodeableConcept> serviceType;

  /**
  * Description: "The specialty of a practitioner that would be required to perform the service requested in this appointment."
  */
  protected java.util.List<CodeableConcept> specialty;

  /**
  * Description: "The resource this Schedule resource is providing availability information for. These are expected to usually be one of HealthcareService, Location, Practitioner, PractitionerRole, Device, Patient or RelatedPerson."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<Reference> actor;

  /**
  * Description: "The period of time that the slots that are attached to this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a \"template\" for planning outside these dates."
  */
  protected Period planningHorizon;

  /**
  * Description: "Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  public Schedule() {
  }

  public Schedule(ScheduleModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getActive()) {
      this.active = o.getActive();
    }
    if (null != o.getServiceCategory() && !o.getServiceCategory().isEmpty()) {
      this.serviceCategory = new CodeableConcept(o.getServiceCategory().get(0));
    }
    if (null != o.getServiceType() && !o.getServiceType().isEmpty()) {
    	this.serviceType = CodeableConceptHelper.fromArray2Array(o.getServiceType());
    }
    if (null != o.getSpecialty() && !o.getSpecialty().isEmpty()) {
    	this.specialty = CodeableConceptHelper.fromArray2Array(o.getSpecialty());
    }
    if (null != o.getActor() && !o.getActor().isEmpty()) {
    	this.actor = ReferenceHelper.fromArray2Array(o.getActor());
    }
    this.planningHorizon = PeriodHelper.fromJson(o.getPlanningHorizon());
    if (null != o.getComment()) {
      this.comment = o.getComment();
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
  public void setActive( Boolean value) {
    this.active = value;
  }
  public Boolean getActive() {
    return this.active;
  }
  public void set_active( Element value) {
    this._active = value;
  }
  public Element get_active() {
    return this._active;
  }
  public void setServiceCategory( CodeableConcept value) {
    this.serviceCategory = value;
  }
  public CodeableConcept getServiceCategory() {
    return this.serviceCategory;
  }
  public void setServiceType( java.util.List<CodeableConcept> value) {
    this.serviceType = value;
  }
  public java.util.List<CodeableConcept> getServiceType() {
    return this.serviceType;
  }
  public void setSpecialty( java.util.List<CodeableConcept> value) {
    this.specialty = value;
  }
  public java.util.List<CodeableConcept> getSpecialty() {
    return this.specialty;
  }
  public void setActor( java.util.List<Reference> value) {
    this.actor = value;
  }
  public java.util.List<Reference> getActor() {
    return this.actor;
  }
  public void setPlanningHorizon( Period value) {
    this.planningHorizon = value;
  }
  public Period getPlanningHorizon() {
    return this.planningHorizon;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Schedule]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this._active != null) builder.append("_active" + "->" + this._active.toString() + "\n"); 
     if(this.serviceCategory != null) builder.append("serviceCategory" + "->" + this.serviceCategory.toString() + "\n"); 
     if(this.serviceType != null) builder.append("serviceType" + "->" + this.serviceType.toString() + "\n"); 
     if(this.specialty != null) builder.append("specialty" + "->" + this.specialty.toString() + "\n"); 
     if(this.actor != null) builder.append("actor" + "->" + this.actor.toString() + "\n"); 
     if(this.planningHorizon != null) builder.append("planningHorizon" + "->" + this.planningHorizon.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Schedule,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Schedule" : { return Schedule.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}