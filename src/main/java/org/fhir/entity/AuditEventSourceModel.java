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
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
* generated on 07/14/2018
*/
@Entity
@Table(name="auditeventsource")
public class AuditEventSourceModel  implements Serializable {
	private static final long serialVersionUID = 153159210197447860L;
  /**
  * Description: "Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group."
  */
  @javax.persistence.Basic
  @Column(name="\"site\"")
  private String site;

  /**
  * Description: "Identifier of the source where the event was detected."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Code specifying the type of source where event originated."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> type;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public AuditEventSourceModel() {
  }

  public AuditEventSourceModel(AuditEventSource o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.site = o.getSite();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
    	this.type_id = "type" + this.id;
    	this.type = CodingHelper.toModelFromArray(o.getType(), this.type_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getSite() {
    return this.site;
  }
  public void setSite( String value) {
    this.site = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public java.util.List<CodingModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodingModel> value) {
    this.type = value;
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
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventSourceModel]:" + "\n");
     builder.append("site" + "->" + this.site + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventSourceModel]:" + "\n");
     builder.append("site" + "->" + this.site + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}