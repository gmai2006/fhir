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
import org.fhir.entity.CompartmentDefinitionResourceModel;
import com.google.gson.GsonBuilder;

/**
* "A compartment definition that defines how resources are accessed on a server."
*/
public class CompartmentDefinitionResource  {
  /**
  * Description: "The name of a resource supported by the server."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "The name of a search parameter that represents the link to the compartment. More than one may be listed because a resource may be linked to a compartment in more than one way,."
  */
  private java.util.List<String> param = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for param"
  */
  private transient java.util.List<Element> _param = new java.util.ArrayList<>();

  /**
  * Description: "Additional documentation about the resource and compartment."
  */
  private String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  private transient Element _documentation;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public CompartmentDefinitionResource() {
  }

  public CompartmentDefinitionResource(CompartmentDefinitionResourceModel o) {
    this.id = o.getId();
      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      this.param = org.fhir.utils.JsonUtils.json2Array(o.getParam());

      if (null != o.getDocumentation()) {
        this.documentation = new String(o.getDocumentation());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

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
  public void setParam( java.util.List<String> value) {
    this.param = value;
  }
  public java.util.List<String> getParam() {
    return this.param;
  }
  public void set_param( java.util.List<Element> value) {
    this._param = value;
  }
  public java.util.List<Element> get_param() {
    return this._param;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void set_documentation( Element value) {
    this._documentation = value;
  }
  public Element get_documentation() {
    return this._documentation;
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
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("param" + "[" + String.valueOf(this.param) + "]\n"); 
     builder.append("_param" + "[" + String.valueOf(this._param) + "]\n"); 
     builder.append("documentation" + "[" + String.valueOf(this.documentation) + "]\n"); 
     builder.append("_documentation" + "[" + String.valueOf(this._documentation) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<CompartmentDefinitionResource> fromArray(java.util.List<CompartmentDefinitionResourceModel> list) {
    return (java.util.List<CompartmentDefinitionResource>)list.stream()
      .map(model -> new CompartmentDefinitionResource(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CompartmentDefinitionResourceModel> toModelArray(java.util.List<CompartmentDefinitionResource> list) {
    return (java.util.List<CompartmentDefinitionResourceModel>)list.stream()
      .map(model -> new CompartmentDefinitionResourceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CompartmentDefinitionResource fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CompartmentDefinitionResource.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CompartmentDefinitionResource o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CompartmentDefinitionResource> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}