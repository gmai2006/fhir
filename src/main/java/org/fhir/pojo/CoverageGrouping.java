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
import com.google.gson.GsonBuilder;

/**
* "Financial instrument which may be used to reimburse or pay for health care products and services."
*/
public class CoverageGrouping  {
  /**
  * Description: "Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify an employer group. May also be referred to as a Policy or Group ID."
  */
  private String group;

  /**
  * Description: "Extensions for group"
  */
  private transient Element _group;

  /**
  * Description: "A short description for the group."
  */
  private String groupDisplay;

  /**
  * Description: "Extensions for groupDisplay"
  */
  private transient Element _groupDisplay;

  /**
  * Description: "Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a subset of an employer group."
  */
  private String subGroup;

  /**
  * Description: "Extensions for subGroup"
  */
  private transient Element _subGroup;

  /**
  * Description: "A short description for the subgroup."
  */
  private String subGroupDisplay;

  /**
  * Description: "Extensions for subGroupDisplay"
  */
  private transient Element _subGroupDisplay;

  /**
  * Description: "Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a collection of benefits provided to employees. May be referred to as a Section or Division ID."
  */
  private String plan;

  /**
  * Description: "Extensions for plan"
  */
  private transient Element _plan;

  /**
  * Description: "A short description for the plan."
  */
  private String planDisplay;

  /**
  * Description: "Extensions for planDisplay"
  */
  private transient Element _planDisplay;

  /**
  * Description: "Identifies a sub-style or sub-collective of coverage issued by the underwriter, for example may be used to identify a subset of a collection of benefits provided to employees."
  */
  private String subPlan;

  /**
  * Description: "Extensions for subPlan"
  */
  private transient Element _subPlan;

  /**
  * Description: "A short description for the subplan."
  */
  private String subPlanDisplay;

  /**
  * Description: "Extensions for subPlanDisplay"
  */
  private transient Element _subPlanDisplay;

  /**
  * Description: "Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage such as a level of deductables or co-payment."
  */
  private String FHIRclass;

  /**
  * Description: "Extensions for class"
  */
  private transient Element _class;

  /**
  * Description: "A short description for the class."
  */
  private String classDisplay;

  /**
  * Description: "Extensions for classDisplay"
  */
  private transient Element _classDisplay;

  /**
  * Description: "Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a subclass of coverage such as a sub-level of deductables or co-payment."
  */
  private String subClass;

  /**
  * Description: "Extensions for subClass"
  */
  private transient Element _subClass;

  /**
  * Description: "A short description for the subclass."
  */
  private String subClassDisplay;

  /**
  * Description: "Extensions for subClassDisplay"
  */
  private transient Element _subClassDisplay;

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

  public CoverageGrouping() {
  }

  public CoverageGrouping(CoverageGroupingModel o) {
    this.id = o.getId();
      if (null != o.getGroup()) {
        this.group = new String(o.getGroup());
      }

      if (null != o.getGroupDisplay()) {
        this.groupDisplay = new String(o.getGroupDisplay());
      }

      if (null != o.getSubGroup()) {
        this.subGroup = new String(o.getSubGroup());
      }

      if (null != o.getSubGroupDisplay()) {
        this.subGroupDisplay = new String(o.getSubGroupDisplay());
      }

      if (null != o.getPlan()) {
        this.plan = new String(o.getPlan());
      }

      if (null != o.getPlanDisplay()) {
        this.planDisplay = new String(o.getPlanDisplay());
      }

      if (null != o.getSubPlan()) {
        this.subPlan = new String(o.getSubPlan());
      }

      if (null != o.getSubPlanDisplay()) {
        this.subPlanDisplay = new String(o.getSubPlanDisplay());
      }

      if (null != o.getFHIRclass()) {
        this.FHIRclass = new String(o.getFHIRclass());
      }

      if (null != o.getClassDisplay()) {
        this.classDisplay = new String(o.getClassDisplay());
      }

      if (null != o.getSubClass()) {
        this.subClass = new String(o.getSubClass());
      }

      if (null != o.getSubClassDisplay()) {
        this.subClassDisplay = new String(o.getSubClassDisplay());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("group" + "[" + String.valueOf(this.group) + "]\n"); 
     builder.append("_group" + "[" + String.valueOf(this._group) + "]\n"); 
     builder.append("groupDisplay" + "[" + String.valueOf(this.groupDisplay) + "]\n"); 
     builder.append("_groupDisplay" + "[" + String.valueOf(this._groupDisplay) + "]\n"); 
     builder.append("subGroup" + "[" + String.valueOf(this.subGroup) + "]\n"); 
     builder.append("_subGroup" + "[" + String.valueOf(this._subGroup) + "]\n"); 
     builder.append("subGroupDisplay" + "[" + String.valueOf(this.subGroupDisplay) + "]\n"); 
     builder.append("_subGroupDisplay" + "[" + String.valueOf(this._subGroupDisplay) + "]\n"); 
     builder.append("plan" + "[" + String.valueOf(this.plan) + "]\n"); 
     builder.append("_plan" + "[" + String.valueOf(this._plan) + "]\n"); 
     builder.append("planDisplay" + "[" + String.valueOf(this.planDisplay) + "]\n"); 
     builder.append("_planDisplay" + "[" + String.valueOf(this._planDisplay) + "]\n"); 
     builder.append("subPlan" + "[" + String.valueOf(this.subPlan) + "]\n"); 
     builder.append("_subPlan" + "[" + String.valueOf(this._subPlan) + "]\n"); 
     builder.append("subPlanDisplay" + "[" + String.valueOf(this.subPlanDisplay) + "]\n"); 
     builder.append("_subPlanDisplay" + "[" + String.valueOf(this._subPlanDisplay) + "]\n"); 
     builder.append("FHIRclass" + "[" + String.valueOf(this.FHIRclass) + "]\n"); 
     builder.append("_class" + "[" + String.valueOf(this._class) + "]\n"); 
     builder.append("classDisplay" + "[" + String.valueOf(this.classDisplay) + "]\n"); 
     builder.append("_classDisplay" + "[" + String.valueOf(this._classDisplay) + "]\n"); 
     builder.append("subClass" + "[" + String.valueOf(this.subClass) + "]\n"); 
     builder.append("_subClass" + "[" + String.valueOf(this._subClass) + "]\n"); 
     builder.append("subClassDisplay" + "[" + String.valueOf(this.subClassDisplay) + "]\n"); 
     builder.append("_subClassDisplay" + "[" + String.valueOf(this._subClassDisplay) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<CoverageGrouping> fromArray(java.util.List<CoverageGroupingModel> list) {
    return (java.util.List<CoverageGrouping>)list.stream()
      .map(model -> new CoverageGrouping(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CoverageGroupingModel> toModelArray(java.util.List<CoverageGrouping> list) {
    return (java.util.List<CoverageGroupingModel>)list.stream()
      .map(model -> new CoverageGroupingModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CoverageGrouping fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CoverageGrouping.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CoverageGrouping o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CoverageGrouping> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}