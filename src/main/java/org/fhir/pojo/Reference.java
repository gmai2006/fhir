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
import org.fhir.entity.ReferenceModel;
import com.google.gson.GsonBuilder;

/**
* "A reference from one resource to another."
*/
public class Reference  {
  /**
  * Description: "A reference to a location at which the other resource is found. The reference may be a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources."
  */
  private String reference;

  /**
  * Description: "Extensions for reference"
  */
  private transient Element _reference;

  /**
  * Description: "An identifier for the other resource. This is used when there is no way to reference the other resource directly, either because the entity is not available through a FHIR server, or because there is no way for the author of the resource to convert a known identifier to an actual location. There is no requirement that a Reference.identifier point to something that is actually exposed as a FHIR instance, but it SHALL point to a business concept that would be expected to be exposed as a FHIR instance, and that instance would need to be of a FHIR resource type allowed by the reference."
  */
  private Identifier identifier;

  /**
  * Description: "Plain text narrative that identifies the resource in addition to the resource reference."
  */
  private String display;

  /**
  * Description: "Extensions for display"
  */
  private transient Element _display;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public Reference() {
  }

  public Reference(ReferenceModel o) {
    this.id = o.getId();
      if (null != o.getReference()) {
        this.reference = new String(o.getReference());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getDisplay()) {
        this.display = new String(o.getDisplay());
      }

      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setReference( String value) {
    this.reference = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void set_reference( Element value) {
    this._reference = value;
  }
  public Element get_reference() {
    return this._reference;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void set_display( Element value) {
    this._display = value;
  }
  public Element get_display() {
    return this._display;
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
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("_reference" + "[" + String.valueOf(this._reference) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("display" + "[" + String.valueOf(this.display) + "]\n"); 
     builder.append("_display" + "[" + String.valueOf(this._display) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<Reference> fromArray(java.util.List<ReferenceModel> list) {
    return (java.util.List<Reference>)list.stream()
      .map(model -> new Reference(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ReferenceModel> toModelArray(java.util.List<Reference> list) {
    return (java.util.List<ReferenceModel>)list.stream()
      .map(model -> new ReferenceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Reference fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Reference.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Reference o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Reference> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}