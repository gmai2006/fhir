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
import org.fhir.entity.ContractAgentModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ContractAgent  extends BackboneElement  {
  /**
  * Description: "Who or what parties are assigned roles in this Contract."
  */
  @javax.validation.constraints.NotNull
  protected Reference actor;

  /**
  * Description: "Role type of agent assigned roles in this Contract."
  */
  protected java.util.List<CodeableConcept> role;

  public ContractAgent() {
  }

  public ContractAgent(ContractAgentModel o) {
    this.id = o.getId();
    if (null != o.getActor() && !o.getActor().isEmpty()) {
      this.actor = new Reference(o.getActor().get(0));
    }
    if (null != o.getRole() && !o.getRole().isEmpty()) {
    	this.role = CodeableConceptHelper.fromArray2Array(o.getRole());
    }
  }

  public void setActor( Reference value) {
    this.actor = value;
  }
  public Reference getActor() {
    return this.actor;
  }
  public void setRole( java.util.List<CodeableConcept> value) {
    this.role = value;
  }
  public java.util.List<CodeableConcept> getRole() {
    return this.role;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ContractAgent]:" + "\n");
     if(this.actor != null) builder.append("actor" + "->" + this.actor.toString() + "\n"); 
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); ;
    return builder.toString();
  }


}