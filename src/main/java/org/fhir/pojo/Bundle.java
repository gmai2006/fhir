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

package org.fhir.pojo;
import org.fhir.entity.BundleModel;
import com.google.gson.GsonBuilder;

/**
* "A container for a collection of resources."
*/
public class Bundle  {
  /**
  * Description: "This is a Bundle resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "A persistent identifier for the batch that won't change as a batch is copied from server to server."
  */
  private Identifier identifier;

  /**
  * Description: "Indicates the purpose of this bundle - how it was intended to be used."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float total;

  /**
  * Description: "Extensions for total"
  */
  private transient Element _total;

  /**
  * Description: "A series of links that provide context to this bundle."
  */
  private java.util.List<BundleLink> link = new java.util.ArrayList<>();

  /**
  * Description: "An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)."
  */
  private java.util.List<BundleEntry> entry = new java.util.ArrayList<>();

  /**
  * Description: "Digital Signature - base64 encoded. XML-DSIg or a JWT."
  */
  private Signature signature;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
  */
  private transient Element _language;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from Resource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public Bundle() {
  }

  public Bundle(BundleModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      if (null != o.getTotal()) {
        this.total = new Float(o.getTotal());
      }

      this.link = BundleLink.fromArray(o.getLink());

      this.entry = BundleEntry.fromArray(o.getEntry());

      this.signature = Signature.fromJson(o.getSignature());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setTotal( Float value) {
    this.total = value;
  }
  public Float getTotal() {
    return this.total;
  }
  public void set_total( Element value) {
    this._total = value;
  }
  public Element get_total() {
    return this._total;
  }
  public void setLink( java.util.List<BundleLink> value) {
    this.link = value;
  }
  public java.util.List<BundleLink> getLink() {
    return this.link;
  }
  public void setEntry( java.util.List<BundleEntry> value) {
    this.entry = value;
  }
  public java.util.List<BundleEntry> getEntry() {
    return this.entry;
  }
  public void setSignature( Signature value) {
    this.signature = value;
  }
  public Signature getSignature() {
    return this.signature;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("total" + "[" + String.valueOf(this.total) + "]\n"); 
     builder.append("_total" + "[" + String.valueOf(this._total) + "]\n"); 
     builder.append("link" + "[" + String.valueOf(this.link) + "]\n"); 
     builder.append("entry" + "[" + String.valueOf(this.entry) + "]\n"); 
     builder.append("signature" + "[" + String.valueOf(this.signature) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Bundle,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Bundle" : { return Bundle.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum TypeEnum {
  	document,
  	message,
  	transaction,
  	transactionresponse,
  	batch,
  	batchresponse,
  	history,
  	searchset,
  	collection,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "document" : { return document.toString(); }
  			case "message" : { return message.toString(); }
  			case "transaction" : { return transaction.toString(); }
  			case "transactionresponse" : { return transactionresponse.toString(); }
  			case "batch" : { return batch.toString(); }
  			case "batchresponse" : { return batchresponse.toString(); }
  			case "history" : { return history.toString(); }
  			case "searchset" : { return searchset.toString(); }
  			case "collection" : { return collection.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Bundle> fromArray(java.util.List<BundleModel> list) {
    return (java.util.List<Bundle>)list.stream()
      .map(model -> new Bundle(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<BundleModel> toModelArray(java.util.List<Bundle> list) {
    return (java.util.List<BundleModel>)list.stream()
      .map(model -> new BundleModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Bundle fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Bundle.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Bundle o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Bundle> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}