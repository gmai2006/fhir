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
import org.fhir.entity.MedicationAdministrationPerformerModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
*/
public class MedicationAdministrationPerformer  extends BackboneElement  {
  /**
  * Description: "The device, practitioner, etc. who performed the action."
  */
  @javax.validation.constraints.NotNull
  protected Reference actor;

  /**
  * Description: "The organization the device or practitioner was acting on behalf of."
  */
  protected Reference onBehalfOf;

  public MedicationAdministrationPerformer() {
  }

  public MedicationAdministrationPerformer(MedicationAdministrationPerformerModel o) {
    this.id = o.getId();
    if (null != o.getActor() && !o.getActor().isEmpty()) {
      this.actor = new Reference(o.getActor().get(0));
    }
    if (null != o.getOnBehalfOf() && !o.getOnBehalfOf().isEmpty()) {
      this.onBehalfOf = new Reference(o.getOnBehalfOf().get(0));
    }
  }

  public void setActor( Reference value) {
    this.actor = value;
  }
  public Reference getActor() {
    return this.actor;
  }
  public void setOnBehalfOf( Reference value) {
    this.onBehalfOf = value;
  }
  public Reference getOnBehalfOf() {
    return this.onBehalfOf;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationAdministrationPerformer]:" + "\n");
     if(this.actor != null) builder.append("actor" + "->" + this.actor.toString() + "\n"); 
     if(this.onBehalfOf != null) builder.append("onBehalfOf" + "->" + this.onBehalfOf.toString() + "\n"); ;
    return builder.toString();
  }


}