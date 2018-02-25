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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ConceptMapGroup  extends BackboneElement  {
  /**
  * Description: "An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system)."
  */
  protected String source;

  /**
  * Description: "Extensions for source"
  */
  protected transient Element _source;

  /**
  * Description: "The specific version of the code system, as determined by the code system authority."
  */
  protected String sourceVersion;

  /**
  * Description: "Extensions for sourceVersion"
  */
  protected transient Element _sourceVersion;

  /**
  * Description: "An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems)."
  */
  protected String target;

  /**
  * Description: "Extensions for target"
  */
  protected transient Element _target;

  /**
  * Description: "The specific version of the code system, as determined by the code system authority."
  */
  protected String targetVersion;

  /**
  * Description: "Extensions for targetVersion"
  */
  protected transient Element _targetVersion;

  /**
  * Description: "Mappings for an individual concept in the source to one or more concepts in the target."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<ConceptMapElement> element;

  /**
  * Description: "What to do when there is no match in the mappings in the group."
  */
  protected ConceptMapUnmapped unmapped;

  public ConceptMapGroup() {
  }

  public ConceptMapGroup(ConceptMapGroupModel o) {
    this.id = o.getId();
    if (null != o.getSource()) {
      this.source = o.getSource();
    }
    if (null != o.getSourceVersion()) {
      this.sourceVersion = o.getSourceVersion();
    }
    if (null != o.getTarget()) {
      this.target = o.getTarget();
    }
    if (null != o.getTargetVersion()) {
      this.targetVersion = o.getTargetVersion();
    }
    if (null != o.getElement() && !o.getElement().isEmpty()) {
    	this.element = ConceptMapElementHelper.fromArray2Array(o.getElement());
    }
    if (null != o.getUnmapped() && !o.getUnmapped().isEmpty()) {
      this.unmapped = new ConceptMapUnmapped(o.getUnmapped().get(0));
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ConceptMapGroup]:" + "\n");
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this._source != null) builder.append("_source" + "->" + this._source.toString() + "\n"); 
     if(this.sourceVersion != null) builder.append("sourceVersion" + "->" + this.sourceVersion.toString() + "\n"); 
     if(this._sourceVersion != null) builder.append("_sourceVersion" + "->" + this._sourceVersion.toString() + "\n"); 
     if(this.target != null) builder.append("target" + "->" + this.target.toString() + "\n"); 
     if(this._target != null) builder.append("_target" + "->" + this._target.toString() + "\n"); 
     if(this.targetVersion != null) builder.append("targetVersion" + "->" + this.targetVersion.toString() + "\n"); 
     if(this._targetVersion != null) builder.append("_targetVersion" + "->" + this._targetVersion.toString() + "\n"); 
     if(this.element != null) builder.append("element" + "->" + this.element.toString() + "\n"); 
     if(this.unmapped != null) builder.append("unmapped" + "->" + this.unmapped.toString() + "\n"); ;
    return builder.toString();
  }


}