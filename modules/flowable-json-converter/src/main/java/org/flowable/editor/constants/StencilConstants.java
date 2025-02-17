/* Licensed under the Apache License, Version 2.0 (the "License");
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
 */
package org.flowable.editor.constants;

/**
 * @author Tijs Rademakers
 * @author Zheng Ji
 */
public interface StencilConstants {

    // stencil items
    final String STENCIL_EVENT_START_NONE = "StartNoneEvent";
    final String STENCIL_EVENT_START_TIMER = "StartTimerEvent";
    final String STENCIL_EVENT_START_MESSAGE = "StartMessageEvent";
    final String STENCIL_EVENT_START_SIGNAL = "StartSignalEvent";
    final String STENCIL_EVENT_START_ERROR = "StartErrorEvent";
    final String STENCIL_EVENT_START_CONDITIONAL = "StartConditionalEvent";
    final String STENCIL_EVENT_START_ESCALATION = "StartEscalationEvent";

    final String STENCIL_EVENT_END_NONE = "EndNoneEvent";
    final String STENCIL_EVENT_END_ERROR = "EndErrorEvent";
    final String STENCIL_EVENT_END_ESCALATION = "EndEscalationEvent";
    final String STENCIL_EVENT_END_CANCEL = "EndCancelEvent";
    final String STENCIL_EVENT_END_TERMINATE = "EndTerminateEvent";

    final String STENCIL_SUB_PROCESS = "SubProcess";
    final String STENCIL_COLLAPSED_SUB_PROCESS = "CollapsedSubProcess";
    final String STENCIL_EVENT_SUB_PROCESS = "EventSubProcess";
    final String STENCIL_ADHOC_SUB_PROCESS = "AdhocSubProcess";
    final String STENCIL_CALL_ACTIVITY = "CallActivity";

    final String STENCIL_POOL = "Pool";
    final String STENCIL_LANE = "Lane";

    final String STENCIL_TASK_BUSINESS_RULE = "BusinessRule";
    final String STENCIL_TASK_MAIL = "MailTask";
    final String STENCIL_TASK_MANUAL = "ManualTask";
    final String STENCIL_TASK_RECEIVE = "ReceiveTask";
    final String STENCIL_TASK_SCRIPT = "ScriptTask";
    final String STENCIL_TASK_SEND = "SendTask";
    final String STENCIL_TASK_SERVICE = "ServiceTask";
    final String STENCIL_TASK_USER = "UserTask";
    final String STENCIL_TASK_CAMEL = "CamelTask";
    final String STENCIL_TASK_MULE = "MuleTask";
    final String STENCIL_TASK_HTTP = "HttpTask";
    final String STENCIL_TASK_SHELL = "ShellTask";
    final String STENCIL_TASK_DECISION = "DecisionTask";

    final String STENCIL_GATEWAY_EXCLUSIVE = "ExclusiveGateway";
    final String STENCIL_GATEWAY_PARALLEL = "ParallelGateway";
    final String STENCIL_GATEWAY_INCLUSIVE = "InclusiveGateway";
    final String STENCIL_GATEWAY_EVENT = "EventGateway";

    final String STENCIL_EVENT_BOUNDARY_TIMER = "BoundaryTimerEvent";
    final String STENCIL_EVENT_BOUNDARY_ERROR = "BoundaryErrorEvent";
    final String STENCIL_EVENT_BOUNDARY_CONDITIONAL = "BoundaryConditionalEvent";
    final String STENCIL_EVENT_BOUNDARY_ESCALATION = "BoundaryEscalationEvent";
    final String STENCIL_EVENT_BOUNDARY_SIGNAL = "BoundarySignalEvent";
    final String STENCIL_EVENT_BOUNDARY_MESSAGE = "BoundaryMessageEvent";
    final String STENCIL_EVENT_BOUNDARY_CANCEL = "BoundaryCancelEvent";
    final String STENCIL_EVENT_BOUNDARY_COMPENSATION = "BoundaryCompensationEvent";

    final String STENCIL_EVENT_CATCH_SIGNAL = "CatchSignalEvent";
    final String STENCIL_EVENT_CATCH_TIMER = "CatchTimerEvent";
    final String STENCIL_EVENT_CATCH_MESSAGE = "CatchMessageEvent";
    final String STENCIL_EVENT_CATCH_CONDITIONAL = "CatchConditionalEvent";

    final String STENCIL_EVENT_THROW_SIGNAL = "ThrowSignalEvent";
    final String STENCIL_EVENT_THROW_ESCALATION = "ThrowEscalationEvent";
    final String STENCIL_EVENT_THROW_NONE = "ThrowNoneEvent";

