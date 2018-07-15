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
import org.fhir.entity.ResearchSubjectModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResearchSubject  extends DomainResource  {
  /**
  * Description: "This is a ResearchSubject resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifiers assigned to this research study by the sponsor or other systems."
  */
  protected Identifier identifier;

  /**
  * Description: "The current state of the subject."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The dates the subject began and ended their participation in the study."
  */
  protected Period period;

  /**
  * Description: "Reference to the study the subject is participating in."
  */
  @javax.validation.constraints.NotNull
  protected Reference study;

  /**
  * Description: "The record of the person or animal who is involved in the study."
  */
  @javax.validation.constraints.NotNull
  protected Reference individual;

  /**
  * Description: "The name of the arm in the study the subject is expected to follow as part of this study."
  */
  protected String assignedArm;

  /**
  * Description: "Extensions for assignedArm"
  */
  protected transient Element _assignedArm;

  /**
  * Description: "The name of the arm in the study the subject actually followed as part of this study."
  */
  protected String actualArm;

  /**
  * Description: "Extensions for actualArm"
  */
  protected transient Element _actualArm;

  /**
  * Description: "A record of the patient's informed agreement to participate in the study."
  */
  protected Reference consent;

  public ResearchSubject() {
  }

  public ResearchSubject(ResearchSubjectModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getStudy() && !o.getStudy().isEmpty()) {
      this.study = new Reference(o.getStudy().get(0));
    }
    if (null != o.getIndividual() && !o.getIndividual().isEmpty()) {
      this.individual = new Reference(o.getIndividual().get(0));
    }
    if (null != o.getAssignedArm()) {
      this.assignedArm = o.getAssignedArm();
    }
    if (null != o.getActualArm()) {
      this.actualArm = o.getActualArm();
    }
    if (null != o.getConsent() && !o.getConsent().isEmpty()) {
      this.consent = new Reference(o.getConsent().get(0));
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
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
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setStudy( Reference value) {
    this.study = value;
  }
  public Reference getStudy() {
    return this.study;
  }
  public void setIndividual( Reference value) {
    this.individual = value;
  }
  public Reference getIndividual() {
    return this.individual;
  }
  public void setAssignedArm( String value) {
    this.assignedArm = value;
  }
  public String getAssignedArm() {
    return this.assignedArm;
  }
  public void set_assignedArm( Element value) {
    this._assignedArm = value;
  }
  public Element get_assignedArm() {
    return this._assignedArm;
  }
  public void setActualArm( String value) {
    this.actualArm = value;
  }
  public String getActualArm() {
    return this.actualArm;
  }
  public void set_actualArm( Element value) {
    this._actualArm = value;
  }
  public Element get_actualArm() {
    return this._actualArm;
  }
  public void setConsent( Reference value) {
    this.consent = value;
  }
  public Reference getConsent() {
    return this.consent;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ResearchSubject]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.study != null) builder.append("study" + "->" + this.study.toString() + "\n"); 
     if(this.individual != null) builder.append("individual" + "->" + this.individual.toString() + "\n"); 
     if(this.assignedArm != null) builder.append("assignedArm" + "->" + this.assignedArm.toString() + "\n"); 
     if(this._assignedArm != null) builder.append("_assignedArm" + "->" + this._assignedArm.toString() + "\n"); 
     if(this.actualArm != null) builder.append("actualArm" + "->" + this.actualArm.toString() + "\n"); 
     if(this._actualArm != null) builder.append("_actualArm" + "->" + this._actualArm.toString() + "\n"); 
     if(this.consent != null) builder.append("consent" + "->" + this.consent.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	ResearchSubject,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ResearchSubject" : { return ResearchSubject.toString(); }
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
  	candidate,
  	enrolled,
  	active,
  	suspended,
  	withdrawn,
  	completed,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "candidate" : { return candidate.toString(); }
  			case "enrolled" : { return enrolled.toString(); }
  			case "active" : { return active.toString(); }
  			case "suspended" : { return suspended.toString(); }
  			case "withdrawn" : { return withdrawn.toString(); }
  			case "completed" : { return completed.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}