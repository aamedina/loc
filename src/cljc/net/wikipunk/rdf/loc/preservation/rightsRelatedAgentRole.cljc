(ns net.wikipunk.rdf.loc.preservation.rightsRelatedAgentRole
  "http://id.loc.gov/vocabulary/preservation/rightsRelatedAgentRole/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/rightsRelatedAgentRole.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.rightsRelatedAgentRole"
    "http://id.loc.gov/vocabulary/preservation/rightsRelatedAgentRole/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.rightsRelatedAgentRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/rightsRelatedAgentRole/"})

(def ase
  "The Agent to which an Action is permitted or prohibited."
  {:db/ident :loc.preservation.rightsRelatedAgentRole/ase,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.rightsRelatedAgentRole/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "assignee",
   :madsrdf/code "ase",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "The Agent to which an Action is permitted or prohibited."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.rightsRelatedAgentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/rightsRelatedAgentRole],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :prov/influenced,
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
    :cs/creatorName     :loc.preservation.rightsRelatedAgentRole/dlc,
    :cs/subjectOfChange :loc.preservation.rightsRelatedAgentRole/ase,
    :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The Agent to which an Action is permitted or prohibited."},
   :skos/inScheme [:loc.preservation/rightsRelatedAgentRole
                   :loc.vocabulary/preservation],
   :skos/notation "ase",
   :skos/prefLabel "assignee"})

(def con
  "An agent that provides further information."
  {:db/ident :loc.preservation.rightsRelatedAgentRole/con,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsRelatedAgentRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsRelatedAgentRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "contact",
   :madsrdf/code "con",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "An agent that provides further information."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.rightsRelatedAgentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/rightsRelatedAgentRole],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :prov/wasInfluencedBy,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.rightsRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.rightsRelatedAgentRole/con,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.rightsRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.rightsRelatedAgentRole/con,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "An agent that provides further information."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/rightsRelatedAgentRole],
   :skos/notation "con",
   :skos/prefLabel "contact"})

(def gra
  "An agent granting the rights to an object."
  {:db/ident :loc.preservation.rightsRelatedAgentRole/gra,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsRelatedAgentRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsRelatedAgentRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "grantor",
   :madsrdf/code "gra",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "An agent granting the rights to an object."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.rightsRelatedAgentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/rightsRelatedAgentRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :prov/wasInfluencedBy,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.rightsRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.rightsRelatedAgentRole/gra,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.rightsRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.rightsRelatedAgentRole/gra,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "An agent granting the rights to an object."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/rightsRelatedAgentRole],
   :skos/notation "gra",
   :skos/prefLabel "grantor"})

(def rig
  "An agent that owns or manages the rights of an object."
  {:db/ident :loc.preservation.rightsRelatedAgentRole/rig,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsRelatedAgentRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.rightsRelatedAgentRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "rightsholder",
   :madsrdf/code "rig",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "An agent that owns or manages the rights of an object."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.rightsRelatedAgentRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/rightsRelatedAgentRole],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :prov/wasInfluencedBy,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.rightsRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.rightsRelatedAgentRole/rig,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.rightsRelatedAgentRole/dlc,
     :cs/subjectOfChange :loc.preservation.rightsRelatedAgentRole/rig,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An agent that owns or manages the rights of an object."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/rightsRelatedAgentRole],
   :skos/notation "rig",
   :skos/prefLabel "rightsholder"})

(def ^{:private true} rightsRelatedAgentRole
  "The role of the agent in relation to the Rights Statement."
  {:db/ident :loc.preservation/rightsRelatedAgentRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.rightsRelatedAgentRole/con
                                 :loc.preservation.rightsRelatedAgentRole/ase
                                 :loc.preservation.rightsRelatedAgentRole/rig
                                 :loc.preservation.rightsRelatedAgentRole/gra],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "The role of the agent in relation to the Rights Statement.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Rights Related Agent Role"},
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/rightsRelatedAgentRole,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/rightsRelatedAgentRole,
     :rdf/type           :cs/ChangeSet}]})