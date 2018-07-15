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
import org.fhir.entity.MeasureStratifierModel;
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
public class MeasureStratifier  extends BackboneElement  {
  /**
  * Description: "The identifier for the stratifier used to coordinate the reported data back to this stratifier."
  */
  protected Identifier identifier;

  /**
  * Description: "The criteria for the stratifier. This must be the name of an expression defined within a referenced library."
  */
  protected String criteria;

  /**
  * Description: "Extensions for criteria"
  */
  protected transient Element _criteria;

  /**
  * Description: "The path to an element that defines the stratifier, specified as a valid FHIR resource path."
  */
  protected String path;

  /**
  * Description: "Extensions for path"
  */
  protected transient Element _path;

  public MeasureStratifier() {
  }

  public MeasureStratifier(MeasureStratifierModel o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
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
    builder.append("[MeasureStratifier]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.criteria != null) builder.append("criteria" + "->" + this.criteria.toString() + "\n"); 
     if(this._criteria != null) builder.append("_criteria" + "->" + this._criteria.toString() + "\n"); 
     if(this.path != null) builder.append("path" + "->" + this.path.toString() + "\n"); 
     if(this._path != null) builder.append("_path" + "->" + this._path.toString() + "\n"); ;
    return builder.toString();
  }


}