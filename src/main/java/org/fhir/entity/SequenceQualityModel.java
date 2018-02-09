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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;

/**
* "Raw data describing a biological sequence."
*/
@Entity
@Table(name="sequencequality")
public class SequenceQualityModel  {
  /**
  * Description: "INDEL / SNP / Undefined variant."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "Gold standard sequence used for comparing against."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"standardSequence\"", length = 16777215)
  private String standardSequence;

  /**
  * Description: "Start position of the sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"start\"")
  private Float start;

  /**
  * Description: "End position of the sequence.If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"end\"")
  private Float end;

  /**
  * Description: "The score of an experimentally derived feature such as a p-value ([SO:0001685](http://www.sequenceontology.org/browser/current_svn/term/SO:0001685))."
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"score\"", length = 16777215)
  private String score;

  /**
  * Description: "Which method is used to get sequence quality."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"method\"", length = 16777215)
  private String method;

  /**
  * Description: "True positives, from the perspective of the truth data, i.e. the number of sites in the Truth Call Set for which there are paths through the Query Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"truthTP\"")
  private Float truthTP;

  /**
  * Description: "True positives, from the perspective of the query data, i.e. the number of sites in the Query Call Set for which there are paths through the Truth Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"queryTP\"")
  private Float queryTP;

  /**
  * Description: "False negatives, i.e. the number of sites in the Truth Call Set for which there is no path through the Query Call Set that is consistent with all of the alleles at this site, or sites for which there is an inaccurate genotype call for the event. Sites with correct variant but incorrect genotype are counted here."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"truthFN\"")
  private Float truthFN;

  /**
  * Description: "False positives, i.e. the number of sites in the Query Call Set for which there is no path through the Truth Call Set that is consistent with this site. Sites with correct variant but incorrect genotype are counted here."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"queryFP\"")
  private Float queryFP;

  /**
  * Description: "The number of false positives where the non-REF alleles in the Truth and Query Call Sets match (i.e. cases where the truth is 1/1 and the query is 0/1 or similar)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"gtFP\"")
  private Float gtFP;

  /**
  * Description: "QUERY.TP / (QUERY.TP + QUERY.FP)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"precision\"")
  private Float precision;

  /**
  * Description: "TRUTH.TP / (TRUTH.TP + TRUTH.FN)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"recall\"")
  private Float recall;

  /**
  * Description: "Harmonic mean of Recall and Precision, computed as: 2 * precision * recall / (precision + recall)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"fScore\"")
  private Float fScore;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public SequenceQualityModel() {
  }

  public SequenceQualityModel(SequenceQuality o) {
    this.id = o.getId();
      this.type = o.getType();

      this.standardSequence = CodeableConcept.toJson(o.getStandardSequence());
      this.start = o.getStart();

      this.end = o.getEnd();

      this.score = Quantity.toJson(o.getScore());
      this.method = CodeableConcept.toJson(o.getMethod());
      this.truthTP = o.getTruthTP();

      this.queryTP = o.getQueryTP();

      this.truthFN = o.getTruthFN();

      this.queryFP = o.getQueryFP();

      this.gtFP = o.getGtFP();

      this.precision = o.getPrecision();

      this.recall = o.getRecall();

      this.fScore = o.getFScore();

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setStandardSequence( String value) {
    this.standardSequence = value;
  }
  public String getStandardSequence() {
    return this.standardSequence;
  }
  public void setStart( Float value) {
    this.start = value;
  }
  public Float getStart() {
    return this.start;
  }
  public void setEnd( Float value) {
    this.end = value;
  }
  public Float getEnd() {
    return this.end;
  }
  public void setScore( String value) {
    this.score = value;
  }
  public String getScore() {
    return this.score;
  }
  public void setMethod( String value) {
    this.method = value;
  }
  public String getMethod() {
    return this.method;
  }
  public void setTruthTP( Float value) {
    this.truthTP = value;
  }
  public Float getTruthTP() {
    return this.truthTP;
  }
  public void setQueryTP( Float value) {
    this.queryTP = value;
  }
  public Float getQueryTP() {
    return this.queryTP;
  }
  public void setTruthFN( Float value) {
    this.truthFN = value;
  }
  public Float getTruthFN() {
    return this.truthFN;
  }
  public void setQueryFP( Float value) {
    this.queryFP = value;
  }
  public Float getQueryFP() {
    return this.queryFP;
  }
  public void setGtFP( Float value) {
    this.gtFP = value;
  }
  public Float getGtFP() {
    return this.gtFP;
  }
  public void setPrecision( Float value) {
    this.precision = value;
  }
  public Float getPrecision() {
    return this.precision;
  }
  public void setRecall( Float value) {
    this.recall = value;
  }
  public Float getRecall() {
    return this.recall;
  }
  public void setFScore( Float value) {
    this.fScore = value;
  }
  public Float getFScore() {
    return this.fScore;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("standardSequence" + "[" + String.valueOf(this.standardSequence) + "]\n"); 
     builder.append("start" + "[" + String.valueOf(this.start) + "]\n"); 
     builder.append("end" + "[" + String.valueOf(this.end) + "]\n"); 
     builder.append("score" + "[" + String.valueOf(this.score) + "]\n"); 
     builder.append("method" + "[" + String.valueOf(this.method) + "]\n"); 
     builder.append("truthTP" + "[" + String.valueOf(this.truthTP) + "]\n"); 
     builder.append("queryTP" + "[" + String.valueOf(this.queryTP) + "]\n"); 
     builder.append("truthFN" + "[" + String.valueOf(this.truthFN) + "]\n"); 
     builder.append("queryFP" + "[" + String.valueOf(this.queryFP) + "]\n"); 
     builder.append("gtFP" + "[" + String.valueOf(this.gtFP) + "]\n"); 
     builder.append("precision" + "[" + String.valueOf(this.precision) + "]\n"); 
     builder.append("recall" + "[" + String.valueOf(this.recall) + "]\n"); 
     builder.append("fScore" + "[" + String.valueOf(this.fScore) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}