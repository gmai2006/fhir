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
* "The characteristics, operational status and capabilities of a medical-related component of a medical device."
*/
@Entity
@Table(name="devicecomponent")
public class DeviceComponentModel  {
  /**
  * Description: "This is a DeviceComponent resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The locally assigned unique identification by the software. For example: handle ID."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The component type as defined in the object-oriented or metric nomenclature partition."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The timestamp for the most recent system change which includes device configuration or setting change."
  */
  @javax.persistence.Basic
  @Column(name="\"lastSystemChange\"")
  private String lastSystemChange;

  /**
  * Description: "The link to the source Device that contains administrative device information such as manufacture, serial number, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"source_id\"")
  private String source_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`source_id`", insertable=false, updatable=false)
  private ReferenceModel source;

  /**
  * Description: "The link to the parent resource. For example: Channel is linked to its VMD parent."
  */
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`parent_id`", insertable=false, updatable=false)
  private ReferenceModel parent;

  /**
  * Description: "The current operational status of the device. For example: On, Off, Standby, etc."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"operationalStatus\"", length = 16777215)
  private String operationalStatus;

  /**
  * Description: "The parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"parameterGroup\"", length = 16777215)
  private String parameterGroup;

  /**
  * Description: "The physical principle of the measurement. For example: thermal, chemical, acoustical, etc."
  */
  @javax.persistence.Basic
  @Column(name="\"measurementPrinciple\"")
  private String measurementPrinciple;

  /**
  * Description: "The production specification such as component revision, serial number, etc."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<DeviceComponentProductionSpecificationModel> productionSpecification = new java.util.ArrayList<>();

  /**
  * Description: "The language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"languageCode\"", length = 16777215)
  private String languageCode;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;


  public DeviceComponentModel() {
  }

  public DeviceComponentModel(DeviceComponent o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.type = CodeableConcept.toJson(o.getType());
      this.lastSystemChange = o.getLastSystemChange();

      if (null != o.getSource()) {
      	this.source_id = "source" + this.getId();
        this.source = new ReferenceModel(o.getSource());
        this.source.setId(this.source_id);
        this.source.parent_id = this.source.getId();
      }

      if (null != o.getParent()) {
      	this.parent_id = "parent" + this.getId();
        this.parent = new ReferenceModel(o.getParent());
        this.parent.setId(this.parent_id);
        this.parent.parent_id = this.parent.getId();
      }

      this.operationalStatus = CodeableConcept.toJson(o.getOperationalStatus());
      this.parameterGroup = CodeableConcept.toJson(o.getParameterGroup());
      this.measurementPrinciple = o.getMeasurementPrinciple();

      this.productionSpecification = DeviceComponentProductionSpecification.toModelArray(o.getProductionSpecification());

      this.languageCode = CodeableConcept.toJson(o.getLanguageCode());
      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setLastSystemChange( String value) {
    this.lastSystemChange = value;
  }
  public String getLastSystemChange() {
    return this.lastSystemChange;
  }
  public void setSource( ReferenceModel value) {
    this.source = value;
  }
  public ReferenceModel getSource() {
    return this.source;
  }
  public void setParent( ReferenceModel value) {
    this.parent = value;
  }
  public ReferenceModel getParent() {
    return this.parent;
  }
  public void setOperationalStatus( String value) {
    this.operationalStatus = value;
  }
  public String getOperationalStatus() {
    return this.operationalStatus;
  }
  public void setParameterGroup( String value) {
    this.parameterGroup = value;
  }
  public String getParameterGroup() {
    return this.parameterGroup;
  }
  public void setMeasurementPrinciple( String value) {
    this.measurementPrinciple = value;
  }
  public String getMeasurementPrinciple() {
    return this.measurementPrinciple;
  }
  public void setProductionSpecification( java.util.List<DeviceComponentProductionSpecificationModel> value) {
    this.productionSpecification = value;
  }
  public java.util.List<DeviceComponentProductionSpecificationModel> getProductionSpecification() {
    return this.productionSpecification;
  }
  public void setLanguageCode( String value) {
    this.languageCode = value;
  }
  public String getLanguageCode() {
    return this.languageCode;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
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
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("lastSystemChange" + "[" + String.valueOf(this.lastSystemChange) + "]\n"); 
     builder.append("source" + "[" + String.valueOf(this.source) + "]\n"); 
     builder.append("parent" + "[" + String.valueOf(this.parent) + "]\n"); 
     builder.append("operationalStatus" + "[" + String.valueOf(this.operationalStatus) + "]\n"); 
     builder.append("parameterGroup" + "[" + String.valueOf(this.parameterGroup) + "]\n"); 
     builder.append("measurementPrinciple" + "[" + String.valueOf(this.measurementPrinciple) + "]\n"); 
     builder.append("productionSpecification" + "[" + String.valueOf(this.productionSpecification) + "]\n"); 
     builder.append("languageCode" + "[" + String.valueOf(this.languageCode) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}