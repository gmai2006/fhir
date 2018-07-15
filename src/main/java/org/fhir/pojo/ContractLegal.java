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
import org.fhir.entity.ContractLegalModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ContractLegal  extends BackboneElement  {
  /**
  * Description: "Contract legal text in human renderable form."
  */
  protected Attachment contentAttachment;

  /**
  * Description: "Contract legal text in human renderable form."
  */
  protected Reference contentReference;

  public ContractLegal() {
  }

  public ContractLegal(ContractLegalModel o) {
    this.id = o.getId();
    this.contentAttachment = AttachmentHelper.fromJson(o.getContentAttachment());
    if (null != o.getContentReference() && !o.getContentReference().isEmpty()) {
      this.contentReference = new Reference(o.getContentReference().get(0));
    }
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
    builder.append("[ContractLegal]:" + "\n");
     if(this.contentAttachment != null) builder.append("contentAttachment" + "->" + this.contentAttachment.toString() + "\n"); 
     if(this.contentReference != null) builder.append("contentReference" + "->" + this.contentReference.toString() + "\n"); ;
    return builder.toString();
  }


}