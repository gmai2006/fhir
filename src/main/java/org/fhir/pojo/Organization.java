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
import org.fhir.entity.OrganizationModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Organization  extends DomainResource  {
  /**
  * Description: "This is a Organization resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier for the organization that is used to identify the organization across multiple disparate systems."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Whether the organization's record is still in active use."
  */
  protected Boolean active;

  /**
  * Description: "Extensions for active"
  */
  protected transient Element _active;

  /**
  * Description: "The kind(s) of organization that this is."
  */
  protected java.util.List<CodeableConcept> type;

  /**
  * Description: "A name associated with the organization."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "A list of alternate names that the organization is known as, or was known as in the past."
  */
  protected java.util.List<String> alias;

  /**
  * Description: "Extensions for alias"
  */
  protected transient java.util.List<Element> _alias;

  /**
  * Description: "A contact detail for the organization."
  */
  protected java.util.List<ContactPoint> telecom;

  /**
  * Description: "An address for the organization."
  */
  protected java.util.List<Address> address;

  /**
  * Description: "The organization of which this organization forms a part."
  */
  protected Reference partOf;

  /**
  * Description: "Contact for the organization for a certain purpose."
  */
  protected java.util.List<OrganizationContact> contact;

  /**
  * Description: "Technical endpoints providing access to services operated for the organization."
  */
  protected java.util.List<Reference> endpoint;

  public Organization() {
  }

  public Organization(OrganizationModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getActive()) {
      this.active = o.getActive();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type = CodeableConceptHelper.fromArray2Array(o.getType());
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (o.getAlias() != null) {
    	this.alias = org.fhir.utils.JsonUtils.json2Array(o.getAlias());
    }
    if (null != o.getAddress() && !o.getAddress().isEmpty()) {
    	this.address = AddressHelper.fromArray2Array(o.getAddress());
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
      this.partOf = new Reference(o.getPartOf().get(0));
    }
    if (null != o.getContact() && !o.getContact().isEmpty()) {
    	this.contact = OrganizationContactHelper.fromArray2Array(o.getContact());
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
  public void setActive( Boolean value) {
    this.active = value;
  }
  public Boolean getActive() {
    return this.active;
  }
  public void set_active( Element value) {
    this._active = value;
  }
  public Element get_active() {
    return this._active;
  }
  public void setType( java.util.List<CodeableConcept> value) {
    this.type = value;
  }
  public java.util.List<CodeableConcept> getType() {
    return this.type;
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
  public void setTelecom( java.util.List<ContactPoint> value) {
    this.telecom = value;
  }
  public java.util.List<ContactPoint> getTelecom() {
    return this.telecom;
  }
  public void setAddress( java.util.List<Address> value) {
    this.address = value;
  }
  public java.util.List<Address> getAddress() {
    return this.address;
  }
  public void setPartOf( Reference value) {
    this.partOf = value;
  }
  public Reference getPartOf() {
    return this.partOf;
  }
  public void setContact( java.util.List<OrganizationContact> value) {
    this.contact = value;
  }
  public java.util.List<OrganizationContact> getContact() {
    return this.contact;
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
    builder.append("[Organization]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this._active != null) builder.append("_active" + "->" + this._active.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.alias != null) builder.append("alias" + "->" + this.alias.toString() + "\n"); 
     if(this._alias != null) builder.append("_alias" + "->" + this._alias.toString() + "\n"); 
     if(this.telecom != null) builder.append("telecom" + "->" + this.telecom.toString() + "\n"); 
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.contact != null) builder.append("contact" + "->" + this.contact.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Organization,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Organization" : { return Organization.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}