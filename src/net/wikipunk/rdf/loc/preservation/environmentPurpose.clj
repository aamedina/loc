(ns net.wikipunk.rdf.loc.preservation.environmentPurpose
  "http://id.loc.gov/vocabulary/preservation/environmentPurpose/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentPurpose.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.environmentPurpose"
    "http://id.loc.gov/vocabulary/preservation/environmentPurpose/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.environmentPurpose",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/environmentPurpose/"}
  (:refer-clojure :exclude [int]))

(def com
  "To translate source code into object code."
  {:db/ident :loc.preservation.environmentPurpose/com,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/com,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "compile",
   :madsrdf/code "com",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "To translate source code into object code."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentPurpose/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentPurpose
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.eventType/cop,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/cop"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/dlc,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/com,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/com,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/com,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "To translate source code into object code."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentPurpose],
   :skos/notation "com",
   :skos/prefLabel "compile"})

(def cre
  "To make or cause to come into being."
  {:db/ident :loc.preservation.environmentPurpose/cre,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/cre,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "create",
   :madsrdf/code "cre",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "To make or cause to come into being."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentPurpose/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/environmentPurpose],
   :madsrdf/useInstead :loc.preservation.eventType/cre,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/cre"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/dlc,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/cre,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/cre,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/cre,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To make or cause to come into being."},
   :skos/inScheme [:loc.preservation/environmentPurpose
                   :loc.vocabulary/preservation],
   :skos/notation "cre",
   :skos/prefLabel "create"})

(def edt
  "To modify or adapt."
  {:db/ident :loc.preservation.environmentPurpose/edt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/edt,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "edit",
   :madsrdf/code "edt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "To modify or adapt."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentPurpose/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/environmentPurpose],
   :madsrdf/useInstead :loc.preservation.eventType/mod,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/mod"],
   :skos/changeNote
   [{:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/edt,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/edt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/dlc,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/edt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "To modify or adapt."},
   :skos/inScheme [:loc.preservation/environmentPurpose
                   :loc.vocabulary/preservation],
   :skos/notation "edt",
   :skos/prefLabel "edit"})

(def int
  "To execute instructions written in a high-level language"
  {:db/ident :loc.preservation.environmentPurpose/int,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/int,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "interpret",
   :madsrdf/code "int",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "To execute instructions written in a high-level language"},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentPurpose/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentPurpose
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.eventType/int,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/int"],
   :skos/changeNote
   [{:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/int,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/int,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/dlc,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/int,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "To execute instructions written in a high-level language"},
   :skos/inScheme [:loc.preservation/environmentPurpose
                   :loc.vocabulary/preservation],
   :skos/notation "int",
   :skos/prefLabel "interpret"})

(def ren
  "To generate an image or presentation by means of computer programs."
  {:db/ident :loc.preservation.environmentPurpose/ren,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentPurpose/ren,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "render",
   :madsrdf/code "ren",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "To generate an image or presentation by means of computer programs."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentPurpose/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/environmentPurpose],
   :madsrdf/useInstead :loc.preservation.eventType/ren,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/ren"],
   :skos/changeNote
   [{:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/ren,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/ren,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentPurpose/dlc,
     :cs/subjectOfChange :loc.preservation.environmentPurpose/ren,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "To generate an image or presentation by means of computer programs."},
   :skos/inScheme [:loc.preservation/environmentPurpose
                   :loc.vocabulary/preservation],
   :skos/notation "ren",
   :skos/prefLabel "render"})

(def ^{:private true} environmentPurpose
  "The use(s) supported by the specified environment."
  {:db/ident :loc.preservation/environmentPurpose,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/environmentPurpose.rdf,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.environmentPurpose/int
                                 :loc.preservation.environmentPurpose/com
                                 :loc.preservation.environmentPurpose/edt
                                 :loc.preservation.environmentPurpose/ren
                                 :loc.preservation.environmentPurpose/cre],
   :madsrdf/useInstead :loc.preservation/eventType,
   :rdf/type
   [:madsrdf/DeprecatedAuthority :skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "The use(s) supported by the specified environment.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Environment Purpose (DEPRECATED)"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType"],
   :skos/changeNote [{:cs/changeReason "deprecated",
                      :cs/createdDate #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/environmentPurpose.rdf,
                      :cs/subjectOfChange :loc.preservation/environmentPurpose,
                      :rdf/type :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/environmentPurpose,
                      :rdf/type           :cs/ChangeSet}]})