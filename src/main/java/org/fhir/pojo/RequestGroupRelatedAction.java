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
import org.fhir.entity.RequestGroupRelatedActionModel;
import com.google.gson.GsonBuilder;

/**
* "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
*/
public class RequestGroupRelatedAction  {
  /**
  * Description: "The element id of the action this is related to."
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
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
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
  @javax.validation.constraints.NotNull
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

  public RequestGroupRelatedAction() {
  }

  public RequestGroupRelatedAction(RequestGroupRelatedActionModel o) {
    this.id = o.getId();
    if (null != o.getActionId()) {
      this.actionId = o.getActionId();
    }
    if (null != o.getRelationship()) {
      this.relationship = o.getRelationship();
    }
    this.offsetDuration = DurationHelper.fromJson(o.getOffsetDuration());
    this.offsetRange = RangeHelper.fromJson(o.getOffsetRange());
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    this.relationship = value;
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
    builder.append("[RequestGroupRelatedAction]:" + "\n");
     if(this.actionId != null) builder.append("actionId" + "->" + this.actionId.toString() + "\n"); 
     if(this._actionId != null) builder.append("_actionId" + "->" + this._actionId.toString() + "\n"); 
     if(this.relationship != null) builder.append("relationship" + "->" + this.relationship.toString() + "\n"); 
     if(this._relationship != null) builder.append("_relationship" + "->" + this._relationship.toString() + "\n"); 
     if(this.offsetDuration != null) builder.append("offsetDuration" + "->" + this.offsetDuration.toString() + "\n"); 
     if(this.offsetRange != null) builder.append("offsetRange" + "->" + this.offsetRange.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}