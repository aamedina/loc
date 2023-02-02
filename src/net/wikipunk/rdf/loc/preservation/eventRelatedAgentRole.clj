(ns net.wikipunk.rdf.loc.preservation.eventRelatedAgentRole
  "http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.eventRelatedAgentRole"
    "http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.eventRelatedAgentRole",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/eventRelatedAgentRole/"}
  (:refer-clojure :exclude [val]))

(def aut
  "The agent that gave permission for the event."
  {:db/ident :loc.preservation.eventRelatedAgentRole/aut,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/aut,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-10T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/aut,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "authorizer",
   :madsrdf/code "aut",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The agent that gave permission for the event."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventRelatedAgentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventRelatedAgentRole
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.linkingAgentRoleEvent/aut,
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :prov/wasAssociatedWith,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-03-10T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/aut,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/aut,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/aut,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/aut,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/aut,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The agent that gave permission for the event."},
   :skos/inScheme [:loc.preservation/eventRelatedAgentRole
                   :loc.vocabulary/preservation],
   :skos/notation "aut",
   :skos/prefLabel "authorizer"})

(def exe
  "The software agent that executes a program."
  {:db/ident :loc.preservation.eventRelatedAgentRole/exe,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-10T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/exe,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/exe,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "executing program",
   :madsrdf/code "exe",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The software agent that executes a program."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventRelatedAgentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventRelatedAgentRole
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.linkingAgentRoleEvent/exe,
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :prov/wasAssociatedWith,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/exe,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/exe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/exe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-03-10T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/exe,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/exe,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "The software agent that executes a program."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/eventRelatedAgentRole],
   :skos/notation "exe",
   :skos/prefLabel "executing program"})

(def imp
  "The agent that carries out the event."
  {:db/ident :loc.preservation.eventRelatedAgentRole/imp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-10T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/imp,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/imp,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "implementer",
   :madsrdf/code "imp",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "The agent that carries out the event."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventRelatedAgentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/eventRelatedAgentRole
                                  :loc.vocabulary/preservation],
   :madsrdf/useFor :loc.preservation.linkingAgentRoleEvent/imp,
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :prov/wasAssociatedWith,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/imp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-03-10T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/imp,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/imp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/imp,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/imp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The agent that carries out the event."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/eventRelatedAgentRole],
   :skos/notation "imp",
   :skos/prefLabel "implementer"})

(def val
  "The agent that checks whether specified requirements are met."
  {:db/ident :loc.preservation.eventRelatedAgentRole/val,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/val,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-10T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/val,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.eventRelatedAgentRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "validator",
   :madsrdf/code "val",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "The agent that checks whether specified requirements are met."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.eventRelatedAgentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/eventRelatedAgentRole],
   :madsrdf/useFor :loc.preservation.linkingAgentRoleEvent/val,
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :prov/wasAssociatedWith,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/val,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-03-10T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/val,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/val,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.eventRelatedAgentRole/val,
     :cs/subjectOfChange :loc.preservation.eventRelatedAgentRole/val,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "The agent that checks whether specified requirements are met."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/eventRelatedAgentRole],
   :skos/notation "val",
   :skos/prefLabel "validator"})

(def ^{:private true} eventRelatedAgentRole
  "The role of the agent in relation to the described event."
  {:db/ident :loc.preservation/eventRelatedAgentRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/eventRelatedAgentRole.rdf,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-10T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/eventRelatedAgentRole.rdf,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.eventRelatedAgentRole/imp
                                 :loc.preservation.eventRelatedAgentRole/aut
                                 :loc.preservation.eventRelatedAgentRole/exe
                                 :loc.preservation.eventRelatedAgentRole/val],
   :madsrdf/useFor :loc.preservation/linkingAgentRoleEvent,
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "The role of the agent in relation to the described event.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Related Agent Role"},
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/eventRelatedAgentRole,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-03-10T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/eventRelatedAgentRole.rdf,
     :cs/subjectOfChange :loc.preservation/eventRelatedAgentRole,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/eventRelatedAgentRole.rdf,
     :cs/subjectOfChange :loc.preservation/eventRelatedAgentRole,
     :rdf/type           :cs/ChangeSet}]})