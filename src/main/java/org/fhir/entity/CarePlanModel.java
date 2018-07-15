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
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
* generated on 07/14/2018
*/
@Entity
@Table(name="careplan")
public class CarePlanModel  implements Serializable {
	private static final long serialVersionUID = 153159210152859690L;
  /**
  * Description: "This is a CarePlan resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "This records identifiers associated with this care plan that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Identifies the protocol, questionnaire, guideline or other specification the care plan should be conducted in accordance with."
  */
  @javax.persistence.Basic
  @Column(name="\"definition_id\"")
  private String definition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="definition_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition;

  /**
  * Description: "A care plan that is fulfilled in whole or in part by this care plan."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="basedon_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn;

  /**
  * Description: "Completed or terminated care plan whose function is taken by this new care plan."
  */
  @javax.persistence.Basic
  @Column(name="\"replaces_id\"")
  private String replaces_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="replaces_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> replaces;

  /**
  * Description: "A larger care plan of which this particular care plan is a component or step."
  */
  @javax.persistence.Basic
  @Column(name="\"partof_id\"")
  private String partof_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="partof_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> partOf;

  /**
  * Description: "Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain."
  */
  @javax.persistence.Basic
  @Column(name="\"intent\"")
  private String intent;

  /**
  * Description: "Identifies what \"kind\" of plan this is to support differentiation between multiple co-existing plans; e.g. \"Home health\", \"psychiatric\", \"asthma\", \"disease management\", \"wellness plan\", etc."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "Human-friendly name for the CarePlan."
  */
  @javax.persistence.Basic
  @Column(name="\"title\"")
  private String title;

  /**
  * Description: "A description of the scope and nature of the plan."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Identifies the patient or group whose intended care is described by the plan."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "Identifies the original context in which this particular CarePlan was created."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "Indicates when the plan did (or is intended to) come into effect and end."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "Identifies the individual(s) or ogranization who is responsible for the content of the care plan."
  */
  @javax.persistence.Basic
  @Column(name="\"author_id\"")
  private String author_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="author_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> author;

  /**
  * Description: "Identifies all people and organizations who are expected to be involved in the care envisioned by this plan."
  */
  @javax.persistence.Basic
  @Column(name="\"careteam_id\"")
  private String careteam_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="careteam_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> careTeam;

  /**
  * Description: "Identifies the conditions/problems/concerns/diagnoses/etc. whose management and/or mitigation are handled by this plan."
  */
  @javax.persistence.Basic
  @Column(name="\"addresses_id\"")
  private String addresses_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="addresses_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> addresses;

  /**
  * Description: "Identifies portions of the patient's record that specifically influenced the formation of the plan.  These might include co-morbidities, recent procedures, limitations, recent assessments, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"supportinginfo_id\"")
  private String supportinginfo_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="supportinginfo_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInfo;

  /**
  * Description: "Describes the intended objective(s) of carrying out the care plan."
  */
  @javax.persistence.Basic
  @Column(name="\"goal_id\"")
  private String goal_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="goal_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> goal;

  /**
  * Description: "Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"activity_id\"")
  private String activity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="activity_id", insertable=false, updatable=false)
  private java.util.List<CarePlanActivityModel> activity;

  /**
  * Description: "General notes about the care plan not covered elsewhere."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public CarePlanModel() {
  }

  public CarePlanModel(CarePlan o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition_id = "definition" + this.id;
    	this.definition = ReferenceHelper.toModelFromArray(o.getDefinition(), this.definition_id);
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedon_id = "basedon" + this.id;
    	this.basedOn = ReferenceHelper.toModelFromArray(o.getBasedOn(), this.basedon_id);
    }
    if (null != o.getReplaces() && !o.getReplaces().isEmpty()) {
    	this.replaces_id = "replaces" + this.id;
    	this.replaces = ReferenceHelper.toModelFromArray(o.getReplaces(), this.replaces_id);
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partof_id = "partof" + this.id;
    	this.partOf = ReferenceHelper.toModelFromArray(o.getPartOf(), this.partof_id);
    }
    this.status = o.getStatus();
    this.intent = o.getIntent();
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModelFromArray(o.getCategory(), this.category_id);
    }
    this.title = o.getTitle();
    this.description = o.getDescription();
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
    	this.author_id = "author" + this.id;
    	this.author = ReferenceHelper.toModelFromArray(o.getAuthor(), this.author_id);
    }
    if (null != o.getCareTeam() && !o.getCareTeam().isEmpty()) {
    	this.careteam_id = "careteam" + this.id;
    	this.careTeam = ReferenceHelper.toModelFromArray(o.getCareTeam(), this.careteam_id);
    }
    if (null != o.getAddresses() && !o.getAddresses().isEmpty()) {
    	this.addresses_id = "addresses" + this.id;
    	this.addresses = ReferenceHelper.toModelFromArray(o.getAddresses(), this.addresses_id);
    }
    if (null != o.getSupportingInfo() && !o.getSupportingInfo().isEmpty()) {
    	this.supportinginfo_id = "supportinginfo" + this.id;
    	this.supportingInfo = ReferenceHelper.toModelFromArray(o.getSupportingInfo(), this.supportinginfo_id);
    }
    if (null != o.getGoal() && !o.getGoal().isEmpty()) {
    	this.goal_id = "goal" + this.id;
    	this.goal = ReferenceHelper.toModelFromArray(o.getGoal(), this.goal_id);
    }
    if (null != o.getActivity() && !o.getActivity().isEmpty()) {
    	this.activity_id = "activity" + this.id;
    	this.activity = CarePlanActivityHelper.toModelFromArray(o.getActivity(), this.activity_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getReplaces() {
    return this.replaces;
  }
  public void setReplaces( java.util.List<ReferenceModel> value) {
    this.replaces = value;
  }
  public java.util.List<ReferenceModel> getPartOf() {
    return this.partOf;
  }
  public void setPartOf( java.util.List<ReferenceModel> value) {
    this.partOf = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void setIntent( String value) {
    this.intent = value;
  }
  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public java.util.List<ReferenceModel> getAuthor() {
    return this.author;
  }
  public void setAuthor( java.util.List<ReferenceModel> value) {
    this.author = value;
  }
  public java.util.List<ReferenceModel> getCareTeam() {
    return this.careTeam;
  }
  public void setCareTeam( java.util.List<ReferenceModel> value) {
    this.careTeam = value;
  }
  public java.util.List<ReferenceModel> getAddresses() {
    return this.addresses;
  }
  public void setAddresses( java.util.List<ReferenceModel> value) {
    this.addresses = value;
  }
  public java.util.List<ReferenceModel> getSupportingInfo() {
    return this.supportingInfo;
  }
  public void setSupportingInfo( java.util.List<ReferenceModel> value) {
    this.supportingInfo = value;
  }
  public java.util.List<ReferenceModel> getGoal() {
    return this.goal;
  }
  public void setGoal( java.util.List<ReferenceModel> value) {
    this.goal = value;
  }
  public java.util.List<CarePlanActivityModel> getActivity() {
    return this.activity;
  }
  public void setActivity( java.util.List<CarePlanActivityModel> value) {
    this.activity = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CarePlanModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("intent" + "->" + this.intent + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CarePlanModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("intent" + "->" + this.intent + "\n"); 
     builder.append("title" + "->" + this.title + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}