    final String STENCIL_SEQUENCE_FLOW = "SequenceFlow";
    final String STENCIL_MESSAGE_FLOW = "MessageFlow";
    final String STENCIL_ASSOCIATION = "Association";
    final String STENCIL_DATA_ASSOCIATION = "DataAssociation";

    final String STENCIL_TEXT_ANNOTATION = "TextAnnotation";
    final String STENCIL_DATA_STORE = "DataStore";

    final String PROPERTY_VALUE_YES = "Yes";
    final String PROPERTY_VALUE_NO = "No";

    // stencil properties
    final String PROPERTY_OVERRIDE_ID = "overrideid";
    final String PROPERTY_NAME = "name";
    final String PROPERTY_DOCUMENTATION = "documentation";

    final String PROPERTY_PROCESS_ID = "process_id";
    final String PROPERTY_PROCESS_VERSION = "process_version";
    final String PROPERTY_PROCESS_AUTHOR = "process_author";
    final String PROPERTY_PROCESS_NAMESPACE = "process_namespace";
    final String PROPERTY_PROCESS_HISTORYLEVEL = "process_historylevel";

    final String PROPERTY_IS_EXECUTABLE = "isexecutable";
    final String PROPERTY_IS_EAGER_EXECUTION_FETCHING = "iseagerexecutionfetch";

    final String PROPERTY_PROCESS_POTENTIALSTARTERUSER = "process_potentialstarteruser";
    final String PROPERTY_PROCESS_POTENTIALSTARTERGROUP = "process_potentialstartergroup";

    final String PROPERTY_TIMER_DURATON = "timerdurationdefinition";
    final String PROPERTY_TIMER_DATE = "timerdatedefinition";
    final String PROPERTY_TIMER_CYCLE = "timercycledefinition";
    final String PROPERTY_TIMER_CYCLE_END_DATE = "timerenddatedefinition";

    final String PROPERTY_MESSAGES = "messages";
    final String PROPERTY_MESSAGE_ID = "message_id";
    final String PROPERTY_MESSAGE_NAME = "message_name";
    final String PROPERTY_MESSAGE_ITEM_REF = "message_item_ref";

    final String PROPERTY_MESSAGEREF = "messageref";

    final String PROPERTY_SIGNALREF = "signalref";
    
    final String PROPERTY_CONDITIONAL_EVENT_CONDITION = "conditionaleventcondition";

    final String PROPERTY_ERRORREF = "errorref";
    
    final String PROPERTY_ESCALATION_DEFINITIONS = "escalationdefinitions";
    final String PROPERTY_ESCALATION_DEFINITION_ID = "id";
    final String PROPERTY_ESCALATION_DEFINITION_NAME = "name";
    final String PROPERTY_ESCALATIONREF = "escalationref";

    final String PROPERTY_INTERRUPTING = "interrupting";

    final String PROPERTY_CANCEL_ACTIVITY = "cancelactivity";

    final String PROPERTY_NONE_STARTEVENT_INITIATOR = "initiator";

    final String PROPERTY_ASYNCHRONOUS = "asynchronousdefinition";
    final String PROPERTY_EXCLUSIVE = "exclusivedefinition";

    final String PROPERTY_MULTIINSTANCE_TYPE = "multiinstance_type";
    final String PROPERTY_MULTIINSTANCE_CARDINALITY = "multiinstance_cardinality";
    final String PROPERTY_MULTIINSTANCE_COLLECTION = "multiinstance_collection";
    final String PROPERTY_MULTIINSTANCE_VARIABLE = "multiinstance_variable";
    final String PROPERTY_MULTIINSTANCE_CONDITION = "multiinstance_condition";

    final String PROPERTY_TASK_LISTENERS = "tasklisteners";
    final String PROPERTY_EXECUTION_LISTENERS = "executionlisteners";
    final String PROPERTY_LISTENER_EVENT = "event";
    final String PROPERTY_LISTENER_CLASS_NAME = "className";
    final String PROPERTY_LISTENER_EXPRESSION = "expression";
    final String PROPERTY_LISTENER_DELEGATE_EXPRESSION = "delegateExpression";
    final String PROPERTY_LISTENER_FIELDS = "fields";

