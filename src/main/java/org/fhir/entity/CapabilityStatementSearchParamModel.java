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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;
import java.io.Serializable;
/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
@Entity
@Table(name="capabilitystatementsearchparam")
public class CapabilityStatementSearchParamModel  implements Serializable {
	private static final long serialVersionUID = 151857669680850780L;
  /**
  * Description: "The name of the search parameter used in the interface."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]])."
  */
  @javax.persistence.Basic
  @Column(name="\"definition\"")
  private String definition;

  /**
  * Description: "The type of value a search parameter refers to, and how the content is interpreted."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation\"")
  private String documentation;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public CapabilityStatementSearchParamModel() {
  }

  public CapabilityStatementSearchParamModel(CapabilityStatementSearchParam o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.name = o.getName();
    this.definition = o.getDefinition();
    this.type = o.getType();
    this.documentation = o.getDocumentation();
  }

  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getDefinition() {
    return this.definition;
  }
  public void setDefinition( String value) {
    this.definition = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementSearchParamModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementSearchParamModel]:" + "\n");
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}