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
import org.fhir.entity.CompositionRelatesToModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CompositionRelatesTo  extends BackboneElement  {
  /**
  * Description: "The type of relationship that this composition has with anther composition or document."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "The target composition/document of this relationship."
  */
  protected Identifier targetIdentifier;

  /**
  * Description: "The target composition/document of this relationship."
  */
  protected Reference targetReference;

  public CompositionRelatesTo() {
  }

  public CompositionRelatesTo(CompositionRelatesToModel o) {
    this.id = o.getId();
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    this.targetIdentifier = IdentifierHelper.fromJson(o.getTargetIdentifier());
    if (null != o.getTargetReference() && !o.getTargetReference().isEmpty()) {
      this.targetReference = new Reference(o.getTargetReference().get(0));
    }
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void set_code( Element value) {
    this._code = value;
  }
  public Element get_code() {
    return this._code;
  }
  public void setTargetIdentifier( Identifier value) {
    this.targetIdentifier = value;
  }
  public Identifier getTargetIdentifier() {
    return this.targetIdentifier;
  }
  public void setTargetReference( Reference value) {
    this.targetReference = value;
  }
  public Reference getTargetReference() {
    return this.targetReference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CompositionRelatesTo]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.targetIdentifier != null) builder.append("targetIdentifier" + "->" + this.targetIdentifier.toString() + "\n"); 
     if(this.targetReference != null) builder.append("targetReference" + "->" + this.targetReference.toString() + "\n"); ;
    return builder.toString();
  }


}