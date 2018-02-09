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
import com.google.gson.GsonBuilder;

/**
* "A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data."
*/
public class SampledData  {
  /**
  * Description: "The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series."
  */
  @javax.validation.constraints.NotNull
  private Quantity origin;

  /**
  * Description: "The length of time between sampling times, measured in milliseconds."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float period;

  /**
  * Description: "Extensions for period"
  */
  private transient Element _period;

  /**
  * Description: "A correction factor that is applied to the sampled data points before they are added to the origin."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float factor;

  /**
  * Description: "Extensions for factor"
  */
  private transient Element _factor;

  /**
  * Description: "The lower limit of detection of the measured points. This is needed if any of the data points have the value \"L\" (lower than detection limit)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float lowerLimit;

  /**
  * Description: "Extensions for lowerLimit"
  */
  private transient Element _lowerLimit;

  /**
  * Description: "The upper limit of detection of the measured points. This is needed if any of the data points have the value \"U\" (higher than detection limit)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float upperLimit;

  /**
  * Description: "Extensions for upperLimit"
  */
  private transient Element _upperLimit;

  /**
  * Description: "The number of sample points at each time point. If this value is greater than one, then the dimensions will be interlaced - all the sample points for a point in time will be recorded at once."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float dimensions;

  /**
  * Description: "Extensions for dimensions"
  */
  private transient Element _dimensions;

  /**
  * Description: "A series of data points which are decimal values separated by a single space (character u20). The special values \"E\" (error), \"L\" (below detection limit) and \"U\" (above detection limit) can also be used in place of a decimal value."
  */
  private String data;

  /**
  * Description: "Extensions for data"
  */
  private transient Element _data;

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

  public SampledData() {}

  public void setOrigin( Quantity value) {
    this.origin = value;
  }
  public Quantity getOrigin() {
    return this.origin;
  }
  public void setPeriod( Float value) {
    this.period = value;
  }
  public Float getPeriod() {
    return this.period;
  }
  public void set_period( Element value) {
    this._period = value;
  }
  public Element get_period() {
    return this._period;
  }
  public void setFactor( Float value) {
    this.factor = value;
  }
  public Float getFactor() {
    return this.factor;
  }
  public void set_factor( Element value) {
    this._factor = value;
  }
  public Element get_factor() {
    return this._factor;
  }
  public void setLowerLimit( Float value) {
    this.lowerLimit = value;
  }
  public Float getLowerLimit() {
    return this.lowerLimit;
  }
  public void set_lowerLimit( Element value) {
    this._lowerLimit = value;
  }
  public Element get_lowerLimit() {
    return this._lowerLimit;
  }
  public void setUpperLimit( Float value) {
    this.upperLimit = value;
  }
  public Float getUpperLimit() {
    return this.upperLimit;
  }
  public void set_upperLimit( Element value) {
    this._upperLimit = value;
  }
  public Element get_upperLimit() {
    return this._upperLimit;
  }
  public void setDimensions( Float value) {
    this.dimensions = value;
  }
  public Float getDimensions() {
    return this.dimensions;
  }
  public void set_dimensions( Element value) {
    this._dimensions = value;
  }
  public Element get_dimensions() {
    return this._dimensions;
  }
  public void setData( String value) {
    this.data = value;
  }
  public String getData() {
    return this.data;
  }
  public void set_data( Element value) {
    this._data = value;
  }
  public Element get_data() {
    return this._data;
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
     builder.append("origin" + "[" + String.valueOf(this.origin) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("_period" + "[" + String.valueOf(this._period) + "]\n"); 
     builder.append("factor" + "[" + String.valueOf(this.factor) + "]\n"); 
     builder.append("_factor" + "[" + String.valueOf(this._factor) + "]\n"); 
     builder.append("lowerLimit" + "[" + String.valueOf(this.lowerLimit) + "]\n"); 
     builder.append("_lowerLimit" + "[" + String.valueOf(this._lowerLimit) + "]\n"); 
     builder.append("upperLimit" + "[" + String.valueOf(this.upperLimit) + "]\n"); 
     builder.append("_upperLimit" + "[" + String.valueOf(this._upperLimit) + "]\n"); 
     builder.append("dimensions" + "[" + String.valueOf(this.dimensions) + "]\n"); 
     builder.append("_dimensions" + "[" + String.valueOf(this._dimensions) + "]\n"); 
     builder.append("data" + "[" + String.valueOf(this.data) + "]\n"); 
     builder.append("_data" + "[" + String.valueOf(this._data) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static SampledData fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, SampledData.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(SampledData o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<SampledData> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

}