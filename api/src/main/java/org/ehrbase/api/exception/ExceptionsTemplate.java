package org.ehrbase.api.exception;

import org.ehrbase.api.exception.dto.ExceptionDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExceptionsTemplate {
    public static String BAD_GATEWAY_EXCEPTION = "Bad gateway exception";
    public static String DATA_ACCESS_ERROR = "Data Access Error: ";
    public static String INVALID_CONTENT_FORMAT = "Invalid content format";
    public static String CONNECTION_WITH_ABAC_SERVER_FAILED = "ABAC: Connection with ABAC server failed. Check configuration. Error: ";
    public static String INVALID_TYPE_GIVE_FROM_PRE_OR_POST_AUTHORIZE = "ABAC: Invalid type given from Pre- or PostAuthorize";
    public static String PARAMETERS_WERE_CONFIGURED_BUT_REQUEST_PARAMETERS_ARE_EMPTY = "ABAC: Parameters were configured, but request parameters are empty.";
    public static String AQL_AUDIT_PATIENT_DATA_MALFORMED = "ABAC: AQL audit patient data malformed.";
    public static String AQL_AUDIT_PATIENT_DATA_UNAVAILABLE = "ABAC: AQL audit patient data unavailable.";
    public static String UNEXPECTED_PAYLOAD_TYPE = "ABAC: unexpected payload type";
    public static String UNEXPECTED_EMPTY_RESPONSE_BODY = "ABAC: unexpected empty response body";
    public static String UNEXPECTED_EMPTY_RESPONSE_FROM_COMPOSITION_REQUEST = "ABAC: Unexpected empty response from composition request";
    public static String UNEXPECTED_COMPOSITION_PAYLOAD_OBJECT = "ABAC: unexpected composition payload object";
    public static String UNEXPECTED_EMPTY_RESPONSE_FROM_COMPOSITION_DELETE = "ABAC: unexpected empty response from composition delete";
    public static String INVALID_AUTH_TYPE_GIVEN = "ABAC: invalid auth type given.";
    public static String INVALID_POST_CONTRIBUTION_PAYLOAD = "ABAC: invalid POST contribution payload.";
    public static String AQL_AUDIT_TEMPLATE_DATA_UNAVAILABLE = "ABAC: AQL audit template data unavailable.";
    public static String AQL_AUDIT_TEMPLATE_DATA_MALFORMED = "ABAC: AQL audit template data malformed.";
    public static String INVALID_PATIENT_ATTRIBUTE_CONTENT = "ABAC: Invalid patient attribute content.";
    public static String INVALID_TEMPLATE_ATTRIBUTE_CONTENT = "ABAC: Invalid template attribute content.";
    public static String NO_PROPERTY_SOURCE_FOUND_FOR = "No Property Source found for [%s]"; //1 parameter
    public static String URI_FOR_PLUGIN_ALREADY_REGISTERED_BY_PLUGIN = "Uri [%s] for plugin [%s] already registered by plugin [%s]"; //3 parameters
    public static String IO_EXCEPTION = "IO Exception";
    public static String FAILED_TO_CREATE_COMPOSITION = "Failed to create composition";
    public static String DELETING_OF_COMPOSITION_FAILED = "Deleting of composition failed";
    public static String ERROR_CREATING_EHR_WITH_CUSTOM_ID_AND_OR_STATUS = "Error creating EHR with custom ID and/or status";
    public static String EXCEPTION = "Exception";
    public static String COULD_NT_FETCH_CONTRIBUTION_FOR_EXISTING_COMPOSITION = "Couldn't fetch contribution for existing Composition";
    public static String COMPOSITION_EXISTS_BUT_CAN_T_BE_RETRIEVED_AS_ORIGINAL_VERSION = "Composition exists but can't be retrieved as Original Version.";
    public static String COULD_NT_FETCH_CONTRIBUTION_FOR_EXISTING_EHR_STATUS = "Couldn't fetch contribution for existing EhrStatus";
    public static String NON_UNIQUE_PATIENT_NUMBER_RESULT = "Non unique patient number result";
    public static String NON_UNIQUE_EHR_ID_RESULT = "Non unique EhrId result";
    public static String ADMIN_DELETION_OF_COMPOSITION_AUXILIARY_OBJECTS_FAILED = "Admin deletion of Composition auxiliary objects failed!";
    public static String ADMIN_DELETION_OF_AUDIT_FAILED = "Admin deletion of [%s] Audit failed!";
    public static String FETCHING_ATTESTATION_FAILED = "Fetching attestation failed";
    public static String FETCHING_AUDIT_DETAILS_FAILED = "Fetching audit_details failed";
    public static String TENANT_ID_MISMATCH_CALLING_FOR_ID = "Tenant id mismatch: Calling for id";
    public static String COULD_NT_STORE_AUDIT_DETAILS_DB_PROBLEM = "Couldn't store auditDetails, DB problem";
    public static String TENANT_ID_MISMATCH = "Tenant id mismatch";
    public static String DATABASE_INCONSISTENCY = "DB inconsistency";

    public static String PROBLEM_WITH_SQL_STATEMENT_OR_INPUT = "Problem with SQL statement or input";
    public static String VERSION_MAP_GENERATION_FAILED = "Version Map generation failed";
    public static String DATABASE_INCONSISTENCY_COULD_NT_RETRIEVE_REFERENCED_AUDIT = "DB inconsistency: couldn't retrieve referenced audit";
    public static String PROBLEM_PROCESSING_COMPOSITION_ACCESS_IS_DELETED = "Problem processing CompositionAccess.isDeleted(..)";
    public static String INCONSISTENT_PARTY_IDENTIFIED_UUID = "Inconsistent PartyIdentified UUID: [%s]"; //1 parameter
    public static String CANNOT_CREATE_USER = "Cannot create User";
    public static String COULD_NOT_CREATE_AN_EHR_WITH_GIVEN_PARAMETERS = "Could not create an EHR with given parameters.";
    public static String PROBLEM_UPDATING_EHR_STATUS = "Problem updating EHR_STATUS";
    public static String PROBLEM_CREATING_REVISION_HISTORY = "Problem creating RevisionHistory";
    public static String RUNTIME_EXCEPTION = "Runtime Exception";
    public static String CANNOT_FETCH_SYSTEM_ID = "Can not fetch System Id";
    public static String INVALID_NULL_VALUED_CONTRIBUTION = "Invalid null valued contribution.";
    public static String ILLEGAL_TO_COMMIT_AUDIT_DETAILS_ACCESS_WITHOUT_SETTING_MANDATORY_FIELDS = "Illegal to commit AuditDetailsAccess without setting mandatory fields.";
    public static String ILLEGAL_TO_COMMIT_THE_CONTRIBUTIONS_AUDIT_DETAILS_ACCESS_WITHOUT_SETTING_MANDATORY_FIELDS = "Illegal to commit the contribution's AuditDetailsAccess without setting mandatory fields.";
    public static String DB_INCONSISTENCY_NO_STATUS_FOR_GIVEN_EHR_ID = "DB inconsistency. No STATUS for given EHR ID: [%d]";//1 parameter
    public static String ERROR_CREATING_VERSION_MAP_OF_EHR_STATUS = "Error creating version map of EHR_STATUS";
    public static String PROBLEM_COMPARING_TIMESTAMPS_OF_EHR_STATUS_VERSIONS = "Problem comparing timestamps of EHR_STATUS versions";
    public static String COULD_NOT_GENERATE_WEB_TEMPLATE = "Could not generate web template";
    public static String PROBLEM_EXECUTING_DATABASE_OPERATION = "Problem executing database operation";
    public static String PROBLEM_WHEN_UPDATING_DB_ENTRY = "Problem when updating DB entry";
    public static String INVALID_UPDATE_COMPOSITION_CALL = "INTERNAL: Invalid updateComposition call to updateComposition without Transaction time and/or force flag arguments";
    public static String FETCHING_CONTRIBUTION_FAILED = "Fetching contribution failed";
    public static String COULD_NOT_STORE_CONTRIBUTION = "Couldn't store contribution";
    public static String MISSING_MANDATORY_COMMITTER_ID = "Missing mandatory committer ID";
    public static String MISSING_MANDATORY_SYSTEM_ID = "Missing mandatory system ID";
    public static String COULD_NOT_UPDATE_AUDIT_DETAILS = "Couldn't update auditDetails";
    public static String ADMIN_DELETION_OF_STATUS_FAILED_UNEXPECTED_RESULT = "Admin deletion of Status failed! Unexpected result.";
    public static String ADMIN_DELETION_OF_STATUS_FAILED = "Admin deletion of Status failed!";
    public static String BUILDING_TEMPLATE_RESPONSE_DATA_FAILED = "Building template response data failed";
    public static String ERROR_RETRIEVING_EHR_STATUS = "Error retrieving EHR_STATUS";
    public static String THIS_COMMIT_IS_NOT_LEGAL = "INTERNAL: this commit is not legal";
    public static String THIS_UPDATE_IS_NOT_LEGAL = "INTERNAL: this update is not legal";
    public static String CAN_NOT_UPDATE_STATUS_WITH_INVALID_CONTRIBUTION_ID = "Can't update status with invalid contribution ID.";
    public static String THIS_DELETE_IS_NOT_LEGAL = "INTERNAL: this delete is not legal";
    public static String ADMIN_DELETION_OF_EHR_FAILED = "Admin deletion of EHR failed!";
    public static String COMMIT_WITHOUT_TRANSACTION_TIME_IS_NOT_LEGAL = "INTERNAL: commit without transaction time is not legal";
    public static String THIS_UPDATE_SIGNATURE_IS_NOT_VALID = "INTERNAL: this update signature is not valid";
    public static String UPDATING_TENANT_ID_IS_NOT_ALLOWED = "Updating tenant id[%s] is not allowed";//1 parameter
    public static String PROVIDED_TENANT_ID_DOES_NOT_MATCH_SESSION = "Provided tenant id[%s] does not match session tenant id[%s]";//2 parameters
    public static String UNHANDLED_PARTY_TYPE_DETECTED = "Unhandled Party type detected: [%s]";//1 parameter
    public static String INCONSISTENT_PARTY_TYPE_DETECTED = "Inconsistent Party type detected: [%s]";//1 parameter
    public static String ERROR_ON_INTERNAL_CONTRIBUTION_HANDLING_FOR_COMPOSITION_CREATION = "Error on internal contribution handling for composition creation.";
    public static String FAILED_TO_UPDATE_COMPOSITION_MISSING_MANDATORY_AUDIT_META_DATA = "Failed to update composition, missing mandatory audit meta data.";
    public static String UPDATE_FAILED_ON_COMPOSITION = "Update failed on composition: [%s]";//1 parameter
    public static String DELETE_FAILED_ON_COMPOSITION = "Delete failed on composition: [%s]";//1 parameter
    public static String INVALID_VERSION_NUMBER_CALCULATED = "Invalid version number calculated.";
    public static String INCONSISTENT_COMPOSITION_DATA_NO_VERSION_1_AVAILABLE = "Inconsistent composition data, no version 1 available";

    //InvalidApiParameterException
    public static String WRONG_CONTENT_TYPE_IN_HEADER_REQUEST = "Wrong Content-Type header in request";
    public static String TEMPLATE_ID_NEEDS_TO_BE_SPECIFIED_FOR_FORMAT = "Template Id needs to be specified for format: [%s]";//1 parameter
    public static String SUBJECT_ID_OR_SUBJECT_NAMESPACE_MISSING = "subjectId or subjectNamespace is missing";
    public static String SUBJECT_ID_IS_MISSING = "subjectId is missing";
    public static String SUBJECT_NAMESPACE_IS_MISSING = "subjectNamespace is missing";
    public static String SQL_QUERIES_ARE_NO_LONGER_SUPPORTED = "SQL queries are no longer supported";
    public static String NO_QUERY_PARAMETER_SUPPLIED = "No query parameter supplied";
    public static String FORMAT_NOT_SUPPORTED = "Format [%s] not supported";//1 parameter
    public static String A_VALID_VERSION_UUID_MUST_BE_PROVIDED = "A valid versionUid must be provided";
    public static String VERSION_BRANCHING_IS_NOT_SUPPORTED = "Version branching is not supported";
    public static String THE_VALUE_OF_PARAMETER_IS_INVALID = "The value of path parameter is invalid";
    public static String EHR_ID_FORMAT_NOT_A_UUID = "EHR ID format not a UUID";
    public static String UPDATE_OF_EHR_STATUS_FAILED = "Update of EHR_STATUS failed";
    public static String INCORRECT_VERSION_USE_THE_SEMVER_FORMAT = "Incorrect version. Use the SEMVER format.";
    public static String A_QUALIFIED_VERSION_HAS_TO_BE_SPECIFIED = "A qualified version has to be specified";
    public static String NO_AQL_QUERY_PROVIDED = "No aql query provided";
    public static String VERSION_UID_PARAMETER_HAS_WRONG_FORMAT = "VERSION UID parameter has wrong format.";
    public static String COULD_NOT_RETRIEVE_COMPOSITION_WITH_GIVEN_PARAMETERS = "Couldn't retrieve Composition with given parameters";
    public static String COULD_NOT_RETRIEVE_EHR_STATUS_WITH_GIVEN_PARAMETERS = "Couldn't retrieve EhrStatus with given parameters";
    public static String VERSION_CANNOT_BE_NEGATIVE = "Version can't be negative.";
    public static String STORING_EHR_STATUS_FAILED = "Input EHR couldn't be stored; Storing EHR_STATUS failed";
    public static String COULD_NT_MARSHALL_GIVEN_EHR_STATUS = "Couldn't marshall given EHR_STATUS / OTHER_DETAILS, content probably breaks RM rules";
    public static String CANNOT_UPDATE_COMPOSITION_TO_HAVE_DIFFERENT_TEMPLATE = "Can't update composition to have different template.";
    public static String CANNOT_UPDATE_COMPOSITION_WITH_WRONG_TEMPLATE_VERSION = "Can't update composition with wrong template version bump.";
    public static String INVALID_CONTRIBUTION_MUST_HAVE_ONE_VERSION_OBJECT = "Invalid Contribution, must have at least one Version object.";
    public static String INVALID_VERSION_OBJECT_IN_CONTRIBUTION = "Invalid version object in contribution. [%s] not supported.";//1 parameter
    public static String INVALID_CHANGE_TYPE_EHR_STATUS_CAN_T_BE_CREATED = "Invalid change type. EHR_STATUS can't be manually created.";
    public static String INVALID_CHANGE_TYPE_EHR_STATUS_CAN_T_BE_DELETED = "Invalid change type. EHR_STATUS can't be deleted.";
    public static String INVALID_VERSION_CHANGE_TYPE_CREATION = "Invalid version. Change type CREATION, but also set \"preceding_version_uid\" attribute";
    public static String INVALID_VERSION_CHANGE_TYPE_MODIFICATION = "Invalid version. Change type MODIFICATION, but without \"preceding_version_uid\" attribute";
    public static String CHANGE_TYPE_IS_NOT_VALID = "Change type [%s] is not valid";//1 parameter
    public static String INVALID_CHANGE_TYPE = "Invalid change type. EHR_STATUS can't be deleted.";
    public static String INVALID_TEMPLATE_INPUT_CONTENT = "Invalid template input content";
    public static String COULD_NOT_PARSE_INPUT_TEMPLATE = "Could not parse input template";
    public static String REQUEST_OPERATIONAL_TEMPLATE_TYPE_IS_NOT_SUPPORTED = "Requested operational template type is not supported";
    public static String PARTY_ID_ALREADY_USED = "Supplied partyId[%s] is used by a different EHR in the same partyNamespace[%s].";//2 parameters

    //NotAcceptableException
    public static String ONLY_COMPOSISIONS_IN_XML_OR_JSON_ARE_SUPPORTED = "Only compositions in XML or JSON are supported at the moment";
    public static String WRONG_ACCEPT_HEADER_IN_REQUEST = "Wrong Accept header in request";
    public static String CURRENTLY_ONLY_XML_IS_ALLOWED = "Currently only xml (or emtpy for fallback) is allowed";

    //ObjectNotFoundException
    public static String EHR_WITH_ID_IS_NOT_FOUND = "EHR with id [%s] is not found";//1 parameter
    public static String EHR_WITH_ID_DOES_NOT_EXIST = "EHR with id [%s] does not exist.";//1 parameter
    public static String NO_EHR_WITH_THE_SUPPLIED_EHR_ID = "No EHR with the supplied ehr_id or no COMPOSITION with the supplied preceding_version_uid.";
    public static String NO_COMPOSITION_VERSION_MATCHING_THE_TIMESTAMP_CONDITION = "No composition version matching the timestamp condition";
    public static String COULD_NOT_RETRIEVE_COMPOSITION = "Couldn't retrieve composition";
    public static String FOLDER_WITH_ID_AND_PATH_DOES_NOT_EXIST = "Folder with id %s and path %s does not exist.";//2 parameters
    public static String FOLDER_FOR_EHR_ID_AND_PATH_DOES_NOT_EXIST = "The FOLDER for ehrId %s and path %s does not exist.";//2 parameters
    public static String NO_EHR_WITH_THIS_ID_CAN_BE_FOUND = "No EHR with this ID can be found";
    public static String NO_EHR_WITH_SUPPLIED_SUBJECT_PARAMETERS_FOUND = "No EHR with supplied subject parameters found";
    public static String EHR_STATUS_NOT_FOUND = "EHR_STATUS not found";
    public static String EHR_WITH_SPECIFIED_ID_DOES_NOT_EXIST = "The EHR with the specified id does not exist";
    public static String COULD_NOT_RETRIEVE_AQL = "Could not retrieve AQL {0}/{1}";//2 parameters
    public static String NO_COMPOSITION_WITH_THIS_ID_CAN_BE_FOUND = "No composition with this ID [%s] can be found.";//1 parameter
    public static String NO_EHR_FOUND_WITH_GIVEN_ID = "No EHR found with given ID: [%s]";//1 parameter
    public static String CONTRIBUTION_WITH_GIVEN_ID_DOES_NOT_EXIST = "Contribution with given ID does not exist";
    public static String COULD_NOT_FIND_OBJECT_MATCHING_ID = "Couldn't find object matching id: [%s]";//1 parameter
    public static String COMPOSITION_NOT_FOUND_OR_IS_INVALID_DB_CONTEXT = "Composition not found or is invalid DB content";
    public static String NO_VERSION_AVAILABLE_PRIOR_TO_DATE =  "There are no versions available prior to date [%s] for the the composition with id: [%s]";//2 parameters
    public static String NO_COMPOSITION_WITH_GIVEN_ID_FOUND =  "No composition with given ID found";
    public static String COULD_NOT_FIND_EHR_STATUS_VERSION_MATCHING_GIVEN_TIMESTAMP =  "Could not find EHR_STATUS version matching given timestamp";
    public static String NO_VERSIONED_EHR_STATUS_WITH_GIVEN_VERSION = "No VERSIONED_EHR_STATUS with given version: [%s]";//1 parameter
    public static String COULD_NOT_FIND_COMPOSITION = "Could not find composition: [%s]";//1 parameter
    public static String ERROR_WHILE_RETRIEVING_COMPOSITION =  "Error while retrieving composition";
    public static String EHR_WITH_ID_DOES_NOT_CONTAIN_COMPOSITION_WITH_ID =  "EHR with id [%s] does not contain composition with id [%s]";//2 parameters
    public static String NO_VERSIONED_COMPOSITION_WITH_GIVEN_VERSION = "No VERSIONED_COMPOSITION with given version: [%s]";//1 parameter
    public static String COULD_NOT_RETRIEVE_STORED_QUERY_FOR_QUALIFIED_NAME = "Could not retrieve stored query for qualified name: [%s] version: [%s]";//2 parameters
    public static String TEMPLATE_WITH_THE_SPECIFIED_ID_DOES_NOT_EXIST =  "Template with the specified id does not exist";
    public static String OPERATIONAL_TEMPLATE_WITH_ID_IS_NOT_FOUND =  "Operational template with id [%s] is not found.";//1 parameter
    public static String TEMPLATE_WITH_ID_DOES_NOT_EXIST =  "Template with id [%s] does not exist.";//1 parameter
    public static String FILE_WITH_NAME_DOES_NOT_EXIST =  "File with name [%s] does not exist.";//1 parameter
    //PreconditionFailedException
    public static String IF_MATCH_HEADER_DOES_NOT_MATCH_LATEST_EXISTING_VERSION =  "If-Match header does not match latest existing version";
    public static String UUID_FROM_INPUT_MUST_MATCH_GIVEN_VERSIONED_OBJECT_UID_IN_REQUEST_URL =  "UUID from input must match given versioned_object_uid in request URL";
    public static String GIVEN_IF_MATCH_HEADER_DOES_NOT_MATCH_LATEST_EXISTING_VERSION =  "Given If-Match header does not match latest existing version";
    public static String NOT_MATCH_LATEST_VERSION = "If-Match version_uid does not match latest version.";
    public static String GIVEN_PRECEDING_VERSION_UID_FOR_COMPOSITION_OBJECT_DOES_NOT_MATCH_LATEST_EXISTING_VERSION = "Given preceding_version_uid for COMPOSITION object does not match latest existing version";
    public static String GIVEN_PRECEDING_VERSION_UID_FOR_EHR_STATUS_OBJECT_DOES_NOT_MATCH_LATEST_EXISTING_VERSION = "Given preceding_version_uid for EHR_STATUS object does not match latest existing version";
    public static String EHR_WITH_ID_DOES_NOT_CONTAIN_A_DIRECTORY = "EHR with id [%s] does not contain a directory.";//1 parameter

    //StateConflictException
    public static String EHR_WITH_ID_DOES_NOT_ALLOW_MODIFICATION = "EHR with id [%s] does not allow modification";//1 parameter
    public static String EHR_WITH_THIS_ID_ALREADY_EXISTS = "EHR with this ID already exists";
    public static String EHR_WITH_ID_ALREADY_CONTAIN_A_DIRECTORY = "EHR with id [%s] already contain a directory.";//1 parameter
    public static String SPECIFIED_PARTY_HAS_ALREADY_AN_EHR_SET = "Specified party has already an EHR set (partyId=[%s])";//1 parameter
    public static String OPERATIONAL_TEMPLATE_WITH_THIS_TEMPLATE_ID_ALREADY_EXISTS = "Operational template with this template ID already exists: [%s]";//1 parameter
    public static String VERSION_ALREADY_EXISTS = "Version already exists";

    //UnprocessableEntityException
    public static String CANNOT_DELETE_TEMPLATE_SINCE_THE_FOLLOWING_CONPOSITION_ARE_STILL_USING_IT = "Cannot delete template [%s] since the following compositions are still using it [%s]";//2 parameters

    //ValidationException
    public static String SUBJECT_IS_REQUIRED = "subject is required";
    public static String EXTERNAL_REF_ID_IS_REQUIRED = "ExternalRef ID is required";
    public static String EXTERNAL_REF_NAMESPACE_IS_REQUIRED = "ExternalRef namespace is required";
    public static String SUBJECTS_NAMESPACE_FORMAT_INVALID = "Subject's namespace format invalid";

    //RuntimeException
    public static String FAILED_TO_INJECT_SHARED_RMPATHQUERY_CACHE = "Failed to inject shared RMPathQuery cache";
    public static String PRE_RELEASE_WAS_PROVIDED_WHEN_WAS_REQUESTED = "Pre-release [%s] was provided when [%s] was requested";//2 parameters
    public static String VERSION_WAS_PROVIDED_WHEN_PRE_RELEASE_WAS_REQUESTED = "Version [%s] was provided when pre-release [%s] was requested";//2 parameters


    public static Map<String, ExceptionDto> errorMap = new HashMap<>();

    public void populateExceptionMap() {
        errorMap.put(BAD_GATEWAY_EXCEPTION, new ExceptionDto( 1, new ArrayList<>() ) );
        errorMap.put(DATA_ACCESS_ERROR, new ExceptionDto( 2, new ArrayList<>() ) );
        errorMap.put(INVALID_CONTENT_FORMAT, new ExceptionDto( 3, new ArrayList<>() ) );

        errorMap.put(CONNECTION_WITH_ABAC_SERVER_FAILED, new ExceptionDto( 4, new ArrayList<>() ) );
        errorMap.put(INVALID_TYPE_GIVE_FROM_PRE_OR_POST_AUTHORIZE, new ExceptionDto( 5, new ArrayList<>() ) );
        errorMap.put(PARAMETERS_WERE_CONFIGURED_BUT_REQUEST_PARAMETERS_ARE_EMPTY, new ExceptionDto( 6, new ArrayList<>() ) );
        errorMap.put(AQL_AUDIT_PATIENT_DATA_MALFORMED, new ExceptionDto( 7, new ArrayList<>() ) );
        errorMap.put(AQL_AUDIT_PATIENT_DATA_UNAVAILABLE, new ExceptionDto( 8, new ArrayList<>() ) );

        errorMap.put(UNEXPECTED_PAYLOAD_TYPE, new ExceptionDto( 9, new ArrayList<>() ) );
        errorMap.put(UNEXPECTED_EMPTY_RESPONSE_BODY, new ExceptionDto( 10, new ArrayList<>() ) );
        errorMap.put(UNEXPECTED_EMPTY_RESPONSE_FROM_COMPOSITION_REQUEST, new ExceptionDto( 11, new ArrayList<>() ) );
        errorMap.put(UNEXPECTED_COMPOSITION_PAYLOAD_OBJECT, new ExceptionDto( 12, new ArrayList<>() ) );
        errorMap.put(UNEXPECTED_EMPTY_RESPONSE_FROM_COMPOSITION_DELETE, new ExceptionDto( 13, new ArrayList<>() ) );

        errorMap.put(INVALID_AUTH_TYPE_GIVEN, new ExceptionDto( 14, new ArrayList<>() ) );
        errorMap.put(INVALID_POST_CONTRIBUTION_PAYLOAD, new ExceptionDto( 15, new ArrayList<>() ) );
        errorMap.put(INVALID_POST_CONTRIBUTION_PAYLOAD, new ExceptionDto( 16, new ArrayList<>() ) );
        errorMap.put(AQL_AUDIT_TEMPLATE_DATA_UNAVAILABLE, new ExceptionDto( 17, new ArrayList<>() ) );
        errorMap.put(AQL_AUDIT_TEMPLATE_DATA_MALFORMED, new ExceptionDto( 18, new ArrayList<>() ) );

        errorMap.put(INVALID_PATIENT_ATTRIBUTE_CONTENT, new ExceptionDto( 19, new ArrayList<>() ) );
        errorMap.put(INVALID_TEMPLATE_ATTRIBUTE_CONTENT, new ExceptionDto( 20, new ArrayList<>() ) );
        errorMap.put(NO_PROPERTY_SOURCE_FOUND_FOR, new ExceptionDto( 21, new ArrayList<>() ) );//1 parameter
        errorMap.put(URI_FOR_PLUGIN_ALREADY_REGISTERED_BY_PLUGIN, new ExceptionDto( 22, new ArrayList<>() ) );//3 parameters
        errorMap.put(IO_EXCEPTION, new ExceptionDto( 23, new ArrayList<>() ) );
        errorMap.put(FAILED_TO_CREATE_COMPOSITION, new ExceptionDto( 24, new ArrayList<>() ) );
        errorMap.put(DELETING_OF_COMPOSITION_FAILED, new ExceptionDto( 25, new ArrayList<>() ) );

        errorMap.put(ERROR_CREATING_EHR_WITH_CUSTOM_ID_AND_OR_STATUS, new ExceptionDto( 26, new ArrayList<>() ) );
        errorMap.put(EXCEPTION, new ExceptionDto( 27, new ArrayList<>() ) );
        errorMap.put(COULD_NT_FETCH_CONTRIBUTION_FOR_EXISTING_COMPOSITION, new ExceptionDto( 28, new ArrayList<>() ) );
        errorMap.put(COULD_NT_FETCH_CONTRIBUTION_FOR_EXISTING_EHR_STATUS, new ExceptionDto( 29, new ArrayList<>() ) );
        errorMap.put(NON_UNIQUE_PATIENT_NUMBER_RESULT, new ExceptionDto( 30, new ArrayList<>() ) );
        errorMap.put(NON_UNIQUE_EHR_ID_RESULT, new ExceptionDto( 31, new ArrayList<>() ) );

        errorMap.put(ADMIN_DELETION_OF_COMPOSITION_AUXILIARY_OBJECTS_FAILED, new ExceptionDto( 32, new ArrayList<>() ) );
        errorMap.put(ADMIN_DELETION_OF_AUDIT_FAILED, new ExceptionDto( 33, new ArrayList<>() ) );
        errorMap.put(FETCHING_ATTESTATION_FAILED, new ExceptionDto( 34, new ArrayList<>() ) );
        errorMap.put(FETCHING_AUDIT_DETAILS_FAILED, new ExceptionDto( 35, new ArrayList<>() ) );
        errorMap.put(TENANT_ID_MISMATCH_CALLING_FOR_ID, new ExceptionDto( 36, new ArrayList<>() ) );
        errorMap.put(COULD_NT_STORE_AUDIT_DETAILS_DB_PROBLEM, new ExceptionDto( 37, new ArrayList<>() ) );

        errorMap.put(TENANT_ID_MISMATCH, new ExceptionDto( 38, new ArrayList<>() ) );
        errorMap.put(DATABASE_INCONSISTENCY, new ExceptionDto( 39, new ArrayList<>() ) );
        errorMap.put(PROBLEM_WITH_SQL_STATEMENT_OR_INPUT, new ExceptionDto( 40, new ArrayList<>() ) );
        errorMap.put(VERSION_MAP_GENERATION_FAILED, new ExceptionDto( 41, new ArrayList<>() ) );
        errorMap.put(DATABASE_INCONSISTENCY_COULD_NT_RETRIEVE_REFERENCED_AUDIT, new ExceptionDto( 42, new ArrayList<>() ) );
        errorMap.put(PROBLEM_PROCESSING_COMPOSITION_ACCESS_IS_DELETED, new ExceptionDto( 43, new ArrayList<>() ) );

        errorMap.put(INCONSISTENT_PARTY_IDENTIFIED_UUID, new ExceptionDto( 44, new ArrayList<>() ) );//1 parameter
        errorMap.put(CANNOT_CREATE_USER, new ExceptionDto( 45, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_CREATE_AN_EHR_WITH_GIVEN_PARAMETERS, new ExceptionDto( 46, new ArrayList<>() ) );
        errorMap.put(PROBLEM_UPDATING_EHR_STATUS, new ExceptionDto( 47, new ArrayList<>() ) );
        errorMap.put(PROBLEM_CREATING_REVISION_HISTORY, new ExceptionDto( 48, new ArrayList<>() ) );

        errorMap.put(RUNTIME_EXCEPTION, new ExceptionDto( 49, new ArrayList<>() ) );
        errorMap.put(CANNOT_FETCH_SYSTEM_ID, new ExceptionDto( 50, new ArrayList<>() ) );
        errorMap.put(INVALID_NULL_VALUED_CONTRIBUTION, new ExceptionDto( 51, new ArrayList<>() ) );
        errorMap.put(ILLEGAL_TO_COMMIT_AUDIT_DETAILS_ACCESS_WITHOUT_SETTING_MANDATORY_FIELDS, new ExceptionDto( 52, new ArrayList<>() ) );
        errorMap.put(ILLEGAL_TO_COMMIT_THE_CONTRIBUTIONS_AUDIT_DETAILS_ACCESS_WITHOUT_SETTING_MANDATORY_FIELDS, new ExceptionDto( 53, new ArrayList<>() ) );
        errorMap.put(DB_INCONSISTENCY_NO_STATUS_FOR_GIVEN_EHR_ID, new ExceptionDto( 54, new ArrayList<>() ) );

        errorMap.put(ERROR_CREATING_VERSION_MAP_OF_EHR_STATUS, new ExceptionDto( 55, new ArrayList<>() ) );
        errorMap.put(PROBLEM_COMPARING_TIMESTAMPS_OF_EHR_STATUS_VERSIONS, new ExceptionDto( 56, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_GENERATE_WEB_TEMPLATE, new ExceptionDto( 57, new ArrayList<>() ) );
        errorMap.put(PROBLEM_EXECUTING_DATABASE_OPERATION, new ExceptionDto( 58, new ArrayList<>() ) );
        errorMap.put(PROBLEM_WHEN_UPDATING_DB_ENTRY, new ExceptionDto( 59, new ArrayList<>() ) );
        errorMap.put(INVALID_UPDATE_COMPOSITION_CALL, new ExceptionDto( 60, new ArrayList<>() ) );
        errorMap.put(FETCHING_CONTRIBUTION_FAILED, new ExceptionDto( 61, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_STORE_CONTRIBUTION, new ExceptionDto( 62, new ArrayList<>() ) );

        errorMap.put(MISSING_MANDATORY_COMMITTER_ID, new ExceptionDto( 63, new ArrayList<>() ) );
        errorMap.put(MISSING_MANDATORY_SYSTEM_ID, new ExceptionDto( 64, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_UPDATE_AUDIT_DETAILS, new ExceptionDto( 65, new ArrayList<>() ) );
        errorMap.put(ADMIN_DELETION_OF_STATUS_FAILED_UNEXPECTED_RESULT, new ExceptionDto( 66, new ArrayList<>() ) );
        errorMap.put(ADMIN_DELETION_OF_STATUS_FAILED, new ExceptionDto( 67, new ArrayList<>() ) );
        errorMap.put(BUILDING_TEMPLATE_RESPONSE_DATA_FAILED, new ExceptionDto( 68, new ArrayList<>() ) );

        errorMap.put(ERROR_RETRIEVING_EHR_STATUS, new ExceptionDto( 69, new ArrayList<>() ) );
        errorMap.put(THIS_COMMIT_IS_NOT_LEGAL, new ExceptionDto( 70, new ArrayList<>() ) );
        errorMap.put(THIS_UPDATE_IS_NOT_LEGAL, new ExceptionDto( 71, new ArrayList<>() ) );
        errorMap.put(CAN_NOT_UPDATE_STATUS_WITH_INVALID_CONTRIBUTION_ID, new ExceptionDto( 72, new ArrayList<>() ) );
        errorMap.put(THIS_DELETE_IS_NOT_LEGAL, new ExceptionDto( 73, new ArrayList<>() ) );
        errorMap.put(ADMIN_DELETION_OF_EHR_FAILED, new ExceptionDto( 74, new ArrayList<>() ) );
        errorMap.put(COMMIT_WITHOUT_TRANSACTION_TIME_IS_NOT_LEGAL, new ExceptionDto( 75, new ArrayList<>() ) );

        errorMap.put(THIS_UPDATE_SIGNATURE_IS_NOT_VALID, new ExceptionDto( 76, new ArrayList<>() ) );
        errorMap.put(UPDATING_TENANT_ID_IS_NOT_ALLOWED, new ExceptionDto( 77, new ArrayList<>() ) );//1 parameter
        errorMap.put(PROVIDED_TENANT_ID_DOES_NOT_MATCH_SESSION, new ExceptionDto( 78, new ArrayList<>() ) );//2 parameter
        errorMap.put(UNHANDLED_PARTY_TYPE_DETECTED, new ExceptionDto( 79, new ArrayList<>() ) );//1 parameter
        errorMap.put(INCONSISTENT_PARTY_TYPE_DETECTED, new ExceptionDto( 80, new ArrayList<>() ) );//1 parameter
        errorMap.put(ERROR_ON_INTERNAL_CONTRIBUTION_HANDLING_FOR_COMPOSITION_CREATION, new ExceptionDto( 81, new ArrayList<>() ) );

        errorMap.put(FAILED_TO_UPDATE_COMPOSITION_MISSING_MANDATORY_AUDIT_META_DATA, new ExceptionDto( 82, new ArrayList<>() ) );
        errorMap.put(UPDATE_FAILED_ON_COMPOSITION, new ExceptionDto( 83, new ArrayList<>() ) );//1 parameter
        errorMap.put(DELETE_FAILED_ON_COMPOSITION, new ExceptionDto( 84, new ArrayList<>() ) );//1 parameter
        errorMap.put(INVALID_VERSION_NUMBER_CALCULATED, new ExceptionDto( 85, new ArrayList<>() ) );
        errorMap.put(INCONSISTENT_COMPOSITION_DATA_NO_VERSION_1_AVAILABLE, new ExceptionDto( 86, new ArrayList<>() ) );

        //InvalidApiParameterException
        errorMap.put(WRONG_CONTENT_TYPE_IN_HEADER_REQUEST, new ExceptionDto( 87, new ArrayList<>() ) );
        errorMap.put(TEMPLATE_ID_NEEDS_TO_BE_SPECIFIED_FOR_FORMAT, new ExceptionDto( 88, new ArrayList<>() ) );
        errorMap.put(SUBJECT_ID_OR_SUBJECT_NAMESPACE_MISSING, new ExceptionDto( 89, new ArrayList<>() ) );
        errorMap.put(SUBJECT_ID_IS_MISSING, new ExceptionDto( 90, new ArrayList<>() ) );
        errorMap.put(SUBJECT_NAMESPACE_IS_MISSING, new ExceptionDto( 91, new ArrayList<>() ) );
        errorMap.put(SQL_QUERIES_ARE_NO_LONGER_SUPPORTED, new ExceptionDto( 92, new ArrayList<>() ) );
        errorMap.put(NO_QUERY_PARAMETER_SUPPLIED, new ExceptionDto( 93, new ArrayList<>() ) );
        errorMap.put(FORMAT_NOT_SUPPORTED, new ExceptionDto( 94, new ArrayList<>() ) );
        errorMap.put(A_VALID_VERSION_UUID_MUST_BE_PROVIDED, new ExceptionDto( 95, new ArrayList<>() ) );
        errorMap.put(VERSION_BRANCHING_IS_NOT_SUPPORTED, new ExceptionDto( 96, new ArrayList<>() ) );
        errorMap.put(THE_VALUE_OF_PARAMETER_IS_INVALID, new ExceptionDto( 97, new ArrayList<>() ) );

        errorMap.put(EHR_ID_FORMAT_NOT_A_UUID, new ExceptionDto( 98, new ArrayList<>() ) );
        errorMap.put(UPDATE_OF_EHR_STATUS_FAILED, new ExceptionDto( 99, new ArrayList<>() ) );
        errorMap.put(INCORRECT_VERSION_USE_THE_SEMVER_FORMAT, new ExceptionDto( 100, new ArrayList<>() ) );
        errorMap.put(A_QUALIFIED_VERSION_HAS_TO_BE_SPECIFIED, new ExceptionDto( 101, new ArrayList<>() ) );
        errorMap.put(NO_AQL_QUERY_PROVIDED, new ExceptionDto( 102, new ArrayList<>() ) );
        errorMap.put(VERSION_UID_PARAMETER_HAS_WRONG_FORMAT, new ExceptionDto( 103, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_RETRIEVE_COMPOSITION_WITH_GIVEN_PARAMETERS, new ExceptionDto( 104, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_RETRIEVE_EHR_STATUS_WITH_GIVEN_PARAMETERS, new ExceptionDto( 105, new ArrayList<>() ) );
        errorMap.put(VERSION_CANNOT_BE_NEGATIVE, new ExceptionDto( 106, new ArrayList<>() ) );

        errorMap.put(STORING_EHR_STATUS_FAILED, new ExceptionDto( 107, new ArrayList<>() ) );
        errorMap.put(COULD_NT_MARSHALL_GIVEN_EHR_STATUS, new ExceptionDto( 108, new ArrayList<>() ) );
        errorMap.put(CANNOT_UPDATE_COMPOSITION_TO_HAVE_DIFFERENT_TEMPLATE, new ExceptionDto( 109, new ArrayList<>() ) );
        errorMap.put(CANNOT_UPDATE_COMPOSITION_WITH_WRONG_TEMPLATE_VERSION, new ExceptionDto( 110, new ArrayList<>() ) );
        errorMap.put(INVALID_CONTRIBUTION_MUST_HAVE_ONE_VERSION_OBJECT, new ExceptionDto( 111, new ArrayList<>() ) );
        errorMap.put(INVALID_VERSION_OBJECT_IN_CONTRIBUTION, new ExceptionDto( 112, new ArrayList<>() ) );//1 parameter
        errorMap.put(INVALID_CHANGE_TYPE_EHR_STATUS_CAN_T_BE_CREATED, new ExceptionDto( 113, new ArrayList<>() ) );
        errorMap.put(INVALID_CHANGE_TYPE_EHR_STATUS_CAN_T_BE_DELETED, new ExceptionDto( 114, new ArrayList<>() ) );
        errorMap.put(INVALID_VERSION_CHANGE_TYPE_CREATION, new ExceptionDto( 115, new ArrayList<>() ) );
        errorMap.put(INVALID_VERSION_CHANGE_TYPE_MODIFICATION, new ExceptionDto( 116, new ArrayList<>() ) );
        errorMap.put(CHANGE_TYPE_IS_NOT_VALID, new ExceptionDto( 117, new ArrayList<>() ) );//1 parameter
        errorMap.put(INVALID_CHANGE_TYPE, new ExceptionDto( 118, new ArrayList<>() ) );

        errorMap.put(INVALID_TEMPLATE_INPUT_CONTENT, new ExceptionDto( 119, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_PARSE_INPUT_TEMPLATE, new ExceptionDto( 120, new ArrayList<>() ) );
        errorMap.put(REQUEST_OPERATIONAL_TEMPLATE_TYPE_IS_NOT_SUPPORTED, new ExceptionDto( 121, new ArrayList<>() ) );
        errorMap.put(PARTY_ID_ALREADY_USED, new ExceptionDto( 122, new ArrayList<>() ) );//2 parameters

        //NotAcceptableException
        errorMap.put(ONLY_COMPOSISIONS_IN_XML_OR_JSON_ARE_SUPPORTED, new ExceptionDto( 124, new ArrayList<>() ) );
        errorMap.put(WRONG_ACCEPT_HEADER_IN_REQUEST, new ExceptionDto( 125, new ArrayList<>() ) );
        errorMap.put(CURRENTLY_ONLY_XML_IS_ALLOWED, new ExceptionDto( 126, new ArrayList<>() ) );

        //ObjectNotFoundException
        errorMap.put(EHR_WITH_ID_IS_NOT_FOUND, new ExceptionDto( 127, new ArrayList<>() ) );//1 parameter
        errorMap.put(EHR_WITH_ID_DOES_NOT_EXIST, new ExceptionDto( 128, new ArrayList<>() ) );//1 parameter
        errorMap.put(NO_EHR_WITH_THE_SUPPLIED_EHR_ID, new ExceptionDto( 129, new ArrayList<>() ) );
        errorMap.put(NO_COMPOSITION_VERSION_MATCHING_THE_TIMESTAMP_CONDITION, new ExceptionDto( 130, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_RETRIEVE_COMPOSITION, new ExceptionDto( 131, new ArrayList<>() ) );
        errorMap.put(FOLDER_WITH_ID_AND_PATH_DOES_NOT_EXIST, new ExceptionDto( 132, new ArrayList<>() ) );//2 parameters
        errorMap.put(FOLDER_FOR_EHR_ID_AND_PATH_DOES_NOT_EXIST, new ExceptionDto( 133, new ArrayList<>() ) );//2 parameters
        errorMap.put(NO_EHR_WITH_THIS_ID_CAN_BE_FOUND, new ExceptionDto( 134, new ArrayList<>() ) );
        errorMap.put(NO_EHR_WITH_SUPPLIED_SUBJECT_PARAMETERS_FOUND, new ExceptionDto( 135, new ArrayList<>() ) );
        errorMap.put(EHR_STATUS_NOT_FOUND, new ExceptionDto( 136, new ArrayList<>() ) );
        errorMap.put(EHR_WITH_SPECIFIED_ID_DOES_NOT_EXIST, new ExceptionDto( 137, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_RETRIEVE_AQL, new ExceptionDto( 138, new ArrayList<>() ) );//2 parameters
        errorMap.put(NO_COMPOSITION_WITH_THIS_ID_CAN_BE_FOUND, new ExceptionDto( 139, new ArrayList<>() ) );//1 parameter
        errorMap.put(NO_EHR_FOUND_WITH_GIVEN_ID, new ExceptionDto( 140, new ArrayList<>() ) );//1 parameter

        errorMap.put(CONTRIBUTION_WITH_GIVEN_ID_DOES_NOT_EXIST, new ExceptionDto( 141, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_FIND_OBJECT_MATCHING_ID, new ExceptionDto( 142, new ArrayList<>() ) );//1 parameter
        errorMap.put(COMPOSITION_NOT_FOUND_OR_IS_INVALID_DB_CONTEXT, new ExceptionDto( 143, new ArrayList<>() ) );
        errorMap.put(NO_VERSION_AVAILABLE_PRIOR_TO_DATE, new ExceptionDto( 144, new ArrayList<>() ) );//2 parameters
        errorMap.put(NO_COMPOSITION_WITH_GIVEN_ID_FOUND, new ExceptionDto( 145, new ArrayList<>() ) );
        errorMap.put(COULD_NOT_FIND_EHR_STATUS_VERSION_MATCHING_GIVEN_TIMESTAMP, new ExceptionDto( 146, new ArrayList<>() ) );
        errorMap.put(NO_VERSIONED_EHR_STATUS_WITH_GIVEN_VERSION, new ExceptionDto( 147, new ArrayList<>() ) );//1 parameter
        errorMap.put(COULD_NOT_FIND_COMPOSITION, new ExceptionDto( 148, new ArrayList<>() ) );//1 parameter
        errorMap.put(ERROR_WHILE_RETRIEVING_COMPOSITION, new ExceptionDto( 149, new ArrayList<>() ) );
        errorMap.put(EHR_WITH_ID_DOES_NOT_CONTAIN_COMPOSITION_WITH_ID, new ExceptionDto( 150, new ArrayList<>() ) );//2 parameters

        errorMap.put(NO_VERSIONED_COMPOSITION_WITH_GIVEN_VERSION, new ExceptionDto( 151, new ArrayList<>() ) );//1 parameter
        errorMap.put(COULD_NOT_RETRIEVE_STORED_QUERY_FOR_QUALIFIED_NAME, new ExceptionDto( 152, new ArrayList<>() ) );//2 parameters
        errorMap.put(TEMPLATE_WITH_THE_SPECIFIED_ID_DOES_NOT_EXIST, new ExceptionDto( 153, new ArrayList<>() ) );
        errorMap.put(OPERATIONAL_TEMPLATE_WITH_ID_IS_NOT_FOUND, new ExceptionDto( 154, new ArrayList<>() ) );//1 parameter
        errorMap.put(TEMPLATE_WITH_ID_DOES_NOT_EXIST, new ExceptionDto( 155, new ArrayList<>() ) );//1 parameter
        errorMap.put(FILE_WITH_NAME_DOES_NOT_EXIST, new ExceptionDto( 156, new ArrayList<>() ) );//1 parameter

        //PreconditionFailedException
        errorMap.put(IF_MATCH_HEADER_DOES_NOT_MATCH_LATEST_EXISTING_VERSION, new ExceptionDto( 157, new ArrayList<>() ) );
        errorMap.put(UUID_FROM_INPUT_MUST_MATCH_GIVEN_VERSIONED_OBJECT_UID_IN_REQUEST_URL, new ExceptionDto( 158, new ArrayList<>() ) );
        errorMap.put(GIVEN_IF_MATCH_HEADER_DOES_NOT_MATCH_LATEST_EXISTING_VERSION, new ExceptionDto( 159, new ArrayList<>() ) );
        errorMap.put(NOT_MATCH_LATEST_VERSION, new ExceptionDto( 160, new ArrayList<>() ) );
        errorMap.put(GIVEN_PRECEDING_VERSION_UID_FOR_COMPOSITION_OBJECT_DOES_NOT_MATCH_LATEST_EXISTING_VERSION, new ExceptionDto( 161, new ArrayList<>() ) );
        errorMap.put(GIVEN_PRECEDING_VERSION_UID_FOR_EHR_STATUS_OBJECT_DOES_NOT_MATCH_LATEST_EXISTING_VERSION, new ExceptionDto( 162, new ArrayList<>() ) );
        errorMap.put(EHR_WITH_ID_DOES_NOT_CONTAIN_A_DIRECTORY, new ExceptionDto( 163, new ArrayList<>() ) );//1 parameter

        //StateConflictException
        errorMap.put(EHR_WITH_ID_DOES_NOT_ALLOW_MODIFICATION, new ExceptionDto( 164, new ArrayList<>() ) );//1 parameter
        errorMap.put(EHR_WITH_THIS_ID_ALREADY_EXISTS, new ExceptionDto( 165, new ArrayList<>() ) );
        errorMap.put(EHR_WITH_ID_ALREADY_CONTAIN_A_DIRECTORY, new ExceptionDto( 166, new ArrayList<>() ) );
        errorMap.put(SPECIFIED_PARTY_HAS_ALREADY_AN_EHR_SET, new ExceptionDto( 167, new ArrayList<>() ) );
        errorMap.put(OPERATIONAL_TEMPLATE_WITH_THIS_TEMPLATE_ID_ALREADY_EXISTS, new ExceptionDto( 168, new ArrayList<>() ) );
        errorMap.put(VERSION_ALREADY_EXISTS, new ExceptionDto( 169, new ArrayList<>() ) );

        //UnprocessableEntityException
        errorMap.put(CANNOT_DELETE_TEMPLATE_SINCE_THE_FOLLOWING_CONPOSITION_ARE_STILL_USING_IT, new ExceptionDto( 170, new ArrayList<>() ) );//2 parameters

        //ValidationException
        errorMap.put(SUBJECT_IS_REQUIRED, new ExceptionDto( 171, new ArrayList<>() ) );
        errorMap.put(EXTERNAL_REF_ID_IS_REQUIRED, new ExceptionDto( 172, new ArrayList<>() ) );
        errorMap.put(EXTERNAL_REF_NAMESPACE_IS_REQUIRED, new ExceptionDto( 173, new ArrayList<>() ) );
        errorMap.put(SUBJECTS_NAMESPACE_FORMAT_INVALID, new ExceptionDto( 174, new ArrayList<>() ) );

        //RuntimeException
        errorMap.put(FAILED_TO_INJECT_SHARED_RMPATHQUERY_CACHE, new ExceptionDto( 175, new ArrayList<>() ) );
        errorMap.put(PRE_RELEASE_WAS_PROVIDED_WHEN_WAS_REQUESTED, new ExceptionDto( 176, new ArrayList<>() ) );//2 parameters
        errorMap.put(VERSION_WAS_PROVIDED_WHEN_PRE_RELEASE_WAS_REQUESTED, new ExceptionDto( 177, new ArrayList<>() ) );//2 parameters

    }
}