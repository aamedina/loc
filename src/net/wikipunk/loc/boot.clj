(ns net.wikipunk.loc.boot
  {:rdf/type :jsonld/Context}
  (:refer-clojure :exclude [frequencies]))

(def madsrdf
  {:dcat/downloadURL "resources/mads.rdf"
   :rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.loc.gov/mads/rdf/v1#"
   :rdfa/prefix "madsrdf"})

(def bibframe
  {:dcat/downloadURL "https://id.loc.gov/ontologies/bibframe.rdf"
   :rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/ontologies/bibframe/"
   :rdfa/prefix "bf"})

(def premis
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://www.loc.gov/premis/rdf/v3/"
   :rdfa/prefix "premis"})

(def bflc
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "http://id.loc.gov/ontologies/bflc/"
   :rdfa/prefix "bflc"
   :rdf/ns-prefix-map {"bflc" "http://id.loc.gov/ontologies/bflc/"
                       "bf"  "http://id.loc.gov/ontologies/bibframe/",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#"
                       "skos"     "http://www.w3.org/2004/02/skos/core#"}})

(def changeset
  {:dcat/downloadURL "https://vocab.org/changeset/schema-20090518.rdf"
   :rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://purl.org/vocab/changeset/schema#"
   :rdfa/prefix      "cs"})

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

(def musiccodeschemes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/musiccodeschemes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.musiccodeschemes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/musiccodeschemes/"})

(def nationalbibschemes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/nationalbibschemes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.nationalbibschemes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/nationalbibschemes/"})

(def fingerprintschemes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/fingerprintschemes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.fingerprintschemes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/fingerprintschemes/"})

(def languageschemes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/languageschemes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.languageschemes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/languageschemes/"})

(def mcfcsc
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mcfcsc.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mcfcsc",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mcfcsc/"})

(def nameTitleSchemes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/nameTitleSchemes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.nameTitleSchemes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/nameTitleSchemes/"})

(def datatypes
  {:rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.datatypes",
   :rdfa/uri         "http://id.loc.gov/datatypes/"})

(def edtf
  {:dcat/downloadURL "https://id.loc.gov/datatypes/edtf.rdf"
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.edtf",
   :rdfa/uri         "http://id.loc.gov/datatypes/edtf/"})

(def geographicAreas
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/geographicAreas.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.geographicAreas",
   :rdfa/uri         "http://id.loc.gov/vocabulary/geographicAreas/"})

(def countries
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/countries.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.countries",
   :rdfa/uri         "http://id.loc.gov/vocabulary/countries/"})

(def organizations
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/organizations.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.organizations",
   :rdfa/uri         "http://id.loc.gov/vocabulary/organizations/"})

(def languages
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/languages.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.languages",
   :rdfa/uri         "http://id.loc.gov/vocabulary/languages/"})

(def iso639-1
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/iso639-1.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.iso639-1",
   :rdfa/uri         "http://id.loc.gov/vocabulary/iso639-1/"})

(def iso639-2
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/iso639-2.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.iso639-2",
   :rdfa/uri         "http://id.loc.gov/vocabulary/iso639-2/"})

(def iso639-5
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/iso639-5.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.iso639-5",
   :rdfa/uri         "http://id.loc.gov/vocabulary/iso639-5/"})

(def marcgt
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/marcgt.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.marcgt",
   :rdfa/uri         "http://id.loc.gov/vocabulary/marcgt/"})

