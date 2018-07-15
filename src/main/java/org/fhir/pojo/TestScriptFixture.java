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
import com.google.gson.GsonBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestScriptFixture  extends BackboneElement  {
  /**
  * Description: "Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section."
  */
  protected Boolean autocreate;

  /**
  * Description: "Extensions for autocreate"
  */
  protected transient Element _autocreate;

  /**
  * Description: "Whether or not to implicitly delete the fixture during teardown. If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section."
  */
  protected Boolean autodelete;

  /**
  * Description: "Extensions for autodelete"
  */
  protected transient Element _autodelete;

  /**
  * Description: "Reference to the resource (containing the contents of the resource needed for operations)."
  */
  protected Reference resource;

  public TestScriptFixture() {}

  public void setAutocreate( Boolean value) {
    this.autocreate = value;
  }
  public Boolean getAutocreate() {
    return this.autocreate;
  }
  public void set_autocreate( Element value) {
    this._autocreate = value;
  }
  public Element get_autocreate() {
    return this._autocreate;
  }
  public void setAutodelete( Boolean value) {
    this.autodelete = value;
  }
  public Boolean getAutodelete() {
    return this.autodelete;
  }
  public void set_autodelete( Element value) {
    this._autodelete = value;
  }
  public Element get_autodelete() {
    return this._autodelete;
  }
  public void setResource( Reference value) {
    this.resource = value;
  }
  public Reference getResource() {
    return this.resource;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptFixture]:" + "\n");
     if(this.autocreate != null) builder.append("autocreate" + "->" + this.autocreate.toString() + "\n"); 
     if(this._autocreate != null) builder.append("_autocreate" + "->" + this._autocreate.toString() + "\n"); 
     if(this.autodelete != null) builder.append("autodelete" + "->" + this.autodelete.toString() + "\n"); 
     if(this._autodelete != null) builder.append("_autodelete" + "->" + this._autodelete.toString() + "\n"); 
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); ;
    return builder.toString();
  }

}