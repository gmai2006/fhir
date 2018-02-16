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
public class CapabilityStatementResource  extends BackboneElement  {
  /**
  * Description: "A type of resource exposed via the restful interface."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles](profiling.html#profile-uses)."
  */
  protected Reference profile;

  /**
  * Description: "Additional information about the resource type used by the system."
  */
  protected String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  protected transient Element _documentation;

  /**
  * Description: "Identifies a restful operation supported by the solution."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<CapabilityStatementInteraction> interaction = new java.util.ArrayList<>();

  /**
  * Description: "This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API."
  */
  protected String versioning;

  /**
  * Description: "Extensions for versioning"
  */
  protected transient Element _versioning;

  /**
  * Description: "A flag for whether the server is able to return past versions as part of the vRead operation."
  */
  protected Boolean readHistory;

  /**
  * Description: "Extensions for readHistory"
  */
  protected transient Element _readHistory;

  /**
  * Description: "A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server."
  */
  protected Boolean updateCreate;

  /**
  * Description: "Extensions for updateCreate"
  */
  protected transient Element _updateCreate;

  /**
  * Description: "A flag that indicates that the server supports conditional create."
  */
  protected Boolean conditionalCreate;

  /**
  * Description: "Extensions for conditionalCreate"
  */
  protected transient Element _conditionalCreate;

  /**
  * Description: "A code that indicates how the server supports conditional read."
  */
  protected String conditionalRead;

  /**
  * Description: "Extensions for conditionalRead"
  */
  protected transient Element _conditionalRead;

  /**
  * Description: "A flag that indicates that the server supports conditional update."
  */
  protected Boolean conditionalUpdate;

  /**
  * Description: "Extensions for conditionalUpdate"
  */
  protected transient Element _conditionalUpdate;

  /**
  * Description: "A code that indicates how the server supports conditional delete."
  */
  protected String conditionalDelete;

  /**
  * Description: "Extensions for conditionalDelete"
  */
  protected transient Element _conditionalDelete;

  /**
  * Description: "A set of flags that defines how references are supported."
  */
  protected java.util.List<String> referencePolicy = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for referencePolicy"
  */
  protected transient java.util.List<Element> _referencePolicy = new java.util.ArrayList<>();

  /**
  * Description: "A list of _include values supported by the server."
  */
  protected java.util.List<String> searchInclude = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for searchInclude"
  */
  protected transient java.util.List<Element> _searchInclude = new java.util.ArrayList<>();

  /**
  * Description: "A list of _revinclude (reverse include) values supported by the server."
  */
  protected java.util.List<String> searchRevInclude = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for searchRevInclude"
  */
  protected transient java.util.List<Element> _searchRevInclude = new java.util.ArrayList<>();

  /**
  * Description: "Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation."
  */
  protected java.util.List<CapabilityStatementSearchParam> searchParam = new java.util.ArrayList<>();

  public CapabilityStatementResource() {
  }

