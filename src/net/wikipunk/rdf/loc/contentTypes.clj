(ns net.wikipunk.rdf.loc.contentTypes
  "http://id.loc.gov/vocabulary/contentTypes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/contentTypes.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.contentTypes"
                       "http://id.loc.gov/vocabulary/contentTypes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.contentTypes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/contentTypes/"})

(def cod
  "computer dataset"
  {:db/ident :loc.contentTypes/cod,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer dataset",
   :madsrdf/code "cod",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: m"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/cod,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: m"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "cod",
   :skos/prefLabel "computer dataset"})

(def cop
  "computer program"
  {:db/ident :loc.contentTypes/cop,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer program",
   :madsrdf/code "cop",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: m"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/cop,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: m"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "cop",
   :skos/prefLabel "computer program"})

(def crd
  "cartographic dataset"
  {:db/ident :loc.contentTypes/crd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "cartographic dataset",
   :madsrdf/code "crd",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: e or f"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/crd,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: e or f"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "crd",
   :skos/prefLabel "cartographic dataset"})

(def crf
  "cartographic three-dimensional form"
  {:db/ident :loc.contentTypes/crf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "cartographic three-dimensional form",
   :madsrdf/code "crf",
   :madsrdf/hasVariant {:madsrdf/variantLabel "cartographic 3D form",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: e or f"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "cartographic 3D form",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/crf,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: e or f"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "crf",
   :skos/prefLabel "cartographic three-dimensional form",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "cartographic 3D form"}})

(def cri
  "cartographic image"
  {:db/ident :loc.contentTypes/cri,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "cartographic image",
   :madsrdf/code "cri",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: e or f"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/cri,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: e or f"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "cri",
   :skos/prefLabel "cartographic image"})

(def crm
  "cartographic moving image"
  {:db/ident :loc.contentTypes/crm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "cartographic moving image",
   :madsrdf/code "crm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: e or f"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/crm,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: e or f"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "crm",
   :skos/prefLabel "cartographic moving image"})

(def crn
  "cartographic tactile three-dimensional form"
  {:db/ident :loc.contentTypes/crn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "cartographic tactile three-dimensional form",
   :madsrdf/code "crn",
   :madsrdf/hasVariant {:madsrdf/variantLabel "cartographic tactile 3D form",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: e or f"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "cartographic tactile 3D form",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/crn,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: e or f"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "crn",
   :skos/prefLabel "cartographic tactile three-dimensional form",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "cartographic tactile 3D form"}})

(def crt
  "cartographic tactile image"
  {:db/ident :loc.contentTypes/crt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "cartographic tactile image",
   :madsrdf/code "crt",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: e or f"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/crt,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: e or f"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "crt",
   :skos/prefLabel "cartographic tactile image"})

(def ntm
  "notated music"
  {:db/ident :loc.contentTypes/ntm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "notated music",
   :madsrdf/code "ntm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: c or d"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/ntm,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: c or d"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "ntm",
   :skos/prefLabel "notated music"})

(def ntv
  "notated movement"
  {:db/ident :loc.contentTypes/ntv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "notated movement",
   :madsrdf/code "ntv",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: a or t"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/ntv,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: a or t"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "ntv",
   :skos/prefLabel "notated movement"})

(def prm
  "performed music"
  {:db/ident :loc.contentTypes/prm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "performed music",
   :madsrdf/code "prm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: j"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/prm,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: j"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "prm",
   :skos/prefLabel "performed music"})

(def snd
  "sounds"
  {:db/ident :loc.contentTypes/snd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "sounds",
   :madsrdf/code "snd",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: i"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/snd,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: i"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "snd",
   :skos/prefLabel "sounds"})

(def spw
  "spoken word"
  {:db/ident :loc.contentTypes/spw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "spoken word",
   :madsrdf/code "spw",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: i"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/spw,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: i"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "spw",
   :skos/prefLabel "spoken word"})

(def sti
  "still image"
  {:db/ident :loc.contentTypes/sti,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "still image",
   :madsrdf/code "sti",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: k"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/sti,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: k"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "sti",
   :skos/prefLabel "still image"})

(def tcf
  "tactile three-dimensional form"
  {:db/ident :loc.contentTypes/tcf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "tactile three-dimensional form",
   :madsrdf/code "tcf",
   :madsrdf/hasVariant {:madsrdf/variantLabel "tactile 3D form",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: r"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "tactile 3D form",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/tcf,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: r"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "tcf",
   :skos/prefLabel "tactile three-dimensional form",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "tactile 3D form"}})