    final String PROPERTY_EVENT_LISTENERS = "eventlisteners";
    final String PROPERTY_EVENTLISTENER_VALUE = "eventListeners";
    final String PROPERTY_EVENTLISTENER_EVENTS = "events";
    final String PROPERTY_EVENTLISTENER_EVENT = "event";
    final String PROPERTY_EVENTLISTENER_IMPLEMENTATION = "implementation";
    final String PROPERTY_EVENTLISTENER_RETHROW_EVENT = "rethrowEvent";
    final String PROPERTY_EVENTLISTENER_RETHROW_TYPE = "rethrowType";
    final String PROPERTY_EVENTLISTENER_CLASS_NAME = "className";
    final String PROPERTY_EVENTLISTENER_DELEGATE_EXPRESSION = "delegateExpression";
    final String PROPERTY_EVENTLISTENER_ENTITY_TYPE = "entityType";
    final String PROPERTY_EVENTLISTENER_ERROR_CODE = "errorcode";
    final String PROPERTY_EVENTLISTENER_SIGNAL_NAME = "signalname";
    final String PROPERTY_EVENTLISTENER_MESSAGE_NAME = "messagename";

    final String PROPERTY_FIELD_NAME = "name";
    final String PROPERTY_FIELD_STRING_VALUE = "stringValue";
    final String PROPERTY_FIELD_EXPRESSION = "expression";
    final String PROPERTY_FIELD_STRING = "string";

    final String PROPERTY_FORMKEY = "formkeydefinition";
    final String PROPERTY_FORM_FIELD_VALIDATION = "formfieldvalidation";

    final String PROPERTY_USERTASK_ASSIGNMENT = "usertaskassignment";
    final String PROPERTY_USERTASK_PRIORITY = "prioritydefinition";
    final String PROPERTY_USERTASK_DUEDATE = "duedatedefinition";
    final String PROPERTY_USERTASK_ASSIGNEE = "assignee";
    final String PROPERTY_USERTASK_OWNER = "owner";
    final String PROPERTY_USERTASK_CANDIDATE_USERS = "candidateUsers";
    final String PROPERTY_USERTASK_CANDIDATE_GROUPS = "candidateGroups";
    final String PROPERTY_USERTASK_CATEGORY = "categorydefinition";

    final String PROPERTY_SERVICETASK_CLASS = "servicetaskclass";
    final String PROPERTY_SERVICETASK_EXPRESSION = "servicetaskexpression";
    final String PROPERTY_SERVICETASK_DELEGATE_EXPRESSION = "servicetaskdelegateexpression";
    final String PROPERTY_SERVICETASK_RESULT_VARIABLE = "servicetaskresultvariable";
    final String PROPERTY_SERVICETASK_FIELDS = "servicetaskfields";
    final String PROPERTY_SERVICETASK_FIELD_NAME = "name";
    final String PROPERTY_SERVICETASK_FIELD_STRING_VALUE = "stringValue";
    final String PROPERTY_SERVICETASK_FIELD_STRING = "string";
    final String PROPERTY_SERVICETASK_FIELD_EXPRESSION = "expression";
    final String PROPERTY_SERVICETASK_TRIGGERABLE = "servicetasktriggerable";
    final String PROPERTY_SERVICETASK_USE_LOCAL_SCOPE_FOR_RESULT_VARIABLE = "servicetaskuselocalscopeforresultvariable";
    final String PROPERTY_FORM_PROPERTIES = "formproperties";
    final String PROPERTY_FORM_ID = "id";
    final String PROPERTY_FORM_NAME = "name";
    final String PROPERTY_FORM_TYPE = "type";
    final String PROPERTY_FORM_EXPRESSION = "expression";
    final String PROPERTY_FORM_VARIABLE = "variable";
    final String PROPERTY_FORM_DEFAULT = "default";
    final String PROPERTY_FORM_DATE_PATTERN = "datePattern";
    final String PROPERTY_FORM_REQUIRED = "required";
    final String PROPERTY_FORM_READABLE = "readable";
    final String PROPERTY_FORM_WRITABLE = "writable";
    final String PROPERTY_FORM_ENUM_VALUES = "enumValues";
    final String PROPERTY_FORM_ENUM_VALUES_NAME = "name";
    final String PROPERTY_FORM_ENUM_VALUES_ID = "id";

    final String PROPERTY_DATA_PROPERTIES = "dataproperties";
    final String PROPERTY_DATA_ID = "dataproperty_id";
    final String PROPERTY_DATA_NAME = "dataproperty_name";
    final String PROPERTY_DATA_TYPE = "dataproperty_type";
    final String PROPERTY_DATA_VALUE = "dataproperty_value";

