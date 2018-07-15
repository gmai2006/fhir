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
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public enum ResourceType {
	Account,
	ActivityDefinition,
	AdverseEvent,
	AllergyIntolerance,
	Appointment,
	AppointmentResponse,
	AuditEvent,
	Basic,
	Binary,
	BodySite,
	Bundle,
	CapabilityStatement,
	CarePlan,
	CareTeam,
	ChargeItem,
	Claim,
	ClaimResponse,
	ClinicalImpression,
	CodeSystem,
	Communication,
	CommunicationRequest,
	CompartmentDefinition,
	Composition,
	ConceptMap,
	Condition,
	Consent,
	Contract,
	Coverage,
	DataElement,
	DetectedIssue,
	Device,
	DeviceComponent,
	DeviceMetric,
	DeviceRequest,
	DeviceUseStatement,
	DiagnosticReport,
	DocumentManifest,
	DocumentReference,
	DomainResource,
	EligibilityRequest,
	EligibilityResponse,
	Encounter,
	Endpoint,
	EnrollmentRequest,
	EnrollmentResponse,
	EpisodeOfCare,
	ExpansionProfile,
	ExplanationOfBenefit,
	FamilyMemberHistory,
	Flag,
	Goal,
	GraphDefinition,
	Group,
	GuidanceResponse,
	HealthcareService,
	ImagingManifest,
	ImagingStudy,
	Immunization,
	ImmunizationRecommendation,
	ImplementationGuide,
	Library,
	Linkage,
	List,
	Location,
	Measure,
	MeasureReport,
	Media,
	Medication,
	MedicationAdministration,
	MedicationDispense,
	MedicationRequest,
	MedicationStatement,
	MessageDefinition,
	MessageHeader,
	NamingSystem,
	NutritionOrder,
	Observation,
	OperationDefinition,
	OperationOutcome,
	Organization,
	Parameters,
	Patient,
	PaymentNotice,
	PaymentReconciliation,
	Person,
	PlanDefinition,
	Practitioner,
	PractitionerRole,
	Procedure,
	ProcedureRequest,
	ProcessRequest,
	ProcessResponse,
	Provenance,
	Questionnaire,
	QuestionnaireResponse,
	ReferralRequest,
	RelatedPerson,
	RequestGroup,
	ResearchStudy,
	ResearchSubject,
	Resource,
	RiskAssessment,
	Schedule,
	SearchParameter,
	Sequence,
	ServiceDefinition,
	Slot,
	Specimen,
	StructureDefinition,
	StructureMap,
	Subscription,
	Substance,
	SupplyDelivery,
	SupplyRequest,
	Task,
	TestReport,
	TestScript,
	ValueSet,
	VisionPrescription;

	public static ResourceType fromCode(String code) {
		switch (code) {
			case "Account" : { return Account; }
			case "ActivityDefinition" : { return ActivityDefinition; }
			case "AdverseEvent" : { return AdverseEvent; }
			case "AllergyIntolerance" : { return AllergyIntolerance; }
			case "Appointment" : { return Appointment; }
			case "AppointmentResponse" : { return AppointmentResponse; }
			case "AuditEvent" : { return AuditEvent; }
			case "Basic" : { return Basic; }
			case "Binary" : { return Binary; }
			case "BodySite" : { return BodySite; }
			case "Bundle" : { return Bundle; }
			case "CapabilityStatement" : { return CapabilityStatement; }
			case "CarePlan" : { return CarePlan; }
			case "CareTeam" : { return CareTeam; }
			case "ChargeItem" : { return ChargeItem; }
			case "Claim" : { return Claim; }
			case "ClaimResponse" : { return ClaimResponse; }
			case "ClinicalImpression" : { return ClinicalImpression; }
			case "CodeSystem" : { return CodeSystem; }
			case "Communication" : { return Communication; }
			case "CommunicationRequest" : { return CommunicationRequest; }
			case "CompartmentDefinition" : { return CompartmentDefinition; }
			case "Composition" : { return Composition; }
			case "ConceptMap" : { return ConceptMap; }
			case "Condition" : { return Condition; }
			case "Consent" : { return Consent; }
			case "Contract" : { return Contract; }
			case "Coverage" : { return Coverage; }
			case "DataElement" : { return DataElement; }
			case "DetectedIssue" : { return DetectedIssue; }
			case "Device" : { return Device; }
			case "DeviceComponent" : { return DeviceComponent; }
			case "DeviceMetric" : { return DeviceMetric; }
			case "DeviceRequest" : { return DeviceRequest; }
			case "DeviceUseStatement" : { return DeviceUseStatement; }
			case "DiagnosticReport" : { return DiagnosticReport; }
			case "DocumentManifest" : { return DocumentManifest; }
			case "DocumentReference" : { return DocumentReference; }
			case "DomainResource" : { return DomainResource; }
			case "EligibilityRequest" : { return EligibilityRequest; }
			case "EligibilityResponse" : { return EligibilityResponse; }
			case "Encounter" : { return Encounter; }
			case "Endpoint" : { return Endpoint; }
			case "EnrollmentRequest" : { return EnrollmentRequest; }
			case "EnrollmentResponse" : { return EnrollmentResponse; }
			case "EpisodeOfCare" : { return EpisodeOfCare; }
			case "ExpansionProfile" : { return ExpansionProfile; }
			case "ExplanationOfBenefit" : { return ExplanationOfBenefit; }
			case "FamilyMemberHistory" : { return FamilyMemberHistory; }
			case "Flag" : { return Flag; }
			case "Goal" : { return Goal; }
			case "GraphDefinition" : { return GraphDefinition; }
			case "Group" : { return Group; }
			case "GuidanceResponse" : { return GuidanceResponse; }
			case "HealthcareService" : { return HealthcareService; }
			case "ImagingManifest" : { return ImagingManifest; }
			case "ImagingStudy" : { return ImagingStudy; }
			case "Immunization" : { return Immunization; }
			case "ImmunizationRecommendation" : { return ImmunizationRecommendation; }
			case "ImplementationGuide" : { return ImplementationGuide; }
			case "Library" : { return Library; }
			case "Linkage" : { return Linkage; }
			case "List" : { return List; }
			case "Location" : { return Location; }
			case "Measure" : { return Measure; }
			case "MeasureReport" : { return MeasureReport; }
			case "Media" : { return Media; }
			case "Medication" : { return Medication; }
			case "MedicationAdministration" : { return MedicationAdministration; }
			case "MedicationDispense" : { return MedicationDispense; }
			case "MedicationRequest" : { return MedicationRequest; }
			case "MedicationStatement" : { return MedicationStatement; }
			case "MessageDefinition" : { return MessageDefinition; }
			case "MessageHeader" : { return MessageHeader; }
			case "NamingSystem" : { return NamingSystem; }
			case "NutritionOrder" : { return NutritionOrder; }
			case "Observation" : { return Observation; }
			case "OperationDefinition" : { return OperationDefinition; }
			case "OperationOutcome" : { return OperationOutcome; }
			case "Organization" : { return Organization; }
			case "Parameters" : { return Parameters; }
			case "Patient" : { return Patient; }
			case "PaymentNotice" : { return PaymentNotice; }
			case "PaymentReconciliation" : { return PaymentReconciliation; }
			case "Person" : { return Person; }
			case "PlanDefinition" : { return PlanDefinition; }
			case "Practitioner" : { return Practitioner; }
			case "PractitionerRole" : { return PractitionerRole; }
			case "Procedure" : { return Procedure; }
			case "ProcedureRequest" : { return ProcedureRequest; }
			case "ProcessRequest" : { return ProcessRequest; }
			case "ProcessResponse" : { return ProcessResponse; }
			case "Provenance" : { return Provenance; }
			case "Questionnaire" : { return Questionnaire; }
			case "QuestionnaireResponse" : { return QuestionnaireResponse; }
			case "ReferralRequest" : { return ReferralRequest; }
			case "RelatedPerson" : { return RelatedPerson; }
			case "RequestGroup" : { return RequestGroup; }
			case "ResearchStudy" : { return ResearchStudy; }
			case "ResearchSubject" : { return ResearchSubject; }
			case "Resource" : { return Resource; }
			case "RiskAssessment" : { return RiskAssessment; }
			case "Schedule" : { return Schedule; }
			case "SearchParameter" : { return SearchParameter; }
			case "Sequence" : { return Sequence; }
			case "ServiceDefinition" : { return ServiceDefinition; }
			case "Slot" : { return Slot; }
			case "Specimen" : { return Specimen; }
			case "StructureDefinition" : { return StructureDefinition; }
			case "StructureMap" : { return StructureMap; }
			case "Subscription" : { return Subscription; }
			case "Substance" : { return Substance; }
			case "SupplyDelivery" : { return SupplyDelivery; }
			case "SupplyRequest" : { return SupplyRequest; }
			case "Task" : { return Task; }
			case "TestReport" : { return TestReport; }
			case "TestScript" : { return TestScript; }
			case "ValueSet" : { return ValueSet; }
			case "VisionPrescription" : { return VisionPrescription; }
			default:
			throw new IllegalArgumentException("Unknown resource type ["+ code + "]");
		}
	}
}