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
import org.fhir.entity.EndpointModel;
import com.google.gson.GsonBuilder;

/**
* "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information."
*/
public class Endpoint  {
  /**
  * Description: "This is a Endpoint resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifier for the organization that is used to identify the endpoint across multiple disparate systems."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "active | suspended | error | off | test."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A coded value that represents the technical details of the usage of this endpoint, such as what WSDLs should be used in what way. (e.g. XDS.b/DICOM/cds-hook)."
  */
  @javax.validation.constraints.NotNull
  private Coding connectionType;

  /**
  * Description: "A friendly name that this endpoint can be referred to with."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "The organization that manages this endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data)."
  */
  private Reference managingOrganization;

  /**
  * Description: "Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting."
  */
  private java.util.List<ContactPoint> contact = new java.util.ArrayList<>();

  /**
  * Description: "The interval during which the endpoint is expected to be operational."
  */
  private Period period;

  /**
  * Description: "The payload type describes the acceptable content that can be communicated on the endpoint."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<CodeableConcept> payloadType = new java.util.ArrayList<>();

  /**
  * Description: "The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType)."
  */
  private java.util.List<String> payloadMimeType = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for payloadMimeType"
  */
  private transient java.util.List<Element> _payloadMimeType = new java.util.ArrayList<>();

  /**
  * Description: "The uri that describes the actual end-point to connect to."
  */
  private String address;

  /**
  * Description: "Extensions for address"
  */
  private transient Element _address;

  /**
  * Description: "Additional headers / information to send as part of the notification."
  */
  private java.util.List<String> header = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for header"
  */
  private transient java.util.List<Element> _header = new java.util.ArrayList<>();

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

  public Endpoint() {
  }

  public Endpoint(EndpointModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.connectionType = Coding.fromJson(o.getConnectionType());
      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getManagingOrganization()) {
        this.managingOrganization = new Reference(o.getManagingOrganization());
        this.managingOrganization.setId(this.getId());
      }

      this.contact = ContactPoint.fromArray(o.getContact());
      this.period = Period.fromJson(o.getPeriod());
      this.payloadType = CodeableConcept.fromArray(o.getPayloadType());
      this.payloadMimeType = org.fhir.utils.JsonUtils.json2Array(o.getPayloadMimeType());

      if (null != o.getAddress()) {
        this.address = new String(o.getAddress());
      }

      this.header = org.fhir.utils.JsonUtils.json2Array(o.getHeader());

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
  public void setConnectionType( Coding value) {
    this.connectionType = value;
  }
  public Coding getConnectionType() {
    return this.connectionType;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setManagingOrganization( Reference value) {
    this.managingOrganization = value;
  }
  public Reference getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setContact( java.util.List<ContactPoint> value) {
    this.contact = value;
  }
  public java.util.List<ContactPoint> getContact() {
    return this.contact;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setPayloadType( java.util.List<CodeableConcept> value) {
    this.payloadType = value;
  }
  public java.util.List<CodeableConcept> getPayloadType() {
    return this.payloadType;
  }
  public void setPayloadMimeType( java.util.List<String> value) {
    this.payloadMimeType = value;
  }
  public java.util.List<String> getPayloadMimeType() {
    return this.payloadMimeType;
  }
  public void set_payloadMimeType( java.util.List<Element> value) {
    this._payloadMimeType = value;
  }
  public java.util.List<Element> get_payloadMimeType() {
    return this._payloadMimeType;
  }
  public void setAddress( String value) {
    this.address = value;
  }
  public String getAddress() {
    return this.address;
  }
  public void set_address( Element value) {
    this._address = value;
  }
  public Element get_address() {
    return this._address;
  }
  public void setHeader( java.util.List<String> value) {
    this.header = value;
  }
  public java.util.List<String> getHeader() {
    return this.header;
  }
  public void set_header( java.util.List<Element> value) {
    this._header = value;
  }
  public java.util.List<Element> get_header() {
    return this._header;
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
     builder.append("connectionType" + "[" + String.valueOf(this.connectionType) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("managingOrganization" + "[" + String.valueOf(this.managingOrganization) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("payloadType" + "[" + String.valueOf(this.payloadType) + "]\n"); 
     builder.append("payloadMimeType" + "[" + String.valueOf(this.payloadMimeType) + "]\n"); 
     builder.append("_payloadMimeType" + "[" + String.valueOf(this._payloadMimeType) + "]\n"); 
     builder.append("address" + "[" + String.valueOf(this.address) + "]\n"); 
     builder.append("_address" + "[" + String.valueOf(this._address) + "]\n"); 
     builder.append("header" + "[" + String.valueOf(this.header) + "]\n"); 
     builder.append("_header" + "[" + String.valueOf(this._header) + "]\n"); 
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
  	Endpoint,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Endpoint" : { return Endpoint.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	suspended,
  	error,
  	off,
  	enteredinerror,
  	test,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "suspended" : { return suspended.toString(); }
  			case "error" : { return error.toString(); }
  			case "off" : { return off.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "test" : { return test.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Endpoint> fromArray(java.util.List<EndpointModel> list) {
    return (java.util.List<Endpoint>)list.stream()
      .map(model -> new Endpoint(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<EndpointModel> toModelArray(java.util.List<Endpoint> list) {
    return (java.util.List<EndpointModel>)list.stream()
      .map(model -> new EndpointModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Endpoint fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Endpoint.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Endpoint o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Endpoint> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}