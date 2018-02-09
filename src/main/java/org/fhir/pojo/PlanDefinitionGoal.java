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
import org.fhir.entity.PlanDefinitionGoalModel;
import com.google.gson.GsonBuilder;

/**
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
*/
public class PlanDefinitionGoal  {
  /**
  * Description: "Indicates a category the goal falls within."
  */
  private CodeableConcept category;

  /**
  * Description: "Human-readable and/or coded description of a specific desired objective of care, such as \"control blood pressure\" or \"negotiate an obstacle course\" or \"dance with child at wedding\"."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept description;

  /**
  * Description: "Identifies the expected level of importance associated with reaching/sustaining the defined goal."
  */
  private CodeableConcept priority;

  /**
  * Description: "The event after which the goal should begin being pursued."
  */
  private CodeableConcept start;

  /**
  * Description: "Identifies problems, conditions, issues, or concerns the goal is intended to address."
  */
  private java.util.List<CodeableConcept> addresses = new java.util.ArrayList<>();

  /**
  * Description: "Didactic or other informational resources associated with the goal that provide further supporting information about the goal. Information resources can include inline text commentary and links to web resources."
  */
  private java.util.List<RelatedArtifact> documentation = new java.util.ArrayList<>();

  /**
  * Description: "Indicates what should be done and within what timeframe."
  */
  private java.util.List<PlanDefinitionTarget> target = new java.util.ArrayList<>();

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

  public PlanDefinitionGoal() {
  }

  public PlanDefinitionGoal(PlanDefinitionGoalModel o) {
    this.id = o.getId();
      this.category = CodeableConcept.fromJson(o.getCategory());
      this.description = CodeableConcept.fromJson(o.getDescription());
      this.priority = CodeableConcept.fromJson(o.getPriority());
      this.start = CodeableConcept.fromJson(o.getStart());
      this.addresses = CodeableConcept.fromArray(o.getAddresses());
      this.documentation = RelatedArtifact.fromArray(o.getDocumentation());

      this.target = PlanDefinitionTarget.fromArray(o.getTarget());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setDescription( CodeableConcept value) {
    this.description = value;
  }
  public CodeableConcept getDescription() {
    return this.description;
  }
  public void setPriority( CodeableConcept value) {
    this.priority = value;
  }
  public CodeableConcept getPriority() {
    return this.priority;
  }
  public void setStart( CodeableConcept value) {
    this.start = value;
  }
  public CodeableConcept getStart() {
    return this.start;
  }
  public void setAddresses( java.util.List<CodeableConcept> value) {
    this.addresses = value;
  }
  public java.util.List<CodeableConcept> getAddresses() {
    return this.addresses;
  }
  public void setDocumentation( java.util.List<RelatedArtifact> value) {
    this.documentation = value;
  }
  public java.util.List<RelatedArtifact> getDocumentation() {
    return this.documentation;
  }
  public void setTarget( java.util.List<PlanDefinitionTarget> value) {
    this.target = value;
  }
  public java.util.List<PlanDefinitionTarget> getTarget() {
    return this.target;
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
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("start" + "[" + String.valueOf(this.start) + "]\n"); 
     builder.append("addresses" + "[" + String.valueOf(this.addresses) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("target" + "[" + String.valueOf(this.target) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<PlanDefinitionGoal> fromArray(java.util.List<PlanDefinitionGoalModel> list) {
    return (java.util.List<PlanDefinitionGoal>)list.stream()
      .map(model -> new PlanDefinitionGoal(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<PlanDefinitionGoalModel> toModelArray(java.util.List<PlanDefinitionGoal> list) {
    return (java.util.List<PlanDefinitionGoalModel>)list.stream()
      .map(model -> new PlanDefinitionGoalModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static PlanDefinitionGoal fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, PlanDefinitionGoal.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(PlanDefinitionGoal o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<PlanDefinitionGoal> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}