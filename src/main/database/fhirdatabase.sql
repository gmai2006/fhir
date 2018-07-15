-- --------------------------------------------------------

--
-- Database: fhir
--

-- --------------------------------------------------------

SET sql_mode = '';

--
-- Table structure for table claimaccident
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claimaccident`;
CREATE TABLE `claimaccident` (
 `date` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `locationaddress_id` VARCHAR(128),
 `locationreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table observation
-- "Measurements and simple assertions made about a patient, device or other subject."
--
DROP TABLE IF EXISTS `observation`;
CREATE TABLE `observation` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `effectiveDateTime` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `issued` VARCHAR(1024),
 `valueString` VARCHAR(1024),
 `valueBoolean` BOOLEAN,
 `valueRange` MEDIUMTEXT,
 `valueRatio` MEDIUMTEXT,
 `valueSampledData` MEDIUMTEXT,
 `valueAttachment` MEDIUMTEXT,
 `valueTime` VARCHAR(1024),
 `valueDateTime` VARCHAR(1024),
 `valuePeriod` MEDIUMTEXT,
 `comment` VARCHAR(16000),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `basedon_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `valuequantity_id` VARCHAR(128),
 `valuecodeableconcept_id` VARCHAR(128),
 `dataabsentreason_id` VARCHAR(128),
 `interpretation_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `method_id` VARCHAR(128),
 `specimen_id` VARCHAR(128),
 `device_id` VARCHAR(128),
 `referencerange_id` VARCHAR(128),
 `related_id` VARCHAR(128),
 `component_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimdiagnosis
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claimdiagnosis`;
CREATE TABLE `claimdiagnosis` (
 `sequence` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `diagnosiscodeableconcept_id` VARCHAR(128),
 `diagnosisreference_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `packagecode_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table immunizationrecommendationdatecriterion
-- "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification."
--
DROP TABLE IF EXISTS `immunizationrecommendationdatecriterion`;
CREATE TABLE `immunizationrecommendationdatecriterion` (
 `value` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table fhirgroup
-- "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
--
DROP TABLE IF EXISTS `fhirgroup`;
CREATE TABLE `fhirgroup` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `active` BOOLEAN,
 `type` VARCHAR(1024),
 `actual` BOOLEAN,
 `name` VARCHAR(1024),
 `quantity` FLOAT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `code_id` VARCHAR(128),
 `characteristic_id` VARCHAR(128),
 `member_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table questionnaire
-- "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
--
DROP TABLE IF EXISTS `questionnaire`;
CREATE TABLE `questionnaire` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `approvalDate` VARCHAR(1024),
 `lastReviewDate` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `copyright` VARCHAR(16000),
 `subjectType` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `contact_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table codesystemproperty1
-- "A code system resource specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `codesystemproperty1`;
CREATE TABLE `codesystemproperty1` (
 `code` VARCHAR(1024),
 `valueCode` VARCHAR(1024),
 `valueString` VARCHAR(1024),
 `valueInteger` FLOAT,
 `valueBoolean` BOOLEAN,
 `valueDateTime` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `valuecoding_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contactdetail
-- "Specifies contact information for a person or organization."
--
DROP TABLE IF EXISTS `contactdetail`;
CREATE TABLE `contactdetail` (
 `name` VARCHAR(1024),
 `telecom` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table testreportoperation
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreportoperation`;
CREATE TABLE `testreportoperation` (
 `result` VARCHAR(1024),
 `message` VARCHAR(1024),
 `detail` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table conceptmaptarget
-- "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
--
DROP TABLE IF EXISTS `conceptmaptarget`;
CREATE TABLE `conceptmaptarget` (
 `code` VARCHAR(1024),
 `display` VARCHAR(1024),
 `equivalence` VARCHAR(1024),
 `comment` VARCHAR(16000),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `dependson_id` VARCHAR(128),
 `product_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table address
-- "An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world."
--
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
 `use` VARCHAR(1024),
 `type` VARCHAR(1024),
 `text` MEDIUMTEXT,
 `line` VARCHAR(1024),
 `city` VARCHAR(1024),
 `district` VARCHAR(1024),
 `state` VARCHAR(1024),
 `postalCode` VARCHAR(1024),
 `country` VARCHAR(1024),
 `period` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table adverseevent
-- "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death."
--
DROP TABLE IF EXISTS `adverseevent`;
CREATE TABLE `adverseevent` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `category` VARCHAR(1024),
 `date` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `reaction_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `seriousness_id` VARCHAR(128),
 `outcome_id` VARCHAR(128),
 `recorder_id` VARCHAR(128),
 `eventparticipant_id` VARCHAR(128),
 `suspectentity_id` VARCHAR(128),
 `subjectmedicalhistory_id` VARCHAR(128),
 `referencedocument_id` VARCHAR(128),
 `study_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementcertificate
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementcertificate`;
CREATE TABLE `capabilitystatementcertificate` (
 `type` VARCHAR(1024),
 `blob` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table devicecomponentproductionspecification
-- "The characteristics, operational status and capabilities of a medical-related component of a medical device."
--
DROP TABLE IF EXISTS `devicecomponentproductionspecification`;
CREATE TABLE `devicecomponentproductionspecification` (
 `componentId` MEDIUMTEXT,
 `productionSpec` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `spectype_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitprocessnote
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitprocessnote`;
CREATE TABLE `explanationofbenefitprocessnote` (
 `number` FLOAT,
 `text` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `language_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contract
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `issued` VARCHAR(1024),
 `applies` MEDIUMTEXT,
 `bindingAttachment` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `subject_id` VARCHAR(128),
 `topic_id` VARCHAR(128),
 `authority_id` VARCHAR(128),
 `domain_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `subtype_id` VARCHAR(128),
 `action_id` VARCHAR(128),
 `actionreason_id` VARCHAR(128),
 `decisiontype_id` VARCHAR(128),
 `contentderivative_id` VARCHAR(128),
 `securitylabel_id` VARCHAR(128),
 `agent_id` VARCHAR(128),
 `signer_id` VARCHAR(128),
 `valueditem_id` VARCHAR(128),
 `term_id` VARCHAR(128),
 `bindingreference_id` VARCHAR(128),
 `friendly_id` VARCHAR(128),
 `legal_id` VARCHAR(128),
 `rule_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table bodysite
-- "Record details about the anatomical location of a specimen or body part.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case."
--
DROP TABLE IF EXISTS `bodysite`;
CREATE TABLE `bodysite` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `active` BOOLEAN,
 `description` MEDIUMTEXT,
 `image` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `code_id` VARCHAR(128),
 `qualifier_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table locationposition
-- "Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated."
--
DROP TABLE IF EXISTS `locationposition`;
CREATE TABLE `locationposition` (
 `longitude` FLOAT,
 `latitude` FLOAT,
 `altitude` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table meta
-- "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
--
DROP TABLE IF EXISTS `meta`;
CREATE TABLE `meta` (
 `versionId` VARCHAR(1024),
 `lastUpdated` VARCHAR(1024),
 `profile` VARCHAR(1024),
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `security_id` VARCHAR(128),
 `tag_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table consentdata1
-- "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
--
DROP TABLE IF EXISTS `consentdata1`;
CREATE TABLE `consentdata1` (
 `meaning` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `reference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contractlegal
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contractlegal`;
CREATE TABLE `contractlegal` (
 `contentAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `contentreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationadministrationdosage
-- "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
--
DROP TABLE IF EXISTS `medicationadministrationdosage`;
CREATE TABLE `medicationadministrationdosage` (
 `text` MEDIUMTEXT,
 `rateRatio` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `site_id` VARCHAR(128),
 `route_id` VARCHAR(128),
 `method_id` VARCHAR(128),
 `dose_id` VARCHAR(128),
 `ratesimplequantity_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table compartmentdefinitionresource
-- "A compartment definition that defines how resources are accessed on a server."
--
DROP TABLE IF EXISTS `compartmentdefinitionresource`;
CREATE TABLE `compartmentdefinitionresource` (
 `code` VARCHAR(1024),
 `param` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table contractvalueditem
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contractvalueditem`;
CREATE TABLE `contractvalueditem` (
 `identifier` MEDIUMTEXT,
 `effectiveTime` VARCHAR(1024),
 `factor` FLOAT,
 `points` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `entitycodeableconcept_id` VARCHAR(128),
 `entityreference_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `unitprice_id` VARCHAR(128),
 `net_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table structuremaprule
-- "A Map of relationships between 2 structures that can be used to transform data."
--
DROP TABLE IF EXISTS `structuremaprule`;
CREATE TABLE `structuremaprule` (
 `name` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `source_id` VARCHAR(128),
 `target_id` VARCHAR(128),
 `rule_id` VARCHAR(128),
 `dependent_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table testreportsetup
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreportsetup`;
CREATE TABLE `testreportsetup` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `action_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table structuremaptarget
-- "A Map of relationships between 2 structures that can be used to transform data."
--
DROP TABLE IF EXISTS `structuremaptarget`;
CREATE TABLE `structuremaptarget` (
 `context` VARCHAR(1024),
 `contextType` VARCHAR(1024),
 `element` VARCHAR(1024),
 `variable` VARCHAR(1024),
 `listMode` VARCHAR(1024),
 `listRuleId` VARCHAR(1024),
 `transform` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `parameter_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table procedurefocaldevice
-- "An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy."
--
DROP TABLE IF EXISTS `procedurefocaldevice`;
CREATE TABLE `procedurefocaldevice` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `action_id` VARCHAR(128),
 `manipulated_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table healthcareservicenotavailable
-- "The details of a healthcare service available at a location."
--
DROP TABLE IF EXISTS `healthcareservicenotavailable`;
CREATE TABLE `healthcareservicenotavailable` (
 `description` MEDIUMTEXT,
 `during` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table valueset
-- "A value set specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `valueset`;
CREATE TABLE `valueset` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `immutable` BOOLEAN,
 `purpose` VARCHAR(1024),
 `copyright` VARCHAR(16000),
 `extensible` BOOLEAN,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `compose_id` VARCHAR(128),
 `expansion_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table messageheaderresponse
-- "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
--
DROP TABLE IF EXISTS `messageheaderresponse`;
CREATE TABLE `messageheaderresponse` (
 `identifier` VARCHAR(1024),
 `code` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `details_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table detectedissue
-- "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc."
--
DROP TABLE IF EXISTS `detectedissue`;
CREATE TABLE `detectedissue` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `severity` VARCHAR(1024),
 `date` VARCHAR(1024),
 `detail` VARCHAR(1024),
 `reference` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `category_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `implicated_id` VARCHAR(128),
 `mitigation_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementdocument
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementdocument`;
CREATE TABLE `capabilitystatementdocument` (
 `mode` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `profile_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table testreportaction1
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreportaction1`;
CREATE TABLE `testreportaction1` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `operation_id` VARCHAR(128),
 `fhirassert_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table money
-- "An amount of economic utility in some recognized currency."
--
DROP TABLE IF EXISTS `money`;
CREATE TABLE `money` (
 `value` FLOAT,
 `comparator` VARCHAR(1024),
 `unit` VARCHAR(1024),
 `system` VARCHAR(1024),
 `code` VARCHAR(1024),
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table provenance
-- "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
--
DROP TABLE IF EXISTS `provenance`;
CREATE TABLE `provenance` (
 `resourceType` VARCHAR(64) NOT NULL,
 `period` MEDIUMTEXT,
 `recorded` VARCHAR(1024),
 `policy` VARCHAR(1024),
 `signature` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `target_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `activity_id` VARCHAR(128),
 `agent_id` VARCHAR(128),
 `entity_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationrequest
-- "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
--
DROP TABLE IF EXISTS `medicationrequest`;
CREATE TABLE `medicationrequest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `groupIdentifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `intent` VARCHAR(1024),
 `priority` VARCHAR(1024),
 `authoredOn` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `medicationcodeableconcept_id` VARCHAR(128),
 `medicationreference_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `supportinginformation_id` VARCHAR(128),
 `requester_id` VARCHAR(128),
 `recorder_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `dosageinstruction_id` VARCHAR(128),
 `dispenserequest_id` VARCHAR(128),
 `substitution_id` VARCHAR(128),
 `priorprescription_id` VARCHAR(128),
 `detectedissue_id` VARCHAR(128),
 `eventhistory_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table linkageitem
-- "Identifies two or more records (resource instances) that are referring to the same real-world \"occurrence\"."
--
DROP TABLE IF EXISTS `linkageitem`;
CREATE TABLE `linkageitem` (
 `type` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `resource_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponseadditem
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponseadditem`;
CREATE TABLE `claimresponseadditem` (
 `sequenceLinkId` VARCHAR(1024),
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `fee_id` VARCHAR(128),
 `adjudication_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table plandefinitionrelatedaction
-- "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
--
DROP TABLE IF EXISTS `plandefinitionrelatedaction`;
CREATE TABLE `plandefinitionrelatedaction` (
 `actionId` VARCHAR(1024),
 `relationship` VARCHAR(1024),
 `offsetDuration` MEDIUMTEXT,
 `offsetRange` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table plandefinition
-- "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
--
DROP TABLE IF EXISTS `plandefinition`;
CREATE TABLE `plandefinition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `usage` VARCHAR(1024),
 `approvalDate` VARCHAR(1024),
 `lastReviewDate` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `copyright` VARCHAR(16000),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `topic_id` VARCHAR(128),
 `contributor_id` VARCHAR(128),
 `contact_id` VARCHAR(128),
 `relatedartifact_id` VARCHAR(128),
 `library_id` VARCHAR(128),
 `goal_id` VARCHAR(128),
 `action_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table distance
-- "A length - a value with a unit that is a physical distance."
--
DROP TABLE IF EXISTS `distance`;
CREATE TABLE `distance` (
 `value` FLOAT,
 `comparator` VARCHAR(1024),
 `unit` VARCHAR(1024),
 `system` VARCHAR(1024),
 `code` VARCHAR(1024),
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table imagingstudyinstance
-- "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
--
DROP TABLE IF EXISTS `imagingstudyinstance`;
CREATE TABLE `imagingstudyinstance` (
 `uid` VARCHAR(1024),
 `number` FLOAT,
 `sopClass` VARCHAR(1024),
 `title` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitdetail
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitdetail`;
CREATE TABLE `explanationofbenefitdetail` (
 `sequence` FLOAT,
 `factor` FLOAT,
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `programcode_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `unitprice_id` VARCHAR(128),
 `net_id` VARCHAR(128),
 `udi_id` VARCHAR(128),
 `adjudication_id` VARCHAR(128),
 `subdetail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contractterm
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contractterm`;
CREATE TABLE `contractterm` (
 `identifier` MEDIUMTEXT,
 `issued` VARCHAR(1024),
 `applies` MEDIUMTEXT,
 `text` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `subtype_id` VARCHAR(128),
 `topic_id` VARCHAR(128),
 `action_id` VARCHAR(128),
 `actionreason_id` VARCHAR(128),
 `securitylabel_id` VARCHAR(128),
 `agent_id` VARCHAR(128),
 `valueditem_id` VARCHAR(128),
 `group_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table expansionprofileexclude
-- "Resource to define constraints on the Expansion of a FHIR ValueSet."
--
DROP TABLE IF EXISTS `expansionprofileexclude`;
CREATE TABLE `expansionprofileexclude` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `designation_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponseinsurance
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponseinsurance`;
CREATE TABLE `claimresponseinsurance` (
 `sequence` FLOAT,
 `focal` BOOLEAN,
 `businessArrangement` VARCHAR(1024),
 `preAuthRef` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `coverage_id` VARCHAR(128),
 `claimresponse_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table dataelementmapping
-- "The formal description of a single piece of information that can be gathered and reported."
--
DROP TABLE IF EXISTS `dataelementmapping`;
CREATE TABLE `dataelementmapping` (
 `identity` VARCHAR(1024),
 `uri` VARCHAR(1024),
 `name` VARCHAR(1024),
 `comment` VARCHAR(16000),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table person
-- "Demographics and administrative information about a person independent of a specific health-related context."
--
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `name` MEDIUMTEXT,
 `telecom` MEDIUMTEXT,
 `gender` VARCHAR(1024),
 `birthDate` VARCHAR(1024),
 `photo` MEDIUMTEXT,
 `active` BOOLEAN,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `address_id` VARCHAR(128),
 `managingorganization_id` VARCHAR(128),
 `link_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table sequence
-- "Raw data describing a biological sequence."
--
DROP TABLE IF EXISTS `sequence`;
CREATE TABLE `sequence` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `type` VARCHAR(1024),
 `coordinateSystem` FLOAT,
 `observedSeq` VARCHAR(1024),
 `readCoverage` FLOAT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `patient_id` VARCHAR(128),
 `specimen_id` VARCHAR(128),
 `device_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `referenceseq_id` VARCHAR(128),
 `variant_id` VARCHAR(128),
 `quality_id` VARCHAR(128),
 `repository_id` VARCHAR(128),
 `pointer_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table devicerequest
-- "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker."
--
DROP TABLE IF EXISTS `devicerequest`;
CREATE TABLE `devicerequest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `groupIdentifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `priority` VARCHAR(1024),
 `occurrenceDateTime` VARCHAR(1024),
 `occurrencePeriod` MEDIUMTEXT,
 `occurrenceTiming` MEDIUMTEXT,
 `authoredOn` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `priorrequest_id` VARCHAR(128),
 `intent_id` VARCHAR(128),
 `codereference_id` VARCHAR(128),
 `codecodeableconcept_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `requester_id` VARCHAR(128),
 `performertype_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `supportinginfo_id` VARCHAR(128),
 `relevanthistory_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementinteraction1
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementinteraction1`;
CREATE TABLE `capabilitystatementinteraction1` (
 `code` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table graphdefinitioncompartment
-- "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
--
DROP TABLE IF EXISTS `graphdefinitioncompartment`;
CREATE TABLE `graphdefinitioncompartment` (
 `code` VARCHAR(1024),
 `rule` VARCHAR(1024),
 `expression` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefit
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefit`;
CREATE TABLE `explanationofbenefit` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `billablePeriod` MEDIUMTEXT,
 `created` VARCHAR(64),
 `disposition` VARCHAR(1024),
 `precedence` FLOAT,
 `employmentImpacted` MEDIUMTEXT,
 `hospitalization` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `subtype_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `enterer_id` VARCHAR(128),
 `insurer_id` VARCHAR(128),
 `provider_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 `referral_id` VARCHAR(128),
 `facility_id` VARCHAR(128),
 `claim_id` VARCHAR(128),
 `claimresponse_id` VARCHAR(128),
 `outcome_id` VARCHAR(128),
 `related_id` VARCHAR(128),
 `prescription_id` VARCHAR(128),
 `originalprescription_id` VARCHAR(128),
 `payee_id` VARCHAR(128),
 `information_id` VARCHAR(128),
 `careteam_id` VARCHAR(128),
 `diagnosis_id` VARCHAR(128),
 `procedure_id` VARCHAR(128),
 `insurance_id` VARCHAR(128),
 `accident_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 `additem_id` VARCHAR(128),
 `totalcost_id` VARCHAR(128),
 `unallocdeductable_id` VARCHAR(128),
 `totalbenefit_id` VARCHAR(128),
 `payment_id` VARCHAR(128),
 `form_id` VARCHAR(128),
 `processnote_id` VARCHAR(128),
 `benefitbalance_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table operationdefinitionbinding
-- "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
--
DROP TABLE IF EXISTS `operationdefinitionbinding`;
CREATE TABLE `operationdefinitionbinding` (
 `strength` VARCHAR(1024),
 `valueSetUri` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `valuesetreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table nutritionordersupplement
-- "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
--
DROP TABLE IF EXISTS `nutritionordersupplement`;
CREATE TABLE `nutritionordersupplement` (
 `productName` VARCHAR(1024),
 `schedule` MEDIUMTEXT,
 `instruction` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table bundle
-- "A container for a collection of resources."
--
DROP TABLE IF EXISTS `bundle`;
CREATE TABLE `bundle` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `type` VARCHAR(1024),
 `total` FLOAT,
 `signature` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `link_id` VARCHAR(128),
 `entry_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitadjudication
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitadjudication`;
CREATE TABLE `explanationofbenefitadjudication` (
 `value` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `category_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `amount_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measurereportpopulation
-- "The MeasureReport resource contains the results of evaluating a measure."
--
DROP TABLE IF EXISTS `measurereportpopulation`;
CREATE TABLE `measurereportpopulation` (
 `identifier` MEDIUMTEXT,
 `count` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `patients_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table documentreferencecontent
-- "A reference to a document."
--
DROP TABLE IF EXISTS `documentreferencecontent`;
CREATE TABLE `documentreferencecontent` (
 `attachment` MEDIUMTEXT NOT NULL,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `format_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table familymemberhistory
-- "Significant health events and conditions for a person related to the patient relevant in the context of care for the patient."
--
DROP TABLE IF EXISTS `familymemberhistory`;
CREATE TABLE `familymemberhistory` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `notDone` BOOLEAN,
 `date` VARCHAR(1024),
 `name` VARCHAR(1024),
 `gender` VARCHAR(1024),
 `bornPeriod` MEDIUMTEXT,
 `bornDate` VARCHAR(1024),
 `bornString` VARCHAR(1024),
 `ageAge` MEDIUMTEXT,
 `ageRange` MEDIUMTEXT,
 `ageString` VARCHAR(1024),
 `estimatedAge` BOOLEAN,
 `deceasedBoolean` BOOLEAN,
 `deceasedAge` MEDIUMTEXT,
 `deceasedRange` MEDIUMTEXT,
 `deceasedDate` VARCHAR(1024),
 `deceasedString` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `notdonereason_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `relationship_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `condition_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table diagnosticreportimage
-- "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
--
DROP TABLE IF EXISTS `diagnosticreportimage`;
CREATE TABLE `diagnosticreportimage` (
 `comment` VARCHAR(16000),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `link_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table plandefinitiongoal
-- "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
--
DROP TABLE IF EXISTS `plandefinitiongoal`;
CREATE TABLE `plandefinitiongoal` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `category_id` VARCHAR(128),
 `description_id` VARCHAR(128),
 `priority_id` VARCHAR(128),
 `start_id` VARCHAR(128),
 `addresses_id` VARCHAR(128),
 `documentation_id` VARCHAR(128),
 `target_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table eligibilityresponse
-- "This resource provides eligibility and plan details from the processing of an Eligibility resource."
--
DROP TABLE IF EXISTS `eligibilityresponse`;
CREATE TABLE `eligibilityresponse` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `created` VARCHAR(64),
 `disposition` VARCHAR(1024),
 `inforce` BOOLEAN,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `requestprovider_id` VARCHAR(128),
 `requestorganization_id` VARCHAR(128),
 `request_id` VARCHAR(128),
 `outcome_id` VARCHAR(128),
 `insurer_id` VARCHAR(128),
 `insurance_id` VARCHAR(128),
 `form_id` VARCHAR(128),
 `error_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table encounterdiagnosis
-- "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
--
DROP TABLE IF EXISTS `encounterdiagnosis`;
CREATE TABLE `encounterdiagnosis` (
 `rank` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `condition_id` VARCHAR(128),
 `role_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table expansionprofiledesignation2
-- "Resource to define constraints on the Expansion of a FHIR ValueSet."
--
DROP TABLE IF EXISTS `expansionprofiledesignation2`;
CREATE TABLE `expansionprofiledesignation2` (
 `language` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `use_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimrelated
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claimrelated`;
CREATE TABLE `claimrelated` (
 `reference` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `claim_id` VARCHAR(128),
 `relationship_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table immunization
-- "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
--
DROP TABLE IF EXISTS `immunization`;
CREATE TABLE `immunization` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `notGiven` BOOLEAN,
 `date` VARCHAR(1024),
 `primarySource` BOOLEAN,
 `lotNumber` VARCHAR(1024),
 `expirationDate` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `vaccinecode_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `encounter_id` VARCHAR(128),
 `reportorigin_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `manufacturer_id` VARCHAR(128),
 `site_id` VARCHAR(128),
 `route_id` VARCHAR(128),
 `dosequantity_id` VARCHAR(128),
 `practitioner_id` VARCHAR(128),
 `explanation_id` VARCHAR(128),
 `reaction_id` VARCHAR(128),
 `vaccinationprotocol_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contractagent
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contractagent`;
CREATE TABLE `contractagent` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `actor_id` VARCHAR(128),
 `role_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table careplanactivity
-- "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
--
DROP TABLE IF EXISTS `careplanactivity`;
CREATE TABLE `careplanactivity` (
 `progress` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `outcomecodeableconcept_id` VARCHAR(128),
 `outcomereference_id` VARCHAR(128),
 `reference_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table appointment
-- "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)."
--
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `priority` FLOAT,
 `description` MEDIUMTEXT,
 `start` VARCHAR(1024),
 `end` VARCHAR(1024),
 `minutesDuration` FLOAT,
 `created` VARCHAR(64),
 `comment` VARCHAR(16000),
 `requestedPeriod` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `servicecategory_id` VARCHAR(128),
 `servicetype_id` VARCHAR(128),
 `specialty_id` VARCHAR(128),
 `appointmenttype_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `indication_id` VARCHAR(128),
 `supportinginformation_id` VARCHAR(128),
 `slot_id` VARCHAR(128),
 `incomingreferral_id` VARCHAR(128),
 `participant_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contractagent1
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contractagent1`;
CREATE TABLE `contractagent1` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `actor_id` VARCHAR(128),
 `role_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table usagecontext
-- "Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care)."
--
DROP TABLE IF EXISTS `usagecontext`;
CREATE TABLE `usagecontext` (
 `valueRange` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `valuecodeableconcept_id` VARCHAR(128),
 `valuequantity_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table specimenprocessing
-- "A sample to be used for analysis."
--
DROP TABLE IF EXISTS `specimenprocessing`;
CREATE TABLE `specimenprocessing` (
 `description` MEDIUMTEXT,
 `timeDateTime` VARCHAR(1024),
 `timePeriod` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `procedure_id` VARCHAR(128),
 `additive_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table compartmentdefinition
-- "A compartment definition that defines how resources are accessed on a server."
--
DROP TABLE IF EXISTS `compartmentdefinition`;
CREATE TABLE `compartmentdefinition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `code` VARCHAR(1024),
 `search` BOOLEAN,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `resource_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table careplandetail
-- "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
--
DROP TABLE IF EXISTS `careplandetail`;
CREATE TABLE `careplandetail` (
 `status` VARCHAR(64),
 `statusReason` VARCHAR(1024),
 `prohibited` BOOLEAN,
 `scheduledTiming` MEDIUMTEXT,
 `scheduledPeriod` MEDIUMTEXT,
 `scheduledString` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `category_id` VARCHAR(128),
 `definition_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `goal_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `productcodeableconcept_id` VARCHAR(128),
 `productreference_id` VARCHAR(128),
 `dailyamount_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table questionnaireitem
-- "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
--
DROP TABLE IF EXISTS `questionnaireitem`;
CREATE TABLE `questionnaireitem` (
 `linkId` VARCHAR(1024),
 `definition` MEDIUMTEXT,
 `prefix` VARCHAR(1024),
 `text` MEDIUMTEXT,
 `type` VARCHAR(1024),
 `required` BOOLEAN,
 `repeats` BOOLEAN,
 `readOnly` BOOLEAN,
 `maxLength` FLOAT,
 `initialBoolean` BOOLEAN,
 `initialDecimal` FLOAT,
 `initialInteger` FLOAT,
 `initialDate` VARCHAR(1024),
 `initialDateTime` VARCHAR(1024),
 `initialTime` VARCHAR(1024),
 `initialString` VARCHAR(1024),
 `initialUri` VARCHAR(1024),
 `initialAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `enablewhen_id` VARCHAR(128),
 `options_id` VARCHAR(128),
 `option_id` VARCHAR(128),
 `initialcoding_id` VARCHAR(128),
 `initialquantity_id` VARCHAR(128),
 `initialreference_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table subscription
-- "The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system is able to take an appropriate action."
--
DROP TABLE IF EXISTS `subscription`;
CREATE TABLE `subscription` (
 `resourceType` VARCHAR(64) NOT NULL,
 `status` VARCHAR(64),
 `contact` MEDIUMTEXT,
 `end` VARCHAR(1024),
 `reason` VARCHAR(1024),
 `criteria` VARCHAR(1024),
 `error` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `channel_id` VARCHAR(128),
 `tag_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table careteam
-- "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient."
--
DROP TABLE IF EXISTS `careteam`;
CREATE TABLE `careteam` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `name` VARCHAR(1024),
 `period` MEDIUMTEXT,
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `category_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `participant_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `managingorganization_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table substanceingredient
-- "A homogeneous material with a definite composition."
--
DROP TABLE IF EXISTS `substanceingredient`;
CREATE TABLE `substanceingredient` (
 `quantity` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `substancecodeableconcept_id` VARCHAR(128),
 `substancereference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table procedurerequestrequester
-- "A record of a request for diagnostic investigations, treatments, or operations to be performed."
--
DROP TABLE IF EXISTS `procedurerequestrequester`;
CREATE TABLE `procedurerequestrequester` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `agent_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claim
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claim`;
CREATE TABLE `claim` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `use` VARCHAR(1024),
 `billablePeriod` MEDIUMTEXT,
 `created` VARCHAR(64),
 `employmentImpacted` MEDIUMTEXT,
 `hospitalization` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `subtype_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `enterer_id` VARCHAR(128),
 `insurer_id` VARCHAR(128),
 `provider_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 `priority_id` VARCHAR(128),
 `fundsreserve_id` VARCHAR(128),
 `related_id` VARCHAR(128),
 `prescription_id` VARCHAR(128),
 `originalprescription_id` VARCHAR(128),
 `payee_id` VARCHAR(128),
 `referral_id` VARCHAR(128),
 `facility_id` VARCHAR(128),
 `careteam_id` VARCHAR(128),
 `information_id` VARCHAR(128),
 `diagnosis_id` VARCHAR(128),
 `procedure_id` VARCHAR(128),
 `insurance_id` VARCHAR(128),
 `accident_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 `total_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table enrollmentrequest
-- "This resource provides the insurance enrollment details to the insurer regarding a specified coverage."
--
DROP TABLE IF EXISTS `enrollmentrequest`;
CREATE TABLE `enrollmentrequest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `created` VARCHAR(64),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `insurer_id` VARCHAR(128),
 `provider_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `coverage_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table searchparameter
-- "A search parameter that defines a named search item that can be used to search/filter on a resource."
--
DROP TABLE IF EXISTS `searchparameter`;
CREATE TABLE `searchparameter` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `purpose` VARCHAR(1024),
 `code` VARCHAR(1024),
 `base` VARCHAR(1024),
 `type` VARCHAR(1024),
 `derivedFrom` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `expression` VARCHAR(1024),
 `xpath` VARCHAR(1024),
 `xpathUsage` VARCHAR(1024),
 `target` VARCHAR(1024),
 `comparator` VARCHAR(1024),
 `modifier` VARCHAR(1024),
 `chain` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `component_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationdispensesubstitution
-- "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
--
DROP TABLE IF EXISTS `medicationdispensesubstitution`;
CREATE TABLE `medicationdispensesubstitution` (
 `wasSubstituted` BOOLEAN,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `responsibleparty_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table supplyrequestordereditem
-- "A record of a request for a medication, substance or device used in the healthcare setting."
--
DROP TABLE IF EXISTS `supplyrequestordereditem`;
CREATE TABLE `supplyrequestordereditem` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `quantity_id` VARCHAR(128),
 `itemcodeableconcept_id` VARCHAR(128),
 `itemreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table activitydefinition
-- "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context."
--
DROP TABLE IF EXISTS `activitydefinition`;
CREATE TABLE `activitydefinition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `usage` VARCHAR(1024),
 `approvalDate` VARCHAR(1024),
 `lastReviewDate` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `copyright` VARCHAR(16000),
 `kind` VARCHAR(1024),
 `timingTiming` MEDIUMTEXT,
 `timingDateTime` VARCHAR(1024),
 `timingPeriod` MEDIUMTEXT,
 `timingRange` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `topic_id` VARCHAR(128),
 `contributor_id` VARCHAR(128),
 `contact_id` VARCHAR(128),
 `relatedartifact_id` VARCHAR(128),
 `library_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `participant_id` VARCHAR(128),
 `productreference_id` VARCHAR(128),
 `productcodeableconcept_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `dosage_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `transform_id` VARCHAR(128),
 `dynamicvalue_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table valuesetparameter
-- "A value set specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `valuesetparameter`;
CREATE TABLE `valuesetparameter` (
 `name` VARCHAR(1024),
 `valueString` VARCHAR(1024),
 `valueBoolean` BOOLEAN,
 `valueInteger` FLOAT,
 `valueDecimal` FLOAT,
 `valueUri` VARCHAR(1024),
 `valueCode` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitpayee
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitpayee`;
CREATE TABLE `explanationofbenefitpayee` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `resourcetype_id` VARCHAR(128),
 `party_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table bundleentry
-- "A container for a collection of resources."
--
DROP TABLE IF EXISTS `bundleentry`;
CREATE TABLE `bundleentry` (
 `fullUrl` VARCHAR(1024),
 `resource` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `link_id` VARCHAR(128),
 `search_id` VARCHAR(128),
 `request_id` VARCHAR(128),
 `response_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table task
-- "A task to be performed."
--
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `definitionUri` VARCHAR(1024),
 `groupIdentifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `intent` VARCHAR(1024),
 `priority` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `executionPeriod` MEDIUMTEXT,
 `authoredOn` VARCHAR(1024),
 `lastModified` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `input` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definitionreference_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `statusreason_id` VARCHAR(128),
 `businessstatus_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `focus_id` VARCHAR(128),
 `fhirfor_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `requester_id` VARCHAR(128),
 `performertype_id` VARCHAR(128),
 `owner_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `relevanthistory_id` VARCHAR(128),
 `restriction_id` VARCHAR(128),
 `output_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementrest
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementrest`;
CREATE TABLE `capabilitystatementrest` (
 `mode` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `compartment` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `security_id` VARCHAR(128),
 `resource_id` VARCHAR(128),
 `interaction_id` VARCHAR(128),
 `searchparam_id` VARCHAR(128),
 `operation_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measurestratifier
-- "The Measure resource provides the definition of a quality measure."
--
DROP TABLE IF EXISTS `measurestratifier`;
CREATE TABLE `measurestratifier` (
 `identifier` MEDIUMTEXT,
 `criteria` VARCHAR(1024),
 `path` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table relatedperson
-- "Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process."
--
DROP TABLE IF EXISTS `relatedperson`;
CREATE TABLE `relatedperson` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `active` BOOLEAN,
 `name` MEDIUMTEXT,
 `telecom` MEDIUMTEXT,
 `gender` VARCHAR(1024),
 `birthDate` VARCHAR(1024),
 `photo` MEDIUMTEXT,
 `period` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `patient_id` VARCHAR(128),
 `relationship_id` VARCHAR(128),
 `address_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table relatedartifact
-- "Related artifacts such as additional documentation, justification, or bibliographic references."
--
DROP TABLE IF EXISTS `relatedartifact`;
CREATE TABLE `relatedartifact` (
 `type` VARCHAR(1024),
 `display` VARCHAR(1024),
 `citation` VARCHAR(1024),
 `url` VARCHAR(1024),
 `document` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `resource_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table guidanceresponse
-- "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken."
--
DROP TABLE IF EXISTS `guidanceresponse`;
CREATE TABLE `guidanceresponse` (
 `resourceType` VARCHAR(64) NOT NULL,
 `requestId` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `occurrenceDateTime` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `module_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `reasoncodeableconcept_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `evaluationmessage_id` VARCHAR(128),
 `outputparameters_id` VARCHAR(128),
 `result_id` VARCHAR(128),
 `datarequirement_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measuresupplementaldata
-- "The Measure resource provides the definition of a quality measure."
--
DROP TABLE IF EXISTS `measuresupplementaldata`;
CREATE TABLE `measuresupplementaldata` (
 `identifier` MEDIUMTEXT,
 `criteria` VARCHAR(1024),
 `path` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `usage_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementsearchparam
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementsearchparam`;
CREATE TABLE `capabilitystatementsearchparam` (
 `name` VARCHAR(1024),
 `definition` MEDIUMTEXT,
 `type` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table specimencollection
-- "A sample to be used for analysis."
--
DROP TABLE IF EXISTS `specimencollection`;
CREATE TABLE `specimencollection` (
 `collectedDateTime` VARCHAR(1024),
 `collectedPeriod` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `collector_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `method_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table compositionevent
-- "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
--
DROP TABLE IF EXISTS `compositionevent`;
CREATE TABLE `compositionevent` (
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitbenefitbalance
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitbenefitbalance`;
CREATE TABLE `explanationofbenefitbenefitbalance` (
 `excluded` BOOLEAN,
 `name` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `category_id` VARCHAR(128),
 `subcategory_id` VARCHAR(128),
 `network_id` VARCHAR(128),
 `unit_id` VARCHAR(128),
 `term_id` VARCHAR(128),
 `financial_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table searchparametercomponent
-- "A search parameter that defines a named search item that can be used to search/filter on a resource."
--
DROP TABLE IF EXISTS `searchparametercomponent`;
CREATE TABLE `searchparametercomponent` (
 `expression` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `definition_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table dataelement
-- "The formal description of a single piece of information that can be gathered and reported."
--
DROP TABLE IF EXISTS `dataelement`;
CREATE TABLE `dataelement` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `copyright` VARCHAR(16000),
 `stringency` VARCHAR(1024),
 `element` MEDIUMTEXT NOT NULL,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `mapping_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table expansionprofiledesignation1
-- "Resource to define constraints on the Expansion of a FHIR ValueSet."
--
DROP TABLE IF EXISTS `expansionprofiledesignation1`;
CREATE TABLE `expansionprofiledesignation1` (
 `language` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `use_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementsoftware
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementsoftware`;
CREATE TABLE `capabilitystatementsoftware` (
 `name` VARCHAR(1024),
 `version` VARCHAR(1024),
 `releaseDate` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table auditeventagent
-- "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
--
DROP TABLE IF EXISTS `auditeventagent`;
CREATE TABLE `auditeventagent` (
 `userId` MEDIUMTEXT,
 `altId` VARCHAR(1024),
 `name` VARCHAR(1024),
 `requestor` BOOLEAN,
 `policy` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 `reference_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `media_id` VARCHAR(128),
 `network_id` VARCHAR(128),
 `purposeofuse_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table valuesetdesignation
-- "A value set specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `valuesetdesignation`;
CREATE TABLE `valuesetdesignation` (
 `language` VARCHAR(1024),
 `value` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `use_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table requestgroupcondition
-- "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
--
DROP TABLE IF EXISTS `requestgroupcondition`;
CREATE TABLE `requestgroupcondition` (
 `kind` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `language` VARCHAR(1024),
 `expression` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table contractrule
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contractrule`;
CREATE TABLE `contractrule` (
 `contentAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `contentreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table quantity
-- "A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies."
--
DROP TABLE IF EXISTS `quantity`;
CREATE TABLE `quantity` (
 `value` FLOAT,
 `comparator` VARCHAR(1024),
 `unit` VARCHAR(1024),
 `system` VARCHAR(1024),
 `code` VARCHAR(1024),
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table supplydelivery
-- "Record of delivery of what is supplied."
--
DROP TABLE IF EXISTS `supplydelivery`;
CREATE TABLE `supplydelivery` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `occurrenceDateTime` VARCHAR(1024),
 `occurrencePeriod` MEDIUMTEXT,
 `occurrenceTiming` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `basedon_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `supplieditem_id` VARCHAR(128),
 `supplier_id` VARCHAR(128),
 `destination_id` VARCHAR(128),
 `receiver_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementresource
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementresource`;
CREATE TABLE `capabilitystatementresource` (
 `type` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `versioning` VARCHAR(1024),
 `readHistory` BOOLEAN,
 `updateCreate` BOOLEAN,
 `conditionalCreate` BOOLEAN,
 `conditionalRead` VARCHAR(1024),
 `conditionalUpdate` BOOLEAN,
 `conditionalDelete` VARCHAR(1024),
 `referencePolicy` VARCHAR(1024),
 `searchInclude` VARCHAR(1024),
 `searchRevInclude` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `profile_id` VARCHAR(128),
 `interaction_id` VARCHAR(128),
 `searchparam_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table substance
-- "A homogeneous material with a definite composition."
--
DROP TABLE IF EXISTS `substance`;
CREATE TABLE `substance` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `description` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `category_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `instance_id` VARCHAR(128),
 `ingredient_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table basic
-- "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification."
--
DROP TABLE IF EXISTS `basic`;
CREATE TABLE `basic` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `created` VARCHAR(64),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table namingsystemuniqueid
-- "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types."
--
DROP TABLE IF EXISTS `namingsystemuniqueid`;
CREATE TABLE `namingsystemuniqueid` (
 `type` VARCHAR(1024),
 `value` VARCHAR(1024),
 `preferred` BOOLEAN,
 `comment` VARCHAR(16000),
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table messagedefinition
-- "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted."
--
DROP TABLE IF EXISTS `messagedefinition`;
CREATE TABLE `messagedefinition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `copyright` VARCHAR(16000),
 `category` VARCHAR(1024),
 `responseRequired` BOOLEAN,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `base_id` VARCHAR(128),
 `parent_id` VARCHAR(128),
 `replaces_id` VARCHAR(128),
 `event_id` VARCHAR(128),
 `focus_id` VARCHAR(128),
 `allowedresponse_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementsupportedmessage
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementsupportedmessage`;
CREATE TABLE `capabilitystatementsupportedmessage` (
 `mode` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `definition_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table documentreferencecontext
-- "A reference to a document."
--
DROP TABLE IF EXISTS `documentreferencecontext`;
CREATE TABLE `documentreferencecontext` (
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `encounter_id` VARCHAR(128),
 `event_id` VARCHAR(128),
 `facilitytype_id` VARCHAR(128),
 `practicesetting_id` VARCHAR(128),
 `sourcepatientinfo_id` VARCHAR(128),
 `related_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table immunizationrecommendationprotocol
-- "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification."
--
DROP TABLE IF EXISTS `immunizationrecommendationprotocol`;
CREATE TABLE `immunizationrecommendationprotocol` (
 `doseSequence` FLOAT,
 `description` MEDIUMTEXT,
 `series` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `authority_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table consentactor1
-- "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
--
DROP TABLE IF EXISTS `consentactor1`;
CREATE TABLE `consentactor1` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 `reference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contributor
-- "A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers."
--
DROP TABLE IF EXISTS `contributor`;
CREATE TABLE `contributor` (
 `type` VARCHAR(1024),
 `name` VARCHAR(1024),
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `contact_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table valuesetexpansion
-- "A value set specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `valuesetexpansion`;
CREATE TABLE `valuesetexpansion` (
 `identifier` VARCHAR(1024),
 `timestamp` VARCHAR(1024),
 `total` FLOAT,
 `offset` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `parameter_id` VARCHAR(128),
 `contains_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table careplan
-- "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
--
DROP TABLE IF EXISTS `careplan`;
CREATE TABLE `careplan` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `intent` VARCHAR(1024),
 `title` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `period` MEDIUMTEXT,
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `replaces_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `careteam_id` VARCHAR(128),
 `addresses_id` VARCHAR(128),
 `supportinginfo_id` VARCHAR(128),
 `goal_id` VARCHAR(128),
 `activity_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table nutritionorderoraldiet
-- "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
--
DROP TABLE IF EXISTS `nutritionorderoraldiet`;
CREATE TABLE `nutritionorderoraldiet` (
 `schedule` MEDIUMTEXT,
 `instruction` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `nutrient_id` VARCHAR(128),
 `texture_id` VARCHAR(128),
 `fluidconsistencytype_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measurepopulation
-- "The Measure resource provides the definition of a quality measure."
--
DROP TABLE IF EXISTS `measurepopulation`;
CREATE TABLE `measurepopulation` (
 `identifier` MEDIUMTEXT,
 `name` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `criteria` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claiminsurance
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claiminsurance`;
CREATE TABLE `claiminsurance` (
 `sequence` FLOAT,
 `focal` BOOLEAN,
 `businessArrangement` VARCHAR(1024),
 `preAuthRef` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `coverage_id` VARCHAR(128),
 `claimresponse_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table nutritionorderenteralformula
-- "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
--
DROP TABLE IF EXISTS `nutritionorderenteralformula`;
CREATE TABLE `nutritionorderenteralformula` (
 `baseFormulaProductName` VARCHAR(1024),
 `additiveProductName` VARCHAR(1024),
 `administrationInstruction` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `baseformulatype_id` VARCHAR(128),
 `additivetype_id` VARCHAR(128),
 `caloricdensity_id` VARCHAR(128),
 `routeofadministration_id` VARCHAR(128),
 `administration_id` VARCHAR(128),
 `maxvolumetodeliver_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table fhirlist
-- "A set of information summarized from a list of other resources."
--
DROP TABLE IF EXISTS `fhirlist`;
CREATE TABLE `fhirlist` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `mode` VARCHAR(1024),
 `title` VARCHAR(1024),
 `date` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `encounter_id` VARCHAR(128),
 `source_id` VARCHAR(128),
 `orderedby_id` VARCHAR(128),
 `entry_id` VARCHAR(128),
 `emptyreason_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table plandefinitionaction
-- "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
--
DROP TABLE IF EXISTS `plandefinitionaction`;
CREATE TABLE `plandefinitionaction` (
 `label` VARCHAR(1024),
 `title` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `textEquivalent` VARCHAR(1024),
 `goalId` VARCHAR(1024),
 `timingDateTime` VARCHAR(1024),
 `timingPeriod` MEDIUMTEXT,
 `timingDuration` MEDIUMTEXT,
 `timingRange` MEDIUMTEXT,
 `timingTiming` MEDIUMTEXT,
 `groupingBehavior` VARCHAR(1024),
 `selectionBehavior` VARCHAR(1024),
 `requiredBehavior` VARCHAR(1024),
 `precheckBehavior` VARCHAR(1024),
 `cardinalityBehavior` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `documentation_id` VARCHAR(128),
 `triggerdefinition_id` VARCHAR(128),
 `condition_id` VARCHAR(128),
 `input_id` VARCHAR(128),
 `output_id` VARCHAR(128),
 `relatedaction_id` VARCHAR(128),
 `participant_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `definition_id` VARCHAR(128),
 `transform_id` VARCHAR(128),
 `dynamicvalue_id` VARCHAR(128),
 `action_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table allergyintolerance
-- "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance."
--
DROP TABLE IF EXISTS `allergyintolerance`;
CREATE TABLE `allergyintolerance` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `clinicalStatus` VARCHAR(1024),
 `verificationStatus` VARCHAR(1024),
 `type` VARCHAR(1024),
 `category` VARCHAR(1024),
 `criticality` VARCHAR(1024),
 `onsetDateTime` VARCHAR(1024),
 `onsetAge` MEDIUMTEXT,
 `onsetPeriod` MEDIUMTEXT,
 `onsetRange` MEDIUMTEXT,
 `onsetString` VARCHAR(1024),
 `assertedDate` VARCHAR(1024),
 `lastOccurrence` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `code_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `recorder_id` VARCHAR(128),
 `asserter_id` VARCHAR(128),
 `reaction_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table messageheader
-- "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
--
DROP TABLE IF EXISTS `messageheader`;
CREATE TABLE `messageheader` (
 `resourceType` VARCHAR(64) NOT NULL,
 `timestamp` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `event_id` VARCHAR(128),
 `destination_id` VARCHAR(128),
 `receiver_id` VARCHAR(128),
 `sender_id` VARCHAR(128),
 `enterer_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `source_id` VARCHAR(128),
 `responsible_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `response_id` VARCHAR(128),
 `focus_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table codeableconcept
-- "A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text."
--
DROP TABLE IF EXISTS `codeableconcept`;
CREATE TABLE `codeableconcept` (
 `text` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `coding_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table imagingmanifest
-- "A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection."
--
DROP TABLE IF EXISTS `imagingmanifest`;
CREATE TABLE `imagingmanifest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `authoringTime` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `patient_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `study_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table encounterclasshistory
-- "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
--
DROP TABLE IF EXISTS `encounterclasshistory`;
CREATE TABLE `encounterclasshistory` (
 `period` MEDIUMTEXT NOT NULL,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `fhirclass_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table communicationrequest
-- "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition."
--
DROP TABLE IF EXISTS `communicationrequest`;
CREATE TABLE `communicationrequest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `groupIdentifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `priority` VARCHAR(1024),
 `occurrenceDateTime` VARCHAR(1024),
 `occurrencePeriod` MEDIUMTEXT,
 `authoredOn` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `basedon_id` VARCHAR(128),
 `replaces_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `medium_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `recipient_id` VARCHAR(128),
 `topic_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `payload_id` VARCHAR(128),
 `sender_id` VARCHAR(128),
 `requester_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table paymentreconciliation
-- "This resource provides payment details and claim references supporting a bulk payment."
--
DROP TABLE IF EXISTS `paymentreconciliation`;
CREATE TABLE `paymentreconciliation` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `period` MEDIUMTEXT,
 `created` VARCHAR(64),
 `disposition` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `organization_id` VARCHAR(128),
 `request_id` VARCHAR(128),
 `outcome_id` VARCHAR(128),
 `requestprovider_id` VARCHAR(128),
 `requestorganization_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 `form_id` VARCHAR(128),
 `total_id` VARCHAR(128),
 `processnote_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table episodeofcare
-- "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time."
--
DROP TABLE IF EXISTS `episodeofcare`;
CREATE TABLE `episodeofcare` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `period` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `statushistory_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `diagnosis_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `managingorganization_id` VARCHAR(128),
 `referralrequest_id` VARCHAR(128),
 `caremanager_id` VARCHAR(128),
 `team_id` VARCHAR(128),
 `account_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationbatch
-- "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
--
DROP TABLE IF EXISTS `medicationbatch`;
CREATE TABLE `medicationbatch` (
 `lotNumber` VARCHAR(1024),
 `expirationDate` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table implementationguideglobal
-- "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
--
DROP TABLE IF EXISTS `implementationguideglobal`;
CREATE TABLE `implementationguideglobal` (
 `type` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `profile_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table codesystemfilter
-- "A code system resource specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `codesystemfilter`;
CREATE TABLE `codesystemfilter` (
 `code` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `operator` VARCHAR(1024),
 `value` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table valuesetconcept
-- "A value set specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `valuesetconcept`;
CREATE TABLE `valuesetconcept` (
 `code` VARCHAR(1024),
 `display` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `designation_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table compositionsection
-- "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
--
DROP TABLE IF EXISTS `compositionsection`;
CREATE TABLE `compositionsection` (
 `title` VARCHAR(1024),
 `mode` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `orderedby_id` VARCHAR(128),
 `entry_id` VARCHAR(128),
 `emptyreason_id` VARCHAR(128),
 `section_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationrequestrequester
-- "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
--
DROP TABLE IF EXISTS `medicationrequestrequester`;
CREATE TABLE `medicationrequestrequester` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `agent_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitinsurance
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitinsurance`;
CREATE TABLE `explanationofbenefitinsurance` (
 `preAuthRef` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `coverage_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table researchstudy
-- "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
--
DROP TABLE IF EXISTS `researchstudy`;
CREATE TABLE `researchstudy` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `description` MEDIUMTEXT,
 `period` MEDIUMTEXT,
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `protocol_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `focus_id` VARCHAR(128),
 `contact_id` VARCHAR(128),
 `relatedartifact_id` VARCHAR(128),
 `keyword_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `enrollment_id` VARCHAR(128),
 `sponsor_id` VARCHAR(128),
 `principalinvestigator_id` VARCHAR(128),
 `site_id` VARCHAR(128),
 `reasonstopped_id` VARCHAR(128),
 `arm_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table immunizationvaccinationprotocol
-- "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
--
DROP TABLE IF EXISTS `immunizationvaccinationprotocol`;
CREATE TABLE `immunizationvaccinationprotocol` (
 `doseSequence` FLOAT,
 `description` MEDIUMTEXT,
 `series` VARCHAR(1024),
 `seriesDoses` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `authority_id` VARCHAR(128),
 `targetdisease_id` VARCHAR(128),
 `dosestatus_id` VARCHAR(128),
 `dosestatusreason_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table requestgroup
-- "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
--
DROP TABLE IF EXISTS `requestgroup`;
CREATE TABLE `requestgroup` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `groupIdentifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `intent` VARCHAR(1024),
 `priority` VARCHAR(1024),
 `authoredOn` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `replaces_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `reasoncodeableconcept_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `action_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table datarequirementdatefilter
-- "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data."
--
DROP TABLE IF EXISTS `datarequirementdatefilter`;
CREATE TABLE `datarequirementdatefilter` (
 `path` VARCHAR(1024),
 `valueDateTime` VARCHAR(1024),
 `valuePeriod` MEDIUMTEXT,
 `valueDuration` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table organizationcontact
-- "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc."
--
DROP TABLE IF EXISTS `organizationcontact`;
CREATE TABLE `organizationcontact` (
 `name` MEDIUMTEXT,
 `telecom` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `purpose_id` VARCHAR(128),
 `address_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table testscript
-- "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
--
DROP TABLE IF EXISTS `testscript`;
CREATE TABLE `testscript` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `copyright` VARCHAR(16000),
 `origin` MEDIUMTEXT,
 `destination` MEDIUMTEXT,
 `metadata` MEDIUMTEXT,
 `fixture` MEDIUMTEXT,
 `variable` MEDIUMTEXT,
 `rule` MEDIUMTEXT,
 `ruleset` MEDIUMTEXT,
 `setup` MEDIUMTEXT,
 `test` MEDIUMTEXT,
 `teardown` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `profile_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table flag
-- "Prospective warnings of potential issues when providing care to the patient."
--
DROP TABLE IF EXISTS `flag`;
CREATE TABLE `flag` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `period` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `category_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `encounter_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitdetail1
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitdetail1`;
CREATE TABLE `explanationofbenefitdetail1` (
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `fee_id` VARCHAR(128),
 `adjudication_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table immunizationrecommendationrecommendation
-- "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification."
--
DROP TABLE IF EXISTS `immunizationrecommendationrecommendation`;
CREATE TABLE `immunizationrecommendationrecommendation` (
 `date` VARCHAR(1024),
 `doseNumber` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `vaccinecode_id` VARCHAR(128),
 `targetdisease_id` VARCHAR(128),
 `forecaststatus_id` VARCHAR(128),
 `datecriterion_id` VARCHAR(128),
 `protocol_id` VARCHAR(128),
 `supportingimmunization_id` VARCHAR(128),
 `supportingpatientinformation_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table dosage
-- "Indicates how the medication is/was taken or should be taken by the patient."
--
DROP TABLE IF EXISTS `dosage`;
CREATE TABLE `dosage` (
 `sequence` FLOAT,
 `text` MEDIUMTEXT,
 `patientInstruction` VARCHAR(1024),
 `timing` MEDIUMTEXT,
 `asNeededBoolean` BOOLEAN,
 `doseRange` MEDIUMTEXT,
 `maxDosePerPeriod` MEDIUMTEXT,
 `rateRatio` MEDIUMTEXT,
 `rateRange` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `additionalinstruction_id` VARCHAR(128),
 `asneededcodeableconcept_id` VARCHAR(128),
 `site_id` VARCHAR(128),
 `route_id` VARCHAR(128),
 `method_id` VARCHAR(128),
 `dosesimplequantity_id` VARCHAR(128),
 `maxdoseperadministration_id` VARCHAR(128),
 `maxdoseperlifetime_id` VARCHAR(128),
 `ratesimplequantity_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table questionnaireresponse
-- "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
--
DROP TABLE IF EXISTS `questionnaireresponse`;
CREATE TABLE `questionnaireresponse` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `authored` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `basedon_id` VARCHAR(128),
 `parent_id` VARCHAR(128),
 `questionnaire_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `source_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table structuremap
-- "A Map of relationships between 2 structures that can be used to transform data."
--
DROP TABLE IF EXISTS `structuremap`;
CREATE TABLE `structuremap` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `copyright` VARCHAR(16000),
 `FHIRimport` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `structure_id` VARCHAR(128),
 `group_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table auditeventdetail
-- "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
--
DROP TABLE IF EXISTS `auditeventdetail`;
CREATE TABLE `auditeventdetail` (
 `type` VARCHAR(1024),
 `value` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table messageheaderdestination
-- "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
--
DROP TABLE IF EXISTS `messageheaderdestination`;
CREATE TABLE `messageheaderdestination` (
 `name` VARCHAR(1024),
 `endpoint` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `target_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table imagingstudy
-- "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
--
DROP TABLE IF EXISTS `imagingstudy`;
CREATE TABLE `imagingstudy` (
 `resourceType` VARCHAR(64) NOT NULL,
 `uid` VARCHAR(1024),
 `accession` MEDIUMTEXT,
 `identifier` MEDIUMTEXT,
 `availability` VARCHAR(1024),
 `started` VARCHAR(1024),
 `numberOfSeries` FLOAT,
 `numberOfInstances` FLOAT,
 `description` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `modalitylist_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `referrer_id` VARCHAR(128),
 `interpreter_id` VARCHAR(128),
 `endpoint_id` VARCHAR(128),
 `procedurereference_id` VARCHAR(128),
 `procedurecode_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `series_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table researchsubject
-- "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
--
DROP TABLE IF EXISTS `researchsubject`;
CREATE TABLE `researchsubject` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `period` MEDIUMTEXT,
 `assignedArm` VARCHAR(1024),
 `actualArm` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `study_id` VARCHAR(128),
 `individual_id` VARCHAR(128),
 `consent_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table consentdata
-- "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
--
DROP TABLE IF EXISTS `consentdata`;
CREATE TABLE `consentdata` (
 `meaning` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `reference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table careteamparticipant
-- "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient."
--
DROP TABLE IF EXISTS `careteamparticipant`;
CREATE TABLE `careteamparticipant` (
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 `member_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table nutritionordernutrient
-- "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
--
DROP TABLE IF EXISTS `nutritionordernutrient`;
CREATE TABLE `nutritionordernutrient` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `modifier_id` VARCHAR(128),
 `amount_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table immunizationrecommendation
-- "A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification."
--
DROP TABLE IF EXISTS `immunizationrecommendation`;
CREATE TABLE `immunizationrecommendation` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `patient_id` VARCHAR(128),
 `recommendation_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table sequencerepository
-- "Raw data describing a biological sequence."
--
DROP TABLE IF EXISTS `sequencerepository`;
CREATE TABLE `sequencerepository` (
 `type` VARCHAR(1024),
 `url` VARCHAR(1024),
 `name` VARCHAR(1024),
 `datasetId` VARCHAR(1024),
 `variantsetId` VARCHAR(1024),
 `readsetId` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table implementationguideresource
-- "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
--
DROP TABLE IF EXISTS `implementationguideresource`;
CREATE TABLE `implementationguideresource` (
 `example` BOOLEAN,
 `name` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `acronym` VARCHAR(1024),
 `sourceUri` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `sourcereference_id` VARCHAR(128),
 `examplefor_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table procedurerequest
-- "A record of a request for diagnostic investigations, treatments, or operations to be performed."
--
DROP TABLE IF EXISTS `procedurerequest`;
CREATE TABLE `procedurerequest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `requisition` MEDIUMTEXT,
 `status` VARCHAR(64),
 `intent` VARCHAR(1024),
 `priority` VARCHAR(1024),
 `doNotPerform` BOOLEAN,
 `occurrenceDateTime` VARCHAR(1024),
 `occurrencePeriod` MEDIUMTEXT,
 `occurrenceTiming` MEDIUMTEXT,
 `asNeededBoolean` BOOLEAN,
 `authoredOn` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `replaces_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `asneededcodeableconcept_id` VARCHAR(128),
 `requester_id` VARCHAR(128),
 `performertype_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `supportinginfo_id` VARCHAR(128),
 `specimen_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `relevanthistory_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table devicecomponent
-- "The characteristics, operational status and capabilities of a medical-related component of a medical device."
--
DROP TABLE IF EXISTS `devicecomponent`;
CREATE TABLE `devicecomponent` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT NOT NULL,
 `lastSystemChange` VARCHAR(1024),
 `measurementPrinciple` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `source_id` VARCHAR(128),
 `parent_id` VARCHAR(128),
 `operationalstatus_id` VARCHAR(128),
 `parametergroup_id` VARCHAR(128),
 `productionspecification_id` VARCHAR(128),
 `languagecode_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table implementationguidedependency
-- "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
--
DROP TABLE IF EXISTS `implementationguidedependency`;
CREATE TABLE `implementationguidedependency` (
 `type` VARCHAR(1024),
 `uri` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table conceptmapelement
-- "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
--
DROP TABLE IF EXISTS `conceptmapelement`;
CREATE TABLE `conceptmapelement` (
 `code` VARCHAR(1024),
 `display` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `target_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table activitydefinitiondynamicvalue
-- "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context."
--
DROP TABLE IF EXISTS `activitydefinitiondynamicvalue`;
CREATE TABLE `activitydefinitiondynamicvalue` (
 `description` MEDIUMTEXT,
 `path` VARCHAR(1024),
 `language` VARCHAR(1024),
 `expression` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitdiagnosis
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitdiagnosis`;
CREATE TABLE `explanationofbenefitdiagnosis` (
 `sequence` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `diagnosiscodeableconcept_id` VARCHAR(128),
 `diagnosisreference_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `packagecode_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table codesystem
-- "A code system resource specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `codesystem`;
CREATE TABLE `codesystem` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `copyright` VARCHAR(16000),
 `caseSensitive` BOOLEAN,
 `valueSet` VARCHAR(1024),
 `hierarchyMeaning` VARCHAR(1024),
 `compositional` BOOLEAN,
 `versionNeeded` BOOLEAN,
 `content` MEDIUMTEXT,
 `count` FLOAT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `filter_id` VARCHAR(128),
 `property_id` VARCHAR(128),
 `concept_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table clinicalimpression
-- "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
--
DROP TABLE IF EXISTS `clinicalimpression`;
CREATE TABLE `clinicalimpression` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `description` MEDIUMTEXT,
 `effectiveDateTime` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `date` VARCHAR(1024),
 `protocol` VARCHAR(1024),
 `summary` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `assessor_id` VARCHAR(128),
 `previous_id` VARCHAR(128),
 `problem_id` VARCHAR(128),
 `investigation_id` VARCHAR(128),
 `finding_id` VARCHAR(128),
 `prognosiscodeableconcept_id` VARCHAR(128),
 `prognosisreference_id` VARCHAR(128),
 `action_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table structuremapsource
-- "A Map of relationships between 2 structures that can be used to transform data."
--
DROP TABLE IF EXISTS `structuremapsource`;
CREATE TABLE `structuremapsource` (
 `context` VARCHAR(1024),
 `min` FLOAT,
 `max` VARCHAR(1024),
 `type` VARCHAR(1024),
 `defaultValueBoolean` BOOLEAN,
 `defaultValueInteger` FLOAT,
 `defaultValueDecimal` FLOAT,
 `defaultValueBase64Binary` VARCHAR(1024),
 `defaultValueInstant` VARCHAR(1024),
 `defaultValueString` VARCHAR(1024),
 `defaultValueUri` VARCHAR(1024),
 `defaultValueDate` VARCHAR(1024),
 `defaultValueDateTime` VARCHAR(1024),
 `defaultValueTime` VARCHAR(1024),
 `defaultValueCode` VARCHAR(1024),
 `defaultValueOid` VARCHAR(1024),
 `defaultValueUuid` VARCHAR(1024),
 `defaultValueId` VARCHAR(1024),
 `defaultValueUnsignedInt` FLOAT,
 `defaultValuePositiveInt` FLOAT,
 `defaultValueMarkdown` VARCHAR(1024),
 `defaultValueElement` MEDIUMTEXT,
 `defaultValueExtension` MEDIUMTEXT,
 `defaultValueBackboneElement` MEDIUMTEXT,
 `defaultValueAnnotation` MEDIUMTEXT,
 `defaultValueAttachment` MEDIUMTEXT,
 `defaultValueIdentifier` MEDIUMTEXT,
 `defaultValueDuration` MEDIUMTEXT,
 `defaultValueCount` MEDIUMTEXT,
 `defaultValueAge` MEDIUMTEXT,
 `defaultValueRange` MEDIUMTEXT,
 `defaultValuePeriod` MEDIUMTEXT,
 `defaultValueRatio` MEDIUMTEXT,
 `defaultValueSampledData` MEDIUMTEXT,
 `defaultValueSignature` MEDIUMTEXT,
 `defaultValueHumanName` MEDIUMTEXT,
 `defaultValueContactPoint` MEDIUMTEXT,
 `defaultValueTiming` MEDIUMTEXT,
 `defaultValueElementDefinition` MEDIUMTEXT,
 `defaultValueParameterDefinition` MEDIUMTEXT,
 `element` VARCHAR(1024),
 `listMode` VARCHAR(1024),
 `variable` VARCHAR(1024),
 `condition` VARCHAR(1024),
 `check` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `defaultvaluenarrative_id` VARCHAR(128),
 `defaultvaluecodeableconcept_id` VARCHAR(128),
 `defaultvaluecoding_id` VARCHAR(128),
 `defaultvaluequantity_id` VARCHAR(128),
 `defaultvaluesimplequantity_id` VARCHAR(128),
 `defaultvaluedistance_id` VARCHAR(128),
 `defaultvaluemoney_id` VARCHAR(128),
 `defaultvaluereference_id` VARCHAR(128),
 `defaultvalueaddress_id` VARCHAR(128),
 `defaultvaluemeta_id` VARCHAR(128),
 `defaultvaluecontactdetail_id` VARCHAR(128),
 `defaultvaluecontributor_id` VARCHAR(128),
 `defaultvaluedosage_id` VARCHAR(128),
 `defaultvaluerelatedartifact_id` VARCHAR(128),
 `defaultvalueusagecontext_id` VARCHAR(128),
 `defaultvaluedatarequirement_id` VARCHAR(128),
 `defaultvaluetriggerdefinition_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table practitionerrole
-- "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time."
--
DROP TABLE IF EXISTS `practitionerrole`;
CREATE TABLE `practitionerrole` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `active` BOOLEAN,
 `period` MEDIUMTEXT,
 `telecom` MEDIUMTEXT,
 `availabilityExceptions` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `practitioner_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `specialty_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `healthcareservice_id` VARCHAR(128),
 `availabletime_id` VARCHAR(128),
 `notavailable_id` VARCHAR(128),
 `endpoint_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table questionnaireresponseanswer
-- "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
--
DROP TABLE IF EXISTS `questionnaireresponseanswer`;
CREATE TABLE `questionnaireresponseanswer` (
 `valueBoolean` BOOLEAN,
 `valueDecimal` FLOAT,
 `valueInteger` FLOAT,
 `valueDate` VARCHAR(1024),
 `valueDateTime` VARCHAR(1024),
 `valueTime` VARCHAR(1024),
 `valueString` VARCHAR(1024),
 `valueUri` VARCHAR(1024),
 `valueAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `valuecoding_id` VARCHAR(128),
 `valuequantity_id` VARCHAR(128),
 `valuereference_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table implementationguidepackage
-- "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
--
DROP TABLE IF EXISTS `implementationguidepackage`;
CREATE TABLE `implementationguidepackage` (
 `name` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `resource_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table observationcomponent
-- "Measurements and simple assertions made about a patient, device or other subject."
--
DROP TABLE IF EXISTS `observationcomponent`;
CREATE TABLE `observationcomponent` (
 `valueString` VARCHAR(1024),
 `valueRange` MEDIUMTEXT,
 `valueRatio` MEDIUMTEXT,
 `valueSampledData` MEDIUMTEXT,
 `valueAttachment` MEDIUMTEXT,
 `valueTime` VARCHAR(1024),
 `valueDateTime` VARCHAR(1024),
 `valuePeriod` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `valuequantity_id` VARCHAR(128),
 `valuecodeableconcept_id` VARCHAR(128),
 `dataabsentreason_id` VARCHAR(128),
 `interpretation_id` VARCHAR(128),
 `referencerange_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table documentreference
-- "A reference to a document."
--
DROP TABLE IF EXISTS `documentreference`;
CREATE TABLE `documentreference` (
 `resourceType` VARCHAR(64) NOT NULL,
 `masterIdentifier` MEDIUMTEXT,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `docStatus` VARCHAR(1024),
 `created` VARCHAR(64),
 `indexed` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `fhirclass_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `authenticator_id` VARCHAR(128),
 `custodian_id` VARCHAR(128),
 `relatesto_id` VARCHAR(128),
 `securitylabel_id` VARCHAR(128),
 `content_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table appointmentresponse
-- "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection."
--
DROP TABLE IF EXISTS `appointmentresponse`;
CREATE TABLE `appointmentresponse` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `start` VARCHAR(1024),
 `end` VARCHAR(1024),
 `participantStatus` VARCHAR(1024),
 `comment` VARCHAR(16000),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `appointment_id` VARCHAR(128),
 `participanttype_id` VARCHAR(128),
 `actor_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponseerror
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponseerror`;
CREATE TABLE `claimresponseerror` (
 `sequenceLinkId` FLOAT,
 `detailSequenceLinkId` FLOAT,
 `subdetailSequenceLinkId` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table timingrepeat
-- "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out."
--
DROP TABLE IF EXISTS `timingrepeat`;
CREATE TABLE `timingrepeat` (
 `boundsDuration` MEDIUMTEXT,
 `boundsRange` MEDIUMTEXT,
 `boundsPeriod` MEDIUMTEXT,
 `count` FLOAT,
 `countMax` FLOAT,
 `duration` FLOAT,
 `durationMax` FLOAT,
 `durationUnit` VARCHAR(1024),
 `frequency` FLOAT,
 `frequencyMax` FLOAT,
 `period` FLOAT,
 `periodMax` FLOAT,
 `periodUnit` VARCHAR(1024),
 `dayOfWeek` VARCHAR(1024),
 `timeOfDay` VARCHAR(1024),
 `when` VARCHAR(1024),
 `offset` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefititem
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefititem`;
CREATE TABLE `explanationofbenefititem` (
 `sequence` FLOAT,
 `careTeamLinkId` VARCHAR(1024),
 `diagnosisLinkId` VARCHAR(1024),
 `procedureLinkId` VARCHAR(1024),
 `informationLinkId` VARCHAR(1024),
 `servicedDate` VARCHAR(1024),
 `servicedPeriod` MEDIUMTEXT,
 `factor` FLOAT,
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `programcode_id` VARCHAR(128),
 `locationcodeableconcept_id` VARCHAR(128),
 `locationaddress_id` VARCHAR(128),
 `locationreference_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `unitprice_id` VARCHAR(128),
 `net_id` VARCHAR(128),
 `udi_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `subsite_id` VARCHAR(128),
 `encounter_id` VARCHAR(128),
 `adjudication_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table auditeventnetwork
-- "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
--
DROP TABLE IF EXISTS `auditeventnetwork`;
CREATE TABLE `auditeventnetwork` (
 `address` VARCHAR(1024),
 `type` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table plandefinitiontarget
-- "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
--
DROP TABLE IF EXISTS `plandefinitiontarget`;
CREATE TABLE `plandefinitiontarget` (
 `detailRange` MEDIUMTEXT,
 `due` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `measure_id` VARCHAR(128),
 `detailquantity_id` VARCHAR(128),
 `detailcodeableconcept_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table documentmanifestrelated
-- "A collection of documents compiled for a purpose together with metadata that applies to the collection."
--
DROP TABLE IF EXISTS `documentmanifestrelated`;
CREATE TABLE `documentmanifestrelated` (
 `identifier` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `ref_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table endpoint
-- "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information."
--
DROP TABLE IF EXISTS `endpoint`;
CREATE TABLE `endpoint` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `name` VARCHAR(1024),
 `contact` MEDIUMTEXT,
 `period` MEDIUMTEXT,
 `payloadMimeType` VARCHAR(1024),
 `address` VARCHAR(1024),
 `header` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `connectiontype_id` VARCHAR(128),
 `managingorganization_id` VARCHAR(128),
 `payloadtype_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table devicemetriccalibration
-- "Describes a measurement, calculation or setting capability of a medical device."
--
DROP TABLE IF EXISTS `devicemetriccalibration`;
CREATE TABLE `devicemetriccalibration` (
 `type` VARCHAR(1024),
 `state` VARCHAR(1024),
 `time` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table coveragegrouping
-- "Financial instrument which may be used to reimburse or pay for health care products and services."
--
DROP TABLE IF EXISTS `coveragegrouping`;
CREATE TABLE `coveragegrouping` (
 `group` VARCHAR(1024),
 `groupDisplay` VARCHAR(1024),
 `subGroup` VARCHAR(1024),
 `subGroupDisplay` VARCHAR(1024),
 `plan` VARCHAR(1024),
 `planDisplay` VARCHAR(1024),
 `subPlan` VARCHAR(1024),
 `subPlanDisplay` VARCHAR(1024),
 `FHIRclass` VARCHAR(1024),
 `classDisplay` VARCHAR(1024),
 `subClass` VARCHAR(1024),
 `subClassDisplay` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table conceptmap
-- "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
--
DROP TABLE IF EXISTS `conceptmap`;
CREATE TABLE `conceptmap` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `copyright` VARCHAR(16000),
 `sourceUri` VARCHAR(1024),
 `targetUri` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `sourcereference_id` VARCHAR(128),
 `targetreference_id` VARCHAR(128),
 `group_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table account
-- "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc."
--
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `name` VARCHAR(1024),
 `period` MEDIUMTEXT,
 `active` MEDIUMTEXT,
 `description` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `balance_id` VARCHAR(128),
 `coverage_id` VARCHAR(128),
 `owner_id` VARCHAR(128),
 `guarantor_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table consent
-- "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
--
DROP TABLE IF EXISTS `consent`;
CREATE TABLE `consent` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `period` MEDIUMTEXT,
 `dateTime` VARCHAR(1024),
 `sourceAttachment` MEDIUMTEXT,
 `sourceIdentifier` MEDIUMTEXT,
 `policyRule` VARCHAR(1024),
 `dataPeriod` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `category_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `consentingparty_id` VARCHAR(128),
 `actor_id` VARCHAR(128),
 `action_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 `sourcereference_id` VARCHAR(128),
 `policy_id` VARCHAR(128),
 `securitylabel_id` VARCHAR(128),
 `purpose_id` VARCHAR(128),
 `data_id` VARCHAR(128),
 `except_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationadministrationperformer
-- "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
--
DROP TABLE IF EXISTS `medicationadministrationperformer`;
CREATE TABLE `medicationadministrationperformer` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `actor_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table supplyrequest
-- "A record of a request for a medication, substance or device used in the healthcare setting."
--
DROP TABLE IF EXISTS `supplyrequest`;
CREATE TABLE `supplyrequest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `priority` VARCHAR(1024),
 `occurrenceDateTime` VARCHAR(1024),
 `occurrencePeriod` MEDIUMTEXT,
 `occurrenceTiming` MEDIUMTEXT,
 `authoredOn` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `category_id` VARCHAR(128),
 `ordereditem_id` VARCHAR(128),
 `requester_id` VARCHAR(128),
 `supplier_id` VARCHAR(128),
 `reasoncodeableconcept_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `deliverfrom_id` VARCHAR(128),
 `deliverto_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contractvalueditem1
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contractvalueditem1`;
CREATE TABLE `contractvalueditem1` (
 `identifier` MEDIUMTEXT,
 `effectiveTime` VARCHAR(1024),
 `factor` FLOAT,
 `points` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `entitycodeableconcept_id` VARCHAR(128),
 `entityreference_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `unitprice_id` VARCHAR(128),
 `net_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table nutritionorderadministration
-- "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
--
DROP TABLE IF EXISTS `nutritionorderadministration`;
CREATE TABLE `nutritionorderadministration` (
 `schedule` MEDIUMTEXT,
 `rateRatio` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `quantity_id` VARCHAR(128),
 `ratesimplequantity_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table immunizationexplanation
-- "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
--
DROP TABLE IF EXISTS `immunizationexplanation`;
CREATE TABLE `immunizationexplanation` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `reason_id` VARCHAR(128),
 `reasonnotgiven_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table expansionprofilefixedversion
-- "Resource to define constraints on the Expansion of a FHIR ValueSet."
--
DROP TABLE IF EXISTS `expansionprofilefixedversion`;
CREATE TABLE `expansionprofilefixedversion` (
 `system` VARCHAR(1024),
 `version` VARCHAR(1024),
 `mode` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponsepayment
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponsepayment`;
CREATE TABLE `claimresponsepayment` (
 `date` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `adjustment_id` VARCHAR(128),
 `adjustmentreason_id` VARCHAR(128),
 `amount_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table graphdefinitiontarget
-- "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
--
DROP TABLE IF EXISTS `graphdefinitiontarget`;
CREATE TABLE `graphdefinitiontarget` (
 `type` VARCHAR(1024),
 `profile` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `compartment_id` VARCHAR(128),
 `link_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table supplyrequestrequester
-- "A record of a request for a medication, substance or device used in the healthcare setting."
--
DROP TABLE IF EXISTS `supplyrequestrequester`;
CREATE TABLE `supplyrequestrequester` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `agent_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table taskrestriction
-- "A task to be performed."
--
DROP TABLE IF EXISTS `taskrestriction`;
CREATE TABLE `taskrestriction` (
 `repetitions` FLOAT,
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `recipient_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table deviceusestatement
-- "A record of a device being used by a patient where the record is the result of a report from the patient or another clinician."
--
DROP TABLE IF EXISTS `deviceusestatement`;
CREATE TABLE `deviceusestatement` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `whenUsed` MEDIUMTEXT,
 `timingTiming` MEDIUMTEXT,
 `timingPeriod` MEDIUMTEXT,
 `timingDateTime` VARCHAR(1024),
 `recordedOn` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `subject_id` VARCHAR(128),
 `source_id` VARCHAR(128),
 `device_id` VARCHAR(128),
 `indication_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table patientcommunication
-- "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
--
DROP TABLE IF EXISTS `patientcommunication`;
CREATE TABLE `patientcommunication` (
 `preferred` BOOLEAN,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `language_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table practitionerqualification
-- "A person who is directly or indirectly involved in the provisioning of healthcare."
--
DROP TABLE IF EXISTS `practitionerqualification`;
CREATE TABLE `practitionerqualification` (
 `identifier` MEDIUMTEXT,
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `issuer_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table fhirprocedure
-- "An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy."
--
DROP TABLE IF EXISTS `fhirprocedure`;
CREATE TABLE `fhirprocedure` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `notDone` BOOLEAN,
 `performedDateTime` VARCHAR(1024),
 `performedPeriod` MEDIUMTEXT,
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `notdonereason_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `outcome_id` VARCHAR(128),
 `report_id` VARCHAR(128),
 `complication_id` VARCHAR(128),
 `complicationdetail_id` VARCHAR(128),
 `followup_id` VARCHAR(128),
 `focaldevice_id` VARCHAR(128),
 `usedreference_id` VARCHAR(128),
 `usedcode_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table operationdefinition
-- "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
--
DROP TABLE IF EXISTS `operationdefinition`;
CREATE TABLE `operationdefinition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `status` VARCHAR(64),
 `kind` VARCHAR(1024),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `idempotent` BOOLEAN,
 `code` VARCHAR(1024),
 `comment` VARCHAR(16000),
 `resource` VARCHAR(1024),
 `system` BOOLEAN,
 `type` BOOLEAN,
 `instance` BOOLEAN,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `base_id` VARCHAR(128),
 `parameter_id` VARCHAR(128),
 `overload_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table questionnaireoption
-- "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
--
DROP TABLE IF EXISTS `questionnaireoption`;
CREATE TABLE `questionnaireoption` (
 `valueInteger` FLOAT,
 `valueDate` VARCHAR(1024),
 `valueTime` VARCHAR(1024),
 `valueString` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `valuecoding_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table documentmanifest
-- "A collection of documents compiled for a purpose together with metadata that applies to the collection."
--
DROP TABLE IF EXISTS `documentmanifest`;
CREATE TABLE `documentmanifest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `masterIdentifier` MEDIUMTEXT,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `created` VARCHAR(64),
 `source` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `recipient_id` VARCHAR(128),
 `content_id` VARCHAR(128),
 `related_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table visionprescriptiondispense
-- "An authorization for the supply of glasses and/or contact lenses to a patient."
--
DROP TABLE IF EXISTS `visionprescriptiondispense`;
CREATE TABLE `visionprescriptiondispense` (
 `eye` VARCHAR(1024),
 `sphere` FLOAT,
 `cylinder` FLOAT,
 `axis` FLOAT,
 `prism` FLOAT,
 `base` VARCHAR(1024),
 `add` FLOAT,
 `power` FLOAT,
 `backCurve` FLOAT,
 `diameter` FLOAT,
 `color` VARCHAR(1024),
 `brand` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `product_id` VARCHAR(128),
 `duration_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measurereportgroup
-- "The MeasureReport resource contains the results of evaluating a measure."
--
DROP TABLE IF EXISTS `measurereportgroup`;
CREATE TABLE `measurereportgroup` (
 `identifier` MEDIUMTEXT NOT NULL,
 `measureScore` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `population_id` VARCHAR(128),
 `stratifier_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table riskassessment
-- "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
--
DROP TABLE IF EXISTS `riskassessment`;
CREATE TABLE `riskassessment` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `occurrenceDateTime` VARCHAR(1024),
 `occurrencePeriod` MEDIUMTEXT,
 `mitigation` VARCHAR(1024),
 `comment` VARCHAR(16000),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `basedon_id` VARCHAR(128),
 `parent_id` VARCHAR(128),
 `method_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `condition_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `reasoncodeableconcept_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `basis_id` VARCHAR(128),
 `prediction_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitaccident
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitaccident`;
CREATE TABLE `explanationofbenefitaccident` (
 `date` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `locationaddress_id` VARCHAR(128),
 `locationreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationcontent
-- "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
--
DROP TABLE IF EXISTS `medicationcontent`;
CREATE TABLE `medicationcontent` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `itemcodeableconcept_id` VARCHAR(128),
 `itemreference_id` VARCHAR(128),
 `amount_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table compositionrelatesto
-- "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
--
DROP TABLE IF EXISTS `compositionrelatesto`;
CREATE TABLE `compositionrelatesto` (
 `code` VARCHAR(1024),
 `targetIdentifier` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `targetreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table implementationguide
-- "A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts."
--
DROP TABLE IF EXISTS `implementationguide`;
CREATE TABLE `implementationguide` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `copyright` VARCHAR(16000),
 `fhirVersion` VARCHAR(1024),
 `binary` VARCHAR(1024),
 `page` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `dependency_id` VARCHAR(128),
 `fhirpackage_id` VARCHAR(128),
 `global_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table eligibilityresponsefinancial
-- "This resource provides eligibility and plan details from the processing of an Eligibility resource."
--
DROP TABLE IF EXISTS `eligibilityresponsefinancial`;
CREATE TABLE `eligibilityresponsefinancial` (
 `allowedUnsignedInt` FLOAT,
 `allowedString` VARCHAR(1024),
 `usedUnsignedInt` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `allowedmoney_id` VARCHAR(128),
 `usedmoney_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table supplydeliverysupplieditem
-- "Record of delivery of what is supplied."
--
DROP TABLE IF EXISTS `supplydeliverysupplieditem`;
CREATE TABLE `supplydeliverysupplieditem` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `quantity_id` VARCHAR(128),
 `itemcodeableconcept_id` VARCHAR(128),
 `itemreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table media
-- "A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference."
--
DROP TABLE IF EXISTS `media`;
CREATE TABLE `media` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `type` VARCHAR(1024),
 `occurrenceDateTime` VARCHAR(1024),
 `occurrencePeriod` MEDIUMTEXT,
 `height` FLOAT,
 `width` FLOAT,
 `frames` FLOAT,
 `duration` FLOAT,
 `content` MEDIUMTEXT NOT NULL,
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `basedon_id` VARCHAR(128),
 `subtype_id` VARCHAR(128),
 `view_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `operator_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `device_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table graphdefinitionlink
-- "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
--
DROP TABLE IF EXISTS `graphdefinitionlink`;
CREATE TABLE `graphdefinitionlink` (
 `path` VARCHAR(1024),
 `sliceName` VARCHAR(1024),
 `min` FLOAT,
 `max` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `target_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table immunizationreaction
-- "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
--
DROP TABLE IF EXISTS `immunizationreaction`;
CREATE TABLE `immunizationreaction` (
 `date` VARCHAR(1024),
 `reported` BOOLEAN,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponsedetail1
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponsedetail1`;
CREATE TABLE `claimresponsedetail1` (
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `fee_id` VARCHAR(128),
 `adjudication_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table parametersparameter
-- "This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it."
--
DROP TABLE IF EXISTS `parametersparameter`;
CREATE TABLE `parametersparameter` (
 `name` VARCHAR(1024),
 `valueBoolean` BOOLEAN,
 `valueInteger` FLOAT,
 `valueDecimal` FLOAT,
 `valueBase64Binary` VARCHAR(1024),
 `valueInstant` VARCHAR(1024),
 `valueString` VARCHAR(1024),
 `valueUri` VARCHAR(1024),
 `valueDate` VARCHAR(1024),
 `valueDateTime` VARCHAR(1024),
 `valueTime` VARCHAR(1024),
 `valueCode` VARCHAR(1024),
 `valueOid` VARCHAR(1024),
 `valueUuid` VARCHAR(1024),
 `valueId` VARCHAR(1024),
 `valueUnsignedInt` FLOAT,
 `valuePositiveInt` FLOAT,
 `valueMarkdown` VARCHAR(1024),
 `valueElement` MEDIUMTEXT,
 `valueExtension` MEDIUMTEXT,
 `valueBackboneElement` MEDIUMTEXT,
 `valueAnnotation` MEDIUMTEXT,
 `valueAttachment` MEDIUMTEXT,
 `valueIdentifier` MEDIUMTEXT,
 `valueDuration` MEDIUMTEXT,
 `valueCount` MEDIUMTEXT,
 `valueAge` MEDIUMTEXT,
 `valueRange` MEDIUMTEXT,
 `valuePeriod` MEDIUMTEXT,
 `valueRatio` MEDIUMTEXT,
 `valueSampledData` MEDIUMTEXT,
 `valueSignature` MEDIUMTEXT,
 `valueHumanName` MEDIUMTEXT,
 `valueContactPoint` MEDIUMTEXT,
 `valueTiming` MEDIUMTEXT,
 `valueElementDefinition` MEDIUMTEXT,
 `valueParameterDefinition` MEDIUMTEXT,
 `resource` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `valuenarrative_id` VARCHAR(128),
 `valuecodeableconcept_id` VARCHAR(128),
 `valuecoding_id` VARCHAR(128),
 `valuequantity_id` VARCHAR(128),
 `valuesimplequantity_id` VARCHAR(128),
 `valuedistance_id` VARCHAR(128),
 `valuemoney_id` VARCHAR(128),
 `valuereference_id` VARCHAR(128),
 `valueaddress_id` VARCHAR(128),
 `valuemeta_id` VARCHAR(128),
 `valuecontactdetail_id` VARCHAR(128),
 `valuecontributor_id` VARCHAR(128),
 `valuedosage_id` VARCHAR(128),
 `valuerelatedartifact_id` VARCHAR(128),
 `valueusagecontext_id` VARCHAR(128),
 `valuedatarequirement_id` VARCHAR(128),
 `valuetriggerdefinition_id` VARCHAR(128),
 `part_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table observationreferencerange
-- "Measurements and simple assertions made about a patient, device or other subject."
--
DROP TABLE IF EXISTS `observationreferencerange`;
CREATE TABLE `observationreferencerange` (
 `age` MEDIUMTEXT,
 `text` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `low_id` VARCHAR(128),
 `high_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `appliesto_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table diagnosticreportperformer
-- "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
--
DROP TABLE IF EXISTS `diagnosticreportperformer`;
CREATE TABLE `diagnosticreportperformer` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 `actor_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table devicerequestrequester
-- "Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker."
--
DROP TABLE IF EXISTS `devicerequestrequester`;
CREATE TABLE `devicerequestrequester` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `agent_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table resource
-- "This is the base resource type for everything."
--
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementendpoint
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementendpoint`;
CREATE TABLE `capabilitystatementendpoint` (
 `address` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `protocol_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table patientlink
-- "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
--
DROP TABLE IF EXISTS `patientlink`;
CREATE TABLE `patientlink` (
 `type` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `other_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contractfriendly
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contractfriendly`;
CREATE TABLE `contractfriendly` (
 `contentAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `contentreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table codesystemproperty
-- "A code system resource specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `codesystemproperty`;
CREATE TABLE `codesystemproperty` (
 `code` VARCHAR(1024),
 `uri` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `type` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table groupmember
-- "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
--
DROP TABLE IF EXISTS `groupmember`;
CREATE TABLE `groupmember` (
 `period` MEDIUMTEXT,
 `inactive` BOOLEAN,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `entity_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table episodeofcarestatushistory
-- "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time."
--
DROP TABLE IF EXISTS `episodeofcarestatushistory`;
CREATE TABLE `episodeofcarestatushistory` (
 `status` VARCHAR(64),
 `period` MEDIUMTEXT NOT NULL,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table clinicalimpressioninvestigation
-- "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
--
DROP TABLE IF EXISTS `clinicalimpressioninvestigation`;
CREATE TABLE `clinicalimpressioninvestigation` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measurereportstratum
-- "The MeasureReport resource contains the results of evaluating a measure."
--
DROP TABLE IF EXISTS `measurereportstratum`;
CREATE TABLE `measurereportstratum` (
 `value` VARCHAR(1024),
 `measureScore` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `population_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table graphdefinition
-- "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set."
--
DROP TABLE IF EXISTS `graphdefinition`;
CREATE TABLE `graphdefinition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `start` VARCHAR(1024),
 `profile` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `link_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table valuesetcompose
-- "A value set specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `valuesetcompose`;
CREATE TABLE `valuesetcompose` (
 `lockedDate` VARCHAR(1024),
 `inactive` BOOLEAN,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `include_id` VARCHAR(128),
 `exclude_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitcareteam
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitcareteam`;
CREATE TABLE `explanationofbenefitcareteam` (
 `sequence` FLOAT,
 `responsible` BOOLEAN,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `provider_id` VARCHAR(128),
 `role_id` VARCHAR(128),
 `qualification_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table specimencontainer
-- "A sample to be used for analysis."
--
DROP TABLE IF EXISTS `specimencontainer`;
CREATE TABLE `specimencontainer` (
 `identifier` MEDIUMTEXT,
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `capacity_id` VARCHAR(128),
 `specimenquantity_id` VARCHAR(128),
 `additivecodeableconcept_id` VARCHAR(128),
 `additivereference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table encounterlocation
-- "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
--
DROP TABLE IF EXISTS `encounterlocation`;
CREATE TABLE `encounterlocation` (
 `status` VARCHAR(64),
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `location_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table imagingmanifeststudy
-- "A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection."
--
DROP TABLE IF EXISTS `imagingmanifeststudy`;
CREATE TABLE `imagingmanifeststudy` (
 `uid` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `imagingstudy_id` VARCHAR(128),
 `endpoint_id` VARCHAR(128),
 `series_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table chargeitemparticipant
-- "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation."
--
DROP TABLE IF EXISTS `chargeitemparticipant`;
CREATE TABLE `chargeitemparticipant` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 `actor_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table slot
-- "A slot of time on a schedule that may be available for booking appointments."
--
DROP TABLE IF EXISTS `slot`;
CREATE TABLE `slot` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `start` VARCHAR(1024),
 `end` VARCHAR(1024),
 `overbooked` BOOLEAN,
 `comment` VARCHAR(16000),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `servicecategory_id` VARCHAR(128),
 `servicetype_id` VARCHAR(128),
 `specialty_id` VARCHAR(128),
 `appointmenttype_id` VARCHAR(128),
 `schedule_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationadministration
-- "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner."
--
DROP TABLE IF EXISTS `medicationadministration`;
CREATE TABLE `medicationadministration` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `effectiveDateTime` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `notGiven` BOOLEAN,
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `medicationcodeableconcept_id` VARCHAR(128),
 `medicationreference_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `supportinginformation_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `reasonnotgiven_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `prescription_id` VARCHAR(128),
 `device_id` VARCHAR(128),
 `dosage_id` VARCHAR(128),
 `eventhistory_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table datarequirementcodefilter
-- "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data."
--
DROP TABLE IF EXISTS `datarequirementcodefilter`;
CREATE TABLE `datarequirementcodefilter` (
 `path` VARCHAR(1024),
 `valueSetString` VARCHAR(1024),
 `valueCode` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `valuesetreference_id` VARCHAR(128),
 `valuecoding_id` VARCHAR(128),
 `valuecodeableconcept_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table documentreferencerelatesto
-- "A reference to a document."
--
DROP TABLE IF EXISTS `documentreferencerelatesto`;
CREATE TABLE `documentreferencerelatesto` (
 `code` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `target_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table provenanceagent
-- "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
--
DROP TABLE IF EXISTS `provenanceagent`;
CREATE TABLE `provenanceagent` (
 `whoUri` VARCHAR(1024),
 `onBehalfOfUri` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 `whoreference_id` VARCHAR(128),
 `onbehalfofreference_id` VARCHAR(128),
 `relatedagenttype_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table documentreferencerelated
-- "A reference to a document."
--
DROP TABLE IF EXISTS `documentreferencerelated`;
CREATE TABLE `documentreferencerelated` (
 `identifier` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `ref_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table auditevententity
-- "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
--
DROP TABLE IF EXISTS `auditevententity`;
CREATE TABLE `auditevententity` (
 `identifier` MEDIUMTEXT,
 `name` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `query` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `reference_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `role_id` VARCHAR(128),
 `lifecycle_id` VARCHAR(128),
 `securitylabel_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimpayee
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claimpayee`;
CREATE TABLE `claimpayee` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `resourcetype_id` VARCHAR(128),
 `party_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table organization
-- "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc."
--
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `active` BOOLEAN,
 `name` VARCHAR(1024),
 `alias` VARCHAR(1024),
 `telecom` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `address_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `contact_id` VARCHAR(128),
 `endpoint_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table linkage
-- "Identifies two or more records (resource instances) that are referring to the same real-world \"occurrence\"."
--
DROP TABLE IF EXISTS `linkage`;
CREATE TABLE `linkage` (
 `resourceType` VARCHAR(64) NOT NULL,
 `active` BOOLEAN,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `author_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table consentpolicy
-- "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
--
DROP TABLE IF EXISTS `consentpolicy`;
CREATE TABLE `consentpolicy` (
 `authority` VARCHAR(1024),
 `uri` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table bundlesearch
-- "A container for a collection of resources."
--
DROP TABLE IF EXISTS `bundlesearch`;
CREATE TABLE `bundlesearch` (
 `mode` VARCHAR(1024),
 `score` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table deviceudi
-- "This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc."
--
DROP TABLE IF EXISTS `deviceudi`;
CREATE TABLE `deviceudi` (
 `deviceIdentifier` VARCHAR(1024),
 `name` VARCHAR(1024),
 `jurisdiction` VARCHAR(1024),
 `carrierHRF` VARCHAR(1024),
 `carrierAIDC` VARCHAR(1024),
 `issuer` VARCHAR(1024),
 `entryType` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationingredient
-- "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
--
DROP TABLE IF EXISTS `medicationingredient`;
CREATE TABLE `medicationingredient` (
 `isActive` BOOLEAN,
 `amount` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `itemcodeableconcept_id` VARCHAR(128),
 `itemreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table paymentreconciliationprocessnote
-- "This resource provides payment details and claim references supporting a bulk payment."
--
DROP TABLE IF EXISTS `paymentreconciliationprocessnote`;
CREATE TABLE `paymentreconciliationprocessnote` (
 `text` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table diagnosticreport
-- "The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports."
--
DROP TABLE IF EXISTS `diagnosticreport`;
CREATE TABLE `diagnosticreport` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `effectiveDateTime` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `issued` VARCHAR(1024),
 `conclusion` VARCHAR(1024),
 `presentedForm` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `basedon_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `specimen_id` VARCHAR(128),
 `result_id` VARCHAR(128),
 `imagingstudy_id` VARCHAR(128),
 `image_id` VARCHAR(128),
 `codeddiagnosis_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table expansionprofiledesignation
-- "Resource to define constraints on the Expansion of a FHIR ValueSet."
--
DROP TABLE IF EXISTS `expansionprofiledesignation`;
CREATE TABLE `expansionprofiledesignation` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `include_id` VARCHAR(128),
 `exclude_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table testreportparticipant
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreportparticipant`;
CREATE TABLE `testreportparticipant` (
 `type` VARCHAR(1024),
 `uri` VARCHAR(1024),
 `display` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponse
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponse`;
CREATE TABLE `claimresponse` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `created` VARCHAR(64),
 `disposition` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `patient_id` VARCHAR(128),
 `insurer_id` VARCHAR(128),
 `requestprovider_id` VARCHAR(128),
 `requestorganization_id` VARCHAR(128),
 `request_id` VARCHAR(128),
 `outcome_id` VARCHAR(128),
 `payeetype_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 `additem_id` VARCHAR(128),
 `error_id` VARCHAR(128),
 `totalcost_id` VARCHAR(128),
 `unallocdeductable_id` VARCHAR(128),
 `totalbenefit_id` VARCHAR(128),
 `payment_id` VARCHAR(128),
 `reserved_id` VARCHAR(128),
 `form_id` VARCHAR(128),
 `processnote_id` VARCHAR(128),
 `communicationrequest_id` VARCHAR(128),
 `insurance_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table familymemberhistorycondition
-- "Significant health events and conditions for a person related to the patient relevant in the context of care for the patient."
--
DROP TABLE IF EXISTS `familymemberhistorycondition`;
CREATE TABLE `familymemberhistorycondition` (
 `onsetAge` MEDIUMTEXT,
 `onsetRange` MEDIUMTEXT,
 `onsetPeriod` MEDIUMTEXT,
 `onsetString` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `outcome_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table coding
-- "A reference to a code defined by a terminology system."
--
DROP TABLE IF EXISTS `coding`;
CREATE TABLE `coding` (
 `system` VARCHAR(1024),
 `version` VARCHAR(1024),
 `code` VARCHAR(1024),
 `display` VARCHAR(1024),
 `userSelected` BOOLEAN,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementinteraction
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementinteraction`;
CREATE TABLE `capabilitystatementinteraction` (
 `code` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table subscriptionchannel
-- "The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system is able to take an appropriate action."
--
DROP TABLE IF EXISTS `subscriptionchannel`;
CREATE TABLE `subscriptionchannel` (
 `type` VARCHAR(1024),
 `endpoint` VARCHAR(1024),
 `payload` VARCHAR(1024),
 `header` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table operationoutcome
-- "A collection of error, warning or information messages that result from a system action."
--
DROP TABLE IF EXISTS `operationoutcome`;
CREATE TABLE `operationoutcome` (
 `resourceType` VARCHAR(64) NOT NULL,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `issue_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table detectedissuemitigation
-- "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc."
--
DROP TABLE IF EXISTS `detectedissuemitigation`;
CREATE TABLE `detectedissuemitigation` (
 `date` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `action_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table conceptmapdependson
-- "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
--
DROP TABLE IF EXISTS `conceptmapdependson`;
CREATE TABLE `conceptmapdependson` (
 `property` VARCHAR(1024),
 `system` VARCHAR(1024),
 `code` VARCHAR(1024),
 `display` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table goal
-- "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
--
DROP TABLE IF EXISTS `goal`;
CREATE TABLE `goal` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `startDate` VARCHAR(1024),
 `statusDate` VARCHAR(1024),
 `statusReason` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `category_id` VARCHAR(128),
 `priority_id` VARCHAR(128),
 `description_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `startcodeableconcept_id` VARCHAR(128),
 `target_id` VARCHAR(128),
 `expressedby_id` VARCHAR(128),
 `addresses_id` VARCHAR(128),
 `outcomecode_id` VARCHAR(128),
 `outcomereference_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table clinicalimpressionfinding
-- "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score."
--
DROP TABLE IF EXISTS `clinicalimpressionfinding`;
CREATE TABLE `clinicalimpressionfinding` (
 `basis` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `itemcodeableconcept_id` VARCHAR(128),
 `itemreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table location
-- "Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated."
--
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `name` VARCHAR(1024),
 `alias` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `mode` VARCHAR(1024),
 `telecom` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `operationalstatus_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `address_id` VARCHAR(128),
 `physicaltype_id` VARCHAR(128),
 `position_id` VARCHAR(128),
 `managingorganization_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `endpoint_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table chargeitem
-- "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation."
--
DROP TABLE IF EXISTS `chargeitem`;
CREATE TABLE `chargeitem` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `definition` MEDIUMTEXT,
 `status` VARCHAR(64),
 `occurrenceDateTime` VARCHAR(1024),
 `occurrencePeriod` MEDIUMTEXT,
 `occurrenceTiming` MEDIUMTEXT,
 `factorOverride` FLOAT,
 `overrideReason` VARCHAR(1024),
 `enteredDate` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `partof_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `participant_id` VARCHAR(128),
 `performingorganization_id` VARCHAR(128),
 `requestingorganization_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `priceoverride_id` VARCHAR(128),
 `enterer_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `account_id` VARCHAR(128),
 `supportinginformation_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table valuesetcontains
-- "A value set specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `valuesetcontains`;
CREATE TABLE `valuesetcontains` (
 `system` VARCHAR(1024),
 `FHIRabstract` BOOLEAN,
 `inactive` BOOLEAN,
 `version` VARCHAR(1024),
 `code` VARCHAR(1024),
 `display` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `designation_id` VARCHAR(128),
 `contains_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table episodeofcarediagnosis
-- "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time."
--
DROP TABLE IF EXISTS `episodeofcarediagnosis`;
CREATE TABLE `episodeofcarediagnosis` (
 `rank` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `condition_id` VARCHAR(128),
 `role_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table fhircondition
-- "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern."
--
DROP TABLE IF EXISTS `fhircondition`;
CREATE TABLE `fhircondition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `clinicalStatus` VARCHAR(1024),
 `verificationStatus` VARCHAR(1024),
 `onsetDateTime` VARCHAR(1024),
 `onsetAge` MEDIUMTEXT,
 `onsetPeriod` MEDIUMTEXT,
 `onsetRange` MEDIUMTEXT,
 `onsetString` VARCHAR(1024),
 `abatementDateTime` VARCHAR(1024),
 `abatementAge` MEDIUMTEXT,
 `abatementBoolean` BOOLEAN,
 `abatementPeriod` MEDIUMTEXT,
 `abatementRange` MEDIUMTEXT,
 `abatementString` VARCHAR(1024),
 `assertedDate` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `category_id` VARCHAR(128),
 `severity_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `asserter_id` VARCHAR(128),
 `stage_id` VARCHAR(128),
 `evidence_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table namingsystem
-- "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types."
--
DROP TABLE IF EXISTS `namingsystem`;
CREATE TABLE `namingsystem` (
 `resourceType` VARCHAR(64) NOT NULL,
 `name` VARCHAR(1024),
 `status` VARCHAR(64),
 `kind` VARCHAR(1024),
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `responsible` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `usage` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `uniqueid_id` VARCHAR(128),
 `replacedby_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table processresponse
-- "This resource provides processing status, errors and notes from the processing of a resource."
--
DROP TABLE IF EXISTS `processresponse`;
CREATE TABLE `processresponse` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `created` VARCHAR(64),
 `disposition` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `organization_id` VARCHAR(128),
 `request_id` VARCHAR(128),
 `outcome_id` VARCHAR(128),
 `requestprovider_id` VARCHAR(128),
 `requestorganization_id` VARCHAR(128),
 `form_id` VARCHAR(128),
 `processnote_id` VARCHAR(128),
 `error_id` VARCHAR(128),
 `communicationrequest_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table plandefinitioncondition
-- "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
--
DROP TABLE IF EXISTS `plandefinitioncondition`;
CREATE TABLE `plandefinitioncondition` (
 `kind` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `language` VARCHAR(1024),
 `expression` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table bundleresponse
-- "A container for a collection of resources."
--
DROP TABLE IF EXISTS `bundleresponse`;
CREATE TABLE `bundleresponse` (
 `status` VARCHAR(64),
 `location` VARCHAR(1024),
 `etag` VARCHAR(1024),
 `lastModified` VARCHAR(1024),
 `outcome` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table observationrelated
-- "Measurements and simple assertions made about a patient, device or other subject."
--
DROP TABLE IF EXISTS `observationrelated`;
CREATE TABLE `observationrelated` (
 `type` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `target_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitsubdetail
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitsubdetail`;
CREATE TABLE `explanationofbenefitsubdetail` (
 `sequence` FLOAT,
 `factor` FLOAT,
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `programcode_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `unitprice_id` VARCHAR(128),
 `net_id` VARCHAR(128),
 `udi_id` VARCHAR(128),
 `adjudication_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table expansionprofile
-- "Resource to define constraints on the Expansion of a FHIR ValueSet."
--
DROP TABLE IF EXISTS `expansionprofile`;
CREATE TABLE `expansionprofile` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `includeDesignations` BOOLEAN,
 `includeDefinition` BOOLEAN,
 `activeOnly` BOOLEAN,
 `excludeNested` BOOLEAN,
 `excludeNotForUI` BOOLEAN,
 `excludePostCoordinated` BOOLEAN,
 `displayLanguage` VARCHAR(1024),
 `limitedExpansion` BOOLEAN,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `fixedversion_id` VARCHAR(128),
 `excludedsystem_id` VARCHAR(128),
 `designation_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table enrollmentresponse
-- "This resource provides enrollment and plan details from the processing of an Enrollment resource."
--
DROP TABLE IF EXISTS `enrollmentresponse`;
CREATE TABLE `enrollmentresponse` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `disposition` VARCHAR(1024),
 `created` VARCHAR(64),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `request_id` VARCHAR(128),
 `outcome_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 `requestprovider_id` VARCHAR(128),
 `requestorganization_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table immunizationpractitioner
-- "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
--
DROP TABLE IF EXISTS `immunizationpractitioner`;
CREATE TABLE `immunizationpractitioner` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 `actor_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table servicedefinition
-- "The ServiceDefinition describes a unit of decision support functionality that is made available as a service, such as immunization modules or drug-drug interaction checking."
--
DROP TABLE IF EXISTS `servicedefinition`;
CREATE TABLE `servicedefinition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `usage` VARCHAR(1024),
 `approvalDate` VARCHAR(1024),
 `lastReviewDate` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `copyright` VARCHAR(16000),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `topic_id` VARCHAR(128),
 `contributor_id` VARCHAR(128),
 `contact_id` VARCHAR(128),
 `relatedartifact_id` VARCHAR(128),
 `trigger_id` VARCHAR(128),
 `datarequirement_id` VARCHAR(128),
 `operationdefinition_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementsecurity
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementsecurity`;
CREATE TABLE `capabilitystatementsecurity` (
 `cors` BOOLEAN,
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `service_id` VARCHAR(128),
 `certificate_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table researchstudyarm
-- "A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects."
--
DROP TABLE IF EXISTS `researchstudyarm`;
CREATE TABLE `researchstudyarm` (
 `name` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table nutritionordertexture
-- "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
--
DROP TABLE IF EXISTS `nutritionordertexture`;
CREATE TABLE `nutritionordertexture` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `modifier_id` VARCHAR(128),
 `foodtype_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table library
-- "The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets."
--
DROP TABLE IF EXISTS `library`;
CREATE TABLE `library` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `usage` VARCHAR(1024),
 `approvalDate` VARCHAR(1024),
 `lastReviewDate` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `copyright` VARCHAR(16000),
 `parameter` MEDIUMTEXT,
 `content` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `topic_id` VARCHAR(128),
 `contributor_id` VARCHAR(128),
 `contact_id` VARCHAR(128),
 `relatedartifact_id` VARCHAR(128),
 `datarequirement_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table visionprescription
-- "An authorization for the supply of glasses and/or contact lenses to a patient."
--
DROP TABLE IF EXISTS `visionprescription`;
CREATE TABLE `visionprescription` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `dateWritten` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `patient_id` VARCHAR(128),
 `encounter_id` VARCHAR(128),
 `prescriber_id` VARCHAR(128),
 `reasoncodeableconcept_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `dispense_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table testreportassert
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreportassert`;
CREATE TABLE `testreportassert` (
 `result` VARCHAR(1024),
 `message` VARCHAR(1024),
 `detail` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table goaltarget
-- "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc."
--
DROP TABLE IF EXISTS `goaltarget`;
CREATE TABLE `goaltarget` (
 `detailRange` MEDIUMTEXT,
 `dueDate` VARCHAR(1024),
 `dueDuration` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `measure_id` VARCHAR(128),
 `detailquantity_id` VARCHAR(128),
 `detailcodeableconcept_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table referralrequest
-- "Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization."
--
DROP TABLE IF EXISTS `referralrequest`;
CREATE TABLE `referralrequest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `groupIdentifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `intent` VARCHAR(1024),
 `priority` VARCHAR(1024),
 `occurrenceDateTime` VARCHAR(1024),
 `occurrencePeriod` MEDIUMTEXT,
 `authoredOn` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `replaces_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `servicerequested_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `requester_id` VARCHAR(128),
 `specialty_id` VARCHAR(128),
 `recipient_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `supportinginfo_id` VARCHAR(128),
 `relevanthistory_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementmessaging
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementmessaging`;
CREATE TABLE `capabilitystatementmessaging` (
 `reliableCache` FLOAT,
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `endpoint_id` VARCHAR(128),
 `supportedmessage_id` VARCHAR(128),
 `event_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table encounter
-- "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
--
DROP TABLE IF EXISTS `encounter`;
CREATE TABLE `encounter` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `period` MEDIUMTEXT,
 `length` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `statushistory_id` VARCHAR(128),
 `fhirclass_id` VARCHAR(128),
 `classhistory_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `priority_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `episodeofcare_id` VARCHAR(128),
 `incomingreferral_id` VARCHAR(128),
 `participant_id` VARCHAR(128),
 `appointment_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `diagnosis_id` VARCHAR(128),
 `account_id` VARCHAR(128),
 `hospitalization_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `serviceprovider_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table structuredefinition
-- "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types."
--
DROP TABLE IF EXISTS `structuredefinition`;
CREATE TABLE `structuredefinition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `copyright` VARCHAR(16000),
 `fhirVersion` VARCHAR(1024),
 `mapping` MEDIUMTEXT,
 `kind` VARCHAR(1024),
 `FHIRabstract` BOOLEAN,
 `contextType` VARCHAR(1024),
 `context` VARCHAR(1024),
 `contextInvariant` VARCHAR(1024),
 `type` VARCHAR(1024),
 `baseDefinition` VARCHAR(1024),
 `derivation` VARCHAR(1024),
 `snapshot` MEDIUMTEXT,
 `differential` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `keyword_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponseadjudication
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponseadjudication`;
CREATE TABLE `claimresponseadjudication` (
 `value` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `category_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 `amount_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimsubdetail
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claimsubdetail`;
CREATE TABLE `claimsubdetail` (
 `sequence` FLOAT,
 `factor` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `programcode_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `unitprice_id` VARCHAR(128),
 `net_id` VARCHAR(128),
 `udi_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measurereportpopulation1
-- "The MeasureReport resource contains the results of evaluating a measure."
--
DROP TABLE IF EXISTS `measurereportpopulation1`;
CREATE TABLE `measurereportpopulation1` (
 `identifier` MEDIUMTEXT,
 `count` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `patients_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table referralrequestrequester
-- "Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization."
--
DROP TABLE IF EXISTS `referralrequestrequester`;
CREATE TABLE `referralrequestrequester` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `agent_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table composition
-- "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
--
DROP TABLE IF EXISTS `composition`;
CREATE TABLE `composition` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `date` VARCHAR(1024),
 `title` VARCHAR(1024),
 `confidentiality` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `fhirclass_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `encounter_id` VARCHAR(128),
 `author_id` VARCHAR(128),
 `attester_id` VARCHAR(128),
 `custodian_id` VARCHAR(128),
 `relatesto_id` VARCHAR(128),
 `event_id` VARCHAR(128),
 `section_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table questionnaireenablewhen
-- "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection."
--
DROP TABLE IF EXISTS `questionnaireenablewhen`;
CREATE TABLE `questionnaireenablewhen` (
 `question` VARCHAR(1024),
 `hasAnswer` BOOLEAN,
 `answerBoolean` BOOLEAN,
 `answerDecimal` FLOAT,
 `answerInteger` FLOAT,
 `answerDate` VARCHAR(1024),
 `answerDateTime` VARCHAR(1024),
 `answerTime` VARCHAR(1024),
 `answerString` VARCHAR(1024),
 `answerUri` VARCHAR(1024),
 `answerAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `answercoding_id` VARCHAR(128),
 `answerquantity_id` VARCHAR(128),
 `answerreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table testreporttest
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreporttest`;
CREATE TABLE `testreporttest` (
 `name` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `action_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table expansionprofileinclude
-- "Resource to define constraints on the Expansion of a FHIR ValueSet."
--
DROP TABLE IF EXISTS `expansionprofileinclude`;
CREATE TABLE `expansionprofileinclude` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `designation_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationstatement
-- "A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains \r\rThe primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information."
--
DROP TABLE IF EXISTS `medicationstatement`;
CREATE TABLE `medicationstatement` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `effectiveDateTime` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `dateAsserted` VARCHAR(1024),
 `taken` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `basedon_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `medicationcodeableconcept_id` VARCHAR(128),
 `medicationreference_id` VARCHAR(128),
 `informationsource_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `derivedfrom_id` VARCHAR(128),
 `reasonnottaken_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `dosage_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationdispenseperformer
-- "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
--
DROP TABLE IF EXISTS `medicationdispenseperformer`;
CREATE TABLE `medicationdispenseperformer` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `actor_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table healthcareservice
-- "The details of a healthcare service available at a location."
--
DROP TABLE IF EXISTS `healthcareservice`;
CREATE TABLE `healthcareservice` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `active` BOOLEAN,
 `name` VARCHAR(1024),
 `comment` VARCHAR(16000),
 `extraDetails` VARCHAR(1024),
 `photo` MEDIUMTEXT,
 `telecom` MEDIUMTEXT,
 `eligibilityNote` VARCHAR(1024),
 `programName` VARCHAR(1024),
 `appointmentRequired` BOOLEAN,
 `availabilityExceptions` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `providedby_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `specialty_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `coveragearea_id` VARCHAR(128),
 `serviceprovisioncode_id` VARCHAR(128),
 `eligibility_id` VARCHAR(128),
 `characteristic_id` VARCHAR(128),
 `referralmethod_id` VARCHAR(128),
 `availabletime_id` VARCHAR(128),
 `notavailable_id` VARCHAR(128),
 `endpoint_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table conditionevidence
-- "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern."
--
DROP TABLE IF EXISTS `conditionevidence`;
CREATE TABLE `conditionevidence` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementoperation
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementoperation`;
CREATE TABLE `capabilitystatementoperation` (
 `name` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `definition_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table triggerdefinition
-- "A description of a triggering event."
--
DROP TABLE IF EXISTS `triggerdefinition`;
CREATE TABLE `triggerdefinition` (
 `type` VARCHAR(1024),
 `eventName` VARCHAR(1024),
 `eventTimingTiming` MEDIUMTEXT,
 `eventTimingDate` VARCHAR(1024),
 `eventTimingDateTime` VARCHAR(1024),
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `eventtimingreference_id` VARCHAR(128),
 `eventdata_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table groupcharacteristic
-- "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization."
--
DROP TABLE IF EXISTS `groupcharacteristic`;
CREATE TABLE `groupcharacteristic` (
 `valueBoolean` BOOLEAN,
 `valueRange` MEDIUMTEXT,
 `exclude` BOOLEAN,
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `valuecodeableconcept_id` VARCHAR(128),
 `valuequantity_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitpayment
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitpayment`;
CREATE TABLE `explanationofbenefitpayment` (
 `date` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `adjustment_id` VARCHAR(128),
 `adjustmentreason_id` VARCHAR(128),
 `amount_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table imagingstudyseries
-- "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities."
--
DROP TABLE IF EXISTS `imagingstudyseries`;
CREATE TABLE `imagingstudyseries` (
 `uid` VARCHAR(1024),
 `number` FLOAT,
 `description` MEDIUMTEXT,
 `numberOfInstances` FLOAT,
 `availability` VARCHAR(1024),
 `started` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `modality_id` VARCHAR(128),
 `endpoint_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `laterality_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `instance_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table compositionattester
-- "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
--
DROP TABLE IF EXISTS `compositionattester`;
CREATE TABLE `compositionattester` (
 `mode` VARCHAR(1024),
 `time` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `party_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table consentexcept
-- "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
--
DROP TABLE IF EXISTS `consentexcept`;
CREATE TABLE `consentexcept` (
 `type` VARCHAR(1024),
 `period` MEDIUMTEXT,
 `dataPeriod` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `actor_id` VARCHAR(128),
 `action_id` VARCHAR(128),
 `securitylabel_id` VARCHAR(128),
 `purpose_id` VARCHAR(128),
 `fhirclass_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `data_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table eligibilityrequest
-- "The EligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an EligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy."
--
DROP TABLE IF EXISTS `eligibilityrequest`;
CREATE TABLE `eligibilityrequest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `servicedDate` VARCHAR(1024),
 `servicedPeriod` MEDIUMTEXT,
 `created` VARCHAR(64),
 `businessArrangement` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `priority_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `enterer_id` VARCHAR(128),
 `provider_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 `insurer_id` VARCHAR(128),
 `facility_id` VARCHAR(128),
 `coverage_id` VARCHAR(128),
 `benefitcategory_id` VARCHAR(128),
 `benefitsubcategory_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table auditevent
-- "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
--
DROP TABLE IF EXISTS `auditevent`;
CREATE TABLE `auditevent` (
 `resourceType` VARCHAR(64) NOT NULL,
 `action` VARCHAR(1024),
 `recorded` VARCHAR(1024),
 `outcome` VARCHAR(1024),
 `outcomeDesc` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `subtype_id` VARCHAR(128),
 `purposeofevent_id` VARCHAR(128),
 `agent_id` VARCHAR(128),
 `source_id` VARCHAR(128),
 `entity_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table structuremapparameter
-- "A Map of relationships between 2 structures that can be used to transform data."
--
DROP TABLE IF EXISTS `structuremapparameter`;
CREATE TABLE `structuremapparameter` (
 `valueId` VARCHAR(1024),
 `valueString` VARCHAR(1024),
 `valueBoolean` BOOLEAN,
 `valueInteger` FLOAT,
 `valueDecimal` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table claiminformation
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claiminformation`;
CREATE TABLE `claiminformation` (
 `sequence` FLOAT,
 `timingDate` VARCHAR(1024),
 `timingPeriod` MEDIUMTEXT,
 `valueString` VARCHAR(1024),
 `valueAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `category_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `valuequantity_id` VARCHAR(128),
 `valuereference_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table structuremapinput
-- "A Map of relationships between 2 structures that can be used to transform data."
--
DROP TABLE IF EXISTS `structuremapinput`;
CREATE TABLE `structuremapinput` (
 `name` VARCHAR(1024),
 `type` VARCHAR(1024),
 `mode` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table coverage
-- "Financial instrument which may be used to reimburse or pay for health care products and services."
--
DROP TABLE IF EXISTS `coverage`;
CREATE TABLE `coverage` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `subscriberId` VARCHAR(1024),
 `period` MEDIUMTEXT,
 `dependent` VARCHAR(1024),
 `sequence` VARCHAR(1024),
 `order` FLOAT,
 `network` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `policyholder_id` VARCHAR(128),
 `subscriber_id` VARCHAR(128),
 `beneficiary_id` VARCHAR(128),
 `relationship_id` VARCHAR(128),
 `payor_id` VARCHAR(128),
 `grouping_id` VARCHAR(128),
 `contract_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table sequencequality
-- "Raw data describing a biological sequence."
--
DROP TABLE IF EXISTS `sequencequality`;
CREATE TABLE `sequencequality` (
 `type` VARCHAR(1024),
 `start` FLOAT,
 `end` FLOAT,
 `truthTP` FLOAT,
 `queryTP` FLOAT,
 `truthFN` FLOAT,
 `queryFP` FLOAT,
 `gtFP` FLOAT,
 `precision` FLOAT,
 `recall` FLOAT,
 `fScore` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `standardsequence_id` VARCHAR(128),
 `score_id` VARCHAR(128),
 `method_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table nutritionorder
-- "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
--
DROP TABLE IF EXISTS `nutritionorder`;
CREATE TABLE `nutritionorder` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `dateTime` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `patient_id` VARCHAR(128),
 `encounter_id` VARCHAR(128),
 `orderer_id` VARCHAR(128),
 `allergyintolerance_id` VARCHAR(128),
 `foodpreferencemodifier_id` VARCHAR(128),
 `excludefoodmodifier_id` VARCHAR(128),
 `oraldiet_id` VARCHAR(128),
 `supplement_id` VARCHAR(128),
 `enteralformula_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table procedureperformer
-- "An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy."
--
DROP TABLE IF EXISTS `procedureperformer`;
CREATE TABLE `procedureperformer` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 `actor_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table encounterparticipant
-- "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
--
DROP TABLE IF EXISTS `encounterparticipant`;
CREATE TABLE `encounterparticipant` (
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `individual_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table testreportaction2
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreportaction2`;
CREATE TABLE `testreportaction2` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `operation_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table structuremapdependent
-- "A Map of relationships between 2 structures that can be used to transform data."
--
DROP TABLE IF EXISTS `structuremapdependent`;
CREATE TABLE `structuremapdependent` (
 `name` VARCHAR(1024),
 `variable` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table bundlelink
-- "A container for a collection of resources."
--
DROP TABLE IF EXISTS `bundlelink`;
CREATE TABLE `bundlelink` (
 `relation` VARCHAR(1024),
 `url` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table valuesetinclude
-- "A value set specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `valuesetinclude`;
CREATE TABLE `valuesetinclude` (
 `system` VARCHAR(1024),
 `version` VARCHAR(1024),
 `valueSet` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `concept_id` VARCHAR(128),
 `filter_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table practitioner
-- "A person who is directly or indirectly involved in the provisioning of healthcare."
--
DROP TABLE IF EXISTS `practitioner`;
CREATE TABLE `practitioner` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `active` BOOLEAN,
 `name` MEDIUMTEXT,
 `telecom` MEDIUMTEXT,
 `gender` VARCHAR(1024),
 `birthDate` VARCHAR(1024),
 `photo` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `address_id` VARCHAR(128),
 `qualification_id` VARCHAR(128),
 `communication_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table operationdefinitionoverload
-- "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
--
DROP TABLE IF EXISTS `operationdefinitionoverload`;
CREATE TABLE `operationdefinitionoverload` (
 `parameterName` VARCHAR(1024),
 `comment` VARCHAR(16000),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table auditeventsource
-- "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
--
DROP TABLE IF EXISTS `auditeventsource`;
CREATE TABLE `auditeventsource` (
 `site` VARCHAR(1024),
 `identifier` MEDIUMTEXT NOT NULL,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table patient
-- "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
--
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `active` BOOLEAN,
 `name` MEDIUMTEXT,
 `telecom` MEDIUMTEXT,
 `gender` VARCHAR(1024),
 `birthDate` VARCHAR(1024),
 `deceasedBoolean` BOOLEAN,
 `deceasedDateTime` VARCHAR(1024),
 `multipleBirthBoolean` BOOLEAN,
 `multipleBirthInteger` FLOAT,
 `photo` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `address_id` VARCHAR(128),
 `maritalstatus_id` VARCHAR(128),
 `contact_id` VARCHAR(128),
 `animal_id` VARCHAR(128),
 `communication_id` VARCHAR(128),
 `generalpractitioner_id` VARCHAR(128),
 `managingorganization_id` VARCHAR(128),
 `link_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitprocedure
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitprocedure`;
CREATE TABLE `explanationofbenefitprocedure` (
 `sequence` FLOAT,
 `date` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `procedurecodeableconcept_id` VARCHAR(128),
 `procedurereference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table datarequirement
-- "Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data."
--
DROP TABLE IF EXISTS `datarequirement`;
CREATE TABLE `datarequirement` (
 `type` VARCHAR(1024),
 `profile` VARCHAR(1024),
 `mustSupport` VARCHAR(1024),
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `codefilter_id` VARCHAR(128),
 `datefilter_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table sequencevariant
-- "Raw data describing a biological sequence."
--
DROP TABLE IF EXISTS `sequencevariant`;
CREATE TABLE `sequencevariant` (
 `start` FLOAT,
 `end` FLOAT,
 `observedAllele` VARCHAR(1024),
 `referenceAllele` VARCHAR(1024),
 `cigar` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `variantpointer_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table documentmanifestcontent
-- "A collection of documents compiled for a purpose together with metadata that applies to the collection."
--
DROP TABLE IF EXISTS `documentmanifestcontent`;
CREATE TABLE `documentmanifestcontent` (
 `pAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `preference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table activitydefinitionparticipant
-- "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context."
--
DROP TABLE IF EXISTS `activitydefinitionparticipant`;
CREATE TABLE `activitydefinitionparticipant` (
 `type` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitinformation
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitinformation`;
CREATE TABLE `explanationofbenefitinformation` (
 `sequence` FLOAT,
 `timingDate` VARCHAR(1024),
 `timingPeriod` MEDIUMTEXT,
 `valueString` VARCHAR(1024),
 `valueAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `category_id` VARCHAR(128),
 `code_id` VARCHAR(128),
 `valuequantity_id` VARCHAR(128),
 `valuereference_id` VARCHAR(128),
 `reason_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationrequestsubstitution
-- "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
--
DROP TABLE IF EXISTS `medicationrequestsubstitution`;
CREATE TABLE `medicationrequestsubstitution` (
 `allowed` BOOLEAN,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `reason_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table sequencereferenceseq
-- "Raw data describing a biological sequence."
--
DROP TABLE IF EXISTS `sequencereferenceseq`;
CREATE TABLE `sequencereferenceseq` (
 `genomeBuild` VARCHAR(1024),
 `referenceSeqString` VARCHAR(1024),
 `strand` FLOAT,
 `windowStart` FLOAT,
 `windowEnd` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `chromosome_id` VARCHAR(128),
 `referenceseqid_id` VARCHAR(128),
 `referenceseqpointer_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table testreport
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreport`;
CREATE TABLE `testreport` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `name` VARCHAR(1024),
 `status` VARCHAR(64),
 `result` VARCHAR(1024),
 `score` FLOAT,
 `tester` VARCHAR(1024),
 `issued` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `testscript_id` VARCHAR(128),
 `participant_id` VARCHAR(128),
 `setup_id` VARCHAR(128),
 `test_id` VARCHAR(128),
 `teardown_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table personlink
-- "Demographics and administrative information about a person independent of a specific health-related context."
--
DROP TABLE IF EXISTS `personlink`;
CREATE TABLE `personlink` (
 `assurance` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `target_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table adverseeventsuspectentity
-- "Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death."
--
DROP TABLE IF EXISTS `adverseeventsuspectentity`;
CREATE TABLE `adverseeventsuspectentity` (
 `causality` VARCHAR(1024),
 `causalityProductRelatedness` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `instance_id` VARCHAR(128),
 `causalityassessment_id` VARCHAR(128),
 `causalitymethod_id` VARCHAR(128),
 `causalityauthor_id` VARCHAR(128),
 `causalityresult_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponsedetail
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponsedetail`;
CREATE TABLE `claimresponsedetail` (
 `sequenceLinkId` FLOAT,
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `adjudication_id` VARCHAR(128),
 `subdetail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table paymentreconciliationdetail
-- "This resource provides payment details and claim references supporting a bulk payment."
--
DROP TABLE IF EXISTS `paymentreconciliationdetail`;
CREATE TABLE `paymentreconciliationdetail` (
 `date` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `request_id` VARCHAR(128),
 `response_id` VARCHAR(128),
 `submitter_id` VARCHAR(128),
 `payee_id` VARCHAR(128),
 `amount_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table bundlerequest
-- "A container for a collection of resources."
--
DROP TABLE IF EXISTS `bundlerequest`;
CREATE TABLE `bundlerequest` (
 `method` VARCHAR(1024),
 `url` VARCHAR(1024),
 `ifNoneMatch` VARCHAR(1024),
 `ifModifiedSince` VARCHAR(1024),
 `ifMatch` VARCHAR(1024),
 `ifNoneExist` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table structuremapstructure
-- "A Map of relationships between 2 structures that can be used to transform data."
--
DROP TABLE IF EXISTS `structuremapstructure`;
CREATE TABLE `structuremapstructure` (
 `url` VARCHAR(1024),
 `mode` VARCHAR(1024),
 `alias` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatement
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatement`;
CREATE TABLE `capabilitystatement` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `copyright` VARCHAR(16000),
 `kind` VARCHAR(1024),
 `instantiates` VARCHAR(1024),
 `fhirVersion` VARCHAR(1024),
 `acceptUnknown` VARCHAR(1024),
 `format` VARCHAR(1024),
 `patchFormat` VARCHAR(1024),
 `implementationGuide` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `contact_id` VARCHAR(128),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `software_id` VARCHAR(128),
 `implementation_id` VARCHAR(128),
 `profile_id` VARCHAR(128),
 `rest_id` VARCHAR(128),
 `messaging_id` VARCHAR(128),
 `document_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table accountguarantor
-- "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc."
--
DROP TABLE IF EXISTS `accountguarantor`;
CREATE TABLE `accountguarantor` (
 `onHold` BOOLEAN,
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `party_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table communicationrequestpayload
-- "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition."
--
DROP TABLE IF EXISTS `communicationrequestpayload`;
CREATE TABLE `communicationrequestpayload` (
 `contentString` VARCHAR(1024),
 `contentAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `contentreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimcareteam
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claimcareteam`;
CREATE TABLE `claimcareteam` (
 `sequence` FLOAT,
 `responsible` BOOLEAN,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `provider_id` VARCHAR(128),
 `role_id` VARCHAR(128),
 `qualification_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table listentry
-- "A set of information summarized from a list of other resources."
--
DROP TABLE IF EXISTS `listentry`;
CREATE TABLE `listentry` (
 `deleted` BOOLEAN,
 `date` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `flag_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measurereport
-- "The MeasureReport resource contains the results of evaluating a measure."
--
DROP TABLE IF EXISTS `measurereport`;
CREATE TABLE `measurereport` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `type` VARCHAR(1024),
 `date` VARCHAR(1024),
 `period` MEDIUMTEXT NOT NULL,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `measure_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `reportingorganization_id` VARCHAR(128),
 `group_id` VARCHAR(128),
 `evaluatedresources_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table schedule
-- "A container for slots of time that may be available for booking appointments."
--
DROP TABLE IF EXISTS `schedule`;
CREATE TABLE `schedule` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `active` BOOLEAN,
 `planningHorizon` MEDIUMTEXT,
 `comment` VARCHAR(16000),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `servicecategory_id` VARCHAR(128),
 `servicetype_id` VARCHAR(128),
 `specialty_id` VARCHAR(128),
 `actor_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table requestgrouprelatedaction
-- "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
--
DROP TABLE IF EXISTS `requestgrouprelatedaction`;
CREATE TABLE `requestgrouprelatedaction` (
 `actionId` VARCHAR(1024),
 `relationship` VARCHAR(1024),
 `offsetDuration` MEDIUMTEXT,
 `offsetRange` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table communicationpayload
-- "An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition."
--
DROP TABLE IF EXISTS `communicationpayload`;
CREATE TABLE `communicationpayload` (
 `contentString` VARCHAR(1024),
 `contentAttachment` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `contentreference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimprocedure
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claimprocedure`;
CREATE TABLE `claimprocedure` (
 `sequence` FLOAT,
 `date` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `procedurecodeableconcept_id` VARCHAR(128),
 `procedurereference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table processresponseprocessnote
-- "This resource provides processing status, errors and notes from the processing of a resource."
--
DROP TABLE IF EXISTS `processresponseprocessnote`;
CREATE TABLE `processresponseprocessnote` (
 `text` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table processrequest
-- "This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources."
--
DROP TABLE IF EXISTS `processrequest`;
CREATE TABLE `processrequest` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `action` VARCHAR(1024),
 `created` VARCHAR(64),
 `nullify` BOOLEAN,
 `reference` VARCHAR(1024),
 `include` VARCHAR(1024),
 `exclude` VARCHAR(1024),
 `period` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `target_id` VARCHAR(128),
 `provider_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 `request_id` VARCHAR(128),
 `response_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table imagingmanifestseries
-- "A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection."
--
DROP TABLE IF EXISTS `imagingmanifestseries`;
CREATE TABLE `imagingmanifestseries` (
 `uid` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `endpoint_id` VARCHAR(128),
 `instance_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponseitem
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponseitem`;
CREATE TABLE `claimresponseitem` (
 `sequenceLinkId` FLOAT,
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `adjudication_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table specimen
-- "A sample to be used for analysis."
--
DROP TABLE IF EXISTS `specimen`;
CREATE TABLE `specimen` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `accessionIdentifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `receivedTime` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `parent_id` VARCHAR(128),
 `request_id` VARCHAR(128),
 `collection_id` VARCHAR(128),
 `processing_id` VARCHAR(128),
 `container_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table eligibilityresponseinsurance
-- "This resource provides eligibility and plan details from the processing of an Eligibility resource."
--
DROP TABLE IF EXISTS `eligibilityresponseinsurance`;
CREATE TABLE `eligibilityresponseinsurance` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `coverage_id` VARCHAR(128),
 `contract_id` VARCHAR(128),
 `benefitbalance_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitrelated
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitrelated`;
CREATE TABLE `explanationofbenefitrelated` (
 `reference` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `claim_id` VARCHAR(128),
 `relationship_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table healthcareserviceavailabletime
-- "The details of a healthcare service available at a location."
--
DROP TABLE IF EXISTS `healthcareserviceavailabletime`;
CREATE TABLE `healthcareserviceavailabletime` (
 `daysOfWeek` VARCHAR(1024),
 `allDay` BOOLEAN,
 `availableStartTime` VARCHAR(1024),
 `availableEndTime` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table consentactor
-- "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
--
DROP TABLE IF EXISTS `consentactor`;
CREATE TABLE `consentactor` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 `reference_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponseprocessnote
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponseprocessnote`;
CREATE TABLE `claimresponseprocessnote` (
 `number` FLOAT,
 `text` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `language_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table encounterhospitalization
-- "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
--
DROP TABLE IF EXISTS `encounterhospitalization`;
CREATE TABLE `encounterhospitalization` (
 `preAdmissionIdentifier` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `origin_id` VARCHAR(128),
 `admitsource_id` VARCHAR(128),
 `readmission_id` VARCHAR(128),
 `dietpreference_id` VARCHAR(128),
 `specialcourtesy_id` VARCHAR(128),
 `specialarrangement_id` VARCHAR(128),
 `destination_id` VARCHAR(128),
 `dischargedisposition_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table devicemetric
-- "Describes a measurement, calculation or setting capability of a medical device."
--
DROP TABLE IF EXISTS `devicemetric`;
CREATE TABLE `devicemetric` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT NOT NULL,
 `operationalStatus` VARCHAR(1024),
 `color` VARCHAR(1024),
 `category` VARCHAR(1024),
 `measurementPeriod` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `type_id` VARCHAR(128),
 `unit_id` VARCHAR(128),
 `source_id` VARCHAR(128),
 `parent_id` VARCHAR(128),
 `calibration_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table imagingmanifestinstance
-- "A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or significance of, the selection."
--
DROP TABLE IF EXISTS `imagingmanifestinstance`;
CREATE TABLE `imagingmanifestinstance` (
 `sopClass` VARCHAR(1024),
 `uid` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table fhirbinary
-- "A binary resource can contain any content, whether text, image, pdf, zip archive, etc."
--
DROP TABLE IF EXISTS `fhirbinary`;
CREATE TABLE `fhirbinary` (
 `resourceType` VARCHAR(64) NOT NULL,
 `contentType` VARCHAR(1024),
 `content` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `securitycontext_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table taskrequester
-- "A task to be performed."
--
DROP TABLE IF EXISTS `taskrequester`;
CREATE TABLE `taskrequester` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `agent_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table operationoutcomeissue
-- "A collection of error, warning or information messages that result from a system action."
--
DROP TABLE IF EXISTS `operationoutcomeissue`;
CREATE TABLE `operationoutcomeissue` (
 `severity` VARCHAR(1024),
 `code` VARCHAR(1024),
 `diagnostics` VARCHAR(1024),
 `location` VARCHAR(1024),
 `expression` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `details_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table accountcoverage
-- "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc."
--
DROP TABLE IF EXISTS `accountcoverage`;
CREATE TABLE `accountcoverage` (
 `priority` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `coverage_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table eligibilityresponseerror
-- "This resource provides eligibility and plan details from the processing of an Eligibility resource."
--
DROP TABLE IF EXISTS `eligibilityresponseerror`;
CREATE TABLE `eligibilityresponseerror` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measurereportstratifier
-- "The MeasureReport resource contains the results of evaluating a measure."
--
DROP TABLE IF EXISTS `measurereportstratifier`;
CREATE TABLE `measurereportstratifier` (
 `identifier` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `stratum_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table expansionprofileexcludedsystem
-- "Resource to define constraints on the Expansion of a FHIR ValueSet."
--
DROP TABLE IF EXISTS `expansionprofileexcludedsystem`;
CREATE TABLE `expansionprofileexcludedsystem` (
 `system` VARCHAR(1024),
 `version` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table communicationrequestrequester
-- "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition."
--
DROP TABLE IF EXISTS `communicationrequestrequester`;
CREATE TABLE `communicationrequestrequester` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `agent_id` VARCHAR(128),
 `onbehalfof_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table structuremapgroup
-- "A Map of relationships between 2 structures that can be used to transform data."
--
DROP TABLE IF EXISTS `structuremapgroup`;
CREATE TABLE `structuremapgroup` (
 `name` VARCHAR(1024),
 `FHIRextends` VARCHAR(1024),
 `typeMode` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `input_id` VARCHAR(128),
 `rule_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table taskoutput
-- "A task to be performed."
--
DROP TABLE IF EXISTS `taskoutput`;
CREATE TABLE `taskoutput` (
 `valueBoolean` BOOLEAN,
 `valueInteger` FLOAT,
 `valueDecimal` FLOAT,
 `valueBase64Binary` VARCHAR(1024),
 `valueInstant` VARCHAR(1024),
 `valueString` VARCHAR(1024),
 `valueUri` VARCHAR(1024),
 `valueDate` VARCHAR(1024),
 `valueDateTime` VARCHAR(1024),
 `valueTime` VARCHAR(1024),
 `valueCode` VARCHAR(1024),
 `valueOid` VARCHAR(1024),
 `valueUuid` VARCHAR(1024),
 `valueId` VARCHAR(1024),
 `valueUnsignedInt` FLOAT,
 `valuePositiveInt` FLOAT,
 `valueMarkdown` VARCHAR(1024),
 `valueElement` MEDIUMTEXT,
 `valueExtension` MEDIUMTEXT,
 `valueBackboneElement` MEDIUMTEXT,
 `valueAnnotation` MEDIUMTEXT,
 `valueAttachment` MEDIUMTEXT,
 `valueIdentifier` MEDIUMTEXT,
 `valueDuration` MEDIUMTEXT,
 `valueCount` MEDIUMTEXT,
 `valueAge` MEDIUMTEXT,
 `valueRange` MEDIUMTEXT,
 `valuePeriod` MEDIUMTEXT,
 `valueRatio` MEDIUMTEXT,
 `valueSampledData` MEDIUMTEXT,
 `valueSignature` MEDIUMTEXT,
 `valueHumanName` MEDIUMTEXT,
 `valueContactPoint` MEDIUMTEXT,
 `valueTiming` MEDIUMTEXT,
 `valueElementDefinition` MEDIUMTEXT,
 `valueParameterDefinition` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `valuenarrative_id` VARCHAR(128),
 `valuecodeableconcept_id` VARCHAR(128),
 `valuecoding_id` VARCHAR(128),
 `valuequantity_id` VARCHAR(128),
 `valuesimplequantity_id` VARCHAR(128),
 `valuedistance_id` VARCHAR(128),
 `valuemoney_id` VARCHAR(128),
 `valuereference_id` VARCHAR(128),
 `valueaddress_id` VARCHAR(128),
 `valuemeta_id` VARCHAR(128),
 `valuecontactdetail_id` VARCHAR(128),
 `valuecontributor_id` VARCHAR(128),
 `valuedosage_id` VARCHAR(128),
 `valuerelatedartifact_id` VARCHAR(128),
 `valueusagecontext_id` VARCHAR(128),
 `valuedatarequirement_id` VARCHAR(128),
 `valuetriggerdefinition_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table conditionstage
-- "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern."
--
DROP TABLE IF EXISTS `conditionstage`;
CREATE TABLE `conditionstage` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `summary_id` VARCHAR(128),
 `assessment_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table conceptmapgroup
-- "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
--
DROP TABLE IF EXISTS `conceptmapgroup`;
CREATE TABLE `conceptmapgroup` (
 `source` VARCHAR(1024),
 `sourceVersion` VARCHAR(1024),
 `target` VARCHAR(1024),
 `targetVersion` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `element_id` VARCHAR(128),
 `unmapped_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table testreportaction
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreportaction`;
CREATE TABLE `testreportaction` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `operation_id` VARCHAR(128),
 `fhirassert_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table plandefinitionparticipant
-- "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
--
DROP TABLE IF EXISTS `plandefinitionparticipant`;
CREATE TABLE `plandefinitionparticipant` (
 `type` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `role_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table valuesetfilter
-- "A value set specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `valuesetfilter`;
CREATE TABLE `valuesetfilter` (
 `property` VARCHAR(1024),
 `op` VARCHAR(1024),
 `value` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementimplementation
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementimplementation`;
CREATE TABLE `capabilitystatementimplementation` (
 `description` MEDIUMTEXT,
 `url` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table messagedefinitionfocus
-- "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted."
--
DROP TABLE IF EXISTS `messagedefinitionfocus`;
CREATE TABLE `messagedefinitionfocus` (
 `code` VARCHAR(1024),
 `min` FLOAT,
 `max` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `profile_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimdetail
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claimdetail`;
CREATE TABLE `claimdetail` (
 `sequence` FLOAT,
 `factor` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `programcode_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `unitprice_id` VARCHAR(128),
 `net_id` VARCHAR(128),
 `udi_id` VARCHAR(128),
 `subdetail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table measuregroup
-- "The Measure resource provides the definition of a quality measure."
--
DROP TABLE IF EXISTS `measuregroup`;
CREATE TABLE `measuregroup` (
 `identifier` MEDIUMTEXT NOT NULL,
 `name` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `population_id` VARCHAR(128),
 `stratifier_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table contractsigner
-- "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
--
DROP TABLE IF EXISTS `contractsigner`;
CREATE TABLE `contractsigner` (
 `signature` MEDIUMTEXT NOT NULL,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `party_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table appointmentparticipant
-- "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)."
--
DROP TABLE IF EXISTS `appointmentparticipant`;
CREATE TABLE `appointmentparticipant` (
 `required` VARCHAR(1024),
 `status` VARCHAR(64),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `actor_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table riskassessmentprediction
-- "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome."
--
DROP TABLE IF EXISTS `riskassessmentprediction`;
CREATE TABLE `riskassessmentprediction` (
 `probabilityDecimal` FLOAT,
 `probabilityRange` MEDIUMTEXT,
 `relativeRisk` FLOAT,
 `whenPeriod` MEDIUMTEXT,
 `whenRange` MEDIUMTEXT,
 `rationale` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `outcome_id` VARCHAR(128),
 `qualitativerisk_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table paymentnotice
-- "This resource provides the status of the payment for goods and services rendered, and the request and response resource references."
--
DROP TABLE IF EXISTS `paymentnotice`;
CREATE TABLE `paymentnotice` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `statusDate` VARCHAR(1024),
 `created` VARCHAR(64),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `request_id` VARCHAR(128),
 `response_id` VARCHAR(128),
 `target_id` VARCHAR(128),
 `provider_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 `paymentstatus_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table patientcontact
-- "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
--
DROP TABLE IF EXISTS `patientcontact`;
CREATE TABLE `patientcontact` (
 `name` MEDIUMTEXT,
 `telecom` MEDIUMTEXT,
 `gender` VARCHAR(1024),
 `period` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `relationship_id` VARCHAR(128),
 `address_id` VARCHAR(128),
 `organization_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table substanceinstance
-- "A homogeneous material with a definite composition."
--
DROP TABLE IF EXISTS `substanceinstance`;
CREATE TABLE `substanceinstance` (
 `identifier` MEDIUMTEXT,
 `expiry` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `quantity_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table plandefinitiondynamicvalue
-- "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
--
DROP TABLE IF EXISTS `plandefinitiondynamicvalue`;
CREATE TABLE `plandefinitiondynamicvalue` (
 `description` MEDIUMTEXT,
 `path` VARCHAR(1024),
 `language` VARCHAR(1024),
 `expression` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table device
-- "This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc."
--
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `lotNumber` VARCHAR(1024),
 `manufacturer` VARCHAR(1024),
 `manufactureDate` VARCHAR(1024),
 `expirationDate` VARCHAR(1024),
 `model` VARCHAR(1024),
 `version` VARCHAR(1024),
 `contact` MEDIUMTEXT,
 `url` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `udi_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `patient_id` VARCHAR(128),
 `owner_id` VARCHAR(128),
 `location_id` VARCHAR(128),
 `safety_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table provenanceentity
-- "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies."
--
DROP TABLE IF EXISTS `provenanceentity`;
CREATE TABLE `provenanceentity` (
 `role` VARCHAR(1024),
 `whatUri` VARCHAR(1024),
 `whatIdentifier` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `whatreference_id` VARCHAR(128),
 `agent_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table codesystemdesignation
-- "A code system resource specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `codesystemdesignation`;
CREATE TABLE `codesystemdesignation` (
 `language` VARCHAR(1024),
 `value` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `use_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table questionnaireresponseitem
-- "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to."
--
DROP TABLE IF EXISTS `questionnaireresponseitem`;
CREATE TABLE `questionnaireresponseitem` (
 `linkId` VARCHAR(1024),
 `definition` MEDIUMTEXT,
 `text` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `subject_id` VARCHAR(128),
 `answer_id` VARCHAR(128),
 `item_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table operationdefinitionparameter
-- "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
--
DROP TABLE IF EXISTS `operationdefinitionparameter`;
CREATE TABLE `operationdefinitionparameter` (
 `name` VARCHAR(1024),
 `use` VARCHAR(1024),
 `min` FLOAT,
 `max` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `type` VARCHAR(1024),
 `searchType` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `profile_id` VARCHAR(128),
 `binding_id` VARCHAR(128),
 `part_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table capabilitystatementevent
-- "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
--
DROP TABLE IF EXISTS `capabilitystatementevent`;
CREATE TABLE `capabilitystatementevent` (
 `category` VARCHAR(1024),
 `mode` VARCHAR(1024),
 `focus` VARCHAR(1024),
 `documentation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `request_id` VARCHAR(128),
 `response_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medication
-- "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
--
DROP TABLE IF EXISTS `medication`;
CREATE TABLE `medication` (
 `resourceType` VARCHAR(64) NOT NULL,
 `status` VARCHAR(64),
 `isBrand` BOOLEAN,
 `isOverTheCounter` BOOLEAN,
 `image` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `code_id` VARCHAR(128),
 `manufacturer_id` VARCHAR(128),
 `form_id` VARCHAR(128),
 `ingredient_id` VARCHAR(128),
 `fhirpackage_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationpackage
-- "This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication."
--
DROP TABLE IF EXISTS `medicationpackage`;
CREATE TABLE `medicationpackage` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `container_id` VARCHAR(128),
 `content_id` VARCHAR(128),
 `batch_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table communication
-- "An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition."
--
DROP TABLE IF EXISTS `communication`;
CREATE TABLE `communication` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `notDone` BOOLEAN,
 `sent` VARCHAR(1024),
 `received` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `definition_id` VARCHAR(128),
 `basedon_id` VARCHAR(128),
 `partof_id` VARCHAR(128),
 `notdonereason_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `medium_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `recipient_id` VARCHAR(128),
 `topic_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `sender_id` VARCHAR(128),
 `reasoncode_id` VARCHAR(128),
 `reasonreference_id` VARCHAR(128),
 `payload_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table practitionerrolenotavailable
-- "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time."
--
DROP TABLE IF EXISTS `practitionerrolenotavailable`;
CREATE TABLE `practitionerrolenotavailable` (
 `description` MEDIUMTEXT,
 `during` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table measure
-- "The Measure resource provides the definition of a quality measure."
--
DROP TABLE IF EXISTS `measure`;
CREATE TABLE `measure` (
 `resourceType` VARCHAR(64) NOT NULL,
 `url` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `version` VARCHAR(1024),
 `name` VARCHAR(1024),
 `title` VARCHAR(1024),
 `status` VARCHAR(64),
 `experimental` BOOLEAN,
 `date` VARCHAR(1024),
 `publisher` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `purpose` VARCHAR(1024),
 `usage` VARCHAR(1024),
 `approvalDate` VARCHAR(1024),
 `lastReviewDate` VARCHAR(1024),
 `effectivePeriod` MEDIUMTEXT,
 `copyright` VARCHAR(16000),
 `disclaimer` VARCHAR(1024),
 `riskAdjustment` VARCHAR(1024),
 `rateAggregation` VARCHAR(1024),
 `rationale` VARCHAR(1024),
 `clinicalRecommendationStatement` VARCHAR(1024),
 `improvementNotation` VARCHAR(1024),
 `definition` MEDIUMTEXT,
 `guidance` VARCHAR(1024),
 `set` VARCHAR(1024),
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `usecontext_id` VARCHAR(128),
 `jurisdiction_id` VARCHAR(128),
 `topic_id` VARCHAR(128),
 `contributor_id` VARCHAR(128),
 `contact_id` VARCHAR(128),
 `relatedartifact_id` VARCHAR(128),
 `library_id` VARCHAR(128),
 `scoring_id` VARCHAR(128),
 `compositescoring_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `group_id` VARCHAR(128),
 `supplementaldata_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table eligibilityresponsebenefitbalance
-- "This resource provides eligibility and plan details from the processing of an Eligibility resource."
--
DROP TABLE IF EXISTS `eligibilityresponsebenefitbalance`;
CREATE TABLE `eligibilityresponsebenefitbalance` (
 `excluded` BOOLEAN,
 `name` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `category_id` VARCHAR(128),
 `subcategory_id` VARCHAR(128),
 `network_id` VARCHAR(128),
 `unit_id` VARCHAR(128),
 `term_id` VARCHAR(128),
 `financial_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table narrative
-- "A human-readable formatted text, including images."
--
DROP TABLE IF EXISTS `narrative`;
CREATE TABLE `narrative` (
 `status` VARCHAR(64),
 `div` MEDIUMTEXT NOT NULL,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table allergyintolerancereaction
-- "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance."
--
DROP TABLE IF EXISTS `allergyintolerancereaction`;
CREATE TABLE `allergyintolerancereaction` (
 `description` MEDIUMTEXT,
 `onset` VARCHAR(1024),
 `severity` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `substance_id` VARCHAR(128),
 `manifestation_id` VARCHAR(128),
 `exposureroute_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table conceptmapunmapped
-- "A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models."
--
DROP TABLE IF EXISTS `conceptmapunmapped`;
CREATE TABLE `conceptmapunmapped` (
 `mode` VARCHAR(1024),
 `code` VARCHAR(1024),
 `display` VARCHAR(1024),
 `url` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitfinancial
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitfinancial`;
CREATE TABLE `explanationofbenefitfinancial` (
 `allowedUnsignedInt` FLOAT,
 `allowedString` VARCHAR(1024),
 `usedUnsignedInt` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `type_id` VARCHAR(128),
 `allowedmoney_id` VARCHAR(128),
 `usedmoney_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table messageheadersource
-- "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
--
DROP TABLE IF EXISTS `messageheadersource`;
CREATE TABLE `messageheadersource` (
 `name` VARCHAR(1024),
 `software` VARCHAR(1024),
 `version` VARCHAR(1024),
 `contact` MEDIUMTEXT,
 `endpoint` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table testreportteardown
-- "A summary of information based on the results of executing a TestScript."
--
DROP TABLE IF EXISTS `testreportteardown`;
CREATE TABLE `testreportteardown` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `action_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table processrequestitem
-- "This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources."
--
DROP TABLE IF EXISTS `processrequestitem`;
CREATE TABLE `processrequestitem` (
 `sequenceLinkId` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table codesystemconcept
-- "A code system resource specifies a set of codes drawn from one or more code systems."
--
DROP TABLE IF EXISTS `codesystemconcept`;
CREATE TABLE `codesystemconcept` (
 `code` VARCHAR(1024),
 `display` VARCHAR(1024),
 `definition` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `designation_id` VARCHAR(128),
 `property_id` VARCHAR(128),
 `concept_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table claimitem
-- "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
--
DROP TABLE IF EXISTS `claimitem`;
CREATE TABLE `claimitem` (
 `sequence` FLOAT,
 `careTeamLinkId` VARCHAR(1024),
 `diagnosisLinkId` VARCHAR(1024),
 `procedureLinkId` VARCHAR(1024),
 `informationLinkId` VARCHAR(1024),
 `servicedDate` VARCHAR(1024),
 `servicedPeriod` MEDIUMTEXT,
 `factor` FLOAT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `programcode_id` VARCHAR(128),
 `locationcodeableconcept_id` VARCHAR(128),
 `locationaddress_id` VARCHAR(128),
 `locationreference_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `unitprice_id` VARCHAR(128),
 `net_id` VARCHAR(128),
 `udi_id` VARCHAR(128),
 `bodysite_id` VARCHAR(128),
 `subsite_id` VARCHAR(128),
 `encounter_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table practitionerroleavailabletime
-- "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time."
--
DROP TABLE IF EXISTS `practitionerroleavailabletime`;
CREATE TABLE `practitionerroleavailabletime` (
 `daysOfWeek` VARCHAR(1024),
 `allDay` BOOLEAN,
 `availableStartTime` VARCHAR(1024),
 `availableEndTime` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table claimresponsesubdetail
-- "This resource provides the adjudication details from the processing of a Claim resource."
--
DROP TABLE IF EXISTS `claimresponsesubdetail`;
CREATE TABLE `claimresponsesubdetail` (
 `sequenceLinkId` FLOAT,
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `adjudication_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table encounterstatushistory
-- "An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient."
--
DROP TABLE IF EXISTS `encounterstatushistory`;
CREATE TABLE `encounterstatushistory` (
 `status` VARCHAR(64),
 `period` MEDIUMTEXT NOT NULL,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table patientanimal
-- "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
--
DROP TABLE IF EXISTS `patientanimal`;
CREATE TABLE `patientanimal` (
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `species_id` VARCHAR(128),
 `breed_id` VARCHAR(128),
 `genderstatus_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationdispense
-- "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
--
DROP TABLE IF EXISTS `medicationdispense`;
CREATE TABLE `medicationdispense` (
 `resourceType` VARCHAR(64) NOT NULL,
 `identifier` MEDIUMTEXT,
 `status` VARCHAR(64),
 `whenPrepared` VARCHAR(1024),
 `whenHandedOver` VARCHAR(1024),
 `note` MEDIUMTEXT,
 `notDone` BOOLEAN,
 `contained` MEDIUMTEXT,
 `extension` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `implicitRules` VARCHAR(1024),
 `language` VARCHAR(1024),
 `partof_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `medicationcodeableconcept_id` VARCHAR(128),
 `medicationreference_id` VARCHAR(128),
 `subject_id` VARCHAR(128),
 `context_id` VARCHAR(128),
 `supportinginformation_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 `authorizingprescription_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `quantity_id` VARCHAR(128),
 `dayssupply_id` VARCHAR(128),
 `destination_id` VARCHAR(128),
 `receiver_id` VARCHAR(128),
 `dosageinstruction_id` VARCHAR(128),
 `substitution_id` VARCHAR(128),
 `detectedissue_id` VARCHAR(128),
 `notdonereasoncodeableconcept_id` VARCHAR(128),
 `notdonereasonreference_id` VARCHAR(128),
 `eventhistory_id` VARCHAR(128),
 `text_id` VARCHAR(128),
 `meta_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table reference
-- "A reference from one resource to another."
--
DROP TABLE IF EXISTS `reference`;
CREATE TABLE `reference` (
 `reference` VARCHAR(1024),
 `identifier` MEDIUMTEXT,
 `display` VARCHAR(1024),
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 PRIMARY KEY (id)
);
--
-- Table structure for table requestgroupaction
-- "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
--
DROP TABLE IF EXISTS `requestgroupaction`;
CREATE TABLE `requestgroupaction` (
 `label` VARCHAR(1024),
 `title` VARCHAR(1024),
 `description` MEDIUMTEXT,
 `textEquivalent` VARCHAR(1024),
 `timingDateTime` VARCHAR(1024),
 `timingPeriod` MEDIUMTEXT,
 `timingDuration` MEDIUMTEXT,
 `timingRange` MEDIUMTEXT,
 `timingTiming` MEDIUMTEXT,
 `groupingBehavior` VARCHAR(1024),
 `selectionBehavior` VARCHAR(1024),
 `requiredBehavior` VARCHAR(1024),
 `precheckBehavior` VARCHAR(1024),
 `cardinalityBehavior` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `code_id` VARCHAR(128),
 `documentation_id` VARCHAR(128),
 `condition_id` VARCHAR(128),
 `relatedaction_id` VARCHAR(128),
 `participant_id` VARCHAR(128),
 `type_id` VARCHAR(128),
 `resource_id` VARCHAR(128),
 `action_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table messagedefinitionallowedresponse
-- "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted."
--
DROP TABLE IF EXISTS `messagedefinitionallowedresponse`;
CREATE TABLE `messagedefinitionallowedresponse` (
 `situation` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `message_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table medicationrequestdispenserequest
-- "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
--
DROP TABLE IF EXISTS `medicationrequestdispenserequest`;
CREATE TABLE `medicationrequestdispenserequest` (
 `validityPeriod` MEDIUMTEXT,
 `numberOfRepeatsAllowed` FLOAT,
 `expectedSupplyDuration` MEDIUMTEXT,
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `quantity_id` VARCHAR(128),
 `performer_id` VARCHAR(128),
 PRIMARY KEY (id)
);
--
-- Table structure for table explanationofbenefitadditem
-- "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
--
DROP TABLE IF EXISTS `explanationofbenefitadditem`;
CREATE TABLE `explanationofbenefitadditem` (
 `sequenceLinkId` VARCHAR(1024),
 `noteNumber` VARCHAR(1024),
 `modifierExtension` MEDIUMTEXT,
 `id` VARCHAR(128) NOT NULL,
 `extension` MEDIUMTEXT,
 `db_container_id` VARCHAR(128) NOT NULL,
 `revenue_id` VARCHAR(128),
 `category_id` VARCHAR(128),
 `service_id` VARCHAR(128),
 `modifier_id` VARCHAR(128),
 `fee_id` VARCHAR(128),
 `adjudication_id` VARCHAR(128),
 `detail_id` VARCHAR(128),
 PRIMARY KEY (id)
);