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
import org.fhir.entity.PatientLinkModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PatientLink  extends BackboneElement  {
  /**
  * Description: "The other patient resource that the link refers to."
  */
  @javax.validation.constraints.NotNull
  protected Reference other;

  /**
  * Description: "The type of link between this patient resource and another patient resource."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  public PatientLink() {
  }

  public PatientLink(PatientLinkModel o) {
    this.id = o.getId();
    if (null != o.getOther() && !o.getOther().isEmpty()) {
      this.other = new Reference(o.getOther().get(0));
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
  }

  public void setOther( Reference value) {
    this.other = value;
  }
  public Reference getOther() {
    return this.other;
  }
  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PatientLink]:" + "\n");
     if(this.other != null) builder.append("other" + "->" + this.other.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum TypeEnum {
  	replacedby,
  	replaces,
  	refer,
  	seealso,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "replacedby" : { return replacedby.toString(); }
  			case "replaces" : { return replaces.toString(); }
  			case "refer" : { return refer.toString(); }
  			case "seealso" : { return seealso.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}