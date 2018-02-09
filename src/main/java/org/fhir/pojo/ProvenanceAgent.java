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
import org.fhir.entity.ProvenanceAgentModel;
import com.google.gson.GsonBuilder;

/**
* "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
*/
public class ProvenanceAgent  {
  /**
  * Description: "The function of the agent with respect to the activity. The security role enabling the agent with respect to the activity."
  */
  private java.util.List<CodeableConcept> role = new java.util.ArrayList<>();

  /**
  * Description: "The individual, device or organization that participated in the event."
  */
  private String whoUri;

  /**
  * Description: "Extensions for whoUri"
  */
  private transient Element _whoUri;

  /**
  * Description: "The individual, device or organization that participated in the event."
  */
  private Reference whoReference;

  /**
  * Description: "The individual, device, or organization for whom the change was made."
  */
  private String onBehalfOfUri;

  /**
  * Description: "Extensions for onBehalfOfUri"
  */
  private transient Element _onBehalfOfUri;

  /**
  * Description: "The individual, device, or organization for whom the change was made."
  */
  private Reference onBehalfOfReference;

  /**
  * Description: "The type of relationship between agents."
  */
  private CodeableConcept relatedAgentType;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public ProvenanceAgent() {
  }

  public ProvenanceAgent(ProvenanceAgentModel o) {
    this.id = o.getId();
      this.role = CodeableConcept.fromArray(o.getRole());
      if (null != o.getWhoUri()) {
        this.whoUri = new String(o.getWhoUri());
      }

      if (null != o.getWhoReference()) {
        this.whoReference = new Reference(o.getWhoReference());
        this.whoReference.setId(this.getId());
      }

      if (null != o.getOnBehalfOfUri()) {
        this.onBehalfOfUri = new String(o.getOnBehalfOfUri());
      }

      if (null != o.getOnBehalfOfReference()) {
        this.onBehalfOfReference = new Reference(o.getOnBehalfOfReference());
        this.onBehalfOfReference.setId(this.getId());
      }

      this.relatedAgentType = CodeableConcept.fromJson(o.getRelatedAgentType());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setRole( java.util.List<CodeableConcept> value) {
    this.role = value;
  }
  public java.util.List<CodeableConcept> getRole() {
    return this.role;
  }
  public void setWhoUri( String value) {
    this.whoUri = value;
  }
  public String getWhoUri() {
    return this.whoUri;
  }
  public void set_whoUri( Element value) {
    this._whoUri = value;
  }
  public Element get_whoUri() {
    return this._whoUri;
  }
  public void setWhoReference( Reference value) {
    this.whoReference = value;
  }
  public Reference getWhoReference() {
    return this.whoReference;
  }
  public void setOnBehalfOfUri( String value) {
    this.onBehalfOfUri = value;
  }
  public String getOnBehalfOfUri() {
    return this.onBehalfOfUri;
  }
  public void set_onBehalfOfUri( Element value) {
    this._onBehalfOfUri = value;
  }
  public Element get_onBehalfOfUri() {
    return this._onBehalfOfUri;
  }
  public void setOnBehalfOfReference( Reference value) {
    this.onBehalfOfReference = value;
  }
  public Reference getOnBehalfOfReference() {
    return this.onBehalfOfReference;
  }
  public void setRelatedAgentType( CodeableConcept value) {
    this.relatedAgentType = value;
  }
  public CodeableConcept getRelatedAgentType() {
    return this.relatedAgentType;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("role" + "[" + String.valueOf(this.role) + "]\n"); 
     builder.append("whoUri" + "[" + String.valueOf(this.whoUri) + "]\n"); 
     builder.append("_whoUri" + "[" + String.valueOf(this._whoUri) + "]\n"); 
     builder.append("whoReference" + "[" + String.valueOf(this.whoReference) + "]\n"); 
     builder.append("onBehalfOfUri" + "[" + String.valueOf(this.onBehalfOfUri) + "]\n"); 
     builder.append("_onBehalfOfUri" + "[" + String.valueOf(this._onBehalfOfUri) + "]\n"); 
     builder.append("onBehalfOfReference" + "[" + String.valueOf(this.onBehalfOfReference) + "]\n"); 
     builder.append("relatedAgentType" + "[" + String.valueOf(this.relatedAgentType) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ProvenanceAgent> fromArray(java.util.List<ProvenanceAgentModel> list) {
    return (java.util.List<ProvenanceAgent>)list.stream()
      .map(model -> new ProvenanceAgent(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ProvenanceAgentModel> toModelArray(java.util.List<ProvenanceAgent> list) {
    return (java.util.List<ProvenanceAgentModel>)list.stream()
      .map(model -> new ProvenanceAgentModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ProvenanceAgent fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ProvenanceAgent.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ProvenanceAgent o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ProvenanceAgent> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}