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
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
* generated on 07/14/2018
*/
@Entity
@Table(name="capabilitystatementresource")
public class CapabilityStatementResourceModel  implements Serializable {
	private static final long serialVersionUID = 153159210213191381L;
  /**
  * Description: "A type of resource exposed via the restful interface."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles](profiling.html#profile-uses)."
  */
  @javax.persistence.Basic
  @Column(name="\"profile_id\"")
  private String profile_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="profile_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> profile;

  /**
  * Description: "Additional information about the resource type used by the system."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation\"")
  private String documentation;

  /**
  * Description: "Identifies a restful operation supported by the solution."
  */
  @javax.persistence.Basic
  @Column(name="\"interaction_id\"")
  private String interaction_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="interaction_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementInteractionModel> interaction;

  /**
  * Description: "This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API."
  */
  @javax.persistence.Basic
  @Column(name="\"versioning\"")
  private String versioning;

  /**
  * Description: "A flag for whether the server is able to return past versions as part of the vRead operation."
  */
  @javax.persistence.Basic
  @Column(name="\"readHistory\"")
  private Boolean readHistory;

  /**
  * Description: "A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server."
  */
  @javax.persistence.Basic
  @Column(name="\"updateCreate\"")
  private Boolean updateCreate;

  /**
  * Description: "A flag that indicates that the server supports conditional create."
  */
  @javax.persistence.Basic
  @Column(name="\"conditionalCreate\"")
  private Boolean conditionalCreate;

  /**
  * Description: "A code that indicates how the server supports conditional read."
  */
  @javax.persistence.Basic
  @Column(name="\"conditionalRead\"")
  private String conditionalRead;

  /**
  * Description: "A flag that indicates that the server supports conditional update."
  */
  @javax.persistence.Basic
  @Column(name="\"conditionalUpdate\"")
  private Boolean conditionalUpdate;

  /**
  * Description: "A code that indicates how the server supports conditional delete."
  */
  @javax.persistence.Basic
  @Column(name="\"conditionalDelete\"")
  private String conditionalDelete;

  /**
  * Description: "A set of flags that defines how references are supported."
  */
  @javax.persistence.Basic
  @Column(name="\"referencePolicy\"")
  private String referencePolicy;

  /**
  * Description: "A list of _include values supported by the server."
  */
  @javax.persistence.Basic
  @Column(name="\"searchInclude\"")
  private String searchInclude;

  /**
  * Description: "A list of _revinclude (reverse include) values supported by the server."
  */
  @javax.persistence.Basic
  @Column(name="\"searchRevInclude\"")
  private String searchRevInclude;

  /**
  * Description: "Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation."
  */
  @javax.persistence.Basic
  @Column(name="\"searchparam_id\"")
  private String searchparam_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="searchparam_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementSearchParamModel> searchParam;

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

  public CapabilityStatementResourceModel() {
  }

