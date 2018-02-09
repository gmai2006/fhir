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
import org.fhir.entity.ConsentExceptModel;
import com.google.gson.GsonBuilder;

/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
*/
public class ConsentExcept  {
  /**
  * Description: "Action  to take - permit or deny - when the exception conditions are met."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "The timeframe in this exception is valid."
  */
  private Period period;

  /**
  * Description: "Who or what is controlled by this Exception. Use group to identify a set of actors by some property they share (e.g. 'admitting officers')."
  */
  private java.util.List<ConsentActor1> actor = new java.util.ArrayList<>();

  /**
  * Description: "Actions controlled by this Exception."
  */
  private java.util.List<CodeableConcept> action = new java.util.ArrayList<>();

  /**
  * Description: "A set of security labels that define which resources are controlled by this exception. If more than one label is specified, all resources must have all the specified labels."
  */
  private java.util.List<Coding> securityLabel = new java.util.ArrayList<>();

  /**
  * Description: "The context of the activities a user is taking - why the user is accessing the data - that are controlled by this exception."
  */
  private java.util.List<Coding> purpose = new java.util.ArrayList<>();

  /**
  * Description: "The class of information covered by this exception. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to."
  */
  private java.util.List<Coding> FHIRclass = new java.util.ArrayList<>();

  /**
  * Description: "If this code is found in an instance, then the exception applies."
  */
  private java.util.List<Coding> code = new java.util.ArrayList<>();

  /**
  * Description: "Clinical or Operational Relevant period of time that bounds the data controlled by this exception."
  */
  private Period dataPeriod;

  /**
  * Description: "The resources controlled by this exception, if specific resources are referenced."
  */
  private java.util.List<ConsentData1> data = new java.util.ArrayList<>();

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

  public ConsentExcept() {
  }

  public ConsentExcept(ConsentExceptModel o) {
    this.id = o.getId();
      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      this.period = Period.fromJson(o.getPeriod());
      this.actor = ConsentActor1.fromArray(o.getActor());

      this.action = CodeableConcept.fromArray(o.getAction());
      this.securityLabel = Coding.fromArray(o.getSecurityLabel());
      this.purpose = Coding.fromArray(o.getPurpose());
      this.FHIRclass = Coding.fromArray(o.getFHIRclass());
      this.code = Coding.fromArray(o.getCode());
      this.dataPeriod = Period.fromJson(o.getDataPeriod());
      this.data = ConsentData1.fromArray(o.getData());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setActor( java.util.List<ConsentActor1> value) {
    this.actor = value;
  }
  public java.util.List<ConsentActor1> getActor() {
    return this.actor;
  }
  public void setAction( java.util.List<CodeableConcept> value) {
    this.action = value;
  }
  public java.util.List<CodeableConcept> getAction() {
    return this.action;
  }
  public void setSecurityLabel( java.util.List<Coding> value) {
    this.securityLabel = value;
  }
  public java.util.List<Coding> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setPurpose( java.util.List<Coding> value) {
    this.purpose = value;
  }
  public java.util.List<Coding> getPurpose() {
    return this.purpose;
  }
  public void setFHIRclass( java.util.List<Coding> value) {
    this.FHIRclass = value;
  }
  public java.util.List<Coding> getFHIRclass() {
    return this.FHIRclass;
  }
  public void setCode( java.util.List<Coding> value) {
    this.code = value;
  }
  public java.util.List<Coding> getCode() {
    return this.code;
  }
  public void setDataPeriod( Period value) {
    this.dataPeriod = value;
  }
  public Period getDataPeriod() {
    return this.dataPeriod;
  }
  public void setData( java.util.List<ConsentData1> value) {
    this.data = value;
  }
  public java.util.List<ConsentData1> getData() {
    return this.data;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("actor" + "[" + String.valueOf(this.actor) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("securityLabel" + "[" + String.valueOf(this.securityLabel) + "]\n"); 
     builder.append("purpose" + "[" + String.valueOf(this.purpose) + "]\n"); 
     builder.append("FHIRclass" + "[" + String.valueOf(this.FHIRclass) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("dataPeriod" + "[" + String.valueOf(this.dataPeriod) + "]\n"); 
     builder.append("data" + "[" + String.valueOf(this.data) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	deny,
  	permit,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "deny" : { return deny.toString(); }
  			case "permit" : { return permit.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<ConsentExcept> fromArray(java.util.List<ConsentExceptModel> list) {
    return (java.util.List<ConsentExcept>)list.stream()
      .map(model -> new ConsentExcept(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ConsentExceptModel> toModelArray(java.util.List<ConsentExcept> list) {
    return (java.util.List<ConsentExceptModel>)list.stream()
      .map(model -> new ConsentExceptModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ConsentExcept fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ConsentExcept.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ConsentExcept o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ConsentExcept> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}