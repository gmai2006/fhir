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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
@Entity
@Table(name="claimresponsedetail")
public class ClaimResponseDetailModel  implements Serializable {
	private static final long serialVersionUID = 151873631130744896L;
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequenceLinkId\"")
  private Float sequenceLinkId;

  /**
  * Description: "A list of note references to the notes provided below."
  */
  @javax.persistence.Basic
  @Column(name="\"noteNumber\"")
  private String noteNumber;

  /**
  * Description: "The adjudications results."
  */
  @javax.persistence.Basic
  @Column(name="\"adjudication_id\"")
  private String adjudication_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="adjudication_id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseAdjudicationModel> adjudication;

  /**
  * Description: "The third tier service adjudications for submitted services."
  */
  @javax.persistence.Basic
  @Column(name="\"subdetail_id\"")
  private String subdetail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subdetail_id", insertable=false, updatable=false)
  private java.util.List<ClaimResponseSubDetailModel> subDetail;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public ClaimResponseDetailModel() {
  }

  public ClaimResponseDetailModel(ClaimResponseDetail o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.sequenceLinkId = o.getSequenceLinkId();
    this.noteNumber = org.fhir.utils.JsonUtils.write2String(o.getNoteNumber());
    if (null != o.getAdjudication() && !o.getAdjudication().isEmpty()) {
    	this.adjudication_id = "adjudication" + this.parent_id;
    	this.adjudication = ClaimResponseAdjudicationHelper.toModelFromArray(o.getAdjudication(), this.adjudication_id);
    }
    if (null != o.getSubDetail() && !o.getSubDetail().isEmpty()) {
    	this.subdetail_id = "subdetail" + this.parent_id;
    	this.subDetail = ClaimResponseSubDetailHelper.toModelFromArray(o.getSubDetail(), this.subdetail_id);
    }
  }

  public Float getSequenceLinkId() {
    return this.sequenceLinkId;
  }
  public void setSequenceLinkId( Float value) {
    this.sequenceLinkId = value;
  }
  public String getNoteNumber() {
    return this.noteNumber;
  }
  public void setNoteNumber( String value) {
    this.noteNumber = value;
  }
  public java.util.List<ClaimResponseAdjudicationModel> getAdjudication() {
    return this.adjudication;
  }
  public void setAdjudication( java.util.List<ClaimResponseAdjudicationModel> value) {
    this.adjudication = value;
  }
  public java.util.List<ClaimResponseSubDetailModel> getSubDetail() {
    return this.subDetail;
  }
  public void setSubDetail( java.util.List<ClaimResponseSubDetailModel> value) {
    this.subDetail = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseDetailModel]:" + "\n");
     builder.append("sequenceLinkId" + "->" + this.sequenceLinkId + "\n"); 
     builder.append("noteNumber" + "->" + this.noteNumber + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseDetailModel]:" + "\n");
     builder.append("sequenceLinkId" + "->" + this.sequenceLinkId + "\n"); 
     builder.append("noteNumber" + "->" + this.noteNumber + "\n"); 
     builder.append("adjudication" + "->" + this.adjudication + "\n"); 
     builder.append("subDetail" + "->" + this.subDetail + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}