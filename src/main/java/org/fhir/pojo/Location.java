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
import org.fhir.entity.LocationModel;
import com.google.gson.GsonBuilder;

/**
* "Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated."
*/
public class Location  extends DomainResource  {
  /**
  * Description: "This is a Location resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Unique code or number identifying the location to its users."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The Operational status covers operation values most relevant to beds (but can also apply to rooms/units/chair/etc such as an isolation unit/dialisys chair). This typically covers concepts such as contamination, housekeeping and other activities like maintenance."
  */
  protected Coding operationalStatus;

  /**
  * Description: "Name of the location as used by humans. Does not need to be unique."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "A list of alternate names that the location is known as, or was known as in the past."
  */
  protected java.util.List<String> alias = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for alias"
  */
  protected transient java.util.List<Element> _alias = new java.util.ArrayList<>();

  /**
  * Description: "Description of the Location, which helps in finding or referencing the place."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Indicates whether a resource instance represents a specific location or a class of locations."
  */
  protected String mode;

  /**
  * Description: "Extensions for mode"
  */
  protected transient Element _mode;

  /**
  * Description: "Indicates the type of function performed at the location."
  */
  protected CodeableConcept type;

  /**
  * Description: "The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites."
  */
  protected java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "Physical location."
  */
  protected Address address;

  /**
  * Description: "Physical form of the location, e.g. building, room, vehicle, road."
  */
  protected CodeableConcept physicalType;

  /**
  * Description: "The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML)."
  */
  protected LocationPosition position;

  /**
  * Description: "The organization responsible for the provisioning and upkeep of the location."
  */
  protected Reference managingOrganization;

  /**
  * Description: "Another Location which this Location is physically part of."
  */
  protected Reference partOf;

  /**
  * Description: "Technical endpoints providing access to services operated for the location."
  */
  protected java.util.List<Reference> endpoint = new java.util.ArrayList<>();

  public Location() {
  }

  public Location(LocationModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    this.operationalStatus = CodingHelper.fromJson(o.getOperationalStatus());
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (o.getAlias() != null) {
    	this.alias = org.fhir.utils.JsonUtils.json2Array(o.getAlias());
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getMode()) {
      this.mode = o.getMode();
    }
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getAddress() && !o.getAddress().isEmpty()) {
      this.address = new Address(o.getAddress().get(0));
    }
    this.physicalType = CodeableConceptHelper.fromJson(o.getPhysicalType());
    if (null != o.getPosition() && !o.getPosition().isEmpty()) {
      this.position = new LocationPosition(o.getPosition().get(0));
    }
    if (null != o.getManagingOrganization() && !o.getManagingOrganization().isEmpty()) {
      this.managingOrganization = new Reference(o.getManagingOrganization().get(0));
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
      this.partOf = new Reference(o.getPartOf().get(0));
    }
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint = ReferenceHelper.fromArray2Array(o.getEndpoint());
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
  public void setOperationalStatus( Coding value) {
    this.operationalStatus = value;
  }
  public Coding getOperationalStatus() {
    return this.operationalStatus;
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
  public void setAlias( java.util.List<String> value) {
    this.alias = value;
  }
  public java.util.List<String> getAlias() {
    return this.alias;
  }
  public void set_alias( java.util.List<Element> value) {
    this._alias = value;
  }
  public java.util.List<Element> get_alias() {
    return this._alias;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setMode( String value) {
    this.mode = ModeEnum.fromCode(value);
  }
  public String getMode() {
    return this.mode;
  }
  public void set_mode( Element value) {
    this._mode = value;
  }
  public Element get_mode() {
    return this._mode;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setTelecom( java.util.List<ContactPoint> value) {
    this.telecom = value;
  }
  public java.util.List<ContactPoint> getTelecom() {
    return this.telecom;
  }
  public void setAddress( Address value) {
    this.address = value;
  }
  public Address getAddress() {
    return this.address;
  }
  public void setPhysicalType( CodeableConcept value) {
    this.physicalType = value;
  }
  public CodeableConcept getPhysicalType() {
    return this.physicalType;
  }
  public void setPosition( LocationPosition value) {
    this.position = value;
  }
  public LocationPosition getPosition() {
    return this.position;
  }
  public void setManagingOrganization( Reference value) {
    this.managingOrganization = value;
  }
  public Reference getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setPartOf( Reference value) {
    this.partOf = value;
  }
  public Reference getPartOf() {
    return this.partOf;
  }
  public void setEndpoint( java.util.List<Reference> value) {
    this.endpoint = value;
  }
  public java.util.List<Reference> getEndpoint() {
    return this.endpoint;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Location]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.operationalStatus != null) builder.append("operationalStatus" + "->" + this.operationalStatus.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.alias != null) builder.append("alias" + "->" + this.alias.toString() + "\n"); 
     if(this._alias != null) builder.append("_alias" + "->" + this._alias.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.mode != null) builder.append("mode" + "->" + this.mode.toString() + "\n"); 
     if(this._mode != null) builder.append("_mode" + "->" + this._mode.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.telecom != null) builder.append("telecom" + "->" + this.telecom.toString() + "\n"); 
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); 
     if(this.physicalType != null) builder.append("physicalType" + "->" + this.physicalType.toString() + "\n"); 
     if(this.position != null) builder.append("position" + "->" + this.position.toString() + "\n"); 
     if(this.managingOrganization != null) builder.append("managingOrganization" + "->" + this.managingOrganization.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Location,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Location" : { return Location.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	suspended,
  	inactive,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "suspended" : { return suspended.toString(); }
  			case "inactive" : { return inactive.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ModeEnum {
  	instance,
  	kind,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "instance" : { return instance.toString(); }
  			case "kind" : { return kind.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}