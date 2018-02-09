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
import org.fhir.entity.MeasureSupplementalDataModel;
import com.google.gson.GsonBuilder;

/**
* "The Measure resource provides the definition of a quality measure."
*/
public class MeasureSupplementalData  {
  /**
  * Description: "An identifier for the supplemental data."
  */
  private Identifier identifier;

  /**
  * Description: "An indicator of the intended usage for the supplemental data element. Supplemental data indicates the data is additional information requested to augment the measure information. Risk adjustment factor indicates the data is additional information used to calculate risk adjustment factors when applying a risk model to the measure calculation."
  */
  private java.util.List<CodeableConcept> usage = new java.util.ArrayList<>();

  /**
  * Description: "The criteria for the supplemental data. This must be the name of a valid expression defined within a referenced library, and defines the data to be returned for this element."
  */
  private String criteria;

  /**
  * Description: "Extensions for criteria"
  */
  private transient Element _criteria;

  /**
  * Description: "The supplemental data to be supplied as part of the measure response, specified as a valid FHIR Resource Path."
  */
  private String path;

  /**
  * Description: "Extensions for path"
  */
  private transient Element _path;

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

  public MeasureSupplementalData() {
  }

  public MeasureSupplementalData(MeasureSupplementalDataModel o) {
    this.id = o.getId();
      this.identifier = Identifier.fromJson(o.getIdentifier());
      this.usage = CodeableConcept.fromArray(o.getUsage());
      if (null != o.getCriteria()) {
        this.criteria = new String(o.getCriteria());
      }

      if (null != o.getPath()) {
        this.path = new String(o.getPath());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setUsage( java.util.List<CodeableConcept> value) {
    this.usage = value;
  }
  public java.util.List<CodeableConcept> getUsage() {
    return this.usage;
  }
  public void setCriteria( String value) {
    this.criteria = value;
  }
  public String getCriteria() {
    return this.criteria;
  }
  public void set_criteria( Element value) {
    this._criteria = value;
  }
  public Element get_criteria() {
    return this._criteria;
  }
  public void setPath( String value) {
    this.path = value;
  }
  public String getPath() {
    return this.path;
  }
  public void set_path( Element value) {
    this._path = value;
  }
  public Element get_path() {
    return this._path;
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
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("usage" + "[" + String.valueOf(this.usage) + "]\n"); 
     builder.append("criteria" + "[" + String.valueOf(this.criteria) + "]\n"); 
     builder.append("_criteria" + "[" + String.valueOf(this._criteria) + "]\n"); 
     builder.append("path" + "[" + String.valueOf(this.path) + "]\n"); 
     builder.append("_path" + "[" + String.valueOf(this._path) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<MeasureSupplementalData> fromArray(java.util.List<MeasureSupplementalDataModel> list) {
    return (java.util.List<MeasureSupplementalData>)list.stream()
      .map(model -> new MeasureSupplementalData(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MeasureSupplementalDataModel> toModelArray(java.util.List<MeasureSupplementalData> list) {
    return (java.util.List<MeasureSupplementalDataModel>)list.stream()
      .map(model -> new MeasureSupplementalDataModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MeasureSupplementalData fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MeasureSupplementalData.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MeasureSupplementalData o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MeasureSupplementalData> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}