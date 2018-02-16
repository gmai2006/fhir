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
import org.fhir.entity.AuditEventEntityModel;
import com.google.gson.GsonBuilder;

/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
public class AuditEventEntity  extends BackboneElement  {
  /**
  * Description: "Identifies a specific instance of the entity. The reference should always be version specific."
  */
  protected Identifier identifier;

  /**
  * Description: "Identifies a specific instance of the entity. The reference should be version specific."
  */
  protected Reference reference;

  /**
  * Description: "The type of the object that was involved in this audit event."
  */
  protected Coding type;

  /**
  * Description: "Code representing the role the entity played in the event being audited."
  */
  protected Coding role;

  /**
  * Description: "Identifier for the data life-cycle stage for the entity."
  */
  protected Coding lifecycle;

  /**
  * Description: "Security labels for the identified entity."
  */
  protected java.util.List<Coding> securityLabel = new java.util.ArrayList<>();

  /**
  * Description: "A name of the entity in the audit event."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "Text that describes the entity in more detail."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The query parameters for a query-type entities."
  */
  protected String query;

  /**
  * Description: "Extensions for query"
  */
  protected transient Element _query;

  /**
  * Description: "Tagged value pairs for conveying additional information about the entity."
  */
  protected java.util.List<AuditEventDetail> detail = new java.util.ArrayList<>();

  public AuditEventEntity() {
  }

  public AuditEventEntity(AuditEventEntityModel o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getReference() && !o.getReference().isEmpty()) {
      this.reference = new Reference(o.getReference().get(0));
    }
    this.type = CodingHelper.fromJson(o.getType());
    this.role = CodingHelper.fromJson(o.getRole());
    this.lifecycle = CodingHelper.fromJson(o.getLifecycle());
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getQuery()) {
      this.query = o.getQuery();
    }
    if (null != o.getDetail() && !o.getDetail().isEmpty()) {
    	this.detail = AuditEventDetailHelper.fromArray2Array(o.getDetail());
    }
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setReference( Reference value) {
    this.reference = value;
  }
  public Reference getReference() {
    return this.reference;
  }
  public void setType( Coding value) {
    this.type = value;
  }
  public Coding getType() {
    return this.type;
  }
  public void setRole( Coding value) {
    this.role = value;
  }
  public Coding getRole() {
    return this.role;
  }
  public void setLifecycle( Coding value) {
    this.lifecycle = value;
  }
  public Coding getLifecycle() {
    return this.lifecycle;
  }
  public void setSecurityLabel( java.util.List<Coding> value) {
    this.securityLabel = value;
  }
  public java.util.List<Coding> getSecurityLabel() {
    return this.securityLabel;
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
  public void setQuery( String value) {
    this.query = value;
  }
  public String getQuery() {
    return this.query;
  }
  public void set_query( Element value) {
    this._query = value;
  }
  public Element get_query() {
    return this._query;
  }
  public void setDetail( java.util.List<AuditEventDetail> value) {
    this.detail = value;
  }
  public java.util.List<AuditEventDetail> getDetail() {
    return this.detail;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventEntity]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.reference != null) builder.append("reference" + "->" + this.reference.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); 
     if(this.lifecycle != null) builder.append("lifecycle" + "->" + this.lifecycle.toString() + "\n"); 
     if(this.securityLabel != null) builder.append("securityLabel" + "->" + this.securityLabel.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.query != null) builder.append("query" + "->" + this.query.toString() + "\n"); 
     if(this._query != null) builder.append("_query" + "->" + this._query.toString() + "\n"); 
     if(this.detail != null) builder.append("detail" + "->" + this.detail.toString() + "\n"); ;
    return builder.toString();
  }


}