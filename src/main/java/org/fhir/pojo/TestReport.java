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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A summary of information based on the results of executing a TestScript."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TestReport  extends DomainResource  {
  /**
  * Description: "This is a TestReport resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier for the TestScript assigned for external purposes outside the context of FHIR."
  */
  protected Identifier identifier;

  /**
  * Description: "A free text natural language name identifying the executed TestScript."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "The current state of this test report."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Ideally this is an absolute URL that is used to identify the version-specific TestScript that was executed, matching the `TestScript.url`."
  */
  @javax.validation.constraints.NotNull
  protected Reference testScript;

  /**
  * Description: "The overall result from the execution of the TestScript."
  */
  protected String result;

  /**
  * Description: "Extensions for result"
  */
  protected transient Element _result;

  /**
  * Description: "The final score (percentage of tests passed) resulting from the execution of the TestScript."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  protected Float score;

  /**
  * Description: "Extensions for score"
  */
  protected transient Element _score;

  /**
  * Description: "Name of the tester producing this report (Organization or individual)."
  */
  protected String tester;

  /**
  * Description: "Extensions for tester"
  */
  protected transient Element _tester;

  /**
  * Description: "When the TestScript was executed and this TestReport was generated."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String issued;

  /**
  * Description: "Extensions for issued"
  */
  protected transient Element _issued;

  /**
  * Description: "A participant in the test execution, either the execution engine, a client, or a server."
  */
  protected java.util.List<TestReportParticipant> participant;

  /**
  * Description: "The results of the series of required setup operations before the tests were executed."
  */
  protected TestReportSetup setup;

  /**
  * Description: "A test executed from the test script."
  */
  protected java.util.List<TestReportTest> test;

  /**
  * Description: "The results of the series of operations required to clean up after the all the tests were executed (successfully or otherwise)."
  */
  protected TestReportTeardown teardown;

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
     if(this.teardown != null) builder.append("teardown" + "->" + this.teardown.toString() + "\n"); ;
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