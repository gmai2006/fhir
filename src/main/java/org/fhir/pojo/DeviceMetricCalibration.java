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
import org.fhir.entity.DeviceMetricCalibrationModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Describes a measurement, calculation or setting capability of a medical device."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceMetricCalibration  extends BackboneElement  {
  /**
  * Description: "Describes the type of the calibration method."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "Describes the state of the calibration."
  */
  protected String state;

  /**
  * Description: "Extensions for state"
  */
  protected transient Element _state;

  /**
  * Description: "Describes the time last calibration has been performed."
  */
  protected String time;

  /**
  * Description: "Extensions for time"
  */
  protected transient Element _time;

  public DeviceMetricCalibration() {
  }

  public DeviceMetricCalibration(DeviceMetricCalibrationModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getState()) {
      this.state = o.getState();
    }
    if (null != o.getTime()) {
      this.time = o.getTime();
    }
  }

  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setState( String value) {
    this.state = StateEnum.fromCode(value);
  }
  public String getState() {
    return this.state;
  }
  public void set_state( Element value) {
    this._state = value;
  }
  public Element get_state() {
    return this._state;
  }
  public void setTime( String value) {
    this.time = value;
  }
  public String getTime() {
    return this.time;
  }
  public void set_time( Element value) {
    this._time = value;
  }
  public Element get_time() {
    return this._time;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceMetricCalibration]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.state != null) builder.append("state" + "->" + this.state.toString() + "\n"); 
     if(this._state != null) builder.append("_state" + "->" + this._state.toString() + "\n"); 
     if(this.time != null) builder.append("time" + "->" + this.time.toString() + "\n"); 
     if(this._time != null) builder.append("_time" + "->" + this._time.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum TypeEnum {
  	unspecified,
  	offset,
  	gain,
  	twopoint,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "unspecified" : { return unspecified.toString(); }
  			case "offset" : { return offset.toString(); }
  			case "gain" : { return gain.toString(); }
  			case "twopoint" : { return twopoint.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum StateEnum {
  	notcalibrated,
  	calibrationrequired,
  	calibrated,
  	unspecified,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "notcalibrated" : { return notcalibrated.toString(); }
  			case "calibrationrequired" : { return calibrationrequired.toString(); }
  			case "calibrated" : { return calibrated.toString(); }
  			case "unspecified" : { return unspecified.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}