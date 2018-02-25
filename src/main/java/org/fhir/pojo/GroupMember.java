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
import org.fhir.entity.GroupMemberModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GroupMember  extends BackboneElement  {
  /**
  * Description: "A reference to the entity that is a member of the group. Must be consistent with Group.type."
  */
  @javax.validation.constraints.NotNull
  protected Reference entity;

  /**
  * Description: "The period that the member was in the group, if known."
  */
  protected Period period;

  /**
  * Description: "A flag to indicate that the member is no longer in the group, but previously may have been a member."
  */
  protected Boolean inactive;

  /**
  * Description: "Extensions for inactive"
  */
  protected transient Element _inactive;

  public GroupMember() {
  }

  public GroupMember(GroupMemberModel o) {
    this.id = o.getId();
    if (null != o.getEntity() && !o.getEntity().isEmpty()) {
      this.entity = new Reference(o.getEntity().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getInactive()) {
      this.inactive = o.getInactive();
    }
  }

  public void setEntity( Reference value) {
    this.entity = value;
  }
  public Reference getEntity() {
    return this.entity;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setInactive( Boolean value) {
    this.inactive = value;
  }
  public Boolean getInactive() {
    return this.inactive;
  }
  public void set_inactive( Element value) {
    this._inactive = value;
  }
  public Element get_inactive() {
    return this._inactive;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[GroupMember]:" + "\n");
     if(this.entity != null) builder.append("entity" + "->" + this.entity.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.inactive != null) builder.append("inactive" + "->" + this.inactive.toString() + "\n"); 
     if(this._inactive != null) builder.append("_inactive" + "->" + this._inactive.toString() + "\n"); ;
    return builder.toString();
  }


}