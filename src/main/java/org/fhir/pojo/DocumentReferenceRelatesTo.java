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
import org.fhir.entity.DocumentReferenceRelatesToModel;
import com.google.gson.GsonBuilder;

/**
* "A reference to a document."
*/
public class DocumentReferenceRelatesTo  extends BackboneElement  {
  /**
  * Description: "The type of relationship that this document has with anther document."
  */
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "The target document of this relationship."
  */
  @javax.validation.constraints.NotNull
  protected Reference target;

  public DocumentReferenceRelatesTo() {
  }

  public DocumentReferenceRelatesTo(DocumentReferenceRelatesToModel o) {
    this.id = o.getId();
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (null != o.getTarget() && !o.getTarget().isEmpty()) {
      this.target = new Reference(o.getTarget().get(0));
    }
  }

  public void setCode( String value) {
    this.code = CodeEnum.fromCode(value);
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
  public void setTarget( Reference value) {
    this.target = value;
  }
  public Reference getTarget() {
    return this.target;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentReferenceRelatesTo]:" + "\n");
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.target != null) builder.append("target" + "->" + this.target.toString() + "\n"); ;
    return builder.toString();
  }

  public enum CodeEnum {
  	replaces,
  	transforms,
  	signs,
  	appends,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "replaces" : { return replaces.toString(); }
  			case "transforms" : { return transforms.toString(); }
  			case "signs" : { return signs.toString(); }
  			case "appends" : { return appends.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}