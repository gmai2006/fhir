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
import org.fhir.entity.GuidanceResponseModel;
import com.google.gson.GsonBuilder;

/**
* "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken."
*/
public class GuidanceResponse  {
  /**
  * Description: "This is a GuidanceResponse resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The id of the request associated with this response. If an id was given as part of the request, it will be reproduced here to enable the requester to more easily identify the response in a multi-request scenario."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String requestId;

  /**
  * Description: "Extensions for requestId"
  */
  private transient Element _requestId;

  /**
  * Description: "Allows a service to provide a unique, business identifier for the response."
  */
  private Identifier identifier;

  /**
  * Description: "A reference to the knowledge module that was invoked."
  */
  @javax.validation.constraints.NotNull
  private Reference module;

  /**
  * Description: "The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The patient for which the request was processed."
  */
  private Reference subject;

  /**
  * Description: "Allows the context of the guidance response to be provided if available. In a service context, this would likely be unavailable."
  */
  private Reference context;

  /**
  * Description: "Indicates when the guidance response was processed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  private transient Element _occurrenceDateTime;

  /**
  * Description: "Provides a reference to the device that performed the guidance."
  */
  private Reference performer;

  /**
  * Description: "Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response."
  */
  private CodeableConcept reasonCodeableConcept;

  /**
  * Description: "Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response."
  */
  private Reference reasonReference;

  /**
  * Description: "Provides a mechanism to communicate additional information about the response."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element."
  */
  private java.util.List<Reference> evaluationMessage = new java.util.ArrayList<>();

  /**
  * Description: "The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element."
  */
  private Reference outputParameters;

  /**
  * Description: "The actions, if any, produced by the evaluation of the artifact."
  */
  private Reference result;

  /**
  * Description: "If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data."
  */
  private java.util.List<DataRequirement> dataRequirement = new java.util.ArrayList<>();

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

  public GuidanceResponse() {
  }

  public GuidanceResponse(GuidanceResponseModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      if (null != o.getRequestId()) {
        this.requestId = new String(o.getRequestId());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getModule()) {
        this.module = new Reference(o.getModule());
        this.module.setId(this.getId());
      }

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

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

      if (null != o.getPerformer()) {
        this.performer = new Reference(o.getPerformer());
        this.performer.setId(this.getId());
      }

      this.reasonCodeableConcept = CodeableConcept.fromJson(o.getReasonCodeableConcept());
      if (null != o.getReasonReference()) {
        this.reasonReference = new Reference(o.getReasonReference());
        this.reasonReference.setId(this.getId());
      }

      this.note = Annotation.fromArray(o.getNote());
      this.evaluationMessage = Reference.fromArray(o.getEvaluationMessage());

      if (null != o.getOutputParameters()) {
        this.outputParameters = new Reference(o.getOutputParameters());
        this.outputParameters.setId(this.getId());
      }

      if (null != o.getResult()) {
        this.result = new Reference(o.getResult());
        this.result.setId(this.getId());
      }

      this.dataRequirement = DataRequirement.fromArray(o.getDataRequirement());

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
  public void setRequestId( String value) {
    this.requestId = value;
  }
  public String getRequestId() {
    return this.requestId;
  }
  public void set_requestId( Element value) {
    this._requestId = value;
  }
  public Element get_requestId() {
    return this._requestId;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setModule( Reference value) {
    this.module = value;
  }
  public Reference getModule() {
    return this.module;
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
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setEvaluationMessage( java.util.List<Reference> value) {
    this.evaluationMessage = value;
  }
  public java.util.List<Reference> getEvaluationMessage() {
    return this.evaluationMessage;
  }
  public void setOutputParameters( Reference value) {
    this.outputParameters = value;
  }
  public Reference getOutputParameters() {
    return this.outputParameters;
  }
  public void setResult( Reference value) {
    this.result = value;
  }
  public Reference getResult() {
    return this.result;
  }
  public void setDataRequirement( java.util.List<DataRequirement> value) {
    this.dataRequirement = value;
  }
  public java.util.List<DataRequirement> getDataRequirement() {
    return this.dataRequirement;
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
     builder.append("requestId" + "[" + String.valueOf(this.requestId) + "]\n"); 
     builder.append("_requestId" + "[" + String.valueOf(this._requestId) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("module" + "[" + String.valueOf(this.module) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("_occurrenceDateTime" + "[" + String.valueOf(this._occurrenceDateTime) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("reasonCodeableConcept" + "[" + String.valueOf(this.reasonCodeableConcept) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("evaluationMessage" + "[" + String.valueOf(this.evaluationMessage) + "]\n"); 
     builder.append("outputParameters" + "[" + String.valueOf(this.outputParameters) + "]\n"); 
     builder.append("result" + "[" + String.valueOf(this.result) + "]\n"); 
     builder.append("dataRequirement" + "[" + String.valueOf(this.dataRequirement) + "]\n"); 
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
  	GuidanceResponse,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "GuidanceResponse" : { return GuidanceResponse.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	success,
  	datarequested,
  	datarequired,
  	inprogress,
  	failure,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "success" : { return success.toString(); }
  			case "datarequested" : { return datarequested.toString(); }
  			case "datarequired" : { return datarequired.toString(); }
  			case "inprogress" : { return inprogress.toString(); }
  			case "failure" : { return failure.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<GuidanceResponse> fromArray(java.util.List<GuidanceResponseModel> list) {
    return (java.util.List<GuidanceResponse>)list.stream()
      .map(model -> new GuidanceResponse(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<GuidanceResponseModel> toModelArray(java.util.List<GuidanceResponse> list) {
    return (java.util.List<GuidanceResponseModel>)list.stream()
      .map(model -> new GuidanceResponseModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static GuidanceResponse fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, GuidanceResponse.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(GuidanceResponse o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<GuidanceResponse> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}