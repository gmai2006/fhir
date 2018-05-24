package org.fhir.dataloader;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.fhir.dao.*;
import org.fhir.pojo.*;
import org.fhir.utils.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import org.fhir.dao.*;

/* *
 * Auto generated from the FHIR samples-json
 * Test read json from json file and convert to coresponding Java class
 * testing data are extracted from the json files
 */
public class TestRetrieval {
	static Injector injector;
  static PersistService service;
	String inputFile;
  String json;
  Object result;
  static int count = 0;
  static  java.util.Map<String, String> duplicates = new java.util.HashMap<>();

 @Inject AppointmentDaoImpl appointmentDao; 
 @Inject AccountDaoImpl accountDao; 
 @Inject ReferralRequestDaoImpl referralrequestDao; 
 @Inject MessageDefinitionDaoImpl messagedefinitionDao; 
 @Inject DocumentManifestDaoImpl documentmanifestDao; 
 @Inject GoalDaoImpl goalDao; 
 @Inject EndpointDaoImpl endpointDao; 
 @Inject EnrollmentRequestDaoImpl enrollmentrequestDao; 
 @Inject ConsentDaoImpl consentDao; 
 @Inject MedicationDaoImpl medicationDao; 
 @Inject MeasureDaoImpl measureDao; 
 @Inject CapabilityStatementDaoImpl capabilitystatementDao; 
 @Inject ResearchSubjectDaoImpl researchsubjectDao; 
 @Inject SubscriptionDaoImpl subscriptionDao; 
 @Inject GraphDefinitionDaoImpl graphdefinitionDao; 
 @Inject DocumentReferenceDaoImpl documentreferenceDao; 
 @Inject ImagingManifestDaoImpl imagingmanifestDao; 
 @Inject FHIRListDaoImpl fhirlistDao; 
 @Inject MeasureReportDaoImpl measurereportDao; 
 @Inject PractitionerRoleDaoImpl practitionerroleDao; 
 @Inject RelatedPersonDaoImpl relatedpersonDao; 
 @Inject SupplyRequestDaoImpl supplyrequestDao; 
 @Inject PractitionerDaoImpl practitionerDao; 
 @Inject ExpansionProfileDaoImpl expansionprofileDao; 
 @Inject SlotDaoImpl slotDao; 
 @Inject ContractDaoImpl contractDao; 
 @Inject PersonDaoImpl personDao; 
 @Inject RiskAssessmentDaoImpl riskassessmentDao; 
 @Inject PaymentNoticeDaoImpl paymentnoticeDao; 
 @Inject GroupDaoImpl groupDao; 
 @Inject OrganizationDaoImpl organizationDao; 
 @Inject CareTeamDaoImpl careteamDao; 
 @Inject ImplementationGuideDaoImpl implementationguideDao; 
 @Inject ImagingStudyDaoImpl imagingstudyDao; 
 @Inject DeviceComponentDaoImpl devicecomponentDao; 
 @Inject FamilyMemberHistoryDaoImpl familymemberhistoryDao; 
 @Inject ChargeItemDaoImpl chargeitemDao; 
 @Inject SubstanceDaoImpl substanceDao; 
 @Inject EncounterDaoImpl encounterDao; 
 @Inject SearchParameterDaoImpl searchparameterDao; 
 @Inject ServiceDefinitionDaoImpl servicedefinitionDao; 
 @Inject ActivityDefinitionDaoImpl activitydefinitionDao; 
 @Inject CommunicationDaoImpl communicationDao; 
 @Inject LinkageDaoImpl linkageDao; 
 @Inject DeviceUseStatementDaoImpl deviceusestatementDao; 
 @Inject RequestGroupDaoImpl requestgroupDao; 
 @Inject DeviceRequestDaoImpl devicerequestDao; 
 @Inject MessageHeaderDaoImpl messageheaderDao; 
 @Inject ImmunizationRecommendationDaoImpl immunizationrecommendationDao; 
 @Inject BodySiteDaoImpl bodysiteDao; 
 @Inject ProvenanceDaoImpl provenanceDao; 
 @Inject TaskDaoImpl taskDao; 
 @Inject QuestionnaireDaoImpl questionnaireDao; 
 @Inject ExplanationOfBenefitDaoImpl explanationofbenefitDao; 
 @Inject ResearchStudyDaoImpl researchstudyDao; 
 @Inject SpecimenDaoImpl specimenDao; 
 @Inject StructureDefinitionDaoImpl structuredefinitionDao; 
 @Inject CarePlanDaoImpl careplanDao; 
 @Inject AllergyIntoleranceDaoImpl allergyintoleranceDao; 
 @Inject EpisodeOfCareDaoImpl episodeofcareDao; 
 @Inject ProcedureDaoImpl procedureDao; 
 @Inject ConceptMapDaoImpl conceptmapDao; 
 @Inject ValueSetDaoImpl valuesetDao; 
 @Inject OperationDefinitionDaoImpl operationdefinitionDao; 
 @Inject MedicationRequestDaoImpl medicationrequestDao; 
 @Inject ImmunizationDaoImpl immunizationDao; 
 @Inject DeviceDaoImpl deviceDao; 
 @Inject VisionPrescriptionDaoImpl visionprescriptionDao; 
 @Inject MediaDaoImpl mediaDao; 
 @Inject ProcedureRequestDaoImpl procedurerequestDao; 
 @Inject EligibilityResponseDaoImpl eligibilityresponseDao; 
 @Inject SequenceDaoImpl sequenceDao; 
 @Inject DeviceMetricDaoImpl devicemetricDao; 
 @Inject CodeSystemDaoImpl codesystemDao; 
 @Inject FlagDaoImpl flagDao; 
 @Inject AppointmentResponseDaoImpl appointmentresponseDao; 
 @Inject StructureMapDaoImpl structuremapDao; 
 @Inject AdverseEventDaoImpl adverseeventDao; 
 @Inject GuidanceResponseDaoImpl guidanceresponseDao; 
 @Inject ObservationDaoImpl observationDao; 
 @Inject MedicationAdministrationDaoImpl medicationadministrationDao; 
 @Inject EnrollmentResponseDaoImpl enrollmentresponseDao; 
 @Inject LibraryDaoImpl libraryDao; 
 @Inject BinaryDaoImpl binaryDao; 
 @Inject MedicationStatementDaoImpl medicationstatementDao; 
 @Inject CommunicationRequestDaoImpl communicationrequestDao; 
 @Inject TestScriptDaoImpl testscriptDao; 
 @Inject BasicDaoImpl basicDao; 
 @Inject TestReportDaoImpl testreportDao; 
 @Inject ProcessRequestDaoImpl processrequestDao; 
 @Inject EligibilityRequestDaoImpl eligibilityrequestDao; 
 @Inject ClaimResponseDaoImpl claimresponseDao; 
 @Inject MedicationDispenseDaoImpl medicationdispenseDao; 
 @Inject DiagnosticReportDaoImpl diagnosticreportDao; 
 @Inject HealthcareServiceDaoImpl healthcareserviceDao; 
 @Inject DataElementDaoImpl dataelementDao; 
 @Inject NutritionOrderDaoImpl nutritionorderDao; 
 @Inject AuditEventDaoImpl auditeventDao; 
 @Inject PaymentReconciliationDaoImpl paymentreconciliationDao; 
 @Inject ConditionDaoImpl conditionDao; 
 @Inject CompositionDaoImpl compositionDao; 
 @Inject DetectedIssueDaoImpl detectedissueDao; 
 @Inject BundleDaoImpl bundleDao; 
 @Inject CompartmentDefinitionDaoImpl compartmentdefinitionDao; 
 @Inject PatientDaoImpl patientDao; 
 @Inject CoverageDaoImpl coverageDao; 
 @Inject QuestionnaireResponseDaoImpl questionnaireresponseDao; 
 @Inject ProcessResponseDaoImpl processresponseDao; 
 @Inject NamingSystemDaoImpl namingsystemDao; 
 @Inject ScheduleDaoImpl scheduleDao; 
 @Inject SupplyDeliveryDaoImpl supplydeliveryDao; 
 @Inject ClinicalImpressionDaoImpl clinicalimpressionDao; 
 @Inject PlanDefinitionDaoImpl plandefinitionDao; 
 @Inject ClaimDaoImpl claimDao; 
 @Inject LocationDaoImpl locationDao; 

