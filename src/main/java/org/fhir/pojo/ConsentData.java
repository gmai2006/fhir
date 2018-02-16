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
import org.fhir.entity.ConsentDataModel;
import com.google.gson.GsonBuilder;

/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
*/
public class ConsentData  extends BackboneElement  {
  /**
  * Description: "How the resource reference is interpreted when testing consent restrictions."
  */
  protected String meaning;

  /**
  * Description: "Extensions for meaning"
  */
  protected transient Element _meaning;

  /**
  * Description: "A reference to a specific resource that defines which resources are covered by this consent."
  */
  @javax.validation.constraints.NotNull
  protected Reference reference;

  public ConsentData() {
  }

  public ConsentData(ConsentDataModel o) {
    this.id = o.getId();
    if (null != o.getMeaning()) {
      this.meaning = o.getMeaning();
    }
    if (null != o.getReference() && !o.getReference().isEmpty()) {
      this.reference = new Reference(o.getReference().get(0));
    }
  }

  public void setMeaning( String value) {
    this.meaning = MeaningEnum.fromCode(value);
  }
  public String getMeaning() {
    return this.meaning;
  }
  public void set_meaning( Element value) {
    this._meaning = value;
  }
  public Element get_meaning() {
    return this._meaning;
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
    builder.append("[ConsentData]:" + "\n");
     if(this.meaning != null) builder.append("meaning" + "->" + this.meaning.toString() + "\n"); 
     if(this._meaning != null) builder.append("_meaning" + "->" + this._meaning.toString() + "\n"); 
     if(this.reference != null) builder.append("reference" + "->" + this.reference.toString() + "\n"); ;
    return builder.toString();
  }

  public enum MeaningEnum {
  	instance,
  	related,
  	dependents,
  	authoredby,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "instance" : { return instance.toString(); }
  			case "related" : { return related.toString(); }
  			case "dependents" : { return dependents.toString(); }
  			case "authoredby" : { return authoredby.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}