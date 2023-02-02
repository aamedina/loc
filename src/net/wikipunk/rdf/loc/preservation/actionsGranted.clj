(ns net.wikipunk.rdf.loc.preservation.actionsGranted
  "http://id.loc.gov/vocabulary/preservation/actionsGranted/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/actionsGranted.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.actionsGranted"
    "http://id.loc.gov/vocabulary/preservation/actionsGranted/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.actionsGranted",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/actionsGranted/"}
  (:refer-clojure :exclude [mod use]))

(def del
  "delete"
  {:db/ident :loc.preservation.actionsGranted/del,
   :madsrdf/authoritativeLabel "delete",
   :rdf/type :madsrdf/Authority})

(def dis
  "disseminate"
  {:db/ident :loc.preservation.actionsGranted/dis,
   :madsrdf/authoritativeLabel "disseminate",
   :rdf/type :madsrdf/Authority})

(def mig
  "migrate"
  {:db/ident :loc.preservation.actionsGranted/mig,
   :madsrdf/authoritativeLabel "migrate",
   :rdf/type :madsrdf/Authority})

(def mod
  "modify"
  {:db/ident :loc.preservation.actionsGranted/mod,
   :madsrdf/authoritativeLabel "modify",
   :rdf/type :madsrdf/Authority})

(def rep
  "replicate"
  {:db/ident :loc.preservation.actionsGranted/rep,
   :madsrdf/authoritativeLabel "replicate",
   :rdf/type :madsrdf/Authority})

(def use
  "use"
  {:db/ident :loc.preservation.actionsGranted/use,
   :madsrdf/authoritativeLabel "use",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} actionsGranted
  "The action the preservation repository is allowed to take."
  {:db/ident :loc.preservation/actionsGranted,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/actionsGranted.rdf,
     :ri/recordStatus "deprecated"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.actionsGranted/use
                                 :loc.preservation.actionsGranted/del
                                 :loc.preservation.actionsGranted/mig
                                 :loc.preservation.actionsGranted/rep
                                 :loc.preservation.actionsGranted/mod
                                 :loc.preservation.actionsGranted/dis],
   :madsrdf/useInstead :loc.preservation/eventType,
   :rdf/type
   [:madsrdf/MADSScheme :skos/ConceptScheme :madsrdf/DeprecatedAuthority],
   :rdfs/comment "The action the preservation repository is allowed to take.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Actions Granted (DEPRECATED)"},
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType"],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/actionsGranted,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/actionsGranted.rdf,
                      :cs/subjectOfChange :loc.preservation/actionsGranted,
                      :rdf/type           :cs/ChangeSet}]})