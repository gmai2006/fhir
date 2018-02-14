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
import org.fhir.entity.DeviceComponentModel;
import com.google.gson.GsonBuilder;

/**
* "The characteristics, operational status and capabilities of a medical-related component of a medical device."
*/
public class DeviceComponent  {
  /**
  * Description: "This is a DeviceComponent resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The locally assigned unique identification by the software. For example: handle ID."
  */
  @javax.validation.constraints.NotNull
  private Identifier identifier;

  /**
  * Description: "The component type as defined in the object-oriented or metric nomenclature partition."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept type;

  /**
  * Description: "The timestamp for the most recent system change which includes device configuration or setting change."
  */
  private String lastSystemChange;

  /**
  * Description: "Extensions for lastSystemChange"
  */
  private transient Element _lastSystemChange;

  /**
  * Description: "The link to the source Device that contains administrative device information such as manufacture, serial number, etc."
  */
  private Reference source;

  /**
  * Description: "The link to the parent resource. For example: Channel is linked to its VMD parent."
  */
  private Reference parent;

  /**
  * Description: "The current operational status of the device. For example: On, Off, Standby, etc."
  */
  private java.util.List<CodeableConcept> operationalStatus = new java.util.ArrayList<>();

  /**
  * Description: "The parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular."
  */
  private CodeableConcept parameterGroup;

  /**
  * Description: "The physical principle of the measurement. For example: thermal, chemical, acoustical, etc."
  */
  private String measurementPrinciple;

  /**
  * Description: "Extensions for measurementPrinciple"
  */
  private transient Element _measurementPrinciple;

  /**
  * Description: "The production specification such as component revision, serial number, etc."
  */
  private java.util.List<DeviceComponentProductionSpecification> productionSpecification = new java.util.ArrayList<>();

  /**
  * Description: "The language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US."
  */
  private CodeableConcept languageCode;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public DeviceComponent() {
  }

  public DeviceComponent(DeviceComponentModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getLastSystemChange()) {
      this.lastSystemChange = o.getLastSystemChange();
    }
    if (null != o.getSource() && !o.getSource().isEmpty()) {
      this.source = new Reference(o.getSource().get(0));
    }
    if (null != o.getParent() && !o.getParent().isEmpty()) {
      this.parent = new Reference(o.getParent().get(0));
    }
    this.parameterGroup = CodeableConceptHelper.fromJson(o.getParameterGroup());
    if (null != o.getMeasurementPrinciple()) {
      this.measurementPrinciple = o.getMeasurementPrinciple();
    }
    if (null != o.getProductionSpecification() && !o.getProductionSpecification().isEmpty()) {
    	this.productionSpecification = DeviceComponentProductionSpecificationHelper.fromArray2Array(o.getProductionSpecification());
    }
    this.languageCode = CodeableConceptHelper.fromJson(o.getLanguageCode());
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setLastSystemChange( String value) {
    this.lastSystemChange = value;
  }
  public String getLastSystemChange() {
    return this.lastSystemChange;
  }
  public void set_lastSystemChange( Element value) {
    this._lastSystemChange = value;
  }
  public Element get_lastSystemChange() {
    return this._lastSystemChange;
  }
  public void setSource( Reference value) {
    this.source = value;
  }
  public Reference getSource() {
    return this.source;
  }
  public void setParent( Reference value) {
    this.parent = value;
  }
  public Reference getParent() {
    return this.parent;
  }
  public void setOperationalStatus( java.util.List<CodeableConcept> value) {
    this.operationalStatus = value;
  }
  public java.util.List<CodeableConcept> getOperationalStatus() {
    return this.operationalStatus;
  }
  public void setParameterGroup( CodeableConcept value) {
    this.parameterGroup = value;
  }
  public CodeableConcept getParameterGroup() {
    return this.parameterGroup;
  }
  public void setMeasurementPrinciple( String value) {
    this.measurementPrinciple = MeasurementPrincipleEnum.fromCode(value);
  }
  public String getMeasurementPrinciple() {
    return this.measurementPrinciple;
  }
  public void set_measurementPrinciple( Element value) {
    this._measurementPrinciple = value;
  }
  public Element get_measurementPrinciple() {
    return this._measurementPrinciple;
  }
  public void setProductionSpecification( java.util.List<DeviceComponentProductionSpecification> value) {
    this.productionSpecification = value;
  }
  public java.util.List<DeviceComponentProductionSpecification> getProductionSpecification() {
    return this.productionSpecification;
  }
  public void setLanguageCode( CodeableConcept value) {
    this.languageCode = value;
  }
  public CodeableConcept getLanguageCode() {
    return this.languageCode;
  }
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceComponent]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.lastSystemChange != null) builder.append("lastSystemChange" + "->" + this.lastSystemChange.toString() + "\n"); 
     if(this._lastSystemChange != null) builder.append("_lastSystemChange" + "->" + this._lastSystemChange.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this.parent != null) builder.append("parent" + "->" + this.parent.toString() + "\n"); 
     if(this.operationalStatus != null) builder.append("operationalStatus" + "->" + this.operationalStatus.toString() + "\n"); 
     if(this.parameterGroup != null) builder.append("parameterGroup" + "->" + this.parameterGroup.toString() + "\n"); 
     if(this.measurementPrinciple != null) builder.append("measurementPrinciple" + "->" + this.measurementPrinciple.toString() + "\n"); 
     if(this._measurementPrinciple != null) builder.append("_measurementPrinciple" + "->" + this._measurementPrinciple.toString() + "\n"); 
     if(this.productionSpecification != null) builder.append("productionSpecification" + "->" + this.productionSpecification.toString() + "\n"); 
     if(this.languageCode != null) builder.append("languageCode" + "->" + this.languageCode.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	DeviceComponent,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "DeviceComponent" : { return DeviceComponent.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum MeasurementPrincipleEnum {
  	other,
  	chemical,
  	electrical,
  	impedance,
  	nuclear,
  	optical,
  	thermal,
  	biological,
  	mechanical,
  	acoustical,
  	manual,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "other" : { return other.toString(); }
  			case "chemical" : { return chemical.toString(); }
  			case "electrical" : { return electrical.toString(); }
  			case "impedance" : { return impedance.toString(); }
  			case "nuclear" : { return nuclear.toString(); }
  			case "optical" : { return optical.toString(); }
  			case "thermal" : { return thermal.toString(); }
  			case "biological" : { return biological.toString(); }
  			case "mechanical" : { return mechanical.toString(); }
  			case "acoustical" : { return acoustical.toString(); }
  			case "manual" : { return manual.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}