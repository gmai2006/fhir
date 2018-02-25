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
import org.fhir.entity.MeasureReportModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The MeasureReport resource contains the results of evaluating a measure."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MeasureReport  extends DomainResource  {
  /**
  * Description: "This is a MeasureReport resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A formal identifier that is used to identify this report when it is represented in other formats, or referenced in a specification, model, design or an instance."
  */
  protected Identifier identifier;

  /**
  * Description: "The report status. No data will be available until the report status is complete."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The type of measure report. This may be an individual report, which provides a single patient's score for the measure; a patient listing, which returns the list of patients that meet the various criteria in the measure; or a summary report, which returns a population count for each of the criteria in the measure."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "A reference to the Measure that was evaluated to produce this report."
  */
  @javax.validation.constraints.NotNull
  protected Reference measure;

  /**
  * Description: "Optional Patient if the report was requested for a single patient."
  */
  protected Reference patient;

  /**
  * Description: "The date this measure report was generated."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String date;

  /**
  * Description: "Extensions for date"
  */
  protected transient Element _date;

  /**
  * Description: "Reporting Organization."
  */
  protected Reference reportingOrganization;

  /**
  * Description: "The reporting period for which the report was calculated."
  */
  @javax.validation.constraints.NotNull
  protected Period period;

  /**
  * Description: "The results of the calculation, one for each population group in the measure."
  */
  protected java.util.List<MeasureReportGroup> group;

  /**
  * Description: "A reference to a Bundle containing the Resources that were used in the evaluation of this report."
  */
  protected Reference evaluatedResources;

  public MeasureReport() {
  }

  public MeasureReport(MeasureReportModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getMeasure() && !o.getMeasure().isEmpty()) {
      this.measure = new Reference(o.getMeasure().get(0));
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getDate()) {
      this.date = o.getDate();
    }
    if (null != o.getReportingOrganization() && !o.getReportingOrganization().isEmpty()) {
      this.reportingOrganization = new Reference(o.getReportingOrganization().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getGroup() && !o.getGroup().isEmpty()) {
    	this.group = MeasureReportGroupHelper.fromArray2Array(o.getGroup());
    }
    if (null != o.getEvaluatedResources() && !o.getEvaluatedResources().isEmpty()) {
      this.evaluatedResources = new Reference(o.getEvaluatedResources().get(0));
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
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
  public void setMeasure( Reference value) {
    this.measure = value;
  }
  public Reference getMeasure() {
    return this.measure;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setDate( String value) {
    this.date = value;
  }
  public String getDate() {
    return this.date;
  }
  public void set_date( Element value) {
    this._date = value;
  }
  public Element get_date() {
    return this._date;
  }
  public void setReportingOrganization( Reference value) {
    this.reportingOrganization = value;
  }
  public Reference getReportingOrganization() {
    return this.reportingOrganization;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setGroup( java.util.List<MeasureReportGroup> value) {
    this.group = value;
  }
  public java.util.List<MeasureReportGroup> getGroup() {
    return this.group;
  }
  public void setEvaluatedResources( Reference value) {
    this.evaluatedResources = value;
  }
  public Reference getEvaluatedResources() {
    return this.evaluatedResources;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MeasureReport]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.measure != null) builder.append("measure" + "->" + this.measure.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.date != null) builder.append("date" + "->" + this.date.toString() + "\n"); 
     if(this._date != null) builder.append("_date" + "->" + this._date.toString() + "\n"); 
     if(this.reportingOrganization != null) builder.append("reportingOrganization" + "->" + this.reportingOrganization.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.group != null) builder.append("group" + "->" + this.group.toString() + "\n"); 
     if(this.evaluatedResources != null) builder.append("evaluatedResources" + "->" + this.evaluatedResources.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	MeasureReport,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "MeasureReport" : { return MeasureReport.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	complete,
  	pending,
  	error,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "complete" : { return complete.toString(); }
  			case "pending" : { return pending.toString(); }
  			case "error" : { return error.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum TypeEnum {
  	individual,
  	patientlist,
  	summary,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "individual" : { return individual.toString(); }
  			case "patientlist" : { return patientlist.toString(); }
  			case "summary" : { return summary.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}