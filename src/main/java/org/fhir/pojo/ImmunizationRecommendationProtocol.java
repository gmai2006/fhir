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
  @javax.validation.constraints.NotNull
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
      this.doseSequence = o.getDoseSequence();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getAuthority() && !o.getAuthority().isEmpty()) {
      this.authority = new Reference(o.getAuthority().get(0));
    }
    if (null != o.getSeries()) {
      this.series = o.getSeries();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[ImmunizationRecommendationProtocol]:" + "\n");
     if(this.doseSequence != null) builder.append("doseSequence" + "->" + this.doseSequence.toString() + "\n"); 
     if(this._doseSequence != null) builder.append("_doseSequence" + "->" + this._doseSequence.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.authority != null) builder.append("authority" + "->" + this.authority.toString() + "\n"); 
     if(this.series != null) builder.append("series" + "->" + this.series.toString() + "\n"); 
     if(this._series != null) builder.append("_series" + "->" + this._series.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}