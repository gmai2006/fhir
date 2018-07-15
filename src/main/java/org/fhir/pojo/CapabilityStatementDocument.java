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
import org.fhir.entity.CapabilityStatementDocumentModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CapabilityStatementDocument  extends BackboneElement  {
  /**
  * Description: "Mode of this document declaration - whether an application is a producer or consumer."
  */
  protected String mode;

  /**
  * Description: "Extensions for mode"
  */
  protected transient Element _mode;

  /**
  * Description: "A description of how the application supports or uses the specified document profile.  For example, when documents are created, what action is taken with consumed documents, etc."
  */
  protected String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  protected transient Element _documentation;

  /**
  * Description: "A constraint on a resource used in the document."
  */
  @javax.validation.constraints.NotNull
  protected Reference profile;

  public CapabilityStatementDocument() {
  }

  public CapabilityStatementDocument(CapabilityStatementDocumentModel o) {
    this.id = o.getId();
    if (null != o.getMode()) {
      this.mode = o.getMode();
    }
    if (null != o.getDocumentation()) {
      this.documentation = o.getDocumentation();
    }
    if (null != o.getProfile() && !o.getProfile().isEmpty()) {
      this.profile = new Reference(o.getProfile().get(0));
    }
  }

  public void setMode( String value) {
    this.mode = ModeEnum.fromCode(value);
  }
  public String getMode() {
    return this.mode;
  }
  public void set_mode( Element value) {
    this._mode = value;
  }
  public Element get_mode() {
    return this._mode;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void set_documentation( Element value) {
    this._documentation = value;
  }
  public Element get_documentation() {
    return this._documentation;
  }
  public void setProfile( Reference value) {
    this.profile = value;
  }
  public Reference getProfile() {
    return this.profile;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementDocument]:" + "\n");
     if(this.mode != null) builder.append("mode" + "->" + this.mode.toString() + "\n"); 
     if(this._mode != null) builder.append("_mode" + "->" + this._mode.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this._documentation != null) builder.append("_documentation" + "->" + this._documentation.toString() + "\n"); 
     if(this.profile != null) builder.append("profile" + "->" + this.profile.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ModeEnum {
  	producer,
  	consumer,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "producer" : { return producer.toString(); }
  			case "consumer" : { return consumer.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}