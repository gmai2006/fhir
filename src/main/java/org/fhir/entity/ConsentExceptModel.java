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
package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
* generated on 07/14/2018
*/
@Entity
@Table(name="consentexcept")
public class ConsentExceptModel  implements Serializable {
	private static final long serialVersionUID = 153159210193953963L;
  /**
  * Description: "Action  to take - permit or deny - when the exception conditions are met."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "The timeframe in this exception is valid."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "Who or what is controlled by this Exception. Use group to identify a set of actors by some property they share (e.g. 'admitting officers')."
  */
  @javax.persistence.Basic
  @Column(name="\"actor_id\"")
  private String actor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="actor_id", insertable=false, updatable=false)
  private java.util.List<ConsentActor1Model> actor;

  /**
  * Description: "Actions controlled by this Exception."
  */
  @javax.persistence.Basic
  @Column(name="\"action_id\"")
  private String action_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="action_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> action;

  /**
  * Description: "A set of security labels that define which resources are controlled by this exception. If more than one label is specified, all resources must have all the specified labels."
  */
  @javax.persistence.Basic
  @Column(name="\"securitylabel_id\"")
  private String securitylabel_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="securitylabel_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> securityLabel;

  /**
  * Description: "The context of the activities a user is taking - why the user is accessing the data - that are controlled by this exception."
  */
  @javax.persistence.Basic
  @Column(name="\"purpose_id\"")
  private String purpose_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="purpose_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> purpose;

  /**
  * Description: "The class of information covered by this exception. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to."
  */
  @javax.persistence.Basic
  @Column(name="\"fhirclass_id\"")
  private String fhirclass_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="fhirclass_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> FHIRclass;

  /**
  * Description: "If this code is found in an instance, then the exception applies."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> code;

  /**
  * Description: "Clinical or Operational Relevant period of time that bounds the data controlled by this exception."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dataPeriod\"", length = 16777215)
  private String dataPeriod;

  /**
  * Description: "The resources controlled by this exception, if specific resources are referenced."
  */
  @javax.persistence.Basic
  @Column(name="\"data_id\"")
  private String data_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="data_id", insertable=false, updatable=false)
  private java.util.List<ConsentData1Model> data;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public ConsentExceptModel() {
  }

  public ConsentExceptModel(ConsentExcept o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.type = o.getType();
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    if (null != o.getActor() && !o.getActor().isEmpty()) {
    	this.actor_id = "actor" + this.id;
    	this.actor = ConsentActor1Helper.toModelFromArray(o.getActor(), this.actor_id);
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action_id = "action" + this.id;
    	this.action = CodeableConceptHelper.toModelFromArray(o.getAction(), this.action_id);
    }
    if (null != o.getSecurityLabel() && !o.getSecurityLabel().isEmpty()) {
    	this.securitylabel_id = "securitylabel" + this.id;
    	this.securityLabel = CodingHelper.toModelFromArray(o.getSecurityLabel(), this.securitylabel_id);
    }
    if (null != o.getPurpose() && !o.getPurpose().isEmpty()) {
    	this.purpose_id = "purpose" + this.id;
    	this.purpose = CodingHelper.toModelFromArray(o.getPurpose(), this.purpose_id);
    }
    if (null != o.getFHIRclass() && !o.getFHIRclass().isEmpty()) {
    	this.fhirclass_id = "fhirclass" + this.id;
    	this.FHIRclass = CodingHelper.toModelFromArray(o.getFHIRclass(), this.fhirclass_id);
    }
    if (null != o.getCode() && !o.getCode().isEmpty()) {
    	this.code_id = "code" + this.id;
    	this.code = CodingHelper.toModelFromArray(o.getCode(), this.code_id);
    }
    if (null != o.getDataPeriod()) {
    	this.dataPeriod = JsonUtils.toJson(o.getDataPeriod());
    }
    if (null != o.getData() && !o.getData().isEmpty()) {
    	this.data_id = "data" + this.id;
    	this.data = ConsentData1Helper.toModelFromArray(o.getData(), this.data_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public java.util.List<ConsentActor1Model> getActor() {
    return this.actor;
  }
  public void setActor( java.util.List<ConsentActor1Model> value) {
    this.actor = value;
  }
  public java.util.List<CodeableConceptModel> getAction() {
    return this.action;
  }
  public void setAction( java.util.List<CodeableConceptModel> value) {
    this.action = value;
  }
  public java.util.List<CodingModel> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setSecurityLabel( java.util.List<CodingModel> value) {
    this.securityLabel = value;
  }
  public java.util.List<CodingModel> getPurpose() {
    return this.purpose;
  }
  public void setPurpose( java.util.List<CodingModel> value) {
    this.purpose = value;
  }
  public java.util.List<CodingModel> getFHIRclass() {
    return this.FHIRclass;
  }
  public void setFHIRclass( java.util.List<CodingModel> value) {
    this.FHIRclass = value;
  }
  public java.util.List<CodingModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodingModel> value) {
    this.code = value;
  }
  public String getDataPeriod() {
    return this.dataPeriod;
  }
  public void setDataPeriod( String value) {
    this.dataPeriod = value;
  }
  public java.util.List<ConsentData1Model> getData() {
    return this.data;
  }
  public void setData( java.util.List<ConsentData1Model> value) {
    this.data = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConsentExceptModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("dataPeriod" + "->" + this.dataPeriod + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConsentExceptModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("dataPeriod" + "->" + this.dataPeriod + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}