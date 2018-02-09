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
import org.fhir.entity.ProvenanceEntityModel;
import com.google.gson.GsonBuilder;

/**
* "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
*/
public class ProvenanceEntity  {
  /**
  * Description: "How the entity was used during the activity."
  */
  private String role;

  /**
  * Description: "Extensions for role"
  */
  private transient Element _role;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  */
  private String whatUri;

  /**
  * Description: "Extensions for whatUri"
  */
  private transient Element _whatUri;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  */
  private Reference whatReference;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  */
  private Identifier whatIdentifier;

  /**
  * Description: "The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity."
  */
  private java.util.List<ProvenanceAgent> agent = new java.util.ArrayList<>();

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

  public ProvenanceEntity() {
  }

  public ProvenanceEntity(ProvenanceEntityModel o) {
    this.id = o.getId();
      if (null != o.getRole()) {
        this.role = new String(o.getRole());
      }

      if (null != o.getWhatUri()) {
        this.whatUri = new String(o.getWhatUri());
      }

      if (null != o.getWhatReference()) {
        this.whatReference = new Reference(o.getWhatReference());
        this.whatReference.setId(this.getId());
      }

      this.whatIdentifier = Identifier.fromJson(o.getWhatIdentifier());
      this.agent = ProvenanceAgent.fromArray(o.getAgent());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setRole( String value) {
    this.role = RoleEnum.fromCode(value);
  }
  public String getRole() {
    return this.role;
  }
  public void set_role( Element value) {
    this._role = value;
  }
  public Element get_role() {
    return this._role;
  }
  public void setWhatUri( String value) {
    this.whatUri = value;
  }
  public String getWhatUri() {
    return this.whatUri;
  }
  public void set_whatUri( Element value) {
    this._whatUri = value;
  }
  public Element get_whatUri() {
    return this._whatUri;
  }
  public void setWhatReference( Reference value) {
    this.whatReference = value;
  }
  public Reference getWhatReference() {
    return this.whatReference;
  }
  public void setWhatIdentifier( Identifier value) {
    this.whatIdentifier = value;
  }
  public Identifier getWhatIdentifier() {
    return this.whatIdentifier;
  }
  public void setAgent( java.util.List<ProvenanceAgent> value) {
    this.agent = value;
  }
  public java.util.List<ProvenanceAgent> getAgent() {
    return this.agent;
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
     builder.append("_role" + "[" + String.valueOf(this._role) + "]\n"); 
     builder.append("whatUri" + "[" + String.valueOf(this.whatUri) + "]\n"); 
     builder.append("_whatUri" + "[" + String.valueOf(this._whatUri) + "]\n"); 
     builder.append("whatReference" + "[" + String.valueOf(this.whatReference) + "]\n"); 
     builder.append("whatIdentifier" + "[" + String.valueOf(this.whatIdentifier) + "]\n"); 
     builder.append("agent" + "[" + String.valueOf(this.agent) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum RoleEnum {
  	derivation,
  	revision,
  	quotation,
  	source,
  	removal,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "derivation" : { return derivation.toString(); }
  			case "revision" : { return revision.toString(); }
  			case "quotation" : { return quotation.toString(); }
  			case "source" : { return source.toString(); }
  			case "removal" : { return removal.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ProvenanceEntity> fromArray(java.util.List<ProvenanceEntityModel> list) {
    return (java.util.List<ProvenanceEntity>)list.stream()
      .map(model -> new ProvenanceEntity(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ProvenanceEntityModel> toModelArray(java.util.List<ProvenanceEntity> list) {
    return (java.util.List<ProvenanceEntityModel>)list.stream()
      .map(model -> new ProvenanceEntityModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ProvenanceEntity fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ProvenanceEntity.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ProvenanceEntity o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ProvenanceEntity> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}