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
/**
* "Raw data describing a biological sequence."
*/
@Entity
@Table(name="sequencereferenceseq")
public class SequenceReferenceSeqModel  implements Serializable {
	private static final long serialVersionUID = 151857669695965372L;
  /**
  * Description: "Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340))."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"chromosome\"", length = 16777215)
  private String chromosome;

  /**
  * Description: "The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'.  Version number must be included if a versioned release of a primary build was used."
  */
  @javax.persistence.Basic
  @Column(name="\"genomeBuild\"")
  private String genomeBuild;

  /**
  * Description: "Reference identifier of reference sequence submitted to NCBI. It must match the type in the Sequence.type field. For example, the prefix, “NG_” identifies reference sequence for genes, “NM_” for messenger RNA transcripts, and “NP_” for amino acid sequences."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"referenceSeqId\"", length = 16777215)
  private String referenceSeqId;

  /**
  * Description: "A Pointer to another Sequence entity as reference sequence."
  */
  @javax.persistence.Basic
  @Column(name="\"referenceseqpointer_id\"")
  private String referenceseqpointer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="referenceseqpointer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> referenceSeqPointer;

  /**
  * Description: "A string like \"ACGT\"."
  */
  @javax.persistence.Basic
  @Column(name="\"referenceSeqString\"")
  private String referenceSeqString;

  /**
  * Description: "Directionality of DNA sequence. Available values are \"1\" for the plus strand (5' to 3')/Watson/Sense/positive  and \"-1\" for the minus strand(3' to 5')/Crick/Antisense/negative."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"strand\"")
  private Float strand;

  /**
  * Description: "Start position of the window on the reference sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"windowStart\"")
  private Float windowStart;

  /**
  * Description: "End position of the window on the reference sequence. If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"windowEnd\"")
  private Float windowEnd;

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

  public SequenceReferenceSeqModel() {
  }

  public SequenceReferenceSeqModel(SequenceReferenceSeq o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.chromosome = CodeableConceptHelper.toJson(o.getChromosome());
    this.genomeBuild = o.getGenomeBuild();
    this.referenceSeqId = CodeableConceptHelper.toJson(o.getReferenceSeqId());
    if (null != o.getReferenceSeqPointer() ) {
    	this.referenceseqpointer_id = "referenceseqpointer" + this.parent_id;
    	this.referenceSeqPointer = ReferenceHelper.toModel(o.getReferenceSeqPointer(), this.referenceseqpointer_id);
    }
    this.referenceSeqString = o.getReferenceSeqString();
    this.strand = o.getStrand();
    this.windowStart = o.getWindowStart();
    this.windowEnd = o.getWindowEnd();
  }

  public String getChromosome() {
    return this.chromosome;
  }
  public void setChromosome( String value) {
    this.chromosome = value;
  }
  public String getGenomeBuild() {
    return this.genomeBuild;
  }
  public void setGenomeBuild( String value) {
    this.genomeBuild = value;
  }
  public String getReferenceSeqId() {
    return this.referenceSeqId;
  }
  public void setReferenceSeqId( String value) {
    this.referenceSeqId = value;
  }
  public java.util.List<ReferenceModel> getReferenceSeqPointer() {
    return this.referenceSeqPointer;
  }
  public void setReferenceSeqPointer( java.util.List<ReferenceModel> value) {
    this.referenceSeqPointer = value;
  }
  public String getReferenceSeqString() {
    return this.referenceSeqString;
  }
  public void setReferenceSeqString( String value) {
    this.referenceSeqString = value;
  }
  public Float getStrand() {
    return this.strand;
  }
  public void setStrand( Float value) {
    this.strand = value;
  }
  public Float getWindowStart() {
    return this.windowStart;
  }
  public void setWindowStart( Float value) {
    this.windowStart = value;
  }
  public Float getWindowEnd() {
    return this.windowEnd;
  }
  public void setWindowEnd( Float value) {
    this.windowEnd = value;
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
    builder.append("[SequenceReferenceSeqModel]:" + "\n");
     builder.append("chromosome" + "->" + this.chromosome + "\n"); 
     builder.append("genomeBuild" + "->" + this.genomeBuild + "\n"); 
     builder.append("referenceSeqId" + "->" + this.referenceSeqId + "\n"); 
     builder.append("referenceSeqString" + "->" + this.referenceSeqString + "\n"); 
     builder.append("strand" + "->" + this.strand + "\n"); 
     builder.append("windowStart" + "->" + this.windowStart + "\n"); 
     builder.append("windowEnd" + "->" + this.windowEnd + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SequenceReferenceSeqModel]:" + "\n");
     builder.append("chromosome" + "->" + this.chromosome + "\n"); 
     builder.append("genomeBuild" + "->" + this.genomeBuild + "\n"); 
     builder.append("referenceSeqId" + "->" + this.referenceSeqId + "\n"); 
     builder.append("referenceSeqPointer" + "->" + this.referenceSeqPointer + "\n"); 
     builder.append("referenceSeqString" + "->" + this.referenceSeqString + "\n"); 
     builder.append("strand" + "->" + this.strand + "\n"); 
     builder.append("windowStart" + "->" + this.windowStart + "\n"); 
     builder.append("windowEnd" + "->" + this.windowEnd + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}