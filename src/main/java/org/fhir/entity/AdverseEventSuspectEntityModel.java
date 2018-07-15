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
* "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death."
* generated on 07/14/2018
*/
@Entity
@Table(name="adverseeventsuspectentity")
public class AdverseEventSuspectEntityModel  implements Serializable {
	private static final long serialVersionUID = 153159210195346845L;
  /**
  * Description: "Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device."
  */
  @javax.persistence.Basic
  @Column(name="\"instance_id\"")
  private String instance_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="instance_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> instance;

  /**
  * Description: "causality1 | causality2."
  */
  @javax.persistence.Basic
  @Column(name="\"causality\"")
  private String causality;

  /**
  * Description: "assess1 | assess2."
  */
  @javax.persistence.Basic
  @Column(name="\"causalityassessment_id\"")
  private String causalityassessment_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="causalityassessment_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> causalityAssessment;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityProductRelatedness."
  */
  @javax.persistence.Basic
  @Column(name="\"causalityProductRelatedness\"")
  private String causalityProductRelatedness;

  /**
  * Description: "method1 | method2."
  */
  @javax.persistence.Basic
  @Column(name="\"causalitymethod_id\"")
  private String causalitymethod_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="causalitymethod_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> causalityMethod;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityAuthor."
  */
  @javax.persistence.Basic
  @Column(name="\"causalityauthor_id\"")
  private String causalityauthor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="causalityauthor_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> causalityAuthor;

  /**
  * Description: "result1 | result2."
  */
  @javax.persistence.Basic
  @Column(name="\"causalityresult_id\"")
  private String causalityresult_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="causalityresult_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> causalityResult;

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

  public AdverseEventSuspectEntityModel() {
  }

  public AdverseEventSuspectEntityModel(AdverseEventSuspectEntity o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getInstance() ) {
    	this.instance_id = "instance" + this.id;
    	this.instance = ReferenceHelper.toModel(o.getInstance(), this.instance_id);
    }
    this.causality = o.getCausality();
    if (null != o.getCausalityAssessment() ) {
    	this.causalityassessment_id = "causalityassessment" + this.id;
    	this.causalityAssessment = CodeableConceptHelper.toModel(o.getCausalityAssessment(), this.causalityassessment_id);
    }
    this.causalityProductRelatedness = o.getCausalityProductRelatedness();
    if (null != o.getCausalityMethod() ) {
    	this.causalitymethod_id = "causalitymethod" + this.id;
    	this.causalityMethod = CodeableConceptHelper.toModel(o.getCausalityMethod(), this.causalitymethod_id);
    }
    if (null != o.getCausalityAuthor() ) {
    	this.causalityauthor_id = "causalityauthor" + this.id;
    	this.causalityAuthor = ReferenceHelper.toModel(o.getCausalityAuthor(), this.causalityauthor_id);
    }
    if (null != o.getCausalityResult() ) {
    	this.causalityresult_id = "causalityresult" + this.id;
    	this.causalityResult = CodeableConceptHelper.toModel(o.getCausalityResult(), this.causalityresult_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<ReferenceModel> getInstance() {
    return this.instance;
  }
  public void setInstance( java.util.List<ReferenceModel> value) {
    this.instance = value;
  }
  public String getCausality() {
    return this.causality;
  }
  public void setCausality( String value) {
    this.causality = value;
  }
  public java.util.List<CodeableConceptModel> getCausalityAssessment() {
    return this.causalityAssessment;
  }
  public void setCausalityAssessment( java.util.List<CodeableConceptModel> value) {
    this.causalityAssessment = value;
  }
  public String getCausalityProductRelatedness() {
    return this.causalityProductRelatedness;
  }
  public void setCausalityProductRelatedness( String value) {
    this.causalityProductRelatedness = value;
  }
  public java.util.List<CodeableConceptModel> getCausalityMethod() {
    return this.causalityMethod;
  }
  public void setCausalityMethod( java.util.List<CodeableConceptModel> value) {
    this.causalityMethod = value;
  }
  public java.util.List<ReferenceModel> getCausalityAuthor() {
    return this.causalityAuthor;
  }
  public void setCausalityAuthor( java.util.List<ReferenceModel> value) {
    this.causalityAuthor = value;
  }
  public java.util.List<CodeableConceptModel> getCausalityResult() {
    return this.causalityResult;
  }
  public void setCausalityResult( java.util.List<CodeableConceptModel> value) {
    this.causalityResult = value;
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
    builder.append("[AdverseEventSuspectEntityModel]:" + "\n");
     builder.append("causality" + "->" + this.causality + "\n"); 
     builder.append("causalityProductRelatedness" + "->" + this.causalityProductRelatedness + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AdverseEventSuspectEntityModel]:" + "\n");
     builder.append("causality" + "->" + this.causality + "\n"); 
     builder.append("causalityProductRelatedness" + "->" + this.causalityProductRelatedness + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}