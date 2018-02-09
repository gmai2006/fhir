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
import org.fhir.entity.EligibilityResponseModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides eligibility and plan details from the processing of an Eligibility resource."
*/
public class EligibilityResponse  {
  /**
  * Description: "This is a EligibilityResponse resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The Response business identifier."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The date when the enclosed suite of services were performed or completed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String created;

  /**
  * Description: "Extensions for created"
  */
  private transient Element _created;

  /**
  * Description: "The practitioner who is responsible for the services rendered to the patient."
  */
  private Reference requestProvider;

  /**
  * Description: "The organization which is responsible for the services rendered to the patient."
  */
  private Reference requestOrganization;

  /**
  * Description: "Original request resource reference."
  */
  private Reference request;

  /**
  * Description: "Transaction status: error, complete."
  */
  private CodeableConcept outcome;

  /**
  * Description: "A description of the status of the adjudication."
  */
  private String disposition;

  /**
  * Description: "Extensions for disposition"
  */
  private transient Element _disposition;

  /**
  * Description: "The Insurer who produced this adjudicated response."
  */
  private Reference insurer;

  /**
  * Description: "Flag indicating if the coverage provided is inforce currently  if no service date(s) specified or for the whole duration of the service dates."
  */
  private Boolean inforce;

  /**
  * Description: "Extensions for inforce"
  */
  private transient Element _inforce;

  /**
  * Description: "The insurer may provide both the details for the requested coverage as well as details for additional coverages known to the insurer."
  */
  private java.util.List<EligibilityResponseInsurance> insurance = new java.util.ArrayList<>();

  /**
  * Description: "The form to be used for printing the content."
  */
  private CodeableConcept form;

  /**
  * Description: "Mutually exclusive with Services Provided (Item)."
  */
  private java.util.List<EligibilityResponseError> error = new java.util.ArrayList<>();

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

  public EligibilityResponse() {
  }

  public EligibilityResponse(EligibilityResponseModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getCreated()) {
        this.created = new String(o.getCreated());
      }

      if (null != o.getRequestProvider()) {
        this.requestProvider = new Reference(o.getRequestProvider());
        this.requestProvider.setId(this.getId());
      }

      if (null != o.getRequestOrganization()) {
        this.requestOrganization = new Reference(o.getRequestOrganization());
        this.requestOrganization.setId(this.getId());
      }

      if (null != o.getRequest()) {
        this.request = new Reference(o.getRequest());
        this.request.setId(this.getId());
      }

      this.outcome = CodeableConcept.fromJson(o.getOutcome());
      if (null != o.getDisposition()) {
        this.disposition = new String(o.getDisposition());
      }

      if (null != o.getInsurer()) {
        this.insurer = new Reference(o.getInsurer());
        this.insurer.setId(this.getId());
      }

      if (null != o.getInforce()) {
        this.inforce = new Boolean(o.getInforce());
      }

      this.insurance = EligibilityResponseInsurance.fromArray(o.getInsurance());

      this.form = CodeableConcept.fromJson(o.getForm());
      this.error = EligibilityResponseError.fromArray(o.getError());

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
  public void setRequestProvider( Reference value) {
    this.requestProvider = value;
  }
  public Reference getRequestProvider() {
    return this.requestProvider;
  }
  public void setRequestOrganization( Reference value) {
    this.requestOrganization = value;
  }
  public Reference getRequestOrganization() {
    return this.requestOrganization;
  }
  public void setRequest( Reference value) {
    this.request = value;
  }
  public Reference getRequest() {
    return this.request;
  }
  public void setOutcome( CodeableConcept value) {
    this.outcome = value;
  }
  public CodeableConcept getOutcome() {
    return this.outcome;
  }
  public void setDisposition( String value) {
    this.disposition = value;
  }
  public String getDisposition() {
    return this.disposition;
  }
  public void set_disposition( Element value) {
    this._disposition = value;
  }
  public Element get_disposition() {
    return this._disposition;
  }
  public void setInsurer( Reference value) {
    this.insurer = value;
  }
  public Reference getInsurer() {
    return this.insurer;
  }
  public void setInforce( Boolean value) {
    this.inforce = value;
  }
  public Boolean getInforce() {
    return this.inforce;
  }
  public void set_inforce( Element value) {
    this._inforce = value;
  }
  public Element get_inforce() {
    return this._inforce;
  }
  public void setInsurance( java.util.List<EligibilityResponseInsurance> value) {
    this.insurance = value;
  }
  public java.util.List<EligibilityResponseInsurance> getInsurance() {
    return this.insurance;
  }
  public void setForm( CodeableConcept value) {
    this.form = value;
  }
  public CodeableConcept getForm() {
    return this.form;
  }
  public void setError( java.util.List<EligibilityResponseError> value) {
    this.error = value;
  }
  public java.util.List<EligibilityResponseError> getError() {
    return this.error;
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
     builder.append("created" + "[" + String.valueOf(this.created) + "]\n"); 
     builder.append("_created" + "[" + String.valueOf(this._created) + "]\n"); 
     builder.append("requestProvider" + "[" + String.valueOf(this.requestProvider) + "]\n"); 
     builder.append("requestOrganization" + "[" + String.valueOf(this.requestOrganization) + "]\n"); 
     builder.append("request" + "[" + String.valueOf(this.request) + "]\n"); 
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("disposition" + "[" + String.valueOf(this.disposition) + "]\n"); 
     builder.append("_disposition" + "[" + String.valueOf(this._disposition) + "]\n"); 
     builder.append("insurer" + "[" + String.valueOf(this.insurer) + "]\n"); 
     builder.append("inforce" + "[" + String.valueOf(this.inforce) + "]\n"); 
     builder.append("_inforce" + "[" + String.valueOf(this._inforce) + "]\n"); 
     builder.append("insurance" + "[" + String.valueOf(this.insurance) + "]\n"); 
     builder.append("form" + "[" + String.valueOf(this.form) + "]\n"); 
     builder.append("error" + "[" + String.valueOf(this.error) + "]\n"); 
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
  	EligibilityResponse,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "EligibilityResponse" : { return EligibilityResponse.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<EligibilityResponse> fromArray(java.util.List<EligibilityResponseModel> list) {
    return (java.util.List<EligibilityResponse>)list.stream()
      .map(model -> new EligibilityResponse(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<EligibilityResponseModel> toModelArray(java.util.List<EligibilityResponse> list) {
    return (java.util.List<EligibilityResponseModel>)list.stream()
      .map(model -> new EligibilityResponseModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static EligibilityResponse fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, EligibilityResponse.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(EligibilityResponse o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<EligibilityResponse> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}