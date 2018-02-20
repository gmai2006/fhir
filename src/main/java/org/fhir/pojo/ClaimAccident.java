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
import org.fhir.entity.ClaimAccidentModel;
import com.google.gson.GsonBuilder;

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
public class ClaimAccident  extends BackboneElement  {
  /**
  * Description: "Date of an accident which these services are addressing."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Type of accident: work, auto, etc."
  */
  protected CodeableConcept type;

  /**
  * Description: "Accident Place."
  */
  protected Address locationAddress;

  /**
  * Description: "Accident Place."
  */
  protected Reference locationReference;

  public ClaimAccident() {
  }

  public ClaimAccident(ClaimAccidentModel o) {
    this.id = o.getId();
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getLocationAddress() && !o.getLocationAddress().isEmpty()) {
      this.locationAddress = new Address(o.getLocationAddress().get(0));
    }
    if (null != o.getLocationReference() && !o.getLocationReference().isEmpty()) {
      this.locationReference = new Reference(o.getLocationReference().get(0));
    }
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
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setLocationAddress( Address value) {
    this.locationAddress = value;
  }
  public Address getLocationAddress() {
    return this.locationAddress;
  }
  public void setLocationReference( Reference value) {
    this.locationReference = value;
  }
  public Reference getLocationReference() {
    return this.locationReference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimAccident]:" + "\n");
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.locationAddress != null) builder.append("locationAddress" + "->" + this.locationAddress.toString() + "\n"); 
     if(this.locationReference != null) builder.append("locationReference" + "->" + this.locationReference.toString() + "\n"); ;
    return builder.toString();
  }


}