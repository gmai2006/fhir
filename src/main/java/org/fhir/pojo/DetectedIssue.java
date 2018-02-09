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
public class DetectedIssue  {
  /**
  * Description: "This is a DetectedIssue resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Business identifier associated with the detected issue record."
  */
  private Identifier identifier;

  /**
  * Description: "Indicates the status of the detected issue."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Identifies the general type of issue identified."
  */
  private CodeableConcept category;

  /**
  * Description: "Indicates the degree of importance associated with the identified issue based on the potential impact on the patient."
  */
  private String severity;

  /**
  * Description: "Extensions for severity"
  */
  private transient Element _severity;

  /**
  * Description: "Indicates the patient whose record the detected issue is associated with."
  */
  private Reference patient;

  /**
  * Description: "The date or date-time when the detected issue was initially identified."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String date;

  /**
  * Description: "Extensions for date"
  */
  private transient Element _date;

  /**
  * Description: "Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review."
  */
  private Reference author;

  /**
  * Description: "Indicates the resource representing the current activity or proposed activity that is potentially problematic."
  */
  private java.util.List<Reference> implicated = new java.util.ArrayList<>();

  /**
  * Description: "A textual explanation of the detected issue."
  */
  private String detail;

  /**
  * Description: "Extensions for detail"
  */
  private transient Element _detail;

  /**
  * Description: "The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified."
  */
  private String reference;

  /**
  * Description: "Extensions for reference"
  */
  private transient Element _reference;

  /**
  * Description: "Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action."
  */
  private java.util.List<DetectedIssueMitigation> mitigation = new java.util.ArrayList<>();

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

  public DetectedIssue() {
  }

  public DetectedIssue(DetectedIssueModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.category = CodeableConcept.fromJson(o.getCategory());
      if (null != o.getSeverity()) {
        this.severity = new String(o.getSeverity());
      }

      if (null != o.getPatient()) {
        this.patient = new Reference(o.getPatient());
        this.patient.setId(this.getId());
      }

      if (null != o.getDate()) {
        this.date = new String(o.getDate());
      }

      if (null != o.getAuthor()) {
        this.author = new Reference(o.getAuthor());
        this.author.setId(this.getId());
      }

      this.implicated = Reference.fromArray(o.getImplicated());

      if (null != o.getDetail()) {
        this.detail = new String(o.getDetail());
      }

      if (null != o.getReference()) {
        this.reference = new String(o.getReference());
      }

      this.mitigation = DetectedIssueMitigation.fromArray(o.getMitigation());

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
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("severity" + "[" + String.valueOf(this.severity) + "]\n"); 
     builder.append("_severity" + "[" + String.valueOf(this._severity) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("date" + "[" + String.valueOf(this.date) + "]\n"); 
     builder.append("_date" + "[" + String.valueOf(this._date) + "]\n"); 
     builder.append("author" + "[" + String.valueOf(this.author) + "]\n"); 
     builder.append("implicated" + "[" + String.valueOf(this.implicated) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("_detail" + "[" + String.valueOf(this._detail) + "]\n"); 
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("_reference" + "[" + String.valueOf(this._reference) + "]\n"); 
     builder.append("mitigation" + "[" + String.valueOf(this.mitigation) + "]\n"); 
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

  public static java.util.List<DetectedIssue> fromArray(java.util.List<DetectedIssueModel> list) {
    return (java.util.List<DetectedIssue>)list.stream()
      .map(model -> new DetectedIssue(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DetectedIssueModel> toModelArray(java.util.List<DetectedIssue> list) {
    return (java.util.List<DetectedIssueModel>)list.stream()
      .map(model -> new DetectedIssueModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static DetectedIssue fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DetectedIssue.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DetectedIssue o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DetectedIssue> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}