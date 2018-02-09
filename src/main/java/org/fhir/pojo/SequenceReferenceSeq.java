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
import org.fhir.entity.SequenceReferenceSeqModel;
import com.google.gson.GsonBuilder;

/**
* "Raw data describing a biological sequence."
*/
public class SequenceReferenceSeq  {
  /**
  * Description: "Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340))."
  */
  private CodeableConcept chromosome;

  /**
  * Description: "The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used."
  */
  private String genomeBuild;

  /**
  * Description: "Extensions for genomeBuild"
  */
  private transient Element _genomeBuild;

  /**
  * Description: "Reference identifier of reference sequence submitted to NCBI. It must match the type in the Sequence.type field. For example, the prefix, “NG_” identifies reference sequence for genes, “NM_” for messenger RNA transcripts, and “NP_” for amino acid sequences."
  */
  private CodeableConcept referenceSeqId;

  /**
  * Description: "A Pointer to another Sequence entity as reference sequence."
  */
  private Reference referenceSeqPointer;

  /**
  * Description: "A string like \"ACGT\"."
  */
  private String referenceSeqString;

  /**
  * Description: "Extensions for referenceSeqString"
  */
  private transient Element _referenceSeqString;

  /**
  * Description: "Directionality of DNA sequence. Available values are \"1\" for the plus strand (5' to 3')/Watson/Sense/positive  and \"-1\" for the minus strand(3' to 5')/Crick/Antisense/negative."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float strand;

  /**
  * Description: "Extensions for strand"
  */
  private transient Element _strand;

  /**
  * Description: "Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float windowStart;

  /**
  * Description: "Extensions for windowStart"
  */
  private transient Element _windowStart;

  /**
  * Description: "End position of the window on the reference sequence. If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float windowEnd;

  /**
  * Description: "Extensions for windowEnd"
  */
  private transient Element _windowEnd;

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

  public SequenceReferenceSeq() {
  }

  public SequenceReferenceSeq(SequenceReferenceSeqModel o) {
    this.id = o.getId();
      this.chromosome = CodeableConcept.fromJson(o.getChromosome());
      if (null != o.getGenomeBuild()) {
        this.genomeBuild = new String(o.getGenomeBuild());
      }

      this.referenceSeqId = CodeableConcept.fromJson(o.getReferenceSeqId());
      if (null != o.getReferenceSeqPointer()) {
        this.referenceSeqPointer = new Reference(o.getReferenceSeqPointer());
        this.referenceSeqPointer.setId(this.getId());
      }

      if (null != o.getReferenceSeqString()) {
        this.referenceSeqString = new String(o.getReferenceSeqString());
      }

      if (null != o.getStrand()) {
        this.strand = new Float(o.getStrand());
      }

      if (null != o.getWindowStart()) {
        this.windowStart = new Float(o.getWindowStart());
      }

      if (null != o.getWindowEnd()) {
        this.windowEnd = new Float(o.getWindowEnd());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setChromosome( CodeableConcept value) {
    this.chromosome = value;
  }
  public CodeableConcept getChromosome() {
    return this.chromosome;
  }
  public void setGenomeBuild( String value) {
    this.genomeBuild = value;
  }
  public String getGenomeBuild() {
    return this.genomeBuild;
  }
  public void set_genomeBuild( Element value) {
    this._genomeBuild = value;
  }
  public Element get_genomeBuild() {
    return this._genomeBuild;
  }
  public void setReferenceSeqId( CodeableConcept value) {
    this.referenceSeqId = value;
  }
  public CodeableConcept getReferenceSeqId() {
    return this.referenceSeqId;
  }
  public void setReferenceSeqPointer( Reference value) {
    this.referenceSeqPointer = value;
  }
  public Reference getReferenceSeqPointer() {
    return this.referenceSeqPointer;
  }
  public void setReferenceSeqString( String value) {
    this.referenceSeqString = value;
  }
  public String getReferenceSeqString() {
    return this.referenceSeqString;
  }
  public void set_referenceSeqString( Element value) {
    this._referenceSeqString = value;
  }
  public Element get_referenceSeqString() {
    return this._referenceSeqString;
  }
  public void setStrand( Float value) {
    this.strand = value;
  }
  public Float getStrand() {
    return this.strand;
  }
  public void set_strand( Element value) {
    this._strand = value;
  }
  public Element get_strand() {
    return this._strand;
  }
  public void setWindowStart( Float value) {
    this.windowStart = value;
  }
  public Float getWindowStart() {
    return this.windowStart;
  }
  public void set_windowStart( Element value) {
    this._windowStart = value;
  }
  public Element get_windowStart() {
    return this._windowStart;
  }
  public void setWindowEnd( Float value) {
    this.windowEnd = value;
  }
  public Float getWindowEnd() {
    return this.windowEnd;
  }
  public void set_windowEnd( Element value) {
    this._windowEnd = value;
  }
  public Element get_windowEnd() {
    return this._windowEnd;
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
     builder.append("chromosome" + "[" + String.valueOf(this.chromosome) + "]\n"); 
     builder.append("genomeBuild" + "[" + String.valueOf(this.genomeBuild) + "]\n"); 
     builder.append("_genomeBuild" + "[" + String.valueOf(this._genomeBuild) + "]\n"); 
     builder.append("referenceSeqId" + "[" + String.valueOf(this.referenceSeqId) + "]\n"); 
     builder.append("referenceSeqPointer" + "[" + String.valueOf(this.referenceSeqPointer) + "]\n"); 
     builder.append("referenceSeqString" + "[" + String.valueOf(this.referenceSeqString) + "]\n"); 
     builder.append("_referenceSeqString" + "[" + String.valueOf(this._referenceSeqString) + "]\n"); 
     builder.append("strand" + "[" + String.valueOf(this.strand) + "]\n"); 
     builder.append("_strand" + "[" + String.valueOf(this._strand) + "]\n"); 
     builder.append("windowStart" + "[" + String.valueOf(this.windowStart) + "]\n"); 
     builder.append("_windowStart" + "[" + String.valueOf(this._windowStart) + "]\n"); 
     builder.append("windowEnd" + "[" + String.valueOf(this.windowEnd) + "]\n"); 
     builder.append("_windowEnd" + "[" + String.valueOf(this._windowEnd) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<SequenceReferenceSeq> fromArray(java.util.List<SequenceReferenceSeqModel> list) {
    return (java.util.List<SequenceReferenceSeq>)list.stream()
      .map(model -> new SequenceReferenceSeq(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<SequenceReferenceSeqModel> toModelArray(java.util.List<SequenceReferenceSeq> list) {
    return (java.util.List<SequenceReferenceSeqModel>)list.stream()
      .map(model -> new SequenceReferenceSeqModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static SequenceReferenceSeq fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, SequenceReferenceSeq.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(SequenceReferenceSeq o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<SequenceReferenceSeq> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}