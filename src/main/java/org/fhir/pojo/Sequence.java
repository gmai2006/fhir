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
import com.google.gson.GsonBuilder;

/**
* "Raw data describing a biological sequence."
*/
public class Sequence  {
  /**
  * Description: "This is a Sequence resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "A unique identifier for this particular sequence instance. This is a FHIR-defined id."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Amino Acid Sequence/ DNA Sequence / RNA Sequence."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "Whether the sequence is numbered starting at 0 (0-based numbering or coordinates, inclusive start, exclusive end) or starting at 1 (1-based numbering, inclusive start and inclusive end)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float coordinateSystem;

  /**
  * Description: "Extensions for coordinateSystem"
  */
  private transient Element _coordinateSystem;

  /**
  * Description: "The patient whose sequencing results are described by this resource."
  */
  private Reference patient;

  /**
  * Description: "Specimen used for sequencing."
  */
  private Reference specimen;

  /**
  * Description: "The method for sequencing, for example, chip information."
  */
  private Reference device;

  /**
  * Description: "The organization or lab that should be responsible for this result."
  */
  private Reference performer;

  /**
  * Description: "The number of copies of the seqeunce of interest. (RNASeq)."
  */
  private Quantity quantity;

  /**
  * Description: "A sequence that is used as a reference to describe variants that are present in a sequence analyzed."
  */
  private SequenceReferenceSeq referenceSeq;

  /**
  * Description: "The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string."
  */
  private java.util.List<SequenceVariant> variant = new java.util.ArrayList<>();

  /**
  * Description: "Sequence that was observed. It is the result marked by referenceSeq along with variant records on referenceSeq. This shall starts from referenceSeq.windowStart and end by referenceSeq.windowEnd."
  */
  private String observedSeq;

  /**
  * Description: "Extensions for observedSeq"
  */
  private transient Element _observedSeq;

  /**
  * Description: "An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686))."
  */
  private java.util.List<SequenceQuality> quality = new java.util.ArrayList<>();

  /**
  * Description: "Coverage (read depth or depth) is the average number of reads representing a given nucleotide in the reconstructed sequence."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float readCoverage;

  /**
  * Description: "Extensions for readCoverage"
  */
  private transient Element _readCoverage;

  /**
  * Description: "Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq."
  */
  private java.util.List<SequenceRepository> repository = new java.util.ArrayList<>();

  /**
  * Description: "Pointer to next atomic sequence which at most contains one variant."
  */
  private java.util.List<Reference> pointer = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public Sequence() {
  }

  public Sequence(SequenceModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
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
    this.quantity = QuantityHelper.fromJson(o.getQuantity());
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
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
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
     if(this.pointer != null) builder.append("pointer" + "->" + this.pointer.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
    return builder.toString();
  }

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