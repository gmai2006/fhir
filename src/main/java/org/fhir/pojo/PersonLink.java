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
import org.fhir.entity.PersonLinkModel;
import com.google.gson.GsonBuilder;

/**
* "Demographics and administrative information about a person independent of a specific health-related context."
*/
public class PersonLink  extends BackboneElement  {
  /**
  * Description: "The resource to which this actual person is associated."
  */
  @javax.validation.constraints.NotNull
  protected Reference target;

  /**
  * Description: "Level of assurance that this link is actually associated with the target resource."
  */
  protected String assurance;

  /**
  * Description: "Extensions for assurance"
  */
  protected transient Element _assurance;

  public PersonLink() {
  }

  public PersonLink(PersonLinkModel o) {
    this.id = o.getId();
    if (null != o.getTarget() && !o.getTarget().isEmpty()) {
      this.target = new Reference(o.getTarget().get(0));
    }
    if (null != o.getAssurance()) {
      this.assurance = o.getAssurance();
    }
  }

  public void setTarget( Reference value) {
    this.target = value;
  }
  public Reference getTarget() {
    return this.target;
  }
  public void setAssurance( String value) {
    this.assurance = AssuranceEnum.fromCode(value);
  }
  public String getAssurance() {
    return this.assurance;
  }
  public void set_assurance( Element value) {
    this._assurance = value;
  }
  public Element get_assurance() {
    return this._assurance;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PersonLink]:" + "\n");
     if(this.target != null) builder.append("target" + "->" + this.target.toString() + "\n"); 
     if(this.assurance != null) builder.append("assurance" + "->" + this.assurance.toString() + "\n"); 
     if(this._assurance != null) builder.append("_assurance" + "->" + this._assurance.toString() + "\n"); ;
    return builder.toString();
  }

  public enum AssuranceEnum {
  	level1,
  	level2,
  	level3,
  	level4,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "level1" : { return level1.toString(); }
  			case "level2" : { return level2.toString(); }
  			case "level3" : { return level3.toString(); }
  			case "level4" : { return level4.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}