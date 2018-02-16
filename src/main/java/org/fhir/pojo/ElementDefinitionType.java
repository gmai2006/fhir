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
import com.google.gson.GsonBuilder;

/**
* "Captures constraints on each element within the resource, profile, or extension."
*/
public class ElementDefinitionType  extends BackboneElement  {
  /**
  * Description: "URL of Data type or Resource that is a(or the) type used for this element. References are URLs that are relative to http://hl7.org/fhir/StructureDefinition e.g. \"string\" is a reference to http://hl7.org/fhir/StructureDefinition/string. Absolute URLs are only allowed in logical models."
  */
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "Identifies a profile structure or implementation Guide that SHALL hold for the datatype this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide."
  */
  protected String profile;

  /**
  * Description: "Extensions for profile"
  */
  protected transient Element _profile;

  /**
  * Description: "Identifies a profile structure or implementation Guide that SHALL hold for the target of the reference this element refers to. Can be a local reference - to a contained StructureDefinition, or a reference to another StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide is specified, the resource SHALL conform to at least one profile defined in the implementation guide."
  */
  protected String targetProfile;

  /**
  * Description: "Extensions for targetProfile"
  */
  protected transient Element _targetProfile;

  /**
  * Description: "If the type is a reference to another resource, how the resource is or can be aggregated - is it a contained resource, or a reference, and if the context is a bundle, is it included in the bundle."
  */
  protected java.util.List<String> aggregation = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for aggregation"
  */
  protected transient java.util.List<Element> _aggregation = new java.util.ArrayList<>();

  /**
  * Description: "Whether this reference needs to be version specific or version independent, or whether either can be used."
  */
  protected String versioning;

  /**
  * Description: "Extensions for versioning"
  */
  protected transient Element _versioning;

  public ElementDefinitionType() {}

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void set_code( Element value) {
    this._code = value;
  }
  public Element get_code() {
    return this._code;
  }
  public void setProfile( String value) {
    this.profile = value;
  }
  public String getProfile() {
    return this.profile;
  }
  public void set_profile( Element value) {
    this._profile = value;
  }
  public Element get_profile() {
    return this._profile;
  }
  public void setTargetProfile( String value) {
    this.targetProfile = value;
  }
  public String getTargetProfile() {
    return this.targetProfile;
  }
  public void set_targetProfile( Element value) {
    this._targetProfile = value;
  }
  public Element get_targetProfile() {
    return this._targetProfile;
  }
  public void setAggregation( java.util.List<String> value) {
    this.aggregation = AggregationEnum.fromCode(value);
  }
  public java.util.List<String> getAggregation() {
    return this.aggregation;
  }
  public void set_aggregation( java.util.List<Element> value) {
    this._aggregation = value;
  }
  public java.util.List<Element> get_aggregation() {
    return this._aggregation;
  }
  public void setVersioning( String value) {
    this.versioning = VersioningEnum.fromCode(value);
  }
  public String getVersioning() {
    return this.versioning;
  }
  public void set_versioning( Element value) {
    this._versioning = value;
  }
  public Element get_versioning() {
    return this._versioning;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ElementDefinitionType]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.profile != null) builder.append("profile" + "->" + this.profile.toString() + "\n"); 
     if(this._profile != null) builder.append("_profile" + "->" + this._profile.toString() + "\n"); 
     if(this.targetProfile != null) builder.append("targetProfile" + "->" + this.targetProfile.toString() + "\n"); 
     if(this._targetProfile != null) builder.append("_targetProfile" + "->" + this._targetProfile.toString() + "\n"); 
     if(this.aggregation != null) builder.append("aggregation" + "->" + this.aggregation.toString() + "\n"); 
     if(this._aggregation != null) builder.append("_aggregation" + "->" + this._aggregation.toString() + "\n"); 
     if(this.versioning != null) builder.append("versioning" + "->" + this.versioning.toString() + "\n"); 
     if(this._versioning != null) builder.append("_versioning" + "->" + this._versioning.toString() + "\n"); ;
    return builder.toString();
  }

  public enum AggregationEnum {
  	contained,
  	referenced,
  	bundled,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "contained" : { result.add(contained.toString()); }
  		  			case "referenced" : { result.add(referenced.toString()); }
  		  			case "bundled" : { result.add(bundled.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }public enum VersioningEnum {
  	either,
  	independent,
  	specific,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "either" : { return either.toString(); }
  			case "independent" : { return independent.toString(); }
  			case "specific" : { return specific.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}