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
import org.fhir.entity.MedicationPackageModel;
import com.google.gson.GsonBuilder;

/**
* "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
*/
public class MedicationPackage  extends BackboneElement  {
  /**
  * Description: "The kind of container that this package comes as."
  */
  protected CodeableConcept container;

  /**
  * Description: "A set of components that go to make up the described item."
  */
  protected java.util.List<MedicationContent> content = new java.util.ArrayList<>();

  /**
  * Description: "Information about a group of medication produced or packaged from one production run."
  */
  protected java.util.List<MedicationBatch> batch = new java.util.ArrayList<>();

  public MedicationPackage() {
  }

  public MedicationPackage(MedicationPackageModel o) {
    this.id = o.getId();
    this.container = CodeableConceptHelper.fromJson(o.getContainer());
    if (null != o.getContent() && !o.getContent().isEmpty()) {
    	this.content = MedicationContentHelper.fromArray2Array(o.getContent());
    }
    if (null != o.getBatch() && !o.getBatch().isEmpty()) {
    	this.batch = MedicationBatchHelper.fromArray2Array(o.getBatch());
    }
  }

  public void setContainer( CodeableConcept value) {
    this.container = value;
  }
  public CodeableConcept getContainer() {
    return this.container;
  }
  public void setContent( java.util.List<MedicationContent> value) {
    this.content = value;
  }
  public java.util.List<MedicationContent> getContent() {
    return this.content;
  }
  public void setBatch( java.util.List<MedicationBatch> value) {
    this.batch = value;
  }
  public java.util.List<MedicationBatch> getBatch() {
    return this.batch;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationPackage]:" + "\n");
     if(this.container != null) builder.append("container" + "->" + this.container.toString() + "\n"); 
     if(this.content != null) builder.append("content" + "->" + this.content.toString() + "\n"); 
     if(this.batch != null) builder.append("batch" + "->" + this.batch.toString() + "\n"); ;
    return builder.toString();
  }


}