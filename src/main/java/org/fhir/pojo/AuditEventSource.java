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
import org.fhir.entity.AuditEventSourceModel;
import com.google.gson.GsonBuilder;

/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
public class AuditEventSource  extends BackboneElement  {
  /**
  * Description: "Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group."
  */
  protected String site;

  /**
  * Description: "Extensions for site"
  */
  protected transient Element _site;

  /**
  * Description: "Identifier of the source where the event was detected."
  */
  @javax.validation.constraints.NotNull
  protected Identifier identifier;

  /**
  * Description: "Code specifying the type of source where event originated."
  */
  protected java.util.List<Coding> type = new java.util.ArrayList<>();

  public AuditEventSource() {
  }

  public AuditEventSource(AuditEventSourceModel o) {
    this.id = o.getId();
    if (null != o.getSite()) {
      this.site = o.getSite();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
  }

  public void setSite( String value) {
    this.site = value;
  }
  public String getSite() {
    return this.site;
  }
  public void set_site( Element value) {
    this._site = value;
  }
  public Element get_site() {
    return this._site;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setType( java.util.List<Coding> value) {
    this.type = value;
  }
  public java.util.List<Coding> getType() {
    return this.type;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventSource]:" + "\n");
     if(this.site != null) builder.append("site" + "->" + this.site.toString() + "\n"); 
     if(this._site != null) builder.append("_site" + "->" + this._site.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); ;
    return builder.toString();
  }


}