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
public class ContractSigner  extends BackboneElement  {
  /**
  * Description: "Role of this Contract signer, e.g. notary, grantee."
  */
  @javax.validation.constraints.NotNull
  protected Coding type;

  /**
  * Description: "Party which is a signator to this Contract."
  */
  @javax.validation.constraints.NotNull
  protected Reference party;

  /**
  * Description: "Legally binding Contract DSIG signature contents in Base64."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<Signature> signature = new java.util.ArrayList<>();

  public ContractSigner() {
  }

  public ContractSigner(ContractSignerModel o) {
    this.id = o.getId();
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new Coding(o.getType().get(0));
    }
    if (null != o.getParty() && !o.getParty().isEmpty()) {
      this.party = new Reference(o.getParty().get(0));
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ContractSigner]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.party != null) builder.append("party" + "->" + this.party.toString() + "\n"); 
     if(this.signature != null) builder.append("signature" + "->" + this.signature.toString() + "\n"); ;
    return builder.toString();
  }


}