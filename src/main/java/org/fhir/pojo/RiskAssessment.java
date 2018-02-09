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
import org.fhir.entity.RiskAssessmentModel;
import com.google.gson.GsonBuilder;

/**
* "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
*/
public class RiskAssessment  {
  /**
  * Description: "This is a RiskAssessment resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Business identifier assigned to the risk assessment."
  */
  private Identifier identifier;

  /**
  * Description: "A reference to the request that is fulfilled by this risk assessment."
  */
  private Reference basedOn;

  /**
  * Description: "A reference to a resource that this risk assessment is part of, such as a Procedure."
  */
  private Reference parent;

  /**
  * Description: "The status of the RiskAssessment, using the same statuses as an Observation."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The algorithm, process or mechanism used to evaluate the risk."
  */
  private CodeableConcept method;

  /**
  * Description: "The type of the risk assessment performed."
  */
  private CodeableConcept code;

  /**
  * Description: "The patient or group the risk assessment applies to."
  */
  private Reference subject;

  /**
  * Description: "The encounter where the assessment was performed."
  */
  private Reference context;

  /**
  * Description: "The date (and possibly time) the risk assessment was performed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  private transient Element _occurrenceDateTime;

  /**
  * Description: "The date (and possibly time) the risk assessment was performed."
  */
  private Period occurrencePeriod;

  /**
  * Description: "For assessments or prognosis specific to a particular condition, indicates the condition being assessed."
  */
  private Reference condition;

  /**
  * Description: "The provider or software application that performed the assessment."
  */
  private Reference performer;

  /**
  * Description: "The reason the risk assessment was performed."
  */
  private CodeableConcept reasonCodeableConcept;

  /**
  * Description: "The reason the risk assessment was performed."
  */
  private Reference reasonReference;

  /**
  * Description: "Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.)."
  */
  private java.util.List<Reference> basis = new java.util.ArrayList<>();

  /**
  * Description: "Describes the expected outcome for the subject."
  */
  private java.util.List<RiskAssessmentPrediction> prediction = new java.util.ArrayList<>();

  /**
  * Description: "A description of the steps that might be taken to reduce the identified risk(s)."
  */
  private String mitigation;

  /**
  * Description: "Extensions for mitigation"
  */
  private transient Element _mitigation;

  /**
  * Description: "Additional comments about the risk assessment."
  */
  private String comment;

  /**
  * Description: "Extensions for comment"
  */
  private transient Element _comment;

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

  public RiskAssessment() {
  }

  public RiskAssessment(RiskAssessmentModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getBasedOn()) {
        this.basedOn = new Reference(o.getBasedOn());
        this.basedOn.setId(this.getId());
      }

      if (null != o.getParent()) {
        this.parent = new Reference(o.getParent());
        this.parent.setId(this.getId());
      }

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.method = CodeableConcept.fromJson(o.getMethod());
      this.code = CodeableConcept.fromJson(o.getCode());
      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      if (null != o.getContext()) {
        this.context = new Reference(o.getContext());
        this.context.setId(this.getId());
      }

      if (null != o.getOccurrenceDateTime()) {
        this.occurrenceDateTime = new String(o.getOccurrenceDateTime());
      }

      this.occurrencePeriod = Period.fromJson(o.getOccurrencePeriod());
      if (null != o.getCondition()) {
        this.condition = new Reference(o.getCondition());
        this.condition.setId(this.getId());
      }

      if (null != o.getPerformer()) {
        this.performer = new Reference(o.getPerformer());
        this.performer.setId(this.getId());
      }

      this.reasonCodeableConcept = CodeableConcept.fromJson(o.getReasonCodeableConcept());
      if (null != o.getReasonReference()) {
        this.reasonReference = new Reference(o.getReasonReference());
        this.reasonReference.setId(this.getId());
      }

      this.basis = Reference.fromArray(o.getBasis());

      this.prediction = RiskAssessmentPrediction.fromArray(o.getPrediction());

      if (null != o.getMitigation()) {
        this.mitigation = new String(o.getMitigation());
      }

      if (null != o.getComment()) {
        this.comment = new String(o.getComment());
      }

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
  public void setBasedOn( Reference value) {
    this.basedOn = value;
  }
  public Reference getBasedOn() {
    return this.basedOn;
  }
  public void setParent( Reference value) {
    this.parent = value;
  }
  public Reference getParent() {
    return this.parent;
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
  public void setMethod( CodeableConcept value) {
    this.method = value;
  }
  public CodeableConcept getMethod() {
    return this.method;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void set_occurrenceDateTime( Element value) {
    this._occurrenceDateTime = value;
  }
  public Element get_occurrenceDateTime() {
    return this._occurrenceDateTime;
  }
  public void setOccurrencePeriod( Period value) {
    this.occurrencePeriod = value;
  }
  public Period getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setCondition( Reference value) {
    this.condition = value;
  }
  public Reference getCondition() {
    return this.condition;
  }
  public void setPerformer( Reference value) {
    this.performer = value;
  }
  public Reference getPerformer() {
    return this.performer;
  }
  public void setReasonCodeableConcept( CodeableConcept value) {
    this.reasonCodeableConcept = value;
  }
  public CodeableConcept getReasonCodeableConcept() {
    return this.reasonCodeableConcept;
  }
  public void setReasonReference( Reference value) {
    this.reasonReference = value;
  }
  public Reference getReasonReference() {
    return this.reasonReference;
  }
  public void setBasis( java.util.List<Reference> value) {
    this.basis = value;
  }
  public java.util.List<Reference> getBasis() {
    return this.basis;
  }
  public void setPrediction( java.util.List<RiskAssessmentPrediction> value) {
    this.prediction = value;
  }
  public java.util.List<RiskAssessmentPrediction> getPrediction() {
    return this.prediction;
  }
  public void setMitigation( String value) {
    this.mitigation = value;
  }
  public String getMitigation() {
    return this.mitigation;
  }
  public void set_mitigation( Element value) {
    this._mitigation = value;
  }
  public Element get_mitigation() {
    return this._mitigation;
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
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("parent" + "[" + String.valueOf(this.parent) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("method" + "[" + String.valueOf(this.method) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("_occurrenceDateTime" + "[" + String.valueOf(this._occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("condition" + "[" + String.valueOf(this.condition) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("reasonCodeableConcept" + "[" + String.valueOf(this.reasonCodeableConcept) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("basis" + "[" + String.valueOf(this.basis) + "]\n"); 
     builder.append("prediction" + "[" + String.valueOf(this.prediction) + "]\n"); 
     builder.append("mitigation" + "[" + String.valueOf(this.mitigation) + "]\n"); 
     builder.append("_mitigation" + "[" + String.valueOf(this._mitigation) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
     builder.append("_comment" + "[" + String.valueOf(this._comment) + "]\n"); 
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
  	RiskAssessment,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "RiskAssessment" : { return RiskAssessment.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<RiskAssessment> fromArray(java.util.List<RiskAssessmentModel> list) {
    return (java.util.List<RiskAssessment>)list.stream()
      .map(model -> new RiskAssessment(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<RiskAssessmentModel> toModelArray(java.util.List<RiskAssessment> list) {
    return (java.util.List<RiskAssessmentModel>)list.stream()
      .map(model -> new RiskAssessmentModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static RiskAssessment fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, RiskAssessment.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(RiskAssessment o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<RiskAssessment> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}