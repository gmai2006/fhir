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
import org.fhir.utils.JsonUtils;
/**
* "A summary of information based on the results of executing a TestScript."
* generated on 07/14/2018
*/
@Entity
@Table(name="testreport")
public class TestReportModel  implements Serializable {
	private static final long serialVersionUID = 153159210220720599L;
  /**
  * Description: "This is a TestReport resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Identifier for the TestScript assigned for external purposes outside the context of FHIR."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A free text natural language name identifying the executed TestScript."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "The current state of this test report."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Ideally this is an absolute URL that is used to identify the version-specific TestScript that was executed, matching the `TestScript.url`."
  */
  @javax.persistence.Basic
  @Column(name="\"testscript_id\"")
  private String testscript_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="testscript_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> testScript;

  /**
  * Description: "The overall result from the execution of the TestScript."
  */
  @javax.persistence.Basic
  @Column(name="\"result\"")
  private String result;

  /**
  * Description: "The final score (percentage of tests passed) resulting from the execution of the TestScript."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"score\"")
  private Float score;

  /**
  * Description: "Name of the tester producing this report (Organization or individual)."
  */
  @javax.persistence.Basic
  @Column(name="\"tester\"")
  private String tester;

  /**
  * Description: "When the TestScript was executed and this TestReport was generated."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"issued\"")
  private String issued;

  /**
  * Description: "A participant in the test execution, either the execution engine, a client, or a server."
  */
  @javax.persistence.Basic
  @Column(name="\"participant_id\"")
  private String participant_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="participant_id", insertable=false, updatable=false)
  private java.util.List<TestReportParticipantModel> participant;

  /**
  * Description: "The results of the series of required setup operations before the tests were executed."
  */
  @javax.persistence.Basic
  @Column(name="\"setup_id\"")
  private String setup_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="setup_id", insertable=false, updatable=false)
  private java.util.List<TestReportSetupModel> setup;

  /**
  * Description: "A test executed from the test script."
  */
  @javax.persistence.Basic
  @Column(name="\"test_id\"")
  private String test_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="test_id", insertable=false, updatable=false)
  private java.util.List<TestReportTestModel> test;

  /**
  * Description: "The results of the series of operations required to clean up after the all the tests were executed (successfully or otherwise)."
  */
  @javax.persistence.Basic
  @Column(name="\"teardown_id\"")
  private String teardown_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="teardown_id", insertable=false, updatable=false)
  private java.util.List<TestReportTeardownModel> teardown;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public TestReportModel() {
  }

  public TestReportModel(TestReport o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.name = o.getName();
    this.status = o.getStatus();
    if (null != o.getTestScript() ) {
    	this.testscript_id = "testscript" + this.id;
    	this.testScript = ReferenceHelper.toModel(o.getTestScript(), this.testscript_id);
    }
    this.result = o.getResult();
    this.score = o.getScore();
    this.tester = o.getTester();
    this.issued = o.getIssued();
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant_id = "participant" + this.id;
    	this.participant = TestReportParticipantHelper.toModelFromArray(o.getParticipant(), this.participant_id);
    }
    if (null != o.getSetup() ) {
    	this.setup_id = "setup" + this.id;
    	this.setup = TestReportSetupHelper.toModel(o.getSetup(), this.setup_id);
    }
    if (null != o.getTest() && !o.getTest().isEmpty()) {
    	this.test_id = "test" + this.id;
    	this.test = TestReportTestHelper.toModelFromArray(o.getTest(), this.test_id);
    }
    if (null != o.getTeardown() ) {
    	this.teardown_id = "teardown" + this.id;
    	this.teardown = TestReportTeardownHelper.toModel(o.getTeardown(), this.teardown_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
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
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<ReferenceModel> getTestScript() {
    return this.testScript;
  }
  public void setTestScript( java.util.List<ReferenceModel> value) {
    this.testScript = value;
  }
  public String getResult() {
    return this.result;
  }
  public void setResult( String value) {
    this.result = value;
  }
  public Float getScore() {
    return this.score;
  }
  public void setScore( Float value) {
    this.score = value;
  }
  public String getTester() {
    return this.tester;
  }
  public void setTester( String value) {
    this.tester = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public java.util.List<TestReportParticipantModel> getParticipant() {
    return this.participant;
  }
  public void setParticipant( java.util.List<TestReportParticipantModel> value) {
    this.participant = value;
  }
  public java.util.List<TestReportSetupModel> getSetup() {
    return this.setup;
  }
  public void setSetup( java.util.List<TestReportSetupModel> value) {
    this.setup = value;
  }
  public java.util.List<TestReportTestModel> getTest() {
    return this.test;
  }
  public void setTest( java.util.List<TestReportTestModel> value) {
    this.test = value;
  }
  public java.util.List<TestReportTeardownModel> getTeardown() {
    return this.teardown;
  }
  public void setTeardown( java.util.List<TestReportTeardownModel> value) {
    this.teardown = value;
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
    builder.append("[TestReportModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("result" + "->" + this.result + "\n"); 
     builder.append("score" + "->" + this.score + "\n"); 
     builder.append("tester" + "->" + this.tester + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
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
    builder.append("[TestReportModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("result" + "->" + this.result + "\n"); 
     builder.append("score" + "->" + this.score + "\n"); 
     builder.append("tester" + "->" + this.tester + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}