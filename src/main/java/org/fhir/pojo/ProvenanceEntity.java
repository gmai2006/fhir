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
import org.fhir.entity.ProvenanceEntityModel;
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
public class ProvenanceEntity  extends BackboneElement  {
  /**
  * Description: "How the entity was used during the activity."
  */
  protected String role;

  /**
  * Description: "Extensions for role"
  */
  protected transient Element _role;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  */
  protected String whatUri;

  /**
  * Description: "Extensions for whatUri"
  */
  protected transient Element _whatUri;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  */
  protected Reference whatReference;

  /**
  * Description: "Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative."
  */
  protected Identifier whatIdentifier;

  /**
  * Description: "The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity."
  */
  protected java.util.List<ProvenanceAgent> agent;

  public ProvenanceEntity() {
  }

  public ProvenanceEntity(ProvenanceEntityModel o) {
    this.id = o.getId();
    if (null != o.getRole()) {
      this.role = o.getRole();
    }
    if (null != o.getWhatUri()) {
      this.whatUri = o.getWhatUri();
    }
    if (null != o.getWhatReference() && !o.getWhatReference().isEmpty()) {
      this.whatReference = new Reference(o.getWhatReference().get(0));
    }
    this.whatIdentifier = IdentifierHelper.fromJson(o.getWhatIdentifier());
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
    	this.agent = ProvenanceAgentHelper.fromArray2Array(o.getAgent());
    }
  }

  public void setRole( String value) {
    this.role = RoleEnum.fromCode(value);
  }
  public String getRole() {
    return this.role;
  }
  public void set_role( Element value) {
    this._role = value;
  }
  public Element get_role() {
    return this._role;
  }
  public void setWhatUri( String value) {
    this.whatUri = value;
  }
  public String getWhatUri() {
    return this.whatUri;
  }
  public void set_whatUri( Element value) {
    this._whatUri = value;
  }
  public Element get_whatUri() {
    return this._whatUri;
  }
  public void setWhatReference( Reference value) {
    this.whatReference = value;
  }
  public Reference getWhatReference() {
    return this.whatReference;
  }
  public void setWhatIdentifier( Identifier value) {
    this.whatIdentifier = value;
  }
  public Identifier getWhatIdentifier() {
    return this.whatIdentifier;
  }
  public void setAgent( java.util.List<ProvenanceAgent> value) {
    this.agent = value;
  }
  public java.util.List<ProvenanceAgent> getAgent() {
    return this.agent;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ProvenanceEntity]:" + "\n");
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); 
     if(this._role != null) builder.append("_role" + "->" + this._role.toString() + "\n"); 
     if(this.whatUri != null) builder.append("whatUri" + "->" + this.whatUri.toString() + "\n"); 
     if(this._whatUri != null) builder.append("_whatUri" + "->" + this._whatUri.toString() + "\n"); 
     if(this.whatReference != null) builder.append("whatReference" + "->" + this.whatReference.toString() + "\n"); 
     if(this.whatIdentifier != null) builder.append("whatIdentifier" + "->" + this.whatIdentifier.toString() + "\n"); 
     if(this.agent != null) builder.append("agent" + "->" + this.agent.toString() + "\n"); ;
    return builder.toString();
  }

  public enum RoleEnum {
  	derivation,
  	revision,
  	quotation,
  	source,
  	removal,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "derivation" : { return derivation.toString(); }
  			case "revision" : { return revision.toString(); }
  			case "quotation" : { return quotation.toString(); }
  			case "source" : { return source.toString(); }
  			case "removal" : { return removal.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}