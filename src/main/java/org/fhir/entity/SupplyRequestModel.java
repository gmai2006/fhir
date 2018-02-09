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
* "A record of a request for a medication, substance or device used in the healthcare setting."
*/
@Entity
@Table(name="supplyrequest")
public class SupplyRequestModel  {
  /**
  * Description: "This is a SupplyRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Unique identifier for this supply request."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Status of the supply request."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "Indicates how quickly this SupplyRequest should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"priority\"")
  private String priority;

  /**
  * Description: "The item being requested."
  */
  @javax.persistence.Basic
  @Column(name="\"ordereditem_id\"")
  private String ordereditem_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`ordereditem_id`", insertable=false, updatable=false)
  private SupplyRequestOrderedItemModel orderedItem;

  /**
  * Description: "When the request should be fulfilled."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"occurrenceDateTime\"")
  private String occurrenceDateTime;

  /**
  * Description: "When the request should be fulfilled."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrencePeriod\"", length = 16777215)
  private String occurrencePeriod;

  /**
  * Description: "When the request should be fulfilled."
  * Actual type: Timing
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrenceTiming\"", length = 16777215)
  private String occurrenceTiming;

  /**
  * Description: "When the request was made."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"authoredOn\"")
  private String authoredOn;

  /**
  * Description: "The individual who initiated the request and has responsibility for its activation."
  */
  @javax.persistence.Basic
  @Column(name="\"requester_id\"")
  private String requester_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`requester_id`", insertable=false, updatable=false)
  private SupplyRequestRequesterModel requester;

  /**
  * Description: "Who is intended to fulfill the request."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supplier = new java.util.ArrayList<>();

  /**
  * Description: "Why the supply item was requested."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reasonCodeableConcept\"", length = 16777215)
  private String reasonCodeableConcept;

  /**
  * Description: "Why the supply item was requested."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonreference_id\"")
  private String reasonreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`reasonreference_id`", insertable=false, updatable=false)
  private ReferenceModel reasonReference;

  /**
  * Description: "Where the supply is expected to come from."
  */
  @javax.persistence.Basic
  @Column(name="\"deliverfrom_id\"")
  private String deliverfrom_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`deliverfrom_id`", insertable=false, updatable=false)
  private ReferenceModel deliverFrom;

  /**
  * Description: "Where the supply is destined to go."
  */
  @javax.persistence.Basic
  @Column(name="\"deliverto_id\"")
  private String deliverto_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`deliverto_id`", insertable=false, updatable=false)
  private ReferenceModel deliverTo;

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


  public SupplyRequestModel() {
  }

  public SupplyRequestModel(SupplyRequest o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.category = CodeableConcept.toJson(o.getCategory());
      this.priority = o.getPriority();

      if (null != o.getOrderedItem()) {
      	this.ordereditem_id = "orderedItem" + this.getId();
        this.orderedItem = new SupplyRequestOrderedItemModel(o.getOrderedItem());
        this.orderedItem.setId(this.ordereditem_id);
        this.orderedItem.parent_id = this.orderedItem.getId();
      }

      this.occurrenceDateTime = o.getOccurrenceDateTime();

      this.occurrencePeriod = Period.toJson(o.getOccurrencePeriod());
      this.occurrenceTiming = Timing.toJson(o.getOccurrenceTiming());
      this.authoredOn = o.getAuthoredOn();

      if (null != o.getRequester()) {
      	this.requester_id = "requester" + this.getId();
        this.requester = new SupplyRequestRequesterModel(o.getRequester());
        this.requester.setId(this.requester_id);
        this.requester.parent_id = this.requester.getId();
      }

      this.supplier = Reference.toModelArray(o.getSupplier());

      this.reasonCodeableConcept = CodeableConcept.toJson(o.getReasonCodeableConcept());
      if (null != o.getReasonReference()) {
      	this.reasonreference_id = "reasonReference" + this.getId();
        this.reasonReference = new ReferenceModel(o.getReasonReference());
        this.reasonReference.setId(this.reasonreference_id);
        this.reasonReference.parent_id = this.reasonReference.getId();
      }

      if (null != o.getDeliverFrom()) {
      	this.deliverfrom_id = "deliverFrom" + this.getId();
        this.deliverFrom = new ReferenceModel(o.getDeliverFrom());
        this.deliverFrom.setId(this.deliverfrom_id);
        this.deliverFrom.parent_id = this.deliverFrom.getId();
      }

      if (null != o.getDeliverTo()) {
      	this.deliverto_id = "deliverTo" + this.getId();
        this.deliverTo = new ReferenceModel(o.getDeliverTo());
        this.deliverTo.setId(this.deliverto_id);
        this.deliverTo.parent_id = this.deliverTo.getId();
      }

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
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setOrderedItem( SupplyRequestOrderedItemModel value) {
    this.orderedItem = value;
  }
  public SupplyRequestOrderedItemModel getOrderedItem() {
    return this.orderedItem;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void setOccurrencePeriod( String value) {
    this.occurrencePeriod = value;
  }
  public String getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrenceTiming( String value) {
    this.occurrenceTiming = value;
  }
  public String getOccurrenceTiming() {
    return this.occurrenceTiming;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setRequester( SupplyRequestRequesterModel value) {
    this.requester = value;
  }
  public SupplyRequestRequesterModel getRequester() {
    return this.requester;
  }
  public void setSupplier( java.util.List<ReferenceModel> value) {
    this.supplier = value;
  }
  public java.util.List<ReferenceModel> getSupplier() {
    return this.supplier;
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
  public void setDeliverFrom( ReferenceModel value) {
    this.deliverFrom = value;
  }
  public ReferenceModel getDeliverFrom() {
    return this.deliverFrom;
  }
  public void setDeliverTo( ReferenceModel value) {
    this.deliverTo = value;
  }
  public ReferenceModel getDeliverTo() {
    return this.deliverTo;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("orderedItem" + "[" + String.valueOf(this.orderedItem) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("occurrenceTiming" + "[" + String.valueOf(this.occurrenceTiming) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
     builder.append("requester" + "[" + String.valueOf(this.requester) + "]\n"); 
     builder.append("supplier" + "[" + String.valueOf(this.supplier) + "]\n"); 
     builder.append("reasonCodeableConcept" + "[" + String.valueOf(this.reasonCodeableConcept) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("deliverFrom" + "[" + String.valueOf(this.deliverFrom) + "]\n"); 
     builder.append("deliverTo" + "[" + String.valueOf(this.deliverTo) + "]\n"); 
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