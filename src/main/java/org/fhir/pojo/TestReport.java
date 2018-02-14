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
import org.fhir.entity.TestReportModel;
import com.google.gson.GsonBuilder;

/**
* "A summary of information based on the results of executing a TestScript."
*/
public class TestReport  {
  /**
  * Description: "This is a TestReport resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Identifier for the TestScript assigned for external purposes outside the context of FHIR."
  */
  private Identifier identifier;

  /**
  * Description: "A free text natural language name identifying the executed TestScript."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "The current state of this test report."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Ideally this is an absolute URL that is used to identify the version-specific TestScript that was executed, matching the `TestScript.url`."
  */
  @javax.validation.constraints.NotNull
  private Reference testScript;

  /**
  * Description: "The overall result from the execution of the TestScript."
  */
  private String result;

  /**
  * Description: "Extensions for result"
  */
  private transient Element _result;

  /**
  * Description: "The final score (percentage of tests passed) resulting from the execution of the TestScript."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float score;

  /**
  * Description: "Extensions for score"
  */
  private transient Element _score;

  /**
  * Description: "Name of the tester producing this report (Organization or individual)."
  */
  private String tester;

  /**
  * Description: "Extensions for tester"
  */
  private transient Element _tester;

  /**
  * Description: "When the TestScript was executed and this TestReport was generated."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String issued;

  /**
  * Description: "Extensions for issued"
  */
  private transient Element _issued;

  /**
  * Description: "A participant in the test execution, either the execution engine, a client, or a server."
  */
  private java.util.List<TestReportParticipant> participant = new java.util.ArrayList<>();

  /**
  * Description: "The results of the series of required setup operations before the tests were executed."
  */
  private TestReportSetup setup;

  /**
  * Description: "A test executed from the test script."
  */
  private java.util.List<TestReportTest> test = new java.util.ArrayList<>();

  /**
  * Description: "The results of the series of operations required to clean up after the all the tests were executed (successfully or otherwise)."
  */
  private TestReportTeardown teardown;

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

  public TestReport() {
  }

  public TestReport(TestReportModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getTestScript() && !o.getTestScript().isEmpty()) {
      this.testScript = new Reference(o.getTestScript().get(0));
    }
    if (null != o.getResult()) {
      this.result = o.getResult();
    }
    if (null != o.getScore()) {
      this.score = o.getScore();
    }
    if (null != o.getTester()) {
      this.tester = o.getTester();
    }
    if (null != o.getIssued()) {
      this.issued = o.getIssued();
    }
    if (null != o.getParticipant() && !o.getParticipant().isEmpty()) {
    	this.participant = TestReportParticipantHelper.fromArray2Array(o.getParticipant());
    }
    if (null != o.getSetup() && !o.getSetup().isEmpty()) {
      this.setup = new TestReportSetup(o.getSetup().get(0));
    }
    if (null != o.getTest() && !o.getTest().isEmpty()) {
    	this.test = TestReportTestHelper.fromArray2Array(o.getTest());
    }
    if (null != o.getTeardown() && !o.getTeardown().isEmpty()) {
      this.teardown = new TestReportTeardown(o.getTeardown().get(0));
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
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
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
  public void setTestScript( Reference value) {
    this.testScript = value;
  }
  public Reference getTestScript() {
    return this.testScript;
  }
  public void setResult( String value) {
    this.result = ResultEnum.fromCode(value);
  }
  public String getResult() {
    return this.result;
  }
  public void set_result( Element value) {
    this._result = value;
  }
  public Element get_result() {
    return this._result;
  }
  public void setScore( Float value) {
    this.score = value;
  }
  public Float getScore() {
    return this.score;
  }
  public void set_score( Element value) {
    this._score = value;
  }
  public Element get_score() {
    return this._score;
  }
  public void setTester( String value) {
    this.tester = value;
  }
  public String getTester() {
    return this.tester;
  }
  public void set_tester( Element value) {
    this._tester = value;
  }
  public Element get_tester() {
    return this._tester;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void set_issued( Element value) {
    this._issued = value;
  }
  public Element get_issued() {
    return this._issued;
  }
  public void setParticipant( java.util.List<TestReportParticipant> value) {
    this.participant = value;
  }
  public java.util.List<TestReportParticipant> getParticipant() {
    return this.participant;
  }
  public void setSetup( TestReportSetup value) {
    this.setup = value;
  }
  public TestReportSetup getSetup() {
    return this.setup;
  }
  public void setTest( java.util.List<TestReportTest> value) {
    this.test = value;
  }
  public java.util.List<TestReportTest> getTest() {
    return this.test;
  }
  public void setTeardown( TestReportTeardown value) {
    this.teardown = value;
  }
  public TestReportTeardown getTeardown() {
    return this.teardown;
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
    builder.append("[TestReport]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.testScript != null) builder.append("testScript" + "->" + this.testScript.toString() + "\n"); 
     if(this.result != null) builder.append("result" + "->" + this.result.toString() + "\n"); 
     if(this._result != null) builder.append("_result" + "->" + this._result.toString() + "\n"); 
     if(this.score != null) builder.append("score" + "->" + this.score.toString() + "\n"); 
     if(this._score != null) builder.append("_score" + "->" + this._score.toString() + "\n"); 
     if(this.tester != null) builder.append("tester" + "->" + this.tester.toString() + "\n"); 
     if(this._tester != null) builder.append("_tester" + "->" + this._tester.toString() + "\n"); 
     if(this.issued != null) builder.append("issued" + "->" + this.issued.toString() + "\n"); 
     if(this._issued != null) builder.append("_issued" + "->" + this._issued.toString() + "\n"); 
     if(this.participant != null) builder.append("participant" + "->" + this.participant.toString() + "\n"); 
     if(this.setup != null) builder.append("setup" + "->" + this.setup.toString() + "\n"); 
     if(this.test != null) builder.append("test" + "->" + this.test.toString() + "\n"); 
     if(this.teardown != null) builder.append("teardown" + "->" + this.teardown.toString() + "\n"); 
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
  	TestReport,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "TestReport" : { return TestReport.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	completed,
  	inprogress,
  	waiting,
  	stopped,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "completed" : { return completed.toString(); }
  			case "inprogress" : { return inprogress.toString(); }
  			case "waiting" : { return waiting.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum ResultEnum {
  	pass,
  	fail,
  	pending,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "pass" : { return pass.toString(); }
  			case "fail" : { return fail.toString(); }
  			case "pending" : { return pending.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}