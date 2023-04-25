(ns net.wikipunk.rdf.loc.preservation.formatRegistryRole
  "http://id.loc.gov/vocabulary/preservation/formatRegistryRole/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/formatRegistryRole.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.formatRegistryRole"
    "http://id.loc.gov/vocabulary/preservation/formatRegistryRole/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.formatRegistryRole",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/formatRegistryRole/"}
  (:refer-clojure :exclude [val]))

(def spe
  "An explicit set of requirements to be satisfied by a file format, i.e. a package of information that can be stored as a data file."
  {:db/ident :loc.preservation.formatRegistryRole/spe,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.formatRegistryRole/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.formatRegistryRole/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "specification",
   :madsrdf/code "spe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An explicit set of requirements to be satisfied by a file format, i.e. a package of information that can be stored as a data file."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.formatRegistryRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/formatRegistryRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :skos/closeMatch,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.formatRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.formatRegistryRole/spe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.formatRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.formatRegistryRole/spe,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An explicit set of requirements to be satisfied by a file format, i.e. a package of information that can be stored as a data file."},
   :skos/inScheme [:loc.preservation/formatRegistryRole
                   :loc.vocabulary/preservation],
   :skos/notation "spe",
   :skos/prefLabel "specification"})

(def val
  "The ability to measure conformance against a specific profile."
  {:db/ident :loc.preservation.formatRegistryRole/val,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.formatRegistryRole/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.formatRegistryRole/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "validation profile",
   :madsrdf/code "val",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The ability to measure conformance against a specific profile."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.formatRegistryRole/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/formatRegistryRole
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :skos/closeMatch,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.formatRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.formatRegistryRole/val,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.formatRegistryRole/dlc,
     :cs/subjectOfChange :loc.preservation.formatRegistryRole/val,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The ability to measure conformance against a specific profile."},
   :skos/inScheme [:loc.preservation/formatRegistryRole
                   :loc.vocabulary/preservation],
   :skos/notation "val",
   :skos/prefLabel "validation profile"})

(def ^{:private true} formatRegistryRole
  "The purpose or expected use of the registry."
  {:db/ident        :loc.preservation/formatRegistryRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.formatRegistryRole/val
                                 :loc.preservation.formatRegistryRole/spe],
   :madsrdf/hasRelatedAuthority :loc.preservation/environmentRegistryRole,
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "The purpose or expected use of the registry.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Format Registry Role"},
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/formatRegistryRole,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/formatRegistryRole,
                      :rdf/type           :cs/ChangeSet}],
   :skos/semanticRelation :loc.preservation/environmentRegistryRole})