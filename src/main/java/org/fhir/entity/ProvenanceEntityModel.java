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
import org.fhir.utils.JsonUtils;
/**
* "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
*/
@Entity
@Table(name="provenanceentity")
public class ProvenanceEntityModel  implements Serializable {
	private static final long serialVersionUID = 151873631186558552L;
  /**
  * Description: "How the entity was used during the activity."
  */
  @javax.persistence.Basic
  @Column(name="\"role\"")
  private String role;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  */
  @javax.persistence.Basic
  @Column(name="\"whatUri\"")
  private String whatUri;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  */
  @javax.persistence.Basic
  @Column(name="\"whatreference_id\"")
  private String whatreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="whatreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> whatReference;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"whatIdentifier\"", length = 16777215)
  private String whatIdentifier;

  /**
  * Description: "The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity."
  */
  @javax.persistence.Basic
  @Column(name="\"agent_id\"")
  private String agent_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="agent_id", insertable=false, updatable=false)
  private java.util.List<ProvenanceAgentModel> agent;

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

  public ProvenanceEntityModel() {
  }

  public ProvenanceEntityModel(ProvenanceEntity o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.role = o.getRole();
    this.whatUri = o.getWhatUri();
    if (null != o.getWhatReference() ) {
    	this.whatreference_id = "whatreference" + this.parent_id;
    	this.whatReference = ReferenceHelper.toModel(o.getWhatReference(), this.whatreference_id);
    }
    this.whatIdentifier = JsonUtils.toJson(o.getWhatIdentifier());
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
    	this.agent_id = "agent" + this.parent_id;
    	this.agent = ProvenanceAgentHelper.toModelFromArray(o.getAgent(), this.agent_id);
    }
  }

  public String getRole() {
    return this.role;
  }
  public void setRole( String value) {
    this.role = value;
  }
  public String getWhatUri() {
    return this.whatUri;
  }
  public void setWhatUri( String value) {
    this.whatUri = value;
  }
  public java.util.List<ReferenceModel> getWhatReference() {
    return this.whatReference;
  }
  public void setWhatReference( java.util.List<ReferenceModel> value) {
    this.whatReference = value;
  }
  public String getWhatIdentifier() {
    return this.whatIdentifier;
  }
  public void setWhatIdentifier( String value) {
    this.whatIdentifier = value;
  }
  public java.util.List<ProvenanceAgentModel> getAgent() {
    return this.agent;
  }
  public void setAgent( java.util.List<ProvenanceAgentModel> value) {
    this.agent = value;
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
    builder.append("[ProvenanceEntityModel]:" + "\n");
     builder.append("role" + "->" + this.role + "\n"); 
     builder.append("whatUri" + "->" + this.whatUri + "\n"); 
     builder.append("whatIdentifier" + "->" + this.whatIdentifier + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ProvenanceEntityModel]:" + "\n");
     builder.append("role" + "->" + this.role + "\n"); 
     builder.append("whatUri" + "->" + this.whatUri + "\n"); 
     builder.append("whatReference" + "->" + this.whatReference + "\n"); 
     builder.append("whatIdentifier" + "->" + this.whatIdentifier + "\n"); 
     builder.append("agent" + "->" + this.agent + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}