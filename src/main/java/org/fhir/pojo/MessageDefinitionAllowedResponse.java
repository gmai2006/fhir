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
import org.fhir.entity.MessageDefinitionAllowedResponseModel;
import com.google.gson.GsonBuilder;

/**
* "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted."
*/
public class MessageDefinitionAllowedResponse  {
  /**
  * Description: "A reference to the message definition that must be adhered to by this supported response."
  */
  @javax.validation.constraints.NotNull
  private Reference message;

  /**
  * Description: "Provides a description of the circumstances in which this response should be used (as opposed to one of the alternative responses)."
  */
  private String situation;

  /**
  * Description: "Extensions for situation"
  */
  private transient Element _situation;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public MessageDefinitionAllowedResponse() {
  }

  public MessageDefinitionAllowedResponse(MessageDefinitionAllowedResponseModel o) {
    this.id = o.getId();
    if (null != o.getMessage() && !o.getMessage().isEmpty()) {
      this.message = new Reference(o.getMessage().get(0));
    }
    if (null != o.getSituation()) {
      this.situation = o.getSituation();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setMessage( Reference value) {
    this.message = value;
  }
  public Reference getMessage() {
    return this.message;
  }
  public void setSituation( String value) {
    this.situation = value;
  }
  public String getSituation() {
    return this.situation;
  }
  public void set_situation( Element value) {
    this._situation = value;
  }
  public Element get_situation() {
    return this._situation;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MessageDefinitionAllowedResponse]:" + "\n");
     if(this.message != null) builder.append("message" + "->" + this.message.toString() + "\n"); 
     if(this.situation != null) builder.append("situation" + "->" + this.situation.toString() + "\n"); 
     if(this._situation != null) builder.append("_situation" + "->" + this._situation.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}