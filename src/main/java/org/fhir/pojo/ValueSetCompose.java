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
import org.fhir.entity.ValueSetComposeModel;
import com.google.gson.GsonBuilder;

/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
public class ValueSetCompose  {
  /**
  * Description: "If a locked date is defined, then the Content Logical Definition must be evaluated using the current version as of the locked date for referenced code system(s) and value set instances where ValueSet.compose.include.version is not defined."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String lockedDate;

  /**
  * Description: "Extensions for lockedDate"
  */
  private transient Element _lockedDate;

  /**
  * Description: "Whether inactive codes - codes that are not approved for current use - are in the value set. If inactive = true, inactive codes are to be included in the expansion, if inactive = false, the inactive codes will not be included in the expansion. If absent, the behavior is determined by the implementation, or by the applicable ExpansionProfile (but generally, inactive codes would be expected to be included)."
  */
  private Boolean inactive;

  /**
  * Description: "Extensions for inactive"
  */
  private transient Element _inactive;

  /**
  * Description: "Include one or more codes from a code system or other value set(s)."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<ValueSetInclude> include = new java.util.ArrayList<>();

  /**
  * Description: "Exclude one or more codes from the value set based on code system filters and/or other value sets."
  */
  private java.util.List<ValueSetInclude> exclude = new java.util.ArrayList<>();

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

  public ValueSetCompose() {
  }

  public ValueSetCompose(ValueSetComposeModel o) {
    this.id = o.getId();
      if (null != o.getLockedDate()) {
        this.lockedDate = new String(o.getLockedDate());
      }

      if (null != o.getInactive()) {
        this.inactive = new Boolean(o.getInactive());
      }

      this.include = ValueSetInclude.fromArray(o.getInclude());

      this.exclude = ValueSetInclude.fromArray(o.getExclude());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setLockedDate( String value) {
    this.lockedDate = value;
  }
  public String getLockedDate() {
    return this.lockedDate;
  }
  public void set_lockedDate( Element value) {
    this._lockedDate = value;
  }
  public Element get_lockedDate() {
    return this._lockedDate;
  }
  public void setInactive( Boolean value) {
    this.inactive = value;
  }
  public Boolean getInactive() {
    return this.inactive;
  }
  public void set_inactive( Element value) {
    this._inactive = value;
  }
  public Element get_inactive() {
    return this._inactive;
  }
  public void setInclude( java.util.List<ValueSetInclude> value) {
    this.include = value;
  }
  public java.util.List<ValueSetInclude> getInclude() {
    return this.include;
  }
  public void setExclude( java.util.List<ValueSetInclude> value) {
    this.exclude = value;
  }
  public java.util.List<ValueSetInclude> getExclude() {
    return this.exclude;
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
     builder.append("lockedDate" + "[" + String.valueOf(this.lockedDate) + "]\n"); 
     builder.append("_lockedDate" + "[" + String.valueOf(this._lockedDate) + "]\n"); 
     builder.append("inactive" + "[" + String.valueOf(this.inactive) + "]\n"); 
     builder.append("_inactive" + "[" + String.valueOf(this._inactive) + "]\n"); 
     builder.append("include" + "[" + String.valueOf(this.include) + "]\n"); 
     builder.append("exclude" + "[" + String.valueOf(this.exclude) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ValueSetCompose> fromArray(java.util.List<ValueSetComposeModel> list) {
    return (java.util.List<ValueSetCompose>)list.stream()
      .map(model -> new ValueSetCompose(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ValueSetComposeModel> toModelArray(java.util.List<ValueSetCompose> list) {
    return (java.util.List<ValueSetComposeModel>)list.stream()
      .map(model -> new ValueSetComposeModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ValueSetCompose fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ValueSetCompose.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ValueSetCompose o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ValueSetCompose> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}