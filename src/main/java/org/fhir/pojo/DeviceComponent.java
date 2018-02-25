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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The characteristics, operational status and capabilities of a medical-related component of a medical device."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceComponent  extends DomainResource  {
  /**
  * Description: "This is a DeviceComponent resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The locally assigned unique identification by the software. For example: handle ID."
  */
  @javax.validation.constraints.NotNull
  protected Identifier identifier;

  /**
  * Description: "The component type as defined in the object-oriented or metric nomenclature partition."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept type;

  /**
  * Description: "The timestamp for the most recent system change which includes device configuration or setting change."
  */
  protected String lastSystemChange;

  /**
  * Description: "Extensions for lastSystemChange"
  */
  protected transient Element _lastSystemChange;

  /**
  * Description: "The link to the source Device that contains administrative device information such as manufacture, serial number, etc."
  */
  protected Reference source;

  /**
  * Description: "The link to the parent resource. For example: Channel is linked to its VMD parent."
  */
  protected Reference parent;

  /**
  * Description: "The current operational status of the device. For example: On, Off, Standby, etc."
  */
  protected java.util.List<CodeableConcept> operationalStatus;

  /**
  * Description: "The parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular."
  */
  protected CodeableConcept parameterGroup;

  /**
  * Description: "The physical principle of the measurement. For example: thermal, chemical, acoustical, etc."
  */
  protected String measurementPrinciple;

  /**
  * Description: "Extensions for measurementPrinciple"
  */
  protected transient Element _measurementPrinciple;

  /**
  * Description: "The production specification such as component revision, serial number, etc."
  */
  protected java.util.List<DeviceComponentProductionSpecification> productionSpecification;

  /**
  * Description: "The language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US."
  */
  protected CodeableConcept languageCode;

  public DeviceComponent() {
  }

  public DeviceComponent(DeviceComponentModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getLastSystemChange()) {
      this.lastSystemChange = o.getLastSystemChange();
    }
    if (null != o.getSource() && !o.getSource().isEmpty()) {
      this.source = new Reference(o.getSource().get(0));
    }
    if (null != o.getParent() && !o.getParent().isEmpty()) {
      this.parent = new Reference(o.getParent().get(0));
    }
    if (null != o.getOperationalStatus() && !o.getOperationalStatus().isEmpty()) {
    	this.operationalStatus = CodeableConceptHelper.fromArray2Array(o.getOperationalStatus());
    }
    if (null != o.getParameterGroup() && !o.getParameterGroup().isEmpty()) {
      this.parameterGroup = new CodeableConcept(o.getParameterGroup().get(0));
    }
    if (null != o.getMeasurementPrinciple()) {
      this.measurementPrinciple = o.getMeasurementPrinciple();
    }
    if (null != o.getProductionSpecification() && !o.getProductionSpecification().isEmpty()) {
    	this.productionSpecification = DeviceComponentProductionSpecificationHelper.fromArray2Array(o.getProductionSpecification());
    }
    if (null != o.getLanguageCode() && !o.getLanguageCode().isEmpty()) {
      this.languageCode = new CodeableConcept(o.getLanguageCode().get(0));
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
     if(this.languageCode != null) builder.append("languageCode" + "->" + this.languageCode.toString() + "\n"); ;
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