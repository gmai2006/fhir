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

/**
* "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
*/
@Entity
@Table(name="patientcontact")
public class PatientContactModel  {
  /**
  * Description: "The nature of the relationship between the patient and the contact person."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"relationship\"", length = 16777215)
  private String relationship;

  /**
  * Description: "A name associated with the contact person."
  * Actual type: HumanName
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"name\"", length = 16777215)
  private String name;

  /**
  * Description: "A contact detail for the person, e.g. a telephone number or an email address."
  * Actual type: Array of ContactPoint-> List<ContactPoint>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"telecom\"", length = 16777215)
  private String telecom;

  /**
  * Description: "Address for the contact person."
  * Actual type: Address
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"address\"", length = 16777215)
  private String address;

  /**
  * Description: "Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes."
  */
  @javax.persistence.Basic
  @Column(name="\"gender\"")
  private String gender;

  /**
  * Description: "Organization on behalf of which the contact is acting or for which the contact is working."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`organization_id`", insertable=false, updatable=false)
  private ReferenceModel organization;

  /**
  * Description: "The period during which this contact person or organization is valid to be contacted relating to this patient."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public PatientContactModel() {
  }

  public PatientContactModel(PatientContact o) {
    this.id = o.getId();
      this.relationship = CodeableConcept.toJson(o.getRelationship());
      this.name = HumanName.toJson(o.getName());
      this.telecom = ContactPoint.toJson(o.getTelecom());
      this.address = Address.toJson(o.getAddress());
      this.gender = o.getGender();

      if (null != o.getOrganization()) {
      	this.organization_id = "organization" + this.getId();
        this.organization = new ReferenceModel(o.getOrganization());
        this.organization.setId(this.organization_id);
        this.organization.parent_id = this.organization.getId();
      }

      this.period = Period.toJson(o.getPeriod());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setRelationship( String value) {
    this.relationship = value;
  }
  public String getRelationship() {
    return this.relationship;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setTelecom( String value) {
    this.telecom = value;
  }
  public String getTelecom() {
    return this.telecom;
  }
  public void setAddress( String value) {
    this.address = value;
  }
  public String getAddress() {
    return this.address;
  }
  public void setGender( String value) {
    this.gender = value;
  }
  public String getGender() {
    return this.gender;
  }
  public void setOrganization( ReferenceModel value) {
    this.organization = value;
  }
  public ReferenceModel getOrganization() {
    return this.organization;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("relationship" + "[" + String.valueOf(this.relationship) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("telecom" + "[" + String.valueOf(this.telecom) + "]\n"); 
     builder.append("address" + "[" + String.valueOf(this.address) + "]\n"); 
     builder.append("gender" + "[" + String.valueOf(this.gender) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}