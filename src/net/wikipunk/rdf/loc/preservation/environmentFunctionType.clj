(ns net.wikipunk.rdf.loc.preservation.environmentFunctionType
  "http://id.loc.gov/vocabulary/preservation/environmentFunctionType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentFunctionType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.environmentFunctionType"
    "http://id.loc.gov/vocabulary/preservation/environmentFunctionType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.environmentFunctionType",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/environmentFunctionType/"})

(def anc
  "Required ancillary software, e.g., run time libraries, browser plug-ins, compression/decompression routines, utilities, operating system emulators, etc."
  {:db/ident :loc.preservation.environmentFunctionType/anc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "ancillary",
   :madsrdf/code "anc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Required ancillary software, e.g., run time libraries, browser plug-ins, compression/decompression routines, utilities, operating system emulators, etc."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/sof,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.softwareType/anc,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/sof
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/sof,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/anc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/anc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Required ancillary software, e.g., run time libraries, browser plug-ins, compression/decompression routines, utilities, operating system emulators, etc."},
   :skos/inScheme [:loc.preservation/environmentFunctionType
                   :loc.vocabulary/preservation],
   :skos/notation "anc",
   :skos/prefLabel "ancillary"})

(def chi
  "A set of electronic circuits on one small plate of semiconductor material."
  {:db/ident :loc.preservation.environmentFunctionType/chi,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "chip",
   :madsrdf/code "chi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A set of electronic circuits on one small plate of semiconductor material."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/har,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/har
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/har,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/chi,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/chi,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set of electronic circuits on one small plate of semiconductor material."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentFunctionType],
   :skos/notation "chi",
   :skos/prefLabel "chip"})

(def dri
  "Software with the primary function of communicating between hardware and the operating system or other software."
  {:db/ident :loc.preservation.environmentFunctionType/dri,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "driver",
   :madsrdf/code "dri",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Software with the primary function of communicating between hardware and the operating system or other software."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/sof,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.softwareType/dri,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/sof
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/sof,
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
    :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
    :cs/subjectOfChange :loc.preservation.environmentFunctionType/dri,
    :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Software with the primary function of communicating between hardware and the operating system or other software."},
   :skos/inScheme [:loc.preservation/environmentFunctionType
                   :loc.vocabulary/preservation],
   :skos/notation "dri",
   :skos/prefLabel "driver"})

(def haa
  "The identification of a system's physical components and their interrelationships."
  {:db/ident :loc.preservation.environmentFunctionType/haa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "hardware architecture",
   :madsrdf/code "haa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The identification of a system's physical components and their interrelationships."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/har,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/har
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/har,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/haa,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/haa,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The identification of a system's physical components and their interrelationships."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentFunctionType],
   :skos/notation "haa",
   :skos/prefLabel "hardware architecture"})

(def hap
  "A device that is used to put information into or get information out of the computer"
  {:db/ident :loc.preservation.environmentFunctionType/hap,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "hardware peripheral",
   :madsrdf/code "hap",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A device that is used to put information into or get information out of the computer"},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/har,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/environmentFunctionType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:premis/IntellectualEntity
                     :loc.preservation.environmentFunctionType/har],
   :skos/broader :loc.preservation.environmentFunctionType/har,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/hap,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/hap,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A device that is used to put information into or get information out of the computer"},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentFunctionType],
   :skos/notation "hap",
   :skos/prefLabel "hardware peripheral"})

(def har
  "The function played within the environmental stack is hardware, the physical parts or components of a computer."
  {:db/ident :loc.preservation.environmentFunctionType/har,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "hardware",
   :madsrdf/code "har",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The function played within the environmental stack is hardware, the physical parts or components of a computer."},
   :madsrdf/hasNarrowerAuthority
   [:loc.preservation.environmentFunctionType/inp
    :loc.preservation.environmentFunctionType/hap
    :loc.preservation.environmentFunctionType/haa
    :loc.preservation.environmentFunctionType/sto
    :loc.preservation.environmentFunctionType/chi
    :loc.preservation.environmentFunctionType/pro
    :loc.preservation.environmentFunctionType/mem],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/IntellectualEntity,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/har,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/har,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The function played within the environmental stack is hardware, the physical parts or components of a computer."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentFunctionType],
   :skos/narrower [:loc.preservation.environmentFunctionType/haa
                   :loc.preservation.environmentFunctionType/mem
                   :loc.preservation.environmentFunctionType/chi
                   :loc.preservation.environmentFunctionType/hap
                   :loc.preservation.environmentFunctionType/pro
                   :loc.preservation.environmentFunctionType/sto
                   :loc.preservation.environmentFunctionType/inp],
   :skos/notation "har",
   :skos/prefLabel "hardware"})

