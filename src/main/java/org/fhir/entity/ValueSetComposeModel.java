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
* "A value set specifies a set of codes drawn from one or more code systems."
*/
@Entity
@Table(name="valuesetcompose")
public class ValueSetComposeModel  {
  /**
  * Description: "If a locked date is defined, then the Content Logical Definition must be evaluated using the current version as of the locked date for referenced code system(s) and value set instances where ValueSet.compose.include.version is not defined."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"lockedDate\"")
  private String lockedDate;

  /**
  * Description: "Whether inactive codes - codes that are not approved for current use - are in the value set. If inactive = true, inactive codes are to be included in the expansion, if inactive = false, the inactive codes will not be included in the expansion. If absent, the behavior is determined by the implementation, or by the applicable ExpansionProfile (but generally, inactive codes would be expected to be included)."
  */
  @javax.persistence.Basic
  @Column(name="\"inactive\"")
  private Boolean inactive;

  /**
  * Description: "Include one or more codes from a code system or other value set(s)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ValueSetIncludeModel> include = new java.util.ArrayList<>();

  /**
  * Description: "Exclude one or more codes from the value set based on code system filters and/or other value sets."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ValueSetIncludeModel> exclude = new java.util.ArrayList<>();

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

  public ValueSetComposeModel() {
  }

  public ValueSetComposeModel(ValueSetCompose o) {
    this.id = o.getId();
      this.lockedDate = o.getLockedDate();

      this.inactive = o.getInactive();

      this.include = ValueSetInclude.toModelArray(o.getInclude());

      this.exclude = ValueSetInclude.toModelArray(o.getExclude());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setLockedDate( String value) {
    this.lockedDate = value;
  }
  public String getLockedDate() {
    return this.lockedDate;
  }
  public void setInactive( Boolean value) {
    this.inactive = value;
  }
  public Boolean getInactive() {
    return this.inactive;
  }
  public void setInclude( java.util.List<ValueSetIncludeModel> value) {
    this.include = value;
  }
  public java.util.List<ValueSetIncludeModel> getInclude() {
    return this.include;
  }
  public void setExclude( java.util.List<ValueSetIncludeModel> value) {
    this.exclude = value;
  }
  public java.util.List<ValueSetIncludeModel> getExclude() {
    return this.exclude;
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
     builder.append("lockedDate" + "[" + String.valueOf(this.lockedDate) + "]\n"); 
     builder.append("inactive" + "[" + String.valueOf(this.inactive) + "]\n"); 
     builder.append("include" + "[" + String.valueOf(this.include) + "]\n"); 
     builder.append("exclude" + "[" + String.valueOf(this.exclude) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}