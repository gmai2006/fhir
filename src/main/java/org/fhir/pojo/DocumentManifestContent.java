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
import org.fhir.entity.DocumentManifestContentModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A collection of documents compiled for a purpose together with metadata that applies to the collection."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentManifestContent  extends BackboneElement  {
  /**
  * Description: "The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed."
  */
  protected Attachment pAttachment;

  /**
  * Description: "The list of references to document content, or Attachment that consist of the parts of this document manifest. Usually, these would be document references, but direct references to Media or Attachments are also allowed."
  */
  protected Reference pReference;

  public DocumentManifestContent() {
  }

  public DocumentManifestContent(DocumentManifestContentModel o) {
    this.id = o.getId();
    this.pAttachment = AttachmentHelper.fromJson(o.getPAttachment());
    if (null != o.getPReference() && !o.getPReference().isEmpty()) {
      this.pReference = new Reference(o.getPReference().get(0));
    }
  }

  public void setPAttachment( Attachment value) {
    this.pAttachment = value;
  }
  public Attachment getPAttachment() {
    return this.pAttachment;
  }
  public void setPReference( Reference value) {
    this.pReference = value;
  }
  public Reference getPReference() {
    return this.pReference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentManifestContent]:" + "\n");
     if(this.pAttachment != null) builder.append("pAttachment" + "->" + this.pAttachment.toString() + "\n"); 
     if(this.pReference != null) builder.append("pReference" + "->" + this.pReference.toString() + "\n"); ;
    return builder.toString();
  }


}