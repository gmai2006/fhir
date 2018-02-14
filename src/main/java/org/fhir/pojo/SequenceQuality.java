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
import org.fhir.entity.SequenceQualityModel;
import com.google.gson.GsonBuilder;

/**
* "Raw data describing a biological sequence."
*/
public class SequenceQuality  {
  /**
  * Description: "INDEL / SNP / Undefined variant."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "Gold standard sequence used for comparing against."
  */
  private CodeableConcept standardSequence;

  /**
  * Description: "Start position of the sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float start;

  /**
  * Description: "Extensions for start"
  */
  private transient Element _start;

  /**
  * Description: "End position of the sequence.If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float end;

  /**
  * Description: "Extensions for end"
  */
  private transient Element _end;

  /**
  * Description: "The score of an experimentally derived feature such as a p-value ([SO:0001685](http://www.sequenceontology.org/browser/current_svn/term/SO:0001685))."
  */
  private Quantity score;

  /**
  * Description: "Which method is used to get sequence quality."
  */
  private CodeableConcept method;

  /**
  * Description: "True positives, from the perspective of the truth data, i.e. the number of sites in the Truth Call Set for which there are paths through the Query Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float truthTP;

  /**
  * Description: "Extensions for truthTP"
  */
  private transient Element _truthTP;

  /**
  * Description: "True positives, from the perspective of the query data, i.e. the number of sites in the Query Call Set for which there are paths through the Truth Call Set that are consistent with all of the alleles at this site, and for which there is an accurate genotype call for the event."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float queryTP;

  /**
  * Description: "Extensions for queryTP"
  */
  private transient Element _queryTP;

  /**
  * Description: "False negatives, i.e. the number of sites in the Truth Call Set for which there is no path through the Query Call Set that is consistent with all of the alleles at this site, or sites for which there is an inaccurate genotype call for the event. Sites with correct variant but incorrect genotype are counted here."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float truthFN;

  /**
  * Description: "Extensions for truthFN"
  */
  private transient Element _truthFN;

  /**
  * Description: "False positives, i.e. the number of sites in the Query Call Set for which there is no path through the Truth Call Set that is consistent with this site. Sites with correct variant but incorrect genotype are counted here."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float queryFP;

  /**
  * Description: "Extensions for queryFP"
  */
  private transient Element _queryFP;

  /**
  * Description: "The number of false positives where the non-REF alleles in the Truth and Query Call Sets match (i.e. cases where the truth is 1/1 and the query is 0/1 or similar)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float gtFP;

  /**
  * Description: "Extensions for gtFP"
  */
  private transient Element _gtFP;

  /**
  * Description: "QUERY.TP / (QUERY.TP + QUERY.FP)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float precision;

  /**
  * Description: "Extensions for precision"
  */
  private transient Element _precision;

  /**
  * Description: "TRUTH.TP / (TRUTH.TP + TRUTH.FN)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float recall;

  /**
  * Description: "Extensions for recall"
  */
  private transient Element _recall;

  /**
  * Description: "Harmonic mean of Recall and Precision, computed as: 2 * precision * recall / (precision + recall)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float fScore;

  /**
  * Description: "Extensions for fScore"
  */
  private transient Element _fScore;

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
  @javax.validation.constraints.NotNull
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

  public SequenceQuality() {
  }

