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

/**
* "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
*/
@Entity
@Table(name="provenanceentity")
public class ProvenanceEntityModel  {
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`whatreference_id`", insertable=false, updatable=false)
  private ReferenceModel whatReference;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"whatIdentifier\"", length = 16777215)
  private String whatIdentifier;

  /**
  * Description: "The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ProvenanceAgentModel> agent = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public ProvenanceEntityModel() {
  }

  public ProvenanceEntityModel(ProvenanceEntity o) {
    this.id = o.getId();
      this.role = o.getRole();

      this.whatUri = o.getWhatUri();

      if (null != o.getWhatReference()) {
      	this.whatreference_id = "whatReference" + this.getId();
        this.whatReference = new ReferenceModel(o.getWhatReference());
        this.whatReference.setId(this.whatreference_id);
        this.whatReference.parent_id = this.whatReference.getId();
      }

      this.whatIdentifier = Identifier.toJson(o.getWhatIdentifier());
      this.agent = ProvenanceAgent.toModelArray(o.getAgent());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setRole( String value) {
    this.role = value;
  }
  public String getRole() {
    return this.role;
  }
  public void setWhatUri( String value) {
    this.whatUri = value;
  }
  public String getWhatUri() {
    return this.whatUri;
  }
  public void setWhatReference( ReferenceModel value) {
    this.whatReference = value;
  }
  public ReferenceModel getWhatReference() {
    return this.whatReference;
  }
  public void setWhatIdentifier( String value) {
    this.whatIdentifier = value;
  }
  public String getWhatIdentifier() {
    return this.whatIdentifier;
  }
  public void setAgent( java.util.List<ProvenanceAgentModel> value) {
    this.agent = value;
  }
  public java.util.List<ProvenanceAgentModel> getAgent() {
    return this.agent;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("role" + "[" + String.valueOf(this.role) + "]\n"); 
     builder.append("whatUri" + "[" + String.valueOf(this.whatUri) + "]\n"); 
     builder.append("whatReference" + "[" + String.valueOf(this.whatReference) + "]\n"); 
     builder.append("whatIdentifier" + "[" + String.valueOf(this.whatIdentifier) + "]\n"); 
     builder.append("agent" + "[" + String.valueOf(this.agent) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}