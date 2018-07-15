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
public class TestScriptCapability  extends BackboneElement  {
  /**
  * Description: "Whether or not the test execution will require the given capabilities of the server in order for this test script to execute."
  */
  protected Boolean required;

  /**
  * Description: "Extensions for required"
  */
  protected transient Element _required;

  /**
  * Description: "Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute."
  */
  protected Boolean validated;

  /**
  * Description: "Extensions for validated"
  */
  protected transient Element _validated;

  /**
  * Description: "Description of the capabilities that this test script is requiring the server to support."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "Which origin server these requirements apply to."
  */
  protected java.util.List<Float> origin;

  /**
  * Description: "Extensions for origin"
  */
  protected transient java.util.List<Element> _origin;

  /**
  * Description: "Which server these requirements apply to."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float destination;

  /**
  * Description: "Extensions for destination"
  */
  protected transient Element _destination;

  /**
  * Description: "Links to the FHIR specification that describes this interaction and the resources involved in more detail."
  */
  protected java.util.List<String> link;

  /**
  * Description: "Extensions for link"
  */
  protected transient java.util.List<Element> _link;

  /**
  * Description: "Minimum capabilities required of server for test script to execute successfully.   If server does not meet at a minimum the referenced capability statement, then all tests in this script are skipped."
  */
  @javax.validation.constraints.NotNull
  protected Reference capabilities;

  public TestScriptCapability() {}

  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Boolean getRequired() {
    return this.required;
  }
  public void set_required( Element value) {
    this._required = value;
  }
  public Element get_required() {
    return this._required;
  }
  public void setValidated( Boolean value) {
    this.validated = value;
  }
  public Boolean getValidated() {
    return this.validated;
  }
  public void set_validated( Element value) {
    this._validated = value;
  }
  public Element get_validated() {
    return this._validated;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setOrigin( java.util.List<Float> value) {
    this.origin = value;
  }
  public java.util.List<Float> getOrigin() {
    return this.origin;
  }
  public void set_origin( java.util.List<Element> value) {
    this._origin = value;
  }
  public java.util.List<Element> get_origin() {
    return this._origin;
  }
  public void setDestination( Float value) {
    this.destination = value;
  }
  public Float getDestination() {
    return this.destination;
  }
  public void set_destination( Element value) {
    this._destination = value;
  }
  public Element get_destination() {
    return this._destination;
  }
  public void setLink( java.util.List<String> value) {
    this.link = value;
  }
  public java.util.List<String> getLink() {
    return this.link;
  }
  public void set_link( java.util.List<Element> value) {
    this._link = value;
  }
  public java.util.List<Element> get_link() {
    return this._link;
  }
  public void setCapabilities( Reference value) {
    this.capabilities = value;
  }
  public Reference getCapabilities() {
    return this.capabilities;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptCapability]:" + "\n");
     if(this.required != null) builder.append("required" + "->" + this.required.toString() + "\n"); 
     if(this._required != null) builder.append("_required" + "->" + this._required.toString() + "\n"); 
     if(this.validated != null) builder.append("validated" + "->" + this.validated.toString() + "\n"); 
     if(this._validated != null) builder.append("_validated" + "->" + this._validated.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.origin != null) builder.append("origin" + "->" + this.origin.toString() + "\n"); 
     if(this._origin != null) builder.append("_origin" + "->" + this._origin.toString() + "\n"); 
     if(this.destination != null) builder.append("destination" + "->" + this.destination.toString() + "\n"); 
     if(this._destination != null) builder.append("_destination" + "->" + this._destination.toString() + "\n"); 
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); 
     if(this._link != null) builder.append("_link" + "->" + this._link.toString() + "\n"); 
     if(this.capabilities != null) builder.append("capabilities" + "->" + this.capabilities.toString() + "\n"); ;
    return builder.toString();
  }

}