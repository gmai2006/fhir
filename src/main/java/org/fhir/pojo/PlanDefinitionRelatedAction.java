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
import org.fhir.entity.PlanDefinitionRelatedActionModel;
import com.google.gson.GsonBuilder;

/**
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
*/
public class PlanDefinitionRelatedAction  {
  /**
  * Description: "The element id of the related action."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String actionId;

  /**
  * Description: "Extensions for actionId"
  */
  private transient Element _actionId;

  /**
  * Description: "The relationship of this action to the related action."
  */
  private String relationship;

  /**
  * Description: "Extensions for relationship"
  */
  private transient Element _relationship;

  /**
  * Description: "A duration or range of durations to apply to the relationship. For example, 30-60 minutes before."
  */
  private Duration offsetDuration;

  /**
  * Description: "A duration or range of durations to apply to the relationship. For example, 30-60 minutes before."
  */
  private Range offsetRange;

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

  public PlanDefinitionRelatedAction() {
  }

  public PlanDefinitionRelatedAction(PlanDefinitionRelatedActionModel o) {
    this.id = o.getId();
      if (null != o.getActionId()) {
        this.actionId = new String(o.getActionId());
      }

      if (null != o.getRelationship()) {
        this.relationship = new String(o.getRelationship());
      }

      this.offsetDuration = Duration.fromJson(o.getOffsetDuration());
      this.offsetRange = Range.fromJson(o.getOffsetRange());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setActionId( String value) {
    this.actionId = value;
  }
  public String getActionId() {
    return this.actionId;
  }
  public void set_actionId( Element value) {
    this._actionId = value;
  }
  public Element get_actionId() {
    return this._actionId;
  }
  public void setRelationship( String value) {
    this.relationship = RelationshipEnum.fromCode(value);
  }
  public String getRelationship() {
    return this.relationship;
  }
  public void set_relationship( Element value) {
    this._relationship = value;
  }
  public Element get_relationship() {
    return this._relationship;
  }
  public void setOffsetDuration( Duration value) {
    this.offsetDuration = value;
  }
  public Duration getOffsetDuration() {
    return this.offsetDuration;
  }
  public void setOffsetRange( Range value) {
    this.offsetRange = value;
  }
  public Range getOffsetRange() {
    return this.offsetRange;
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
     builder.append("actionId" + "[" + String.valueOf(this.actionId) + "]\n"); 
     builder.append("_actionId" + "[" + String.valueOf(this._actionId) + "]\n"); 
     builder.append("relationship" + "[" + String.valueOf(this.relationship) + "]\n"); 
     builder.append("_relationship" + "[" + String.valueOf(this._relationship) + "]\n"); 
     builder.append("offsetDuration" + "[" + String.valueOf(this.offsetDuration) + "]\n"); 
     builder.append("offsetRange" + "[" + String.valueOf(this.offsetRange) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum RelationshipEnum {
  	beforestart,
  	before,
  	beforeend,
  	concurrentwithstart,
  	concurrent,
  	concurrentwithend,
  	afterstart,
  	after,
  	afterend,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "beforestart" : { return beforestart.toString(); }
  			case "before" : { return before.toString(); }
  			case "beforeend" : { return beforeend.toString(); }
  			case "concurrentwithstart" : { return concurrentwithstart.toString(); }
  			case "concurrent" : { return concurrent.toString(); }
  			case "concurrentwithend" : { return concurrentwithend.toString(); }
  			case "afterstart" : { return afterstart.toString(); }
  			case "after" : { return after.toString(); }
  			case "afterend" : { return afterend.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<PlanDefinitionRelatedAction> fromArray(java.util.List<PlanDefinitionRelatedActionModel> list) {
    return (java.util.List<PlanDefinitionRelatedAction>)list.stream()
      .map(model -> new PlanDefinitionRelatedAction(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<PlanDefinitionRelatedActionModel> toModelArray(java.util.List<PlanDefinitionRelatedAction> list) {
    return (java.util.List<PlanDefinitionRelatedActionModel>)list.stream()
      .map(model -> new PlanDefinitionRelatedActionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static PlanDefinitionRelatedAction fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, PlanDefinitionRelatedAction.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(PlanDefinitionRelatedAction o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<PlanDefinitionRelatedAction> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}