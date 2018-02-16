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
import org.fhir.entity.MeasureReportStratifierModel;
import com.google.gson.GsonBuilder;

/**
* "The MeasureReport resource contains the results of evaluating a measure."
*/
public class MeasureReportStratifier  extends BackboneElement  {
  /**
  * Description: "The identifier of this stratifier, as defined in the measure definition."
  */
  protected Identifier identifier;

  /**
  * Description: "This element contains the results for a single stratum within the stratifier. For example, when stratifying on administrative gender, there will be four strata, one for each possible gender value."
  */
  protected java.util.List<MeasureReportStratum> stratum = new java.util.ArrayList<>();

  public MeasureReportStratifier() {
  }

  public MeasureReportStratifier(MeasureReportStratifierModel o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getStratum() && !o.getStratum().isEmpty()) {
    	this.stratum = MeasureReportStratumHelper.fromArray2Array(o.getStratum());
    }
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setStratum( java.util.List<MeasureReportStratum> value) {
    this.stratum = value;
  }
  public java.util.List<MeasureReportStratum> getStratum() {
    return this.stratum;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MeasureReportStratifier]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.stratum != null) builder.append("stratum" + "->" + this.stratum.toString() + "\n"); ;
    return builder.toString();
  }


}