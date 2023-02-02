(ns net.wikipunk.loc.boot
  {:rdf/type :jsonld/Context})

(def record
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/ontologies/RecordInfo#"
   :rdfa/prefix "ri"})

(def identifiers
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/vocabulary/identifiers/"
   :rdfa/prefix "identifiers"})

(def preservation
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/vocabulary/preservation/"
   :rdfa/prefix "loc.preservation"})

(def lcc
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/ontologies/lcc#"
   :rdfa/prefix "lcc"})

(def authorities
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/authorities/"
   :rdfa/prefix "loc.authorities"})

(def vocabulary
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/vocabulary/"
   :rdfa/prefix "loc.vocabulary"})

(def resourceTypes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/resourceTypes.rdf"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://id.loc.gov/vocabulary/resourceTypes/"
   :rdfa/prefix      "loc.resourceTypes"})

(def actionsGranted
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/actionsGranted.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.actionsGranted",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/actionsGranted/"})

(def agentType
  {:dcat/downloadURL "http://id.loc.gov/vocabulary/preservation/agentType.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.preservation.agentType",
   :rdfa/uri         "http://id.loc.gov/vocabulary/preservation/agentType/"})

(def contentLocationType
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/contentLocationType.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.contentLocationType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/contentLocationType/"})

(def copyrightStatus
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/copyrightStatus.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.copyrightStatus",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/copyrightStatus/"})

(def cryptographicHashFunctions
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/cryptographicHashFunctions.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.cryptographicHashFunctions",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/cryptographicHashFunctions/"})

(def environmentCharacteristic
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentCharacteristic.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.environmentCharacteristic",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/environmentCharacteristic/"})

(def environmentFunctionType
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentFunctionType.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.environmentFunctionType",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/environmentFunctionType/"})

(def environmentPurpose
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentPurpose.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.environmentPurpose",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/environmentPurpose/"})

(def environmentRegistryRole
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.environmentRegistryRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole/"})

(def eventOutcome
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/eventOutcome.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.eventOutcome",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/eventOutcome/"})

(def eventRelatedAgentRole
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.eventRelatedAgentRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole/"})

(def eventRelatedObjectRole
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/eventRelatedObjectRole.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.eventRelatedObjectRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/eventRelatedObjectRole/"})

(def eventType
  {:dcat/downloadURL "http://id.loc.gov/vocabulary/preservation/eventType.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.preservation.eventType",
   :rdfa/uri         "http://id.loc.gov/vocabulary/preservation/eventType/"})

(def formatRegistryRole
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/formatRegistryRole.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.formatRegistryRole",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/formatRegistryRole/"})

(def hardwareType
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/hardwareType.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.hardwareType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/hardwareType/"})

(def inhibitorTarget
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/inhibitorTarget.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.inhibitorTarget",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/inhibitorTarget/"})

(def inhibitorType
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/inhibitorType.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.inhibitorType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/inhibitorType/"})

(def linkingAgentRoleEvent
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/linkingAgentRoleEvent.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.linkingAgentRoleEvent",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/linkingAgentRoleEvent/"})

(def linkingEnvironmentRole
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.linkingEnvironmentRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole/"})

(def objectCategory
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/objectCategory.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.objectCategory",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/objectCategory/"})

(def preservationLevelRole
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/preservationLevelRole.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.preservationLevelRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/preservationLevelRole/"})

(def preservationLevelType
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/preservationLevelType.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.preservationLevelType",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/preservationLevelType/"})

(def relationshipSubType
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/relationshipSubType.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.relationshipSubType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/relationshipSubType/"})

(def relationshipType
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/relationshipType.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.relationshipType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/relationshipType/"})

(def rightsBasis
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/rightsBasis.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.rightsBasis",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/rightsBasis/"})

(def rightsRelatedAgentRole
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/rightsRelatedAgentRole.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.rightsRelatedAgentRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/rightsRelatedAgentRole/"})

(def signatureEncoding
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/signatureEncoding.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.signatureEncoding",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/signatureEncoding/"})

(def signatureMethod
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/signatureMethod.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.signatureMethod",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/signatureMethod/"})

(def softwareType
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/softwareType.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.softwareType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/softwareType/"})

(def storageMedium
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/storageMedium.rdf",
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "loc.preservation.storageMedium",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/storageMedium/"})
