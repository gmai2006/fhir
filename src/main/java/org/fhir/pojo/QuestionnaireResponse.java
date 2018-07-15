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
import org.fhir.entity.QuestionnaireResponseModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class QuestionnaireResponse  extends DomainResource  {
  /**
  * Description: "This is a QuestionnaireResponse resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "A business identifier assigned to a particular completed (or partially completed) questionnaire."
  */
  protected Identifier identifier;

  /**
  * Description: "The order, proposal or plan that is fulfilled in whole or in part by this QuestionnaireResponse.  For example, a ProcedureRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression."
  */
  protected java.util.List<Reference> basedOn;

  /**
  * Description: "A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of."
  */
  protected java.util.List<Reference> parent;

  /**
  * Description: "The Questionnaire that defines and organizes the questions for which answers are being provided."
  */
  protected Reference questionnaire;

  /**
  * Description: "The position of the questionnaire response within its overall lifecycle."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information."
  */
  protected Reference subject;

  /**
  * Description: "The encounter or episode of care with primary association to the questionnaire response."
  */
  protected Reference context;

  /**
  * Description: "The date and/or time that this set of answers were last changed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String authored;

  /**
  * Description: "Extensions for authored"
  */
  protected transient Element _authored;

  /**
  * Description: "Person who received the answers to the questions in the QuestionnaireResponse and recorded them in the system."
  */
  protected Reference author;

  /**
  * Description: "The person who answered the questions about the subject."
  */
  protected Reference source;

  /**
  * Description: "A group or question item from the original questionnaire for which answers are provided."
  */
  protected java.util.List<QuestionnaireResponseItem> item;

  public QuestionnaireResponse() {
  }

  public QuestionnaireResponse(QuestionnaireResponseModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getParent() && !o.getParent().isEmpty()) {
    	this.parent = ReferenceHelper.fromArray2Array(o.getParent());
    }
    if (null != o.getQuestionnaire() && !o.getQuestionnaire().isEmpty()) {
      this.questionnaire = new Reference(o.getQuestionnaire().get(0));
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    if (null != o.getContext() && !o.getContext().isEmpty()) {
      this.context = new Reference(o.getContext().get(0));
    }
    if (null != o.getAuthored()) {
      this.authored = o.getAuthored();
    }
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
      this.author = new Reference(o.getAuthor().get(0));
    }
    if (null != o.getSource() && !o.getSource().isEmpty()) {
      this.source = new Reference(o.getSource().get(0));
    }
    if (null != o.getItem() && !o.getItem().isEmpty()) {
    	this.item = QuestionnaireResponseItemHelper.fromArray2Array(o.getItem());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setParent( java.util.List<Reference> value) {
    this.parent = value;
  }
  public java.util.List<Reference> getParent() {
    return this.parent;
  }
  public void setQuestionnaire( Reference value) {
    this.questionnaire = value;
  }
  public Reference getQuestionnaire() {
    return this.questionnaire;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setContext( Reference value) {
    this.context = value;
  }
  public Reference getContext() {
    return this.context;
  }
  public void setAuthored( String value) {
    this.authored = value;
  }
  public String getAuthored() {
    return this.authored;
  }
  public void set_authored( Element value) {
    this._authored = value;
  }
  public Element get_authored() {
    return this._authored;
  }
  public void setAuthor( Reference value) {
    this.author = value;
  }
  public Reference getAuthor() {
    return this.author;
  }
  public void setSource( Reference value) {
    this.source = value;
  }
  public Reference getSource() {
    return this.source;
  }
  public void setItem( java.util.List<QuestionnaireResponseItem> value) {
    this.item = value;
  }
  public java.util.List<QuestionnaireResponseItem> getItem() {
    return this.item;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[QuestionnaireResponse]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.parent != null) builder.append("parent" + "->" + this.parent.toString() + "\n"); 
     if(this.questionnaire != null) builder.append("questionnaire" + "->" + this.questionnaire.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.context != null) builder.append("context" + "->" + this.context.toString() + "\n"); 
     if(this.authored != null) builder.append("authored" + "->" + this.authored.toString() + "\n"); 
     if(this._authored != null) builder.append("_authored" + "->" + this._authored.toString() + "\n"); 
     if(this.author != null) builder.append("author" + "->" + this.author.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this.item != null) builder.append("item" + "->" + this.item.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	QuestionnaireResponse,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "QuestionnaireResponse" : { return QuestionnaireResponse.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum StatusEnum {
  	inprogress,
  	completed,
  	amended,
  	enteredinerror,
  	stopped,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "inprogress" : { return inprogress.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "amended" : { return amended.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}