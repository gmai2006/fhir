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

package org.fhir.rest.guice;

import org.fhir.rest.*;
import org.fhir.service.*;
import org.fhir.dao.*;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;
import com.google.inject.Singleton;
public class FhirModule extends ServletModule {
	@Override
	protected void configureServlets() {
		install(new JpaPersistModule("fhirtest"));
		filter("/*").through(PersistFilter.class);

		bind(DeviceRequestResource.class).in(Singleton.class);
		bind(MeasureResource.class).in(Singleton.class);
		bind(MeasureReportResource.class).in(Singleton.class);
		bind(CoverageResource.class).in(Singleton.class);
		bind(CareTeamResource.class).in(Singleton.class);
		bind(ClaimResource.class).in(Singleton.class);
		bind(CarePlanResource.class).in(Singleton.class);
		bind(FHIRListResource.class).in(Singleton.class);
		bind(HealthcareServiceResource.class).in(Singleton.class);
		bind(StructureMapResource.class).in(Singleton.class);
		bind(ConceptMapResource.class).in(Singleton.class);
		bind(DiagnosticReportResource.class).in(Singleton.class);
		bind(LocationResource.class).in(Singleton.class);
		bind(PaymentReconciliationResource.class).in(Singleton.class);
		bind(EpisodeOfCareResource.class).in(Singleton.class);
		bind(ContractResource.class).in(Singleton.class);
		bind(EndpointResource.class).in(Singleton.class);
		bind(ClinicalImpressionResource.class).in(Singleton.class);
		bind(BasicResource.class).in(Singleton.class);
		bind(MedicationAdministrationResource.class).in(Singleton.class);
		bind(DeviceMetricResource.class).in(Singleton.class);
		bind(BinaryResource.class).in(Singleton.class);
		bind(MedicationStatementResource.class).in(Singleton.class);
		bind(FlagResource.class).in(Singleton.class);
		bind(AuditEventResource.class).in(Singleton.class);
		bind(ImagingManifestResource.class).in(Singleton.class);
		bind(CommunicationRequestResource.class).in(Singleton.class);
		bind(PaymentNoticeResource.class).in(Singleton.class);
		bind(ConditionResource.class).in(Singleton.class);
		bind(MedicationDispenseResource.class).in(Singleton.class);
		bind(ResearchSubjectResource.class).in(Singleton.class);
		bind(BodySiteResource.class).in(Singleton.class);
		bind(DeviceUseStatementResource.class).in(Singleton.class);
		bind(RelatedPersonResource.class).in(Singleton.class);
		bind(NutritionOrderResource.class).in(Singleton.class);
		bind(ImagingStudyResource.class).in(Singleton.class);
		bind(PlanDefinitionResource.class).in(Singleton.class);
		bind(DeviceComponentResource.class).in(Singleton.class);
		bind(CommunicationResource.class).in(Singleton.class);
		bind(SubscriptionResource.class).in(Singleton.class);
		bind(MediaResource.class).in(Singleton.class);
		bind(LinkageResource.class).in(Singleton.class);
		bind(GraphDefinitionResource.class).in(Singleton.class);
		bind(ConsentResource.class).in(Singleton.class);
		bind(EnrollmentResponseResource.class).in(Singleton.class);
		bind(ImmunizationRecommendationResource.class).in(Singleton.class);
		bind(ObservationResource.class).in(Singleton.class);
		bind(EligibilityResponseResource.class).in(Singleton.class);
		bind(ServiceDefinitionResource.class).in(Singleton.class);
		bind(ProcessResponseResource.class).in(Singleton.class);
		bind(DeviceResource.class).in(Singleton.class);
		bind(CompartmentDefinitionResource.class).in(Singleton.class);
		bind(TestScriptResource.class).in(Singleton.class);
		bind(SubstanceResource.class).in(Singleton.class);
		bind(CodeSystemResource.class).in(Singleton.class);
		bind(EncounterResource.class).in(Singleton.class);
		bind(ClaimResponseResource.class).in(Singleton.class);
		bind(CapabilityStatementResource.class).in(Singleton.class);
		bind(StructureDefinitionResource.class).in(Singleton.class);
		bind(DocumentManifestResource.class).in(Singleton.class);
		bind(ImplementationGuideResource.class).in(Singleton.class);
		bind(SlotResource.class).in(Singleton.class);
		bind(LibraryResource.class).in(Singleton.class);
		bind(ImmunizationResource.class).in(Singleton.class);
		bind(ReferralRequestResource.class).in(Singleton.class);
		bind(PatientResource.class).in(Singleton.class);
		bind(GroupResource.class).in(Singleton.class);
		bind(FamilyMemberHistoryResource.class).in(Singleton.class);
		bind(ExplanationOfBenefitResource.class).in(Singleton.class);
		bind(AllergyIntoleranceResource.class).in(Singleton.class);
		bind(PersonResource.class).in(Singleton.class);
		bind(SpecimenResource.class).in(Singleton.class);
		bind(NamingSystemResource.class).in(Singleton.class);
		bind(ScheduleResource.class).in(Singleton.class);
		bind(MessageHeaderResource.class).in(Singleton.class);
		bind(GoalResource.class).in(Singleton.class);
		bind(RequestGroupResource.class).in(Singleton.class);
		bind(OrganizationResource.class).in(Singleton.class);
		bind(ResourceResource.class).in(Singleton.class);
		bind(OperationDefinitionResource.class).in(Singleton.class);
		bind(SequenceResource.class).in(Singleton.class);
		bind(MedicationRequestResource.class).in(Singleton.class);
		bind(DocumentReferenceResource.class).in(Singleton.class);
		bind(SupplyDeliveryResource.class).in(Singleton.class);
		bind(CompositionResource.class).in(Singleton.class);
		bind(TaskResource.class).in(Singleton.class);
		bind(MessageDefinitionResource.class).in(Singleton.class);
		bind(AppointmentResource.class).in(Singleton.class);
		bind(SearchParameterResource.class).in(Singleton.class);
		bind(ProcessRequestResource.class).in(Singleton.class);
		bind(ProvenanceResource.class).in(Singleton.class);
		bind(DetectedIssueResource.class).in(Singleton.class);
		bind(ResearchStudyResource.class).in(Singleton.class);
		bind(TestReportResource.class).in(Singleton.class);
		bind(BundleResource.class).in(Singleton.class);
		bind(ChargeItemResource.class).in(Singleton.class);
		bind(PractitionerResource.class).in(Singleton.class);
		bind(ProcedureRequestResource.class).in(Singleton.class);
		bind(AccountResource.class).in(Singleton.class);
		bind(PractitionerRoleResource.class).in(Singleton.class);
		bind(QuestionnaireResource.class).in(Singleton.class);
		bind(EligibilityRequestResource.class).in(Singleton.class);
		bind(RiskAssessmentResource.class).in(Singleton.class);
		bind(ActivityDefinitionResource.class).in(Singleton.class);
		bind(AppointmentResponseResource.class).in(Singleton.class);
		bind(GuidanceResponseResource.class).in(Singleton.class);
		bind(ExpansionProfileResource.class).in(Singleton.class);
		bind(SupplyRequestResource.class).in(Singleton.class);
		bind(ProcedureResource.class).in(Singleton.class);
		bind(MedicationResource.class).in(Singleton.class);
		bind(EnrollmentRequestResource.class).in(Singleton.class);
		bind(ValueSetResource.class).in(Singleton.class);
		bind(DataElementResource.class).in(Singleton.class);
		bind(QuestionnaireResponseResource.class).in(Singleton.class);
		bind(VisionPrescriptionResource.class).in(Singleton.class);
		bind(AdverseEventResource.class).in(Singleton.class);

		bind(DeviceRequestService.class).to(DeviceRequestServiceImpl.class).in(Singleton.class); 
		bind(MeasureService.class).to(MeasureServiceImpl.class).in(Singleton.class); 
		bind(MeasureReportService.class).to(MeasureReportServiceImpl.class).in(Singleton.class); 
		bind(CoverageService.class).to(CoverageServiceImpl.class).in(Singleton.class); 
		bind(CareTeamService.class).to(CareTeamServiceImpl.class).in(Singleton.class); 
		bind(ClaimService.class).to(ClaimServiceImpl.class).in(Singleton.class); 
		bind(CarePlanService.class).to(CarePlanServiceImpl.class).in(Singleton.class); 
		bind(FHIRListService.class).to(FHIRListServiceImpl.class).in(Singleton.class); 
		bind(HealthcareServiceService.class).to(HealthcareServiceServiceImpl.class).in(Singleton.class); 
		bind(StructureMapService.class).to(StructureMapServiceImpl.class).in(Singleton.class); 
		bind(ConceptMapService.class).to(ConceptMapServiceImpl.class).in(Singleton.class); 
		bind(DiagnosticReportService.class).to(DiagnosticReportServiceImpl.class).in(Singleton.class); 
		bind(LocationService.class).to(LocationServiceImpl.class).in(Singleton.class); 
		bind(PaymentReconciliationService.class).to(PaymentReconciliationServiceImpl.class).in(Singleton.class); 
		bind(EpisodeOfCareService.class).to(EpisodeOfCareServiceImpl.class).in(Singleton.class); 
		bind(ContractService.class).to(ContractServiceImpl.class).in(Singleton.class); 
		bind(EndpointService.class).to(EndpointServiceImpl.class).in(Singleton.class); 
		bind(ClinicalImpressionService.class).to(ClinicalImpressionServiceImpl.class).in(Singleton.class); 
		bind(BasicService.class).to(BasicServiceImpl.class).in(Singleton.class); 
		bind(MedicationAdministrationService.class).to(MedicationAdministrationServiceImpl.class).in(Singleton.class); 
		bind(DeviceMetricService.class).to(DeviceMetricServiceImpl.class).in(Singleton.class); 
		bind(BinaryService.class).to(BinaryServiceImpl.class).in(Singleton.class); 
		bind(MedicationStatementService.class).to(MedicationStatementServiceImpl.class).in(Singleton.class); 
		bind(FlagService.class).to(FlagServiceImpl.class).in(Singleton.class); 
		bind(AuditEventService.class).to(AuditEventServiceImpl.class).in(Singleton.class); 
		bind(ImagingManifestService.class).to(ImagingManifestServiceImpl.class).in(Singleton.class); 
		bind(CommunicationRequestService.class).to(CommunicationRequestServiceImpl.class).in(Singleton.class); 
		bind(PaymentNoticeService.class).to(PaymentNoticeServiceImpl.class).in(Singleton.class); 
		bind(ConditionService.class).to(ConditionServiceImpl.class).in(Singleton.class); 
		bind(MedicationDispenseService.class).to(MedicationDispenseServiceImpl.class).in(Singleton.class); 
		bind(ResearchSubjectService.class).to(ResearchSubjectServiceImpl.class).in(Singleton.class); 
		bind(BodySiteService.class).to(BodySiteServiceImpl.class).in(Singleton.class); 
		bind(DeviceUseStatementService.class).to(DeviceUseStatementServiceImpl.class).in(Singleton.class); 
		bind(RelatedPersonService.class).to(RelatedPersonServiceImpl.class).in(Singleton.class); 
		bind(NutritionOrderService.class).to(NutritionOrderServiceImpl.class).in(Singleton.class); 
		bind(ImagingStudyService.class).to(ImagingStudyServiceImpl.class).in(Singleton.class); 
		bind(PlanDefinitionService.class).to(PlanDefinitionServiceImpl.class).in(Singleton.class); 
		bind(DeviceComponentService.class).to(DeviceComponentServiceImpl.class).in(Singleton.class); 
		bind(CommunicationService.class).to(CommunicationServiceImpl.class).in(Singleton.class); 
		bind(SubscriptionService.class).to(SubscriptionServiceImpl.class).in(Singleton.class); 
		bind(MediaService.class).to(MediaServiceImpl.class).in(Singleton.class); 
		bind(LinkageService.class).to(LinkageServiceImpl.class).in(Singleton.class); 
		bind(GraphDefinitionService.class).to(GraphDefinitionServiceImpl.class).in(Singleton.class); 
		bind(ConsentService.class).to(ConsentServiceImpl.class).in(Singleton.class); 
		bind(EnrollmentResponseService.class).to(EnrollmentResponseServiceImpl.class).in(Singleton.class); 
		bind(ImmunizationRecommendationService.class).to(ImmunizationRecommendationServiceImpl.class).in(Singleton.class); 
		bind(ObservationService.class).to(ObservationServiceImpl.class).in(Singleton.class); 
		bind(EligibilityResponseService.class).to(EligibilityResponseServiceImpl.class).in(Singleton.class); 
		bind(ServiceDefinitionService.class).to(ServiceDefinitionServiceImpl.class).in(Singleton.class); 
		bind(ProcessResponseService.class).to(ProcessResponseServiceImpl.class).in(Singleton.class); 
		bind(DeviceService.class).to(DeviceServiceImpl.class).in(Singleton.class); 
		bind(CompartmentDefinitionService.class).to(CompartmentDefinitionServiceImpl.class).in(Singleton.class); 
		bind(TestScriptService.class).to(TestScriptServiceImpl.class).in(Singleton.class); 
		bind(SubstanceService.class).to(SubstanceServiceImpl.class).in(Singleton.class); 
		bind(CodeSystemService.class).to(CodeSystemServiceImpl.class).in(Singleton.class); 
		bind(EncounterService.class).to(EncounterServiceImpl.class).in(Singleton.class); 
		bind(ClaimResponseService.class).to(ClaimResponseServiceImpl.class).in(Singleton.class); 
		bind(CapabilityStatementService.class).to(CapabilityStatementServiceImpl.class).in(Singleton.class); 
		bind(StructureDefinitionService.class).to(StructureDefinitionServiceImpl.class).in(Singleton.class); 
		bind(DocumentManifestService.class).to(DocumentManifestServiceImpl.class).in(Singleton.class); 
		bind(ImplementationGuideService.class).to(ImplementationGuideServiceImpl.class).in(Singleton.class); 
		bind(SlotService.class).to(SlotServiceImpl.class).in(Singleton.class); 
		bind(LibraryService.class).to(LibraryServiceImpl.class).in(Singleton.class); 
		bind(ImmunizationService.class).to(ImmunizationServiceImpl.class).in(Singleton.class); 
		bind(ReferralRequestService.class).to(ReferralRequestServiceImpl.class).in(Singleton.class); 
		bind(PatientService.class).to(PatientServiceImpl.class).in(Singleton.class); 
		bind(GroupService.class).to(GroupServiceImpl.class).in(Singleton.class); 
		bind(FamilyMemberHistoryService.class).to(FamilyMemberHistoryServiceImpl.class).in(Singleton.class); 
		bind(ExplanationOfBenefitService.class).to(ExplanationOfBenefitServiceImpl.class).in(Singleton.class); 
		bind(AllergyIntoleranceService.class).to(AllergyIntoleranceServiceImpl.class).in(Singleton.class); 
		bind(PersonService.class).to(PersonServiceImpl.class).in(Singleton.class); 
		bind(SpecimenService.class).to(SpecimenServiceImpl.class).in(Singleton.class); 
		bind(NamingSystemService.class).to(NamingSystemServiceImpl.class).in(Singleton.class); 
		bind(ScheduleService.class).to(ScheduleServiceImpl.class).in(Singleton.class); 
		bind(MessageHeaderService.class).to(MessageHeaderServiceImpl.class).in(Singleton.class); 
		bind(GoalService.class).to(GoalServiceImpl.class).in(Singleton.class); 
		bind(RequestGroupService.class).to(RequestGroupServiceImpl.class).in(Singleton.class); 
		bind(OrganizationService.class).to(OrganizationServiceImpl.class).in(Singleton.class); 
		bind(ResourceService.class).to(ResourceServiceImpl.class).in(Singleton.class); 
		bind(OperationDefinitionService.class).to(OperationDefinitionServiceImpl.class).in(Singleton.class); 
		bind(SequenceService.class).to(SequenceServiceImpl.class).in(Singleton.class); 
		bind(MedicationRequestService.class).to(MedicationRequestServiceImpl.class).in(Singleton.class); 
		bind(DocumentReferenceService.class).to(DocumentReferenceServiceImpl.class).in(Singleton.class); 
		bind(SupplyDeliveryService.class).to(SupplyDeliveryServiceImpl.class).in(Singleton.class); 
		bind(CompositionService.class).to(CompositionServiceImpl.class).in(Singleton.class); 
		bind(TaskService.class).to(TaskServiceImpl.class).in(Singleton.class); 
		bind(MessageDefinitionService.class).to(MessageDefinitionServiceImpl.class).in(Singleton.class); 
		bind(AppointmentService.class).to(AppointmentServiceImpl.class).in(Singleton.class); 
		bind(SearchParameterService.class).to(SearchParameterServiceImpl.class).in(Singleton.class); 
		bind(ProcessRequestService.class).to(ProcessRequestServiceImpl.class).in(Singleton.class); 
		bind(ProvenanceService.class).to(ProvenanceServiceImpl.class).in(Singleton.class); 
		bind(DetectedIssueService.class).to(DetectedIssueServiceImpl.class).in(Singleton.class); 
		bind(ResearchStudyService.class).to(ResearchStudyServiceImpl.class).in(Singleton.class); 
		bind(TestReportService.class).to(TestReportServiceImpl.class).in(Singleton.class); 
		bind(BundleService.class).to(BundleServiceImpl.class).in(Singleton.class); 
		bind(ChargeItemService.class).to(ChargeItemServiceImpl.class).in(Singleton.class); 
		bind(PractitionerService.class).to(PractitionerServiceImpl.class).in(Singleton.class); 
		bind(ProcedureRequestService.class).to(ProcedureRequestServiceImpl.class).in(Singleton.class); 
		bind(AccountService.class).to(AccountServiceImpl.class).in(Singleton.class); 
		bind(PractitionerRoleService.class).to(PractitionerRoleServiceImpl.class).in(Singleton.class); 
		bind(QuestionnaireService.class).to(QuestionnaireServiceImpl.class).in(Singleton.class); 
		bind(EligibilityRequestService.class).to(EligibilityRequestServiceImpl.class).in(Singleton.class); 
		bind(RiskAssessmentService.class).to(RiskAssessmentServiceImpl.class).in(Singleton.class); 
		bind(ActivityDefinitionService.class).to(ActivityDefinitionServiceImpl.class).in(Singleton.class); 
		bind(AppointmentResponseService.class).to(AppointmentResponseServiceImpl.class).in(Singleton.class); 
		bind(GuidanceResponseService.class).to(GuidanceResponseServiceImpl.class).in(Singleton.class); 
		bind(ExpansionProfileService.class).to(ExpansionProfileServiceImpl.class).in(Singleton.class); 
		bind(SupplyRequestService.class).to(SupplyRequestServiceImpl.class).in(Singleton.class); 
		bind(ProcedureService.class).to(ProcedureServiceImpl.class).in(Singleton.class); 
		bind(MedicationService.class).to(MedicationServiceImpl.class).in(Singleton.class); 
		bind(EnrollmentRequestService.class).to(EnrollmentRequestServiceImpl.class).in(Singleton.class); 
		bind(ValueSetService.class).to(ValueSetServiceImpl.class).in(Singleton.class); 
		bind(DataElementService.class).to(DataElementServiceImpl.class).in(Singleton.class); 
		bind(QuestionnaireResponseService.class).to(QuestionnaireResponseServiceImpl.class).in(Singleton.class); 
		bind(VisionPrescriptionService.class).to(VisionPrescriptionServiceImpl.class).in(Singleton.class); 
		bind(AdverseEventService.class).to(AdverseEventServiceImpl.class).in(Singleton.class); 

		bind(DeviceRequestDao.class).to(DeviceRequestDaoImpl.class).in(Singleton.class); 
		bind(MeasureDao.class).to(MeasureDaoImpl.class).in(Singleton.class); 
		bind(MeasureReportDao.class).to(MeasureReportDaoImpl.class).in(Singleton.class); 
		bind(CoverageDao.class).to(CoverageDaoImpl.class).in(Singleton.class); 
		bind(CareTeamDao.class).to(CareTeamDaoImpl.class).in(Singleton.class); 
		bind(ClaimDao.class).to(ClaimDaoImpl.class).in(Singleton.class); 
		bind(CarePlanDao.class).to(CarePlanDaoImpl.class).in(Singleton.class); 
		bind(FHIRListDao.class).to(FHIRListDaoImpl.class).in(Singleton.class); 
		bind(HealthcareServiceDao.class).to(HealthcareServiceDaoImpl.class).in(Singleton.class); 
		bind(StructureMapDao.class).to(StructureMapDaoImpl.class).in(Singleton.class); 
		bind(ConceptMapDao.class).to(ConceptMapDaoImpl.class).in(Singleton.class); 
		bind(DiagnosticReportDao.class).to(DiagnosticReportDaoImpl.class).in(Singleton.class); 
		bind(LocationDao.class).to(LocationDaoImpl.class).in(Singleton.class); 
		bind(PaymentReconciliationDao.class).to(PaymentReconciliationDaoImpl.class).in(Singleton.class); 
		bind(EpisodeOfCareDao.class).to(EpisodeOfCareDaoImpl.class).in(Singleton.class); 
		bind(ContractDao.class).to(ContractDaoImpl.class).in(Singleton.class); 
		bind(EndpointDao.class).to(EndpointDaoImpl.class).in(Singleton.class); 
		bind(ClinicalImpressionDao.class).to(ClinicalImpressionDaoImpl.class).in(Singleton.class); 
		bind(BasicDao.class).to(BasicDaoImpl.class).in(Singleton.class); 
		bind(MedicationAdministrationDao.class).to(MedicationAdministrationDaoImpl.class).in(Singleton.class); 
		bind(DeviceMetricDao.class).to(DeviceMetricDaoImpl.class).in(Singleton.class); 
		bind(BinaryDao.class).to(BinaryDaoImpl.class).in(Singleton.class); 
		bind(MedicationStatementDao.class).to(MedicationStatementDaoImpl.class).in(Singleton.class); 
		bind(FlagDao.class).to(FlagDaoImpl.class).in(Singleton.class); 
		bind(AuditEventDao.class).to(AuditEventDaoImpl.class).in(Singleton.class); 
		bind(ImagingManifestDao.class).to(ImagingManifestDaoImpl.class).in(Singleton.class); 
		bind(CommunicationRequestDao.class).to(CommunicationRequestDaoImpl.class).in(Singleton.class); 
		bind(PaymentNoticeDao.class).to(PaymentNoticeDaoImpl.class).in(Singleton.class); 
		bind(ConditionDao.class).to(ConditionDaoImpl.class).in(Singleton.class); 
		bind(MedicationDispenseDao.class).to(MedicationDispenseDaoImpl.class).in(Singleton.class); 
		bind(ResearchSubjectDao.class).to(ResearchSubjectDaoImpl.class).in(Singleton.class); 
		bind(BodySiteDao.class).to(BodySiteDaoImpl.class).in(Singleton.class); 
		bind(DeviceUseStatementDao.class).to(DeviceUseStatementDaoImpl.class).in(Singleton.class); 
		bind(RelatedPersonDao.class).to(RelatedPersonDaoImpl.class).in(Singleton.class); 
		bind(NutritionOrderDao.class).to(NutritionOrderDaoImpl.class).in(Singleton.class); 
		bind(ImagingStudyDao.class).to(ImagingStudyDaoImpl.class).in(Singleton.class); 
		bind(PlanDefinitionDao.class).to(PlanDefinitionDaoImpl.class).in(Singleton.class); 
		bind(DeviceComponentDao.class).to(DeviceComponentDaoImpl.class).in(Singleton.class); 
		bind(CommunicationDao.class).to(CommunicationDaoImpl.class).in(Singleton.class); 
		bind(SubscriptionDao.class).to(SubscriptionDaoImpl.class).in(Singleton.class); 
		bind(MediaDao.class).to(MediaDaoImpl.class).in(Singleton.class); 
		bind(LinkageDao.class).to(LinkageDaoImpl.class).in(Singleton.class); 
		bind(GraphDefinitionDao.class).to(GraphDefinitionDaoImpl.class).in(Singleton.class); 
		bind(ConsentDao.class).to(ConsentDaoImpl.class).in(Singleton.class); 
		bind(EnrollmentResponseDao.class).to(EnrollmentResponseDaoImpl.class).in(Singleton.class); 
		bind(ImmunizationRecommendationDao.class).to(ImmunizationRecommendationDaoImpl.class).in(Singleton.class); 
		bind(ObservationDao.class).to(ObservationDaoImpl.class).in(Singleton.class); 
		bind(EligibilityResponseDao.class).to(EligibilityResponseDaoImpl.class).in(Singleton.class); 
		bind(ServiceDefinitionDao.class).to(ServiceDefinitionDaoImpl.class).in(Singleton.class); 
		bind(ProcessResponseDao.class).to(ProcessResponseDaoImpl.class).in(Singleton.class); 
		bind(DeviceDao.class).to(DeviceDaoImpl.class).in(Singleton.class); 
		bind(CompartmentDefinitionDao.class).to(CompartmentDefinitionDaoImpl.class).in(Singleton.class); 
		bind(TestScriptDao.class).to(TestScriptDaoImpl.class).in(Singleton.class); 
		bind(SubstanceDao.class).to(SubstanceDaoImpl.class).in(Singleton.class); 
		bind(CodeSystemDao.class).to(CodeSystemDaoImpl.class).in(Singleton.class); 
		bind(EncounterDao.class).to(EncounterDaoImpl.class).in(Singleton.class); 
		bind(ClaimResponseDao.class).to(ClaimResponseDaoImpl.class).in(Singleton.class); 
		bind(CapabilityStatementDao.class).to(CapabilityStatementDaoImpl.class).in(Singleton.class); 
		bind(StructureDefinitionDao.class).to(StructureDefinitionDaoImpl.class).in(Singleton.class); 
		bind(DocumentManifestDao.class).to(DocumentManifestDaoImpl.class).in(Singleton.class); 
		bind(ImplementationGuideDao.class).to(ImplementationGuideDaoImpl.class).in(Singleton.class); 
		bind(SlotDao.class).to(SlotDaoImpl.class).in(Singleton.class); 
		bind(LibraryDao.class).to(LibraryDaoImpl.class).in(Singleton.class); 
		bind(ImmunizationDao.class).to(ImmunizationDaoImpl.class).in(Singleton.class); 
		bind(ReferralRequestDao.class).to(ReferralRequestDaoImpl.class).in(Singleton.class); 
		bind(PatientDao.class).to(PatientDaoImpl.class).in(Singleton.class); 
		bind(GroupDao.class).to(GroupDaoImpl.class).in(Singleton.class); 
		bind(FamilyMemberHistoryDao.class).to(FamilyMemberHistoryDaoImpl.class).in(Singleton.class); 
		bind(ExplanationOfBenefitDao.class).to(ExplanationOfBenefitDaoImpl.class).in(Singleton.class); 
		bind(AllergyIntoleranceDao.class).to(AllergyIntoleranceDaoImpl.class).in(Singleton.class); 
		bind(PersonDao.class).to(PersonDaoImpl.class).in(Singleton.class); 
		bind(SpecimenDao.class).to(SpecimenDaoImpl.class).in(Singleton.class); 
		bind(NamingSystemDao.class).to(NamingSystemDaoImpl.class).in(Singleton.class); 
		bind(ScheduleDao.class).to(ScheduleDaoImpl.class).in(Singleton.class); 
		bind(MessageHeaderDao.class).to(MessageHeaderDaoImpl.class).in(Singleton.class); 
		bind(GoalDao.class).to(GoalDaoImpl.class).in(Singleton.class); 
		bind(RequestGroupDao.class).to(RequestGroupDaoImpl.class).in(Singleton.class); 
		bind(OrganizationDao.class).to(OrganizationDaoImpl.class).in(Singleton.class); 
		bind(ResourceDao.class).to(ResourceDaoImpl.class).in(Singleton.class); 
		bind(OperationDefinitionDao.class).to(OperationDefinitionDaoImpl.class).in(Singleton.class); 
		bind(SequenceDao.class).to(SequenceDaoImpl.class).in(Singleton.class); 
		bind(MedicationRequestDao.class).to(MedicationRequestDaoImpl.class).in(Singleton.class); 
		bind(DocumentReferenceDao.class).to(DocumentReferenceDaoImpl.class).in(Singleton.class); 
		bind(SupplyDeliveryDao.class).to(SupplyDeliveryDaoImpl.class).in(Singleton.class); 
		bind(CompositionDao.class).to(CompositionDaoImpl.class).in(Singleton.class); 
		bind(TaskDao.class).to(TaskDaoImpl.class).in(Singleton.class); 
		bind(MessageDefinitionDao.class).to(MessageDefinitionDaoImpl.class).in(Singleton.class); 
		bind(AppointmentDao.class).to(AppointmentDaoImpl.class).in(Singleton.class); 
		bind(SearchParameterDao.class).to(SearchParameterDaoImpl.class).in(Singleton.class); 
		bind(ProcessRequestDao.class).to(ProcessRequestDaoImpl.class).in(Singleton.class); 
		bind(ProvenanceDao.class).to(ProvenanceDaoImpl.class).in(Singleton.class); 
		bind(DetectedIssueDao.class).to(DetectedIssueDaoImpl.class).in(Singleton.class); 
		bind(ResearchStudyDao.class).to(ResearchStudyDaoImpl.class).in(Singleton.class); 
		bind(TestReportDao.class).to(TestReportDaoImpl.class).in(Singleton.class); 
		bind(BundleDao.class).to(BundleDaoImpl.class).in(Singleton.class); 
		bind(ChargeItemDao.class).to(ChargeItemDaoImpl.class).in(Singleton.class); 
		bind(PractitionerDao.class).to(PractitionerDaoImpl.class).in(Singleton.class); 
		bind(ProcedureRequestDao.class).to(ProcedureRequestDaoImpl.class).in(Singleton.class); 
		bind(AccountDao.class).to(AccountDaoImpl.class).in(Singleton.class); 
		bind(PractitionerRoleDao.class).to(PractitionerRoleDaoImpl.class).in(Singleton.class); 
		bind(QuestionnaireDao.class).to(QuestionnaireDaoImpl.class).in(Singleton.class); 
		bind(EligibilityRequestDao.class).to(EligibilityRequestDaoImpl.class).in(Singleton.class); 
		bind(RiskAssessmentDao.class).to(RiskAssessmentDaoImpl.class).in(Singleton.class); 
		bind(ActivityDefinitionDao.class).to(ActivityDefinitionDaoImpl.class).in(Singleton.class); 
		bind(AppointmentResponseDao.class).to(AppointmentResponseDaoImpl.class).in(Singleton.class); 
		bind(GuidanceResponseDao.class).to(GuidanceResponseDaoImpl.class).in(Singleton.class); 
		bind(ExpansionProfileDao.class).to(ExpansionProfileDaoImpl.class).in(Singleton.class); 
		bind(SupplyRequestDao.class).to(SupplyRequestDaoImpl.class).in(Singleton.class); 
		bind(ProcedureDao.class).to(ProcedureDaoImpl.class).in(Singleton.class); 
		bind(MedicationDao.class).to(MedicationDaoImpl.class).in(Singleton.class); 
		bind(EnrollmentRequestDao.class).to(EnrollmentRequestDaoImpl.class).in(Singleton.class); 
		bind(ValueSetDao.class).to(ValueSetDaoImpl.class).in(Singleton.class); 
		bind(DataElementDao.class).to(DataElementDaoImpl.class).in(Singleton.class); 
		bind(QuestionnaireResponseDao.class).to(QuestionnaireResponseDaoImpl.class).in(Singleton.class); 
		bind(VisionPrescriptionDao.class).to(VisionPrescriptionDaoImpl.class).in(Singleton.class); 
		bind(AdverseEventDao.class).to(AdverseEventDaoImpl.class).in(Singleton.class); 
	}
}