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
import org.fhir.entity.DiagnosticReportImageModel;
import com.google.gson.GsonBuilder;

/**
* "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
*/
public class DiagnosticReportImage  extends BackboneElement  {
  /**
  * Description: "A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features."
  */
  protected String comment;

  /**
  * Description: "Extensions for comment"
  */
  protected transient Element _comment;

  /**
  * Description: "Reference to the image source."
  */
  @javax.validation.constraints.NotNull
  protected Reference link;

  public DiagnosticReportImage() {
  }

  public DiagnosticReportImage(DiagnosticReportImageModel o) {
    this.id = o.getId();
    if (null != o.getComment()) {
      this.comment = o.getComment();
    }
    if (null != o.getLink() && !o.getLink().isEmpty()) {
      this.link = new Reference(o.getLink().get(0));
    }
  }

  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
  }
  public void setLink( Reference value) {
    this.link = value;
  }
  public Reference getLink() {
    return this.link;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DiagnosticReportImage]:" + "\n");
     if(this.comment != null) builder.append("comment" + "->" + this.comment.toString() + "\n"); 
     if(this._comment != null) builder.append("_comment" + "->" + this._comment.toString() + "\n"); 
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); ;
    return builder.toString();
  }


}