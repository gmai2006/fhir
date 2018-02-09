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
import org.fhir.entity.CompositionAttesterModel;
import com.google.gson.GsonBuilder;

/**
* "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
*/
public class CompositionAttester  {
  /**
  * Description: "The type of attestation the authenticator offers."
  */
  private java.util.List<String> mode = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for mode"
  */
  private transient java.util.List<Element> _mode = new java.util.ArrayList<>();

  /**
  * Description: "When the composition was attested by the party."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String time;

  /**
  * Description: "Extensions for time"
  */
  private transient Element _time;

  /**
  * Description: "Who attested the composition in the specified way."
  */
  private Reference party;

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

  public CompositionAttester() {
  }

  public CompositionAttester(CompositionAttesterModel o) {
    this.id = o.getId();
      this.mode = org.fhir.utils.JsonUtils.json2Array(o.getMode());

      if (null != o.getTime()) {
        this.time = new String(o.getTime());
      }

      if (null != o.getParty()) {
        this.party = new Reference(o.getParty());
        this.party.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setMode( java.util.List<String> value) {
    this.mode = ModeEnum.fromCode(value);
  }
  public java.util.List<String> getMode() {
    return this.mode;
  }
  public void set_mode( java.util.List<Element> value) {
    this._mode = value;
  }
  public java.util.List<Element> get_mode() {
    return this._mode;
  }
  public void setTime( String value) {
    this.time = value;
  }
  public String getTime() {
    return this.time;
  }
  public void set_time( Element value) {
    this._time = value;
  }
  public Element get_time() {
    return this._time;
  }
  public void setParty( Reference value) {
    this.party = value;
  }
  public Reference getParty() {
    return this.party;
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
     builder.append("time" + "[" + String.valueOf(this.time) + "]\n"); 
     builder.append("_time" + "[" + String.valueOf(this._time) + "]\n"); 
     builder.append("party" + "[" + String.valueOf(this.party) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum ModeEnum {
  	personal,
  	professional,
  	legal,
  	official,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "personal" : { result.add(personal.toString()); }
  		  			case "professional" : { result.add(professional.toString()); }
  		  			case "legal" : { result.add(legal.toString()); }
  		  			case "official" : { result.add(official.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }

  public static java.util.List<CompositionAttester> fromArray(java.util.List<CompositionAttesterModel> list) {
    return (java.util.List<CompositionAttester>)list.stream()
      .map(model -> new CompositionAttester(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CompositionAttesterModel> toModelArray(java.util.List<CompositionAttester> list) {
    return (java.util.List<CompositionAttesterModel>)list.stream()
      .map(model -> new CompositionAttesterModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CompositionAttester fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CompositionAttester.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CompositionAttester o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CompositionAttester> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}