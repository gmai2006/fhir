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
import org.fhir.entity.DataElementMappingModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The formal description of a single piece of information that can be gathered and reported."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DataElementMapping  extends BackboneElement  {
  /**
  * Description: "An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String identity;

  /**
  * Description: "Extensions for identity"
  */
  protected transient Element _identity;

  /**
  * Description: "An absolute URI that identifies the specification that this mapping is expressed to."
  */
  protected String uri;

  /**
  * Description: "Extensions for uri"
  */
  protected transient Element _uri;

  /**
  * Description: "A name for the specification that is being mapped to."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  public DataElementMapping() {
  }

  public DataElementMapping(DataElementMappingModel o) {
    this.id = o.getId();
    if (null != o.getIdentity()) {
      this.identity = o.getIdentity();
    }
    if (null != o.getUri()) {
      this.uri = o.getUri();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getComment()) {
      this.comment = o.getComment();
    }
  }

  public void setIdentity( String value) {
    this.identity = value;
  }
  public String getIdentity() {
    return this.identity;
  }
  public void set_identity( Element value) {
    this._identity = value;
  }
  public Element get_identity() {
    return this._identity;
  }
  public void setUri( String value) {
    this.uri = value;
  }
  public String getUri() {
    return this.uri;
  }
  public void set_uri( Element value) {
    this._uri = value;
  }
  public Element get_uri() {
    return this._uri;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DataElementMapping]:" + "\n");
     if(this.identity != null) builder.append("identity" + "->" + this.identity.toString() + "\n"); 
     if(this._identity != null) builder.append("_identity" + "->" + this._identity.toString() + "\n"); 
     if(this.uri != null) builder.append("uri" + "->" + this.uri.toString() + "\n"); 
     if(this._uri != null) builder.append("_uri" + "->" + this._uri.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); ;
    return builder.toString();
  }


}