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
import org.fhir.entity.BundleEntryModel;
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
public class BundleEntry  extends BackboneElement  {
  /**
  * Description: "A series of links that provide context to this entry."
  */
  protected java.util.List<BundleLink> link;

  /**
  * Description: "The Absolute URL for the resource.  The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: \n* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)\n* Results from operations might involve resources that are not identified."
  */
  protected String fullUrl;

  /**
  * Description: "Extensions for fullUrl"
  */
  protected transient Element _fullUrl;

  /**
  * Description: "The Resources for the entry."
  */
  protected ResourceList resource;

  /**
  * Description: "Information about the search process that lead to the creation of this entry."
  */
  protected BundleSearch search;

  /**
  * Description: "Additional information about how this entry should be processed as part of a transaction."
  */
  protected BundleRequest request;

  /**
  * Description: "Additional information about how this entry should be processed as part of a transaction."
  */
  protected BundleResponse response;

  public BundleEntry() {
  }

  public BundleEntry(BundleEntryModel o) {
    this.id = o.getId();
    if (null != o.getLink() && !o.getLink().isEmpty()) {
    	this.link = BundleLinkHelper.fromArray2Array(o.getLink());
    }
    if (null != o.getFullUrl()) {
      this.fullUrl = o.getFullUrl();
    }
    this.resource = ResourceListHelper.fromJson(o.getResource());
    if (null != o.getSearch() && !o.getSearch().isEmpty()) {
      this.search = new BundleSearch(o.getSearch().get(0));
    }
    if (null != o.getRequest() && !o.getRequest().isEmpty()) {
      this.request = new BundleRequest(o.getRequest().get(0));
    }
    if (null != o.getResponse() && !o.getResponse().isEmpty()) {
      this.response = new BundleResponse(o.getResponse().get(0));
    }
  }

  public void setLink( java.util.List<BundleLink> value) {
    this.link = value;
  }
  public java.util.List<BundleLink> getLink() {
    return this.link;
  }
  public void setFullUrl( String value) {
    this.fullUrl = value;
  }
  public String getFullUrl() {
    return this.fullUrl;
  }
  public void set_fullUrl( Element value) {
    this._fullUrl = value;
  }
  public Element get_fullUrl() {
    return this._fullUrl;
  }
  public void setResource( ResourceList value) {
    this.resource = value;
  }
  public ResourceList getResource() {
    return this.resource;
  }
  public void setSearch( BundleSearch value) {
    this.search = value;
  }
  public BundleSearch getSearch() {
    return this.search;
  }
  public void setRequest( BundleRequest value) {
    this.request = value;
  }
  public BundleRequest getRequest() {
    return this.request;
  }
  public void setResponse( BundleResponse value) {
    this.response = value;
  }
  public BundleResponse getResponse() {
    return this.response;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[BundleEntry]:" + "\n");
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); 
     if(this.fullUrl != null) builder.append("fullUrl" + "->" + this.fullUrl.toString() + "\n"); 
     if(this._fullUrl != null) builder.append("_fullUrl" + "->" + this._fullUrl.toString() + "\n"); 
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); 
     if(this.search != null) builder.append("search" + "->" + this.search.toString() + "\n"); 
     if(this.request != null) builder.append("request" + "->" + this.request.toString() + "\n"); 
     if(this.response != null) builder.append("response" + "->" + this.response.toString() + "\n"); ;
    return builder.toString();
  }


}