(def inp
  "A hardware device that accepts inputted information and also has the capability of outputting that information."
  {:db/ident :loc.preservation.environmentFunctionType/inp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "input/output device",
   :madsrdf/code "inp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A hardware device that accepts inputted information and also has the capability of outputting that information."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/har,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.hardwareType/inp,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:premis/IntellectualEntity
                     :loc.preservation.environmentFunctionType/har],
   :skos/broader :loc.preservation.environmentFunctionType/har,
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
    :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
    :cs/subjectOfChange :loc.preservation.environmentFunctionType/inp,
    :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A hardware device that accepts inputted information and also has the capability of outputting that information."},
   :skos/inScheme [:loc.preservation/environmentFunctionType
                   :loc.vocabulary/preservation],
   :skos/notation "inp",
   :skos/prefLabel "input/output device"})

(def mem
  "Components and recording media that retain digital data used for computing for some interval of time."
  {:db/ident :loc.preservation.environmentFunctionType/mem,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "memory",
   :madsrdf/code "mem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Components and recording media that retain digital data used for computing for some interval of time."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/har,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.hardwareType/mem,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/har
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/har,
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
    :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
    :cs/subjectOfChange :loc.preservation.environmentFunctionType/mem,
    :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Components and recording media that retain digital data used for computing for some interval of time."},
   :skos/inScheme [:loc.preservation/environmentFunctionType
                   :loc.vocabulary/preservation],
   :skos/notation "mem",
   :skos/prefLabel "memory"})

(def ops
  "Software with the primary function of communicating between hardware and the operating system or other software."
  {:db/ident :loc.preservation.environmentFunctionType/ops,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "operating system",
   :madsrdf/code "ops",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Software with the primary function of communicating between hardware and the operating system or other software."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/sof,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/environmentFunctionType],
   :madsrdf/useFor :loc.preservation.softwareType/ops,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/sof
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/sof,
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
    :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
    :cs/subjectOfChange :loc.preservation.environmentFunctionType/ops,
    :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Software with the primary function of communicating between hardware and the operating system or other software."},
   :skos/inScheme [:loc.preservation/environmentFunctionType
                   :loc.vocabulary/preservation],
   :skos/notation "ops",
   :skos/prefLabel "operating system"})

(def plu
  "A software component that adds a specific feature to an existing computer program."
  {:db/ident :loc.preservation.environmentFunctionType/plu,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "plugin",
   :madsrdf/code "plu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A software component that adds a specific feature to an existing computer program."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/sof,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/sof
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/sof,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/plu,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/plu,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A software component that adds a specific feature to an existing computer program."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentFunctionType],
   :skos/notation "plu",
   :skos/prefLabel "plugin"})

(def pro
  "The portion of a computer system that carries out the instructions of a computer program, and is the primary element carrying out the computer's functions."
  {:db/ident :loc.preservation.environmentFunctionType/pro,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "processor",
   :madsrdf/code "pro",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The portion of a computer system that carries out the instructions of a computer program, and is the primary element carrying out the computer's functions."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/har,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/environmentFunctionType],
   :madsrdf/useFor :loc.preservation.hardwareType/pro,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/har
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/har,
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
    :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
    :cs/subjectOfChange :loc.preservation.environmentFunctionType/pro,
    :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The portion of a computer system that carries out the instructions of a computer program, and is the primary element carrying out the computer's functions."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentFunctionType],
   :skos/notation "pro",
   :skos/prefLabel "processor"})

(def ren
  "Application that can display/play/execute the format instance, e.g., image viewer, video player, Java virtual machine (when the format instance is a Java class file)."
  {:db/ident :loc.preservation.environmentFunctionType/ren,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "renderer",
   :madsrdf/code "ren",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Application that can display/play/execute the format instance, e.g., image viewer, video player, Java virtual machine (when the format instance is a Java class file)."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/sof,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.softwareType/ren,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/sof
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/sof,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/ren,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/ren,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Application that can display/play/execute the format instance, e.g., image viewer, video player, Java virtual machine (when the format instance is a Java class file)."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentFunctionType],
   :skos/notation "ren",
   :skos/prefLabel "renderer"})

(def soa
  "An application program designed to perform a group of coordinated functions."
  {:db/ident :loc.preservation.environmentFunctionType/soa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "software application",
   :madsrdf/code "soa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An application program designed to perform a group of coordinated functions."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/sof,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:premis/IntellectualEntity
                     :loc.preservation.environmentFunctionType/sof],
   :skos/broader :loc.preservation.environmentFunctionType/sof,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/soa,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/soa,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An application program designed to perform a group of coordinated functions."},
   :skos/inScheme [:loc.preservation/environmentFunctionType
                   :loc.vocabulary/preservation],
   :skos/notation "soa",
   :skos/prefLabel "software application"})

