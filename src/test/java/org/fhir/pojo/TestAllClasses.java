package org.fhir.pojo;

import java.nio.charset.Charset;

import org.fhir.utils.FileUtils;
import org.fhir.pojo.*;
import org.fhir.entity.*;
import org.junit.Test;
import static org.junit.Assert.*;
/* *
 * Auto generated from the FHIR samples-json
 * Test read json from json file and convert to coresponding Java class
 * testing data are extracted from the json files
 */
public class TestAllClasses {
      @Test
      public void testLoadSequence1FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "example", sequence.getId());
      }
      @Test
      public void testLoadStructureDefinition1FromJson() throws Exception {
         String inputFile = "./examples-json/hdlcholesterol.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "hdlcholesterol", structuredefinition.getId());
      }
      @Test
      public void testLoadSequence2FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-example-fda-vcfeval.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "fda-vcfeval-comparison", sequence.getId());
      }
      @Test
      public void testLoadQuestionnaire1FromJson() throws Exception {
         String inputFile = "./examples-json/immunization-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition2FromJson() throws Exception {
         String inputFile = "./examples-json/extension-familymemberhistory-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "familymemberhistory-severity", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem1FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contract-signer-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contract-signer-type", codesystem.getId());
      }
      @Test
      public void testLoadFHIRList1FromJson() throws Exception {
         String inputFile = "./examples-json/list-example-allergies.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FHIRList fhirlist = FHIRListHelper.fromJson(json);
         assertEquals("Expect ", "current-allergies", fhirlist.getId());
      }
      @Test
      public void testLoadNutritionOrder1FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-pureeddiet.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "pureeddiet", nutritionorder.getId());
      }
      @Test
      public void testLoadQuestionnaire2FromJson() throws Exception {
         String inputFile = "./examples-json/careteam-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire3FromJson() throws Exception {
         String inputFile = "./examples-json/operationoutcome-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadPractitioner1FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f002-pv.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f002", practitioner.getId());
      }
      @Test
      public void testLoadStructureDefinition3FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityresponse.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "EligibilityResponse", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition4FromJson() throws Exception {
         String inputFile = "./examples-json/hlaresult.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "hlaresult", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire4FromJson() throws Exception {
         String inputFile = "./examples-json/familymemberhistory-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition5FromJson() throws Exception {
         String inputFile = "./examples-json/measure.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Measure", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem2FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-parameter-group.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "parameter-group", codesystem.getId());
      }
      @Test
      public void testLoadValueSet1FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-device-statement-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "device-statement-status", valueset.getId());
      }
      @Test
      public void testLoadOperationDefinition1FromJson() throws Exception {
         String inputFile = "./examples-json/operation-structuremap-transform.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "StructureMap-transform", operationdefinition.getId());
      }
      @Test
      public void testLoadBundle1FromJson() throws Exception {
         String inputFile = "./examples-json/v2-tables.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "v2-valuesets", bundle.getId());
      }
      @Test
      public void testLoadBundle2FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-examples-general.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "72ac8493-52ac-41bd-8d5d-7258c289b5ea", bundle.getId());
      }
      @Test
      public void testLoadStructureDefinition6FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-postbox.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-postBox", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition7FromJson() throws Exception {
         String inputFile = "./examples-json/searchparameter.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "SearchParameter", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition8FromJson() throws Exception {
         String inputFile = "./examples-json/bodytemp.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "bodytemp", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire5FromJson() throws Exception {
         String inputFile = "./examples-json/bodyweight-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet2FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet3FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-location-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-location-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem3FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contract-content-derivative.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contract-content-derivative", codesystem.getId());
      }
      @Test
      public void testLoadValueSet4FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-additional-instruction-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "additional-instruction-codes", valueset.getId());
      }
      @Test
      public void testLoadMedication1FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0315.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0315", medication.getId());
      }
      @Test
      public void testLoadMedication2FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0308.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0308", medication.getId());
      }
      @Test
      public void testLoadQuestionnaire6FromJson() throws Exception {
         String inputFile = "./examples-json/subscription-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadDiagnosticReport1FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "101", diagnosticreport.getId());
      }
      @Test
      public void testLoadQuestionnaire7FromJson() throws Exception {
         String inputFile = "./examples-json/condition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem4FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-search-entry-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "search-entry-mode", codesystem.getId());
      }
      @Test
      public void testLoadValueSet5FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-all-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "all-types", valueset.getId());
      }
      @Test
      public void testLoadActivityDefinition1FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-provide-mosquito-prevention-advice.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ActivityDefinition activitydefinition = ActivityDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "provide-mosquito-prevention-advice", activitydefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition9FromJson() throws Exception {
         String inputFile = "./examples-json/devicemetricobservation.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "devicemetricobservation", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire8FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaire-example-bluebook.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "bb", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet6FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-observation-relationshiptypes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "observation-relationshiptypes", valueset.getId());
      }
      @Test
      public void testLoadMedication3FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0306.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0306", medication.getId());
      }
      @Test
      public void testLoadCodeSystem5FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-surface.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "surface", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition10FromJson() throws Exception {
         String inputFile = "./examples-json/bodyweight.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "bodyweight", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet7FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-clinical-findings.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "clinical-findings", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire9FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadFamilyMemberHistory1FromJson() throws Exception {
         String inputFile = "./examples-json/familymemberhistory-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FamilyMemberHistory familymemberhistory = FamilyMemberHistoryHelper.fromJson(json);
         assertEquals("Expect ", "father", familymemberhistory.getId());
      }
      @Test
      public void testLoadOperationDefinition2FromJson() throws Exception {
         String inputFile = "./examples-json/operation-composition-document.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Composition-document", operationdefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition11FromJson() throws Exception {
         String inputFile = "./examples-json/extension-auditevent-anonymized.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "auditevent-Anonymized", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition3FromJson() throws Exception {
         String inputFile = "./examples-json/operation-capabilitystatement-conforms.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CapabilityStatement-conforms", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem6FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-entformula-additive.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "entformula-additive", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition12FromJson() throws Exception {
         String inputFile = "./examples-json/clinicalimpression.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ClinicalImpression", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition13FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-bestpractice.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-bestpractice", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition14FromJson() throws Exception {
         String inputFile = "./examples-json/linkage.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Linkage", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition15FromJson() throws Exception {
         String inputFile = "./examples-json/extension-humanname-own-prefix.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "humanname-own-prefix", structuredefinition.getId());
      }
      @Test
      public void testLoadAuditEvent1FromJson() throws Exception {
         String inputFile = "./examples-json/audit-event-example-pixQuery.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AuditEvent auditevent = AuditEventHelper.fromJson(json);
         assertEquals("Expect ", "example-pixQuery", auditevent.getId());
      }
      @Test
      public void testLoadStructureDefinition16FromJson() throws Exception {
         String inputFile = "./examples-json/careteam.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CareTeam", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire10FromJson() throws Exception {
         String inputFile = "./examples-json/claim-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadProcedureRequest1FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-pgx.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "example-pgx", procedurerequest.getId());
      }
      @Test
      public void testLoadConceptMap1FromJson() throws Exception {
         String inputFile = "./examples-json/cm-medication-statement-status-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-medication-statement-status-v3", conceptmap.getId());
      }
      @Test
      public void testLoadStructureDefinition17FromJson() throws Exception {
         String inputFile = "./examples-json/resource.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Resource", structuredefinition.getId());
      }
      @Test
      public void testLoadSequence3FromJson() throws Exception {
         String inputFile = "./examples-json/coord-0base-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "coord-0-base", sequence.getId());
      }
      @Test
      public void testLoadCodeSystem7FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-ex-diagnosistype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "ex-diagnosistype", codesystem.getId());
      }
      @Test
      public void testLoadValueSet8FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-missing-tooth-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "missing-tooth-reason", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem8FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-list-item-flag.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "list-item-flag", codesystem.getId());
      }
      @Test
      public void testLoadValueSet9FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-participationstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "participationstatus", valueset.getId());
      }
      @Test
      public void testLoadValueSet10FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-bodysite-relative-location.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "bodysite-relative-location", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition18FromJson() throws Exception {
         String inputFile = "./examples-json/extension-translation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "translation", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition19FromJson() throws Exception {
         String inputFile = "./examples-json/metadataresource.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "MetadataResource", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition20FromJson() throws Exception {
         String inputFile = "./examples-json/researchsubject.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ResearchSubject", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense1FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0328.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0328", medicationdispense.getId());
      }
      @Test
      public void testLoadVisionPrescription1FromJson() throws Exception {
         String inputFile = "./examples-json/visionprescription-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         VisionPrescription visionprescription = VisionPrescriptionHelper.fromJson(json);
         assertEquals("Expect ", "33123", visionprescription.getId());
      }
      @Test
      public void testLoadOrganization1FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-mmanu.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "mmanu", organization.getId());
      }
      @Test
      public void testLoadCarePlan1FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-f202-malignancy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "f202", careplan.getId());
      }
      @Test
      public void testLoadStructureDefinition21FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsdnaregionname.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsDNARegionName", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet11FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-testscript-operation-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "testscript-operation-codes", valueset.getId());
      }
      @Test
      public void testLoadSequence4FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-graphic-example-2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "graphic-example-2", sequence.getId());
      }
      @Test
      public void testLoadValueSet12FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-goal-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "goal-category", valueset.getId());
      }
      @Test
      public void testLoadImmunizationRecommendation1FromJson() throws Exception {
         String inputFile = "./examples-json/immunizationrecommendation-target-disease-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ImmunizationRecommendation immunizationrecommendation = ImmunizationRecommendationHelper.fromJson(json);
         assertEquals("Expect ", "example", immunizationrecommendation.getId());
      }
      @Test
      public void testLoadProcedure1FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-biopsy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "biopsy", procedure.getId());
      }
      @Test
      public void testLoadConceptMap2FromJson() throws Exception {
         String inputFile = "./examples-json/conceptmap-example-specimen-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "102", conceptmap.getId());
      }
      @Test
      public void testLoadStructureDefinition22FromJson() throws Exception {
         String inputFile = "./examples-json/supplyrequest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "SupplyRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition23FromJson() throws Exception {
         String inputFile = "./examples-json/immunizationrecommendation.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ImmunizationRecommendation", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem9FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-operation-parameter-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "operation-parameter-use", codesystem.getId());
      }
      @Test
      public void testLoadBodySite1FromJson() throws Exception {
         String inputFile = "./examples-json/bodysite-example-skin-patch.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         BodySite bodysite = BodySiteHelper.fromJson(json);
         assertEquals("Expect ", "skin-patch", bodysite.getId());
      }
      @Test
      public void testLoadCodeSystem10FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-digital-media-subtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "digital-media-subtype", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire11FromJson() throws Exception {
         String inputFile = "./examples-json/healthcareservice-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet13FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-audit-entity-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "audit-entity-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem11FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-questionnaire-usage-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-usage-mode", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition24FromJson() throws Exception {
         String inputFile = "./examples-json/identifier.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Identifier", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet14FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-example-yesnodontknow.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "yesnodontknow", valueset.getId());
      }
      @Test
      public void testLoadClaim1FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-vision.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "660150", claim.getId());
      }
      @Test
      public void testLoadCodeSystem12FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-goal-relationship-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "goal-relationship-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem13FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-variant-state.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "variant-state", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition25FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedure-schedule.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedure-schedule", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem14FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-activity-definition-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "activity-definition-category", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem15FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-measure-data-usage.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "measure-data-usage", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem16FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-issue-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "issue-severity", codesystem.getId());
      }
      @Test
      public void testLoadValueSet15FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-request-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "request-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition26FromJson() throws Exception {
         String inputFile = "./examples-json/familymemberhistory-genetic.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "familymemberhistory-genetic", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet16FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-measure-scoring.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "measure-scoring", valueset.getId());
      }
      @Test
      public void testLoadValueSet17FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-http-operations.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "http-operations", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition27FromJson() throws Exception {
         String inputFile = "./examples-json/meta.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Meta", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition28FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsaminoacidchangetype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsAminoAcidChangeType", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition29FromJson() throws Exception {
         String inputFile = "./examples-json/extension-allergyintolerance-duration.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "allergyintolerance-duration", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet18FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-example-inactive.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "inactive", valueset.getId());
      }
      @Test
      public void testLoadValueSet19FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-food-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "food-type", valueset.getId());
      }
      @Test
      public void testLoadMedicationDispense2FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0322.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0322", medicationdispense.getId());
      }
      @Test
      public void testLoadObservation1FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-TPMT-haplotype-one.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-TPMT-haplotype-one", observation.getId());
      }
      @Test
      public void testLoadValueSet20FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-response-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "response-code", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition30FromJson() throws Exception {
         String inputFile = "./examples-json/structuredefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "StructureDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem17FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-communication-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "communication-category", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition31FromJson() throws Exception {
         String inputFile = "./examples-json/enrollmentresponse.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "EnrollmentResponse", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet21FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-name-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "name-use", valueset.getId());
      }
      @Test
      public void testLoadEndpoint1FromJson() throws Exception {
         String inputFile = "./examples-json/endpoint-example-wadors.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Endpoint endpoint = EndpointHelper.fromJson(json);
         assertEquals("Expect ", "example-wadors", endpoint.getId());
      }
      @Test
      public void testLoadQuestionnaireResponse1FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaireresponse-example-f201-lifelines.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         QuestionnaireResponse questionnaireresponse = QuestionnaireResponseHelper.fromJson(json);
         assertEquals("Expect ", "f201", questionnaireresponse.getId());
      }
      @Test
      public void testLoadCodeSystem18FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-transaction-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "transaction-mode", codesystem.getId());
      }
      @Test
      public void testLoadValueSet22FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-service-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "service-category", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem19FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-message-reason-encounter.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "message-reason-encounter", codesystem.getId());
      }
      @Test
      public void testLoadSubstance1FromJson() throws Exception {
         String inputFile = "./examples-json/substance-example-silver-nitrate-product.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Substance substance = SubstanceHelper.fromJson(json);
         assertEquals("Expect ", "f204", substance.getId());
      }
      @Test
      public void testLoadAllergyIntolerance1FromJson() throws Exception {
         String inputFile = "./examples-json/allergyintolerance-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AllergyIntolerance allergyintolerance = AllergyIntoleranceHelper.fromJson(json);
         assertEquals("Expect ", "example", allergyintolerance.getId());
      }
      @Test
      public void testLoadConsent1FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-pkb.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-pkb", consent.getId());
      }
      @Test
      public void testLoadStructureDefinition32FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedure-targetbodysite.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedure-targetBodySite", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet23FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-relatedperson-relationshiptype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "relatedperson-relationshiptype", valueset.getId());
      }
      @Test
      public void testLoadActivityDefinition2FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-order-serum-zika-dengue-virus-igm.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ActivityDefinition activitydefinition = ActivityDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "serum-zika-dengue-virus-igm", activitydefinition.getId());
      }
      @Test
      public void testLoadPlanDefinition1FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-protocol-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "protocol-example", plandefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition33FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-sourcereference.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-sourceReference", structuredefinition.getId());
      }
      @Test
      public void testLoadNutritionOrder2FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-infantenteral.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "infantenteral", nutritionorder.getId());
      }
      @Test
      public void testLoadQuestionnaire12FromJson() throws Exception {
         String inputFile = "./examples-json/bodylength-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadProcessRequest1FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-example-reverse.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessRequest processrequest = ProcessRequestHelper.fromJson(json);
         assertEquals("Expect ", "87654", processrequest.getId());
      }
      @Test
      public void testLoadMedicationDispense3FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0330.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0330", medicationdispense.getId());
      }
      @Test
      public void testLoadQuestionnaire13FromJson() throws Exception {
         String inputFile = "./examples-json/library-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire14FromJson() throws Exception {
         String inputFile = "./examples-json/expansionprofile-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition34FromJson() throws Exception {
         String inputFile = "./examples-json/group.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Group", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationOutcome1FromJson() throws Exception {
         String inputFile = "./examples-json/operationoutcome-example-break-the-glass.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationOutcome operationoutcome = OperationOutcomeHelper.fromJson(json);
         assertEquals("Expect ", "break-the-glass", operationoutcome.getId());
      }
      @Test
      public void testLoadStructureDefinition35FromJson() throws Exception {
         String inputFile = "./examples-json/medicationstatement.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "MedicationStatement", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition36FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-definition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-definition", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition37FromJson() throws Exception {
         String inputFile = "./examples-json/extension-pharmacy-core-dosetype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "pharmacy-core-doseType", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition38FromJson() throws Exception {
         String inputFile = "./examples-json/extension-humanname-partner-prefix.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "humanname-partner-prefix", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire15FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition39FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-adoptioninfo.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-adoptionInfo", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet24FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-dataelement-sdcobjectclassproperty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "dataelement-sdcobjectclassproperty", valueset.getId());
      }
      @Test
      public void testLoadMedication4FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0311.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0311", medication.getId());
      }
      @Test
      public void testLoadQuestionnaire16FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet25FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-consent-state-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "consent-state-codes", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire17FromJson() throws Exception {
         String inputFile = "./examples-json/testscript-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire18FromJson() throws Exception {
         String inputFile = "./examples-json/provenance-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem20FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-questionnaire-answers-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-answers-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet26FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-supply-item.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "supply-item", valueset.getId());
      }
      @Test
      public void testLoadContract1FromJson() throws Exception {
         String inputFile = "./examples-json/pcd-example-notThem.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Contract contract = ContractHelper.fromJson(json);
         assertEquals("Expect ", "pcd-example-notThem", contract.getId());
      }
      @Test
      public void testLoadStructureDefinition40FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-optionexclusive.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-optionExclusive", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem21FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-research-study-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "research-study-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem22FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-flag-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "flag-category", codesystem.getId());
      }
      @Test
      public void testLoadValueSet27FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contributor-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contributor-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem23FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-device-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "device-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem24FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-composite-measure-scoring.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "composite-measure-scoring", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition41FromJson() throws Exception {
         String inputFile = "./examples-json/practitionerrole.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "PractitionerRole", structuredefinition.getId());
      }
      @Test
      public void testLoadTestScript1FromJson() throws Exception {
         String inputFile = "./examples-json/testscript-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         TestScript testscript = TestScriptHelper.fromJson(json);
         assertEquals("Expect ", "testscript-example", testscript.getId());
      }
      @Test
      public void testLoadStructureDefinition42FromJson() throws Exception {
         String inputFile = "./examples-json/extension-careplan-activity-title.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "careplan-activity-title", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition43FromJson() throws Exception {
         String inputFile = "./examples-json/relatedartifact.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "RelatedArtifact", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet28FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-substance-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "substance-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet29FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-flag-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "flag-status", valueset.getId());
      }
      @Test
      public void testLoadDevice1FromJson() throws Exception {
         String inputFile = "./examples-json/device-example-pacemaker.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Device device = DeviceHelper.fromJson(json);
         assertEquals("Expect ", "example-pacemaker", device.getId());
      }
      @Test
      public void testLoadResearchStudy1FromJson() throws Exception {
         String inputFile = "./examples-json/researchstudy-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ResearchStudy researchstudy = ResearchStudyHelper.fromJson(json);
         assertEquals("Expect ", "example", researchstudy.getId());
      }
      @Test
      public void testLoadStructureDefinition44FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-genetics.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedurerequest-genetics", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem25FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-operational-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "operational-status", codesystem.getId());
      }
      @Test
      public void testLoadPatient1FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-xcda.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "xcda", patient.getId());
      }
      @Test
      public void testLoadValueSet30FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-supplydelivery-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "supplydelivery-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet31FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-specimen-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "specimen-status", valueset.getId());
      }
      @Test
      public void testLoadObservation2FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-phenotype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-phenotype", observation.getId());
      }
      @Test
      public void testLoadProvenance1FromJson() throws Exception {
         String inputFile = "./examples-json/provenance-example-biocompute-object.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Provenance provenance = ProvenanceHelper.fromJson(json);
         assertEquals("Expect ", "example-biocompute-object", provenance.getId());
      }
      @Test
      public void testLoadStructureDefinition45FromJson() throws Exception {
         String inputFile = "./examples-json/extension-encounter-associatedencounter.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "encounter-associatedEncounter", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem26FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-risk-probability.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "risk-probability", codesystem.getId());
      }
      @Test
      public void testLoadObservation3FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-haplotype1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-haplotype1", observation.getId());
      }
      @Test
      public void testLoadCodeSystem27FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-list-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "list-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition46FromJson() throws Exception {
         String inputFile = "./examples-json/contract.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Contract", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition47FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-de-effective-period.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-de-effective-period", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition48FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-subsumes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-subsumes", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet32FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-message-events.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "message-events", valueset.getId());
      }
      @Test
      public void testLoadObservation4FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-head-circumference.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "head-circumference", observation.getId());
      }
      @Test
      public void testLoadValueSet33FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-doc-classcodes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "doc-classcodes", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem28FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-vaccination-protocol-dose-status-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "vaccination-protocol-dose-status-reason", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition49FromJson() throws Exception {
         String inputFile = "./examples-json/extension-event-reasoncode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "event-reasonCode", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition50FromJson() throws Exception {
         String inputFile = "./examples-json/markdown.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "markdown", structuredefinition.getId());
      }
      @Test
      public void testLoadEncounter1FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example-emerg.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "emerg", encounter.getId());
      }
      @Test
      public void testLoadStructureDefinition51FromJson() throws Exception {
         String inputFile = "./examples-json/expansionprofile.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ExpansionProfile", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet34FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-benefit-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "benefit-category", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem29FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-response-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "response-code", codesystem.getId());
      }
      @Test
      public void testLoadMedication5FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0316.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0316", medication.getId());
      }
      @Test
      public void testLoadObservation5FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-10minute-apgar-score.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "10minute-apgar-score", observation.getId());
      }
      @Test
      public void testLoadCodeSystem30FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-action-selection-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "action-selection-behavior", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem31FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-nutrition-request-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "nutrition-request-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition52FromJson() throws Exception {
         String inputFile = "./examples-json/extension-diagnosticreport-geneticsanalysis.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DiagnosticReport-geneticsAnalysis", structuredefinition.getId());
      }
      @Test
      public void testLoadEpisodeOfCare1FromJson() throws Exception {
         String inputFile = "./examples-json/episodeofcare-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         EpisodeOfCare episodeofcare = EpisodeOfCareHelper.fromJson(json);
         assertEquals("Expect ", "example", episodeofcare.getId());
      }
      @Test
      public void testLoadCodeSystem32FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-measure-scoring.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "measure-scoring", codesystem.getId());
      }
      @Test
      public void testLoadValueSet35FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-dispense-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-dispense-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet36FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-linkage-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "linkage-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem33FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-map-source-list-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "map-source-list-mode", codesystem.getId());
      }
      @Test
      public void testLoadValueSet37FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-audit-event-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "audit-event-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition53FromJson() throws Exception {
         String inputFile = "./examples-json/simplequantity.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "SimpleQuantity", structuredefinition.getId());
      }
      @Test
      public void testLoadChargeItem1FromJson() throws Exception {
         String inputFile = "./examples-json/chargeitem-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ChargeItem chargeitem = ChargeItemHelper.fromJson(json);
         assertEquals("Expect ", "example", chargeitem.getId());
      }
      @Test
      public void testLoadObservation6FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-bloodpressure.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "blood-pressure", observation.getId());
      }
      @Test
      public void testLoadValueSet38FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adverse-event-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-outcome", valueset.getId());
      }
      @Test
      public void testLoadSequence5FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-example-TPMT-two.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "example-TPMT-two", sequence.getId());
      }
      @Test
      public void testLoadValueSet39FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-consent-content-class.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "consent-content-class", valueset.getId());
      }
      @Test
      public void testLoadLibrary1FromJson() throws Exception {
         String inputFile = "./examples-json/library-fhir-helpers.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "library-fhir-helpers", library.getId());
      }
      @Test
      public void testLoadCodeSystem34FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-resource-aggregation-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "resource-aggregation-mode", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition54FromJson() throws Exception {
         String inputFile = "./examples-json/cholesterol.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "cholesterol", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem35FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-list-order.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "list-order", codesystem.getId());
      }
      @Test
      public void testLoadValueSet40FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contract-term-subtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contract-term-subtype", valueset.getId());
      }
      @Test
      public void testLoadValueSet41FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adjudication.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adjudication", valueset.getId());
      }
      @Test
      public void testLoadValueSet42FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-list-item-flag.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "list-item-flag", valueset.getId());
      }
      @Test
      public void testLoadBundle3FromJson() throws Exception {
         String inputFile = "./examples-json/bundle-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "bundle-example", bundle.getId());
      }
      @Test
      public void testLoadCodeSystem36FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-search-modifier-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "search-modifier-code", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem37FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-repository-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "repository-type", codesystem.getId());
      }
      @Test
      public void testLoadProcedure2FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-f002-lung.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "f002", procedure.getId());
      }
      @Test
      public void testLoadValueSet43FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-vaccine-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "vaccine-code", valueset.getId());
      }
      @Test
      public void testLoadPractitioner2FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f006-rvdb.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f006", practitioner.getId());
      }
      @Test
      public void testLoadCodeSystem38FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-http-operations.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "http-operations", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition55FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-wg.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-wg", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem39FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-dicom-audit-lifecycle.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "dicom-audit-lifecycle", codesystem.getId());
      }
      @Test
      public void testLoadObservation7FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-respiratory-rate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "respiratory-rate", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition56FromJson() throws Exception {
         String inputFile = "./examples-json/extension-encounter-modeofarrival.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "encounter-modeOfArrival", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet44FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-age-units.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "age-units", valueset.getId());
      }
      @Test
      public void testLoadAuditEvent2FromJson() throws Exception {
         String inputFile = "./examples-json/audit-event-example-vread.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AuditEvent auditevent = AuditEventHelper.fromJson(json);
         assertEquals("Expect ", "example-rest", auditevent.getId());
      }
      @Test
      public void testLoadStructureDefinition57FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-othername.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-otherName", structuredefinition.getId());
      }
      @Test
      public void testLoadFHIRList2FromJson() throws Exception {
         String inputFile = "./examples-json/list-example-familyhistory-f201-roel.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FHIRList fhirlist = FHIRListHelper.fromJson(json);
         assertEquals("Expect ", "f201", fhirlist.getId());
      }
      @Test
      public void testLoadSearchParameter1FromJson() throws Exception {
         String inputFile = "./examples-json/elementdefinition-11179-DataElement-objectClass.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-11179-DataElement-objectClass", searchparameter.getId());
      }
      @Test
      public void testLoadSequence6FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-example-fda-comparisons.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "fda-vcf-comparison", sequence.getId());
      }
      @Test
      public void testLoadValueSet45FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-implant-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "implant-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem40FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-claim-careteamrole.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "claim-careteamrole", codesystem.getId());
      }
      @Test
      public void testLoadProcedureRequest2FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-ob.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "ob", procedurerequest.getId());
      }
      @Test
      public void testLoadSearchParameter2FromJson() throws Exception {
         String inputFile = "./examples-json/observation-genetic-Observation-dna-variant.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "observation-genetic-Observation-dna-variant", searchparameter.getId());
      }
      @Test
      public void testLoadValueSet46FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-jurisdiction.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "jurisdiction", valueset.getId());
      }
      @Test
      public void testLoadProcedure3FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-appendectomy-narrative.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "appendectomy-narrative", procedure.getId());
      }
      @Test
      public void testLoadValueSet47FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-special-arrangements.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-special-arrangements", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem41FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-goal-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "goal-category", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition58FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-toocostly.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-toocostly", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire19FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaire-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "3141", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition59FromJson() throws Exception {
         String inputFile = "./examples-json/claim.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Claim", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition4FromJson() throws Exception {
         String inputFile = "./examples-json/operation-plandefinition-data-requirements.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "PlanDefinition-data-requirements", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem42FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-metric-calibration-state.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "metric-calibration-state", codesystem.getId());
      }
      @Test
      public void testLoadBundle4FromJson() throws Exception {
         String inputFile = "./examples-json/message-response-link.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "3a0707d3-549e-4467-b8b8-5a2ab3800efe", bundle.getId());
      }
      @Test
      public void testLoadCondition1FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-stroke.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "stroke", condition.getId());
      }
      @Test
      public void testLoadMedicationDispense4FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0315.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0315", medicationdispense.getId());
      }
      @Test
      public void testLoadPractitioner3FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-xcda1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "xcda1", practitioner.getId());
      }
      @Test
      public void testLoadValueSet48FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-extension-context.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "extension-context", valueset.getId());
      }
      @Test
      public void testLoadConsent2FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-Out.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-Out", consent.getId());
      }
      @Test
      public void testLoadSchedule1FromJson() throws Exception {
         String inputFile = "./examples-json/schedule-provider-location2-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Schedule schedule = ScheduleHelper.fromJson(json);
         assertEquals("Expect ", "exampleloc2", schedule.getId());
      }
      @Test
      public void testLoadCodeSystem43FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-document-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "document-mode", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition60FromJson() throws Exception {
         String inputFile = "./examples-json/extension-openehr-management.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "openEHR-management", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet49FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-claim-informationcategory.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "claim-informationcategory", valueset.getId());
      }
      @Test
      public void testLoadCondition2FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-f001-heart.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "f001", condition.getId());
      }
      @Test
      public void testLoadStructureDefinition61FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-comment.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-comment", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet50FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-resource-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "resource-types", valueset.getId());
      }
      @Test
      public void testLoadMedicationRequest1FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0331.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0331", medicationrequest.getId());
      }
      @Test
      public void testLoadCondition3FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-f203-sepsis.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "f203", condition.getId());
      }
      @Test
      public void testLoadValueSet51FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-service-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "service-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition62FromJson() throws Exception {
         String inputFile = "./examples-json/conceptmap.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ConceptMap", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire20FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire21FromJson() throws Exception {
         String inputFile = "./examples-json/deviceusestatement-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCoverage1FromJson() throws Exception {
         String inputFile = "./examples-json/coverage-example-2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Coverage coverage = CoverageHelper.fromJson(json);
         assertEquals("Expect ", "7546D", coverage.getId());
      }
      @Test
      public void testLoadPaymentNotice1FromJson() throws Exception {
         String inputFile = "./examples-json/paymentnotice-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PaymentNotice paymentnotice = PaymentNoticeHelper.fromJson(json);
         assertEquals("Expect ", "77654", paymentnotice.getId());
      }
      @Test
      public void testLoadStructureDefinition63FromJson() throws Exception {
         String inputFile = "./examples-json/string.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "string", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet52FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-communication-not-done-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "communication-not-done-reason", valueset.getId());
      }
      @Test
      public void testLoadActivityDefinition3FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-administer-zika-virus-exposure-assessment.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ActivityDefinition activitydefinition = ActivityDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "administer-zika-virus-exposure-assessment", activitydefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense5FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0319.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0319", medicationdispense.getId());
      }
      @Test
      public void testLoadCodeSystem44FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-claim-subtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "claim-subtype", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition64FromJson() throws Exception {
         String inputFile = "./examples-json/extension-diagnosticreport-locationperformed.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "diagnosticReport-locationPerformed", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition65FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-clinicaltrial.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-clinicalTrial", structuredefinition.getId());
      }
      @Test
      public void testLoadConceptMap3FromJson() throws Exception {
         String inputFile = "./examples-json/cm-document-reference-status-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-document-reference-status-v3", conceptmap.getId());
      }
      @Test
      public void testLoadDeviceComponent1FromJson() throws Exception {
         String inputFile = "./examples-json/devicecomponent-example-prodspec.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DeviceComponent devicecomponent = DeviceComponentHelper.fromJson(json);
         assertEquals("Expect ", "example-prodspec", devicecomponent.getId());
      }
      @Test
      public void testLoadDetectedIssue1FromJson() throws Exception {
         String inputFile = "./examples-json/detectedissue-example-dup.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DetectedIssue detectedissue = DetectedIssueHelper.fromJson(json);
         assertEquals("Expect ", "duplicate", detectedissue.getId());
      }
      @Test
      public void testLoadValueSet53FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-marital-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "marital-status", valueset.getId());
      }
      @Test
      public void testLoadNutritionOrder3FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-texture-modified.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "texturemodified", nutritionorder.getId());
      }
      @Test
      public void testLoadStructureDefinition66FromJson() throws Exception {
         String inputFile = "./examples-json/extension-event-performerrole.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "event-performerRole", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire22FromJson() throws Exception {
         String inputFile = "./examples-json/enrollmentresponse-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire23FromJson() throws Exception {
         String inputFile = "./examples-json/devicemetricobservation-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition67FromJson() throws Exception {
         String inputFile = "./examples-json/datetime.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "dateTime", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire24FromJson() throws Exception {
         String inputFile = "./examples-json/flag-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem45FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-search-xpath-usage.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "search-xpath-usage", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem46FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-type-derivation-rule.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "type-derivation-rule", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition68FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-warning.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-warning", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition69FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-trusted-expansion.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-trusted-expansion", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire25FromJson() throws Exception {
         String inputFile = "./examples-json/coverage-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem47FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-additionalmaterials.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "additionalmaterials", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem48FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adverse-event-causality-assess.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-causality-assess", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition70FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-tel-address.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-TEL-address", structuredefinition.getId());
      }
      @Test
      public void testLoadAuditEvent3FromJson() throws Exception {
         String inputFile = "./examples-json/auditevent-example-disclosure.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AuditEvent auditevent = AuditEventHelper.fromJson(json);
         assertEquals("Expect ", "example-disclosure", auditevent.getId());
      }
      @Test
      public void testLoadCodeSystem49FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-encounter-special-arrangements.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "encounter-special-arrangements", codesystem.getId());
      }
      @Test
      public void testLoadValueSet54FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-map-context-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "map-context-type", valueset.getId());
      }
      @Test
      public void testLoadOperationDefinition5FromJson() throws Exception {
         String inputFile = "./examples-json/operation-conceptmap-closure.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ConceptMap-closure", operationdefinition.getId());
      }
      @Test
      public void testLoadValueSet55FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-detectedissue-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "detectedissue-severity", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition71FromJson() throws Exception {
         String inputFile = "./examples-json/extension-communicationrequest-reasonrejected.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "communicationrequest-reasonRejected", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition6FromJson() throws Exception {
         String inputFile = "./examples-json/operation-codesystem-compose.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CodeSystem-compose", operationdefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition72FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaire.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Questionnaire", structuredefinition.getId());
      }
      @Test
      public void testLoadNamingSystem1FromJson() throws Exception {
         String inputFile = "./examples-json/namingsystem-example-id.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NamingSystem namingsystem = NamingSystemHelper.fromJson(json);
         assertEquals("Expect ", "example-id", namingsystem.getId());
      }
      @Test
      public void testLoadMedicationRequest2FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0333.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0333", medicationrequest.getId());
      }
      @Test
      public void testLoadValueSet56FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-surface.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "surface", valueset.getId());
      }
      @Test
      public void testLoadSearchParameter3FromJson() throws Exception {
         String inputFile = "./examples-json/observation-genetic-Observation-gene-dnavariant.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "observation-genetic-Observation-gene-dnavariant", searchparameter.getId());
      }
      @Test
      public void testLoadValueSet57FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-sequence-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "sequence-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet58FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-issue-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "issue-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition73FromJson() throws Exception {
         String inputFile = "./examples-json/extension-minvalue.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "minValue", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet59FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-chromosome-human.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "chromosome-human", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem50FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-goal-status-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "goal-status-reason", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition74FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-bodyposition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-bodyPosition", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition75FromJson() throws Exception {
         String inputFile = "./examples-json/extension-timing-exact.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "timing-exact", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet60FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-service-referral-method.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "service-referral-method", valueset.getId());
      }
      @Test
      public void testLoadValueSet61FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-instance-availability.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "instance-availability", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem51FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-report-participant-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "report-participant-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem52FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-statement-taken.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-statement-taken", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition76FromJson() throws Exception {
         String inputFile = "./examples-json/extension-geolocation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "geolocation", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition77FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-verification.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-verification", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet62FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-object-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "object-role", valueset.getId());
      }
      @Test
      public void testLoadValueSet63FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-subscription-tag.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "subscription-tag", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition78FromJson() throws Exception {
         String inputFile = "./examples-json/heartrate.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "heartrate", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation8FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f206-staphylococcus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f206", observation.getId());
      }
      @Test
      public void testLoadQuestionnaire26FromJson() throws Exception {
         String inputFile = "./examples-json/testreport-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem53FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-encounter-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "encounter-status", codesystem.getId());
      }
      @Test
      public void testLoadCoverage2FromJson() throws Exception {
         String inputFile = "./examples-json/coverage-example-selfpay.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Coverage coverage = CoverageHelper.fromJson(json);
         assertEquals("Expect ", "SP1234", coverage.getId());
      }
      @Test
      public void testLoadStructureDefinition79FromJson() throws Exception {
         String inputFile = "./examples-json/referralrequest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ReferralRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet64FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-doc-section-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "doc-section-codes", valueset.getId());
      }
      @Test
      public void testLoadMedicationDispense6FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0307.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0307", medicationdispense.getId());
      }
      @Test
      public void testLoadOperationDefinition7FromJson() throws Exception {
         String inputFile = "./examples-json/operation-resource-meta-add.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Resource-meta-add", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem54FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-operation-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "operation-kind", codesystem.getId());
      }
      @Test
      public void testLoadValueSet65FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-care-team-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "care-team-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet66FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-network-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "network-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet67FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-object-lifecycle-events.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "object-lifecycle-events", valueset.getId());
      }
      @Test
      public void testLoadProcedure4FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-ambulation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "ambulation", procedure.getId());
      }
      @Test
      public void testLoadStructureDefinition80FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-targetstructuremap.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-targetStructureMap", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition81FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-birthtime.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-birthTime", structuredefinition.getId());
      }
      @Test
      public void testLoadConceptMap4FromJson() throws Exception {
         String inputFile = "./examples-json/cm-medication-dispense-status-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-medication-dispense-status-v3", conceptmap.getId());
      }
      @Test
      public void testLoadSearchParameter4FromJson() throws Exception {
         String inputFile = "./examples-json/observation-genetic-Observation-amino-acid-change.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "observation-genetic-Observation-amino-acid-change", searchparameter.getId());
      }
      @Test
      public void testLoadOperationDefinition8FromJson() throws Exception {
         String inputFile = "./examples-json/operation-valueset-expand.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ValueSet-expand", operationdefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition82FromJson() throws Exception {
         String inputFile = "./examples-json/extension-messageheader-response-request.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "messageheader-response-request", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem55FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-observation-statistics.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "observation-statistics", codesystem.getId());
      }
      @Test
      public void testLoadAppointment1FromJson() throws Exception {
         String inputFile = "./examples-json/appointment-example2doctors.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Appointment appointment = AppointmentHelper.fromJson(json);
         assertEquals("Expect ", "2docs", appointment.getId());
      }
      @Test
      public void testLoadValueSet68FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-claim-modifiers.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "claim-modifiers", valueset.getId());
      }
      @Test
      public void testLoadValueSet69FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-coverage-selfpay.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "coverage-selfpay", valueset.getId());
      }
      @Test
      public void testLoadValueSet70FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-allerg-intol-substance-exp-risk.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "allerg-intol-substance-exp-risk", valueset.getId());
      }
      @Test
      public void testLoadMedication6FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0313.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0313", medication.getId());
      }
      @Test
      public void testLoadExplanationOfBenefit1FromJson() throws Exception {
         String inputFile = "./examples-json/explanationofbenefit-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ExplanationOfBenefit explanationofbenefit = ExplanationOfBenefitHelper.fromJson(json);
         assertEquals("Expect ", "EB3500", explanationofbenefit.getId());
      }
      @Test
      public void testLoadCodeSystem56FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-composition-attestation-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "composition-attestation-mode", codesystem.getId());
      }
      @Test
      public void testLoadClaim2FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-oral-average.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "100151", claim.getId());
      }
      @Test
      public void testLoadStructureDefinition83FromJson() throws Exception {
         String inputFile = "./examples-json/observation-genetics.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-genetics", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition84FromJson() throws Exception {
         String inputFile = "./examples-json/positiveint.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "positiveInt", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet71FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-property-representation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "property-representation", valueset.getId());
      }
      @Test
      public void testLoadEndpoint2FromJson() throws Exception {
         String inputFile = "./examples-json/endpoint-example-iid.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Endpoint endpoint = EndpointHelper.fromJson(json);
         assertEquals("Expect ", "example-iid", endpoint.getId());
      }
      @Test
      public void testLoadCodeSystem57FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-benefit-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "benefit-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet72FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-participant-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-participant-role", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire27FromJson() throws Exception {
         String inputFile = "./examples-json/list-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition85FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-co-value.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-CO-value", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire28FromJson() throws Exception {
         String inputFile = "./examples-json/hdlcholesterol-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadLocation1FromJson() throws Exception {
         String inputFile = "./examples-json/location-example-ukpharmacy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Location location = LocationHelper.fromJson(json);
         assertEquals("Expect ", "ukp", location.getId());
      }
      @Test
      public void testLoadQuestionnaire29FromJson() throws Exception {
         String inputFile = "./examples-json/basic-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadAuditEvent4FromJson() throws Exception {
         String inputFile = "./examples-json/audit-event-example-media.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AuditEvent auditevent = AuditEventHelper.fromJson(json);
         assertEquals("Expect ", "example-media", auditevent.getId());
      }
      @Test
      public void testLoadStructureDefinition86FromJson() throws Exception {
         String inputFile = "./examples-json/oxygensat.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "oxygensat", structuredefinition.getId());
      }
      @Test
      public void testLoadMeasure1FromJson() throws Exception {
         String inputFile = "./examples-json/measure-composite-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Measure measure = MeasureHelper.fromJson(json);
         assertEquals("Expect ", "composite-example", measure.getId());
      }
      @Test
      public void testLoadStructureDefinition87FromJson() throws Exception {
         String inputFile = "./examples-json/extension-data-absent-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "data-absent-reason", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition88FromJson() throws Exception {
         String inputFile = "./examples-json/flag.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Flag", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation9FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-bloodpressure-cancel.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "blood-pressure-cancel", observation.getId());
      }
      @Test
      public void testLoadValueSet73FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-statement-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-statement-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet74FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-security-role-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "security-role-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet75FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-report-status-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "report-status-codes", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition89FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedurerequest-reasonrefused.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedurerequest-reasonRefused", structuredefinition.getId());
      }
      @Test
      public void testLoadRiskAssessment1FromJson() throws Exception {
         String inputFile = "./examples-json/riskassessment-example-cardiac.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RiskAssessment riskassessment = RiskAssessmentHelper.fromJson(json);
         assertEquals("Expect ", "cardiac", riskassessment.getId());
      }
      @Test
      public void testLoadValueSet76FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ucum-common.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ucum-common", valueset.getId());
      }
      @Test
      public void testLoadPlanDefinition2FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-exclusive-breastfeeding-intervention-01.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "exclusive-breastfeeding-intervention-01", plandefinition.getId());
      }
      @Test
      public void testLoadCodeSystem58FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-encounter-location-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "encounter-location-status", codesystem.getId());
      }
      @Test
      public void testLoadActivityDefinition4FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-medicationorder-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ActivityDefinition activitydefinition = ActivityDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "citalopramPrescription", activitydefinition.getId());
      }
      @Test
      public void testLoadValueSet77FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-audit-event-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "audit-event-outcome", valueset.getId());
      }
      @Test
      public void testLoadValueSet78FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-clinical.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-clinical", valueset.getId());
      }
      @Test
      public void testLoadAppointment2FromJson() throws Exception {
         String inputFile = "./examples-json/appointment-example-request.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Appointment appointment = AppointmentHelper.fromJson(json);
         assertEquals("Expect ", "examplereq", appointment.getId());
      }
      @Test
      public void testLoadValueSet79FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-metric-calibration-state.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "metric-calibration-state", valueset.getId());
      }
      @Test
      public void testLoadMedicationDispense7FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0326.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0326", medicationdispense.getId());
      }
      @Test
      public void testLoadRelatedPerson1FromJson() throws Exception {
         String inputFile = "./examples-json/relatedperson-example-f001-sarah.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RelatedPerson relatedperson = RelatedPersonHelper.fromJson(json);
         assertEquals("Expect ", "f001", relatedperson.getId());
      }
      @Test
      public void testLoadMedicationRequest3FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0303.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0303", medicationrequest.getId());
      }
      @Test
      public void testLoadImmunizationRecommendation2FromJson() throws Exception {
         String inputFile = "./examples-json/immunizationrecommendation-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ImmunizationRecommendation immunizationrecommendation = ImmunizationRecommendationHelper.fromJson(json);
         assertEquals("Expect ", "example", immunizationrecommendation.getId());
      }
      @Test
      public void testLoadStructureDefinition90FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "MedicationAdministration", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet80FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-immunization-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "immunization-reason", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition91FromJson() throws Exception {
         String inputFile = "./examples-json/bodysite.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "BodySite", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition92FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-deliveryinstallationtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-deliveryInstallationType", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition93FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsinterpretation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsInterpretation", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet81FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-metric-calibration-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "metric-calibration-type", valueset.getId());
      }
      @Test
      public void testLoadBundle5FromJson() throws Exception {
         String inputFile = "./examples-json/xds-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "xds", bundle.getId());
      }
      @Test
      public void testLoadObservation10FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-genetics-3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-genetics-3", observation.getId());
      }
      @Test
      public void testLoadBundle6FromJson() throws Exception {
         String inputFile = "./examples-json/profiles-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "types", bundle.getId());
      }
      @Test
      public void testLoadOperationDefinition9FromJson() throws Exception {
         String inputFile = "./examples-json/operation-servicedefinition-data-requirements.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ServiceDefinition-data-requirements", operationdefinition.getId());
      }
      @Test
      public void testLoadClaim3FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-pharmacy-compound.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "760152", claim.getId());
      }
      @Test
      public void testLoadStructureDefinition94FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedurerequest-authorizedby.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedurerequest-authorizedBy", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet82FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-cardinality-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-cardinality-behavior", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition95FromJson() throws Exception {
         String inputFile = "./examples-json/extension-capabilitystatement-supported-system.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "capabilitystatement-supported-system", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet83FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-allergy-intolerance-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "allergy-intolerance-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet84FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-report-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "report-codes", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem59FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-location-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "location-mode", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem60FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-address-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "address-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem61FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-allergy-intolerance-criticality.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "allergy-intolerance-criticality", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition96FromJson() throws Exception {
         String inputFile = "./examples-json/episodeofcare.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "EpisodeOfCare", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem62FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-claim-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "claim-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet85FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-reason-medication-not-taken-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "reason-medication-not-taken-codes", valueset.getId());
      }
      @Test
      public void testLoadBodySite2FromJson() throws Exception {
         String inputFile = "./examples-json/bodysite-example-fetus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         BodySite bodysite = BodySiteHelper.fromJson(json);
         assertEquals("Expect ", "fetus", bodysite.getId());
      }
      @Test
      public void testLoadAppointmentResponse1FromJson() throws Exception {
         String inputFile = "./examples-json/appointmentresponse-example-req.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AppointmentResponse appointmentresponse = AppointmentResponseHelper.fromJson(json);
         assertEquals("Expect ", "exampleresp", appointmentresponse.getId());
      }
      @Test
      public void testLoadCodeSystem63FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-encounter-discharge-disposition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "encounter-discharge-disposition", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition97FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-deliveryaddressline.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-deliveryAddressLine", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet86FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-definition-topic.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "definition-topic", valueset.getId());
      }
      @Test
      public void testLoadValueSet87FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-languages.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "languages", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem64FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contributor-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contributor-type", codesystem.getId());
      }
      @Test
      public void testLoadContract2FromJson() throws Exception {
         String inputFile = "./examples-json/contract-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Contract contract = ContractHelper.fromJson(json);
         assertEquals("Expect ", "C-123", contract.getId());
      }
      @Test
      public void testLoadPractitioner4FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f203-jvg.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f203", practitioner.getId());
      }
      @Test
      public void testLoadStructureDefinition98FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-ancestor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-ancestor", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationStatement1FromJson() throws Exception {
         String inputFile = "./examples-json/medicationstatementexample3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationStatement medicationstatement = MedicationStatementHelper.fromJson(json);
         assertEquals("Expect ", "example003", medicationstatement.getId());
      }
      @Test
      public void testLoadValueSet88FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-reason-medication-not-given-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "reason-medication-not-given-codes", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition99FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-nationality.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-nationality", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition100FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-housenumber.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-houseNumber", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem65FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-concept-map-equivalence.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "concept-map-equivalence", codesystem.getId());
      }
      @Test
      public void testLoadValueSet89FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-discharge-disposition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-discharge-disposition", valueset.getId());
      }
      @Test
      public void testLoadValueSet90FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-payment-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "payment-type", valueset.getId());
      }
      @Test
      public void testLoadSequence7FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-graphic-example-1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "graphic-example-1", sequence.getId());
      }
      @Test
      public void testLoadCodeSystem66FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-practitioner-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "practitioner-role", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem67FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contract-term-subtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contract-term-subtype", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition101FromJson() throws Exception {
         String inputFile = "./examples-json/extension-rendering-stylesensitive.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "rendering-styleSensitive", structuredefinition.getId());
      }
      @Test
      public void testLoadRiskAssessment2FromJson() throws Exception {
         String inputFile = "./examples-json/riskassessment-example-prognosis.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RiskAssessment riskassessment = RiskAssessmentHelper.fromJson(json);
         assertEquals("Expect ", "prognosis", riskassessment.getId());
      }
      @Test
      public void testLoadValueSet91FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-history-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "history-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem68FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-resource-type-link.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "resource-type-link", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem69FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-service-modifiers.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "service-modifiers", codesystem.getId());
      }
      @Test
      public void testLoadValueSet92FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-measure-population.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "measure-population", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition102FromJson() throws Exception {
         String inputFile = "./examples-json/familymemberhistory.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "FamilyMemberHistory", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition103FromJson() throws Exception {
         String inputFile = "./examples-json/humanname.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "HumanName", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition104FromJson() throws Exception {
         String inputFile = "./examples-json/extension-regex.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "regex", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet93FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contract-actorrole.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contract-actorrole", valueset.getId());
      }
      @Test
      public void testLoadValueSet94FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-form-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-form-codes", valueset.getId());
      }
      @Test
      public void testLoadTestScript2FromJson() throws Exception {
         String inputFile = "./examples-json/testscript-example-update.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         TestScript testscript = TestScriptHelper.fromJson(json);
         assertEquals("Expect ", "testscript-example-update", testscript.getId());
      }
      @Test
      public void testLoadStructureDefinition105FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-demap.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-deMap", structuredefinition.getId());
      }
      @Test
      public void testLoadProcedureRequest3FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-colonoscopy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "colonoscopy", procedurerequest.getId());
      }
      @Test
      public void testLoadStructureDefinition106FromJson() throws Exception {
         String inputFile = "./examples-json/distance.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Distance", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet95FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-selection-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-selection-behavior", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition107FromJson() throws Exception {
         String inputFile = "./examples-json/extension-encounter-reasoncancelled.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "encounter-reasonCancelled", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition108FromJson() throws Exception {
         String inputFile = "./examples-json/extension-pharmacy-core-rateincrement.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "pharmacy-core-rateIncrement", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem70FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-action-participant-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "action-participant-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition109FromJson() throws Exception {
         String inputFile = "./examples-json/extension-organization-preferredcontact.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "organization-preferredContact", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition110FromJson() throws Exception {
         String inputFile = "./examples-json/narrative.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Narrative", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense8FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0312.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0312", medicationdispense.getId());
      }
      @Test
      public void testLoadSequence8FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-example-pgx-1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "example-pgx-1", sequence.getId());
      }
      @Test
      public void testLoadCodeSystem71FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-cqif-evidence-quality.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "cqif-evidence-quality", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem72FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-reason-medication-not-given-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "reason-medication-not-given-codes", codesystem.getId());
      }
      @Test
      public void testLoadMedicationDispense9FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0305.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0305", medicationdispense.getId());
      }
      @Test
      public void testLoadValueSet96FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-timing-abbreviation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "timing-abbreviation", valueset.getId());
      }
      @Test
      public void testLoadMedicationRequest4FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0320.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0320", medicationrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition111FromJson() throws Exception {
         String inputFile = "./examples-json/oid.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "oid", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet97FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-all-languages.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "all-languages", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem73FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-immunization-origin.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "immunization-origin", codesystem.getId());
      }
      @Test
      public void testLoadSlot1FromJson() throws Exception {
         String inputFile = "./examples-json/slot-example-unavailable.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Slot slot = SlotHelper.fromJson(json);
         assertEquals("Expect ", "3", slot.getId());
      }
      @Test
      public void testLoadDeviceComponent2FromJson() throws Exception {
         String inputFile = "./examples-json/devicecomponent-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DeviceComponent devicecomponent = DeviceComponentHelper.fromJson(json);
         assertEquals("Expect ", "example", devicecomponent.getId());
      }
      @Test
      public void testLoadCodeSystem74FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-message-significance-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "message-significance-category", codesystem.getId());
      }
      @Test
      public void testLoadValueSet98FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-c80-practice-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "c80-practice-codes", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem75FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-substance-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "substance-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition112FromJson() throws Exception {
         String inputFile = "./examples-json/contributor.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Contributor", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition113FromJson() throws Exception {
         String inputFile = "./examples-json/address.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Address", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaireResponse2FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaireresponse-example-ussg-fht-answers.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         QuestionnaireResponse questionnaireresponse = QuestionnaireResponseHelper.fromJson(json);
         assertEquals("Expect ", "ussg-fht-answers", questionnaireresponse.getId());
      }
      @Test
      public void testLoadQuestionnaire30FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition114FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedurerequest-targetbodysite.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedurerequest-targetBodySite", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet99FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ex-onsettype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ex-onsettype", valueset.getId());
      }
      @Test
      public void testLoadValueSet100FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-graph-compartment-rule.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "graph-compartment-rule", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem76FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-immunization-recommendation-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "immunization-recommendation-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet101FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-doc-typecodes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "doc-typecodes", valueset.getId());
      }
      @Test
      public void testLoadPatient2FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-chinese.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "ch-example", patient.getId());
      }
      @Test
      public void testLoadValueSet102FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-codesystem-hierarchy-meaning.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-hierarchy-meaning", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem77FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-w3c-provenance-activity-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "w3c-provenance-activity-type", codesystem.getId());
      }
      @Test
      public void testLoadAccount1FromJson() throws Exception {
         String inputFile = "./examples-json/account-example-with-guarantor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Account account = AccountHelper.fromJson(json);
         assertEquals("Expect ", "ewg", account.getId());
      }
      @Test
      public void testLoadValueSet103FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ucum-units.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ucum-units", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition115FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-sourcereference.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-sourceReference", structuredefinition.getId());
      }
      @Test
      public void testLoadBasic1FromJson() throws Exception {
         String inputFile = "./examples-json/basic-example-narrative.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Basic basic = BasicHelper.fromJson(json);
         assertEquals("Expect ", "basic-example-narrative", basic.getId());
      }
      @Test
      public void testLoadCodeSystem78FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-resource-slicing-rules.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "resource-slicing-rules", codesystem.getId());
      }
      @Test
      public void testLoadPatient3FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "example", patient.getId());
      }
      @Test
      public void testLoadObservation11FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-body-height.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "body-height", observation.getId());
      }
      @Test
      public void testLoadCarePlan2FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "example", careplan.getId());
      }
      @Test
      public void testLoadCodeSystem79FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-match-grade.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "match-grade", codesystem.getId());
      }
      @Test
      public void testLoadActivityDefinition5FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-supplyrequest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ActivityDefinition activitydefinition = ActivityDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "blood-tubes-supply", activitydefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition116FromJson() throws Exception {
         String inputFile = "./examples-json/bp.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "bp", structuredefinition.getId());
      }
      @Test
      public void testLoadBundle7FromJson() throws Exception {
         String inputFile = "./examples-json/patient-examples-general.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "b248b1b2-1686-4b94-9936-37d7a5f94b51", bundle.getId());
      }
      @Test
      public void testLoadValueSet104FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-usage-context-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "usage-context-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem80FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-message-events.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "message-events", codesystem.getId());
      }
      @Test
      public void testLoadValueSet105FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-dataelement-sdcobjectclass.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "dataelement-sdcobjectclass", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire31FromJson() throws Exception {
         String inputFile = "./examples-json/location-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet106FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-type-restful-interaction.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "type-restful-interaction", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition117FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-maxoccurs.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-maxOccurs", structuredefinition.getId());
      }
      @Test
      public void testLoadClaim4FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-oral-identifier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "100154", claim.getId());
      }
      @Test
      public void testLoadCodeSystem81FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adverse-event-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-outcome", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition118FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Practitioner", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet107FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-sequence-species.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "sequence-species", valueset.getId());
      }
      @Test
      public void testLoadValueSet108FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-event-capability-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "event-capability-mode", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire32FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaire-example-gcs.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "gcs", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet109FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-name-v3-representation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "name-v3-representation", valueset.getId());
      }
      @Test
      public void testLoadPlanDefinition3FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-options-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "options-example", plandefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest5FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0304.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0304", medicationrequest.getId());
      }
      @Test
      public void testLoadCodeSystem82FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-identifier-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "identifier-type", codesystem.getId());
      }
      @Test
      public void testLoadPractitionerRole1FromJson() throws Exception {
         String inputFile = "./examples-json/practitionerrole-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PractitionerRole practitionerrole = PractitionerRoleHelper.fromJson(json);
         assertEquals("Expect ", "example", practitionerrole.getId());
      }
      @Test
      public void testLoadValueSet110FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-sibling-relationship-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "sibling-relationship-codes", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem83FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-condition-clinical.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "condition-clinical", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition119FromJson() throws Exception {
         String inputFile = "./examples-json/extension-diagnosticreport-geneticsfamilymemberhistory.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DiagnosticReport-geneticsFamilyMemberHistory", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaireResponse3FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaireresponse-example-gcs.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         QuestionnaireResponse questionnaireresponse = QuestionnaireResponseHelper.fromJson(json);
         assertEquals("Expect ", "gcs", questionnaireresponse.getId());
      }
      @Test
      public void testLoadStructureDefinition120FromJson() throws Exception {
         String inputFile = "./examples-json/extension-location-alias.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "location-alias", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet111FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-fips-county.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "fips-county", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem84FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-constraint-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "constraint-severity", codesystem.getId());
      }
      @Test
      public void testLoadSubstance2FromJson() throws Exception {
         String inputFile = "./examples-json/substance-example-f201-dust.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Substance substance = SubstanceHelper.fromJson(json);
         assertEquals("Expect ", "f201", substance.getId());
      }
      @Test
      public void testLoadBundle8FromJson() throws Exception {
         String inputFile = "./examples-json/bundle-response.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "bundle-response", bundle.getId());
      }
      @Test
      public void testLoadValueSet112FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-procedure-followup.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "procedure-followup", valueset.getId());
      }
      @Test
      public void testLoadValueSet113FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-benefit-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "benefit-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet114FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adverse-event-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem85FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-codesystem-hierarchy-meaning.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-hierarchy-meaning", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition121FromJson() throws Exception {
         String inputFile = "./examples-json/elementdefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ElementDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadSubstance3FromJson() throws Exception {
         String inputFile = "./examples-json/substance-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Substance substance = SubstanceHelper.fromJson(json);
         assertEquals("Expect ", "example", substance.getId());
      }
      @Test
      public void testLoadQuestionnaire33FromJson() throws Exception {
         String inputFile = "./examples-json/composition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet115FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-list-empty-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "list-empty-reason", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem86FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adverse-event-causality.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-causality", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire34FromJson() throws Exception {
         String inputFile = "./examples-json/practitionerrole-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire35FromJson() throws Exception {
         String inputFile = "./examples-json/medicationstatement-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition122FromJson() throws Exception {
         String inputFile = "./examples-json/extension-familymemberhistory-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "familymemberhistory-type", structuredefinition.getId());
      }
      @Test
      public void testLoadProvenance2FromJson() throws Exception {
         String inputFile = "./examples-json/provenance-consent-signature.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Provenance provenance = ProvenanceHelper.fromJson(json);
         assertEquals("Expect ", "consent-signature", provenance.getId());
      }
      @Test
      public void testLoadCodeSystem87FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-metric-color.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "metric-color", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition123FromJson() throws Exception {
         String inputFile = "./examples-json/relatedperson.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "RelatedPerson", structuredefinition.getId());
      }
      @Test
      public void testLoadOrganization2FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-lab.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "1832473e-2fe0-452d-abe9-3cdb9879522f", organization.getId());
      }
      @Test
      public void testLoadValueSet116FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ex-diagnosistype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ex-diagnosistype", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition124FromJson() throws Exception {
         String inputFile = "./examples-json/extension-medicationdispense-validityperiod.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "medicationdispense-validityPeriod", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem88FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-remittance-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "remittance-outcome", codesystem.getId());
      }
      @Test
      public void testLoadBundle9FromJson() throws Exception {
         String inputFile = "./examples-json/bundle-request-medsallergies.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "bundle-request-medsallergies", bundle.getId());
      }
      @Test
      public void testLoadCodeSystem89FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-measure-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "measure-type", codesystem.getId());
      }
      @Test
      public void testLoadEncounter2FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example-f001-heart.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "f001", encounter.getId());
      }
      @Test
      public void testLoadStructureDefinition125FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedurerequest-geneticsitem.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedurerequest-geneticsItem", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition126FromJson() throws Exception {
         String inputFile = "./examples-json/extension-coding-sctdescid.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "coding-sctdescid", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition127FromJson() throws Exception {
         String inputFile = "./examples-json/usagecontext.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "UsageContext", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest6FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0309.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0309", medicationrequest.getId());
      }
      @Test
      public void testLoadValueSet117FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-fundsreserve.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "fundsreserve", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition128FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-genetics.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "diagnosticreport-genetics", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition129FromJson() throws Exception {
         String inputFile = "./examples-json/extension-practitioner-animalspecies.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "practitioner-animalSpecies", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem90FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-procedure-progress-status-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "procedure-progress-status-codes", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition130FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedure-causedby.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedure-causedBy", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet118FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-vaccination-protocol-dose-status-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "vaccination-protocol-dose-status-reason", valueset.getId());
      }
      @Test
      public void testLoadValueSet119FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-goal-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "goal-status", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire36FromJson() throws Exception {
         String inputFile = "./examples-json/clinicalimpression-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition131FromJson() throws Exception {
         String inputFile = "./examples-json/parameters.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Parameters", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition132FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-system.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-system", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire37FromJson() throws Exception {
         String inputFile = "./examples-json/observation-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire38FromJson() throws Exception {
         String inputFile = "./examples-json/messageheader-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire39FromJson() throws Exception {
         String inputFile = "./examples-json/namingsystem-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet120FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-measurement-principle.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "measurement-principle", valueset.getId());
      }
      @Test
      public void testLoadValueSet121FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-manifestation-or-symptom.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "manifestation-or-symptom", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem91FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-list-example-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "list-example-codes", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem92FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-testscript-operation-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "testscript-operation-codes", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition133FromJson() throws Exception {
         String inputFile = "./examples-json/extension-resource-approvaldate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "resource-approvalDate", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationAdministration1FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0302.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0302", medicationadministration.getId());
      }
      @Test
      public void testLoadStructureDefinition134FromJson() throws Exception {
         String inputFile = "./examples-json/extension-communicationrequest-supportinginfo.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "communicationrequest-supportingInfo", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense10FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0310.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0310", medicationdispense.getId());
      }
      @Test
      public void testLoadSearchParameter5FromJson() throws Exception {
         String inputFile = "./examples-json/condition-extensions-Condition-part-of.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "condition-extensions-Condition-part-of", searchparameter.getId());
      }
      @Test
      public void testLoadCareTeam1FromJson() throws Exception {
         String inputFile = "./examples-json/careteam-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CareTeam careteam = CareTeamHelper.fromJson(json);
         assertEquals("Expect ", "example", careteam.getId());
      }
      @Test
      public void testLoadCodeSystem93FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-slotstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "slotstatus", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition135FromJson() throws Exception {
         String inputFile = "./examples-json/extension-condition-occurredfollowing.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "condition-occurredFollowing", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet122FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-consent-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "consent-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet123FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-goal-acceptance-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "goal-acceptance-status", valueset.getId());
      }
      @Test
      public void testLoadSpecimen1FromJson() throws Exception {
         String inputFile = "./examples-json/specimen-example-serum.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Specimen specimen = SpecimenHelper.fromJson(json);
         assertEquals("Expect ", "sst", specimen.getId());
      }
      @Test
      public void testLoadCodeSystem94FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-allergy-intolerance-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "allergy-intolerance-category", codesystem.getId());
      }
      @Test
      public void testLoadObservation12FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-sample-data.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "ekg", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition136FromJson() throws Exception {
         String inputFile = "./examples-json/careplan.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CarePlan", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem95FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-questionnaire-display-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-display-category", codesystem.getId());
      }
      @Test
      public void testLoadObservation13FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-1minute-apgar-score.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "1minute-apgar-score", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition137FromJson() throws Exception {
         String inputFile = "./examples-json/extension-openehr-careplan.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "openEHR-careplan", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet124FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-namingsystem-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "namingsystem-type", valueset.getId());
      }
      @Test
      public void testLoadConceptMap5FromJson() throws Exception {
         String inputFile = "./examples-json/cm-data-absent-reason-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-data-absent-reason-v3", conceptmap.getId());
      }
      @Test
      public void testLoadLibrary2FromJson() throws Exception {
         String inputFile = "./examples-json/library-zika-virus-intervention-logic.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "zika-virus-intervention-logic", library.getId());
      }
      @Test
      public void testLoadCondition4FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-f205-infection.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "f205", condition.getId());
      }
      @Test
      public void testLoadQuestionnaire40FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadLibrary3FromJson() throws Exception {
         String inputFile = "./examples-json/library-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "example", library.getId());
      }
      @Test
      public void testLoadOperationDefinition10FromJson() throws Exception {
         String inputFile = "./examples-json/operation-codesystem-lookup.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CodeSystem-lookup", operationdefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition138FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-sourcestructuremap.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-sourceStructureMap", structuredefinition.getId());
      }
      @Test
      public void testLoadConsent3FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-notOrg.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-notOrg", consent.getId());
      }
      @Test
      public void testLoadStructureDefinition139FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-fhirtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-fhirType", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem96FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-related-claim-relationship.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "related-claim-relationship", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem97FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-supplyrequest-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "supplyrequest-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet125FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-bundle-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "bundle-type", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire41FromJson() throws Exception {
         String inputFile = "./examples-json/guidanceresponse-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire42FromJson() throws Exception {
         String inputFile = "./examples-json/organization-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition140FromJson() throws Exception {
         String inputFile = "./examples-json/extension-allergyintolerance-resolutionage.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "allergyintolerance-resolutionAge", structuredefinition.getId());
      }
      @Test
      public void testLoadActivityDefinition6FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-procedurerequest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ActivityDefinition activitydefinition = ActivityDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "heart-valve-replacement", activitydefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition141FromJson() throws Exception {
         String inputFile = "./examples-json/integer.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "integer", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem98FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adjudication.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adjudication", codesystem.getId());
      }
      @Test
      public void testLoadValueSet126FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-immunization-recommendation-date-criterion.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "immunization-recommendation-date-criterion", valueset.getId());
      }
      @Test
      public void testLoadRiskAssessment3FromJson() throws Exception {
         String inputFile = "./examples-json/riskassessment-example-population.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RiskAssessment riskassessment = RiskAssessmentHelper.fromJson(json);
         assertEquals("Expect ", "population", riskassessment.getId());
      }
      @Test
      public void testLoadNamingSystem2FromJson() throws Exception {
         String inputFile = "./examples-json/namingsystem-example-replaced.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NamingSystem namingsystem = NamingSystemHelper.fromJson(json);
         assertEquals("Expect ", "example-replaced", namingsystem.getId());
      }
      @Test
      public void testLoadStructureDefinition142FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-buildingnumbersuffix.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-buildingNumberSuffix", structuredefinition.getId());
      }
      @Test
      public void testLoadDiagnosticReport2FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-gingival-mass.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "gingival-mass", diagnosticreport.getId());
      }
      @Test
      public void testLoadStructureDefinition143FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-de-change-description.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-de-change-description", structuredefinition.getId());
      }
      @Test
      public void testLoadFlag1FromJson() throws Exception {
         String inputFile = "./examples-json/flag-example-encounter.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Flag flag = FlagHelper.fromJson(json);
         assertEquals("Expect ", "example-encounter", flag.getId());
      }
      @Test
      public void testLoadStructureDefinition144FromJson() throws Exception {
         String inputFile = "./examples-json/extension-http-response-header.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "http-response-header", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem99FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-classification-or-context.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "classification-or-context", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition145FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-warning.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-warning", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense11FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0306.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0306", medicationdispense.getId());
      }
      @Test
      public void testLoadValueSet127FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-audit-event-sub-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "audit-event-sub-type", valueset.getId());
      }
      @Test
      public void testLoadMedicationDispense12FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0321.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0321", medicationdispense.getId());
      }
      @Test
      public void testLoadCoverage3FromJson() throws Exception {
         String inputFile = "./examples-json/coverage-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Coverage coverage = CoverageHelper.fromJson(json);
         assertEquals("Expect ", "9876B1", coverage.getId());
      }
      @Test
      public void testLoadValueSet128FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-postal-address-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "postal-address-use", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition146FromJson() throws Exception {
         String inputFile = "./examples-json/extension-device-implant-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "device-implant-status", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition147FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsdnasequencevarianttype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsDNASequenceVariantType", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition148FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-unittype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-unitType", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition149FromJson() throws Exception {
         String inputFile = "./examples-json/extension-auditevent-numberofinstances.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "auditevent-NumberOfInstances", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet129FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-testscript-profile-origin-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "testscript-profile-origin-types", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition150FromJson() throws Exception {
         String inputFile = "./examples-json/riskassessment.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "RiskAssessment", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet130FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-specimen-collection-method.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "specimen-collection-method", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire43FromJson() throws Exception {
         String inputFile = "./examples-json/endpoint-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire44FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityresponse-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition151FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-casesensitive.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-caseSensitive", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition152FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-displaycategory.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-displayCategory", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem100FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-care-team-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "care-team-status", codesystem.getId());
      }
      @Test
      public void testLoadObservation14FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-unsat.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "unsat", observation.getId());
      }
      @Test
      public void testLoadDeviceMetric1FromJson() throws Exception {
         String inputFile = "./examples-json/devicemetric-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DeviceMetric devicemetric = DeviceMetricHelper.fromJson(json);
         assertEquals("Expect ", "example", devicemetric.getId());
      }
      @Test
      public void testLoadCodeSystem101FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-service-referral-method.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "service-referral-method", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire45FromJson() throws Exception {
         String inputFile = "./examples-json/schedule-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem102FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-identity-assuranceLevel.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "identity-assuranceLevel", codesystem.getId());
      }
      @Test
      public void testLoadValueSet131FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-episodeofcare-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "episodeofcare-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition153FromJson() throws Exception {
         String inputFile = "./examples-json/namingsystem.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "NamingSystem", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet132FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-dicom-cid29.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "dicom-cid29", valueset.getId());
      }
      @Test
      public void testLoadValueSet133FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-codesystem-content-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-content-mode", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition154FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-sc-coding.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-SC-coding", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition155FromJson() throws Exception {
         String inputFile = "./examples-json/extension-condition-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "condition-outcome", structuredefinition.getId());
      }
      @Test
      public void testLoadMedication7FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0303.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0303", medication.getId());
      }
      @Test
      public void testLoadValueSet134FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-codes", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire46FromJson() throws Exception {
         String inputFile = "./examples-json/referralrequest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet135FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-guide-dependency-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "guide-dependency-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem103FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-request-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-request-priority", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition156FromJson() throws Exception {
         String inputFile = "./examples-json/codeableconcept.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CodeableConcept", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest7FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0308.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0308", medicationrequest.getId());
      }
      @Test
      public void testLoadValueSet136FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-care-plan-activity-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-activity-category", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition157FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-censustract.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-censusTract", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition158FromJson() throws Exception {
         String inputFile = "./examples-json/appointmentresponse.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "AppointmentResponse", structuredefinition.getId());
      }
      @Test
      public void testLoadSearchParameter6FromJson() throws Exception {
         String inputFile = "./examples-json/elementdefinition-11179-DataElement-objectClassProperty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-11179-DataElement-objectClassProperty", searchparameter.getId());
      }
      @Test
      public void testLoadStructureDefinition159FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsdnasequencevariantname.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsDNASequenceVariantName", structuredefinition.getId());
      }
      @Test
      public void testLoadOrganization3FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-f001-burgers.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "f001", organization.getId());
      }
      @Test
      public void testLoadMeasure2FromJson() throws Exception {
         String inputFile = "./examples-json/measure-component-a-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Measure measure = MeasureHelper.fromJson(json);
         assertEquals("Expect ", "component-a-example", measure.getId());
      }
      @Test
      public void testLoadValueSet137FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-care-plan-activity-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-activity-outcome", valueset.getId());
      }
      @Test
      public void testLoadValueSet138FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-task-performer-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "task-performer-type", valueset.getId());
      }
      @Test
      public void testLoadNutritionOrder4FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-cardiacdiet.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "cardiacdiet", nutritionorder.getId());
      }
      @Test
      public void testLoadOperationOutcome2FromJson() throws Exception {
         String inputFile = "./examples-json/operationoutcome-example-allok.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationOutcome operationoutcome = OperationOutcomeHelper.fromJson(json);
         assertEquals("Expect ", "allok", operationoutcome.getId());
      }
      @Test
      public void testLoadCodeSystem104FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-policyholder-relationship.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "policyholder-relationship", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire47FromJson() throws Exception {
         String inputFile = "./examples-json/appointment-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition160FromJson() throws Exception {
         String inputFile = "./examples-json/extension-referralrequest-reasonrefused.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "referralrequest-reasonRefused", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition161FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsphaseset.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsPhaseSet", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem105FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-guide-dependency-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "guide-dependency-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition162FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-bindingname.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-bindingName", structuredefinition.getId());
      }
      @Test
      public void testLoadPlanDefinition4FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-predecessor-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "zika-virus-intervention-initial", plandefinition.getId());
      }
      @Test
      public void testLoadCodeSystem106FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-map-model-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "map-model-mode", codesystem.getId());
      }
      @Test
      public void testLoadValueSet139FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-search-modifier-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "search-modifier-code", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition163FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-expirationdate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-expirationDate", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem107FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-extension-context.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "extension-context", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem108FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-payment-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "payment-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem109FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-audit-entity-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "audit-entity-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition164FromJson() throws Exception {
         String inputFile = "./examples-json/extension.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Extension", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition165FromJson() throws Exception {
         String inputFile = "./examples-json/testscript.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "TestScript", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition166FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-de-is-data-element-concept.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-de-is-data-element-concept", structuredefinition.getId());
      }
      @Test
      public void testLoadProcedureRequest4FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-colonoscopy-bx.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "colon-biopsy", procedurerequest.getId());
      }
      @Test
      public void testLoadStructureDefinition167FromJson() throws Exception {
         String inputFile = "./examples-json/supplydelivery.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "SupplyDelivery", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationAdministration2FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0301.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0301", medicationadministration.getId());
      }
      @Test
      public void testLoadValueSet140FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-subscription-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "subscription-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem110FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-filter-operator.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "filter-operator", codesystem.getId());
      }
      @Test
      public void testLoadProcedure5FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-implant.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "example-implant", procedure.getId());
      }
      @Test
      public void testLoadDiagnosticReport3FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-dxa.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "102", diagnosticreport.getId());
      }
      @Test
      public void testLoadCodeSystem111FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-flag-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "flag-priority", codesystem.getId());
      }
      @Test
      public void testLoadObservation15FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-satO2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "satO2", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition168FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-replacedby.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-replacedby", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem112FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-flag-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "flag-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem113FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-coverage-selfpay.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "coverage-selfpay", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire48FromJson() throws Exception {
         String inputFile = "./examples-json/heartrate-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition169FromJson() throws Exception {
         String inputFile = "./examples-json/extension-composition-clindoc-otherconfidentiality.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "composition-clindoc-otherConfidentiality", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet141FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-endpoint-payload-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "endpoint-payload-type", valueset.getId());
      }
      @Test
      public void testLoadBinary1FromJson() throws Exception {
         String inputFile = "./examples-json/binary-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Binary binary = BinaryHelper.fromJson(json);
         assertEquals("Expect ", "example", binary.getId());
      }
      @Test
      public void testLoadPatient4FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-ihe-pcd.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "ihe-pcd", patient.getId());
      }
      @Test
      public void testLoadObservation16FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-genetics-2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-genetics-2", observation.getId());
      }
      @Test
      public void testLoadValueSet142FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-binding-strength.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "binding-strength", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem114FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-iso-21089-lifecycle.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "iso-21089-lifecycle", codesystem.getId());
      }
      @Test
      public void testLoadValueSet143FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-service-pharmacy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "service-pharmacy", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem115FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-assert-direction-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "assert-direction-codes", codesystem.getId());
      }
      @Test
      public void testLoadMedication8FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0302.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0302", medication.getId());
      }
      @Test
      public void testLoadValueSet144FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-service-product.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "service-product", valueset.getId());
      }
      @Test
      public void testLoadValueSet145FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-required-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-required-behavior", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire49FromJson() throws Exception {
         String inputFile = "./examples-json/operationdefinition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition170FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-minoccurs.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-minOccurs", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem116FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-fundsreserve.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "fundsreserve", codesystem.getId());
      }
      @Test
      public void testLoadOperationOutcome3FromJson() throws Exception {
         String inputFile = "./examples-json/operationoutcome-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationOutcome operationoutcome = OperationOutcomeHelper.fromJson(json);
         assertEquals("Expect ", "101", operationoutcome.getId());
      }
      @Test
      public void testLoadCodeSystem117FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-signature-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "signature-type", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire50FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-genetics-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem118FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-list-empty-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "list-empty-reason", codesystem.getId());
      }
      @Test
      public void testLoadAppointmentResponse2FromJson() throws Exception {
         String inputFile = "./examples-json/appointmentresponse-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AppointmentResponse appointmentresponse = AppointmentResponseHelper.fromJson(json);
         assertEquals("Expect ", "example", appointmentresponse.getId());
      }
      @Test
      public void testLoadSearchParameter7FromJson() throws Exception {
         String inputFile = "./examples-json/organization-extensions-Organization-alias.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "organization-extensions-Organization-alias", searchparameter.getId());
      }
      @Test
      public void testLoadStructureDefinition171FromJson() throws Exception {
         String inputFile = "./examples-json/implementationguide.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ImplementationGuide", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire51FromJson() throws Exception {
         String inputFile = "./examples-json/bodytemp-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet146FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-search-xpath-usage.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "search-xpath-usage", valueset.getId());
      }
      @Test
      public void testLoadClaim5FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-oral-orthoplan.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "100153", claim.getId());
      }
      @Test
      public void testLoadCarePlan3FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-f001-heart.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "f001", careplan.getId());
      }
      @Test
      public void testLoadPlanDefinition5FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-exclusive-breastfeeding-intervention-02.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "exclusive-breastfeeding-intervention-02", plandefinition.getId());
      }
      @Test
      public void testLoadTask1FromJson() throws Exception {
         String inputFile = "./examples-json/task-example2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Task task = TaskHelper.fromJson(json);
         assertEquals("Expect ", "example2", task.getId());
      }
      @Test
      public void testLoadStructureDefinition172FromJson() throws Exception {
         String inputFile = "./examples-json/extension-humanname-own-name.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "humanname-own-name", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition173FromJson() throws Exception {
         String inputFile = "./examples-json/extension-identifier-validdate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "identifier-validDate", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem119FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-conditional-delete-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "conditional-delete-status", codesystem.getId());
      }
      @Test
      public void testLoadObservation17FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f203-bicarbonate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f203", observation.getId());
      }
      @Test
      public void testLoadValueSet147FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-sequence-quality-standardSequence.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "sequence-quality-standardSequence", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition174FromJson() throws Exception {
         String inputFile = "./examples-json/extension-task-replaces.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "task-replaces", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition175FromJson() throws Exception {
         String inputFile = "./examples-json/binary.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Binary", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet148FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-observation-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "observation-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet149FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contract-content-derivative.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contract-content-derivative", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire52FromJson() throws Exception {
         String inputFile = "./examples-json/lipidprofile-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition176FromJson() throws Exception {
         String inputFile = "./examples-json/extension-hla-genotyping-results-haploid.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "hla-genotyping-results-haploid", structuredefinition.getId());
      }
      @Test
      public void testLoadPatient5FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-c.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "pat3", patient.getId());
      }
      @Test
      public void testLoadObservation18FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-body-length.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "body-length", observation.getId());
      }
      @Test
      public void testLoadDiagnosticReport4FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-genetics-comprehensive-bone-marrow-report.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "report", diagnosticreport.getId());
      }
      @Test
      public void testLoadCodeSystem120FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-service-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "service-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition177FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-ballot-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-ballot-status", structuredefinition.getId());
      }
      @Test
      public void testLoadBundle10FromJson() throws Exception {
         String inputFile = "./examples-json/location-examples-general.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "3ad0687e-f477-468c-afd5-fcc2bf897819", bundle.getId());
      }
      @Test
      public void testLoadDiagnosticReport5FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-f202-bloodculture.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "f202", diagnosticreport.getId());
      }
      @Test
      public void testLoadCodeSystem121FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-allergy-verification-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "allergy-verification-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition178FromJson() throws Exception {
         String inputFile = "./examples-json/parameterdefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ParameterDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet150FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-teeth.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "teeth", valueset.getId());
      }
      @Test
      public void testLoadValueSet151FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-nutrient-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "nutrient-code", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition179FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-deliveryinstallationqualifier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-deliveryInstallationQualifier", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest8FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0329.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0329", medicationrequest.getId());
      }
      @Test
      public void testLoadValueSet152FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-unknown-content-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "unknown-content-code", valueset.getId());
      }
      @Test
      public void testLoadGraphDefinition1FromJson() throws Exception {
         String inputFile = "./examples-json/graphdefinition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         GraphDefinition graphdefinition = GraphDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "example", graphdefinition.getId());
      }
      @Test
      public void testLoadPractitioner5FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f007-sh.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f007", practitioner.getId());
      }
      @Test
      public void testLoadStructureDefinition180FromJson() throws Exception {
         String inputFile = "./examples-json/task.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Task", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition181FromJson() throws Exception {
         String inputFile = "./examples-json/extension-consent-witness.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "consent-Witness", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet153FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-reason", valueset.getId());
      }
      @Test
      public void testLoadNutritionOrder5FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-enteralbolus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "enteralbolus", nutritionorder.getId());
      }
      @Test
      public void testLoadCodeSystem122FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-immunization-recommendation-date-criterion.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "immunization-recommendation-date-criterion", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire53FromJson() throws Exception {
         String inputFile = "./examples-json/goal-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadPractitioner6FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f003-mv.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f003", practitioner.getId());
      }
      @Test
      public void testLoadValueSet154FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-sequence-quality-method.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "sequence-quality-method", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition182FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-effectivedate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-effectiveDate", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet155FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adjudication-error.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adjudication-error", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition183FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedurerequest-approachbodysite.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedurerequest-approachBodySite", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition184FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-translatable.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-translatable", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem123FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-trigger-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "trigger-type", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire54FromJson() throws Exception {
         String inputFile = "./examples-json/enrollmentrequest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire55FromJson() throws Exception {
         String inputFile = "./examples-json/riskassessment-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem124FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-location-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "location-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition185FromJson() throws Exception {
         String inputFile = "./examples-json/extension-pharmacy-core-rategoal.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "pharmacy-core-rateGoal", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem125FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-vaccination-protocol-dose-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "vaccination-protocol-dose-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition186FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-table-name.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-table-name", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition187FromJson() throws Exception {
         String inputFile = "./examples-json/extension-pharmacy-core-rateincrementinterval.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "pharmacy-core-rateIncrementInterval", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest9FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0317.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0317", medicationrequest.getId());
      }
      @Test
      public void testLoadCodeSystem126FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-namingsystem-identifier-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "namingsystem-identifier-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition188FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "MedicationDispense", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet156FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-location-physical-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "location-physical-type", valueset.getId());
      }
      @Test
      public void testLoadProcedureRequest5FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-appendectomy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "appendectomy-narrative", procedurerequest.getId());
      }
      @Test
      public void testLoadOperationDefinition11FromJson() throws Exception {
         String inputFile = "./examples-json/operation-structuredefinition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "StructureDefinition-questionnaire", operationdefinition.getId());
      }
      @Test
      public void testLoadProcedure6FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-colonoscopy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "colonoscopy", procedure.getId());
      }
      @Test
      public void testLoadObservation19FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-genetics-5.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-genetics-5", observation.getId());
      }
      @Test
      public void testLoadDiagnosticReport6FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-ghp.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "ghp", diagnosticreport.getId());
      }
      @Test
      public void testLoadValueSet157FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-allergy-clinical-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "allergy-clinical-status", valueset.getId());
      }
      @Test
      public void testLoadFHIRList3FromJson() throws Exception {
         String inputFile = "./examples-json/list-example-medlist.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FHIRList fhirlist = FHIRListHelper.fromJson(json);
         assertEquals("Expect ", "med-list", fhirlist.getId());
      }
      @Test
      public void testLoadCodeSystem127FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-claim-exception.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "claim-exception", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition189FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-expirationdate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-expirationDate", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation20FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-glasgow.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "glasgow", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition190FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-keyword.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-keyWord", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet158FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-udi.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "udi", valueset.getId());
      }
      @Test
      public void testLoadValueSet159FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contact-point-system.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contact-point-system", valueset.getId());
      }
      @Test
      public void testLoadSpecimen2FromJson() throws Exception {
         String inputFile = "./examples-json/specimen-example-isolate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Specimen specimen = SpecimenHelper.fromJson(json);
         assertEquals("Expect ", "isolate", specimen.getId());
      }
      @Test
      public void testLoadStructureDefinition191FromJson() throws Exception {
         String inputFile = "./examples-json/researchstudy.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ResearchStudy", structuredefinition.getId());
      }
      @Test
      public void testLoadSearchParameter8FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-extensions-CodeSystem-author.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-extensions-CodeSystem-author", searchparameter.getId());
      }
      @Test
      public void testLoadCodeSystem128FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-nhin-purposeofuse.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "nhin-purposeofuse", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem129FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-subscription-channel-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "subscription-channel-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem130FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-actionlist.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "actionlist", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem131FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "example", codesystem.getId());
      }
      @Test
      public void testLoadCommunicationRequest1FromJson() throws Exception {
         String inputFile = "./examples-json/communicationrequest-example-fm-solicit-attachment.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CommunicationRequest communicationrequest = CommunicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "fm-solicit", communicationrequest.getId());
      }
      @Test
      public void testLoadValueSet160FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-c80-doc-classcodes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "c80-doc-classcodes", valueset.getId());
      }
      @Test
      public void testLoadConceptMap6FromJson() throws Exception {
         String inputFile = "./examples-json/cm-contact-point-use-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-contact-point-use-v3", conceptmap.getId());
      }
      @Test
      public void testLoadDetectedIssue2FromJson() throws Exception {
         String inputFile = "./examples-json/detectedissue-example-allergy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DetectedIssue detectedissue = DetectedIssueHelper.fromJson(json);
         assertEquals("Expect ", "allergy", detectedissue.getId());
      }
      @Test
      public void testLoadQuestionnaire56FromJson() throws Exception {
         String inputFile = "./examples-json/structuremap-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadProcedure7FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-education.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "education", procedure.getId());
      }
      @Test
      public void testLoadValueSet161FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ex-diagnosisrelatedgroup.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ex-diagnosisrelatedgroup", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem132FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-encounter-participant-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "encounter-participant-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet162FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-specimen-processing-procedure.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "specimen-processing-procedure", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem133FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-usage-context-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "usage-context-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet163FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-versioning-policy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "versioning-policy", valueset.getId());
      }
      @Test
      public void testLoadOperationDefinition12FromJson() throws Exception {
         String inputFile = "./examples-json/operation-servicedefinition-evaluate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ServiceDefinition-evaluate", operationdefinition.getId());
      }
      @Test
      public void testLoadBundle11FromJson() throws Exception {
         String inputFile = "./examples-json/extension-definitions.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "extensions", bundle.getId());
      }
      @Test
      public void testLoadEligibilityResponse1FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityresponse-example-benefits-2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         EligibilityResponse eligibilityresponse = EligibilityResponseHelper.fromJson(json);
         assertEquals("Expect ", "E2502", eligibilityresponse.getId());
      }
      @Test
      public void testLoadStructureDefinition192FromJson() throws Exception {
         String inputFile = "./examples-json/extension-match-grade.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "match-grade", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire57FromJson() throws Exception {
         String inputFile = "./examples-json/measurereport-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire58FromJson() throws Exception {
         String inputFile = "./examples-json/slot-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire59FromJson() throws Exception {
         String inputFile = "./examples-json/oxygensat-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadAllergyIntolerance2FromJson() throws Exception {
         String inputFile = "./examples-json/allergyintolerance-medication.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AllergyIntolerance allergyintolerance = AllergyIntoleranceHelper.fromJson(json);
         assertEquals("Expect ", "medication", allergyintolerance.getId());
      }
      @Test
      public void testLoadCodeSystem134FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-search-comparator.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "search-comparator", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition193FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-de-contact-address.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-de-contact-address", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition194FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-template-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-template-status", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition195FromJson() throws Exception {
         String inputFile = "./examples-json/money.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Money", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem135FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adjudication-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adjudication-reason", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition196FromJson() throws Exception {
         String inputFile = "./examples-json/devicerequest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DeviceRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet164FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-outcome", valueset.getId());
      }
      @Test
      public void testLoadCarePlan4FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-integrated.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "integrate", careplan.getId());
      }
      @Test
      public void testLoadCodeSystem136FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-clinical-impression-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "clinical-impression-status", codesystem.getId());
      }
      @Test
      public void testLoadOrganization4FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "hl7", organization.getId());
      }
      @Test
      public void testLoadNutritionOrder6FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-enteralcontinuous.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "enteralcontinuous", nutritionorder.getId());
      }
      @Test
      public void testLoadQuestionnaire60FromJson() throws Exception {
         String inputFile = "./examples-json/communication-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet165FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-claim-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "claim-type", valueset.getId());
      }
      @Test
      public void testLoadAuditEvent5FromJson() throws Exception {
         String inputFile = "./examples-json/audit-event-example-logout.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AuditEvent auditevent = AuditEventHelper.fromJson(json);
         assertEquals("Expect ", "example-logout", auditevent.getId());
      }
      @Test
      public void testLoadCompartmentDefinition1FromJson() throws Exception {
         String inputFile = "./examples-json/compartmentdefinition-device.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CompartmentDefinition compartmentdefinition = CompartmentDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "device", compartmentdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem137FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-detectedissue-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "detectedissue-severity", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem138FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-note-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "note-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem139FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-location-physical-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "location-physical-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet166FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adverse-event-seriousness.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-seriousness", valueset.getId());
      }
      @Test
      public void testLoadMedicationRequest10FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0322.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0322", medicationrequest.getId());
      }
      @Test
      public void testLoadPractitioner7FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f004-rb.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f004", practitioner.getId());
      }
      @Test
      public void testLoadValueSet167FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-stage.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-stage", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition197FromJson() throws Exception {
         String inputFile = "./examples-json/immunization.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Immunization", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense13FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0327.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0327", medicationdispense.getId());
      }
      @Test
      public void testLoadCodeSystem140FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-operation-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "operation-outcome", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem141FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-research-subject-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "research-subject-status", codesystem.getId());
      }
      @Test
      public void testLoadTestScript3FromJson() throws Exception {
         String inputFile = "./examples-json/testscript-example-readtest.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         TestScript testscript = TestScriptHelper.fromJson(json);
         assertEquals("Expect ", "testscript-example-readtest", testscript.getId());
      }
      @Test
      public void testLoadConceptMap7FromJson() throws Exception {
         String inputFile = "./examples-json/cm-medication-request-status-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-medication-request-status-v3", conceptmap.getId());
      }
      @Test
      public void testLoadResearchSubject1FromJson() throws Exception {
         String inputFile = "./examples-json/researchsubject-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ResearchSubject researchsubject = ResearchSubjectHelper.fromJson(json);
         assertEquals("Expect ", "example", researchsubject.getId());
      }
      @Test
      public void testLoadMedicationDispense14FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0313.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0313", medicationdispense.getId());
      }
      @Test
      public void testLoadCodeSystem142FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-condition-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "condition-category", codesystem.getId());
      }
      @Test
      public void testLoadReferralRequest1FromJson() throws Exception {
         String inputFile = "./examples-json/referralrequest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ReferralRequest referralrequest = ReferralRequestHelper.fromJson(json);
         assertEquals("Expect ", "example", referralrequest.getId());
      }
      @Test
      public void testLoadCodeSystem143FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-quality-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "quality-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition198FromJson() throws Exception {
         String inputFile = "./examples-json/headcircum.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "headcircum", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire61FromJson() throws Exception {
         String inputFile = "./examples-json/immunizationrecommendation-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet168FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-reference-version-rules.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "reference-version-rules", valueset.getId());
      }
      @Test
      public void testLoadValueSet169FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-messageheader-response-request.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "messageheader-response-request", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition199FromJson() throws Exception {
         String inputFile = "./examples-json/operationdefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "OperationDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire62FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet170FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-name-part-qualifier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "name-part-qualifier", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition200FromJson() throws Exception {
         String inputFile = "./examples-json/paymentreconciliation.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "PaymentReconciliation", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem144FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-content-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "content-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet171FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-list-example-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "list-example-codes", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition201FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedure-progressstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedure-progressStatus", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem145FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-statement-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-statement-category", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire63FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadBasic2FromJson() throws Exception {
         String inputFile = "./examples-json/basic-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Basic basic = BasicHelper.fromJson(json);
         assertEquals("Expect ", "referral", basic.getId());
      }
      @Test
      public void testLoadValueSet172FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-question-max-occurs.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "question-max-occurs", valueset.getId());
      }
      @Test
      public void testLoadProvenance3FromJson() throws Exception {
         String inputFile = "./examples-json/provenance-example-cwl.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Provenance provenance = ProvenanceHelper.fromJson(json);
         assertEquals("Expect ", "example-cwl", provenance.getId());
      }
      @Test
      public void testLoadStructureDefinition202FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-selector.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-selector", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet173FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-digital-media-subtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "digital-media-subtype", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire64FromJson() throws Exception {
         String inputFile = "./examples-json/medication-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadPractitioner8FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f001-evdb.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f001", practitioner.getId());
      }
      @Test
      public void testLoadStructureDefinition203FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-objectclassproperty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-objectClassProperty", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem146FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet174FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-supplyrequest-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "supplyrequest-kind", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition204FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-trusted-expansion.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-trusted-expansion", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition205FromJson() throws Exception {
         String inputFile = "./examples-json/extension-openehr-exposureduration.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "openEHR-exposureDuration", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet175FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-parent-relationship-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "parent-relationship-codes", valueset.getId());
      }
      @Test
      public void testLoadProcedureRequest6FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-pt.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "physical-therapy", procedurerequest.getId());
      }
      @Test
      public void testLoadValueSet176FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-history-not-done-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "history-not-done-reason", valueset.getId());
      }
      @Test
      public void testLoadObservation21FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-bloodpressure-dar.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "blood-pressure-dar", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition206FromJson() throws Exception {
         String inputFile = "./examples-json/decimal.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "decimal", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet177FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-resource-slicing-rules.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "resource-slicing-rules", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire65FromJson() throws Exception {
         String inputFile = "./examples-json/relatedperson-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet178FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-type", valueset.getId());
      }
      @Test
      public void testLoadTestScript4FromJson() throws Exception {
         String inputFile = "./examples-json/testscript-example-search.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         TestScript testscript = TestScriptHelper.fromJson(json);
         assertEquals("Expect ", "testscript-example-search", testscript.getId());
      }
      @Test
      public void testLoadStructureDefinition207FromJson() throws Exception {
         String inputFile = "./examples-json/list.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "List", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem147FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-referencerange-meaning.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "referencerange-meaning", codesystem.getId());
      }
      @Test
      public void testLoadLocation2FromJson() throws Exception {
         String inputFile = "./examples-json/location-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Location location = LocationHelper.fromJson(json);
         assertEquals("Expect ", "1", location.getId());
      }
      @Test
      public void testLoadMedicationRequest11FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0332.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0332", medicationrequest.getId());
      }
      @Test
      public void testLoadCodeSystem148FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-basic-resource-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "basic-resource-type", codesystem.getId());
      }
      @Test
      public void testLoadDataElement1FromJson() throws Exception {
         String inputFile = "./examples-json/dataelement-labtestmaster-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DataElement dataelement = DataElementHelper.fromJson(json);
         assertEquals("Expect ", "prothrombin", dataelement.getId());
      }
      @Test
      public void testLoadSearchParameter9FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-extensions-ValueSet-workflow.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "valueset-extensions-ValueSet-workflow", searchparameter.getId());
      }
      @Test
      public void testLoadValueSet179FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-diet-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "diet-type", valueset.getId());
      }
      @Test
      public void testLoadCoverage4FromJson() throws Exception {
         String inputFile = "./examples-json/coverage-example-ehic.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Coverage coverage = CoverageHelper.fromJson(json);
         assertEquals("Expect ", "7547E", coverage.getId());
      }
      @Test
      public void testLoadValueSet180FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-conditional-read-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "conditional-read-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition208FromJson() throws Exception {
         String inputFile = "./examples-json/contactpoint.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ContactPoint", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition209FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-conceptorder.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-conceptOrder", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet181FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-use-context.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "use-context", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition210FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-de-document-reference.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-de-document-reference", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet182FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-provenance-entity-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "provenance-entity-role", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem149FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-benefit-network.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "benefit-network", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition211FromJson() throws Exception {
         String inputFile = "./examples-json/observation.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Observation", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition212FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-choiceorientation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-choiceOrientation", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense15FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0311.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0311", medicationdispense.getId());
      }
      @Test
      public void testLoadMedicationAdministration3FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0313.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0313", medicationadministration.getId());
      }
      @Test
      public void testLoadStructureDefinition213FromJson() throws Exception {
         String inputFile = "./examples-json/base64binary.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "base64Binary", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet183FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-allergy-intolerance-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "allergy-intolerance-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition214FromJson() throws Exception {
         String inputFile = "./examples-json/event.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Event", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation22FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-5minute-apgar-score.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "5minute-apgar-score", observation.getId());
      }
      @Test
      public void testLoadQuestionnaire66FromJson() throws Exception {
         String inputFile = "./examples-json/devicecomponent-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet184FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-metric-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "metric-category", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition215FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-reference.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-reference", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem150FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-ex-revenue-center.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "ex-revenue-center", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem151FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-fm-conditions.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "fm-conditions", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition216FromJson() throws Exception {
         String inputFile = "./examples-json/extension-devicerequest-patientinstruction.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "devicerequest-patientInstruction", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition217FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-comments.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-comments", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet185FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-system-restful-interaction.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "system-restful-interaction", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem152FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-administrative-gender.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "administrative-gender", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition218FromJson() throws Exception {
         String inputFile = "./examples-json/extension-humanname-assembly-order.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "humanname-assembly-order", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet186FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-detectedissue-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "detectedissue-category", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition219FromJson() throws Exception {
         String inputFile = "./examples-json/shareablevalueset.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "shareablevalueset", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition220FromJson() throws Exception {
         String inputFile = "./examples-json/extension-resource-lastreviewdate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "resource-lastReviewDate", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition221FromJson() throws Exception {
         String inputFile = "./examples-json/imagingstudy.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ImagingStudy", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense16FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0325.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0325", medicationdispense.getId());
      }
      @Test
      public void testLoadStructureDefinition222FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaireresponse-author.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaireresponse-author", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition223FromJson() throws Exception {
         String inputFile = "./examples-json/duration.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Duration", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet187FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-allergy-intolerance-criticality.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "allergy-intolerance-criticality", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem153FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-subscription-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "subscription-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet188FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-actionlist.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "actionlist", valueset.getId());
      }
      @Test
      public void testLoadMedicationStatement2FromJson() throws Exception {
         String inputFile = "./examples-json/medicationstatementexample1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationStatement medicationstatement = MedicationStatementHelper.fromJson(json);
         assertEquals("Expect ", "example001", medicationstatement.getId());
      }
      @Test
      public void testLoadValueSet189FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-observation-interpretation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "observation-interpretation", valueset.getId());
      }
      @Test
      public void testLoadValueSet190FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-detectedissue-mitigation-action.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "detectedissue-mitigation-action", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem154FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-fm-itemtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "fm-itemtype", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition224FromJson() throws Exception {
         String inputFile = "./examples-json/unsignedint.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "unsignedInt", structuredefinition.getId());
      }
      @Test
      public void testLoadMedication9FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0304.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0304", medication.getId());
      }
      @Test
      public void testLoadActivityDefinition7FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-predecessor-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ActivityDefinition activitydefinition = ActivityDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "referralPrimaryCareMentalHealth-initial", activitydefinition.getId());
      }
      @Test
      public void testLoadNutritionOrder7FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-proteinsupplement.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "proteinsupplement", nutritionorder.getId());
      }
      @Test
      public void testLoadStructureDefinition225FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-usage.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-usage", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem155FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-plan-definition-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "plan-definition-type", codesystem.getId());
      }
      @Test
      public void testLoadImagingStudy1FromJson() throws Exception {
         String inputFile = "./examples-json/imagingstudy-example-xr.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ImagingStudy imagingstudy = ImagingStudyHelper.fromJson(json);
         assertEquals("Expect ", "example-xr", imagingstudy.getId());
      }
      @Test
      public void testLoadValueSet191FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-content-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "content-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition226FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-effectivedate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-effectiveDate", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet192FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-measure-report-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "measure-report-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet193FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-care-team-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "care-team-status", valueset.getId());
      }
      @Test
      public void testLoadPatient6FromJson() throws Exception {
         String inputFile = "./examples-json/patient-genetics-example1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "genetics-example1", patient.getId());
      }
      @Test
      public void testLoadProcedure8FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-colon-biopsy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "colon-biopsy", procedure.getId());
      }
      @Test
      public void testLoadValueSet194FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-request-intent.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-request-intent", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition227FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-streetnamebase.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-streetNameBase", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition228FromJson() throws Exception {
         String inputFile = "./examples-json/extension-organization-alias.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "organization-alias", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition13FromJson() throws Exception {
         String inputFile = "./examples-json/operation-activitydefinition-apply.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ActivityDefinition-apply", operationdefinition.getId());
      }
      @Test
      public void testLoadValueSet195FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-vision-eye-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "vision-eye-codes", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire67FromJson() throws Exception {
         String inputFile = "./examples-json/linkage-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet196FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ucum-vitals-common.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ucum-vitals-common", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition229FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-de-registry-org.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-de-registry-org", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition230FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-label.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-label", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet197FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-care-plan-activity-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-activity-status", valueset.getId());
      }
      @Test
      public void testLoadFHIRList4FromJson() throws Exception {
         String inputFile = "./examples-json/list-example-familyhistory-genetics-profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FHIRList fhirlist = FHIRListHelper.fromJson(json);
         assertEquals("Expect ", "genetic", fhirlist.getId());
      }
      @Test
      public void testLoadValueSet198FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-search-comparator.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "search-comparator", valueset.getId());
      }
      @Test
      public void testLoadConceptMap8FromJson() throws Exception {
         String inputFile = "./examples-json/cm-address-use-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-address-use-v3", conceptmap.getId());
      }
      @Test
      public void testLoadSequence9FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-graphic-example-4.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "graphic-example-4", sequence.getId());
      }
      @Test
      public void testLoadValueSet199FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-formatcodes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "formatcodes", valueset.getId());
      }
      @Test
      public void testLoadValueSet200FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-communication-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "communication-category", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition231FromJson() throws Exception {
         String inputFile = "./examples-json/count.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Count", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest12FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0306.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0306", medicationrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition232FromJson() throws Exception {
         String inputFile = "./examples-json/resprate.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "resprate", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem156FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-capability-statement-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "capability-statement-kind", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition233FromJson() throws Exception {
         String inputFile = "./examples-json/extension-goal-relationship.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "goal-relationship", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire68FromJson() throws Exception {
         String inputFile = "./examples-json/bodyheight-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition234FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-display-hint.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-display-hint", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet201FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-message-significance-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "message-significance-category", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition235FromJson() throws Exception {
         String inputFile = "./examples-json/chargeitem.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ChargeItem", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem157FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-account-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "account-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition236FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-usagemode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-usageMode", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire69FromJson() throws Exception {
         String inputFile = "./examples-json/ldlcholesterol-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet202FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-consent-except-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "consent-except-type", valueset.getId());
      }
      @Test
      public void testLoadMedicationDispense17FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0303.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0303", medicationdispense.getId());
      }
      @Test
      public void testLoadValueSet203FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-task-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "task-status", valueset.getId());
      }
      @Test
      public void testLoadCommunication1FromJson() throws Exception {
         String inputFile = "./examples-json/communication-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Communication communication = CommunicationHelper.fromJson(json);
         assertEquals("Expect ", "example", communication.getId());
      }
      @Test
      public void testLoadRelatedPerson2FromJson() throws Exception {
         String inputFile = "./examples-json/relatedperson-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RelatedPerson relatedperson = RelatedPersonHelper.fromJson(json);
         assertEquals("Expect ", "benedicte", relatedperson.getId());
      }
      @Test
      public void testLoadValueSet204FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-procedure-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "procedure-category", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition237FromJson() throws Exception {
         String inputFile = "./examples-json/timing.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Timing", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem158FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-appointmentstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "appointmentstatus", codesystem.getId());
      }
      @Test
      public void testLoadMedicationRequest13FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0324.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0324", medicationrequest.getId());
      }
      @Test
      public void testLoadOperationDefinition14FromJson() throws Exception {
         String inputFile = "./examples-json/operation-questionnaire-populatelink.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Questionnaire-populatelink", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem159FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-chargeitem-billingcodes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "chargeitem-billingcodes", codesystem.getId());
      }
      @Test
      public void testLoadEligibilityRequest1FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityrequest-example-2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         EligibilityRequest eligibilityrequest = EligibilityRequestHelper.fromJson(json);
         assertEquals("Expect ", "52346", eligibilityrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition238FromJson() throws Exception {
         String inputFile = "./examples-json/sampleddata.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "SampledData", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationAdministration4FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0306.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0306", medicationadministration.getId());
      }
      @Test
      public void testLoadMedication10FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0314.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0314", medication.getId());
      }
      @Test
      public void testLoadValueSet205FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-quantity-comparator.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "quantity-comparator", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem160FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-dispense-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-dispense-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet206FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-questionnaire-display-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-display-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet207FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-example-expansion.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "example-expansion", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition239FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-housenumbernumeric.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-houseNumberNumeric", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire70FromJson() throws Exception {
         String inputFile = "./examples-json/supplydelivery-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem161FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-network-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "network-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem162FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-teeth.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "teeth", codesystem.getId());
      }
      @Test
      public void testLoadBinary2FromJson() throws Exception {
         String inputFile = "./examples-json/binary-f006.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Binary binary = BinaryHelper.fromJson(json);
         assertEquals("Expect ", "f006", binary.getId());
      }
      @Test
      public void testLoadQuestionnaire71FromJson() throws Exception {
         String inputFile = "./examples-json/observation-genetics-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire72FromJson() throws Exception {
         String inputFile = "./examples-json/specimen-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadPatient7FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-a.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "pat1", patient.getId());
      }
      @Test
      public void testLoadValueSet208FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-procedure-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "procedure-code", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition240FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-time-offset.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-time-offset", structuredefinition.getId());
      }
      @Test
      public void testLoadBundle12FromJson() throws Exception {
         String inputFile = "./examples-json/document-example-dischargesummary.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "father", bundle.getId());
      }
      @Test
      public void testLoadStructureDefinition241FromJson() throws Exception {
         String inputFile = "./examples-json/extension-condition-partof.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "condition-partOf", structuredefinition.getId());
      }
      @Test
      public void testLoadEncounter3FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example-f201-20130404.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "f201", encounter.getId());
      }
      @Test
      public void testLoadMedicationAdministration5FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0309.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0309", medicationadministration.getId());
      }
      @Test
      public void testLoadMedication11FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0318.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0318", medication.getId());
      }
      @Test
      public void testLoadSearchParameter10FromJson() throws Exception {
         String inputFile = "./examples-json/observation-genetic-Observation-gene-amino-acid-change.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "observation-genetic-Observation-gene-amino-acid-change", searchparameter.getId());
      }
      @Test
      public void testLoadStructureDefinition242FromJson() throws Exception {
         String inputFile = "./examples-json/basic.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Basic", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition243FromJson() throws Exception {
         String inputFile = "./examples-json/extension-familymemberhistory-patient-record.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "familymemberhistory-patient-record", structuredefinition.getId());
      }
      @Test
      public void testLoadBundle13FromJson() throws Exception {
         String inputFile = "./examples-json/search-parameters.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "searchParams", bundle.getId());
      }
      @Test
      public void testLoadCondition5FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-f002-lung.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "f002", condition.getId());
      }
      @Test
      public void testLoadStructureDefinition244FromJson() throws Exception {
         String inputFile = "./examples-json/clinicaldocument.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "clinicaldocument", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire73FromJson() throws Exception {
         String inputFile = "./examples-json/searchparameter-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition245FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-map.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-map", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem163FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-extra-activity-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "extra-activity-type", codesystem.getId());
      }
      @Test
      public void testLoadSubstance4FromJson() throws Exception {
         String inputFile = "./examples-json/substance-example-f202-staphylococcus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Substance substance = SubstanceHelper.fromJson(json);
         assertEquals("Expect ", "f202", substance.getId());
      }
      @Test
      public void testLoadCarePlan5FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-f203-sepsis.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "f203", careplan.getId());
      }
      @Test
      public void testLoadStructureDefinition246FromJson() throws Exception {
         String inputFile = "./examples-json/extension-device-din.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "device-din", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem164FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-assert-response-code-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "assert-response-code-types", codesystem.getId());
      }
      @Test
      public void testLoadValueSet209FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-system-version-processing-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "system-version-processing-mode", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem165FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-search-param-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "search-param-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition247FromJson() throws Exception {
         String inputFile = "./examples-json/extension-openehr-test.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "openEHR-test", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet210FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-immunization-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "immunization-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet211FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-structure-definition-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "structure-definition-kind", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition248FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-deliveryinstallationarea.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-deliveryInstallationArea", structuredefinition.getId());
      }
      @Test
      public void testLoadCommunication2FromJson() throws Exception {
         String inputFile = "./examples-json/communication-example-fm-attachment.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Communication communication = CommunicationHelper.fromJson(json);
         assertEquals("Expect ", "fm-attachment", communication.getId());
      }
      @Test
      public void testLoadDevice2FromJson() throws Exception {
         String inputFile = "./examples-json/device-example-f001-feedingtube.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Device device = DeviceHelper.fromJson(json);
         assertEquals("Expect ", "f001", device.getId());
      }
      @Test
      public void testLoadMedia1FromJson() throws Exception {
         String inputFile = "./examples-json/media-example-dicom.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Media media = MediaHelper.fromJson(json);
         assertEquals("Expect ", "1.2.840.11361907579238403408700.3.0.14.19970327150033", media.getId());
      }
      @Test
      public void testLoadStructureDefinition249FromJson() throws Exception {
         String inputFile = "./examples-json/extension-communicationrequest-relevanthistory.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "communicationrequest-relevantHistory", structuredefinition.getId());
      }
      @Test
      public void testLoadBundle14FromJson() throws Exception {
         String inputFile = "./examples-json/patient-examples-cypress-template.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "b0a5e4277-83c4-4adb-87e2-e3efe3369b6f", bundle.getId());
      }
      @Test
      public void testLoadCodeSystem166FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contact-point-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contact-point-use", codesystem.getId());
      }
      @Test
      public void testLoadDevice3FromJson() throws Exception {
         String inputFile = "./examples-json/device-example-ihe-pcd.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Device device = DeviceHelper.fromJson(json);
         assertEquals("Expect ", "ihe-pcd", device.getId());
      }
      @Test
      public void testLoadStructureDefinition250FromJson() throws Exception {
         String inputFile = "./examples-json/bundle.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Bundle", structuredefinition.getId());
      }
      @Test
      public void testLoadRequestGroup1FromJson() throws Exception {
         String inputFile = "./examples-json/requestgroup-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RequestGroup requestgroup = RequestGroupHelper.fromJson(json);
         assertEquals("Expect ", "example", requestgroup.getId());
      }
      @Test
      public void testLoadValueSet212FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-participant-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-participant-type", valueset.getId());
      }
      @Test
      public void testLoadDevice4FromJson() throws Exception {
         String inputFile = "./examples-json/device-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Device device = DeviceHelper.fromJson(json);
         assertEquals("Expect ", "example", device.getId());
      }
      @Test
      public void testLoadStructureDefinition251FromJson() throws Exception {
         String inputFile = "./examples-json/extension-specimen-isdryweight.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "specimen-isDryWeight", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition252FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-deprecated.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-deprecated", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem167FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-endpoint-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "endpoint-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition253FromJson() throws Exception {
         String inputFile = "./examples-json/devicemetric.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DeviceMetric", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition254FromJson() throws Exception {
         String inputFile = "./examples-json/signature.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Signature", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem168FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-concept-properties.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "concept-properties", codesystem.getId());
      }
      @Test
      public void testLoadCarePlan6FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-pregnancy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "preg", careplan.getId());
      }
      @Test
      public void testLoadStructureDefinition255FromJson() throws Exception {
         String inputFile = "./examples-json/extension-rendering-style.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "rendering-style", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet213FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-subscription-channel-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "subscription-channel-type", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire74FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaire-zika-virus-exposure-assessment.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "zika-virus-exposure-assessment", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition256FromJson() throws Exception {
         String inputFile = "./examples-json/messagedefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "MessageDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet214FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contract-subtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contract-subtype", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem169FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-forms.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "forms", codesystem.getId());
      }
      @Test
      public void testLoadValueSet215FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-forms.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "forms", valueset.getId());
      }
      @Test
      public void testLoadBundle15FromJson() throws Exception {
         String inputFile = "./examples-json/namingsystem-terminologies.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "terminologies", bundle.getId());
      }
      @Test
      public void testLoadValueSet216FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-cpt-all.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "cpt-all", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition257FromJson() throws Exception {
         String inputFile = "./examples-json/request.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Request", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire75FromJson() throws Exception {
         String inputFile = "./examples-json/clinicaldocument-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire76FromJson() throws Exception {
         String inputFile = "./examples-json/vitalsigns-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet217FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-precheck-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-precheck-behavior", valueset.getId());
      }
      @Test
      public void testLoadMedicationRequest14FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0319.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0319", medicationrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition258FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-precinct.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-precinct", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire77FromJson() throws Exception {
         String inputFile = "./examples-json/headcircum-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet218FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-clinicalimpression-prognosis.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "clinicalimpression-prognosis", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire78FromJson() throws Exception {
         String inputFile = "./examples-json/claimresponse-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet219FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-administration-method-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "administration-method-codes", valueset.getId());
      }
      @Test
      public void testLoadValueSet220FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-observation-vitalsignresult.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "observation-vitalsignresult", valueset.getId());
      }
      @Test
      public void testLoadOperationOutcome4FromJson() throws Exception {
         String inputFile = "./examples-json/operationoutcome-example-validationfail.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationOutcome operationoutcome = OperationOutcomeHelper.fromJson(json);
         assertEquals("Expect ", "validationfail", operationoutcome.getId());
      }
      @Test
      public void testLoadClaim6FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-oral-contained.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "100152", claim.getId());
      }
      @Test
      public void testLoadQuestionnaire79FromJson() throws Exception {
         String inputFile = "./examples-json/consentdirective-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadOperationOutcome5FromJson() throws Exception {
         String inputFile = "./examples-json/operationoutcome-example-searchfail.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationOutcome operationoutcome = OperationOutcomeHelper.fromJson(json);
         assertEquals("Expect ", "searchfail", operationoutcome.getId());
      }
      @Test
      public void testLoadStructureDefinition259FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsgene.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsGene", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet221FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-focal-subject.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "focal-subject", valueset.getId());
      }
      @Test
      public void testLoadProcedureRequest7FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-lipid.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "lipid", procedurerequest.getId());
      }
      @Test
      public void testLoadValueSet222FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-oral-prosthodontic-material.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "oral-prosthodontic-material", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition260FromJson() throws Exception {
         String inputFile = "./examples-json/bodyheight.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "bodyheight", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire80FromJson() throws Exception {
         String inputFile = "./examples-json/imagingstudy-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadClaim7FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-institutional.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "960150", claim.getId());
      }
      @Test
      public void testLoadStructureDefinition261FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-unit.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-unit", structuredefinition.getId());
      }
      @Test
      public void testLoadTask2FromJson() throws Exception {
         String inputFile = "./examples-json/task-example6.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Task task = TaskHelper.fromJson(json);
         assertEquals("Expect ", "example6", task.getId());
      }
      @Test
      public void testLoadValueSet223FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-guidance-response-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "guidance-response-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition262FromJson() throws Exception {
         String inputFile = "./examples-json/extension-flag-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "flag-priority", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition263FromJson() throws Exception {
         String inputFile = "./examples-json/sequence.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Sequence", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet224FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-entformula-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "entformula-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet225FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contract-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contract-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet226FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-sequence-referenceSeq.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "sequence-referenceSeq", valueset.getId());
      }
      @Test
      public void testLoadEligibilityResponse2FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityresponse-example-benefits.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         EligibilityResponse eligibilityresponse = EligibilityResponseHelper.fromJson(json);
         assertEquals("Expect ", "E2501", eligibilityresponse.getId());
      }
      @Test
      public void testLoadValueSet227FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-observation-methods.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "observation-methods", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem170FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-library-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "library-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem171FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-request-intent.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-request-intent", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem172FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-audit-event-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "audit-event-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition264FromJson() throws Exception {
         String inputFile = "./examples-json/extension-flag-detail.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "flag-detail", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem173FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-device-action.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "device-action", codesystem.getId());
      }
      @Test
      public void testLoadValueSet228FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-dicm-405-mediatype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "dicm-405-mediatype", valueset.getId());
      }
      @Test
      public void testLoadGoal1FromJson() throws Exception {
         String inputFile = "./examples-json/goal-example-stop-smoking.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Goal goal = GoalHelper.fromJson(json);
         assertEquals("Expect ", "stop-smoking", goal.getId());
      }
      @Test
      public void testLoadOperationDefinition15FromJson() throws Exception {
         String inputFile = "./examples-json/operation-codesystem-subsumes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CodeSystem-subsumes", operationdefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition265FromJson() throws Exception {
         String inputFile = "./examples-json/goal.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Goal", structuredefinition.getId());
      }
      @Test
      public void testLoadPatient8FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-xds.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "xds", patient.getId());
      }
      @Test
      public void testLoadValueSet229FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-payment-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "payment-status", valueset.getId());
      }
      @Test
      public void testLoadCondition6FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-f204-renal.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "f204", condition.getId());
      }
      @Test
      public void testLoadContract3FromJson() throws Exception {
         String inputFile = "./examples-json/pcd-example-notAuthor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Contract contract = ContractHelper.fromJson(json);
         assertEquals("Expect ", "pcd-example-notAuthor", contract.getId());
      }
      @Test
      public void testLoadStructureDefinition266FromJson() throws Exception {
         String inputFile = "./examples-json/extension-diagnosticreport-addendumof.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "diagnosticReport-addendumOf", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition267FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-eventtiming.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-eventTiming", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet230FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-goal-relationship-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "goal-relationship-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition268FromJson() throws Exception {
         String inputFile = "./examples-json/triggerdefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "TriggerDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationAdministration6FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0310.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0310", medicationadministration.getId());
      }
      @Test
      public void testLoadStructureDefinition269FromJson() throws Exception {
         String inputFile = "./examples-json/extension-location-distance.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "location-distance", structuredefinition.getId());
      }
      @Test
      public void testLoadBundle16FromJson() throws Exception {
         String inputFile = "./examples-json/v3-codesystems.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "v3-valuesets", bundle.getId());
      }
      @Test
      public void testLoadOrganization5FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-f003-burgers-ENT.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "f003", organization.getId());
      }
      @Test
      public void testLoadValueSet231FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-request-intent.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "request-intent", valueset.getId());
      }
      @Test
      public void testLoadObservation23FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-glasgow-qa.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "gcs-qa", observation.getId());
      }
      @Test
      public void testLoadCodeSystem174FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-resource-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "resource-types", codesystem.getId());
      }
      @Test
      public void testLoadMedicationDispense18FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0301.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0301", medicationdispense.getId());
      }
      @Test
      public void testLoadQuestionnaire81FromJson() throws Exception {
         String inputFile = "./examples-json/imagingmanifest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadOperationDefinition16FromJson() throws Exception {
         String inputFile = "./examples-json/operation-capabilitystatement-implements.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CapabilityStatement-implements", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem175FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-history-not-done-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "history-not-done-reason", codesystem.getId());
      }
      @Test
      public void testLoadObservation24FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f204-creatinine.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f204", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition270FromJson() throws Exception {
         String inputFile = "./examples-json/paymentnotice.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "PaymentNotice", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem176FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-name-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "name-use", codesystem.getId());
      }
      @Test
      public void testLoadMedication12FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0320.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0320", medication.getId());
      }
      @Test
      public void testLoadGoal2FromJson() throws Exception {
         String inputFile = "./examples-json/goal-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Goal goal = GoalHelper.fromJson(json);
         assertEquals("Expect ", "example", goal.getId());
      }
      @Test
      public void testLoadObservation25FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-haplotype2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-haplotype2", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition271FromJson() throws Exception {
         String inputFile = "./examples-json/extension-auditevent-participantobjectcontainsstudy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "auditevent-ParticipantObjectContainsStudy", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet232FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-measure-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "measure-type", valueset.getId());
      }
      @Test
      public void testLoadCarePlan7FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-GPVisit.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "gpvisit", careplan.getId());
      }
      @Test
      public void testLoadValueSet233FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-immunization-origin.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "immunization-origin", valueset.getId());
      }
      @Test
      public void testLoadValueSet234FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem177FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-payment-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "payment-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem178FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-metric-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "metric-category", codesystem.getId());
      }
      @Test
      public void testLoadValueSet235FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-resource-validation-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "resource-validation-mode", valueset.getId());
      }
      @Test
      public void testLoadBundle17FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-examples-general.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "3ad0687e-f477-468c-afd5-fcc2bf897809", bundle.getId());
      }
      @Test
      public void testLoadValueSet236FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-additionalmaterials.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "additionalmaterials", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition272FromJson() throws Exception {
         String inputFile = "./examples-json/attachment.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Attachment", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationStatement3FromJson() throws Exception {
         String inputFile = "./examples-json/medicationstatementexample6.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationStatement medicationstatement = MedicationStatementHelper.fromJson(json);
         assertEquals("Expect ", "example006", medicationstatement.getId());
      }
      @Test
      public void testLoadStructureDefinition273FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-rdf-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-rdf-type", structuredefinition.getId());
      }
      @Test
      public void testLoadAuditEvent6FromJson() throws Exception {
         String inputFile = "./examples-json/auditevent-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AuditEvent auditevent = AuditEventHelper.fromJson(json);
         assertEquals("Expect ", "example", auditevent.getId());
      }
      @Test
      public void testLoadPractitioner9FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-xcda-author.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "xcda-author", practitioner.getId());
      }
      @Test
      public void testLoadMedicationAdministration7FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0304.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0304", medicationadministration.getId());
      }
      @Test
      public void testLoadBundle18FromJson() throws Exception {
         String inputFile = "./examples-json/profiles-resources.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "resources", bundle.getId());
      }
      @Test
      public void testLoadStructureDefinition274FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedure-approachbodysite.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedure-approachBodySite", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet237FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-substance-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "substance-code", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition275FromJson() throws Exception {
         String inputFile = "./examples-json/element.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Element", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition17FromJson() throws Exception {
         String inputFile = "./examples-json/operation-list-find.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "List-find", operationdefinition.getId());
      }
      @Test
      public void testLoadValueSet238FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-assert-response-code-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "assert-response-code-types", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire82FromJson() throws Exception {
         String inputFile = "./examples-json/allergyintolerance-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition276FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-ordinalvalue.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-ordinalValue", structuredefinition.getId());
      }
      @Test
      public void testLoadDiagnosticReport7FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-genetics-example-2-familyhistory.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "dg2", diagnosticreport.getId());
      }
      @Test
      public void testLoadStructureDefinition277FromJson() throws Exception {
         String inputFile = "./examples-json/documentreference.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DocumentReference", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem179FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-conditional-read-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "conditional-read-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem180FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-action-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "action-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet239FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-narrative-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "narrative-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition278FromJson() throws Exception {
         String inputFile = "./examples-json/coverage.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Coverage", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest15FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0330.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0330", medicationrequest.getId());
      }
      @Test
      public void testLoadOrganization6FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-f002-burgers-card.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "f002", organization.getId());
      }
      @Test
      public void testLoadStructureDefinition279FromJson() throws Exception {
         String inputFile = "./examples-json/extension-rendering-xhtml.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "rendering-xhtml", structuredefinition.getId());
      }
      @Test
      public void testLoadSearchParameter11FromJson() throws Exception {
         String inputFile = "./examples-json/condition-extensions-Condition-based-on.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "condition-extensions-Condition-based-on", searchparameter.getId());
      }
      @Test
      public void testLoadPractitioner10FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f204-ce.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f204", practitioner.getId());
      }
      @Test
      public void testLoadValueSet240FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-statement-taken.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-statement-taken", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem181FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-service-pharmacy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "service-pharmacy", codesystem.getId());
      }
      @Test
      public void testLoadEligibilityResponse3FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityresponse-example-error.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         EligibilityResponse eligibilityresponse = EligibilityResponseHelper.fromJson(json);
         assertEquals("Expect ", "E2503", eligibilityresponse.getId());
      }
      @Test
      public void testLoadConsent4FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-notAuthor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-notAuthor", consent.getId());
      }
      @Test
      public void testLoadMedicationRequest16FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0307.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0307", medicationrequest.getId());
      }
      @Test
      public void testLoadCodeSystem182FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-guide-page-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "guide-page-kind", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem183FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-benefit-subcategory.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "benefit-subcategory", codesystem.getId());
      }
      @Test
      public void testLoadValueSet241FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ucum-bodyweight.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ucum-bodyweight", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition280FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-disability.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-disability", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition281FromJson() throws Exception {
         String inputFile = "./examples-json/extension-auditevent-encrypted.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "auditevent-Encrypted", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition18FromJson() throws Exception {
         String inputFile = "./examples-json/operation-capabilitystatement-subset.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CapabilityStatement-subset", operationdefinition.getId());
      }
      @Test
      public void testLoadMeasure3FromJson() throws Exception {
         String inputFile = "./examples-json/measure-exclusive-breastfeeding.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Measure measure = MeasureHelper.fromJson(json);
         assertEquals("Expect ", "measure-exclusive-breastfeeding", measure.getId());
      }
      @Test
      public void testLoadValueSet242FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-bodysite-laterality.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "bodysite-laterality", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition282FromJson() throws Exception {
         String inputFile = "./examples-json/servicedefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ServiceDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet243FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-dataelement-stringency.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "dataelement-stringency", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition283FromJson() throws Exception {
         String inputFile = "./examples-json/encounter.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Encounter", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem184FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adverse-event-causality-method.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-causality-method", codesystem.getId());
      }
      @Test
      public void testLoadLocation3FromJson() throws Exception {
         String inputFile = "./examples-json/location-example-room.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Location location = LocationHelper.fromJson(json);
         assertEquals("Expect ", "2", location.getId());
      }
      @Test
      public void testLoadProcessResponse1FromJson() throws Exception {
         String inputFile = "./examples-json/processresponse-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessResponse processresponse = ProcessResponseHelper.fromJson(json);
         assertEquals("Expect ", "SR2500", processresponse.getId());
      }
      @Test
      public void testLoadValueSet244FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-resource-type-link.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "resource-type-link", valueset.getId());
      }
      @Test
      public void testLoadNutritionOrder8FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-energysupplement.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "energysupplement", nutritionorder.getId());
      }
      @Test
      public void testLoadCodeSystem185FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-quantity-comparator.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "quantity-comparator", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition284FromJson() throws Exception {
         String inputFile = "./examples-json/slot.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Slot", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition285FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsallelename.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsAlleleName", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet245FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-composite-measure-scoring.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "composite-measure-scoring", valueset.getId());
      }
      @Test
      public void testLoadValueSet246FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-condition-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-condition-kind", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition286FromJson() throws Exception {
         String inputFile = "./examples-json/extension-humanname-fathers-family.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "humanname-fathers-family", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet247FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-device-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "device-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition287FromJson() throws Exception {
         String inputFile = "./examples-json/extension-maxsize.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "maxSize", structuredefinition.getId());
      }
      @Test
      public void testLoadCarePlan8FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-f201-renal.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "f201", careplan.getId());
      }
      @Test
      public void testLoadStructureDefinition288FromJson() throws Exception {
         String inputFile = "./examples-json/extension-communicationrequest-orderedby.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "communicationrequest-orderedBy", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition289FromJson() throws Exception {
         String inputFile = "./examples-json/extension-event-partof.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "event-partOf", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet248FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ex-program-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ex-program-code", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition290FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-systemref.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-systemRef", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet249FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-operation-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "operation-kind", valueset.getId());
      }
      @Test
      public void testLoadProcedureRequest8FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-subrequest.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "subrequest", procedurerequest.getId());
      }
      @Test
      public void testLoadPlanDefinition6FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-chlamydia-screening-intervention.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "chlamydia-screening-intervention", plandefinition.getId());
      }
      @Test
      public void testLoadCodeSystem186FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-group-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "group-type", codesystem.getId());
      }
      @Test
      public void testLoadLibrary4FromJson() throws Exception {
         String inputFile = "./examples-json/library-quick-model-definition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "library-quick-model-definition", library.getId());
      }
      @Test
      public void testLoadQuestionnaire83FromJson() throws Exception {
         String inputFile = "./examples-json/resprate-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition291FromJson() throws Exception {
         String inputFile = "./examples-json/extension-auditevent-mpps.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "auditevent-MPPS", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet250FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-procedure-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "procedure-outcome", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaireResponse4FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaireresponse-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         QuestionnaireResponse questionnaireresponse = QuestionnaireResponseHelper.fromJson(json);
         assertEquals("Expect ", "3141", questionnaireresponse.getId());
      }
      @Test
      public void testLoadMedicationStatement4FromJson() throws Exception {
         String inputFile = "./examples-json/medicationstatementexample4.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationStatement medicationstatement = MedicationStatementHelper.fromJson(json);
         assertEquals("Expect ", "example004", medicationstatement.getId());
      }
      @Test
      public void testLoadValueSet251FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-benefit-unit.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "benefit-unit", valueset.getId());
      }
      @Test
      public void testLoadValueSet252FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-payment-adjustment-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "payment-adjustment-reason", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem187FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-cqif-recommendation-strength.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "cqif-recommendation-strength", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem188FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-ex-paymenttype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "ex-paymenttype", codesystem.getId());
      }
      @Test
      public void testLoadProcessRequest2FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-example-reprocess.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessRequest processrequest = ProcessRequestHelper.fromJson(json);
         assertEquals("Expect ", "44654", processrequest.getId());
      }
      @Test
      public void testLoadValueSet253FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-list-order.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "list-order", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire84FromJson() throws Exception {
         String inputFile = "./examples-json/visionprescription-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition292FromJson() throws Exception {
         String inputFile = "./examples-json/extension-capabilitystatement-expectation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "capabilitystatement-expectation", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet254FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adverse-event-causality-result.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-causality-result", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem189FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-audit-event-action.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "audit-event-action", codesystem.getId());
      }
      @Test
      public void testLoadPatient9FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-f201-roel.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "f201", patient.getId());
      }
      @Test
      public void testLoadValueSet255FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-supplement-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "supplement-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition293FromJson() throws Exception {
         String inputFile = "./examples-json/vitalspanel.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "vitalspanel", structuredefinition.getId());
      }
      @Test
      public void testLoadDiagnosticReport8FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-ultrasound.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "ultrasound", diagnosticreport.getId());
      }
      @Test
      public void testLoadValueSet256FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-identity-assuranceLevel.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "identity-assuranceLevel", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition294FromJson() throws Exception {
         String inputFile = "./examples-json/structuredefinition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "example", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem190FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-organization-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "organization-type", codesystem.getId());
      }
      @Test
      public void testLoadSearchParameter12FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-genetic-DiagnosticReport-assessed-condition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "diagnosticreport-genetic-DiagnosticReport-assessed-condition", searchparameter.getId());
      }
      @Test
      public void testLoadValueSet257FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-benefit-term.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "benefit-term", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem191FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-substance-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "substance-category", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition295FromJson() throws Exception {
         String inputFile = "./examples-json/time.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "time", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem192FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-encounter-diet.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "encounter-diet", codesystem.getId());
      }
      @Test
      public void testLoadValueSet258FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-animal-species.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "animal-species", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem193FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-service-uscls.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "service-uscls", codesystem.getId());
      }
      @Test
      public void testLoadProcedure9FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-ob.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "ob", procedure.getId());
      }
      @Test
      public void testLoadQuestionnaire85FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition296FromJson() throws Exception {
         String inputFile = "./examples-json/extension-goal-reasonrejected.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "goal-reasonRejected", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation26FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-TPMT-diplotype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-TPMT-diplotype", observation.getId());
      }
      @Test
      public void testLoadValueSet259FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-admin-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-admin-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition297FromJson() throws Exception {
         String inputFile = "./examples-json/extension-diagnosticreport-extends.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "diagnosticReport-extends", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem194FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-goal-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "goal-priority", codesystem.getId());
      }
      @Test
      public void testLoadImagingStudy2FromJson() throws Exception {
         String inputFile = "./examples-json/imagingstudy-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ImagingStudy imagingstudy = ImagingStudyHelper.fromJson(json);
         assertEquals("Expect ", "example", imagingstudy.getId());
      }
      @Test
      public void testLoadDevice5FromJson() throws Exception {
         String inputFile = "./examples-json/device-example-udi4.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Device device = DeviceHelper.fromJson(json);
         assertEquals("Expect ", "example-udi4", device.getId());
      }
      @Test
      public void testLoadStructureDefinition298FromJson() throws Exception {
         String inputFile = "./examples-json/uri.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "uri", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition299FromJson() throws Exception {
         String inputFile = "./examples-json/date.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "date", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition300FromJson() throws Exception {
         String inputFile = "./examples-json/extension-communication-media.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "communication-media", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire86FromJson() throws Exception {
         String inputFile = "./examples-json/person-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadMedicationDispense19FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0314.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0314", medicationdispense.getId());
      }
      @Test
      public void testLoadStructureDefinition301FromJson() throws Exception {
         String inputFile = "./examples-json/extension-specimen-sequencenumber.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "specimen-sequenceNumber", structuredefinition.getId());
      }
      @Test
      public void testLoadOrganization7FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-f203-bumc.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "f203", organization.getId());
      }
      @Test
      public void testLoadStructureDefinition302FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedurerequest-reasonrejected.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedurerequest-reasonRejected", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition303FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-focal-subject.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-focal-subject", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet260FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-flag-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "flag-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet261FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-filter-operator.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "filter-operator", valueset.getId());
      }
      @Test
      public void testLoadMedicationRequest17FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0301.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0301", medicationrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition304FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-religion.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-religion", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet262FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-relationship.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "relationship", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem195FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-item-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "item-type", codesystem.getId());
      }
      @Test
      public void testLoadBundle19FromJson() throws Exception {
         String inputFile = "./examples-json/namingsystem-registry.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "registry", bundle.getId());
      }
      @Test
      public void testLoadValueSet263FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-predecessor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-predecessor", valueset.getId());
      }
      @Test
      public void testLoadValueSet264FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adverse-event-causality-method.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-causality-method", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition305FromJson() throws Exception {
         String inputFile = "./examples-json/code.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "code", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet265FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-organization-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "organization-type", valueset.getId());
      }
      @Test
      public void testLoadMedicationRequest18FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0325.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0325", medicationrequest.getId());
      }
      @Test
      public void testLoadValueSet266FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-choice-list-orientation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "choice-list-orientation", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition306FromJson() throws Exception {
         String inputFile = "./examples-json/communicationrequest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CommunicationRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadSubscription1FromJson() throws Exception {
         String inputFile = "./examples-json/subscription-example-error.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Subscription subscription = SubscriptionHelper.fromJson(json);
         assertEquals("Expect ", "example-error", subscription.getId());
      }
      @Test
      public void testLoadValueSet267FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-c80-doc-typecodes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "c80-doc-typecodes", valueset.getId());
      }
      @Test
      public void testLoadProcedureRequest9FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "physiotherapy", procedurerequest.getId());
      }
      @Test
      public void testLoadStructureDefinition307FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ProcedureRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet268FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-plan-definition-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "plan-definition-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition308FromJson() throws Exception {
         String inputFile = "./examples-json/endpoint.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Endpoint", structuredefinition.getId());
      }
      @Test
      public void testLoadEncounter4FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "example", encounter.getId());
      }
      @Test
      public void testLoadStructureDefinition309FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-namespace.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-namespace", structuredefinition.getId());
      }
      @Test
      public void testLoadProcedureRequest10FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "example", procedurerequest.getId());
      }
      @Test
      public void testLoadStructureDefinition310FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedure-incisiondatetime.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedure-incisionDateTime", structuredefinition.getId());
      }
      @Test
      public void testLoadBodySite3FromJson() throws Exception {
         String inputFile = "./examples-json/bodysite-example-tumor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         BodySite bodysite = BodySiteHelper.fromJson(json);
         assertEquals("Expect ", "tumor", bodysite.getId());
      }
      @Test
      public void testLoadValueSet269FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-conceptmap-unmapped-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "conceptmap-unmapped-mode", valueset.getId());
      }
      @Test
      public void testLoadValueSet270FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-identifier-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "identifier-type", valueset.getId());
      }
      @Test
      public void testLoadConceptMap9FromJson() throws Exception {
         String inputFile = "./examples-json/cm-detectedissue-severity-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-detectedissue-severity-v3", conceptmap.getId());
      }
      @Test
      public void testLoadGroup1FromJson() throws Exception {
         String inputFile = "./examples-json/group-example-member.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Group group = GroupHelper.fromJson(json);
         assertEquals("Expect ", "102", group.getId());
      }
      @Test
      public void testLoadComposition1FromJson() throws Exception {
         String inputFile = "./examples-json/composition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Composition composition = CompositionHelper.fromJson(json);
         assertEquals("Expect ", "example", composition.getId());
      }
      @Test
      public void testLoadConsent5FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-notThem.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-notThem", consent.getId());
      }
      @Test
      public void testLoadCodeSystem196FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-binding-strength.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "binding-strength", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition311FromJson() throws Exception {
         String inputFile = "./examples-json/extension-rendered-value.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "rendered-value", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet271FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-trigger-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "trigger-type", valueset.getId());
      }
      @Test
      public void testLoadFHIRList5FromJson() throws Exception {
         String inputFile = "./examples-json/list-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FHIRList fhirlist = FHIRListHelper.fromJson(json);
         assertEquals("Expect ", "example", fhirlist.getId());
      }
      @Test
      public void testLoadProcedureRequest11FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-ambulation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "ambulation", procedurerequest.getId());
      }
      @Test
      public void testLoadCodeSystem197FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-intervention.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "intervention", codesystem.getId());
      }
      @Test
      public void testLoadSearchParameter13FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-extensions-CodeSystem-keyword.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-extensions-CodeSystem-keyword", searchparameter.getId());
      }
      @Test
      public void testLoadValueSet272FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-relationship-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-relationship-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet273FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-publication-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "publication-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition312FromJson() throws Exception {
         String inputFile = "./examples-json/allergyintolerance.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "AllergyIntolerance", structuredefinition.getId());
      }
      @Test
      public void testLoadNutritionOrder9FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-fiberrestricteddiet.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "fiberrestricteddiet", nutritionorder.getId());
      }
      @Test
      public void testLoadStructureDefinition313FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedure-method.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedure-method", structuredefinition.getId());
      }
      @Test
      public void testLoadCompartmentDefinition2FromJson() throws Exception {
         String inputFile = "./examples-json/compartmentdefinition-patient.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CompartmentDefinition compartmentdefinition = CompartmentDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient", compartmentdefinition.getId());
      }
      @Test
      public void testLoadProcedure10FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-f003-abscess.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "f003", procedure.getId());
      }
      @Test
      public void testLoadStructureDefinition314FromJson() throws Exception {
         String inputFile = "./examples-json/extension-operationoutcome-issue-source.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "operationoutcome-issue-source", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem198FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-event-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "event-status", codesystem.getId());
      }
      @Test
      public void testLoadBundle20FromJson() throws Exception {
         String inputFile = "./examples-json/bundle-transaction.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "bundle-transaction", bundle.getId());
      }
      @Test
      public void testLoadCodeSystem199FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-definition-topic.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "definition-topic", codesystem.getId());
      }
      @Test
      public void testLoadEncounter5FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example-f003-abscess.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "f003", encounter.getId());
      }
      @Test
      public void testLoadValueSet274FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet275FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-compartment-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "compartment-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet276FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-probability-distribution-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "probability-distribution-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet277FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-service-modifiers.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "service-modifiers", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition315FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaireresponse-note.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaireresponse-note", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition316FromJson() throws Exception {
         String inputFile = "./examples-json/extension-consent-notificationendpoint.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "consent-NotificationEndpoint", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet278FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-udi-entry-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "udi-entry-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet279FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-device-action.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "device-action", valueset.getId());
      }
      @Test
      public void testLoadValueSet280FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-map-input-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "map-input-mode", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem200FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-supplydelivery-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "supplydelivery-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet281FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ex-revenue-center.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ex-revenue-center", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem201FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-sequence-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "sequence-type", codesystem.getId());
      }
      @Test
      public void testLoadMedicationDispense20FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0318.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0318", medicationdispense.getId());
      }
      @Test
      public void testLoadStructureDefinition317FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-label.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-label", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem202FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-consent-data-meaning.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "consent-data-meaning", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition318FromJson() throws Exception {
         String inputFile = "./examples-json/visionprescription.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "VisionPrescription", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition319FromJson() throws Exception {
         String inputFile = "./examples-json/account.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Account", structuredefinition.getId());
      }
      @Test
      public void testLoadProcessRequest3FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-example-poll-exclusive.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessRequest processrequest = ProcessRequestHelper.fromJson(json);
         assertEquals("Expect ", "1113", processrequest.getId());
      }
      @Test
      public void testLoadObservation27FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-2minute-apgar-score.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "2minute-apgar-score", observation.getId());
      }
      @Test
      public void testLoadValueSet282FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-library-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "library-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition320FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-annotation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-annotation", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition321FromJson() throws Exception {
         String inputFile = "./examples-json/graphdefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "GraphDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition322FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-hidden.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-hidden", structuredefinition.getId());
      }
      @Test
      public void testLoadSubstance5FromJson() throws Exception {
         String inputFile = "./examples-json/substance-example-amoxicillin-clavulanate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Substance substance = SubstanceHelper.fromJson(json);
         assertEquals("Expect ", "f205", substance.getId());
      }
      @Test
      public void testLoadCodeSystem203FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-supplydelivery-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "supplydelivery-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition323FromJson() throws Exception {
         String inputFile = "./examples-json/extension-pharmacy-core-refillsremaining.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "pharmacy-core-refillsRemaining", structuredefinition.getId());
      }
      @Test
      public void testLoadLibrary5FromJson() throws Exception {
         String inputFile = "./examples-json/library-cms146-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "library-cms146-example", library.getId());
      }
      @Test
      public void testLoadStructureDefinition324FromJson() throws Exception {
         String inputFile = "./examples-json/extension-openehr-exposuredate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "openEHR-exposureDate", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition325FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-optionprefix.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-optionPrefix", structuredefinition.getId());
      }
      @Test
      public void testLoadCondition7FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-f003-abscess.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "f003", condition.getId());
      }
      @Test
      public void testLoadMedicationRequest19FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0326.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0326", medicationrequest.getId());
      }
      @Test
      public void testLoadQuestionnaire87FromJson() throws Exception {
         String inputFile = "./examples-json/supplyrequest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem204FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-specimen-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "specimen-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet283FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-composition-attestation-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "composition-attestation-mode", valueset.getId());
      }
      @Test
      public void testLoadCapabilityStatement1FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement-terminology-server.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CapabilityStatement capabilitystatement = CapabilityStatementHelper.fromJson(json);
         assertEquals("Expect ", "terminology-server", capabilitystatement.getId());
      }
      @Test
      public void testLoadCodeSystem205FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-encounter-admit-source.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "encounter-admit-source", codesystem.getId());
      }
      @Test
      public void testLoadValueSet284FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-care-plan-intent.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-intent", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem206FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-chromosome-human.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "chromosome-human", codesystem.getId());
      }
      @Test
      public void testLoadValueSet285FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-diet.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-diet", valueset.getId());
      }
      @Test
      public void testLoadConsent6FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-signature.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-signature", consent.getId());
      }
      @Test
      public void testLoadStructureDefinition326FromJson() throws Exception {
         String inputFile = "./examples-json/extension-pharmacy-core-maxdeliveryvolume.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "pharmacy-core-maxDeliveryVolume", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet286FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-reference-handling-policy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "reference-handling-policy", valueset.getId());
      }
      @Test
      public void testLoadSearchParameter14FromJson() throws Exception {
         String inputFile = "./examples-json/searchparameter-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "example", searchparameter.getId());
      }
      @Test
      public void testLoadCodeSystem207FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-endpoint-connection-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "endpoint-connection-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet287FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-specification-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "specification-type", valueset.getId());
      }
      @Test
      public void testLoadLocation4FromJson() throws Exception {
         String inputFile = "./examples-json/location-example-patients-home.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Location location = LocationHelper.fromJson(json);
         assertEquals("Expect ", "ph", location.getId());
      }
      @Test
      public void testLoadStructureDefinition327FromJson() throws Exception {
         String inputFile = "./examples-json/procedure.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Procedure", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation28FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-date-lastmp.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "date-lastmp", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition328FromJson() throws Exception {
         String inputFile = "./examples-json/extension-condition-criticality.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "condition-criticality", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire88FromJson() throws Exception {
         String inputFile = "./examples-json/group-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem208FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-conformance-expectation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "conformance-expectation", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition329FromJson() throws Exception {
         String inputFile = "./examples-json/consent.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Consent", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition330FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ProcessRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem209FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-document-relationship-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "document-relationship-type", codesystem.getId());
      }
      @Test
      public void testLoadMedicationRequest20FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0335.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0335", medicationrequest.getId());
      }
      @Test
      public void testLoadObservation29FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f205-egfr.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f205", observation.getId());
      }
      @Test
      public void testLoadCapabilityStatement2FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement-messagedefinition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CapabilityStatement capabilitystatement = CapabilityStatementHelper.fromJson(json);
         assertEquals("Expect ", "messagedefinition", capabilitystatement.getId());
      }
      @Test
      public void testLoadMessageDefinition1FromJson() throws Exception {
         String inputFile = "./examples-json/messagedefinition-patient-link-notification.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MessageDefinition messagedefinition = MessageDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-link-notification", messagedefinition.getId());
      }
      @Test
      public void testLoadValueSet288FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-search-param-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "search-param-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet289FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-icd-10.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "icd-10", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem210FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-definition-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "definition-status", codesystem.getId());
      }
      @Test
      public void testLoadOperationDefinition19FromJson() throws Exception {
         String inputFile = "./examples-json/operation-questionnaire-populate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Questionnaire-populate", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem211FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contactentity-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contactentity-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet290FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-message-transport.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "message-transport", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition331FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-comments.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-comments", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation30FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-genetics-1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-genetics-1", observation.getId());
      }
      @Test
      public void testLoadCodeSystem212FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-episodeofcare-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "episodeofcare-type", codesystem.getId());
      }
      @Test
      public void testLoadRiskAssessment4FromJson() throws Exception {
         String inputFile = "./examples-json/riskassessment-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RiskAssessment riskassessment = RiskAssessmentHelper.fromJson(json);
         assertEquals("Expect ", "genetic", riskassessment.getId());
      }
      @Test
      public void testLoadMedicationRequest21FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0323.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0323", medicationrequest.getId());
      }
      @Test
      public void testLoadDiagnosticReport9FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-lipids.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "lipids", diagnosticreport.getId());
      }
      @Test
      public void testLoadTestScript5FromJson() throws Exception {
         String inputFile = "./examples-json/testscript-example-rule.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         TestScript testscript = TestScriptHelper.fromJson(json);
         assertEquals("Expect ", "testscript-example-rule", testscript.getId());
      }
      @Test
      public void testLoadCodeSystem213FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-condition-ver-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "condition-ver-status", codesystem.getId());
      }
      @Test
      public void testLoadMedicationRequest22FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0305.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0305", medicationrequest.getId());
      }
      @Test
      public void testLoadConsent7FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-notThis.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-notThis", consent.getId());
      }
      @Test
      public void testLoadMedicationDispense21FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0324.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0324", medicationdispense.getId());
      }
      @Test
      public void testLoadDeviceRequest1FromJson() throws Exception {
         String inputFile = "./examples-json/devicerequest-example-insulinpump.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DeviceRequest devicerequest = DeviceRequestHelper.fromJson(json);
         assertEquals("Expect ", "insulinpump", devicerequest.getId());
      }
      @Test
      public void testLoadSequence10FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-example-pgx-2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "example-pgx-2", sequence.getId());
      }
      @Test
      public void testLoadStructureDefinition332FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-explicit-type-name.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-explicit-type-name", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation31FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f002-excess.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f002", observation.getId());
      }
      @Test
      public void testLoadValueSet291FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-immunization-recommendation-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "immunization-recommendation-status", valueset.getId());
      }
      @Test
      public void testLoadMedication13FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0317.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0317", medication.getId());
      }
      @Test
      public void testLoadStructureDefinition333FromJson() throws Exception {
         String inputFile = "./examples-json/schedule.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Schedule", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition334FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsdnavariantid.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsDNAVariantId", structuredefinition.getId());
      }
      @Test
      public void testLoadSearchParameter15FromJson() throws Exception {
         String inputFile = "./examples-json/searchparameter-example-reference.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "example-reference", searchparameter.getId());
      }
      @Test
      public void testLoadCodeSystem214FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adverse-event-causality-result.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-causality-result", codesystem.getId());
      }
      @Test
      public void testLoadValueSet292FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-audit-event-action.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "audit-event-action", valueset.getId());
      }
      @Test
      public void testLoadSlot2FromJson() throws Exception {
         String inputFile = "./examples-json/slot-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Slot slot = SlotHelper.fromJson(json);
         assertEquals("Expect ", "example", slot.getId());
      }
      @Test
      public void testLoadMessageDefinition2FromJson() throws Exception {
         String inputFile = "./examples-json/messagedefinition-patient-link-response.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MessageDefinition messagedefinition = MessageDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-link-response", messagedefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire89FromJson() throws Exception {
         String inputFile = "./examples-json/shareablecodesystem-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadClinicalImpression1FromJson() throws Exception {
         String inputFile = "./examples-json/clinicalimpression-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ClinicalImpression clinicalimpression = ClinicalImpressionHelper.fromJson(json);
         assertEquals("Expect ", "example", clinicalimpression.getId());
      }
      @Test
      public void testLoadEndpoint3FromJson() throws Exception {
         String inputFile = "./examples-json/endpoint-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Endpoint endpoint = EndpointHelper.fromJson(json);
         assertEquals("Expect ", "example", endpoint.getId());
      }
      @Test
      public void testLoadMedicationRequest23FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0316.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0316", medicationrequest.getId());
      }
      @Test
      public void testLoadValueSet293FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-policyholder-relationship.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "policyholder-relationship", valueset.getId());
      }
      @Test
      public void testLoadValueSet294FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-reaction-event-certainty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "reaction-event-certainty", valueset.getId());
      }
      @Test
      public void testLoadValueSet295FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-namingsystem-identifier-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "namingsystem-identifier-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem215FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-metric-calibration-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "metric-calibration-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet296FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-consent-content-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "consent-content-code", valueset.getId());
      }
      @Test
      public void testLoadValueSet297FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-request-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "request-priority", valueset.getId());
      }
      @Test
      public void testLoadValueSet298FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-statement-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-statement-status", valueset.getId());
      }
      @Test
      public void testLoadSearchParameter16FromJson() throws Exception {
         String inputFile = "./examples-json/observation-genetic-Observation-gene-identifier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "observation-genetic-Observation-gene-identifier", searchparameter.getId());
      }
      @Test
      public void testLoadStructureDefinition335FromJson() throws Exception {
         String inputFile = "./examples-json/devicecomponent.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DeviceComponent", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet299FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-data-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "data-types", valueset.getId());
      }
      @Test
      public void testLoadSlot3FromJson() throws Exception {
         String inputFile = "./examples-json/slot-example-busy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Slot slot = SlotHelper.fromJson(json);
         assertEquals("Expect ", "1", slot.getId());
      }
      @Test
      public void testLoadSearchParameter17FromJson() throws Exception {
         String inputFile = "./examples-json/patient-extensions-Patient-mothersMaidenName.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "patient-extensions-Patient-mothersMaidenName", searchparameter.getId());
      }
      @Test
      public void testLoadObservation32FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f004-erythrocyte.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f004", observation.getId());
      }
      @Test
      public void testLoadValueSet300FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-assert-direction-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "assert-direction-codes", valueset.getId());
      }
      @Test
      public void testLoadValueSet301FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-observation-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "observation-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition336FromJson() throws Exception {
         String inputFile = "./examples-json/extension-auditevent-sopclass.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "auditevent-SOPClass", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition337FromJson() throws Exception {
         String inputFile = "./examples-json/extension-diagnosticreport-summaryof.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "diagnosticReport-summaryOf", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense22FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0316.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0316", medicationdispense.getId());
      }
      @Test
      public void testLoadStructureDefinition338FromJson() throws Exception {
         String inputFile = "./examples-json/device.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Device", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition339FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "MedicationRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet302FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-signature-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "signature-type", valueset.getId());
      }
      @Test
      public void testLoadPlanDefinition7FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "low-suicide-risk-order-set", plandefinition.getId());
      }
      @Test
      public void testLoadMeasure4FromJson() throws Exception {
         String inputFile = "./examples-json/measure-component-b-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Measure measure = MeasureHelper.fromJson(json);
         assertEquals("Expect ", "component-b-example", measure.getId());
      }
      @Test
      public void testLoadValueSet303FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-location-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "location-mode", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition340FromJson() throws Exception {
         String inputFile = "./examples-json/claimresponse.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ClaimResponse", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest24FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0314.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0314", medicationrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition341FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-mothersmaidenname.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-mothersMaidenName", structuredefinition.getId());
      }
      @Test
      public void testLoadCondition8FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-f202-malignancy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "f202", condition.getId());
      }
      @Test
      public void testLoadStructureDefinition342FromJson() throws Exception {
         String inputFile = "./examples-json/location.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Location", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire90FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem216FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-unknown-content-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "unknown-content-code", codesystem.getId());
      }
      @Test
      public void testLoadValueSet304FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-metric-operational-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "metric-operational-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem217FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-allerg-intol-substance-exp-risk.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "allerg-intol-substance-exp-risk", codesystem.getId());
      }
      @Test
      public void testLoadCondition9FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-f201-fever.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "f201", condition.getId());
      }
      @Test
      public void testLoadCompartmentDefinition3FromJson() throws Exception {
         String inputFile = "./examples-json/compartmentdefinition-encounter.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CompartmentDefinition compartmentdefinition = CompartmentDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "encounter", compartmentdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem218FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-goal-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "goal-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition343FromJson() throws Exception {
         String inputFile = "./examples-json/measurereport.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "MeasureReport", structuredefinition.getId());
      }
      @Test
      public void testLoadSearchParameter18FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-extensions-ValueSet-end.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "valueset-extensions-ValueSet-end", searchparameter.getId());
      }
      @Test
      public void testLoadStructureDefinition344FromJson() throws Exception {
         String inputFile = "./examples-json/period.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Period", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet305FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-claim-exception.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "claim-exception", valueset.getId());
      }
      @Test
      public void testLoadProcedure11FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-f201-tpf.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "f201", procedure.getId());
      }
      @Test
      public void testLoadStructureDefinition345FromJson() throws Exception {
         String inputFile = "./examples-json/bmi.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "bmi", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationOutcome6FromJson() throws Exception {
         String inputFile = "./examples-json/operationoutcome-example-exception.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationOutcome operationoutcome = OperationOutcomeHelper.fromJson(json);
         assertEquals("Expect ", "exception", operationoutcome.getId());
      }
      @Test
      public void testLoadValueSet306FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-report-result-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "report-result-codes", valueset.getId());
      }
      @Test
      public void testLoadValueSet307FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-immunization-recommendation-target-disease.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "immunization-recommendation-target-disease", valueset.getId());
      }
      @Test
      public void testLoadBundle21FromJson() throws Exception {
         String inputFile = "./examples-json/message-request-link.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "10bb101f-a121-4264-a920-67be9cb82c74", bundle.getId());
      }
      @Test
      public void testLoadNutritionOrder10FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-pureeddiet-simple.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "pureeddiet-simple", nutritionorder.getId());
      }
      @Test
      public void testLoadCarePlan9FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-obesity-narrative.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "obesity-narrative", careplan.getId());
      }
      @Test
      public void testLoadStructureDefinition346FromJson() throws Exception {
         String inputFile = "./examples-json/guidanceresponse.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "GuidanceResponse", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition347FromJson() throws Exception {
         String inputFile = "./examples-json/range.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Range", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire91FromJson() throws Exception {
         String inputFile = "./examples-json/account-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCommunication3FromJson() throws Exception {
         String inputFile = "./examples-json/communication-example-fm-solicited-attachment.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Communication communication = CommunicationHelper.fromJson(json);
         assertEquals("Expect ", "fm-solicited", communication.getId());
      }
      @Test
      public void testLoadCodeSystem219FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-vision-product.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "vision-product", codesystem.getId());
      }
      @Test
      public void testLoadImagingManifest1FromJson() throws Exception {
         String inputFile = "./examples-json/imagingmanifest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ImagingManifest imagingmanifest = ImagingManifestHelper.fromJson(json);
         assertEquals("Expect ", "example", imagingmanifest.getId());
      }
      @Test
      public void testLoadStructureMap1FromJson() throws Exception {
         String inputFile = "./examples-json/structuremap-supplyrequest-transform.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureMap structuremap = StructureMapHelper.fromJson(json);
         assertEquals("Expect ", "supplyrequest-transform", structuremap.getId());
      }
      @Test
      public void testLoadCodeSystem220FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-admin-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-admin-status", codesystem.getId());
      }
      @Test
      public void testLoadOperationDefinition20FromJson() throws Exception {
         String inputFile = "./examples-json/operation-patient-everything.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Patient-everything", operationdefinition.getId());
      }
      @Test
      public void testLoadDataElement2FromJson() throws Exception {
         String inputFile = "./examples-json/dataelement-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DataElement dataelement = DataElementHelper.fromJson(json);
         assertEquals("Expect ", "gender", dataelement.getId());
      }
      @Test
      public void testLoadOperationDefinition21FromJson() throws Exception {
         String inputFile = "./examples-json/operation-messageheader-process-message.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "MessageHeader-process-message", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem221FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-request-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-request-status", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire92FromJson() throws Exception {
         String inputFile = "./examples-json/researchsubject-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem222FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-audit-event-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "audit-event-outcome", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem223FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-restful-capability-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "restful-capability-mode", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition348FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-en-representation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-EN-representation", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet308FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-intervention.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "intervention", valueset.getId());
      }
      @Test
      public void testLoadImplementationGuide1FromJson() throws Exception {
         String inputFile = "./examples-json/implementationguide-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ImplementationGuide implementationguide = ImplementationGuideHelper.fromJson(json);
         assertEquals("Expect ", "example", implementationguide.getId());
      }
      @Test
      public void testLoadCodeSystem224FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-publication-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "publication-status", codesystem.getId());
      }
      @Test
      public void testLoadLibrary6FromJson() throws Exception {
         String inputFile = "./examples-json/library-exclusive-breastfeeding-cqm-logic.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "library-exclusive-breastfeeding-cqm-logic", library.getId());
      }
      @Test
      public void testLoadCodeSystem225FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-history-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "history-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition349FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-unclosed.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-unclosed", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem226FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-composition-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "composition-status", codesystem.getId());
      }
      @Test
      public void testLoadDevice6FromJson() throws Exception {
         String inputFile = "./examples-json/device-example-udi1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Device device = DeviceHelper.fromJson(json);
         assertEquals("Expect ", "example-udi1", device.getId());
      }
      @Test
      public void testLoadValueSet309FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-usps-state.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "usps-state", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem227FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-action-grouping-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "action-grouping-behavior", codesystem.getId());
      }
      @Test
      public void testLoadBundle22FromJson() throws Exception {
         String inputFile = "./examples-json/dataelements.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "dataelements", bundle.getId());
      }
      @Test
      public void testLoadQuestionnaire93FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadMeasureReport1FromJson() throws Exception {
         String inputFile = "./examples-json/measurereport-cms146-cat1-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MeasureReport measurereport = MeasureReportHelper.fromJson(json);
         assertEquals("Expect ", "measurereport-cms146-cat1-example", measurereport.getId());
      }
      @Test
      public void testLoadValueSet310FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-claim-careteamrole.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "claim-careteamrole", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition350FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-objectclass.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-objectClass", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense23FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0329.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0329", medicationdispense.getId());
      }
      @Test
      public void testLoadValueSet311FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-reaction-event-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "reaction-event-severity", valueset.getId());
      }
      @Test
      public void testLoadSearchParameter19FromJson() throws Exception {
         String inputFile = "./examples-json/condition-extensions-Condition-definition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "condition-extensions-Condition-definition", searchparameter.getId());
      }
      @Test
      public void testLoadObservation33FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-heart-rate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "heart-rate", observation.getId());
      }
      @Test
      public void testLoadBundle23FromJson() throws Exception {
         String inputFile = "./examples-json/practitionerrole-examples-general.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "3ad0687e-f477-468c-afd5-fcc2bf897808", bundle.getId());
      }
      @Test
      public void testLoadStructureDefinition351FromJson() throws Exception {
         String inputFile = "./examples-json/coding.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Coding", structuredefinition.getId());
      }
      @Test
      public void testLoadMeasure5FromJson() throws Exception {
         String inputFile = "./examples-json/measure-cms146-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Measure measure = MeasureHelper.fromJson(json);
         assertEquals("Expect ", "measure-cms146-example", measure.getId());
      }
      @Test
      public void testLoadCodeSystem228FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-relationship.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "relationship", codesystem.getId());
      }
      @Test
      public void testLoadValueSet312FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-device-safety.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "device-safety", valueset.getId());
      }
      @Test
      public void testLoadValueSet313FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-goal-start-event.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "goal-start-event", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition352FromJson() throws Exception {
         String inputFile = "./examples-json/ldlcholesterol.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ldlcholesterol", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem229FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-chargeitem-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "chargeitem-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem230FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-report-action-result-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "report-action-result-codes", codesystem.getId());
      }
      @Test
      public void testLoadCompartmentDefinition4FromJson() throws Exception {
         String inputFile = "./examples-json/compartmentdefinition-practitioner.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CompartmentDefinition compartmentdefinition = CompartmentDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "practitioner", compartmentdefinition.getId());
      }
      @Test
      public void testLoadValueSet314FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-profile-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "profile-code", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem231FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-episode-of-care-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "episode-of-care-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition353FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-direction.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-direction", structuredefinition.getId());
      }
      @Test
      public void testLoadConsent8FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-notTime.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-notTime", consent.getId());
      }
      @Test
      public void testLoadEnrollmentRequest1FromJson() throws Exception {
         String inputFile = "./examples-json/enrollmentrequest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         EnrollmentRequest enrollmentrequest = EnrollmentRequestHelper.fromJson(json);
         assertEquals("Expect ", "22345", enrollmentrequest.getId());
      }
      @Test
      public void testLoadValueSet315FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-questionnaire-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-category", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem232FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-resource-validation-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "resource-validation-mode", codesystem.getId());
      }
      @Test
      public void testLoadDiagnosticReport10FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-pgx.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "example-pgx", diagnosticreport.getId());
      }
      @Test
      public void testLoadStructureDefinition354FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-delimiter.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-delimiter", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem233FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-care-plan-intent.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-intent", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition355FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-citizenship.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-citizenship", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire94FromJson() throws Exception {
         String inputFile = "./examples-json/servicedefinition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition356FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-equivalence.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-equivalence", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition22FromJson() throws Exception {
         String inputFile = "./examples-json/operation-library-data-requirements.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Library-data-requirements", operationdefinition.getId());
      }
      @Test
      public void testLoadValueSet316FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-common-tags.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "common-tags", valueset.getId());
      }
      @Test
      public void testLoadValueSet317FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-conditional-delete-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "conditional-delete-status", valueset.getId());
      }
      @Test
      public void testLoadSupplyRequest1FromJson() throws Exception {
         String inputFile = "./examples-json/supplyrequest-example-simpleorder.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SupplyRequest supplyrequest = SupplyRequestHelper.fromJson(json);
         assertEquals("Expect ", "simpleorder", supplyrequest.getId());
      }
      @Test
      public void testLoadConceptMap10FromJson() throws Exception {
         String inputFile = "./examples-json/conceptmap-103.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "103", conceptmap.getId());
      }
      @Test
      public void testLoadObservation34FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-diplotype1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-diplotype1", observation.getId());
      }
      @Test
      public void testLoadCodeSystem234FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-example-summary.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "summary", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition357FromJson() throws Exception {
         String inputFile = "./examples-json/uuid.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "uuid", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet318FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-definition-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "definition-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem235FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-animal-genderstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "animal-genderstatus", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition358FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsgenomicsourceclass.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsGenomicSourceClass", structuredefinition.getId());
      }
      @Test
      public void testLoadDocumentReference1FromJson() throws Exception {
         String inputFile = "./examples-json/documentreference-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DocumentReference documentreference = DocumentReferenceHelper.fromJson(json);
         assertEquals("Expect ", "example", documentreference.getId());
      }
      @Test
      public void testLoadValueSet319FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adverse-event-causality-assess.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-causality-assess", valueset.getId());
      }
      @Test
      public void testLoadMedicationAdministration8FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0311.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0311", medicationadministration.getId());
      }
      @Test
      public void testLoadValueSet320FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-copy-number-event.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "copy-number-event", valueset.getId());
      }
      @Test
      public void testLoadOperationDefinition23FromJson() throws Exception {
         String inputFile = "./examples-json/operation-questionnaire-populatehtml.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Questionnaire-populatehtml", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem236FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-observation-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "observation-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition359FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-studyprotocolidentifier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-studyprotocolIdentifier", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet321FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-goal-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "goal-priority", valueset.getId());
      }
      @Test
      public void testLoadValueSet322FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-classification-or-context.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "classification-or-context", valueset.getId());
      }
      @Test
      public void testLoadConceptMap11FromJson() throws Exception {
         String inputFile = "./examples-json/cm-contact-point-use-v2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-contact-point-use-v2", conceptmap.getId());
      }
      @Test
      public void testLoadMedicationRequest25FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0312.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0312", medicationrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition360FromJson() throws Exception {
         String inputFile = "./examples-json/extension-capabilitystatement-prohibited.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "capabilitystatement-prohibited", structuredefinition.getId());
      }
      @Test
      public void testLoadGroup2FromJson() throws Exception {
         String inputFile = "./examples-json/group-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Group group = GroupHelper.fromJson(json);
         assertEquals("Expect ", "101", group.getId());
      }
      @Test
      public void testLoadCodeSystem237FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contract-action.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contract-action", codesystem.getId());
      }
      @Test
      public void testLoadValueSet323FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-days-of-week.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "days-of-week", valueset.getId());
      }
      @Test
      public void testLoadObservation35FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-TPMT-haplotype-two.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-TPMT-haplotype-two", observation.getId());
      }
      @Test
      public void testLoadCodeSystem238FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-action-required-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "action-required-behavior", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition361FromJson() throws Exception {
         String inputFile = "./examples-json/extension-rendering-markdown.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "rendering-markdown", structuredefinition.getId());
      }
      @Test
      public void testLoadBundle24FromJson() throws Exception {
         String inputFile = "./examples-json/conceptmaps.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "conceptmaps", bundle.getId());
      }
      @Test
      public void testLoadCodeSystem239FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-task-performer-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "task-performer-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet324FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-assert-operator-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "assert-operator-codes", valueset.getId());
      }
      @Test
      public void testLoadPractitioner11FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f202-lm.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f202", practitioner.getId());
      }
      @Test
      public void testLoadCodeSystem240FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-address-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "address-use", codesystem.getId());
      }
      @Test
      public void testLoadCapabilityStatement3FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement-base.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CapabilityStatement capabilitystatement = CapabilityStatementHelper.fromJson(json);
         assertEquals("Expect ", "base", capabilitystatement.getId());
      }
      @Test
      public void testLoadCodeSystem241FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-tooth.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "tooth", codesystem.getId());
      }
      @Test
      public void testLoadValueSet325FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-note-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "note-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet326FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-diagnosis-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "diagnosis-role", valueset.getId());
      }
      @Test
      public void testLoadValueSet327FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-coverage-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "coverage-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem242FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adverse-event-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-category", codesystem.getId());
      }
      @Test
      public void testLoadPerson1FromJson() throws Exception {
         String inputFile = "./examples-json/person-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Person person = PersonHelper.fromJson(json);
         assertEquals("Expect ", "example", person.getId());
      }
      @Test
      public void testLoadQuestionnaire95FromJson() throws Exception {
         String inputFile = "./examples-json/processresponse-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCapabilityStatement4FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement-knowledge-repository.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CapabilityStatement capabilitystatement = CapabilityStatementHelper.fromJson(json);
         assertEquals("Expect ", "knowledge-repository", capabilitystatement.getId());
      }
      @Test
      public void testLoadStructureDefinition362FromJson() throws Exception {
         String inputFile = "./examples-json/id.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "id", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet328FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-care-plan-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition363FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-fmm.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-fmm", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition364FromJson() throws Exception {
         String inputFile = "./examples-json/extension-family-member-history-genetics-parent.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "family-member-history-genetics-parent", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet329FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-service-place.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "service-place", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition365FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "PlanDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadEligibilityResponse4FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityresponse-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         EligibilityResponse eligibilityresponse = EligibilityResponseHelper.fromJson(json);
         assertEquals("Expect ", "E2500", eligibilityresponse.getId());
      }
      @Test
      public void testLoadOrganization8FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-f201-aumc.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "f201", organization.getId());
      }
      @Test
      public void testLoadGuidanceResponse1FromJson() throws Exception {
         String inputFile = "./examples-json/guidanceresponse-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         GuidanceResponse guidanceresponse = GuidanceResponseHelper.fromJson(json);
         assertEquals("Expect ", "example", guidanceresponse.getId());
      }
      @Test
      public void testLoadPerson2FromJson() throws Exception {
         String inputFile = "./examples-json/person-grahame.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Person person = PersonHelper.fromJson(json);
         assertEquals("Expect ", "grahame", person.getId());
      }
      @Test
      public void testLoadCodeSystem243FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-care-plan-activity-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-activity-category", codesystem.getId());
      }
      @Test
      public void testLoadOrganization9FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-good-health-care.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "2.16.840.1.113883.19.5", organization.getId());
      }
      @Test
      public void testLoadValueSet330FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-participantrequired.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "participantrequired", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem244FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contract-term-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contract-term-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet331FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-service-provision-conditions.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "service-provision-conditions", valueset.getId());
      }
      @Test
      public void testLoadSequence11FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-graphic-example-3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "graphic-example-3", sequence.getId());
      }
      @Test
      public void testLoadCodeSystem245FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-icd-10-procedures.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "icd-10-procedures", codesystem.getId());
      }
      @Test
      public void testLoadValueSet332FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-map-transform.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "map-transform", valueset.getId());
      }
      @Test
      public void testLoadValueSet333FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-observation-statistics.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "observation-statistics", valueset.getId());
      }
      @Test
      public void testLoadConceptMap12FromJson() throws Exception {
         String inputFile = "./examples-json/cm-address-type-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-address-type-v3", conceptmap.getId());
      }
      @Test
      public void testLoadMedicationDispense24FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0308.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0308", medicationdispense.getId());
      }
      @Test
      public void testLoadValueSet334FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-transaction-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "transaction-mode", valueset.getId());
      }
      @Test
      public void testLoadConsent9FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-grantor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-grantor", consent.getId());
      }
      @Test
      public void testLoadValueSet335FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-nutrition-request-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "nutrition-request-status", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire96FromJson() throws Exception {
         String inputFile = "./examples-json/detectedissue-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet336FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-referencerange-meaning.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "referencerange-meaning", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition366FromJson() throws Exception {
         String inputFile = "./examples-json/extension-goal-pertainstogoal.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "goal-pertainsToGoal", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet337FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-procedure-progress-status-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "procedure-progress-status-codes", valueset.getId());
      }
      @Test
      public void testLoadValueSet338FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-activity-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "activity-reason", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem246FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-request-intent.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "request-intent", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire97FromJson() throws Exception {
         String inputFile = "./examples-json/shareablevalueset-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet339FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-match-grade.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "match-grade", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem247FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-concept-property-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "concept-property-type", codesystem.getId());
      }
      @Test
      public void testLoadSearchParameter20FromJson() throws Exception {
         String inputFile = "./examples-json/patient-extensions-Patient-age.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "patient-extensions-Patient-age", searchparameter.getId());
      }
      @Test
      public void testLoadClaim8FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-pharmacy-medication.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "760151", claim.getId());
      }
      @Test
      public void testLoadSpecimen3FromJson() throws Exception {
         String inputFile = "./examples-json/specimen-example-urine.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Specimen specimen = SpecimenHelper.fromJson(json);
         assertEquals("Expect ", "vma-urine", specimen.getId());
      }
      @Test
      public void testLoadQuestionnaire98FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaire-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition367FromJson() throws Exception {
         String inputFile = "./examples-json/bodylength.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "bodylength", structuredefinition.getId());
      }
      @Test
      public void testLoadSequence12FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-complex-variant.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "sequence-complex-variant", sequence.getId());
      }
      @Test
      public void testLoadValueSet340FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ucum-bodylength.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ucum-bodylength", valueset.getId());
      }
      @Test
      public void testLoadObservation36FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-bmi.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "bmi", observation.getId());
      }
      @Test
      public void testLoadValueSet341FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-cause.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-cause", valueset.getId());
      }
      @Test
      public void testLoadCapabilityStatement5FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement-measure-processor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CapabilityStatement capabilitystatement = CapabilityStatementHelper.fromJson(json);
         assertEquals("Expect ", "measure-processor", capabilitystatement.getId());
      }
      @Test
      public void testLoadStructureDefinition368FromJson() throws Exception {
         String inputFile = "./examples-json/extension-resource-effectiveperiod.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "resource-effectivePeriod", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition24FromJson() throws Exception {
         String inputFile = "./examples-json/operation-valueset-validate-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ValueSet-validate-code", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem248FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-map-context-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "map-context-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem249FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-issue-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "issue-type", codesystem.getId());
      }
      @Test
      public void testLoadMeasureReport2FromJson() throws Exception {
         String inputFile = "./examples-json/measurereport-cms146-cat2-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MeasureReport measurereport = MeasureReportHelper.fromJson(json);
         assertEquals("Expect ", "measurereport-cms146-cat2-example", measurereport.getId());
      }
      @Test
      public void testLoadPatient10FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-animal.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "animal", patient.getId());
      }
      @Test
      public void testLoadValueSet342FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-constraint-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "constraint-severity", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition369FromJson() throws Exception {
         String inputFile = "./examples-json/extension-mapsourcepublisher.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "mapSourcePublisher", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet343FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-endpoint-connection-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "endpoint-connection-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet344FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-device-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "device-kind", valueset.getId());
      }
      @Test
      public void testLoadLibrary7FromJson() throws Exception {
         String inputFile = "./examples-json/library-mmi-suiciderisk-orderset-logic.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "suiciderisk-orderset-logic", library.getId());
      }
      @Test
      public void testLoadProcessRequest4FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-example-poll-payrec.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessRequest processrequest = ProcessRequestHelper.fromJson(json);
         assertEquals("Expect ", "1114", processrequest.getId());
      }
      @Test
      public void testLoadPatient11FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-f001-pieter.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "f001", patient.getId());
      }
      @Test
      public void testLoadValueSet345FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-observation-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "observation-codes", valueset.getId());
      }
      @Test
      public void testLoadValueSet346FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-episode-of-care-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "episode-of-care-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem250FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-action-cardinality-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "action-cardinality-behavior", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition370FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "NutritionOrder", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition371FromJson() throws Exception {
         String inputFile = "./examples-json/backboneelement.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "BackboneElement", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire99FromJson() throws Exception {
         String inputFile = "./examples-json/researchstudy-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadProcessRequest5FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-example-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessRequest processrequest = ProcessRequestHelper.fromJson(json);
         assertEquals("Expect ", "87655", processrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition372FromJson() throws Exception {
         String inputFile = "./examples-json/reference.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Reference", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet347FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-operational-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "operational-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet348FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-questionnaire-usage-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-usage-mode", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem251FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-linkage-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "linkage-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem252FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-allergy-clinical-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "allergy-clinical-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition373FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-history.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-history", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem253FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-related-artifact-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "related-artifact-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem254FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-specification-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "specification-type", codesystem.getId());
      }
      @Test
      public void testLoadObservation37FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-20minute-apgar-score.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "20minute-apgar-score", observation.getId());
      }
      @Test
      public void testLoadValueSet349FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-restful-security-service.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "restful-security-service", valueset.getId());
      }
      @Test
      public void testLoadMedicationStatement5FromJson() throws Exception {
         String inputFile = "./examples-json/medicationstatementexample5.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationStatement medicationstatement = MedicationStatementHelper.fromJson(json);
         assertEquals("Expect ", "example005", medicationstatement.getId());
      }
      @Test
      public void testLoadCodeSystem255FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-name-assembly-order.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "name-assembly-order", codesystem.getId());
      }
      @Test
      public void testLoadOperationDefinition25FromJson() throws Exception {
         String inputFile = "./examples-json/operationdefinition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "example", operationdefinition.getId());
      }
      @Test
      public void testLoadEncounter6FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example-f202-20130128.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "f202", encounter.getId());
      }
      @Test
      public void testLoadValueSet350FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-explanationofbenefit-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "explanationofbenefit-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition374FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-systemname.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-systemName", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet351FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ucum-bodytemp.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ucum-bodytemp", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem256FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-benefit-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "benefit-category", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem257FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contract-actorrole.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contract-actorrole", codesystem.getId());
      }
      @Test
      public void testLoadValueSet352FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-state.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-state", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem258FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contract-subtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contract-subtype", codesystem.getId());
      }
      @Test
      public void testLoadPlanDefinition8FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-exclusive-breastfeeding-intervention-04.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "exclusive-breastfeeding-intervention-04", plandefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition375FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-nullflavor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-nullFlavor", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire100FromJson() throws Exception {
         String inputFile = "./examples-json/familymemberhistory-genetic-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadPaymentReconciliation1FromJson() throws Exception {
         String inputFile = "./examples-json/paymentreconciliation-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PaymentReconciliation paymentreconciliation = PaymentReconciliationHelper.fromJson(json);
         assertEquals("Expect ", "ER2500", paymentreconciliation.getId());
      }
      @Test
      public void testLoadStructureDefinition376FromJson() throws Exception {
         String inputFile = "./examples-json/extension-hla-genotyping-results-method.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "hla-genotyping-results-method", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire101FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaire-example-f201-lifelines.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "f201", questionnaire.getId());
      }
      @Test
      public void testLoadMedicationDispense25FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispenseexample8.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp008", medicationdispense.getId());
      }
      @Test
      public void testLoadBundle25FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaire-profile-example-ussg-fht.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "ussg-fht", bundle.getId());
      }
      @Test
      public void testLoadSubscription2FromJson() throws Exception {
         String inputFile = "./examples-json/subscription-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Subscription subscription = SubscriptionHelper.fromJson(json);
         assertEquals("Expect ", "example", subscription.getId());
      }
      @Test
      public void testLoadValueSet353FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contactentity-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contactentity-type", valueset.getId());
      }
      @Test
      public void testLoadDevice7FromJson() throws Exception {
         String inputFile = "./examples-json/device-example-software.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Device device = DeviceHelper.fromJson(json);
         assertEquals("Expect ", "software", device.getId());
      }
      @Test
      public void testLoadCodeSystem259FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contract-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contract-type", codesystem.getId());
      }
      @Test
      public void testLoadTestReport1FromJson() throws Exception {
         String inputFile = "./examples-json/testreport-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         TestReport testreport = TestReportHelper.fromJson(json);
         assertEquals("Expect ", "testreport-example", testreport.getId());
      }
      @Test
      public void testLoadMedication14FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0310.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0310", medication.getId());
      }
      @Test
      public void testLoadCodeSystem260FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-payeetype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "payeetype", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition377FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-importance.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-importance", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire102FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition378FromJson() throws Exception {
         String inputFile = "./examples-json/requestgroup.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "RequestGroup", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet354FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-example-intensional.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "example-intensional", valueset.getId());
      }
      @Test
      public void testLoadRequestGroup2FromJson() throws Exception {
         String inputFile = "./examples-json/requestgroup-kdn5-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RequestGroup requestgroup = RequestGroupHelper.fromJson(json);
         assertEquals("Expect ", "kdn5-example", requestgroup.getId());
      }
      @Test
      public void testLoadProcessRequest6FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessRequest processrequest = ProcessRequestHelper.fromJson(json);
         assertEquals("Expect ", "1110", processrequest.getId());
      }
      @Test
      public void testLoadExpansionProfile1FromJson() throws Exception {
         String inputFile = "./examples-json/expansionprofile-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ExpansionProfile expansionprofile = ExpansionProfileHelper.fromJson(json);
         assertEquals("Expect ", "example", expansionprofile.getId());
      }
      @Test
      public void testLoadProvenance4FromJson() throws Exception {
         String inputFile = "./examples-json/provenance-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Provenance provenance = ProvenanceHelper.fromJson(json);
         assertEquals("Expect ", "example", provenance.getId());
      }
      @Test
      public void testLoadPlanDefinition9FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-example-kdn5-simplified.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "KDN5", plandefinition.getId());
      }
      @Test
      public void testLoadProcessResponse2FromJson() throws Exception {
         String inputFile = "./examples-json/processresponse-example-error.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessResponse processresponse = ProcessResponseHelper.fromJson(json);
         assertEquals("Expect ", "SR2349", processresponse.getId());
      }
      @Test
      public void testLoadValueSet355FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-procedure-not-performed-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "procedure-not-performed-reason", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem261FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-communication-not-done-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "communication-not-done-reason", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem262FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-conceptmap-unmapped-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "conceptmap-unmapped-mode", codesystem.getId());
      }
      @Test
      public void testLoadProcessResponse3FromJson() throws Exception {
         String inputFile = "./examples-json/processresponse-example-pended.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessResponse processresponse = ProcessResponseHelper.fromJson(json);
         assertEquals("Expect ", "SR2499", processresponse.getId());
      }
      @Test
      public void testLoadCompartmentDefinition5FromJson() throws Exception {
         String inputFile = "./examples-json/compartmentdefinition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CompartmentDefinition compartmentdefinition = CompartmentDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "example", compartmentdefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition379FromJson() throws Exception {
         String inputFile = "./examples-json/extension-operationoutcome-authority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "operationoutcome-authority", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition380FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-author.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-author", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition381FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-permitted-value-conceptmap.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-permitted-value-conceptmap", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition382FromJson() throws Exception {
         String inputFile = "./examples-json/xhtml.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "xhtml", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet356FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-group-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "group-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition383FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsallelicstate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsAllelicState", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet357FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ex-payee-resource-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ex-payee-resource-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition384FromJson() throws Exception {
         String inputFile = "./examples-json/extension-minlength.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "minLength", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet358FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-dispense-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-dispense-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet359FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contract-signer-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contract-signer-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet360FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-basic-resource-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "basic-resource-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem263FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-coverage-level.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "coverage-level", codesystem.getId());
      }
      @Test
      public void testLoadParameters1FromJson() throws Exception {
         String inputFile = "./examples-json/parameters-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Parameters parameters = ParametersHelper.fromJson(json);
         assertEquals("Expect ", "example", parameters.getId());
      }
      @Test
      public void testLoadStructureDefinition385FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedurerequest-precondition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedurerequest-precondition", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense26FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0331.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0331", medicationdispense.getId());
      }
      @Test
      public void testLoadStructureDefinition386FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-ordinalvalue.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-ordinalValue", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet361FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-related-artifact-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "related-artifact-type", valueset.getId());
      }
      @Test
      public void testLoadProcedure12FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-physical-therapy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "physical-therapy", procedure.getId());
      }
      @Test
      public void testLoadPlanDefinition10FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-zika-virus-intervention.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "zika-virus-intervention", plandefinition.getId());
      }
      @Test
      public void testLoadCodeSystem264FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-oral-prosthodontic-material.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "oral-prosthodontic-material", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire103FromJson() throws Exception {
         String inputFile = "./examples-json/vitalspanel-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet362FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-event-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "event-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem265FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-extra-security-role-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "extra-security-role-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem266FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-restful-security-service.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "restful-security-service", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition387FromJson() throws Exception {
         String inputFile = "./examples-json/boolean.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "boolean", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem267FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-property-representation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "property-representation", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem268FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-consent-state-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "consent-state-codes", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem269FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contract-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contract-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet363FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-issue-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "issue-severity", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition388FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-de-submitter-org.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-de-submitter-org", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet364FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-supplydelivery-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "supplydelivery-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet365FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-no-immunization-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "no-immunization-reason", valueset.getId());
      }
      @Test
      public void testLoadValueSet366FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-type-derivation-rule.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "type-derivation-rule", valueset.getId());
      }
      @Test
      public void testLoadClaimResponse1FromJson() throws Exception {
         String inputFile = "./examples-json/claimresponse-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ClaimResponse claimresponse = ClaimResponseHelper.fromJson(json);
         assertEquals("Expect ", "R3500", claimresponse.getId());
      }
      @Test
      public void testLoadStructureDefinition389FromJson() throws Exception {
         String inputFile = "./examples-json/vitalsigns.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "vitalsigns", structuredefinition.getId());
      }
      @Test
      public void testLoadPerson3FromJson() throws Exception {
         String inputFile = "./examples-json/person-patient-portal.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Person person = PersonHelper.fromJson(json);
         assertEquals("Expect ", "pp", person.getId());
      }
      @Test
      public void testLoadStructureDefinition390FromJson() throws Exception {
         String inputFile = "./examples-json/enrollmentrequest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "EnrollmentRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition391FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-author.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-author", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet367FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-slotstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "slotstatus", valueset.getId());
      }
      @Test
      public void testLoadMedicationDispense27FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0320.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0320", medicationdispense.getId());
      }
      @Test
      public void testLoadSearchParameter21FromJson() throws Exception {
         String inputFile = "./examples-json/searchparameter-example-extension.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "example-extension", searchparameter.getId());
      }
      @Test
      public void testLoadCodeSystem270FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-udi.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "udi", codesystem.getId());
      }
      @Test
      public void testLoadValueSet368FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ex-paymenttype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ex-paymenttype", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem271FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-reference-handling-policy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "reference-handling-policy", codesystem.getId());
      }
      @Test
      public void testLoadValueSet369FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-admit-source.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-admit-source", valueset.getId());
      }
      @Test
      public void testLoadMedicationStatement6FromJson() throws Exception {
         String inputFile = "./examples-json/medicationstatementexample2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationStatement medicationstatement = MedicationStatementHelper.fromJson(json);
         assertEquals("Expect ", "example002", medicationstatement.getId());
      }
      @Test
      public void testLoadSequence13FromJson() throws Exception {
         String inputFile = "./examples-json/coord-1base-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "coord-1-base", sequence.getId());
      }
      @Test
      public void testLoadCodeSystem272FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-care-team-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "care-team-category", codesystem.getId());
      }
      @Test
      public void testLoadBundle26FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-hla-genetics-results-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "hla-1", bundle.getId());
      }
      @Test
      public void testLoadStructureDefinition392FromJson() throws Exception {
         String inputFile = "./examples-json/extension-humanname-mothers-family.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "humanname-mothers-family", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest26FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0328.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0328", medicationrequest.getId());
      }
      @Test
      public void testLoadDevice8FromJson() throws Exception {
         String inputFile = "./examples-json/device-example-udi2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Device device = DeviceHelper.fromJson(json);
         assertEquals("Expect ", "example-udi2", device.getId());
      }
      @Test
      public void testLoadCodeSystem273FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-digital-media-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "digital-media-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem274FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-system-version-processing-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "system-version-processing-mode", codesystem.getId());
      }
      @Test
      public void testLoadValueSet370FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-administrative-gender.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "administrative-gender", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition393FromJson() throws Exception {
         String inputFile = "./examples-json/extension-communicationrequest-definition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "communicationrequest-definition", structuredefinition.getId());
      }
      @Test
      public void testLoadOrganization10FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-gastro.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "1", organization.getId());
      }
      @Test
      public void testLoadBundle27FromJson() throws Exception {
         String inputFile = "./examples-json/bundle-response-simplesummary.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "bundle-response-simplesummary", bundle.getId());
      }
      @Test
      public void testLoadObservation38FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-eye-color.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "eye-color", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition394FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-deliverymodeidentifier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-deliveryModeIdentifier", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest27FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0310.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0310", medicationrequest.getId());
      }
      @Test
      public void testLoadValueSet371FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-service-uscls.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "service-uscls", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem275FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-device-statement-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "device-statement-status", codesystem.getId());
      }
      @Test
      public void testLoadImmunization1FromJson() throws Exception {
         String inputFile = "./examples-json/immunization-example-historical.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Immunization immunization = ImmunizationHelper.fromJson(json);
         assertEquals("Expect ", "historical", immunization.getId());
      }
      @Test
      public void testLoadMedicationStatement7FromJson() throws Exception {
         String inputFile = "./examples-json/medicationstatementexample7.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationStatement medicationstatement = MedicationStatementHelper.fromJson(json);
         assertEquals("Expect ", "example007", medicationstatement.getId());
      }
      @Test
      public void testLoadCodeSystem276FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-consent-action.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "consent-action", codesystem.getId());
      }
      @Test
      public void testLoadObservation39FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f202-temperature.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f202", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition395FromJson() throws Exception {
         String inputFile = "./examples-json/extension-pharmacy-core-mindoseperperiod.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "pharmacy-core-minDosePerPeriod", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem277FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-request-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-request-category", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem278FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-list-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "list-mode", codesystem.getId());
      }
      @Test
      public void testLoadValueSet372FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-kos-title.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "kos-title", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem279FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-care-plan-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-status", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire104FromJson() throws Exception {
         String inputFile = "./examples-json/media-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem280FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-map-target-list-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "map-target-list-mode", codesystem.getId());
      }
      @Test
      public void testLoadPerson4FromJson() throws Exception {
         String inputFile = "./examples-json/person-provider-directory.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Person person = PersonHelper.fromJson(json);
         assertEquals("Expect ", "pd", person.getId());
      }
      @Test
      public void testLoadCommunicationRequest2FromJson() throws Exception {
         String inputFile = "./examples-json/communicationrequest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CommunicationRequest communicationrequest = CommunicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "example", communicationrequest.getId());
      }
      @Test
      public void testLoadCodeSystem281FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-identifier-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "identifier-use", codesystem.getId());
      }
      @Test
      public void testLoadValueSet373FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adjudication-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adjudication-reason", valueset.getId());
      }
      @Test
      public void testLoadPerson5FromJson() throws Exception {
         String inputFile = "./examples-json/person-example-f002-ariadne.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Person person = PersonHelper.fromJson(json);
         assertEquals("Expect ", "f002", person.getId());
      }
      @Test
      public void testLoadValueSet374FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-document-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "document-mode", valueset.getId());
      }
      @Test
      public void testLoadClaim9FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-pharmacy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "760150", claim.getId());
      }
      @Test
      public void testLoadValueSet375FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-performer-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "performer-role", valueset.getId());
      }
      @Test
      public void testLoadProcedureRequest12FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-genetics-example-1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "og-example1", procedurerequest.getId());
      }
      @Test
      public void testLoadValueSet376FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition396FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-workflowstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-workflowStatus", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition397FromJson() throws Exception {
         String inputFile = "./examples-json/library.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Library", structuredefinition.getId());
      }
      @Test
      public void testLoadProvenance5FromJson() throws Exception {
         String inputFile = "./examples-json/provenance-example-sig.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Provenance provenance = ProvenanceHelper.fromJson(json);
         assertEquals("Expect ", "signature", provenance.getId());
      }
      @Test
      public void testLoadStructureDefinition398FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-usage.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-usage", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem282FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-ex-onsettype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "ex-onsettype", codesystem.getId());
      }
      @Test
      public void testLoadValueSet377FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-modified-foodtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "modified-foodtype", valueset.getId());
      }
      @Test
      public void testLoadObservation40FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-genetics-4.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example-genetics-4", observation.getId());
      }
      @Test
      public void testLoadStructureMap2FromJson() throws Exception {
         String inputFile = "./examples-json/structuremap-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureMap structuremap = StructureMapHelper.fromJson(json);
         assertEquals("Expect ", "example", structuremap.getId());
      }
      @Test
      public void testLoadValueSet378FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-composition-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "composition-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition399FromJson() throws Exception {
         String inputFile = "./examples-json/extension-condition-dueto.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "condition-dueTo", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet379FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-consent-data-meaning.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "consent-data-meaning", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire105FromJson() throws Exception {
         String inputFile = "./examples-json/conceptmap-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem283FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-action-precheck-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "action-precheck-behavior", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem284FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-benefit-unit.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "benefit-unit", codesystem.getId());
      }
      @Test
      public void testLoadNutritionOrder11FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-renaldiet.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "renaldiet", nutritionorder.getId());
      }
      @Test
      public void testLoadValueSet380FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-link-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "link-type", valueset.getId());
      }
      @Test
      public void testLoadActivityDefinition8FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ActivityDefinition activitydefinition = ActivityDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "referralPrimaryCareMentalHealth", activitydefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire106FromJson() throws Exception {
         String inputFile = "./examples-json/documentreference-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem285FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-dataelement-stringency.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "dataelement-stringency", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem286FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-claim-modifiers.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "claim-modifiers", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem287FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-consent-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "consent-category", codesystem.getId());
      }
      @Test
      public void testLoadProcessRequest7FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-example-poll-eob.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessRequest processrequest = ProcessRequestHelper.fromJson(json);
         assertEquals("Expect ", "1115", processrequest.getId());
      }
      @Test
      public void testLoadQuestionnaire107FromJson() throws Exception {
         String inputFile = "./examples-json/episodeofcare-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet381FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-name-assembly-order.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "name-assembly-order", valueset.getId());
      }
      @Test
      public void testLoadDocumentManifest1FromJson() throws Exception {
         String inputFile = "./examples-json/documentmanifest-fm-attachment.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DocumentManifest documentmanifest = DocumentManifestHelper.fromJson(json);
         assertEquals("Expect ", "654789", documentmanifest.getId());
      }
      @Test
      public void testLoadCodeSystem288FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adjudication-error.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adjudication-error", codesystem.getId());
      }
      @Test
      public void testLoadValueSet382FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-template-status-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "template-status-code", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition400FromJson() throws Exception {
         String inputFile = "./examples-json/valueset.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ValueSet", structuredefinition.getId());
      }
      @Test
      public void testLoadLinkage1FromJson() throws Exception {
         String inputFile = "./examples-json/linkage-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Linkage linkage = LinkageHelper.fromJson(json);
         assertEquals("Expect ", "example", linkage.getId());
      }
      @Test
      public void testLoadBundle28FromJson() throws Exception {
         String inputFile = "./examples-json/endpoint-examples-general-template.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "b0a5e4277-83c4-4adb-87e2-e3efe3369b6f", bundle.getId());
      }
      @Test
      public void testLoadCodeSystem289FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-payment-adjustment-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "payment-adjustment-reason", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition401FromJson() throws Exception {
         String inputFile = "./examples-json/extension-entryformat.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "entryFormat", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition402FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-map.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-map", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire108FromJson() throws Exception {
         String inputFile = "./examples-json/consent-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadBundle29FromJson() throws Exception {
         String inputFile = "./examples-json/valuesets.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "valuesets", bundle.getId());
      }
      @Test
      public void testLoadValueSet383FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-hl7-work-group.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "hl7-work-group", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition403FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-additionallocator.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-additionalLocator", structuredefinition.getId());
      }
      @Test
      public void testLoadSearchParameter22FromJson() throws Exception {
         String inputFile = "./examples-json/location-extensions-Location-alias.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "location-extensions-Location-alias", searchparameter.getId());
      }
      @Test
      public void testLoadValueSet384FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-map-group-type-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "map-group-type-mode", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire109FromJson() throws Exception {
         String inputFile = "./examples-json/task-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition404FromJson() throws Exception {
         String inputFile = "./examples-json/detectedissue.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DetectedIssue", structuredefinition.getId());
      }
      @Test
      public void testLoadDiagnosticReport11FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-f001-bloodexam.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "f001", diagnosticreport.getId());
      }
      @Test
      public void testLoadClaim10FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-oral-bridge.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "100156", claim.getId());
      }
      @Test
      public void testLoadQuestionnaire110FromJson() throws Exception {
         String inputFile = "./examples-json/graphdefinition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet385FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-chargeitem-billingcodes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "chargeitem-billingcodes", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition405FromJson() throws Exception {
         String inputFile = "./examples-json/extension-goal-acceptance.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "goal-acceptance", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem290FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-namingsystem-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "namingsystem-type", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire111FromJson() throws Exception {
         String inputFile = "./examples-json/patient-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet386FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contact-point-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contact-point-use", valueset.getId());
      }
      @Test
      public void testLoadAccount2FromJson() throws Exception {
         String inputFile = "./examples-json/account-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Account account = AccountHelper.fromJson(json);
         assertEquals("Expect ", "example", account.getId());
      }
      @Test
      public void testLoadLibrary8FromJson() throws Exception {
         String inputFile = "./examples-json/library-composition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "composition-example", library.getId());
      }
      @Test
      public void testLoadStructureDefinition406FromJson() throws Exception {
         String inputFile = "./examples-json/extension-specimen-processingtime.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "specimen-processingTime", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet387FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-diagnostic-service-sections.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "diagnostic-service-sections", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire112FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-genetics-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadMedication15FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0321.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0321", medication.getId());
      }
      @Test
      public void testLoadStructureDefinition407FromJson() throws Exception {
         String inputFile = "./examples-json/imagingmanifest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ImagingManifest", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem291FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-discriminator-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "discriminator-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet388FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-fm-itemtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "fm-itemtype", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition408FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-summary.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-summary", structuredefinition.getId());
      }
      @Test
      public void testLoadMessageHeader1FromJson() throws Exception {
         String inputFile = "./examples-json/messageheader-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MessageHeader messageheader = MessageHeaderHelper.fromJson(json);
         assertEquals("Expect ", "1cbdfb97-5859-48a4-8301-d54eab818d68", messageheader.getId());
      }
      @Test
      public void testLoadValueSet389FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-media-view.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "media-view", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition409FromJson() throws Exception {
         String inputFile = "./examples-json/extension-maxdecimalplaces.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "maxDecimalPlaces", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition410FromJson() throws Exception {
         String inputFile = "./examples-json/extension-openehr-location.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "openEHR-location", structuredefinition.getId());
      }
      @Test
      public void testLoadLibrary9FromJson() throws Exception {
         String inputFile = "./examples-json/library-exclusive-breastfeeding-cds-logic.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "library-exclusive-breastfeeding-cds-logic", library.getId());
      }
      @Test
      public void testLoadCodeSystem292FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-implant-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "implant-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem293FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-messageheader-response-request.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "messageheader-response-request", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem294FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-codesystem-content-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-content-mode", codesystem.getId());
      }
      @Test
      public void testLoadRelatedPerson3FromJson() throws Exception {
         String inputFile = "./examples-json/relatedperson-example-f002-ariadne.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RelatedPerson relatedperson = RelatedPersonHelper.fromJson(json);
         assertEquals("Expect ", "f002", relatedperson.getId());
      }
      @Test
      public void testLoadValueSet390FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-appointmentstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "appointmentstatus", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem295FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-udi-entry-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "udi-entry-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet391FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-provider-qualification.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "provider-qualification", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition411FromJson() throws Exception {
         String inputFile = "./examples-json/substance.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Substance", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet392FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-participant-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-participant-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition412FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-comment.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-comment", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem296FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-practitioner-specialty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "practitioner-specialty", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition413FromJson() throws Exception {
         String inputFile = "./examples-json/extension-organization-period.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "organization-period", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet393FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-practitioner-specialty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "practitioner-specialty", valueset.getId());
      }
      @Test
      public void testLoadMedicationDispense28FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0309.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0309", medicationdispense.getId());
      }
      @Test
      public void testLoadValueSet394FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-document-relationship-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "document-relationship-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition414FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsaminoacidchangename.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsAminoAcidChangeName", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet395FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-as-needed-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-as-needed-reason", valueset.getId());
      }
      @Test
      public void testLoadValueSet396FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-observation-valueabsentreason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "observation-valueabsentreason", valueset.getId());
      }
      @Test
      public void testLoadMedicationAdministration9FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0307.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0307", medicationadministration.getId());
      }
      @Test
      public void testLoadValueSet397FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-audit-source-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "audit-source-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition415FromJson() throws Exception {
         String inputFile = "./examples-json/structuremap.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "StructureMap", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet398FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-vision-product.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "vision-product", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem297FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-dicom-dcim.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "dicom-dcim", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire113FromJson() throws Exception {
         String inputFile = "./examples-json/adverseevent-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet399FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-ldlcholesterol-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "ldlcholesterol-codes", valueset.getId());
      }
      @Test
      public void testLoadValueSet400FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-devicemetric-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "devicemetric-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem298FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-care-plan-activity-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-activity-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition416FromJson() throws Exception {
         String inputFile = "./examples-json/extension-datadictionary.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "datadictionary", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire114FromJson() throws Exception {
         String inputFile = "./examples-json/hlaresult-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire115FromJson() throws Exception {
         String inputFile = "./examples-json/paymentnotice-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadRelatedPerson4FromJson() throws Exception {
         String inputFile = "./examples-json/relatedperson-example-peter.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         RelatedPerson relatedperson = RelatedPersonHelper.fromJson(json);
         assertEquals("Expect ", "peter", relatedperson.getId());
      }
      @Test
      public void testLoadStructureDefinition417FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaireresponse.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "QuestionnaireResponse", structuredefinition.getId());
      }
      @Test
      public void testLoadLocation5FromJson() throws Exception {
         String inputFile = "./examples-json/location-example-ambulance.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Location location = LocationHelper.fromJson(json);
         assertEquals("Expect ", "amb", location.getId());
      }
      @Test
      public void testLoadStructureDefinition418FromJson() throws Exception {
         String inputFile = "./examples-json/testreport.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "TestReport", structuredefinition.getId());
      }
      @Test
      public void testLoadConceptMap13FromJson() throws Exception {
         String inputFile = "./examples-json/cm-composition-status-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-composition-status-v3", conceptmap.getId());
      }
      @Test
      public void testLoadCodeSystem299FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-restful-interaction.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "restful-interaction", codesystem.getId());
      }
      @Test
      public void testLoadSearchParameter23FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-extensions-ValueSet-author.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "valueset-extensions-ValueSet-author", searchparameter.getId());
      }
      @Test
      public void testLoadStructureDefinition419FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-itemcontrol.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-itemControl", structuredefinition.getId());
      }
      @Test
      public void testLoadMedia2FromJson() throws Exception {
         String inputFile = "./examples-json/media-example-xray.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Media media = MediaHelper.fromJson(json);
         assertEquals("Expect ", "xray", media.getId());
      }
      @Test
      public void testLoadSearchParameter24FromJson() throws Exception {
         String inputFile = "./examples-json/patient-extensions-Patient-birthOrderBoolean.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "patient-extensions-Patient-birthOrderBoolean", searchparameter.getId());
      }
      @Test
      public void testLoadQuestionnaire116FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadLocation6FromJson() throws Exception {
         String inputFile = "./examples-json/location-example-hl7hq.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Location location = LocationHelper.fromJson(json);
         assertEquals("Expect ", "hl7", location.getId());
      }
      @Test
      public void testLoadQuestionnaire117FromJson() throws Exception {
         String inputFile = "./examples-json/implementationguide-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem300FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-task-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "task-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition420FromJson() throws Exception {
         String inputFile = "./examples-json/extension-practitionerrole-primaryind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "practitionerrole-primaryInd", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet401FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-goal-status-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "goal-status-reason", valueset.getId());
      }
      @Test
      public void testLoadValueSet402FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-variant-state.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "variant-state", valueset.getId());
      }
      @Test
      public void testLoadSequence14FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-example-TPMT-one.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "example-TPMT-one", sequence.getId());
      }
      @Test
      public void testLoadValueSet403FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-data-absent-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "data-absent-reason", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition421FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-lookupquestionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-lookupQuestionnaire", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition422FromJson() throws Exception {
         String inputFile = "./examples-json/extension-practitioner-classification.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "practitioner-classification", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet404FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-referral-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "referral-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet405FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-questionnaire-item-control.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-item-control", valueset.getId());
      }
      @Test
      public void testLoadPatient12FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-d.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "pat4", patient.getId());
      }
      @Test
      public void testLoadStructureDefinition423FromJson() throws Exception {
         String inputFile = "./examples-json/extension-body-site-instance.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "body-site-instance", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet406FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-animal-genderstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "animal-genderstatus", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem301FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-choice-list-orientation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "choice-list-orientation", codesystem.getId());
      }
      @Test
      public void testLoadMedicationRequest28FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0334.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0334", medicationrequest.getId());
      }
      @Test
      public void testLoadCodeSystem302FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-link-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "link-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition424FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-allowedprofile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-allowedProfile", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation41FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-body-temperature.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "body-temperature", observation.getId());
      }
      @Test
      public void testLoadValueSet407FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-allergy-verification-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "allergy-verification-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet408FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adverse-event-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-category", valueset.getId());
      }
      @Test
      public void testLoadMedicationRequest29FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0315.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0315", medicationrequest.getId());
      }
      @Test
      public void testLoadMeasureReport3FromJson() throws Exception {
         String inputFile = "./examples-json/measurereport-cms146-cat3-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MeasureReport measurereport = MeasureReportHelper.fromJson(json);
         assertEquals("Expect ", "measurereport-cms146-cat3-example", measurereport.getId());
      }
      @Test
      public void testLoadCodeSystem303FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-report-result-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "report-result-codes", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition425FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-unitid.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-unitID", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem304FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-claim-informationcategory.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "claim-informationcategory", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem305FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-missing-tooth-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "missing-tooth-reason", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition426FromJson() throws Exception {
         String inputFile = "./examples-json/extension-auditevent-instance.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "auditevent-Instance", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet409FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-icd-10-procedures.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "icd-10-procedures", valueset.getId());
      }
      @Test
      public void testLoadEncounter7FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example-f203-20130311.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "f203", encounter.getId());
      }
      @Test
      public void testLoadValueSet410FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-clinical-impression-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "clinical-impression-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem306FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-participantrequired.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "participantrequired", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem307FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-object-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "object-role", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire118FromJson() throws Exception {
         String inputFile = "./examples-json/compartmentdefinition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem308FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-data-absent-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "data-absent-reason", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaire119FromJson() throws Exception {
         String inputFile = "./examples-json/devicerequest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition427FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-iscommonbinding.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-isCommonBinding", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet411FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-message-reason-encounter.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "message-reason-encounter", valueset.getId());
      }
      @Test
      public void testLoadValueSet412FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-participant-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "participant-role", valueset.getId());
      }
      @Test
      public void testLoadValueSet413FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-defined-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "defined-types", valueset.getId());
      }
      @Test
      public void testLoadObservation42FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f005-hemoglobin.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f005", observation.getId());
      }
      @Test
      public void testLoadQuestionnaire120FromJson() throws Exception {
         String inputFile = "./examples-json/measure-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadNutritionOrder12FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-diabeticsupplement.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "diabeticsupplement", nutritionorder.getId());
      }
      @Test
      public void testLoadValueSet414FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-request-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-request-priority", valueset.getId());
      }
      @Test
      public void testLoadSearchParameter25FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-extensions-CodeSystem-end.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-extensions-CodeSystem-end", searchparameter.getId());
      }
      @Test
      public void testLoadValueSet415FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-practitioner-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "practitioner-role", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition428FromJson() throws Exception {
         String inputFile = "./examples-json/extension-family-member-history-genetics-sibling.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "family-member-history-genetics-sibling", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem309FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-action-relationship-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "action-relationship-type", codesystem.getId());
      }
      @Test
      public void testLoadValueSet416FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-list-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "list-mode", valueset.getId());
      }
      @Test
      public void testLoadCapabilityStatement6FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CapabilityStatement capabilitystatement = CapabilityStatementHelper.fromJson(json);
         assertEquals("Expect ", "example", capabilitystatement.getId());
      }
      @Test
      public void testLoadMedicationRequest30FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0321.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0321", medicationrequest.getId());
      }
      @Test
      public void testLoadValueSet417FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-care-plan-activity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-activity", valueset.getId());
      }
      @Test
      public void testLoadValueSet418FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-research-subject-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "research-subject-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition429FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-identifier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-identifier", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition26FromJson() throws Exception {
         String inputFile = "./examples-json/operation-measure-evaluate-measure.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Measure-evaluate-measure", operationdefinition.getId());
      }
      @Test
      public void testLoadValueSet419FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-consistency-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "consistency-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem310FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-adverse-event-seriousness.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-seriousness", codesystem.getId());
      }
      @Test
      public void testLoadFHIRList6FromJson() throws Exception {
         String inputFile = "./examples-json/list-example-empty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FHIRList fhirlist = FHIRListHelper.fromJson(json);
         assertEquals("Expect ", "example-empty", fhirlist.getId());
      }
      @Test
      public void testLoadMedia3FromJson() throws Exception {
         String inputFile = "./examples-json/media-example-sound.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Media media = MediaHelper.fromJson(json);
         assertEquals("Expect ", "sound", media.getId());
      }
      @Test
      public void testLoadValueSet420FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-enteral-route.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "enteral-route", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition430FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-congregation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-congregation", structuredefinition.getId());
      }
      @Test
      public void testLoadCondition10FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example-family-history.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "family-history", condition.getId());
      }
      @Test
      public void testLoadMedicationAdministration10FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0305.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0305", medicationadministration.getId());
      }
      @Test
      public void testLoadValueSet421FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-address-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "address-type", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire121FromJson() throws Exception {
         String inputFile = "./examples-json/requestgroup-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem311FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-request-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "request-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition431FromJson() throws Exception {
         String inputFile = "./examples-json/extension-concept-bidirectional.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "concept-bidirectional", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition432FromJson() throws Exception {
         String inputFile = "./examples-json/appointment.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Appointment", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition27FromJson() throws Exception {
         String inputFile = "./examples-json/operation-resource-validate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Resource-validate", operationdefinition.getId());
      }
      @Test
      public void testLoadValueSet422FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-concept-property-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "concept-property-type", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem312FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-goal-acceptance-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "goal-acceptance-status", codesystem.getId());
      }
      @Test
      public void testLoadMedia4FromJson() throws Exception {
         String inputFile = "./examples-json/media-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Media media = MediaHelper.fromJson(json);
         assertEquals("Expect ", "example", media.getId());
      }
      @Test
      public void testLoadEncounter8FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example-home.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "home", encounter.getId());
      }
      @Test
      public void testLoadValueSet423FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contract-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contract-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition433FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticssequence.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsSequence", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition434FromJson() throws Exception {
         String inputFile = "./examples-json/definition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Definition", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition435FromJson() throws Exception {
         String inputFile = "./examples-json/extension-allergyintolerance-reasonrefuted.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "allergyintolerance-reasonRefuted", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition436FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityrequest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "EligibilityRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition437FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-reference.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-reference", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition438FromJson() throws Exception {
         String inputFile = "./examples-json/extension-familymemberhistory-abatement.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "familymemberhistory-abatement", structuredefinition.getId());
      }
      @Test
      public void testLoadProcedureRequest13FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-ft4.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "ft4", procedurerequest.getId());
      }
      @Test
      public void testLoadPatient13FromJson() throws Exception {
         String inputFile = "./examples-json/patient-glossy-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "glossy", patient.getId());
      }
      @Test
      public void testLoadValueSet424FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-special-values.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "special-values", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition439FromJson() throws Exception {
         String inputFile = "./examples-json/extension-usagecontext-group.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "usagecontext-group", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet425FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "example-extensional", valueset.getId());
      }
      @Test
      public void testLoadEligibilityRequest2FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityrequest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         EligibilityRequest eligibilityrequest = EligibilityRequestHelper.fromJson(json);
         assertEquals("Expect ", "52345", eligibilityrequest.getId());
      }
      @Test
      public void testLoadCodeSystem313FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-copy-number-event.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "copy-number-event", codesystem.getId());
      }
      @Test
      public void testLoadOperationDefinition28FromJson() throws Exception {
         String inputFile = "./examples-json/operation-plandefinition-apply.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "PlanDefinition-apply", operationdefinition.getId());
      }
      @Test
      public void testLoadContract4FromJson() throws Exception {
         String inputFile = "./examples-json/pcd-example-notThis.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Contract contract = ContractHelper.fromJson(json);
         assertEquals("Expect ", "pcd-example-notThis", contract.getId());
      }
      @Test
      public void testLoadValueSet426FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-coverage-level.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "coverage-level", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition440FromJson() throws Exception {
         String inputFile = "./examples-json/age.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Age", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition441FromJson() throws Exception {
         String inputFile = "./examples-json/extension-capabilitystatement-websocket.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "capabilitystatement-websocket", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition442FromJson() throws Exception {
         String inputFile = "./examples-json/extension-specimen-collectionpriority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "specimen-collectionPriority", structuredefinition.getId());
      }
      @Test
      public void testLoadVisionPrescription2FromJson() throws Exception {
         String inputFile = "./examples-json/visionprescription-example-1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         VisionPrescription visionprescription = VisionPrescriptionHelper.fromJson(json);
         assertEquals("Expect ", "33124", visionprescription.getId());
      }
      @Test
      public void testLoadCodeSystem314FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-claim-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "claim-use", codesystem.getId());
      }
      @Test
      public void testLoadValueSet427FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-map-target-list-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "map-target-list-mode", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition443FromJson() throws Exception {
         String inputFile = "./examples-json/explanationofbenefit.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ExplanationOfBenefit", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition444FromJson() throws Exception {
         String inputFile = "./examples-json/medication.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Medication", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet428FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-operation-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "operation-outcome", valueset.getId());
      }
      @Test
      public void testLoadValueSet429FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-research-study-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "research-study-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem315FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-diagnostic-report-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "diagnostic-report-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet430FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-account-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "account-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition445FromJson() throws Exception {
         String inputFile = "./examples-json/healthcareservice.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "HealthcareService", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire122FromJson() throws Exception {
         String inputFile = "./examples-json/eligibilityrequest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition446FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-regex.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-regex", structuredefinition.getId());
      }
      @Test
      public void testLoadCondition11FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "example", condition.getId());
      }
      @Test
      public void testLoadStructureDefinition447FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-xml-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-xml-type", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire123FromJson() throws Exception {
         String inputFile = "./examples-json/contract-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadMedicationDispense29FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0302.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0302", medicationdispense.getId());
      }
      @Test
      public void testLoadFHIRList7FromJson() throws Exception {
         String inputFile = "./examples-json/list-example-double-cousin-relationship-pedigree.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FHIRList fhirlist = FHIRListHelper.fromJson(json);
         assertEquals("Expect ", "example-double-cousin-relationship", fhirlist.getId());
      }
      @Test
      public void testLoadCodeSystem316FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-explanationofbenefit-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "explanationofbenefit-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition448FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-preferred.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-preferred", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition449FromJson() throws Exception {
         String inputFile = "./examples-json/extension-auditevent-accession.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "auditevent-Accession", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet431FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-account-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "account-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition450FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-question.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-question", structuredefinition.getId());
      }
      @Test
      public void testLoadDeviceRequest2FromJson() throws Exception {
         String inputFile = "./examples-json/devicerequest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DeviceRequest devicerequest = DeviceRequestHelper.fromJson(json);
         assertEquals("Expect ", "example", devicerequest.getId());
      }
      @Test
      public void testLoadSearchParameter26FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-extensions-CodeSystem-workflow.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-extensions-CodeSystem-workflow", searchparameter.getId());
      }
      @Test
      public void testLoadStructureDefinition451FromJson() throws Exception {
         String inputFile = "./examples-json/provenance.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Provenance", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet432FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-vaccination-protocol-dose-target.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "vaccination-protocol-dose-target", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition452FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-streetaddressline.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-streetAddressLine", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition453FromJson() throws Exception {
         String inputFile = "./examples-json/extension-event-reasonreference.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "event-reasonReference", structuredefinition.getId());
      }
      @Test
      public void testLoadCompartmentDefinition6FromJson() throws Exception {
         String inputFile = "./examples-json/compartmentdefinition-relatedperson.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CompartmentDefinition compartmentdefinition = CompartmentDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "relatedPerson", compartmentdefinition.getId());
      }
      @Test
      public void testLoadProcedureRequest14FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example4.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "benchpress", procedurerequest.getId());
      }
      @Test
      public void testLoadOperationDefinition29FromJson() throws Exception {
         String inputFile = "./examples-json/operation-patient-match.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Patient-match", operationdefinition.getId());
      }
      @Test
      public void testLoadConsent10FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-Emergency.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-Emergency", consent.getId());
      }
      @Test
      public void testLoadNamingSystem3FromJson() throws Exception {
         String inputFile = "./examples-json/namingsystem-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NamingSystem namingsystem = NamingSystemHelper.fromJson(json);
         assertEquals("Expect ", "example", namingsystem.getId());
      }
      @Test
      public void testLoadQuestionnaire124FromJson() throws Exception {
         String inputFile = "./examples-json/communicationrequest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet433FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-action-grouping-behavior.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "action-grouping-behavior", valueset.getId());
      }
      @Test
      public void testLoadValueSet434FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-map-model-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "map-model-mode", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire125FromJson() throws Exception {
         String inputFile = "./examples-json/elementdefinition-de-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition454FromJson() throws Exception {
         String inputFile = "./examples-json/subscription.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Subscription", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet435FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-digital-media-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "digital-media-type", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire126FromJson() throws Exception {
         String inputFile = "./examples-json/bodysite-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition455FromJson() throws Exception {
         String inputFile = "./examples-json/extension-procedurerequest-questionnairerequest.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "procedurerequest-questionnaireRequest", structuredefinition.getId());
      }
      @Test
      public void testLoadTask3FromJson() throws Exception {
         String inputFile = "./examples-json/task-example1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Task task = TaskHelper.fromJson(json);
         assertEquals("Expect ", "example1", task.getId());
      }
      @Test
      public void testLoadServiceDefinition1FromJson() throws Exception {
         String inputFile = "./examples-json/servicedefinition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ServiceDefinition servicedefinition = ServiceDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "example", servicedefinition.getId());
      }
      @Test
      public void testLoadMedicationAdministration11FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0308.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0308", medicationadministration.getId());
      }
      @Test
      public void testLoadOperationDefinition30FromJson() throws Exception {
         String inputFile = "./examples-json/operation-measure-data-requirements.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Measure-data-requirements", operationdefinition.getId());
      }
      @Test
      public void testLoadValueSet436FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-fm-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "fm-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet437FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-supplyrequest-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "supplyrequest-reason", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition456FromJson() throws Exception {
         String inputFile = "./examples-json/extension-family-member-history-genetics-observation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "family-member-history-genetics-observation", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem317FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-observation-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "observation-category", codesystem.getId());
      }
      @Test
      public void testLoadValueSet438FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-code", valueset.getId());
      }
      @Test
      public void testLoadValueSet439FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-procedure-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "procedure-reason", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition457FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-fmm-no-warnings.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-fmm-no-warnings", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem318FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-ex-payee-resource-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "ex-payee-resource-type", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem319FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-observation-relationshiptypes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "observation-relationshiptypes", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition458FromJson() throws Exception {
         String inputFile = "./examples-json/extension-diagnosticreport-replaces.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "diagnosticReport-replaces", structuredefinition.getId());
      }
      @Test
      public void testLoadMedication16FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0305.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0305", medication.getId());
      }
      @Test
      public void testLoadCodeSystem320FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-service-place.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "service-place", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition459FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-json-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-json-type", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition460FromJson() throws Exception {
         String inputFile = "./examples-json/extension-specimen-specialhandling.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "specimen-specialHandling", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition461FromJson() throws Exception {
         String inputFile = "./examples-json/annotation.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Annotation", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition462FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-streetname.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-streetName", structuredefinition.getId());
      }
      @Test
      public void testLoadBundle30FromJson() throws Exception {
         String inputFile = "./examples-json/bundle-response-medsallergies.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "bundle-response-medsallergies", bundle.getId());
      }
      @Test
      public void testLoadStructureDefinition463FromJson() throws Exception {
         String inputFile = "./examples-json/extension-humanname-partner-name.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "humanname-partner-name", structuredefinition.getId());
      }
      @Test
      public void testLoadPractitioner12FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f005-al.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f005", practitioner.getId());
      }
      @Test
      public void testLoadConceptMap14FromJson() throws Exception {
         String inputFile = "./examples-json/cm-address-use-v2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-address-use-v2", conceptmap.getId());
      }
      @Test
      public void testLoadStructureDefinition464FromJson() throws Exception {
         String inputFile = "./examples-json/extension-task-candidatelist.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "task-candidateList", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet440FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-questionnaire-questions.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-questions", valueset.getId());
      }
      @Test
      public void testLoadValueSet441FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-substance-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "substance-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet442FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-care-plan-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "care-plan-category", valueset.getId());
      }
      @Test
      public void testLoadDiagnosticReport12FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-f201-brainct.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "f201", diagnosticreport.getId());
      }
      @Test
      public void testLoadStructureDefinition465FromJson() throws Exception {
         String inputFile = "./examples-json/dosage.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Dosage", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet443FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-tooth.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "tooth", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem321FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-message-transport.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "message-transport", codesystem.getId());
      }
      @Test
      public void testLoadValueSet444FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-entformula-additive.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "entformula-additive", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition466FromJson() throws Exception {
         String inputFile = "./examples-json/extension-condition-ruledout.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "condition-ruledOut", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire127FromJson() throws Exception {
         String inputFile = "./examples-json/messagedefinition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition467FromJson() throws Exception {
         String inputFile = "./examples-json/extension-hla-genotyping-results-allele-database.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "hla-genotyping-results-allele-database", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition468FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ActivityDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire128FromJson() throws Exception {
         String inputFile = "./examples-json/documentmanifest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet445FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-package-form.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-package-form", valueset.getId());
      }
      @Test
      public void testLoadValueSet446FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-immunization-route.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "immunization-route", valueset.getId());
      }
      @Test
      public void testLoadValueSet447FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-units-of-time.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "units-of-time", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem322FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-question-max-occurs.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "question-max-occurs", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition469FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-uncertaintytype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-uncertaintyType", structuredefinition.getId());
      }
      @Test
      public void testLoadConceptMap15FromJson() throws Exception {
         String inputFile = "./examples-json/cm-observation-relationshiptypes-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-observation-relationshiptypes-v3", conceptmap.getId());
      }
      @Test
      public void testLoadQuestionnaire129FromJson() throws Exception {
         String inputFile = "./examples-json/auditevent-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem323FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-http-verb.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "http-verb", codesystem.getId());
      }
      @Test
      public void testLoadMeasure6FromJson() throws Exception {
         String inputFile = "./examples-json/measure-predecessor-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Measure measure = MeasureHelper.fromJson(json);
         assertEquals("Expect ", "measure-predecessor-example", measure.getId());
      }
      @Test
      public void testLoadValueSet448FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-referencerange-appliesto.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "referencerange-appliesto", valueset.getId());
      }
      @Test
      public void testLoadBundle31FromJson() throws Exception {
         String inputFile = "./examples-json/bundle-request-simplesummary.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "bundle-request-simplesummary", bundle.getId());
      }
      @Test
      public void testLoadDeviceUseStatement1FromJson() throws Exception {
         String inputFile = "./examples-json/deviceusestatement-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DeviceUseStatement deviceusestatement = DeviceUseStatementHelper.fromJson(json);
         assertEquals("Expect ", "example", deviceusestatement.getId());
      }
      @Test
      public void testLoadSupplyDelivery1FromJson() throws Exception {
         String inputFile = "./examples-json/supplydelivery-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SupplyDelivery supplydelivery = SupplyDeliveryHelper.fromJson(json);
         assertEquals("Expect ", "simpledelivery", supplydelivery.getId());
      }
      @Test
      public void testLoadValueSet449FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-quality-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "quality-type", valueset.getId());
      }
      @Test
      public void testLoadCarePlan10FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-f003-pharynx.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "f003", careplan.getId());
      }
      @Test
      public void testLoadMessageDefinition3FromJson() throws Exception {
         String inputFile = "./examples-json/messagedefinition-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MessageDefinition messagedefinition = MessageDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "example", messagedefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition470FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-streetnametype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-streetNameType", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet450FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-specimen-container-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "specimen-container-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition471FromJson() throws Exception {
         String inputFile = "./examples-json/extension-maxvalue.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "maxValue", structuredefinition.getId());
      }
      @Test
      public void testLoadProcessRequest8FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-example-poll-specific.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessRequest processrequest = ProcessRequestHelper.fromJson(json);
         assertEquals("Expect ", "1111", processrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition472FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-expansionsource.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-expansionSource", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition473FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-maxvalueset.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-maxValueSet", structuredefinition.getId());
      }
      @Test
      public void testLoadSpecimen4FromJson() throws Exception {
         String inputFile = "./examples-json/specimen-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Specimen specimen = SpecimenHelper.fromJson(json);
         assertEquals("Expect ", "101", specimen.getId());
      }
      @Test
      public void testLoadHealthcareService1FromJson() throws Exception {
         String inputFile = "./examples-json/healthcareservice-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         HealthcareService healthcareservice = HealthcareServiceHelper.fromJson(json);
         assertEquals("Expect ", "example", healthcareservice.getId());
      }
      @Test
      public void testLoadStructureDefinition474FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-conceptorder.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-conceptOrder", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet451FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-route-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "route-codes", valueset.getId());
      }
      @Test
      public void testLoadValueSet452FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-claim-subtype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "claim-subtype", valueset.getId());
      }
      @Test
      public void testLoadAuditEvent7FromJson() throws Exception {
         String inputFile = "./examples-json/audit-event-example-search.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AuditEvent auditevent = AuditEventHelper.fromJson(json);
         assertEquals("Expect ", "example-search", auditevent.getId());
      }
      @Test
      public void testLoadStructureDefinition475FromJson() throws Exception {
         String inputFile = "./examples-json/extension-condition-definition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "condition-definition", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition476FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-workflowstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-workflowStatus", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition477FromJson() throws Exception {
         String inputFile = "./examples-json/extension-condition-basedon.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "condition-basedOn", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem324FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-guidance-response-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "guidance-response-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem325FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-map-group-type-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "map-group-type-mode", codesystem.getId());
      }
      @Test
      public void testLoadValueSet453FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-report-action-result-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "report-action-result-codes", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition478FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticscopynumberevent.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsCopyNumberEvent", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet454FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-questionnaire-answers-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-answers-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition479FromJson() throws Exception {
         String inputFile = "./examples-json/extension-pharmacy-core-infuseover.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "pharmacy-core-infuseOver", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition480FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-ad-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-AD-use", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem326FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-map-transform.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "map-transform", codesystem.getId());
      }
      @Test
      public void testLoadValueSet455FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-allergyintolerance-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "allergyintolerance-code", valueset.getId());
      }
      @Test
      public void testLoadValueSet456FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-location-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "location-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition481FromJson() throws Exception {
         String inputFile = "./examples-json/consentdirective.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "consentdirective", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet457FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-c80-facilitycodes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "c80-facilitycodes", valueset.getId());
      }
      @Test
      public void testLoadValueSet458FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-severity", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition482FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaireresponse-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaireresponse-reason", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition483FromJson() throws Exception {
         String inputFile = "./examples-json/auditevent.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "AuditEvent", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition31FromJson() throws Exception {
         String inputFile = "./examples-json/operation-conceptmap-translate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ConceptMap-translate", operationdefinition.getId());
      }
      @Test
      public void testLoadPatient14FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-dicom.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "dicom", patient.getId());
      }
      @Test
      public void testLoadStructureDefinition484FromJson() throws Exception {
         String inputFile = "./examples-json/extension-condition-targetbodysite.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "condition-targetBodySite", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet459FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-measure-report-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "measure-report-type", valueset.getId());
      }
      @Test
      public void testLoadValueSet460FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-list-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "list-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem327FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-service-product.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "service-product", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem328FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-measure-report-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "measure-report-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition485FromJson() throws Exception {
         String inputFile = "./examples-json/communication.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Communication", structuredefinition.getId());
      }
      @Test
      public void testLoadProcessRequest9FromJson() throws Exception {
         String inputFile = "./examples-json/processrequest-example-poll-inclusive.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcessRequest processrequest = ProcessRequestHelper.fromJson(json);
         assertEquals("Expect ", "1112", processrequest.getId());
      }
      @Test
      public void testLoadStructureDefinition486FromJson() throws Exception {
         String inputFile = "./examples-json/extension-allergyintolerance-certainty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "allergyintolerance-certainty", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationRequest31FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequestexample1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0311", medicationrequest.getId());
      }
      @Test
      public void testLoadContract5FromJson() throws Exception {
         String inputFile = "./examples-json/pcd-example-notLabs.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Contract contract = ContractHelper.fromJson(json);
         assertEquals("Expect ", "pcd-example-notLabs", contract.getId());
      }
      @Test
      public void testLoadStructureDefinition487FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-minvalueset.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-minValueSet", structuredefinition.getId());
      }
      @Test
      public void testLoadTestScript6FromJson() throws Exception {
         String inputFile = "./examples-json/testscript-example-multisystem.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         TestScript testscript = TestScriptHelper.fromJson(json);
         assertEquals("Expect ", "testscript-example-multisystem", testscript.getId());
      }
      @Test
      public void testLoadCodeSystem329FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-package-form.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-package-form", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem330FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-days-of-week.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "days-of-week", codesystem.getId());
      }
      @Test
      public void testLoadValueSet461FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-admin-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-admin-category", valueset.getId());
      }
      @Test
      public void testLoadObservation43FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f001-glucose.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f001", observation.getId());
      }
      @Test
      public void testLoadObservation44FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-f003-co2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "f003", observation.getId());
      }
      @Test
      public void testLoadCodeSystem331FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-hl7-work-group.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "hl7-work-group", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition488FromJson() throws Exception {
         String inputFile = "./examples-json/elementdefinition-de.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-de", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet462FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-address-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "address-use", valueset.getId());
      }
      @Test
      public void testLoadValueSet463FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-event-timing.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "event-timing", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem332FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-reaction-event-severity.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "reaction-event-severity", codesystem.getId());
      }
      @Test
      public void testLoadValueSet464FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-texture-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "texture-code", valueset.getId());
      }
      @Test
      public void testLoadOperationDefinition32FromJson() throws Exception {
         String inputFile = "./examples-json/operation-observation-stats.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Observation-stats", operationdefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition489FromJson() throws Exception {
         String inputFile = "./examples-json/extension-hla-genotyping-results-glstring.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "hla-genotyping-results-glstring", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet465FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-item-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "item-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition490FromJson() throws Exception {
         String inputFile = "./examples-json/adverseevent.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "AdverseEvent", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem333FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-fm-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "fm-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet466FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-consent-action.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "consent-action", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem334FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-document-reference-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "document-reference-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem335FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-event-timing.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "event-timing", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem336FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-metric-operational-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "metric-operational-status", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition491FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-allowedunits.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-allowedUnits", structuredefinition.getId());
      }
      @Test
      public void testLoadTestScript7FromJson() throws Exception {
         String inputFile = "./examples-json/testscript-example-history.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         TestScript testscript = TestScriptHelper.fromJson(json);
         assertEquals("Expect ", "testscript-example-history", testscript.getId());
      }
      @Test
      public void testLoadCodeSystem337FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-provider-qualification.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "provider-qualification", codesystem.getId());
      }
      @Test
      public void testLoadObservation45FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "example", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition492FromJson() throws Exception {
         String inputFile = "./examples-json/deviceusestatement.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DeviceUseStatement", structuredefinition.getId());
      }
      @Test
      public void testLoadImmunization2FromJson() throws Exception {
         String inputFile = "./examples-json/immunization-example-refused.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Immunization immunization = ImmunizationHelper.fromJson(json);
         assertEquals("Expect ", "notGiven", immunization.getId());
      }
      @Test
      public void testLoadMedication17FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0319.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0319", medication.getId());
      }
      @Test
      public void testLoadCodeSystem338FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-provenance-entity-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "provenance-entity-role", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem339FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-reason-medication-given-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "reason-medication-given-codes", codesystem.getId());
      }
      @Test
      public void testLoadObservation46FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-vitals-panel.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "vitals-panel", observation.getId());
      }
      @Test
      public void testLoadStructureDefinition493FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-ordinalvalue.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-ordinalValue", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire130FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition494FromJson() throws Exception {
         String inputFile = "./examples-json/extension-mimetype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "mimeType", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem340FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-admin-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-admin-category", codesystem.getId());
      }
      @Test
      public void testLoadSlot4FromJson() throws Exception {
         String inputFile = "./examples-json/slot-example-tentative.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Slot slot = SlotHelper.fromJson(json);
         assertEquals("Expect ", "2", slot.getId());
      }
      @Test
      public void testLoadCodeSystem341FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-testscript-profile-destination-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "testscript-profile-destination-types", codesystem.getId());
      }
      @Test
      public void testLoadMedicationDispense30FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0304.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0304", medicationdispense.getId());
      }
      @Test
      public void testLoadClaim11FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-institutional-rich.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "960151", claim.getId());
      }
      @Test
      public void testLoadValueSet467FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-designation-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "designation-use", valueset.getId());
      }
      @Test
      public void testLoadProcedureRequest15FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-implant.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "example-implant", procedurerequest.getId());
      }
      @Test
      public void testLoadActivityDefinition9FromJson() throws Exception {
         String inputFile = "./examples-json/activitydefinition-order-serum-dengue-virus-igm.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ActivityDefinition activitydefinition = ActivityDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "serum-dengue-virus-igm", activitydefinition.getId());
      }
      @Test
      public void testLoadAppointment3FromJson() throws Exception {
         String inputFile = "./examples-json/appointment-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Appointment appointment = AppointmentHelper.fromJson(json);
         assertEquals("Expect ", "example", appointment.getId());
      }
      @Test
      public void testLoadStructureDefinition495FromJson() throws Exception {
         String inputFile = "./examples-json/extension-operationoutcome-detectedissue.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "operationoutcome-detectedIssue", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem342FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-narrative-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "narrative-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet468FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-remittance-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "remittance-outcome", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem343FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-vision-base-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "vision-base-codes", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition496FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CapabilityStatement", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition497FromJson() throws Exception {
         String inputFile = "./examples-json/datarequirement.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DataRequirement", structuredefinition.getId());
      }
      @Test
      public void testLoadConsent11FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-basic", consent.getId());
      }
      @Test
      public void testLoadCodeSystem344FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-statement-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-statement-status", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem345FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-service-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "service-category", codesystem.getId());
      }
      @Test
      public void testLoadCondition12FromJson() throws Exception {
         String inputFile = "./examples-json/condition-example2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Condition condition = ConditionHelper.fromJson(json);
         assertEquals("Expect ", "example2", condition.getId());
      }
      @Test
      public void testLoadNutritionOrder13FromJson() throws Exception {
         String inputFile = "./examples-json/nutritionorder-example-diabeticdiet.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         NutritionOrder nutritionorder = NutritionOrderHelper.fromJson(json);
         assertEquals("Expect ", "diabeticdiet", nutritionorder.getId());
      }
      @Test
      public void testLoadCodeSystem346FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-subscription-tag.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "subscription-tag", codesystem.getId());
      }
      @Test
      public void testLoadConceptMap16FromJson() throws Exception {
         String inputFile = "./examples-json/cm-administrative-gender-v2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-administrative-gender-v2", conceptmap.getId());
      }
      @Test
      public void testLoadQuestionnaire131FromJson() throws Exception {
         String inputFile = "./examples-json/binary-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition498FromJson() throws Exception {
         String inputFile = "./examples-json/extension-encounter-primarydiagnosis.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "encounter-primaryDiagnosis", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet469FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-immunization-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "immunization-role", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition499FromJson() throws Exception {
         String inputFile = "./examples-json/condition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Condition", structuredefinition.getId());
      }
      @Test
      public void testLoadDocumentManifest2FromJson() throws Exception {
         String inputFile = "./examples-json/documentmanifest-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DocumentManifest documentmanifest = DocumentManifestHelper.fromJson(json);
         assertEquals("Expect ", "example", documentmanifest.getId());
      }
      @Test
      public void testLoadStructureDefinition500FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-cadavericdonor.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-cadavericDonor", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition501FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DiagnosticReport", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem347FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-ex-program-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "ex-program-code", codesystem.getId());
      }
      @Test
      public void testLoadValueSet470FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-request-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-request-status", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition502FromJson() throws Exception {
         String inputFile = "./examples-json/extension-pharmacy-core-maxdeliveryrate.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "pharmacy-core-maxDeliveryRate", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem348FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-supplyrequest-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "supplyrequest-kind", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem349FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-animal-species.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "animal-species", codesystem.getId());
      }
      @Test
      public void testLoadMedication18FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0301.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0301", medication.getId());
      }
      @Test
      public void testLoadStructureDefinition503FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CodeSystem", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet471FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-process-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "process-priority", valueset.getId());
      }
      @Test
      public void testLoadFamilyMemberHistory2FromJson() throws Exception {
         String inputFile = "./examples-json/familymemberhistory-example-mother.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FamilyMemberHistory familymemberhistory = FamilyMemberHistoryHelper.fromJson(json);
         assertEquals("Expect ", "mother", familymemberhistory.getId());
      }
      @Test
      public void testLoadCodeSystem350FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-report-status-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "report-status-codes", codesystem.getId());
      }
      @Test
      public void testLoadProcedureRequest16FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-di.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "di", procedurerequest.getId());
      }
      @Test
      public void testLoadQuestionnaire132FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaireresponse-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadContract6FromJson() throws Exception {
         String inputFile = "./examples-json/contract-example-42cfr-part2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Contract contract = ContractHelper.fromJson(json);
         assertEquals("Expect ", "C-2121", contract.getId());
      }
      @Test
      public void testLoadValueSet472FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-abstract-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "abstract-types", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire133FromJson() throws Exception {
         String inputFile = "./examples-json/cholesterol-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadProcedureRequest17FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example-edu.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "education", procedurerequest.getId());
      }
      @Test
      public void testLoadMedication19FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0307.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0307", medication.getId());
      }
      @Test
      public void testLoadValueSet473FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-resource-aggregation-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "resource-aggregation-mode", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire134FromJson() throws Exception {
         String inputFile = "./examples-json/explanationofbenefit-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem351FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-marital-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "marital-status", codesystem.getId());
      }
      @Test
      public void testLoadValueSet474FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-concept-map-equivalence.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "concept-map-equivalence", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem352FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-ex-diagnosisrelatedgroup.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "ex-diagnosisrelatedgroup", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem353FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-service-provision-conditions.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "service-provision-conditions", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem354FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-reaction-event-certainty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "reaction-event-certainty", codesystem.getId());
      }
      @Test
      public void testLoadConceptMap17FromJson() throws Exception {
         String inputFile = "./examples-json/cm-name-use-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-name-use-v3", conceptmap.getId());
      }
      @Test
      public void testLoadStructureDefinition504FromJson() throws Exception {
         String inputFile = "./examples-json/composition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Composition", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem355FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-bundle-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "bundle-type", codesystem.getId());
      }
      @Test
      public void testLoadTask4FromJson() throws Exception {
         String inputFile = "./examples-json/task-example5.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Task task = TaskHelper.fromJson(json);
         assertEquals("Expect ", "example5", task.getId());
      }
      @Test
      public void testLoadAllergyIntolerance3FromJson() throws Exception {
         String inputFile = "./examples-json/allergyintolerance-fishallergy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AllergyIntolerance allergyintolerance = AllergyIntoleranceHelper.fromJson(json);
         assertEquals("Expect ", "fishallergy", allergyintolerance.getId());
      }
      @Test
      public void testLoadQuestionnaire135FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet475FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-investigation-sets.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "investigation-sets", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition505FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaireresponse-reviewer.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaireresponse-reviewer", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem356FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-consent-except-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "consent-except-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition506FromJson() throws Exception {
         String inputFile = "./examples-json/lipidprofile.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "lipidprofile", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition507FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-uncertainty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-uncertainty", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet476FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-identifier-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "identifier-use", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem357FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-measure-report-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "measure-report-type", codesystem.getId());
      }
      @Test
      public void testLoadQuestionnaireResponse5FromJson() throws Exception {
         String inputFile = "./examples-json/questionnaireresponse-example-bluebook.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         QuestionnaireResponse questionnaireresponse = QuestionnaireResponseHelper.fromJson(json);
         assertEquals("Expect ", "bb", questionnaireresponse.getId());
      }
      @Test
      public void testLoadValueSet477FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-document-reference-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "document-reference-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet478FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-report-participant-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "report-participant-type", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition508FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-deliverymode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-deliveryMode", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem358FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-supplyrequest-reason.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "supplyrequest-reason", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem359FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-measure-population.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "measure-population", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem360FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-participationstatus.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "participationstatus", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem361FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-allergy-intolerance-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "allergy-intolerance-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition509FromJson() throws Exception {
         String inputFile = "./examples-json/quantity.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Quantity", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition510FromJson() throws Exception {
         String inputFile = "./examples-json/ratio.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Ratio", structuredefinition.getId());
      }
      @Test
      public void testLoadSchedule2FromJson() throws Exception {
         String inputFile = "./examples-json/schedule-provider-location1-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Schedule schedule = ScheduleHelper.fromJson(json);
         assertEquals("Expect ", "exampleloc1", schedule.getId());
      }
      @Test
      public void testLoadValueSet479FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-medication-request-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "medication-request-category", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem362FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-abstract-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "abstract-types", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition511FromJson() throws Exception {
         String inputFile = "./examples-json/extension-consent-location.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "consent-location", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet480FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-activity-definition-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "activity-definition-category", valueset.getId());
      }
      @Test
      public void testLoadValueSet481FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-search-entry-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "search-entry-mode", valueset.getId());
      }
      @Test
      public void testLoadValueSet482FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-repository-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "repository-type", valueset.getId());
      }
      @Test
      public void testLoadProcedure13FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-f004-tracheotomy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "f004", procedure.getId());
      }
      @Test
      public void testLoadValueSet483FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-parameter-group.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "parameter-group", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem363FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-testscript-profile-origin-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "testscript-profile-origin-types", codesystem.getId());
      }
      @Test
      public void testLoadValueSet484FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-immunization-site.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "immunization-site", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition512FromJson() throws Exception {
         String inputFile = "./examples-json/extension-implementationguide-page.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "implementationguide-page", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition513FromJson() throws Exception {
         String inputFile = "./examples-json/messageheader.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "MessageHeader", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet485FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-operation-parameter-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "operation-parameter-use", valueset.getId());
      }
      @Test
      public void testLoadValueSet486FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-provider-taxonomy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "provider-taxonomy", valueset.getId());
      }
      @Test
      public void testLoadSubstance6FromJson() throws Exception {
         String inputFile = "./examples-json/substance-example-f203-potassium.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Substance substance = SubstanceHelper.fromJson(json);
         assertEquals("Expect ", "f203", substance.getId());
      }
      @Test
      public void testLoadConceptMap18FromJson() throws Exception {
         String inputFile = "./examples-json/cm-medication-admin-status-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-medication-admin-status-v3", conceptmap.getId());
      }
      @Test
      public void testLoadStructureDefinition514FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-basetype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-baseType", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem364FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-contact-point-system.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "contact-point-system", codesystem.getId());
      }
      @Test
      public void testLoadValueSet487FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contract-action.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contract-action", valueset.getId());
      }
      @Test
      public void testLoadOperationDefinition33FromJson() throws Exception {
         String inputFile = "./examples-json/operation-resource-meta-delete.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Resource-meta-delete", operationdefinition.getId());
      }
      @Test
      public void testLoadValueSet488FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-map-source-list-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "map-source-list-mode", valueset.getId());
      }
      @Test
      public void testLoadClaim12FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-vision-glasses-3tier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "660152", claim.getId());
      }
      @Test
      public void testLoadMedicationRequest32FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0327.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0327", medicationrequest.getId());
      }
      @Test
      public void testLoadEnrollmentResponse1FromJson() throws Exception {
         String inputFile = "./examples-json/enrollmentresponse-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         EnrollmentResponse enrollmentresponse = EnrollmentResponseHelper.fromJson(json);
         assertEquals("Expect ", "ER2500", enrollmentresponse.getId());
      }
      @Test
      public void testLoadSearchParameter27FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-extensions-ValueSet-effective.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "valueset-extensions-ValueSet-effective", searchparameter.getId());
      }
      @Test
      public void testLoadMedicationRequest33FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0313.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0313", medicationrequest.getId());
      }
      @Test
      public void testLoadLibrary10FromJson() throws Exception {
         String inputFile = "./examples-json/library-fhir-model-definition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "library-fhir-model-definition", library.getId());
      }
      @Test
      public void testLoadStructureDefinition515FromJson() throws Exception {
         String inputFile = "./examples-json/extension-valueset-keyword.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "valueset-keyWord", structuredefinition.getId());
      }
      @Test
      public void testLoadProcedure14FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example-f001-heart.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "f001", procedure.getId());
      }
      @Test
      public void testLoadCodeSystem365FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-vision-eye-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "vision-eye-codes", codesystem.getId());
      }
      @Test
      public void testLoadClaim13FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "100150", claim.getId());
      }
      @Test
      public void testLoadStructureDefinition516FromJson() throws Exception {
         String inputFile = "./examples-json/extension-elementdefinition-inheritedextensiblevalueset.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "elementdefinition-inheritedExtensibleValueSet", structuredefinition.getId());
      }
      @Test
      public void testLoadSearchParameter28FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-extensions-CodeSystem-effective.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-extensions-CodeSystem-effective", searchparameter.getId());
      }
      @Test
      public void testLoadValueSet489FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-payeetype.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "payeetype", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire136FromJson() throws Exception {
         String inputFile = "./examples-json/paymentreconciliation-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadValueSet490FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-measure-data-usage.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "measure-data-usage", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition517FromJson() throws Exception {
         String inputFile = "./examples-json/extension-allergyintolerance-substanceexposurerisk.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "allergyintolerance-substanceExposureRisk", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire137FromJson() throws Exception {
         String inputFile = "./examples-json/chargeitem-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition518FromJson() throws Exception {
         String inputFile = "./examples-json/contactdetail.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ContactDetail", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire138FromJson() throws Exception {
         String inputFile = "./examples-json/appointmentresponse-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem366FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-request-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "request-priority", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition519FromJson() throws Exception {
         String inputFile = "./examples-json/processresponse.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ProcessResponse", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition520FromJson() throws Exception {
         String inputFile = "./examples-json/extension-openehr-exposuredescription.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "openEHR-exposureDescription", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition521FromJson() throws Exception {
         String inputFile = "./examples-json/specimen.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Specimen", structuredefinition.getId());
      }
      @Test
      public void testLoadConceptMap19FromJson() throws Exception {
         String inputFile = "./examples-json/cm-name-use-v2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-name-use-v2", conceptmap.getId());
      }
      @Test
      public void testLoadValueSet491FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-benefit-subcategory.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "benefit-subcategory", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition522FromJson() throws Exception {
         String inputFile = "./examples-json/compartmentdefinition.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "CompartmentDefinition", structuredefinition.getId());
      }
      @Test
      public void testLoadCapabilityStatement7FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement-base2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CapabilityStatement capabilitystatement = CapabilityStatementHelper.fromJson(json);
         assertEquals("Expect ", "base2", capabilitystatement.getId());
      }
      @Test
      public void testLoadCodeSystem367FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-measurement-principle.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "measurement-principle", codesystem.getId());
      }
      @Test
      public void testLoadValueSet492FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-vaccination-protocol-dose-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "vaccination-protocol-dose-status", valueset.getId());
      }
      @Test
      public void testLoadPractitioner13FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "example", practitioner.getId());
      }
      @Test
      public void testLoadCodeSystem368FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-event-capability-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "event-capability-mode", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem369FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-endpoint-payload-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "endpoint-payload-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition523FromJson() throws Exception {
         String inputFile = "./examples-json/extension-timing-daysofcycle.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "timing-daysOfCycle", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire139FromJson() throws Exception {
         String inputFile = "./examples-json/bmi-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition524FromJson() throws Exception {
         String inputFile = "./examples-json/extension-diagnosticreport-geneticsassessedcondition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DiagnosticReport-geneticsAssessedCondition", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition525FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-de-classification-or-context.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-de-classification-or-context", structuredefinition.getId());
      }
      @Test
      public void testLoadQuestionnaire140FromJson() throws Exception {
         String inputFile = "./examples-json/device-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadMedicationRequest34FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequestexample2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx002", medicationrequest.getId());
      }
      @Test
      public void testLoadValueSet493FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-provenance-activity-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "provenance-activity-type", valueset.getId());
      }
      @Test
      public void testLoadClaim14FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-oral-contained-identifier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "100155", claim.getId());
      }
      @Test
      public void testLoadQuestionnaire141FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem370FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-questionnaire-item-control.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-item-control", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition526FromJson() throws Exception {
         String inputFile = "./examples-json/extension-medication-usualroute.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "medication-usualRoute", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet494FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-flag-code.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "flag-code", valueset.getId());
      }
      @Test
      public void testLoadValueSet495FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-fm-conditions.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "fm-conditions", valueset.getId());
      }
      @Test
      public void testLoadFHIRList8FromJson() throws Exception {
         String inputFile = "./examples-json/list-example-simple-empty.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FHIRList fhirlist = FHIRListHelper.fromJson(json);
         assertEquals("Expect ", "example-simple-empty", fhirlist.getId());
      }
      @Test
      public void testLoadProcedure15FromJson() throws Exception {
         String inputFile = "./examples-json/procedure-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Procedure procedure = ProcedureHelper.fromJson(json);
         assertEquals("Expect ", "example", procedure.getId());
      }
      @Test
      public void testLoadMedicationRequest35FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0302.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0302", medicationrequest.getId());
      }
      @Test
      public void testLoadQuestionnaire142FromJson() throws Exception {
         String inputFile = "./examples-json/bp-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem371FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-medication-dispense-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "medication-dispense-category", codesystem.getId());
      }
      @Test
      public void testLoadMedicationAdministration12FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministrationexample3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadminexample03", medicationadministration.getId());
      }
      @Test
      public void testLoadConceptMap20FromJson() throws Exception {
         String inputFile = "./examples-json/cm-contact-point-system-v2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-contact-point-system-v2", conceptmap.getId());
      }
      @Test
      public void testLoadValueSet496FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-questionnaire-answers.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-answers", valueset.getId());
      }
      @Test
      public void testLoadValueSet497FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-supplyrequest-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "supplyrequest-status", valueset.getId());
      }
      @Test
      public void testLoadClaim15FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-professional.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "860150", claim.getId());
      }
      @Test
      public void testLoadValueSet498FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-contract-term-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "contract-term-type", valueset.getId());
      }
      @Test
      public void testLoadPlanDefinition11FromJson() throws Exception {
         String inputFile = "./examples-json/plandefinition-exclusive-breastfeeding-intervention-03.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         PlanDefinition plandefinition = PlanDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "exclusive-breastfeeding-intervention-03", plandefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition527FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-history.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-history", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem372FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-map-input-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "map-input-mode", codesystem.getId());
      }
      @Test
      public void testLoadValueSet499FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-diagnostic-report-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "diagnostic-report-status", valueset.getId());
      }
      @Test
      public void testLoadImmunization3FromJson() throws Exception {
         String inputFile = "./examples-json/immunization-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Immunization immunization = ImmunizationHelper.fromJson(json);
         assertEquals("Expect ", "example", immunization.getId());
      }
      @Test
      public void testLoadValueSet500FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-metric-color.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "metric-color", valueset.getId());
      }
      @Test
      public void testLoadValueSet501FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-animal-breeds.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "animal-breeds", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem373FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-process-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "process-priority", codesystem.getId());
      }
      @Test
      public void testLoadSchedule3FromJson() throws Exception {
         String inputFile = "./examples-json/schedule-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Schedule schedule = ScheduleHelper.fromJson(json);
         assertEquals("Expect ", "example", schedule.getId());
      }
      @Test
      public void testLoadConceptMap21FromJson() throws Exception {
         String inputFile = "./examples-json/cm-administrative-gender-v3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "cm-administrative-gender-v3", conceptmap.getId());
      }
      @Test
      public void testLoadStructureDefinition528FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-delta.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-delta", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition34FromJson() throws Exception {
         String inputFile = "./examples-json/operation-encounter-everything.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Encounter-everything", operationdefinition.getId());
      }
      @Test
      public void testLoadCodeSystem374FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-special-values.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "special-values", codesystem.getId());
      }
      @Test
      public void testLoadTask5FromJson() throws Exception {
         String inputFile = "./examples-json/task-example3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Task task = TaskHelper.fromJson(json);
         assertEquals("Expect ", "example3", task.getId());
      }
      @Test
      public void testLoadQuestionnaire143FromJson() throws Exception {
         String inputFile = "./examples-json/triglyceride-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition529FromJson() throws Exception {
         String inputFile = "./examples-json/domainresource.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DomainResource", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet502FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-benefit-network.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "benefit-network", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition530FromJson() throws Exception {
         String inputFile = "./examples-json/dataelement.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DataElement", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem375FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-snomedct.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "snomedct", codesystem.getId());
      }
      @Test
      public void testLoadServiceDefinition2FromJson() throws Exception {
         String inputFile = "./examples-json/servicedefinition-infobutton.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ServiceDefinition servicedefinition = ServiceDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "infobutton", servicedefinition.getId());
      }
      @Test
      public void testLoadMedication20FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0312.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0312", medication.getId());
      }
      @Test
      public void testLoadStructureDefinition531FromJson() throws Exception {
         String inputFile = "./examples-json/extension-observation-geneticsallelicfrequency.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "observation-geneticsAllelicFrequency", structuredefinition.getId());
      }
      @Test
      public void testLoadDetectedIssue3FromJson() throws Exception {
         String inputFile = "./examples-json/detectedissue-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DetectedIssue detectedissue = DetectedIssueHelper.fromJson(json);
         assertEquals("Expect ", "ddi", detectedissue.getId());
      }
      @Test
      public void testLoadCodeSystem376FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-process-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "process-outcome", codesystem.getId());
      }
      @Test
      public void testLoadSupplyDelivery2FromJson() throws Exception {
         String inputFile = "./examples-json/supplydelivery-example-pumpdelivery.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SupplyDelivery supplydelivery = SupplyDeliveryHelper.fromJson(json);
         assertEquals("Expect ", "pumpdelivery", supplydelivery.getId());
      }
      @Test
      public void testLoadStructureDefinition532FromJson() throws Exception {
         String inputFile = "./examples-json/media.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Media", structuredefinition.getId());
      }
      @Test
      public void testLoadObservation47FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-mbp.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "mbp", observation.getId());
      }
      @Test
      public void testLoadCodeSystem377FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-assert-operator-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "assert-operator-codes", codesystem.getId());
      }
      @Test
      public void testLoadDiagnosticReport13FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-micro1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "micro", diagnosticreport.getId());
      }
      @Test
      public void testLoadValueSet503FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-encounter-special-courtesy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "encounter-special-courtesy", valueset.getId());
      }
      @Test
      public void testLoadValueSet504FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-reason-medication-given-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "reason-medication-given-codes", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire144FromJson() throws Exception {
         String inputFile = "./examples-json/substance-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadAuditEvent8FromJson() throws Exception {
         String inputFile = "./examples-json/audit-event-example-login.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AuditEvent auditevent = AuditEventHelper.fromJson(json);
         assertEquals("Expect ", "example-login", auditevent.getId());
      }
      @Test
      public void testLoadOperationDefinition35FromJson() throws Exception {
         String inputFile = "./examples-json/operation-observation-lastn.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Observation-lastn", operationdefinition.getId());
      }
      @Test
      public void testLoadFlag2FromJson() throws Exception {
         String inputFile = "./examples-json/flag-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Flag flag = FlagHelper.fromJson(json);
         assertEquals("Expect ", "example", flag.getId());
      }
      @Test
      public void testLoadStructureDefinition533FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-permitted-value-valueset.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-permitted-value-valueset", structuredefinition.getId());
      }
      @Test
      public void testLoadDiagnosticReport14FromJson() throws Exception {
         String inputFile = "./examples-json/diagnosticreport-example-papsmear.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DiagnosticReport diagnosticreport = DiagnosticReportHelper.fromJson(json);
         assertEquals("Expect ", "pap", diagnosticreport.getId());
      }
      @Test
      public void testLoadValueSet505FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-body-site.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "body-site", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition534FromJson() throws Exception {
         String inputFile = "./examples-json/shareablecodesystem.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "shareablecodesystem", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem378FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-audit-source-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "audit-source-type", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition535FromJson() throws Exception {
         String inputFile = "./examples-json/extension-structuredefinition-category.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "structuredefinition-category", structuredefinition.getId());
      }
      @Test
      public void testLoadCodeSystem379FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-versioning-policy.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "versioning-policy", codesystem.getId());
      }
      @Test
      public void testLoadValueSet506FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-vision-base-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "vision-base-codes", valueset.getId());
      }
      @Test
      public void testLoadMedicationRequest36FromJson() throws Exception {
         String inputFile = "./examples-json/medicationrequest0318.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationRequest medicationrequest = MedicationRequestHelper.fromJson(json);
         assertEquals("Expect ", "medrx0318", medicationrequest.getId());
      }
      @Test
      public void testLoadCodeSystem380FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-graph-compartment-rule.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "graph-compartment-rule", codesystem.getId());
      }
      @Test
      public void testLoadContract7FromJson() throws Exception {
         String inputFile = "./examples-json/pcd-example-notOrg.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Contract contract = ContractHelper.fromJson(json);
         assertEquals("Expect ", "pcd-example-notOrg", contract.getId());
      }
      @Test
      public void testLoadValueSet507FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-related-claim-relationship.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "related-claim-relationship", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition536FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-referencefilter.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-referenceFilter", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition537FromJson() throws Exception {
         String inputFile = "./examples-json/extension-communication-reasonnotperformed.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "communication-reasonNotPerformed", structuredefinition.getId());
      }
      @Test
      public void testLoadTask6FromJson() throws Exception {
         String inputFile = "./examples-json/task-example4.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Task task = TaskHelper.fromJson(json);
         assertEquals("Expect ", "example4", task.getId());
      }
      @Test
      public void testLoadStructureDefinition538FromJson() throws Exception {
         String inputFile = "./examples-json/triglyceride.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "triglyceride", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition539FromJson() throws Exception {
         String inputFile = "./examples-json/organization.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Organization", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet508FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-risk-probability.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "risk-probability", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition540FromJson() throws Exception {
         String inputFile = "./examples-json/documentmanifest.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "DocumentManifest", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet509FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-approach-site-codes.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "approach-site-codes", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem381FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-compartment-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "compartment-type", codesystem.getId());
      }
      @Test
      public void testLoadBasic3FromJson() throws Exception {
         String inputFile = "./examples-json/basic-example2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Basic basic = BasicHelper.fromJson(json);
         assertEquals("Expect ", "classModel", basic.getId());
      }
      @Test
      public void testLoadCodeSystem382FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-data-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "data-types", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition541FromJson() throws Exception {
         String inputFile = "./examples-json/extension-birthplace.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "birthPlace", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet510FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-chargeitem-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "chargeitem-status", valueset.getId());
      }
      @Test
      public void testLoadValueSet511FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-security-labels.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "security-labels", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire145FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadStructureDefinition542FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-allowedresource.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-allowedResource", structuredefinition.getId());
      }
      @Test
      public void testLoadSearchParameter29FromJson() throws Exception {
         String inputFile = "./examples-json/device-extensions-Device-din.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "device-extensions-Device-din", searchparameter.getId());
      }
      @Test
      public void testLoadStructureDefinition543FromJson() throws Exception {
         String inputFile = "./examples-json/extension-codesystem-othername.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "codesystem-otherName", structuredefinition.getId());
      }
      @Test
      public void testLoadBundle32FromJson() throws Exception {
         String inputFile = "./examples-json/profiles-others.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Bundle bundle = BundleHelper.fromJson(json);
         assertEquals("Expect ", "profiles-others", bundle.getId());
      }
      @Test
      public void testLoadMedicationAdministration13FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0312.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0312", medicationadministration.getId());
      }
      @Test
      public void testLoadOrganization11FromJson() throws Exception {
         String inputFile = "./examples-json/organization-example-insurer.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Organization organization = OrganizationHelper.fromJson(json);
         assertEquals("Expect ", "2", organization.getId());
      }
      @Test
      public void testLoadSequence15FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-graphic-example-5.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "graphic-example-5", sequence.getId());
      }
      @Test
      public void testLoadDetectedIssue4FromJson() throws Exception {
         String inputFile = "./examples-json/detectedissue-example-lab.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         DetectedIssue detectedissue = DetectedIssueHelper.fromJson(json);
         assertEquals("Expect ", "lab", detectedissue.getId());
      }
      @Test
      public void testLoadFHIRList9FromJson() throws Exception {
         String inputFile = "./examples-json/list-example-familyhistory-genetics-profile-annie.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         FHIRList fhirlist = FHIRListHelper.fromJson(json);
         assertEquals("Expect ", "prognosis", fhirlist.getId());
      }
      @Test
      public void testLoadStructureDefinition544FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-adxp-careof.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-ADXP-careOf", structuredefinition.getId());
      }
      @Test
      public void testLoadPatient15FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-b.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "pat2", patient.getId());
      }
      @Test
      public void testLoadOperationDefinition36FromJson() throws Exception {
         String inputFile = "./examples-json/operation-activitydefinition-data-requirements.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "ActivityDefinition-data-requirements", operationdefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition545FromJson() throws Exception {
         String inputFile = "./examples-json/patient.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Patient", structuredefinition.getId());
      }
      @Test
      public void testLoadConceptMap22FromJson() throws Exception {
         String inputFile = "./examples-json/conceptmap-example-2.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "example2", conceptmap.getId());
      }
      @Test
      public void testLoadSearchParameter30FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-extensions-ValueSet-keyword.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         SearchParameter searchparameter = SearchParameterHelper.fromJson(json);
         assertEquals("Expect ", "valueset-extensions-ValueSet-keyword", searchparameter.getId());
      }
      @Test
      public void testLoadCodeSystem383FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-diagnosis-role.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "diagnosis-role", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition546FromJson() throws Exception {
         String inputFile = "./examples-json/extension-openehr-administration.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "openEHR-administration", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet512FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-http-verb.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "http-verb", valueset.getId());
      }
      @Test
      public void testLoadConsent12FromJson() throws Exception {
         String inputFile = "./examples-json/consent-example-smartonfhir.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Consent consent = ConsentHelper.fromJson(json);
         assertEquals("Expect ", "consent-example-smartonfhir", consent.getId());
      }
      @Test
      public void testLoadMedication21FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample15.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "medexample015", medication.getId());
      }
      @Test
      public void testLoadStructureDefinition547FromJson() throws Exception {
         String inputFile = "./examples-json/extension-devicerequest-reasonrejected.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "devicerequest-reasonRejected", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationAdministration14FromJson() throws Exception {
         String inputFile = "./examples-json/medicationadministration0303.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationAdministration medicationadministration = MedicationAdministrationHelper.fromJson(json);
         assertEquals("Expect ", "medadmin0303", medicationadministration.getId());
      }
      @Test
      public void testLoadMedication22FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample0309.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "med0309", medication.getId());
      }
      @Test
      public void testLoadValueSet513FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-specimen-collection-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "specimen-collection-priority", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem384FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-reference-version-rules.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "reference-version-rules", codesystem.getId());
      }
      @Test
      public void testLoadValueSet514FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-process-outcome.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "process-outcome", valueset.getId());
      }
      @Test
      public void testLoadClaim16FromJson() throws Exception {
         String inputFile = "./examples-json/claim-example-vision-glasses.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Claim claim = ClaimHelper.fromJson(json);
         assertEquals("Expect ", "660151", claim.getId());
      }
      @Test
      public void testLoadValueSet515FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-discriminator-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "discriminator-type", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire146FromJson() throws Exception {
         String inputFile = "./examples-json/dataelement-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadQuestionnaire147FromJson() throws Exception {
         String inputFile = "./examples-json/structuredefinition-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem385FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-condition-state.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "condition-state", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition548FromJson() throws Exception {
         String inputFile = "./examples-json/instant.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "instant", structuredefinition.getId());
      }
      @Test
      public void testLoadSequence16FromJson() throws Exception {
         String inputFile = "./examples-json/sequence-example-fda.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Sequence sequence = SequenceHelper.fromJson(json);
         assertEquals("Expect ", "fda-example", sequence.getId());
      }
      @Test
      public void testLoadCodeSystem386FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-benefit-term.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "benefit-term", codesystem.getId());
      }
      @Test
      public void testLoadPatient16FromJson() throws Exception {
         String inputFile = "./examples-json/patient-example-proband.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Patient patient = PatientHelper.fromJson(json);
         assertEquals("Expect ", "proband", patient.getId());
      }
      @Test
      public void testLoadAdverseEvent1FromJson() throws Exception {
         String inputFile = "./examples-json/adverseevent-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         AdverseEvent adverseevent = AdverseEventHelper.fromJson(json);
         assertEquals("Expect ", "example", adverseevent.getId());
      }
      @Test
      public void testLoadCodeSystem387FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-encounter-type.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "encounter-type", codesystem.getId());
      }
      @Test
      public void testLoadConceptMap23FromJson() throws Exception {
         String inputFile = "./examples-json/conceptmap-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ConceptMap conceptmap = ConceptMapHelper.fromJson(json);
         assertEquals("Expect ", "101", conceptmap.getId());
      }
      @Test
      public void testLoadStructureDefinition549FromJson() throws Exception {
         String inputFile = "./examples-json/extension-iso21090-en-qualifier.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "iso21090-EN-qualifier", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition550FromJson() throws Exception {
         String inputFile = "./examples-json/extension-patient-interpreterrequired.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "patient-interpreterRequired", structuredefinition.getId());
      }
      @Test
      public void testLoadProcedureRequest18FromJson() throws Exception {
         String inputFile = "./examples-json/procedurerequest-example3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ProcedureRequest procedurerequest = ProcedureRequestHelper.fromJson(json);
         assertEquals("Expect ", "do-not-turn", procedurerequest.getId());
      }
      @Test
      public void testLoadObservation48FromJson() throws Exception {
         String inputFile = "./examples-json/observation-example-bmd.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Observation observation = ObservationHelper.fromJson(json);
         assertEquals("Expect ", "bmd", observation.getId());
      }
      @Test
      public void testLoadValueSet516FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-capability-statement-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "capability-statement-kind", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition551FromJson() throws Exception {
         String inputFile = "./examples-json/extension-event-onbehalfof.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "event-OnBehalfOf", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet517FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-flag-priority.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "flag-priority", valueset.getId());
      }
      @Test
      public void testLoadCarePlan11FromJson() throws Exception {
         String inputFile = "./examples-json/careplan-example-f002-lung.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CarePlan careplan = CarePlanHelper.fromJson(json);
         assertEquals("Expect ", "f002", careplan.getId());
      }
      @Test
      public void testLoadValueSet518FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-claim-use.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "claim-use", valueset.getId());
      }
      @Test
      public void testLoadValueSet519FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-conformance-expectation.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "conformance-expectation", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition552FromJson() throws Exception {
         String inputFile = "./examples-json/extension-event-definition.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "event-definition", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet520FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-condition-ver-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "condition-ver-status", valueset.getId());
      }
      @Test
      public void testLoadCodeSystem388FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-action-condition-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "action-condition-kind", codesystem.getId());
      }
      @Test
      public void testLoadEncounter9FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example-f002-lung.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "f002", encounter.getId());
      }
      @Test
      public void testLoadValueSet521FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-guide-page-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "guide-page-kind", valueset.getId());
      }
      @Test
      public void testLoadStructureDefinition553FromJson() throws Exception {
         String inputFile = "./examples-json/extension-event-notdone.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "event-notDone", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet522FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-adverse-event-causality.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "adverse-event-causality", valueset.getId());
      }
      @Test
      public void testLoadMedication23FromJson() throws Exception {
         String inputFile = "./examples-json/medicationexample1.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Medication medication = MedicationHelper.fromJson(json);
         assertEquals("Expect ", "medicationexample1", medication.getId());
      }
      @Test
      public void testLoadStructureDefinition554FromJson() throws Exception {
         String inputFile = "./examples-json/person.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Person", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet523FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-nhin-purposeofuse.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "nhin-purposeofuse", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire148FromJson() throws Exception {
         String inputFile = "./examples-json/bundle-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCodeSystem389FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-structure-definition-kind.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "structure-definition-kind", codesystem.getId());
      }
      @Test
      public void testLoadCodeSystem390FromJson() throws Exception {
         String inputFile = "./examples-json/codesystem-common-tags.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CodeSystem codesystem = CodeSystemHelper.fromJson(json);
         assertEquals("Expect ", "common-tags", codesystem.getId());
      }
      @Test
      public void testLoadStructureDefinition555FromJson() throws Exception {
         String inputFile = "./examples-json/extension-medicationstatement-prescriber.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "medicationstatement-Prescriber", structuredefinition.getId());
      }
      @Test
      public void testLoadOperationDefinition37FromJson() throws Exception {
         String inputFile = "./examples-json/operation-resource-meta.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         OperationDefinition operationdefinition = OperationDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "Resource-meta", operationdefinition.getId());
      }
      @Test
      public void testLoadLibrary11FromJson() throws Exception {
         String inputFile = "./examples-json/library-predecessor-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Library library = LibraryHelper.fromJson(json);
         assertEquals("Expect ", "library-fhir-helpers-predecessor", library.getId());
      }
      @Test
      public void testLoadPractitioner14FromJson() throws Exception {
         String inputFile = "./examples-json/practitioner-example-f201-ab.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Practitioner practitioner = PractitionerHelper.fromJson(json);
         assertEquals("Expect ", "f201", practitioner.getId());
      }
      @Test
      public void testLoadStructureDefinition556FromJson() throws Exception {
         String inputFile = "./examples-json/extension-11179-de-administrative-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "11179-de-administrative-status", structuredefinition.getId());
      }
      @Test
      public void testLoadValueSet524FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-testscript-profile-destination-types.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "testscript-profile-destination-types", valueset.getId());
      }
      @Test
      public void testLoadValueSet525FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-restful-capability-mode.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "restful-capability-mode", valueset.getId());
      }
      @Test
      public void testLoadQuestionnaire149FromJson() throws Exception {
         String inputFile = "./examples-json/devicemetric-questionnaire.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Questionnaire questionnaire = QuestionnaireHelper.fromJson(json);
         assertEquals("Expect ", "qs1", questionnaire.getId());
      }
      @Test
      public void testLoadCapabilityStatement8FromJson() throws Exception {
         String inputFile = "./examples-json/capabilitystatement-phr-example.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         CapabilityStatement capabilitystatement = CapabilityStatementHelper.fromJson(json);
         assertEquals("Expect ", "phr", capabilitystatement.getId());
      }
      @Test
      public void testLoadStructureDefinition557FromJson() throws Exception {
         String inputFile = "./examples-json/extension-capabilitystatement-search-parameter-combination.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "capabilitystatement-search-parameter-combination", structuredefinition.getId());
      }
      @Test
      public void testLoadStructureDefinition558FromJson() throws Exception {
         String inputFile = "./examples-json/operationoutcome.profile.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "OperationOutcome", structuredefinition.getId());
      }
      @Test
      public void testLoadMedicationDispense31FromJson() throws Exception {
         String inputFile = "./examples-json/medicationdispense0317.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         MedicationDispense medicationdispense = MedicationDispenseHelper.fromJson(json);
         assertEquals("Expect ", "meddisp0317", medicationdispense.getId());
      }
      @Test
      public void testLoadStructureDefinition559FromJson() throws Exception {
         String inputFile = "./examples-json/extension-questionnaire-supportlink.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         StructureDefinition structuredefinition = StructureDefinitionHelper.fromJson(json);
         assertEquals("Expect ", "questionnaire-supportLink", structuredefinition.getId());
      }
      @Test
      public void testLoadDevice9FromJson() throws Exception {
         String inputFile = "./examples-json/device-example-udi3.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Device device = DeviceHelper.fromJson(json);
         assertEquals("Expect ", "example-udi3", device.getId());
      }
      @Test
      public void testLoadEncounter10FromJson() throws Exception {
         String inputFile = "./examples-json/encounter-example-xcda.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         Encounter encounter = EncounterHelper.fromJson(json);
         assertEquals("Expect ", "xcda", encounter.getId());
      }
      @Test
      public void testLoadValueSet526FromJson() throws Exception {
         String inputFile = "./examples-json/valueset-endpoint-status.json";

         String json = FileUtils.readFile2String(inputFile, Charset.defaultCharset());
         ValueSet valueset = ValueSetHelper.fromJson(json);
         assertEquals("Expect ", "endpoint-status", valueset.getId());
      }
}