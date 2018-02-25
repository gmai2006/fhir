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
import org.fhir.entity.ImagingStudyInstanceModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ImagingStudyInstance  extends BackboneElement  {
  /**
  * Description: "Formal identifier for this image or other content."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String uid;

  /**
  * Description: "Extensions for uid"
  */
  protected transient Element _uid;

  /**
  * Description: "The number of instance in the series."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float number;

  /**
  * Description: "Extensions for number"
  */
  protected transient Element _number;

  /**
  * Description: "DICOM instance  type."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String sopClass;

  /**
  * Description: "Extensions for sopClass"
  */
  protected transient Element _sopClass;

  /**
  * Description: "The description of the instance."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  public ImagingStudyInstance() {
  }

  public ImagingStudyInstance(ImagingStudyInstanceModel o) {
    this.id = o.getId();
    if (null != o.getUid()) {
      this.uid = o.getUid();
    }
    if (null != o.getNumber()) {
      this.number = o.getNumber();
    }
    if (null != o.getSopClass()) {
      this.sopClass = o.getSopClass();
    }
    if (null != o.getTitle()) {
      this.title = o.getTitle();
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
  public void setSopClass( String value) {
    this.sopClass = value;
  }
  public String getSopClass() {
    return this.sopClass;
  }
  public void set_sopClass( Element value) {
    this._sopClass = value;
  }
  public Element get_sopClass() {
    return this._sopClass;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void set_title( Element value) {
    this._title = value;
  }
  public Element get_title() {
    return this._title;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImagingStudyInstance]:" + "\n");
     if(this.uid != null) builder.append("uid" + "->" + this.uid.toString() + "\n"); 
     if(this._uid != null) builder.append("_uid" + "->" + this._uid.toString() + "\n"); 
     if(this.number != null) builder.append("number" + "->" + this.number.toString() + "\n"); 
     if(this._number != null) builder.append("_number" + "->" + this._number.toString() + "\n"); 
     if(this.sopClass != null) builder.append("sopClass" + "->" + this.sopClass.toString() + "\n"); 
     if(this._sopClass != null) builder.append("_sopClass" + "->" + this._sopClass.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); ;
    return builder.toString();
  }


}