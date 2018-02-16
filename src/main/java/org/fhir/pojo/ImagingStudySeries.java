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
public class ImagingStudySeries  extends BackboneElement  {
  /**
  * Description: "Formal identifier for this series."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String uid;

  /**
  * Description: "Extensions for uid"
  */
  protected transient Element _uid;

  /**
  * Description: "The numeric identifier of this series in the study."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float number;

  /**
  * Description: "Extensions for number"
  */
  protected transient Element _number;

  /**
  * Description: "The modality of this series sequence."
  */
  @javax.validation.constraints.NotNull
  protected Coding modality;

  /**
  * Description: "A description of the series."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Number of SOP Instances in the Study. The value given may be larger than the number of instance elements this resource contains due to resource availability, security, or other factors. This element should be present if any instance elements are present."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float numberOfInstances;

  /**
  * Description: "Extensions for numberOfInstances"
  */
  protected transient Element _numberOfInstances;

  /**
  * Description: "Availability of series (online, offline or nearline)."
  */
  protected String availability;

  /**
  * Description: "Extensions for availability"
  */
  protected transient Element _availability;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type."
  */
  protected java.util.List<Reference> endpoint = new java.util.ArrayList<>();

  /**
  * Description: "The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.laterality."
  */
  protected Coding bodySite;

  /**
  * Description: "The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite."
  */
  protected Coding laterality;

  /**
  * Description: "The date and time the series was started."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String started;

  /**
  * Description: "Extensions for started"
  */
  protected transient Element _started;

  /**
  * Description: "The physician or operator (often the radiology technician)  who performed the series. The performer is recorded at the series level, since each series in a study may be performed by a different practitioner, at different times, and using different devices. A series may be performed by multiple practitioners."
  */
  protected java.util.List<Reference> performer = new java.util.ArrayList<>();

  /**
  * Description: "A single SOP instance within the series, e.g. an image, or presentation state."
  */
  protected java.util.List<ImagingStudyInstance> instance = new java.util.ArrayList<>();

  public ImagingStudySeries() {
  }

  public ImagingStudySeries(ImagingStudySeriesModel o) {
    this.id = o.getId();
    if (null != o.getUid()) {
      this.uid = o.getUid();
    }
    if (null != o.getNumber()) {
      this.number = o.getNumber();
    }
    this.modality = CodingHelper.fromJson(o.getModality());
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getNumberOfInstances()) {
      this.numberOfInstances = o.getNumberOfInstances();
    }
    if (null != o.getAvailability()) {
      this.availability = o.getAvailability();
    }
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint = ReferenceHelper.fromArray2Array(o.getEndpoint());
    }
    this.bodySite = CodingHelper.fromJson(o.getBodySite());
    this.laterality = CodingHelper.fromJson(o.getLaterality());
    if (null != o.getStarted()) {
      this.started = o.getStarted();
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
    	this.performer = ReferenceHelper.fromArray2Array(o.getPerformer());
    }
    if (null != o.getInstance() && !o.getInstance().isEmpty()) {
    	this.instance = ImagingStudyInstanceHelper.fromArray2Array(o.getInstance());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImagingStudySeries]:" + "\n");
     if(this.uid != null) builder.append("uid" + "->" + this.uid.toString() + "\n"); 
     if(this._uid != null) builder.append("_uid" + "->" + this._uid.toString() + "\n"); 
     if(this.number != null) builder.append("number" + "->" + this.number.toString() + "\n"); 
     if(this._number != null) builder.append("_number" + "->" + this._number.toString() + "\n"); 
     if(this.modality != null) builder.append("modality" + "->" + this.modality.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.numberOfInstances != null) builder.append("numberOfInstances" + "->" + this.numberOfInstances.toString() + "\n"); 
     if(this._numberOfInstances != null) builder.append("_numberOfInstances" + "->" + this._numberOfInstances.toString() + "\n"); 
     if(this.availability != null) builder.append("availability" + "->" + this.availability.toString() + "\n"); 
     if(this._availability != null) builder.append("_availability" + "->" + this._availability.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); 
     if(this.bodySite != null) builder.append("bodySite" + "->" + this.bodySite.toString() + "\n"); 
     if(this.laterality != null) builder.append("laterality" + "->" + this.laterality.toString() + "\n"); 
     if(this.started != null) builder.append("started" + "->" + this.started.toString() + "\n"); 
     if(this._started != null) builder.append("_started" + "->" + this._started.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.instance != null) builder.append("instance" + "->" + this.instance.toString() + "\n"); ;
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

}