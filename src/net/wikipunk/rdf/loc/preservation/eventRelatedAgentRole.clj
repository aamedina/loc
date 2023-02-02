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
  "authorizer"
  {:db/ident :loc.preservation.eventRelatedAgentRole/aut,
   :madsrdf/authoritativeLabel "authorizer",
   :rdf/type :madsrdf/Authority})

(def exe
  "executing program"
  {:db/ident :loc.preservation.eventRelatedAgentRole/exe,
   :madsrdf/authoritativeLabel "executing program",
   :rdf/type :madsrdf/Authority})

(def imp
  "implementer"
  {:db/ident :loc.preservation.eventRelatedAgentRole/imp,
   :madsrdf/authoritativeLabel "implementer",
   :rdf/type :madsrdf/Authority})

(def val
  "validator"
  {:db/ident :loc.preservation.eventRelatedAgentRole/val,
   :madsrdf/authoritativeLabel "validator",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} eventRelatedAgentRole
  "The role of the agent in relation to the described event."
  {:db/ident :loc.preservation/eventRelatedAgentRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-03-10T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/eventRelatedAgentRole.rdf,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
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
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/eventRelatedAgentRole.rdf,
     :cs/subjectOfChange :loc.preservation/eventRelatedAgentRole,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/eventRelatedAgentRole,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-03-10T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/eventRelatedAgentRole.rdf,
     :cs/subjectOfChange :loc.preservation/eventRelatedAgentRole,
     :rdf/type           :cs/ChangeSet}]})