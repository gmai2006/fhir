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
import com.google.gson.GsonBuilder;

/**
* "Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated."
*/
public class LocationPosition  {
  /**
  * Description: "Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float longitude;

  /**
  * Description: "Extensions for longitude"
  */
  private transient Element _longitude;

  /**
  * Description: "Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float latitude;

  /**
  * Description: "Extensions for latitude"
  */
  private transient Element _latitude;

  /**
  * Description: "Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float altitude;

  /**
  * Description: "Extensions for altitude"
  */
  private transient Element _altitude;

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

  public LocationPosition() {
  }

  public LocationPosition(LocationPositionModel o) {
    this.id = o.getId();
      if (null != o.getLongitude()) {
        this.longitude = new Float(o.getLongitude());
      }

      if (null != o.getLatitude()) {
        this.latitude = new Float(o.getLatitude());
      }

      if (null != o.getAltitude()) {
        this.altitude = new Float(o.getAltitude());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("longitude" + "[" + String.valueOf(this.longitude) + "]\n"); 
     builder.append("_longitude" + "[" + String.valueOf(this._longitude) + "]\n"); 
     builder.append("latitude" + "[" + String.valueOf(this.latitude) + "]\n"); 
     builder.append("_latitude" + "[" + String.valueOf(this._latitude) + "]\n"); 
     builder.append("altitude" + "[" + String.valueOf(this.altitude) + "]\n"); 
     builder.append("_altitude" + "[" + String.valueOf(this._altitude) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<LocationPosition> fromArray(java.util.List<LocationPositionModel> list) {
    return (java.util.List<LocationPosition>)list.stream()
      .map(model -> new LocationPosition(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<LocationPositionModel> toModelArray(java.util.List<LocationPosition> list) {
    return (java.util.List<LocationPositionModel>)list.stream()
      .map(model -> new LocationPositionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static LocationPosition fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, LocationPosition.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(LocationPosition o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<LocationPosition> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}