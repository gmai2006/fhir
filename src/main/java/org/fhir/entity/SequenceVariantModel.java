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
@Table(name="sequencevariant")
public class SequenceVariantModel  implements Serializable {
	private static final long serialVersionUID = 151873631142853008L;
  /**
  * Description: "Start position of the variant on the  reference sequence.If the coordinate system is either 0-based or 1-based, then start position is inclusive."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"start\"")
  private Float start;

  /**
  * Description: "End position of the variant on the reference sequence.If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"end\"")
  private Float end;

  /**
  * Description: "An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)).  Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end."
  */
  @javax.persistence.Basic
  @Column(name="\"observedAllele\"")
  private String observedAllele;

  /**
  * Description: "An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)). Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end."
  */
  @javax.persistence.Basic
  @Column(name="\"referenceAllele\"")
  private String referenceAllele;

  /**
  * Description: "Extended CIGAR string for aligning the sequence with reference bases. See detailed documentation [here](http://support.illumina.com/help/SequencingAnalysisWorkflow/Content/Vault/Informatics/Sequencing_Analysis/CASAVA/swSEQ_mCA_ExtendedCIGARFormat.htm)."
  */
  @javax.persistence.Basic
  @Column(name="\"cigar\"")
  private String cigar;

  /**
  * Description: "A pointer to an Observation containing variant information."
  */
  @javax.persistence.Basic
  @Column(name="\"variantpointer_id\"")
  private String variantpointer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="variantpointer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> variantPointer;

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

  public SequenceVariantModel() {
  }

  public SequenceVariantModel(SequenceVariant o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.start = o.getStart();
    this.end = o.getEnd();
    this.observedAllele = o.getObservedAllele();
    this.referenceAllele = o.getReferenceAllele();
    this.cigar = o.getCigar();
    if (null != o.getVariantPointer() ) {
    	this.variantpointer_id = "variantpointer" + this.parent_id;
    	this.variantPointer = ReferenceHelper.toModel(o.getVariantPointer(), this.variantpointer_id);
    }
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
  public String getObservedAllele() {
    return this.observedAllele;
  }
  public void setObservedAllele( String value) {
    this.observedAllele = value;
  }
  public String getReferenceAllele() {
    return this.referenceAllele;
  }
  public void setReferenceAllele( String value) {
    this.referenceAllele = value;
  }
  public String getCigar() {
    return this.cigar;
  }
  public void setCigar( String value) {
    this.cigar = value;
  }
  public java.util.List<ReferenceModel> getVariantPointer() {
    return this.variantPointer;
  }
  public void setVariantPointer( java.util.List<ReferenceModel> value) {
    this.variantPointer = value;
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
    builder.append("[SequenceVariantModel]:" + "\n");
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("end" + "->" + this.end + "\n"); 
     builder.append("observedAllele" + "->" + this.observedAllele + "\n"); 
     builder.append("referenceAllele" + "->" + this.referenceAllele + "\n"); 
     builder.append("cigar" + "->" + this.cigar + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SequenceVariantModel]:" + "\n");
     builder.append("start" + "->" + this.start + "\n"); 
     builder.append("end" + "->" + this.end + "\n"); 
     builder.append("observedAllele" + "->" + this.observedAllele + "\n"); 
     builder.append("referenceAllele" + "->" + this.referenceAllele + "\n"); 
     builder.append("cigar" + "->" + this.cigar + "\n"); 
     builder.append("variantPointer" + "->" + this.variantPointer + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}