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
import org.fhir.entity.ImmunizationReactionModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
*/
public class ImmunizationReaction  extends BackboneElement  {
  /**
  * Description: "Date of reaction to the immunization."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Details of the reaction."
  */
  protected Reference detail;

  /**
  * Description: "Self-reported indicator."
  */
  protected Boolean reported;

  /**
  * Description: "Extensions for reported"
  */
  protected transient Element _reported;

  public ImmunizationReaction() {
  }

  public ImmunizationReaction(ImmunizationReactionModel o) {
    this.id = o.getId();
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getDetail() && !o.getDetail().isEmpty()) {
      this.detail = new Reference(o.getDetail().get(0));
    }
    if (null != o.getReported()) {
      this.reported = o.getReported();
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
  public void setDetail( Reference value) {
    this.detail = value;
  }
  public Reference getDetail() {
    return this.detail;
  }
  public void setReported( Boolean value) {
    this.reported = value;
  }
  public Boolean getReported() {
    return this.reported;
  }
  public void set_reported( Element value) {
    this._reported = value;
  }
  public Element get_reported() {
    return this._reported;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationReaction]:" + "\n");
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.detail != null) builder.append("detail" + "->" + this.detail.toString() + "\n"); 
     if(this.reported != null) builder.append("reported" + "->" + this.reported.toString() + "\n"); 
     if(this._reported != null) builder.append("_reported" + "->" + this._reported.toString() + "\n"); ;
    return builder.toString();
  }


}