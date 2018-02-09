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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;

/**
* "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information."
*/
@Entity
@Table(name="endpoint")
public class EndpointModel  {
  /**
  * Description: "This is a Endpoint resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifier for the organization that is used to identify the endpoint across multiple disparate systems."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "active | suspended | error | off | test."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A coded value that represents the technical details of the usage of this endpoint, such as what WSDLs should be used in what way. (e.g. XDS.b/DICOM/cds-hook)."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"connectionType\"", length = 16777215)
  private String connectionType;

  /**
  * Description: "A friendly name that this endpoint can be referred to with."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "The organization that manages this endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data)."
  */
  @javax.persistence.Basic
  @Column(name="\"managingorganization_id\"")
  private String managingorganization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`managingorganization_id`", insertable=false, updatable=false)
  private ReferenceModel managingOrganization;

  /**
  * Description: "Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting."
  * Actual type: Array of ContactPoint-> List<ContactPoint>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contact\"", length = 16777215)
  private String contact;

  /**
  * Description: "The interval during which the endpoint is expected to be operational."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "The payload type describes the acceptable content that can be communicated on the endpoint."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"payloadType\"", length = 16777215)
  private String payloadType;

  /**
  * Description: "The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType)."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"payloadMimeType\"", length = 16777215)
  private String payloadMimeType;

  /**
  * Description: "The uri that describes the actual end-point to connect to."
  */
  @javax.persistence.Basic
  @Column(name="\"address\"")
  private String address;

  /**
  * Description: "Additional headers / information to send as part of the notification."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"header\"", length = 16777215)
  private String header;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;


  public EndpointModel() {
  }

  public EndpointModel(Endpoint o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.connectionType = Coding.toJson(o.getConnectionType());
      this.name = o.getName();

      if (null != o.getManagingOrganization()) {
      	this.managingorganization_id = "managingOrganization" + this.getId();
        this.managingOrganization = new ReferenceModel(o.getManagingOrganization());
        this.managingOrganization.setId(this.managingorganization_id);
        this.managingOrganization.parent_id = this.managingOrganization.getId();
      }

      this.contact = ContactPoint.toJson(o.getContact());
      this.period = Period.toJson(o.getPeriod());
      this.payloadType = CodeableConcept.toJson(o.getPayloadType());
      this.payloadMimeType = org.fhir.utils.JsonUtils.write2String(o.getPayloadMimeType());

      this.address = o.getAddress();

      this.header = org.fhir.utils.JsonUtils.write2String(o.getHeader());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setConnectionType( String value) {
    this.connectionType = value;
  }
  public String getConnectionType() {
    return this.connectionType;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setManagingOrganization( ReferenceModel value) {
    this.managingOrganization = value;
  }
  public ReferenceModel getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setContact( String value) {
    this.contact = value;
  }
  public String getContact() {
    return this.contact;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPayloadType( String value) {
    this.payloadType = value;
  }
  public String getPayloadType() {
    return this.payloadType;
  }
  public void setPayloadMimeType( String value) {
    this.payloadMimeType = value;
  }
  public String getPayloadMimeType() {
    return this.payloadMimeType;
  }
  public void setAddress( String value) {
    this.address = value;
  }
  public String getAddress() {
    return this.address;
  }
  public void setHeader( String value) {
    this.header = value;
  }
  public String getHeader() {
    return this.header;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("connectionType" + "[" + String.valueOf(this.connectionType) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("managingOrganization" + "[" + String.valueOf(this.managingOrganization) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("payloadType" + "[" + String.valueOf(this.payloadType) + "]\n"); 
     builder.append("payloadMimeType" + "[" + String.valueOf(this.payloadMimeType) + "]\n"); 
     builder.append("address" + "[" + String.valueOf(this.address) + "]\n"); 
     builder.append("header" + "[" + String.valueOf(this.header) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}