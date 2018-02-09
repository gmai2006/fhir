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
* "Financial instrument which may be used to reimburse or pay for health care products and services."
*/
@Entity
@Table(name="coveragegrouping")
public class CoverageGroupingModel  {
  /**
  * Description: "Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify an employer group. May also be referred to as a Policy or Group ID."
  */
  @javax.persistence.Basic
  @Column(name="\"group\"")
  private String group;

  /**
  * Description: "A short description for the group."
  */
  @javax.persistence.Basic
  @Column(name="\"groupDisplay\"")
  private String groupDisplay;

  /**
  * Description: "Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a subset of an employer group."
  */
  @javax.persistence.Basic
  @Column(name="\"subGroup\"")
  private String subGroup;

  /**
  * Description: "A short description for the subgroup."
  */
  @javax.persistence.Basic
  @Column(name="\"subGroupDisplay\"")
  private String subGroupDisplay;

  /**
  * Description: "Identifies a style or collective of coverage issued by the underwriter, for example may be used to identify a collection of benefits provided to employees. May be referred to as a Section or Division ID."
  */
  @javax.persistence.Basic
  @Column(name="\"plan\"")
  private String plan;

  /**
  * Description: "A short description for the plan."
  */
  @javax.persistence.Basic
  @Column(name="\"planDisplay\"")
  private String planDisplay;

  /**
  * Description: "Identifies a sub-style or sub-collective of coverage issued by the underwriter, for example may be used to identify a subset of a collection of benefits provided to employees."
  */
  @javax.persistence.Basic
  @Column(name="\"subPlan\"")
  private String subPlan;

  /**
  * Description: "A short description for the subplan."
  */
  @javax.persistence.Basic
  @Column(name="\"subPlanDisplay\"")
  private String subPlanDisplay;

  /**
  * Description: "Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage such as a level of deductables or co-payment."
  */
  @javax.persistence.Basic
  @Column(name="\"FHIRclass\"")
  private String FHIRclass;

  /**
  * Description: "A short description for the class."
  */
  @javax.persistence.Basic
  @Column(name="\"classDisplay\"")
  private String classDisplay;

  /**
  * Description: "Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a subclass of coverage such as a sub-level of deductables or co-payment."
  */
  @javax.persistence.Basic
  @Column(name="\"subClass\"")
  private String subClass;

  /**
  * Description: "A short description for the subclass."
  */
  @javax.persistence.Basic
  @Column(name="\"subClassDisplay\"")
  private String subClassDisplay;

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

  public CoverageGroupingModel() {
  }

  public CoverageGroupingModel(CoverageGrouping o) {
    this.id = o.getId();
      this.group = o.getGroup();

      this.groupDisplay = o.getGroupDisplay();

      this.subGroup = o.getSubGroup();

      this.subGroupDisplay = o.getSubGroupDisplay();

      this.plan = o.getPlan();

      this.planDisplay = o.getPlanDisplay();

      this.subPlan = o.getSubPlan();

      this.subPlanDisplay = o.getSubPlanDisplay();

      this.FHIRclass = o.getFHIRclass();

      this.classDisplay = o.getClassDisplay();

      this.subClass = o.getSubClass();

      this.subClassDisplay = o.getSubClassDisplay();

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setGroup( String value) {
    this.group = value;
  }
  public String getGroup() {
    return this.group;
  }
  public void setGroupDisplay( String value) {
    this.groupDisplay = value;
  }
  public String getGroupDisplay() {
    return this.groupDisplay;
  }
  public void setSubGroup( String value) {
    this.subGroup = value;
  }
  public String getSubGroup() {
    return this.subGroup;
  }
  public void setSubGroupDisplay( String value) {
    this.subGroupDisplay = value;
  }
  public String getSubGroupDisplay() {
    return this.subGroupDisplay;
  }
  public void setPlan( String value) {
    this.plan = value;
  }
  public String getPlan() {
    return this.plan;
  }
  public void setPlanDisplay( String value) {
    this.planDisplay = value;
  }
  public String getPlanDisplay() {
    return this.planDisplay;
  }
  public void setSubPlan( String value) {
    this.subPlan = value;
  }
  public String getSubPlan() {
    return this.subPlan;
  }
  public void setSubPlanDisplay( String value) {
    this.subPlanDisplay = value;
  }
  public String getSubPlanDisplay() {
    return this.subPlanDisplay;
  }
  public void setFHIRclass( String value) {
    this.FHIRclass = value;
  }
  public String getFHIRclass() {
    return this.FHIRclass;
  }
  public void setClassDisplay( String value) {
    this.classDisplay = value;
  }
  public String getClassDisplay() {
    return this.classDisplay;
  }
  public void setSubClass( String value) {
    this.subClass = value;
  }
  public String getSubClass() {
    return this.subClass;
  }
  public void setSubClassDisplay( String value) {
    this.subClassDisplay = value;
  }
  public String getSubClassDisplay() {
    return this.subClassDisplay;
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
     builder.append("group" + "[" + String.valueOf(this.group) + "]\n"); 
     builder.append("groupDisplay" + "[" + String.valueOf(this.groupDisplay) + "]\n"); 
     builder.append("subGroup" + "[" + String.valueOf(this.subGroup) + "]\n"); 
     builder.append("subGroupDisplay" + "[" + String.valueOf(this.subGroupDisplay) + "]\n"); 
     builder.append("plan" + "[" + String.valueOf(this.plan) + "]\n"); 
     builder.append("planDisplay" + "[" + String.valueOf(this.planDisplay) + "]\n"); 
     builder.append("subPlan" + "[" + String.valueOf(this.subPlan) + "]\n"); 
     builder.append("subPlanDisplay" + "[" + String.valueOf(this.subPlanDisplay) + "]\n"); 
     builder.append("FHIRclass" + "[" + String.valueOf(this.FHIRclass) + "]\n"); 
     builder.append("classDisplay" + "[" + String.valueOf(this.classDisplay) + "]\n"); 
     builder.append("subClass" + "[" + String.valueOf(this.subClass) + "]\n"); 
     builder.append("subClassDisplay" + "[" + String.valueOf(this.subClassDisplay) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}