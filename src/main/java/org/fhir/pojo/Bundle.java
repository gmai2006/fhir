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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A container for a collection of resources."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Bundle  extends Resource  {
  /**
  * Description: "This is a Bundle resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A persistent identifier for the batch that won't change as a batch is copied from server to server."
  */
  protected Identifier identifier;

  /**
  * Description: "Indicates the purpose of this bundle - how it was intended to be used."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float total;

  /**
  * Description: "Extensions for total"
  */
  protected transient Element _total;

  /**
  * Description: "A series of links that provide context to this bundle."
  */
  protected java.util.List<BundleLink> link;

  /**
  * Description: "An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only)."
  */
  protected java.util.List<BundleEntry> entry;

  /**
  * Description: "Digital Signature - base64 encoded. XML-DSIg or a JWT."
  */
  protected Signature signature;

  public Bundle() {
  }

  public Bundle(BundleModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getTotal()) {
      this.total = o.getTotal();
    }
    if (null != o.getLink() && !o.getLink().isEmpty()) {
    	this.link = BundleLinkHelper.fromArray2Array(o.getLink());
    }
    if (null != o.getEntry() && !o.getEntry().isEmpty()) {
    	this.entry = BundleEntryHelper.fromArray2Array(o.getEntry());
    }
    this.signature = SignatureHelper.fromJson(o.getSignature());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Bundle]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.total != null) builder.append("total" + "->" + this.total.toString() + "\n"); 
     if(this._total != null) builder.append("_total" + "->" + this._total.toString() + "\n"); 
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); 
     if(this.entry != null) builder.append("entry" + "->" + this.entry.toString() + "\n"); 
     if(this.signature != null) builder.append("signature" + "->" + this.signature.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

}