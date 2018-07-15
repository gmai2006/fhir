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
* "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies."
* generated on 07/14/2018
*/
@Entity
@Table(name="quantity")
public class QuantityModel  implements Serializable {
	private static final long serialVersionUID = 15315921018165366L;
  /**
  * Description: "The value of the measured amount. The value includes an implicit precision in the presentation of the value."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"value\"")
  private Float value;

  /**
  * Description: "How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is \"<\" , then the real value is < stated value."
  */
  @javax.persistence.Basic
  @Column(name="\"comparator\"")
  private String comparator;

  /**
  * Description: "A human-readable form of the unit."
  */
  @javax.persistence.Basic
  @Column(name="\"unit\"")
  private String unit;

  /**
  * Description: "The identification of the system that provides the coded form of the unit."
  */
  @javax.persistence.Basic
  @Column(name="\"system\"")
  private String system;

  /**
  * Description: "A computer processable form of the unit in some unit representation system."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"code\"")
  private String code;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public QuantityModel() {
  }

  public QuantityModel(Quantity o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.value = o.getValue();
    this.comparator = o.getComparator();
    this.unit = o.getUnit();
    this.system = o.getSystem();
    this.code = o.getCode();
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public Float getValue() {
    return this.value;
  }
  public void setValue( Float value) {
    this.value = value;
  }
  public String getComparator() {
    return this.comparator;
  }
  public void setComparator( String value) {
    this.comparator = value;
  }
  public String getUnit() {
    return this.unit;
  }
  public void setUnit( String value) {
    this.unit = value;
  }
  public String getSystem() {
    return this.system;
  }
  public void setSystem( String value) {
    this.system = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[QuantityModel]:" + "\n");
     builder.append("value" + "->" + this.value + "\n"); 
     builder.append("comparator" + "->" + this.comparator + "\n"); 
     builder.append("unit" + "->" + this.unit + "\n"); 
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[QuantityModel]:" + "\n");
     builder.append("value" + "->" + this.value + "\n"); 
     builder.append("comparator" + "->" + this.comparator + "\n"); 
     builder.append("unit" + "->" + this.unit + "\n"); 
     builder.append("system" + "->" + this.system + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}