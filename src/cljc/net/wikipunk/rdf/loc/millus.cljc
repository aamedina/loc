(ns net.wikipunk.rdf.loc.millus
  "http://id.loc.gov/vocabulary/millus/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/millus.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.millus" "http://id.loc.gov/vocabulary/millus/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.millus",
   :rdfa/uri          "http://id.loc.gov/vocabulary/millus/"}
  (:refer-clojure :exclude [for map]))

(def chr
  "Illustrations include charts"
  {:db/ident :loc.millus/chr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Charts",
   :madsrdf/code "chr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include charts"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - d"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/chr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include charts"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - d"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "chr",
   :skos/prefLabel "Charts"})

(def coa
  "Illustrations include coats of arms"
  {:db/ident :loc.millus/coa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Coats of arms",
   :madsrdf/code "coa",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Illustrations include coats of arms"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - i"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/coa,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include coats of arms"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - i"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "coa",
   :skos/prefLabel "Coats of arms"})

(def fac
  "Illustrations include facsimilies"
  {:db/ident :loc.millus/fac,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Facsimiles",
   :madsrdf/code "fac",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include facsimilies"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - h"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/fac,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include facsimilies"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - h"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "fac",
   :skos/prefLabel "Facsimiles"})

(def for
  "Illustrations include forms"
  {:db/ident :loc.millus/for,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Forms",
   :madsrdf/code "for",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include forms"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - k"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/for,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include forms"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - k"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "for",
   :skos/prefLabel "Forms"})

(def gnt
  "Illustrations include genealogical tables"
  {:db/ident :loc.millus/gnt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Genealogical tables",
   :madsrdf/code "gnt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Illustrations include genealogical tables"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - j"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/gnt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include genealogical tables"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - j"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "gnt",
   :skos/prefLabel "Genealogical tables"})

(def ill
  "Resource contains illustrations, type unspecified"
  {:db/ident :loc.millus/ill,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Illustrations",
   :madsrdf/code "ill",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Resource contains illustrations, type unspecified"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/ill,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Resource contains illustrations, type unspecified"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - a"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "ill",
   :skos/prefLabel "Illustrations"})

(def map
  "Illustrations include maps."
  {:db/ident :loc.millus/map,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Maps",
   :madsrdf/code "map",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include maps."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/map,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include maps."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - b"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "map",
   :skos/prefLabel "Maps"})

(def mus
  "Illustrations include illustrative music"
  {:db/ident :loc.millus/mus,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Music",
   :madsrdf/code "mus",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Illustrations include illustrative music"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - g"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/mus,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include illustrative music"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - g"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "mus",
   :skos/prefLabel "Music"})

(def pho
  "Illustrations include phonodisc(s)"
  {:db/ident :loc.millus/pho,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Phonodisc",
   :madsrdf/code "pho",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include phonodisc(s)"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - m"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/pho,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include phonodisc(s)"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - m"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "pho",
   :skos/prefLabel "Phonodisc"})

(def pht
  "Illustrations include photographs"
  {:db/ident :loc.millus/pht,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Photographs",
   :madsrdf/code "pht",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include photographs"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - o"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/pht,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include photographs"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - o"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "pht",
   :skos/prefLabel "Photographs"})

(def pln
  "Illustrations include plans"
  {:db/ident :loc.millus/pln,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Plans",
   :madsrdf/code "pln",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include plans"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/pln,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include plans"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - e"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "pln",
   :skos/prefLabel "Plans"})

(def plt
  "Illustrations include plates."
  {:db/ident :loc.millus/plt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Plates",
   :madsrdf/code "plt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include plates."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - f"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/plt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include plates."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - f"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "plt",
   :skos/prefLabel "Plates"})

(def por
  "Illustrations include portraits"
  {:db/ident :loc.millus/por,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Portraits",
   :madsrdf/code "por",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include portraits"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/por,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include portraits"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - c"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "por",
   :skos/prefLabel "Portraits"})

(def sam
  "Illustrations include samples."
  {:db/ident :loc.millus/sam,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Samples",
   :madsrdf/code "sam",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Illustrations include samples."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008BK/18-21 - l"},
   :madsrdf/isMemberOfMADSCollection :loc.millus/collection_millus,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/millus,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.millus/sam,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Illustrations include samples."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008BK/18-21 - l"},
   :skos/inScheme :loc.vocabulary/millus,
   :skos/notation "sam",
   :skos/prefLabel "Samples"})

(def ^{:private true} millus
  "Presence of image content that accompanies the primary content of a resource."
  {:db/ident :loc.vocabulary/millus,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presence of image content that accompanies the primary content of a resource."},
   :madsrdf/hasMADSSchemeMember [:loc.millus/pln
                                 :loc.millus/coa
                                 :loc.millus/por
                                 :loc.millus/map
                                 :loc.millus/chr
                                 :loc.millus/fac
                                 :loc.millus/for
                                 :loc.millus/pho
                                 :loc.millus/pht
                                 :loc.millus/sam
                                 :loc.millus/ill
                                 :loc.millus/gnt
                                 :loc.millus/plt
                                 :loc.millus/mus],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Illustrative Content"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/millus,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presence of image content that accompanies the primary content of a resource."}})