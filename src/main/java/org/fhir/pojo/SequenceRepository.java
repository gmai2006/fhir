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
import org.fhir.entity.SequenceRepositoryModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Raw data describing a biological sequence."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SequenceRepository  extends BackboneElement  {
  /**
  * Description: "Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "URI of an external repository which contains further details about the genetics data."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "URI of an external repository which contains further details about the genetics data."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "Id of the variant in this external repository. The server will understand how to use this id to call for more info about datasets in external repository."
  */
  protected String datasetId;

  /**
  * Description: "Extensions for datasetId"
  */
  protected transient Element _datasetId;

  /**
  * Description: "Id of the variantset in this external repository. The server will understand how to use this id to call for more info about variantsets in external repository."
  */
  protected String variantsetId;

  /**
  * Description: "Extensions for variantsetId"
  */
  protected transient Element _variantsetId;

  /**
  * Description: "Id of the read in this external repository."
  */
  protected String readsetId;

  /**
  * Description: "Extensions for readsetId"
  */
  protected transient Element _readsetId;

  public SequenceRepository() {
  }

  public SequenceRepository(SequenceRepositoryModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getUrl()) {
      this.url = o.getUrl();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getDatasetId()) {
      this.datasetId = o.getDatasetId();
    }
    if (null != o.getVariantsetId()) {
      this.variantsetId = o.getVariantsetId();
    }
    if (null != o.getReadsetId()) {
      this.readsetId = o.getReadsetId();
    }
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
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void set_url( Element value) {
    this._url = value;
  }
  public Element get_url() {
    return this._url;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setDatasetId( String value) {
    this.datasetId = value;
  }
  public String getDatasetId() {
    return this.datasetId;
  }
  public void set_datasetId( Element value) {
    this._datasetId = value;
  }
  public Element get_datasetId() {
    return this._datasetId;
  }
  public void setVariantsetId( String value) {
    this.variantsetId = value;
  }
  public String getVariantsetId() {
    return this.variantsetId;
  }
  public void set_variantsetId( Element value) {
    this._variantsetId = value;
  }
  public Element get_variantsetId() {
    return this._variantsetId;
  }
  public void setReadsetId( String value) {
    this.readsetId = value;
  }
  public String getReadsetId() {
    return this.readsetId;
  }
  public void set_readsetId( Element value) {
    this._readsetId = value;
  }
  public Element get_readsetId() {
    return this._readsetId;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SequenceRepository]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.datasetId != null) builder.append("datasetId" + "->" + this.datasetId.toString() + "\n"); 
     if(this._datasetId != null) builder.append("_datasetId" + "->" + this._datasetId.toString() + "\n"); 
     if(this.variantsetId != null) builder.append("variantsetId" + "->" + this.variantsetId.toString() + "\n"); 
     if(this._variantsetId != null) builder.append("_variantsetId" + "->" + this._variantsetId.toString() + "\n"); 
     if(this.readsetId != null) builder.append("readsetId" + "->" + this.readsetId.toString() + "\n"); 
     if(this._readsetId != null) builder.append("_readsetId" + "->" + this._readsetId.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum TypeEnum {
  	directlink,
  	openapi,
  	login,
  	oauth,
  	other,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "directlink" : { return directlink.toString(); }
  			case "openapi" : { return openapi.toString(); }
  			case "login" : { return login.toString(); }
  			case "oauth" : { return oauth.toString(); }
  			case "other" : { return other.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}