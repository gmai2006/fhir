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
* "A container for slots of time that may be available for booking appointments."
*/
@Entity
@Table(name="schedule")
public class ScheduleModel  implements Serializable {
	private static final long serialVersionUID = 151910893751493981L;
  /**
  * Description: "This is a Schedule resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "External Ids for this item."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Whether this schedule record is in active use, or should not be used (such as was entered in error)."
  */
  @javax.persistence.Basic
  @Column(name="\"active\"")
  private Boolean active;

  /**
  * Description: "A broad categorisation of the service that is to be performed during this appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"servicecategory_id\"")
  private String servicecategory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="servicecategory_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> serviceCategory;

  /**
  * Description: "The specific service that is to be performed during this appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"servicetype_id\"")
  private String servicetype_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="servicetype_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> serviceType;

  /**
  * Description: "The specialty of a practitioner that would be required to perform the service requested in this appointment."
  */
  @javax.persistence.Basic
  @Column(name="\"specialty_id\"")
  private String specialty_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="specialty_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> specialty;

  /**
  * Description: "The resource this Schedule resource is providing availability information for. These are expected to usually be one of HealthcareService, Location, Practitioner, PractitionerRole, Device, Patient or RelatedPerson."
  */
  @javax.persistence.Basic
  @Column(name="\"actor_id\"")
  private String actor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="actor_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> actor;

  /**
  * Description: "The period of time that the slots that are attached to this Schedule resource cover (even if none exist). These  cover the amount of time that an organization's planning horizon; the interval for which they are currently accepting appointments. This does not define a \"template\" for planning outside these dates."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"planningHorizon\"", length = 16777215)
  private String planningHorizon;

  /**
  * Description: "Comments on the availability to describe any extended information. Such as custom constraints on the slots that may be associated."
  */
  @javax.persistence.Basic
  @Column(name="\"comment\"")
  private String comment;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public ScheduleModel() {
  }

  public ScheduleModel(Schedule o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.active = o.getActive();
    if (null != o.getServiceCategory() ) {
    	this.servicecategory_id = "servicecategory" + this.id;
    	this.serviceCategory = CodeableConceptHelper.toModel(o.getServiceCategory(), this.servicecategory_id);
    }
    if (null != o.getServiceType() && !o.getServiceType().isEmpty()) {
    	this.servicetype_id = "servicetype" + this.id;
    	this.serviceType = CodeableConceptHelper.toModelFromArray(o.getServiceType(), this.servicetype_id);
    }
    if (null != o.getSpecialty() && !o.getSpecialty().isEmpty()) {
    	this.specialty_id = "specialty" + this.id;
    	this.specialty = CodeableConceptHelper.toModelFromArray(o.getSpecialty(), this.specialty_id);
    }
    if (null != o.getActor() && !o.getActor().isEmpty()) {
    	this.actor_id = "actor" + this.id;
    	this.actor = ReferenceHelper.toModelFromArray(o.getActor(), this.actor_id);
    }
    if (null != o.getPlanningHorizon()) {
    	this.planningHorizon = JsonUtils.toJson(o.getPlanningHorizon());
    }
    this.comment = o.getComment();
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
  public Boolean getActive() {
    return this.active;
  }
  public void setActive( Boolean value) {
    this.active = value;
  }
  public java.util.List<CodeableConceptModel> getServiceCategory() {
    return this.serviceCategory;
  }
  public void setServiceCategory( java.util.List<CodeableConceptModel> value) {
    this.serviceCategory = value;
  }
  public java.util.List<CodeableConceptModel> getServiceType() {
    return this.serviceType;
  }
  public void setServiceType( java.util.List<CodeableConceptModel> value) {
    this.serviceType = value;
  }
  public java.util.List<CodeableConceptModel> getSpecialty() {
    return this.specialty;
  }
  public void setSpecialty( java.util.List<CodeableConceptModel> value) {
    this.specialty = value;
  }
  public java.util.List<ReferenceModel> getActor() {
    return this.actor;
  }
  public void setActor( java.util.List<ReferenceModel> value) {
    this.actor = value;
  }
  public String getPlanningHorizon() {
    return this.planningHorizon;
  }
  public void setPlanningHorizon( String value) {
    this.planningHorizon = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
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
    builder.append("[ScheduleModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("active" + "->" + this.active + "\n"); 
     builder.append("planningHorizon" + "->" + this.planningHorizon + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
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
    builder.append("[ScheduleModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("active" + "->" + this.active + "\n"); 
     builder.append("serviceCategory" + "->" + this.serviceCategory + "\n"); 
     builder.append("serviceType" + "->" + this.serviceType + "\n"); 
     builder.append("specialty" + "->" + this.specialty + "\n"); 
     builder.append("actor" + "->" + this.actor + "\n"); 
     builder.append("planningHorizon" + "->" + this.planningHorizon + "\n"); 
     builder.append("comment" + "->" + this.comment + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}