(ns net.wikipunk.rdf.loc.preservation.relationshipType
  "http://id.loc.gov/vocabulary/preservation/relationshipType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/relationshipType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.relationshipType"
    "http://id.loc.gov/vocabulary/preservation/relationshipType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.relationshipType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/relationshipType/"}
  (:refer-clojure :exclude [ref str]))

(def dep
  "dependency"
  {:db/ident :loc.preservation.relationshipType/dep,
   :madsrdf/authoritativeLabel "dependency",
   :rdf/type :madsrdf/Authority})

(def der
  "derivation"
  {:db/ident :loc.preservation.relationshipType/der,
   :madsrdf/authoritativeLabel "derivation",
   :rdf/type :madsrdf/Authority})

(def log
  "logical"
  {:db/ident :loc.preservation.relationshipType/log,
   :madsrdf/authoritativeLabel "logical",
   :rdf/type :madsrdf/Authority})

(def ref
  "reference"
  {:db/ident :loc.preservation.relationshipType/ref,
   :madsrdf/authoritativeLabel "reference",
   :rdf/type :madsrdf/Authority})

(def rep
  "replacement"
  {:db/ident :loc.preservation.relationshipType/rep,
   :madsrdf/authoritativeLabel "replacement",
   :rdf/type :madsrdf/Authority})

(def str
  "structural"
  {:db/ident :loc.preservation.relationshipType/str,
   :madsrdf/authoritativeLabel "structural",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} relationshipType
  "A high level categorization of the nature of the relationship between this object and one or more other objects."
  {:db/ident :loc.preservation/relationshipType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.relationshipType/log
                                 :loc.preservation.relationshipType/str
                                 :loc.preservation.relationshipType/der
                                 :loc.preservation.relationshipType/rep
                                 :loc.preservation.relationshipType/ref
                                 :loc.preservation.relationshipType/dep],
   :madsrdf/hasNarrowerAuthority :loc.preservation/relationshipSubType,
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment
   "A high level categorization of the nature of the relationship between this object and one or more other objects.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship Type"},
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/relationshipType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/relationshipType,
                      :rdf/type           :cs/ChangeSet}],
   :skos/narrower :loc.preservation/relationshipSubType})