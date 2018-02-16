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
public class ConsentExcept  extends BackboneElement  {
  /**
  * Description: "Action  to take - permit or deny - when the exception conditions are met."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "The timeframe in this exception is valid."
  */
  protected Period period;

  /**
  * Description: "Who or what is controlled by this Exception. Use group to identify a set of actors by some property they share (e.g. 'admitting officers')."
  */
  protected java.util.List<ConsentActor1> actor = new java.util.ArrayList<>();

  /**
  * Description: "Actions controlled by this Exception."
  */
  protected java.util.List<CodeableConcept> action = new java.util.ArrayList<>();

  /**
  * Description: "A set of security labels that define which resources are controlled by this exception. If more than one label is specified, all resources must have all the specified labels."
  */
  protected java.util.List<Coding> securityLabel = new java.util.ArrayList<>();

  /**
  * Description: "The context of the activities a user is taking - why the user is accessing the data - that are controlled by this exception."
  */
  protected java.util.List<Coding> purpose = new java.util.ArrayList<>();

  /**
  * Description: "The class of information covered by this exception. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to."
  */
  protected java.util.List<Coding> FHIRclass = new java.util.ArrayList<>();

  /**
  * Description: "If this code is found in an instance, then the exception applies."
  */
  protected java.util.List<Coding> code = new java.util.ArrayList<>();

  /**
  * Description: "Clinical or Operational Relevant period of time that bounds the data controlled by this exception."
  */
  protected Period dataPeriod;

  /**
  * Description: "The resources controlled by this exception, if specific resources are referenced."
  */
  protected java.util.List<ConsentData1> data = new java.util.ArrayList<>();

  public ConsentExcept() {
  }

  public ConsentExcept(ConsentExceptModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getActor() && !o.getActor().isEmpty()) {
    	this.actor = ConsentActor1Helper.fromArray2Array(o.getActor());
    }
    this.dataPeriod = PeriodHelper.fromJson(o.getDataPeriod());
    if (null != o.getData() && !o.getData().isEmpty()) {
    	this.data = ConsentData1Helper.fromArray2Array(o.getData());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConsentExcept]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.actor != null) builder.append("actor" + "->" + this.actor.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this.securityLabel != null) builder.append("securityLabel" + "->" + this.securityLabel.toString() + "\n"); 
     if(this.purpose != null) builder.append("purpose" + "->" + this.purpose.toString() + "\n"); 
     if(this.FHIRclass != null) builder.append("FHIRclass" + "->" + this.FHIRclass.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.dataPeriod != null) builder.append("dataPeriod" + "->" + this.dataPeriod.toString() + "\n"); 
     if(this.data != null) builder.append("data" + "->" + this.data.toString() + "\n"); ;
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

}