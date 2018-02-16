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
public class GuidanceResponse  extends DomainResource  {
  /**
  * Description: "This is a GuidanceResponse resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The id of the request associated with this response. If an id was given as part of the request, it will be reproduced here to enable the requester to more easily identify the response in a multi-request scenario."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String requestId;

  /**
  * Description: "Extensions for requestId"
  */
  protected transient Element _requestId;

  /**
  * Description: "Allows a service to provide a unique, business identifier for the response."
  */
  protected Identifier identifier;

  /**
  * Description: "A reference to the knowledge module that was invoked."
  */
  @javax.validation.constraints.NotNull
  protected Reference module;

  /**
  * Description: "The status of the response. If the evaluation is completed successfully, the status will indicate success. However, in order to complete the evaluation, the engine may require more information. In this case, the status will be data-required, and the response will contain a description of the additional required information. If the evaluation completed successfully, but the engine determines that a potentially more accurate response could be provided if more data was available, the status will be data-requested, and the response will contain a description of the additional requested information."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The patient for which the request was processed."
  */
  protected Reference subject;

  /**
  * Description: "Allows the context of the guidance response to be provided if available. In a service context, this would likely be unavailable."
  */
  protected Reference context;

  /**
  * Description: "Indicates when the guidance response was processed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  protected transient Element _occurrenceDateTime;

  /**
  * Description: "Provides a reference to the device that performed the guidance."
  */
  protected Reference performer;

  /**
  * Description: "Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response."
  */
  protected CodeableConcept reasonCodeableConcept;

  /**
  * Description: "Indicates the reason the request was initiated. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response."
  */
  protected Reference reasonReference;

  /**
  * Description: "Provides a mechanism to communicate additional information about the response."
  */
  protected java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the request, the engine may produce informational or warning messages. These messages will be provided by this element."
  */
  protected java.util.List<Reference> evaluationMessage = new java.util.ArrayList<>();

  /**
  * Description: "The output parameters of the evaluation, if any. Many modules will result in the return of specific resources such as procedure or communication requests that are returned as part of the operation result. However, modules may define specific outputs that would be returned as the result of the evaluation, and these would be returned in this element."
  */
  protected Reference outputParameters;

  /**
  * Description: "The actions, if any, produced by the evaluation of the artifact."
  */
  protected Reference result;

  /**
  * Description: "If the evaluation could not be completed due to lack of information, or additional information would potentially result in a more accurate response, this element will a description of the data required in order to proceed with the evaluation. A subsequent request to the service should include this data."
  */
  protected java.util.List<DataRequirement> dataRequirement = new java.util.ArrayList<>();

  public GuidanceResponse() {
  }

  public GuidanceResponse(GuidanceResponseModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getRequestId()) {
      this.requestId = o.getRequestId();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getModule() && !o.getModule().isEmpty()) {
      this.module = new Reference(o.getModule().get(0));
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getOccurrenceDateTime()) {
      this.occurrenceDateTime = o.getOccurrenceDateTime();
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
      this.performer = new Reference(o.getPerformer().get(0));
    }
    this.reasonCodeableConcept = CodeableConceptHelper.fromJson(o.getReasonCodeableConcept());
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
      this.reasonReference = new Reference(o.getReasonReference().get(0));
    }
    if (null != o.getEvaluationMessage() && !o.getEvaluationMessage().isEmpty()) {
    	this.evaluationMessage = ReferenceHelper.fromArray2Array(o.getEvaluationMessage());
    }
    if (null != o.getOutputParameters() && !o.getOutputParameters().isEmpty()) {
      this.outputParameters = new Reference(o.getOutputParameters().get(0));
    }
    if (null != o.getResult() && !o.getResult().isEmpty()) {
      this.result = new Reference(o.getResult().get(0));
    }
    if (null != o.getDataRequirement() && !o.getDataRequirement().isEmpty()) {
    	this.dataRequirement = DataRequirementHelper.fromArray2Array(o.getDataRequirement());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[GuidanceResponse]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.requestId != null) builder.append("requestId" + "->" + this.requestId.toString() + "\n"); 
     if(this._requestId != null) builder.append("_requestId" + "->" + this._requestId.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.module != null) builder.append("module" + "->" + this.module.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.occurrenceDateTime != null) builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime.toString() + "\n"); 
     if(this._occurrenceDateTime != null) builder.append("_occurrenceDateTime" + "->" + this._occurrenceDateTime.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.reasonCodeableConcept != null) builder.append("reasonCodeableConcept" + "->" + this.reasonCodeableConcept.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.evaluationMessage != null) builder.append("evaluationMessage" + "->" + this.evaluationMessage.toString() + "\n"); 
     if(this.outputParameters != null) builder.append("outputParameters" + "->" + this.outputParameters.toString() + "\n"); 
     if(this.result != null) builder.append("result" + "->" + this.result.toString() + "\n"); 
     if(this.dataRequirement != null) builder.append("dataRequirement" + "->" + this.dataRequirement.toString() + "\n"); ;
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

}