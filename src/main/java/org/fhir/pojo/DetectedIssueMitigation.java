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
import org.fhir.entity.DetectedIssueMitigationModel;
import com.google.gson.GsonBuilder;

/**
* "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc."
*/
public class DetectedIssueMitigation  extends BackboneElement  {
  /**
  * Description: "Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified issue."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept action;

  /**
  * Description: "Indicates when the mitigating action was documented."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring."
  */
  protected Reference author;

  public DetectedIssueMitigation() {
  }

  public DetectedIssueMitigation(DetectedIssueMitigationModel o) {
    this.id = o.getId();
    if (null != o.getAction() && !o.getAction().isEmpty()) {
      this.action = new CodeableConcept(o.getAction().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
      this.author = new Reference(o.getAuthor().get(0));
    }
  }

  public void setAction( CodeableConcept value) {
    this.action = value;
  }
  public CodeableConcept getAction() {
    return this.action;
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
  public void setAuthor( Reference value) {
    this.author = value;
  }
  public Reference getAuthor() {
    return this.author;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DetectedIssueMitigation]:" + "\n");
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.author != null) builder.append("author" + "->" + this.author.toString() + "\n"); ;
    return builder.toString();
  }


}