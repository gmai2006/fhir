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
import com.google.gson.GsonBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
/**
* "Captures constraints on each element within the resource, profile, or extension."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElementDefinitionBase  extends BackboneElement  {
  /**
  * Description: "The Path that identifies the base element - this matches the ElementDefinition.path for that element. Across FHIR, there is only one base definition of any element - that is, an element definition on a [[[StructureDefinition]]] without a StructureDefinition.base."
  */
  protected String path;

  /**
  * Description: "Extensions for path"
  */
  protected transient Element _path;

  /**
  * Description: "Minimum cardinality of the base element identified by the path."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float min;

  /**
  * Description: "Extensions for min"
  */
  protected transient Element _min;

  /**
  * Description: "Maximum cardinality of the base element identified by the path."
  */
  protected String max;

  /**
  * Description: "Extensions for max"
  */
  protected transient Element _max;

  public ElementDefinitionBase() {}

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
  public void setMin( Float value) {
    this.min = value;
  }
  public Float getMin() {
    return this.min;
  }
  public void set_min( Element value) {
    this._min = value;
  }
  public Element get_min() {
    return this._min;
  }
  public void setMax( String value) {
    this.max = value;
  }
  public String getMax() {
    return this.max;
  }
  public void set_max( Element value) {
    this._max = value;
  }
  public Element get_max() {
    return this._max;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ElementDefinitionBase]:" + "\n");
     if(this.path != null) builder.append("path" + "->" + this.path.toString() + "\n"); 
     if(this._path != null) builder.append("_path" + "->" + this._path.toString() + "\n"); 
     if(this.min != null) builder.append("min" + "->" + this.min.toString() + "\n"); 
     if(this._min != null) builder.append("_min" + "->" + this._min.toString() + "\n"); 
     if(this.max != null) builder.append("max" + "->" + this.max.toString() + "\n"); 
     if(this._max != null) builder.append("_max" + "->" + this._max.toString() + "\n"); ;
    return builder.toString();
  }

}