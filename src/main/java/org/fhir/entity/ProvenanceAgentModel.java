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
@Table(name="provenanceagent")
public class ProvenanceAgentModel  {
  /**
  * Description: "The function of the agent with respect to the activity. The security role enabling the agent with respect to the activity."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"role\"", length = 16777215)
  private String role;

  /**
  * Description: "The individual, device or organization that participated in the event."
  */
  @javax.persistence.Basic
  @Column(name="\"whoUri\"")
  private String whoUri;

  /**
  * Description: "The individual, device or organization that participated in the event."
  */
  @javax.persistence.Basic
  @Column(name="\"whoreference_id\"")
  private String whoreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`whoreference_id`", insertable=false, updatable=false)
  private ReferenceModel whoReference;

  /**
  * Description: "The individual, device, or organization for whom the change was made."
  */
  @javax.persistence.Basic
  @Column(name="\"onBehalfOfUri\"")
  private String onBehalfOfUri;

  /**
  * Description: "The individual, device, or organization for whom the change was made."
  */
  @javax.persistence.Basic
  @Column(name="\"onbehalfofreference_id\"")
  private String onbehalfofreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`onbehalfofreference_id`", insertable=false, updatable=false)
  private ReferenceModel onBehalfOfReference;

  /**
  * Description: "The type of relationship between agents."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"relatedAgentType\"", length = 16777215)
  private String relatedAgentType;

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

  public ProvenanceAgentModel() {
  }

  public ProvenanceAgentModel(ProvenanceAgent o) {
    this.id = o.getId();
      this.role = CodeableConcept.toJson(o.getRole());
      this.whoUri = o.getWhoUri();

      if (null != o.getWhoReference()) {
      	this.whoreference_id = "whoReference" + this.getId();
        this.whoReference = new ReferenceModel(o.getWhoReference());
        this.whoReference.setId(this.whoreference_id);
        this.whoReference.parent_id = this.whoReference.getId();
      }

      this.onBehalfOfUri = o.getOnBehalfOfUri();

      if (null != o.getOnBehalfOfReference()) {
      	this.onbehalfofreference_id = "onBehalfOfReference" + this.getId();
        this.onBehalfOfReference = new ReferenceModel(o.getOnBehalfOfReference());
        this.onBehalfOfReference.setId(this.onbehalfofreference_id);
        this.onBehalfOfReference.parent_id = this.onBehalfOfReference.getId();
      }

      this.relatedAgentType = CodeableConcept.toJson(o.getRelatedAgentType());
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
  public void setWhoUri( String value) {
    this.whoUri = value;
  }
  public String getWhoUri() {
    return this.whoUri;
  }
  public void setWhoReference( ReferenceModel value) {
    this.whoReference = value;
  }
  public ReferenceModel getWhoReference() {
    return this.whoReference;
  }
  public void setOnBehalfOfUri( String value) {
    this.onBehalfOfUri = value;
  }
  public String getOnBehalfOfUri() {
    return this.onBehalfOfUri;
  }
  public void setOnBehalfOfReference( ReferenceModel value) {
    this.onBehalfOfReference = value;
  }
  public ReferenceModel getOnBehalfOfReference() {
    return this.onBehalfOfReference;
  }
  public void setRelatedAgentType( String value) {
    this.relatedAgentType = value;
  }
  public String getRelatedAgentType() {
    return this.relatedAgentType;
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
     builder.append("whoUri" + "[" + String.valueOf(this.whoUri) + "]\n"); 
     builder.append("whoReference" + "[" + String.valueOf(this.whoReference) + "]\n"); 
     builder.append("onBehalfOfUri" + "[" + String.valueOf(this.onBehalfOfUri) + "]\n"); 
     builder.append("onBehalfOfReference" + "[" + String.valueOf(this.onBehalfOfReference) + "]\n"); 
     builder.append("relatedAgentType" + "[" + String.valueOf(this.relatedAgentType) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}