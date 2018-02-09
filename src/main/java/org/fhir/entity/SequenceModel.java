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

/**
* "Raw data describing a biological sequence."
*/
@Entity
@Table(name="sequence")
public class SequenceModel  {
  /**
  * Description: "This is a Sequence resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "A unique identifier for this particular sequence instance. This is a FHIR-defined id."
  * Actual type: Array of Identifier-> List<Identifier>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`patient_id`", insertable=false, updatable=false)
  private ReferenceModel patient;

  /**
  * Description: "Specimen used for sequencing."
  */
  @javax.persistence.Basic
  @Column(name="\"specimen_id\"")
  private String specimen_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`specimen_id`", insertable=false, updatable=false)
  private ReferenceModel specimen;

  /**
  * Description: "The method for sequencing, for example, chip information."
  */
  @javax.persistence.Basic
  @Column(name="\"device_id\"")
  private String device_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`device_id`", insertable=false, updatable=false)
  private ReferenceModel device;

  /**
  * Description: "The organization or lab that should be responsible for this result."
  */
  @javax.persistence.Basic
  @Column(name="\"performer_id\"")
  private String performer_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`performer_id`", insertable=false, updatable=false)
  private ReferenceModel performer;

  /**
  * Description: "The number of copies of the seqeunce of interest. (RNASeq)."
  * Actual type: Quantity
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`referenceseq_id`", insertable=false, updatable=false)
  private SequenceReferenceSeqModel referenceSeq;

  /**
  * Description: "The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<SequenceVariantModel> variant = new java.util.ArrayList<>();

  /**
  * Description: "Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall starts from referenceSeq.windowStart and end by referenceSeq.windowEnd."
  */
  @javax.persistence.Basic
  @Column(name="\"observedSeq\"")
  private String observedSeq;

  /**
  * Description: "An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686))."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<SequenceQualityModel> quality = new java.util.ArrayList<>();

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
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<SequenceRepositoryModel> repository = new java.util.ArrayList<>();

  /**
  * Description: "Pointer to next atomic sequence which at most contains one variant."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> pointer = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.type = o.getType();

      this.coordinateSystem = o.getCoordinateSystem();

      if (null != o.getPatient()) {
      	this.patient_id = "patient" + this.getId();
        this.patient = new ReferenceModel(o.getPatient());
        this.patient.setId(this.patient_id);
        this.patient.parent_id = this.patient.getId();
      }

      if (null != o.getSpecimen()) {
      	this.specimen_id = "specimen" + this.getId();
        this.specimen = new ReferenceModel(o.getSpecimen());
        this.specimen.setId(this.specimen_id);
        this.specimen.parent_id = this.specimen.getId();
      }

      if (null != o.getDevice()) {
      	this.device_id = "device" + this.getId();
        this.device = new ReferenceModel(o.getDevice());
        this.device.setId(this.device_id);
        this.device.parent_id = this.device.getId();
      }

      if (null != o.getPerformer()) {
      	this.performer_id = "performer" + this.getId();
        this.performer = new ReferenceModel(o.getPerformer());
        this.performer.setId(this.performer_id);
        this.performer.parent_id = this.performer.getId();
      }

      this.quantity = Quantity.toJson(o.getQuantity());
      if (null != o.getReferenceSeq()) {
      	this.referenceseq_id = "referenceSeq" + this.getId();
        this.referenceSeq = new SequenceReferenceSeqModel(o.getReferenceSeq());
        this.referenceSeq.setId(this.referenceseq_id);
        this.referenceSeq.parent_id = this.referenceSeq.getId();
      }

      this.variant = SequenceVariant.toModelArray(o.getVariant());

      this.observedSeq = o.getObservedSeq();

      this.quality = SequenceQuality.toModelArray(o.getQuality());

      this.readCoverage = o.getReadCoverage();

      this.repository = SequenceRepository.toModelArray(o.getRepository());

      this.pointer = Reference.toModelArray(o.getPointer());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setCoordinateSystem( Float value) {
    this.coordinateSystem = value;
  }
  public Float getCoordinateSystem() {
    return this.coordinateSystem;
  }
  public void setPatient( ReferenceModel value) {
    this.patient = value;
  }
  public ReferenceModel getPatient() {
    return this.patient;
  }
  public void setSpecimen( ReferenceModel value) {
    this.specimen = value;
  }
  public ReferenceModel getSpecimen() {
    return this.specimen;
  }
  public void setDevice( ReferenceModel value) {
    this.device = value;
  }
  public ReferenceModel getDevice() {
    return this.device;
  }
  public void setPerformer( ReferenceModel value) {
    this.performer = value;
  }
  public ReferenceModel getPerformer() {
    return this.performer;
  }
  public void setQuantity( String value) {
    this.quantity = value;
  }
  public String getQuantity() {
    return this.quantity;
  }
  public void setReferenceSeq( SequenceReferenceSeqModel value) {
    this.referenceSeq = value;
  }
  public SequenceReferenceSeqModel getReferenceSeq() {
    return this.referenceSeq;
  }
  public void setVariant( java.util.List<SequenceVariantModel> value) {
    this.variant = value;
  }
  public java.util.List<SequenceVariantModel> getVariant() {
    return this.variant;
  }
  public void setObservedSeq( String value) {
    this.observedSeq = value;
  }
  public String getObservedSeq() {
    return this.observedSeq;
  }
  public void setQuality( java.util.List<SequenceQualityModel> value) {
    this.quality = value;
  }
  public java.util.List<SequenceQualityModel> getQuality() {
    return this.quality;
  }
  public void setReadCoverage( Float value) {
    this.readCoverage = value;
  }
  public Float getReadCoverage() {
    return this.readCoverage;
  }
  public void setRepository( java.util.List<SequenceRepositoryModel> value) {
    this.repository = value;
  }
  public java.util.List<SequenceRepositoryModel> getRepository() {
    return this.repository;
  }
  public void setPointer( java.util.List<ReferenceModel> value) {
    this.pointer = value;
  }
  public java.util.List<ReferenceModel> getPointer() {
    return this.pointer;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("coordinateSystem" + "[" + String.valueOf(this.coordinateSystem) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("specimen" + "[" + String.valueOf(this.specimen) + "]\n"); 
     builder.append("device" + "[" + String.valueOf(this.device) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("referenceSeq" + "[" + String.valueOf(this.referenceSeq) + "]\n"); 
     builder.append("variant" + "[" + String.valueOf(this.variant) + "]\n"); 
     builder.append("observedSeq" + "[" + String.valueOf(this.observedSeq) + "]\n"); 
     builder.append("quality" + "[" + String.valueOf(this.quality) + "]\n"); 
     builder.append("readCoverage" + "[" + String.valueOf(this.readCoverage) + "]\n"); 
     builder.append("repository" + "[" + String.valueOf(this.repository) + "]\n"); 
     builder.append("pointer" + "[" + String.valueOf(this.pointer) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}