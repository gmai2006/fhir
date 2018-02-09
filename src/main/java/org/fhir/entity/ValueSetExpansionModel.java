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
@Table(name="valuesetexpansion")
public class ValueSetExpansionModel  {
  /**
  * Description: "An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so."
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"")
  private String identifier;

  /**
  * Description: "The time at which the expansion was produced by the expanding system."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"timestamp\"")
  private String timestamp;

  /**
  * Description: "The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"total\"")
  private Float total;

  /**
  * Description: "If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"offset\"")
  private Float offset;

  /**
  * Description: "A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion."
  * Actual type: Array of ValueSetParameter-> List<ValueSetParameter>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"parameter\"", length = 16777215)
  private String parameter;

  /**
  * Description: "The codes that are contained in the value set expansion."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ValueSetContainsModel> contains = new java.util.ArrayList<>();

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

  public ValueSetExpansionModel() {
  }

  public ValueSetExpansionModel(ValueSetExpansion o) {
    this.id = o.getId();
      this.identifier = o.getIdentifier();

      this.timestamp = o.getTimestamp();

      this.total = o.getTotal();

      this.offset = o.getOffset();

      this.parameter = ValueSetParameter.toJson(o.getParameter());
      this.contains = ValueSetContains.toModelArray(o.getContains());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setTimestamp( String value) {
    this.timestamp = value;
  }
  public String getTimestamp() {
    return this.timestamp;
  }
  public void setTotal( Float value) {
    this.total = value;
  }
  public Float getTotal() {
    return this.total;
  }
  public void setOffset( Float value) {
    this.offset = value;
  }
  public Float getOffset() {
    return this.offset;
  }
  public void setParameter( String value) {
    this.parameter = value;
  }
  public String getParameter() {
    return this.parameter;
  }
  public void setContains( java.util.List<ValueSetContainsModel> value) {
    this.contains = value;
  }
  public java.util.List<ValueSetContainsModel> getContains() {
    return this.contains;
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
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("timestamp" + "[" + String.valueOf(this.timestamp) + "]\n"); 
     builder.append("total" + "[" + String.valueOf(this.total) + "]\n"); 
     builder.append("offset" + "[" + String.valueOf(this.offset) + "]\n"); 
     builder.append("parameter" + "[" + String.valueOf(this.parameter) + "]\n"); 
     builder.append("contains" + "[" + String.valueOf(this.contains) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}