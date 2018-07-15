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
import org.fhir.entity.SequenceModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Raw data describing a biological sequence."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Sequence  extends DomainResource  {
  /**
  * Description: "This is a Sequence resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A unique identifier for this particular sequence instance. This is a FHIR-defined id."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Amino Acid Sequence/ DNA Sequence / RNA Sequence."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "Whether the sequence is numbered starting at 0 (0-based numbering or coordinates, inclusive start, exclusive end) or starting at 1 (1-based numbering, inclusive start and inclusive end)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float coordinateSystem;

  /**
  * Description: "Extensions for coordinateSystem"
  */
  protected transient Element _coordinateSystem;

  /**
  * Description: "The patient whose sequencing results are described by this resource."
  */
  protected Reference patient;

  /**
  * Description: "Specimen used for sequencing."
  */
  protected Reference specimen;

  /**
  * Description: "The method for sequencing, for example, chip information."
  */
  protected Reference device;

  /**
  * Description: "The organization or lab that should be responsible for this result."
  */
  protected Reference performer;

  /**
  * Description: "The number of copies of the seqeunce of interest. (RNASeq)."
  */
  protected Quantity quantity;

  /**
  * Description: "A sequence that is used as a reference to describe variants that are present in a sequence analyzed."
  */
  protected SequenceReferenceSeq referenceSeq;

  /**
  * Description: "The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string."
  */
  protected java.util.List<SequenceVariant> variant;

  /**
  * Description: "Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall starts from referenceSeq.windowStart and end by referenceSeq.windowEnd."
  */
  protected String observedSeq;

  /**
  * Description: "Extensions for observedSeq"
  */
  protected transient Element _observedSeq;

  /**
  * Description: "An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686))."
  */
  protected java.util.List<SequenceQuality> quality;

  /**
  * Description: "Coverage (read depth or depth) is the average number of reads representing a given nucleotide in the reconstructed sequence."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float readCoverage;

  /**
  * Description: "Extensions for readCoverage"
  */
  protected transient Element _readCoverage;

  /**
  * Description: "Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq."
  */
  protected java.util.List<SequenceRepository> repository;

  /**
  * Description: "Pointer to next atomic sequence which at most contains one variant."
  */
  protected java.util.List<Reference> pointer;

  public Sequence() {
  }

  public Sequence(SequenceModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getCoordinateSystem()) {
      this.coordinateSystem = o.getCoordinateSystem();
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getSpecimen() && !o.getSpecimen().isEmpty()) {
      this.specimen = new Reference(o.getSpecimen().get(0));
    }
    if (null != o.getDevice() && !o.getDevice().isEmpty()) {
      this.device = new Reference(o.getDevice().get(0));
    }
    if (null != o.getPerformer() && !o.getPerformer().isEmpty()) {
      this.performer = new Reference(o.getPerformer().get(0));
    }
    if (null != o.getQuantity() && !o.getQuantity().isEmpty()) {
      this.quantity = new Quantity(o.getQuantity().get(0));
    }
    if (null != o.getReferenceSeq() && !o.getReferenceSeq().isEmpty()) {
      this.referenceSeq = new SequenceReferenceSeq(o.getReferenceSeq().get(0));
    }
    if (null != o.getVariant() && !o.getVariant().isEmpty()) {
    	this.variant = SequenceVariantHelper.fromArray2Array(o.getVariant());
    }
    if (null != o.getObservedSeq()) {
      this.observedSeq = o.getObservedSeq();
    }
    if (null != o.getQuality() && !o.getQuality().isEmpty()) {
    	this.quality = SequenceQualityHelper.fromArray2Array(o.getQuality());
    }
    if (null != o.getReadCoverage()) {
      this.readCoverage = o.getReadCoverage();
    }
    if (null != o.getRepository() && !o.getRepository().isEmpty()) {
    	this.repository = SequenceRepositoryHelper.fromArray2Array(o.getRepository());
    }
    if (null != o.getPointer() && !o.getPointer().isEmpty()) {
    	this.pointer = ReferenceHelper.fromArray2Array(o.getPointer());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
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
  public void setCoordinateSystem( Float value) {
    this.coordinateSystem = value;
  }
  public Float getCoordinateSystem() {
    return this.coordinateSystem;
  }
  public void set_coordinateSystem( Element value) {
    this._coordinateSystem = value;
  }
  public Element get_coordinateSystem() {
    return this._coordinateSystem;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setSpecimen( Reference value) {
    this.specimen = value;
  }
  public Reference getSpecimen() {
    return this.specimen;
  }
  public void setDevice( Reference value) {
    this.device = value;
  }
  public Reference getDevice() {
    return this.device;
  }
  public void setPerformer( Reference value) {
    this.performer = value;
  }
  public Reference getPerformer() {
    return this.performer;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setReferenceSeq( SequenceReferenceSeq value) {
    this.referenceSeq = value;
  }
  public SequenceReferenceSeq getReferenceSeq() {
    return this.referenceSeq;
  }
  public void setVariant( java.util.List<SequenceVariant> value) {
    this.variant = value;
  }
  public java.util.List<SequenceVariant> getVariant() {
    return this.variant;
  }
  public void setObservedSeq( String value) {
    this.observedSeq = value;
  }
  public String getObservedSeq() {
    return this.observedSeq;
  }
  public void set_observedSeq( Element value) {
    this._observedSeq = value;
  }
  public Element get_observedSeq() {
    return this._observedSeq;
  }
  public void setQuality( java.util.List<SequenceQuality> value) {
    this.quality = value;
  }
  public java.util.List<SequenceQuality> getQuality() {
    return this.quality;
  }
  public void setReadCoverage( Float value) {
    this.readCoverage = value;
  }
  public Float getReadCoverage() {
    return this.readCoverage;
  }
  public void set_readCoverage( Element value) {
    this._readCoverage = value;
  }
  public Element get_readCoverage() {
    return this._readCoverage;
  }
  public void setRepository( java.util.List<SequenceRepository> value) {
    this.repository = value;
  }
  public java.util.List<SequenceRepository> getRepository() {
    return this.repository;
  }
  public void setPointer( java.util.List<Reference> value) {
    this.pointer = value;
  }
  public java.util.List<Reference> getPointer() {
    return this.pointer;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Sequence]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.coordinateSystem != null) builder.append("coordinateSystem" + "->" + this.coordinateSystem.toString() + "\n"); 
     if(this._coordinateSystem != null) builder.append("_coordinateSystem" + "->" + this._coordinateSystem.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.specimen != null) builder.append("specimen" + "->" + this.specimen.toString() + "\n"); 
     if(this.device != null) builder.append("device" + "->" + this.device.toString() + "\n"); 
     if(this.performer != null) builder.append("performer" + "->" + this.performer.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.referenceSeq != null) builder.append("referenceSeq" + "->" + this.referenceSeq.toString() + "\n"); 
     if(this.variant != null) builder.append("variant" + "->" + this.variant.toString() + "\n"); 
     if(this.observedSeq != null) builder.append("observedSeq" + "->" + this.observedSeq.toString() + "\n"); 
     if(this._observedSeq != null) builder.append("_observedSeq" + "->" + this._observedSeq.toString() + "\n"); 
     if(this.quality != null) builder.append("quality" + "->" + this.quality.toString() + "\n"); 
     if(this.readCoverage != null) builder.append("readCoverage" + "->" + this.readCoverage.toString() + "\n"); 
     if(this._readCoverage != null) builder.append("_readCoverage" + "->" + this._readCoverage.toString() + "\n"); 
     if(this.repository != null) builder.append("repository" + "->" + this.repository.toString() + "\n"); 
     if(this.pointer != null) builder.append("pointer" + "->" + this.pointer.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	Sequence,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Sequence" : { return Sequence.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum TypeEnum {
  	aa,
  	dna,
  	rna,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "aa" : { return aa.toString(); }
  			case "dna" : { return dna.toString(); }
  			case "rna" : { return rna.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}