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
        this.type = new String(o.getType());
      }

      this.standardSequence = CodeableConcept.fromJson(o.getStandardSequence());
      if (null != o.getStart()) {
        this.start = new Float(o.getStart());
      }

      if (null != o.getEnd()) {
        this.end = new Float(o.getEnd());
      }

      this.score = Quantity.fromJson(o.getScore());
      this.method = CodeableConcept.fromJson(o.getMethod());
      if (null != o.getTruthTP()) {
        this.truthTP = new Float(o.getTruthTP());
      }

      if (null != o.getQueryTP()) {
        this.queryTP = new Float(o.getQueryTP());
      }

      if (null != o.getTruthFN()) {
        this.truthFN = new Float(o.getTruthFN());
      }

      if (null != o.getQueryFP()) {
        this.queryFP = new Float(o.getQueryFP());
      }

      if (null != o.getGtFP()) {
        this.gtFP = new Float(o.getGtFP());
      }

      if (null != o.getPrecision()) {
        this.precision = new Float(o.getPrecision());
      }

      if (null != o.getRecall()) {
        this.recall = new Float(o.getRecall());
      }

      if (null != o.getFScore()) {
        this.fScore = new Float(o.getFScore());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("standardSequence" + "[" + String.valueOf(this.standardSequence) + "]\n"); 
     builder.append("start" + "[" + String.valueOf(this.start) + "]\n"); 
     builder.append("_start" + "[" + String.valueOf(this._start) + "]\n"); 
     builder.append("end" + "[" + String.valueOf(this.end) + "]\n"); 
     builder.append("_end" + "[" + String.valueOf(this._end) + "]\n"); 
     builder.append("score" + "[" + String.valueOf(this.score) + "]\n"); 
     builder.append("method" + "[" + String.valueOf(this.method) + "]\n"); 
     builder.append("truthTP" + "[" + String.valueOf(this.truthTP) + "]\n"); 
     builder.append("_truthTP" + "[" + String.valueOf(this._truthTP) + "]\n"); 
     builder.append("queryTP" + "[" + String.valueOf(this.queryTP) + "]\n"); 
     builder.append("_queryTP" + "[" + String.valueOf(this._queryTP) + "]\n"); 
     builder.append("truthFN" + "[" + String.valueOf(this.truthFN) + "]\n"); 
     builder.append("_truthFN" + "[" + String.valueOf(this._truthFN) + "]\n"); 
     builder.append("queryFP" + "[" + String.valueOf(this.queryFP) + "]\n"); 
     builder.append("_queryFP" + "[" + String.valueOf(this._queryFP) + "]\n"); 
     builder.append("gtFP" + "[" + String.valueOf(this.gtFP) + "]\n"); 
     builder.append("_gtFP" + "[" + String.valueOf(this._gtFP) + "]\n"); 
     builder.append("precision" + "[" + String.valueOf(this.precision) + "]\n"); 
     builder.append("_precision" + "[" + String.valueOf(this._precision) + "]\n"); 
     builder.append("recall" + "[" + String.valueOf(this.recall) + "]\n"); 
     builder.append("_recall" + "[" + String.valueOf(this._recall) + "]\n"); 
     builder.append("fScore" + "[" + String.valueOf(this.fScore) + "]\n"); 
     builder.append("_fScore" + "[" + String.valueOf(this._fScore) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
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

  public static java.util.List<SequenceQuality> fromArray(java.util.List<SequenceQualityModel> list) {
    return (java.util.List<SequenceQuality>)list.stream()
      .map(model -> new SequenceQuality(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<SequenceQualityModel> toModelArray(java.util.List<SequenceQuality> list) {
    return (java.util.List<SequenceQualityModel>)list.stream()
      .map(model -> new SequenceQualityModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static SequenceQuality fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, SequenceQuality.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(SequenceQuality o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<SequenceQuality> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}