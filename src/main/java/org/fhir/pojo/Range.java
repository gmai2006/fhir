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
* "A set of ordered Quantities defined by a low and high limit."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Range  extends Element  {
  /**
  * Description: "The low limit. The boundary is inclusive."
  */
  protected Quantity low;

  /**
  * Description: "The high limit. The boundary is inclusive."
  */
  protected Quantity high;

  public Range() {}

  public void setLow( Quantity value) {
    this.low = value;
  }
  public Quantity getLow() {
    return this.low;
  }
  public void setHigh( Quantity value) {
    this.high = value;
  }
  public Quantity getHigh() {
    return this.high;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Range]:" + "\n");
     if(this.low != null) builder.append("low" + "->" + this.low.toString() + "\n"); 
     if(this.high != null) builder.append("high" + "->" + this.high.toString() + "\n"); ;
    return builder.toString();
  }

}