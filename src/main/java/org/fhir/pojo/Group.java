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
import org.fhir.entity.GroupModel;
import com.google.gson.GsonBuilder;

/**
* "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
*/
public class Group  extends DomainResource  {
  /**
  * Description: "This is a Group resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A unique business identifier for this group."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Indicates whether the record for the group is available for use or is merely being retained for historical purposes."
  */
  protected Boolean active;

  /**
  * Description: "Extensions for active"
  */
  protected transient Element _active;

  /**
  * Description: "Identifies the broad classification of the kind of resources the group includes."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "If true, indicates that the resource refers to a specific group of real individuals.  If false, the group defines a set of intended individuals."
  */
  protected Boolean actual;

  /**
  * Description: "Extensions for actual"
  */
  protected transient Element _actual;

  /**
  * Description: "Provides a specific type of resource the group includes; e.g. \"cow\", \"syringe\", etc."
  */
  protected CodeableConcept code;

  /**
  * Description: "A label assigned to the group for human identification and communication."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "A count of the number of resource instances that are part of the group."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float quantity;

  /**
  * Description: "Extensions for quantity"
  */
  protected transient Element _quantity;

  /**
  * Description: "Identifies the traits shared by members of the group."
  */
  protected java.util.List<GroupCharacteristic> characteristic = new java.util.ArrayList<>();

  /**
  * Description: "Identifies the resource instances that are members of the group."
  */
  protected java.util.List<GroupMember> member = new java.util.ArrayList<>();

  public Group() {
  }

  public Group(GroupModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getActive()) {
      this.active = o.getActive();
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getActual()) {
      this.actual = o.getActual();
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getQuantity()) {
      this.quantity = o.getQuantity();
    }
    if (null != o.getCharacteristic() && !o.getCharacteristic().isEmpty()) {
    	this.characteristic = GroupCharacteristicHelper.fromArray2Array(o.getCharacteristic());
    }
    if (null != o.getMember() && !o.getMember().isEmpty()) {
    	this.member = GroupMemberHelper.fromArray2Array(o.getMember());
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
  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setActual( Boolean value) {
    this.actual = value;
  }
  public Boolean getActual() {
    return this.actual;
  }
  public void set_actual( Element value) {
    this._actual = value;
  }
  public Element get_actual() {
    return this._actual;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
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
  public void setQuantity( Float value) {
    this.quantity = value;
  }
  public Float getQuantity() {
    return this.quantity;
  }
  public void set_quantity( Element value) {
    this._quantity = value;
  }
  public Element get_quantity() {
    return this._quantity;
  }
  public void setCharacteristic( java.util.List<GroupCharacteristic> value) {
    this.characteristic = value;
  }
  public java.util.List<GroupCharacteristic> getCharacteristic() {
    return this.characteristic;
  }
  public void setMember( java.util.List<GroupMember> value) {
    this.member = value;
  }
  public java.util.List<GroupMember> getMember() {
    return this.member;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Group]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this._active != null) builder.append("_active" + "->" + this._active.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.actual != null) builder.append("actual" + "->" + this.actual.toString() + "\n"); 
     if(this._actual != null) builder.append("_actual" + "->" + this._actual.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this._quantity != null) builder.append("_quantity" + "->" + this._quantity.toString() + "\n"); 
     if(this.characteristic != null) builder.append("characteristic" + "->" + this.characteristic.toString() + "\n"); 
     if(this.member != null) builder.append("member" + "->" + this.member.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Group,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Group" : { return Group.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum TypeEnum {
  	person,
  	animal,
  	practitioner,
  	device,
  	medication,
  	substance,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "person" : { return person.toString(); }
  			case "animal" : { return animal.toString(); }
  			case "practitioner" : { return practitioner.toString(); }
  			case "device" : { return device.toString(); }
  			case "medication" : { return medication.toString(); }
  			case "substance" : { return substance.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}