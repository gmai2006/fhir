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
import org.fhir.entity.DocumentManifestRelatedModel;
import com.google.gson.GsonBuilder;

/**
* "A collection of documents compiled for a purpose together with metadata that applies to the collection."
*/
public class DocumentManifestRelated  extends BackboneElement  {
  /**
  * Description: "Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers."
  */
  protected Identifier identifier;

  /**
  * Description: "Related Resource to this DocumentManifest. For example, Order, ProcedureRequest,  Procedure, EligibilityRequest, etc."
  */
  protected Reference ref;

  public DocumentManifestRelated() {
  }

  public DocumentManifestRelated(DocumentManifestRelatedModel o) {
    this.id = o.getId();
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getRef() && !o.getRef().isEmpty()) {
      this.ref = new Reference(o.getRef().get(0));
    }
  }

  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setRef( Reference value) {
    this.ref = value;
  }
  public Reference getRef() {
    return this.ref;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DocumentManifestRelated]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.ref != null) builder.append("ref" + "->" + this.ref.toString() + "\n"); ;
    return builder.toString();
  }


}