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
import org.fhir.entity.LocationPositionModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LocationPosition  extends BackboneElement  {
  /**
  * Description: "Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float longitude;

  /**
  * Description: "Extensions for longitude"
  */
  protected transient Element _longitude;

  /**
  * Description: "Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float latitude;

  /**
  * Description: "Extensions for latitude"
  */
  protected transient Element _latitude;

  /**
  * Description: "Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float altitude;

  /**
  * Description: "Extensions for altitude"
  */
  protected transient Element _altitude;

  public LocationPosition() {
  }

  public LocationPosition(LocationPositionModel o) {
    this.id = o.getId();
    if (null != o.getLongitude()) {
      this.longitude = o.getLongitude();
    }
    if (null != o.getLatitude()) {
      this.latitude = o.getLatitude();
    }
    if (null != o.getAltitude()) {
      this.altitude = o.getAltitude();
    }
  }

  public void setLongitude( Float value) {
    this.longitude = value;
  }
  public Float getLongitude() {
    return this.longitude;
  }
  public void set_longitude( Element value) {
    this._longitude = value;
  }
  public Element get_longitude() {
    return this._longitude;
  }
  public void setLatitude( Float value) {
    this.latitude = value;
  }
  public Float getLatitude() {
    return this.latitude;
  }
  public void set_latitude( Element value) {
    this._latitude = value;
  }
  public Element get_latitude() {
    return this._latitude;
  }
  public void setAltitude( Float value) {
    this.altitude = value;
  }
  public Float getAltitude() {
    return this.altitude;
  }
  public void set_altitude( Element value) {
    this._altitude = value;
  }
  public Element get_altitude() {
    return this._altitude;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[LocationPosition]:" + "\n");
     if(this.longitude != null) builder.append("longitude" + "->" + this.longitude.toString() + "\n"); 
     if(this._longitude != null) builder.append("_longitude" + "->" + this._longitude.toString() + "\n"); 
     if(this.latitude != null) builder.append("latitude" + "->" + this.latitude.toString() + "\n"); 
     if(this._latitude != null) builder.append("_latitude" + "->" + this._latitude.toString() + "\n"); 
     if(this.altitude != null) builder.append("altitude" + "->" + this.altitude.toString() + "\n"); 
     if(this._altitude != null) builder.append("_altitude" + "->" + this._altitude.toString() + "\n"); ;
    return builder.toString();
  }


}