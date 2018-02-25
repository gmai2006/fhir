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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanDefinitionRelatedAction  extends BackboneElement  {
  /**
  * Description: "The element id of the related action."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String actionId;

  /**
  * Description: "Extensions for actionId"
  */
  protected transient Element _actionId;

  /**
  * Description: "The relationship of this action to the related action."
  */
  protected String relationship;

  /**
  * Description: "Extensions for relationship"
  */
  protected transient Element _relationship;

  /**
  * Description: "A duration or range of durations to apply to the relationship. For example, 30-60 minutes before."
  */
  protected Duration offsetDuration;

  /**
  * Description: "A duration or range of durations to apply to the relationship. For example, 30-60 minutes before."
  */
  protected Range offsetRange;

  public PlanDefinitionRelatedAction() {
  }

  public PlanDefinitionRelatedAction(PlanDefinitionRelatedActionModel o) {
    this.id = o.getId();
    if (null != o.getActionId()) {
      this.actionId = o.getActionId();
    }
    if (null != o.getRelationship()) {
      this.relationship = o.getRelationship();
    }
    this.offsetDuration = DurationHelper.fromJson(o.getOffsetDuration());
    this.offsetRange = RangeHelper.fromJson(o.getOffsetRange());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PlanDefinitionRelatedAction]:" + "\n");
     if(this.actionId != null) builder.append("actionId" + "->" + this.actionId.toString() + "\n"); 
     if(this._actionId != null) builder.append("_actionId" + "->" + this._actionId.toString() + "\n"); 
     if(this.relationship != null) builder.append("relationship" + "->" + this.relationship.toString() + "\n"); 
     if(this._relationship != null) builder.append("_relationship" + "->" + this._relationship.toString() + "\n"); 
     if(this.offsetDuration != null) builder.append("offsetDuration" + "->" + this.offsetDuration.toString() + "\n"); 
     if(this.offsetRange != null) builder.append("offsetRange" + "->" + this.offsetRange.toString() + "\n"); ;
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

}