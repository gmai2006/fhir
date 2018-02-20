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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "Raw data describing a biological sequence."
*/
@Entity
@Table(name="sequencequality")
public class SequenceQualityModel  implements Serializable {
	private static final long serialVersionUID = 151910893756574376L;
  /**
  * Description: "INDEL / SNP / Undefined variant."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "Gold standard sequence used for comparing against."
  */
  @javax.persistence.Basic
  @Column(name="\"standardsequence_id\"")
  private String standardsequence_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="standardsequence_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> standardSequence;

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
  */
  @javax.persistence.Basic
  @Column(name="\"score_id\"")
  private String score_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="score_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> score;

  /**
  * Description: "Which method is used to get sequence quality."
  */
  @javax.persistence.Basic
  @Column(name="\"method_id\"")
  private String method_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="method_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> method;

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
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public SequenceQualityModel() {
  }

  public SequenceQualityModel(SequenceQuality o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.type = o.getType();
    if (null != o.getStandardSequence() ) {
    	this.standardsequence_id = "standardsequence" + this.parent_id;
    	this.standardSequence = CodeableConceptHelper.toModel(o.getStandardSequence(), this.standardsequence_id);
    }
    this.start = o.getStart();
    this.end = o.getEnd();
    if (null != o.getScore() ) {
    	this.score_id = "score" + this.parent_id;
    	this.score = QuantityHelper.toModel(o.getScore(), this.score_id);
    }
    if (null != o.getMethod() ) {
    	this.method_id = "method" + this.parent_id;
    	this.method = CodeableConceptHelper.toModel(o.getMethod(), this.method_id);
    }
    this.truthTP = o.getTruthTP();
    this.queryTP = o.getQueryTP();
    this.truthFN = o.getTruthFN();
    this.queryFP = o.getQueryFP();
    this.gtFP = o.getGtFP();
    this.precision = o.getPrecision();
    this.recall = o.getRecall();
    this.fScore = o.getFScore();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public java.util.List<CodeableConceptModel> getStandardSequence() {
    return this.standardSequence;
  }
  public void setStandardSequence( java.util.List<CodeableConceptModel> value) {
    this.standardSequence = value;
  }
  public Float getStart() {
    return this.start;
  }
  public void setStart( Float value) {
    this.start = value;
  }
  public Float getEnd() {
    return this.end;
  }
  public void setEnd( Float value) {
    this.end = value;
  }
  public java.util.List<QuantityModel> getScore() {
    return this.score;
  }
  public void setScore( java.util.List<QuantityModel> value) {
    this.score = value;
  }
  public java.util.List<CodeableConceptModel> getMethod() {
    return this.method;
  }
  public void setMethod( java.util.List<CodeableConceptModel> value) {
    this.method = value;
  }
  public Float getTruthTP() {
    return this.truthTP;
  }
  public void setTruthTP( Float value) {
    this.truthTP = value;
  }
  public Float getQueryTP() {
    return this.queryTP;
  }
  public void setQueryTP( Float value) {
    this.queryTP = value;
  }
  public Float getTruthFN() {
    return this.truthFN;
  }
  public void setTruthFN( Float value) {
    this.truthFN = value;
  }
  public Float getQueryFP() {
    return this.queryFP;
  }
  public void setQueryFP( Float value) {
    this.queryFP = value;
  }
  public Float getGtFP() {
    return this.gtFP;
  }
  public void setGtFP( Float value) {
    this.gtFP = value;
  }
  public Float getPrecision() {
    return this.precision;
  }
  public void setPrecision( Float value) {
    this.precision = value;
  }
  public Float getRecall() {
    return this.recall;
  }
  public void setRecall( Float value) {
    this.recall = value;
  }
  public Float getFScore() {
    return this.fScore;
  }
  public void setFScore( Float value) {
    this.fScore = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SequenceQualityModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("end" + "->" + this.end + "\n"); 
     builder.append("truthTP" + "->" + this.truthTP + "\n"); 
     builder.append("queryTP" + "->" + this.queryTP + "\n"); 
     builder.append("truthFN" + "->" + this.truthFN + "\n"); 
     builder.append("queryFP" + "->" + this.queryFP + "\n"); 
     builder.append("gtFP" + "->" + this.gtFP + "\n"); 
     builder.append("precision" + "->" + this.precision + "\n"); 
     builder.append("recall" + "->" + this.recall + "\n"); 
     builder.append("fScore" + "->" + this.fScore + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SequenceQualityModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("standardSequence" + "->" + this.standardSequence + "\n"); 
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("end" + "->" + this.end + "\n"); 
     builder.append("score" + "->" + this.score + "\n"); 
     builder.append("method" + "->" + this.method + "\n"); 
     builder.append("truthTP" + "->" + this.truthTP + "\n"); 
     builder.append("queryTP" + "->" + this.queryTP + "\n"); 
     builder.append("truthFN" + "->" + this.truthFN + "\n"); 
     builder.append("queryFP" + "->" + this.queryFP + "\n"); 
     builder.append("gtFP" + "->" + this.gtFP + "\n"); 
     builder.append("precision" + "->" + this.precision + "\n"); 
     builder.append("recall" + "->" + this.recall + "\n"); 
     builder.append("fScore" + "->" + this.fScore + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}