(ns net.wikipunk.rdf.loc.preservation.linkingAgentRoleEvent
  "http://id.loc.gov/vocabulary/preservation/linkingAgentRoleEvent/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/linkingAgentRoleEvent.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.linkingAgentRoleEvent"
    "http://id.loc.gov/vocabulary/preservation/linkingAgentRoleEvent/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.linkingAgentRoleEvent",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/linkingAgentRoleEvent/"}
  (:refer-clojure :exclude [val]))

(def aut
  "authorizer"
  {:db/ident :loc.preservation.linkingAgentRoleEvent/aut,
   :madsrdf/authoritativeLabel "authorizer",
   :rdf/type :madsrdf/Authority})

(def exe
  "executing program"
  {:db/ident :loc.preservation.linkingAgentRoleEvent/exe,
   :madsrdf/authoritativeLabel "executing program",
   :rdf/type :madsrdf/Authority})

(def imp
  "implementer"
  {:db/ident :loc.preservation.linkingAgentRoleEvent/imp,
   :madsrdf/authoritativeLabel "implementer",
   :rdf/type :madsrdf/Authority})

(def val
  "validator"
  {:db/ident :loc.preservation.linkingAgentRoleEvent/val,
   :madsrdf/authoritativeLabel "validator",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} linkingAgentRoleEvent
  "The role of the agent in relation to this event"
  {:db/ident :loc.preservation/linkingAgentRoleEvent,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2011-06-01T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-24T02:51:41.000-00:00",
     :ri/recordContentSource :loc.preservation/linkingAgentRoleEvent.rdf,
     :ri/recordStatus "deprecated"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.linkingAgentRoleEvent/exe
                                 :loc.preservation.linkingAgentRoleEvent/val
                                 :loc.preservation.linkingAgentRoleEvent/aut
                                 :loc.preservation.linkingAgentRoleEvent/imp],
   :madsrdf/useInstead :loc.preservation/eventRelatedAgentRole,
   :rdf/type
   [:skos/ConceptScheme :madsrdf/MADSScheme :madsrdf/DeprecatedAuthority],
   :rdfs/comment "The role of the agent in relation to this event",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Linking Agent Role (Event) (DEPRECATED)"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2011-06-01T04:00:00.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/linkingAgentRoleEvent,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2017-03-24T02:51:41.000-00:00",
     :cs/creatorName     :loc.preservation/linkingAgentRoleEvent.rdf,
     :cs/subjectOfChange :loc.preservation/linkingAgentRoleEvent,
     :rdf/type           :cs/ChangeSet}]})