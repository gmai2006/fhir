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
import org.fhir.entity.BundleLinkModel;
import com.google.gson.GsonBuilder;

/**
* "A container for a collection of resources."
*/
public class BundleLink  extends BackboneElement  {
  /**
  * Description: "A name which details the functional use for this link - see [http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1](http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1)."
  */
  protected String relation;

  /**
  * Description: "Extensions for relation"
  */
  protected transient Element _relation;

  /**
  * Description: "The reference details for the link."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  public BundleLink() {
  }

  public BundleLink(BundleLinkModel o) {
    this.id = o.getId();
    if (null != o.getRelation()) {
      this.relation = o.getRelation();
    }
    if (null != o.getUrl()) {
      this.url = o.getUrl();
    }
  }

  public void setRelation( String value) {
    this.relation = value;
  }
  public String getRelation() {
    return this.relation;
  }
  public void set_relation( Element value) {
    this._relation = value;
  }
  public Element get_relation() {
    return this._relation;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void set_url( Element value) {
    this._url = value;
  }
  public Element get_url() {
    return this._url;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[BundleLink]:" + "\n");
     if(this.relation != null) builder.append("relation" + "->" + this.relation.toString() + "\n"); 
     if(this._relation != null) builder.append("_relation" + "->" + this._relation.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); ;
    return builder.toString();
  }


}