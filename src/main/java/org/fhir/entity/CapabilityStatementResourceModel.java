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
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
@Entity
@Table(name="capabilitystatementresource")
public class CapabilityStatementResourceModel  {
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`profile_id`", insertable=false, updatable=false)
  private ReferenceModel profile;

  /**
  * Description: "Additional information about the resource type used by the system."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation\"")
  private String documentation;

  /**
  * Description: "Identifies a restful operation supported by the solution."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementInteractionModel> interaction = new java.util.ArrayList<>();

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
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"referencePolicy\"", length = 16777215)
  private String referencePolicy;

  /**
  * Description: "A list of _include values supported by the server."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"searchInclude\"", length = 16777215)
  private String searchInclude;

  /**
  * Description: "A list of _revinclude (reverse include) values supported by the server."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"searchRevInclude\"", length = 16777215)
  private String searchRevInclude;

  /**
  * Description: "Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementSearchParamModel> searchParam = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public CapabilityStatementResourceModel() {
  }

  public CapabilityStatementResourceModel(CapabilityStatementResource o) {
    this.id = o.getId();
      this.type = o.getType();

      if (null != o.getProfile()) {
      	this.profile_id = "profile" + this.getId();
        this.profile = new ReferenceModel(o.getProfile());
        this.profile.setId(this.profile_id);
        this.profile.parent_id = this.profile.getId();
      }

      this.documentation = o.getDocumentation();

      this.interaction = CapabilityStatementInteraction.toModelArray(o.getInteraction());

      this.versioning = o.getVersioning();

      this.readHistory = o.getReadHistory();

      this.updateCreate = o.getUpdateCreate();

      this.conditionalCreate = o.getConditionalCreate();

      this.conditionalRead = o.getConditionalRead();

      this.conditionalUpdate = o.getConditionalUpdate();

      this.conditionalDelete = o.getConditionalDelete();

      this.referencePolicy = org.fhir.utils.JsonUtils.write2String(o.getReferencePolicy());

      this.searchInclude = org.fhir.utils.JsonUtils.write2String(o.getSearchInclude());

      this.searchRevInclude = org.fhir.utils.JsonUtils.write2String(o.getSearchRevInclude());

      this.searchParam = CapabilityStatementSearchParam.toModelArray(o.getSearchParam());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setProfile( ReferenceModel value) {
    this.profile = value;
  }
  public ReferenceModel getProfile() {
    return this.profile;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setInteraction( java.util.List<CapabilityStatementInteractionModel> value) {
    this.interaction = value;
  }
  public java.util.List<CapabilityStatementInteractionModel> getInteraction() {
    return this.interaction;
  }
  public void setVersioning( String value) {
    this.versioning = value;
  }
  public String getVersioning() {
    return this.versioning;
  }
  public void setReadHistory( Boolean value) {
    this.readHistory = value;
  }
  public Boolean getReadHistory() {
    return this.readHistory;
  }
  public void setUpdateCreate( Boolean value) {
    this.updateCreate = value;
  }
  public Boolean getUpdateCreate() {
    return this.updateCreate;
  }
  public void setConditionalCreate( Boolean value) {
    this.conditionalCreate = value;
  }
  public Boolean getConditionalCreate() {
    return this.conditionalCreate;
  }
  public void setConditionalRead( String value) {
    this.conditionalRead = value;
  }
  public String getConditionalRead() {
    return this.conditionalRead;
  }
  public void setConditionalUpdate( Boolean value) {
    this.conditionalUpdate = value;
  }
  public Boolean getConditionalUpdate() {
    return this.conditionalUpdate;
  }
  public void setConditionalDelete( String value) {
    this.conditionalDelete = value;
  }
  public String getConditionalDelete() {
    return this.conditionalDelete;
  }
  public void setReferencePolicy( String value) {
    this.referencePolicy = value;
  }
  public String getReferencePolicy() {
    return this.referencePolicy;
  }
  public void setSearchInclude( String value) {
    this.searchInclude = value;
  }
  public String getSearchInclude() {
    return this.searchInclude;
  }
  public void setSearchRevInclude( String value) {
    this.searchRevInclude = value;
  }
  public String getSearchRevInclude() {
    return this.searchRevInclude;
  }
  public void setSearchParam( java.util.List<CapabilityStatementSearchParamModel> value) {
    this.searchParam = value;
  }
  public java.util.List<CapabilityStatementSearchParamModel> getSearchParam() {
    return this.searchParam;
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
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("profile" + "[" + String.valueOf(this.profile) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("interaction" + "[" + String.valueOf(this.interaction) + "]\n"); 
     builder.append("versioning" + "[" + String.valueOf(this.versioning) + "]\n"); 
     builder.append("readHistory" + "[" + String.valueOf(this.readHistory) + "]\n"); 
     builder.append("updateCreate" + "[" + String.valueOf(this.updateCreate) + "]\n"); 
     builder.append("conditionalCreate" + "[" + String.valueOf(this.conditionalCreate) + "]\n"); 
     builder.append("conditionalRead" + "[" + String.valueOf(this.conditionalRead) + "]\n"); 
     builder.append("conditionalUpdate" + "[" + String.valueOf(this.conditionalUpdate) + "]\n"); 
     builder.append("conditionalDelete" + "[" + String.valueOf(this.conditionalDelete) + "]\n"); 
     builder.append("referencePolicy" + "[" + String.valueOf(this.referencePolicy) + "]\n"); 
     builder.append("searchInclude" + "[" + String.valueOf(this.searchInclude) + "]\n"); 
     builder.append("searchRevInclude" + "[" + String.valueOf(this.searchRevInclude) + "]\n"); 
     builder.append("searchParam" + "[" + String.valueOf(this.searchParam) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}