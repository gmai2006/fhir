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
import org.fhir.entity.CapabilityStatementResourceModel;
import com.google.gson.GsonBuilder;

/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
public class CapabilityStatementResource  {
  /**
  * Description: "A type of resource exposed via the restful interface."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles](profiling.html#profile-uses)."
  */
  private Reference profile;

  /**
  * Description: "Additional information about the resource type used by the system."
  */
  private String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  private transient Element _documentation;

  /**
  * Description: "Identifies a restful operation supported by the solution."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<CapabilityStatementInteraction> interaction = new java.util.ArrayList<>();

  /**
  * Description: "This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API."
  */
  private String versioning;

  /**
  * Description: "Extensions for versioning"
  */
  private transient Element _versioning;

  /**
  * Description: "A flag for whether the server is able to return past versions as part of the vRead operation."
  */
  private Boolean readHistory;

  /**
  * Description: "Extensions for readHistory"
  */
  private transient Element _readHistory;

  /**
  * Description: "A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server."
  */
  private Boolean updateCreate;

  /**
  * Description: "Extensions for updateCreate"
  */
  private transient Element _updateCreate;

  /**
  * Description: "A flag that indicates that the server supports conditional create."
  */
  private Boolean conditionalCreate;

  /**
  * Description: "Extensions for conditionalCreate"
  */
  private transient Element _conditionalCreate;

  /**
  * Description: "A code that indicates how the server supports conditional read."
  */
  private String conditionalRead;

  /**
  * Description: "Extensions for conditionalRead"
  */
  private transient Element _conditionalRead;

  /**
  * Description: "A flag that indicates that the server supports conditional update."
  */
  private Boolean conditionalUpdate;

  /**
  * Description: "Extensions for conditionalUpdate"
  */
  private transient Element _conditionalUpdate;

  /**
  * Description: "A code that indicates how the server supports conditional delete."
  */
  private String conditionalDelete;

  /**
  * Description: "Extensions for conditionalDelete"
  */
  private transient Element _conditionalDelete;

  /**
  * Description: "A set of flags that defines how references are supported."
  */
  private java.util.List<String> referencePolicy = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for referencePolicy"
  */
  private transient java.util.List<Element> _referencePolicy = new java.util.ArrayList<>();

  /**
  * Description: "A list of _include values supported by the server."
  */
  private java.util.List<String> searchInclude = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for searchInclude"
  */
  private transient java.util.List<Element> _searchInclude = new java.util.ArrayList<>();

  /**
  * Description: "A list of _revinclude (reverse include) values supported by the server."
  */
  private java.util.List<String> searchRevInclude = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for searchRevInclude"
  */
  private transient java.util.List<Element> _searchRevInclude = new java.util.ArrayList<>();

  /**
  * Description: "Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation."
  */
  private java.util.List<CapabilityStatementSearchParam> searchParam = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public CapabilityStatementResource() {
  }

