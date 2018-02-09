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

/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
*/
public class TestScriptFixture  {
  /**
  * Description: "Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section."
  */
  private Boolean autocreate;

  /**
  * Description: "Extensions for autocreate"
  */
  private transient Element _autocreate;

  /**
  * Description: "Whether or not to implicitly delete the fixture during teardown. If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section."
  */
  private Boolean autodelete;

  /**
  * Description: "Extensions for autodelete"
  */
  private transient Element _autodelete;

  /**
  * Description: "Reference to the resource (containing the contents of the resource needed for operations)."
  */
  private Reference resource;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

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
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("autocreate" + "[" + String.valueOf(this.autocreate) + "]\n"); 
     builder.append("_autocreate" + "[" + String.valueOf(this._autocreate) + "]\n"); 
     builder.append("autodelete" + "[" + String.valueOf(this.autodelete) + "]\n"); 
     builder.append("_autodelete" + "[" + String.valueOf(this._autodelete) + "]\n"); 
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static TestScriptFixture fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, TestScriptFixture.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(TestScriptFixture o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<TestScriptFixture> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

}