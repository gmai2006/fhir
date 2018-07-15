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
import org.fhir.entity.MeasureSupplementalDataModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The Measure resource provides the definition of a quality measure."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MeasureSupplementalData  extends BackboneElement  {
  /**
  * Description: "An identifier for the supplemental data."
  */
  protected Identifier identifier;

  /**
  * Description: "An indicator of the intended usage for the supplemental data element. Supplemental data indicates the data is additional information requested to augment the measure information. Risk adjustment factor indicates the data is additional information used to calculate risk adjustment factors when applying a risk model to the measure calculation."
  */
  protected java.util.List<CodeableConcept> usage;

  /**
  * Description: "The criteria for the supplemental data. This must be the name of a valid expression defined within a referenced library, and defines the data to be returned for this element."
  */
  protected String criteria;

  /**
  * Description: "Extensions for criteria"
  */
  protected transient Element _criteria;

  /**
  * Description: "The supplemental data to be supplied as part of the measure response, specified as a valid FHIR Resource Path."
  */
  protected String path;

  /**
  * Description: "Extensions for path"
  */
  protected transient Element _path;

  public MeasureSupplementalData() {
  }

  public MeasureSupplementalData(MeasureSupplementalDataModel o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getUsage() && !o.getUsage().isEmpty()) {
    	this.usage = CodeableConceptHelper.fromArray2Array(o.getUsage());
    }
    if (null != o.getCriteria()) {
      this.criteria = o.getCriteria();
    }
    if (null != o.getPath()) {
      this.path = o.getPath();
    }
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setUsage( java.util.List<CodeableConcept> value) {
    this.usage = value;
  }
  public java.util.List<CodeableConcept> getUsage() {
    return this.usage;
  }
  public void setCriteria( String value) {
    this.criteria = value;
  }
  public String getCriteria() {
    return this.criteria;
  }
  public void set_criteria( Element value) {
    this._criteria = value;
  }
  public Element get_criteria() {
    return this._criteria;
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MeasureSupplementalData]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.usage != null) builder.append("usage" + "->" + this.usage.toString() + "\n"); 
     if(this.criteria != null) builder.append("criteria" + "->" + this.criteria.toString() + "\n"); 
     if(this._criteria != null) builder.append("_criteria" + "->" + this._criteria.toString() + "\n"); 
     if(this.path != null) builder.append("path" + "->" + this.path.toString() + "\n"); 
     if(this._path != null) builder.append("_path" + "->" + this._path.toString() + "\n"); ;
    return builder.toString();
  }


}