  public CapabilityStatementResource(CapabilityStatementResourceModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getProfile() && !o.getProfile().isEmpty()) {
      this.profile = new Reference(o.getProfile().get(0));
    }
    if (null != o.getDocumentation()) {
      this.documentation = o.getDocumentation();
    }
    if (null != o.getInteraction() && !o.getInteraction().isEmpty()) {
    	this.interaction = CapabilityStatementInteractionHelper.fromArray2Array(o.getInteraction());
    }
    if (null != o.getVersioning()) {
      this.versioning = o.getVersioning();
    }
    if (null != o.getReadHistory()) {
      this.readHistory = o.getReadHistory();
    }
    if (null != o.getUpdateCreate()) {
      this.updateCreate = o.getUpdateCreate();
    }
    if (null != o.getConditionalCreate()) {
      this.conditionalCreate = o.getConditionalCreate();
    }
    if (null != o.getConditionalRead()) {
      this.conditionalRead = o.getConditionalRead();
    }
    if (null != o.getConditionalUpdate()) {
      this.conditionalUpdate = o.getConditionalUpdate();
    }
    if (null != o.getConditionalDelete()) {
      this.conditionalDelete = o.getConditionalDelete();
    }
    if (o.getReferencePolicy() != null) {
    	this.referencePolicy = org.fhir.utils.JsonUtils.json2Array(o.getReferencePolicy());
    }
    if (o.getSearchInclude() != null) {
    	this.searchInclude = org.fhir.utils.JsonUtils.json2Array(o.getSearchInclude());
    }
    if (o.getSearchRevInclude() != null) {
    	this.searchRevInclude = org.fhir.utils.JsonUtils.json2Array(o.getSearchRevInclude());
    }
    if (null != o.getSearchParam() && !o.getSearchParam().isEmpty()) {
    	this.searchParam = CapabilityStatementSearchParamHelper.fromArray2Array(o.getSearchParam());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementResource]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.profile != null) builder.append("profile" + "->" + this.profile.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this._documentation != null) builder.append("_documentation" + "->" + this._documentation.toString() + "\n"); 
     if(this.interaction != null) builder.append("interaction" + "->" + this.interaction.toString() + "\n"); 
     if(this.versioning != null) builder.append("versioning" + "->" + this.versioning.toString() + "\n"); 
     if(this._versioning != null) builder.append("_versioning" + "->" + this._versioning.toString() + "\n"); 
     if(this.readHistory != null) builder.append("readHistory" + "->" + this.readHistory.toString() + "\n"); 
     if(this._readHistory != null) builder.append("_readHistory" + "->" + this._readHistory.toString() + "\n"); 
     if(this.updateCreate != null) builder.append("updateCreate" + "->" + this.updateCreate.toString() + "\n"); 
     if(this._updateCreate != null) builder.append("_updateCreate" + "->" + this._updateCreate.toString() + "\n"); 
     if(this.conditionalCreate != null) builder.append("conditionalCreate" + "->" + this.conditionalCreate.toString() + "\n"); 
     if(this._conditionalCreate != null) builder.append("_conditionalCreate" + "->" + this._conditionalCreate.toString() + "\n"); 
     if(this.conditionalRead != null) builder.append("conditionalRead" + "->" + this.conditionalRead.toString() + "\n"); 
     if(this._conditionalRead != null) builder.append("_conditionalRead" + "->" + this._conditionalRead.toString() + "\n"); 
     if(this.conditionalUpdate != null) builder.append("conditionalUpdate" + "->" + this.conditionalUpdate.toString() + "\n"); 
     if(this._conditionalUpdate != null) builder.append("_conditionalUpdate" + "->" + this._conditionalUpdate.toString() + "\n"); 
     if(this.conditionalDelete != null) builder.append("conditionalDelete" + "->" + this.conditionalDelete.toString() + "\n"); 
     if(this._conditionalDelete != null) builder.append("_conditionalDelete" + "->" + this._conditionalDelete.toString() + "\n"); 
     if(this.referencePolicy != null) builder.append("referencePolicy" + "->" + this.referencePolicy.toString() + "\n"); 
     if(this._referencePolicy != null) builder.append("_referencePolicy" + "->" + this._referencePolicy.toString() + "\n"); 
     if(this.searchInclude != null) builder.append("searchInclude" + "->" + this.searchInclude.toString() + "\n"); 
     if(this._searchInclude != null) builder.append("_searchInclude" + "->" + this._searchInclude.toString() + "\n"); 
     if(this.searchRevInclude != null) builder.append("searchRevInclude" + "->" + this.searchRevInclude.toString() + "\n"); 
     if(this._searchRevInclude != null) builder.append("_searchRevInclude" + "->" + this._searchRevInclude.toString() + "\n"); 
     if(this.searchParam != null) builder.append("searchParam" + "->" + this.searchParam.toString() + "\n"); ;
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

}