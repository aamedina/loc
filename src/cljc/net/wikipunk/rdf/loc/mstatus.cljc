(ns net.wikipunk.rdf.loc.mstatus
  "http://id.loc.gov/vocabulary/mstatus/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mstatus.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mstatus" "http://id.loc.gov/vocabulary/mstatus/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mstatus",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mstatus/"})

(def c
  "Resource has been edited"
  {:db/ident :loc.mstatus/c,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-07-15T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "changed",
   :madsrdf/code "c",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Resource has been edited"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: L/05"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_RecStatus
                                      :loc.mstatus/collection_mstatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-07-15T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/c,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Resource has been edited"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: L/05"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "c",
   :skos/prefLabel "changed"})

(def cancinv
  "Identifier that has been cancelled or is not valid for the resource being described"
  {:db/ident :loc.mstatus/cancinv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-07-15T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-10-13T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "canceled or invalid",
   :madsrdf/code "cancinv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Identifier that has been cancelled or is not valid for the resource being described"},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "cancelled",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "invalid",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 022-m,z ; 010,015,016,017,020,024,027,030,035,074,086,088-z"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_mstatus
                                      :loc.mstatus/collection_IdStatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/altLabel ["cancelled" "invalid"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-10-13T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mstatus/cancinv,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2021-07-15T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mstatus/cancinv,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Identifier that has been cancelled or is not valid for the resource being described"},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 022-m,z ; 010,015,016,017,020,024,027,030,035,074,086,088-z"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "cancinv",
   :skos/prefLabel "canceled or invalid",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "invalid"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "cancelled"}]})

(def ceased
  "Resource has ceased to be published"
  {:db/ident :loc.mstatus/ceased,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-08-23T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ceased",
   :madsrdf/code "ceased",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Resource has ceased to be published"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/06"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_mstatus
                                      :loc.mstatus/collection_RecStatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-08-23T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/ceased,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Resource has ceased to be published"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/06"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "ceased",
   :skos/prefLabel "ceased"})

(def current
  "Resource is currently published or the frequency status is current"
  {:db/ident :loc.mstatus/current,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-08-23T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "current",
   :madsrdf/code "current",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource is currently published or the frequency status is current"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/06, 310"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_RecStatus
                                      :loc.mstatus/collection_mstatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-08-23T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/current,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource is currently published or the frequency status is current"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/06, 310"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "current",
   :skos/prefLabel "current"})

(def d
  "Resource has been deleted"
  {:db/ident :loc.mstatus/d,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-07-15T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "deleted",
   :madsrdf/code "d",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Resource has been deleted"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: L/05"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_mstatus
                                      :loc.mstatus/collection_RecStatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-07-15T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/d,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Resource has been deleted"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: L/05"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "d",
   :skos/prefLabel "deleted"})

(def former
  "Publication frequency status of resource is not current"
  {:db/ident :loc.mstatus/former,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-07-15T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "former",
   :madsrdf/code "former",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Publication frequency status of resource is not current"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 321"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_mstatus
                                      :loc.mstatus/collection_ProcStatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-07-15T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/former,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Publication frequency status of resource is not current"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 321"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "former",
   :skos/prefLabel "former"})

(def incorrect
  "Identifier that has been incorrectly associated with a resource"
  {:db/ident :loc.mstatus/incorrect,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-10-13T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-07-15T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "incorrect",
   :madsrdf/code "incorrect",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Identifier that has been incorrectly associated with a resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 022-y"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_IdStatus
                                      :loc.mstatus/collection_mstatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-10-13T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mstatus/incorrect,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2021-07-15T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mstatus/incorrect,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Identifier that has been incorrectly associated with a resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 022-y"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "incorrect",
   :skos/prefLabel "incorrect"})

(def n
  "Resource is newly-created"
  {:db/ident :loc.mstatus/n,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-07-15T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "new",
   :madsrdf/code "n",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Resource is newly-created"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: L/05"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_RecStatus
                                      :loc.mstatus/collection_mstatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-07-15T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/n,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Resource is newly-created"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: L/05"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "n",
   :skos/prefLabel "new"})

