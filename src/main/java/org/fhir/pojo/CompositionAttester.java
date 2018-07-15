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
import org.fhir.entity.CompositionAttesterModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CompositionAttester  extends BackboneElement  {
  /**
  * Description: "The type of attestation the authenticator offers."
  */
  protected java.util.List<String> mode;

  /**
  * Description: "Extensions for mode"
  */
  protected transient java.util.List<Element> _mode;

  /**
  * Description: "When the composition was attested by the party."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String time;

  /**
  * Description: "Extensions for time"
  */
  protected transient Element _time;

  /**
  * Description: "Who attested the composition in the specified way."
  */
  protected Reference party;

  public CompositionAttester() {
  }

  public CompositionAttester(CompositionAttesterModel o) {
    this.id = o.getId();
    if (o.getMode() != null) {
    	this.mode = org.fhir.utils.JsonUtils.json2Array(o.getMode());
    }
    if (null != o.getTime()) {
      this.time = o.getTime();
    }
    if (null != o.getParty() && !o.getParty().isEmpty()) {
      this.party = new Reference(o.getParty().get(0));
    }
  }

  public void setMode( java.util.List<String> value) {
    this.mode = ModeEnum.fromCode(value);
  }
  public java.util.List<String> getMode() {
    return this.mode;
  }
  public void set_mode( java.util.List<Element> value) {
    this._mode = value;
  }
  public java.util.List<Element> get_mode() {
    return this._mode;
  }
  public void setTime( String value) {
    this.time = value;
  }
  public String getTime() {
    return this.time;
  }
  public void set_time( Element value) {
    this._time = value;
  }
  public Element get_time() {
    return this._time;
  }
  public void setParty( Reference value) {
    this.party = value;
  }
  public Reference getParty() {
    return this.party;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CompositionAttester]:" + "\n");
     if(this.mode != null) builder.append("mode" + "->" + this.mode.toString() + "\n"); 
     if(this._mode != null) builder.append("_mode" + "->" + this._mode.toString() + "\n"); 
     if(this.time != null) builder.append("time" + "->" + this.time.toString() + "\n"); 
     if(this._time != null) builder.append("_time" + "->" + this._time.toString() + "\n"); 
     if(this.party != null) builder.append("party" + "->" + this.party.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ModeEnum {
  	personal,
  	professional,
  	legal,
  	official,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "personal" : { result.add(personal.toString()); }
  		  			case "professional" : { result.add(professional.toString()); }
  		  			case "legal" : { result.add(legal.toString()); }
  		  			case "official" : { result.add(official.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }

}