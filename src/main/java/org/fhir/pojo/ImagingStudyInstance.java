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
import org.fhir.entity.ImagingStudyInstanceModel;
import com.google.gson.GsonBuilder;

/**
* "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
*/
public class ImagingStudyInstance  {
  /**
  * Description: "Formal identifier for this image or other content."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  private String uid;

  /**
  * Description: "Extensions for uid"
  */
  private transient Element _uid;

  /**
  * Description: "The number of instance in the series."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float number;

  /**
  * Description: "Extensions for number"
  */
  private transient Element _number;

  /**
  * Description: "DICOM instance  type."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  private String sopClass;

  /**
  * Description: "Extensions for sopClass"
  */
  private transient Element _sopClass;

  /**
  * Description: "The description of the instance."
  */
  private String title;

  /**
  * Description: "Extensions for title"
  */
  private transient Element _title;

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

  public ImagingStudyInstance() {
  }

  public ImagingStudyInstance(ImagingStudyInstanceModel o) {
    this.id = o.getId();
      if (null != o.getUid()) {
        this.uid = new String(o.getUid());
      }

      if (null != o.getNumber()) {
        this.number = new Float(o.getNumber());
      }

      if (null != o.getSopClass()) {
        this.sopClass = new String(o.getSopClass());
      }

      if (null != o.getTitle()) {
        this.title = new String(o.getTitle());
      }

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
  public void setNumber( Float value) {
    this.number = value;
  }
  public Float getNumber() {
    return this.number;
  }
  public void set_number( Element value) {
    this._number = value;
  }
  public Element get_number() {
    return this._number;
  }
  public void setSopClass( String value) {
    this.sopClass = value;
  }
  public String getSopClass() {
    return this.sopClass;
  }
  public void set_sopClass( Element value) {
    this._sopClass = value;
  }
  public Element get_sopClass() {
    return this._sopClass;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void set_title( Element value) {
    this._title = value;
  }
  public Element get_title() {
    return this._title;
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
     builder.append("number" + "[" + String.valueOf(this.number) + "]\n"); 
     builder.append("_number" + "[" + String.valueOf(this._number) + "]\n"); 
     builder.append("sopClass" + "[" + String.valueOf(this.sopClass) + "]\n"); 
     builder.append("_sopClass" + "[" + String.valueOf(this._sopClass) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("_title" + "[" + String.valueOf(this._title) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ImagingStudyInstance> fromArray(java.util.List<ImagingStudyInstanceModel> list) {
    return (java.util.List<ImagingStudyInstance>)list.stream()
      .map(model -> new ImagingStudyInstance(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ImagingStudyInstanceModel> toModelArray(java.util.List<ImagingStudyInstance> list) {
    return (java.util.List<ImagingStudyInstanceModel>)list.stream()
      .map(model -> new ImagingStudyInstanceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ImagingStudyInstance fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ImagingStudyInstance.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ImagingStudyInstance o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ImagingStudyInstance> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}