(ns net.wikipunk.rdf.loc.preservation.inhibitorTarget
  "http://id.loc.gov/vocabulary/preservation/inhibitorTarget/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/inhibitorTarget.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.inhibitorTarget"
    "http://id.loc.gov/vocabulary/preservation/inhibitorTarget/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.inhibitorTarget",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/inhibitorTarget/"})

(def all
  "All Content"
  {:db/ident :loc.preservation.inhibitorTarget/all,
   :madsrdf/authoritativeLabel "All Content",
   :rdf/type :madsrdf/Authority})

(def pla
  "Play Function"
  {:db/ident :loc.preservation.inhibitorTarget/pla,
   :madsrdf/authoritativeLabel "Play Function",
   :rdf/type :madsrdf/Authority})

(def prt
  "Print Function"
  {:db/ident :loc.preservation.inhibitorTarget/prt,
   :madsrdf/authoritativeLabel "Print Function",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} inhibitorTarget
  "The content or function protected by the inhibitor."
  {:db/ident :loc.preservation/inhibitorTarget,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/inhibitorTarget.rdf,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.inhibitorTarget/pla
                                 :loc.preservation.inhibitorTarget/all
                                 :loc.preservation.inhibitorTarget/prt],
   :madsrdf/useInstead :loc.preservation/eventType,
   :rdf/type
   [:madsrdf/DeprecatedAuthority :skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "The content or function protected by the inhibitor.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inhibitor Target (DEPRECATED)"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/inhibitorTarget.rdf,
                      :cs/subjectOfChange :loc.preservation/inhibitorTarget,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/inhibitorTarget,
                      :rdf/type           :cs/ChangeSet}]})