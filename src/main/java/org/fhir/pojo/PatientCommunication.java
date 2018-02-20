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
import org.fhir.entity.PatientCommunicationModel;
import com.google.gson.GsonBuilder;

/**
* "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
*/
public class PatientCommunication  extends BackboneElement  {
  /**
  * Description: "The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \"en\" for English, or \"en-US\" for American English versus \"en-EN\" for England English."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept language;

  /**
  * Description: "Indicates whether or not the patient prefers this language (over other languages he masters up a certain level)."
  */
  protected Boolean preferred;

  /**
  * Description: "Extensions for preferred"
  */
  protected transient Element _preferred;

  public PatientCommunication() {
  }

  public PatientCommunication(PatientCommunicationModel o) {
    this.id = o.getId();
    if (null != o.getLanguage() && !o.getLanguage().isEmpty()) {
      this.language = new CodeableConcept(o.getLanguage().get(0));
    }
    if (null != o.getPreferred()) {
      this.preferred = o.getPreferred();
    }
  }

  public void setLanguage( CodeableConcept value) {
    this.language = value;
  }
  public CodeableConcept getLanguage() {
    return this.language;
  }
  public void setPreferred( Boolean value) {
    this.preferred = value;
  }
  public Boolean getPreferred() {
    return this.preferred;
  }
  public void set_preferred( Element value) {
    this._preferred = value;
  }
  public Element get_preferred() {
    return this._preferred;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PatientCommunication]:" + "\n");
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this.preferred != null) builder.append("preferred" + "->" + this.preferred.toString() + "\n"); 
     if(this._preferred != null) builder.append("_preferred" + "->" + this._preferred.toString() + "\n"); ;
    return builder.toString();
  }


}