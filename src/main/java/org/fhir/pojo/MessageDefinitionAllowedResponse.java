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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageDefinitionAllowedResponse  extends BackboneElement  {
  /**
  * Description: "A reference to the message definition that must be adhered to by this supported response."
  */
  @javax.validation.constraints.NotNull
  protected Reference message;

  /**
  * Description: "Provides a description of the circumstances in which this response should be used (as opposed to one of the alternative responses)."
  */
  protected String situation;

  /**
  * Description: "Extensions for situation"
  */
  protected transient Element _situation;

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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MessageDefinitionAllowedResponse]:" + "\n");
     if(this.message != null) builder.append("message" + "->" + this.message.toString() + "\n"); 
     if(this.situation != null) builder.append("situation" + "->" + this.situation.toString() + "\n"); 
     if(this._situation != null) builder.append("_situation" + "->" + this._situation.toString() + "\n"); ;
    return builder.toString();
  }


}