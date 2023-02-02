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
  "The agent that gave permission for the event."
  {:db/ident :loc.preservation.linkingAgentRoleEvent/aut,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2011-06-01T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingAgentRoleEvent/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-24T02:51:42.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingAgentRoleEvent/aut,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "authorizer",
   :madsrdf/code "aut",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The agent that gave permission for the event."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.linkingAgentRoleEvent/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/linkingAgentRoleEvent
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.eventRelatedAgentRole/aut,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole/aut"],
   :skos/changeNote
   [{:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2017-03-24T02:51:42.000-00:00",
     :cs/creatorName     :loc.preservation.linkingAgentRoleEvent/aut,
     :cs/subjectOfChange :loc.preservation.linkingAgentRoleEvent/aut,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2011-06-01T04:00:00.000-00:00",
     :cs/creatorName     :loc.preservation.linkingAgentRoleEvent/dlc,
     :cs/subjectOfChange :loc.preservation.linkingAgentRoleEvent/aut,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The agent that gave permission for the event."},
   :skos/inScheme [:loc.preservation/linkingAgentRoleEvent
                   :loc.vocabulary/preservation],
   :skos/notation "aut",
   :skos/prefLabel "authorizer"})

(def exe
  "The software agent that executes a program."
  {:db/ident :loc.preservation.linkingAgentRoleEvent/exe,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-24T02:51:43.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingAgentRoleEvent/exe,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2011-06-01T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingAgentRoleEvent/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "executing program",
   :madsrdf/code "exe",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The software agent that executes a program."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.linkingAgentRoleEvent/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/linkingAgentRoleEvent
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.eventRelatedAgentRole/exe,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole/exe"],
   :skos/changeNote
   [{:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2017-03-24T02:51:43.000-00:00",
     :cs/creatorName     :loc.preservation.linkingAgentRoleEvent/exe,
     :cs/subjectOfChange :loc.preservation.linkingAgentRoleEvent/exe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2011-06-01T04:00:00.000-00:00",
     :cs/creatorName     :loc.preservation.linkingAgentRoleEvent/dlc,
     :cs/subjectOfChange :loc.preservation.linkingAgentRoleEvent/exe,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "The software agent that executes a program."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/linkingAgentRoleEvent],
   :skos/notation "exe",
   :skos/prefLabel "executing program"})

(def imp
  "The agent that carries out the event."
  {:db/ident :loc.preservation.linkingAgentRoleEvent/imp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-24T02:51:44.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingAgentRoleEvent/imp,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2011-06-01T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingAgentRoleEvent/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "implementer",
   :madsrdf/code "imp",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "The agent that carries out the event."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.linkingAgentRoleEvent/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/linkingAgentRoleEvent
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.eventRelatedAgentRole/imp,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole/imp"],
   :skos/changeNote
   [{:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2017-03-24T02:51:44.000-00:00",
     :cs/creatorName     :loc.preservation.linkingAgentRoleEvent/imp,
     :cs/subjectOfChange :loc.preservation.linkingAgentRoleEvent/imp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2011-06-01T04:00:00.000-00:00",
     :cs/creatorName     :loc.preservation.linkingAgentRoleEvent/dlc,
     :cs/subjectOfChange :loc.preservation.linkingAgentRoleEvent/imp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The agent that carries out the event."},
   :skos/inScheme [:loc.preservation/linkingAgentRoleEvent
                   :loc.vocabulary/preservation],
   :skos/notation "imp",
   :skos/prefLabel "implementer"})

(def val
  "The agent that checks whether specified requirements are met."
  {:db/ident :loc.preservation.linkingAgentRoleEvent/val,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2011-06-01T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingAgentRoleEvent/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-24T02:51:45.000-00:00",
     :ri/recordContentSource :loc.preservation.linkingAgentRoleEvent/val,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "validator",
   :madsrdf/code "val",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "The agent that checks whether specified requirements are met."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.linkingAgentRoleEvent/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/linkingAgentRoleEvent],
   :madsrdf/useInstead :loc.preservation.eventRelatedAgentRole/val,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole/val"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2011-06-01T04:00:00.000-00:00",
     :cs/creatorName     :loc.preservation.linkingAgentRoleEvent/dlc,
     :cs/subjectOfChange :loc.preservation.linkingAgentRoleEvent/val,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "deprecated",
     :cs/createdDate     #inst "2017-03-24T02:51:45.000-00:00",
     :cs/creatorName     :loc.preservation.linkingAgentRoleEvent/val,
     :cs/subjectOfChange :loc.preservation.linkingAgentRoleEvent/val,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "The agent that checks whether specified requirements are met."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/linkingAgentRoleEvent],
   :skos/notation "val",
   :skos/prefLabel "validator"})

(def ^{:private true} linkingAgentRoleEvent
  "The role of the agent in relation to this event"
  {:db/ident :loc.preservation/linkingAgentRoleEvent,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-24T02:51:41.000-00:00",
     :ri/recordContentSource :loc.preservation/linkingAgentRoleEvent.rdf,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2011-06-01T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
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