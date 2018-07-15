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
import org.fhir.entity.MedicationBatchModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MedicationBatch  extends BackboneElement  {
  /**
  * Description: "The assigned lot number of a batch of the specified product."
  */
  protected String lotNumber;

  /**
  * Description: "Extensions for lotNumber"
  */
  protected transient Element _lotNumber;

  /**
  * Description: "When this specific batch of product will expire."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String expirationDate;

  /**
  * Description: "Extensions for expirationDate"
  */
  protected transient Element _expirationDate;

  public MedicationBatch() {
  }

  public MedicationBatch(MedicationBatchModel o) {
    this.id = o.getId();
    if (null != o.getLotNumber()) {
      this.lotNumber = o.getLotNumber();
    }
    if (null != o.getExpirationDate()) {
      this.expirationDate = o.getExpirationDate();
    }
  }

  public void setLotNumber( String value) {
    this.lotNumber = value;
  }
  public String getLotNumber() {
    return this.lotNumber;
  }
  public void set_lotNumber( Element value) {
    this._lotNumber = value;
  }
  public Element get_lotNumber() {
    return this._lotNumber;
  }
  public void setExpirationDate( String value) {
    this.expirationDate = value;
  }
  public String getExpirationDate() {
    return this.expirationDate;
  }
  public void set_expirationDate( Element value) {
    this._expirationDate = value;
  }
  public Element get_expirationDate() {
    return this._expirationDate;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationBatch]:" + "\n");
     if(this.lotNumber != null) builder.append("lotNumber" + "->" + this.lotNumber.toString() + "\n"); 
     if(this._lotNumber != null) builder.append("_lotNumber" + "->" + this._lotNumber.toString() + "\n"); 
     if(this.expirationDate != null) builder.append("expirationDate" + "->" + this.expirationDate.toString() + "\n"); 
     if(this._expirationDate != null) builder.append("_expirationDate" + "->" + this._expirationDate.toString() + "\n"); ;
    return builder.toString();
  }


}