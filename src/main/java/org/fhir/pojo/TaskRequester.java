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
import org.fhir.entity.TaskRequesterModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A task to be performed."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TaskRequester  extends BackboneElement  {
  /**
  * Description: "The device, practitioner, etc. who initiated the task."
  */
  @javax.validation.constraints.NotNull
  protected Reference agent;

  /**
  * Description: "The organization the device or practitioner was acting on behalf of when they initiated the task."
  */
  protected Reference onBehalfOf;

  public TaskRequester() {
  }

  public TaskRequester(TaskRequesterModel o) {
    this.id = o.getId();
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
      this.agent = new Reference(o.getAgent().get(0));
    }
    if (null != o.getOnBehalfOf() && !o.getOnBehalfOf().isEmpty()) {
      this.onBehalfOf = new Reference(o.getOnBehalfOf().get(0));
    }
  }

  public void setAgent( Reference value) {
    this.agent = value;
  }
  public Reference getAgent() {
    return this.agent;
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
    builder.append("[TaskRequester]:" + "\n");
     if(this.agent != null) builder.append("agent" + "->" + this.agent.toString() + "\n"); 
     if(this.onBehalfOf != null) builder.append("onBehalfOf" + "->" + this.onBehalfOf.toString() + "\n"); ;
    return builder.toString();
  }


}