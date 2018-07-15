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
import org.fhir.entity.OperationDefinitionBindingModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OperationDefinitionBinding  extends BackboneElement  {
  /**
  * Description: "Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances."
  */
  protected String strength;

  /**
  * Description: "Extensions for strength"
  */
  protected transient Element _strength;

  /**
  * Description: "Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used."
  */
  protected String valueSetUri;

  /**
  * Description: "Extensions for valueSetUri"
  */
  protected transient Element _valueSetUri;

  /**
  * Description: "Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used."
  */
  protected Reference valueSetReference;

  public OperationDefinitionBinding() {
  }

  public OperationDefinitionBinding(OperationDefinitionBindingModel o) {
    this.id = o.getId();
    if (null != o.getStrength()) {
      this.strength = o.getStrength();
    }
    if (null != o.getValueSetUri()) {
      this.valueSetUri = o.getValueSetUri();
    }
    if (null != o.getValueSetReference() && !o.getValueSetReference().isEmpty()) {
      this.valueSetReference = new Reference(o.getValueSetReference().get(0));
    }
  }

  public void setStrength( String value) {
    this.strength = StrengthEnum.fromCode(value);
  }
  public String getStrength() {
    return this.strength;
  }
  public void set_strength( Element value) {
    this._strength = value;
  }
  public Element get_strength() {
    return this._strength;
  }
  public void setValueSetUri( String value) {
    this.valueSetUri = value;
  }
  public String getValueSetUri() {
    return this.valueSetUri;
  }
  public void set_valueSetUri( Element value) {
    this._valueSetUri = value;
  }
  public Element get_valueSetUri() {
    return this._valueSetUri;
  }
  public void setValueSetReference( Reference value) {
    this.valueSetReference = value;
  }
  public Reference getValueSetReference() {
    return this.valueSetReference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[OperationDefinitionBinding]:" + "\n");
     if(this.strength != null) builder.append("strength" + "->" + this.strength.toString() + "\n"); 
     if(this._strength != null) builder.append("_strength" + "->" + this._strength.toString() + "\n"); 
     if(this.valueSetUri != null) builder.append("valueSetUri" + "->" + this.valueSetUri.toString() + "\n"); 
     if(this._valueSetUri != null) builder.append("_valueSetUri" + "->" + this._valueSetUri.toString() + "\n"); 
     if(this.valueSetReference != null) builder.append("valueSetReference" + "->" + this.valueSetReference.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum StrengthEnum {
  	required,
  	extensible,
  	preferred,
  	example,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "required" : { return required.toString(); }
  			case "extensible" : { return extensible.toString(); }
  			case "preferred" : { return preferred.toString(); }
  			case "example" : { return example.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}