(def sof
  "The function played within the environment stack is software, the set of instructions that directs a computer to perform specific tasks or operations."
  {:db/ident :loc.preservation.environmentFunctionType/sof,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "software",
   :madsrdf/code "sof",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The function played within the environment stack is software, the set of instructions that directs a computer to perform specific tasks or operations."},
   :madsrdf/hasNarrowerAuthority
   [:loc.preservation.environmentFunctionType/dri
    :loc.preservation.environmentFunctionType/ops
    :loc.preservation.environmentFunctionType/soa
    :loc.preservation.environmentFunctionType/anc
    :loc.preservation.environmentFunctionType/sol
    :loc.preservation.environmentFunctionType/plu
    :loc.preservation.environmentFunctionType/ren],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/environmentFunctionType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/IntellectualEntity,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/sof,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:00.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/sof,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The function played within the environment stack is software, the set of instructions that directs a computer to perform specific tasks or operations."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentFunctionType],
   :skos/narrower [:loc.preservation.environmentFunctionType/soa
                   :loc.preservation.environmentFunctionType/plu
                   :loc.preservation.environmentFunctionType/sol
                   :loc.preservation.environmentFunctionType/ops
                   :loc.preservation.environmentFunctionType/ren
                   :loc.preservation.environmentFunctionType/dri
                   :loc.preservation.environmentFunctionType/anc],
   :skos/notation "sof",
   :skos/prefLabel "software"})

(def sol
  "A collection of resources used by computer programs to implement behaviors."
  {:db/ident :loc.preservation.environmentFunctionType/sol,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "software library",
   :madsrdf/code "sol",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A collection of resources used by computer programs to implement behaviors."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/sof,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:loc.preservation.environmentFunctionType/sof
                     :premis/IntellectualEntity],
   :skos/broader :loc.preservation.environmentFunctionType/sof,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/sol,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
     :cs/subjectOfChange :loc.preservation.environmentFunctionType/sol,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A collection of resources used by computer programs to implement behaviors."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentFunctionType],
   :skos/notation "sol",
   :skos/prefLabel "software library"})

(def sto
  "A device for storing information (data) on a computer."
  {:db/ident :loc.preservation.environmentFunctionType/sto,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.environmentFunctionType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "storage device",
   :madsrdf/code "sto",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A device for storing information (data) on a computer."},
   :madsrdf/hasBroaderAuthority :loc.preservation.environmentFunctionType/har,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentFunctionType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentFunctionType
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.hardwareType/sto,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf [:premis/IntellectualEntity
                     :loc.preservation.environmentFunctionType/har],
   :skos/broader :loc.preservation.environmentFunctionType/har,
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
    :cs/creatorName     :loc.preservation.environmentFunctionType/dlc,
    :cs/subjectOfChange :loc.preservation.environmentFunctionType/sto,
    :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A device for storing information (data) on a computer."},
   :skos/inScheme [:loc.preservation/environmentFunctionType
                   :loc.vocabulary/preservation],
   :skos/notation "sto",
   :skos/prefLabel "storage device"})

(def ^{:private true} environmentFunctionType
  "A description of the environment at a given level within the environmental stack."
  {:db/ident :loc.preservation/environmentFunctionType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.environmentFunctionType/pro
                                 :loc.preservation.environmentFunctionType/chi
                                 :loc.preservation.environmentFunctionType/mem
                                 :loc.preservation.environmentFunctionType/plu
                                 :loc.preservation.environmentFunctionType/har
                                 :loc.preservation.environmentFunctionType/ops
                                 :loc.preservation.environmentFunctionType/haa
                                 :loc.preservation.environmentFunctionType/hap
                                 :loc.preservation.environmentFunctionType/anc
                                 :loc.preservation.environmentFunctionType/sol
                                 :loc.preservation.environmentFunctionType/ren
                                 :loc.preservation.environmentFunctionType/sto
                                 :loc.preservation.environmentFunctionType/sof
                                 :loc.preservation.environmentFunctionType/inp
                                 :loc.preservation.environmentFunctionType/dri
                                 :loc.preservation.environmentFunctionType/soa],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "A description of the environment at a given level within the environmental stack.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Environment Function Type"},
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/environmentFunctionType,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/environmentFunctionType,
     :rdf/type           :cs/ChangeSet}]})