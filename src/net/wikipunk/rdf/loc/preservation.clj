(ns net.wikipunk.rdf.loc.preservation
  "An umbrella scheme to collocate all the preservation vocabularies."
  {:madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasTopMemberOfMADSScheme
   [:loc.preservation/signatureEncoding
    :loc.preservation/environmentCharacteristic
    :loc.preservation/signatureMethod
    :loc.preservation/objectCategory
    :loc.preservation/eventOutcome
    :loc.preservation/hardwareType
    :loc.preservation/linkingEnvironmentRole
    :loc.preservation/storageMedium
    :loc.preservation/contentLocationType
    :loc.preservation/eventRelatedObjectRole
    :loc.preservation/preservationLevelType
    :loc.preservation/formatRegistryRole
    :loc.preservation/copyrightStatus
    :loc.preservation/eventRelatedAgentRole
    :loc.preservation/rightsRelatedAgentRole
    :loc.preservation/rightsBasis
    :loc.preservation/eventType
    :loc.preservation/inhibitorTarget
    :loc.preservation/actionsGranted
    :loc.preservation/relationshipType
    :loc.preservation/relationshipSubType
    :loc.preservation/preservationLevelRole
    :loc.preservation/environmentRegistryRole
    :loc.preservation/softwareType
    :loc.preservation/environmentFunctionType
    :loc.preservation/agentType
    :loc.preservation/cryptographicHashFunctions
    :loc.preservation/inhibitorType
    :loc.preservation/environmentPurpose
    :loc.preservation/linkingAgentRoleEvent],
   :rdf/ns-prefix-map {"loc.preservation"
                       "http://id.loc.gov/vocabulary/preservation/"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://id.loc.gov/vocabulary/preservation",
   :rdfa/prefix "loc.preservation",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/",
   :rdfs/comment
   "An umbrella scheme to collocate all the preservation vocabularies.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preservation Schemes (all)"},
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange "http://id.loc.gov/vocabulary/preservation",
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange "http://id.loc.gov/vocabulary/preservation",
     :rdf/type           :cs/ChangeSet}],
   :skos/hasTopConcept ["Linking Environment Role"
                        "Linking Agent Role (Event) (DEPRECATED)"
                        "Signature Method"
                        "Cryptographic Hash Functions"
                        "Preservation Level Type"
                        "Relationship Type"
                        "Event Related Agent Role"
                        "Relationship Subtype"
                        "Signature Encoding"
                        "Preservation Level Role"
                        "Content Location Type"
                        "Event Related Object Role"
                        "Inhibitor Type"
                        "Rights Related Agent Role"
                        "Object Category"
                        "Agent Type"
                        "Environment Function Type"
                        "Storage Medium"
                        "Environment Purpose (DEPRECATED)"
                        "Copyright Status"
                        "Actions Granted (DEPRECATED)"
                        "Rights Basis"
                        "Software Type (DEPRECATED)"
                        "Inhibitor Target (DEPRECATED)"
                        "Event Outcome"
                        "Hardware Type (DEPRECATED)"
                        "Format Registry Role"
                        "Event Type"
                        "Environment Characteristic"
                        "Environment Registry Role"]})

(def actionsGranted
  "Actions Granted (DEPRECATED)"
  {:db/ident   :loc.preservation/actionsGranted,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Actions Granted (DEPRECATED)"}})

(def agentType
  "Agent Type"
  {:db/ident   :loc.preservation/agentType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Agent Type"}})

(def contentLocationType
  "Content Location Type"
  {:db/ident   :loc.preservation/contentLocationType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Content Location Type"}})

(def copyrightStatus
  "Copyright Status"
  {:db/ident   :loc.preservation/copyrightStatus,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copyright Status"}})

(def cryptographicHashFunctions
  "Cryptographic Hash Functions"
  {:db/ident   :loc.preservation/cryptographicHashFunctions,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cryptographic Hash Functions"}})

(def environmentCharacteristic
  "Environment Characteristic"
  {:db/ident   :loc.preservation/environmentCharacteristic,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Environment Characteristic"}})

(def environmentFunctionType
  "Environment Function Type"
  {:db/ident   :loc.preservation/environmentFunctionType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Environment Function Type"}})

(def environmentPurpose
  "Environment Purpose (DEPRECATED)"
  {:db/ident   :loc.preservation/environmentPurpose,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Environment Purpose (DEPRECATED)"}})

(def environmentRegistryRole
  "Environment Registry Role"
  {:db/ident   :loc.preservation/environmentRegistryRole,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Environment Registry Role"}})

(def eventOutcome
  "Event Outcome"
  {:db/ident   :loc.preservation/eventOutcome,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Outcome"}})

(def eventRelatedAgentRole
  "Event Related Agent Role"
  {:db/ident   :loc.preservation/eventRelatedAgentRole,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Related Agent Role"}})

(def eventRelatedObjectRole
  "Event Related Object Role"
  {:db/ident   :loc.preservation/eventRelatedObjectRole,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Related Object Role"}})

(def eventType
  "Event Type"
  {:db/ident   :loc.preservation/eventType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Type"}})

(def formatRegistryRole
  "Format Registry Role"
  {:db/ident   :loc.preservation/formatRegistryRole,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Format Registry Role"}})

(def hardwareType
  "Hardware Type (DEPRECATED)"
  {:db/ident   :loc.preservation/hardwareType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hardware Type (DEPRECATED)"}})

(def inhibitorTarget
  "Inhibitor Target (DEPRECATED)"
  {:db/ident   :loc.preservation/inhibitorTarget,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inhibitor Target (DEPRECATED)"}})

(def inhibitorType
  "Inhibitor Type"
  {:db/ident   :loc.preservation/inhibitorType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inhibitor Type"}})

(def linkingAgentRoleEvent
  "Linking Agent Role (Event) (DEPRECATED)"
  {:db/ident   :loc.preservation/linkingAgentRoleEvent,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Linking Agent Role (Event) (DEPRECATED)"}})

(def linkingEnvironmentRole
  "Linking Environment Role"
  {:db/ident   :loc.preservation/linkingEnvironmentRole,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Linking Environment Role"}})

(def objectCategory
  "Object Category"
  {:db/ident   :loc.preservation/objectCategory,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Object Category"}})

(def preservationLevelRole
  "Preservation Level Role"
  {:db/ident   :loc.preservation/preservationLevelRole,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preservation Level Role"}})

(def preservationLevelType
  "Preservation Level Type"
  {:db/ident   :loc.preservation/preservationLevelType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preservation Level Type"}})

(def relationshipSubType
  "Relationship Subtype"
  {:db/ident   :loc.preservation/relationshipSubType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship Subtype"}})

(def relationshipType
  "Relationship Type"
  {:db/ident   :loc.preservation/relationshipType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship Type"}})

(def rightsBasis
  "Rights Basis"
  {:db/ident   :loc.preservation/rightsBasis,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights Basis"}})

(def rightsRelatedAgentRole
  "Rights Related Agent Role"
  {:db/ident   :loc.preservation/rightsRelatedAgentRole,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights Related Agent Role"}})

(def signatureEncoding
  "Signature Encoding"
  {:db/ident   :loc.preservation/signatureEncoding,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Signature Encoding"}})

(def signatureMethod
  "Signature Method"
  {:db/ident   :loc.preservation/signatureMethod,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Signature Method"}})

(def softwareType
  "Software Type (DEPRECATED)"
  {:db/ident   :loc.preservation/softwareType,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Software Type (DEPRECATED)"}})

(def storageMedium
  "Storage Medium"
  {:db/ident   :loc.preservation/storageMedium,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Storage Medium"}})