    final String PROPERTY_SCRIPT_FORMAT = "scriptformat";
    final String PROPERTY_SCRIPT_TEXT = "scripttext";
    final String PROPERTY_SCRIPT_AUTO_STORE_VARIABLES = "scriptautostorevariables";

    final String PROPERTY_RULETASK_CLASS = "ruletask_class";
    final String PROPERTY_RULETASK_VARIABLES_INPUT = "ruletask_variables_input";
    final String PROPERTY_RULETASK_RESULT = "ruletask_result";
    final String PROPERTY_RULETASK_RULES = "ruletask_rules";
    final String PROPERTY_RULETASK_EXCLUDE = "ruletask_exclude";

    final String PROPERTY_MAILTASK_HEADERS = "mailtaskheaders";
    final String PROPERTY_MAILTASK_TO = "mailtaskto";
    final String PROPERTY_MAILTASK_FROM = "mailtaskfrom";
    final String PROPERTY_MAILTASK_SUBJECT = "mailtasksubject";
    final String PROPERTY_MAILTASK_CC = "mailtaskcc";
    final String PROPERTY_MAILTASK_BCC = "mailtaskbcc";
    final String PROPERTY_MAILTASK_TEXT = "mailtasktext";
    final String PROPERTY_MAILTASK_HTML = "mailtaskhtml";
    final String PROPERTY_MAILTASK_CHARSET = "mailtaskcharset";

    final String PROPERTY_CALLACTIVITY_CALLEDELEMENT = "callactivitycalledelement";
    final String PROPERTY_CALLACTIVITY_CALLEDELEMENTTYPE = "callactivitycalledelementtype";
    final String PROPERTY_CALLACTIVITY_IN = "callactivityinparameters";
    final String PROPERTY_CALLACTIVITY_OUT = "callactivityoutparameters";
    final String PROPERTY_CALLACTIVITY_FALLBACK_TO_DEFAULT_TENANT = "callactivityfallbacktodefaulttenant";
    final String PROPERTY_CALLACTIVITY_INHERIT_VARIABLES = "callactivityinheritvariables";
    final String PROPERTY_CALLACTIVITY_SAME_DEPLOYMENT = "callactivitysamedeployment";
    final String PROPERTY_CALLACTIVITY_PROCESS_INSTANCE_NAME = "callactivityprocessinstancename";
    final String PROPERTY_CALLACTIVITY_BUSINESS_KEY = "callactivitybusinesskey";
    final String PROPERTY_CALLACTIVITY_INHERIT_BUSINESS_KEY = "callactivityinheritbusinesskey";
    final String PROPERTY_CALLACTIVITY_USE_LOCALSCOPE_FOR_OUTPARAMETERS = "callactivityuselocalscopeforoutparameters";
    final String PROPERTY_CALLACTIVITY_COMPLETE_ASYNC = "callactivitycompleteasync";
    final String PROPERTY_IOPARAMETER_SOURCE = "source";
    final String PROPERTY_IOPARAMETER_SOURCE_EXPRESSION = "sourceExpression";
    final String PROPERTY_IOPARAMETER_TARGET = "target";

    final String PROPERTY_CAMELTASK_CAMELCONTEXT = "cameltaskcamelcontext";

    final String PROPERTY_MULETASK_ENDPOINT_URL = "muletaskendpointurl";
    final String PROPERTY_MULETASK_LANGUAGE = "muletasklanguage";
    final String PROPERTY_MULETASK_PAYLOAD_EXPRESSION = "muletaskpayloadexpression";
    final String PROPERTY_MULETASK_RESULT_VARIABLE = "muletaskresultvariable";

    final String PROPERTY_SEQUENCEFLOW_DEFAULT = "defaultflow";
    final String PROPERTY_SEQUENCEFLOW_CONDITION = "conditionsequenceflow";
    final String PROPERTY_SEQUENCEFLOW_ORDER = "sequencefloworder";
    final String PROPERTY_FORM_REFERENCE = "formreference";

    final String PROPERTY_MESSAGE_DEFINITIONS = "messagedefinitions";
    final String PROPERTY_MESSAGE_DEFINITION_ID = "id";
    final String PROPERTY_MESSAGE_DEFINITION_NAME = "name";
    final String PROPERTY_MESSAGE_DEFINITION_ITEM_REF = "message_item_ref";

    final String PROPERTY_SIGNAL_DEFINITIONS = "signaldefinitions";
    final String PROPERTY_SIGNAL_DEFINITION_ID = "id";
    final String PROPERTY_SIGNAL_DEFINITION_NAME = "name";
    final String PROPERTY_SIGNAL_DEFINITION_SCOPE = "scope";

