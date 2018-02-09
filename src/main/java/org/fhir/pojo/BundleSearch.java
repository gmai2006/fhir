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
import org.fhir.entity.BundleSearchModel;
import com.google.gson.GsonBuilder;

/**
* "A container for a collection of resources."
*/
public class BundleSearch  {
  /**
  * Description: "Why this entry is in the result set - whether it's included as a match or because of an _include requirement."
  */
  private String mode;

  /**
  * Description: "Extensions for mode"
  */
  private transient Element _mode;

  /**
  * Description: "When searching, the server's search ranking score for the entry."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float score;

  /**
  * Description: "Extensions for score"
  */
  private transient Element _score;

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

  public BundleSearch() {
  }

  public BundleSearch(BundleSearchModel o) {
    this.id = o.getId();
      if (null != o.getMode()) {
        this.mode = new String(o.getMode());
      }

      if (null != o.getScore()) {
        this.score = new Float(o.getScore());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setMode( String value) {
    this.mode = ModeEnum.fromCode(value);
  }
  public String getMode() {
    return this.mode;
  }
  public void set_mode( Element value) {
    this._mode = value;
  }
  public Element get_mode() {
    return this._mode;
  }
  public void setScore( Float value) {
    this.score = value;
  }
  public Float getScore() {
    return this.score;
  }
  public void set_score( Element value) {
    this._score = value;
  }
  public Element get_score() {
    return this._score;
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
     builder.append("mode" + "[" + String.valueOf(this.mode) + "]\n"); 
     builder.append("_mode" + "[" + String.valueOf(this._mode) + "]\n"); 
     builder.append("score" + "[" + String.valueOf(this.score) + "]\n"); 
     builder.append("_score" + "[" + String.valueOf(this._score) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum ModeEnum {
  	match,
  	include,
  	outcome,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "match" : { return match.toString(); }
  			case "include" : { return include.toString(); }
  			case "outcome" : { return outcome.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<BundleSearch> fromArray(java.util.List<BundleSearchModel> list) {
    return (java.util.List<BundleSearch>)list.stream()
      .map(model -> new BundleSearch(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<BundleSearchModel> toModelArray(java.util.List<BundleSearch> list) {
    return (java.util.List<BundleSearchModel>)list.stream()
      .map(model -> new BundleSearchModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static BundleSearch fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, BundleSearch.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(BundleSearch o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<BundleSearch> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}