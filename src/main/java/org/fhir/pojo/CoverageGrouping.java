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
import org.fhir.entity.CoverageGroupingModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Financial instrument which may be used to reimburse or pay for health care products and services."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CoverageGrouping  extends BackboneElement  {
  /**
  * Description: "Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify an employer group. May also be referred to as a Policy or Group ID."
  */
  protected String group;

  /**
  * Description: "Extensions for group"
  */
  protected transient Element _group;

  /**
  * Description: "A short description for the group."
  */
  protected String groupDisplay;

  /**
  * Description: "Extensions for groupDisplay"
  */
  protected transient Element _groupDisplay;

  /**
  * Description: "Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a subset of an employer group."
  */
  protected String subGroup;

  /**
  * Description: "Extensions for subGroup"
  */
  protected transient Element _subGroup;

  /**
  * Description: "A short description for the subgroup."
  */
  protected String subGroupDisplay;

  /**
  * Description: "Extensions for subGroupDisplay"
  */
  protected transient Element _subGroupDisplay;

  /**
  * Description: "Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a collection of benefits provided to employees. May be referred to as a Section or Division ID."
  */
  protected String plan;

  /**
  * Description: "Extensions for plan"
  */
  protected transient Element _plan;

  /**
  * Description: "A short description for the plan."
  */
  protected String planDisplay;

  /**
  * Description: "Extensions for planDisplay"
  */
  protected transient Element _planDisplay;

  /**
  * Description: "Identifies a sub-style or sub-collective of coverage issued by the underwriter, for example may be used to identify a subset of a collection of benefits provided to employees."
  */
  protected String subPlan;

  /**
  * Description: "Extensions for subPlan"
  */
  protected transient Element _subPlan;

  /**
  * Description: "A short description for the subplan."
  */
  protected String subPlanDisplay;

  /**
  * Description: "Extensions for subPlanDisplay"
  */
  protected transient Element _subPlanDisplay;

  /**
  * Description: "Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage such as a level of deductables or co-payment."
  */
  protected String FHIRclass;

  /**
  * Description: "Extensions for class"
  */
  protected transient Element _class;

  /**
  * Description: "A short description for the class."
  */
  protected String classDisplay;

  /**
  * Description: "Extensions for classDisplay"
  */
  protected transient Element _classDisplay;

  /**
  * Description: "Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a subclass of coverage such as a sub-level of deductables or co-payment."
  */
  protected String subClass;

  /**
  * Description: "Extensions for subClass"
  */
  protected transient Element _subClass;

  /**
  * Description: "A short description for the subclass."
  */
  protected String subClassDisplay;

  /**
  * Description: "Extensions for subClassDisplay"
  */
  protected transient Element _subClassDisplay;

  public CoverageGrouping() {
  }

  public CoverageGrouping(CoverageGroupingModel o) {
    this.id = o.getId();
    if (null != o.getGroup()) {
      this.group = o.getGroup();
    }
    if (null != o.getGroupDisplay()) {
      this.groupDisplay = o.getGroupDisplay();
    }
    if (null != o.getSubGroup()) {
      this.subGroup = o.getSubGroup();
    }
    if (null != o.getSubGroupDisplay()) {
      this.subGroupDisplay = o.getSubGroupDisplay();
    }
    if (null != o.getPlan()) {
      this.plan = o.getPlan();
    }
    if (null != o.getPlanDisplay()) {
      this.planDisplay = o.getPlanDisplay();
    }
    if (null != o.getSubPlan()) {
      this.subPlan = o.getSubPlan();
    }
    if (null != o.getSubPlanDisplay()) {
      this.subPlanDisplay = o.getSubPlanDisplay();
    }
    if (null != o.getFHIRclass()) {
      this.FHIRclass = o.getFHIRclass();
    }
    if (null != o.getClassDisplay()) {
      this.classDisplay = o.getClassDisplay();
    }
    if (null != o.getSubClass()) {
      this.subClass = o.getSubClass();
    }
    if (null != o.getSubClassDisplay()) {
      this.subClassDisplay = o.getSubClassDisplay();
    }
  }

  public void setGroup( String value) {
    this.group = value;
  }
  public String getGroup() {
    return this.group;
  }
  public void set_group( Element value) {
    this._group = value;
  }
  public Element get_group() {
    return this._group;
  }
  public void setGroupDisplay( String value) {
    this.groupDisplay = value;
  }
  public String getGroupDisplay() {
    return this.groupDisplay;
  }
  public void set_groupDisplay( Element value) {
    this._groupDisplay = value;
  }
  public Element get_groupDisplay() {
    return this._groupDisplay;
  }
  public void setSubGroup( String value) {
    this.subGroup = value;
  }
  public String getSubGroup() {
    return this.subGroup;
  }
  public void set_subGroup( Element value) {
    this._subGroup = value;
  }
  public Element get_subGroup() {
    return this._subGroup;
  }
  public void setSubGroupDisplay( String value) {
    this.subGroupDisplay = value;
  }
  public String getSubGroupDisplay() {
    return this.subGroupDisplay;
  }
  public void set_subGroupDisplay( Element value) {
    this._subGroupDisplay = value;
  }
  public Element get_subGroupDisplay() {
    return this._subGroupDisplay;
  }
  public void setPlan( String value) {
    this.plan = value;
  }
  public String getPlan() {
    return this.plan;
  }
  public void set_plan( Element value) {
    this._plan = value;
  }
  public Element get_plan() {
    return this._plan;
  }
  public void setPlanDisplay( String value) {
    this.planDisplay = value;
  }
  public String getPlanDisplay() {
    return this.planDisplay;
  }
  public void set_planDisplay( Element value) {
    this._planDisplay = value;
  }
  public Element get_planDisplay() {
    return this._planDisplay;
  }
  public void setSubPlan( String value) {
    this.subPlan = value;
  }
  public String getSubPlan() {
    return this.subPlan;
  }
  public void set_subPlan( Element value) {
    this._subPlan = value;
  }
  public Element get_subPlan() {
    return this._subPlan;
  }
  public void setSubPlanDisplay( String value) {
    this.subPlanDisplay = value;
  }
  public String getSubPlanDisplay() {
    return this.subPlanDisplay;
  }
  public void set_subPlanDisplay( Element value) {
    this._subPlanDisplay = value;
  }
  public Element get_subPlanDisplay() {
    return this._subPlanDisplay;
  }
  public void setFHIRclass( String value) {
    this.FHIRclass = value;
  }
  public String getFHIRclass() {
    return this.FHIRclass;
  }
  public void set_class( Element value) {
    this._class = value;
  }
  public Element get_class() {
    return this._class;
  }
  public void setClassDisplay( String value) {
    this.classDisplay = value;
  }
  public String getClassDisplay() {
    return this.classDisplay;
  }
  public void set_classDisplay( Element value) {
    this._classDisplay = value;
  }
  public Element get_classDisplay() {
    return this._classDisplay;
  }
  public void setSubClass( String value) {
    this.subClass = value;
  }
  public String getSubClass() {
    return this.subClass;
  }
  public void set_subClass( Element value) {
    this._subClass = value;
  }
  public Element get_subClass() {
    return this._subClass;
  }
  public void setSubClassDisplay( String value) {
    this.subClassDisplay = value;
  }
  public String getSubClassDisplay() {
    return this.subClassDisplay;
  }
  public void set_subClassDisplay( Element value) {
    this._subClassDisplay = value;
  }
  public Element get_subClassDisplay() {
    return this._subClassDisplay;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CoverageGrouping]:" + "\n");
     if(this.group != null) builder.append("group" + "->" + this.group.toString() + "\n"); 
     if(this._group != null) builder.append("_group" + "->" + this._group.toString() + "\n"); 
     if(this.groupDisplay != null) builder.append("groupDisplay" + "->" + this.groupDisplay.toString() + "\n"); 
     if(this._groupDisplay != null) builder.append("_groupDisplay" + "->" + this._groupDisplay.toString() + "\n"); 
     if(this.subGroup != null) builder.append("subGroup" + "->" + this.subGroup.toString() + "\n"); 
     if(this._subGroup != null) builder.append("_subGroup" + "->" + this._subGroup.toString() + "\n"); 
     if(this.subGroupDisplay != null) builder.append("subGroupDisplay" + "->" + this.subGroupDisplay.toString() + "\n"); 
     if(this._subGroupDisplay != null) builder.append("_subGroupDisplay" + "->" + this._subGroupDisplay.toString() + "\n"); 
     if(this.plan != null) builder.append("plan" + "->" + this.plan.toString() + "\n"); 
     if(this._plan != null) builder.append("_plan" + "->" + this._plan.toString() + "\n"); 
     if(this.planDisplay != null) builder.append("planDisplay" + "->" + this.planDisplay.toString() + "\n"); 
     if(this._planDisplay != null) builder.append("_planDisplay" + "->" + this._planDisplay.toString() + "\n"); 
     if(this.subPlan != null) builder.append("subPlan" + "->" + this.subPlan.toString() + "\n"); 
     if(this._subPlan != null) builder.append("_subPlan" + "->" + this._subPlan.toString() + "\n"); 
     if(this.subPlanDisplay != null) builder.append("subPlanDisplay" + "->" + this.subPlanDisplay.toString() + "\n"); 
     if(this._subPlanDisplay != null) builder.append("_subPlanDisplay" + "->" + this._subPlanDisplay.toString() + "\n"); 
     if(this.FHIRclass != null) builder.append("FHIRclass" + "->" + this.FHIRclass.toString() + "\n"); 
     if(this._class != null) builder.append("_class" + "->" + this._class.toString() + "\n"); 
     if(this.classDisplay != null) builder.append("classDisplay" + "->" + this.classDisplay.toString() + "\n"); 
     if(this._classDisplay != null) builder.append("_classDisplay" + "->" + this._classDisplay.toString() + "\n"); 
     if(this.subClass != null) builder.append("subClass" + "->" + this.subClass.toString() + "\n"); 
     if(this._subClass != null) builder.append("_subClass" + "->" + this._subClass.toString() + "\n"); 
     if(this.subClassDisplay != null) builder.append("subClassDisplay" + "->" + this.subClassDisplay.toString() + "\n"); 
     if(this._subClassDisplay != null) builder.append("_subClassDisplay" + "->" + this._subClassDisplay.toString() + "\n"); ;
    return builder.toString();
  }


}