(def genreFormSchemes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/genreFormSchemes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.genreFormSchemes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/genreFormSchemes/"})

(def names
  {:dcat/downloadURL #_"resources/names.skosrdf.ttl.gz", "/home/adrian/Downloads/names.skosrdf.ttl"
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.names",
   :rdfa/uri         "http://id.loc.gov/authorities/names/"})

(def classification
  {:dcat/downloadURL "https://id.loc.gov/authorities/classification.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.classification",
   :rdfa/uri         "http://id.loc.gov/authorities/classification/"})

(def genreForms
  {:dcat/downloadURL "resources/genreForms.madsrdf.ttl.gz"
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.genreForms",
   :rdfa/uri         "http://id.loc.gov/authorities/genreForms/"})

(def subjects
  {:dcat/downloadURL "resources/subjects.skosrdf.ttl.gz"
   :dcat/accessURL   "https://id.loc.gov/download/authorities/subjects.madsrdf.ttl.gz"
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.subjects",
   :rdfa/uri         "http://id.loc.gov/authorities/subjects/"})

(def works
  {:dcat/downloadURL "https://id.loc.gov/resources/works.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.works",
   :rdfa/uri         "http://id.loc.gov/resources/works/"})

(def instances
  {:dcat/downloadURL "https://id.loc.gov/resources/instances.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.instances",
   :rdfa/uri         "http://id.loc.gov/resources/instances/"})

(def hubs
  {:dcat/downloadURL "resources/hubs.bibframe.ttl.gz",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.hubs",
   :rdfa/uri         "http://id.loc.gov/resources/hubs/"})

(def relators
  {:dcat/downloadURL "resources/relators.madsrdf.nt.gz",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.relators",
   :rdfa/uri         "http://id.loc.gov/vocabulary/relators/"})

(def classSchemes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/classSchemes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.classSchemes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/classSchemes/"})

(def subjectSchemes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/subjectSchemes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.subjectSchemes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/subjectSchemes/"})

(def ethnographicTerms
  {:dcat/downloadURL "resources/ethnographicTerms.madsrdf.ttl.gz",
   :dcat/accessURL "https://id.loc.gov/vocabulary/ethnographicTerms.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.ethnographicTerms",
   :rdfa/uri         "http://id.loc.gov/vocabulary/ethnographicTerms/"})

(def graphicMaterials
  {:dcat/downloadURL "resources/graphicMaterials.madsrdf.ttl.gz",
   :dcat/accessURL "https://id.loc.gov/vocabulary/graphicMaterials.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.graphicMaterials",
   :rdfa/uri         "http://id.loc.gov/vocabulary/graphicMaterials/"})

(def demographicTerms
  {:dcat/downloadURL "resources/demographicTerms.madsrdf.ttl.gz",
   :dcat/accessURL "https://id.loc.gov/authorities/demographicTerms.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.demographicTerms",
   :rdfa/uri         "http://id.loc.gov/authorities/demographicTerms/"})

(def performanceMediums
  {:dcat/downloadURL "resources/performanceMediums.skosrdf.ttl.gz"
   :dcat/accessURL "https://id.loc.gov/authorities/performanceMediums.rdf", 
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.performanceMediums",
   :rdfa/uri         "http://id.loc.gov/authorities/performanceMediums/"})

(def childrensSubjects
  {:dcat/downloadURL "resources/childrensSubjects.madsrdf.ttl.gz",
   :dcat/accessURL "https://id.loc.gov/authorities/childrensSubjects.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.childrensSubjects",
   :rdfa/uri         "http://id.loc.gov/authorities/childrensSubjects/"})

(def cataloging
  {:dcat/downloadURL "resources/cataloging.madsrdf.ttl",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.cataloging",
   :rdfa/uri         "http://id.loc.gov/vocabulary/cataloging/"})

(def maspect
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/maspect.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.maspect",
   :rdfa/uri         "http://id.loc.gov/vocabulary/maspect/"})

(def marcauthen
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/marcauthen.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.marcauthen",
   :rdfa/uri         "http://id.loc.gov/vocabulary/marcauthen/"})

(def bookformat
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/bookformat.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.bookformat",
   :rdfa/uri         "http://id.loc.gov/vocabulary/bookformat/"})

(def mbroadstd
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mbroadstd.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mbroadstd",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mbroadstd/"})

(def carriers
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/carriers.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.carriers",
   :rdfa/uri         "http://id.loc.gov/vocabulary/carriers/"})

(def mcolor
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mcolor.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mcolor",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mcolor/"})

(def contentTypes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/contentTypes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.contentTypes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/contentTypes/"})

(def descriptionConventions
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/descriptionConventions.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.descriptionConventions",
   :rdfa/uri         "http://id.loc.gov/vocabulary/descriptionConventions/"})

(def mcapturestorage
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mcapturestorage.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mcapturestorage",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mcapturestorage/"})

