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
import org.fhir.entity.ConceptMapTargetModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ConceptMapTarget  extends BackboneElement  {
  /**
  * Description: "Identity (code or path) or the element/item that the map refers to."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "The display for the code. The display is only provided to help editors when editing the concept map."
  */
  protected String display;

  /**
  * Description: "Extensions for display"
  */
  protected transient Element _display;

  /**
  * Description: "The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source)."
  */
  protected String equivalence;

  /**
  * Description: "Extensions for equivalence"
  */
  protected transient Element _equivalence;

  /**
  * Description: "A description of status/issues in mapping that conveys additional information not represented in  the structured data."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  /**
  * Description: "A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value."
  */
  protected java.util.List<ConceptMapDependsOn> dependsOn;

  /**
  * Description: "A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on."
  */
  protected java.util.List<ConceptMapDependsOn> product;

  public ConceptMapTarget() {
  }

  public ConceptMapTarget(ConceptMapTargetModel o) {
    this.id = o.getId();
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (null != o.getDisplay()) {
      this.display = o.getDisplay();
    }
    if (null != o.getEquivalence()) {
      this.equivalence = o.getEquivalence();
    }
    if (null != o.getComment()) {
      this.comment = o.getComment();
    }
    if (null != o.getDependsOn() && !o.getDependsOn().isEmpty()) {
    	this.dependsOn = ConceptMapDependsOnHelper.fromArray2Array(o.getDependsOn());
    }
    if (null != o.getProduct() && !o.getProduct().isEmpty()) {
    	this.product = ConceptMapDependsOnHelper.fromArray2Array(o.getProduct());
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
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void set_display( Element value) {
    this._display = value;
  }
  public Element get_display() {
    return this._display;
  }
  public void setEquivalence( String value) {
    this.equivalence = EquivalenceEnum.fromCode(value);
  }
  public String getEquivalence() {
    return this.equivalence;
  }
  public void set_equivalence( Element value) {
    this._equivalence = value;
  }
  public Element get_equivalence() {
    return this._equivalence;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }
  public void setDependsOn( java.util.List<ConceptMapDependsOn> value) {
    this.dependsOn = value;
  }
  public java.util.List<ConceptMapDependsOn> getDependsOn() {
    return this.dependsOn;
  }
  public void setProduct( java.util.List<ConceptMapDependsOn> value) {
    this.product = value;
  }
  public java.util.List<ConceptMapDependsOn> getProduct() {
    return this.product;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConceptMapTarget]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.display != null) builder.append("display" + "->" + this.display.toString() + "\n"); 
     if(this._display != null) builder.append("_display" + "->" + this._display.toString() + "\n"); 
     if(this.equivalence != null) builder.append("equivalence" + "->" + this.equivalence.toString() + "\n"); 
     if(this._equivalence != null) builder.append("_equivalence" + "->" + this._equivalence.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); 
     if(this.dependsOn != null) builder.append("dependsOn" + "->" + this.dependsOn.toString() + "\n"); 
     if(this.product != null) builder.append("product" + "->" + this.product.toString() + "\n"); ;
    return builder.toString();
  }

  public enum EquivalenceEnum {
  	relatedto,
  	equivalent,
  	equal,
  	wider,
  	subsumes,
  	narrower,
  	specializes,
  	inexact,
  	unmatched,
  	disjoint,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "relatedto" : { return relatedto.toString(); }
  			case "equivalent" : { return equivalent.toString(); }
  			case "equal" : { return equal.toString(); }
  			case "wider" : { return wider.toString(); }
  			case "subsumes" : { return subsumes.toString(); }
  			case "narrower" : { return narrower.toString(); }
  			case "specializes" : { return specializes.toString(); }
  			case "inexact" : { return inexact.toString(); }
  			case "unmatched" : { return unmatched.toString(); }
  			case "disjoint" : { return disjoint.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}