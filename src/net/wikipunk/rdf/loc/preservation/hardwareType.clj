(ns net.wikipunk.rdf.loc.preservation.hardwareType
  "http://id.loc.gov/vocabulary/preservation/hardwareType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/hardwareType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.hardwareType"
    "http://id.loc.gov/vocabulary/preservation/hardwareType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.hardwareType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/hardwareType/"})

(def inp
  "A hardware device that accepts inputted information and also has the capability of outputting that information."
  {:db/ident :loc.preservation.hardwareType/inp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.hardwareType/inp,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.hardwareType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "input/output device",
   :madsrdf/code "inp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A hardware device that accepts inputted information and also has the capability of outputting that information."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.hardwareType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/hardwareType
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.environmentFunctionType/inp,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType/inp"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.hardwareType/inp,
                      :cs/subjectOfChange :loc.preservation.hardwareType/inp,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.hardwareType/dlc,
                      :cs/subjectOfChange :loc.preservation.hardwareType/inp,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A hardware device that accepts inputted information and also has the capability of outputting that information."},
   :skos/inScheme [:loc.preservation/hardwareType :loc.vocabulary/preservation],
   :skos/notation "inp",
   :skos/prefLabel "input/output device"})

(def mem
  "Components and recording media that retain digital data used for computing for some interval of time."
  {:db/ident :loc.preservation.hardwareType/mem,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.hardwareType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.hardwareType/mem,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "memory",
   :madsrdf/code "mem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Components and recording media that retain digital data used for computing for some interval of time."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.hardwareType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/hardwareType],
   :madsrdf/useInstead :loc.preservation.environmentFunctionType/mem,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType/mem"],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.hardwareType/dlc,
                      :cs/subjectOfChange :loc.preservation.hardwareType/mem,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.hardwareType/mem,
                      :cs/subjectOfChange :loc.preservation.hardwareType/mem,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Components and recording media that retain digital data used for computing for some interval of time."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/hardwareType],
   :skos/notation "mem",
   :skos/prefLabel "memory"})

(def pro
  "The portion of a computer system that carries out the instructions of a computer program, and is the primary element carrying out the computer's functions."
  {:db/ident :loc.preservation.hardwareType/pro,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.hardwareType/pro,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.hardwareType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "processor",
   :madsrdf/code "pro",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The portion of a computer system that carries out the instructions of a computer program, and is the primary element carrying out the computer's functions."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.hardwareType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/hardwareType
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.environmentFunctionType/pro,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType/pro"],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.hardwareType/dlc,
                      :cs/subjectOfChange :loc.preservation.hardwareType/pro,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.hardwareType/pro,
                      :cs/subjectOfChange :loc.preservation.hardwareType/pro,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The portion of a computer system that carries out the instructions of a computer program, and is the primary element carrying out the computer's functions."},
   :skos/inScheme [:loc.preservation/hardwareType :loc.vocabulary/preservation],
   :skos/notation "pro",
   :skos/prefLabel "processor"})

(def sto
  "A device for storing information (data) on a computer."
  {:db/ident :loc.preservation.hardwareType/sto,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.hardwareType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.hardwareType/sto,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "storage device",
   :madsrdf/code "sto",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A device for storing information (data) on a computer."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.hardwareType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/hardwareType
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.environmentFunctionType/sto,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType/sto"],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.hardwareType/dlc,
                      :cs/subjectOfChange :loc.preservation.hardwareType/sto,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.hardwareType/sto,
                      :cs/subjectOfChange :loc.preservation.hardwareType/sto,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A device for storing information (data) on a computer."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/hardwareType],
   :skos/notation "sto",
   :skos/prefLabel "storage device"})

(def ^{:private true} hardwareType
  ""
  {:db/ident :loc.preservation/hardwareType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/hardwareType.rdf,
     :ri/recordStatus "deprecated"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.hardwareType/pro
                                 :loc.preservation.hardwareType/mem
                                 :loc.preservation.hardwareType/sto
                                 :loc.preservation.hardwareType/inp],
   :madsrdf/useInstead :loc.preservation/environmentFunctionType,
   :rdf/type
   [:skos/ConceptScheme :madsrdf/DeprecatedAuthority :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hardware Type (DEPRECATED)"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/hardwareType.rdf,
                      :cs/subjectOfChange :loc.preservation/hardwareType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/hardwareType,
                      :rdf/type           :cs/ChangeSet}]})