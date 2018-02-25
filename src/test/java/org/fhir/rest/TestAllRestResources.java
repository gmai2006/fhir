package org.fhir.rest;

import org.fhir.pojo.*;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class TestAllRestResources  {

	@BeforeClass
  public static void setupURL()
  {
      // here we setup the default URL and API base path to use throughout the tests
      RestAssured.baseURI = "http://localhost:8080";
      RestAssured.basePath = "/fhir/rest/";
  }

	@Test
	public void testRetrieveSequence() {
		Response response = get("/Sequence");
		if (200 == response.getStatusCode()) {
	  	List<Sequence> result = Arrays.asList(response.getBody().as(Sequence[].class));
	  	assertEquals("Expect ", "Sequence", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveSequence ]");
	}

	@Test
	public void testRetrieveStructureDefinition() {
		Response response = get("/StructureDefinition");
		if (200 == response.getStatusCode()) {
	  	List<StructureDefinition> result = Arrays.asList(response.getBody().as(StructureDefinition[].class));
	  	assertEquals("Expect ", "StructureDefinition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveStructureDefinition ]");
	}

	@Test
	public void testRetrieveQuestionnaire() {
		Response response = get("/Questionnaire");
		if (200 == response.getStatusCode()) {
	  	List<Questionnaire> result = Arrays.asList(response.getBody().as(Questionnaire[].class));
	  	assertEquals("Expect ", "Questionnaire", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveQuestionnaire ]");
	}

	@Test
	public void testRetrieveCodeSystem() {
		Response response = get("/CodeSystem");
		if (200 == response.getStatusCode()) {
	  	List<CodeSystem> result = Arrays.asList(response.getBody().as(CodeSystem[].class));
	  	assertEquals("Expect ", "CodeSystem", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveCodeSystem ]");
	}

	@Test
	public void testRetrieveFHIRList() {
		Response response = get("/FHIRList");
		if (200 == response.getStatusCode()) {
	  	List<FHIRList> result = Arrays.asList(response.getBody().as(FHIRList[].class));
	  	assertEquals("Expect ", "FHIRList", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveFHIRList ]");
	}

	@Test
	public void testRetrieveNutritionOrder() {
		Response response = get("/NutritionOrder");
		if (200 == response.getStatusCode()) {
	  	List<NutritionOrder> result = Arrays.asList(response.getBody().as(NutritionOrder[].class));
	  	assertEquals("Expect ", "NutritionOrder", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveNutritionOrder ]");
	}

	@Test
	public void testRetrievePractitioner() {
		Response response = get("/Practitioner");
		if (200 == response.getStatusCode()) {
	  	List<Practitioner> result = Arrays.asList(response.getBody().as(Practitioner[].class));
	  	assertEquals("Expect ", "Practitioner", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrievePractitioner ]");
	}

	@Test
	public void testRetrieveValueSet() {
		Response response = get("/ValueSet");
		if (200 == response.getStatusCode()) {
	  	List<ValueSet> result = Arrays.asList(response.getBody().as(ValueSet[].class));
	  	assertEquals("Expect ", "ValueSet", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveValueSet ]");
	}

	@Test
	public void testRetrieveOperationDefinition() {
		Response response = get("/OperationDefinition");
		if (200 == response.getStatusCode()) {
	  	List<OperationDefinition> result = Arrays.asList(response.getBody().as(OperationDefinition[].class));
	  	assertEquals("Expect ", "OperationDefinition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveOperationDefinition ]");
	}

	@Test
	public void testRetrieveBundle() {
		Response response = get("/Bundle");
		if (200 == response.getStatusCode()) {
	  	List<Bundle> result = Arrays.asList(response.getBody().as(Bundle[].class));
	  	assertEquals("Expect ", "Bundle", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveBundle ]");
	}

	@Test
	public void testRetrieveMedication() {
		Response response = get("/Medication");
		if (200 == response.getStatusCode()) {
	  	List<Medication> result = Arrays.asList(response.getBody().as(Medication[].class));
	  	assertEquals("Expect ", "Medication", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMedication ]");
	}

	@Test
	public void testRetrieveDiagnosticReport() {
		Response response = get("/DiagnosticReport");
		if (200 == response.getStatusCode()) {
	  	List<DiagnosticReport> result = Arrays.asList(response.getBody().as(DiagnosticReport[].class));
	  	assertEquals("Expect ", "DiagnosticReport", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDiagnosticReport ]");
	}

	@Test
	public void testRetrieveActivityDefinition() {
		Response response = get("/ActivityDefinition");
		if (200 == response.getStatusCode()) {
	  	List<ActivityDefinition> result = Arrays.asList(response.getBody().as(ActivityDefinition[].class));
	  	assertEquals("Expect ", "ActivityDefinition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveActivityDefinition ]");
	}

	@Test
	public void testRetrieveFamilyMemberHistory() {
		Response response = get("/FamilyMemberHistory");
		if (200 == response.getStatusCode()) {
	  	List<FamilyMemberHistory> result = Arrays.asList(response.getBody().as(FamilyMemberHistory[].class));
	  	assertEquals("Expect ", "FamilyMemberHistory", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveFamilyMemberHistory ]");
	}

	@Test
	public void testRetrieveAuditEvent() {
		Response response = get("/AuditEvent");
		if (200 == response.getStatusCode()) {
	  	List<AuditEvent> result = Arrays.asList(response.getBody().as(AuditEvent[].class));
	  	assertEquals("Expect ", "AuditEvent", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveAuditEvent ]");
	}

	@Test
	public void testRetrieveProcedureRequest() {
		Response response = get("/ProcedureRequest");
		if (200 == response.getStatusCode()) {
	  	List<ProcedureRequest> result = Arrays.asList(response.getBody().as(ProcedureRequest[].class));
	  	assertEquals("Expect ", "ProcedureRequest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveProcedureRequest ]");
	}

	@Test
	public void testRetrieveConceptMap() {
		Response response = get("/ConceptMap");
		if (200 == response.getStatusCode()) {
	  	List<ConceptMap> result = Arrays.asList(response.getBody().as(ConceptMap[].class));
	  	assertEquals("Expect ", "ConceptMap", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveConceptMap ]");
	}

	@Test
	public void testRetrieveMedicationDispense() {
		Response response = get("/MedicationDispense");
		if (200 == response.getStatusCode()) {
	  	List<MedicationDispense> result = Arrays.asList(response.getBody().as(MedicationDispense[].class));
	  	assertEquals("Expect ", "MedicationDispense", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMedicationDispense ]");
	}

	@Test
	public void testRetrieveVisionPrescription() {
		Response response = get("/VisionPrescription");
		if (200 == response.getStatusCode()) {
	  	List<VisionPrescription> result = Arrays.asList(response.getBody().as(VisionPrescription[].class));
	  	assertEquals("Expect ", "VisionPrescription", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveVisionPrescription ]");
	}

	@Test
	public void testRetrieveOrganization() {
		Response response = get("/Organization");
		if (200 == response.getStatusCode()) {
	  	List<Organization> result = Arrays.asList(response.getBody().as(Organization[].class));
	  	assertEquals("Expect ", "Organization", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveOrganization ]");
	}

	@Test
	public void testRetrieveCarePlan() {
		Response response = get("/CarePlan");
		if (200 == response.getStatusCode()) {
	  	List<CarePlan> result = Arrays.asList(response.getBody().as(CarePlan[].class));
	  	assertEquals("Expect ", "CarePlan", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveCarePlan ]");
	}

	@Test
	public void testRetrieveImmunizationRecommendation() {
		Response response = get("/ImmunizationRecommendation");
		if (200 == response.getStatusCode()) {
	  	List<ImmunizationRecommendation> result = Arrays.asList(response.getBody().as(ImmunizationRecommendation[].class));
	  	assertEquals("Expect ", "ImmunizationRecommendation", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveImmunizationRecommendation ]");
	}

	@Test
	public void testRetrieveProcedure() {
		Response response = get("/Procedure");
		if (200 == response.getStatusCode()) {
	  	List<Procedure> result = Arrays.asList(response.getBody().as(Procedure[].class));
	  	assertEquals("Expect ", "Procedure", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveProcedure ]");
	}

	@Test
	public void testRetrieveBodySite() {
		Response response = get("/BodySite");
		if (200 == response.getStatusCode()) {
	  	List<BodySite> result = Arrays.asList(response.getBody().as(BodySite[].class));
	  	assertEquals("Expect ", "BodySite", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveBodySite ]");
	}

	@Test
	public void testRetrieveClaim() {
		Response response = get("/Claim");
		if (200 == response.getStatusCode()) {
	  	List<Claim> result = Arrays.asList(response.getBody().as(Claim[].class));
	  	assertEquals("Expect ", "Claim", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveClaim ]");
	}

	@Test
	public void testRetrieveObservation() {
		Response response = get("/Observation");
		if (200 == response.getStatusCode()) {
	  	List<Observation> result = Arrays.asList(response.getBody().as(Observation[].class));
	  	assertEquals("Expect ", "Observation", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveObservation ]");
	}

	@Test
	public void testRetrieveEndpoint() {
		Response response = get("/Endpoint");
		if (200 == response.getStatusCode()) {
	  	List<Endpoint> result = Arrays.asList(response.getBody().as(Endpoint[].class));
	  	assertEquals("Expect ", "Endpoint", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveEndpoint ]");
	}

	@Test
	public void testRetrieveQuestionnaireResponse() {
		Response response = get("/QuestionnaireResponse");
		if (200 == response.getStatusCode()) {
	  	List<QuestionnaireResponse> result = Arrays.asList(response.getBody().as(QuestionnaireResponse[].class));
	  	assertEquals("Expect ", "QuestionnaireResponse", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveQuestionnaireResponse ]");
	}

	@Test
	public void testRetrieveSubstance() {
		Response response = get("/Substance");
		if (200 == response.getStatusCode()) {
	  	List<Substance> result = Arrays.asList(response.getBody().as(Substance[].class));
	  	assertEquals("Expect ", "Substance", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveSubstance ]");
	}

	@Test
	public void testRetrieveAllergyIntolerance() {
		Response response = get("/AllergyIntolerance");
		if (200 == response.getStatusCode()) {
	  	List<AllergyIntolerance> result = Arrays.asList(response.getBody().as(AllergyIntolerance[].class));
	  	assertEquals("Expect ", "AllergyIntolerance", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveAllergyIntolerance ]");
	}

	@Test
	public void testRetrieveConsent() {
		Response response = get("/Consent");
		if (200 == response.getStatusCode()) {
	  	List<Consent> result = Arrays.asList(response.getBody().as(Consent[].class));
	  	assertEquals("Expect ", "Consent", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveConsent ]");
	}

	@Test
	public void testRetrievePlanDefinition() {
		Response response = get("/PlanDefinition");
		if (200 == response.getStatusCode()) {
	  	List<PlanDefinition> result = Arrays.asList(response.getBody().as(PlanDefinition[].class));
	  	assertEquals("Expect ", "PlanDefinition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrievePlanDefinition ]");
	}

	@Test
	public void testRetrieveProcessRequest() {
		Response response = get("/ProcessRequest");
		if (200 == response.getStatusCode()) {
	  	List<ProcessRequest> result = Arrays.asList(response.getBody().as(ProcessRequest[].class));
	  	assertEquals("Expect ", "ProcessRequest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveProcessRequest ]");
	}

	@Test
	public void testRetrieveContract() {
		Response response = get("/Contract");
		if (200 == response.getStatusCode()) {
	  	List<Contract> result = Arrays.asList(response.getBody().as(Contract[].class));
	  	assertEquals("Expect ", "Contract", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveContract ]");
	}

	@Test
	public void testRetrieveTestScript() {
		Response response = get("/TestScript");
		if (200 == response.getStatusCode()) {
	  	List<TestScript> result = Arrays.asList(response.getBody().as(TestScript[].class));
	  	assertEquals("Expect ", "TestScript", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveTestScript ]");
	}

	@Test
	public void testRetrieveDevice() {
		Response response = get("/Device");
		if (200 == response.getStatusCode()) {
	  	List<Device> result = Arrays.asList(response.getBody().as(Device[].class));
	  	assertEquals("Expect ", "Device", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDevice ]");
	}

	@Test
	public void testRetrieveResearchStudy() {
		Response response = get("/ResearchStudy");
		if (200 == response.getStatusCode()) {
	  	List<ResearchStudy> result = Arrays.asList(response.getBody().as(ResearchStudy[].class));
	  	assertEquals("Expect ", "ResearchStudy", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveResearchStudy ]");
	}

	@Test
	public void testRetrievePatient() {
		Response response = get("/Patient");
		if (200 == response.getStatusCode()) {
	  	List<Patient> result = Arrays.asList(response.getBody().as(Patient[].class));
	  	assertEquals("Expect ", "Patient", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrievePatient ]");
	}

	@Test
	public void testRetrieveProvenance() {
		Response response = get("/Provenance");
		if (200 == response.getStatusCode()) {
	  	List<Provenance> result = Arrays.asList(response.getBody().as(Provenance[].class));
	  	assertEquals("Expect ", "Provenance", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveProvenance ]");
	}

	@Test
	public void testRetrieveEncounter() {
		Response response = get("/Encounter");
		if (200 == response.getStatusCode()) {
	  	List<Encounter> result = Arrays.asList(response.getBody().as(Encounter[].class));
	  	assertEquals("Expect ", "Encounter", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveEncounter ]");
	}

	@Test
	public void testRetrieveEpisodeOfCare() {
		Response response = get("/EpisodeOfCare");
		if (200 == response.getStatusCode()) {
	  	List<EpisodeOfCare> result = Arrays.asList(response.getBody().as(EpisodeOfCare[].class));
	  	assertEquals("Expect ", "EpisodeOfCare", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveEpisodeOfCare ]");
	}

	@Test
	public void testRetrieveChargeItem() {
		Response response = get("/ChargeItem");
		if (200 == response.getStatusCode()) {
	  	List<ChargeItem> result = Arrays.asList(response.getBody().as(ChargeItem[].class));
	  	assertEquals("Expect ", "ChargeItem", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveChargeItem ]");
	}

	@Test
	public void testRetrieveLibrary() {
		Response response = get("/Library");
		if (200 == response.getStatusCode()) {
	  	List<Library> result = Arrays.asList(response.getBody().as(Library[].class));
	  	assertEquals("Expect ", "Library", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveLibrary ]");
	}

	@Test
	public void testRetrieveSearchParameter() {
		Response response = get("/SearchParameter");
		if (200 == response.getStatusCode()) {
	  	List<SearchParameter> result = Arrays.asList(response.getBody().as(SearchParameter[].class));
	  	assertEquals("Expect ", "SearchParameter", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveSearchParameter ]");
	}

	@Test
	public void testRetrieveCondition() {
		Response response = get("/Condition");
		if (200 == response.getStatusCode()) {
	  	List<Condition> result = Arrays.asList(response.getBody().as(Condition[].class));
	  	assertEquals("Expect ", "Condition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveCondition ]");
	}

	@Test
	public void testRetrieveSchedule() {
		Response response = get("/Schedule");
		if (200 == response.getStatusCode()) {
	  	List<Schedule> result = Arrays.asList(response.getBody().as(Schedule[].class));
	  	assertEquals("Expect ", "Schedule", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveSchedule ]");
	}

	@Test
	public void testRetrieveMedicationRequest() {
		Response response = get("/MedicationRequest");
		if (200 == response.getStatusCode()) {
	  	List<MedicationRequest> result = Arrays.asList(response.getBody().as(MedicationRequest[].class));
	  	assertEquals("Expect ", "MedicationRequest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMedicationRequest ]");
	}

	@Test
	public void testRetrieveCoverage() {
		Response response = get("/Coverage");
		if (200 == response.getStatusCode()) {
	  	List<Coverage> result = Arrays.asList(response.getBody().as(Coverage[].class));
	  	assertEquals("Expect ", "Coverage", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveCoverage ]");
	}

	@Test
	public void testRetrievePaymentNotice() {
		Response response = get("/PaymentNotice");
		if (200 == response.getStatusCode()) {
	  	List<PaymentNotice> result = Arrays.asList(response.getBody().as(PaymentNotice[].class));
	  	assertEquals("Expect ", "PaymentNotice", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrievePaymentNotice ]");
	}

	@Test
	public void testRetrieveDeviceComponent() {
		Response response = get("/DeviceComponent");
		if (200 == response.getStatusCode()) {
	  	List<DeviceComponent> result = Arrays.asList(response.getBody().as(DeviceComponent[].class));
	  	assertEquals("Expect ", "DeviceComponent", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDeviceComponent ]");
	}

	@Test
	public void testRetrieveDetectedIssue() {
		Response response = get("/DetectedIssue");
		if (200 == response.getStatusCode()) {
	  	List<DetectedIssue> result = Arrays.asList(response.getBody().as(DetectedIssue[].class));
	  	assertEquals("Expect ", "DetectedIssue", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDetectedIssue ]");
	}

	@Test
	public void testRetrieveNamingSystem() {
		Response response = get("/NamingSystem");
		if (200 == response.getStatusCode()) {
	  	List<NamingSystem> result = Arrays.asList(response.getBody().as(NamingSystem[].class));
	  	assertEquals("Expect ", "NamingSystem", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveNamingSystem ]");
	}

	@Test
	public void testRetrieveAppointment() {
		Response response = get("/Appointment");
		if (200 == response.getStatusCode()) {
	  	List<Appointment> result = Arrays.asList(response.getBody().as(Appointment[].class));
	  	assertEquals("Expect ", "Appointment", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveAppointment ]");
	}

	@Test
	public void testRetrieveExplanationOfBenefit() {
		Response response = get("/ExplanationOfBenefit");
		if (200 == response.getStatusCode()) {
	  	List<ExplanationOfBenefit> result = Arrays.asList(response.getBody().as(ExplanationOfBenefit[].class));
	  	assertEquals("Expect ", "ExplanationOfBenefit", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveExplanationOfBenefit ]");
	}

	@Test
	public void testRetrieveLocation() {
		Response response = get("/Location");
		if (200 == response.getStatusCode()) {
	  	List<Location> result = Arrays.asList(response.getBody().as(Location[].class));
	  	assertEquals("Expect ", "Location", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveLocation ]");
	}

	@Test
	public void testRetrieveMeasure() {
		Response response = get("/Measure");
		if (200 == response.getStatusCode()) {
	  	List<Measure> result = Arrays.asList(response.getBody().as(Measure[].class));
	  	assertEquals("Expect ", "Measure", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMeasure ]");
	}

	@Test
	public void testRetrieveRiskAssessment() {
		Response response = get("/RiskAssessment");
		if (200 == response.getStatusCode()) {
	  	List<RiskAssessment> result = Arrays.asList(response.getBody().as(RiskAssessment[].class));
	  	assertEquals("Expect ", "RiskAssessment", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveRiskAssessment ]");
	}

	@Test
	public void testRetrieveRelatedPerson() {
		Response response = get("/RelatedPerson");
		if (200 == response.getStatusCode()) {
	  	List<RelatedPerson> result = Arrays.asList(response.getBody().as(RelatedPerson[].class));
	  	assertEquals("Expect ", "RelatedPerson", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveRelatedPerson ]");
	}

	@Test
	public void testRetrieveAppointmentResponse() {
		Response response = get("/AppointmentResponse");
		if (200 == response.getStatusCode()) {
	  	List<AppointmentResponse> result = Arrays.asList(response.getBody().as(AppointmentResponse[].class));
	  	assertEquals("Expect ", "AppointmentResponse", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveAppointmentResponse ]");
	}

	@Test
	public void testRetrieveMedicationStatement() {
		Response response = get("/MedicationStatement");
		if (200 == response.getStatusCode()) {
	  	List<MedicationStatement> result = Arrays.asList(response.getBody().as(MedicationStatement[].class));
	  	assertEquals("Expect ", "MedicationStatement", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMedicationStatement ]");
	}

	@Test
	public void testRetrieveSlot() {
		Response response = get("/Slot");
		if (200 == response.getStatusCode()) {
	  	List<Slot> result = Arrays.asList(response.getBody().as(Slot[].class));
	  	assertEquals("Expect ", "Slot", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveSlot ]");
	}

	@Test
	public void testRetrieveAccount() {
		Response response = get("/Account");
		if (200 == response.getStatusCode()) {
	  	List<Account> result = Arrays.asList(response.getBody().as(Account[].class));
	  	assertEquals("Expect ", "Account", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveAccount ]");
	}

	@Test
	public void testRetrieveBasic() {
		Response response = get("/Basic");
		if (200 == response.getStatusCode()) {
	  	List<Basic> result = Arrays.asList(response.getBody().as(Basic[].class));
	  	assertEquals("Expect ", "Basic", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveBasic ]");
	}

	@Test
	public void testRetrievePractitionerRole() {
		Response response = get("/PractitionerRole");
		if (200 == response.getStatusCode()) {
	  	List<PractitionerRole> result = Arrays.asList(response.getBody().as(PractitionerRole[].class));
	  	assertEquals("Expect ", "PractitionerRole", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrievePractitionerRole ]");
	}

	@Test
	public void testRetrieveMedicationAdministration() {
		Response response = get("/MedicationAdministration");
		if (200 == response.getStatusCode()) {
	  	List<MedicationAdministration> result = Arrays.asList(response.getBody().as(MedicationAdministration[].class));
	  	assertEquals("Expect ", "MedicationAdministration", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMedicationAdministration ]");
	}

	@Test
	public void testRetrieveCareTeam() {
		Response response = get("/CareTeam");
		if (200 == response.getStatusCode()) {
	  	List<CareTeam> result = Arrays.asList(response.getBody().as(CareTeam[].class));
	  	assertEquals("Expect ", "CareTeam", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveCareTeam ]");
	}

	@Test
	public void testRetrieveSpecimen() {
		Response response = get("/Specimen");
		if (200 == response.getStatusCode()) {
	  	List<Specimen> result = Arrays.asList(response.getBody().as(Specimen[].class));
	  	assertEquals("Expect ", "Specimen", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveSpecimen ]");
	}

	@Test
	public void testRetrieveFlag() {
		Response response = get("/Flag");
		if (200 == response.getStatusCode()) {
	  	List<Flag> result = Arrays.asList(response.getBody().as(Flag[].class));
	  	assertEquals("Expect ", "Flag", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveFlag ]");
	}

	@Test
	public void testRetrieveDeviceMetric() {
		Response response = get("/DeviceMetric");
		if (200 == response.getStatusCode()) {
	  	List<DeviceMetric> result = Arrays.asList(response.getBody().as(DeviceMetric[].class));
	  	assertEquals("Expect ", "DeviceMetric", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDeviceMetric ]");
	}

	@Test
	public void testRetrieveBinary() {
		Response response = get("/Binary");
		if (200 == response.getStatusCode()) {
	  	List<Binary> result = Arrays.asList(response.getBody().as(Binary[].class));
	  	assertEquals("Expect ", "Binary", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveBinary ]");
	}

	@Test
	public void testRetrieveTask() {
		Response response = get("/Task");
		if (200 == response.getStatusCode()) {
	  	List<Task> result = Arrays.asList(response.getBody().as(Task[].class));
	  	assertEquals("Expect ", "Task", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveTask ]");
	}

	@Test
	public void testRetrieveGraphDefinition() {
		Response response = get("/GraphDefinition");
		if (200 == response.getStatusCode()) {
	  	List<GraphDefinition> result = Arrays.asList(response.getBody().as(GraphDefinition[].class));
	  	assertEquals("Expect ", "GraphDefinition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveGraphDefinition ]");
	}

	@Test
	public void testRetrieveCommunicationRequest() {
		Response response = get("/CommunicationRequest");
		if (200 == response.getStatusCode()) {
	  	List<CommunicationRequest> result = Arrays.asList(response.getBody().as(CommunicationRequest[].class));
	  	assertEquals("Expect ", "CommunicationRequest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveCommunicationRequest ]");
	}

	@Test
	public void testRetrieveEligibilityResponse() {
		Response response = get("/EligibilityResponse");
		if (200 == response.getStatusCode()) {
	  	List<EligibilityResponse> result = Arrays.asList(response.getBody().as(EligibilityResponse[].class));
	  	assertEquals("Expect ", "EligibilityResponse", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveEligibilityResponse ]");
	}

	@Test
	public void testRetrieveCompartmentDefinition() {
		Response response = get("/CompartmentDefinition");
		if (200 == response.getStatusCode()) {
	  	List<CompartmentDefinition> result = Arrays.asList(response.getBody().as(CompartmentDefinition[].class));
	  	assertEquals("Expect ", "CompartmentDefinition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveCompartmentDefinition ]");
	}

	@Test
	public void testRetrieveResearchSubject() {
		Response response = get("/ResearchSubject");
		if (200 == response.getStatusCode()) {
	  	List<ResearchSubject> result = Arrays.asList(response.getBody().as(ResearchSubject[].class));
	  	assertEquals("Expect ", "ResearchSubject", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveResearchSubject ]");
	}

	@Test
	public void testRetrieveReferralRequest() {
		Response response = get("/ReferralRequest");
		if (200 == response.getStatusCode()) {
	  	List<ReferralRequest> result = Arrays.asList(response.getBody().as(ReferralRequest[].class));
	  	assertEquals("Expect ", "ReferralRequest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveReferralRequest ]");
	}

	@Test
	public void testRetrieveDataElement() {
		Response response = get("/DataElement");
		if (200 == response.getStatusCode()) {
	  	List<DataElement> result = Arrays.asList(response.getBody().as(DataElement[].class));
	  	assertEquals("Expect ", "DataElement", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDataElement ]");
	}

	@Test
	public void testRetrieveImagingStudy() {
		Response response = get("/ImagingStudy");
		if (200 == response.getStatusCode()) {
	  	List<ImagingStudy> result = Arrays.asList(response.getBody().as(ImagingStudy[].class));
	  	assertEquals("Expect ", "ImagingStudy", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveImagingStudy ]");
	}

	@Test
	public void testRetrieveCommunication() {
		Response response = get("/Communication");
		if (200 == response.getStatusCode()) {
	  	List<Communication> result = Arrays.asList(response.getBody().as(Communication[].class));
	  	assertEquals("Expect ", "Communication", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveCommunication ]");
	}

	@Test
	public void testRetrieveEligibilityRequest() {
		Response response = get("/EligibilityRequest");
		if (200 == response.getStatusCode()) {
	  	List<EligibilityRequest> result = Arrays.asList(response.getBody().as(EligibilityRequest[].class));
	  	assertEquals("Expect ", "EligibilityRequest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveEligibilityRequest ]");
	}

	@Test
	public void testRetrieveMedia() {
		Response response = get("/Media");
		if (200 == response.getStatusCode()) {
	  	List<Media> result = Arrays.asList(response.getBody().as(Media[].class));
	  	assertEquals("Expect ", "Media", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMedia ]");
	}

	@Test
	public void testRetrieveRequestGroup() {
		Response response = get("/RequestGroup");
		if (200 == response.getStatusCode()) {
	  	List<RequestGroup> result = Arrays.asList(response.getBody().as(RequestGroup[].class));
	  	assertEquals("Expect ", "RequestGroup", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveRequestGroup ]");
	}

	@Test
	public void testRetrieveGoal() {
		Response response = get("/Goal");
		if (200 == response.getStatusCode()) {
	  	List<Goal> result = Arrays.asList(response.getBody().as(Goal[].class));
	  	assertEquals("Expect ", "Goal", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveGoal ]");
	}

	@Test
	public void testRetrieveProcessResponse() {
		Response response = get("/ProcessResponse");
		if (200 == response.getStatusCode()) {
	  	List<ProcessResponse> result = Arrays.asList(response.getBody().as(ProcessResponse[].class));
	  	assertEquals("Expect ", "ProcessResponse", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveProcessResponse ]");
	}

	@Test
	public void testRetrieveSubscription() {
		Response response = get("/Subscription");
		if (200 == response.getStatusCode()) {
	  	List<Subscription> result = Arrays.asList(response.getBody().as(Subscription[].class));
	  	assertEquals("Expect ", "Subscription", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveSubscription ]");
	}

	@Test
	public void testRetrieveGroup() {
		Response response = get("/Group");
		if (200 == response.getStatusCode()) {
	  	List<Group> result = Arrays.asList(response.getBody().as(Group[].class));
	  	assertEquals("Expect ", "Group", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveGroup ]");
	}

	@Test
	public void testRetrieveComposition() {
		Response response = get("/Composition");
		if (200 == response.getStatusCode()) {
	  	List<Composition> result = Arrays.asList(response.getBody().as(Composition[].class));
	  	assertEquals("Expect ", "Composition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveComposition ]");
	}

	@Test
	public void testRetrieveCapabilityStatement() {
		Response response = get("/CapabilityStatement");
		if (200 == response.getStatusCode()) {
	  	List<CapabilityStatement> result = Arrays.asList(response.getBody().as(CapabilityStatement[].class));
	  	assertEquals("Expect ", "CapabilityStatement", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveCapabilityStatement ]");
	}

	@Test
	public void testRetrieveMessageDefinition() {
		Response response = get("/MessageDefinition");
		if (200 == response.getStatusCode()) {
	  	List<MessageDefinition> result = Arrays.asList(response.getBody().as(MessageDefinition[].class));
	  	assertEquals("Expect ", "MessageDefinition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMessageDefinition ]");
	}

	@Test
	public void testRetrieveDeviceRequest() {
		Response response = get("/DeviceRequest");
		if (200 == response.getStatusCode()) {
	  	List<DeviceRequest> result = Arrays.asList(response.getBody().as(DeviceRequest[].class));
	  	assertEquals("Expect ", "DeviceRequest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDeviceRequest ]");
	}

	@Test
	public void testRetrieveClinicalImpression() {
		Response response = get("/ClinicalImpression");
		if (200 == response.getStatusCode()) {
	  	List<ClinicalImpression> result = Arrays.asList(response.getBody().as(ClinicalImpression[].class));
	  	assertEquals("Expect ", "ClinicalImpression", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveClinicalImpression ]");
	}

	@Test
	public void testRetrieveImagingManifest() {
		Response response = get("/ImagingManifest");
		if (200 == response.getStatusCode()) {
	  	List<ImagingManifest> result = Arrays.asList(response.getBody().as(ImagingManifest[].class));
	  	assertEquals("Expect ", "ImagingManifest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveImagingManifest ]");
	}

	@Test
	public void testRetrieveStructureMap() {
		Response response = get("/StructureMap");
		if (200 == response.getStatusCode()) {
	  	List<StructureMap> result = Arrays.asList(response.getBody().as(StructureMap[].class));
	  	assertEquals("Expect ", "StructureMap", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveStructureMap ]");
	}

	@Test
	public void testRetrieveImplementationGuide() {
		Response response = get("/ImplementationGuide");
		if (200 == response.getStatusCode()) {
	  	List<ImplementationGuide> result = Arrays.asList(response.getBody().as(ImplementationGuide[].class));
	  	assertEquals("Expect ", "ImplementationGuide", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveImplementationGuide ]");
	}

	@Test
	public void testRetrieveMeasureReport() {
		Response response = get("/MeasureReport");
		if (200 == response.getStatusCode()) {
	  	List<MeasureReport> result = Arrays.asList(response.getBody().as(MeasureReport[].class));
	  	assertEquals("Expect ", "MeasureReport", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMeasureReport ]");
	}

	@Test
	public void testRetrieveEnrollmentRequest() {
		Response response = get("/EnrollmentRequest");
		if (200 == response.getStatusCode()) {
	  	List<EnrollmentRequest> result = Arrays.asList(response.getBody().as(EnrollmentRequest[].class));
	  	assertEquals("Expect ", "EnrollmentRequest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveEnrollmentRequest ]");
	}

	@Test
	public void testRetrieveSupplyRequest() {
		Response response = get("/SupplyRequest");
		if (200 == response.getStatusCode()) {
	  	List<SupplyRequest> result = Arrays.asList(response.getBody().as(SupplyRequest[].class));
	  	assertEquals("Expect ", "SupplyRequest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveSupplyRequest ]");
	}

	@Test
	public void testRetrieveDocumentReference() {
		Response response = get("/DocumentReference");
		if (200 == response.getStatusCode()) {
	  	List<DocumentReference> result = Arrays.asList(response.getBody().as(DocumentReference[].class));
	  	assertEquals("Expect ", "DocumentReference", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDocumentReference ]");
	}

	@Test
	public void testRetrievePerson() {
		Response response = get("/Person");
		if (200 == response.getStatusCode()) {
	  	List<Person> result = Arrays.asList(response.getBody().as(Person[].class));
	  	assertEquals("Expect ", "Person", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrievePerson ]");
	}

	@Test
	public void testRetrieveGuidanceResponse() {
		Response response = get("/GuidanceResponse");
		if (200 == response.getStatusCode()) {
	  	List<GuidanceResponse> result = Arrays.asList(response.getBody().as(GuidanceResponse[].class));
	  	assertEquals("Expect ", "GuidanceResponse", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveGuidanceResponse ]");
	}

	@Test
	public void testRetrievePaymentReconciliation() {
		Response response = get("/PaymentReconciliation");
		if (200 == response.getStatusCode()) {
	  	List<PaymentReconciliation> result = Arrays.asList(response.getBody().as(PaymentReconciliation[].class));
	  	assertEquals("Expect ", "PaymentReconciliation", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrievePaymentReconciliation ]");
	}

	@Test
	public void testRetrieveTestReport() {
		Response response = get("/TestReport");
		if (200 == response.getStatusCode()) {
	  	List<TestReport> result = Arrays.asList(response.getBody().as(TestReport[].class));
	  	assertEquals("Expect ", "TestReport", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveTestReport ]");
	}

	@Test
	public void testRetrieveExpansionProfile() {
		Response response = get("/ExpansionProfile");
		if (200 == response.getStatusCode()) {
	  	List<ExpansionProfile> result = Arrays.asList(response.getBody().as(ExpansionProfile[].class));
	  	assertEquals("Expect ", "ExpansionProfile", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveExpansionProfile ]");
	}

	@Test
	public void testRetrieveClaimResponse() {
		Response response = get("/ClaimResponse");
		if (200 == response.getStatusCode()) {
	  	List<ClaimResponse> result = Arrays.asList(response.getBody().as(ClaimResponse[].class));
	  	assertEquals("Expect ", "ClaimResponse", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveClaimResponse ]");
	}

	@Test
	public void testRetrieveImmunization() {
		Response response = get("/Immunization");
		if (200 == response.getStatusCode()) {
	  	List<Immunization> result = Arrays.asList(response.getBody().as(Immunization[].class));
	  	assertEquals("Expect ", "Immunization", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveImmunization ]");
	}

	@Test
	public void testRetrieveDocumentManifest() {
		Response response = get("/DocumentManifest");
		if (200 == response.getStatusCode()) {
	  	List<DocumentManifest> result = Arrays.asList(response.getBody().as(DocumentManifest[].class));
	  	assertEquals("Expect ", "DocumentManifest", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDocumentManifest ]");
	}

	@Test
	public void testRetrieveLinkage() {
		Response response = get("/Linkage");
		if (200 == response.getStatusCode()) {
	  	List<Linkage> result = Arrays.asList(response.getBody().as(Linkage[].class));
	  	assertEquals("Expect ", "Linkage", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveLinkage ]");
	}

	@Test
	public void testRetrieveMessageHeader() {
		Response response = get("/MessageHeader");
		if (200 == response.getStatusCode()) {
	  	List<MessageHeader> result = Arrays.asList(response.getBody().as(MessageHeader[].class));
	  	assertEquals("Expect ", "MessageHeader", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveMessageHeader ]");
	}

	@Test
	public void testRetrieveServiceDefinition() {
		Response response = get("/ServiceDefinition");
		if (200 == response.getStatusCode()) {
	  	List<ServiceDefinition> result = Arrays.asList(response.getBody().as(ServiceDefinition[].class));
	  	assertEquals("Expect ", "ServiceDefinition", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveServiceDefinition ]");
	}

	@Test
	public void testRetrieveDeviceUseStatement() {
		Response response = get("/DeviceUseStatement");
		if (200 == response.getStatusCode()) {
	  	List<DeviceUseStatement> result = Arrays.asList(response.getBody().as(DeviceUseStatement[].class));
	  	assertEquals("Expect ", "DeviceUseStatement", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveDeviceUseStatement ]");
	}

	@Test
	public void testRetrieveSupplyDelivery() {
		Response response = get("/SupplyDelivery");
		if (200 == response.getStatusCode()) {
	  	List<SupplyDelivery> result = Arrays.asList(response.getBody().as(SupplyDelivery[].class));
	  	assertEquals("Expect ", "SupplyDelivery", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveSupplyDelivery ]");
	}

	@Test
	public void testRetrieveHealthcareService() {
		Response response = get("/HealthcareService");
		if (200 == response.getStatusCode()) {
	  	List<HealthcareService> result = Arrays.asList(response.getBody().as(HealthcareService[].class));
	  	assertEquals("Expect ", "HealthcareService", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveHealthcareService ]");
	}

	@Test
	public void testRetrieveEnrollmentResponse() {
		Response response = get("/EnrollmentResponse");
		if (200 == response.getStatusCode()) {
	  	List<EnrollmentResponse> result = Arrays.asList(response.getBody().as(EnrollmentResponse[].class));
	  	assertEquals("Expect ", "EnrollmentResponse", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveEnrollmentResponse ]");
	}

	@Test
	public void testRetrieveAdverseEvent() {
		Response response = get("/AdverseEvent");
		if (200 == response.getStatusCode()) {
	  	List<AdverseEvent> result = Arrays.asList(response.getBody().as(AdverseEvent[].class));
	  	assertEquals("Expect ", "AdverseEvent", result.get(0).getResourceType()); 
		} else System.out.println("No data found [ testRetrieveAdverseEvent ]");
	}
}