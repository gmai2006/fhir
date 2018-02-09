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
import com.google.gson.GsonBuilder;

/**
* "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
*/
public class Meta  {
  /**
  * Description: "The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String versionId;

  /**
  * Description: "Extensions for versionId"
  */
  private transient Element _versionId;

  /**
  * Description: "When the resource last changed - e.g. when the version changed."
  */
  private String lastUpdated;

  /**
  * Description: "Extensions for lastUpdated"
  */
  private transient Element _lastUpdated;

  /**
  * Description: "A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]."
  */
  private java.util.List<String> profile = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for profile"
  */
  private transient java.util.List<Element> _profile = new java.util.ArrayList<>();

  /**
  * Description: "Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure."
  */
  private java.util.List<Coding> security = new java.util.ArrayList<>();

  /**
  * Description: "Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource."
  */
  private java.util.List<Coding> tag = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public Meta() {
  }

  public Meta(MetaModel o) {
    this.id = o.getId();
      if (null != o.getVersionId()) {
        this.versionId = new String(o.getVersionId());
      }

      if (null != o.getLastUpdated()) {
        this.lastUpdated = new String(o.getLastUpdated());
      }

      this.profile = org.fhir.utils.JsonUtils.json2Array(o.getProfile());

      this.security = Coding.fromArray(o.getSecurity());
      this.tag = Coding.fromArray(o.getTag());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("versionId" + "[" + String.valueOf(this.versionId) + "]\n"); 
     builder.append("_versionId" + "[" + String.valueOf(this._versionId) + "]\n"); 
     builder.append("lastUpdated" + "[" + String.valueOf(this.lastUpdated) + "]\n"); 
     builder.append("_lastUpdated" + "[" + String.valueOf(this._lastUpdated) + "]\n"); 
     builder.append("profile" + "[" + String.valueOf(this.profile) + "]\n"); 
     builder.append("_profile" + "[" + String.valueOf(this._profile) + "]\n"); 
     builder.append("security" + "[" + String.valueOf(this.security) + "]\n"); 
     builder.append("tag" + "[" + String.valueOf(this.tag) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<Meta> fromArray(java.util.List<MetaModel> list) {
    return (java.util.List<Meta>)list.stream()
      .map(model -> new Meta(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MetaModel> toModelArray(java.util.List<Meta> list) {
    return (java.util.List<MetaModel>)list.stream()
      .map(model -> new MetaModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Meta fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Meta.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Meta o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Meta> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}