    final String PROPERTY_TERMINATE_ALL = "terminateall";
    final String PROPERTY_TERMINATE_MULTI_INSTANCE = "terminateMultiInstance";

    final String PROPERTY_DECISIONTABLE_REFERENCE = "decisiontaskdecisiontablereference";
    final String PROPERTY_DECISIONTABLE_REFERENCE_ID = "decisiontablereferenceid";
    final String PROPERTY_DECISIONTABLE_REFERENCE_NAME = "decisiontablereferencename";
    final String PROPERTY_DECISIONTABLE_REFERENCE_KEY = "decisionTableReferenceKey";
    final String PROPERTY_DECISIONTABLE_THROW_ERROR_NO_HITS = "decisiontaskthrowerroronnohits";
    final String PROPERTY_DECISIONTABLE_THROW_ERROR_NO_HITS_KEY = "decisionTaskThrowErrorOnNoHits";
    final String PROPERTY_DECISIONTABLE_FALLBACK_TO_DEFAULT_TENANT = "decisiontaskfallbacktodefaulttenant";
    final String PROPERTY_DECISIONTABLE_FALLBACK_TO_DEFAULT_TENANT_KEY = "fallbackToDefaultTenant";

    final String PROPERTY_HTTPTASK_REQ_METHOD = "httptaskrequestmethod";
    final String PROPERTY_HTTPTASK_REQ_URL = "httptaskrequesturl";
    final String PROPERTY_HTTPTASK_REQ_HEADERS = "httptaskrequestheaders";
    final String PROPERTY_HTTPTASK_REQ_BODY  = "httptaskrequestbody";
    final String PROPERTY_HTTPTASK_REQ_BODY_ENCODING  = "httptaskrequestbodyencoding";
    final String PROPERTY_HTTPTASK_REQ_TIMEOUT = "httptaskrequesttimeout";
    final String PROPERTY_HTTPTASK_REQ_DISALLOW_REDIRECTS = "httptaskdisallowredirects";
    final String PROPERTY_HTTPTASK_REQ_FAIL_STATUS_CODES = "httptaskfailstatuscodes";
    final String PROPERTY_HTTPTASK_REQ_HANDLE_STATUS_CODES = "httptaskhandlestatuscodes";
    final String PROPERTY_HTTPTASK_REQ_IGNORE_EXCEPTION = "httptaskignoreexception";
    final String PROPERTY_HTTPTASK_RESPONSE_VARIABLE_NAME = "httptaskresponsevariablename";
    final String PROPERTY_HTTPTASK_SAVE_REQUEST_VARIABLES = "httptasksaverequestvariables";
    final String PROPERTY_HTTPTASK_SAVE_RESPONSE_PARAMETERS = "httptasksaveresponseparameters";
    final String PROPERTY_HTTPTASK_RESULT_VARIABLE_PREFIX = "httptaskresultvariableprefix";
    final String PROPERTY_HTTPTASK_SAVE_RESPONSE_TRANSIENT = "httptasksaveresponseparameterstransient";
    final String PROPERTY_HTTPTASK_SAVE_RESPONSE_AS_JSON = "httptasksaveresponseasjson";

    final String PROPERTY_SKIP_EXPRESSION = "skipexpression";

    final String PROPERTY_SHELLTASK_COMMAND = "shellcommand";
    final String PROPERTY_SHELLTASK_ARG1 = "shellarg1";
    final String PROPERTY_SHELLTASK_ARG2 = "shellarg2";
    final String PROPERTY_SHELLTASK_ARG3 = "shellarg3";
    final String PROPERTY_SHELLTASK_ARG4 = "shellarg4";
    final String PROPERTY_SHELLTASK_ARG5 = "shellarg5";
    final String PROPERTY_SHELLTASK_WAIT = "shellwait";
    final String PROPERTY_SHELLTASK_OUTPUT_VARIABLE = "shelloutputvariable";
    final String PROPERTY_SHELLTASK_ERROR_CODE_VARIABLE = "shellerrorcodevariable";
    final String PROPERTY_SHELLTASK_ERROR_REDIRECT = "shellerrorredirect";
    final String PROPERTY_SHELLTASK_CLEAN_ENV = "shellcleanenv";
    final String PROPERTY_SHELLTASK_DIRECTORY = "shelldirectory";

    final String PROPERTY_FOR_COMPENSATION = "isforcompensation";
}
