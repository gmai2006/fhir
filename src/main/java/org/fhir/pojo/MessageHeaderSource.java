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
import org.fhir.entity.MessageHeaderSourceModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageHeaderSource  extends BackboneElement  {
  /**
  * Description: "Human-readable name for the source system."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "May include configuration or other information useful in debugging."
  */
  protected String software;

  /**
  * Description: "Extensions for software"
  */
  protected transient Element _software;

  /**
  * Description: "Can convey versions of multiple systems in situations where a message passes through multiple hands."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "An e-mail, phone, website or other contact point to use to resolve issues with message communications."
  */
  protected ContactPoint contact;

  /**
  * Description: "Identifies the routing target to send acknowledgements to."
  */
  protected String endpoint;

  /**
  * Description: "Extensions for endpoint"
  */
  protected transient Element _endpoint;

  public MessageHeaderSource() {
  }

  public MessageHeaderSource(MessageHeaderSourceModel o) {
    this.id = o.getId();
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getSoftware()) {
      this.software = o.getSoftware();
    }
    if (null != o.getVersion()) {
      this.version = o.getVersion();
    }
    this.contact = ContactPointHelper.fromJson(o.getContact());
    if (null != o.getEndpoint()) {
      this.endpoint = o.getEndpoint();
    }
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
  public void setSoftware( String value) {
    this.software = value;
  }
  public String getSoftware() {
    return this.software;
  }
  public void set_software( Element value) {
    this._software = value;
  }
  public Element get_software() {
    return this._software;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void set_version( Element value) {
    this._version = value;
  }
  public Element get_version() {
    return this._version;
  }
  public void setContact( ContactPoint value) {
    this.contact = value;
  }
  public ContactPoint getContact() {
    return this.contact;
  }
  public void setEndpoint( String value) {
    this.endpoint = value;
  }
  public String getEndpoint() {
    return this.endpoint;
  }
  public void set_endpoint( Element value) {
    this._endpoint = value;
  }
  public Element get_endpoint() {
    return this._endpoint;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MessageHeaderSource]:" + "\n");
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.software != null) builder.append("software" + "->" + this.software.toString() + "\n"); 
     if(this._software != null) builder.append("_software" + "->" + this._software.toString() + "\n"); 
     if(this.version != null) builder.append("version" + "->" + this.version.toString() + "\n"); 
     if(this._version != null) builder.append("_version" + "->" + this._version.toString() + "\n"); 
     if(this.contact != null) builder.append("contact" + "->" + this.contact.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); 
     if(this._endpoint != null) builder.append("_endpoint" + "->" + this._endpoint.toString() + "\n"); ;
    return builder.toString();
  }


}