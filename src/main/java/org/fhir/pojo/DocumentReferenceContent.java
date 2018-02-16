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
import org.fhir.entity.DocumentReferenceContentModel;
import com.google.gson.GsonBuilder;

/**
* "A reference to a document."
*/
public class DocumentReferenceContent  extends BackboneElement  {
  /**
  * Description: "The document or URL of the document along with critical metadata to prove content has integrity."
  */
  @javax.validation.constraints.NotNull
  protected Attachment attachment;

  /**
  * Description: "An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType."
  */
  protected Coding format;

  public DocumentReferenceContent() {
  }

  public DocumentReferenceContent(DocumentReferenceContentModel o) {
    this.id = o.getId();
    this.attachment = AttachmentHelper.fromJson(o.getAttachment());
    this.format = CodingHelper.fromJson(o.getFormat());
  }

  public void setAttachment( Attachment value) {
    this.attachment = value;
  }
  public Attachment getAttachment() {
    return this.attachment;
  }
  public void setFormat( Coding value) {
    this.format = value;
  }
  public Coding getFormat() {
    return this.format;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentReferenceContent]:" + "\n");
     if(this.attachment != null) builder.append("attachment" + "->" + this.attachment.toString() + "\n"); 
     if(this.format != null) builder.append("format" + "->" + this.format.toString() + "\n"); ;
    return builder.toString();
  }


}