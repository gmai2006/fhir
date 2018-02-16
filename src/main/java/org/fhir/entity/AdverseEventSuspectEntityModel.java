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
*/
@Entity
@Table(name="adverseeventsuspectentity")
public class AdverseEventSuspectEntityModel  implements Serializable {
	private static final long serialVersionUID = 151873631162373018L;
  /**
  * Description: "Identifies the actual instance of what caused the adverse event.  May be a substance, medication, medication administration, medication statement or a device."
  */
  @javax.persistence.Basic
  @Column(name="\"instance_id\"")
  private String instance_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="instance_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> instance;

  /**
  * Description: "causality1 | causality2."
  */
  @javax.persistence.Basic
  @Column(name="\"causality\"")
  private String causality;

  /**
  * Description: "assess1 | assess2."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"causalityAssessment\"", length = 16777215)
  private String causalityAssessment;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityProductRelatedness."
  */
  @javax.persistence.Basic
  @Column(name="\"causalityProductRelatedness\"")
  private String causalityProductRelatedness;

  /**
  * Description: "method1 | method2."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"causalityMethod\"", length = 16777215)
  private String causalityMethod;

  /**
  * Description: "AdverseEvent.suspectEntity.causalityAuthor."
  */
  @javax.persistence.Basic
  @Column(name="\"causalityauthor_id\"")
  private String causalityauthor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="causalityauthor_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> causalityAuthor;

  /**
  * Description: "result1 | result2."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"causalityResult\"", length = 16777215)
  private String causalityResult;

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
  @Column(name="\"parent_id\"")
  private String parent_id;

  public AdverseEventSuspectEntityModel() {
  }

  public AdverseEventSuspectEntityModel(AdverseEventSuspectEntity o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    if (null != o.getInstance() ) {
    	this.instance_id = "instance" + this.parent_id;
    	this.instance = ReferenceHelper.toModel(o.getInstance(), this.instance_id);
    }
    this.causality = o.getCausality();
    this.causalityAssessment = JsonUtils.toJson(o.getCausalityAssessment());
    this.causalityProductRelatedness = o.getCausalityProductRelatedness();
    this.causalityMethod = JsonUtils.toJson(o.getCausalityMethod());
    if (null != o.getCausalityAuthor() ) {
    	this.causalityauthor_id = "causalityauthor" + this.parent_id;
    	this.causalityAuthor = ReferenceHelper.toModel(o.getCausalityAuthor(), this.causalityauthor_id);
    }
    this.causalityResult = JsonUtils.toJson(o.getCausalityResult());
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
  public String getCausalityAssessment() {
    return this.causalityAssessment;
  }
  public void setCausalityAssessment( String value) {
    this.causalityAssessment = value;
  }
  public String getCausalityProductRelatedness() {
    return this.causalityProductRelatedness;
  }
  public void setCausalityProductRelatedness( String value) {
    this.causalityProductRelatedness = value;
  }
  public String getCausalityMethod() {
    return this.causalityMethod;
  }
  public void setCausalityMethod( String value) {
    this.causalityMethod = value;
  }
  public java.util.List<ReferenceModel> getCausalityAuthor() {
    return this.causalityAuthor;
  }
  public void setCausalityAuthor( java.util.List<ReferenceModel> value) {
    this.causalityAuthor = value;
  }
  public String getCausalityResult() {
    return this.causalityResult;
  }
  public void setCausalityResult( String value) {
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
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AdverseEventSuspectEntityModel]:" + "\n");
     builder.append("causality" + "->" + this.causality + "\n"); 
     builder.append("causalityAssessment" + "->" + this.causalityAssessment + "\n"); 
     builder.append("causalityProductRelatedness" + "->" + this.causalityProductRelatedness + "\n"); 
     builder.append("causalityMethod" + "->" + this.causalityMethod + "\n"); 
     builder.append("causalityResult" + "->" + this.causalityResult + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AdverseEventSuspectEntityModel]:" + "\n");
     builder.append("instance" + "->" + this.instance + "\n"); 
     builder.append("causality" + "->" + this.causality + "\n"); 
     builder.append("causalityAssessment" + "->" + this.causalityAssessment + "\n"); 
     builder.append("causalityProductRelatedness" + "->" + this.causalityProductRelatedness + "\n"); 
     builder.append("causalityMethod" + "->" + this.causalityMethod + "\n"); 
     builder.append("causalityAuthor" + "->" + this.causalityAuthor + "\n"); 
     builder.append("causalityResult" + "->" + this.causalityResult + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}