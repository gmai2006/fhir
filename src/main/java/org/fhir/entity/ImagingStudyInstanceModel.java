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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;

/**
* "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
*/
@Entity
@Table(name="imagingstudyinstance")
public class ImagingStudyInstanceModel  {
  /**
  * Description: "Formal identifier for this image or other content."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  @javax.persistence.Basic
  @Column(name="\"uid\"")
  private String uid;

  /**
  * Description: "The number of instance in the series."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"number\"")
  private Float number;

  /**
  * Description: "DICOM instance  type."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  @javax.persistence.Basic
  @Column(name="\"sopClass\"")
  private String sopClass;

  /**
  * Description: "The description of the instance."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public ImagingStudyInstanceModel() {
  }

  public ImagingStudyInstanceModel(ImagingStudyInstance o) {
    this.id = o.getId();
      this.uid = o.getUid();

      this.number = o.getNumber();

      this.sopClass = o.getSopClass();

      this.title = o.getTitle();

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setUid( String value) {
    this.uid = value;
  }
  public String getUid() {
    return this.uid;
  }
  public void setNumber( Float value) {
    this.number = value;
  }
  public Float getNumber() {
    return this.number;
  }
  public void setSopClass( String value) {
    this.sopClass = value;
  }
  public String getSopClass() {
    return this.sopClass;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("uid" + "[" + String.valueOf(this.uid) + "]\n"); 
     builder.append("number" + "[" + String.valueOf(this.number) + "]\n"); 
     builder.append("sopClass" + "[" + String.valueOf(this.sopClass) + "]\n"); 
     builder.append("title" + "[" + String.valueOf(this.title) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}