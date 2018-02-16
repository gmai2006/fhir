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
import org.fhir.entity.ExpansionProfileDesignationModel;
import com.google.gson.GsonBuilder;

/**
* "Resource to define constraints on the Expansion of a FHIR ValueSet."
*/
public class ExpansionProfileDesignation  extends BackboneElement  {
  /**
  * Description: "Designations to be included."
  */
  protected ExpansionProfileInclude include;

  /**
  * Description: "Designations to be excluded."
  */
  protected ExpansionProfileExclude exclude;

  public ExpansionProfileDesignation() {
  }

  public ExpansionProfileDesignation(ExpansionProfileDesignationModel o) {
    this.id = o.getId();
    if (null != o.getInclude() && !o.getInclude().isEmpty()) {
      this.include = new ExpansionProfileInclude(o.getInclude().get(0));
    }
    if (null != o.getExclude() && !o.getExclude().isEmpty()) {
      this.exclude = new ExpansionProfileExclude(o.getExclude().get(0));
    }
  }

  public void setInclude( ExpansionProfileInclude value) {
    this.include = value;
  }
  public ExpansionProfileInclude getInclude() {
    return this.include;
  }
  public void setExclude( ExpansionProfileExclude value) {
    this.exclude = value;
  }
  public ExpansionProfileExclude getExclude() {
    return this.exclude;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExpansionProfileDesignation]:" + "\n");
     if(this.include != null) builder.append("include" + "->" + this.include.toString() + "\n"); 
     if(this.exclude != null) builder.append("exclude" + "->" + this.exclude.toString() + "\n"); ;
    return builder.toString();
  }


}