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
import org.fhir.entity.ImagingManifestSeriesModel;
import com.google.gson.GsonBuilder;

/**
* "A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection."
*/
public class ImagingManifestSeries  {
  /**
  * Description: "Series instance UID of the SOP instances in the selection."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  private String uid;

  /**
  * Description: "Extensions for uid"
  */
  private transient Element _uid;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type."
  */
  private java.util.List<Reference> endpoint = new java.util.ArrayList<>();

  /**
  * Description: "Identity and locating information of the selected DICOM SOP instances."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<ImagingManifestInstance> instance = new java.util.ArrayList<>();

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

  public ImagingManifestSeries() {
  }

  public ImagingManifestSeries(ImagingManifestSeriesModel o) {
    this.id = o.getId();
      if (null != o.getUid()) {
        this.uid = new String(o.getUid());
      }

      this.endpoint = Reference.fromArray(o.getEndpoint());

      this.instance = ImagingManifestInstance.fromArray(o.getInstance());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setUid( String value) {
    this.uid = value;
  }
  public String getUid() {
    return this.uid;
  }
  public void set_uid( Element value) {
    this._uid = value;
  }
  public Element get_uid() {
    return this._uid;
  }
  public void setEndpoint( java.util.List<Reference> value) {
    this.endpoint = value;
  }
  public java.util.List<Reference> getEndpoint() {
    return this.endpoint;
  }
  public void setInstance( java.util.List<ImagingManifestInstance> value) {
    this.instance = value;
  }
  public java.util.List<ImagingManifestInstance> getInstance() {
    return this.instance;
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
     builder.append("uid" + "[" + String.valueOf(this.uid) + "]\n"); 
     builder.append("_uid" + "[" + String.valueOf(this._uid) + "]\n"); 
     builder.append("endpoint" + "[" + String.valueOf(this.endpoint) + "]\n"); 
     builder.append("instance" + "[" + String.valueOf(this.instance) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ImagingManifestSeries> fromArray(java.util.List<ImagingManifestSeriesModel> list) {
    return (java.util.List<ImagingManifestSeries>)list.stream()
      .map(model -> new ImagingManifestSeries(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ImagingManifestSeriesModel> toModelArray(java.util.List<ImagingManifestSeries> list) {
    return (java.util.List<ImagingManifestSeriesModel>)list.stream()
      .map(model -> new ImagingManifestSeriesModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ImagingManifestSeries fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ImagingManifestSeries.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ImagingManifestSeries o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ImagingManifestSeries> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}