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
import org.fhir.entity.CodingModel;
import com.google.gson.GsonBuilder;

/**
* "A reference to a code defined by a terminology system."
*/
public class Coding  extends Element  {
  /**
  * Description: "The identification of the code system that defines the meaning of the symbol in the code."
  */
  protected String system;

  /**
  * Description: "Extensions for system"
  */
  protected transient Element _system;

  /**
  * Description: "The version of the code system which was used when choosing this code. Note that a well-maintained code system does not need the version reported, because the meaning of codes is consistent across versions. However this cannot consistently be assured. and when the meaning is not guaranteed to be consistent, the version SHOULD be exchanged."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "A symbol in syntax defined by the system. The symbol may be a predefined code or an expression in a syntax defined by the coding system (e.g. post-coordination)."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String code;

  /**
  * Description: "Extensions for code"
  */
  protected transient Element _code;

  /**
  * Description: "A representation of the meaning of the code in the system, following the rules of the system."
  */
  protected String display;

  /**
  * Description: "Extensions for display"
  */
  protected transient Element _display;

  /**
  * Description: "Indicates that this coding was chosen by a user directly - i.e. off a pick list of available items (codes or displays)."
  */
  protected Boolean userSelected;

  /**
  * Description: "Extensions for userSelected"
  */
  protected transient Element _userSelected;

  public Coding() {
  }

  public Coding(CodingModel o) {
    this.id = o.getId();
    if (null != o.getSystem()) {
      this.system = o.getSystem();
    }
    if (null != o.getVersion()) {
      this.version = o.getVersion();
    }
    if (null != o.getCode()) {
      this.code = o.getCode();
    }
    if (null != o.getDisplay()) {
      this.display = o.getDisplay();
    }
    if (null != o.getUserSelected()) {
      this.userSelected = o.getUserSelected();
    }
  }

  public void setSystem( String value) {
    this.system = value;
  }
  public String getSystem() {
    return this.system;
  }
  public void set_system( Element value) {
    this._system = value;
  }
  public Element get_system() {
    return this._system;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void set_version( Element value) {
    this._version = value;
  }
  public Element get_version() {
    return this._version;
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
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void set_display( Element value) {
    this._display = value;
  }
  public Element get_display() {
    return this._display;
  }
  public void setUserSelected( Boolean value) {
    this.userSelected = value;
  }
  public Boolean getUserSelected() {
    return this.userSelected;
  }
  public void set_userSelected( Element value) {
    this._userSelected = value;
  }
  public Element get_userSelected() {
    return this._userSelected;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Coding]:" + "\n");
     if(this.system != null) builder.append("system" + "->" + this.system.toString() + "\n"); 
     if(this._system != null) builder.append("_system" + "->" + this._system.toString() + "\n"); 
     if(this.version != null) builder.append("version" + "->" + this.version.toString() + "\n"); 
     if(this._version != null) builder.append("_version" + "->" + this._version.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this._code != null) builder.append("_code" + "->" + this._code.toString() + "\n"); 
     if(this.display != null) builder.append("display" + "->" + this.display.toString() + "\n"); 
     if(this._display != null) builder.append("_display" + "->" + this._display.toString() + "\n"); 
     if(this.userSelected != null) builder.append("userSelected" + "->" + this.userSelected.toString() + "\n"); 
     if(this._userSelected != null) builder.append("_userSelected" + "->" + this._userSelected.toString() + "\n"); ;
    return builder.toString();
  }


}