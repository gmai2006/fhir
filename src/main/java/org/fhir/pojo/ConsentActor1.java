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
import org.fhir.entity.ConsentActor1Model;
import com.google.gson.GsonBuilder;

/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
*/
public class ConsentActor1  extends BackboneElement  {
  /**
  * Description: "How the individual is involved in the resources content that is described in the exception."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept role;

  /**
  * Description: "The resource that identifies the actor. To identify a actors by type, use group to identify a set of actors by some property they share (e.g. 'admitting officers')."
  */
  @javax.validation.constraints.NotNull
  protected Reference reference;

  public ConsentActor1() {
  }

  public ConsentActor1(ConsentActor1Model o) {
    this.id = o.getId();
    if (null != o.getRole() && !o.getRole().isEmpty()) {
      this.role = new CodeableConcept(o.getRole().get(0));
    }
    if (null != o.getReference() && !o.getReference().isEmpty()) {
      this.reference = new Reference(o.getReference().get(0));
    }
  }

  public void setRole( CodeableConcept value) {
    this.role = value;
  }
  public CodeableConcept getRole() {
    return this.role;
  }
  public void setReference( Reference value) {
    this.reference = value;
  }
  public Reference getReference() {
    return this.reference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConsentActor1]:" + "\n");
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); 
     if(this.reference != null) builder.append("reference" + "->" + this.reference.toString() + "\n"); ;
    return builder.toString();
  }


}