  public SequenceQuality(SequenceQualityModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    this.standardSequence = CodeableConceptHelper.fromJson(o.getStandardSequence());
    if (null != o.getStart()) {
      this.start = o.getStart();
    }
    if (null != o.getEnd()) {
      this.end = o.getEnd();
    }
    this.score = QuantityHelper.fromJson(o.getScore());
    this.method = CodeableConceptHelper.fromJson(o.getMethod());
    if (null != o.getTruthTP()) {
      this.truthTP = o.getTruthTP();
    }
    if (null != o.getQueryTP()) {
      this.queryTP = o.getQueryTP();
    }
    if (null != o.getTruthFN()) {
      this.truthFN = o.getTruthFN();
    }
    if (null != o.getQueryFP()) {
      this.queryFP = o.getQueryFP();
    }
    if (null != o.getGtFP()) {
      this.gtFP = o.getGtFP();
    }
    if (null != o.getPrecision()) {
      this.precision = o.getPrecision();
    }
    if (null != o.getRecall()) {
      this.recall = o.getRecall();
    }
    if (null != o.getFScore()) {
      this.fScore = o.getFScore();
    }
    if (null != o.getId()) {
      this.id = o.getId();
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
  public void setStandardSequence( CodeableConcept value) {
    this.standardSequence = value;
  }
  public CodeableConcept getStandardSequence() {
    return this.standardSequence;
  }
  public void setStart( Float value) {
    this.start = value;
  }
  public Float getStart() {
    return this.start;
  }
  public void set_start( Element value) {
    this._start = value;
  }
  public Element get_start() {
    return this._start;
  }
  public void setEnd( Float value) {
    this.end = value;
  }
  public Float getEnd() {
    return this.end;
  }
  public void set_end( Element value) {
    this._end = value;
  }
  public Element get_end() {
    return this._end;
  }
  public void setScore( Quantity value) {
    this.score = value;
  }
  public Quantity getScore() {
    return this.score;
  }
  public void setMethod( CodeableConcept value) {
    this.method = value;
  }
  public CodeableConcept getMethod() {
    return this.method;
  }
  public void setTruthTP( Float value) {
    this.truthTP = value;
  }
  public Float getTruthTP() {
    return this.truthTP;
  }
  public void set_truthTP( Element value) {
    this._truthTP = value;
  }
  public Element get_truthTP() {
    return this._truthTP;
  }
  public void setQueryTP( Float value) {
    this.queryTP = value;
  }
  public Float getQueryTP() {
    return this.queryTP;
  }
  public void set_queryTP( Element value) {
    this._queryTP = value;
  }
  public Element get_queryTP() {
    return this._queryTP;
  }
  public void setTruthFN( Float value) {
    this.truthFN = value;
  }
  public Float getTruthFN() {
    return this.truthFN;
  }
  public void set_truthFN( Element value) {
    this._truthFN = value;
  }
  public Element get_truthFN() {
    return this._truthFN;
  }
  public void setQueryFP( Float value) {
    this.queryFP = value;
  }
  public Float getQueryFP() {
    return this.queryFP;
  }
  public void set_queryFP( Element value) {
    this._queryFP = value;
  }
  public Element get_queryFP() {
    return this._queryFP;
  }
  public void setGtFP( Float value) {
    this.gtFP = value;
  }
  public Float getGtFP() {
    return this.gtFP;
  }
  public void set_gtFP( Element value) {
    this._gtFP = value;
  }
  public Element get_gtFP() {
    return this._gtFP;
  }
  public void setPrecision( Float value) {
    this.precision = value;
  }
  public Float getPrecision() {
    return this.precision;
  }
  public void set_precision( Element value) {
    this._precision = value;
  }
  public Element get_precision() {
    return this._precision;
  }
  public void setRecall( Float value) {
    this.recall = value;
  }
  public Float getRecall() {
    return this.recall;
  }
  public void set_recall( Element value) {
    this._recall = value;
  }
  public Element get_recall() {
    return this._recall;
  }
  public void setFScore( Float value) {
    this.fScore = value;
  }
  public Float getFScore() {
    return this.fScore;
  }
  public void set_fScore( Element value) {
    this._fScore = value;
  }
  public Element get_fScore() {
    return this._fScore;
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
    builder.append("[SequenceQuality]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.standardSequence != null) builder.append("standardSequence" + "->" + this.standardSequence.toString() + "\n"); 
     if(this.start != null) builder.append("start" + "->" + this.start.toString() + "\n"); 
     if(this._start != null) builder.append("_start" + "->" + this._start.toString() + "\n"); 
     if(this.end != null) builder.append("end" + "->" + this.end.toString() + "\n"); 
     if(this._end != null) builder.append("_end" + "->" + this._end.toString() + "\n"); 
     if(this.score != null) builder.append("score" + "->" + this.score.toString() + "\n"); 
     if(this.method != null) builder.append("method" + "->" + this.method.toString() + "\n"); 
     if(this.truthTP != null) builder.append("truthTP" + "->" + this.truthTP.toString() + "\n"); 
     if(this._truthTP != null) builder.append("_truthTP" + "->" + this._truthTP.toString() + "\n"); 
     if(this.queryTP != null) builder.append("queryTP" + "->" + this.queryTP.toString() + "\n"); 
     if(this._queryTP != null) builder.append("_queryTP" + "->" + this._queryTP.toString() + "\n"); 
     if(this.truthFN != null) builder.append("truthFN" + "->" + this.truthFN.toString() + "\n"); 
     if(this._truthFN != null) builder.append("_truthFN" + "->" + this._truthFN.toString() + "\n"); 
     if(this.queryFP != null) builder.append("queryFP" + "->" + this.queryFP.toString() + "\n"); 
     if(this._queryFP != null) builder.append("_queryFP" + "->" + this._queryFP.toString() + "\n"); 
     if(this.gtFP != null) builder.append("gtFP" + "->" + this.gtFP.toString() + "\n"); 
     if(this._gtFP != null) builder.append("_gtFP" + "->" + this._gtFP.toString() + "\n"); 
     if(this.precision != null) builder.append("precision" + "->" + this.precision.toString() + "\n"); 
     if(this._precision != null) builder.append("_precision" + "->" + this._precision.toString() + "\n"); 
     if(this.recall != null) builder.append("recall" + "->" + this.recall.toString() + "\n"); 
     if(this._recall != null) builder.append("_recall" + "->" + this._recall.toString() + "\n"); 
     if(this.fScore != null) builder.append("fScore" + "->" + this.fScore.toString() + "\n"); 
     if(this._fScore != null) builder.append("_fScore" + "->" + this._fScore.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	indel,
  	snp,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "indel" : { return indel.toString(); }
  			case "snp" : { return snp.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}