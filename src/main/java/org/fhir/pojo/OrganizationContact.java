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
import org.fhir.entity.OrganizationContactModel;
import com.google.gson.GsonBuilder;

/**
* "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc."
*/
public class OrganizationContact  extends BackboneElement  {
  /**
  * Description: "Indicates a purpose for which the contact can be reached."
  */
  protected CodeableConcept purpose;

  /**
  * Description: "A name associated with the contact."
  */
  protected HumanName name;

  /**
  * Description: "A contact detail (e.g. a telephone number or an email address) by which the party may be contacted."
  */
  protected java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "Visiting or postal addresses for the contact."
  */
  protected Address address;

  public OrganizationContact() {
  }

  public OrganizationContact(OrganizationContactModel o) {
    this.id = o.getId();
    if (null != o.getPurpose() && !o.getPurpose().isEmpty()) {
      this.purpose = new CodeableConcept(o.getPurpose().get(0));
    }
    this.name = HumanNameHelper.fromJson(o.getName());
    if (null != o.getAddress() && !o.getAddress().isEmpty()) {
      this.address = new Address(o.getAddress().get(0));
    }
  }

  public void setPurpose( CodeableConcept value) {
    this.purpose = value;
  }
  public CodeableConcept getPurpose() {
    return this.purpose;
  }
  public void setName( HumanName value) {
    this.name = value;
  }
  public HumanName getName() {
    return this.name;
  }
  public void setTelecom( java.util.List<ContactPoint> value) {
    this.telecom = value;
  }
  public java.util.List<ContactPoint> getTelecom() {
    return this.telecom;
  }
  public void setAddress( Address value) {
    this.address = value;
  }
  public Address getAddress() {
    return this.address;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[OrganizationContact]:" + "\n");
     if(this.purpose != null) builder.append("purpose" + "->" + this.purpose.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this.telecom != null) builder.append("telecom" + "->" + this.telecom.toString() + "\n"); 
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); ;
    return builder.toString();
  }


}