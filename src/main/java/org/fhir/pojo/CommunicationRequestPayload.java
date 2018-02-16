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
import org.fhir.entity.CommunicationRequestPayloadModel;
import com.google.gson.GsonBuilder;

/**
* "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition."
*/
public class CommunicationRequestPayload  extends BackboneElement  {
  /**
  * Description: "The communicated content (or for multi-part communications, one portion of the communication)."
  */
  protected String contentString;

  /**
  * Description: "Extensions for contentString"
  */
  protected transient Element _contentString;

  /**
  * Description: "The communicated content (or for multi-part communications, one portion of the communication)."
  */
  protected Attachment contentAttachment;

  /**
  * Description: "The communicated content (or for multi-part communications, one portion of the communication)."
  */
  protected Reference contentReference;

  public CommunicationRequestPayload() {
  }

  public CommunicationRequestPayload(CommunicationRequestPayloadModel o) {
    this.id = o.getId();
    if (null != o.getContentString()) {
      this.contentString = o.getContentString();
    }
    this.contentAttachment = AttachmentHelper.fromJson(o.getContentAttachment());
    if (null != o.getContentReference() && !o.getContentReference().isEmpty()) {
      this.contentReference = new Reference(o.getContentReference().get(0));
    }
  }

  public void setContentString( String value) {
    this.contentString = value;
  }
  public String getContentString() {
    return this.contentString;
  }
  public void set_contentString( Element value) {
    this._contentString = value;
  }
  public Element get_contentString() {
    return this._contentString;
  }
  public void setContentAttachment( Attachment value) {
    this.contentAttachment = value;
  }
  public Attachment getContentAttachment() {
    return this.contentAttachment;
  }
  public void setContentReference( Reference value) {
    this.contentReference = value;
  }
  public Reference getContentReference() {
    return this.contentReference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CommunicationRequestPayload]:" + "\n");
     if(this.contentString != null) builder.append("contentString" + "->" + this.contentString.toString() + "\n"); 
     if(this._contentString != null) builder.append("_contentString" + "->" + this._contentString.toString() + "\n"); 
     if(this.contentAttachment != null) builder.append("contentAttachment" + "->" + this.contentAttachment.toString() + "\n"); 
     if(this.contentReference != null) builder.append("contentReference" + "->" + this.contentReference.toString() + "\n"); ;
    return builder.toString();
  }


}