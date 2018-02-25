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
* "A relationship of two Quantity values - expressed as a numerator and a denominator."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ratio  extends Element  {
  /**
  * Description: "The value of the numerator."
  */
  protected Quantity numerator;

  /**
  * Description: "The value of the denominator."
  */
  protected Quantity denominator;

  public Ratio() {}

  public void setNumerator( Quantity value) {
    this.numerator = value;
  }
  public Quantity getNumerator() {
    return this.numerator;
  }
  public void setDenominator( Quantity value) {
    this.denominator = value;
  }
  public Quantity getDenominator() {
    return this.denominator;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Ratio]:" + "\n");
     if(this.numerator != null) builder.append("numerator" + "->" + this.numerator.toString() + "\n"); 
     if(this.denominator != null) builder.append("denominator" + "->" + this.denominator.toString() + "\n"); ;
    return builder.toString();
  }

}