(def mencformat
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mencformat.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mencformat",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mencformat/"})

(def menclvl
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/menclvl.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.menclvl",
   :rdfa/uri         "http://id.loc.gov/vocabulary/menclvl/"})

(def mfont
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mfont.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mfont",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mfont/"})

(def mfiletype
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mfiletype.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mfiletype",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mfiletype/"})

(def mgeneration
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mgeneration.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mgeneration",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mgeneration/"})

(def mgovtpubtype
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mgovtpubtype.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mgovtpubtype",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mgovtpubtype/"})

(def mgroove
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mgroove.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mgroove",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mgroove/"})

(def millus
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/millus.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.millus",
   :rdfa/uri         "http://id.loc.gov/vocabulary/millus/"})

(def maudience
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/maudience.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.maudience",
   :rdfa/uri         "http://id.loc.gov/vocabulary/maudience/"})

(def issuance
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/issuance.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.issuance",
   :rdfa/uri         "http://id.loc.gov/vocabulary/issuance/"})

(def mlayout
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mlayout.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mlayout",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mlayout/"})

(def mediaTypes
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mediaTypes.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mediaTypes",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mediaTypes/"})

(def mmusnotation
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mmusnotation.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mmusnotation",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mmusnotation/"})

(def mmusicformat
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mmusicformat.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mmusicformat",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mmusicformat/"})

(def mnotetype
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mnotetype.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mnotetype",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mnotetype/"})

(def mplayback
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mplayback.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mplayback",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mplayback/"})

(def mplayspeed
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mplayspeed.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mplayspeed",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mplayspeed/"})

(def mpolarity
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mpolarity.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mpolarity",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mpolarity/"})

(def mpresformat
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mpresformat.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mpresformat",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mpresformat/"})

(def mproduction
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mproduction.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mproduction",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mproduction/"})

(def mprojection
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mprojection.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mprojection",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mprojection/"})

(def frequencies
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/frequencies.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.frequencies",
   :rdfa/uri         "http://id.loc.gov/vocabulary/frequencies/"})

(def mrecmedium
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mrecmedium.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mrecmedium",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mrecmedium/"})

(def mrectype
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mrectype.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mrectype",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mrectype/"})

(def mreductionratio
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mreductionratio.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mreductionratio",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mreductionratio/"})

(def mregencoding
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mregencoding.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mregencoding",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mregencoding/"})

(def rbmscv
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/rbmscv.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.rbmscv",
   :rdfa/uri         "http://id.loc.gov/vocabulary/rbmscv/"})

(def mrelief
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mrelief.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mrelief",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mrelief/"})

(def resourceComponents
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/resourceComponents.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.resourceComponents",
   :rdfa/uri         "http://id.loc.gov/vocabulary/resourceComponents/"})

(def mscale
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mscale.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mscale",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mscale/"})

(def mscript
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mscript.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mscript",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mscript/"})

(def mserialpubtype
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mserialpubtype.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mserialpubtype",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mserialpubtype/"})

(def msoundcontent
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/msoundcontent.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.msoundcontent",
   :rdfa/uri         "http://id.loc.gov/vocabulary/msoundcontent/"})

(def mspecplayback
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mspecplayback.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mspecplayback",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mspecplayback/"})

(def mstatus
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mstatus.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mstatus",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mstatus/"})

(def msupplcont
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/msupplcont.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.msupplcont",
   :rdfa/uri         "http://id.loc.gov/vocabulary/msupplcont/"})

(def mmaterial
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mmaterial.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mmaterial",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mmaterial/"})

(def mtactile
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mtactile.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mtactile",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mtactile/"})

(def mtapeconfig
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mtapeconfig.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mtapeconfig",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mtapeconfig/"})

(def mtechnique
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mtechnique.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mtechnique",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mtechnique/"})

(def mvidformat
  {:dcat/downloadURL "https://id.loc.gov/vocabulary/mvidformat.rdf",
   :rdf/type         :rdfa/PrefixMapping,
   :rdfa/prefix      "loc.mvidformat",
   :rdfa/uri         "http://id.loc.gov/vocabulary/mvidformat/"})
