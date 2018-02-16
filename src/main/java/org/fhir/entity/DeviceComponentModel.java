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
* "The characteristics, operational status and capabilities of a medical-related component of a medical device."
*/
@Entity
@Table(name="devicecomponent")
public class DeviceComponentModel  implements Serializable {
	private static final long serialVersionUID = 151873631148716259L;
  /**
  * Description: "This is a DeviceComponent resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The locally assigned unique identification by the software. For example: handle ID."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The component type as defined in the object-oriented or metric nomenclature partition."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="source_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> source;

  /**
  * Description: "The link to the parent resource. For example: Channel is linked to its VMD parent."
  */
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="parent_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> parent;

  /**
  * Description: "The current operational status of the device. For example: On, Off, Standby, etc."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"operationalStatus\"", length = 16777215)
  private String operationalStatus;

  /**
  * Description: "The parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular."
  * Actual type: String;
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
  @javax.persistence.Basic
  @Column(name="\"productionspecification_id\"")
  private String productionspecification_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="productionspecification_id", insertable=false, updatable=false)
  private java.util.List<DeviceComponentProductionSpecificationModel> productionSpecification;

  /**
  * Description: "The language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

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
    this.identifier = JsonUtils.toJson(o.getIdentifier());
    this.type = JsonUtils.toJson(o.getType());
    this.lastSystemChange = o.getLastSystemChange();
    if (null != o.getSource() ) {
    	this.source_id = "source" + this.id;
    	this.source = ReferenceHelper.toModel(o.getSource(), this.source_id);
    }
    if (null != o.getParent() ) {
    	this.parent_id = "parent" + this.id;
    	this.parent = ReferenceHelper.toModel(o.getParent(), this.parent_id);
    }
    this.parameterGroup = JsonUtils.toJson(o.getParameterGroup());
    this.measurementPrinciple = o.getMeasurementPrinciple();
    if (null != o.getProductionSpecification() && !o.getProductionSpecification().isEmpty()) {
    	this.productionspecification_id = "productionspecification" + this.id;
    	this.productionSpecification = DeviceComponentProductionSpecificationHelper.toModelFromArray(o.getProductionSpecification(), this.productionspecification_id);
    }
    this.languageCode = JsonUtils.toJson(o.getLanguageCode());
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getLastSystemChange() {
    return this.lastSystemChange;
  }
  public void setLastSystemChange( String value) {
    this.lastSystemChange = value;
  }
  public java.util.List<ReferenceModel> getSource() {
    return this.source;
  }
  public void setSource( java.util.List<ReferenceModel> value) {
    this.source = value;
  }
  public java.util.List<ReferenceModel> getParent() {
    return this.parent;
  }
  public void setParent( java.util.List<ReferenceModel> value) {
    this.parent = value;
  }
  public String getOperationalStatus() {
    return this.operationalStatus;
  }
  public void setOperationalStatus( String value) {
    this.operationalStatus = value;
  }
  public String getParameterGroup() {
    return this.parameterGroup;
  }
  public void setParameterGroup( String value) {
    this.parameterGroup = value;
  }
  public String getMeasurementPrinciple() {
    return this.measurementPrinciple;
  }
  public void setMeasurementPrinciple( String value) {
    this.measurementPrinciple = value;
  }
  public java.util.List<DeviceComponentProductionSpecificationModel> getProductionSpecification() {
    return this.productionSpecification;
  }
  public void setProductionSpecification( java.util.List<DeviceComponentProductionSpecificationModel> value) {
    this.productionSpecification = value;
  }
  public String getLanguageCode() {
    return this.languageCode;
  }
  public void setLanguageCode( String value) {
    this.languageCode = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceComponentModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("lastSystemChange" + "->" + this.lastSystemChange + "\n"); 
     builder.append("operationalStatus" + "->" + this.operationalStatus + "\n"); 
     builder.append("parameterGroup" + "->" + this.parameterGroup + "\n"); 
     builder.append("measurementPrinciple" + "->" + this.measurementPrinciple + "\n"); 
     builder.append("languageCode" + "->" + this.languageCode + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceComponentModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("lastSystemChange" + "->" + this.lastSystemChange + "\n"); 
     builder.append("source" + "->" + this.source + "\n"); 
     builder.append("parent" + "->" + this.parent + "\n"); 
     builder.append("operationalStatus" + "->" + this.operationalStatus + "\n"); 
     builder.append("parameterGroup" + "->" + this.parameterGroup + "\n"); 
     builder.append("measurementPrinciple" + "->" + this.measurementPrinciple + "\n"); 
     builder.append("productionSpecification" + "->" + this.productionSpecification + "\n"); 
     builder.append("languageCode" + "->" + this.languageCode + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}