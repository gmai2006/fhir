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
public class DeviceMetric  {
  /**
  * Description: "This is a DeviceMetric resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device."
  */
  @javax.validation.constraints.NotNull
  private Identifier identifier;

  /**
  * Description: "Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept type;

  /**
  * Description: "Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc."
  */
  private CodeableConcept unit;

  /**
  * Description: "Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacturer, serial number, etc."
  */
  private Reference source;

  /**
  * Description: "Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location."
  */
  private Reference parent;

  /**
  * Description: "Indicates current operational state of the device. For example: On, Off, Standby, etc."
  */
  private String operationalStatus;

  /**
  * Description: "Extensions for operationalStatus"
  */
  private transient Element _operationalStatus;

  /**
  * Description: "Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta."
  */
  private String color;

  /**
  * Description: "Extensions for color"
  */
  private transient Element _color;

  /**
  * Description: "Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation."
  */
  private String category;

  /**
  * Description: "Extensions for category"
  */
  private transient Element _category;

  /**
  * Description: "Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured."
  */
  private Timing measurementPeriod;

  /**
  * Description: "Describes the calibrations that have been performed or that are required to be performed."
  */
  private java.util.List<DeviceMetricCalibration> calibration = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public DeviceMetric() {
  }

  public DeviceMetric(DeviceMetricModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      this.type = CodeableConcept.fromJson(o.getType());
      this.unit = CodeableConcept.fromJson(o.getUnit());
      if (null != o.getSource()) {
        this.source = new Reference(o.getSource());
        this.source.setId(this.getId());
      }

      if (null != o.getParent()) {
        this.parent = new Reference(o.getParent());
        this.parent.setId(this.getId());
      }

      if (null != o.getOperationalStatus()) {
        this.operationalStatus = new String(o.getOperationalStatus());
      }

      if (null != o.getColor()) {
        this.color = new String(o.getColor());
      }

      if (null != o.getCategory()) {
        this.category = new String(o.getCategory());
      }

      this.measurementPeriod = Timing.fromJson(o.getMeasurementPeriod());
      this.calibration = DeviceMetricCalibration.fromArray(o.getCalibration());

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("unit" + "[" + String.valueOf(this.unit) + "]\n"); 
     builder.append("source" + "[" + String.valueOf(this.source) + "]\n"); 
     builder.append("parent" + "[" + String.valueOf(this.parent) + "]\n"); 
     builder.append("operationalStatus" + "[" + String.valueOf(this.operationalStatus) + "]\n"); 
     builder.append("_operationalStatus" + "[" + String.valueOf(this._operationalStatus) + "]\n"); 
     builder.append("color" + "[" + String.valueOf(this.color) + "]\n"); 
     builder.append("_color" + "[" + String.valueOf(this._color) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("_category" + "[" + String.valueOf(this._category) + "]\n"); 
     builder.append("measurementPeriod" + "[" + String.valueOf(this.measurementPeriod) + "]\n"); 
     builder.append("calibration" + "[" + String.valueOf(this.calibration) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
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

  public static java.util.List<DeviceMetric> fromArray(java.util.List<DeviceMetricModel> list) {
    return (java.util.List<DeviceMetric>)list.stream()
      .map(model -> new DeviceMetric(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DeviceMetricModel> toModelArray(java.util.List<DeviceMetric> list) {
    return (java.util.List<DeviceMetricModel>)list.stream()
      .map(model -> new DeviceMetricModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static DeviceMetric fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DeviceMetric.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DeviceMetric o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DeviceMetric> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}