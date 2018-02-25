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
import org.fhir.entity.ListEntryModel;
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
public class ListEntry  extends BackboneElement  {
  /**
  * Description: "The flag allows the system constructing the list to indicate the role and significance of the item in the list."
  */
  protected CodeableConcept flag;

  /**
  * Description: "True if this item is marked as deleted in the list."
  */
  protected Boolean deleted;

  /**
  * Description: "Extensions for deleted"
  */
  protected transient Element _deleted;

  /**
  * Description: "When this item was added to the list."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "A reference to the actual resource from which data was derived."
  */
  @javax.validation.constraints.NotNull
  protected Reference item;

  public ListEntry() {
  }

  public ListEntry(ListEntryModel o) {
    this.id = o.getId();
    if (null != o.getFlag() && !o.getFlag().isEmpty()) {
      this.flag = new CodeableConcept(o.getFlag().get(0));
    }
    if (null != o.getDeleted()) {
      this.deleted = o.getDeleted();
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
      this.item = new Reference(o.getItem().get(0));
    }
  }

  public void setFlag( CodeableConcept value) {
    this.flag = value;
  }
  public CodeableConcept getFlag() {
    return this.flag;
  }
  public void setDeleted( Boolean value) {
    this.deleted = value;
  }
  public Boolean getDeleted() {
    return this.deleted;
  }
  public void set_deleted( Element value) {
    this._deleted = value;
  }
  public Element get_deleted() {
    return this._deleted;
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
  public void setItem( Reference value) {
    this.item = value;
  }
  public Reference getItem() {
    return this.item;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ListEntry]:" + "\n");
     if(this.flag != null) builder.append("flag" + "->" + this.flag.toString() + "\n"); 
     if(this.deleted != null) builder.append("deleted" + "->" + this.deleted.toString() + "\n"); 
     if(this._deleted != null) builder.append("_deleted" + "->" + this._deleted.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.item != null) builder.append("item" + "->" + this.item.toString() + "\n"); ;
    return builder.toString();
  }


}