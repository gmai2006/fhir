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
import org.fhir.entity.ClaimResponseProcessNoteModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
public class ClaimResponseProcessNote  extends BackboneElement  {
  /**
  * Description: "An integer associated with each note which may be referred to from each service line item."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float number;

  /**
  * Description: "Extensions for number"
  */
  protected transient Element _number;

  /**
  * Description: "The note purpose: Print/Display."
  */
  protected CodeableConcept type;

  /**
  * Description: "The note text."
  */
  protected String text;

  /**
  * Description: "Extensions for text"
  */
  protected transient Element _text;

  /**
  * Description: "The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \"en\" for English, or \"en-US\" for American English versus \"en-EN\" for England English."
  */
  protected CodeableConcept language;

  public ClaimResponseProcessNote() {
  }

  public ClaimResponseProcessNote(ClaimResponseProcessNoteModel o) {
    this.id = o.getId();
    if (null != o.getNumber()) {
      this.number = o.getNumber();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getText()) {
      this.text = o.getText();
    }
    if (null != o.getLanguage() && !o.getLanguage().isEmpty()) {
      this.language = new CodeableConcept(o.getLanguage().get(0));
    }
  }

  public void setNumber( Float value) {
    this.number = value;
  }
  public Float getNumber() {
    return this.number;
  }
  public void set_number( Element value) {
    this._number = value;
  }
  public Element get_number() {
    return this._number;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void set_text( Element value) {
    this._text = value;
  }
  public Element get_text() {
    return this._text;
  }
  public void setLanguage( CodeableConcept value) {
    this.language = value;
  }
  public CodeableConcept getLanguage() {
    return this.language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseProcessNote]:" + "\n");
     if(this.number != null) builder.append("number" + "->" + this.number.toString() + "\n"); 
     if(this._number != null) builder.append("_number" + "->" + this._number.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this._text != null) builder.append("_text" + "->" + this._text.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); ;
    return builder.toString();
  }


}