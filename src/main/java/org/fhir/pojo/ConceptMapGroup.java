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
import org.fhir.entity.ConceptMapGroupModel;
import com.google.gson.GsonBuilder;

/**
* "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
*/
public class ConceptMapGroup  {
  /**
  * Description: "An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system)."
  */
  private String source;

  /**
  * Description: "Extensions for source"
  */
  private transient Element _source;

  /**
  * Description: "The specific version of the code system, as determined by the code system authority."
  */
  private String sourceVersion;

  /**
  * Description: "Extensions for sourceVersion"
  */
  private transient Element _sourceVersion;

  /**
  * Description: "An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems)."
  */
  private String target;

  /**
  * Description: "Extensions for target"
  */
  private transient Element _target;

  /**
  * Description: "The specific version of the code system, as determined by the code system authority."
  */
  private String targetVersion;

  /**
  * Description: "Extensions for targetVersion"
  */
  private transient Element _targetVersion;

  /**
  * Description: "Mappings for an individual concept in the source to one or more concepts in the target."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<ConceptMapElement> element = new java.util.ArrayList<>();

  /**
  * Description: "What to do when there is no match in the mappings in the group."
  */
  private ConceptMapUnmapped unmapped;

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

  public ConceptMapGroup() {
  }

  public ConceptMapGroup(ConceptMapGroupModel o) {
    this.id = o.getId();
      if (null != o.getSource()) {
        this.source = new String(o.getSource());
      }

      if (null != o.getSourceVersion()) {
        this.sourceVersion = new String(o.getSourceVersion());
      }

      if (null != o.getTarget()) {
        this.target = new String(o.getTarget());
      }

      if (null != o.getTargetVersion()) {
        this.targetVersion = new String(o.getTargetVersion());
      }

      this.element = ConceptMapElement.fromArray(o.getElement());

      if (null != o.getUnmapped()) {
        this.unmapped = new ConceptMapUnmapped(o.getUnmapped());
        this.unmapped.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSource( String value) {
    this.source = value;
  }
  public String getSource() {
    return this.source;
  }
  public void set_source( Element value) {
    this._source = value;
  }
  public Element get_source() {
    return this._source;
  }
  public void setSourceVersion( String value) {
    this.sourceVersion = value;
  }
  public String getSourceVersion() {
    return this.sourceVersion;
  }
  public void set_sourceVersion( Element value) {
    this._sourceVersion = value;
  }
  public Element get_sourceVersion() {
    return this._sourceVersion;
  }
  public void setTarget( String value) {
    this.target = value;
  }
  public String getTarget() {
    return this.target;
  }
  public void set_target( Element value) {
    this._target = value;
  }
  public Element get_target() {
    return this._target;
  }
  public void setTargetVersion( String value) {
    this.targetVersion = value;
  }
  public String getTargetVersion() {
    return this.targetVersion;
  }
  public void set_targetVersion( Element value) {
    this._targetVersion = value;
  }
  public Element get_targetVersion() {
    return this._targetVersion;
  }
  public void setElement( java.util.List<ConceptMapElement> value) {
    this.element = value;
  }
  public java.util.List<ConceptMapElement> getElement() {
    return this.element;
  }
  public void setUnmapped( ConceptMapUnmapped value) {
    this.unmapped = value;
  }
  public ConceptMapUnmapped getUnmapped() {
    return this.unmapped;
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
     builder.append("source" + "[" + String.valueOf(this.source) + "]\n"); 
     builder.append("_source" + "[" + String.valueOf(this._source) + "]\n"); 
     builder.append("sourceVersion" + "[" + String.valueOf(this.sourceVersion) + "]\n"); 
     builder.append("_sourceVersion" + "[" + String.valueOf(this._sourceVersion) + "]\n"); 
     builder.append("target" + "[" + String.valueOf(this.target) + "]\n"); 
     builder.append("_target" + "[" + String.valueOf(this._target) + "]\n"); 
     builder.append("targetVersion" + "[" + String.valueOf(this.targetVersion) + "]\n"); 
     builder.append("_targetVersion" + "[" + String.valueOf(this._targetVersion) + "]\n"); 
     builder.append("element" + "[" + String.valueOf(this.element) + "]\n"); 
     builder.append("unmapped" + "[" + String.valueOf(this.unmapped) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ConceptMapGroup> fromArray(java.util.List<ConceptMapGroupModel> list) {
    return (java.util.List<ConceptMapGroup>)list.stream()
      .map(model -> new ConceptMapGroup(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ConceptMapGroupModel> toModelArray(java.util.List<ConceptMapGroup> list) {
    return (java.util.List<ConceptMapGroupModel>)list.stream()
      .map(model -> new ConceptMapGroupModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ConceptMapGroup fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ConceptMapGroup.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ConceptMapGroup o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ConceptMapGroup> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}