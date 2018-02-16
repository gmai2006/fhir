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
import org.fhir.entity.ValueSetComposeModel;
import com.google.gson.GsonBuilder;

/**
* "A value set specifies a set of codes drawn from one or more code systems."
*/
public class ValueSetCompose  extends BackboneElement  {
  /**
  * Description: "If a locked date is defined, then the Content Logical Definition must be evaluated using the current version as of the locked date for referenced code system(s) and value set instances where ValueSet.compose.include.version is not defined."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String lockedDate;

  /**
  * Description: "Extensions for lockedDate"
  */
  protected transient Element _lockedDate;

  /**
  * Description: "Whether inactive codes - codes that are not approved for current use - are in the value set. If inactive = true, inactive codes are to be included in the expansion, if inactive = false, the inactive codes will not be included in the expansion. If absent, the behavior is determined by the implementation, or by the applicable ExpansionProfile (but generally, inactive codes would be expected to be included)."
  */
  protected Boolean inactive;

  /**
  * Description: "Extensions for inactive"
  */
  protected transient Element _inactive;

  /**
  * Description: "Include one or more codes from a code system or other value set(s)."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<ValueSetInclude> include = new java.util.ArrayList<>();

  /**
  * Description: "Exclude one or more codes from the value set based on code system filters and/or other value sets."
  */
  protected java.util.List<ValueSetInclude> exclude = new java.util.ArrayList<>();

  public ValueSetCompose() {
  }

  public ValueSetCompose(ValueSetComposeModel o) {
    this.id = o.getId();
    if (null != o.getLockedDate()) {
      this.lockedDate = o.getLockedDate();
    }
    if (null != o.getInactive()) {
      this.inactive = o.getInactive();
    }
    if (null != o.getInclude() && !o.getInclude().isEmpty()) {
    	this.include = ValueSetIncludeHelper.fromArray2Array(o.getInclude());
    }
    if (null != o.getExclude() && !o.getExclude().isEmpty()) {
    	this.exclude = ValueSetIncludeHelper.fromArray2Array(o.getExclude());
    }
  }

  public void setLockedDate( String value) {
    this.lockedDate = value;
  }
  public String getLockedDate() {
    return this.lockedDate;
  }
  public void set_lockedDate( Element value) {
    this._lockedDate = value;
  }
  public Element get_lockedDate() {
    return this._lockedDate;
  }
  public void setInactive( Boolean value) {
    this.inactive = value;
  }
  public Boolean getInactive() {
    return this.inactive;
  }
  public void set_inactive( Element value) {
    this._inactive = value;
  }
  public Element get_inactive() {
    return this._inactive;
  }
  public void setInclude( java.util.List<ValueSetInclude> value) {
    this.include = value;
  }
  public java.util.List<ValueSetInclude> getInclude() {
    return this.include;
  }
  public void setExclude( java.util.List<ValueSetInclude> value) {
    this.exclude = value;
  }
  public java.util.List<ValueSetInclude> getExclude() {
    return this.exclude;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ValueSetCompose]:" + "\n");
     if(this.lockedDate != null) builder.append("lockedDate" + "->" + this.lockedDate.toString() + "\n"); 
     if(this._lockedDate != null) builder.append("_lockedDate" + "->" + this._lockedDate.toString() + "\n"); 
     if(this.inactive != null) builder.append("inactive" + "->" + this.inactive.toString() + "\n"); 
     if(this._inactive != null) builder.append("_inactive" + "->" + this._inactive.toString() + "\n"); 
     if(this.include != null) builder.append("include" + "->" + this.include.toString() + "\n"); 
     if(this.exclude != null) builder.append("exclude" + "->" + this.exclude.toString() + "\n"); ;
    return builder.toString();
  }


}