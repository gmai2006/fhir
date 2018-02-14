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
@Table(name="sequence")
public class SequenceModel  implements Serializable {
	private static final long serialVersionUID = 151857669700444522L;
  /**
  * Description: "This is a Sequence resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A unique identifier for this particular sequence instance. This is a FHIR-defined id."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Amino Acid Sequence/ DNA Sequence / RNA Sequence."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "Whether the sequence is numbered starting at 0 (0-based numbering or coordinates, inclusive start, exclusive end) or starting at 1 (1-based numbering, inclusive start and inclusive end)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"coordinateSystem\"")
  private Float coordinateSystem;

  /**
  * Description: "The patient whose sequencing results are described by this resource."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "Specimen used for sequencing."
  */
  @javax.persistence.Basic
  @Column(name="\"specimen_id\"")
  private String specimen_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="specimen_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> specimen;

  /**
  * Description: "The method for sequencing, for example, chip information."
  */
  @javax.persistence.Basic
  @Column(name="\"device_id\"")
  private String device_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="device_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> device;

  /**
  * Description: "The organization or lab that should be responsible for this result."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="performer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> performer;

  /**
  * Description: "The number of copies of the seqeunce of interest. (RNASeq)."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"quantity\"", length = 16777215)
  private String quantity;

  /**
  * Description: "A sequence that is used as a reference to describe variants that are present in a sequence analyzed."
  */
  @javax.persistence.Basic
  @Column(name="\"referenceseq_id\"")
  private String referenceseq_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="referenceseq_id", insertable=false, updatable=false)
  private java.util.List<SequenceReferenceSeqModel> referenceSeq;

  /**
  * Description: "The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string."
  */
  @javax.persistence.Basic
  @Column(name="\"variant_id\"")
  private String variant_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="variant_id", insertable=false, updatable=false)
  private java.util.List<SequenceVariantModel> variant;

  /**
  * Description: "Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall starts from referenceSeq.windowStart and end by referenceSeq.windowEnd."
  */
  @javax.persistence.Basic
  @Column(name="\"observedSeq\"")
  private String observedSeq;

  /**
  * Description: "An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686))."
  */
  @javax.persistence.Basic
  @Column(name="\"quality_id\"")
  private String quality_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="quality_id", insertable=false, updatable=false)
  private java.util.List<SequenceQualityModel> quality;

  /**
  * Description: "Coverage (read depth or depth) is the average number of reads representing a given nucleotide in the reconstructed sequence."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"readCoverage\"")
  private Float readCoverage;

  /**
  * Description: "Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq."
  */
  @javax.persistence.Basic
  @Column(name="\"repository_id\"")
  private String repository_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="repository_id", insertable=false, updatable=false)
  private java.util.List<SequenceRepositoryModel> repository;

  /**
  * Description: "Pointer to next atomic sequence which at most contains one variant."
  */
  @javax.persistence.Basic
  @Column(name="\"pointer_id\"")
  private String pointer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="pointer_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> pointer;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public SequenceModel() {
  }

  public SequenceModel(Sequence o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.type = o.getType();
    this.coordinateSystem = o.getCoordinateSystem();
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    if (null != o.getSpecimen() ) {
    	this.specimen_id = "specimen" + this.id;
    	this.specimen = ReferenceHelper.toModel(o.getSpecimen(), this.specimen_id);
    }
    if (null != o.getDevice() ) {
    	this.device_id = "device" + this.id;
    	this.device = ReferenceHelper.toModel(o.getDevice(), this.device_id);
    }
    if (null != o.getPerformer() ) {
    	this.performer_id = "performer" + this.id;
    	this.performer = ReferenceHelper.toModel(o.getPerformer(), this.performer_id);
    }
    this.quantity = QuantityHelper.toJson(o.getQuantity());
    if (null != o.getReferenceSeq() ) {
    	this.referenceseq_id = "referenceseq" + this.id;
    	this.referenceSeq = SequenceReferenceSeqHelper.toModel(o.getReferenceSeq(), this.referenceseq_id);
    }
    if (null != o.getVariant() && !o.getVariant().isEmpty()) {
    	this.variant_id = "variant" + this.id;
    	this.variant = SequenceVariantHelper.toModelFromArray(o.getVariant(), this.variant_id);
    }
    this.observedSeq = o.getObservedSeq();
    if (null != o.getQuality() && !o.getQuality().isEmpty()) {
    	this.quality_id = "quality" + this.id;
    	this.quality = SequenceQualityHelper.toModelFromArray(o.getQuality(), this.quality_id);
    }
    this.readCoverage = o.getReadCoverage();
    if (null != o.getRepository() && !o.getRepository().isEmpty()) {
    	this.repository_id = "repository" + this.id;
    	this.repository = SequenceRepositoryHelper.toModelFromArray(o.getRepository(), this.repository_id);
    }
    if (null != o.getPointer() && !o.getPointer().isEmpty()) {
    	this.pointer_id = "pointer" + this.id;
    	this.pointer = ReferenceHelper.toModelFromArray(o.getPointer(), this.pointer_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public Float getCoordinateSystem() {
    return this.coordinateSystem;
  }
  public void setCoordinateSystem( Float value) {
    this.coordinateSystem = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
  }
  public java.util.List<ReferenceModel> getSpecimen() {
    return this.specimen;
  }
  public void setSpecimen( java.util.List<ReferenceModel> value) {
    this.specimen = value;
  }
  public java.util.List<ReferenceModel> getDevice() {
    return this.device;
  }
  public void setDevice( java.util.List<ReferenceModel> value) {
    this.device = value;
  }
  public java.util.List<ReferenceModel> getPerformer() {
    return this.performer;
  }
  public void setPerformer( java.util.List<ReferenceModel> value) {
    this.performer = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public java.util.List<SequenceReferenceSeqModel> getReferenceSeq() {
    return this.referenceSeq;
  }
  public void setReferenceSeq( java.util.List<SequenceReferenceSeqModel> value) {
    this.referenceSeq = value;
  }
  public java.util.List<SequenceVariantModel> getVariant() {
    return this.variant;
  }
  public void setVariant( java.util.List<SequenceVariantModel> value) {
    this.variant = value;
  }
  public String getObservedSeq() {
    return this.observedSeq;
  }
  public void setObservedSeq( String value) {
    this.observedSeq = value;
  }
  public java.util.List<SequenceQualityModel> getQuality() {
    return this.quality;
  }
  public void setQuality( java.util.List<SequenceQualityModel> value) {
    this.quality = value;
  }
  public Float getReadCoverage() {
    return this.readCoverage;
  }
  public void setReadCoverage( Float value) {
    this.readCoverage = value;
  }
  public java.util.List<SequenceRepositoryModel> getRepository() {
    return this.repository;
  }
  public void setRepository( java.util.List<SequenceRepositoryModel> value) {
    this.repository = value;
  }
  public java.util.List<ReferenceModel> getPointer() {
    return this.pointer;
  }
  public void setPointer( java.util.List<ReferenceModel> value) {
    this.pointer = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SequenceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("coordinateSystem" + "->" + this.coordinateSystem + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("observedSeq" + "->" + this.observedSeq + "\n"); 
     builder.append("readCoverage" + "->" + this.readCoverage + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SequenceModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("coordinateSystem" + "->" + this.coordinateSystem + "\n"); 
     builder.append("patient" + "->" + this.patient + "\n"); 
     builder.append("specimen" + "->" + this.specimen + "\n"); 
     builder.append("device" + "->" + this.device + "\n"); 
     builder.append("performer" + "->" + this.performer + "\n"); 
     builder.append("quantity" + "->" + this.quantity + "\n"); 
     builder.append("referenceSeq" + "->" + this.referenceSeq + "\n"); 
     builder.append("variant" + "->" + this.variant + "\n"); 
     builder.append("observedSeq" + "->" + this.observedSeq + "\n"); 
     builder.append("quality" + "->" + this.quality + "\n"); 
     builder.append("readCoverage" + "->" + this.readCoverage + "\n"); 
     builder.append("repository" + "->" + this.repository + "\n"); 
     builder.append("pointer" + "->" + this.pointer + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}