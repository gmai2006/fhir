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
import org.fhir.entity.ConsentPolicyModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsentPolicy  extends BackboneElement  {
  /**
  * Description: "Entity or Organization having regulatory jurisdiction or accountability for  enforcing policies pertaining to Consent Directives."
  */
  protected String authority;

  /**
  * Description: "Extensions for authority"
  */
  protected transient Element _authority;

  /**
  * Description: "The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law."
  */
  protected String uri;

  /**
  * Description: "Extensions for uri"
  */
  protected transient Element _uri;

  public ConsentPolicy() {
  }

  public ConsentPolicy(ConsentPolicyModel o) {
    this.id = o.getId();
    if (null != o.getAuthority()) {
      this.authority = o.getAuthority();
    }
    if (null != o.getUri()) {
      this.uri = o.getUri();
    }
  }

  public void setAuthority( String value) {
    this.authority = value;
  }
  public String getAuthority() {
    return this.authority;
  }
  public void set_authority( Element value) {
    this._authority = value;
  }
  public Element get_authority() {
    return this._authority;
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConsentPolicy]:" + "\n");
     if(this.authority != null) builder.append("authority" + "->" + this.authority.toString() + "\n"); 
     if(this._authority != null) builder.append("_authority" + "->" + this._authority.toString() + "\n"); 
     if(this.uri != null) builder.append("uri" + "->" + this.uri.toString() + "\n"); 
     if(this._uri != null) builder.append("_uri" + "->" + this._uri.toString() + "\n"); ;
    return builder.toString();
  }


}