(def tci
  "tactile image"
  {:db/ident :loc.contentTypes/tci,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "tactile image",
   :madsrdf/code "tci",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: k"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/tci,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: k"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "tci",
   :skos/prefLabel "tactile image"})

(def tcm
  "tactile notated music"
  {:db/ident :loc.contentTypes/tcm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "tactile notated music",
   :madsrdf/code "tcm",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: c or d"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/tcm,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: c or d"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "tcm",
   :skos/prefLabel "tactile notated music"})

(def tcn
  "tactile notated movement"
  {:db/ident :loc.contentTypes/tcn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "tactile notated movement",
   :madsrdf/code "tcn",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: a or t"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/tcn,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: a or t"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "tcn",
   :skos/prefLabel "tactile notated movement"})

(def tct
  "tactile text"
  {:db/ident :loc.contentTypes/tct,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "tactile text",
   :madsrdf/code "tct",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: a or t"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/tct,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: a or t"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "tct",
   :skos/prefLabel "tactile text"})

(def tdf
  "three-dimensional form"
  {:db/ident :loc.contentTypes/tdf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "three-dimensional form",
   :madsrdf/code "tdf",
   :madsrdf/hasVariant {:madsrdf/variantLabel "3D form",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: r"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "3D form",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/tdf,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: r"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "tdf",
   :skos/prefLabel "three-dimensional form",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "3D form"}})

(def tdi
  "two-dimensional moving image"
  {:db/ident :loc.contentTypes/tdi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "two-dimensional moving image",
   :madsrdf/code "tdi",
   :madsrdf/hasVariant {:madsrdf/variantLabel "2D moving image",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: g"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "2D moving image",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/tdi,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: g"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "tdi",
   :skos/prefLabel "two-dimensional moving image",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "2D moving image"}})

(def tdm
  "three-dimensional moving image"
  {:db/ident :loc.contentTypes/tdm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "three-dimensional moving image",
   :madsrdf/code "tdm",
   :madsrdf/hasVariant {:madsrdf/variantLabel "3D moving image",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: g"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "3D moving image",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/tdm,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: g"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "tdm",
   :skos/prefLabel "three-dimensional moving image",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "3D moving image"}})

(def txt
  "text"
  {:db/ident :loc.contentTypes/txt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "text",
   :madsrdf/code "txt",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: a or t"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/txt,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: a or t"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "txt",
   :skos/prefLabel "text"})

(def xxx
  "other"
  {:db/ident :loc.contentTypes/xxx,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other",
   :madsrdf/code "xxx",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: Leader/06: o or p"},
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/xxx,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: Leader/06: o or p"},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "xxx",
   :skos/prefLabel "other"})

(def zzz
  "unspecified"
  {:db/ident :loc.contentTypes/zzz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "unspecified",
   :madsrdf/code "zzz",
   :madsrdf/isMemberOfMADSCollection :loc.contentTypes/collection_ContentTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/contentTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.contentTypes/zzz,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/contentTypes,
   :skos/notation "zzz",
   :skos/prefLabel "unspecified"})

(def ^{:private true} contentTypes
  "The Content Types Scheme is derived from a controlled list of values representing the form of communication through which a work is expressed, which is principally used in RDA cataloging."
  {:db/ident :loc.vocabulary/contentTypes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-13T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Content Types Scheme is derived from a controlled list of values representing the form of communication through which a work is expressed, which is principally used in RDA cataloging."},
   :madsrdf/hasMADSSchemeMember [:loc.contentTypes/ntm
                                 :loc.contentTypes/spw
                                 :loc.contentTypes/cop
                                 :loc.contentTypes/sti
                                 :loc.contentTypes/tct
                                 :loc.contentTypes/crt
                                 :loc.contentTypes/tcf
                                 :loc.contentTypes/crf
                                 :loc.contentTypes/txt
                                 :loc.contentTypes/xxx
                                 :loc.contentTypes/tdi
                                 :loc.contentTypes/zzz
                                 :loc.contentTypes/tci
                                 :loc.contentTypes/cri
                                 :loc.contentTypes/tdf
                                 :loc.contentTypes/cod
                                 :loc.contentTypes/ntv
                                 :loc.contentTypes/tdm
                                 :loc.contentTypes/tcm
                                 :loc.contentTypes/crm
                                 :loc.contentTypes/snd
                                 :loc.contentTypes/tcn
                                 :loc.contentTypes/crn
                                 :loc.contentTypes/prm
                                 :loc.contentTypes/crd],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Content Types Scheme"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-13T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/contentTypes,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Content Types Scheme is derived from a controlled list of values representing the form of communication through which a work is expressed, which is principally used in RDA cataloging."}})