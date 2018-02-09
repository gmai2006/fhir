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
* "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data."
*/
@Entity
@Table(name="datarequirement")
public class DataRequirementModel  {
  /**
  * Description: "The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "The profile of the required data, specified as the uri of the profile definition."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"profile\"", length = 16777215)
  private String profile;

  /**
  * Description: "Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available. Note that the value for this element can be a path to allow references to nested elements. In that case, all the elements along the path must be supported."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"mustSupport\"", length = 16777215)
  private String mustSupport;

  /**
  * Description: "Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<DataRequirementCodeFilterModel> codeFilter = new java.util.ArrayList<>();

  /**
  * Description: "Date filters specify additional constraints on the data in terms of the applicable date range for specific elements."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<DataRequirementDateFilterModel> dateFilter = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public DataRequirementModel() {
  }

  public DataRequirementModel(DataRequirement o) {
    this.id = o.getId();
      this.type = o.getType();

      this.profile = org.fhir.utils.JsonUtils.write2String(o.getProfile());

      this.mustSupport = org.fhir.utils.JsonUtils.write2String(o.getMustSupport());

      this.codeFilter = DataRequirementCodeFilter.toModelArray(o.getCodeFilter());

      this.dateFilter = DataRequirementDateFilter.toModelArray(o.getDateFilter());

      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setProfile( String value) {
    this.profile = value;
  }
  public String getProfile() {
    return this.profile;
  }
  public void setMustSupport( String value) {
    this.mustSupport = value;
  }
  public String getMustSupport() {
    return this.mustSupport;
  }
  public void setCodeFilter( java.util.List<DataRequirementCodeFilterModel> value) {
    this.codeFilter = value;
  }
  public java.util.List<DataRequirementCodeFilterModel> getCodeFilter() {
    return this.codeFilter;
  }
  public void setDateFilter( java.util.List<DataRequirementDateFilterModel> value) {
    this.dateFilter = value;
  }
  public java.util.List<DataRequirementDateFilterModel> getDateFilter() {
    return this.dateFilter;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("profile" + "[" + String.valueOf(this.profile) + "]\n"); 
     builder.append("mustSupport" + "[" + String.valueOf(this.mustSupport) + "]\n"); 
     builder.append("codeFilter" + "[" + String.valueOf(this.codeFilter) + "]\n"); 
     builder.append("dateFilter" + "[" + String.valueOf(this.dateFilter) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}