(ns net.wikipunk.rdf.loc.preservation.environmentRegistryRole
  "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.environmentRegistryRole"
    "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.environmentRegistryRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole/"})

(def com
  "Information to check that the object can run in the environment."
  {:db/ident :loc.preservation.environmentRegistryRole/com,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentRegistryRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentRegistryRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "compatibility check",
   :madsrdf/code "com",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Information to check that the object can run in the environment."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentRegistryRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/environmentRegistryRole],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :skos/closeMatch,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.environmentRegistryRole/com,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.environmentRegistryRole/com,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information to check that the object can run in the environment."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentRegistryRole],
   :skos/notation "com",
   :skos/prefLabel "compatibility check"})

(def gen
  "The registry describes a more generic entity than the object represents."
  {:db/ident :loc.preservation.environmentRegistryRole/gen,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentRegistryRole/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentRegistryRole/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "generalization",
   :madsrdf/code "gen",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The registry describes a more generic entity than the object represents."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentRegistryRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentRegistryRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :skos/closeMatch,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.environmentRegistryRole/gen,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.environmentRegistryRole/gen,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The registry describes a more generic entity than the object represents."},
   :skos/inScheme [:loc.preservation/environmentRegistryRole
                   :loc.vocabulary/preservation],
   :skos/notation "gen",
   :skos/prefLabel "generalization"})

(def ide
  "General information to allow for identification."
  {:db/ident :loc.preservation.environmentRegistryRole/ide,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentRegistryRole/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentRegistryRole/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "identification",
   :madsrdf/code "ide",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "General information to allow for identification."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentRegistryRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentRegistryRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :skos/closeMatch,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.environmentRegistryRole/ide,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.environmentRegistryRole/ide,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "General information to allow for identification."},
   :skos/inScheme [:loc.preservation/environmentRegistryRole
                   :loc.vocabulary/preservation],
   :skos/notation "ide",
   :skos/prefLabel "identification"})

(def spe
  "An explicit set of requirements to be satisfied by an environment."
  {:db/ident :loc.preservation.environmentRegistryRole/spe,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentRegistryRole/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentRegistryRole/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "specification",
   :madsrdf/code "spe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An explicit set of requirements to be satisfied by an environment."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentRegistryRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentRegistryRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :skos/closeMatch,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.environmentRegistryRole/spe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.environmentRegistryRole/spe,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An explicit set of requirements to be satisfied by an environment."},
   :skos/inScheme [:loc.preservation/environmentRegistryRole
                   :loc.vocabulary/preservation],
   :skos/notation "spe",
   :skos/prefLabel "specification"})

(def ^{:private true} environmentRegistryRole
  "The purpose or expected use of the environment registry."
  {:db/ident        :loc.preservation/environmentRegistryRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.environmentRegistryRole/ide
                                 :loc.preservation.environmentRegistryRole/com
                                 :loc.preservation.environmentRegistryRole/spe
                                 :loc.preservation.environmentRegistryRole/gen],
   :madsrdf/hasRelatedAuthority :loc.preservation/formatRegistryRole,
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "The purpose or expected use of the environment registry.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Environment Registry Role"},
   :skos/changeNote [{:cs/changeReason "new",
                      :cs/createdDate #inst "2016-01-21T05:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/dlc,
                      :cs/subjectOfChange
                      :loc.preservation/environmentRegistryRole,
                      :rdf/type :cs/ChangeSet}
                     {:cs/changeReason "modified",
                      :cs/createdDate #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/dlc,
                      :cs/subjectOfChange
                      :loc.preservation/environmentRegistryRole,
                      :rdf/type :cs/ChangeSet}],
   :skos/semanticRelation :loc.preservation/formatRegistryRole})