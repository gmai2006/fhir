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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
@Entity
@Table(name="valuesetcompose")
public class ValueSetComposeModel  implements Serializable {
	private static final long serialVersionUID = 151873631168919318L;
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
  @javax.persistence.Basic
  @Column(name="\"include_id\"")
  private String include_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="include_id", insertable=false, updatable=false)
  private java.util.List<ValueSetIncludeModel> include;

  /**
  * Description: "Exclude one or more codes from the value set based on code system filters and/or other value sets."
  */
  @javax.persistence.Basic
  @Column(name="\"exclude_id\"")
  private String exclude_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="exclude_id", insertable=false, updatable=false)
  private java.util.List<ValueSetIncludeModel> exclude;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public ValueSetComposeModel() {
  }

  public ValueSetComposeModel(ValueSetCompose o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.lockedDate = o.getLockedDate();
    this.inactive = o.getInactive();
    if (null != o.getInclude() && !o.getInclude().isEmpty()) {
    	this.include_id = "include" + this.parent_id;
    	this.include = ValueSetIncludeHelper.toModelFromArray(o.getInclude(), this.include_id);
    }
    if (null != o.getExclude() && !o.getExclude().isEmpty()) {
    	this.exclude_id = "exclude" + this.parent_id;
    	this.exclude = ValueSetIncludeHelper.toModelFromArray(o.getExclude(), this.exclude_id);
    }
  }

  public String getLockedDate() {
    return this.lockedDate;
  }
  public void setLockedDate( String value) {
    this.lockedDate = value;
  }
  public Boolean getInactive() {
    return this.inactive;
  }
  public void setInactive( Boolean value) {
    this.inactive = value;
  }
  public java.util.List<ValueSetIncludeModel> getInclude() {
    return this.include;
  }
  public void setInclude( java.util.List<ValueSetIncludeModel> value) {
    this.include = value;
  }
  public java.util.List<ValueSetIncludeModel> getExclude() {
    return this.exclude;
  }
  public void setExclude( java.util.List<ValueSetIncludeModel> value) {
    this.exclude = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetComposeModel]:" + "\n");
     builder.append("lockedDate" + "->" + this.lockedDate + "\n"); 
     builder.append("inactive" + "->" + this.inactive + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetComposeModel]:" + "\n");
     builder.append("lockedDate" + "->" + this.lockedDate + "\n"); 
     builder.append("inactive" + "->" + this.inactive + "\n"); 
     builder.append("include" + "->" + this.include + "\n"); 
     builder.append("exclude" + "->" + this.exclude + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}