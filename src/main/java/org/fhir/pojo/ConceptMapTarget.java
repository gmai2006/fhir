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
import org.fhir.entity.ConceptMapTargetModel;
import com.google.gson.GsonBuilder;

/**
* "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
*/
public class ConceptMapTarget  {
  /**
  * Description: "Identity (code or path) or the element/item that the map refers to."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "The display for the code. The display is only provided to help editors when editing the concept map."
  */
  private String display;

  /**
  * Description: "Extensions for display"
  */
  private transient Element _display;

  /**
  * Description: "The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source)."
  */
  private String equivalence;

  /**
  * Description: "Extensions for equivalence"
  */
  private transient Element _equivalence;

  /**
  * Description: "A description of status/issues in mapping that conveys additional information not represented in  the structured data."
  */
  private String comment;

  /**
  * Description: "Extensions for comment"
  */
  private transient Element _comment;

  /**
  * Description: "A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value."
  */
  private java.util.List<ConceptMapDependsOn> dependsOn = new java.util.ArrayList<>();

  /**
  * Description: "A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on."
  */
  private java.util.List<ConceptMapDependsOn> product = new java.util.ArrayList<>();

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

  public ConceptMapTarget() {
  }

  public ConceptMapTarget(ConceptMapTargetModel o) {
    this.id = o.getId();
      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      if (null != o.getDisplay()) {
        this.display = new String(o.getDisplay());
      }

      if (null != o.getEquivalence()) {
        this.equivalence = new String(o.getEquivalence());
      }

      if (null != o.getComment()) {
        this.comment = new String(o.getComment());
      }

      this.dependsOn = ConceptMapDependsOn.fromArray(o.getDependsOn());

      this.product = ConceptMapDependsOn.fromArray(o.getProduct());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void set_code( Element value) {
    this._code = value;
  }
  public Element get_code() {
    return this._code;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void set_display( Element value) {
    this._display = value;
  }
  public Element get_display() {
    return this._display;
  }
  public void setEquivalence( String value) {
    this.equivalence = EquivalenceEnum.fromCode(value);
  }
  public String getEquivalence() {
    return this.equivalence;
  }
  public void set_equivalence( Element value) {
    this._equivalence = value;
  }
  public Element get_equivalence() {
    return this._equivalence;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }
  public void setDependsOn( java.util.List<ConceptMapDependsOn> value) {
    this.dependsOn = value;
  }
  public java.util.List<ConceptMapDependsOn> getDependsOn() {
    return this.dependsOn;
  }
  public void setProduct( java.util.List<ConceptMapDependsOn> value) {
    this.product = value;
  }
  public java.util.List<ConceptMapDependsOn> getProduct() {
    return this.product;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("display" + "[" + String.valueOf(this.display) + "]\n"); 
     builder.append("_display" + "[" + String.valueOf(this._display) + "]\n"); 
     builder.append("equivalence" + "[" + String.valueOf(this.equivalence) + "]\n"); 
     builder.append("_equivalence" + "[" + String.valueOf(this._equivalence) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
     builder.append("_comment" + "[" + String.valueOf(this._comment) + "]\n"); 
     builder.append("dependsOn" + "[" + String.valueOf(this.dependsOn) + "]\n"); 
     builder.append("product" + "[" + String.valueOf(this.product) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum EquivalenceEnum {
  	relatedto,
  	equivalent,
  	equal,
  	wider,
  	subsumes,
  	narrower,
  	specializes,
  	inexact,
  	unmatched,
  	disjoint,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "relatedto" : { return relatedto.toString(); }
  			case "equivalent" : { return equivalent.toString(); }
  			case "equal" : { return equal.toString(); }
  			case "wider" : { return wider.toString(); }
  			case "subsumes" : { return subsumes.toString(); }
  			case "narrower" : { return narrower.toString(); }
  			case "specializes" : { return specializes.toString(); }
  			case "inexact" : { return inexact.toString(); }
  			case "unmatched" : { return unmatched.toString(); }
  			case "disjoint" : { return disjoint.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ConceptMapTarget> fromArray(java.util.List<ConceptMapTargetModel> list) {
    return (java.util.List<ConceptMapTarget>)list.stream()
      .map(model -> new ConceptMapTarget(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ConceptMapTargetModel> toModelArray(java.util.List<ConceptMapTarget> list) {
    return (java.util.List<ConceptMapTargetModel>)list.stream()
      .map(model -> new ConceptMapTargetModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ConceptMapTarget fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ConceptMapTarget.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ConceptMapTarget o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ConceptMapTarget> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}