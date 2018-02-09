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
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      if (null != o.getCoordinateSystem()) {
        this.coordinateSystem = new Float(o.getCoordinateSystem());
      }

      if (null != o.getPatient()) {
        this.patient = new Reference(o.getPatient());
        this.patient.setId(this.getId());
      }

      if (null != o.getSpecimen()) {
        this.specimen = new Reference(o.getSpecimen());
        this.specimen.setId(this.getId());
      }

      if (null != o.getDevice()) {
        this.device = new Reference(o.getDevice());
        this.device.setId(this.getId());
      }

      if (null != o.getPerformer()) {
        this.performer = new Reference(o.getPerformer());
        this.performer.setId(this.getId());
      }

      this.quantity = Quantity.fromJson(o.getQuantity());
      if (null != o.getReferenceSeq()) {
        this.referenceSeq = new SequenceReferenceSeq(o.getReferenceSeq());
        this.referenceSeq.setId(this.getId());
      }

      this.variant = SequenceVariant.fromArray(o.getVariant());

      if (null != o.getObservedSeq()) {
        this.observedSeq = new String(o.getObservedSeq());
      }

      this.quality = SequenceQuality.fromArray(o.getQuality());

      if (null != o.getReadCoverage()) {
        this.readCoverage = new Float(o.getReadCoverage());
      }

      this.repository = SequenceRepository.fromArray(o.getRepository());

      this.pointer = Reference.fromArray(o.getPointer());

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("coordinateSystem" + "[" + String.valueOf(this.coordinateSystem) + "]\n"); 
     builder.append("_coordinateSystem" + "[" + String.valueOf(this._coordinateSystem) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("specimen" + "[" + String.valueOf(this.specimen) + "]\n"); 
     builder.append("device" + "[" + String.valueOf(this.device) + "]\n"); 
     builder.append("performer" + "[" + String.valueOf(this.performer) + "]\n"); 
     builder.append("quantity" + "[" + String.valueOf(this.quantity) + "]\n"); 
     builder.append("referenceSeq" + "[" + String.valueOf(this.referenceSeq) + "]\n"); 
     builder.append("variant" + "[" + String.valueOf(this.variant) + "]\n"); 
     builder.append("observedSeq" + "[" + String.valueOf(this.observedSeq) + "]\n"); 
     builder.append("_observedSeq" + "[" + String.valueOf(this._observedSeq) + "]\n"); 
     builder.append("quality" + "[" + String.valueOf(this.quality) + "]\n"); 
     builder.append("readCoverage" + "[" + String.valueOf(this.readCoverage) + "]\n"); 
     builder.append("_readCoverage" + "[" + String.valueOf(this._readCoverage) + "]\n"); 
     builder.append("repository" + "[" + String.valueOf(this.repository) + "]\n"); 
     builder.append("pointer" + "[" + String.valueOf(this.pointer) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
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

  public static java.util.List<Sequence> fromArray(java.util.List<SequenceModel> list) {
    return (java.util.List<Sequence>)list.stream()
      .map(model -> new Sequence(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<SequenceModel> toModelArray(java.util.List<Sequence> list) {
    return (java.util.List<SequenceModel>)list.stream()
      .map(model -> new SequenceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Sequence fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Sequence.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Sequence o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Sequence> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}