  public CapabilityStatementResourceModel(CapabilityStatementResource o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.type = o.getType();
    if (null != o.getProfile() ) {
    	this.profile_id = "profile" + this.id;
    	this.profile = ReferenceHelper.toModel(o.getProfile(), this.profile_id);
    }
    this.documentation = o.getDocumentation();
    if (null != o.getInteraction() && !o.getInteraction().isEmpty()) {
    	this.interaction_id = "interaction" + this.id;
    	this.interaction = CapabilityStatementInteractionHelper.toModelFromArray(o.getInteraction(), this.interaction_id);
    }
    this.versioning = o.getVersioning();
    this.readHistory = o.getReadHistory();
    this.updateCreate = o.getUpdateCreate();
    this.conditionalCreate = o.getConditionalCreate();
    this.conditionalRead = o.getConditionalRead();
    this.conditionalUpdate = o.getConditionalUpdate();
    this.conditionalDelete = o.getConditionalDelete();
    this.referencePolicy = org.fhir.utils.JsonUtils.toJson(o.getReferencePolicy());
    this.searchInclude = org.fhir.utils.JsonUtils.toJson(o.getSearchInclude());
    this.searchRevInclude = org.fhir.utils.JsonUtils.toJson(o.getSearchRevInclude());
    if (null != o.getSearchParam() && !o.getSearchParam().isEmpty()) {
    	this.searchparam_id = "searchparam" + this.id;
    	this.searchParam = CapabilityStatementSearchParamHelper.toModelFromArray(o.getSearchParam(), this.searchparam_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public java.util.List<ReferenceModel> getProfile() {
    return this.profile;
  }
  public void setProfile( java.util.List<ReferenceModel> value) {
    this.profile = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public java.util.List<CapabilityStatementInteractionModel> getInteraction() {
    return this.interaction;
  }
  public void setInteraction( java.util.List<CapabilityStatementInteractionModel> value) {
    this.interaction = value;
  }
  public String getVersioning() {
    return this.versioning;
  }
  public void setVersioning( String value) {
    this.versioning = value;
  }
  public Boolean getReadHistory() {
    return this.readHistory;
  }
  public void setReadHistory( Boolean value) {
    this.readHistory = value;
  }
  public Boolean getUpdateCreate() {
    return this.updateCreate;
  }
  public void setUpdateCreate( Boolean value) {
    this.updateCreate = value;
  }
  public Boolean getConditionalCreate() {
    return this.conditionalCreate;
  }
  public void setConditionalCreate( Boolean value) {
    this.conditionalCreate = value;
  }
  public String getConditionalRead() {
    return this.conditionalRead;
  }
  public void setConditionalRead( String value) {
    this.conditionalRead = value;
  }
  public Boolean getConditionalUpdate() {
    return this.conditionalUpdate;
  }
  public void setConditionalUpdate( Boolean value) {
    this.conditionalUpdate = value;
  }
  public String getConditionalDelete() {
    return this.conditionalDelete;
  }
  public void setConditionalDelete( String value) {
    this.conditionalDelete = value;
  }
  public String getReferencePolicy() {
    return this.referencePolicy;
  }
  public void setReferencePolicy( String value) {
    this.referencePolicy = value;
  }
  public String getSearchInclude() {
    return this.searchInclude;
  }
  public void setSearchInclude( String value) {
    this.searchInclude = value;
  }
  public String getSearchRevInclude() {
    return this.searchRevInclude;
  }
  public void setSearchRevInclude( String value) {
    this.searchRevInclude = value;
  }
  public java.util.List<CapabilityStatementSearchParamModel> getSearchParam() {
    return this.searchParam;
  }
  public void setSearchParam( java.util.List<CapabilityStatementSearchParamModel> value) {
    this.searchParam = value;
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
    builder.append("[CapabilityStatementResourceModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("versioning" + "->" + this.versioning + "\n"); 
     builder.append("readHistory" + "->" + this.readHistory + "\n"); 
     builder.append("updateCreate" + "->" + this.updateCreate + "\n"); 
     builder.append("conditionalCreate" + "->" + this.conditionalCreate + "\n"); 
     builder.append("conditionalRead" + "->" + this.conditionalRead + "\n"); 
     builder.append("conditionalUpdate" + "->" + this.conditionalUpdate + "\n"); 
     builder.append("conditionalDelete" + "->" + this.conditionalDelete + "\n"); 
     builder.append("referencePolicy" + "->" + this.referencePolicy + "\n"); 
     builder.append("searchInclude" + "->" + this.searchInclude + "\n"); 
     builder.append("searchRevInclude" + "->" + this.searchRevInclude + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementResourceModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("versioning" + "->" + this.versioning + "\n"); 
     builder.append("readHistory" + "->" + this.readHistory + "\n"); 
     builder.append("updateCreate" + "->" + this.updateCreate + "\n"); 
     builder.append("conditionalCreate" + "->" + this.conditionalCreate + "\n"); 
     builder.append("conditionalRead" + "->" + this.conditionalRead + "\n"); 
     builder.append("conditionalUpdate" + "->" + this.conditionalUpdate + "\n"); 
     builder.append("conditionalDelete" + "->" + this.conditionalDelete + "\n"); 
     builder.append("referencePolicy" + "->" + this.referencePolicy + "\n"); 
     builder.append("searchInclude" + "->" + this.searchInclude + "\n"); 
     builder.append("searchRevInclude" + "->" + this.searchRevInclude + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}