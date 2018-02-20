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
import org.fhir.entity.DetectedIssueModel;
import com.google.gson.GsonBuilder;

/**
* "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc."
*/
public class DetectedIssue  extends DomainResource  {
  /**
  * Description: "This is a DetectedIssue resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Business identifier associated with the detected issue record."
  */
  protected Identifier identifier;

  /**
  * Description: "Indicates the status of the detected issue."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Identifies the general type of issue identified."
  */
  protected CodeableConcept category;

  /**
  * Description: "Indicates the degree of importance associated with the identified issue based on the potential impact on the patient."
  */
  protected String severity;

  /**
  * Description: "Extensions for severity"
  */
  protected transient Element _severity;

  /**
  * Description: "Indicates the patient whose record the detected issue is associated with."
  */
  protected Reference patient;

  /**
  * Description: "The date or date-time when the detected issue was initially identified."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review."
  */
  protected Reference author;

  /**
  * Description: "Indicates the resource representing the current activity or proposed activity that is potentially problematic."
  */
  protected java.util.List<Reference> implicated = new java.util.ArrayList<>();

  /**
  * Description: "A textual explanation of the detected issue."
  */
  protected String detail;

  /**
  * Description: "Extensions for detail"
  */
  protected transient Element _detail;

  /**
  * Description: "The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified."
  */
  protected String reference;

  /**
  * Description: "Extensions for reference"
  */
  protected transient Element _reference;

  /**
  * Description: "Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action."
  */
  protected java.util.List<DetectedIssueMitigation> mitigation = new java.util.ArrayList<>();

  public DetectedIssue() {
  }

  public DetectedIssue(DetectedIssueModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
      this.category = new CodeableConcept(o.getCategory().get(0));
    }
    if (null != o.getSeverity()) {
      this.severity = o.getSeverity();
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
      this.author = new Reference(o.getAuthor().get(0));
    }
    if (null != o.getImplicated() && !o.getImplicated().isEmpty()) {
    	this.implicated = ReferenceHelper.fromArray2Array(o.getImplicated());
    }
    if (null != o.getDetail()) {
      this.detail = o.getDetail();
    }
    if (null != o.getReference()) {
      this.reference = o.getReference();
    }
    if (null != o.getMitigation() && !o.getMitigation().isEmpty()) {
    	this.mitigation = DetectedIssueMitigationHelper.fromArray2Array(o.getMitigation());
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
  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setSeverity( String value) {
    this.severity = SeverityEnum.fromCode(value);
  }
  public String getSeverity() {
    return this.severity;
  }
  public void set_severity( Element value) {
    this._severity = value;
  }
  public Element get_severity() {
    return this._severity;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
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
  public void setAuthor( Reference value) {
    this.author = value;
  }
  public Reference getAuthor() {
    return this.author;
  }
  public void setImplicated( java.util.List<Reference> value) {
    this.implicated = value;
  }
  public java.util.List<Reference> getImplicated() {
    return this.implicated;
  }
  public void setDetail( String value) {
    this.detail = value;
  }
  public String getDetail() {
    return this.detail;
  }
  public void set_detail( Element value) {
    this._detail = value;
  }
  public Element get_detail() {
    return this._detail;
  }
  public void setReference( String value) {
    this.reference = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void set_reference( Element value) {
    this._reference = value;
  }
  public Element get_reference() {
    return this._reference;
  }
  public void setMitigation( java.util.List<DetectedIssueMitigation> value) {
    this.mitigation = value;
  }
  public java.util.List<DetectedIssueMitigation> getMitigation() {
    return this.mitigation;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DetectedIssue]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.severity != null) builder.append("severity" + "->" + this.severity.toString() + "\n"); 
     if(this._severity != null) builder.append("_severity" + "->" + this._severity.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.author != null) builder.append("author" + "->" + this.author.toString() + "\n"); 
     if(this.implicated != null) builder.append("implicated" + "->" + this.implicated.toString() + "\n"); 
     if(this.detail != null) builder.append("detail" + "->" + this.detail.toString() + "\n"); 
     if(this._detail != null) builder.append("_detail" + "->" + this._detail.toString() + "\n"); 
     if(this.reference != null) builder.append("reference" + "->" + this.reference.toString() + "\n"); 
     if(this._reference != null) builder.append("_reference" + "->" + this._reference.toString() + "\n"); 
     if(this.mitigation != null) builder.append("mitigation" + "->" + this.mitigation.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	DetectedIssue,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "DetectedIssue" : { return DetectedIssue.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum SeverityEnum {
  	high,
  	moderate,
  	low,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "high" : { return high.toString(); }
  			case "moderate" : { return moderate.toString(); }
  			case "low" : { return low.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}