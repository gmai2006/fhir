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
* "The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system is able to take an appropriate action."
*/
@Entity
@Table(name="subscription")
public class SubscriptionModel  {
  /**
  * Description: "This is a Subscription resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The status of the subscription, which marks the server state for managing the subscription."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting."
  * Actual type: Array of ContactPoint-> List<ContactPoint>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contact\"", length = 16777215)
  private String contact;

  /**
  * Description: "The time for the server to turn the subscription off."
  */
  @javax.persistence.Basic
  @Column(name="\"end\"")
  private String end;

  /**
  * Description: "A description of why this subscription is defined."
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"")
  private String reason;

  /**
  * Description: "The rules that the server should use to determine when to generate notifications for this subscription."
  */
  @javax.persistence.Basic
  @Column(name="\"criteria\"")
  private String criteria;

  /**
  * Description: "A record of the last error that occurred when the server processed a notification."
  */
  @javax.persistence.Basic
  @Column(name="\"error\"")
  private String error;

  /**
  * Description: "Details where to send notifications when resources are received that meet the criteria."
  */
  @javax.persistence.Basic
  @Column(name="\"channel_id\"")
  private String channel_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`channel_id`", insertable=false, updatable=false)
  private SubscriptionChannelModel channel;

  /**
  * Description: "A tag to add to any resource that matches the criteria, after the subscription is processed."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"tag\"", length = 16777215)
  private String tag;

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


  public SubscriptionModel() {
  }

  public SubscriptionModel(Subscription o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.status = o.getStatus();

      this.contact = ContactPoint.toJson(o.getContact());
      this.end = o.getEnd();

      this.reason = o.getReason();

      this.criteria = o.getCriteria();

      this.error = o.getError();

      if (null != o.getChannel()) {
      	this.channel_id = "channel" + this.getId();
        this.channel = new SubscriptionChannelModel(o.getChannel());
        this.channel.setId(this.channel_id);
        this.channel.parent_id = this.channel.getId();
      }

      this.tag = Coding.toJson(o.getTag());
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
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setContact( String value) {
    this.contact = value;
  }
  public String getContact() {
    return this.contact;
  }
  public void setEnd( String value) {
    this.end = value;
  }
  public String getEnd() {
    return this.end;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setCriteria( String value) {
    this.criteria = value;
  }
  public String getCriteria() {
    return this.criteria;
  }
  public void setError( String value) {
    this.error = value;
  }
  public String getError() {
    return this.error;
  }
  public void setChannel( SubscriptionChannelModel value) {
    this.channel = value;
  }
  public SubscriptionChannelModel getChannel() {
    return this.channel;
  }
  public void setTag( String value) {
    this.tag = value;
  }
  public String getTag() {
    return this.tag;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("end" + "[" + String.valueOf(this.end) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("criteria" + "[" + String.valueOf(this.criteria) + "]\n"); 
     builder.append("error" + "[" + String.valueOf(this.error) + "]\n"); 
     builder.append("channel" + "[" + String.valueOf(this.channel) + "]\n"); 
     builder.append("tag" + "[" + String.valueOf(this.tag) + "]\n"); 
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