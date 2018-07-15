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
import org.fhir.entity.ImagingManifestInstanceModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ImagingManifestInstance  extends BackboneElement  {
  /**
  * Description: "SOP class UID of the selected instance."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String sopClass;

  /**
  * Description: "Extensions for sopClass"
  */
  protected transient Element _sopClass;

  /**
  * Description: "SOP Instance UID of the selected instance."
  */
  @javax.validation.constraints.Pattern(regexp="urn:oid:(0|[1-9][0-9]*)(\\.(0|[1-9][0-9]*))*")
  protected String uid;

  /**
  * Description: "Extensions for uid"
  */
  protected transient Element _uid;

  public ImagingManifestInstance() {
  }

  public ImagingManifestInstance(ImagingManifestInstanceModel o) {
    this.id = o.getId();
    if (null != o.getSopClass()) {
      this.sopClass = o.getSopClass();
    }
    if (null != o.getUid()) {
      this.uid = o.getUid();
    }
  }

  public void setSopClass( String value) {
    this.sopClass = value;
  }
  public String getSopClass() {
    return this.sopClass;
  }
  public void set_sopClass( Element value) {
    this._sopClass = value;
  }
  public Element get_sopClass() {
    return this._sopClass;
  }
  public void setUid( String value) {
    this.uid = value;
  }
  public String getUid() {
    return this.uid;
  }
  public void set_uid( Element value) {
    this._uid = value;
  }
  public Element get_uid() {
    return this._uid;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImagingManifestInstance]:" + "\n");
     if(this.sopClass != null) builder.append("sopClass" + "->" + this.sopClass.toString() + "\n"); 
     if(this._sopClass != null) builder.append("_sopClass" + "->" + this._sopClass.toString() + "\n"); 
     if(this.uid != null) builder.append("uid" + "->" + this.uid.toString() + "\n"); 
     if(this._uid != null) builder.append("_uid" + "->" + this._uid.toString() + "\n"); ;
    return builder.toString();
  }


}