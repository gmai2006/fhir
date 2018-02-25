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
import org.fhir.entity.AuditEventNetworkModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AuditEventNetwork  extends BackboneElement  {
  /**
  * Description: "An identifier for the network access point of the user device for the audit event."
  */
  protected String address;

  /**
  * Description: "Extensions for address"
  */
  protected transient Element _address;

  /**
  * Description: "An identifier for the type of network access point that originated the audit event."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  public AuditEventNetwork() {
  }

  public AuditEventNetwork(AuditEventNetworkModel o) {
    this.id = o.getId();
    if (null != o.getAddress()) {
      this.address = o.getAddress();
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventNetwork]:" + "\n");
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); 
     if(this._address != null) builder.append("_address" + "->" + this._address.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	ONE,
  	TWO,
  	THREE,
  	FOUR,
  	FIVE,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "1" : { return ONE.toString(); }
  			case "2" : { return TWO.toString(); }
  			case "3" : { return THREE.toString(); }
  			case "4" : { return FOUR.toString(); }
  			case "5" : { return FIVE.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}