(def nuba
  "Data is supplied, but not used, by the assigning agency"
  {:db/ident :loc.mstatus/nuba,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-01-11T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "not used by assigner",
   :madsrdf/code "nuba",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Data is supplied, but not used, by the assigning agency"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 050"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_mstatus
                                      :loc.mstatus/collection_RecStatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-01-11T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/nuba,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Data is supplied, but not used, by the assigning agency"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 050"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "nuba",
   :skos/prefLabel "not used by assigner"})

(def p
  "The encoding level of the resource has been changed since prepublication"
  {:db/ident :loc.mstatus/p,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-07-15T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "prepublication",
   :madsrdf/code "p",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The encoding level of the resource has been changed since prepublication"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: L/05"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_RecStatus
                                      :loc.mstatus/collection_ProcStatus
                                      :loc.mstatus/collection_mstatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-07-15T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/p,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The encoding level of the resource has been changed since prepublication"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: L/05"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "p",
   :skos/prefLabel "prepublication"})

(def part
  "Information contained in the resource is incomplete"
  {:db/ident :loc.mstatus/part,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-07-30T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "partial",
   :madsrdf/code "part",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Information contained in the resource is incomplete"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 382"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_mstatus
                                      :loc.mstatus/collection_ProcStatus
                                      :loc.mstatus/collection_RecStatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-07-30T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/part,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Information contained in the resource is incomplete"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 382"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "part",
   :skos/prefLabel "partial"})

(def s
  "Resource is suppressed from public display"
  {:db/ident :loc.mstatus/s,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-07-15T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "suppressed",
   :madsrdf/code "s",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Resource is suppressed from public display"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_RecStatus
                                      :loc.mstatus/collection_mstatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-07-15T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/s,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Resource is suppressed from public display"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "s",
   :skos/prefLabel "suppressed"})

(def t
  "Data is transcribed from the resource"
  {:db/ident :loc.mstatus/t,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-07-21T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "transcribed",
   :madsrdf/code "t",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Data is transcribed from the resource"},
   :madsrdf/isMemberOfMADSCollection :loc.mstatus/collection_mstatus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-07-21T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/t,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Data is transcribed from the resource"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "t",
   :skos/prefLabel "transcribed"})

(def u
  "Status of the resource is unknown"
  {:db/ident :loc.mstatus/u,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-09-20T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "unknown",
   :madsrdf/code "u",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Status of the resource is unknown"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/06"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_RecStatus
                                      :loc.mstatus/collection_mstatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-09-20T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/u,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Status of the resource is unknown"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/06"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "u",
   :skos/prefLabel "unknown"})

(def uba
  "Data is supplied and used by the assigning agency"
  {:db/ident :loc.mstatus/uba,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-01-11T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "used by assigner",
   :madsrdf/code "uba",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Data is supplied and used by the assigning agency"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 050"},
   :madsrdf/isMemberOfMADSCollection [:loc.mstatus/collection_RecStatus
                                      :loc.mstatus/collection_mstatus],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mstatus,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-01-11T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mstatus/uba,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Data is supplied and used by the assigning agency"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 050"},
   :skos/inScheme :loc.vocabulary/mstatus,
   :skos/notation "uba",
   :skos/prefLabel "used by assigner"})

(def ^{:private true} mstatus
  "Codes and term sources to indicate the status of a resource"
  {:db/ident :loc.vocabulary/mstatus,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-08-25T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Codes and term sources to indicate the status of a resource"},
   :madsrdf/hasMADSSchemeMember [:loc.mstatus/s
                                 :loc.mstatus/current
                                 :loc.mstatus/cancinv
                                 :loc.mstatus/nuba
                                 :loc.mstatus/p
                                 :loc.mstatus/t
                                 :loc.mstatus/d
                                 :loc.mstatus/n
                                 :loc.mstatus/former
                                 :loc.mstatus/ceased
                                 :loc.mstatus/incorrect
                                 :loc.mstatus/uba
                                 :loc.mstatus/c
                                 :loc.mstatus/part
                                 :loc.mstatus/u],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Status codes"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-08-25T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mstatus,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Codes and term sources to indicate the status of a resource"}})