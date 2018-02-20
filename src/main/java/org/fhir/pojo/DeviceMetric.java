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
import org.fhir.entity.DeviceMetricModel;
import com.google.gson.GsonBuilder;

/**
* "Describes a measurement, calculation or setting capability of a medical device."
*/
public class DeviceMetric  extends DomainResource  {
  /**
  * Description: "This is a DeviceMetric resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device."
  */
  @javax.validation.constraints.NotNull
  protected Identifier identifier;

  /**
  * Description: "Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept type;

  /**
  * Description: "Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc."
  */
  protected CodeableConcept unit;

  /**
  * Description: "Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacturer, serial number, etc."
  */
  protected Reference source;

  /**
  * Description: "Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location."
  */
  protected Reference parent;

  /**
  * Description: "Indicates current operational state of the device. For example: On, Off, Standby, etc."
  */
  protected String operationalStatus;

  /**
  * Description: "Extensions for operationalStatus"
  */
  protected transient Element _operationalStatus;

  /**
  * Description: "Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta."
  */
  protected String color;

  /**
  * Description: "Extensions for color"
  */
  protected transient Element _color;

  /**
  * Description: "Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation."
  */
  protected String category;

  /**
  * Description: "Extensions for category"
  */
  protected transient Element _category;

  /**
  * Description: "Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured."
  */
  protected Timing measurementPeriod;

  /**
  * Description: "Describes the calibrations that have been performed or that are required to be performed."
  */
  protected java.util.List<DeviceMetricCalibration> calibration = new java.util.ArrayList<>();

  public DeviceMetric() {
  }

  public DeviceMetric(DeviceMetricModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getUnit() && !o.getUnit().isEmpty()) {
      this.unit = new CodeableConcept(o.getUnit().get(0));
    }
    if (null != o.getSource() && !o.getSource().isEmpty()) {
      this.source = new Reference(o.getSource().get(0));
    }
    if (null != o.getParent() && !o.getParent().isEmpty()) {
      this.parent = new Reference(o.getParent().get(0));
    }
    if (null != o.getOperationalStatus()) {
      this.operationalStatus = o.getOperationalStatus();
    }
    if (null != o.getColor()) {
      this.color = o.getColor();
    }
    if (null != o.getCategory()) {
      this.category = o.getCategory();
    }
    this.measurementPeriod = TimingHelper.fromJson(o.getMeasurementPeriod());
    if (null != o.getCalibration() && !o.getCalibration().isEmpty()) {
    	this.calibration = DeviceMetricCalibrationHelper.fromArray2Array(o.getCalibration());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setUnit( CodeableConcept value) {
    this.unit = value;
  }
  public CodeableConcept getUnit() {
    return this.unit;
  }
  public void setSource( Reference value) {
    this.source = value;
  }
  public Reference getSource() {
    return this.source;
  }
  public void setParent( Reference value) {
    this.parent = value;
  }
  public Reference getParent() {
    return this.parent;
  }
  public void setOperationalStatus( String value) {
    this.operationalStatus = OperationalStatusEnum.fromCode(value);
  }
  public String getOperationalStatus() {
    return this.operationalStatus;
  }
  public void set_operationalStatus( Element value) {
    this._operationalStatus = value;
  }
  public Element get_operationalStatus() {
    return this._operationalStatus;
  }
  public void setColor( String value) {
    this.color = ColorEnum.fromCode(value);
  }
  public String getColor() {
    return this.color;
  }
  public void set_color( Element value) {
    this._color = value;
  }
  public Element get_color() {
    return this._color;
  }
  public void setCategory( String value) {
    this.category = CategoryEnum.fromCode(value);
  }
  public String getCategory() {
    return this.category;
  }
  public void set_category( Element value) {
    this._category = value;
  }
  public Element get_category() {
    return this._category;
  }
  public void setMeasurementPeriod( Timing value) {
    this.measurementPeriod = value;
  }
  public Timing getMeasurementPeriod() {
    return this.measurementPeriod;
  }
  public void setCalibration( java.util.List<DeviceMetricCalibration> value) {
    this.calibration = value;
  }
  public java.util.List<DeviceMetricCalibration> getCalibration() {
    return this.calibration;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceMetric]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.unit != null) builder.append("unit" + "->" + this.unit.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this.parent != null) builder.append("parent" + "->" + this.parent.toString() + "\n"); 
     if(this.operationalStatus != null) builder.append("operationalStatus" + "->" + this.operationalStatus.toString() + "\n"); 
     if(this._operationalStatus != null) builder.append("_operationalStatus" + "->" + this._operationalStatus.toString() + "\n"); 
     if(this.color != null) builder.append("color" + "->" + this.color.toString() + "\n"); 
     if(this._color != null) builder.append("_color" + "->" + this._color.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this._category != null) builder.append("_category" + "->" + this._category.toString() + "\n"); 
     if(this.measurementPeriod != null) builder.append("measurementPeriod" + "->" + this.measurementPeriod.toString() + "\n"); 
     if(this.calibration != null) builder.append("calibration" + "->" + this.calibration.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	DeviceMetric,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "DeviceMetric" : { return DeviceMetric.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum OperationalStatusEnum {
  	on,
  	off,
  	standby,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "on" : { return on.toString(); }
  			case "off" : { return off.toString(); }
  			case "standby" : { return standby.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ColorEnum {
  	black,
  	red,
  	green,
  	yellow,
  	blue,
  	magenta,
  	cyan,
  	white,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "black" : { return black.toString(); }
  			case "red" : { return red.toString(); }
  			case "green" : { return green.toString(); }
  			case "yellow" : { return yellow.toString(); }
  			case "blue" : { return blue.toString(); }
  			case "magenta" : { return magenta.toString(); }
  			case "cyan" : { return cyan.toString(); }
  			case "white" : { return white.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum CategoryEnum {
  	measurement,
  	setting,
  	calculation,
  	unspecified,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "measurement" : { return measurement.toString(); }
  			case "setting" : { return setting.toString(); }
  			case "calculation" : { return calculation.toString(); }
  			case "unspecified" : { return unspecified.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}