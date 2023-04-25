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
  "The part of a computer that is fixed and cannot be altered without replacement or physical modification, e.g. motherboard, expansion cards."
  {:db/ident :loc.preservation.agentType/har,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.agentType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.agentType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "hardware",
   :madsrdf/code "har",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The part of a computer that is fixed and cannot be altered without replacement or physical modification, e.g. motherboard, expansion cards."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.agentType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/agentType
                                  :loc.vocabulary/preservation],
   :owl/sameAs :premis/HardwareAgent,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Agent,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.agentType/dlc,
                      :cs/subjectOfChange :loc.preservation.agentType/har,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.agentType/dlc,
                      :cs/subjectOfChange :loc.preservation.agentType/har,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The part of a computer that is fixed and cannot be altered without replacement or physical modification, e.g. motherboard, expansion cards."},
   :skos/inScheme [:loc.preservation/agentType :loc.vocabulary/preservation],
   :skos/notation "har",
   :skos/prefLabel "hardware"})

(def org
  "A social group which distributes tasks for a collective goal."
  {:db/ident :loc.preservation.agentType/org,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.agentType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.agentType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "organization",
   :madsrdf/code "org",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A social group which distributes tasks for a collective goal."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.agentType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/agentType],
   :owl/sameAs :premis/Organization,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Agent,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.agentType/dlc,
                      :cs/subjectOfChange :loc.preservation.agentType/org,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.agentType/dlc,
                      :cs/subjectOfChange :loc.preservation.agentType/org,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A social group which distributes tasks for a collective goal."},
   :skos/inScheme [:loc.preservation/agentType :loc.vocabulary/preservation],
   :skos/notation "org",
   :skos/prefLabel "organization"})

(def per
  "An individual human being."
  {:db/ident :loc.preservation.agentType/per,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.agentType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.agentType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "person",
   :madsrdf/code "per",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "An individual human being."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.agentType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/agentType
                                  :loc.vocabulary/preservation],
   :owl/sameAs :premis/Person,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Agent,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.agentType/dlc,
                      :cs/subjectOfChange :loc.preservation.agentType/per,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.agentType/dlc,
                      :cs/subjectOfChange :loc.preservation.agentType/per,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An individual human being."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/agentType],
   :skos/notation "per",
   :skos/prefLabel "person"})

(def sof
  "The collection of computer programs and related data that provide the instructions telling a computer what to do."
  {:db/ident :loc.preservation.agentType/sof,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.agentType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.agentType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "software",
   :madsrdf/code "sof",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The collection of computer programs and related data that provide the instructions telling a computer what to do."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.agentType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/agentType],
   :owl/sameAs :premis/SoftwareAgent,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Agent,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.agentType/dlc,
                      :cs/subjectOfChange :loc.preservation.agentType/sof,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.agentType/dlc,
                      :cs/subjectOfChange :loc.preservation.agentType/sof,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The collection of computer programs and related data that provide the instructions telling a computer what to do."},
   :skos/inScheme [:loc.vocabulary/preservation :loc.preservation/agentType],
   :skos/notation "sof",
   :skos/prefLabel "software"})

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
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/agentType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/agentType,
                      :rdf/type           :cs/ChangeSet}]})