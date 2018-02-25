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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Raw data describing a biological sequence."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SequenceReferenceSeq  extends BackboneElement  {
  /**
  * Description: "Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340))."
  */
  protected CodeableConcept chromosome;

  /**
  * Description: "The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used."
  */
  protected String genomeBuild;

  /**
  * Description: "Extensions for genomeBuild"
  */
  protected transient Element _genomeBuild;

  /**
  * Description: "Reference identifier of reference sequence submitted to NCBI. It must match the type in the Sequence.type field. For example, the prefix, “NG_” identifies reference sequence for genes, “NM_” for messenger RNA transcripts, and “NP_” for amino acid sequences."
  */
  protected CodeableConcept referenceSeqId;

  /**
  * Description: "A Pointer to another Sequence entity as reference sequence."
  */
  protected Reference referenceSeqPointer;

  /**
  * Description: "A string like \"ACGT\"."
  */
  protected String referenceSeqString;

  /**
  * Description: "Extensions for referenceSeqString"
  */
  protected transient Element _referenceSeqString;

  /**
  * Description: "Directionality of DNA sequence. Available values are \"1\" for the plus strand (5' to 3')/Watson/Sense/positive  and \"-1\" for the minus strand(3' to 5')/Crick/Antisense/negative."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float strand;

  /**
  * Description: "Extensions for strand"
  */
  protected transient Element _strand;

  /**
  * Description: "Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float windowStart;

  /**
  * Description: "Extensions for windowStart"
  */
  protected transient Element _windowStart;

  /**
  * Description: "End position of the window on the reference sequence. If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float windowEnd;

  /**
  * Description: "Extensions for windowEnd"
  */
  protected transient Element _windowEnd;

  public SequenceReferenceSeq() {
  }

  public SequenceReferenceSeq(SequenceReferenceSeqModel o) {
    this.id = o.getId();
    if (null != o.getChromosome() && !o.getChromosome().isEmpty()) {
      this.chromosome = new CodeableConcept(o.getChromosome().get(0));
    }
    if (null != o.getGenomeBuild()) {
      this.genomeBuild = o.getGenomeBuild();
    }
    if (null != o.getReferenceSeqId() && !o.getReferenceSeqId().isEmpty()) {
      this.referenceSeqId = new CodeableConcept(o.getReferenceSeqId().get(0));
    }
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
     if(this._windowEnd != null) builder.append("_windowEnd" + "->" + this._windowEnd.toString() + "\n"); ;
    return builder.toString();
  }


}