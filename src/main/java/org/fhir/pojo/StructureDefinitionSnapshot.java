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

/**
* "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types."
*/
public class StructureDefinitionSnapshot  extends BackboneElement  {
  /**
  * Description: "Captures constraints on each element within the resource."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<ElementDefinition> element = new java.util.ArrayList<>();

  public StructureDefinitionSnapshot() {}

  public void setElement( java.util.List<ElementDefinition> value) {
    this.element = value;
  }
  public java.util.List<ElementDefinition> getElement() {
    return this.element;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[StructureDefinitionSnapshot]:" + "\n");
     if(this.element != null) builder.append("element" + "->" + this.element.toString() + "\n"); ;
    return builder.toString();
  }

}