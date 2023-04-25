(ns net.wikipunk.rdf.loc.mtapeconfig
  "http://id.loc.gov/vocabulary/mtapeconfig/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mtapeconfig.rdf",
   :madsrdf/authoritativeLabel "8 track",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mtapeconfig"
                       "http://id.loc.gov/vocabulary/mtapeconfig/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdf/uri           "http://id.loc.gov/vocabulary/mtapeconfig/8",
   :rdfa/prefix       "loc.mtapeconfig",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mtapeconfig/"})

(def full
  "Full or single track recorded on one tape"
  {:db/ident :loc.mtapeconfig/full,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2019-04-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2019-04-22T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Full track",
   :madsrdf/code "full",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Full or single track recorded on one tape"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Single track",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/08 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.mtapeconfig/collection_mtapeconfig,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtapeconfig,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/altLabel "Single track",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2019-04-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2019-04-22T00:00:00/dlc",
    :cs/subjectOfChange :loc.mtapeconfig/full,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Full or single track recorded on one tape"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/08 - e"},
   :skos/inScheme :loc.vocabulary/mtapeconfig,
   :skos/notation "full",
   :skos/prefLabel "Full track",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Single track"}})

(def half
  "Two tracks (channels) recorded on one tape and used with monaural and stereophonic recordings"
  {:db/ident :loc.mtapeconfig/half,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2019-04-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2019-04-22T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Half track",
   :madsrdf/code "half",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Two tracks (channels) recorded on one tape and used with monaural and stereophonic recordings"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/08 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mtapeconfig/collection_mtapeconfig,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtapeconfig,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2019-04-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2019-04-22T00:00:00/dlc",
    :cs/subjectOfChange :loc.mtapeconfig/half,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Two tracks (channels) recorded on one tape and used with monaural and stereophonic recordings"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/08 - a"},
   :skos/inScheme :loc.vocabulary/mtapeconfig,
   :skos/notation "half",
   :skos/prefLabel "Half track"})

(def quarter
  "Four tracks (channels) recorded on one tape and used with stereophonic or quadraphonic recordings"
  {:db/ident :loc.mtapeconfig/quarter,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2019-04-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2019-04-22T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Quarter track",
   :madsrdf/code "quarter",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Four tracks (channels) recorded on one tape and used with stereophonic or quadraphonic recordings"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/08 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mtapeconfig/collection_mtapeconfig,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtapeconfig,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2019-04-22T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2019-04-22T00:00:00/dlc",
    :cs/subjectOfChange :loc.mtapeconfig/quarter,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Four tracks (channels) recorded on one tape and used with stereophonic or quadraphonic recordings"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/08 - b"},
   :skos/inScheme :loc.vocabulary/mtapeconfig,
   :skos/notation "quarter",
   :skos/prefLabel "Quarter track"})

(def ^{:private true} mtapeconfig
  "Number of tracks on a tape"
  {:db/ident        :loc.vocabulary/mtapeconfig,
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Number of tracks on a tape"},
   :madsrdf/hasMADSSchemeMember [:loc.mtapeconfig/half
                                 "http://id.loc.gov/vocabulary/mtapeconfig/16"
                                 "http://id.loc.gov/vocabulary/mtapeconfig/12"
                                 :loc.mtapeconfig/full
                                 :loc.mtapeconfig/quarter
                                 "http://id.loc.gov/vocabulary/mtapeconfig/8"],
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Tape Configuration"},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Number of tracks on a tape"}})