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
  "compile"
  {:db/ident :loc.preservation.environmentPurpose/com,
   :madsrdf/authoritativeLabel "compile",
   :rdf/type :madsrdf/Authority})

(def cre
  "create"
  {:db/ident :loc.preservation.environmentPurpose/cre,
   :madsrdf/authoritativeLabel "create",
   :rdf/type :madsrdf/Authority})

(def edt
  "edit"
  {:db/ident :loc.preservation.environmentPurpose/edt,
   :madsrdf/authoritativeLabel "edit",
   :rdf/type :madsrdf/Authority})

(def int
  "interpret"
  {:db/ident :loc.preservation.environmentPurpose/int,
   :madsrdf/authoritativeLabel "interpret",
   :rdf/type :madsrdf/Authority})

(def ren
  "render"
  {:db/ident :loc.preservation.environmentPurpose/ren,
   :madsrdf/authoritativeLabel "render",
   :rdf/type :madsrdf/Authority})

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
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/environmentPurpose,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason "deprecated",
                      :cs/createdDate #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/environmentPurpose.rdf,
                      :cs/subjectOfChange :loc.preservation/environmentPurpose,
                      :rdf/type :cs/ChangeSet}]})