 protected List<Module> getModules() {
 	return Arrays.asList(new AbstractModule() {
     @Override
     protected void configure() {
       install(new JpaPersistModule("fhirtest"));
       final Module testModule = getTestModule();
       if (null != testModule) {
           install(testModule);
       }
     }
   });
 }

  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(AppointmentDaoImpl.class);
            bind(AccountDaoImpl.class);
            bind(ReferralRequestDaoImpl.class);
            bind(MessageDefinitionDaoImpl.class);
            bind(DocumentManifestDaoImpl.class);
            bind(GoalDaoImpl.class);
            bind(EndpointDaoImpl.class);
            bind(EnrollmentRequestDaoImpl.class);
            bind(ConsentDaoImpl.class);
            bind(MedicationDaoImpl.class);
            bind(MeasureDaoImpl.class);
            bind(CapabilityStatementDaoImpl.class);
            bind(ResearchSubjectDaoImpl.class);
            bind(SubscriptionDaoImpl.class);
            bind(GraphDefinitionDaoImpl.class);
            bind(DocumentReferenceDaoImpl.class);
            bind(ImagingManifestDaoImpl.class);
            bind(FHIRListDaoImpl.class);
            bind(MeasureReportDaoImpl.class);
            bind(PractitionerRoleDaoImpl.class);
            bind(RelatedPersonDaoImpl.class);
            bind(SupplyRequestDaoImpl.class);
            bind(PractitionerDaoImpl.class);
            bind(ExpansionProfileDaoImpl.class);
            bind(SlotDaoImpl.class);
            bind(ContractDaoImpl.class);
            bind(PersonDaoImpl.class);
            bind(RiskAssessmentDaoImpl.class);
            bind(PaymentNoticeDaoImpl.class);
            bind(GroupDaoImpl.class);
            bind(OrganizationDaoImpl.class);
            bind(CareTeamDaoImpl.class);
            bind(ImplementationGuideDaoImpl.class);
            bind(ImagingStudyDaoImpl.class);
            bind(DeviceComponentDaoImpl.class);
            bind(FamilyMemberHistoryDaoImpl.class);
            bind(ChargeItemDaoImpl.class);
            bind(SubstanceDaoImpl.class);
            bind(EncounterDaoImpl.class);
            bind(SearchParameterDaoImpl.class);
            bind(ServiceDefinitionDaoImpl.class);
            bind(ActivityDefinitionDaoImpl.class);
            bind(CommunicationDaoImpl.class);
            bind(LinkageDaoImpl.class);
            bind(DeviceUseStatementDaoImpl.class);
            bind(RequestGroupDaoImpl.class);
            bind(DeviceRequestDaoImpl.class);
            bind(MessageHeaderDaoImpl.class);
            bind(ImmunizationRecommendationDaoImpl.class);
            bind(BodySiteDaoImpl.class);
            bind(ProvenanceDaoImpl.class);
            bind(TaskDaoImpl.class);
            bind(QuestionnaireDaoImpl.class);
            bind(ExplanationOfBenefitDaoImpl.class);
            bind(ResearchStudyDaoImpl.class);
            bind(SpecimenDaoImpl.class);
            bind(StructureDefinitionDaoImpl.class);
            bind(CarePlanDaoImpl.class);
            bind(AllergyIntoleranceDaoImpl.class);
            bind(EpisodeOfCareDaoImpl.class);
            bind(ProcedureDaoImpl.class);
            bind(ConceptMapDaoImpl.class);
            bind(ValueSetDaoImpl.class);
            bind(OperationDefinitionDaoImpl.class);
            bind(MedicationRequestDaoImpl.class);
            bind(ImmunizationDaoImpl.class);
            bind(DeviceDaoImpl.class);
            bind(VisionPrescriptionDaoImpl.class);
            bind(MediaDaoImpl.class);
            bind(ProcedureRequestDaoImpl.class);
            bind(EligibilityResponseDaoImpl.class);
            bind(SequenceDaoImpl.class);
            bind(DeviceMetricDaoImpl.class);
            bind(CodeSystemDaoImpl.class);
            bind(FlagDaoImpl.class);
            bind(AppointmentResponseDaoImpl.class);
            bind(StructureMapDaoImpl.class);
            bind(AdverseEventDaoImpl.class);
            bind(GuidanceResponseDaoImpl.class);
            bind(ObservationDaoImpl.class);
            bind(MedicationAdministrationDaoImpl.class);
            bind(EnrollmentResponseDaoImpl.class);
            bind(LibraryDaoImpl.class);
            bind(BinaryDaoImpl.class);
            bind(MedicationStatementDaoImpl.class);
            bind(CommunicationRequestDaoImpl.class);
            bind(TestScriptDaoImpl.class);
            bind(BasicDaoImpl.class);
            bind(TestReportDaoImpl.class);
            bind(ProcessRequestDaoImpl.class);
            bind(EligibilityRequestDaoImpl.class);
            bind(ClaimResponseDaoImpl.class);
            bind(MedicationDispenseDaoImpl.class);
            bind(DiagnosticReportDaoImpl.class);
            bind(HealthcareServiceDaoImpl.class);
            bind(DataElementDaoImpl.class);
            bind(NutritionOrderDaoImpl.class);
            bind(AuditEventDaoImpl.class);
            bind(PaymentReconciliationDaoImpl.class);
            bind(ConditionDaoImpl.class);
            bind(CompositionDaoImpl.class);
            bind(DetectedIssueDaoImpl.class);
            bind(BundleDaoImpl.class);
            bind(CompartmentDefinitionDaoImpl.class);
            bind(PatientDaoImpl.class);
            bind(CoverageDaoImpl.class);
            bind(QuestionnaireResponseDaoImpl.class);
            bind(ProcessResponseDaoImpl.class);
            bind(NamingSystemDaoImpl.class);
            bind(ScheduleDaoImpl.class);
            bind(SupplyDeliveryDaoImpl.class);
            bind(ClinicalImpressionDaoImpl.class);
            bind(PlanDefinitionDaoImpl.class);
            bind(ClaimDaoImpl.class);
            bind(LocationDaoImpl.class);
        }
    };
  }

  @Before
  public void setup() {
    final List<Module> modules = getModules();
    injector = Guice.createInjector(modules);
    service = injector.getInstance(PersistService.class);
    injector.injectMembers(this);
    service.start();
  }

  @After
  public void tearDownJpa() throws Exception {
    service.stop();
  }

  @Test
  public void test0() throws Exception {
  	Object local = null;
  	System.out.println("Total tests .. " + count);
  }
  @Test
  public void test310() throws Exception {
  	Object local = null;
  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Sequence [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("hdlcholesterol");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [hdlcholesterol]");
  	} else {
  		assertEquals("Expect ", "hdlcholesterol", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("fda-vcfeval-comparison");
  	if (null == result) {
  		System.out.println("Not found Sequence [fda-vcfeval-comparison]");
  	} else {
  		assertEquals("Expect ", "fda-vcfeval-comparison", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("familymemberhistory-severity");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [familymemberhistory-severity]");
  	} else {
  		assertEquals("Expect ", "familymemberhistory-severity", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contract-signer-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contract-signer-type]");
  	} else {
  		assertEquals("Expect ", "contract-signer-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FHIRList");
  	result = fhirlistDao.find("current-allergies");
  	if (null == result) {
  		System.out.println("Not found FHIRList [current-allergies]");
  	} else {
  		assertEquals("Expect ", "current-allergies", ((FHIRList)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("pureeddiet");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [pureeddiet]");
  	} else {
  		assertEquals("Expect ", "pureeddiet", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f002");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f002]");
  	} else {
  		assertEquals("Expect ", "f002", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("EligibilityResponse");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [EligibilityResponse]");
  	} else {
  		assertEquals("Expect ", "EligibilityResponse", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("hlaresult");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [hlaresult]");
  	} else {
  		assertEquals("Expect ", "hlaresult", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Measure");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Measure]");
  	} else {
  		assertEquals("Expect ", "Measure", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("parameter-group");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [parameter-group]");
  	} else {
  		assertEquals("Expect ", "parameter-group", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("device-statement-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [device-statement-status]");
  	} else {
  		assertEquals("Expect ", "device-statement-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("StructureMap-transform");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [StructureMap-transform]");
  	} else {
  		assertEquals("Expect ", "StructureMap-transform", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("v2-valuesets");
  	if (null == result) {
  		System.out.println("Not found Bundle [v2-valuesets]");
  	} else {
  		assertEquals("Expect ", "v2-valuesets", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("72ac8493-52ac-41bd-8d5d-7258c289b5ea");
  	if (null == result) {
  		System.out.println("Not found Bundle [72ac8493-52ac-41bd-8d5d-7258c289b5ea]");
  	} else {
  		assertEquals("Expect ", "72ac8493-52ac-41bd-8d5d-7258c289b5ea", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-postBox");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-postBox]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-postBox", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("SearchParameter");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [SearchParameter]");
  	} else {
  		assertEquals("Expect ", "SearchParameter", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("bodytemp");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [bodytemp]");
  	} else {
  		assertEquals("Expect ", "bodytemp", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-category]");
  	} else {
  		assertEquals("Expect ", "condition-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-location-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-location-status]");
  	} else {
  		assertEquals("Expect ", "encounter-location-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contract-content-derivative");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contract-content-derivative]");
  	} else {
  		assertEquals("Expect ", "contract-content-derivative", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("additional-instruction-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [additional-instruction-codes]");
  	} else {
  		assertEquals("Expect ", "additional-instruction-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0315");
  	if (null == result) {
  		System.out.println("Not found Medication [med0315]");
  	} else {
  		assertEquals("Expect ", "med0315", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0308");
  	if (null == result) {
  		System.out.println("Not found Medication [med0308]");
  	} else {
  		assertEquals("Expect ", "med0308", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("101");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [101]");
  	} else {
  		assertEquals("Expect ", "101", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("search-entry-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [search-entry-mode]");
  	} else {
  		assertEquals("Expect ", "search-entry-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("all-types");
  	if (null == result) {
  		System.out.println("Not found ValueSet [all-types]");
  	} else {
  		assertEquals("Expect ", "all-types", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ActivityDefinition");
  	result = activitydefinitionDao.find("provide-mosquito-prevention-advice");
  	if (null == result) {
  		System.out.println("Not found ActivityDefinition [provide-mosquito-prevention-advice]");
  	} else {
  		assertEquals("Expect ", "provide-mosquito-prevention-advice", ((ActivityDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("devicemetricobservation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [devicemetricobservation]");
  	} else {
  		assertEquals("Expect ", "devicemetricobservation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("bb");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [bb]");
  	} else {
  		assertEquals("Expect ", "bb", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("observation-relationshiptypes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [observation-relationshiptypes]");
  	} else {
  		assertEquals("Expect ", "observation-relationshiptypes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0306");
  	if (null == result) {
  		System.out.println("Not found Medication [med0306]");
  	} else {
  		assertEquals("Expect ", "med0306", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("surface");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [surface]");
  	} else {
  		assertEquals("Expect ", "surface", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("bodyweight");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [bodyweight]");
  	} else {
  		assertEquals("Expect ", "bodyweight", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("clinical-findings");
  	if (null == result) {
  		System.out.println("Not found ValueSet [clinical-findings]");
  	} else {
  		assertEquals("Expect ", "clinical-findings", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FamilyMemberHistory");
  	result = familymemberhistoryDao.find("father");
  	if (null == result) {
  		System.out.println("Not found FamilyMemberHistory [father]");
  	} else {
  		assertEquals("Expect ", "father", ((FamilyMemberHistory)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Composition-document");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Composition-document]");
  	} else {
  		assertEquals("Expect ", "Composition-document", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("auditevent-Anonymized");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [auditevent-Anonymized]");
  	} else {
  		assertEquals("Expect ", "auditevent-Anonymized", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("CapabilityStatement-conforms");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [CapabilityStatement-conforms]");
  	} else {
  		assertEquals("Expect ", "CapabilityStatement-conforms", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("entformula-additive");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [entformula-additive]");
  	} else {
  		assertEquals("Expect ", "entformula-additive", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ClinicalImpression");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ClinicalImpression]");
  	} else {
  		assertEquals("Expect ", "ClinicalImpression", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-bestpractice");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-bestpractice]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-bestpractice", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Linkage");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Linkage]");
  	} else {
  		assertEquals("Expect ", "Linkage", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("humanname-own-prefix");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [humanname-own-prefix]");
  	} else {
  		assertEquals("Expect ", "humanname-own-prefix", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AuditEvent");
  	result = auditeventDao.find("example-pixQuery");
  	if (null == result) {
  		System.out.println("Not found AuditEvent [example-pixQuery]");
  	} else {
  		assertEquals("Expect ", "example-pixQuery", ((AuditEvent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("CareTeam");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [CareTeam]");
  	} else {
  		assertEquals("Expect ", "CareTeam", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("example-pgx");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [example-pgx]");
  	} else {
  		assertEquals("Expect ", "example-pgx", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-medication-statement-status-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-medication-statement-status-v3]");
  	} else {
  		assertEquals("Expect ", "cm-medication-statement-status-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Resource");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Resource]");
  	} else {
  		assertEquals("Expect ", "Resource", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("coord-0-base");
  	if (null == result) {
  		System.out.println("Not found Sequence [coord-0-base]");
  	} else {
  		assertEquals("Expect ", "coord-0-base", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("ex-diagnosistype");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [ex-diagnosistype]");
  	} else {
  		assertEquals("Expect ", "ex-diagnosistype", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("missing-tooth-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [missing-tooth-reason]");
  	} else {
  		assertEquals("Expect ", "missing-tooth-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("list-item-flag");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [list-item-flag]");
  	} else {
  		assertEquals("Expect ", "list-item-flag", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("participationstatus");
  	if (null == result) {
  		System.out.println("Not found ValueSet [participationstatus]");
  	} else {
  		assertEquals("Expect ", "participationstatus", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("bodysite-relative-location");
  	if (null == result) {
  		System.out.println("Not found ValueSet [bodysite-relative-location]");
  	} else {
  		assertEquals("Expect ", "bodysite-relative-location", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("translation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [translation]");
  	} else {
  		assertEquals("Expect ", "translation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("MetadataResource");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [MetadataResource]");
  	} else {
  		assertEquals("Expect ", "MetadataResource", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ResearchSubject");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ResearchSubject]");
  	} else {
  		assertEquals("Expect ", "ResearchSubject", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0328");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0328]");
  	} else {
  		assertEquals("Expect ", "meddisp0328", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve VisionPrescription");
  	result = visionprescriptionDao.find("33123");
  	if (null == result) {
  		System.out.println("Not found VisionPrescription [33123]");
  	} else {
  		assertEquals("Expect ", "33123", ((VisionPrescription)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("mmanu");
  	if (null == result) {
  		System.out.println("Not found Organization [mmanu]");
  	} else {
  		assertEquals("Expect ", "mmanu", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("f202");
  	if (null == result) {
  		System.out.println("Not found CarePlan [f202]");
  	} else {
  		assertEquals("Expect ", "f202", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsDNARegionName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsDNARegionName]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsDNARegionName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("testscript-operation-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [testscript-operation-codes]");
  	} else {
  		assertEquals("Expect ", "testscript-operation-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("graphic-example-2");
  	if (null == result) {
  		System.out.println("Not found Sequence [graphic-example-2]");
  	} else {
  		assertEquals("Expect ", "graphic-example-2", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("goal-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [goal-category]");
  	} else {
  		assertEquals("Expect ", "goal-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ImmunizationRecommendation");
  	result = immunizationrecommendationDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ImmunizationRecommendation [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ImmunizationRecommendation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("biopsy");
  	if (null == result) {
  		System.out.println("Not found Procedure [biopsy]");
  	} else {
  		assertEquals("Expect ", "biopsy", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("102");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [102]");
  	} else {
  		assertEquals("Expect ", "102", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("SupplyRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [SupplyRequest]");
  	} else {
  		assertEquals("Expect ", "SupplyRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ImmunizationRecommendation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ImmunizationRecommendation]");
  	} else {
  		assertEquals("Expect ", "ImmunizationRecommendation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("operation-parameter-use");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [operation-parameter-use]");
  	} else {
  		assertEquals("Expect ", "operation-parameter-use", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve BodySite");
  	result = bodysiteDao.find("skin-patch");
  	if (null == result) {
  		System.out.println("Not found BodySite [skin-patch]");
  	} else {
  		assertEquals("Expect ", "skin-patch", ((BodySite)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("digital-media-subtype");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [digital-media-subtype]");
  	} else {
  		assertEquals("Expect ", "digital-media-subtype", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("audit-entity-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [audit-entity-type]");
  	} else {
  		assertEquals("Expect ", "audit-entity-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("questionnaire-usage-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [questionnaire-usage-mode]");
  	} else {
  		assertEquals("Expect ", "questionnaire-usage-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Identifier");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Identifier]");
  	} else {
  		assertEquals("Expect ", "Identifier", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("yesnodontknow");
  	if (null == result) {
  		System.out.println("Not found ValueSet [yesnodontknow]");
  	} else {
  		assertEquals("Expect ", "yesnodontknow", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("660150");
  	if (null == result) {
  		System.out.println("Not found Claim [660150]");
  	} else {
  		assertEquals("Expect ", "660150", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("goal-relationship-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [goal-relationship-type]");
  	} else {
  		assertEquals("Expect ", "goal-relationship-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("variant-state");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [variant-state]");
  	} else {
  		assertEquals("Expect ", "variant-state", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedure-schedule");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedure-schedule]");
  	} else {
  		assertEquals("Expect ", "procedure-schedule", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("activity-definition-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [activity-definition-category]");
  	} else {
  		assertEquals("Expect ", "activity-definition-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("measure-data-usage");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [measure-data-usage]");
  	} else {
  		assertEquals("Expect ", "measure-data-usage", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("issue-severity");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [issue-severity]");
  	} else {
  		assertEquals("Expect ", "issue-severity", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("request-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [request-status]");
  	} else {
  		assertEquals("Expect ", "request-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("familymemberhistory-genetic");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [familymemberhistory-genetic]");
  	} else {
  		assertEquals("Expect ", "familymemberhistory-genetic", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("measure-scoring");
  	if (null == result) {
  		System.out.println("Not found ValueSet [measure-scoring]");
  	} else {
  		assertEquals("Expect ", "measure-scoring", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("http-operations");
  	if (null == result) {
  		System.out.println("Not found ValueSet [http-operations]");
  	} else {
  		assertEquals("Expect ", "http-operations", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Meta");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Meta]");
  	} else {
  		assertEquals("Expect ", "Meta", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsAminoAcidChangeType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsAminoAcidChangeType]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsAminoAcidChangeType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("allergyintolerance-duration");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [allergyintolerance-duration]");
  	} else {
  		assertEquals("Expect ", "allergyintolerance-duration", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("inactive");
  	if (null == result) {
  		System.out.println("Not found ValueSet [inactive]");
  	} else {
  		assertEquals("Expect ", "inactive", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("food-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [food-type]");
  	} else {
  		assertEquals("Expect ", "food-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0322");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0322]");
  	} else {
  		assertEquals("Expect ", "meddisp0322", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-TPMT-haplotype-one");
  	if (null == result) {
  		System.out.println("Not found Observation [example-TPMT-haplotype-one]");
  	} else {
  		assertEquals("Expect ", "example-TPMT-haplotype-one", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("response-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [response-code]");
  	} else {
  		assertEquals("Expect ", "response-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("StructureDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [StructureDefinition]");
  	} else {
  		assertEquals("Expect ", "StructureDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("communication-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [communication-category]");
  	} else {
  		assertEquals("Expect ", "communication-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("EnrollmentResponse");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [EnrollmentResponse]");
  	} else {
  		assertEquals("Expect ", "EnrollmentResponse", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("name-use");
  	if (null == result) {
  		System.out.println("Not found ValueSet [name-use]");
  	} else {
  		assertEquals("Expect ", "name-use", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Endpoint");
  	result = endpointDao.find("example-wadors");
  	if (null == result) {
  		System.out.println("Not found Endpoint [example-wadors]");
  	} else {
  		assertEquals("Expect ", "example-wadors", ((Endpoint)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve QuestionnaireResponse");
  	result = questionnaireresponseDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found QuestionnaireResponse [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((QuestionnaireResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("transaction-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [transaction-mode]");
  	} else {
  		assertEquals("Expect ", "transaction-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("service-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [service-category]");
  	} else {
  		assertEquals("Expect ", "service-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("message-reason-encounter");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [message-reason-encounter]");
  	} else {
  		assertEquals("Expect ", "message-reason-encounter", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Substance");
  	result = substanceDao.find("f204");
  	if (null == result) {
  		System.out.println("Not found Substance [f204]");
  	} else {
  		assertEquals("Expect ", "f204", ((Substance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AllergyIntolerance");
  	result = allergyintoleranceDao.find("example");
  	if (null == result) {
  		System.out.println("Not found AllergyIntolerance [example]");
  	} else {
  		assertEquals("Expect ", "example", ((AllergyIntolerance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-pkb");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-pkb]");
  	} else {
  		assertEquals("Expect ", "consent-example-pkb", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedure-targetBodySite");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedure-targetBodySite]");
  	} else {
  		assertEquals("Expect ", "procedure-targetBodySite", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("relatedperson-relationshiptype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [relatedperson-relationshiptype]");
  	} else {
  		assertEquals("Expect ", "relatedperson-relationshiptype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ActivityDefinition");
  	result = activitydefinitionDao.find("serum-zika-dengue-virus-igm");
  	if (null == result) {
  		System.out.println("Not found ActivityDefinition [serum-zika-dengue-virus-igm]");
  	} else {
  		assertEquals("Expect ", "serum-zika-dengue-virus-igm", ((ActivityDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("protocol-example");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [protocol-example]");
  	} else {
  		assertEquals("Expect ", "protocol-example", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-sourceReference");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-sourceReference]");
  	} else {
  		assertEquals("Expect ", "valueset-sourceReference", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("infantenteral");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [infantenteral]");
  	} else {
  		assertEquals("Expect ", "infantenteral", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessRequest");
  	result = processrequestDao.find("87654");
  	if (null == result) {
  		System.out.println("Not found ProcessRequest [87654]");
  	} else {
  		assertEquals("Expect ", "87654", ((ProcessRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0330");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0330]");
  	} else {
  		assertEquals("Expect ", "meddisp0330", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Group");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Group]");
  	} else {
  		assertEquals("Expect ", "Group", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("MedicationStatement");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [MedicationStatement]");
  	} else {
  		assertEquals("Expect ", "MedicationStatement", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-definition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-definition]");
  	} else {
  		assertEquals("Expect ", "valueset-definition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("pharmacy-core-doseType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [pharmacy-core-doseType]");
  	} else {
  		assertEquals("Expect ", "pharmacy-core-doseType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("humanname-partner-prefix");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [humanname-partner-prefix]");
  	} else {
  		assertEquals("Expect ", "humanname-partner-prefix", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-adoptionInfo");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-adoptionInfo]");
  	} else {
  		assertEquals("Expect ", "patient-adoptionInfo", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("dataelement-sdcobjectclassproperty");
  	if (null == result) {
  		System.out.println("Not found ValueSet [dataelement-sdcobjectclassproperty]");
  	} else {
  		assertEquals("Expect ", "dataelement-sdcobjectclassproperty", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0311");
  	if (null == result) {
  		System.out.println("Not found Medication [med0311]");
  	} else {
  		assertEquals("Expect ", "med0311", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("consent-state-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [consent-state-codes]");
  	} else {
  		assertEquals("Expect ", "consent-state-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("questionnaire-answers-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [questionnaire-answers-status]");
  	} else {
  		assertEquals("Expect ", "questionnaire-answers-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("supply-item");
  	if (null == result) {
  		System.out.println("Not found ValueSet [supply-item]");
  	} else {
  		assertEquals("Expect ", "supply-item", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Contract");
  	result = contractDao.find("pcd-example-notThem");
  	if (null == result) {
  		System.out.println("Not found Contract [pcd-example-notThem]");
  	} else {
  		assertEquals("Expect ", "pcd-example-notThem", ((Contract)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-optionExclusive");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-optionExclusive]");
  	} else {
  		assertEquals("Expect ", "questionnaire-optionExclusive", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("research-study-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [research-study-status]");
  	} else {
  		assertEquals("Expect ", "research-study-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("flag-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [flag-category]");
  	} else {
  		assertEquals("Expect ", "flag-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contributor-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contributor-type]");
  	} else {
  		assertEquals("Expect ", "contributor-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("device-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [device-status]");
  	} else {
  		assertEquals("Expect ", "device-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("composite-measure-scoring");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [composite-measure-scoring]");
  	} else {
  		assertEquals("Expect ", "composite-measure-scoring", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("PractitionerRole");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [PractitionerRole]");
  	} else {
  		assertEquals("Expect ", "PractitionerRole", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve TestScript");
  	result = testscriptDao.find("testscript-example");
  	if (null == result) {
  		System.out.println("Not found TestScript [testscript-example]");
  	} else {
  		assertEquals("Expect ", "testscript-example", ((TestScript)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("careplan-activity-title");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [careplan-activity-title]");
  	} else {
  		assertEquals("Expect ", "careplan-activity-title", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("RelatedArtifact");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [RelatedArtifact]");
  	} else {
  		assertEquals("Expect ", "RelatedArtifact", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("substance-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [substance-status]");
  	} else {
  		assertEquals("Expect ", "substance-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("flag-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [flag-status]");
  	} else {
  		assertEquals("Expect ", "flag-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Device");
  	result = deviceDao.find("example-pacemaker");
  	if (null == result) {
  		System.out.println("Not found Device [example-pacemaker]");
  	} else {
  		assertEquals("Expect ", "example-pacemaker", ((Device)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ResearchStudy");
  	result = researchstudyDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ResearchStudy [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ResearchStudy)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedurerequest-genetics");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedurerequest-genetics]");
  	} else {
  		assertEquals("Expect ", "procedurerequest-genetics", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("operational-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [operational-status]");
  	} else {
  		assertEquals("Expect ", "operational-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("xcda");
  	if (null == result) {
  		System.out.println("Not found Patient [xcda]");
  	} else {
  		assertEquals("Expect ", "xcda", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("supplydelivery-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [supplydelivery-type]");
  	} else {
  		assertEquals("Expect ", "supplydelivery-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("specimen-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [specimen-status]");
  	} else {
  		assertEquals("Expect ", "specimen-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-phenotype");
  	if (null == result) {
  		System.out.println("Not found Observation [example-phenotype]");
  	} else {
  		assertEquals("Expect ", "example-phenotype", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Provenance");
  	result = provenanceDao.find("example-biocompute-object");
  	if (null == result) {
  		System.out.println("Not found Provenance [example-biocompute-object]");
  	} else {
  		assertEquals("Expect ", "example-biocompute-object", ((Provenance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("encounter-associatedEncounter");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [encounter-associatedEncounter]");
  	} else {
  		assertEquals("Expect ", "encounter-associatedEncounter", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("risk-probability");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [risk-probability]");
  	} else {
  		assertEquals("Expect ", "risk-probability", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-haplotype1");
  	if (null == result) {
  		System.out.println("Not found Observation [example-haplotype1]");
  	} else {
  		assertEquals("Expect ", "example-haplotype1", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("list-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [list-status]");
  	} else {
  		assertEquals("Expect ", "list-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Contract");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Contract]");
  	} else {
  		assertEquals("Expect ", "Contract", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-de-effective-period");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-de-effective-period]");
  	} else {
  		assertEquals("Expect ", "11179-de-effective-period", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-subsumes");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-subsumes]");
  	} else {
  		assertEquals("Expect ", "codesystem-subsumes", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("message-events");
  	if (null == result) {
  		System.out.println("Not found ValueSet [message-events]");
  	} else {
  		assertEquals("Expect ", "message-events", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("head-circumference");
  	if (null == result) {
  		System.out.println("Not found Observation [head-circumference]");
  	} else {
  		assertEquals("Expect ", "head-circumference", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("doc-classcodes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [doc-classcodes]");
  	} else {
  		assertEquals("Expect ", "doc-classcodes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("vaccination-protocol-dose-status-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [vaccination-protocol-dose-status-reason]");
  	} else {
  		assertEquals("Expect ", "vaccination-protocol-dose-status-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("event-reasonCode");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [event-reasonCode]");
  	} else {
  		assertEquals("Expect ", "event-reasonCode", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("markdown");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [markdown]");
  	} else {
  		assertEquals("Expect ", "markdown", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Encounter");
  	result = encounterDao.find("emerg");
  	if (null == result) {
  		System.out.println("Not found Encounter [emerg]");
  	} else {
  		assertEquals("Expect ", "emerg", ((Encounter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ExpansionProfile");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ExpansionProfile]");
  	} else {
  		assertEquals("Expect ", "ExpansionProfile", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("benefit-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [benefit-category]");
  	} else {
  		assertEquals("Expect ", "benefit-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("response-code");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [response-code]");
  	} else {
  		assertEquals("Expect ", "response-code", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0316");
  	if (null == result) {
  		System.out.println("Not found Medication [med0316]");
  	} else {
  		assertEquals("Expect ", "med0316", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("10minute-apgar-score");
  	if (null == result) {
  		System.out.println("Not found Observation [10minute-apgar-score]");
  	} else {
  		assertEquals("Expect ", "10minute-apgar-score", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("action-selection-behavior");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [action-selection-behavior]");
  	} else {
  		assertEquals("Expect ", "action-selection-behavior", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("nutrition-request-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [nutrition-request-status]");
  	} else {
  		assertEquals("Expect ", "nutrition-request-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DiagnosticReport-geneticsAnalysis");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DiagnosticReport-geneticsAnalysis]");
  	} else {
  		assertEquals("Expect ", "DiagnosticReport-geneticsAnalysis", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve EpisodeOfCare");
  	result = episodeofcareDao.find("example");
  	if (null == result) {
  		System.out.println("Not found EpisodeOfCare [example]");
  	} else {
  		assertEquals("Expect ", "example", ((EpisodeOfCare)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("measure-scoring");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [measure-scoring]");
  	} else {
  		assertEquals("Expect ", "measure-scoring", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-dispense-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-dispense-category]");
  	} else {
  		assertEquals("Expect ", "medication-dispense-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("linkage-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [linkage-type]");
  	} else {
  		assertEquals("Expect ", "linkage-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("map-source-list-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [map-source-list-mode]");
  	} else {
  		assertEquals("Expect ", "map-source-list-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("audit-event-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [audit-event-type]");
  	} else {
  		assertEquals("Expect ", "audit-event-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("SimpleQuantity");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [SimpleQuantity]");
  	} else {
  		assertEquals("Expect ", "SimpleQuantity", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ChargeItem");
  	result = chargeitemDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ChargeItem [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ChargeItem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("blood-pressure");
  	if (null == result) {
  		System.out.println("Not found Observation [blood-pressure]");
  	} else {
  		assertEquals("Expect ", "blood-pressure", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adverse-event-outcome");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adverse-event-outcome]");
  	} else {
  		assertEquals("Expect ", "adverse-event-outcome", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("example-TPMT-two");
  	if (null == result) {
  		System.out.println("Not found Sequence [example-TPMT-two]");
  	} else {
  		assertEquals("Expect ", "example-TPMT-two", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("consent-content-class");
  	if (null == result) {
  		System.out.println("Not found ValueSet [consent-content-class]");
  	} else {
  		assertEquals("Expect ", "consent-content-class", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("library-fhir-helpers");
  	if (null == result) {
  		System.out.println("Not found Library [library-fhir-helpers]");
  	} else {
  		assertEquals("Expect ", "library-fhir-helpers", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("resource-aggregation-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [resource-aggregation-mode]");
  	} else {
  		assertEquals("Expect ", "resource-aggregation-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("cholesterol");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [cholesterol]");
  	} else {
  		assertEquals("Expect ", "cholesterol", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("list-order");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [list-order]");
  	} else {
  		assertEquals("Expect ", "list-order", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contract-term-subtype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contract-term-subtype]");
  	} else {
  		assertEquals("Expect ", "contract-term-subtype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adjudication");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adjudication]");
  	} else {
  		assertEquals("Expect ", "adjudication", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("list-item-flag");
  	if (null == result) {
  		System.out.println("Not found ValueSet [list-item-flag]");
  	} else {
  		assertEquals("Expect ", "list-item-flag", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("bundle-example");
  	if (null == result) {
  		System.out.println("Not found Bundle [bundle-example]");
  	} else {
  		assertEquals("Expect ", "bundle-example", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("search-modifier-code");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [search-modifier-code]");
  	} else {
  		assertEquals("Expect ", "search-modifier-code", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("repository-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [repository-type]");
  	} else {
  		assertEquals("Expect ", "repository-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("f002");
  	if (null == result) {
  		System.out.println("Not found Procedure [f002]");
  	} else {
  		assertEquals("Expect ", "f002", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("vaccine-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [vaccine-code]");
  	} else {
  		assertEquals("Expect ", "vaccine-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f006");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f006]");
  	} else {
  		assertEquals("Expect ", "f006", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("http-operations");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [http-operations]");
  	} else {
  		assertEquals("Expect ", "http-operations", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-wg");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-wg]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-wg", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("dicom-audit-lifecycle");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [dicom-audit-lifecycle]");
  	} else {
  		assertEquals("Expect ", "dicom-audit-lifecycle", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("respiratory-rate");
  	if (null == result) {
  		System.out.println("Not found Observation [respiratory-rate]");
  	} else {
  		assertEquals("Expect ", "respiratory-rate", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("encounter-modeOfArrival");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [encounter-modeOfArrival]");
  	} else {
  		assertEquals("Expect ", "encounter-modeOfArrival", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("age-units");
  	if (null == result) {
  		System.out.println("Not found ValueSet [age-units]");
  	} else {
  		assertEquals("Expect ", "age-units", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AuditEvent");
  	result = auditeventDao.find("example-rest");
  	if (null == result) {
  		System.out.println("Not found AuditEvent [example-rest]");
  	} else {
  		assertEquals("Expect ", "example-rest", ((AuditEvent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-otherName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-otherName]");
  	} else {
  		assertEquals("Expect ", "valueset-otherName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FHIRList");
  	result = fhirlistDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found FHIRList [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((FHIRList)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("elementdefinition-11179-DataElement-objectClass");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [elementdefinition-11179-DataElement-objectClass]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-11179-DataElement-objectClass", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("fda-vcf-comparison");
  	if (null == result) {
  		System.out.println("Not found Sequence [fda-vcf-comparison]");
  	} else {
  		assertEquals("Expect ", "fda-vcf-comparison", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("implant-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [implant-status]");
  	} else {
  		assertEquals("Expect ", "implant-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("claim-careteamrole");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [claim-careteamrole]");
  	} else {
  		assertEquals("Expect ", "claim-careteamrole", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("ob");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [ob]");
  	} else {
  		assertEquals("Expect ", "ob", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("observation-genetic-Observation-dna-variant");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [observation-genetic-Observation-dna-variant]");
  	} else {
  		assertEquals("Expect ", "observation-genetic-Observation-dna-variant", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("jurisdiction");
  	if (null == result) {
  		System.out.println("Not found ValueSet [jurisdiction]");
  	} else {
  		assertEquals("Expect ", "jurisdiction", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("appendectomy-narrative");
  	if (null == result) {
  		System.out.println("Not found Procedure [appendectomy-narrative]");
  	} else {
  		assertEquals("Expect ", "appendectomy-narrative", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-special-arrangements");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-special-arrangements]");
  	} else {
  		assertEquals("Expect ", "encounter-special-arrangements", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("goal-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [goal-category]");
  	} else {
  		assertEquals("Expect ", "goal-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-toocostly");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-toocostly]");
  	} else {
  		assertEquals("Expect ", "valueset-toocostly", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("3141");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [3141]");
  	} else {
  		assertEquals("Expect ", "3141", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Claim");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Claim]");
  	} else {
  		assertEquals("Expect ", "Claim", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("PlanDefinition-data-requirements");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [PlanDefinition-data-requirements]");
  	} else {
  		assertEquals("Expect ", "PlanDefinition-data-requirements", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("metric-calibration-state");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [metric-calibration-state]");
  	} else {
  		assertEquals("Expect ", "metric-calibration-state", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("3a0707d3-549e-4467-b8b8-5a2ab3800efe");
  	if (null == result) {
  		System.out.println("Not found Bundle [3a0707d3-549e-4467-b8b8-5a2ab3800efe]");
  	} else {
  		assertEquals("Expect ", "3a0707d3-549e-4467-b8b8-5a2ab3800efe", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("stroke");
  	if (null == result) {
  		System.out.println("Not found Condition [stroke]");
  	} else {
  		assertEquals("Expect ", "stroke", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0315");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0315]");
  	} else {
  		assertEquals("Expect ", "meddisp0315", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("xcda1");
  	if (null == result) {
  		System.out.println("Not found Practitioner [xcda1]");
  	} else {
  		assertEquals("Expect ", "xcda1", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("extension-context");
  	if (null == result) {
  		System.out.println("Not found ValueSet [extension-context]");
  	} else {
  		assertEquals("Expect ", "extension-context", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-Out");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-Out]");
  	} else {
  		assertEquals("Expect ", "consent-example-Out", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Schedule");
  	result = scheduleDao.find("exampleloc2");
  	if (null == result) {
  		System.out.println("Not found Schedule [exampleloc2]");
  	} else {
  		assertEquals("Expect ", "exampleloc2", ((Schedule)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("document-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [document-mode]");
  	} else {
  		assertEquals("Expect ", "document-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("openEHR-management");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [openEHR-management]");
  	} else {
  		assertEquals("Expect ", "openEHR-management", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("claim-informationcategory");
  	if (null == result) {
  		System.out.println("Not found ValueSet [claim-informationcategory]");
  	} else {
  		assertEquals("Expect ", "claim-informationcategory", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found Condition [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-comment");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-comment]");
  	} else {
  		assertEquals("Expect ", "codesystem-comment", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("resource-types");
  	if (null == result) {
  		System.out.println("Not found ValueSet [resource-types]");
  	} else {
  		assertEquals("Expect ", "resource-types", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0331");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0331]");
  	} else {
  		assertEquals("Expect ", "medrx0331", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("f203");
  	if (null == result) {
  		System.out.println("Not found Condition [f203]");
  	} else {
  		assertEquals("Expect ", "f203", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("service-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [service-type]");
  	} else {
  		assertEquals("Expect ", "service-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ConceptMap");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ConceptMap]");
  	} else {
  		assertEquals("Expect ", "ConceptMap", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Coverage");
  	result = coverageDao.find("7546D");
  	if (null == result) {
  		System.out.println("Not found Coverage [7546D]");
  	} else {
  		assertEquals("Expect ", "7546D", ((Coverage)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PaymentNotice");
  	result = paymentnoticeDao.find("77654");
  	if (null == result) {
  		System.out.println("Not found PaymentNotice [77654]");
  	} else {
  		assertEquals("Expect ", "77654", ((PaymentNotice)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("string");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [string]");
  	} else {
  		assertEquals("Expect ", "string", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("communication-not-done-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [communication-not-done-reason]");
  	} else {
  		assertEquals("Expect ", "communication-not-done-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ActivityDefinition");
  	result = activitydefinitionDao.find("administer-zika-virus-exposure-assessment");
  	if (null == result) {
  		System.out.println("Not found ActivityDefinition [administer-zika-virus-exposure-assessment]");
  	} else {
  		assertEquals("Expect ", "administer-zika-virus-exposure-assessment", ((ActivityDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0319");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0319]");
  	} else {
  		assertEquals("Expect ", "meddisp0319", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("claim-subtype");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [claim-subtype]");
  	} else {
  		assertEquals("Expect ", "claim-subtype", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("diagnosticReport-locationPerformed");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [diagnosticReport-locationPerformed]");
  	} else {
  		assertEquals("Expect ", "diagnosticReport-locationPerformed", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-clinicalTrial");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-clinicalTrial]");
  	} else {
  		assertEquals("Expect ", "patient-clinicalTrial", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-document-reference-status-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-document-reference-status-v3]");
  	} else {
  		assertEquals("Expect ", "cm-document-reference-status-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DeviceComponent");
  	result = devicecomponentDao.find("example-prodspec");
  	if (null == result) {
  		System.out.println("Not found DeviceComponent [example-prodspec]");
  	} else {
  		assertEquals("Expect ", "example-prodspec", ((DeviceComponent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DetectedIssue");
  	result = detectedissueDao.find("duplicate");
  	if (null == result) {
  		System.out.println("Not found DetectedIssue [duplicate]");
  	} else {
  		assertEquals("Expect ", "duplicate", ((DetectedIssue)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("marital-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [marital-status]");
  	} else {
  		assertEquals("Expect ", "marital-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("texturemodified");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [texturemodified]");
  	} else {
  		assertEquals("Expect ", "texturemodified", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("event-performerRole");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [event-performerRole]");
  	} else {
  		assertEquals("Expect ", "event-performerRole", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("dateTime");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [dateTime]");
  	} else {
  		assertEquals("Expect ", "dateTime", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("search-xpath-usage");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [search-xpath-usage]");
  	} else {
  		assertEquals("Expect ", "search-xpath-usage", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("type-derivation-rule");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [type-derivation-rule]");
  	} else {
  		assertEquals("Expect ", "type-derivation-rule", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-warning");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-warning]");
  	} else {
  		assertEquals("Expect ", "codesystem-warning", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-trusted-expansion");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-trusted-expansion]");
  	} else {
  		assertEquals("Expect ", "valueset-trusted-expansion", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("additionalmaterials");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [additionalmaterials]");
  	} else {
  		assertEquals("Expect ", "additionalmaterials", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adverse-event-causality-assess");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adverse-event-causality-assess]");
  	} else {
  		assertEquals("Expect ", "adverse-event-causality-assess", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-TEL-address");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-TEL-address]");
  	} else {
  		assertEquals("Expect ", "iso21090-TEL-address", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AuditEvent");
  	result = auditeventDao.find("example-disclosure");
  	if (null == result) {
  		System.out.println("Not found AuditEvent [example-disclosure]");
  	} else {
  		assertEquals("Expect ", "example-disclosure", ((AuditEvent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("encounter-special-arrangements");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [encounter-special-arrangements]");
  	} else {
  		assertEquals("Expect ", "encounter-special-arrangements", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("map-context-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [map-context-type]");
  	} else {
  		assertEquals("Expect ", "map-context-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("ConceptMap-closure");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [ConceptMap-closure]");
  	} else {
  		assertEquals("Expect ", "ConceptMap-closure", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("detectedissue-severity");
  	if (null == result) {
  		System.out.println("Not found ValueSet [detectedissue-severity]");
  	} else {
  		assertEquals("Expect ", "detectedissue-severity", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("communicationrequest-reasonRejected");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [communicationrequest-reasonRejected]");
  	} else {
  		assertEquals("Expect ", "communicationrequest-reasonRejected", ((StructureDefinition)result).getId());
  	}
  	System.out.println("Total tests .. " + count);
  }
  @Test
  public void test620() throws Exception {
  	Object local = null;
  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("CodeSystem-compose");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [CodeSystem-compose]");
  	} else {
  		assertEquals("Expect ", "CodeSystem-compose", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Questionnaire");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Questionnaire]");
  	} else {
  		assertEquals("Expect ", "Questionnaire", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NamingSystem");
  	result = namingsystemDao.find("example-id");
  	if (null == result) {
  		System.out.println("Not found NamingSystem [example-id]");
  	} else {
  		assertEquals("Expect ", "example-id", ((NamingSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0333");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0333]");
  	} else {
  		assertEquals("Expect ", "medrx0333", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("surface");
  	if (null == result) {
  		System.out.println("Not found ValueSet [surface]");
  	} else {
  		assertEquals("Expect ", "surface", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("observation-genetic-Observation-gene-dnavariant");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [observation-genetic-Observation-gene-dnavariant]");
  	} else {
  		assertEquals("Expect ", "observation-genetic-Observation-gene-dnavariant", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("sequence-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [sequence-type]");
  	} else {
  		assertEquals("Expect ", "sequence-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("issue-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [issue-type]");
  	} else {
  		assertEquals("Expect ", "issue-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("minValue");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [minValue]");
  	} else {
  		assertEquals("Expect ", "minValue", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("chromosome-human");
  	if (null == result) {
  		System.out.println("Not found ValueSet [chromosome-human]");
  	} else {
  		assertEquals("Expect ", "chromosome-human", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("goal-status-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [goal-status-reason]");
  	} else {
  		assertEquals("Expect ", "goal-status-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-bodyPosition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-bodyPosition]");
  	} else {
  		assertEquals("Expect ", "observation-bodyPosition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("timing-exact");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [timing-exact]");
  	} else {
  		assertEquals("Expect ", "timing-exact", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("service-referral-method");
  	if (null == result) {
  		System.out.println("Not found ValueSet [service-referral-method]");
  	} else {
  		assertEquals("Expect ", "service-referral-method", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("instance-availability");
  	if (null == result) {
  		System.out.println("Not found ValueSet [instance-availability]");
  	} else {
  		assertEquals("Expect ", "instance-availability", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("report-participant-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [report-participant-type]");
  	} else {
  		assertEquals("Expect ", "report-participant-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-statement-taken");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-statement-taken]");
  	} else {
  		assertEquals("Expect ", "medication-statement-taken", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("geolocation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [geolocation]");
  	} else {
  		assertEquals("Expect ", "geolocation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-verification");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-verification]");
  	} else {
  		assertEquals("Expect ", "iso21090-verification", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("object-role");
  	if (null == result) {
  		System.out.println("Not found ValueSet [object-role]");
  	} else {
  		assertEquals("Expect ", "object-role", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("subscription-tag");
  	if (null == result) {
  		System.out.println("Not found ValueSet [subscription-tag]");
  	} else {
  		assertEquals("Expect ", "subscription-tag", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("heartrate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [heartrate]");
  	} else {
  		assertEquals("Expect ", "heartrate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f206");
  	if (null == result) {
  		System.out.println("Not found Observation [f206]");
  	} else {
  		assertEquals("Expect ", "f206", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("encounter-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [encounter-status]");
  	} else {
  		assertEquals("Expect ", "encounter-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Coverage");
  	result = coverageDao.find("SP1234");
  	if (null == result) {
  		System.out.println("Not found Coverage [SP1234]");
  	} else {
  		assertEquals("Expect ", "SP1234", ((Coverage)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ReferralRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ReferralRequest]");
  	} else {
  		assertEquals("Expect ", "ReferralRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("doc-section-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [doc-section-codes]");
  	} else {
  		assertEquals("Expect ", "doc-section-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0307");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0307]");
  	} else {
  		assertEquals("Expect ", "meddisp0307", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Resource-meta-add");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Resource-meta-add]");
  	} else {
  		assertEquals("Expect ", "Resource-meta-add", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("operation-kind");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [operation-kind]");
  	} else {
  		assertEquals("Expect ", "operation-kind", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("care-team-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [care-team-category]");
  	} else {
  		assertEquals("Expect ", "care-team-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("network-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [network-type]");
  	} else {
  		assertEquals("Expect ", "network-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("object-lifecycle-events");
  	if (null == result) {
  		System.out.println("Not found ValueSet [object-lifecycle-events]");
  	} else {
  		assertEquals("Expect ", "object-lifecycle-events", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("ambulation");
  	if (null == result) {
  		System.out.println("Not found Procedure [ambulation]");
  	} else {
  		assertEquals("Expect ", "ambulation", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-targetStructureMap");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-targetStructureMap]");
  	} else {
  		assertEquals("Expect ", "questionnaire-targetStructureMap", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-birthTime");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-birthTime]");
  	} else {
  		assertEquals("Expect ", "patient-birthTime", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-medication-dispense-status-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-medication-dispense-status-v3]");
  	} else {
  		assertEquals("Expect ", "cm-medication-dispense-status-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("observation-genetic-Observation-amino-acid-change");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [observation-genetic-Observation-amino-acid-change]");
  	} else {
  		assertEquals("Expect ", "observation-genetic-Observation-amino-acid-change", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("ValueSet-expand");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [ValueSet-expand]");
  	} else {
  		assertEquals("Expect ", "ValueSet-expand", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("messageheader-response-request");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [messageheader-response-request]");
  	} else {
  		assertEquals("Expect ", "messageheader-response-request", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("observation-statistics");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [observation-statistics]");
  	} else {
  		assertEquals("Expect ", "observation-statistics", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Appointment");
  	result = appointmentDao.find("2docs");
  	if (null == result) {
  		System.out.println("Not found Appointment [2docs]");
  	} else {
  		assertEquals("Expect ", "2docs", ((Appointment)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("claim-modifiers");
  	if (null == result) {
  		System.out.println("Not found ValueSet [claim-modifiers]");
  	} else {
  		assertEquals("Expect ", "claim-modifiers", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("coverage-selfpay");
  	if (null == result) {
  		System.out.println("Not found ValueSet [coverage-selfpay]");
  	} else {
  		assertEquals("Expect ", "coverage-selfpay", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("allerg-intol-substance-exp-risk");
  	if (null == result) {
  		System.out.println("Not found ValueSet [allerg-intol-substance-exp-risk]");
  	} else {
  		assertEquals("Expect ", "allerg-intol-substance-exp-risk", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0313");
  	if (null == result) {
  		System.out.println("Not found Medication [med0313]");
  	} else {
  		assertEquals("Expect ", "med0313", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ExplanationOfBenefit");
  	result = explanationofbenefitDao.find("EB3500");
  	if (null == result) {
  		System.out.println("Not found ExplanationOfBenefit [EB3500]");
  	} else {
  		assertEquals("Expect ", "EB3500", ((ExplanationOfBenefit)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("composition-attestation-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [composition-attestation-mode]");
  	} else {
  		assertEquals("Expect ", "composition-attestation-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("100151");
  	if (null == result) {
  		System.out.println("Not found Claim [100151]");
  	} else {
  		assertEquals("Expect ", "100151", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-genetics");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-genetics]");
  	} else {
  		assertEquals("Expect ", "observation-genetics", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("positiveInt");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [positiveInt]");
  	} else {
  		assertEquals("Expect ", "positiveInt", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("property-representation");
  	if (null == result) {
  		System.out.println("Not found ValueSet [property-representation]");
  	} else {
  		assertEquals("Expect ", "property-representation", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Endpoint");
  	result = endpointDao.find("example-iid");
  	if (null == result) {
  		System.out.println("Not found Endpoint [example-iid]");
  	} else {
  		assertEquals("Expect ", "example-iid", ((Endpoint)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("benefit-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [benefit-type]");
  	} else {
  		assertEquals("Expect ", "benefit-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-participant-role");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-participant-role]");
  	} else {
  		assertEquals("Expect ", "action-participant-role", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-CO-value");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-CO-value]");
  	} else {
  		assertEquals("Expect ", "iso21090-CO-value", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Location");
  	result = locationDao.find("ukp");
  	if (null == result) {
  		System.out.println("Not found Location [ukp]");
  	} else {
  		assertEquals("Expect ", "ukp", ((Location)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AuditEvent");
  	result = auditeventDao.find("example-media");
  	if (null == result) {
  		System.out.println("Not found AuditEvent [example-media]");
  	} else {
  		assertEquals("Expect ", "example-media", ((AuditEvent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("oxygensat");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [oxygensat]");
  	} else {
  		assertEquals("Expect ", "oxygensat", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Measure");
  	result = measureDao.find("composite-example");
  	if (null == result) {
  		System.out.println("Not found Measure [composite-example]");
  	} else {
  		assertEquals("Expect ", "composite-example", ((Measure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("data-absent-reason");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [data-absent-reason]");
  	} else {
  		assertEquals("Expect ", "data-absent-reason", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Flag");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Flag]");
  	} else {
  		assertEquals("Expect ", "Flag", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("blood-pressure-cancel");
  	if (null == result) {
  		System.out.println("Not found Observation [blood-pressure-cancel]");
  	} else {
  		assertEquals("Expect ", "blood-pressure-cancel", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-statement-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-statement-category]");
  	} else {
  		assertEquals("Expect ", "medication-statement-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("security-role-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [security-role-type]");
  	} else {
  		assertEquals("Expect ", "security-role-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("report-status-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [report-status-codes]");
  	} else {
  		assertEquals("Expect ", "report-status-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedurerequest-reasonRefused");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedurerequest-reasonRefused]");
  	} else {
  		assertEquals("Expect ", "procedurerequest-reasonRefused", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RiskAssessment");
  	result = riskassessmentDao.find("cardiac");
  	if (null == result) {
  		System.out.println("Not found RiskAssessment [cardiac]");
  	} else {
  		assertEquals("Expect ", "cardiac", ((RiskAssessment)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ucum-common");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ucum-common]");
  	} else {
  		assertEquals("Expect ", "ucum-common", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("exclusive-breastfeeding-intervention-01");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [exclusive-breastfeeding-intervention-01]");
  	} else {
  		assertEquals("Expect ", "exclusive-breastfeeding-intervention-01", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("encounter-location-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [encounter-location-status]");
  	} else {
  		assertEquals("Expect ", "encounter-location-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ActivityDefinition");
  	result = activitydefinitionDao.find("citalopramPrescription");
  	if (null == result) {
  		System.out.println("Not found ActivityDefinition [citalopramPrescription]");
  	} else {
  		assertEquals("Expect ", "citalopramPrescription", ((ActivityDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("audit-event-outcome");
  	if (null == result) {
  		System.out.println("Not found ValueSet [audit-event-outcome]");
  	} else {
  		assertEquals("Expect ", "audit-event-outcome", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-clinical");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-clinical]");
  	} else {
  		assertEquals("Expect ", "condition-clinical", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Appointment");
  	result = appointmentDao.find("examplereq");
  	if (null == result) {
  		System.out.println("Not found Appointment [examplereq]");
  	} else {
  		assertEquals("Expect ", "examplereq", ((Appointment)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("metric-calibration-state");
  	if (null == result) {
  		System.out.println("Not found ValueSet [metric-calibration-state]");
  	} else {
  		assertEquals("Expect ", "metric-calibration-state", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0326");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0326]");
  	} else {
  		assertEquals("Expect ", "meddisp0326", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RelatedPerson");
  	result = relatedpersonDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found RelatedPerson [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((RelatedPerson)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0303");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0303]");
  	} else {
  		assertEquals("Expect ", "medrx0303", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ImmunizationRecommendation");
  	result = immunizationrecommendationDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ImmunizationRecommendation [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ImmunizationRecommendation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("MedicationAdministration");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [MedicationAdministration]");
  	} else {
  		assertEquals("Expect ", "MedicationAdministration", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("immunization-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [immunization-reason]");
  	} else {
  		assertEquals("Expect ", "immunization-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("BodySite");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [BodySite]");
  	} else {
  		assertEquals("Expect ", "BodySite", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-deliveryInstallationType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-deliveryInstallationType]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-deliveryInstallationType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsInterpretation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsInterpretation]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsInterpretation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("metric-calibration-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [metric-calibration-type]");
  	} else {
  		assertEquals("Expect ", "metric-calibration-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("xds");
  	if (null == result) {
  		System.out.println("Not found Bundle [xds]");
  	} else {
  		assertEquals("Expect ", "xds", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-genetics-3");
  	if (null == result) {
  		System.out.println("Not found Observation [example-genetics-3]");
  	} else {
  		assertEquals("Expect ", "example-genetics-3", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("types");
  	if (null == result) {
  		System.out.println("Not found Bundle [types]");
  	} else {
  		assertEquals("Expect ", "types", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("ServiceDefinition-data-requirements");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [ServiceDefinition-data-requirements]");
  	} else {
  		assertEquals("Expect ", "ServiceDefinition-data-requirements", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("760152");
  	if (null == result) {
  		System.out.println("Not found Claim [760152]");
  	} else {
  		assertEquals("Expect ", "760152", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedurerequest-authorizedBy");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedurerequest-authorizedBy]");
  	} else {
  		assertEquals("Expect ", "procedurerequest-authorizedBy", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-cardinality-behavior");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-cardinality-behavior]");
  	} else {
  		assertEquals("Expect ", "action-cardinality-behavior", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("capabilitystatement-supported-system");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [capabilitystatement-supported-system]");
  	} else {
  		assertEquals("Expect ", "capabilitystatement-supported-system", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("allergy-intolerance-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [allergy-intolerance-category]");
  	} else {
  		assertEquals("Expect ", "allergy-intolerance-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("report-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [report-codes]");
  	} else {
  		assertEquals("Expect ", "report-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("location-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [location-mode]");
  	} else {
  		assertEquals("Expect ", "location-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("address-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [address-type]");
  	} else {
  		assertEquals("Expect ", "address-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("allergy-intolerance-criticality");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [allergy-intolerance-criticality]");
  	} else {
  		assertEquals("Expect ", "allergy-intolerance-criticality", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("EpisodeOfCare");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [EpisodeOfCare]");
  	} else {
  		assertEquals("Expect ", "EpisodeOfCare", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("claim-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [claim-type]");
  	} else {
  		assertEquals("Expect ", "claim-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("reason-medication-not-taken-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [reason-medication-not-taken-codes]");
  	} else {
  		assertEquals("Expect ", "reason-medication-not-taken-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve BodySite");
  	result = bodysiteDao.find("fetus");
  	if (null == result) {
  		System.out.println("Not found BodySite [fetus]");
  	} else {
  		assertEquals("Expect ", "fetus", ((BodySite)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AppointmentResponse");
  	result = appointmentresponseDao.find("exampleresp");
  	if (null == result) {
  		System.out.println("Not found AppointmentResponse [exampleresp]");
  	} else {
  		assertEquals("Expect ", "exampleresp", ((AppointmentResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("encounter-discharge-disposition");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [encounter-discharge-disposition]");
  	} else {
  		assertEquals("Expect ", "encounter-discharge-disposition", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-deliveryAddressLine");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-deliveryAddressLine]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-deliveryAddressLine", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("definition-topic");
  	if (null == result) {
  		System.out.println("Not found ValueSet [definition-topic]");
  	} else {
  		assertEquals("Expect ", "definition-topic", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("languages");
  	if (null == result) {
  		System.out.println("Not found ValueSet [languages]");
  	} else {
  		assertEquals("Expect ", "languages", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contributor-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contributor-type]");
  	} else {
  		assertEquals("Expect ", "contributor-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Contract");
  	result = contractDao.find("C-123");
  	if (null == result) {
  		System.out.println("Not found Contract [C-123]");
  	} else {
  		assertEquals("Expect ", "C-123", ((Contract)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f203");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f203]");
  	} else {
  		assertEquals("Expect ", "f203", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-ancestor");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-ancestor]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-ancestor", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationStatement");
  	result = medicationstatementDao.find("example003");
  	if (null == result) {
  		System.out.println("Not found MedicationStatement [example003]");
  	} else {
  		assertEquals("Expect ", "example003", ((MedicationStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("reason-medication-not-given-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [reason-medication-not-given-codes]");
  	} else {
  		assertEquals("Expect ", "reason-medication-not-given-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-nationality");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-nationality]");
  	} else {
  		assertEquals("Expect ", "patient-nationality", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-houseNumber");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-houseNumber]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-houseNumber", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("concept-map-equivalence");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [concept-map-equivalence]");
  	} else {
  		assertEquals("Expect ", "concept-map-equivalence", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-discharge-disposition");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-discharge-disposition]");
  	} else {
  		assertEquals("Expect ", "encounter-discharge-disposition", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("payment-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [payment-type]");
  	} else {
  		assertEquals("Expect ", "payment-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("graphic-example-1");
  	if (null == result) {
  		System.out.println("Not found Sequence [graphic-example-1]");
  	} else {
  		assertEquals("Expect ", "graphic-example-1", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("practitioner-role");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [practitioner-role]");
  	} else {
  		assertEquals("Expect ", "practitioner-role", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contract-term-subtype");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contract-term-subtype]");
  	} else {
  		assertEquals("Expect ", "contract-term-subtype", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("rendering-styleSensitive");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [rendering-styleSensitive]");
  	} else {
  		assertEquals("Expect ", "rendering-styleSensitive", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RiskAssessment");
  	result = riskassessmentDao.find("prognosis");
  	if (null == result) {
  		System.out.println("Not found RiskAssessment [prognosis]");
  	} else {
  		assertEquals("Expect ", "prognosis", ((RiskAssessment)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("history-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [history-status]");
  	} else {
  		assertEquals("Expect ", "history-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("resource-type-link");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [resource-type-link]");
  	} else {
  		assertEquals("Expect ", "resource-type-link", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("service-modifiers");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [service-modifiers]");
  	} else {
  		assertEquals("Expect ", "service-modifiers", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("measure-population");
  	if (null == result) {
  		System.out.println("Not found ValueSet [measure-population]");
  	} else {
  		assertEquals("Expect ", "measure-population", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("FamilyMemberHistory");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [FamilyMemberHistory]");
  	} else {
  		assertEquals("Expect ", "FamilyMemberHistory", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("HumanName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [HumanName]");
  	} else {
  		assertEquals("Expect ", "HumanName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("regex");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [regex]");
  	} else {
  		assertEquals("Expect ", "regex", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contract-actorrole");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contract-actorrole]");
  	} else {
  		assertEquals("Expect ", "contract-actorrole", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-form-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-form-codes]");
  	} else {
  		assertEquals("Expect ", "medication-form-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve TestScript");
  	result = testscriptDao.find("testscript-example-update");
  	if (null == result) {
  		System.out.println("Not found TestScript [testscript-example-update]");
  	} else {
  		assertEquals("Expect ", "testscript-example-update", ((TestScript)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-deMap");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-deMap]");
  	} else {
  		assertEquals("Expect ", "questionnaire-deMap", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("colonoscopy");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [colonoscopy]");
  	} else {
  		assertEquals("Expect ", "colonoscopy", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Distance");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Distance]");
  	} else {
  		assertEquals("Expect ", "Distance", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-selection-behavior");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-selection-behavior]");
  	} else {
  		assertEquals("Expect ", "action-selection-behavior", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("encounter-reasonCancelled");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [encounter-reasonCancelled]");
  	} else {
  		assertEquals("Expect ", "encounter-reasonCancelled", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("pharmacy-core-rateIncrement");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [pharmacy-core-rateIncrement]");
  	} else {
  		assertEquals("Expect ", "pharmacy-core-rateIncrement", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("action-participant-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [action-participant-type]");
  	} else {
  		assertEquals("Expect ", "action-participant-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("organization-preferredContact");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [organization-preferredContact]");
  	} else {
  		assertEquals("Expect ", "organization-preferredContact", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Narrative");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Narrative]");
  	} else {
  		assertEquals("Expect ", "Narrative", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0312");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0312]");
  	} else {
  		assertEquals("Expect ", "meddisp0312", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("example-pgx-1");
  	if (null == result) {
  		System.out.println("Not found Sequence [example-pgx-1]");
  	} else {
  		assertEquals("Expect ", "example-pgx-1", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("cqif-evidence-quality");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [cqif-evidence-quality]");
  	} else {
  		assertEquals("Expect ", "cqif-evidence-quality", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("reason-medication-not-given-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [reason-medication-not-given-codes]");
  	} else {
  		assertEquals("Expect ", "reason-medication-not-given-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0305");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0305]");
  	} else {
  		assertEquals("Expect ", "meddisp0305", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("timing-abbreviation");
  	if (null == result) {
  		System.out.println("Not found ValueSet [timing-abbreviation]");
  	} else {
  		assertEquals("Expect ", "timing-abbreviation", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0320");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0320]");
  	} else {
  		assertEquals("Expect ", "medrx0320", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("oid");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [oid]");
  	} else {
  		assertEquals("Expect ", "oid", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("all-languages");
  	if (null == result) {
  		System.out.println("Not found ValueSet [all-languages]");
  	} else {
  		assertEquals("Expect ", "all-languages", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("immunization-origin");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [immunization-origin]");
  	} else {
  		assertEquals("Expect ", "immunization-origin", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Slot");
  	result = slotDao.find("3");
  	if (null == result) {
  		System.out.println("Not found Slot [3]");
  	} else {
  		assertEquals("Expect ", "3", ((Slot)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DeviceComponent");
  	result = devicecomponentDao.find("example");
  	if (null == result) {
  		System.out.println("Not found DeviceComponent [example]");
  	} else {
  		assertEquals("Expect ", "example", ((DeviceComponent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("message-significance-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [message-significance-category]");
  	} else {
  		assertEquals("Expect ", "message-significance-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("c80-practice-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [c80-practice-codes]");
  	} else {
  		assertEquals("Expect ", "c80-practice-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("substance-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [substance-status]");
  	} else {
  		assertEquals("Expect ", "substance-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Contributor");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Contributor]");
  	} else {
  		assertEquals("Expect ", "Contributor", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Address");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Address]");
  	} else {
  		assertEquals("Expect ", "Address", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve QuestionnaireResponse");
  	result = questionnaireresponseDao.find("ussg-fht-answers");
  	if (null == result) {
  		System.out.println("Not found QuestionnaireResponse [ussg-fht-answers]");
  	} else {
  		assertEquals("Expect ", "ussg-fht-answers", ((QuestionnaireResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedurerequest-targetBodySite");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedurerequest-targetBodySite]");
  	} else {
  		assertEquals("Expect ", "procedurerequest-targetBodySite", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ex-onsettype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ex-onsettype]");
  	} else {
  		assertEquals("Expect ", "ex-onsettype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("graph-compartment-rule");
  	if (null == result) {
  		System.out.println("Not found ValueSet [graph-compartment-rule]");
  	} else {
  		assertEquals("Expect ", "graph-compartment-rule", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("immunization-recommendation-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [immunization-recommendation-status]");
  	} else {
  		assertEquals("Expect ", "immunization-recommendation-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("doc-typecodes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [doc-typecodes]");
  	} else {
  		assertEquals("Expect ", "doc-typecodes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("ch-example");
  	if (null == result) {
  		System.out.println("Not found Patient [ch-example]");
  	} else {
  		assertEquals("Expect ", "ch-example", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("codesystem-hierarchy-meaning");
  	if (null == result) {
  		System.out.println("Not found ValueSet [codesystem-hierarchy-meaning]");
  	} else {
  		assertEquals("Expect ", "codesystem-hierarchy-meaning", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("w3c-provenance-activity-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [w3c-provenance-activity-type]");
  	} else {
  		assertEquals("Expect ", "w3c-provenance-activity-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Account");
  	result = accountDao.find("ewg");
  	if (null == result) {
  		System.out.println("Not found Account [ewg]");
  	} else {
  		assertEquals("Expect ", "ewg", ((Account)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ucum-units");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ucum-units]");
  	} else {
  		assertEquals("Expect ", "ucum-units", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-sourceReference");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-sourceReference]");
  	} else {
  		assertEquals("Expect ", "codesystem-sourceReference", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Basic");
  	result = basicDao.find("basic-example-narrative");
  	if (null == result) {
  		System.out.println("Not found Basic [basic-example-narrative]");
  	} else {
  		assertEquals("Expect ", "basic-example-narrative", ((Basic)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("resource-slicing-rules");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [resource-slicing-rules]");
  	} else {
  		assertEquals("Expect ", "resource-slicing-rules", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Patient [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("body-height");
  	if (null == result) {
  		System.out.println("Not found Observation [body-height]");
  	} else {
  		assertEquals("Expect ", "body-height", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("example");
  	if (null == result) {
  		System.out.println("Not found CarePlan [example]");
  	} else {
  		assertEquals("Expect ", "example", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("match-grade");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [match-grade]");
  	} else {
  		assertEquals("Expect ", "match-grade", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ActivityDefinition");
  	result = activitydefinitionDao.find("blood-tubes-supply");
  	if (null == result) {
  		System.out.println("Not found ActivityDefinition [blood-tubes-supply]");
  	} else {
  		assertEquals("Expect ", "blood-tubes-supply", ((ActivityDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("bp");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [bp]");
  	} else {
  		assertEquals("Expect ", "bp", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("b248b1b2-1686-4b94-9936-37d7a5f94b51");
  	if (null == result) {
  		System.out.println("Not found Bundle [b248b1b2-1686-4b94-9936-37d7a5f94b51]");
  	} else {
  		assertEquals("Expect ", "b248b1b2-1686-4b94-9936-37d7a5f94b51", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("usage-context-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [usage-context-type]");
  	} else {
  		assertEquals("Expect ", "usage-context-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("message-events");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [message-events]");
  	} else {
  		assertEquals("Expect ", "message-events", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("dataelement-sdcobjectclass");
  	if (null == result) {
  		System.out.println("Not found ValueSet [dataelement-sdcobjectclass]");
  	} else {
  		assertEquals("Expect ", "dataelement-sdcobjectclass", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("type-restful-interaction");
  	if (null == result) {
  		System.out.println("Not found ValueSet [type-restful-interaction]");
  	} else {
  		assertEquals("Expect ", "type-restful-interaction", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-maxOccurs");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-maxOccurs]");
  	} else {
  		assertEquals("Expect ", "questionnaire-maxOccurs", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("100154");
  	if (null == result) {
  		System.out.println("Not found Claim [100154]");
  	} else {
  		assertEquals("Expect ", "100154", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adverse-event-outcome");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adverse-event-outcome]");
  	} else {
  		assertEquals("Expect ", "adverse-event-outcome", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Practitioner");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Practitioner]");
  	} else {
  		assertEquals("Expect ", "Practitioner", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("sequence-species");
  	if (null == result) {
  		System.out.println("Not found ValueSet [sequence-species]");
  	} else {
  		assertEquals("Expect ", "sequence-species", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("event-capability-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [event-capability-mode]");
  	} else {
  		assertEquals("Expect ", "event-capability-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("gcs");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [gcs]");
  	} else {
  		assertEquals("Expect ", "gcs", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("name-v3-representation");
  	if (null == result) {
  		System.out.println("Not found ValueSet [name-v3-representation]");
  	} else {
  		assertEquals("Expect ", "name-v3-representation", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("options-example");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [options-example]");
  	} else {
  		assertEquals("Expect ", "options-example", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0304");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0304]");
  	} else {
  		assertEquals("Expect ", "medrx0304", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("identifier-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [identifier-type]");
  	} else {
  		assertEquals("Expect ", "identifier-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PractitionerRole");
  	result = practitionerroleDao.find("example");
  	if (null == result) {
  		System.out.println("Not found PractitionerRole [example]");
  	} else {
  		assertEquals("Expect ", "example", ((PractitionerRole)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("sibling-relationship-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [sibling-relationship-codes]");
  	} else {
  		assertEquals("Expect ", "sibling-relationship-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("condition-clinical");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [condition-clinical]");
  	} else {
  		assertEquals("Expect ", "condition-clinical", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DiagnosticReport-geneticsFamilyMemberHistory");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DiagnosticReport-geneticsFamilyMemberHistory]");
  	} else {
  		assertEquals("Expect ", "DiagnosticReport-geneticsFamilyMemberHistory", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve QuestionnaireResponse");
  	result = questionnaireresponseDao.find("gcs");
  	if (null == result) {
  		System.out.println("Not found QuestionnaireResponse [gcs]");
  	} else {
  		assertEquals("Expect ", "gcs", ((QuestionnaireResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("location-alias");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [location-alias]");
  	} else {
  		assertEquals("Expect ", "location-alias", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("fips-county");
  	if (null == result) {
  		System.out.println("Not found ValueSet [fips-county]");
  	} else {
  		assertEquals("Expect ", "fips-county", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("constraint-severity");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [constraint-severity]");
  	} else {
  		assertEquals("Expect ", "constraint-severity", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Substance");
  	result = substanceDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found Substance [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((Substance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("bundle-response");
  	if (null == result) {
  		System.out.println("Not found Bundle [bundle-response]");
  	} else {
  		assertEquals("Expect ", "bundle-response", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("procedure-followup");
  	if (null == result) {
  		System.out.println("Not found ValueSet [procedure-followup]");
  	} else {
  		assertEquals("Expect ", "procedure-followup", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("benefit-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [benefit-type]");
  	} else {
  		assertEquals("Expect ", "benefit-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adverse-event-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adverse-event-type]");
  	} else {
  		assertEquals("Expect ", "adverse-event-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("codesystem-hierarchy-meaning");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [codesystem-hierarchy-meaning]");
  	} else {
  		assertEquals("Expect ", "codesystem-hierarchy-meaning", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ElementDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ElementDefinition]");
  	} else {
  		assertEquals("Expect ", "ElementDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Substance");
  	result = substanceDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Substance [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Substance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("list-empty-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [list-empty-reason]");
  	} else {
  		assertEquals("Expect ", "list-empty-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adverse-event-causality");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adverse-event-causality]");
  	} else {
  		assertEquals("Expect ", "adverse-event-causality", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("familymemberhistory-type");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [familymemberhistory-type]");
  	} else {
  		assertEquals("Expect ", "familymemberhistory-type", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Provenance");
  	result = provenanceDao.find("consent-signature");
  	if (null == result) {
  		System.out.println("Not found Provenance [consent-signature]");
  	} else {
  		assertEquals("Expect ", "consent-signature", ((Provenance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("metric-color");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [metric-color]");
  	} else {
  		assertEquals("Expect ", "metric-color", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("RelatedPerson");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [RelatedPerson]");
  	} else {
  		assertEquals("Expect ", "RelatedPerson", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("1832473e-2fe0-452d-abe9-3cdb9879522f");
  	if (null == result) {
  		System.out.println("Not found Organization [1832473e-2fe0-452d-abe9-3cdb9879522f]");
  	} else {
  		assertEquals("Expect ", "1832473e-2fe0-452d-abe9-3cdb9879522f", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ex-diagnosistype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ex-diagnosistype]");
  	} else {
  		assertEquals("Expect ", "ex-diagnosistype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("medicationdispense-validityPeriod");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [medicationdispense-validityPeriod]");
  	} else {
  		assertEquals("Expect ", "medicationdispense-validityPeriod", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("remittance-outcome");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [remittance-outcome]");
  	} else {
  		assertEquals("Expect ", "remittance-outcome", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("bundle-request-medsallergies");
  	if (null == result) {
  		System.out.println("Not found Bundle [bundle-request-medsallergies]");
  	} else {
  		assertEquals("Expect ", "bundle-request-medsallergies", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("measure-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [measure-type]");
  	} else {
  		assertEquals("Expect ", "measure-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Encounter");
  	result = encounterDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found Encounter [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((Encounter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedurerequest-geneticsItem");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedurerequest-geneticsItem]");
  	} else {
  		assertEquals("Expect ", "procedurerequest-geneticsItem", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("coding-sctdescid");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [coding-sctdescid]");
  	} else {
  		assertEquals("Expect ", "coding-sctdescid", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("UsageContext");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [UsageContext]");
  	} else {
  		assertEquals("Expect ", "UsageContext", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0309");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0309]");
  	} else {
  		assertEquals("Expect ", "medrx0309", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("fundsreserve");
  	if (null == result) {
  		System.out.println("Not found ValueSet [fundsreserve]");
  	} else {
  		assertEquals("Expect ", "fundsreserve", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("diagnosticreport-genetics");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [diagnosticreport-genetics]");
  	} else {
  		assertEquals("Expect ", "diagnosticreport-genetics", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("practitioner-animalSpecies");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [practitioner-animalSpecies]");
  	} else {
  		assertEquals("Expect ", "practitioner-animalSpecies", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("procedure-progress-status-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [procedure-progress-status-codes]");
  	} else {
  		assertEquals("Expect ", "procedure-progress-status-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedure-causedBy");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedure-causedBy]");
  	} else {
  		assertEquals("Expect ", "procedure-causedBy", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("vaccination-protocol-dose-status-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [vaccination-protocol-dose-status-reason]");
  	} else {
  		assertEquals("Expect ", "vaccination-protocol-dose-status-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("goal-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [goal-status]");
  	} else {
  		assertEquals("Expect ", "goal-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Parameters");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Parameters]");
  	} else {
  		assertEquals("Expect ", "Parameters", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-system");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-system]");
  	} else {
  		assertEquals("Expect ", "valueset-system", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("measurement-principle");
  	if (null == result) {
  		System.out.println("Not found ValueSet [measurement-principle]");
  	} else {
  		assertEquals("Expect ", "measurement-principle", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("manifestation-or-symptom");
  	if (null == result) {
  		System.out.println("Not found ValueSet [manifestation-or-symptom]");
  	} else {
  		assertEquals("Expect ", "manifestation-or-symptom", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("list-example-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [list-example-codes]");
  	} else {
  		assertEquals("Expect ", "list-example-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("testscript-operation-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [testscript-operation-codes]");
  	} else {
  		assertEquals("Expect ", "testscript-operation-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("resource-approvalDate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [resource-approvalDate]");
  	} else {
  		assertEquals("Expect ", "resource-approvalDate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0302");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0302]");
  	} else {
  		assertEquals("Expect ", "medadmin0302", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("communicationrequest-supportingInfo");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [communicationrequest-supportingInfo]");
  	} else {
  		assertEquals("Expect ", "communicationrequest-supportingInfo", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0310");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0310]");
  	} else {
  		assertEquals("Expect ", "meddisp0310", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("condition-extensions-Condition-part-of");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [condition-extensions-Condition-part-of]");
  	} else {
  		assertEquals("Expect ", "condition-extensions-Condition-part-of", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CareTeam");
  	result = careteamDao.find("example");
  	if (null == result) {
  		System.out.println("Not found CareTeam [example]");
  	} else {
  		assertEquals("Expect ", "example", ((CareTeam)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("slotstatus");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [slotstatus]");
  	} else {
  		assertEquals("Expect ", "slotstatus", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("condition-occurredFollowing");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [condition-occurredFollowing]");
  	} else {
  		assertEquals("Expect ", "condition-occurredFollowing", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("consent-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [consent-category]");
  	} else {
  		assertEquals("Expect ", "consent-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("goal-acceptance-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [goal-acceptance-status]");
  	} else {
  		assertEquals("Expect ", "goal-acceptance-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Specimen");
  	result = specimenDao.find("sst");
  	if (null == result) {
  		System.out.println("Not found Specimen [sst]");
  	} else {
  		assertEquals("Expect ", "sst", ((Specimen)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("allergy-intolerance-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [allergy-intolerance-category]");
  	} else {
  		assertEquals("Expect ", "allergy-intolerance-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("ekg");
  	if (null == result) {
  		System.out.println("Not found Observation [ekg]");
  	} else {
  		assertEquals("Expect ", "ekg", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("CarePlan");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [CarePlan]");
  	} else {
  		assertEquals("Expect ", "CarePlan", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("questionnaire-display-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [questionnaire-display-category]");
  	} else {
  		assertEquals("Expect ", "questionnaire-display-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("1minute-apgar-score");
  	if (null == result) {
  		System.out.println("Not found Observation [1minute-apgar-score]");
  	} else {
  		assertEquals("Expect ", "1minute-apgar-score", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("openEHR-careplan");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [openEHR-careplan]");
  	} else {
  		assertEquals("Expect ", "openEHR-careplan", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("namingsystem-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [namingsystem-type]");
  	} else {
  		assertEquals("Expect ", "namingsystem-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-data-absent-reason-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-data-absent-reason-v3]");
  	} else {
  		assertEquals("Expect ", "cm-data-absent-reason-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("zika-virus-intervention-logic");
  	if (null == result) {
  		System.out.println("Not found Library [zika-virus-intervention-logic]");
  	} else {
  		assertEquals("Expect ", "zika-virus-intervention-logic", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("f205");
  	if (null == result) {
  		System.out.println("Not found Condition [f205]");
  	} else {
  		assertEquals("Expect ", "f205", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Library [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("CodeSystem-lookup");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [CodeSystem-lookup]");
  	} else {
  		assertEquals("Expect ", "CodeSystem-lookup", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-sourceStructureMap");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-sourceStructureMap]");
  	} else {
  		assertEquals("Expect ", "questionnaire-sourceStructureMap", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-notOrg");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-notOrg]");
  	} else {
  		assertEquals("Expect ", "consent-example-notOrg", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-fhirType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-fhirType]");
  	} else {
  		assertEquals("Expect ", "questionnaire-fhirType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("related-claim-relationship");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [related-claim-relationship]");
  	} else {
  		assertEquals("Expect ", "related-claim-relationship", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("supplyrequest-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [supplyrequest-status]");
  	} else {
  		assertEquals("Expect ", "supplyrequest-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("bundle-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [bundle-type]");
  	} else {
  		assertEquals("Expect ", "bundle-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("allergyintolerance-resolutionAge");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [allergyintolerance-resolutionAge]");
  	} else {
  		assertEquals("Expect ", "allergyintolerance-resolutionAge", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ActivityDefinition");
  	result = activitydefinitionDao.find("heart-valve-replacement");
  	if (null == result) {
  		System.out.println("Not found ActivityDefinition [heart-valve-replacement]");
  	} else {
  		assertEquals("Expect ", "heart-valve-replacement", ((ActivityDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("integer");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [integer]");
  	} else {
  		assertEquals("Expect ", "integer", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adjudication");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adjudication]");
  	} else {
  		assertEquals("Expect ", "adjudication", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("immunization-recommendation-date-criterion");
  	if (null == result) {
  		System.out.println("Not found ValueSet [immunization-recommendation-date-criterion]");
  	} else {
  		assertEquals("Expect ", "immunization-recommendation-date-criterion", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RiskAssessment");
  	result = riskassessmentDao.find("population");
  	if (null == result) {
  		System.out.println("Not found RiskAssessment [population]");
  	} else {
  		assertEquals("Expect ", "population", ((RiskAssessment)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NamingSystem");
  	result = namingsystemDao.find("example-replaced");
  	if (null == result) {
  		System.out.println("Not found NamingSystem [example-replaced]");
  	} else {
  		assertEquals("Expect ", "example-replaced", ((NamingSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-buildingNumberSuffix");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-buildingNumberSuffix]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-buildingNumberSuffix", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("gingival-mass");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [gingival-mass]");
  	} else {
  		assertEquals("Expect ", "gingival-mass", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-de-change-description");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-de-change-description]");
  	} else {
  		assertEquals("Expect ", "11179-de-change-description", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Flag");
  	result = flagDao.find("example-encounter");
  	if (null == result) {
  		System.out.println("Not found Flag [example-encounter]");
  	} else {
  		assertEquals("Expect ", "example-encounter", ((Flag)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("http-response-header");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [http-response-header]");
  	} else {
  		assertEquals("Expect ", "http-response-header", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("classification-or-context");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [classification-or-context]");
  	} else {
  		assertEquals("Expect ", "classification-or-context", ((CodeSystem)result).getId());
  	}
  	System.out.println("Total tests .. " + count);
  }
  @Test
  public void test930() throws Exception {
  	Object local = null;
  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-warning");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-warning]");
  	} else {
  		assertEquals("Expect ", "valueset-warning", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0306");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0306]");
  	} else {
  		assertEquals("Expect ", "meddisp0306", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("audit-event-sub-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [audit-event-sub-type]");
  	} else {
  		assertEquals("Expect ", "audit-event-sub-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0321");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0321]");
  	} else {
  		assertEquals("Expect ", "meddisp0321", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Coverage");
  	result = coverageDao.find("9876B1");
  	if (null == result) {
  		System.out.println("Not found Coverage [9876B1]");
  	} else {
  		assertEquals("Expect ", "9876B1", ((Coverage)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("postal-address-use");
  	if (null == result) {
  		System.out.println("Not found ValueSet [postal-address-use]");
  	} else {
  		assertEquals("Expect ", "postal-address-use", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("device-implant-status");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [device-implant-status]");
  	} else {
  		assertEquals("Expect ", "device-implant-status", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsDNASequenceVariantType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsDNASequenceVariantType]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsDNASequenceVariantType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-unitType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-unitType]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-unitType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("auditevent-NumberOfInstances");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [auditevent-NumberOfInstances]");
  	} else {
  		assertEquals("Expect ", "auditevent-NumberOfInstances", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("testscript-profile-origin-types");
  	if (null == result) {
  		System.out.println("Not found ValueSet [testscript-profile-origin-types]");
  	} else {
  		assertEquals("Expect ", "testscript-profile-origin-types", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("RiskAssessment");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [RiskAssessment]");
  	} else {
  		assertEquals("Expect ", "RiskAssessment", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("specimen-collection-method");
  	if (null == result) {
  		System.out.println("Not found ValueSet [specimen-collection-method]");
  	} else {
  		assertEquals("Expect ", "specimen-collection-method", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-caseSensitive");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-caseSensitive]");
  	} else {
  		assertEquals("Expect ", "valueset-caseSensitive", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-displayCategory");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-displayCategory]");
  	} else {
  		assertEquals("Expect ", "questionnaire-displayCategory", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("care-team-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [care-team-status]");
  	} else {
  		assertEquals("Expect ", "care-team-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("unsat");
  	if (null == result) {
  		System.out.println("Not found Observation [unsat]");
  	} else {
  		assertEquals("Expect ", "unsat", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DeviceMetric");
  	result = devicemetricDao.find("example");
  	if (null == result) {
  		System.out.println("Not found DeviceMetric [example]");
  	} else {
  		assertEquals("Expect ", "example", ((DeviceMetric)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("service-referral-method");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [service-referral-method]");
  	} else {
  		assertEquals("Expect ", "service-referral-method", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("identity-assuranceLevel");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [identity-assuranceLevel]");
  	} else {
  		assertEquals("Expect ", "identity-assuranceLevel", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("episodeofcare-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [episodeofcare-type]");
  	} else {
  		assertEquals("Expect ", "episodeofcare-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("NamingSystem");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [NamingSystem]");
  	} else {
  		assertEquals("Expect ", "NamingSystem", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("dicom-cid29");
  	if (null == result) {
  		System.out.println("Not found ValueSet [dicom-cid29]");
  	} else {
  		assertEquals("Expect ", "dicom-cid29", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("codesystem-content-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [codesystem-content-mode]");
  	} else {
  		assertEquals("Expect ", "codesystem-content-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-SC-coding");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-SC-coding]");
  	} else {
  		assertEquals("Expect ", "iso21090-SC-coding", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("condition-outcome");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [condition-outcome]");
  	} else {
  		assertEquals("Expect ", "condition-outcome", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0303");
  	if (null == result) {
  		System.out.println("Not found Medication [med0303]");
  	} else {
  		assertEquals("Expect ", "med0303", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-codes]");
  	} else {
  		assertEquals("Expect ", "medication-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("guide-dependency-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [guide-dependency-type]");
  	} else {
  		assertEquals("Expect ", "guide-dependency-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-request-priority");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-request-priority]");
  	} else {
  		assertEquals("Expect ", "medication-request-priority", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("CodeableConcept");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [CodeableConcept]");
  	} else {
  		assertEquals("Expect ", "CodeableConcept", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0308");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0308]");
  	} else {
  		assertEquals("Expect ", "medrx0308", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("care-plan-activity-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [care-plan-activity-category]");
  	} else {
  		assertEquals("Expect ", "care-plan-activity-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-censusTract");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-censusTract]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-censusTract", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("AppointmentResponse");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [AppointmentResponse]");
  	} else {
  		assertEquals("Expect ", "AppointmentResponse", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("elementdefinition-11179-DataElement-objectClassProperty");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [elementdefinition-11179-DataElement-objectClassProperty]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-11179-DataElement-objectClassProperty", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsDNASequenceVariantName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsDNASequenceVariantName]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsDNASequenceVariantName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found Organization [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Measure");
  	result = measureDao.find("component-a-example");
  	if (null == result) {
  		System.out.println("Not found Measure [component-a-example]");
  	} else {
  		assertEquals("Expect ", "component-a-example", ((Measure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("care-plan-activity-outcome");
  	if (null == result) {
  		System.out.println("Not found ValueSet [care-plan-activity-outcome]");
  	} else {
  		assertEquals("Expect ", "care-plan-activity-outcome", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("task-performer-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [task-performer-type]");
  	} else {
  		assertEquals("Expect ", "task-performer-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("cardiacdiet");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [cardiacdiet]");
  	} else {
  		assertEquals("Expect ", "cardiacdiet", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("policyholder-relationship");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [policyholder-relationship]");
  	} else {
  		assertEquals("Expect ", "policyholder-relationship", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("referralrequest-reasonRefused");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [referralrequest-reasonRefused]");
  	} else {
  		assertEquals("Expect ", "referralrequest-reasonRefused", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsPhaseSet");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsPhaseSet]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsPhaseSet", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("guide-dependency-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [guide-dependency-type]");
  	} else {
  		assertEquals("Expect ", "guide-dependency-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-bindingName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-bindingName]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-bindingName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("zika-virus-intervention-initial");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [zika-virus-intervention-initial]");
  	} else {
  		assertEquals("Expect ", "zika-virus-intervention-initial", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("map-model-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [map-model-mode]");
  	} else {
  		assertEquals("Expect ", "map-model-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("search-modifier-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [search-modifier-code]");
  	} else {
  		assertEquals("Expect ", "search-modifier-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-expirationDate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-expirationDate]");
  	} else {
  		assertEquals("Expect ", "codesystem-expirationDate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("extension-context");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [extension-context]");
  	} else {
  		assertEquals("Expect ", "extension-context", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("payment-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [payment-type]");
  	} else {
  		assertEquals("Expect ", "payment-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("audit-entity-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [audit-entity-type]");
  	} else {
  		assertEquals("Expect ", "audit-entity-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Extension");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Extension]");
  	} else {
  		assertEquals("Expect ", "Extension", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("TestScript");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [TestScript]");
  	} else {
  		assertEquals("Expect ", "TestScript", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-de-is-data-element-concept");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-de-is-data-element-concept]");
  	} else {
  		assertEquals("Expect ", "11179-de-is-data-element-concept", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("colon-biopsy");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [colon-biopsy]");
  	} else {
  		assertEquals("Expect ", "colon-biopsy", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("SupplyDelivery");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [SupplyDelivery]");
  	} else {
  		assertEquals("Expect ", "SupplyDelivery", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0301");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0301]");
  	} else {
  		assertEquals("Expect ", "medadmin0301", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("subscription-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [subscription-status]");
  	} else {
  		assertEquals("Expect ", "subscription-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("filter-operator");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [filter-operator]");
  	} else {
  		assertEquals("Expect ", "filter-operator", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("example-implant");
  	if (null == result) {
  		System.out.println("Not found Procedure [example-implant]");
  	} else {
  		assertEquals("Expect ", "example-implant", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("102");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [102]");
  	} else {
  		assertEquals("Expect ", "102", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("flag-priority");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [flag-priority]");
  	} else {
  		assertEquals("Expect ", "flag-priority", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("satO2");
  	if (null == result) {
  		System.out.println("Not found Observation [satO2]");
  	} else {
  		assertEquals("Expect ", "satO2", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-replacedby");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-replacedby]");
  	} else {
  		assertEquals("Expect ", "codesystem-replacedby", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("flag-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [flag-status]");
  	} else {
  		assertEquals("Expect ", "flag-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("coverage-selfpay");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [coverage-selfpay]");
  	} else {
  		assertEquals("Expect ", "coverage-selfpay", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("composition-clindoc-otherConfidentiality");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [composition-clindoc-otherConfidentiality]");
  	} else {
  		assertEquals("Expect ", "composition-clindoc-otherConfidentiality", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("endpoint-payload-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [endpoint-payload-type]");
  	} else {
  		assertEquals("Expect ", "endpoint-payload-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Binary");
  	result = binaryDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Binary [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Binary)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("ihe-pcd");
  	if (null == result) {
  		System.out.println("Not found Patient [ihe-pcd]");
  	} else {
  		assertEquals("Expect ", "ihe-pcd", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-genetics-2");
  	if (null == result) {
  		System.out.println("Not found Observation [example-genetics-2]");
  	} else {
  		assertEquals("Expect ", "example-genetics-2", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("binding-strength");
  	if (null == result) {
  		System.out.println("Not found ValueSet [binding-strength]");
  	} else {
  		assertEquals("Expect ", "binding-strength", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("iso-21089-lifecycle");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [iso-21089-lifecycle]");
  	} else {
  		assertEquals("Expect ", "iso-21089-lifecycle", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("service-pharmacy");
  	if (null == result) {
  		System.out.println("Not found ValueSet [service-pharmacy]");
  	} else {
  		assertEquals("Expect ", "service-pharmacy", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("assert-direction-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [assert-direction-codes]");
  	} else {
  		assertEquals("Expect ", "assert-direction-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0302");
  	if (null == result) {
  		System.out.println("Not found Medication [med0302]");
  	} else {
  		assertEquals("Expect ", "med0302", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("service-product");
  	if (null == result) {
  		System.out.println("Not found ValueSet [service-product]");
  	} else {
  		assertEquals("Expect ", "service-product", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-required-behavior");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-required-behavior]");
  	} else {
  		assertEquals("Expect ", "action-required-behavior", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-minOccurs");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-minOccurs]");
  	} else {
  		assertEquals("Expect ", "questionnaire-minOccurs", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("fundsreserve");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [fundsreserve]");
  	} else {
  		assertEquals("Expect ", "fundsreserve", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("signature-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [signature-type]");
  	} else {
  		assertEquals("Expect ", "signature-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("list-empty-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [list-empty-reason]");
  	} else {
  		assertEquals("Expect ", "list-empty-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AppointmentResponse");
  	result = appointmentresponseDao.find("example");
  	if (null == result) {
  		System.out.println("Not found AppointmentResponse [example]");
  	} else {
  		assertEquals("Expect ", "example", ((AppointmentResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("organization-extensions-Organization-alias");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [organization-extensions-Organization-alias]");
  	} else {
  		assertEquals("Expect ", "organization-extensions-Organization-alias", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ImplementationGuide");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ImplementationGuide]");
  	} else {
  		assertEquals("Expect ", "ImplementationGuide", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("search-xpath-usage");
  	if (null == result) {
  		System.out.println("Not found ValueSet [search-xpath-usage]");
  	} else {
  		assertEquals("Expect ", "search-xpath-usage", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("100153");
  	if (null == result) {
  		System.out.println("Not found Claim [100153]");
  	} else {
  		assertEquals("Expect ", "100153", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found CarePlan [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("exclusive-breastfeeding-intervention-02");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [exclusive-breastfeeding-intervention-02]");
  	} else {
  		assertEquals("Expect ", "exclusive-breastfeeding-intervention-02", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Task");
  	result = taskDao.find("example2");
  	if (null == result) {
  		System.out.println("Not found Task [example2]");
  	} else {
  		assertEquals("Expect ", "example2", ((Task)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("humanname-own-name");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [humanname-own-name]");
  	} else {
  		assertEquals("Expect ", "humanname-own-name", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("identifier-validDate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [identifier-validDate]");
  	} else {
  		assertEquals("Expect ", "identifier-validDate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("conditional-delete-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [conditional-delete-status]");
  	} else {
  		assertEquals("Expect ", "conditional-delete-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f203");
  	if (null == result) {
  		System.out.println("Not found Observation [f203]");
  	} else {
  		assertEquals("Expect ", "f203", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("sequence-quality-standardSequence");
  	if (null == result) {
  		System.out.println("Not found ValueSet [sequence-quality-standardSequence]");
  	} else {
  		assertEquals("Expect ", "sequence-quality-standardSequence", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("task-replaces");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [task-replaces]");
  	} else {
  		assertEquals("Expect ", "task-replaces", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Binary");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Binary]");
  	} else {
  		assertEquals("Expect ", "Binary", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("observation-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [observation-category]");
  	} else {
  		assertEquals("Expect ", "observation-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contract-content-derivative");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contract-content-derivative]");
  	} else {
  		assertEquals("Expect ", "contract-content-derivative", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("hla-genotyping-results-haploid");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [hla-genotyping-results-haploid]");
  	} else {
  		assertEquals("Expect ", "hla-genotyping-results-haploid", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("pat3");
  	if (null == result) {
  		System.out.println("Not found Patient [pat3]");
  	} else {
  		assertEquals("Expect ", "pat3", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("body-length");
  	if (null == result) {
  		System.out.println("Not found Observation [body-length]");
  	} else {
  		assertEquals("Expect ", "body-length", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("report");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [report]");
  	} else {
  		assertEquals("Expect ", "report", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("service-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [service-type]");
  	} else {
  		assertEquals("Expect ", "service-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-ballot-status");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-ballot-status]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-ballot-status", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("3ad0687e-f477-468c-afd5-fcc2bf897819");
  	if (null == result) {
  		System.out.println("Not found Bundle [3ad0687e-f477-468c-afd5-fcc2bf897819]");
  	} else {
  		assertEquals("Expect ", "3ad0687e-f477-468c-afd5-fcc2bf897819", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("f202");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [f202]");
  	} else {
  		assertEquals("Expect ", "f202", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("allergy-verification-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [allergy-verification-status]");
  	} else {
  		assertEquals("Expect ", "allergy-verification-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ParameterDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ParameterDefinition]");
  	} else {
  		assertEquals("Expect ", "ParameterDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("teeth");
  	if (null == result) {
  		System.out.println("Not found ValueSet [teeth]");
  	} else {
  		assertEquals("Expect ", "teeth", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("nutrient-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [nutrient-code]");
  	} else {
  		assertEquals("Expect ", "nutrient-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-deliveryInstallationQualifier");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-deliveryInstallationQualifier]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-deliveryInstallationQualifier", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0329");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0329]");
  	} else {
  		assertEquals("Expect ", "medrx0329", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("unknown-content-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [unknown-content-code]");
  	} else {
  		assertEquals("Expect ", "unknown-content-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve GraphDefinition");
  	result = graphdefinitionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found GraphDefinition [example]");
  	} else {
  		assertEquals("Expect ", "example", ((GraphDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f007");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f007]");
  	} else {
  		assertEquals("Expect ", "f007", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Task");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Task]");
  	} else {
  		assertEquals("Expect ", "Task", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("consent-Witness");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [consent-Witness]");
  	} else {
  		assertEquals("Expect ", "consent-Witness", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-reason]");
  	} else {
  		assertEquals("Expect ", "encounter-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("enteralbolus");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [enteralbolus]");
  	} else {
  		assertEquals("Expect ", "enteralbolus", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("immunization-recommendation-date-criterion");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [immunization-recommendation-date-criterion]");
  	} else {
  		assertEquals("Expect ", "immunization-recommendation-date-criterion", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f003");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f003]");
  	} else {
  		assertEquals("Expect ", "f003", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("sequence-quality-method");
  	if (null == result) {
  		System.out.println("Not found ValueSet [sequence-quality-method]");
  	} else {
  		assertEquals("Expect ", "sequence-quality-method", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-effectiveDate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-effectiveDate]");
  	} else {
  		assertEquals("Expect ", "codesystem-effectiveDate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adjudication-error");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adjudication-error]");
  	} else {
  		assertEquals("Expect ", "adjudication-error", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedurerequest-approachBodySite");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedurerequest-approachBodySite]");
  	} else {
  		assertEquals("Expect ", "procedurerequest-approachBodySite", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-translatable");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-translatable]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-translatable", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("trigger-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [trigger-type]");
  	} else {
  		assertEquals("Expect ", "trigger-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("location-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [location-status]");
  	} else {
  		assertEquals("Expect ", "location-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("pharmacy-core-rateGoal");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [pharmacy-core-rateGoal]");
  	} else {
  		assertEquals("Expect ", "pharmacy-core-rateGoal", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("vaccination-protocol-dose-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [vaccination-protocol-dose-status]");
  	} else {
  		assertEquals("Expect ", "vaccination-protocol-dose-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-table-name");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-table-name]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-table-name", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("pharmacy-core-rateIncrementInterval");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [pharmacy-core-rateIncrementInterval]");
  	} else {
  		assertEquals("Expect ", "pharmacy-core-rateIncrementInterval", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0317");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0317]");
  	} else {
  		assertEquals("Expect ", "medrx0317", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("namingsystem-identifier-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [namingsystem-identifier-type]");
  	} else {
  		assertEquals("Expect ", "namingsystem-identifier-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("MedicationDispense");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [MedicationDispense]");
  	} else {
  		assertEquals("Expect ", "MedicationDispense", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("location-physical-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [location-physical-type]");
  	} else {
  		assertEquals("Expect ", "location-physical-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("appendectomy-narrative");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [appendectomy-narrative]");
  	} else {
  		assertEquals("Expect ", "appendectomy-narrative", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("StructureDefinition-questionnaire");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [StructureDefinition-questionnaire]");
  	} else {
  		assertEquals("Expect ", "StructureDefinition-questionnaire", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("colonoscopy");
  	if (null == result) {
  		System.out.println("Not found Procedure [colonoscopy]");
  	} else {
  		assertEquals("Expect ", "colonoscopy", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-genetics-5");
  	if (null == result) {
  		System.out.println("Not found Observation [example-genetics-5]");
  	} else {
  		assertEquals("Expect ", "example-genetics-5", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("ghp");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [ghp]");
  	} else {
  		assertEquals("Expect ", "ghp", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("allergy-clinical-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [allergy-clinical-status]");
  	} else {
  		assertEquals("Expect ", "allergy-clinical-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FHIRList");
  	result = fhirlistDao.find("med-list");
  	if (null == result) {
  		System.out.println("Not found FHIRList [med-list]");
  	} else {
  		assertEquals("Expect ", "med-list", ((FHIRList)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("claim-exception");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [claim-exception]");
  	} else {
  		assertEquals("Expect ", "claim-exception", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-expirationDate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-expirationDate]");
  	} else {
  		assertEquals("Expect ", "valueset-expirationDate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("glasgow");
  	if (null == result) {
  		System.out.println("Not found Observation [glasgow]");
  	} else {
  		assertEquals("Expect ", "glasgow", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-keyWord");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-keyWord]");
  	} else {
  		assertEquals("Expect ", "codesystem-keyWord", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("udi");
  	if (null == result) {
  		System.out.println("Not found ValueSet [udi]");
  	} else {
  		assertEquals("Expect ", "udi", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contact-point-system");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contact-point-system]");
  	} else {
  		assertEquals("Expect ", "contact-point-system", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Specimen");
  	result = specimenDao.find("isolate");
  	if (null == result) {
  		System.out.println("Not found Specimen [isolate]");
  	} else {
  		assertEquals("Expect ", "isolate", ((Specimen)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ResearchStudy");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ResearchStudy]");
  	} else {
  		assertEquals("Expect ", "ResearchStudy", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("codesystem-extensions-CodeSystem-author");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [codesystem-extensions-CodeSystem-author]");
  	} else {
  		assertEquals("Expect ", "codesystem-extensions-CodeSystem-author", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("nhin-purposeofuse");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [nhin-purposeofuse]");
  	} else {
  		assertEquals("Expect ", "nhin-purposeofuse", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("subscription-channel-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [subscription-channel-type]");
  	} else {
  		assertEquals("Expect ", "subscription-channel-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("actionlist");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [actionlist]");
  	} else {
  		assertEquals("Expect ", "actionlist", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("example");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [example]");
  	} else {
  		assertEquals("Expect ", "example", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CommunicationRequest");
  	result = communicationrequestDao.find("fm-solicit");
  	if (null == result) {
  		System.out.println("Not found CommunicationRequest [fm-solicit]");
  	} else {
  		assertEquals("Expect ", "fm-solicit", ((CommunicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("c80-doc-classcodes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [c80-doc-classcodes]");
  	} else {
  		assertEquals("Expect ", "c80-doc-classcodes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-contact-point-use-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-contact-point-use-v3]");
  	} else {
  		assertEquals("Expect ", "cm-contact-point-use-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DetectedIssue");
  	result = detectedissueDao.find("allergy");
  	if (null == result) {
  		System.out.println("Not found DetectedIssue [allergy]");
  	} else {
  		assertEquals("Expect ", "allergy", ((DetectedIssue)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("education");
  	if (null == result) {
  		System.out.println("Not found Procedure [education]");
  	} else {
  		assertEquals("Expect ", "education", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ex-diagnosisrelatedgroup");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ex-diagnosisrelatedgroup]");
  	} else {
  		assertEquals("Expect ", "ex-diagnosisrelatedgroup", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("encounter-participant-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [encounter-participant-type]");
  	} else {
  		assertEquals("Expect ", "encounter-participant-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("specimen-processing-procedure");
  	if (null == result) {
  		System.out.println("Not found ValueSet [specimen-processing-procedure]");
  	} else {
  		assertEquals("Expect ", "specimen-processing-procedure", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("usage-context-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [usage-context-type]");
  	} else {
  		assertEquals("Expect ", "usage-context-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("versioning-policy");
  	if (null == result) {
  		System.out.println("Not found ValueSet [versioning-policy]");
  	} else {
  		assertEquals("Expect ", "versioning-policy", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("ServiceDefinition-evaluate");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [ServiceDefinition-evaluate]");
  	} else {
  		assertEquals("Expect ", "ServiceDefinition-evaluate", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("extensions");
  	if (null == result) {
  		System.out.println("Not found Bundle [extensions]");
  	} else {
  		assertEquals("Expect ", "extensions", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve EligibilityResponse");
  	result = eligibilityresponseDao.find("E2502");
  	if (null == result) {
  		System.out.println("Not found EligibilityResponse [E2502]");
  	} else {
  		assertEquals("Expect ", "E2502", ((EligibilityResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("match-grade");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [match-grade]");
  	} else {
  		assertEquals("Expect ", "match-grade", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AllergyIntolerance");
  	result = allergyintoleranceDao.find("medication");
  	if (null == result) {
  		System.out.println("Not found AllergyIntolerance [medication]");
  	} else {
  		assertEquals("Expect ", "medication", ((AllergyIntolerance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("search-comparator");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [search-comparator]");
  	} else {
  		assertEquals("Expect ", "search-comparator", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-de-contact-address");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-de-contact-address]");
  	} else {
  		assertEquals("Expect ", "11179-de-contact-address", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-template-status");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-template-status]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-template-status", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Money");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Money]");
  	} else {
  		assertEquals("Expect ", "Money", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adjudication-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adjudication-reason]");
  	} else {
  		assertEquals("Expect ", "adjudication-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DeviceRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DeviceRequest]");
  	} else {
  		assertEquals("Expect ", "DeviceRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-outcome");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-outcome]");
  	} else {
  		assertEquals("Expect ", "condition-outcome", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("integrate");
  	if (null == result) {
  		System.out.println("Not found CarePlan [integrate]");
  	} else {
  		assertEquals("Expect ", "integrate", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("clinical-impression-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [clinical-impression-status]");
  	} else {
  		assertEquals("Expect ", "clinical-impression-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("hl7");
  	if (null == result) {
  		System.out.println("Not found Organization [hl7]");
  	} else {
  		assertEquals("Expect ", "hl7", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("enteralcontinuous");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [enteralcontinuous]");
  	} else {
  		assertEquals("Expect ", "enteralcontinuous", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("claim-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [claim-type]");
  	} else {
  		assertEquals("Expect ", "claim-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AuditEvent");
  	result = auditeventDao.find("example-logout");
  	if (null == result) {
  		System.out.println("Not found AuditEvent [example-logout]");
  	} else {
  		assertEquals("Expect ", "example-logout", ((AuditEvent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CompartmentDefinition");
  	result = compartmentdefinitionDao.find("device");
  	if (null == result) {
  		System.out.println("Not found CompartmentDefinition [device]");
  	} else {
  		assertEquals("Expect ", "device", ((CompartmentDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("detectedissue-severity");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [detectedissue-severity]");
  	} else {
  		assertEquals("Expect ", "detectedissue-severity", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("note-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [note-type]");
  	} else {
  		assertEquals("Expect ", "note-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("location-physical-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [location-physical-type]");
  	} else {
  		assertEquals("Expect ", "location-physical-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adverse-event-seriousness");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adverse-event-seriousness]");
  	} else {
  		assertEquals("Expect ", "adverse-event-seriousness", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0322");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0322]");
  	} else {
  		assertEquals("Expect ", "medrx0322", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f004");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f004]");
  	} else {
  		assertEquals("Expect ", "f004", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-stage");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-stage]");
  	} else {
  		assertEquals("Expect ", "condition-stage", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Immunization");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Immunization]");
  	} else {
  		assertEquals("Expect ", "Immunization", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0327");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0327]");
  	} else {
  		assertEquals("Expect ", "meddisp0327", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("operation-outcome");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [operation-outcome]");
  	} else {
  		assertEquals("Expect ", "operation-outcome", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("research-subject-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [research-subject-status]");
  	} else {
  		assertEquals("Expect ", "research-subject-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve TestScript");
  	result = testscriptDao.find("testscript-example-readtest");
  	if (null == result) {
  		System.out.println("Not found TestScript [testscript-example-readtest]");
  	} else {
  		assertEquals("Expect ", "testscript-example-readtest", ((TestScript)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-medication-request-status-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-medication-request-status-v3]");
  	} else {
  		assertEquals("Expect ", "cm-medication-request-status-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ResearchSubject");
  	result = researchsubjectDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ResearchSubject [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ResearchSubject)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0313");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0313]");
  	} else {
  		assertEquals("Expect ", "meddisp0313", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("condition-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [condition-category]");
  	} else {
  		assertEquals("Expect ", "condition-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ReferralRequest");
  	result = referralrequestDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ReferralRequest [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ReferralRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("quality-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [quality-type]");
  	} else {
  		assertEquals("Expect ", "quality-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("headcircum");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [headcircum]");
  	} else {
  		assertEquals("Expect ", "headcircum", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("reference-version-rules");
  	if (null == result) {
  		System.out.println("Not found ValueSet [reference-version-rules]");
  	} else {
  		assertEquals("Expect ", "reference-version-rules", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("messageheader-response-request");
  	if (null == result) {
  		System.out.println("Not found ValueSet [messageheader-response-request]");
  	} else {
  		assertEquals("Expect ", "messageheader-response-request", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("OperationDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [OperationDefinition]");
  	} else {
  		assertEquals("Expect ", "OperationDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("name-part-qualifier");
  	if (null == result) {
  		System.out.println("Not found ValueSet [name-part-qualifier]");
  	} else {
  		assertEquals("Expect ", "name-part-qualifier", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("PaymentReconciliation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [PaymentReconciliation]");
  	} else {
  		assertEquals("Expect ", "PaymentReconciliation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("content-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [content-type]");
  	} else {
  		assertEquals("Expect ", "content-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("list-example-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [list-example-codes]");
  	} else {
  		assertEquals("Expect ", "list-example-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedure-progressStatus");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedure-progressStatus]");
  	} else {
  		assertEquals("Expect ", "procedure-progressStatus", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-statement-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-statement-category]");
  	} else {
  		assertEquals("Expect ", "medication-statement-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Basic");
  	result = basicDao.find("referral");
  	if (null == result) {
  		System.out.println("Not found Basic [referral]");
  	} else {
  		assertEquals("Expect ", "referral", ((Basic)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("question-max-occurs");
  	if (null == result) {
  		System.out.println("Not found ValueSet [question-max-occurs]");
  	} else {
  		assertEquals("Expect ", "question-max-occurs", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Provenance");
  	result = provenanceDao.find("example-cwl");
  	if (null == result) {
  		System.out.println("Not found Provenance [example-cwl]");
  	} else {
  		assertEquals("Expect ", "example-cwl", ((Provenance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-selector");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-selector]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-selector", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("digital-media-subtype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [digital-media-subtype]");
  	} else {
  		assertEquals("Expect ", "digital-media-subtype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-objectClassProperty");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-objectClassProperty]");
  	} else {
  		assertEquals("Expect ", "11179-objectClassProperty", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-status]");
  	} else {
  		assertEquals("Expect ", "medication-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("supplyrequest-kind");
  	if (null == result) {
  		System.out.println("Not found ValueSet [supplyrequest-kind]");
  	} else {
  		assertEquals("Expect ", "supplyrequest-kind", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-trusted-expansion");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-trusted-expansion]");
  	} else {
  		assertEquals("Expect ", "codesystem-trusted-expansion", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("openEHR-exposureDuration");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [openEHR-exposureDuration]");
  	} else {
  		assertEquals("Expect ", "openEHR-exposureDuration", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("parent-relationship-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [parent-relationship-codes]");
  	} else {
  		assertEquals("Expect ", "parent-relationship-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("physical-therapy");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [physical-therapy]");
  	} else {
  		assertEquals("Expect ", "physical-therapy", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("history-not-done-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [history-not-done-reason]");
  	} else {
  		assertEquals("Expect ", "history-not-done-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("blood-pressure-dar");
  	if (null == result) {
  		System.out.println("Not found Observation [blood-pressure-dar]");
  	} else {
  		assertEquals("Expect ", "blood-pressure-dar", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("decimal");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [decimal]");
  	} else {
  		assertEquals("Expect ", "decimal", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("resource-slicing-rules");
  	if (null == result) {
  		System.out.println("Not found ValueSet [resource-slicing-rules]");
  	} else {
  		assertEquals("Expect ", "resource-slicing-rules", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-type]");
  	} else {
  		assertEquals("Expect ", "action-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve TestScript");
  	result = testscriptDao.find("testscript-example-search");
  	if (null == result) {
  		System.out.println("Not found TestScript [testscript-example-search]");
  	} else {
  		assertEquals("Expect ", "testscript-example-search", ((TestScript)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("List");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [List]");
  	} else {
  		assertEquals("Expect ", "List", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("referencerange-meaning");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [referencerange-meaning]");
  	} else {
  		assertEquals("Expect ", "referencerange-meaning", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Location");
  	result = locationDao.find("1");
  	if (null == result) {
  		System.out.println("Not found Location [1]");
  	} else {
  		assertEquals("Expect ", "1", ((Location)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0332");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0332]");
  	} else {
  		assertEquals("Expect ", "medrx0332", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("basic-resource-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [basic-resource-type]");
  	} else {
  		assertEquals("Expect ", "basic-resource-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DataElement");
  	result = dataelementDao.find("prothrombin");
  	if (null == result) {
  		System.out.println("Not found DataElement [prothrombin]");
  	} else {
  		assertEquals("Expect ", "prothrombin", ((DataElement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("valueset-extensions-ValueSet-workflow");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [valueset-extensions-ValueSet-workflow]");
  	} else {
  		assertEquals("Expect ", "valueset-extensions-ValueSet-workflow", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("diet-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [diet-type]");
  	} else {
  		assertEquals("Expect ", "diet-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Coverage");
  	result = coverageDao.find("7547E");
  	if (null == result) {
  		System.out.println("Not found Coverage [7547E]");
  	} else {
  		assertEquals("Expect ", "7547E", ((Coverage)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("conditional-read-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [conditional-read-status]");
  	} else {
  		assertEquals("Expect ", "conditional-read-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ContactPoint");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ContactPoint]");
  	} else {
  		assertEquals("Expect ", "ContactPoint", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-conceptOrder");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-conceptOrder]");
  	} else {
  		assertEquals("Expect ", "valueset-conceptOrder", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("use-context");
  	if (null == result) {
  		System.out.println("Not found ValueSet [use-context]");
  	} else {
  		assertEquals("Expect ", "use-context", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-de-document-reference");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-de-document-reference]");
  	} else {
  		assertEquals("Expect ", "11179-de-document-reference", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("provenance-entity-role");
  	if (null == result) {
  		System.out.println("Not found ValueSet [provenance-entity-role]");
  	} else {
  		assertEquals("Expect ", "provenance-entity-role", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("benefit-network");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [benefit-network]");
  	} else {
  		assertEquals("Expect ", "benefit-network", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Observation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Observation]");
  	} else {
  		assertEquals("Expect ", "Observation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-choiceOrientation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-choiceOrientation]");
  	} else {
  		assertEquals("Expect ", "questionnaire-choiceOrientation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0311");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0311]");
  	} else {
  		assertEquals("Expect ", "meddisp0311", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0313");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0313]");
  	} else {
  		assertEquals("Expect ", "medadmin0313", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("base64Binary");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [base64Binary]");
  	} else {
  		assertEquals("Expect ", "base64Binary", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("allergy-intolerance-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [allergy-intolerance-type]");
  	} else {
  		assertEquals("Expect ", "allergy-intolerance-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Event");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Event]");
  	} else {
  		assertEquals("Expect ", "Event", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("5minute-apgar-score");
  	if (null == result) {
  		System.out.println("Not found Observation [5minute-apgar-score]");
  	} else {
  		assertEquals("Expect ", "5minute-apgar-score", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("metric-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [metric-category]");
  	} else {
  		assertEquals("Expect ", "metric-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-reference");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-reference]");
  	} else {
  		assertEquals("Expect ", "codesystem-reference", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("ex-revenue-center");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [ex-revenue-center]");
  	} else {
  		assertEquals("Expect ", "ex-revenue-center", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("fm-conditions");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [fm-conditions]");
  	} else {
  		assertEquals("Expect ", "fm-conditions", ((CodeSystem)result).getId());
  	}
  	System.out.println("Total tests .. " + count);
  }
  @Test
  public void test1240() throws Exception {
  	Object local = null;
  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("devicerequest-patientInstruction");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [devicerequest-patientInstruction]");
  	} else {
  		assertEquals("Expect ", "devicerequest-patientInstruction", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-comments");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-comments]");
  	} else {
  		assertEquals("Expect ", "valueset-comments", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("system-restful-interaction");
  	if (null == result) {
  		System.out.println("Not found ValueSet [system-restful-interaction]");
  	} else {
  		assertEquals("Expect ", "system-restful-interaction", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("administrative-gender");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [administrative-gender]");
  	} else {
  		assertEquals("Expect ", "administrative-gender", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("humanname-assembly-order");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [humanname-assembly-order]");
  	} else {
  		assertEquals("Expect ", "humanname-assembly-order", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("detectedissue-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [detectedissue-category]");
  	} else {
  		assertEquals("Expect ", "detectedissue-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("shareablevalueset");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [shareablevalueset]");
  	} else {
  		assertEquals("Expect ", "shareablevalueset", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("resource-lastReviewDate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [resource-lastReviewDate]");
  	} else {
  		assertEquals("Expect ", "resource-lastReviewDate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ImagingStudy");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ImagingStudy]");
  	} else {
  		assertEquals("Expect ", "ImagingStudy", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0325");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0325]");
  	} else {
  		assertEquals("Expect ", "meddisp0325", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaireresponse-author");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaireresponse-author]");
  	} else {
  		assertEquals("Expect ", "questionnaireresponse-author", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Duration");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Duration]");
  	} else {
  		assertEquals("Expect ", "Duration", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("allergy-intolerance-criticality");
  	if (null == result) {
  		System.out.println("Not found ValueSet [allergy-intolerance-criticality]");
  	} else {
  		assertEquals("Expect ", "allergy-intolerance-criticality", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("subscription-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [subscription-status]");
  	} else {
  		assertEquals("Expect ", "subscription-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("actionlist");
  	if (null == result) {
  		System.out.println("Not found ValueSet [actionlist]");
  	} else {
  		assertEquals("Expect ", "actionlist", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationStatement");
  	result = medicationstatementDao.find("example001");
  	if (null == result) {
  		System.out.println("Not found MedicationStatement [example001]");
  	} else {
  		assertEquals("Expect ", "example001", ((MedicationStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("observation-interpretation");
  	if (null == result) {
  		System.out.println("Not found ValueSet [observation-interpretation]");
  	} else {
  		assertEquals("Expect ", "observation-interpretation", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("detectedissue-mitigation-action");
  	if (null == result) {
  		System.out.println("Not found ValueSet [detectedissue-mitigation-action]");
  	} else {
  		assertEquals("Expect ", "detectedissue-mitigation-action", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("fm-itemtype");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [fm-itemtype]");
  	} else {
  		assertEquals("Expect ", "fm-itemtype", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("unsignedInt");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [unsignedInt]");
  	} else {
  		assertEquals("Expect ", "unsignedInt", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0304");
  	if (null == result) {
  		System.out.println("Not found Medication [med0304]");
  	} else {
  		assertEquals("Expect ", "med0304", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ActivityDefinition");
  	result = activitydefinitionDao.find("referralPrimaryCareMentalHealth-initial");
  	if (null == result) {
  		System.out.println("Not found ActivityDefinition [referralPrimaryCareMentalHealth-initial]");
  	} else {
  		assertEquals("Expect ", "referralPrimaryCareMentalHealth-initial", ((ActivityDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("proteinsupplement");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [proteinsupplement]");
  	} else {
  		assertEquals("Expect ", "proteinsupplement", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-usage");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-usage]");
  	} else {
  		assertEquals("Expect ", "codesystem-usage", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("plan-definition-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [plan-definition-type]");
  	} else {
  		assertEquals("Expect ", "plan-definition-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ImagingStudy");
  	result = imagingstudyDao.find("example-xr");
  	if (null == result) {
  		System.out.println("Not found ImagingStudy [example-xr]");
  	} else {
  		assertEquals("Expect ", "example-xr", ((ImagingStudy)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("content-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [content-type]");
  	} else {
  		assertEquals("Expect ", "content-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-effectiveDate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-effectiveDate]");
  	} else {
  		assertEquals("Expect ", "valueset-effectiveDate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("measure-report-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [measure-report-status]");
  	} else {
  		assertEquals("Expect ", "measure-report-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("care-team-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [care-team-status]");
  	} else {
  		assertEquals("Expect ", "care-team-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("genetics-example1");
  	if (null == result) {
  		System.out.println("Not found Patient [genetics-example1]");
  	} else {
  		assertEquals("Expect ", "genetics-example1", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("colon-biopsy");
  	if (null == result) {
  		System.out.println("Not found Procedure [colon-biopsy]");
  	} else {
  		assertEquals("Expect ", "colon-biopsy", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-request-intent");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-request-intent]");
  	} else {
  		assertEquals("Expect ", "medication-request-intent", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-streetNameBase");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-streetNameBase]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-streetNameBase", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("organization-alias");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [organization-alias]");
  	} else {
  		assertEquals("Expect ", "organization-alias", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("ActivityDefinition-apply");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [ActivityDefinition-apply]");
  	} else {
  		assertEquals("Expect ", "ActivityDefinition-apply", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("vision-eye-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [vision-eye-codes]");
  	} else {
  		assertEquals("Expect ", "vision-eye-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ucum-vitals-common");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ucum-vitals-common]");
  	} else {
  		assertEquals("Expect ", "ucum-vitals-common", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-de-registry-org");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-de-registry-org]");
  	} else {
  		assertEquals("Expect ", "11179-de-registry-org", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-label");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-label]");
  	} else {
  		assertEquals("Expect ", "codesystem-label", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("care-plan-activity-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [care-plan-activity-status]");
  	} else {
  		assertEquals("Expect ", "care-plan-activity-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FHIRList");
  	result = fhirlistDao.find("genetic");
  	if (null == result) {
  		System.out.println("Not found FHIRList [genetic]");
  	} else {
  		assertEquals("Expect ", "genetic", ((FHIRList)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("search-comparator");
  	if (null == result) {
  		System.out.println("Not found ValueSet [search-comparator]");
  	} else {
  		assertEquals("Expect ", "search-comparator", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-address-use-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-address-use-v3]");
  	} else {
  		assertEquals("Expect ", "cm-address-use-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("graphic-example-4");
  	if (null == result) {
  		System.out.println("Not found Sequence [graphic-example-4]");
  	} else {
  		assertEquals("Expect ", "graphic-example-4", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("formatcodes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [formatcodes]");
  	} else {
  		assertEquals("Expect ", "formatcodes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("communication-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [communication-category]");
  	} else {
  		assertEquals("Expect ", "communication-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Count");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Count]");
  	} else {
  		assertEquals("Expect ", "Count", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0306");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0306]");
  	} else {
  		assertEquals("Expect ", "medrx0306", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("resprate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [resprate]");
  	} else {
  		assertEquals("Expect ", "resprate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("capability-statement-kind");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [capability-statement-kind]");
  	} else {
  		assertEquals("Expect ", "capability-statement-kind", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("goal-relationship");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [goal-relationship]");
  	} else {
  		assertEquals("Expect ", "goal-relationship", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-display-hint");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-display-hint]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-display-hint", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("message-significance-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [message-significance-category]");
  	} else {
  		assertEquals("Expect ", "message-significance-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ChargeItem");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ChargeItem]");
  	} else {
  		assertEquals("Expect ", "ChargeItem", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("account-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [account-status]");
  	} else {
  		assertEquals("Expect ", "account-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-usageMode");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-usageMode]");
  	} else {
  		assertEquals("Expect ", "questionnaire-usageMode", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("consent-except-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [consent-except-type]");
  	} else {
  		assertEquals("Expect ", "consent-except-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0303");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0303]");
  	} else {
  		assertEquals("Expect ", "meddisp0303", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("task-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [task-status]");
  	} else {
  		assertEquals("Expect ", "task-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Communication");
  	result = communicationDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Communication [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Communication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RelatedPerson");
  	result = relatedpersonDao.find("benedicte");
  	if (null == result) {
  		System.out.println("Not found RelatedPerson [benedicte]");
  	} else {
  		assertEquals("Expect ", "benedicte", ((RelatedPerson)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("procedure-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [procedure-category]");
  	} else {
  		assertEquals("Expect ", "procedure-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Timing");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Timing]");
  	} else {
  		assertEquals("Expect ", "Timing", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("appointmentstatus");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [appointmentstatus]");
  	} else {
  		assertEquals("Expect ", "appointmentstatus", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0324");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0324]");
  	} else {
  		assertEquals("Expect ", "medrx0324", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Questionnaire-populatelink");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Questionnaire-populatelink]");
  	} else {
  		assertEquals("Expect ", "Questionnaire-populatelink", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("chargeitem-billingcodes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [chargeitem-billingcodes]");
  	} else {
  		assertEquals("Expect ", "chargeitem-billingcodes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve EligibilityRequest");
  	result = eligibilityrequestDao.find("52346");
  	if (null == result) {
  		System.out.println("Not found EligibilityRequest [52346]");
  	} else {
  		assertEquals("Expect ", "52346", ((EligibilityRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("SampledData");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [SampledData]");
  	} else {
  		assertEquals("Expect ", "SampledData", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0306");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0306]");
  	} else {
  		assertEquals("Expect ", "medadmin0306", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0314");
  	if (null == result) {
  		System.out.println("Not found Medication [med0314]");
  	} else {
  		assertEquals("Expect ", "med0314", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("quantity-comparator");
  	if (null == result) {
  		System.out.println("Not found ValueSet [quantity-comparator]");
  	} else {
  		assertEquals("Expect ", "quantity-comparator", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-dispense-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-dispense-status]");
  	} else {
  		assertEquals("Expect ", "medication-dispense-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("questionnaire-display-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [questionnaire-display-category]");
  	} else {
  		assertEquals("Expect ", "questionnaire-display-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("example-expansion");
  	if (null == result) {
  		System.out.println("Not found ValueSet [example-expansion]");
  	} else {
  		assertEquals("Expect ", "example-expansion", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-houseNumberNumeric");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-houseNumberNumeric]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-houseNumberNumeric", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("network-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [network-type]");
  	} else {
  		assertEquals("Expect ", "network-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("teeth");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [teeth]");
  	} else {
  		assertEquals("Expect ", "teeth", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Binary");
  	result = binaryDao.find("f006");
  	if (null == result) {
  		System.out.println("Not found Binary [f006]");
  	} else {
  		assertEquals("Expect ", "f006", ((Binary)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("pat1");
  	if (null == result) {
  		System.out.println("Not found Patient [pat1]");
  	} else {
  		assertEquals("Expect ", "pat1", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("procedure-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [procedure-code]");
  	} else {
  		assertEquals("Expect ", "procedure-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-time-offset");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-time-offset]");
  	} else {
  		assertEquals("Expect ", "observation-time-offset", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("father");
  	if (null == result) {
  		System.out.println("Not found Bundle [father]");
  	} else {
  		assertEquals("Expect ", "father", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("condition-partOf");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [condition-partOf]");
  	} else {
  		assertEquals("Expect ", "condition-partOf", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Encounter");
  	result = encounterDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found Encounter [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((Encounter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0309");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0309]");
  	} else {
  		assertEquals("Expect ", "medadmin0309", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0318");
  	if (null == result) {
  		System.out.println("Not found Medication [med0318]");
  	} else {
  		assertEquals("Expect ", "med0318", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("observation-genetic-Observation-gene-amino-acid-change");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [observation-genetic-Observation-gene-amino-acid-change]");
  	} else {
  		assertEquals("Expect ", "observation-genetic-Observation-gene-amino-acid-change", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Basic");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Basic]");
  	} else {
  		assertEquals("Expect ", "Basic", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("familymemberhistory-patient-record");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [familymemberhistory-patient-record]");
  	} else {
  		assertEquals("Expect ", "familymemberhistory-patient-record", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("searchParams");
  	if (null == result) {
  		System.out.println("Not found Bundle [searchParams]");
  	} else {
  		assertEquals("Expect ", "searchParams", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("f002");
  	if (null == result) {
  		System.out.println("Not found Condition [f002]");
  	} else {
  		assertEquals("Expect ", "f002", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("clinicaldocument");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [clinicaldocument]");
  	} else {
  		assertEquals("Expect ", "clinicaldocument", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-map");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-map]");
  	} else {
  		assertEquals("Expect ", "codesystem-map", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("extra-activity-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [extra-activity-type]");
  	} else {
  		assertEquals("Expect ", "extra-activity-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Substance");
  	result = substanceDao.find("f202");
  	if (null == result) {
  		System.out.println("Not found Substance [f202]");
  	} else {
  		assertEquals("Expect ", "f202", ((Substance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("f203");
  	if (null == result) {
  		System.out.println("Not found CarePlan [f203]");
  	} else {
  		assertEquals("Expect ", "f203", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("device-din");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [device-din]");
  	} else {
  		assertEquals("Expect ", "device-din", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("assert-response-code-types");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [assert-response-code-types]");
  	} else {
  		assertEquals("Expect ", "assert-response-code-types", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("system-version-processing-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [system-version-processing-mode]");
  	} else {
  		assertEquals("Expect ", "system-version-processing-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("search-param-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [search-param-type]");
  	} else {
  		assertEquals("Expect ", "search-param-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("openEHR-test");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [openEHR-test]");
  	} else {
  		assertEquals("Expect ", "openEHR-test", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("immunization-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [immunization-status]");
  	} else {
  		assertEquals("Expect ", "immunization-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("structure-definition-kind");
  	if (null == result) {
  		System.out.println("Not found ValueSet [structure-definition-kind]");
  	} else {
  		assertEquals("Expect ", "structure-definition-kind", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-deliveryInstallationArea");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-deliveryInstallationArea]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-deliveryInstallationArea", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Communication");
  	result = communicationDao.find("fm-attachment");
  	if (null == result) {
  		System.out.println("Not found Communication [fm-attachment]");
  	} else {
  		assertEquals("Expect ", "fm-attachment", ((Communication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Device");
  	result = deviceDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found Device [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((Device)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Media");
  	result = mediaDao.find("1.2.840.11361907579238403408700.3.0.14.19970327150033");
  	if (null == result) {
  		System.out.println("Not found Media [1.2.840.11361907579238403408700.3.0.14.19970327150033]");
  	} else {
  		assertEquals("Expect ", "1.2.840.11361907579238403408700.3.0.14.19970327150033", ((Media)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("communicationrequest-relevantHistory");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [communicationrequest-relevantHistory]");
  	} else {
  		assertEquals("Expect ", "communicationrequest-relevantHistory", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("b0a5e4277-83c4-4adb-87e2-e3efe3369b6f");
  	if (null == result) {
  		System.out.println("Not found Bundle [b0a5e4277-83c4-4adb-87e2-e3efe3369b6f]");
  	} else {
  		assertEquals("Expect ", "b0a5e4277-83c4-4adb-87e2-e3efe3369b6f", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contact-point-use");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contact-point-use]");
  	} else {
  		assertEquals("Expect ", "contact-point-use", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Device");
  	result = deviceDao.find("ihe-pcd");
  	if (null == result) {
  		System.out.println("Not found Device [ihe-pcd]");
  	} else {
  		assertEquals("Expect ", "ihe-pcd", ((Device)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Bundle");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Bundle]");
  	} else {
  		assertEquals("Expect ", "Bundle", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RequestGroup");
  	result = requestgroupDao.find("example");
  	if (null == result) {
  		System.out.println("Not found RequestGroup [example]");
  	} else {
  		assertEquals("Expect ", "example", ((RequestGroup)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-participant-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-participant-type]");
  	} else {
  		assertEquals("Expect ", "action-participant-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Device");
  	result = deviceDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Device [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Device)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("specimen-isDryWeight");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [specimen-isDryWeight]");
  	} else {
  		assertEquals("Expect ", "specimen-isDryWeight", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-deprecated");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-deprecated]");
  	} else {
  		assertEquals("Expect ", "codesystem-deprecated", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("endpoint-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [endpoint-status]");
  	} else {
  		assertEquals("Expect ", "endpoint-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DeviceMetric");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DeviceMetric]");
  	} else {
  		assertEquals("Expect ", "DeviceMetric", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Signature");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Signature]");
  	} else {
  		assertEquals("Expect ", "Signature", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("concept-properties");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [concept-properties]");
  	} else {
  		assertEquals("Expect ", "concept-properties", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("preg");
  	if (null == result) {
  		System.out.println("Not found CarePlan [preg]");
  	} else {
  		assertEquals("Expect ", "preg", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("rendering-style");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [rendering-style]");
  	} else {
  		assertEquals("Expect ", "rendering-style", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("subscription-channel-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [subscription-channel-type]");
  	} else {
  		assertEquals("Expect ", "subscription-channel-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("zika-virus-exposure-assessment");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [zika-virus-exposure-assessment]");
  	} else {
  		assertEquals("Expect ", "zika-virus-exposure-assessment", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("MessageDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [MessageDefinition]");
  	} else {
  		assertEquals("Expect ", "MessageDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contract-subtype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contract-subtype]");
  	} else {
  		assertEquals("Expect ", "contract-subtype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("forms");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [forms]");
  	} else {
  		assertEquals("Expect ", "forms", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("forms");
  	if (null == result) {
  		System.out.println("Not found ValueSet [forms]");
  	} else {
  		assertEquals("Expect ", "forms", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("terminologies");
  	if (null == result) {
  		System.out.println("Not found Bundle [terminologies]");
  	} else {
  		assertEquals("Expect ", "terminologies", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("cpt-all");
  	if (null == result) {
  		System.out.println("Not found ValueSet [cpt-all]");
  	} else {
  		assertEquals("Expect ", "cpt-all", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Request");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Request]");
  	} else {
  		assertEquals("Expect ", "Request", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-precheck-behavior");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-precheck-behavior]");
  	} else {
  		assertEquals("Expect ", "action-precheck-behavior", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0319");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0319]");
  	} else {
  		assertEquals("Expect ", "medrx0319", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-precinct");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-precinct]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-precinct", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("clinicalimpression-prognosis");
  	if (null == result) {
  		System.out.println("Not found ValueSet [clinicalimpression-prognosis]");
  	} else {
  		assertEquals("Expect ", "clinicalimpression-prognosis", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("administration-method-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [administration-method-codes]");
  	} else {
  		assertEquals("Expect ", "administration-method-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("observation-vitalsignresult");
  	if (null == result) {
  		System.out.println("Not found ValueSet [observation-vitalsignresult]");
  	} else {
  		assertEquals("Expect ", "observation-vitalsignresult", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("100152");
  	if (null == result) {
  		System.out.println("Not found Claim [100152]");
  	} else {
  		assertEquals("Expect ", "100152", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsGene");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsGene]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsGene", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("focal-subject");
  	if (null == result) {
  		System.out.println("Not found ValueSet [focal-subject]");
  	} else {
  		assertEquals("Expect ", "focal-subject", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("lipid");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [lipid]");
  	} else {
  		assertEquals("Expect ", "lipid", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("oral-prosthodontic-material");
  	if (null == result) {
  		System.out.println("Not found ValueSet [oral-prosthodontic-material]");
  	} else {
  		assertEquals("Expect ", "oral-prosthodontic-material", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("bodyheight");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [bodyheight]");
  	} else {
  		assertEquals("Expect ", "bodyheight", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("960150");
  	if (null == result) {
  		System.out.println("Not found Claim [960150]");
  	} else {
  		assertEquals("Expect ", "960150", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-unit");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-unit]");
  	} else {
  		assertEquals("Expect ", "questionnaire-unit", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Task");
  	result = taskDao.find("example6");
  	if (null == result) {
  		System.out.println("Not found Task [example6]");
  	} else {
  		assertEquals("Expect ", "example6", ((Task)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("guidance-response-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [guidance-response-status]");
  	} else {
  		assertEquals("Expect ", "guidance-response-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("flag-priority");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [flag-priority]");
  	} else {
  		assertEquals("Expect ", "flag-priority", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Sequence");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Sequence]");
  	} else {
  		assertEquals("Expect ", "Sequence", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("entformula-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [entformula-type]");
  	} else {
  		assertEquals("Expect ", "entformula-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contract-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contract-status]");
  	} else {
  		assertEquals("Expect ", "contract-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("sequence-referenceSeq");
  	if (null == result) {
  		System.out.println("Not found ValueSet [sequence-referenceSeq]");
  	} else {
  		assertEquals("Expect ", "sequence-referenceSeq", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve EligibilityResponse");
  	result = eligibilityresponseDao.find("E2501");
  	if (null == result) {
  		System.out.println("Not found EligibilityResponse [E2501]");
  	} else {
  		assertEquals("Expect ", "E2501", ((EligibilityResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("observation-methods");
  	if (null == result) {
  		System.out.println("Not found ValueSet [observation-methods]");
  	} else {
  		assertEquals("Expect ", "observation-methods", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("library-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [library-type]");
  	} else {
  		assertEquals("Expect ", "library-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-request-intent");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-request-intent]");
  	} else {
  		assertEquals("Expect ", "medication-request-intent", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("audit-event-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [audit-event-type]");
  	} else {
  		assertEquals("Expect ", "audit-event-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("flag-detail");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [flag-detail]");
  	} else {
  		assertEquals("Expect ", "flag-detail", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("device-action");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [device-action]");
  	} else {
  		assertEquals("Expect ", "device-action", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("dicm-405-mediatype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [dicm-405-mediatype]");
  	} else {
  		assertEquals("Expect ", "dicm-405-mediatype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Goal");
  	result = goalDao.find("stop-smoking");
  	if (null == result) {
  		System.out.println("Not found Goal [stop-smoking]");
  	} else {
  		assertEquals("Expect ", "stop-smoking", ((Goal)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("CodeSystem-subsumes");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [CodeSystem-subsumes]");
  	} else {
  		assertEquals("Expect ", "CodeSystem-subsumes", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Goal");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Goal]");
  	} else {
  		assertEquals("Expect ", "Goal", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("xds");
  	if (null == result) {
  		System.out.println("Not found Patient [xds]");
  	} else {
  		assertEquals("Expect ", "xds", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("payment-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [payment-status]");
  	} else {
  		assertEquals("Expect ", "payment-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("f204");
  	if (null == result) {
  		System.out.println("Not found Condition [f204]");
  	} else {
  		assertEquals("Expect ", "f204", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Contract");
  	result = contractDao.find("pcd-example-notAuthor");
  	if (null == result) {
  		System.out.println("Not found Contract [pcd-example-notAuthor]");
  	} else {
  		assertEquals("Expect ", "pcd-example-notAuthor", ((Contract)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("diagnosticReport-addendumOf");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [diagnosticReport-addendumOf]");
  	} else {
  		assertEquals("Expect ", "diagnosticReport-addendumOf", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-eventTiming");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-eventTiming]");
  	} else {
  		assertEquals("Expect ", "observation-eventTiming", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("goal-relationship-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [goal-relationship-type]");
  	} else {
  		assertEquals("Expect ", "goal-relationship-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("TriggerDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [TriggerDefinition]");
  	} else {
  		assertEquals("Expect ", "TriggerDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0310");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0310]");
  	} else {
  		assertEquals("Expect ", "medadmin0310", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("location-distance");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [location-distance]");
  	} else {
  		assertEquals("Expect ", "location-distance", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("v3-valuesets");
  	if (null == result) {
  		System.out.println("Not found Bundle [v3-valuesets]");
  	} else {
  		assertEquals("Expect ", "v3-valuesets", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("f003");
  	if (null == result) {
  		System.out.println("Not found Organization [f003]");
  	} else {
  		assertEquals("Expect ", "f003", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("request-intent");
  	if (null == result) {
  		System.out.println("Not found ValueSet [request-intent]");
  	} else {
  		assertEquals("Expect ", "request-intent", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("gcs-qa");
  	if (null == result) {
  		System.out.println("Not found Observation [gcs-qa]");
  	} else {
  		assertEquals("Expect ", "gcs-qa", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("resource-types");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [resource-types]");
  	} else {
  		assertEquals("Expect ", "resource-types", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0301");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0301]");
  	} else {
  		assertEquals("Expect ", "meddisp0301", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("CapabilityStatement-implements");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [CapabilityStatement-implements]");
  	} else {
  		assertEquals("Expect ", "CapabilityStatement-implements", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("history-not-done-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [history-not-done-reason]");
  	} else {
  		assertEquals("Expect ", "history-not-done-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f204");
  	if (null == result) {
  		System.out.println("Not found Observation [f204]");
  	} else {
  		assertEquals("Expect ", "f204", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("PaymentNotice");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [PaymentNotice]");
  	} else {
  		assertEquals("Expect ", "PaymentNotice", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("name-use");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [name-use]");
  	} else {
  		assertEquals("Expect ", "name-use", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0320");
  	if (null == result) {
  		System.out.println("Not found Medication [med0320]");
  	} else {
  		assertEquals("Expect ", "med0320", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Goal");
  	result = goalDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Goal [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Goal)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-haplotype2");
  	if (null == result) {
  		System.out.println("Not found Observation [example-haplotype2]");
  	} else {
  		assertEquals("Expect ", "example-haplotype2", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("auditevent-ParticipantObjectContainsStudy");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [auditevent-ParticipantObjectContainsStudy]");
  	} else {
  		assertEquals("Expect ", "auditevent-ParticipantObjectContainsStudy", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("measure-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [measure-type]");
  	} else {
  		assertEquals("Expect ", "measure-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("gpvisit");
  	if (null == result) {
  		System.out.println("Not found CarePlan [gpvisit]");
  	} else {
  		assertEquals("Expect ", "gpvisit", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("immunization-origin");
  	if (null == result) {
  		System.out.println("Not found ValueSet [immunization-origin]");
  	} else {
  		assertEquals("Expect ", "immunization-origin", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-type]");
  	} else {
  		assertEquals("Expect ", "encounter-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("payment-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [payment-status]");
  	} else {
  		assertEquals("Expect ", "payment-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("metric-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [metric-category]");
  	} else {
  		assertEquals("Expect ", "metric-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("resource-validation-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [resource-validation-mode]");
  	} else {
  		assertEquals("Expect ", "resource-validation-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("3ad0687e-f477-468c-afd5-fcc2bf897809");
  	if (null == result) {
  		System.out.println("Not found Bundle [3ad0687e-f477-468c-afd5-fcc2bf897809]");
  	} else {
  		assertEquals("Expect ", "3ad0687e-f477-468c-afd5-fcc2bf897809", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("additionalmaterials");
  	if (null == result) {
  		System.out.println("Not found ValueSet [additionalmaterials]");
  	} else {
  		assertEquals("Expect ", "additionalmaterials", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Attachment");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Attachment]");
  	} else {
  		assertEquals("Expect ", "Attachment", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationStatement");
  	result = medicationstatementDao.find("example006");
  	if (null == result) {
  		System.out.println("Not found MedicationStatement [example006]");
  	} else {
  		assertEquals("Expect ", "example006", ((MedicationStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-rdf-type");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-rdf-type]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-rdf-type", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AuditEvent");
  	result = auditeventDao.find("example");
  	if (null == result) {
  		System.out.println("Not found AuditEvent [example]");
  	} else {
  		assertEquals("Expect ", "example", ((AuditEvent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("xcda-author");
  	if (null == result) {
  		System.out.println("Not found Practitioner [xcda-author]");
  	} else {
  		assertEquals("Expect ", "xcda-author", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0304");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0304]");
  	} else {
  		assertEquals("Expect ", "medadmin0304", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("resources");
  	if (null == result) {
  		System.out.println("Not found Bundle [resources]");
  	} else {
  		assertEquals("Expect ", "resources", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedure-approachBodySite");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedure-approachBodySite]");
  	} else {
  		assertEquals("Expect ", "procedure-approachBodySite", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("substance-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [substance-code]");
  	} else {
  		assertEquals("Expect ", "substance-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Element");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Element]");
  	} else {
  		assertEquals("Expect ", "Element", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("List-find");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [List-find]");
  	} else {
  		assertEquals("Expect ", "List-find", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("assert-response-code-types");
  	if (null == result) {
  		System.out.println("Not found ValueSet [assert-response-code-types]");
  	} else {
  		assertEquals("Expect ", "assert-response-code-types", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-ordinalValue");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-ordinalValue]");
  	} else {
  		assertEquals("Expect ", "valueset-ordinalValue", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("dg2");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [dg2]");
  	} else {
  		assertEquals("Expect ", "dg2", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DocumentReference");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DocumentReference]");
  	} else {
  		assertEquals("Expect ", "DocumentReference", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("conditional-read-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [conditional-read-status]");
  	} else {
  		assertEquals("Expect ", "conditional-read-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("action-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [action-type]");
  	} else {
  		assertEquals("Expect ", "action-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("narrative-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [narrative-status]");
  	} else {
  		assertEquals("Expect ", "narrative-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Coverage");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Coverage]");
  	} else {
  		assertEquals("Expect ", "Coverage", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0330");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0330]");
  	} else {
  		assertEquals("Expect ", "medrx0330", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("f002");
  	if (null == result) {
  		System.out.println("Not found Organization [f002]");
  	} else {
  		assertEquals("Expect ", "f002", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("rendering-xhtml");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [rendering-xhtml]");
  	} else {
  		assertEquals("Expect ", "rendering-xhtml", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("condition-extensions-Condition-based-on");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [condition-extensions-Condition-based-on]");
  	} else {
  		assertEquals("Expect ", "condition-extensions-Condition-based-on", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f204");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f204]");
  	} else {
  		assertEquals("Expect ", "f204", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-statement-taken");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-statement-taken]");
  	} else {
  		assertEquals("Expect ", "medication-statement-taken", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("service-pharmacy");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [service-pharmacy]");
  	} else {
  		assertEquals("Expect ", "service-pharmacy", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve EligibilityResponse");
  	result = eligibilityresponseDao.find("E2503");
  	if (null == result) {
  		System.out.println("Not found EligibilityResponse [E2503]");
  	} else {
  		assertEquals("Expect ", "E2503", ((EligibilityResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-notAuthor");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-notAuthor]");
  	} else {
  		assertEquals("Expect ", "consent-example-notAuthor", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0307");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0307]");
  	} else {
  		assertEquals("Expect ", "medrx0307", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("guide-page-kind");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [guide-page-kind]");
  	} else {
  		assertEquals("Expect ", "guide-page-kind", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("benefit-subcategory");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [benefit-subcategory]");
  	} else {
  		assertEquals("Expect ", "benefit-subcategory", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ucum-bodyweight");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ucum-bodyweight]");
  	} else {
  		assertEquals("Expect ", "ucum-bodyweight", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-disability");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-disability]");
  	} else {
  		assertEquals("Expect ", "patient-disability", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("auditevent-Encrypted");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [auditevent-Encrypted]");
  	} else {
  		assertEquals("Expect ", "auditevent-Encrypted", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("CapabilityStatement-subset");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [CapabilityStatement-subset]");
  	} else {
  		assertEquals("Expect ", "CapabilityStatement-subset", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Measure");
  	result = measureDao.find("measure-exclusive-breastfeeding");
  	if (null == result) {
  		System.out.println("Not found Measure [measure-exclusive-breastfeeding]");
  	} else {
  		assertEquals("Expect ", "measure-exclusive-breastfeeding", ((Measure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("bodysite-laterality");
  	if (null == result) {
  		System.out.println("Not found ValueSet [bodysite-laterality]");
  	} else {
  		assertEquals("Expect ", "bodysite-laterality", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ServiceDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ServiceDefinition]");
  	} else {
  		assertEquals("Expect ", "ServiceDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("dataelement-stringency");
  	if (null == result) {
  		System.out.println("Not found ValueSet [dataelement-stringency]");
  	} else {
  		assertEquals("Expect ", "dataelement-stringency", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Encounter");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Encounter]");
  	} else {
  		assertEquals("Expect ", "Encounter", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adverse-event-causality-method");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adverse-event-causality-method]");
  	} else {
  		assertEquals("Expect ", "adverse-event-causality-method", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Location");
  	result = locationDao.find("2");
  	if (null == result) {
  		System.out.println("Not found Location [2]");
  	} else {
  		assertEquals("Expect ", "2", ((Location)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessResponse");
  	result = processresponseDao.find("SR2500");
  	if (null == result) {
  		System.out.println("Not found ProcessResponse [SR2500]");
  	} else {
  		assertEquals("Expect ", "SR2500", ((ProcessResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("resource-type-link");
  	if (null == result) {
  		System.out.println("Not found ValueSet [resource-type-link]");
  	} else {
  		assertEquals("Expect ", "resource-type-link", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("energysupplement");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [energysupplement]");
  	} else {
  		assertEquals("Expect ", "energysupplement", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("quantity-comparator");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [quantity-comparator]");
  	} else {
  		assertEquals("Expect ", "quantity-comparator", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Slot");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Slot]");
  	} else {
  		assertEquals("Expect ", "Slot", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsAlleleName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsAlleleName]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsAlleleName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("composite-measure-scoring");
  	if (null == result) {
  		System.out.println("Not found ValueSet [composite-measure-scoring]");
  	} else {
  		assertEquals("Expect ", "composite-measure-scoring", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-condition-kind");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-condition-kind]");
  	} else {
  		assertEquals("Expect ", "action-condition-kind", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("humanname-fathers-family");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [humanname-fathers-family]");
  	} else {
  		assertEquals("Expect ", "humanname-fathers-family", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("device-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [device-status]");
  	} else {
  		assertEquals("Expect ", "device-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("maxSize");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [maxSize]");
  	} else {
  		assertEquals("Expect ", "maxSize", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found CarePlan [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("communicationrequest-orderedBy");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [communicationrequest-orderedBy]");
  	} else {
  		assertEquals("Expect ", "communicationrequest-orderedBy", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("event-partOf");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [event-partOf]");
  	} else {
  		assertEquals("Expect ", "event-partOf", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ex-program-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ex-program-code]");
  	} else {
  		assertEquals("Expect ", "ex-program-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-systemRef");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-systemRef]");
  	} else {
  		assertEquals("Expect ", "valueset-systemRef", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("operation-kind");
  	if (null == result) {
  		System.out.println("Not found ValueSet [operation-kind]");
  	} else {
  		assertEquals("Expect ", "operation-kind", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("subrequest");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [subrequest]");
  	} else {
  		assertEquals("Expect ", "subrequest", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("chlamydia-screening-intervention");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [chlamydia-screening-intervention]");
  	} else {
  		assertEquals("Expect ", "chlamydia-screening-intervention", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("group-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [group-type]");
  	} else {
  		assertEquals("Expect ", "group-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("library-quick-model-definition");
  	if (null == result) {
  		System.out.println("Not found Library [library-quick-model-definition]");
  	} else {
  		assertEquals("Expect ", "library-quick-model-definition", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("auditevent-MPPS");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [auditevent-MPPS]");
  	} else {
  		assertEquals("Expect ", "auditevent-MPPS", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("procedure-outcome");
  	if (null == result) {
  		System.out.println("Not found ValueSet [procedure-outcome]");
  	} else {
  		assertEquals("Expect ", "procedure-outcome", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve QuestionnaireResponse");
  	result = questionnaireresponseDao.find("3141");
  	if (null == result) {
  		System.out.println("Not found QuestionnaireResponse [3141]");
  	} else {
  		assertEquals("Expect ", "3141", ((QuestionnaireResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationStatement");
  	result = medicationstatementDao.find("example004");
  	if (null == result) {
  		System.out.println("Not found MedicationStatement [example004]");
  	} else {
  		assertEquals("Expect ", "example004", ((MedicationStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("benefit-unit");
  	if (null == result) {
  		System.out.println("Not found ValueSet [benefit-unit]");
  	} else {
  		assertEquals("Expect ", "benefit-unit", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("payment-adjustment-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [payment-adjustment-reason]");
  	} else {
  		assertEquals("Expect ", "payment-adjustment-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("cqif-recommendation-strength");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [cqif-recommendation-strength]");
  	} else {
  		assertEquals("Expect ", "cqif-recommendation-strength", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("ex-paymenttype");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [ex-paymenttype]");
  	} else {
  		assertEquals("Expect ", "ex-paymenttype", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessRequest");
  	result = processrequestDao.find("44654");
  	if (null == result) {
  		System.out.println("Not found ProcessRequest [44654]");
  	} else {
  		assertEquals("Expect ", "44654", ((ProcessRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("list-order");
  	if (null == result) {
  		System.out.println("Not found ValueSet [list-order]");
  	} else {
  		assertEquals("Expect ", "list-order", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("capabilitystatement-expectation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [capabilitystatement-expectation]");
  	} else {
  		assertEquals("Expect ", "capabilitystatement-expectation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adverse-event-causality-result");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adverse-event-causality-result]");
  	} else {
  		assertEquals("Expect ", "adverse-event-causality-result", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("audit-event-action");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [audit-event-action]");
  	} else {
  		assertEquals("Expect ", "audit-event-action", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found Patient [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("supplement-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [supplement-type]");
  	} else {
  		assertEquals("Expect ", "supplement-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("vitalspanel");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [vitalspanel]");
  	} else {
  		assertEquals("Expect ", "vitalspanel", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("ultrasound");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [ultrasound]");
  	} else {
  		assertEquals("Expect ", "ultrasound", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("identity-assuranceLevel");
  	if (null == result) {
  		System.out.println("Not found ValueSet [identity-assuranceLevel]");
  	} else {
  		assertEquals("Expect ", "identity-assuranceLevel", ((ValueSet)result).getId());
  	}
  	System.out.println("Total tests .. " + count);
  }
  @Test
  public void test1550() throws Exception {
  	Object local = null;
  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [example]");
  	} else {
  		assertEquals("Expect ", "example", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("organization-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [organization-type]");
  	} else {
  		assertEquals("Expect ", "organization-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("diagnosticreport-genetic-DiagnosticReport-assessed-condition");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [diagnosticreport-genetic-DiagnosticReport-assessed-condition]");
  	} else {
  		assertEquals("Expect ", "diagnosticreport-genetic-DiagnosticReport-assessed-condition", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("benefit-term");
  	if (null == result) {
  		System.out.println("Not found ValueSet [benefit-term]");
  	} else {
  		assertEquals("Expect ", "benefit-term", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("substance-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [substance-category]");
  	} else {
  		assertEquals("Expect ", "substance-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("time");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [time]");
  	} else {
  		assertEquals("Expect ", "time", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("encounter-diet");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [encounter-diet]");
  	} else {
  		assertEquals("Expect ", "encounter-diet", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("animal-species");
  	if (null == result) {
  		System.out.println("Not found ValueSet [animal-species]");
  	} else {
  		assertEquals("Expect ", "animal-species", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("service-uscls");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [service-uscls]");
  	} else {
  		assertEquals("Expect ", "service-uscls", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("ob");
  	if (null == result) {
  		System.out.println("Not found Procedure [ob]");
  	} else {
  		assertEquals("Expect ", "ob", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("goal-reasonRejected");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [goal-reasonRejected]");
  	} else {
  		assertEquals("Expect ", "goal-reasonRejected", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-TPMT-diplotype");
  	if (null == result) {
  		System.out.println("Not found Observation [example-TPMT-diplotype]");
  	} else {
  		assertEquals("Expect ", "example-TPMT-diplotype", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-admin-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-admin-status]");
  	} else {
  		assertEquals("Expect ", "medication-admin-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("diagnosticReport-extends");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [diagnosticReport-extends]");
  	} else {
  		assertEquals("Expect ", "diagnosticReport-extends", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("goal-priority");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [goal-priority]");
  	} else {
  		assertEquals("Expect ", "goal-priority", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ImagingStudy");
  	result = imagingstudyDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ImagingStudy [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ImagingStudy)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Device");
  	result = deviceDao.find("example-udi4");
  	if (null == result) {
  		System.out.println("Not found Device [example-udi4]");
  	} else {
  		assertEquals("Expect ", "example-udi4", ((Device)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("uri");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [uri]");
  	} else {
  		assertEquals("Expect ", "uri", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("date");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [date]");
  	} else {
  		assertEquals("Expect ", "date", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("communication-media");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [communication-media]");
  	} else {
  		assertEquals("Expect ", "communication-media", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0314");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0314]");
  	} else {
  		assertEquals("Expect ", "meddisp0314", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("specimen-sequenceNumber");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [specimen-sequenceNumber]");
  	} else {
  		assertEquals("Expect ", "specimen-sequenceNumber", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("f203");
  	if (null == result) {
  		System.out.println("Not found Organization [f203]");
  	} else {
  		assertEquals("Expect ", "f203", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedurerequest-reasonRejected");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedurerequest-reasonRejected]");
  	} else {
  		assertEquals("Expect ", "procedurerequest-reasonRejected", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-focal-subject");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-focal-subject]");
  	} else {
  		assertEquals("Expect ", "observation-focal-subject", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("flag-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [flag-category]");
  	} else {
  		assertEquals("Expect ", "flag-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("filter-operator");
  	if (null == result) {
  		System.out.println("Not found ValueSet [filter-operator]");
  	} else {
  		assertEquals("Expect ", "filter-operator", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0301");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0301]");
  	} else {
  		assertEquals("Expect ", "medrx0301", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-religion");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-religion]");
  	} else {
  		assertEquals("Expect ", "patient-religion", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("relationship");
  	if (null == result) {
  		System.out.println("Not found ValueSet [relationship]");
  	} else {
  		assertEquals("Expect ", "relationship", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("item-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [item-type]");
  	} else {
  		assertEquals("Expect ", "item-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("registry");
  	if (null == result) {
  		System.out.println("Not found Bundle [registry]");
  	} else {
  		assertEquals("Expect ", "registry", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-predecessor");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-predecessor]");
  	} else {
  		assertEquals("Expect ", "condition-predecessor", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adverse-event-causality-method");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adverse-event-causality-method]");
  	} else {
  		assertEquals("Expect ", "adverse-event-causality-method", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("code");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [code]");
  	} else {
  		assertEquals("Expect ", "code", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("organization-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [organization-type]");
  	} else {
  		assertEquals("Expect ", "organization-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0325");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0325]");
  	} else {
  		assertEquals("Expect ", "medrx0325", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("choice-list-orientation");
  	if (null == result) {
  		System.out.println("Not found ValueSet [choice-list-orientation]");
  	} else {
  		assertEquals("Expect ", "choice-list-orientation", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("CommunicationRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [CommunicationRequest]");
  	} else {
  		assertEquals("Expect ", "CommunicationRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Subscription");
  	result = subscriptionDao.find("example-error");
  	if (null == result) {
  		System.out.println("Not found Subscription [example-error]");
  	} else {
  		assertEquals("Expect ", "example-error", ((Subscription)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("c80-doc-typecodes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [c80-doc-typecodes]");
  	} else {
  		assertEquals("Expect ", "c80-doc-typecodes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("physiotherapy");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [physiotherapy]");
  	} else {
  		assertEquals("Expect ", "physiotherapy", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ProcedureRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ProcedureRequest]");
  	} else {
  		assertEquals("Expect ", "ProcedureRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("plan-definition-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [plan-definition-type]");
  	} else {
  		assertEquals("Expect ", "plan-definition-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Endpoint");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Endpoint]");
  	} else {
  		assertEquals("Expect ", "Endpoint", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Encounter");
  	result = encounterDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Encounter [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Encounter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-namespace");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-namespace]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-namespace", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedure-incisionDateTime");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedure-incisionDateTime]");
  	} else {
  		assertEquals("Expect ", "procedure-incisionDateTime", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve BodySite");
  	result = bodysiteDao.find("tumor");
  	if (null == result) {
  		System.out.println("Not found BodySite [tumor]");
  	} else {
  		assertEquals("Expect ", "tumor", ((BodySite)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("conceptmap-unmapped-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [conceptmap-unmapped-mode]");
  	} else {
  		assertEquals("Expect ", "conceptmap-unmapped-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("identifier-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [identifier-type]");
  	} else {
  		assertEquals("Expect ", "identifier-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-detectedissue-severity-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-detectedissue-severity-v3]");
  	} else {
  		assertEquals("Expect ", "cm-detectedissue-severity-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Group");
  	result = groupDao.find("102");
  	if (null == result) {
  		System.out.println("Not found Group [102]");
  	} else {
  		assertEquals("Expect ", "102", ((Group)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Composition");
  	result = compositionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Composition [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Composition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-notThem");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-notThem]");
  	} else {
  		assertEquals("Expect ", "consent-example-notThem", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("binding-strength");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [binding-strength]");
  	} else {
  		assertEquals("Expect ", "binding-strength", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("rendered-value");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [rendered-value]");
  	} else {
  		assertEquals("Expect ", "rendered-value", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("trigger-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [trigger-type]");
  	} else {
  		assertEquals("Expect ", "trigger-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FHIRList");
  	result = fhirlistDao.find("example");
  	if (null == result) {
  		System.out.println("Not found FHIRList [example]");
  	} else {
  		assertEquals("Expect ", "example", ((FHIRList)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("ambulation");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [ambulation]");
  	} else {
  		assertEquals("Expect ", "ambulation", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("intervention");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [intervention]");
  	} else {
  		assertEquals("Expect ", "intervention", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("codesystem-extensions-CodeSystem-keyword");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [codesystem-extensions-CodeSystem-keyword]");
  	} else {
  		assertEquals("Expect ", "codesystem-extensions-CodeSystem-keyword", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-relationship-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-relationship-type]");
  	} else {
  		assertEquals("Expect ", "action-relationship-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("publication-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [publication-status]");
  	} else {
  		assertEquals("Expect ", "publication-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("AllergyIntolerance");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [AllergyIntolerance]");
  	} else {
  		assertEquals("Expect ", "AllergyIntolerance", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("fiberrestricteddiet");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [fiberrestricteddiet]");
  	} else {
  		assertEquals("Expect ", "fiberrestricteddiet", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedure-method");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedure-method]");
  	} else {
  		assertEquals("Expect ", "procedure-method", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CompartmentDefinition");
  	result = compartmentdefinitionDao.find("patient");
  	if (null == result) {
  		System.out.println("Not found CompartmentDefinition [patient]");
  	} else {
  		assertEquals("Expect ", "patient", ((CompartmentDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("f003");
  	if (null == result) {
  		System.out.println("Not found Procedure [f003]");
  	} else {
  		assertEquals("Expect ", "f003", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("operationoutcome-issue-source");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [operationoutcome-issue-source]");
  	} else {
  		assertEquals("Expect ", "operationoutcome-issue-source", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("event-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [event-status]");
  	} else {
  		assertEquals("Expect ", "event-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("bundle-transaction");
  	if (null == result) {
  		System.out.println("Not found Bundle [bundle-transaction]");
  	} else {
  		assertEquals("Expect ", "bundle-transaction", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("definition-topic");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [definition-topic]");
  	} else {
  		assertEquals("Expect ", "definition-topic", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Encounter");
  	result = encounterDao.find("f003");
  	if (null == result) {
  		System.out.println("Not found Encounter [f003]");
  	} else {
  		assertEquals("Expect ", "f003", ((Encounter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-status]");
  	} else {
  		assertEquals("Expect ", "encounter-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("compartment-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [compartment-type]");
  	} else {
  		assertEquals("Expect ", "compartment-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("probability-distribution-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [probability-distribution-type]");
  	} else {
  		assertEquals("Expect ", "probability-distribution-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("service-modifiers");
  	if (null == result) {
  		System.out.println("Not found ValueSet [service-modifiers]");
  	} else {
  		assertEquals("Expect ", "service-modifiers", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaireresponse-note");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaireresponse-note]");
  	} else {
  		assertEquals("Expect ", "questionnaireresponse-note", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("consent-NotificationEndpoint");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [consent-NotificationEndpoint]");
  	} else {
  		assertEquals("Expect ", "consent-NotificationEndpoint", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("udi-entry-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [udi-entry-type]");
  	} else {
  		assertEquals("Expect ", "udi-entry-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("device-action");
  	if (null == result) {
  		System.out.println("Not found ValueSet [device-action]");
  	} else {
  		assertEquals("Expect ", "device-action", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("map-input-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [map-input-mode]");
  	} else {
  		assertEquals("Expect ", "map-input-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("supplydelivery-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [supplydelivery-type]");
  	} else {
  		assertEquals("Expect ", "supplydelivery-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ex-revenue-center");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ex-revenue-center]");
  	} else {
  		assertEquals("Expect ", "ex-revenue-center", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("sequence-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [sequence-type]");
  	} else {
  		assertEquals("Expect ", "sequence-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0318");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0318]");
  	} else {
  		assertEquals("Expect ", "meddisp0318", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-label");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-label]");
  	} else {
  		assertEquals("Expect ", "valueset-label", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("consent-data-meaning");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [consent-data-meaning]");
  	} else {
  		assertEquals("Expect ", "consent-data-meaning", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("VisionPrescription");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [VisionPrescription]");
  	} else {
  		assertEquals("Expect ", "VisionPrescription", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Account");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Account]");
  	} else {
  		assertEquals("Expect ", "Account", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessRequest");
  	result = processrequestDao.find("1113");
  	if (null == result) {
  		System.out.println("Not found ProcessRequest [1113]");
  	} else {
  		assertEquals("Expect ", "1113", ((ProcessRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("2minute-apgar-score");
  	if (null == result) {
  		System.out.println("Not found Observation [2minute-apgar-score]");
  	} else {
  		assertEquals("Expect ", "2minute-apgar-score", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("library-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [library-type]");
  	} else {
  		assertEquals("Expect ", "library-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-annotation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-annotation]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-annotation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("GraphDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [GraphDefinition]");
  	} else {
  		assertEquals("Expect ", "GraphDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-hidden");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-hidden]");
  	} else {
  		assertEquals("Expect ", "questionnaire-hidden", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Substance");
  	result = substanceDao.find("f205");
  	if (null == result) {
  		System.out.println("Not found Substance [f205]");
  	} else {
  		assertEquals("Expect ", "f205", ((Substance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("supplydelivery-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [supplydelivery-status]");
  	} else {
  		assertEquals("Expect ", "supplydelivery-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("pharmacy-core-refillsRemaining");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [pharmacy-core-refillsRemaining]");
  	} else {
  		assertEquals("Expect ", "pharmacy-core-refillsRemaining", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("library-cms146-example");
  	if (null == result) {
  		System.out.println("Not found Library [library-cms146-example]");
  	} else {
  		assertEquals("Expect ", "library-cms146-example", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("openEHR-exposureDate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [openEHR-exposureDate]");
  	} else {
  		assertEquals("Expect ", "openEHR-exposureDate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-optionPrefix");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-optionPrefix]");
  	} else {
  		assertEquals("Expect ", "questionnaire-optionPrefix", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("f003");
  	if (null == result) {
  		System.out.println("Not found Condition [f003]");
  	} else {
  		assertEquals("Expect ", "f003", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0326");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0326]");
  	} else {
  		assertEquals("Expect ", "medrx0326", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("specimen-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [specimen-status]");
  	} else {
  		assertEquals("Expect ", "specimen-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("composition-attestation-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [composition-attestation-mode]");
  	} else {
  		assertEquals("Expect ", "composition-attestation-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CapabilityStatement");
  	result = capabilitystatementDao.find("terminology-server");
  	if (null == result) {
  		System.out.println("Not found CapabilityStatement [terminology-server]");
  	} else {
  		assertEquals("Expect ", "terminology-server", ((CapabilityStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("encounter-admit-source");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [encounter-admit-source]");
  	} else {
  		assertEquals("Expect ", "encounter-admit-source", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("care-plan-intent");
  	if (null == result) {
  		System.out.println("Not found ValueSet [care-plan-intent]");
  	} else {
  		assertEquals("Expect ", "care-plan-intent", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("chromosome-human");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [chromosome-human]");
  	} else {
  		assertEquals("Expect ", "chromosome-human", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-diet");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-diet]");
  	} else {
  		assertEquals("Expect ", "encounter-diet", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-signature");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-signature]");
  	} else {
  		assertEquals("Expect ", "consent-example-signature", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("pharmacy-core-maxDeliveryVolume");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [pharmacy-core-maxDeliveryVolume]");
  	} else {
  		assertEquals("Expect ", "pharmacy-core-maxDeliveryVolume", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("reference-handling-policy");
  	if (null == result) {
  		System.out.println("Not found ValueSet [reference-handling-policy]");
  	} else {
  		assertEquals("Expect ", "reference-handling-policy", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("example");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [example]");
  	} else {
  		assertEquals("Expect ", "example", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("endpoint-connection-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [endpoint-connection-type]");
  	} else {
  		assertEquals("Expect ", "endpoint-connection-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("specification-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [specification-type]");
  	} else {
  		assertEquals("Expect ", "specification-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Location");
  	result = locationDao.find("ph");
  	if (null == result) {
  		System.out.println("Not found Location [ph]");
  	} else {
  		assertEquals("Expect ", "ph", ((Location)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Procedure");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Procedure]");
  	} else {
  		assertEquals("Expect ", "Procedure", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("date-lastmp");
  	if (null == result) {
  		System.out.println("Not found Observation [date-lastmp]");
  	} else {
  		assertEquals("Expect ", "date-lastmp", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("condition-criticality");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [condition-criticality]");
  	} else {
  		assertEquals("Expect ", "condition-criticality", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("conformance-expectation");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [conformance-expectation]");
  	} else {
  		assertEquals("Expect ", "conformance-expectation", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Consent");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Consent]");
  	} else {
  		assertEquals("Expect ", "Consent", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ProcessRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ProcessRequest]");
  	} else {
  		assertEquals("Expect ", "ProcessRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("document-relationship-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [document-relationship-type]");
  	} else {
  		assertEquals("Expect ", "document-relationship-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0335");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0335]");
  	} else {
  		assertEquals("Expect ", "medrx0335", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f205");
  	if (null == result) {
  		System.out.println("Not found Observation [f205]");
  	} else {
  		assertEquals("Expect ", "f205", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CapabilityStatement");
  	result = capabilitystatementDao.find("messagedefinition");
  	if (null == result) {
  		System.out.println("Not found CapabilityStatement [messagedefinition]");
  	} else {
  		assertEquals("Expect ", "messagedefinition", ((CapabilityStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MessageDefinition");
  	result = messagedefinitionDao.find("patient-link-notification");
  	if (null == result) {
  		System.out.println("Not found MessageDefinition [patient-link-notification]");
  	} else {
  		assertEquals("Expect ", "patient-link-notification", ((MessageDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("search-param-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [search-param-type]");
  	} else {
  		assertEquals("Expect ", "search-param-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("icd-10");
  	if (null == result) {
  		System.out.println("Not found ValueSet [icd-10]");
  	} else {
  		assertEquals("Expect ", "icd-10", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("definition-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [definition-status]");
  	} else {
  		assertEquals("Expect ", "definition-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Questionnaire-populate");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Questionnaire-populate]");
  	} else {
  		assertEquals("Expect ", "Questionnaire-populate", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contactentity-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contactentity-type]");
  	} else {
  		assertEquals("Expect ", "contactentity-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("message-transport");
  	if (null == result) {
  		System.out.println("Not found ValueSet [message-transport]");
  	} else {
  		assertEquals("Expect ", "message-transport", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-comments");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-comments]");
  	} else {
  		assertEquals("Expect ", "codesystem-comments", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-genetics-1");
  	if (null == result) {
  		System.out.println("Not found Observation [example-genetics-1]");
  	} else {
  		assertEquals("Expect ", "example-genetics-1", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("episodeofcare-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [episodeofcare-type]");
  	} else {
  		assertEquals("Expect ", "episodeofcare-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RiskAssessment");
  	result = riskassessmentDao.find("genetic");
  	if (null == result) {
  		System.out.println("Not found RiskAssessment [genetic]");
  	} else {
  		assertEquals("Expect ", "genetic", ((RiskAssessment)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0323");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0323]");
  	} else {
  		assertEquals("Expect ", "medrx0323", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("lipids");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [lipids]");
  	} else {
  		assertEquals("Expect ", "lipids", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve TestScript");
  	result = testscriptDao.find("testscript-example-rule");
  	if (null == result) {
  		System.out.println("Not found TestScript [testscript-example-rule]");
  	} else {
  		assertEquals("Expect ", "testscript-example-rule", ((TestScript)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("condition-ver-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [condition-ver-status]");
  	} else {
  		assertEquals("Expect ", "condition-ver-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0305");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0305]");
  	} else {
  		assertEquals("Expect ", "medrx0305", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-notThis");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-notThis]");
  	} else {
  		assertEquals("Expect ", "consent-example-notThis", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0324");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0324]");
  	} else {
  		assertEquals("Expect ", "meddisp0324", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DeviceRequest");
  	result = devicerequestDao.find("insulinpump");
  	if (null == result) {
  		System.out.println("Not found DeviceRequest [insulinpump]");
  	} else {
  		assertEquals("Expect ", "insulinpump", ((DeviceRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("example-pgx-2");
  	if (null == result) {
  		System.out.println("Not found Sequence [example-pgx-2]");
  	} else {
  		assertEquals("Expect ", "example-pgx-2", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-explicit-type-name");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-explicit-type-name]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-explicit-type-name", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f002");
  	if (null == result) {
  		System.out.println("Not found Observation [f002]");
  	} else {
  		assertEquals("Expect ", "f002", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("immunization-recommendation-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [immunization-recommendation-status]");
  	} else {
  		assertEquals("Expect ", "immunization-recommendation-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0317");
  	if (null == result) {
  		System.out.println("Not found Medication [med0317]");
  	} else {
  		assertEquals("Expect ", "med0317", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Schedule");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Schedule]");
  	} else {
  		assertEquals("Expect ", "Schedule", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsDNAVariantId");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsDNAVariantId]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsDNAVariantId", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("example-reference");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [example-reference]");
  	} else {
  		assertEquals("Expect ", "example-reference", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adverse-event-causality-result");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adverse-event-causality-result]");
  	} else {
  		assertEquals("Expect ", "adverse-event-causality-result", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("audit-event-action");
  	if (null == result) {
  		System.out.println("Not found ValueSet [audit-event-action]");
  	} else {
  		assertEquals("Expect ", "audit-event-action", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Slot");
  	result = slotDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Slot [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Slot)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MessageDefinition");
  	result = messagedefinitionDao.find("patient-link-response");
  	if (null == result) {
  		System.out.println("Not found MessageDefinition [patient-link-response]");
  	} else {
  		assertEquals("Expect ", "patient-link-response", ((MessageDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ClinicalImpression");
  	result = clinicalimpressionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ClinicalImpression [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ClinicalImpression)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Endpoint");
  	result = endpointDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Endpoint [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Endpoint)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0316");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0316]");
  	} else {
  		assertEquals("Expect ", "medrx0316", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("policyholder-relationship");
  	if (null == result) {
  		System.out.println("Not found ValueSet [policyholder-relationship]");
  	} else {
  		assertEquals("Expect ", "policyholder-relationship", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("reaction-event-certainty");
  	if (null == result) {
  		System.out.println("Not found ValueSet [reaction-event-certainty]");
  	} else {
  		assertEquals("Expect ", "reaction-event-certainty", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("namingsystem-identifier-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [namingsystem-identifier-type]");
  	} else {
  		assertEquals("Expect ", "namingsystem-identifier-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("metric-calibration-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [metric-calibration-type]");
  	} else {
  		assertEquals("Expect ", "metric-calibration-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("consent-content-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [consent-content-code]");
  	} else {
  		assertEquals("Expect ", "consent-content-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("request-priority");
  	if (null == result) {
  		System.out.println("Not found ValueSet [request-priority]");
  	} else {
  		assertEquals("Expect ", "request-priority", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-statement-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-statement-status]");
  	} else {
  		assertEquals("Expect ", "medication-statement-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("observation-genetic-Observation-gene-identifier");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [observation-genetic-Observation-gene-identifier]");
  	} else {
  		assertEquals("Expect ", "observation-genetic-Observation-gene-identifier", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DeviceComponent");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DeviceComponent]");
  	} else {
  		assertEquals("Expect ", "DeviceComponent", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("data-types");
  	if (null == result) {
  		System.out.println("Not found ValueSet [data-types]");
  	} else {
  		assertEquals("Expect ", "data-types", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Slot");
  	result = slotDao.find("1");
  	if (null == result) {
  		System.out.println("Not found Slot [1]");
  	} else {
  		assertEquals("Expect ", "1", ((Slot)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("patient-extensions-Patient-mothersMaidenName");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [patient-extensions-Patient-mothersMaidenName]");
  	} else {
  		assertEquals("Expect ", "patient-extensions-Patient-mothersMaidenName", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f004");
  	if (null == result) {
  		System.out.println("Not found Observation [f004]");
  	} else {
  		assertEquals("Expect ", "f004", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("assert-direction-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [assert-direction-codes]");
  	} else {
  		assertEquals("Expect ", "assert-direction-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("observation-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [observation-status]");
  	} else {
  		assertEquals("Expect ", "observation-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("auditevent-SOPClass");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [auditevent-SOPClass]");
  	} else {
  		assertEquals("Expect ", "auditevent-SOPClass", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("diagnosticReport-summaryOf");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [diagnosticReport-summaryOf]");
  	} else {
  		assertEquals("Expect ", "diagnosticReport-summaryOf", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0316");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0316]");
  	} else {
  		assertEquals("Expect ", "meddisp0316", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Device");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Device]");
  	} else {
  		assertEquals("Expect ", "Device", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("MedicationRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [MedicationRequest]");
  	} else {
  		assertEquals("Expect ", "MedicationRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("signature-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [signature-type]");
  	} else {
  		assertEquals("Expect ", "signature-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("low-suicide-risk-order-set");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [low-suicide-risk-order-set]");
  	} else {
  		assertEquals("Expect ", "low-suicide-risk-order-set", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Measure");
  	result = measureDao.find("component-b-example");
  	if (null == result) {
  		System.out.println("Not found Measure [component-b-example]");
  	} else {
  		assertEquals("Expect ", "component-b-example", ((Measure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("location-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [location-mode]");
  	} else {
  		assertEquals("Expect ", "location-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ClaimResponse");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ClaimResponse]");
  	} else {
  		assertEquals("Expect ", "ClaimResponse", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0314");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0314]");
  	} else {
  		assertEquals("Expect ", "medrx0314", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-mothersMaidenName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-mothersMaidenName]");
  	} else {
  		assertEquals("Expect ", "patient-mothersMaidenName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("f202");
  	if (null == result) {
  		System.out.println("Not found Condition [f202]");
  	} else {
  		assertEquals("Expect ", "f202", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Location");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Location]");
  	} else {
  		assertEquals("Expect ", "Location", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("unknown-content-code");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [unknown-content-code]");
  	} else {
  		assertEquals("Expect ", "unknown-content-code", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("metric-operational-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [metric-operational-status]");
  	} else {
  		assertEquals("Expect ", "metric-operational-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("allerg-intol-substance-exp-risk");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [allerg-intol-substance-exp-risk]");
  	} else {
  		assertEquals("Expect ", "allerg-intol-substance-exp-risk", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found Condition [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CompartmentDefinition");
  	result = compartmentdefinitionDao.find("encounter");
  	if (null == result) {
  		System.out.println("Not found CompartmentDefinition [encounter]");
  	} else {
  		assertEquals("Expect ", "encounter", ((CompartmentDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("goal-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [goal-status]");
  	} else {
  		assertEquals("Expect ", "goal-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("MeasureReport");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [MeasureReport]");
  	} else {
  		assertEquals("Expect ", "MeasureReport", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("valueset-extensions-ValueSet-end");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [valueset-extensions-ValueSet-end]");
  	} else {
  		assertEquals("Expect ", "valueset-extensions-ValueSet-end", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Period");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Period]");
  	} else {
  		assertEquals("Expect ", "Period", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("claim-exception");
  	if (null == result) {
  		System.out.println("Not found ValueSet [claim-exception]");
  	} else {
  		assertEquals("Expect ", "claim-exception", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found Procedure [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("bmi");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [bmi]");
  	} else {
  		assertEquals("Expect ", "bmi", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("report-result-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [report-result-codes]");
  	} else {
  		assertEquals("Expect ", "report-result-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("immunization-recommendation-target-disease");
  	if (null == result) {
  		System.out.println("Not found ValueSet [immunization-recommendation-target-disease]");
  	} else {
  		assertEquals("Expect ", "immunization-recommendation-target-disease", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("10bb101f-a121-4264-a920-67be9cb82c74");
  	if (null == result) {
  		System.out.println("Not found Bundle [10bb101f-a121-4264-a920-67be9cb82c74]");
  	} else {
  		assertEquals("Expect ", "10bb101f-a121-4264-a920-67be9cb82c74", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("pureeddiet-simple");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [pureeddiet-simple]");
  	} else {
  		assertEquals("Expect ", "pureeddiet-simple", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("obesity-narrative");
  	if (null == result) {
  		System.out.println("Not found CarePlan [obesity-narrative]");
  	} else {
  		assertEquals("Expect ", "obesity-narrative", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("GuidanceResponse");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [GuidanceResponse]");
  	} else {
  		assertEquals("Expect ", "GuidanceResponse", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Range");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Range]");
  	} else {
  		assertEquals("Expect ", "Range", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Communication");
  	result = communicationDao.find("fm-solicited");
  	if (null == result) {
  		System.out.println("Not found Communication [fm-solicited]");
  	} else {
  		assertEquals("Expect ", "fm-solicited", ((Communication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("vision-product");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [vision-product]");
  	} else {
  		assertEquals("Expect ", "vision-product", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ImagingManifest");
  	result = imagingmanifestDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ImagingManifest [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ImagingManifest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureMap");
  	result = structuremapDao.find("supplyrequest-transform");
  	if (null == result) {
  		System.out.println("Not found StructureMap [supplyrequest-transform]");
  	} else {
  		assertEquals("Expect ", "supplyrequest-transform", ((StructureMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-admin-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-admin-status]");
  	} else {
  		assertEquals("Expect ", "medication-admin-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Patient-everything");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Patient-everything]");
  	} else {
  		assertEquals("Expect ", "Patient-everything", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DataElement");
  	result = dataelementDao.find("gender");
  	if (null == result) {
  		System.out.println("Not found DataElement [gender]");
  	} else {
  		assertEquals("Expect ", "gender", ((DataElement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("MessageHeader-process-message");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [MessageHeader-process-message]");
  	} else {
  		assertEquals("Expect ", "MessageHeader-process-message", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-request-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-request-status]");
  	} else {
  		assertEquals("Expect ", "medication-request-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("audit-event-outcome");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [audit-event-outcome]");
  	} else {
  		assertEquals("Expect ", "audit-event-outcome", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("restful-capability-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [restful-capability-mode]");
  	} else {
  		assertEquals("Expect ", "restful-capability-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-EN-representation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-EN-representation]");
  	} else {
  		assertEquals("Expect ", "iso21090-EN-representation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("intervention");
  	if (null == result) {
  		System.out.println("Not found ValueSet [intervention]");
  	} else {
  		assertEquals("Expect ", "intervention", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ImplementationGuide");
  	result = implementationguideDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ImplementationGuide [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ImplementationGuide)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("publication-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [publication-status]");
  	} else {
  		assertEquals("Expect ", "publication-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("library-exclusive-breastfeeding-cqm-logic");
  	if (null == result) {
  		System.out.println("Not found Library [library-exclusive-breastfeeding-cqm-logic]");
  	} else {
  		assertEquals("Expect ", "library-exclusive-breastfeeding-cqm-logic", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("history-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [history-status]");
  	} else {
  		assertEquals("Expect ", "history-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-unclosed");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-unclosed]");
  	} else {
  		assertEquals("Expect ", "valueset-unclosed", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("composition-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [composition-status]");
  	} else {
  		assertEquals("Expect ", "composition-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Device");
  	result = deviceDao.find("example-udi1");
  	if (null == result) {
  		System.out.println("Not found Device [example-udi1]");
  	} else {
  		assertEquals("Expect ", "example-udi1", ((Device)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("usps-state");
  	if (null == result) {
  		System.out.println("Not found ValueSet [usps-state]");
  	} else {
  		assertEquals("Expect ", "usps-state", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("action-grouping-behavior");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [action-grouping-behavior]");
  	} else {
  		assertEquals("Expect ", "action-grouping-behavior", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("dataelements");
  	if (null == result) {
  		System.out.println("Not found Bundle [dataelements]");
  	} else {
  		assertEquals("Expect ", "dataelements", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MeasureReport");
  	result = measurereportDao.find("measurereport-cms146-cat1-example");
  	if (null == result) {
  		System.out.println("Not found MeasureReport [measurereport-cms146-cat1-example]");
  	} else {
  		assertEquals("Expect ", "measurereport-cms146-cat1-example", ((MeasureReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("claim-careteamrole");
  	if (null == result) {
  		System.out.println("Not found ValueSet [claim-careteamrole]");
  	} else {
  		assertEquals("Expect ", "claim-careteamrole", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-objectClass");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-objectClass]");
  	} else {
  		assertEquals("Expect ", "11179-objectClass", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0329");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0329]");
  	} else {
  		assertEquals("Expect ", "meddisp0329", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("reaction-event-severity");
  	if (null == result) {
  		System.out.println("Not found ValueSet [reaction-event-severity]");
  	} else {
  		assertEquals("Expect ", "reaction-event-severity", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("condition-extensions-Condition-definition");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [condition-extensions-Condition-definition]");
  	} else {
  		assertEquals("Expect ", "condition-extensions-Condition-definition", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("heart-rate");
  	if (null == result) {
  		System.out.println("Not found Observation [heart-rate]");
  	} else {
  		assertEquals("Expect ", "heart-rate", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("3ad0687e-f477-468c-afd5-fcc2bf897808");
  	if (null == result) {
  		System.out.println("Not found Bundle [3ad0687e-f477-468c-afd5-fcc2bf897808]");
  	} else {
  		assertEquals("Expect ", "3ad0687e-f477-468c-afd5-fcc2bf897808", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Coding");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Coding]");
  	} else {
  		assertEquals("Expect ", "Coding", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Measure");
  	result = measureDao.find("measure-cms146-example");
  	if (null == result) {
  		System.out.println("Not found Measure [measure-cms146-example]");
  	} else {
  		assertEquals("Expect ", "measure-cms146-example", ((Measure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("relationship");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [relationship]");
  	} else {
  		assertEquals("Expect ", "relationship", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("device-safety");
  	if (null == result) {
  		System.out.println("Not found ValueSet [device-safety]");
  	} else {
  		assertEquals("Expect ", "device-safety", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("goal-start-event");
  	if (null == result) {
  		System.out.println("Not found ValueSet [goal-start-event]");
  	} else {
  		assertEquals("Expect ", "goal-start-event", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ldlcholesterol");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ldlcholesterol]");
  	} else {
  		assertEquals("Expect ", "ldlcholesterol", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("chargeitem-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [chargeitem-status]");
  	} else {
  		assertEquals("Expect ", "chargeitem-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("report-action-result-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [report-action-result-codes]");
  	} else {
  		assertEquals("Expect ", "report-action-result-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CompartmentDefinition");
  	result = compartmentdefinitionDao.find("practitioner");
  	if (null == result) {
  		System.out.println("Not found CompartmentDefinition [practitioner]");
  	} else {
  		assertEquals("Expect ", "practitioner", ((CompartmentDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("profile-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [profile-code]");
  	} else {
  		assertEquals("Expect ", "profile-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("episode-of-care-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [episode-of-care-status]");
  	} else {
  		assertEquals("Expect ", "episode-of-care-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-direction");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-direction]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-direction", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-notTime");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-notTime]");
  	} else {
  		assertEquals("Expect ", "consent-example-notTime", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve EnrollmentRequest");
  	result = enrollmentrequestDao.find("22345");
  	if (null == result) {
  		System.out.println("Not found EnrollmentRequest [22345]");
  	} else {
  		assertEquals("Expect ", "22345", ((EnrollmentRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("questionnaire-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [questionnaire-category]");
  	} else {
  		assertEquals("Expect ", "questionnaire-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("resource-validation-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [resource-validation-mode]");
  	} else {
  		assertEquals("Expect ", "resource-validation-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("example-pgx");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [example-pgx]");
  	} else {
  		assertEquals("Expect ", "example-pgx", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-delimiter");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-delimiter]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-delimiter", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("care-plan-intent");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [care-plan-intent]");
  	} else {
  		assertEquals("Expect ", "care-plan-intent", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-citizenship");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-citizenship]");
  	} else {
  		assertEquals("Expect ", "patient-citizenship", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-equivalence");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-equivalence]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-equivalence", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Library-data-requirements");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Library-data-requirements]");
  	} else {
  		assertEquals("Expect ", "Library-data-requirements", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("common-tags");
  	if (null == result) {
  		System.out.println("Not found ValueSet [common-tags]");
  	} else {
  		assertEquals("Expect ", "common-tags", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("conditional-delete-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [conditional-delete-status]");
  	} else {
  		assertEquals("Expect ", "conditional-delete-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SupplyRequest");
  	result = supplyrequestDao.find("simpleorder");
  	if (null == result) {
  		System.out.println("Not found SupplyRequest [simpleorder]");
  	} else {
  		assertEquals("Expect ", "simpleorder", ((SupplyRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("103");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [103]");
  	} else {
  		assertEquals("Expect ", "103", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-diplotype1");
  	if (null == result) {
  		System.out.println("Not found Observation [example-diplotype1]");
  	} else {
  		assertEquals("Expect ", "example-diplotype1", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("summary");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [summary]");
  	} else {
  		assertEquals("Expect ", "summary", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("uuid");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [uuid]");
  	} else {
  		assertEquals("Expect ", "uuid", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("definition-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [definition-status]");
  	} else {
  		assertEquals("Expect ", "definition-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("animal-genderstatus");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [animal-genderstatus]");
  	} else {
  		assertEquals("Expect ", "animal-genderstatus", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsGenomicSourceClass");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsGenomicSourceClass]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsGenomicSourceClass", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DocumentReference");
  	result = documentreferenceDao.find("example");
  	if (null == result) {
  		System.out.println("Not found DocumentReference [example]");
  	} else {
  		assertEquals("Expect ", "example", ((DocumentReference)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adverse-event-causality-assess");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adverse-event-causality-assess]");
  	} else {
  		assertEquals("Expect ", "adverse-event-causality-assess", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0311");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0311]");
  	} else {
  		assertEquals("Expect ", "medadmin0311", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("copy-number-event");
  	if (null == result) {
  		System.out.println("Not found ValueSet [copy-number-event]");
  	} else {
  		assertEquals("Expect ", "copy-number-event", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Questionnaire-populatehtml");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Questionnaire-populatehtml]");
  	} else {
  		assertEquals("Expect ", "Questionnaire-populatehtml", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("observation-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [observation-status]");
  	} else {
  		assertEquals("Expect ", "observation-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-studyprotocolIdentifier");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-studyprotocolIdentifier]");
  	} else {
  		assertEquals("Expect ", "questionnaire-studyprotocolIdentifier", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("goal-priority");
  	if (null == result) {
  		System.out.println("Not found ValueSet [goal-priority]");
  	} else {
  		assertEquals("Expect ", "goal-priority", ((ValueSet)result).getId());
  	}
  	System.out.println("Total tests .. " + count);
  }
  @Test
  public void test1860() throws Exception {
  	Object local = null;
  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("classification-or-context");
  	if (null == result) {
  		System.out.println("Not found ValueSet [classification-or-context]");
  	} else {
  		assertEquals("Expect ", "classification-or-context", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-contact-point-use-v2");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-contact-point-use-v2]");
  	} else {
  		assertEquals("Expect ", "cm-contact-point-use-v2", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0312");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0312]");
  	} else {
  		assertEquals("Expect ", "medrx0312", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("capabilitystatement-prohibited");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [capabilitystatement-prohibited]");
  	} else {
  		assertEquals("Expect ", "capabilitystatement-prohibited", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Group");
  	result = groupDao.find("101");
  	if (null == result) {
  		System.out.println("Not found Group [101]");
  	} else {
  		assertEquals("Expect ", "101", ((Group)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contract-action");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contract-action]");
  	} else {
  		assertEquals("Expect ", "contract-action", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("days-of-week");
  	if (null == result) {
  		System.out.println("Not found ValueSet [days-of-week]");
  	} else {
  		assertEquals("Expect ", "days-of-week", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-TPMT-haplotype-two");
  	if (null == result) {
  		System.out.println("Not found Observation [example-TPMT-haplotype-two]");
  	} else {
  		assertEquals("Expect ", "example-TPMT-haplotype-two", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("action-required-behavior");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [action-required-behavior]");
  	} else {
  		assertEquals("Expect ", "action-required-behavior", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("rendering-markdown");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [rendering-markdown]");
  	} else {
  		assertEquals("Expect ", "rendering-markdown", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("conceptmaps");
  	if (null == result) {
  		System.out.println("Not found Bundle [conceptmaps]");
  	} else {
  		assertEquals("Expect ", "conceptmaps", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("task-performer-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [task-performer-type]");
  	} else {
  		assertEquals("Expect ", "task-performer-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("assert-operator-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [assert-operator-codes]");
  	} else {
  		assertEquals("Expect ", "assert-operator-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f202");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f202]");
  	} else {
  		assertEquals("Expect ", "f202", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("address-use");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [address-use]");
  	} else {
  		assertEquals("Expect ", "address-use", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CapabilityStatement");
  	result = capabilitystatementDao.find("base");
  	if (null == result) {
  		System.out.println("Not found CapabilityStatement [base]");
  	} else {
  		assertEquals("Expect ", "base", ((CapabilityStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("tooth");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [tooth]");
  	} else {
  		assertEquals("Expect ", "tooth", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("note-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [note-type]");
  	} else {
  		assertEquals("Expect ", "note-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("diagnosis-role");
  	if (null == result) {
  		System.out.println("Not found ValueSet [diagnosis-role]");
  	} else {
  		assertEquals("Expect ", "diagnosis-role", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("coverage-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [coverage-type]");
  	} else {
  		assertEquals("Expect ", "coverage-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adverse-event-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adverse-event-category]");
  	} else {
  		assertEquals("Expect ", "adverse-event-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Person");
  	result = personDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Person [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Person)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CapabilityStatement");
  	result = capabilitystatementDao.find("knowledge-repository");
  	if (null == result) {
  		System.out.println("Not found CapabilityStatement [knowledge-repository]");
  	} else {
  		assertEquals("Expect ", "knowledge-repository", ((CapabilityStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("id");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [id]");
  	} else {
  		assertEquals("Expect ", "id", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("care-plan-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [care-plan-status]");
  	} else {
  		assertEquals("Expect ", "care-plan-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-fmm");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-fmm]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-fmm", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("family-member-history-genetics-parent");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [family-member-history-genetics-parent]");
  	} else {
  		assertEquals("Expect ", "family-member-history-genetics-parent", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("service-place");
  	if (null == result) {
  		System.out.println("Not found ValueSet [service-place]");
  	} else {
  		assertEquals("Expect ", "service-place", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("PlanDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [PlanDefinition]");
  	} else {
  		assertEquals("Expect ", "PlanDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve EligibilityResponse");
  	result = eligibilityresponseDao.find("E2500");
  	if (null == result) {
  		System.out.println("Not found EligibilityResponse [E2500]");
  	} else {
  		assertEquals("Expect ", "E2500", ((EligibilityResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found Organization [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve GuidanceResponse");
  	result = guidanceresponseDao.find("example");
  	if (null == result) {
  		System.out.println("Not found GuidanceResponse [example]");
  	} else {
  		assertEquals("Expect ", "example", ((GuidanceResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Person");
  	result = personDao.find("grahame");
  	if (null == result) {
  		System.out.println("Not found Person [grahame]");
  	} else {
  		assertEquals("Expect ", "grahame", ((Person)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("care-plan-activity-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [care-plan-activity-category]");
  	} else {
  		assertEquals("Expect ", "care-plan-activity-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("2.16.840.1.113883.19.5");
  	if (null == result) {
  		System.out.println("Not found Organization [2.16.840.1.113883.19.5]");
  	} else {
  		assertEquals("Expect ", "2.16.840.1.113883.19.5", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("participantrequired");
  	if (null == result) {
  		System.out.println("Not found ValueSet [participantrequired]");
  	} else {
  		assertEquals("Expect ", "participantrequired", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contract-term-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contract-term-type]");
  	} else {
  		assertEquals("Expect ", "contract-term-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("service-provision-conditions");
  	if (null == result) {
  		System.out.println("Not found ValueSet [service-provision-conditions]");
  	} else {
  		assertEquals("Expect ", "service-provision-conditions", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("graphic-example-3");
  	if (null == result) {
  		System.out.println("Not found Sequence [graphic-example-3]");
  	} else {
  		assertEquals("Expect ", "graphic-example-3", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("icd-10-procedures");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [icd-10-procedures]");
  	} else {
  		assertEquals("Expect ", "icd-10-procedures", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("map-transform");
  	if (null == result) {
  		System.out.println("Not found ValueSet [map-transform]");
  	} else {
  		assertEquals("Expect ", "map-transform", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("observation-statistics");
  	if (null == result) {
  		System.out.println("Not found ValueSet [observation-statistics]");
  	} else {
  		assertEquals("Expect ", "observation-statistics", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-address-type-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-address-type-v3]");
  	} else {
  		assertEquals("Expect ", "cm-address-type-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0308");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0308]");
  	} else {
  		assertEquals("Expect ", "meddisp0308", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("transaction-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [transaction-mode]");
  	} else {
  		assertEquals("Expect ", "transaction-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-grantor");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-grantor]");
  	} else {
  		assertEquals("Expect ", "consent-example-grantor", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("nutrition-request-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [nutrition-request-status]");
  	} else {
  		assertEquals("Expect ", "nutrition-request-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("referencerange-meaning");
  	if (null == result) {
  		System.out.println("Not found ValueSet [referencerange-meaning]");
  	} else {
  		assertEquals("Expect ", "referencerange-meaning", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("goal-pertainsToGoal");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [goal-pertainsToGoal]");
  	} else {
  		assertEquals("Expect ", "goal-pertainsToGoal", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("procedure-progress-status-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [procedure-progress-status-codes]");
  	} else {
  		assertEquals("Expect ", "procedure-progress-status-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("activity-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [activity-reason]");
  	} else {
  		assertEquals("Expect ", "activity-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("request-intent");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [request-intent]");
  	} else {
  		assertEquals("Expect ", "request-intent", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("match-grade");
  	if (null == result) {
  		System.out.println("Not found ValueSet [match-grade]");
  	} else {
  		assertEquals("Expect ", "match-grade", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("concept-property-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [concept-property-type]");
  	} else {
  		assertEquals("Expect ", "concept-property-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("patient-extensions-Patient-age");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [patient-extensions-Patient-age]");
  	} else {
  		assertEquals("Expect ", "patient-extensions-Patient-age", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("760151");
  	if (null == result) {
  		System.out.println("Not found Claim [760151]");
  	} else {
  		assertEquals("Expect ", "760151", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Specimen");
  	result = specimenDao.find("vma-urine");
  	if (null == result) {
  		System.out.println("Not found Specimen [vma-urine]");
  	} else {
  		assertEquals("Expect ", "vma-urine", ((Specimen)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("bodylength");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [bodylength]");
  	} else {
  		assertEquals("Expect ", "bodylength", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("sequence-complex-variant");
  	if (null == result) {
  		System.out.println("Not found Sequence [sequence-complex-variant]");
  	} else {
  		assertEquals("Expect ", "sequence-complex-variant", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ucum-bodylength");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ucum-bodylength]");
  	} else {
  		assertEquals("Expect ", "ucum-bodylength", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("bmi");
  	if (null == result) {
  		System.out.println("Not found Observation [bmi]");
  	} else {
  		assertEquals("Expect ", "bmi", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-cause");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-cause]");
  	} else {
  		assertEquals("Expect ", "condition-cause", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CapabilityStatement");
  	result = capabilitystatementDao.find("measure-processor");
  	if (null == result) {
  		System.out.println("Not found CapabilityStatement [measure-processor]");
  	} else {
  		assertEquals("Expect ", "measure-processor", ((CapabilityStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("resource-effectivePeriod");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [resource-effectivePeriod]");
  	} else {
  		assertEquals("Expect ", "resource-effectivePeriod", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("ValueSet-validate-code");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [ValueSet-validate-code]");
  	} else {
  		assertEquals("Expect ", "ValueSet-validate-code", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("map-context-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [map-context-type]");
  	} else {
  		assertEquals("Expect ", "map-context-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("issue-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [issue-type]");
  	} else {
  		assertEquals("Expect ", "issue-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MeasureReport");
  	result = measurereportDao.find("measurereport-cms146-cat2-example");
  	if (null == result) {
  		System.out.println("Not found MeasureReport [measurereport-cms146-cat2-example]");
  	} else {
  		assertEquals("Expect ", "measurereport-cms146-cat2-example", ((MeasureReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("animal");
  	if (null == result) {
  		System.out.println("Not found Patient [animal]");
  	} else {
  		assertEquals("Expect ", "animal", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("constraint-severity");
  	if (null == result) {
  		System.out.println("Not found ValueSet [constraint-severity]");
  	} else {
  		assertEquals("Expect ", "constraint-severity", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("mapSourcePublisher");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [mapSourcePublisher]");
  	} else {
  		assertEquals("Expect ", "mapSourcePublisher", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("endpoint-connection-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [endpoint-connection-type]");
  	} else {
  		assertEquals("Expect ", "endpoint-connection-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("device-kind");
  	if (null == result) {
  		System.out.println("Not found ValueSet [device-kind]");
  	} else {
  		assertEquals("Expect ", "device-kind", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("suiciderisk-orderset-logic");
  	if (null == result) {
  		System.out.println("Not found Library [suiciderisk-orderset-logic]");
  	} else {
  		assertEquals("Expect ", "suiciderisk-orderset-logic", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessRequest");
  	result = processrequestDao.find("1114");
  	if (null == result) {
  		System.out.println("Not found ProcessRequest [1114]");
  	} else {
  		assertEquals("Expect ", "1114", ((ProcessRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found Patient [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("observation-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [observation-codes]");
  	} else {
  		assertEquals("Expect ", "observation-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("episode-of-care-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [episode-of-care-status]");
  	} else {
  		assertEquals("Expect ", "episode-of-care-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("action-cardinality-behavior");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [action-cardinality-behavior]");
  	} else {
  		assertEquals("Expect ", "action-cardinality-behavior", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("NutritionOrder");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [NutritionOrder]");
  	} else {
  		assertEquals("Expect ", "NutritionOrder", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("BackboneElement");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [BackboneElement]");
  	} else {
  		assertEquals("Expect ", "BackboneElement", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessRequest");
  	result = processrequestDao.find("87655");
  	if (null == result) {
  		System.out.println("Not found ProcessRequest [87655]");
  	} else {
  		assertEquals("Expect ", "87655", ((ProcessRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Reference");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Reference]");
  	} else {
  		assertEquals("Expect ", "Reference", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("operational-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [operational-status]");
  	} else {
  		assertEquals("Expect ", "operational-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("questionnaire-usage-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [questionnaire-usage-mode]");
  	} else {
  		assertEquals("Expect ", "questionnaire-usage-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("linkage-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [linkage-type]");
  	} else {
  		assertEquals("Expect ", "linkage-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("allergy-clinical-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [allergy-clinical-status]");
  	} else {
  		assertEquals("Expect ", "allergy-clinical-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-history");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-history]");
  	} else {
  		assertEquals("Expect ", "valueset-history", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("related-artifact-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [related-artifact-type]");
  	} else {
  		assertEquals("Expect ", "related-artifact-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("specification-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [specification-type]");
  	} else {
  		assertEquals("Expect ", "specification-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("20minute-apgar-score");
  	if (null == result) {
  		System.out.println("Not found Observation [20minute-apgar-score]");
  	} else {
  		assertEquals("Expect ", "20minute-apgar-score", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("restful-security-service");
  	if (null == result) {
  		System.out.println("Not found ValueSet [restful-security-service]");
  	} else {
  		assertEquals("Expect ", "restful-security-service", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationStatement");
  	result = medicationstatementDao.find("example005");
  	if (null == result) {
  		System.out.println("Not found MedicationStatement [example005]");
  	} else {
  		assertEquals("Expect ", "example005", ((MedicationStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("name-assembly-order");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [name-assembly-order]");
  	} else {
  		assertEquals("Expect ", "name-assembly-order", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [example]");
  	} else {
  		assertEquals("Expect ", "example", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Encounter");
  	result = encounterDao.find("f202");
  	if (null == result) {
  		System.out.println("Not found Encounter [f202]");
  	} else {
  		assertEquals("Expect ", "f202", ((Encounter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("explanationofbenefit-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [explanationofbenefit-status]");
  	} else {
  		assertEquals("Expect ", "explanationofbenefit-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-systemName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-systemName]");
  	} else {
  		assertEquals("Expect ", "valueset-systemName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ucum-bodytemp");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ucum-bodytemp]");
  	} else {
  		assertEquals("Expect ", "ucum-bodytemp", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("benefit-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [benefit-category]");
  	} else {
  		assertEquals("Expect ", "benefit-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contract-actorrole");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contract-actorrole]");
  	} else {
  		assertEquals("Expect ", "contract-actorrole", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-state");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-state]");
  	} else {
  		assertEquals("Expect ", "condition-state", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contract-subtype");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contract-subtype]");
  	} else {
  		assertEquals("Expect ", "contract-subtype", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("exclusive-breastfeeding-intervention-04");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [exclusive-breastfeeding-intervention-04]");
  	} else {
  		assertEquals("Expect ", "exclusive-breastfeeding-intervention-04", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-nullFlavor");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-nullFlavor]");
  	} else {
  		assertEquals("Expect ", "iso21090-nullFlavor", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PaymentReconciliation");
  	result = paymentreconciliationDao.find("ER2500");
  	if (null == result) {
  		System.out.println("Not found PaymentReconciliation [ER2500]");
  	} else {
  		assertEquals("Expect ", "ER2500", ((PaymentReconciliation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("hla-genotyping-results-method");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [hla-genotyping-results-method]");
  	} else {
  		assertEquals("Expect ", "hla-genotyping-results-method", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp008");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp008]");
  	} else {
  		assertEquals("Expect ", "meddisp008", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("ussg-fht");
  	if (null == result) {
  		System.out.println("Not found Bundle [ussg-fht]");
  	} else {
  		assertEquals("Expect ", "ussg-fht", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Subscription");
  	result = subscriptionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Subscription [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Subscription)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contactentity-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contactentity-type]");
  	} else {
  		assertEquals("Expect ", "contactentity-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Device");
  	result = deviceDao.find("software");
  	if (null == result) {
  		System.out.println("Not found Device [software]");
  	} else {
  		assertEquals("Expect ", "software", ((Device)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contract-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contract-type]");
  	} else {
  		assertEquals("Expect ", "contract-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve TestReport");
  	result = testreportDao.find("testreport-example");
  	if (null == result) {
  		System.out.println("Not found TestReport [testreport-example]");
  	} else {
  		assertEquals("Expect ", "testreport-example", ((TestReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0310");
  	if (null == result) {
  		System.out.println("Not found Medication [med0310]");
  	} else {
  		assertEquals("Expect ", "med0310", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("payeetype");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [payeetype]");
  	} else {
  		assertEquals("Expect ", "payeetype", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-importance");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-importance]");
  	} else {
  		assertEquals("Expect ", "patient-importance", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("RequestGroup");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [RequestGroup]");
  	} else {
  		assertEquals("Expect ", "RequestGroup", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("example-intensional");
  	if (null == result) {
  		System.out.println("Not found ValueSet [example-intensional]");
  	} else {
  		assertEquals("Expect ", "example-intensional", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RequestGroup");
  	result = requestgroupDao.find("kdn5-example");
  	if (null == result) {
  		System.out.println("Not found RequestGroup [kdn5-example]");
  	} else {
  		assertEquals("Expect ", "kdn5-example", ((RequestGroup)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessRequest");
  	result = processrequestDao.find("1110");
  	if (null == result) {
  		System.out.println("Not found ProcessRequest [1110]");
  	} else {
  		assertEquals("Expect ", "1110", ((ProcessRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ExpansionProfile");
  	result = expansionprofileDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ExpansionProfile [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ExpansionProfile)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Provenance");
  	result = provenanceDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Provenance [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Provenance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("KDN5");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [KDN5]");
  	} else {
  		assertEquals("Expect ", "KDN5", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessResponse");
  	result = processresponseDao.find("SR2349");
  	if (null == result) {
  		System.out.println("Not found ProcessResponse [SR2349]");
  	} else {
  		assertEquals("Expect ", "SR2349", ((ProcessResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("procedure-not-performed-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [procedure-not-performed-reason]");
  	} else {
  		assertEquals("Expect ", "procedure-not-performed-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("communication-not-done-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [communication-not-done-reason]");
  	} else {
  		assertEquals("Expect ", "communication-not-done-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("conceptmap-unmapped-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [conceptmap-unmapped-mode]");
  	} else {
  		assertEquals("Expect ", "conceptmap-unmapped-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessResponse");
  	result = processresponseDao.find("SR2499");
  	if (null == result) {
  		System.out.println("Not found ProcessResponse [SR2499]");
  	} else {
  		assertEquals("Expect ", "SR2499", ((ProcessResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CompartmentDefinition");
  	result = compartmentdefinitionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found CompartmentDefinition [example]");
  	} else {
  		assertEquals("Expect ", "example", ((CompartmentDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("operationoutcome-authority");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [operationoutcome-authority]");
  	} else {
  		assertEquals("Expect ", "operationoutcome-authority", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-author");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-author]");
  	} else {
  		assertEquals("Expect ", "valueset-author", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-permitted-value-conceptmap");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-permitted-value-conceptmap]");
  	} else {
  		assertEquals("Expect ", "11179-permitted-value-conceptmap", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("xhtml");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [xhtml]");
  	} else {
  		assertEquals("Expect ", "xhtml", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("group-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [group-type]");
  	} else {
  		assertEquals("Expect ", "group-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsAllelicState");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsAllelicState]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsAllelicState", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ex-payee-resource-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ex-payee-resource-type]");
  	} else {
  		assertEquals("Expect ", "ex-payee-resource-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("minLength");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [minLength]");
  	} else {
  		assertEquals("Expect ", "minLength", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-dispense-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-dispense-status]");
  	} else {
  		assertEquals("Expect ", "medication-dispense-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contract-signer-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contract-signer-type]");
  	} else {
  		assertEquals("Expect ", "contract-signer-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("basic-resource-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [basic-resource-type]");
  	} else {
  		assertEquals("Expect ", "basic-resource-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("coverage-level");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [coverage-level]");
  	} else {
  		assertEquals("Expect ", "coverage-level", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedurerequest-precondition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedurerequest-precondition]");
  	} else {
  		assertEquals("Expect ", "procedurerequest-precondition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0331");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0331]");
  	} else {
  		assertEquals("Expect ", "meddisp0331", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-ordinalValue");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-ordinalValue]");
  	} else {
  		assertEquals("Expect ", "questionnaire-ordinalValue", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("related-artifact-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [related-artifact-type]");
  	} else {
  		assertEquals("Expect ", "related-artifact-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("physical-therapy");
  	if (null == result) {
  		System.out.println("Not found Procedure [physical-therapy]");
  	} else {
  		assertEquals("Expect ", "physical-therapy", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("zika-virus-intervention");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [zika-virus-intervention]");
  	} else {
  		assertEquals("Expect ", "zika-virus-intervention", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("oral-prosthodontic-material");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [oral-prosthodontic-material]");
  	} else {
  		assertEquals("Expect ", "oral-prosthodontic-material", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("event-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [event-status]");
  	} else {
  		assertEquals("Expect ", "event-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("extra-security-role-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [extra-security-role-type]");
  	} else {
  		assertEquals("Expect ", "extra-security-role-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("restful-security-service");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [restful-security-service]");
  	} else {
  		assertEquals("Expect ", "restful-security-service", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("boolean");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [boolean]");
  	} else {
  		assertEquals("Expect ", "boolean", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("property-representation");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [property-representation]");
  	} else {
  		assertEquals("Expect ", "property-representation", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("consent-state-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [consent-state-codes]");
  	} else {
  		assertEquals("Expect ", "consent-state-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contract-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contract-status]");
  	} else {
  		assertEquals("Expect ", "contract-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("issue-severity");
  	if (null == result) {
  		System.out.println("Not found ValueSet [issue-severity]");
  	} else {
  		assertEquals("Expect ", "issue-severity", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-de-submitter-org");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-de-submitter-org]");
  	} else {
  		assertEquals("Expect ", "11179-de-submitter-org", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("supplydelivery-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [supplydelivery-status]");
  	} else {
  		assertEquals("Expect ", "supplydelivery-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("no-immunization-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [no-immunization-reason]");
  	} else {
  		assertEquals("Expect ", "no-immunization-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("type-derivation-rule");
  	if (null == result) {
  		System.out.println("Not found ValueSet [type-derivation-rule]");
  	} else {
  		assertEquals("Expect ", "type-derivation-rule", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ClaimResponse");
  	result = claimresponseDao.find("R3500");
  	if (null == result) {
  		System.out.println("Not found ClaimResponse [R3500]");
  	} else {
  		assertEquals("Expect ", "R3500", ((ClaimResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("vitalsigns");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [vitalsigns]");
  	} else {
  		assertEquals("Expect ", "vitalsigns", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Person");
  	result = personDao.find("pp");
  	if (null == result) {
  		System.out.println("Not found Person [pp]");
  	} else {
  		assertEquals("Expect ", "pp", ((Person)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("EnrollmentRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [EnrollmentRequest]");
  	} else {
  		assertEquals("Expect ", "EnrollmentRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-author");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-author]");
  	} else {
  		assertEquals("Expect ", "codesystem-author", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("slotstatus");
  	if (null == result) {
  		System.out.println("Not found ValueSet [slotstatus]");
  	} else {
  		assertEquals("Expect ", "slotstatus", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0320");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0320]");
  	} else {
  		assertEquals("Expect ", "meddisp0320", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("example-extension");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [example-extension]");
  	} else {
  		assertEquals("Expect ", "example-extension", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("udi");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [udi]");
  	} else {
  		assertEquals("Expect ", "udi", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ex-paymenttype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ex-paymenttype]");
  	} else {
  		assertEquals("Expect ", "ex-paymenttype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("reference-handling-policy");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [reference-handling-policy]");
  	} else {
  		assertEquals("Expect ", "reference-handling-policy", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-admit-source");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-admit-source]");
  	} else {
  		assertEquals("Expect ", "encounter-admit-source", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationStatement");
  	result = medicationstatementDao.find("example002");
  	if (null == result) {
  		System.out.println("Not found MedicationStatement [example002]");
  	} else {
  		assertEquals("Expect ", "example002", ((MedicationStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("coord-1-base");
  	if (null == result) {
  		System.out.println("Not found Sequence [coord-1-base]");
  	} else {
  		assertEquals("Expect ", "coord-1-base", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("care-team-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [care-team-category]");
  	} else {
  		assertEquals("Expect ", "care-team-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("hla-1");
  	if (null == result) {
  		System.out.println("Not found Bundle [hla-1]");
  	} else {
  		assertEquals("Expect ", "hla-1", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("humanname-mothers-family");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [humanname-mothers-family]");
  	} else {
  		assertEquals("Expect ", "humanname-mothers-family", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0328");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0328]");
  	} else {
  		assertEquals("Expect ", "medrx0328", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Device");
  	result = deviceDao.find("example-udi2");
  	if (null == result) {
  		System.out.println("Not found Device [example-udi2]");
  	} else {
  		assertEquals("Expect ", "example-udi2", ((Device)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("digital-media-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [digital-media-type]");
  	} else {
  		assertEquals("Expect ", "digital-media-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("system-version-processing-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [system-version-processing-mode]");
  	} else {
  		assertEquals("Expect ", "system-version-processing-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("administrative-gender");
  	if (null == result) {
  		System.out.println("Not found ValueSet [administrative-gender]");
  	} else {
  		assertEquals("Expect ", "administrative-gender", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("communicationrequest-definition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [communicationrequest-definition]");
  	} else {
  		assertEquals("Expect ", "communicationrequest-definition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("1");
  	if (null == result) {
  		System.out.println("Not found Organization [1]");
  	} else {
  		assertEquals("Expect ", "1", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("bundle-response-simplesummary");
  	if (null == result) {
  		System.out.println("Not found Bundle [bundle-response-simplesummary]");
  	} else {
  		assertEquals("Expect ", "bundle-response-simplesummary", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("eye-color");
  	if (null == result) {
  		System.out.println("Not found Observation [eye-color]");
  	} else {
  		assertEquals("Expect ", "eye-color", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-deliveryModeIdentifier");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-deliveryModeIdentifier]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-deliveryModeIdentifier", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0310");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0310]");
  	} else {
  		assertEquals("Expect ", "medrx0310", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("service-uscls");
  	if (null == result) {
  		System.out.println("Not found ValueSet [service-uscls]");
  	} else {
  		assertEquals("Expect ", "service-uscls", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("device-statement-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [device-statement-status]");
  	} else {
  		assertEquals("Expect ", "device-statement-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Immunization");
  	result = immunizationDao.find("historical");
  	if (null == result) {
  		System.out.println("Not found Immunization [historical]");
  	} else {
  		assertEquals("Expect ", "historical", ((Immunization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationStatement");
  	result = medicationstatementDao.find("example007");
  	if (null == result) {
  		System.out.println("Not found MedicationStatement [example007]");
  	} else {
  		assertEquals("Expect ", "example007", ((MedicationStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("consent-action");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [consent-action]");
  	} else {
  		assertEquals("Expect ", "consent-action", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f202");
  	if (null == result) {
  		System.out.println("Not found Observation [f202]");
  	} else {
  		assertEquals("Expect ", "f202", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("pharmacy-core-minDosePerPeriod");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [pharmacy-core-minDosePerPeriod]");
  	} else {
  		assertEquals("Expect ", "pharmacy-core-minDosePerPeriod", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-request-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-request-category]");
  	} else {
  		assertEquals("Expect ", "medication-request-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("list-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [list-mode]");
  	} else {
  		assertEquals("Expect ", "list-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("kos-title");
  	if (null == result) {
  		System.out.println("Not found ValueSet [kos-title]");
  	} else {
  		assertEquals("Expect ", "kos-title", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("care-plan-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [care-plan-status]");
  	} else {
  		assertEquals("Expect ", "care-plan-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("map-target-list-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [map-target-list-mode]");
  	} else {
  		assertEquals("Expect ", "map-target-list-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Person");
  	result = personDao.find("pd");
  	if (null == result) {
  		System.out.println("Not found Person [pd]");
  	} else {
  		assertEquals("Expect ", "pd", ((Person)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CommunicationRequest");
  	result = communicationrequestDao.find("example");
  	if (null == result) {
  		System.out.println("Not found CommunicationRequest [example]");
  	} else {
  		assertEquals("Expect ", "example", ((CommunicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("identifier-use");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [identifier-use]");
  	} else {
  		assertEquals("Expect ", "identifier-use", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adjudication-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adjudication-reason]");
  	} else {
  		assertEquals("Expect ", "adjudication-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Person");
  	result = personDao.find("f002");
  	if (null == result) {
  		System.out.println("Not found Person [f002]");
  	} else {
  		assertEquals("Expect ", "f002", ((Person)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("document-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [document-mode]");
  	} else {
  		assertEquals("Expect ", "document-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("760150");
  	if (null == result) {
  		System.out.println("Not found Claim [760150]");
  	} else {
  		assertEquals("Expect ", "760150", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("performer-role");
  	if (null == result) {
  		System.out.println("Not found ValueSet [performer-role]");
  	} else {
  		assertEquals("Expect ", "performer-role", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("og-example1");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [og-example1]");
  	} else {
  		assertEquals("Expect ", "og-example1", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-status]");
  	} else {
  		assertEquals("Expect ", "medication-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-workflowStatus");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-workflowStatus]");
  	} else {
  		assertEquals("Expect ", "codesystem-workflowStatus", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Library");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Library]");
  	} else {
  		assertEquals("Expect ", "Library", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Provenance");
  	result = provenanceDao.find("signature");
  	if (null == result) {
  		System.out.println("Not found Provenance [signature]");
  	} else {
  		assertEquals("Expect ", "signature", ((Provenance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-usage");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-usage]");
  	} else {
  		assertEquals("Expect ", "valueset-usage", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("ex-onsettype");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [ex-onsettype]");
  	} else {
  		assertEquals("Expect ", "ex-onsettype", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("modified-foodtype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [modified-foodtype]");
  	} else {
  		assertEquals("Expect ", "modified-foodtype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example-genetics-4");
  	if (null == result) {
  		System.out.println("Not found Observation [example-genetics-4]");
  	} else {
  		assertEquals("Expect ", "example-genetics-4", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureMap");
  	result = structuremapDao.find("example");
  	if (null == result) {
  		System.out.println("Not found StructureMap [example]");
  	} else {
  		assertEquals("Expect ", "example", ((StructureMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("composition-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [composition-status]");
  	} else {
  		assertEquals("Expect ", "composition-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("condition-dueTo");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [condition-dueTo]");
  	} else {
  		assertEquals("Expect ", "condition-dueTo", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("consent-data-meaning");
  	if (null == result) {
  		System.out.println("Not found ValueSet [consent-data-meaning]");
  	} else {
  		assertEquals("Expect ", "consent-data-meaning", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("action-precheck-behavior");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [action-precheck-behavior]");
  	} else {
  		assertEquals("Expect ", "action-precheck-behavior", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("benefit-unit");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [benefit-unit]");
  	} else {
  		assertEquals("Expect ", "benefit-unit", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("renaldiet");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [renaldiet]");
  	} else {
  		assertEquals("Expect ", "renaldiet", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("link-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [link-type]");
  	} else {
  		assertEquals("Expect ", "link-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ActivityDefinition");
  	result = activitydefinitionDao.find("referralPrimaryCareMentalHealth");
  	if (null == result) {
  		System.out.println("Not found ActivityDefinition [referralPrimaryCareMentalHealth]");
  	} else {
  		assertEquals("Expect ", "referralPrimaryCareMentalHealth", ((ActivityDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("dataelement-stringency");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [dataelement-stringency]");
  	} else {
  		assertEquals("Expect ", "dataelement-stringency", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("claim-modifiers");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [claim-modifiers]");
  	} else {
  		assertEquals("Expect ", "claim-modifiers", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("consent-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [consent-category]");
  	} else {
  		assertEquals("Expect ", "consent-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessRequest");
  	result = processrequestDao.find("1115");
  	if (null == result) {
  		System.out.println("Not found ProcessRequest [1115]");
  	} else {
  		assertEquals("Expect ", "1115", ((ProcessRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("name-assembly-order");
  	if (null == result) {
  		System.out.println("Not found ValueSet [name-assembly-order]");
  	} else {
  		assertEquals("Expect ", "name-assembly-order", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DocumentManifest");
  	result = documentmanifestDao.find("654789");
  	if (null == result) {
  		System.out.println("Not found DocumentManifest [654789]");
  	} else {
  		assertEquals("Expect ", "654789", ((DocumentManifest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adjudication-error");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adjudication-error]");
  	} else {
  		assertEquals("Expect ", "adjudication-error", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("template-status-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [template-status-code]");
  	} else {
  		assertEquals("Expect ", "template-status-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ValueSet");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ValueSet]");
  	} else {
  		assertEquals("Expect ", "ValueSet", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Linkage");
  	result = linkageDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Linkage [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Linkage)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("b0a5e4277-83c4-4adb-87e2-e3efe3369b6f");
  	if (null == result) {
  		System.out.println("Not found Bundle [b0a5e4277-83c4-4adb-87e2-e3efe3369b6f]");
  	} else {
  		assertEquals("Expect ", "b0a5e4277-83c4-4adb-87e2-e3efe3369b6f", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("payment-adjustment-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [payment-adjustment-reason]");
  	} else {
  		assertEquals("Expect ", "payment-adjustment-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("entryFormat");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [entryFormat]");
  	} else {
  		assertEquals("Expect ", "entryFormat", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-map");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-map]");
  	} else {
  		assertEquals("Expect ", "valueset-map", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("valuesets");
  	if (null == result) {
  		System.out.println("Not found Bundle [valuesets]");
  	} else {
  		assertEquals("Expect ", "valuesets", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("hl7-work-group");
  	if (null == result) {
  		System.out.println("Not found ValueSet [hl7-work-group]");
  	} else {
  		assertEquals("Expect ", "hl7-work-group", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-additionalLocator");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-additionalLocator]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-additionalLocator", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("location-extensions-Location-alias");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [location-extensions-Location-alias]");
  	} else {
  		assertEquals("Expect ", "location-extensions-Location-alias", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("map-group-type-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [map-group-type-mode]");
  	} else {
  		assertEquals("Expect ", "map-group-type-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DetectedIssue");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DetectedIssue]");
  	} else {
  		assertEquals("Expect ", "DetectedIssue", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("100156");
  	if (null == result) {
  		System.out.println("Not found Claim [100156]");
  	} else {
  		assertEquals("Expect ", "100156", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("chargeitem-billingcodes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [chargeitem-billingcodes]");
  	} else {
  		assertEquals("Expect ", "chargeitem-billingcodes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("goal-acceptance");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [goal-acceptance]");
  	} else {
  		assertEquals("Expect ", "goal-acceptance", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("namingsystem-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [namingsystem-type]");
  	} else {
  		assertEquals("Expect ", "namingsystem-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contact-point-use");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contact-point-use]");
  	} else {
  		assertEquals("Expect ", "contact-point-use", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Account");
  	result = accountDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Account [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Account)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("composition-example");
  	if (null == result) {
  		System.out.println("Not found Library [composition-example]");
  	} else {
  		assertEquals("Expect ", "composition-example", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("specimen-processingTime");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [specimen-processingTime]");
  	} else {
  		assertEquals("Expect ", "specimen-processingTime", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("diagnostic-service-sections");
  	if (null == result) {
  		System.out.println("Not found ValueSet [diagnostic-service-sections]");
  	} else {
  		assertEquals("Expect ", "diagnostic-service-sections", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0321");
  	if (null == result) {
  		System.out.println("Not found Medication [med0321]");
  	} else {
  		assertEquals("Expect ", "med0321", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ImagingManifest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ImagingManifest]");
  	} else {
  		assertEquals("Expect ", "ImagingManifest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("discriminator-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [discriminator-type]");
  	} else {
  		assertEquals("Expect ", "discriminator-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("fm-itemtype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [fm-itemtype]");
  	} else {
  		assertEquals("Expect ", "fm-itemtype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-summary");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-summary]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-summary", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MessageHeader");
  	result = messageheaderDao.find("1cbdfb97-5859-48a4-8301-d54eab818d68");
  	if (null == result) {
  		System.out.println("Not found MessageHeader [1cbdfb97-5859-48a4-8301-d54eab818d68]");
  	} else {
  		assertEquals("Expect ", "1cbdfb97-5859-48a4-8301-d54eab818d68", ((MessageHeader)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("media-view");
  	if (null == result) {
  		System.out.println("Not found ValueSet [media-view]");
  	} else {
  		assertEquals("Expect ", "media-view", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("maxDecimalPlaces");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [maxDecimalPlaces]");
  	} else {
  		assertEquals("Expect ", "maxDecimalPlaces", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("openEHR-location");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [openEHR-location]");
  	} else {
  		assertEquals("Expect ", "openEHR-location", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("library-exclusive-breastfeeding-cds-logic");
  	if (null == result) {
  		System.out.println("Not found Library [library-exclusive-breastfeeding-cds-logic]");
  	} else {
  		assertEquals("Expect ", "library-exclusive-breastfeeding-cds-logic", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("implant-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [implant-status]");
  	} else {
  		assertEquals("Expect ", "implant-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("messageheader-response-request");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [messageheader-response-request]");
  	} else {
  		assertEquals("Expect ", "messageheader-response-request", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("codesystem-content-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [codesystem-content-mode]");
  	} else {
  		assertEquals("Expect ", "codesystem-content-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RelatedPerson");
  	result = relatedpersonDao.find("f002");
  	if (null == result) {
  		System.out.println("Not found RelatedPerson [f002]");
  	} else {
  		assertEquals("Expect ", "f002", ((RelatedPerson)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("appointmentstatus");
  	if (null == result) {
  		System.out.println("Not found ValueSet [appointmentstatus]");
  	} else {
  		assertEquals("Expect ", "appointmentstatus", ((ValueSet)result).getId());
  	}
  	System.out.println("Total tests .. " + count);
  }
  @Test
  public void test2170() throws Exception {
  	Object local = null;
  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("udi-entry-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [udi-entry-type]");
  	} else {
  		assertEquals("Expect ", "udi-entry-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("provider-qualification");
  	if (null == result) {
  		System.out.println("Not found ValueSet [provider-qualification]");
  	} else {
  		assertEquals("Expect ", "provider-qualification", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Substance");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Substance]");
  	} else {
  		assertEquals("Expect ", "Substance", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-participant-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-participant-type]");
  	} else {
  		assertEquals("Expect ", "encounter-participant-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-comment");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-comment]");
  	} else {
  		assertEquals("Expect ", "valueset-comment", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("practitioner-specialty");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [practitioner-specialty]");
  	} else {
  		assertEquals("Expect ", "practitioner-specialty", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("organization-period");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [organization-period]");
  	} else {
  		assertEquals("Expect ", "organization-period", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("practitioner-specialty");
  	if (null == result) {
  		System.out.println("Not found ValueSet [practitioner-specialty]");
  	} else {
  		assertEquals("Expect ", "practitioner-specialty", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0309");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0309]");
  	} else {
  		assertEquals("Expect ", "meddisp0309", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("document-relationship-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [document-relationship-type]");
  	} else {
  		assertEquals("Expect ", "document-relationship-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsAminoAcidChangeName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsAminoAcidChangeName]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsAminoAcidChangeName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-as-needed-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-as-needed-reason]");
  	} else {
  		assertEquals("Expect ", "medication-as-needed-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("observation-valueabsentreason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [observation-valueabsentreason]");
  	} else {
  		assertEquals("Expect ", "observation-valueabsentreason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0307");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0307]");
  	} else {
  		assertEquals("Expect ", "medadmin0307", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("audit-source-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [audit-source-type]");
  	} else {
  		assertEquals("Expect ", "audit-source-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("StructureMap");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [StructureMap]");
  	} else {
  		assertEquals("Expect ", "StructureMap", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("vision-product");
  	if (null == result) {
  		System.out.println("Not found ValueSet [vision-product]");
  	} else {
  		assertEquals("Expect ", "vision-product", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("dicom-dcim");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [dicom-dcim]");
  	} else {
  		assertEquals("Expect ", "dicom-dcim", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("ldlcholesterol-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [ldlcholesterol-codes]");
  	} else {
  		assertEquals("Expect ", "ldlcholesterol-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("devicemetric-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [devicemetric-type]");
  	} else {
  		assertEquals("Expect ", "devicemetric-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("care-plan-activity-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [care-plan-activity-status]");
  	} else {
  		assertEquals("Expect ", "care-plan-activity-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("datadictionary");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [datadictionary]");
  	} else {
  		assertEquals("Expect ", "datadictionary", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve RelatedPerson");
  	result = relatedpersonDao.find("peter");
  	if (null == result) {
  		System.out.println("Not found RelatedPerson [peter]");
  	} else {
  		assertEquals("Expect ", "peter", ((RelatedPerson)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("QuestionnaireResponse");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [QuestionnaireResponse]");
  	} else {
  		assertEquals("Expect ", "QuestionnaireResponse", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Location");
  	result = locationDao.find("amb");
  	if (null == result) {
  		System.out.println("Not found Location [amb]");
  	} else {
  		assertEquals("Expect ", "amb", ((Location)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("TestReport");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [TestReport]");
  	} else {
  		assertEquals("Expect ", "TestReport", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-composition-status-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-composition-status-v3]");
  	} else {
  		assertEquals("Expect ", "cm-composition-status-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("restful-interaction");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [restful-interaction]");
  	} else {
  		assertEquals("Expect ", "restful-interaction", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("valueset-extensions-ValueSet-author");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [valueset-extensions-ValueSet-author]");
  	} else {
  		assertEquals("Expect ", "valueset-extensions-ValueSet-author", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-itemControl");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-itemControl]");
  	} else {
  		assertEquals("Expect ", "questionnaire-itemControl", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Media");
  	result = mediaDao.find("xray");
  	if (null == result) {
  		System.out.println("Not found Media [xray]");
  	} else {
  		assertEquals("Expect ", "xray", ((Media)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("patient-extensions-Patient-birthOrderBoolean");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [patient-extensions-Patient-birthOrderBoolean]");
  	} else {
  		assertEquals("Expect ", "patient-extensions-Patient-birthOrderBoolean", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Location");
  	result = locationDao.find("hl7");
  	if (null == result) {
  		System.out.println("Not found Location [hl7]");
  	} else {
  		assertEquals("Expect ", "hl7", ((Location)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("task-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [task-status]");
  	} else {
  		assertEquals("Expect ", "task-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("practitionerrole-primaryInd");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [practitionerrole-primaryInd]");
  	} else {
  		assertEquals("Expect ", "practitionerrole-primaryInd", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("goal-status-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [goal-status-reason]");
  	} else {
  		assertEquals("Expect ", "goal-status-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("variant-state");
  	if (null == result) {
  		System.out.println("Not found ValueSet [variant-state]");
  	} else {
  		assertEquals("Expect ", "variant-state", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("example-TPMT-one");
  	if (null == result) {
  		System.out.println("Not found Sequence [example-TPMT-one]");
  	} else {
  		assertEquals("Expect ", "example-TPMT-one", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("data-absent-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [data-absent-reason]");
  	} else {
  		assertEquals("Expect ", "data-absent-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-lookupQuestionnaire");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-lookupQuestionnaire]");
  	} else {
  		assertEquals("Expect ", "questionnaire-lookupQuestionnaire", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("practitioner-classification");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [practitioner-classification]");
  	} else {
  		assertEquals("Expect ", "practitioner-classification", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("referral-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [referral-type]");
  	} else {
  		assertEquals("Expect ", "referral-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("questionnaire-item-control");
  	if (null == result) {
  		System.out.println("Not found ValueSet [questionnaire-item-control]");
  	} else {
  		assertEquals("Expect ", "questionnaire-item-control", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("pat4");
  	if (null == result) {
  		System.out.println("Not found Patient [pat4]");
  	} else {
  		assertEquals("Expect ", "pat4", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("body-site-instance");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [body-site-instance]");
  	} else {
  		assertEquals("Expect ", "body-site-instance", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("animal-genderstatus");
  	if (null == result) {
  		System.out.println("Not found ValueSet [animal-genderstatus]");
  	} else {
  		assertEquals("Expect ", "animal-genderstatus", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("choice-list-orientation");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [choice-list-orientation]");
  	} else {
  		assertEquals("Expect ", "choice-list-orientation", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0334");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0334]");
  	} else {
  		assertEquals("Expect ", "medrx0334", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("link-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [link-type]");
  	} else {
  		assertEquals("Expect ", "link-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-allowedProfile");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-allowedProfile]");
  	} else {
  		assertEquals("Expect ", "questionnaire-allowedProfile", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("body-temperature");
  	if (null == result) {
  		System.out.println("Not found Observation [body-temperature]");
  	} else {
  		assertEquals("Expect ", "body-temperature", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("allergy-verification-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [allergy-verification-status]");
  	} else {
  		assertEquals("Expect ", "allergy-verification-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adverse-event-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adverse-event-category]");
  	} else {
  		assertEquals("Expect ", "adverse-event-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0315");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0315]");
  	} else {
  		assertEquals("Expect ", "medrx0315", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MeasureReport");
  	result = measurereportDao.find("measurereport-cms146-cat3-example");
  	if (null == result) {
  		System.out.println("Not found MeasureReport [measurereport-cms146-cat3-example]");
  	} else {
  		assertEquals("Expect ", "measurereport-cms146-cat3-example", ((MeasureReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("report-result-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [report-result-codes]");
  	} else {
  		assertEquals("Expect ", "report-result-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-unitID");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-unitID]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-unitID", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("claim-informationcategory");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [claim-informationcategory]");
  	} else {
  		assertEquals("Expect ", "claim-informationcategory", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("missing-tooth-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [missing-tooth-reason]");
  	} else {
  		assertEquals("Expect ", "missing-tooth-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("auditevent-Instance");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [auditevent-Instance]");
  	} else {
  		assertEquals("Expect ", "auditevent-Instance", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("icd-10-procedures");
  	if (null == result) {
  		System.out.println("Not found ValueSet [icd-10-procedures]");
  	} else {
  		assertEquals("Expect ", "icd-10-procedures", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Encounter");
  	result = encounterDao.find("f203");
  	if (null == result) {
  		System.out.println("Not found Encounter [f203]");
  	} else {
  		assertEquals("Expect ", "f203", ((Encounter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("clinical-impression-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [clinical-impression-status]");
  	} else {
  		assertEquals("Expect ", "clinical-impression-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("participantrequired");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [participantrequired]");
  	} else {
  		assertEquals("Expect ", "participantrequired", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("object-role");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [object-role]");
  	} else {
  		assertEquals("Expect ", "object-role", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("data-absent-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [data-absent-reason]");
  	} else {
  		assertEquals("Expect ", "data-absent-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-isCommonBinding");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-isCommonBinding]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-isCommonBinding", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("message-reason-encounter");
  	if (null == result) {
  		System.out.println("Not found ValueSet [message-reason-encounter]");
  	} else {
  		assertEquals("Expect ", "message-reason-encounter", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("participant-role");
  	if (null == result) {
  		System.out.println("Not found ValueSet [participant-role]");
  	} else {
  		assertEquals("Expect ", "participant-role", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("defined-types");
  	if (null == result) {
  		System.out.println("Not found ValueSet [defined-types]");
  	} else {
  		assertEquals("Expect ", "defined-types", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f005");
  	if (null == result) {
  		System.out.println("Not found Observation [f005]");
  	} else {
  		assertEquals("Expect ", "f005", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("diabeticsupplement");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [diabeticsupplement]");
  	} else {
  		assertEquals("Expect ", "diabeticsupplement", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-request-priority");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-request-priority]");
  	} else {
  		assertEquals("Expect ", "medication-request-priority", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("codesystem-extensions-CodeSystem-end");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [codesystem-extensions-CodeSystem-end]");
  	} else {
  		assertEquals("Expect ", "codesystem-extensions-CodeSystem-end", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("practitioner-role");
  	if (null == result) {
  		System.out.println("Not found ValueSet [practitioner-role]");
  	} else {
  		assertEquals("Expect ", "practitioner-role", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("family-member-history-genetics-sibling");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [family-member-history-genetics-sibling]");
  	} else {
  		assertEquals("Expect ", "family-member-history-genetics-sibling", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("action-relationship-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [action-relationship-type]");
  	} else {
  		assertEquals("Expect ", "action-relationship-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("list-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [list-mode]");
  	} else {
  		assertEquals("Expect ", "list-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CapabilityStatement");
  	result = capabilitystatementDao.find("example");
  	if (null == result) {
  		System.out.println("Not found CapabilityStatement [example]");
  	} else {
  		assertEquals("Expect ", "example", ((CapabilityStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0321");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0321]");
  	} else {
  		assertEquals("Expect ", "medrx0321", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("care-plan-activity");
  	if (null == result) {
  		System.out.println("Not found ValueSet [care-plan-activity]");
  	} else {
  		assertEquals("Expect ", "care-plan-activity", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("research-subject-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [research-subject-status]");
  	} else {
  		assertEquals("Expect ", "research-subject-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-identifier");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-identifier]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-identifier", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Measure-evaluate-measure");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Measure-evaluate-measure]");
  	} else {
  		assertEquals("Expect ", "Measure-evaluate-measure", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("consistency-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [consistency-type]");
  	} else {
  		assertEquals("Expect ", "consistency-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("adverse-event-seriousness");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [adverse-event-seriousness]");
  	} else {
  		assertEquals("Expect ", "adverse-event-seriousness", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FHIRList");
  	result = fhirlistDao.find("example-empty");
  	if (null == result) {
  		System.out.println("Not found FHIRList [example-empty]");
  	} else {
  		assertEquals("Expect ", "example-empty", ((FHIRList)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Media");
  	result = mediaDao.find("sound");
  	if (null == result) {
  		System.out.println("Not found Media [sound]");
  	} else {
  		assertEquals("Expect ", "sound", ((Media)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("enteral-route");
  	if (null == result) {
  		System.out.println("Not found ValueSet [enteral-route]");
  	} else {
  		assertEquals("Expect ", "enteral-route", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-congregation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-congregation]");
  	} else {
  		assertEquals("Expect ", "patient-congregation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("family-history");
  	if (null == result) {
  		System.out.println("Not found Condition [family-history]");
  	} else {
  		assertEquals("Expect ", "family-history", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0305");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0305]");
  	} else {
  		assertEquals("Expect ", "medadmin0305", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("address-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [address-type]");
  	} else {
  		assertEquals("Expect ", "address-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("request-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [request-status]");
  	} else {
  		assertEquals("Expect ", "request-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("concept-bidirectional");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [concept-bidirectional]");
  	} else {
  		assertEquals("Expect ", "concept-bidirectional", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Appointment");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Appointment]");
  	} else {
  		assertEquals("Expect ", "Appointment", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Resource-validate");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Resource-validate]");
  	} else {
  		assertEquals("Expect ", "Resource-validate", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("concept-property-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [concept-property-type]");
  	} else {
  		assertEquals("Expect ", "concept-property-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("goal-acceptance-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [goal-acceptance-status]");
  	} else {
  		assertEquals("Expect ", "goal-acceptance-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Media");
  	result = mediaDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Media [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Media)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Encounter");
  	result = encounterDao.find("home");
  	if (null == result) {
  		System.out.println("Not found Encounter [home]");
  	} else {
  		assertEquals("Expect ", "home", ((Encounter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contract-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contract-type]");
  	} else {
  		assertEquals("Expect ", "contract-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsSequence");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsSequence]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsSequence", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Definition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Definition]");
  	} else {
  		assertEquals("Expect ", "Definition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("allergyintolerance-reasonRefuted");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [allergyintolerance-reasonRefuted]");
  	} else {
  		assertEquals("Expect ", "allergyintolerance-reasonRefuted", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("EligibilityRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [EligibilityRequest]");
  	} else {
  		assertEquals("Expect ", "EligibilityRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-reference");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-reference]");
  	} else {
  		assertEquals("Expect ", "valueset-reference", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("familymemberhistory-abatement");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [familymemberhistory-abatement]");
  	} else {
  		assertEquals("Expect ", "familymemberhistory-abatement", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("ft4");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [ft4]");
  	} else {
  		assertEquals("Expect ", "ft4", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("glossy");
  	if (null == result) {
  		System.out.println("Not found Patient [glossy]");
  	} else {
  		assertEquals("Expect ", "glossy", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("special-values");
  	if (null == result) {
  		System.out.println("Not found ValueSet [special-values]");
  	} else {
  		assertEquals("Expect ", "special-values", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("usagecontext-group");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [usagecontext-group]");
  	} else {
  		assertEquals("Expect ", "usagecontext-group", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("example-extensional");
  	if (null == result) {
  		System.out.println("Not found ValueSet [example-extensional]");
  	} else {
  		assertEquals("Expect ", "example-extensional", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve EligibilityRequest");
  	result = eligibilityrequestDao.find("52345");
  	if (null == result) {
  		System.out.println("Not found EligibilityRequest [52345]");
  	} else {
  		assertEquals("Expect ", "52345", ((EligibilityRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("copy-number-event");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [copy-number-event]");
  	} else {
  		assertEquals("Expect ", "copy-number-event", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("PlanDefinition-apply");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [PlanDefinition-apply]");
  	} else {
  		assertEquals("Expect ", "PlanDefinition-apply", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Contract");
  	result = contractDao.find("pcd-example-notThis");
  	if (null == result) {
  		System.out.println("Not found Contract [pcd-example-notThis]");
  	} else {
  		assertEquals("Expect ", "pcd-example-notThis", ((Contract)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("coverage-level");
  	if (null == result) {
  		System.out.println("Not found ValueSet [coverage-level]");
  	} else {
  		assertEquals("Expect ", "coverage-level", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Age");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Age]");
  	} else {
  		assertEquals("Expect ", "Age", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("capabilitystatement-websocket");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [capabilitystatement-websocket]");
  	} else {
  		assertEquals("Expect ", "capabilitystatement-websocket", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("specimen-collectionPriority");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [specimen-collectionPriority]");
  	} else {
  		assertEquals("Expect ", "specimen-collectionPriority", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve VisionPrescription");
  	result = visionprescriptionDao.find("33124");
  	if (null == result) {
  		System.out.println("Not found VisionPrescription [33124]");
  	} else {
  		assertEquals("Expect ", "33124", ((VisionPrescription)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("claim-use");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [claim-use]");
  	} else {
  		assertEquals("Expect ", "claim-use", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("map-target-list-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [map-target-list-mode]");
  	} else {
  		assertEquals("Expect ", "map-target-list-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ExplanationOfBenefit");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ExplanationOfBenefit]");
  	} else {
  		assertEquals("Expect ", "ExplanationOfBenefit", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Medication");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Medication]");
  	} else {
  		assertEquals("Expect ", "Medication", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("operation-outcome");
  	if (null == result) {
  		System.out.println("Not found ValueSet [operation-outcome]");
  	} else {
  		assertEquals("Expect ", "operation-outcome", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("research-study-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [research-study-status]");
  	} else {
  		assertEquals("Expect ", "research-study-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("diagnostic-report-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [diagnostic-report-status]");
  	} else {
  		assertEquals("Expect ", "diagnostic-report-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("account-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [account-status]");
  	} else {
  		assertEquals("Expect ", "account-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("HealthcareService");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [HealthcareService]");
  	} else {
  		assertEquals("Expect ", "HealthcareService", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-regex");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-regex]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-regex", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Condition [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-xml-type");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-xml-type]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-xml-type", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0302");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0302]");
  	} else {
  		assertEquals("Expect ", "meddisp0302", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FHIRList");
  	result = fhirlistDao.find("example-double-cousin-relationship");
  	if (null == result) {
  		System.out.println("Not found FHIRList [example-double-cousin-relationship]");
  	} else {
  		assertEquals("Expect ", "example-double-cousin-relationship", ((FHIRList)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("explanationofbenefit-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [explanationofbenefit-status]");
  	} else {
  		assertEquals("Expect ", "explanationofbenefit-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-preferred");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-preferred]");
  	} else {
  		assertEquals("Expect ", "iso21090-preferred", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("auditevent-Accession");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [auditevent-Accession]");
  	} else {
  		assertEquals("Expect ", "auditevent-Accession", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("account-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [account-type]");
  	} else {
  		assertEquals("Expect ", "account-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-question");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-question]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-question", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DeviceRequest");
  	result = devicerequestDao.find("example");
  	if (null == result) {
  		System.out.println("Not found DeviceRequest [example]");
  	} else {
  		assertEquals("Expect ", "example", ((DeviceRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("codesystem-extensions-CodeSystem-workflow");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [codesystem-extensions-CodeSystem-workflow]");
  	} else {
  		assertEquals("Expect ", "codesystem-extensions-CodeSystem-workflow", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Provenance");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Provenance]");
  	} else {
  		assertEquals("Expect ", "Provenance", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("vaccination-protocol-dose-target");
  	if (null == result) {
  		System.out.println("Not found ValueSet [vaccination-protocol-dose-target]");
  	} else {
  		assertEquals("Expect ", "vaccination-protocol-dose-target", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-streetAddressLine");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-streetAddressLine]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-streetAddressLine", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("event-reasonReference");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [event-reasonReference]");
  	} else {
  		assertEquals("Expect ", "event-reasonReference", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CompartmentDefinition");
  	result = compartmentdefinitionDao.find("relatedPerson");
  	if (null == result) {
  		System.out.println("Not found CompartmentDefinition [relatedPerson]");
  	} else {
  		assertEquals("Expect ", "relatedPerson", ((CompartmentDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("benchpress");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [benchpress]");
  	} else {
  		assertEquals("Expect ", "benchpress", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Patient-match");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Patient-match]");
  	} else {
  		assertEquals("Expect ", "Patient-match", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-Emergency");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-Emergency]");
  	} else {
  		assertEquals("Expect ", "consent-example-Emergency", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NamingSystem");
  	result = namingsystemDao.find("example");
  	if (null == result) {
  		System.out.println("Not found NamingSystem [example]");
  	} else {
  		assertEquals("Expect ", "example", ((NamingSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("action-grouping-behavior");
  	if (null == result) {
  		System.out.println("Not found ValueSet [action-grouping-behavior]");
  	} else {
  		assertEquals("Expect ", "action-grouping-behavior", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("map-model-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [map-model-mode]");
  	} else {
  		assertEquals("Expect ", "map-model-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Subscription");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Subscription]");
  	} else {
  		assertEquals("Expect ", "Subscription", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("digital-media-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [digital-media-type]");
  	} else {
  		assertEquals("Expect ", "digital-media-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("procedurerequest-questionnaireRequest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [procedurerequest-questionnaireRequest]");
  	} else {
  		assertEquals("Expect ", "procedurerequest-questionnaireRequest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Task");
  	result = taskDao.find("example1");
  	if (null == result) {
  		System.out.println("Not found Task [example1]");
  	} else {
  		assertEquals("Expect ", "example1", ((Task)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ServiceDefinition");
  	result = servicedefinitionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found ServiceDefinition [example]");
  	} else {
  		assertEquals("Expect ", "example", ((ServiceDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0308");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0308]");
  	} else {
  		assertEquals("Expect ", "medadmin0308", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Measure-data-requirements");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Measure-data-requirements]");
  	} else {
  		assertEquals("Expect ", "Measure-data-requirements", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("fm-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [fm-status]");
  	} else {
  		assertEquals("Expect ", "fm-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("supplyrequest-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [supplyrequest-reason]");
  	} else {
  		assertEquals("Expect ", "supplyrequest-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("family-member-history-genetics-observation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [family-member-history-genetics-observation]");
  	} else {
  		assertEquals("Expect ", "family-member-history-genetics-observation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("observation-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [observation-category]");
  	} else {
  		assertEquals("Expect ", "observation-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-code]");
  	} else {
  		assertEquals("Expect ", "condition-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("procedure-reason");
  	if (null == result) {
  		System.out.println("Not found ValueSet [procedure-reason]");
  	} else {
  		assertEquals("Expect ", "procedure-reason", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-fmm-no-warnings");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-fmm-no-warnings]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-fmm-no-warnings", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("ex-payee-resource-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [ex-payee-resource-type]");
  	} else {
  		assertEquals("Expect ", "ex-payee-resource-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("observation-relationshiptypes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [observation-relationshiptypes]");
  	} else {
  		assertEquals("Expect ", "observation-relationshiptypes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("diagnosticReport-replaces");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [diagnosticReport-replaces]");
  	} else {
  		assertEquals("Expect ", "diagnosticReport-replaces", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0305");
  	if (null == result) {
  		System.out.println("Not found Medication [med0305]");
  	} else {
  		assertEquals("Expect ", "med0305", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("service-place");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [service-place]");
  	} else {
  		assertEquals("Expect ", "service-place", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-json-type");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-json-type]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-json-type", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("specimen-specialHandling");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [specimen-specialHandling]");
  	} else {
  		assertEquals("Expect ", "specimen-specialHandling", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Annotation");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Annotation]");
  	} else {
  		assertEquals("Expect ", "Annotation", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-streetName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-streetName]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-streetName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("bundle-response-medsallergies");
  	if (null == result) {
  		System.out.println("Not found Bundle [bundle-response-medsallergies]");
  	} else {
  		assertEquals("Expect ", "bundle-response-medsallergies", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("humanname-partner-name");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [humanname-partner-name]");
  	} else {
  		assertEquals("Expect ", "humanname-partner-name", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f005");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f005]");
  	} else {
  		assertEquals("Expect ", "f005", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-address-use-v2");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-address-use-v2]");
  	} else {
  		assertEquals("Expect ", "cm-address-use-v2", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("task-candidateList");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [task-candidateList]");
  	} else {
  		assertEquals("Expect ", "task-candidateList", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("questionnaire-questions");
  	if (null == result) {
  		System.out.println("Not found ValueSet [questionnaire-questions]");
  	} else {
  		assertEquals("Expect ", "questionnaire-questions", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("substance-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [substance-category]");
  	} else {
  		assertEquals("Expect ", "substance-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("care-plan-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [care-plan-category]");
  	} else {
  		assertEquals("Expect ", "care-plan-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Dosage");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Dosage]");
  	} else {
  		assertEquals("Expect ", "Dosage", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("tooth");
  	if (null == result) {
  		System.out.println("Not found ValueSet [tooth]");
  	} else {
  		assertEquals("Expect ", "tooth", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("message-transport");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [message-transport]");
  	} else {
  		assertEquals("Expect ", "message-transport", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("entformula-additive");
  	if (null == result) {
  		System.out.println("Not found ValueSet [entformula-additive]");
  	} else {
  		assertEquals("Expect ", "entformula-additive", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("condition-ruledOut");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [condition-ruledOut]");
  	} else {
  		assertEquals("Expect ", "condition-ruledOut", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("hla-genotyping-results-allele-database");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [hla-genotyping-results-allele-database]");
  	} else {
  		assertEquals("Expect ", "hla-genotyping-results-allele-database", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ActivityDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ActivityDefinition]");
  	} else {
  		assertEquals("Expect ", "ActivityDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-package-form");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-package-form]");
  	} else {
  		assertEquals("Expect ", "medication-package-form", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("immunization-route");
  	if (null == result) {
  		System.out.println("Not found ValueSet [immunization-route]");
  	} else {
  		assertEquals("Expect ", "immunization-route", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("units-of-time");
  	if (null == result) {
  		System.out.println("Not found ValueSet [units-of-time]");
  	} else {
  		assertEquals("Expect ", "units-of-time", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("question-max-occurs");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [question-max-occurs]");
  	} else {
  		assertEquals("Expect ", "question-max-occurs", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-uncertaintyType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-uncertaintyType]");
  	} else {
  		assertEquals("Expect ", "iso21090-uncertaintyType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-observation-relationshiptypes-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-observation-relationshiptypes-v3]");
  	} else {
  		assertEquals("Expect ", "cm-observation-relationshiptypes-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("http-verb");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [http-verb]");
  	} else {
  		assertEquals("Expect ", "http-verb", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Measure");
  	result = measureDao.find("measure-predecessor-example");
  	if (null == result) {
  		System.out.println("Not found Measure [measure-predecessor-example]");
  	} else {
  		assertEquals("Expect ", "measure-predecessor-example", ((Measure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("referencerange-appliesto");
  	if (null == result) {
  		System.out.println("Not found ValueSet [referencerange-appliesto]");
  	} else {
  		assertEquals("Expect ", "referencerange-appliesto", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("bundle-request-simplesummary");
  	if (null == result) {
  		System.out.println("Not found Bundle [bundle-request-simplesummary]");
  	} else {
  		assertEquals("Expect ", "bundle-request-simplesummary", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DeviceUseStatement");
  	result = deviceusestatementDao.find("example");
  	if (null == result) {
  		System.out.println("Not found DeviceUseStatement [example]");
  	} else {
  		assertEquals("Expect ", "example", ((DeviceUseStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SupplyDelivery");
  	result = supplydeliveryDao.find("simpledelivery");
  	if (null == result) {
  		System.out.println("Not found SupplyDelivery [simpledelivery]");
  	} else {
  		assertEquals("Expect ", "simpledelivery", ((SupplyDelivery)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("quality-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [quality-type]");
  	} else {
  		assertEquals("Expect ", "quality-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("f003");
  	if (null == result) {
  		System.out.println("Not found CarePlan [f003]");
  	} else {
  		assertEquals("Expect ", "f003", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MessageDefinition");
  	result = messagedefinitionDao.find("example");
  	if (null == result) {
  		System.out.println("Not found MessageDefinition [example]");
  	} else {
  		assertEquals("Expect ", "example", ((MessageDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-streetNameType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-streetNameType]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-streetNameType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("specimen-container-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [specimen-container-type]");
  	} else {
  		assertEquals("Expect ", "specimen-container-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("maxValue");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [maxValue]");
  	} else {
  		assertEquals("Expect ", "maxValue", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessRequest");
  	result = processrequestDao.find("1111");
  	if (null == result) {
  		System.out.println("Not found ProcessRequest [1111]");
  	} else {
  		assertEquals("Expect ", "1111", ((ProcessRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-expansionSource");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-expansionSource]");
  	} else {
  		assertEquals("Expect ", "valueset-expansionSource", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-maxValueSet");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-maxValueSet]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-maxValueSet", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Specimen");
  	result = specimenDao.find("101");
  	if (null == result) {
  		System.out.println("Not found Specimen [101]");
  	} else {
  		assertEquals("Expect ", "101", ((Specimen)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve HealthcareService");
  	result = healthcareserviceDao.find("example");
  	if (null == result) {
  		System.out.println("Not found HealthcareService [example]");
  	} else {
  		assertEquals("Expect ", "example", ((HealthcareService)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-conceptOrder");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-conceptOrder]");
  	} else {
  		assertEquals("Expect ", "codesystem-conceptOrder", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("route-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [route-codes]");
  	} else {
  		assertEquals("Expect ", "route-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("claim-subtype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [claim-subtype]");
  	} else {
  		assertEquals("Expect ", "claim-subtype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AuditEvent");
  	result = auditeventDao.find("example-search");
  	if (null == result) {
  		System.out.println("Not found AuditEvent [example-search]");
  	} else {
  		assertEquals("Expect ", "example-search", ((AuditEvent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("condition-definition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [condition-definition]");
  	} else {
  		assertEquals("Expect ", "condition-definition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-workflowStatus");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-workflowStatus]");
  	} else {
  		assertEquals("Expect ", "valueset-workflowStatus", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("condition-basedOn");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [condition-basedOn]");
  	} else {
  		assertEquals("Expect ", "condition-basedOn", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("guidance-response-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [guidance-response-status]");
  	} else {
  		assertEquals("Expect ", "guidance-response-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("map-group-type-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [map-group-type-mode]");
  	} else {
  		assertEquals("Expect ", "map-group-type-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("report-action-result-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [report-action-result-codes]");
  	} else {
  		assertEquals("Expect ", "report-action-result-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsCopyNumberEvent");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsCopyNumberEvent]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsCopyNumberEvent", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("questionnaire-answers-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [questionnaire-answers-status]");
  	} else {
  		assertEquals("Expect ", "questionnaire-answers-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("pharmacy-core-infuseOver");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [pharmacy-core-infuseOver]");
  	} else {
  		assertEquals("Expect ", "pharmacy-core-infuseOver", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-AD-use");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-AD-use]");
  	} else {
  		assertEquals("Expect ", "iso21090-AD-use", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("map-transform");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [map-transform]");
  	} else {
  		assertEquals("Expect ", "map-transform", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("allergyintolerance-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [allergyintolerance-code]");
  	} else {
  		assertEquals("Expect ", "allergyintolerance-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("location-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [location-status]");
  	} else {
  		assertEquals("Expect ", "location-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("consentdirective");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [consentdirective]");
  	} else {
  		assertEquals("Expect ", "consentdirective", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("c80-facilitycodes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [c80-facilitycodes]");
  	} else {
  		assertEquals("Expect ", "c80-facilitycodes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-severity");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-severity]");
  	} else {
  		assertEquals("Expect ", "condition-severity", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaireresponse-reason");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaireresponse-reason]");
  	} else {
  		assertEquals("Expect ", "questionnaireresponse-reason", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("AuditEvent");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [AuditEvent]");
  	} else {
  		assertEquals("Expect ", "AuditEvent", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("ConceptMap-translate");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [ConceptMap-translate]");
  	} else {
  		assertEquals("Expect ", "ConceptMap-translate", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("dicom");
  	if (null == result) {
  		System.out.println("Not found Patient [dicom]");
  	} else {
  		assertEquals("Expect ", "dicom", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("condition-targetBodySite");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [condition-targetBodySite]");
  	} else {
  		assertEquals("Expect ", "condition-targetBodySite", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("measure-report-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [measure-report-type]");
  	} else {
  		assertEquals("Expect ", "measure-report-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("list-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [list-status]");
  	} else {
  		assertEquals("Expect ", "list-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("service-product");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [service-product]");
  	} else {
  		assertEquals("Expect ", "service-product", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("measure-report-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [measure-report-status]");
  	} else {
  		assertEquals("Expect ", "measure-report-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Communication");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Communication]");
  	} else {
  		assertEquals("Expect ", "Communication", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcessRequest");
  	result = processrequestDao.find("1112");
  	if (null == result) {
  		System.out.println("Not found ProcessRequest [1112]");
  	} else {
  		assertEquals("Expect ", "1112", ((ProcessRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("allergyintolerance-certainty");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [allergyintolerance-certainty]");
  	} else {
  		assertEquals("Expect ", "allergyintolerance-certainty", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0311");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0311]");
  	} else {
  		assertEquals("Expect ", "medrx0311", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Contract");
  	result = contractDao.find("pcd-example-notLabs");
  	if (null == result) {
  		System.out.println("Not found Contract [pcd-example-notLabs]");
  	} else {
  		assertEquals("Expect ", "pcd-example-notLabs", ((Contract)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-minValueSet");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-minValueSet]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-minValueSet", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve TestScript");
  	result = testscriptDao.find("testscript-example-multisystem");
  	if (null == result) {
  		System.out.println("Not found TestScript [testscript-example-multisystem]");
  	} else {
  		assertEquals("Expect ", "testscript-example-multisystem", ((TestScript)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-package-form");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-package-form]");
  	} else {
  		assertEquals("Expect ", "medication-package-form", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("days-of-week");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [days-of-week]");
  	} else {
  		assertEquals("Expect ", "days-of-week", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-admin-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-admin-category]");
  	} else {
  		assertEquals("Expect ", "medication-admin-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found Observation [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("f003");
  	if (null == result) {
  		System.out.println("Not found Observation [f003]");
  	} else {
  		assertEquals("Expect ", "f003", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("hl7-work-group");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [hl7-work-group]");
  	} else {
  		assertEquals("Expect ", "hl7-work-group", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-de");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-de]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-de", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("address-use");
  	if (null == result) {
  		System.out.println("Not found ValueSet [address-use]");
  	} else {
  		assertEquals("Expect ", "address-use", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("event-timing");
  	if (null == result) {
  		System.out.println("Not found ValueSet [event-timing]");
  	} else {
  		assertEquals("Expect ", "event-timing", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("reaction-event-severity");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [reaction-event-severity]");
  	} else {
  		assertEquals("Expect ", "reaction-event-severity", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("texture-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [texture-code]");
  	} else {
  		assertEquals("Expect ", "texture-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Observation-stats");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Observation-stats]");
  	} else {
  		assertEquals("Expect ", "Observation-stats", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("hla-genotyping-results-glstring");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [hla-genotyping-results-glstring]");
  	} else {
  		assertEquals("Expect ", "hla-genotyping-results-glstring", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("item-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [item-type]");
  	} else {
  		assertEquals("Expect ", "item-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("AdverseEvent");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [AdverseEvent]");
  	} else {
  		assertEquals("Expect ", "AdverseEvent", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("fm-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [fm-status]");
  	} else {
  		assertEquals("Expect ", "fm-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("consent-action");
  	if (null == result) {
  		System.out.println("Not found ValueSet [consent-action]");
  	} else {
  		assertEquals("Expect ", "consent-action", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("document-reference-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [document-reference-status]");
  	} else {
  		assertEquals("Expect ", "document-reference-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("event-timing");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [event-timing]");
  	} else {
  		assertEquals("Expect ", "event-timing", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("metric-operational-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [metric-operational-status]");
  	} else {
  		assertEquals("Expect ", "metric-operational-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-allowedUnits");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-allowedUnits]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-allowedUnits", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve TestScript");
  	result = testscriptDao.find("testscript-example-history");
  	if (null == result) {
  		System.out.println("Not found TestScript [testscript-example-history]");
  	} else {
  		assertEquals("Expect ", "testscript-example-history", ((TestScript)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("provider-qualification");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [provider-qualification]");
  	} else {
  		assertEquals("Expect ", "provider-qualification", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Observation [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DeviceUseStatement");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DeviceUseStatement]");
  	} else {
  		assertEquals("Expect ", "DeviceUseStatement", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Immunization");
  	result = immunizationDao.find("notGiven");
  	if (null == result) {
  		System.out.println("Not found Immunization [notGiven]");
  	} else {
  		assertEquals("Expect ", "notGiven", ((Immunization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0319");
  	if (null == result) {
  		System.out.println("Not found Medication [med0319]");
  	} else {
  		assertEquals("Expect ", "med0319", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("provenance-entity-role");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [provenance-entity-role]");
  	} else {
  		assertEquals("Expect ", "provenance-entity-role", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("reason-medication-given-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [reason-medication-given-codes]");
  	} else {
  		assertEquals("Expect ", "reason-medication-given-codes", ((CodeSystem)result).getId());
  	}
  	System.out.println("Total tests .. " + count);
  }
  @Test
  public void test2480() throws Exception {
  	Object local = null;
  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("vitals-panel");
  	if (null == result) {
  		System.out.println("Not found Observation [vitals-panel]");
  	} else {
  		assertEquals("Expect ", "vitals-panel", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-ordinalValue");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-ordinalValue]");
  	} else {
  		assertEquals("Expect ", "codesystem-ordinalValue", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("mimeType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [mimeType]");
  	} else {
  		assertEquals("Expect ", "mimeType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-admin-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-admin-category]");
  	} else {
  		assertEquals("Expect ", "medication-admin-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Slot");
  	result = slotDao.find("2");
  	if (null == result) {
  		System.out.println("Not found Slot [2]");
  	} else {
  		assertEquals("Expect ", "2", ((Slot)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("testscript-profile-destination-types");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [testscript-profile-destination-types]");
  	} else {
  		assertEquals("Expect ", "testscript-profile-destination-types", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0304");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0304]");
  	} else {
  		assertEquals("Expect ", "meddisp0304", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("960151");
  	if (null == result) {
  		System.out.println("Not found Claim [960151]");
  	} else {
  		assertEquals("Expect ", "960151", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("designation-use");
  	if (null == result) {
  		System.out.println("Not found ValueSet [designation-use]");
  	} else {
  		assertEquals("Expect ", "designation-use", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("example-implant");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [example-implant]");
  	} else {
  		assertEquals("Expect ", "example-implant", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ActivityDefinition");
  	result = activitydefinitionDao.find("serum-dengue-virus-igm");
  	if (null == result) {
  		System.out.println("Not found ActivityDefinition [serum-dengue-virus-igm]");
  	} else {
  		assertEquals("Expect ", "serum-dengue-virus-igm", ((ActivityDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Appointment");
  	result = appointmentDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Appointment [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Appointment)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("operationoutcome-detectedIssue");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [operationoutcome-detectedIssue]");
  	} else {
  		assertEquals("Expect ", "operationoutcome-detectedIssue", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("narrative-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [narrative-status]");
  	} else {
  		assertEquals("Expect ", "narrative-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("remittance-outcome");
  	if (null == result) {
  		System.out.println("Not found ValueSet [remittance-outcome]");
  	} else {
  		assertEquals("Expect ", "remittance-outcome", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("vision-base-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [vision-base-codes]");
  	} else {
  		assertEquals("Expect ", "vision-base-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("CapabilityStatement");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [CapabilityStatement]");
  	} else {
  		assertEquals("Expect ", "CapabilityStatement", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DataRequirement");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DataRequirement]");
  	} else {
  		assertEquals("Expect ", "DataRequirement", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-basic");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-basic]");
  	} else {
  		assertEquals("Expect ", "consent-example-basic", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-statement-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-statement-status]");
  	} else {
  		assertEquals("Expect ", "medication-statement-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("service-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [service-category]");
  	} else {
  		assertEquals("Expect ", "service-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Condition");
  	result = conditionDao.find("example2");
  	if (null == result) {
  		System.out.println("Not found Condition [example2]");
  	} else {
  		assertEquals("Expect ", "example2", ((Condition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve NutritionOrder");
  	result = nutritionorderDao.find("diabeticdiet");
  	if (null == result) {
  		System.out.println("Not found NutritionOrder [diabeticdiet]");
  	} else {
  		assertEquals("Expect ", "diabeticdiet", ((NutritionOrder)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("subscription-tag");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [subscription-tag]");
  	} else {
  		assertEquals("Expect ", "subscription-tag", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-administrative-gender-v2");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-administrative-gender-v2]");
  	} else {
  		assertEquals("Expect ", "cm-administrative-gender-v2", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("encounter-primaryDiagnosis");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [encounter-primaryDiagnosis]");
  	} else {
  		assertEquals("Expect ", "encounter-primaryDiagnosis", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("immunization-role");
  	if (null == result) {
  		System.out.println("Not found ValueSet [immunization-role]");
  	} else {
  		assertEquals("Expect ", "immunization-role", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Condition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Condition]");
  	} else {
  		assertEquals("Expect ", "Condition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DocumentManifest");
  	result = documentmanifestDao.find("example");
  	if (null == result) {
  		System.out.println("Not found DocumentManifest [example]");
  	} else {
  		assertEquals("Expect ", "example", ((DocumentManifest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-cadavericDonor");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-cadavericDonor]");
  	} else {
  		assertEquals("Expect ", "patient-cadavericDonor", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DiagnosticReport");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DiagnosticReport]");
  	} else {
  		assertEquals("Expect ", "DiagnosticReport", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("ex-program-code");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [ex-program-code]");
  	} else {
  		assertEquals("Expect ", "ex-program-code", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-request-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-request-status]");
  	} else {
  		assertEquals("Expect ", "medication-request-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("pharmacy-core-maxDeliveryRate");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [pharmacy-core-maxDeliveryRate]");
  	} else {
  		assertEquals("Expect ", "pharmacy-core-maxDeliveryRate", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("supplyrequest-kind");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [supplyrequest-kind]");
  	} else {
  		assertEquals("Expect ", "supplyrequest-kind", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("animal-species");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [animal-species]");
  	} else {
  		assertEquals("Expect ", "animal-species", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0301");
  	if (null == result) {
  		System.out.println("Not found Medication [med0301]");
  	} else {
  		assertEquals("Expect ", "med0301", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("CodeSystem");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [CodeSystem]");
  	} else {
  		assertEquals("Expect ", "CodeSystem", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("process-priority");
  	if (null == result) {
  		System.out.println("Not found ValueSet [process-priority]");
  	} else {
  		assertEquals("Expect ", "process-priority", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FamilyMemberHistory");
  	result = familymemberhistoryDao.find("mother");
  	if (null == result) {
  		System.out.println("Not found FamilyMemberHistory [mother]");
  	} else {
  		assertEquals("Expect ", "mother", ((FamilyMemberHistory)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("report-status-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [report-status-codes]");
  	} else {
  		assertEquals("Expect ", "report-status-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("di");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [di]");
  	} else {
  		assertEquals("Expect ", "di", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Contract");
  	result = contractDao.find("C-2121");
  	if (null == result) {
  		System.out.println("Not found Contract [C-2121]");
  	} else {
  		assertEquals("Expect ", "C-2121", ((Contract)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("abstract-types");
  	if (null == result) {
  		System.out.println("Not found ValueSet [abstract-types]");
  	} else {
  		assertEquals("Expect ", "abstract-types", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("education");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [education]");
  	} else {
  		assertEquals("Expect ", "education", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0307");
  	if (null == result) {
  		System.out.println("Not found Medication [med0307]");
  	} else {
  		assertEquals("Expect ", "med0307", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("resource-aggregation-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [resource-aggregation-mode]");
  	} else {
  		assertEquals("Expect ", "resource-aggregation-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("marital-status");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [marital-status]");
  	} else {
  		assertEquals("Expect ", "marital-status", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("concept-map-equivalence");
  	if (null == result) {
  		System.out.println("Not found ValueSet [concept-map-equivalence]");
  	} else {
  		assertEquals("Expect ", "concept-map-equivalence", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("ex-diagnosisrelatedgroup");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [ex-diagnosisrelatedgroup]");
  	} else {
  		assertEquals("Expect ", "ex-diagnosisrelatedgroup", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("service-provision-conditions");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [service-provision-conditions]");
  	} else {
  		assertEquals("Expect ", "service-provision-conditions", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("reaction-event-certainty");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [reaction-event-certainty]");
  	} else {
  		assertEquals("Expect ", "reaction-event-certainty", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-name-use-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-name-use-v3]");
  	} else {
  		assertEquals("Expect ", "cm-name-use-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Composition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Composition]");
  	} else {
  		assertEquals("Expect ", "Composition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("bundle-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [bundle-type]");
  	} else {
  		assertEquals("Expect ", "bundle-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Task");
  	result = taskDao.find("example5");
  	if (null == result) {
  		System.out.println("Not found Task [example5]");
  	} else {
  		assertEquals("Expect ", "example5", ((Task)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AllergyIntolerance");
  	result = allergyintoleranceDao.find("fishallergy");
  	if (null == result) {
  		System.out.println("Not found AllergyIntolerance [fishallergy]");
  	} else {
  		assertEquals("Expect ", "fishallergy", ((AllergyIntolerance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("investigation-sets");
  	if (null == result) {
  		System.out.println("Not found ValueSet [investigation-sets]");
  	} else {
  		assertEquals("Expect ", "investigation-sets", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaireresponse-reviewer");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaireresponse-reviewer]");
  	} else {
  		assertEquals("Expect ", "questionnaireresponse-reviewer", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("consent-except-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [consent-except-type]");
  	} else {
  		assertEquals("Expect ", "consent-except-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("lipidprofile");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [lipidprofile]");
  	} else {
  		assertEquals("Expect ", "lipidprofile", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-uncertainty");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-uncertainty]");
  	} else {
  		assertEquals("Expect ", "iso21090-uncertainty", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("identifier-use");
  	if (null == result) {
  		System.out.println("Not found ValueSet [identifier-use]");
  	} else {
  		assertEquals("Expect ", "identifier-use", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("measure-report-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [measure-report-type]");
  	} else {
  		assertEquals("Expect ", "measure-report-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve QuestionnaireResponse");
  	result = questionnaireresponseDao.find("bb");
  	if (null == result) {
  		System.out.println("Not found QuestionnaireResponse [bb]");
  	} else {
  		assertEquals("Expect ", "bb", ((QuestionnaireResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("document-reference-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [document-reference-status]");
  	} else {
  		assertEquals("Expect ", "document-reference-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("report-participant-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [report-participant-type]");
  	} else {
  		assertEquals("Expect ", "report-participant-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-deliveryMode");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-deliveryMode]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-deliveryMode", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("supplyrequest-reason");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [supplyrequest-reason]");
  	} else {
  		assertEquals("Expect ", "supplyrequest-reason", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("measure-population");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [measure-population]");
  	} else {
  		assertEquals("Expect ", "measure-population", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("participationstatus");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [participationstatus]");
  	} else {
  		assertEquals("Expect ", "participationstatus", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("allergy-intolerance-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [allergy-intolerance-type]");
  	} else {
  		assertEquals("Expect ", "allergy-intolerance-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Quantity");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Quantity]");
  	} else {
  		assertEquals("Expect ", "Quantity", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Ratio");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Ratio]");
  	} else {
  		assertEquals("Expect ", "Ratio", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Schedule");
  	result = scheduleDao.find("exampleloc1");
  	if (null == result) {
  		System.out.println("Not found Schedule [exampleloc1]");
  	} else {
  		assertEquals("Expect ", "exampleloc1", ((Schedule)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("medication-request-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [medication-request-category]");
  	} else {
  		assertEquals("Expect ", "medication-request-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("abstract-types");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [abstract-types]");
  	} else {
  		assertEquals("Expect ", "abstract-types", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("consent-location");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [consent-location]");
  	} else {
  		assertEquals("Expect ", "consent-location", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("activity-definition-category");
  	if (null == result) {
  		System.out.println("Not found ValueSet [activity-definition-category]");
  	} else {
  		assertEquals("Expect ", "activity-definition-category", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("search-entry-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [search-entry-mode]");
  	} else {
  		assertEquals("Expect ", "search-entry-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("repository-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [repository-type]");
  	} else {
  		assertEquals("Expect ", "repository-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("f004");
  	if (null == result) {
  		System.out.println("Not found Procedure [f004]");
  	} else {
  		assertEquals("Expect ", "f004", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("parameter-group");
  	if (null == result) {
  		System.out.println("Not found ValueSet [parameter-group]");
  	} else {
  		assertEquals("Expect ", "parameter-group", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("testscript-profile-origin-types");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [testscript-profile-origin-types]");
  	} else {
  		assertEquals("Expect ", "testscript-profile-origin-types", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("immunization-site");
  	if (null == result) {
  		System.out.println("Not found ValueSet [immunization-site]");
  	} else {
  		assertEquals("Expect ", "immunization-site", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("implementationguide-page");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [implementationguide-page]");
  	} else {
  		assertEquals("Expect ", "implementationguide-page", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("MessageHeader");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [MessageHeader]");
  	} else {
  		assertEquals("Expect ", "MessageHeader", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("operation-parameter-use");
  	if (null == result) {
  		System.out.println("Not found ValueSet [operation-parameter-use]");
  	} else {
  		assertEquals("Expect ", "operation-parameter-use", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("provider-taxonomy");
  	if (null == result) {
  		System.out.println("Not found ValueSet [provider-taxonomy]");
  	} else {
  		assertEquals("Expect ", "provider-taxonomy", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Substance");
  	result = substanceDao.find("f203");
  	if (null == result) {
  		System.out.println("Not found Substance [f203]");
  	} else {
  		assertEquals("Expect ", "f203", ((Substance)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-medication-admin-status-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-medication-admin-status-v3]");
  	} else {
  		assertEquals("Expect ", "cm-medication-admin-status-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-baseType");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-baseType]");
  	} else {
  		assertEquals("Expect ", "questionnaire-baseType", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("contact-point-system");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [contact-point-system]");
  	} else {
  		assertEquals("Expect ", "contact-point-system", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contract-action");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contract-action]");
  	} else {
  		assertEquals("Expect ", "contract-action", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Resource-meta-delete");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Resource-meta-delete]");
  	} else {
  		assertEquals("Expect ", "Resource-meta-delete", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("map-source-list-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [map-source-list-mode]");
  	} else {
  		assertEquals("Expect ", "map-source-list-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("660152");
  	if (null == result) {
  		System.out.println("Not found Claim [660152]");
  	} else {
  		assertEquals("Expect ", "660152", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0327");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0327]");
  	} else {
  		assertEquals("Expect ", "medrx0327", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve EnrollmentResponse");
  	result = enrollmentresponseDao.find("ER2500");
  	if (null == result) {
  		System.out.println("Not found EnrollmentResponse [ER2500]");
  	} else {
  		assertEquals("Expect ", "ER2500", ((EnrollmentResponse)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("valueset-extensions-ValueSet-effective");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [valueset-extensions-ValueSet-effective]");
  	} else {
  		assertEquals("Expect ", "valueset-extensions-ValueSet-effective", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0313");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0313]");
  	} else {
  		assertEquals("Expect ", "medrx0313", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("library-fhir-model-definition");
  	if (null == result) {
  		System.out.println("Not found Library [library-fhir-model-definition]");
  	} else {
  		assertEquals("Expect ", "library-fhir-model-definition", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("valueset-keyWord");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [valueset-keyWord]");
  	} else {
  		assertEquals("Expect ", "valueset-keyWord", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("f001");
  	if (null == result) {
  		System.out.println("Not found Procedure [f001]");
  	} else {
  		assertEquals("Expect ", "f001", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("vision-eye-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [vision-eye-codes]");
  	} else {
  		assertEquals("Expect ", "vision-eye-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("100150");
  	if (null == result) {
  		System.out.println("Not found Claim [100150]");
  	} else {
  		assertEquals("Expect ", "100150", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("elementdefinition-inheritedExtensibleValueSet");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [elementdefinition-inheritedExtensibleValueSet]");
  	} else {
  		assertEquals("Expect ", "elementdefinition-inheritedExtensibleValueSet", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("codesystem-extensions-CodeSystem-effective");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [codesystem-extensions-CodeSystem-effective]");
  	} else {
  		assertEquals("Expect ", "codesystem-extensions-CodeSystem-effective", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("payeetype");
  	if (null == result) {
  		System.out.println("Not found ValueSet [payeetype]");
  	} else {
  		assertEquals("Expect ", "payeetype", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("measure-data-usage");
  	if (null == result) {
  		System.out.println("Not found ValueSet [measure-data-usage]");
  	} else {
  		assertEquals("Expect ", "measure-data-usage", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("allergyintolerance-substanceExposureRisk");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [allergyintolerance-substanceExposureRisk]");
  	} else {
  		assertEquals("Expect ", "allergyintolerance-substanceExposureRisk", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ContactDetail");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ContactDetail]");
  	} else {
  		assertEquals("Expect ", "ContactDetail", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("request-priority");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [request-priority]");
  	} else {
  		assertEquals("Expect ", "request-priority", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("ProcessResponse");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [ProcessResponse]");
  	} else {
  		assertEquals("Expect ", "ProcessResponse", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("openEHR-exposureDescription");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [openEHR-exposureDescription]");
  	} else {
  		assertEquals("Expect ", "openEHR-exposureDescription", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Specimen");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Specimen]");
  	} else {
  		assertEquals("Expect ", "Specimen", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-name-use-v2");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-name-use-v2]");
  	} else {
  		assertEquals("Expect ", "cm-name-use-v2", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("benefit-subcategory");
  	if (null == result) {
  		System.out.println("Not found ValueSet [benefit-subcategory]");
  	} else {
  		assertEquals("Expect ", "benefit-subcategory", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("CompartmentDefinition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [CompartmentDefinition]");
  	} else {
  		assertEquals("Expect ", "CompartmentDefinition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CapabilityStatement");
  	result = capabilitystatementDao.find("base2");
  	if (null == result) {
  		System.out.println("Not found CapabilityStatement [base2]");
  	} else {
  		assertEquals("Expect ", "base2", ((CapabilityStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("measurement-principle");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [measurement-principle]");
  	} else {
  		assertEquals("Expect ", "measurement-principle", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("vaccination-protocol-dose-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [vaccination-protocol-dose-status]");
  	} else {
  		assertEquals("Expect ", "vaccination-protocol-dose-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Practitioner [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("event-capability-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [event-capability-mode]");
  	} else {
  		assertEquals("Expect ", "event-capability-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("endpoint-payload-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [endpoint-payload-type]");
  	} else {
  		assertEquals("Expect ", "endpoint-payload-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("timing-daysOfCycle");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [timing-daysOfCycle]");
  	} else {
  		assertEquals("Expect ", "timing-daysOfCycle", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DiagnosticReport-geneticsAssessedCondition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DiagnosticReport-geneticsAssessedCondition]");
  	} else {
  		assertEquals("Expect ", "DiagnosticReport-geneticsAssessedCondition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-de-classification-or-context");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-de-classification-or-context]");
  	} else {
  		assertEquals("Expect ", "11179-de-classification-or-context", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx002");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx002]");
  	} else {
  		assertEquals("Expect ", "medrx002", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("provenance-activity-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [provenance-activity-type]");
  	} else {
  		assertEquals("Expect ", "provenance-activity-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("100155");
  	if (null == result) {
  		System.out.println("Not found Claim [100155]");
  	} else {
  		assertEquals("Expect ", "100155", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("questionnaire-item-control");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [questionnaire-item-control]");
  	} else {
  		assertEquals("Expect ", "questionnaire-item-control", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("medication-usualRoute");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [medication-usualRoute]");
  	} else {
  		assertEquals("Expect ", "medication-usualRoute", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("flag-code");
  	if (null == result) {
  		System.out.println("Not found ValueSet [flag-code]");
  	} else {
  		assertEquals("Expect ", "flag-code", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("fm-conditions");
  	if (null == result) {
  		System.out.println("Not found ValueSet [fm-conditions]");
  	} else {
  		assertEquals("Expect ", "fm-conditions", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FHIRList");
  	result = fhirlistDao.find("example-simple-empty");
  	if (null == result) {
  		System.out.println("Not found FHIRList [example-simple-empty]");
  	} else {
  		assertEquals("Expect ", "example-simple-empty", ((FHIRList)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Procedure");
  	result = procedureDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Procedure [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Procedure)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0302");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0302]");
  	} else {
  		assertEquals("Expect ", "medrx0302", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("medication-dispense-category");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [medication-dispense-category]");
  	} else {
  		assertEquals("Expect ", "medication-dispense-category", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadminexample03");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadminexample03]");
  	} else {
  		assertEquals("Expect ", "medadminexample03", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-contact-point-system-v2");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-contact-point-system-v2]");
  	} else {
  		assertEquals("Expect ", "cm-contact-point-system-v2", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("questionnaire-answers");
  	if (null == result) {
  		System.out.println("Not found ValueSet [questionnaire-answers]");
  	} else {
  		assertEquals("Expect ", "questionnaire-answers", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("supplyrequest-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [supplyrequest-status]");
  	} else {
  		assertEquals("Expect ", "supplyrequest-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("860150");
  	if (null == result) {
  		System.out.println("Not found Claim [860150]");
  	} else {
  		assertEquals("Expect ", "860150", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("contract-term-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [contract-term-type]");
  	} else {
  		assertEquals("Expect ", "contract-term-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve PlanDefinition");
  	result = plandefinitionDao.find("exclusive-breastfeeding-intervention-03");
  	if (null == result) {
  		System.out.println("Not found PlanDefinition [exclusive-breastfeeding-intervention-03]");
  	} else {
  		assertEquals("Expect ", "exclusive-breastfeeding-intervention-03", ((PlanDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-history");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-history]");
  	} else {
  		assertEquals("Expect ", "codesystem-history", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("map-input-mode");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [map-input-mode]");
  	} else {
  		assertEquals("Expect ", "map-input-mode", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("diagnostic-report-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [diagnostic-report-status]");
  	} else {
  		assertEquals("Expect ", "diagnostic-report-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Immunization");
  	result = immunizationDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Immunization [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Immunization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("metric-color");
  	if (null == result) {
  		System.out.println("Not found ValueSet [metric-color]");
  	} else {
  		assertEquals("Expect ", "metric-color", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("animal-breeds");
  	if (null == result) {
  		System.out.println("Not found ValueSet [animal-breeds]");
  	} else {
  		assertEquals("Expect ", "animal-breeds", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("process-priority");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [process-priority]");
  	} else {
  		assertEquals("Expect ", "process-priority", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Schedule");
  	result = scheduleDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Schedule [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Schedule)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("cm-administrative-gender-v3");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [cm-administrative-gender-v3]");
  	} else {
  		assertEquals("Expect ", "cm-administrative-gender-v3", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-delta");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-delta]");
  	} else {
  		assertEquals("Expect ", "observation-delta", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Encounter-everything");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Encounter-everything]");
  	} else {
  		assertEquals("Expect ", "Encounter-everything", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("special-values");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [special-values]");
  	} else {
  		assertEquals("Expect ", "special-values", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Task");
  	result = taskDao.find("example3");
  	if (null == result) {
  		System.out.println("Not found Task [example3]");
  	} else {
  		assertEquals("Expect ", "example3", ((Task)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DomainResource");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DomainResource]");
  	} else {
  		assertEquals("Expect ", "DomainResource", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("benefit-network");
  	if (null == result) {
  		System.out.println("Not found ValueSet [benefit-network]");
  	} else {
  		assertEquals("Expect ", "benefit-network", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DataElement");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DataElement]");
  	} else {
  		assertEquals("Expect ", "DataElement", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("snomedct");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [snomedct]");
  	} else {
  		assertEquals("Expect ", "snomedct", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ServiceDefinition");
  	result = servicedefinitionDao.find("infobutton");
  	if (null == result) {
  		System.out.println("Not found ServiceDefinition [infobutton]");
  	} else {
  		assertEquals("Expect ", "infobutton", ((ServiceDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0312");
  	if (null == result) {
  		System.out.println("Not found Medication [med0312]");
  	} else {
  		assertEquals("Expect ", "med0312", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("observation-geneticsAllelicFrequency");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [observation-geneticsAllelicFrequency]");
  	} else {
  		assertEquals("Expect ", "observation-geneticsAllelicFrequency", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DetectedIssue");
  	result = detectedissueDao.find("ddi");
  	if (null == result) {
  		System.out.println("Not found DetectedIssue [ddi]");
  	} else {
  		assertEquals("Expect ", "ddi", ((DetectedIssue)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("process-outcome");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [process-outcome]");
  	} else {
  		assertEquals("Expect ", "process-outcome", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SupplyDelivery");
  	result = supplydeliveryDao.find("pumpdelivery");
  	if (null == result) {
  		System.out.println("Not found SupplyDelivery [pumpdelivery]");
  	} else {
  		assertEquals("Expect ", "pumpdelivery", ((SupplyDelivery)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Media");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Media]");
  	} else {
  		assertEquals("Expect ", "Media", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("mbp");
  	if (null == result) {
  		System.out.println("Not found Observation [mbp]");
  	} else {
  		assertEquals("Expect ", "mbp", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("assert-operator-codes");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [assert-operator-codes]");
  	} else {
  		assertEquals("Expect ", "assert-operator-codes", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("micro");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [micro]");
  	} else {
  		assertEquals("Expect ", "micro", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("encounter-special-courtesy");
  	if (null == result) {
  		System.out.println("Not found ValueSet [encounter-special-courtesy]");
  	} else {
  		assertEquals("Expect ", "encounter-special-courtesy", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("reason-medication-given-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [reason-medication-given-codes]");
  	} else {
  		assertEquals("Expect ", "reason-medication-given-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AuditEvent");
  	result = auditeventDao.find("example-login");
  	if (null == result) {
  		System.out.println("Not found AuditEvent [example-login]");
  	} else {
  		assertEquals("Expect ", "example-login", ((AuditEvent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Observation-lastn");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Observation-lastn]");
  	} else {
  		assertEquals("Expect ", "Observation-lastn", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Flag");
  	result = flagDao.find("example");
  	if (null == result) {
  		System.out.println("Not found Flag [example]");
  	} else {
  		assertEquals("Expect ", "example", ((Flag)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-permitted-value-valueset");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-permitted-value-valueset]");
  	} else {
  		assertEquals("Expect ", "11179-permitted-value-valueset", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DiagnosticReport");
  	result = diagnosticreportDao.find("pap");
  	if (null == result) {
  		System.out.println("Not found DiagnosticReport [pap]");
  	} else {
  		assertEquals("Expect ", "pap", ((DiagnosticReport)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("body-site");
  	if (null == result) {
  		System.out.println("Not found ValueSet [body-site]");
  	} else {
  		assertEquals("Expect ", "body-site", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("shareablecodesystem");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [shareablecodesystem]");
  	} else {
  		assertEquals("Expect ", "shareablecodesystem", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("audit-source-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [audit-source-type]");
  	} else {
  		assertEquals("Expect ", "audit-source-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("structuredefinition-category");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [structuredefinition-category]");
  	} else {
  		assertEquals("Expect ", "structuredefinition-category", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("versioning-policy");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [versioning-policy]");
  	} else {
  		assertEquals("Expect ", "versioning-policy", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("vision-base-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [vision-base-codes]");
  	} else {
  		assertEquals("Expect ", "vision-base-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationRequest");
  	result = medicationrequestDao.find("medrx0318");
  	if (null == result) {
  		System.out.println("Not found MedicationRequest [medrx0318]");
  	} else {
  		assertEquals("Expect ", "medrx0318", ((MedicationRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("graph-compartment-rule");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [graph-compartment-rule]");
  	} else {
  		assertEquals("Expect ", "graph-compartment-rule", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Contract");
  	result = contractDao.find("pcd-example-notOrg");
  	if (null == result) {
  		System.out.println("Not found Contract [pcd-example-notOrg]");
  	} else {
  		assertEquals("Expect ", "pcd-example-notOrg", ((Contract)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("related-claim-relationship");
  	if (null == result) {
  		System.out.println("Not found ValueSet [related-claim-relationship]");
  	} else {
  		assertEquals("Expect ", "related-claim-relationship", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-referenceFilter");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-referenceFilter]");
  	} else {
  		assertEquals("Expect ", "questionnaire-referenceFilter", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("communication-reasonNotPerformed");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [communication-reasonNotPerformed]");
  	} else {
  		assertEquals("Expect ", "communication-reasonNotPerformed", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Task");
  	result = taskDao.find("example4");
  	if (null == result) {
  		System.out.println("Not found Task [example4]");
  	} else {
  		assertEquals("Expect ", "example4", ((Task)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("triglyceride");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [triglyceride]");
  	} else {
  		assertEquals("Expect ", "triglyceride", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Organization");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Organization]");
  	} else {
  		assertEquals("Expect ", "Organization", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("risk-probability");
  	if (null == result) {
  		System.out.println("Not found ValueSet [risk-probability]");
  	} else {
  		assertEquals("Expect ", "risk-probability", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("DocumentManifest");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [DocumentManifest]");
  	} else {
  		assertEquals("Expect ", "DocumentManifest", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("approach-site-codes");
  	if (null == result) {
  		System.out.println("Not found ValueSet [approach-site-codes]");
  	} else {
  		assertEquals("Expect ", "approach-site-codes", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("compartment-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [compartment-type]");
  	} else {
  		assertEquals("Expect ", "compartment-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Basic");
  	result = basicDao.find("classModel");
  	if (null == result) {
  		System.out.println("Not found Basic [classModel]");
  	} else {
  		assertEquals("Expect ", "classModel", ((Basic)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("data-types");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [data-types]");
  	} else {
  		assertEquals("Expect ", "data-types", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("birthPlace");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [birthPlace]");
  	} else {
  		assertEquals("Expect ", "birthPlace", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("chargeitem-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [chargeitem-status]");
  	} else {
  		assertEquals("Expect ", "chargeitem-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("security-labels");
  	if (null == result) {
  		System.out.println("Not found ValueSet [security-labels]");
  	} else {
  		assertEquals("Expect ", "security-labels", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-allowedResource");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-allowedResource]");
  	} else {
  		assertEquals("Expect ", "questionnaire-allowedResource", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("device-extensions-Device-din");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [device-extensions-Device-din]");
  	} else {
  		assertEquals("Expect ", "device-extensions-Device-din", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("codesystem-otherName");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [codesystem-otherName]");
  	} else {
  		assertEquals("Expect ", "codesystem-otherName", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Bundle");
  	result = bundleDao.find("profiles-others");
  	if (null == result) {
  		System.out.println("Not found Bundle [profiles-others]");
  	} else {
  		assertEquals("Expect ", "profiles-others", ((Bundle)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0312");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0312]");
  	} else {
  		assertEquals("Expect ", "medadmin0312", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Organization");
  	result = organizationDao.find("2");
  	if (null == result) {
  		System.out.println("Not found Organization [2]");
  	} else {
  		assertEquals("Expect ", "2", ((Organization)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("graphic-example-5");
  	if (null == result) {
  		System.out.println("Not found Sequence [graphic-example-5]");
  	} else {
  		assertEquals("Expect ", "graphic-example-5", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve DetectedIssue");
  	result = detectedissueDao.find("lab");
  	if (null == result) {
  		System.out.println("Not found DetectedIssue [lab]");
  	} else {
  		assertEquals("Expect ", "lab", ((DetectedIssue)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve FHIRList");
  	result = fhirlistDao.find("prognosis");
  	if (null == result) {
  		System.out.println("Not found FHIRList [prognosis]");
  	} else {
  		assertEquals("Expect ", "prognosis", ((FHIRList)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-ADXP-careOf");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-ADXP-careOf]");
  	} else {
  		assertEquals("Expect ", "iso21090-ADXP-careOf", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("pat2");
  	if (null == result) {
  		System.out.println("Not found Patient [pat2]");
  	} else {
  		assertEquals("Expect ", "pat2", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("ActivityDefinition-data-requirements");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [ActivityDefinition-data-requirements]");
  	} else {
  		assertEquals("Expect ", "ActivityDefinition-data-requirements", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Patient");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Patient]");
  	} else {
  		assertEquals("Expect ", "Patient", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("example2");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [example2]");
  	} else {
  		assertEquals("Expect ", "example2", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve SearchParameter");
  	result = searchparameterDao.find("valueset-extensions-ValueSet-keyword");
  	if (null == result) {
  		System.out.println("Not found SearchParameter [valueset-extensions-ValueSet-keyword]");
  	} else {
  		assertEquals("Expect ", "valueset-extensions-ValueSet-keyword", ((SearchParameter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("diagnosis-role");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [diagnosis-role]");
  	} else {
  		assertEquals("Expect ", "diagnosis-role", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("openEHR-administration");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [openEHR-administration]");
  	} else {
  		assertEquals("Expect ", "openEHR-administration", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("http-verb");
  	if (null == result) {
  		System.out.println("Not found ValueSet [http-verb]");
  	} else {
  		assertEquals("Expect ", "http-verb", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Consent");
  	result = consentDao.find("consent-example-smartonfhir");
  	if (null == result) {
  		System.out.println("Not found Consent [consent-example-smartonfhir]");
  	} else {
  		assertEquals("Expect ", "consent-example-smartonfhir", ((Consent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("medexample015");
  	if (null == result) {
  		System.out.println("Not found Medication [medexample015]");
  	} else {
  		assertEquals("Expect ", "medexample015", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("devicerequest-reasonRejected");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [devicerequest-reasonRejected]");
  	} else {
  		assertEquals("Expect ", "devicerequest-reasonRejected", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationAdministration");
  	result = medicationadministrationDao.find("medadmin0303");
  	if (null == result) {
  		System.out.println("Not found MedicationAdministration [medadmin0303]");
  	} else {
  		assertEquals("Expect ", "medadmin0303", ((MedicationAdministration)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("med0309");
  	if (null == result) {
  		System.out.println("Not found Medication [med0309]");
  	} else {
  		assertEquals("Expect ", "med0309", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("specimen-collection-priority");
  	if (null == result) {
  		System.out.println("Not found ValueSet [specimen-collection-priority]");
  	} else {
  		assertEquals("Expect ", "specimen-collection-priority", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("reference-version-rules");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [reference-version-rules]");
  	} else {
  		assertEquals("Expect ", "reference-version-rules", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("process-outcome");
  	if (null == result) {
  		System.out.println("Not found ValueSet [process-outcome]");
  	} else {
  		assertEquals("Expect ", "process-outcome", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Claim");
  	result = claimDao.find("660151");
  	if (null == result) {
  		System.out.println("Not found Claim [660151]");
  	} else {
  		assertEquals("Expect ", "660151", ((Claim)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("discriminator-type");
  	if (null == result) {
  		System.out.println("Not found ValueSet [discriminator-type]");
  	} else {
  		assertEquals("Expect ", "discriminator-type", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("condition-state");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [condition-state]");
  	} else {
  		assertEquals("Expect ", "condition-state", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("instant");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [instant]");
  	} else {
  		assertEquals("Expect ", "instant", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Sequence");
  	result = sequenceDao.find("fda-example");
  	if (null == result) {
  		System.out.println("Not found Sequence [fda-example]");
  	} else {
  		assertEquals("Expect ", "fda-example", ((Sequence)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("benefit-term");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [benefit-term]");
  	} else {
  		assertEquals("Expect ", "benefit-term", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Patient");
  	result = patientDao.find("proband");
  	if (null == result) {
  		System.out.println("Not found Patient [proband]");
  	} else {
  		assertEquals("Expect ", "proband", ((Patient)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve AdverseEvent");
  	result = adverseeventDao.find("example");
  	if (null == result) {
  		System.out.println("Not found AdverseEvent [example]");
  	} else {
  		assertEquals("Expect ", "example", ((AdverseEvent)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("encounter-type");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [encounter-type]");
  	} else {
  		assertEquals("Expect ", "encounter-type", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ConceptMap");
  	result = conceptmapDao.find("101");
  	if (null == result) {
  		System.out.println("Not found ConceptMap [101]");
  	} else {
  		assertEquals("Expect ", "101", ((ConceptMap)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("iso21090-EN-qualifier");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [iso21090-EN-qualifier]");
  	} else {
  		assertEquals("Expect ", "iso21090-EN-qualifier", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("patient-interpreterRequired");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [patient-interpreterRequired]");
  	} else {
  		assertEquals("Expect ", "patient-interpreterRequired", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ProcedureRequest");
  	result = procedurerequestDao.find("do-not-turn");
  	if (null == result) {
  		System.out.println("Not found ProcedureRequest [do-not-turn]");
  	} else {
  		assertEquals("Expect ", "do-not-turn", ((ProcedureRequest)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Observation");
  	result = observationDao.find("bmd");
  	if (null == result) {
  		System.out.println("Not found Observation [bmd]");
  	} else {
  		assertEquals("Expect ", "bmd", ((Observation)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("capability-statement-kind");
  	if (null == result) {
  		System.out.println("Not found ValueSet [capability-statement-kind]");
  	} else {
  		assertEquals("Expect ", "capability-statement-kind", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("event-OnBehalfOf");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [event-OnBehalfOf]");
  	} else {
  		assertEquals("Expect ", "event-OnBehalfOf", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("flag-priority");
  	if (null == result) {
  		System.out.println("Not found ValueSet [flag-priority]");
  	} else {
  		assertEquals("Expect ", "flag-priority", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CarePlan");
  	result = careplanDao.find("f002");
  	if (null == result) {
  		System.out.println("Not found CarePlan [f002]");
  	} else {
  		assertEquals("Expect ", "f002", ((CarePlan)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("claim-use");
  	if (null == result) {
  		System.out.println("Not found ValueSet [claim-use]");
  	} else {
  		assertEquals("Expect ", "claim-use", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("conformance-expectation");
  	if (null == result) {
  		System.out.println("Not found ValueSet [conformance-expectation]");
  	} else {
  		assertEquals("Expect ", "conformance-expectation", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("event-definition");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [event-definition]");
  	} else {
  		assertEquals("Expect ", "event-definition", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("condition-ver-status");
  	if (null == result) {
  		System.out.println("Not found ValueSet [condition-ver-status]");
  	} else {
  		assertEquals("Expect ", "condition-ver-status", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("action-condition-kind");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [action-condition-kind]");
  	} else {
  		assertEquals("Expect ", "action-condition-kind", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Encounter");
  	result = encounterDao.find("f002");
  	if (null == result) {
  		System.out.println("Not found Encounter [f002]");
  	} else {
  		assertEquals("Expect ", "f002", ((Encounter)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("guide-page-kind");
  	if (null == result) {
  		System.out.println("Not found ValueSet [guide-page-kind]");
  	} else {
  		assertEquals("Expect ", "guide-page-kind", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("event-notDone");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [event-notDone]");
  	} else {
  		assertEquals("Expect ", "event-notDone", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("adverse-event-causality");
  	if (null == result) {
  		System.out.println("Not found ValueSet [adverse-event-causality]");
  	} else {
  		assertEquals("Expect ", "adverse-event-causality", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Medication");
  	result = medicationDao.find("medicationexample1");
  	if (null == result) {
  		System.out.println("Not found Medication [medicationexample1]");
  	} else {
  		assertEquals("Expect ", "medicationexample1", ((Medication)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("Person");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [Person]");
  	} else {
  		assertEquals("Expect ", "Person", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("nhin-purposeofuse");
  	if (null == result) {
  		System.out.println("Not found ValueSet [nhin-purposeofuse]");
  	} else {
  		assertEquals("Expect ", "nhin-purposeofuse", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("structure-definition-kind");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [structure-definition-kind]");
  	} else {
  		assertEquals("Expect ", "structure-definition-kind", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CodeSystem");
  	result = codesystemDao.find("common-tags");
  	if (null == result) {
  		System.out.println("Not found CodeSystem [common-tags]");
  	} else {
  		assertEquals("Expect ", "common-tags", ((CodeSystem)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("medicationstatement-Prescriber");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [medicationstatement-Prescriber]");
  	} else {
  		assertEquals("Expect ", "medicationstatement-Prescriber", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve OperationDefinition");
  	result = operationdefinitionDao.find("Resource-meta");
  	if (null == result) {
  		System.out.println("Not found OperationDefinition [Resource-meta]");
  	} else {
  		assertEquals("Expect ", "Resource-meta", ((OperationDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Library");
  	result = libraryDao.find("library-fhir-helpers-predecessor");
  	if (null == result) {
  		System.out.println("Not found Library [library-fhir-helpers-predecessor]");
  	} else {
  		assertEquals("Expect ", "library-fhir-helpers-predecessor", ((Library)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Practitioner");
  	result = practitionerDao.find("f201");
  	if (null == result) {
  		System.out.println("Not found Practitioner [f201]");
  	} else {
  		assertEquals("Expect ", "f201", ((Practitioner)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("11179-de-administrative-status");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [11179-de-administrative-status]");
  	} else {
  		assertEquals("Expect ", "11179-de-administrative-status", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("testscript-profile-destination-types");
  	if (null == result) {
  		System.out.println("Not found ValueSet [testscript-profile-destination-types]");
  	} else {
  		assertEquals("Expect ", "testscript-profile-destination-types", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve ValueSet");
  	result = valuesetDao.find("restful-capability-mode");
  	if (null == result) {
  		System.out.println("Not found ValueSet [restful-capability-mode]");
  	} else {
  		assertEquals("Expect ", "restful-capability-mode", ((ValueSet)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve Questionnaire");
  	result = questionnaireDao.find("qs1");
  	if (null == result) {
  		System.out.println("Not found Questionnaire [qs1]");
  	} else {
  		assertEquals("Expect ", "qs1", ((Questionnaire)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve CapabilityStatement");
  	result = capabilitystatementDao.find("phr");
  	if (null == result) {
  		System.out.println("Not found CapabilityStatement [phr]");
  	} else {
  		assertEquals("Expect ", "phr", ((CapabilityStatement)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("capabilitystatement-search-parameter-combination");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [capabilitystatement-search-parameter-combination]");
  	} else {
  		assertEquals("Expect ", "capabilitystatement-search-parameter-combination", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("OperationOutcome");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [OperationOutcome]");
  	} else {
  		assertEquals("Expect ", "OperationOutcome", ((StructureDefinition)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve MedicationDispense");
  	result = medicationdispenseDao.find("meddisp0317");
  	if (null == result) {
  		System.out.println("Not found MedicationDispense [meddisp0317]");
  	} else {
  		assertEquals("Expect ", "meddisp0317", ((MedicationDispense)result).getId());
  	}

  	count++;
  	System.out.println("Test retrieve StructureDefinition");
  	result = structuredefinitionDao.find("questionnaire-supportLink");
  	if (null == result) {
  		System.out.println("Not found StructureDefinition [questionnaire-supportLink]");
  	} else {
  		assertEquals("Expect ", "questionnaire-supportLink", ((StructureDefinition)result).getId());
  	}
  	System.out.println("Total tests .. " + count);
  }
}