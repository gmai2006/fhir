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
import org.fhir.entity.FHIRListModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A set of information summarized from a list of other resources."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FHIRList  extends DomainResource  {
  /**
  * Description: "This is a List resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier for the List assigned for business purposes outside the context of FHIR."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Indicates the current state of this list."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "How this list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted."
  */
  protected String mode;

  /**
  * Description: "Extensions for mode"
  */
  protected transient Element _mode;

  /**
  * Description: "A label for the list assigned by the author."
  */
  protected String title;

  /**
  * Description: "Extensions for title"
  */
  protected transient Element _title;

  /**
  * Description: "This code defines the purpose of the list - why it was created."
  */
  protected CodeableConcept code;

  /**
  * Description: "The common subject (or patient) of the resources that are in the list, if there is one."
  */
  protected Reference subject;

  /**
  * Description: "The encounter that is the context in which this list was created."
  */
  protected Reference encounter;

  /**
  * Description: "The date that the list was prepared."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "The entity responsible for deciding what the contents of the list were. Where the list was created by a human, this is the same as the author of the list."
  */
  protected Reference source;

  /**
  * Description: "What order applies to the items in the list."
  */
  protected CodeableConcept orderedBy;

  /**
  * Description: "Comments that apply to the overall list."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Entries in this list."
  */
  protected java.util.List<ListEntry> entry;

  /**
  * Description: "If the list is empty, why the list is empty."
  */
  protected CodeableConcept emptyReason;

  public FHIRList() {
  }

  public FHIRList(FHIRListModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getMode()) {
      this.mode = o.getMode();
    }
    if (null != o.getTitle()) {
      this.title = o.getTitle();
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
      this.code = new CodeableConcept(o.getCode().get(0));
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getEncounter() && !o.getEncounter().isEmpty()) {
      this.encounter = new Reference(o.getEncounter().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getSource() && !o.getSource().isEmpty()) {
      this.source = new Reference(o.getSource().get(0));
    }
    if (null != o.getOrderedBy() && !o.getOrderedBy().isEmpty()) {
      this.orderedBy = new CodeableConcept(o.getOrderedBy().get(0));
    }
    if (o.getNote() != null) {
    	this.note = org.fhir.utils.JsonUtils.json2Array(o.getNote());
    }
    if (null != o.getEntry() && !o.getEntry().isEmpty()) {
    	this.entry = ListEntryHelper.fromArray2Array(o.getEntry());
    }
    if (null != o.getEmptyReason() && !o.getEmptyReason().isEmpty()) {
      this.emptyReason = new CodeableConcept(o.getEmptyReason().get(0));
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setMode( String value) {
    this.mode = ModeEnum.fromCode(value);
  }
  public String getMode() {
    return this.mode;
  }
  public void set_mode( Element value) {
    this._mode = value;
  }
  public Element get_mode() {
    return this._mode;
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
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setEncounter( Reference value) {
    this.encounter = value;
  }
  public Reference getEncounter() {
    return this.encounter;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setSource( Reference value) {
    this.source = value;
  }
  public Reference getSource() {
    return this.source;
  }
  public void setOrderedBy( CodeableConcept value) {
    this.orderedBy = value;
  }
  public CodeableConcept getOrderedBy() {
    return this.orderedBy;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setEntry( java.util.List<ListEntry> value) {
    this.entry = value;
  }
  public java.util.List<ListEntry> getEntry() {
    return this.entry;
  }
  public void setEmptyReason( CodeableConcept value) {
    this.emptyReason = value;
  }
  public CodeableConcept getEmptyReason() {
    return this.emptyReason;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[FHIRList]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.mode != null) builder.append("mode" + "->" + this.mode.toString() + "\n"); 
     if(this._mode != null) builder.append("_mode" + "->" + this._mode.toString() + "\n"); 
     if(this.title != null) builder.append("title" + "->" + this.title.toString() + "\n"); 
     if(this._title != null) builder.append("_title" + "->" + this._title.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.encounter != null) builder.append("encounter" + "->" + this.encounter.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this.orderedBy != null) builder.append("orderedBy" + "->" + this.orderedBy.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.entry != null) builder.append("entry" + "->" + this.entry.toString() + "\n"); 
     if(this.emptyReason != null) builder.append("emptyReason" + "->" + this.emptyReason.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	FHIRList,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "List" : { return FHIRList.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	current,
  	retired,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "current" : { return current.toString(); }
  			case "retired" : { return retired.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ModeEnum {
  	working,
  	snapshot,
  	changes,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "working" : { return working.toString(); }
  			case "snapshot" : { return snapshot.toString(); }
  			case "changes" : { return changes.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}