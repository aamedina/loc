(ns net.wikipunk.rdf.loc.preservation.softwareType
  "http://id.loc.gov/vocabulary/preservation/softwareType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/softwareType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.softwareType"
    "http://id.loc.gov/vocabulary/preservation/softwareType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.softwareType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/softwareType/"})

(def anc
  "Required ancillary software, e.g., run time libraries, browser plug-ins, compression/decompression routines, utilities, operating system emulators, etc."
  {:db/ident :loc.preservation.softwareType/anc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.softwareType/anc,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.softwareType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "ancillary",
   :madsrdf/code "anc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Required ancillary software, e.g., run time libraries, browser plug-ins, compression/decompression routines, utilities, operating system emulators, etc."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.softwareType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/softwareType],
   :madsrdf/useInstead :loc.preservation.environmentFunctionType/anc,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType/anc"],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.softwareType/dlc,
                      :cs/subjectOfChange :loc.preservation.softwareType/anc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.softwareType/anc,
                      :cs/subjectOfChange :loc.preservation.softwareType/anc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Required ancillary software, e.g., run time libraries, browser plug-ins, compression/decompression routines, utilities, operating system emulators, etc."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/softwareType],
   :skos/notation "anc",
   :skos/prefLabel "ancillary"})

(def dri
  "Software with the primary function of communicating between hardware and the operating system or other software."
  {:db/ident :loc.preservation.softwareType/dri,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.softwareType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.softwareType/dri,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "driver",
   :madsrdf/code "dri",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Software with the primary function of communicating between hardware and the operating system or other software."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.softwareType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/softwareType],
   :madsrdf/useInstead :loc.preservation.environmentFunctionType/dri,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType/dri"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.softwareType/dri,
                      :cs/subjectOfChange :loc.preservation.softwareType/dri,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.softwareType/dlc,
                      :cs/subjectOfChange :loc.preservation.softwareType/dri,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Software with the primary function of communicating between hardware and the operating system or other software."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/softwareType],
   :skos/notation "dri",
   :skos/prefLabel "driver"})

(def ops
  "Software that supports application execution, process scheduling, memory management, file systems, etc."
  {:db/ident :loc.preservation.softwareType/ops,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.softwareType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.softwareType/ops,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "operating system",
   :madsrdf/code "ops",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Software that supports application execution, process scheduling, memory management, file systems, etc."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.softwareType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/softwareType
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.environmentFunctionType/ops,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType/ops"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.softwareType/ops,
                      :cs/subjectOfChange :loc.preservation.softwareType/ops,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.softwareType/dlc,
                      :cs/subjectOfChange :loc.preservation.softwareType/ops,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Software that supports application execution, process scheduling, memory management, file systems, etc."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/softwareType],
   :skos/notation "ops",
   :skos/prefLabel "operating system"})

(def ren
  "Application that can display/play/execute the format instance, e.g., image viewer, video player, Java virtual machine (when the format instance is a Java class file)."
  {:db/ident :loc.preservation.softwareType/ren,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.softwareType/ren,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.softwareType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "renderer",
   :madsrdf/code "ren",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Application that can display/play/execute the format instance, e.g., image viewer, video player, Java virtual machine (when the format instance is a Java class file)."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.softwareType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/softwareType
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.environmentFunctionType/ren,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType/ren"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.softwareType/ren,
                      :cs/subjectOfChange :loc.preservation.softwareType/ren,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.softwareType/dlc,
                      :cs/subjectOfChange :loc.preservation.softwareType/ren,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Application that can display/play/execute the format instance, e.g., image viewer, video player, Java virtual machine (when the format instance is a Java class file)."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/softwareType],
   :skos/notation "ren",
   :skos/prefLabel "renderer"})

(def ^{:private true} softwareType
  "The class or category of software required to render or use the object."
  {:db/ident :loc.preservation/softwareType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/softwareType.rdf,
     :ri/recordStatus "deprecated"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.softwareType/anc
                                 :loc.preservation.softwareType/ren
                                 :loc.preservation.softwareType/ops
                                 :loc.preservation.softwareType/dri],
   :madsrdf/useInstead :loc.preservation/environmentFunctionType,
   :rdf/type
   [:madsrdf/DeprecatedAuthority :madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment
   "The class or category of software required to render or use the object.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Software Type (DEPRECATED)"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/softwareType.rdf,
                      :cs/subjectOfChange :loc.preservation/softwareType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/softwareType,
                      :rdf/type           :cs/ChangeSet}]})