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
import org.fhir.entity.DataRequirementCodeFilterModel;
import com.google.gson.GsonBuilder;

/**
* "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data."
*/
public class DataRequirementCodeFilter  {
  /**
  * Description: "The code-valued attribute of the filter. The specified path must be resolvable from the type of the required data. The path is allowed to contain qualifiers (.) to traverse sub-elements, as well as indexers ([x]) to traverse multiple-cardinality sub-elements. Note that the index must be an integer constant. The path must resolve to an element of type code, Coding, or CodeableConcept."
  */
  private String path;

  /**
  * Description: "Extensions for path"
  */
  private transient Element _path;

  /**
  * Description: "The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset."
  */
  private String valueSetString;

  /**
  * Description: "Extensions for valueSetString"
  */
  private transient Element _valueSetString;

  /**
  * Description: "The valueset for the code filter. The valueSet and value elements are exclusive. If valueSet is specified, the filter will return only those data items for which the value of the code-valued element specified in the path is a member of the specified valueset."
  */
  private Reference valueSetReference;

  /**
  * Description: "The codes for the code filter. Only one of valueSet, valueCode, valueCoding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified codes."
  */
  private java.util.List<String> valueCode = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for valueCode"
  */
  private transient java.util.List<Element> _valueCode = new java.util.ArrayList<>();

  /**
  * Description: "The Codings for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified Codings."
  */
  private java.util.List<Coding> valueCoding = new java.util.ArrayList<>();

  /**
  * Description: "The CodeableConcepts for the code filter. Only one of valueSet, valueCode, valueConding, or valueCodeableConcept may be specified. If values are given, the filter will return only those data items for which the code-valued attribute specified by the path has a value that is one of the specified CodeableConcepts."
  */
  private java.util.List<CodeableConcept> valueCodeableConcept = new java.util.ArrayList<>();

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
  @javax.validation.constraints.NotNull
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

  public DataRequirementCodeFilter() {
  }

  public DataRequirementCodeFilter(DataRequirementCodeFilterModel o) {
    this.id = o.getId();
    if (null != o.getPath()) {
      this.path = o.getPath();
    }
    if (null != o.getValueSetString()) {
      this.valueSetString = o.getValueSetString();
    }
    if (null != o.getValueSetReference() && !o.getValueSetReference().isEmpty()) {
      this.valueSetReference = new Reference(o.getValueSetReference().get(0));
    }
    if (o.getValueCode() != null) {
    	this.valueCode = org.fhir.utils.JsonUtils.json2Array(o.getValueCode());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setPath( String value) {
    this.path = value;
  }
  public String getPath() {
    return this.path;
  }
  public void set_path( Element value) {
    this._path = value;
  }
  public Element get_path() {
    return this._path;
  }
  public void setValueSetString( String value) {
    this.valueSetString = value;
  }
  public String getValueSetString() {
    return this.valueSetString;
  }
  public void set_valueSetString( Element value) {
    this._valueSetString = value;
  }
  public Element get_valueSetString() {
    return this._valueSetString;
  }
  public void setValueSetReference( Reference value) {
    this.valueSetReference = value;
  }
  public Reference getValueSetReference() {
    return this.valueSetReference;
  }
  public void setValueCode( java.util.List<String> value) {
    this.valueCode = value;
  }
  public java.util.List<String> getValueCode() {
    return this.valueCode;
  }
  public void set_valueCode( java.util.List<Element> value) {
    this._valueCode = value;
  }
  public java.util.List<Element> get_valueCode() {
    return this._valueCode;
  }
  public void setValueCoding( java.util.List<Coding> value) {
    this.valueCoding = value;
  }
  public java.util.List<Coding> getValueCoding() {
    return this.valueCoding;
  }
  public void setValueCodeableConcept( java.util.List<CodeableConcept> value) {
    this.valueCodeableConcept = value;
  }
  public java.util.List<CodeableConcept> getValueCodeableConcept() {
    return this.valueCodeableConcept;
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
    builder.append("[DataRequirementCodeFilter]:" + "\n");
     if(this.path != null) builder.append("path" + "->" + this.path.toString() + "\n"); 
     if(this._path != null) builder.append("_path" + "->" + this._path.toString() + "\n"); 
     if(this.valueSetString != null) builder.append("valueSetString" + "->" + this.valueSetString.toString() + "\n"); 
     if(this._valueSetString != null) builder.append("_valueSetString" + "->" + this._valueSetString.toString() + "\n"); 
     if(this.valueSetReference != null) builder.append("valueSetReference" + "->" + this.valueSetReference.toString() + "\n"); 
     if(this.valueCode != null) builder.append("valueCode" + "->" + this.valueCode.toString() + "\n"); 
     if(this._valueCode != null) builder.append("_valueCode" + "->" + this._valueCode.toString() + "\n"); 
     if(this.valueCoding != null) builder.append("valueCoding" + "->" + this.valueCoding.toString() + "\n"); 
     if(this.valueCodeableConcept != null) builder.append("valueCodeableConcept" + "->" + this.valueCodeableConcept.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}