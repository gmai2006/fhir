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
import org.fhir.entity.ProcedureFocalDeviceModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProcedureFocalDevice  extends BackboneElement  {
  /**
  * Description: "The kind of change that happened to the device during the procedure."
  */
  protected CodeableConcept action;

  /**
  * Description: "The device that was manipulated (changed) during the procedure."
  */
  @javax.validation.constraints.NotNull
  protected Reference manipulated;

  public ProcedureFocalDevice() {
  }

  public ProcedureFocalDevice(ProcedureFocalDeviceModel o) {
    this.id = o.getId();
    if (null != o.getAction() && !o.getAction().isEmpty()) {
      this.action = new CodeableConcept(o.getAction().get(0));
    }
    if (null != o.getManipulated() && !o.getManipulated().isEmpty()) {
      this.manipulated = new Reference(o.getManipulated().get(0));
    }
  }

  public void setAction( CodeableConcept value) {
    this.action = value;
  }
  public CodeableConcept getAction() {
    return this.action;
  }
  public void setManipulated( Reference value) {
    this.manipulated = value;
  }
  public Reference getManipulated() {
    return this.manipulated;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ProcedureFocalDevice]:" + "\n");
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this.manipulated != null) builder.append("manipulated" + "->" + this.manipulated.toString() + "\n"); ;
    return builder.toString();
  }


}