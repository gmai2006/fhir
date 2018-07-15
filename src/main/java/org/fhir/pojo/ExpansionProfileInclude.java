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
import org.fhir.entity.ExpansionProfileIncludeModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Resource to define constraints on the Expansion of a FHIR ValueSet."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ExpansionProfileInclude  extends BackboneElement  {
  /**
  * Description: "A data group for each designation to be included."
  */
  protected java.util.List<ExpansionProfileDesignation1> designation;

  public ExpansionProfileInclude() {
  }

  public ExpansionProfileInclude(ExpansionProfileIncludeModel o) {
    this.id = o.getId();
    if (null != o.getDesignation() && !o.getDesignation().isEmpty()) {
    	this.designation = ExpansionProfileDesignation1Helper.fromArray2Array(o.getDesignation());
    }
  }

  public void setDesignation( java.util.List<ExpansionProfileDesignation1> value) {
    this.designation = value;
  }
  public java.util.List<ExpansionProfileDesignation1> getDesignation() {
    return this.designation;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExpansionProfileInclude]:" + "\n");
     if(this.designation != null) builder.append("designation" + "->" + this.designation.toString() + "\n"); ;
    return builder.toString();
  }


}