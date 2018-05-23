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
* "A reference to a code defined by a terminology system."
*/
@Entity
@Table(name="coding")
public class CodingModel  implements Serializable {
	private static final long serialVersionUID = 151967883229588739L;
  /**
  * Description: "The identification of the code system that defines the meaning of the symbol in the code."
  */
  @javax.persistence.Basic
  @Column(name="\"system\"")
  private String system;

  /**
  * Description: "The version of the code system which was used when choosing this code. Note that a well-maintained code system does not need the version reported, because the meaning of codes is consistent across versions. However this cannot consistently be assured. and when the meaning is not guaranteed to be consistent, the version SHOULD be exchanged."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "A symbol in syntax defined by the system. The symbol may be a predefined code or an expression in a syntax defined by the coding system (e.g. post-coordination)."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"code\"")
  private String code;

  /**
  * Description: "A representation of the meaning of the code in the system, following the rules of the system."
  */
  @javax.persistence.Basic
  @Column(name="\"display\"")
  private String display;

  /**
  * Description: "Indicates that this coding was chosen by a user directly - i.e. off a pick list of available items (codes or displays)."
  */
  @javax.persistence.Basic
  @Column(name="\"userSelected\"")
  private Boolean userSelected;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
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

  public CodingModel() {
  }

  public CodingModel(Coding o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.system = o.getSystem();
    this.version = o.getVersion();
    this.code = o.getCode();
    this.display = o.getDisplay();
    this.userSelected = o.getUserSelected();
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getSystem() {
    return this.system;
  }
  public void setSystem( String value) {
    this.system = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public Boolean getUserSelected() {
    return this.userSelected;
  }
  public void setUserSelected( Boolean value) {
    this.userSelected = value;
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
    builder.append("[CodingModel]:" + "\n");
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("userSelected" + "->" + this.userSelected + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CodingModel]:" + "\n");
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("version" + "->" + this.version + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("userSelected" + "->" + this.userSelected + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}