  public CapabilityStatementResource(CapabilityStatementResourceModel o) {
    this.id = o.getId();
      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      if (null != o.getProfile()) {
        this.profile = new Reference(o.getProfile());
        this.profile.setId(this.getId());
      }

      if (null != o.getDocumentation()) {
        this.documentation = new String(o.getDocumentation());
      }

      this.interaction = CapabilityStatementInteraction.fromArray(o.getInteraction());

      if (null != o.getVersioning()) {
        this.versioning = new String(o.getVersioning());
      }

      if (null != o.getReadHistory()) {
        this.readHistory = new Boolean(o.getReadHistory());
      }

      if (null != o.getUpdateCreate()) {
        this.updateCreate = new Boolean(o.getUpdateCreate());
      }

      if (null != o.getConditionalCreate()) {
        this.conditionalCreate = new Boolean(o.getConditionalCreate());
      }

      if (null != o.getConditionalRead()) {
        this.conditionalRead = new String(o.getConditionalRead());
      }

      if (null != o.getConditionalUpdate()) {
        this.conditionalUpdate = new Boolean(o.getConditionalUpdate());
      }

      if (null != o.getConditionalDelete()) {
        this.conditionalDelete = new String(o.getConditionalDelete());
      }

      this.referencePolicy = org.fhir.utils.JsonUtils.json2Array(o.getReferencePolicy());

      this.searchInclude = org.fhir.utils.JsonUtils.json2Array(o.getSearchInclude());

      this.searchRevInclude = org.fhir.utils.JsonUtils.json2Array(o.getSearchRevInclude());

      this.searchParam = CapabilityStatementSearchParam.fromArray(o.getSearchParam());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
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
  public void setProfile( Reference value) {
    this.profile = value;
  }
  public Reference getProfile() {
    return this.profile;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void set_documentation( Element value) {
    this._documentation = value;
  }
  public Element get_documentation() {
    return this._documentation;
  }
  public void setInteraction( java.util.List<CapabilityStatementInteraction> value) {
    this.interaction = value;
  }
  public java.util.List<CapabilityStatementInteraction> getInteraction() {
    return this.interaction;
  }
  public void setVersioning( String value) {
    this.versioning = VersioningEnum.fromCode(value);
  }
  public String getVersioning() {
    return this.versioning;
  }
  public void set_versioning( Element value) {
    this._versioning = value;
  }
  public Element get_versioning() {
    return this._versioning;
  }
  public void setReadHistory( Boolean value) {
    this.readHistory = value;
  }
  public Boolean getReadHistory() {
    return this.readHistory;
  }
  public void set_readHistory( Element value) {
    this._readHistory = value;
  }
  public Element get_readHistory() {
    return this._readHistory;
  }
  public void setUpdateCreate( Boolean value) {
    this.updateCreate = value;
  }
  public Boolean getUpdateCreate() {
    return this.updateCreate;
  }
  public void set_updateCreate( Element value) {
    this._updateCreate = value;
  }
  public Element get_updateCreate() {
    return this._updateCreate;
  }
  public void setConditionalCreate( Boolean value) {
    this.conditionalCreate = value;
  }
  public Boolean getConditionalCreate() {
    return this.conditionalCreate;
  }
  public void set_conditionalCreate( Element value) {
    this._conditionalCreate = value;
  }
  public Element get_conditionalCreate() {
    return this._conditionalCreate;
  }
  public void setConditionalRead( String value) {
    this.conditionalRead = ConditionalReadEnum.fromCode(value);
  }
  public String getConditionalRead() {
    return this.conditionalRead;
  }
  public void set_conditionalRead( Element value) {
    this._conditionalRead = value;
  }
  public Element get_conditionalRead() {
    return this._conditionalRead;
  }
  public void setConditionalUpdate( Boolean value) {
    this.conditionalUpdate = value;
  }
  public Boolean getConditionalUpdate() {
    return this.conditionalUpdate;
  }
  public void set_conditionalUpdate( Element value) {
    this._conditionalUpdate = value;
  }
  public Element get_conditionalUpdate() {
    return this._conditionalUpdate;
  }
  public void setConditionalDelete( String value) {
    this.conditionalDelete = ConditionalDeleteEnum.fromCode(value);
  }
  public String getConditionalDelete() {
    return this.conditionalDelete;
  }
  public void set_conditionalDelete( Element value) {
    this._conditionalDelete = value;
  }
  public Element get_conditionalDelete() {
    return this._conditionalDelete;
  }
  public void setReferencePolicy( java.util.List<String> value) {
    this.referencePolicy = ReferencePolicyEnum.fromCode(value);
  }
  public java.util.List<String> getReferencePolicy() {
    return this.referencePolicy;
  }
  public void set_referencePolicy( java.util.List<Element> value) {
    this._referencePolicy = value;
  }
  public java.util.List<Element> get_referencePolicy() {
    return this._referencePolicy;
  }
  public void setSearchInclude( java.util.List<String> value) {
    this.searchInclude = value;
  }
  public java.util.List<String> getSearchInclude() {
    return this.searchInclude;
  }
  public void set_searchInclude( java.util.List<Element> value) {
    this._searchInclude = value;
  }
  public java.util.List<Element> get_searchInclude() {
    return this._searchInclude;
  }
  public void setSearchRevInclude( java.util.List<String> value) {
    this.searchRevInclude = value;
  }
  public java.util.List<String> getSearchRevInclude() {
    return this.searchRevInclude;
  }
  public void set_searchRevInclude( java.util.List<Element> value) {
    this._searchRevInclude = value;
  }
  public java.util.List<Element> get_searchRevInclude() {
    return this._searchRevInclude;
  }
  public void setSearchParam( java.util.List<CapabilityStatementSearchParam> value) {
    this.searchParam = value;
  }
  public java.util.List<CapabilityStatementSearchParam> getSearchParam() {
    return this.searchParam;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("profile" + "[" + String.valueOf(this.profile) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("_documentation" + "[" + String.valueOf(this._documentation) + "]\n"); 
     builder.append("interaction" + "[" + String.valueOf(this.interaction) + "]\n"); 
     builder.append("versioning" + "[" + String.valueOf(this.versioning) + "]\n"); 
     builder.append("_versioning" + "[" + String.valueOf(this._versioning) + "]\n"); 
     builder.append("readHistory" + "[" + String.valueOf(this.readHistory) + "]\n"); 
     builder.append("_readHistory" + "[" + String.valueOf(this._readHistory) + "]\n"); 
     builder.append("updateCreate" + "[" + String.valueOf(this.updateCreate) + "]\n"); 
     builder.append("_updateCreate" + "[" + String.valueOf(this._updateCreate) + "]\n"); 
     builder.append("conditionalCreate" + "[" + String.valueOf(this.conditionalCreate) + "]\n"); 
     builder.append("_conditionalCreate" + "[" + String.valueOf(this._conditionalCreate) + "]\n"); 
     builder.append("conditionalRead" + "[" + String.valueOf(this.conditionalRead) + "]\n"); 
     builder.append("_conditionalRead" + "[" + String.valueOf(this._conditionalRead) + "]\n"); 
     builder.append("conditionalUpdate" + "[" + String.valueOf(this.conditionalUpdate) + "]\n"); 
     builder.append("_conditionalUpdate" + "[" + String.valueOf(this._conditionalUpdate) + "]\n"); 
     builder.append("conditionalDelete" + "[" + String.valueOf(this.conditionalDelete) + "]\n"); 
     builder.append("_conditionalDelete" + "[" + String.valueOf(this._conditionalDelete) + "]\n"); 
     builder.append("referencePolicy" + "[" + String.valueOf(this.referencePolicy) + "]\n"); 
     builder.append("_referencePolicy" + "[" + String.valueOf(this._referencePolicy) + "]\n"); 
     builder.append("searchInclude" + "[" + String.valueOf(this.searchInclude) + "]\n"); 
     builder.append("_searchInclude" + "[" + String.valueOf(this._searchInclude) + "]\n"); 
     builder.append("searchRevInclude" + "[" + String.valueOf(this.searchRevInclude) + "]\n"); 
     builder.append("_searchRevInclude" + "[" + String.valueOf(this._searchRevInclude) + "]\n"); 
     builder.append("searchParam" + "[" + String.valueOf(this.searchParam) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum VersioningEnum {
  	noversion,
  	versioned,
  	versionedupdate,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "noversion" : { return noversion.toString(); }
  			case "versioned" : { return versioned.toString(); }
  			case "versionedupdate" : { return versionedupdate.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ConditionalReadEnum {
  	notsupported,
  	modifiedsince,
  	notmatch,
  	fullsupport,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "notsupported" : { return notsupported.toString(); }
  			case "modifiedsince" : { return modifiedsince.toString(); }
  			case "notmatch" : { return notmatch.toString(); }
  			case "fullsupport" : { return fullsupport.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ConditionalDeleteEnum {
  	notsupported,
  	single,
  	multiple,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "notsupported" : { return notsupported.toString(); }
  			case "single" : { return single.toString(); }
  			case "multiple" : { return multiple.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ReferencePolicyEnum {
  	literal,
  	logical,
  	resolves,
  	enforced,
  	local,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "literal" : { result.add(literal.toString()); }
  		  			case "logical" : { result.add(logical.toString()); }
  		  			case "resolves" : { result.add(resolves.toString()); }
  		  			case "enforced" : { result.add(enforced.toString()); }
  		  			case "local" : { result.add(local.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }

  public static java.util.List<CapabilityStatementResource> fromArray(java.util.List<CapabilityStatementResourceModel> list) {
    return (java.util.List<CapabilityStatementResource>)list.stream()
      .map(model -> new CapabilityStatementResource(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CapabilityStatementResourceModel> toModelArray(java.util.List<CapabilityStatementResource> list) {
    return (java.util.List<CapabilityStatementResourceModel>)list.stream()
      .map(model -> new CapabilityStatementResourceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CapabilityStatementResource fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CapabilityStatementResource.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CapabilityStatementResource o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CapabilityStatementResource> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}