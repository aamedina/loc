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
  "Remove from the repository."
  {:db/ident :loc.preservation.actionsGranted/del,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/del,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "delete",
   :madsrdf/code "del",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Remove from the repository."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.actionsGranted/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/actionsGranted
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead [:loc.preservation.eventType/der
                        :loc.preservation.eventType/del],
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/der"
                  "http://id.loc.gov/vocabulary/preservation/eventType/del"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/del,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/del,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/dlc,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/del,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Remove from the repository."},
   :skos/inScheme [:loc.preservation/actionsGranted
                   :loc.vocabulary/preservation],
   :skos/notation "del",
   :skos/prefLabel "delete"})

(def dis
  "Create a copy or version for use outside of the preservation repository."
  {:db/ident :loc.preservation.actionsGranted/dis,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/dis,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "disseminate",
   :madsrdf/code "dis",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Create a copy or version for use outside of the preservation repository."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.actionsGranted/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/actionsGranted
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.eventType/dis,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/dis"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/dis,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/dis,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/dlc,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/dis,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Create a copy or version for use outside of the preservation repository."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/actionsGranted],
   :skos/notation "dis",
   :skos/prefLabel "disseminate"})

(def mig
  "Make a copy identical in content in a different file format."
  {:db/ident :loc.preservation.actionsGranted/mig,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/mig,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "migrate",
   :madsrdf/code "mig",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Make a copy identical in content in a different file format."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.actionsGranted/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/actionsGranted],
   :madsrdf/useInstead :loc.preservation.eventType/mig,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/mig"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/mig,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/mig,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/dlc,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/mig,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Make a copy identical in content in a different file format."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/actionsGranted],
   :skos/notation "mig",
   :skos/prefLabel "migrate"})

(def mod
  "Make a version different in content."
  {:db/ident :loc.preservation.actionsGranted/mod,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/mod,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "modify",
   :madsrdf/code "mod",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Make a version different in content."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.actionsGranted/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/actionsGranted
                                  :loc.vocabulary/preservation],
   :madsrdf/useInstead :loc.preservation.eventType/mod,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/mod"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/mod,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/mod,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/dlc,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/mod,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Make a version different in content."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/actionsGranted],
   :skos/notation "mod",
   :skos/prefLabel "modify"})

(def rep
  "Make an exact copy."
  {:db/ident :loc.preservation.actionsGranted/rep,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/rep,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "replicate",
   :madsrdf/code "rep",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Make an exact copy."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.actionsGranted/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/actionsGranted],
   :madsrdf/useInstead :loc.preservation.eventType/rep,
   :rdf/type :madsrdf/Authority,
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/preservation/eventType/rep"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/rep,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/rep,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/dlc,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/rep,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Make an exact copy."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/actionsGranted],
   :skos/notation "rep",
   :skos/prefLabel "replicate"})

(def use
  "Read without copying or modifying (e.g., to validate a file or run a program)."
  {:db/ident :loc.preservation.actionsGranted/use,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.actionsGranted/use,
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "use",
   :madsrdf/code "use",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Read without copying or modifying (e.g., to validate a file or run a program)."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.actionsGranted/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/actionsGranted
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/use,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/use,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.actionsGranted/dlc,
                      :cs/subjectOfChange :loc.preservation.actionsGranted/use,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Read without copying or modifying (e.g., to validate a file or run a program)."},
   :skos/inScheme [:loc.preservation/actionsGranted
                   :loc.vocabulary/preservation],
   :skos/notation "use",
   :skos/prefLabel "use"})

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