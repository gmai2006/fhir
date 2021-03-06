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
import org.fhir.entity.PractitionerRoleModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PractitionerRole  extends DomainResource  {
  /**
  * Description: "This is a PractitionerRole resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Business Identifiers that are specific to a role/location."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Whether this practitioner's record is in active use."
  */
  protected Boolean active;

  /**
  * Description: "Extensions for active"
  */
  protected transient Element _active;

  /**
  * Description: "The period during which the person is authorized to act as a practitioner in these role(s) for the organization."
  */
  protected Period period;

  /**
  * Description: "Practitioner that is able to provide the defined services for the organation."
  */
  protected Reference practitioner;

  /**
  * Description: "The organization where the Practitioner performs the roles associated."
  */
  protected Reference organization;

  /**
  * Description: "Roles which this practitioner is authorized to perform for the organization."
  */
  protected java.util.List<CodeableConcept> code;

  /**
  * Description: "Specific specialty of the practitioner."
  */
  protected java.util.List<CodeableConcept> specialty;

  /**
  * Description: "The location(s) at which this practitioner provides care."
  */
  protected java.util.List<Reference> location;

  /**
  * Description: "The list of healthcare services that this worker provides for this role's Organization/Location(s)."
  */
  protected java.util.List<Reference> healthcareService;

  /**
  * Description: "Contact details that are specific to the role/location/service."
  */
  protected java.util.List<ContactPoint> telecom;

  /**
  * Description: "A collection of times that the Service Site is available."
  */
  protected java.util.List<PractitionerRoleAvailableTime> availableTime;

  /**
  * Description: "The HealthcareService is not available during this period of time due to the provided reason."
  */
  protected java.util.List<PractitionerRoleNotAvailable> notAvailable;

  /**
  * Description: "A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times."
  */
  protected String availabilityExceptions;

  /**
  * Description: "Extensions for availabilityExceptions"
  */
  protected transient Element _availabilityExceptions;

  /**
  * Description: "Technical endpoints providing access to services operated for the practitioner with this role."
  */
  protected java.util.List<Reference> endpoint;

  public PractitionerRole() {
  }

  public PractitionerRole(PractitionerRoleModel o) {
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
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getPractitioner() && !o.getPractitioner().isEmpty()) {
      this.practitioner = new Reference(o.getPractitioner().get(0));
    }
    if (null != o.getOrganization() && !o.getOrganization().isEmpty()) {
      this.organization = new Reference(o.getOrganization().get(0));
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
    	this.code = CodeableConceptHelper.fromArray2Array(o.getCode());
    }
    if (null != o.getSpecialty() && !o.getSpecialty().isEmpty()) {
    	this.specialty = CodeableConceptHelper.fromArray2Array(o.getSpecialty());
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
    	this.location = ReferenceHelper.fromArray2Array(o.getLocation());
    }
    if (null != o.getHealthcareService() && !o.getHealthcareService().isEmpty()) {
    	this.healthcareService = ReferenceHelper.fromArray2Array(o.getHealthcareService());
    }
    if (o.getTelecom() != null) {
    	this.telecom = org.fhir.utils.JsonUtils.json2Array(o.getTelecom());
    }
    if (null != o.getAvailableTime() && !o.getAvailableTime().isEmpty()) {
    	this.availableTime = PractitionerRoleAvailableTimeHelper.fromArray2Array(o.getAvailableTime());
    }
    if (null != o.getNotAvailable() && !o.getNotAvailable().isEmpty()) {
    	this.notAvailable = PractitionerRoleNotAvailableHelper.fromArray2Array(o.getNotAvailable());
    }
    if (null != o.getAvailabilityExceptions()) {
      this.availabilityExceptions = o.getAvailabilityExceptions();
    }
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint = ReferenceHelper.fromArray2Array(o.getEndpoint());
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
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setPractitioner( Reference value) {
    this.practitioner = value;
  }
  public Reference getPractitioner() {
    return this.practitioner;
  }
  public void setOrganization( Reference value) {
    this.organization = value;
  }
  public Reference getOrganization() {
    return this.organization;
  }
  public void setCode( java.util.List<CodeableConcept> value) {
    this.code = value;
  }
  public java.util.List<CodeableConcept> getCode() {
    return this.code;
  }
  public void setSpecialty( java.util.List<CodeableConcept> value) {
    this.specialty = value;
  }
  public java.util.List<CodeableConcept> getSpecialty() {
    return this.specialty;
  }
  public void setLocation( java.util.List<Reference> value) {
    this.location = value;
  }
  public java.util.List<Reference> getLocation() {
    return this.location;
  }
  public void setHealthcareService( java.util.List<Reference> value) {
    this.healthcareService = value;
  }
  public java.util.List<Reference> getHealthcareService() {
    return this.healthcareService;
  }
  public void setTelecom( java.util.List<ContactPoint> value) {
    this.telecom = value;
  }
  public java.util.List<ContactPoint> getTelecom() {
    return this.telecom;
  }
  public void setAvailableTime( java.util.List<PractitionerRoleAvailableTime> value) {
    this.availableTime = value;
  }
  public java.util.List<PractitionerRoleAvailableTime> getAvailableTime() {
    return this.availableTime;
  }
  public void setNotAvailable( java.util.List<PractitionerRoleNotAvailable> value) {
    this.notAvailable = value;
  }
  public java.util.List<PractitionerRoleNotAvailable> getNotAvailable() {
    return this.notAvailable;
  }
  public void setAvailabilityExceptions( String value) {
    this.availabilityExceptions = value;
  }
  public String getAvailabilityExceptions() {
    return this.availabilityExceptions;
  }
  public void set_availabilityExceptions( Element value) {
    this._availabilityExceptions = value;
  }
  public Element get_availabilityExceptions() {
    return this._availabilityExceptions;
  }
  public void setEndpoint( java.util.List<Reference> value) {
    this.endpoint = value;
  }
  public java.util.List<Reference> getEndpoint() {
    return this.endpoint;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PractitionerRole]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this._active != null) builder.append("_active" + "->" + this._active.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.practitioner != null) builder.append("practitioner" + "->" + this.practitioner.toString() + "\n"); 
     if(this.organization != null) builder.append("organization" + "->" + this.organization.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.specialty != null) builder.append("specialty" + "->" + this.specialty.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this.healthcareService != null) builder.append("healthcareService" + "->" + this.healthcareService.toString() + "\n"); 
     if(this.telecom != null) builder.append("telecom" + "->" + this.telecom.toString() + "\n"); 
     if(this.availableTime != null) builder.append("availableTime" + "->" + this.availableTime.toString() + "\n"); 
     if(this.notAvailable != null) builder.append("notAvailable" + "->" + this.notAvailable.toString() + "\n"); 
     if(this.availabilityExceptions != null) builder.append("availabilityExceptions" + "->" + this.availabilityExceptions.toString() + "\n"); 
     if(this._availabilityExceptions != null) builder.append("_availabilityExceptions" + "->" + this._availabilityExceptions.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	PractitionerRole,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "PractitionerRole" : { return PractitionerRole.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}