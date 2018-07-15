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
import org.fhir.entity.BinaryModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A binary resource can contain any content, whether text, image, pdf, zip archive, etc."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Binary  extends Resource  {
  /**
  * Description: "This is a Binary resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "MimeType of the binary content represented as a standard MimeType (BCP 13)."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String contentType;

  /**
  * Description: "Extensions for contentType"
  */
  protected transient Element _contentType;

  /**
  * Description: "Treat this binary as if it was this other resource for access control purposes."
  */
  protected Reference securityContext;

  /**
  * Description: "The actual content, base64 encoded."
  */
  protected String content;

  /**
  * Description: "Extensions for content"
  */
  protected transient Element _content;

  public Binary() {
  }

  public Binary(BinaryModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getContentType()) {
      this.contentType = o.getContentType();
    }
    if (null != o.getSecurityContext() && !o.getSecurityContext().isEmpty()) {
      this.securityContext = new Reference(o.getSecurityContext().get(0));
    }
    if (null != o.getContent()) {
      this.content = o.getContent();
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setContentType( String value) {
    this.contentType = value;
  }
  public String getContentType() {
    return this.contentType;
  }
  public void set_contentType( Element value) {
    this._contentType = value;
  }
  public Element get_contentType() {
    return this._contentType;
  }
  public void setSecurityContext( Reference value) {
    this.securityContext = value;
  }
  public Reference getSecurityContext() {
    return this.securityContext;
  }
  public void setContent( String value) {
    this.content = value;
  }
  public String getContent() {
    return this.content;
  }
  public void set_content( Element value) {
    this._content = value;
  }
  public Element get_content() {
    return this._content;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Binary]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.contentType != null) builder.append("contentType" + "->" + this.contentType.toString() + "\n"); 
     if(this._contentType != null) builder.append("_contentType" + "->" + this._contentType.toString() + "\n"); 
     if(this.securityContext != null) builder.append("securityContext" + "->" + this.securityContext.toString() + "\n"); 
     if(this.content != null) builder.append("content" + "->" + this.content.toString() + "\n"); 
     if(this._content != null) builder.append("_content" + "->" + this._content.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	Binary,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Binary" : { return Binary.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}