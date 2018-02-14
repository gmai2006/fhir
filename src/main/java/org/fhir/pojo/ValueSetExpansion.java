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
import org.fhir.entity.ValueSetExpansionModel;
import com.google.gson.GsonBuilder;

/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
public class ValueSetExpansion  {
  /**
  * Description: "An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so."
  */
  private String identifier;

  /**
  * Description: "Extensions for identifier"
  */
  private transient Element _identifier;

  /**
  * Description: "The time at which the expansion was produced by the expanding system."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String timestamp;

  /**
  * Description: "Extensions for timestamp"
  */
  private transient Element _timestamp;

  /**
  * Description: "The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float total;

  /**
  * Description: "Extensions for total"
  */
  private transient Element _total;

  /**
  * Description: "If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float offset;

  /**
  * Description: "Extensions for offset"
  */
  private transient Element _offset;

  /**
  * Description: "A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion."
  */
  private java.util.List<ValueSetParameter> parameter = new java.util.ArrayList<>();

  /**
  * Description: "The codes that are contained in the value set expansion."
  */
  private java.util.List<ValueSetContains> contains = new java.util.ArrayList<>();

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

  public ValueSetExpansion() {
  }

  public ValueSetExpansion(ValueSetExpansionModel o) {
    this.id = o.getId();
    if (null != o.getIdentifier()) {
      this.identifier = o.getIdentifier();
    }
    if (null != o.getTimestamp()) {
      this.timestamp = o.getTimestamp();
    }
    if (null != o.getTotal()) {
      this.total = o.getTotal();
    }
    if (null != o.getOffset()) {
      this.offset = o.getOffset();
    }
    if (null != o.getParameter() && !o.getParameter().isEmpty()) {
    	this.parameter = ValueSetParameterHelper.fromArray2Array(o.getParameter());
    }
    if (null != o.getContains() && !o.getContains().isEmpty()) {
    	this.contains = ValueSetContainsHelper.fromArray2Array(o.getContains());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void set_identifier( Element value) {
    this._identifier = value;
  }
  public Element get_identifier() {
    return this._identifier;
  }
  public void setTimestamp( String value) {
    this.timestamp = value;
  }
  public String getTimestamp() {
    return this.timestamp;
  }
  public void set_timestamp( Element value) {
    this._timestamp = value;
  }
  public Element get_timestamp() {
    return this._timestamp;
  }
  public void setTotal( Float value) {
    this.total = value;
  }
  public Float getTotal() {
    return this.total;
  }
  public void set_total( Element value) {
    this._total = value;
  }
  public Element get_total() {
    return this._total;
  }
  public void setOffset( Float value) {
    this.offset = value;
  }
  public Float getOffset() {
    return this.offset;
  }
  public void set_offset( Element value) {
    this._offset = value;
  }
  public Element get_offset() {
    return this._offset;
  }
  public void setParameter( java.util.List<ValueSetParameter> value) {
    this.parameter = value;
  }
  public java.util.List<ValueSetParameter> getParameter() {
    return this.parameter;
  }
  public void setContains( java.util.List<ValueSetContains> value) {
    this.contains = value;
  }
  public java.util.List<ValueSetContains> getContains() {
    return this.contains;
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
    builder.append("[ValueSetExpansion]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this._identifier != null) builder.append("_identifier" + "->" + this._identifier.toString() + "\n"); 
     if(this.timestamp != null) builder.append("timestamp" + "->" + this.timestamp.toString() + "\n"); 
     if(this._timestamp != null) builder.append("_timestamp" + "->" + this._timestamp.toString() + "\n"); 
     if(this.total != null) builder.append("total" + "->" + this.total.toString() + "\n"); 
     if(this._total != null) builder.append("_total" + "->" + this._total.toString() + "\n"); 
     if(this.offset != null) builder.append("offset" + "->" + this.offset.toString() + "\n"); 
     if(this._offset != null) builder.append("_offset" + "->" + this._offset.toString() + "\n"); 
     if(this.parameter != null) builder.append("parameter" + "->" + this.parameter.toString() + "\n"); 
     if(this.contains != null) builder.append("contains" + "->" + this.contains.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}