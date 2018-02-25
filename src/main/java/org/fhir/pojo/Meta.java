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
import org.fhir.entity.MetaModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Meta  extends Element  {
  /**
  * Description: "The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String versionId;

  /**
  * Description: "Extensions for versionId"
  */
  protected transient Element _versionId;

  /**
  * Description: "When the resource last changed - e.g. when the version changed."
  */
  protected String lastUpdated;

  /**
  * Description: "Extensions for lastUpdated"
  */
  protected transient Element _lastUpdated;

  /**
  * Description: "A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]."
  */
  protected java.util.List<String> profile;

  /**
  * Description: "Extensions for profile"
  */
  protected transient java.util.List<Element> _profile;

  /**
  * Description: "Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure."
  */
  protected java.util.List<Coding> security;

  /**
  * Description: "Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource."
  */
  protected java.util.List<Coding> tag;

  public Meta() {
  }

  public Meta(MetaModel o) {
    this.id = o.getId();
    if (null != o.getVersionId()) {
      this.versionId = o.getVersionId();
    }
    if (null != o.getLastUpdated()) {
      this.lastUpdated = o.getLastUpdated();
    }
    if (o.getProfile() != null) {
    	this.profile = org.fhir.utils.JsonUtils.json2Array(o.getProfile());
    }
    if (null != o.getSecurity() && !o.getSecurity().isEmpty()) {
    	this.security = CodingHelper.fromArray2Array(o.getSecurity());
    }
    if (null != o.getTag() && !o.getTag().isEmpty()) {
    	this.tag = CodingHelper.fromArray2Array(o.getTag());
    }
  }

  public void setVersionId( String value) {
    this.versionId = value;
  }
  public String getVersionId() {
    return this.versionId;
  }
  public void set_versionId( Element value) {
    this._versionId = value;
  }
  public Element get_versionId() {
    return this._versionId;
  }
  public void setLastUpdated( String value) {
    this.lastUpdated = value;
  }
  public String getLastUpdated() {
    return this.lastUpdated;
  }
  public void set_lastUpdated( Element value) {
    this._lastUpdated = value;
  }
  public Element get_lastUpdated() {
    return this._lastUpdated;
  }
  public void setProfile( java.util.List<String> value) {
    this.profile = value;
  }
  public java.util.List<String> getProfile() {
    return this.profile;
  }
  public void set_profile( java.util.List<Element> value) {
    this._profile = value;
  }
  public java.util.List<Element> get_profile() {
    return this._profile;
  }
  public void setSecurity( java.util.List<Coding> value) {
    this.security = value;
  }
  public java.util.List<Coding> getSecurity() {
    return this.security;
  }
  public void setTag( java.util.List<Coding> value) {
    this.tag = value;
  }
  public java.util.List<Coding> getTag() {
    return this.tag;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Meta]:" + "\n");
     if(this.versionId != null) builder.append("versionId" + "->" + this.versionId.toString() + "\n"); 
     if(this._versionId != null) builder.append("_versionId" + "->" + this._versionId.toString() + "\n"); 
     if(this.lastUpdated != null) builder.append("lastUpdated" + "->" + this.lastUpdated.toString() + "\n"); 
     if(this._lastUpdated != null) builder.append("_lastUpdated" + "->" + this._lastUpdated.toString() + "\n"); 
     if(this.profile != null) builder.append("profile" + "->" + this.profile.toString() + "\n"); 
     if(this._profile != null) builder.append("_profile" + "->" + this._profile.toString() + "\n"); 
     if(this.security != null) builder.append("security" + "->" + this.security.toString() + "\n"); 
     if(this.tag != null) builder.append("tag" + "->" + this.tag.toString() + "\n"); ;
    return builder.toString();
  }


}