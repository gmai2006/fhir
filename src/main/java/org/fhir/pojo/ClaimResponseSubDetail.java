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
import org.fhir.entity.ClaimResponseSubDetailModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource provides the adjudication details from the processing of a Claim resource."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ClaimResponseSubDetail  extends BackboneElement  {
  /**
  * Description: "A service line number."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float sequenceLinkId;

  /**
  * Description: "Extensions for sequenceLinkId"
  */
  protected transient Element _sequenceLinkId;

  /**
  * Description: "A list of note references to the notes provided below."
  */
  protected java.util.List<Float> noteNumber;

  /**
  * Description: "Extensions for noteNumber"
  */
  protected transient java.util.List<Element> _noteNumber;

  /**
  * Description: "The adjudications results."
  */
  protected java.util.List<ClaimResponseAdjudication> adjudication;

  public ClaimResponseSubDetail() {
  }

  public ClaimResponseSubDetail(ClaimResponseSubDetailModel o) {
    this.id = o.getId();
    if (null != o.getSequenceLinkId()) {
      this.sequenceLinkId = o.getSequenceLinkId();
    }
    if (o.getNoteNumber() != null) {
    	this.noteNumber = org.fhir.utils.JsonUtils.json2Array(o.getNoteNumber());
    }
    if (null != o.getAdjudication() && !o.getAdjudication().isEmpty()) {
    	this.adjudication = ClaimResponseAdjudicationHelper.fromArray2Array(o.getAdjudication());
    }
  }

  public void setSequenceLinkId( Float value) {
    this.sequenceLinkId = value;
  }
  public Float getSequenceLinkId() {
    return this.sequenceLinkId;
  }
  public void set_sequenceLinkId( Element value) {
    this._sequenceLinkId = value;
  }
  public Element get_sequenceLinkId() {
    return this._sequenceLinkId;
  }
  public void setNoteNumber( java.util.List<Float> value) {
    this.noteNumber = value;
  }
  public java.util.List<Float> getNoteNumber() {
    return this.noteNumber;
  }
  public void set_noteNumber( java.util.List<Element> value) {
    this._noteNumber = value;
  }
  public java.util.List<Element> get_noteNumber() {
    return this._noteNumber;
  }
  public void setAdjudication( java.util.List<ClaimResponseAdjudication> value) {
    this.adjudication = value;
  }
  public java.util.List<ClaimResponseAdjudication> getAdjudication() {
    return this.adjudication;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseSubDetail]:" + "\n");
     if(this.sequenceLinkId != null) builder.append("sequenceLinkId" + "->" + this.sequenceLinkId.toString() + "\n"); 
     if(this._sequenceLinkId != null) builder.append("_sequenceLinkId" + "->" + this._sequenceLinkId.toString() + "\n"); 
     if(this.noteNumber != null) builder.append("noteNumber" + "->" + this.noteNumber.toString() + "\n"); 
     if(this._noteNumber != null) builder.append("_noteNumber" + "->" + this._noteNumber.toString() + "\n"); 
     if(this.adjudication != null) builder.append("adjudication" + "->" + this.adjudication.toString() + "\n"); ;
    return builder.toString();
  }


}