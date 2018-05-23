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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated."
*/
@Entity
@Table(name="location")
public class LocationModel  implements Serializable {
	private static final long serialVersionUID = 151967883156290504L;
  /**
  * Description: "This is a Location resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Unique code or number identifying the location to its users."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "The Operational status covers operation values most relevant to beds (but can also apply to rooms/units/chair/etc such as an isolation unit/dialisys chair). This typically covers concepts such as contamination, housekeeping and other activities like maintenance."
  */
  @javax.persistence.Basic
  @Column(name="\"operationalstatus_id\"")
  private String operationalstatus_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="operationalstatus_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> operationalStatus;

  /**
  * Description: "Name of the location as used by humans. Does not need to be unique."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "A list of alternate names that the location is known as, or was known as in the past."
  */
  @javax.persistence.Basic
  @Column(name="\"alias\"")
  private String alias;

  /**
  * Description: "Description of the Location, which helps in finding or referencing the place."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Indicates whether a resource instance represents a specific location or a class of locations."
  */
  @javax.persistence.Basic
  @Column(name="\"mode\"")
  private String mode;

  /**
  * Description: "Indicates the type of function performed at the location."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"telecom\"", length = 16777215)
  private String telecom;

  /**
  * Description: "Physical location."
  */
  @javax.persistence.Basic
  @Column(name="\"address_id\"")
  private String address_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="address_id", insertable=false, updatable=false)
  private java.util.List<AddressModel> address;

  /**
  * Description: "Physical form of the location, e.g. building, room, vehicle, road."
  */
  @javax.persistence.Basic
  @Column(name="\"physicaltype_id\"")
  private String physicaltype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="physicaltype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> physicalType;

  /**
  * Description: "The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML)."
  */
  @javax.persistence.Basic
  @Column(name="\"position_id\"")
  private String position_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="position_id", insertable=false, updatable=false)
  private java.util.List<LocationPositionModel> position;

  /**
  * Description: "The organization responsible for the provisioning and upkeep of the location."
  */
  @javax.persistence.Basic
  @Column(name="\"managingorganization_id\"")
  private String managingorganization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="managingorganization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> managingOrganization;

  /**
  * Description: "Another Location which this Location is physically part of."
  */
  @javax.persistence.Basic
  @Column(name="\"partof_id\"")
  private String partof_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="partof_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf;

  /**
  * Description: "Technical endpoints providing access to services operated for the location."
  */
  @javax.persistence.Basic
  @Column(name="\"endpoint_id\"")
  private String endpoint_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="endpoint_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> endpoint;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

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

  public LocationModel() {
  }

  public LocationModel(Location o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getOperationalStatus() ) {
    	this.operationalstatus_id = "operationalstatus" + this.id;
    	this.operationalStatus = CodingHelper.toModel(o.getOperationalStatus(), this.operationalstatus_id);
    }
    this.name = o.getName();
    this.alias = org.fhir.utils.JsonUtils.toJson(o.getAlias());
    this.description = o.getDescription();
    this.mode = o.getMode();
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getTelecom()) {
    	this.telecom = JsonUtils.toJson(o.getTelecom());
    }
    if (null != o.getAddress() ) {
    	this.address_id = "address" + this.id;
    	this.address = AddressHelper.toModel(o.getAddress(), this.address_id);
    }
    if (null != o.getPhysicalType() ) {
    	this.physicaltype_id = "physicaltype" + this.id;
    	this.physicalType = CodeableConceptHelper.toModel(o.getPhysicalType(), this.physicaltype_id);
    }
    if (null != o.getPosition() ) {
    	this.position_id = "position" + this.id;
    	this.position = LocationPositionHelper.toModel(o.getPosition(), this.position_id);
    }
    if (null != o.getManagingOrganization() ) {
    	this.managingorganization_id = "managingorganization" + this.id;
    	this.managingOrganization = ReferenceHelper.toModel(o.getManagingOrganization(), this.managingorganization_id);
    }
    if (null != o.getPartOf() ) {
    	this.partof_id = "partof" + this.id;
    	this.partOf = ReferenceHelper.toModel(o.getPartOf(), this.partof_id);
    }
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint_id = "endpoint" + this.id;
    	this.endpoint = ReferenceHelper.toModelFromArray(o.getEndpoint(), this.endpoint_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<CodingModel> getOperationalStatus() {
    return this.operationalStatus;
  }
  public void setOperationalStatus( java.util.List<CodingModel> value) {
    this.operationalStatus = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getAlias() {
    return this.alias;
  }
  public void setAlias( String value) {
    this.alias = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getMode() {
    return this.mode;
  }
  public void setMode( String value) {
    this.mode = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public String getTelecom() {
    return this.telecom;
  }
  public void setTelecom( String value) {
    this.telecom = value;
  }
  public java.util.List<AddressModel> getAddress() {
    return this.address;
  }
  public void setAddress( java.util.List<AddressModel> value) {
    this.address = value;
  }
  public java.util.List<CodeableConceptModel> getPhysicalType() {
    return this.physicalType;
  }
  public void setPhysicalType( java.util.List<CodeableConceptModel> value) {
    this.physicalType = value;
  }
  public java.util.List<LocationPositionModel> getPosition() {
    return this.position;
  }
  public void setPosition( java.util.List<LocationPositionModel> value) {
    this.position = value;
  }
  public java.util.List<ReferenceModel> getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setManagingOrganization( java.util.List<ReferenceModel> value) {
    this.managingOrganization = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public java.util.List<ReferenceModel> getEndpoint() {
    return this.endpoint;
  }
  public void setEndpoint( java.util.List<ReferenceModel> value) {
    this.endpoint = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[LocationModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("alias" + "->" + this.alias + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("mode" + "->" + this.mode + "\n"); 
     builder.append("telecom" + "->" + this.telecom + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[LocationModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("operationalStatus" + "->" + this.operationalStatus + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("alias" + "->" + this.alias + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("mode" + "->" + this.mode + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("telecom" + "->" + this.telecom + "\n"); 
     builder.append("address" + "->" + this.address + "\n"); 
     builder.append("physicalType" + "->" + this.physicalType + "\n"); 
     builder.append("position" + "->" + this.position + "\n"); 
     builder.append("managingOrganization" + "->" + this.managingOrganization + "\n"); 
     builder.append("partOf" + "->" + this.partOf + "\n"); 
     builder.append("endpoint" + "->" + this.endpoint + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}