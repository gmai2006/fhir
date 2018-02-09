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
import org.fhir.entity.ImagingStudySeriesModel;
import com.google.gson.GsonBuilder;

/**
* "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
*/
public class ImagingStudySeries  {
  /**
  * Description: "Formal identifier for this series."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  private String uid;

  /**
  * Description: "Extensions for uid"
  */
  private transient Element _uid;

  /**
  * Description: "The numeric identifier of this series in the study."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float number;

  /**
  * Description: "Extensions for number"
  */
  private transient Element _number;

  /**
  * Description: "The modality of this series sequence."
  */
  @javax.validation.constraints.NotNull
  private Coding modality;

  /**
  * Description: "A description of the series."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Number of SOP Instances in the Study. The value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float numberOfInstances;

  /**
  * Description: "Extensions for numberOfInstances"
  */
  private transient Element _numberOfInstances;

  /**
  * Description: "Availability of series (online, offline or nearline)."
  */
  private String availability;

  /**
  * Description: "Extensions for availability"
  */
  private transient Element _availability;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type."
  */
  private java.util.List<Reference> endpoint = new java.util.ArrayList<>();

  /**
  * Description: "The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.laterality."
  */
  private Coding bodySite;

  /**
  * Description: "The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite."
  */
  private Coding laterality;

  /**
  * Description: "The date and time the series was started."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String started;

  /**
  * Description: "Extensions for started"
  */
  private transient Element _started;

  /**
  * Description: "The physician or operator (often the radiology technician)  who performed the series. The performer is recorded at the series level, since each series in a study may be performed by a different practitioner, at different times, and using different devices. A series may be performed by multiple practitioners."
  */
  private java.util.List<Reference> performer = new java.util.ArrayList<>();

  /**
  * Description: "A single SOP instance within the series, e.g. an image, or presentation state."
  */
  private java.util.List<ImagingStudyInstance> instance = new java.util.ArrayList<>();

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

  public ImagingStudySeries() {
  }

  public ImagingStudySeries(ImagingStudySeriesModel o) {
    this.id = o.getId();
      if (null != o.getUid()) {
        this.uid = new String(o.getUid());
      }

      if (null != o.getNumber()) {
        this.number = new Float(o.getNumber());
      }

      this.modality = Coding.fromJson(o.getModality());
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      if (null != o.getNumberOfInstances()) {
        this.numberOfInstances = new Float(o.getNumberOfInstances());
      }

      if (null != o.getAvailability()) {
        this.availability = new String(o.getAvailability());
      }

      this.endpoint = Reference.fromArray(o.getEndpoint());

      this.bodySite = Coding.fromJson(o.getBodySite());
      this.laterality = Coding.fromJson(o.getLaterality());
      if (null != o.getStarted()) {
        this.started = new String(o.getStarted());
      }

      this.performer = Reference.fromArray(o.getPerformer());

      this.instance = ImagingStudyInstance.fromArray(o.getInstance());

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
  public void setModality( Coding value) {
    this.modality = value;
  }
  public Coding getModality() {
    return this.modality;
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
  public void setNumberOfInstances( Float value) {
    this.numberOfInstances = value;
  }
  public Float getNumberOfInstances() {
    return this.numberOfInstances;
  }
  public void set_numberOfInstances( Element value) {
    this._numberOfInstances = value;
  }
  public Element get_numberOfInstances() {
    return this._numberOfInstances;
  }
  public void setAvailability( String value) {
    this.availability = AvailabilityEnum.fromCode(value);
  }
  public String getAvailability() {
    return this.availability;
  }
  public void set_availability( Element value) {
    this._availability = value;
  }
  public Element get_availability() {
    return this._availability;
  }
  public void setEndpoint( java.util.List<Reference> value) {
    this.endpoint = value;
  }
  public java.util.List<Reference> getEndpoint() {
    return this.endpoint;
  }
  public void setBodySite( Coding value) {
    this.bodySite = value;
  }
  public Coding getBodySite() {
    return this.bodySite;
  }
  public void setLaterality( Coding value) {
    this.laterality = value;
  }
  public Coding getLaterality() {
    return this.laterality;
  }
  public void setStarted( String value) {
    this.started = value;
  }
  public String getStarted() {
    return this.started;
  }
  public void set_started( Element value) {
    this._started = value;
  }
  public Element get_started() {
    return this._started;
  }
  public void setPerformer( java.util.List<Reference> value) {
    this.performer = value;
  }
  public java.util.List<Reference> getPerformer() {
    return this.performer;
  }
  public void setInstance( java.util.List<ImagingStudyInstance> value) {
    this.instance = value;
  }
  public java.util.List<ImagingStudyInstance> getInstance() {
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
     builder.append("number" + "[" + String.valueOf(this.number) + "]\n"); 
     builder.append("_number" + "[" + String.valueOf(this._number) + "]\n"); 
     builder.append("modality" + "[" + String.valueOf(this.modality) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("numberOfInstances" + "[" + String.valueOf(this.numberOfInstances) + "]\n"); 
     builder.append("_numberOfInstances" + "[" + String.valueOf(this._numberOfInstances) + "]\n"); 
     builder.append("availability" + "[" + String.valueOf(this.availability) + "]\n"); 
     builder.append("_availability" + "[" + String.valueOf(this._availability) + "]\n"); 
     builder.append("endpoint" + "[" + String.valueOf(this.endpoint) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("laterality" + "[" + String.valueOf(this.laterality) + "]\n"); 
     builder.append("started" + "[" + String.valueOf(this.started) + "]\n"); 
     builder.append("_started" + "[" + String.valueOf(this._started) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("instance" + "[" + String.valueOf(this.instance) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum AvailabilityEnum {
  	ONLINE,
  	OFFLINE,
  	NEARLINE,
  	UNAVAILABLE,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "ONLINE" : { return ONLINE.toString(); }
  			case "OFFLINE" : { return OFFLINE.toString(); }
  			case "NEARLINE" : { return NEARLINE.toString(); }
  			case "UNAVAILABLE" : { return UNAVAILABLE.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ImagingStudySeries> fromArray(java.util.List<ImagingStudySeriesModel> list) {
    return (java.util.List<ImagingStudySeries>)list.stream()
      .map(model -> new ImagingStudySeries(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ImagingStudySeriesModel> toModelArray(java.util.List<ImagingStudySeries> list) {
    return (java.util.List<ImagingStudySeriesModel>)list.stream()
      .map(model -> new ImagingStudySeriesModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ImagingStudySeries fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ImagingStudySeries.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ImagingStudySeries o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ImagingStudySeries> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}