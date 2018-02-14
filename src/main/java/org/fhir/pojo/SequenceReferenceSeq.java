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

  public SequenceReferenceSeq() {
  }

  public SequenceReferenceSeq(SequenceReferenceSeqModel o) {
    this.id = o.getId();
    this.chromosome = CodeableConceptHelper.fromJson(o.getChromosome());
    if (null != o.getGenomeBuild()) {
      this.genomeBuild = o.getGenomeBuild();
    }
    this.referenceSeqId = CodeableConceptHelper.fromJson(o.getReferenceSeqId());
    if (null != o.getReferenceSeqPointer() && !o.getReferenceSeqPointer().isEmpty()) {
      this.referenceSeqPointer = new Reference(o.getReferenceSeqPointer().get(0));
    }
    if (null != o.getReferenceSeqString()) {
      this.referenceSeqString = o.getReferenceSeqString();
    }
    if (null != o.getStrand()) {
      this.strand = o.getStrand();
    }
    if (null != o.getWindowStart()) {
      this.windowStart = o.getWindowStart();
    }
    if (null != o.getWindowEnd()) {
      this.windowEnd = o.getWindowEnd();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[SequenceReferenceSeq]:" + "\n");
     if(this.chromosome != null) builder.append("chromosome" + "->" + this.chromosome.toString() + "\n"); 
     if(this.genomeBuild != null) builder.append("genomeBuild" + "->" + this.genomeBuild.toString() + "\n"); 
     if(this._genomeBuild != null) builder.append("_genomeBuild" + "->" + this._genomeBuild.toString() + "\n"); 
     if(this.referenceSeqId != null) builder.append("referenceSeqId" + "->" + this.referenceSeqId.toString() + "\n"); 
     if(this.referenceSeqPointer != null) builder.append("referenceSeqPointer" + "->" + this.referenceSeqPointer.toString() + "\n"); 
     if(this.referenceSeqString != null) builder.append("referenceSeqString" + "->" + this.referenceSeqString.toString() + "\n"); 
     if(this._referenceSeqString != null) builder.append("_referenceSeqString" + "->" + this._referenceSeqString.toString() + "\n"); 
     if(this.strand != null) builder.append("strand" + "->" + this.strand.toString() + "\n"); 
     if(this._strand != null) builder.append("_strand" + "->" + this._strand.toString() + "\n"); 
     if(this.windowStart != null) builder.append("windowStart" + "->" + this.windowStart.toString() + "\n"); 
     if(this._windowStart != null) builder.append("_windowStart" + "->" + this._windowStart.toString() + "\n"); 
     if(this.windowEnd != null) builder.append("windowEnd" + "->" + this.windowEnd.toString() + "\n"); 
     if(this._windowEnd != null) builder.append("_windowEnd" + "->" + this._windowEnd.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}