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
import org.fhir.entity.ImagingManifestSeriesModel;
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
public class ImagingManifestSeries  extends BackboneElement  {
  /**
  * Description: "Series instance UID of the SOP instances in the selection."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String uid;

  /**
  * Description: "Extensions for uid"
  */
  protected transient Element _uid;

  /**
  * Description: "The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.type."
  */
  protected java.util.List<Reference> endpoint;

  /**
  * Description: "Identity and locating information of the selected DICOM SOP instances."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<ImagingManifestInstance> instance;

  public ImagingManifestSeries() {
  }

  public ImagingManifestSeries(ImagingManifestSeriesModel o) {
    this.id = o.getId();
    if (null != o.getUid()) {
      this.uid = o.getUid();
    }
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint = ReferenceHelper.fromArray2Array(o.getEndpoint());
    }
    if (null != o.getInstance() && !o.getInstance().isEmpty()) {
    	this.instance = ImagingManifestInstanceHelper.fromArray2Array(o.getInstance());
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
  public void setEndpoint( java.util.List<Reference> value) {
    this.endpoint = value;
  }
  public java.util.List<Reference> getEndpoint() {
    return this.endpoint;
  }
  public void setInstance( java.util.List<ImagingManifestInstance> value) {
    this.instance = value;
  }
  public java.util.List<ImagingManifestInstance> getInstance() {
    return this.instance;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImagingManifestSeries]:" + "\n");
     if(this.uid != null) builder.append("uid" + "->" + this.uid.toString() + "\n"); 
     if(this._uid != null) builder.append("_uid" + "->" + this._uid.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); 
     if(this.instance != null) builder.append("instance" + "->" + this.instance.toString() + "\n"); ;
    return builder.toString();
  }


}