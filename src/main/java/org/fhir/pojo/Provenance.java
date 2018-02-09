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
import org.fhir.entity.ProvenanceModel;
import com.google.gson.GsonBuilder;

/**
* "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
*/
public class Provenance  {
  /**
  * Description: "This is a Provenance resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<Reference> target = new java.util.ArrayList<>();

  /**
  * Description: "The period during which the activity occurred."
  */
  private Period period;

  /**
  * Description: "The instant of time at which the activity was recorded."
  */
  private String recorded;

  /**
  * Description: "Extensions for recorded"
  */
  private transient Element _recorded;

  /**
  * Description: "Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc."
  */
  private java.util.List<String> policy = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for policy"
  */
  private transient java.util.List<Element> _policy = new java.util.ArrayList<>();

  /**
  * Description: "Where the activity occurred, if relevant."
  */
  private Reference location;

  /**
  * Description: "The reason that the activity was taking place."
  */
  private java.util.List<Coding> reason = new java.util.ArrayList<>();

  /**
  * Description: "An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities."
  */
  private Coding activity;

  /**
  * Description: "An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<ProvenanceAgent> agent = new java.util.ArrayList<>();

  /**
  * Description: "An entity used in this activity."
  */
  private java.util.List<ProvenanceEntity> entity = new java.util.ArrayList<>();

  /**
  * Description: "A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated."
  */
  private java.util.List<Signature> signature = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public Provenance() {
  }

  public Provenance(ProvenanceModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.target = Reference.fromArray(o.getTarget());

      this.period = Period.fromJson(o.getPeriod());
      if (null != o.getRecorded()) {
        this.recorded = new String(o.getRecorded());
      }

      this.policy = org.fhir.utils.JsonUtils.json2Array(o.getPolicy());

      if (null != o.getLocation()) {
        this.location = new Reference(o.getLocation());
        this.location.setId(this.getId());
      }

      this.reason = Coding.fromArray(o.getReason());
      this.activity = Coding.fromJson(o.getActivity());
      this.agent = ProvenanceAgent.fromArray(o.getAgent());

      this.entity = ProvenanceEntity.fromArray(o.getEntity());

      this.signature = Signature.fromArray(o.getSignature());
      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
      }

  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setTarget( java.util.List<Reference> value) {
    this.target = value;
  }
  public java.util.List<Reference> getTarget() {
    return this.target;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setRecorded( String value) {
    this.recorded = value;
  }
  public String getRecorded() {
    return this.recorded;
  }
  public void set_recorded( Element value) {
    this._recorded = value;
  }
  public Element get_recorded() {
    return this._recorded;
  }
  public void setPolicy( java.util.List<String> value) {
    this.policy = value;
  }
  public java.util.List<String> getPolicy() {
    return this.policy;
  }
  public void set_policy( java.util.List<Element> value) {
    this._policy = value;
  }
  public java.util.List<Element> get_policy() {
    return this._policy;
  }
  public void setLocation( Reference value) {
    this.location = value;
  }
  public Reference getLocation() {
    return this.location;
  }
  public void setReason( java.util.List<Coding> value) {
    this.reason = value;
  }
  public java.util.List<Coding> getReason() {
    return this.reason;
  }
  public void setActivity( Coding value) {
    this.activity = value;
  }
  public Coding getActivity() {
    return this.activity;
  }
  public void setAgent( java.util.List<ProvenanceAgent> value) {
    this.agent = value;
  }
  public java.util.List<ProvenanceAgent> getAgent() {
    return this.agent;
  }
  public void setEntity( java.util.List<ProvenanceEntity> value) {
    this.entity = value;
  }
  public java.util.List<ProvenanceEntity> getEntity() {
    return this.entity;
  }
  public void setSignature( java.util.List<Signature> value) {
    this.signature = value;
  }
  public java.util.List<Signature> getSignature() {
    return this.signature;
  }
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("target" + "[" + String.valueOf(this.target) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("recorded" + "[" + String.valueOf(this.recorded) + "]\n"); 
     builder.append("_recorded" + "[" + String.valueOf(this._recorded) + "]\n"); 
     builder.append("policy" + "[" + String.valueOf(this.policy) + "]\n"); 
     builder.append("_policy" + "[" + String.valueOf(this._policy) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("activity" + "[" + String.valueOf(this.activity) + "]\n"); 
     builder.append("agent" + "[" + String.valueOf(this.agent) + "]\n"); 
     builder.append("entity" + "[" + String.valueOf(this.entity) + "]\n"); 
     builder.append("signature" + "[" + String.valueOf(this.signature) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Provenance,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Provenance" : { return Provenance.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Provenance> fromArray(java.util.List<ProvenanceModel> list) {
    return (java.util.List<Provenance>)list.stream()
      .map(model -> new Provenance(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ProvenanceModel> toModelArray(java.util.List<Provenance> list) {
    return (java.util.List<ProvenanceModel>)list.stream()
      .map(model -> new ProvenanceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Provenance fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Provenance.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Provenance o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Provenance> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}