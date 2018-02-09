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

/**
* "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
*/
@Entity
@Table(name="requestgroup")
public class RequestGroupModel  {
  /**
  * Description: "This is a RequestGroup resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Allows a service to provide a unique, business identifier for the request."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition = new java.util.ArrayList<>();

  /**
  * Description: "A plan, proposal or order that is fulfilled in whole or in part by this request."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "Completed or terminated request(s) whose function is taken by this new request."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> replaces = new java.util.ArrayList<>();

  /**
  * Description: "A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition, prescription or similar form."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"groupIdentifier\"", length = 16777215)
  private String groupIdentifier;

  /**
  * Description: "The current state of the request. For request groups, the status reflects the status of all the requests in the group."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Indicates the level of authority/intentionality associated with the request and where the request fits into the workflow chain."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"intent\"")
  private String intent;

  /**
  * Description: "Indicates how quickly the request should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"priority\"")
  private String priority;

  /**
  * Description: "The subject for which the request group was created."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subject_id`", insertable=false, updatable=false)
  private ReferenceModel subject;

  /**
  * Description: "Describes the context of the request group, if any."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`context_id`", insertable=false, updatable=false)
  private ReferenceModel context;

  /**
  * Description: "Indicates when the request group was created."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"authoredOn\"")
  private String authoredOn;

  /**
  * Description: "Provides a reference to the author of the request group."
  */
  @javax.persistence.Basic
  @Column(name="\"author_id\"")
  private String author_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`author_id`", insertable=false, updatable=false)
  private ReferenceModel author;

  /**
  * Description: "Indicates the reason the request group was created. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonCodeableConcept\"", length = 16777215)
  private String reasonCodeableConcept;

  /**
  * Description: "Indicates the reason the request group was created. This is typically provided as a parameter to the evaluation and echoed by the service, although for some use cases, such as subscription- or event-based scenarios, it may provide an indication of the cause for the response."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonreference_id\"")
  private String reasonreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`reasonreference_id`", insertable=false, updatable=false)
  private ReferenceModel reasonReference;

  /**
  * Description: "Provides a mechanism to communicate additional information about the response."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "The actions, if any, produced by the evaluation of the artifact."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<RequestGroupActionModel> action = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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


  public RequestGroupModel() {
  }

  public RequestGroupModel(RequestGroup o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.definition = Reference.toModelArray(o.getDefinition());

      this.basedOn = Reference.toModelArray(o.getBasedOn());

      this.replaces = Reference.toModelArray(o.getReplaces());

      this.groupIdentifier = Identifier.toJson(o.getGroupIdentifier());
      this.status = o.getStatus();

      this.intent = o.getIntent();

      this.priority = o.getPriority();

      if (null != o.getSubject()) {
      	this.subject_id = "subject" + this.getId();
        this.subject = new ReferenceModel(o.getSubject());
        this.subject.setId(this.subject_id);
        this.subject.parent_id = this.subject.getId();
      }

      if (null != o.getContext()) {
      	this.context_id = "context" + this.getId();
        this.context = new ReferenceModel(o.getContext());
        this.context.setId(this.context_id);
        this.context.parent_id = this.context.getId();
      }

      this.authoredOn = o.getAuthoredOn();

      if (null != o.getAuthor()) {
      	this.author_id = "author" + this.getId();
        this.author = new ReferenceModel(o.getAuthor());
        this.author.setId(this.author_id);
        this.author.parent_id = this.author.getId();
      }

      this.reasonCodeableConcept = CodeableConcept.toJson(o.getReasonCodeableConcept());
      if (null != o.getReasonReference()) {
      	this.reasonreference_id = "reasonReference" + this.getId();
        this.reasonReference = new ReferenceModel(o.getReasonReference());
        this.reasonReference.setId(this.reasonreference_id);
        this.reasonReference.parent_id = this.reasonReference.getId();
      }

      this.note = Annotation.toJson(o.getNote());
      this.action = RequestGroupAction.toModelArray(o.getAction());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setReplaces( java.util.List<ReferenceModel> value) {
    this.replaces = value;
  }
  public java.util.List<ReferenceModel> getReplaces() {
    return this.replaces;
  }
  public void setGroupIdentifier( String value) {
    this.groupIdentifier = value;
  }
  public String getGroupIdentifier() {
    return this.groupIdentifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setIntent( String value) {
    this.intent = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setSubject( ReferenceModel value) {
    this.subject = value;
  }
  public ReferenceModel getSubject() {
    return this.subject;
  }
  public void setContext( ReferenceModel value) {
    this.context = value;
  }
  public ReferenceModel getContext() {
    return this.context;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setAuthor( ReferenceModel value) {
    this.author = value;
  }
  public ReferenceModel getAuthor() {
    return this.author;
  }
  public void setReasonCodeableConcept( String value) {
    this.reasonCodeableConcept = value;
  }
  public String getReasonCodeableConcept() {
    return this.reasonCodeableConcept;
  }
  public void setReasonReference( ReferenceModel value) {
    this.reasonReference = value;
  }
  public ReferenceModel getReasonReference() {
    return this.reasonReference;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setAction( java.util.List<RequestGroupActionModel> value) {
    this.action = value;
  }
  public java.util.List<RequestGroupActionModel> getAction() {
    return this.action;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("definition" + "[" + String.valueOf(this.definition) + "]\n"); 
     builder.append("basedOn" + "[" + String.valueOf(this.basedOn) + "]\n"); 
     builder.append("replaces" + "[" + String.valueOf(this.replaces) + "]\n"); 
     builder.append("groupIdentifier" + "[" + String.valueOf(this.groupIdentifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("intent" + "[" + String.valueOf(this.intent) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("context" + "[" + String.valueOf(this.context) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
     builder.append("author" + "[" + String.valueOf(this.author) + "]\n"); 
     builder.append("reasonCodeableConcept" + "[" + String.valueOf(this.reasonCodeableConcept) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}