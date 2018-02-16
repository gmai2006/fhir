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
* "A record of a request for a medication, substance or device used in the healthcare setting."
*/
@Entity
@Table(name="supplyrequest")
public class SupplyRequestModel  implements Serializable {
	private static final long serialVersionUID = 151873631193780471L;
  /**
  * Description: "This is a SupplyRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Unique identifier for this supply request."
  * Actual type: String;
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
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="ordereditem_id", insertable=false, updatable=false)
  private java.util.List<SupplyRequestOrderedItemModel> orderedItem;

  /**
  * Description: "When the request should be fulfilled."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"occurrenceDateTime\"")
  private String occurrenceDateTime;

  /**
  * Description: "When the request should be fulfilled."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrencePeriod\"", length = 16777215)
  private String occurrencePeriod;

  /**
  * Description: "When the request should be fulfilled."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="requester_id", insertable=false, updatable=false)
  private java.util.List<SupplyRequestRequesterModel> requester;

  /**
  * Description: "Who is intended to fulfill the request."
  */
  @javax.persistence.Basic
  @Column(name="\"supplier_id\"")
  private String supplier_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="supplier_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supplier;

  /**
  * Description: "Why the supply item was requested."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="reasonreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference;

  /**
  * Description: "Where the supply is expected to come from."
  */
  @javax.persistence.Basic
  @Column(name="\"deliverfrom_id\"")
  private String deliverfrom_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="deliverfrom_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> deliverFrom;

  /**
  * Description: "Where the supply is destined to go."
  */
  @javax.persistence.Basic
  @Column(name="\"deliverto_id\"")
  private String deliverto_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="deliverto_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> deliverTo;

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

  public SupplyRequestModel() {
  }

  public SupplyRequestModel(SupplyRequest o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.identifier = JsonUtils.toJson(o.getIdentifier());
    this.status = o.getStatus();
    this.category = JsonUtils.toJson(o.getCategory());
    this.priority = o.getPriority();
    if (null != o.getOrderedItem() ) {
    	this.ordereditem_id = "ordereditem" + this.id;
    	this.orderedItem = SupplyRequestOrderedItemHelper.toModel(o.getOrderedItem(), this.ordereditem_id);
    }
    this.occurrenceDateTime = o.getOccurrenceDateTime();
    this.occurrencePeriod = JsonUtils.toJson(o.getOccurrencePeriod());
    this.occurrenceTiming = JsonUtils.toJson(o.getOccurrenceTiming());
    this.authoredOn = o.getAuthoredOn();
    if (null != o.getRequester() ) {
    	this.requester_id = "requester" + this.id;
    	this.requester = SupplyRequestRequesterHelper.toModel(o.getRequester(), this.requester_id);
    }
    if (null != o.getSupplier() && !o.getSupplier().isEmpty()) {
    	this.supplier_id = "supplier" + this.id;
    	this.supplier = ReferenceHelper.toModelFromArray(o.getSupplier(), this.supplier_id);
    }
    this.reasonCodeableConcept = JsonUtils.toJson(o.getReasonCodeableConcept());
    if (null != o.getReasonReference() ) {
    	this.reasonreference_id = "reasonreference" + this.id;
    	this.reasonReference = ReferenceHelper.toModel(o.getReasonReference(), this.reasonreference_id);
    }
    if (null != o.getDeliverFrom() ) {
    	this.deliverfrom_id = "deliverfrom" + this.id;
    	this.deliverFrom = ReferenceHelper.toModel(o.getDeliverFrom(), this.deliverfrom_id);
    }
    if (null != o.getDeliverTo() ) {
    	this.deliverto_id = "deliverto" + this.id;
    	this.deliverTo = ReferenceHelper.toModel(o.getDeliverTo(), this.deliverto_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
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
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public java.util.List<SupplyRequestOrderedItemModel> getOrderedItem() {
    return this.orderedItem;
  }
  public void setOrderedItem( java.util.List<SupplyRequestOrderedItemModel> value) {
    this.orderedItem = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrencePeriod( String value) {
    this.occurrencePeriod = value;
  }
  public String getOccurrenceTiming() {
    return this.occurrenceTiming;
  }
  public void setOccurrenceTiming( String value) {
    this.occurrenceTiming = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public java.util.List<SupplyRequestRequesterModel> getRequester() {
    return this.requester;
  }
  public void setRequester( java.util.List<SupplyRequestRequesterModel> value) {
    this.requester = value;
  }
  public java.util.List<ReferenceModel> getSupplier() {
    return this.supplier;
  }
  public void setSupplier( java.util.List<ReferenceModel> value) {
    this.supplier = value;
  }
  public String getReasonCodeableConcept() {
    return this.reasonCodeableConcept;
  }
  public void setReasonCodeableConcept( String value) {
    this.reasonCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
  }
  public java.util.List<ReferenceModel> getDeliverFrom() {
    return this.deliverFrom;
  }
  public void setDeliverFrom( java.util.List<ReferenceModel> value) {
    this.deliverFrom = value;
  }
  public java.util.List<ReferenceModel> getDeliverTo() {
    return this.deliverTo;
  }
  public void setDeliverTo( java.util.List<ReferenceModel> value) {
    this.deliverTo = value;
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
    builder.append("[SupplyRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime + "\n"); 
     builder.append("occurrencePeriod" + "->" + this.occurrencePeriod + "\n"); 
     builder.append("occurrenceTiming" + "->" + this.occurrenceTiming + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("reasonCodeableConcept" + "->" + this.reasonCodeableConcept + "\n"); 
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
    builder.append("[SupplyRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("orderedItem" + "->" + this.orderedItem + "\n"); 
     builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime + "\n"); 
     builder.append("occurrencePeriod" + "->" + this.occurrencePeriod + "\n"); 
     builder.append("occurrenceTiming" + "->" + this.occurrenceTiming + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("requester" + "->" + this.requester + "\n"); 
     builder.append("supplier" + "->" + this.supplier + "\n"); 
     builder.append("reasonCodeableConcept" + "->" + this.reasonCodeableConcept + "\n"); 
     builder.append("reasonReference" + "->" + this.reasonReference + "\n"); 
     builder.append("deliverFrom" + "->" + this.deliverFrom + "\n"); 
     builder.append("deliverTo" + "->" + this.deliverTo + "\n"); 
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