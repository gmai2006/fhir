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
import org.fhir.entity.BundleSearchModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A container for a collection of resources."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BundleSearch  extends BackboneElement  {
  /**
  * Description: "Why this entry is in the result set - whether it's included as a match or because of an _include requirement."
  */
  protected String mode;

  /**
  * Description: "Extensions for mode"
  */
  protected transient Element _mode;

  /**
  * Description: "When searching, the server's search ranking score for the entry."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float score;

  /**
  * Description: "Extensions for score"
  */
  protected transient Element _score;

  public BundleSearch() {
  }

  public BundleSearch(BundleSearchModel o) {
    this.id = o.getId();
    if (null != o.getMode()) {
      this.mode = o.getMode();
    }
    if (null != o.getScore()) {
      this.score = o.getScore();
    }
  }

  public void setMode( String value) {
    this.mode = ModeEnum.fromCode(value);
  }
  public String getMode() {
    return this.mode;
  }
  public void set_mode( Element value) {
    this._mode = value;
  }
  public Element get_mode() {
    return this._mode;
  }
  public void setScore( Float value) {
    this.score = value;
  }
  public Float getScore() {
    return this.score;
  }
  public void set_score( Element value) {
    this._score = value;
  }
  public Element get_score() {
    return this._score;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[BundleSearch]:" + "\n");
     if(this.mode != null) builder.append("mode" + "->" + this.mode.toString() + "\n"); 
     if(this._mode != null) builder.append("_mode" + "->" + this._mode.toString() + "\n"); 
     if(this.score != null) builder.append("score" + "->" + this.score.toString() + "\n"); 
     if(this._score != null) builder.append("_score" + "->" + this._score.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ModeEnum {
  	match,
  	include,
  	outcome,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "match" : { return match.toString(); }
  			case "include" : { return include.toString(); }
  			case "outcome" : { return outcome.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}