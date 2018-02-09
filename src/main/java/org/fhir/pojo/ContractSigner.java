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
import org.fhir.entity.ContractSignerModel;
import com.google.gson.GsonBuilder;

/**
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
*/
public class ContractSigner  {
  /**
  * Description: "Role of this Contract signer, e.g. notary, grantee."
  */
  @javax.validation.constraints.NotNull
  private Coding type;

  /**
  * Description: "Party which is a signator to this Contract."
  */
  @javax.validation.constraints.NotNull
  private Reference party;

  /**
  * Description: "Legally binding Contract DSIG signature contents in Base64."
  */
  @javax.validation.constraints.NotNull
  private java.util.List<Signature> signature = new java.util.ArrayList<>();

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

  public ContractSigner() {
  }

  public ContractSigner(ContractSignerModel o) {
    this.id = o.getId();
      this.type = Coding.fromJson(o.getType());
      if (null != o.getParty()) {
        this.party = new Reference(o.getParty());
        this.party.setId(this.getId());
      }

      this.signature = Signature.fromArray(o.getSignature());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( Coding value) {
    this.type = value;
  }
  public Coding getType() {
    return this.type;
  }
  public void setParty( Reference value) {
    this.party = value;
  }
  public Reference getParty() {
    return this.party;
  }
  public void setSignature( java.util.List<Signature> value) {
    this.signature = value;
  }
  public java.util.List<Signature> getSignature() {
    return this.signature;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("party" + "[" + String.valueOf(this.party) + "]\n"); 
     builder.append("signature" + "[" + String.valueOf(this.signature) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ContractSigner> fromArray(java.util.List<ContractSignerModel> list) {
    return (java.util.List<ContractSigner>)list.stream()
      .map(model -> new ContractSigner(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ContractSignerModel> toModelArray(java.util.List<ContractSigner> list) {
    return (java.util.List<ContractSignerModel>)list.stream()
      .map(model -> new ContractSignerModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ContractSigner fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ContractSigner.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ContractSigner o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ContractSigner> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}