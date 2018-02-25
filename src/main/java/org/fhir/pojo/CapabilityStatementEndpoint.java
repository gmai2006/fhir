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
import org.fhir.entity.CapabilityStatementEndpointModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CapabilityStatementEndpoint  extends BackboneElement  {
  /**
  * Description: "A list of the messaging transport protocol(s) identifiers, supported by this endpoint."
  */
  @javax.validation.constraints.NotNull
  protected Coding protocol;

  /**
  * Description: "The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier."
  */
  protected String address;

  /**
  * Description: "Extensions for address"
  */
  protected transient Element _address;

  public CapabilityStatementEndpoint() {
  }

  public CapabilityStatementEndpoint(CapabilityStatementEndpointModel o) {
    this.id = o.getId();
    if (null != o.getProtocol() && !o.getProtocol().isEmpty()) {
      this.protocol = new Coding(o.getProtocol().get(0));
    }
    if (null != o.getAddress()) {
      this.address = o.getAddress();
    }
  }

  public void setProtocol( Coding value) {
    this.protocol = value;
  }
  public Coding getProtocol() {
    return this.protocol;
  }
  public void setAddress( String value) {
    this.address = value;
  }
  public String getAddress() {
    return this.address;
  }
  public void set_address( Element value) {
    this._address = value;
  }
  public Element get_address() {
    return this._address;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementEndpoint]:" + "\n");
     if(this.protocol != null) builder.append("protocol" + "->" + this.protocol.toString() + "\n"); 
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); 
     if(this._address != null) builder.append("_address" + "->" + this._address.toString() + "\n"); ;
    return builder.toString();
  }


}