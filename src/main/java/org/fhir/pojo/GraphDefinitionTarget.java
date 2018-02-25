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
import org.fhir.entity.GraphDefinitionTargetModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GraphDefinitionTarget  extends BackboneElement  {
  /**
  * Description: "Type of resource this link refers to."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "Profile for the target resource."
  */
  protected String profile;

  /**
  * Description: "Extensions for profile"
  */
  protected transient Element _profile;

  /**
  * Description: "Compartment Consistency Rules."
  */
  protected java.util.List<GraphDefinitionCompartment> compartment;

  /**
  * Description: "Additional links from target resource."
  */
  protected java.util.List<GraphDefinitionLink> link;

  public GraphDefinitionTarget() {
  }

  public GraphDefinitionTarget(GraphDefinitionTargetModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getProfile()) {
      this.profile = o.getProfile();
    }
    if (null != o.getCompartment() && !o.getCompartment().isEmpty()) {
    	this.compartment = GraphDefinitionCompartmentHelper.fromArray2Array(o.getCompartment());
    }
    if (null != o.getLink() && !o.getLink().isEmpty()) {
    	this.link = GraphDefinitionLinkHelper.fromArray2Array(o.getLink());
    }
  }

  public void setType( String value) {
    this.type = value;
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
  public void setProfile( String value) {
    this.profile = value;
  }
  public String getProfile() {
    return this.profile;
  }
  public void set_profile( Element value) {
    this._profile = value;
  }
  public Element get_profile() {
    return this._profile;
  }
  public void setCompartment( java.util.List<GraphDefinitionCompartment> value) {
    this.compartment = value;
  }
  public java.util.List<GraphDefinitionCompartment> getCompartment() {
    return this.compartment;
  }
  public void setLink( java.util.List<GraphDefinitionLink> value) {
    this.link = value;
  }
  public java.util.List<GraphDefinitionLink> getLink() {
    return this.link;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[GraphDefinitionTarget]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.profile != null) builder.append("profile" + "->" + this.profile.toString() + "\n"); 
     if(this._profile != null) builder.append("_profile" + "->" + this._profile.toString() + "\n"); 
     if(this.compartment != null) builder.append("compartment" + "->" + this.compartment.toString() + "\n"); 
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); ;
    return builder.toString();
  }


}