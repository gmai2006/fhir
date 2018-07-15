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
import org.fhir.entity.SubstanceInstanceModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A homogeneous material with a definite composition."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SubstanceInstance  extends BackboneElement  {
  /**
  * Description: "Identifier associated with the package/container (usually a label affixed directly)."
  */
  protected Identifier identifier;

  /**
  * Description: "When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String expiry;

  /**
  * Description: "Extensions for expiry"
  */
  protected transient Element _expiry;

  /**
  * Description: "The amount of the substance."
  */
  protected Quantity quantity;

  public SubstanceInstance() {
  }

  public SubstanceInstance(SubstanceInstanceModel o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getExpiry()) {
      this.expiry = o.getExpiry();
    }
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setExpiry( String value) {
    this.expiry = value;
  }
  public String getExpiry() {
    return this.expiry;
  }
  public void set_expiry( Element value) {
    this._expiry = value;
  }
  public Element get_expiry() {
    return this._expiry;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SubstanceInstance]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.expiry != null) builder.append("expiry" + "->" + this.expiry.toString() + "\n"); 
     if(this._expiry != null) builder.append("_expiry" + "->" + this._expiry.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); ;
    return builder.toString();
  }


}