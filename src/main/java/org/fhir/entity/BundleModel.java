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
* "A container for a collection of resources."
*/
@Entity
@Table(name="bundle")
public class BundleModel  implements Serializable {
	private static final long serialVersionUID = 15191089376518660L;
  /**
  * Description: "This is a Bundle resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A persistent identifier for the batch that won't change as a batch is copied from server to server."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Indicates the purpose of this bundle - how it was intended to be used."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"total\"")
  private Float total;

  /**
  * Description: "A series of links that provide context to this bundle."
  */
  @javax.persistence.Basic
  @Column(name="\"link_id\"")
  private String link_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="link_id", insertable=false, updatable=false)
  private java.util.List<BundleLinkModel> link;

  /**
  * Description: "An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)."
  */
  @javax.persistence.Basic
  @Column(name="\"entry_id\"")
  private String entry_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="entry_id", insertable=false, updatable=false)
  private java.util.List<BundleEntryModel> entry;

  /**
  * Description: "Digital Signature - base64 encoded. XML-DSIg or a JWT."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"signature\"", length = 16777215)
  private String signature;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
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
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public BundleModel() {
  }

  public BundleModel(Bundle o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.type = o.getType();
    this.total = o.getTotal();
    if (null != o.getLink() && !o.getLink().isEmpty()) {
    	this.link_id = "link" + this.id;
    	this.link = BundleLinkHelper.toModelFromArray(o.getLink(), this.link_id);
    }
    if (null != o.getEntry() && !o.getEntry().isEmpty()) {
    	this.entry_id = "entry" + this.id;
    	this.entry = BundleEntryHelper.toModelFromArray(o.getEntry(), this.entry_id);
    }
    if (null != o.getSignature()) {
    	this.signature = JsonUtils.toJson(o.getSignature());
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
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public Float getTotal() {
    return this.total;
  }
  public void setTotal( Float value) {
    this.total = value;
  }
  public java.util.List<BundleLinkModel> getLink() {
    return this.link;
  }
  public void setLink( java.util.List<BundleLinkModel> value) {
    this.link = value;
  }
  public java.util.List<BundleEntryModel> getEntry() {
    return this.entry;
  }
  public void setEntry( java.util.List<BundleEntryModel> value) {
    this.entry = value;
  }
  public String getSignature() {
    return this.signature;
  }
  public void setSignature( String value) {
    this.signature = value;
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
    builder.append("[BundleModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("total" + "->" + this.total + "\n"); 
     builder.append("signature" + "->" + this.signature + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[BundleModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("total" + "->" + this.total + "\n"); 
     builder.append("link" + "->" + this.link + "\n"); 
     builder.append("entry" + "->" + this.entry + "\n"); 
     builder.append("signature" + "->" + this.signature + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}