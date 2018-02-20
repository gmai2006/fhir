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
import org.fhir.entity.ClaimProcedureModel;
import com.google.gson.GsonBuilder;

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
public class ClaimProcedure  extends BackboneElement  {
  /**
  * Description: "Sequence of procedures which serves to order and provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  protected transient Element _sequence;

  /**
  * Description: "Date and optionally time the procedure was performed ."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "The procedure code."
  */
  protected CodeableConcept procedureCodeableConcept;

  /**
  * Description: "The procedure code."
  */
  protected Reference procedureReference;

  public ClaimProcedure() {
  }

  public ClaimProcedure(ClaimProcedureModel o) {
    this.id = o.getId();
    if (null != o.getSequence()) {
      this.sequence = o.getSequence();
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getProcedureCodeableConcept() && !o.getProcedureCodeableConcept().isEmpty()) {
      this.procedureCodeableConcept = new CodeableConcept(o.getProcedureCodeableConcept().get(0));
    }
    if (null != o.getProcedureReference() && !o.getProcedureReference().isEmpty()) {
      this.procedureReference = new Reference(o.getProcedureReference().get(0));
    }
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
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
  public void setProcedureCodeableConcept( CodeableConcept value) {
    this.procedureCodeableConcept = value;
  }
  public CodeableConcept getProcedureCodeableConcept() {
    return this.procedureCodeableConcept;
  }
  public void setProcedureReference( Reference value) {
    this.procedureReference = value;
  }
  public Reference getProcedureReference() {
    return this.procedureReference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimProcedure]:" + "\n");
     if(this.sequence != null) builder.append("sequence" + "->" + this.sequence.toString() + "\n"); 
     if(this._sequence != null) builder.append("_sequence" + "->" + this._sequence.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.procedureCodeableConcept != null) builder.append("procedureCodeableConcept" + "->" + this.procedureCodeableConcept.toString() + "\n"); 
     if(this.procedureReference != null) builder.append("procedureReference" + "->" + this.procedureReference.toString() + "\n"); ;
    return builder.toString();
  }


}