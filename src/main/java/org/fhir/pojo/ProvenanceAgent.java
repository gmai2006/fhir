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
import org.fhir.entity.ProvenanceAgentModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProvenanceAgent  extends BackboneElement  {
  /**
  * Description: "The function of the agent with respect to the activity. The security role enabling the agent with respect to the activity."
  */
  protected java.util.List<CodeableConcept> role;

  /**
  * Description: "The individual, device or organization that participated in the event."
  */
  protected String whoUri;

  /**
  * Description: "Extensions for whoUri"
  */
  protected transient Element _whoUri;

  /**
  * Description: "The individual, device or organization that participated in the event."
  */
  protected Reference whoReference;

  /**
  * Description: "The individual, device, or organization for whom the change was made."
  */
  protected String onBehalfOfUri;

  /**
  * Description: "Extensions for onBehalfOfUri"
  */
  protected transient Element _onBehalfOfUri;

  /**
  * Description: "The individual, device, or organization for whom the change was made."
  */
  protected Reference onBehalfOfReference;

  /**
  * Description: "The type of relationship between agents."
  */
  protected CodeableConcept relatedAgentType;

  public ProvenanceAgent() {
  }

  public ProvenanceAgent(ProvenanceAgentModel o) {
    this.id = o.getId();
    if (null != o.getRole() && !o.getRole().isEmpty()) {
    	this.role = CodeableConceptHelper.fromArray2Array(o.getRole());
    }
    if (null != o.getWhoUri()) {
      this.whoUri = o.getWhoUri();
    }
    if (null != o.getWhoReference() && !o.getWhoReference().isEmpty()) {
      this.whoReference = new Reference(o.getWhoReference().get(0));
    }
    if (null != o.getOnBehalfOfUri()) {
      this.onBehalfOfUri = o.getOnBehalfOfUri();
    }
    if (null != o.getOnBehalfOfReference() && !o.getOnBehalfOfReference().isEmpty()) {
      this.onBehalfOfReference = new Reference(o.getOnBehalfOfReference().get(0));
    }
    if (null != o.getRelatedAgentType() && !o.getRelatedAgentType().isEmpty()) {
      this.relatedAgentType = new CodeableConcept(o.getRelatedAgentType().get(0));
    }
  }

  public void setRole( java.util.List<CodeableConcept> value) {
    this.role = value;
  }
  public java.util.List<CodeableConcept> getRole() {
    return this.role;
  }
  public void setWhoUri( String value) {
    this.whoUri = value;
  }
  public String getWhoUri() {
    return this.whoUri;
  }
  public void set_whoUri( Element value) {
    this._whoUri = value;
  }
  public Element get_whoUri() {
    return this._whoUri;
  }
  public void setWhoReference( Reference value) {
    this.whoReference = value;
  }
  public Reference getWhoReference() {
    return this.whoReference;
  }
  public void setOnBehalfOfUri( String value) {
    this.onBehalfOfUri = value;
  }
  public String getOnBehalfOfUri() {
    return this.onBehalfOfUri;
  }
  public void set_onBehalfOfUri( Element value) {
    this._onBehalfOfUri = value;
  }
  public Element get_onBehalfOfUri() {
    return this._onBehalfOfUri;
  }
  public void setOnBehalfOfReference( Reference value) {
    this.onBehalfOfReference = value;
  }
  public Reference getOnBehalfOfReference() {
    return this.onBehalfOfReference;
  }
  public void setRelatedAgentType( CodeableConcept value) {
    this.relatedAgentType = value;
  }
  public CodeableConcept getRelatedAgentType() {
    return this.relatedAgentType;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ProvenanceAgent]:" + "\n");
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); 
     if(this.whoUri != null) builder.append("whoUri" + "->" + this.whoUri.toString() + "\n"); 
     if(this._whoUri != null) builder.append("_whoUri" + "->" + this._whoUri.toString() + "\n"); 
     if(this.whoReference != null) builder.append("whoReference" + "->" + this.whoReference.toString() + "\n"); 
     if(this.onBehalfOfUri != null) builder.append("onBehalfOfUri" + "->" + this.onBehalfOfUri.toString() + "\n"); 
     if(this._onBehalfOfUri != null) builder.append("_onBehalfOfUri" + "->" + this._onBehalfOfUri.toString() + "\n"); 
     if(this.onBehalfOfReference != null) builder.append("onBehalfOfReference" + "->" + this.onBehalfOfReference.toString() + "\n"); 
     if(this.relatedAgentType != null) builder.append("relatedAgentType" + "->" + this.relatedAgentType.toString() + "\n"); ;
    return builder.toString();
  }


}