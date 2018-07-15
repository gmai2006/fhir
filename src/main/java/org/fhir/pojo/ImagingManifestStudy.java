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
import org.fhir.entity.ImagingManifestStudyModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ImagingManifestStudy  extends BackboneElement  {
  /**
  * Description: "Study instance UID of the SOP instances in the selection."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String uid;

  /**
  * Description: "Extensions for uid"
  */
  protected transient Element _uid;

  /**
  * Description: "Reference to the Imaging Study in FHIR form."
  */
  protected Reference imagingStudy;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.type."
  */
  protected java.util.List<Reference> endpoint;

  /**
  * Description: "Series identity and locating information of the DICOM SOP instances in the selection."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<ImagingManifestSeries> series;

  public ImagingManifestStudy() {
  }

  public ImagingManifestStudy(ImagingManifestStudyModel o) {
    this.id = o.getId();
    if (null != o.getUid()) {
      this.uid = o.getUid();
    }
    if (null != o.getImagingStudy() && !o.getImagingStudy().isEmpty()) {
      this.imagingStudy = new Reference(o.getImagingStudy().get(0));
    }
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint = ReferenceHelper.fromArray2Array(o.getEndpoint());
    }
    if (null != o.getSeries() && !o.getSeries().isEmpty()) {
    	this.series = ImagingManifestSeriesHelper.fromArray2Array(o.getSeries());
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
  public void setImagingStudy( Reference value) {
    this.imagingStudy = value;
  }
  public Reference getImagingStudy() {
    return this.imagingStudy;
  }
  public void setEndpoint( java.util.List<Reference> value) {
    this.endpoint = value;
  }
  public java.util.List<Reference> getEndpoint() {
    return this.endpoint;
  }
  public void setSeries( java.util.List<ImagingManifestSeries> value) {
    this.series = value;
  }
  public java.util.List<ImagingManifestSeries> getSeries() {
    return this.series;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImagingManifestStudy]:" + "\n");
     if(this.uid != null) builder.append("uid" + "->" + this.uid.toString() + "\n"); 
     if(this._uid != null) builder.append("_uid" + "->" + this._uid.toString() + "\n"); 
     if(this.imagingStudy != null) builder.append("imagingStudy" + "->" + this.imagingStudy.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); 
     if(this.series != null) builder.append("series" + "->" + this.series.toString() + "\n"); ;
    return builder.toString();
  }


}