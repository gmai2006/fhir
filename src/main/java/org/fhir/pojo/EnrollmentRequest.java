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
import org.fhir.entity.EnrollmentRequestModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource provides the insurance enrollment details to the insurer regarding a specified coverage."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EnrollmentRequest  extends DomainResource  {
  /**
  * Description: "This is a EnrollmentRequest resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The Response business identifier."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The date when this resource was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String created;

  /**
  * Description: "Extensions for created"
  */
  protected transient Element _created;

  /**
  * Description: "The Insurer who is target  of the request."
  */
  protected Reference insurer;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  protected Reference provider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  protected Reference organization;

  /**
  * Description: "Patient Resource."
  */
  protected Reference subject;

  /**
  * Description: "Reference to the program or plan identification, underwriter or payor."
  */
  protected Reference coverage;

  public EnrollmentRequest() {
  }

  public EnrollmentRequest(EnrollmentRequestModel o) {
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
    if (null != o.getCreated()) {
      this.created = o.getCreated();
    }
    if (null != o.getInsurer() && !o.getInsurer().isEmpty()) {
      this.insurer = new Reference(o.getInsurer().get(0));
    }
    if (null != o.getProvider() && !o.getProvider().isEmpty()) {
      this.provider = new Reference(o.getProvider().get(0));
    }
    if (null != o.getOrganization() && !o.getOrganization().isEmpty()) {
      this.organization = new Reference(o.getOrganization().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getCoverage() && !o.getCoverage().isEmpty()) {
      this.coverage = new Reference(o.getCoverage().get(0));
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
    this.status = value;
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
  public void setCreated( String value) {
    this.created = value;
  }
  public String getCreated() {
    return this.created;
  }
  public void set_created( Element value) {
    this._created = value;
  }
  public Element get_created() {
    return this._created;
  }
  public void setInsurer( Reference value) {
    this.insurer = value;
  }
  public Reference getInsurer() {
    return this.insurer;
  }
  public void setProvider( Reference value) {
    this.provider = value;
  }
  public Reference getProvider() {
    return this.provider;
  }
  public void setOrganization( Reference value) {
    this.organization = value;
  }
  public Reference getOrganization() {
    return this.organization;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setCoverage( Reference value) {
    this.coverage = value;
  }
  public Reference getCoverage() {
    return this.coverage;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[EnrollmentRequest]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.created != null) builder.append("created" + "->" + this.created.toString() + "\n"); 
     if(this._created != null) builder.append("_created" + "->" + this._created.toString() + "\n"); 
     if(this.insurer != null) builder.append("insurer" + "->" + this.insurer.toString() + "\n"); 
     if(this.provider != null) builder.append("provider" + "->" + this.provider.toString() + "\n"); 
     if(this.organization != null) builder.append("organization" + "->" + this.organization.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.coverage != null) builder.append("coverage" + "->" + this.coverage.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	EnrollmentRequest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "EnrollmentRequest" : { return EnrollmentRequest.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}