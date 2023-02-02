(ns net.wikipunk.rdf.loc.preservation.agentType
  "http://id.loc.gov/vocabulary/preservation/agentType/"
  {:dcat/downloadURL  "http://id.loc.gov/vocabulary/preservation/agentType.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.preservation.agentType"
                       "http://id.loc.gov/vocabulary/preservation/agentType/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.preservation.agentType",
   :rdfa/uri          "http://id.loc.gov/vocabulary/preservation/agentType/"})

(def har
  "hardware"
  {:db/ident :loc.preservation.agentType/har,
   :madsrdf/authoritativeLabel "hardware",
   :rdf/type :madsrdf/Authority})

(def org
  "organization"
  {:db/ident :loc.preservation.agentType/org,
   :madsrdf/authoritativeLabel "organization",
   :rdf/type :madsrdf/Authority})

(def per
  "person"
  {:db/ident :loc.preservation.agentType/per,
   :madsrdf/authoritativeLabel "person",
   :rdf/type :madsrdf/Authority})

(def sof
  "software"
  {:db/ident :loc.preservation.agentType/sof,
   :madsrdf/authoritativeLabel "software",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} agentType
  "A high-level characterization of the type of agent."
  {:db/ident        :loc.preservation/agentType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.agentType/har
                                 :loc.preservation.agentType/per
                                 :loc.preservation.agentType/sof
                                 :loc.preservation.agentType/org],
   :rdf/type        [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment    "A high-level characterization of the type of agent.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Agent Type"},
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/agentType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/agentType,
                      :rdf/type           :cs/ChangeSet}]})