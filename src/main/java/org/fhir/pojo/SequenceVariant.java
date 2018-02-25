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
import org.fhir.entity.SequenceVariantModel;
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
public class SequenceVariant  extends BackboneElement  {
  /**
  * Description: "Start position of the variant on the  reference sequence.If the coordinate system is either 0-based or 1-based, then start position is inclusive."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float start;

  /**
  * Description: "Extensions for start"
  */
  protected transient Element _start;

  /**
  * Description: "End position of the variant on the reference sequence.If the coordinate system is 0-based then end is is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float end;

  /**
  * Description: "Extensions for end"
  */
  protected transient Element _end;

  /**
  * Description: "An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)).  Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed  sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end."
  */
  protected String observedAllele;

  /**
  * Description: "Extensions for observedAllele"
  */
  protected transient Element _observedAllele;

  /**
  * Description: "An allele is one of a set of coexisting sequence variants of a gene ([SO:0001023](http://www.sequenceontology.org/browser/current_svn/term/SO:0001023)). Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the reference sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end."
  */
  protected String referenceAllele;

  /**
  * Description: "Extensions for referenceAllele"
  */
  protected transient Element _referenceAllele;

  /**
  * Description: "Extended CIGAR string for aligning the sequence with reference bases. See detailed documentation [here](http://support.illumina.com/help/SequencingAnalysisWorkflow/Content/Vault/Informatics/Sequencing_Analysis/CASAVA/swSEQ_mCA_ExtendedCIGARFormat.htm)."
  */
  protected String cigar;

  /**
  * Description: "Extensions for cigar"
  */
  protected transient Element _cigar;

  /**
  * Description: "A pointer to an Observation containing variant information."
  */
  protected Reference variantPointer;

  public SequenceVariant() {
  }

  public SequenceVariant(SequenceVariantModel o) {
    this.id = o.getId();
    if (null != o.getStart()) {
      this.start = o.getStart();
    }
    if (null != o.getEnd()) {
      this.end = o.getEnd();
    }
    if (null != o.getObservedAllele()) {
      this.observedAllele = o.getObservedAllele();
    }
    if (null != o.getReferenceAllele()) {
      this.referenceAllele = o.getReferenceAllele();
    }
    if (null != o.getCigar()) {
      this.cigar = o.getCigar();
    }
    if (null != o.getVariantPointer() && !o.getVariantPointer().isEmpty()) {
      this.variantPointer = new Reference(o.getVariantPointer().get(0));
    }
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
  public void setObservedAllele( String value) {
    this.observedAllele = value;
  }
  public String getObservedAllele() {
    return this.observedAllele;
  }
  public void set_observedAllele( Element value) {
    this._observedAllele = value;
  }
  public Element get_observedAllele() {
    return this._observedAllele;
  }
  public void setReferenceAllele( String value) {
    this.referenceAllele = value;
  }
  public String getReferenceAllele() {
    return this.referenceAllele;
  }
  public void set_referenceAllele( Element value) {
    this._referenceAllele = value;
  }
  public Element get_referenceAllele() {
    return this._referenceAllele;
  }
  public void setCigar( String value) {
    this.cigar = value;
  }
  public String getCigar() {
    return this.cigar;
  }
  public void set_cigar( Element value) {
    this._cigar = value;
  }
  public Element get_cigar() {
    return this._cigar;
  }
  public void setVariantPointer( Reference value) {
    this.variantPointer = value;
  }
  public Reference getVariantPointer() {
    return this.variantPointer;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SequenceVariant]:" + "\n");
     if(this.start != null) builder.append("start" + "->" + this.start.toString() + "\n"); 
     if(this._start != null) builder.append("_start" + "->" + this._start.toString() + "\n"); 
     if(this.end != null) builder.append("end" + "->" + this.end.toString() + "\n"); 
     if(this._end != null) builder.append("_end" + "->" + this._end.toString() + "\n"); 
     if(this.observedAllele != null) builder.append("observedAllele" + "->" + this.observedAllele.toString() + "\n"); 
     if(this._observedAllele != null) builder.append("_observedAllele" + "->" + this._observedAllele.toString() + "\n"); 
     if(this.referenceAllele != null) builder.append("referenceAllele" + "->" + this.referenceAllele.toString() + "\n"); 
     if(this._referenceAllele != null) builder.append("_referenceAllele" + "->" + this._referenceAllele.toString() + "\n"); 
     if(this.cigar != null) builder.append("cigar" + "->" + this.cigar.toString() + "\n"); 
     if(this._cigar != null) builder.append("_cigar" + "->" + this._cigar.toString() + "\n"); 
     if(this.variantPointer != null) builder.append("variantPointer" + "->" + this.variantPointer.toString() + "\n"); ;
    return builder.toString();
  }


}