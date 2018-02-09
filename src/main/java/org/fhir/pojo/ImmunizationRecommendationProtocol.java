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
import org.fhir.entity.ImmunizationRecommendationProtocolModel;
import com.google.gson.GsonBuilder;

/**
* "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification."
*/
public class ImmunizationRecommendationProtocol  {
  /**
  * Description: "Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float doseSequence;

  /**
  * Description: "Extensions for doseSequence"
  */
  private transient Element _doseSequence;

  /**
  * Description: "Contains the description about the protocol under which the vaccine was administered."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Indicates the authority who published the protocol.  For example, ACIP."
  */
  private Reference authority;

  /**
  * Description: "One possible path to achieve presumed immunity against a disease - within the context of an authority."
  */
  private String series;

  /**
  * Description: "Extensions for series"
  */
  private transient Element _series;

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

  public ImmunizationRecommendationProtocol() {
  }

  public ImmunizationRecommendationProtocol(ImmunizationRecommendationProtocolModel o) {
    this.id = o.getId();
      if (null != o.getDoseSequence()) {
        this.doseSequence = new Float(o.getDoseSequence());
      }

      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getAuthority()) {
        this.authority = new Reference(o.getAuthority());
        this.authority.setId(this.getId());
      }

      if (null != o.getSeries()) {
        this.series = new String(o.getSeries());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setDoseSequence( Float value) {
    this.doseSequence = value;
  }
  public Float getDoseSequence() {
    return this.doseSequence;
  }
  public void set_doseSequence( Element value) {
    this._doseSequence = value;
  }
  public Element get_doseSequence() {
    return this._doseSequence;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setAuthority( Reference value) {
    this.authority = value;
  }
  public Reference getAuthority() {
    return this.authority;
  }
  public void setSeries( String value) {
    this.series = value;
  }
  public String getSeries() {
    return this.series;
  }
  public void set_series( Element value) {
    this._series = value;
  }
  public Element get_series() {
    return this._series;
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
     builder.append("doseSequence" + "[" + String.valueOf(this.doseSequence) + "]\n"); 
     builder.append("_doseSequence" + "[" + String.valueOf(this._doseSequence) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("authority" + "[" + String.valueOf(this.authority) + "]\n"); 
     builder.append("series" + "[" + String.valueOf(this.series) + "]\n"); 
     builder.append("_series" + "[" + String.valueOf(this._series) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ImmunizationRecommendationProtocol> fromArray(java.util.List<ImmunizationRecommendationProtocolModel> list) {
    return (java.util.List<ImmunizationRecommendationProtocol>)list.stream()
      .map(model -> new ImmunizationRecommendationProtocol(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ImmunizationRecommendationProtocolModel> toModelArray(java.util.List<ImmunizationRecommendationProtocol> list) {
    return (java.util.List<ImmunizationRecommendationProtocolModel>)list.stream()
      .map(model -> new ImmunizationRecommendationProtocolModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ImmunizationRecommendationProtocol fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ImmunizationRecommendationProtocol.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ImmunizationRecommendationProtocol o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ImmunizationRecommendationProtocol> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}