(ns net.wikipunk.rdf.loc.mcapturestorage
  "http://id.loc.gov/vocabulary/mcapturestorage/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mcapturestorage.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mcapturestorage"
                       "http://id.loc.gov/vocabulary/mcapturestorage/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mcapturestorage",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mcapturestorage/"})

(def acds
  "Sound captured using an acoustical horn and diaphragm and stored directly on a master surface"
  {:db/ident :loc.mcapturestorage/acds,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-20T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Acoustical capture, Direct storage",
   :madsrdf/code "acds",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Sound captured using an acoustical horn and diaphragm and stored directly on a master surface"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/13 - a"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mcapturestorage/collection_mcapturestorage,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcapturestorage,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-20T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcapturestorage/acds,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Sound captured using an acoustical horn and diaphragm and stored directly on a master surface"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/13 - a"},
   :skos/inScheme :loc.vocabulary/mcapturestorage,
   :skos/notation "acds",
   :skos/prefLabel "Acoustical capture, Direct storage"})

(def aes
  "Sound captured using electrical techniques and stored as modulations and pulses on a magnetic surface"
  {:db/ident :loc.mcapturestorage/aes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-20T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Electrical capture, Analog electrical storage",
   :madsrdf/code "aes",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Sound captured using electrical techniques and stored as modulations and pulses on a magnetic surface"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Analog electrical storage",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/13 - e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mcapturestorage/collection_mcapturestorage,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcapturestorage,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Analog electrical storage",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-20T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcapturestorage/aes,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Sound captured using electrical techniques and stored as modulations and pulses on a magnetic surface"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/13 - e"},
   :skos/inScheme :loc.vocabulary/mcapturestorage,
   :skos/notation "aes",
   :skos/prefLabel "Electrical capture, Analog electrical storage",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Analog electrical storage"}})

(def dist
  "Sound captured electrically and stored using digital techniques"
  {:db/ident :loc.mcapturestorage/dist,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-20T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Electrical capture, Digital storage",
   :madsrdf/code "dist",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Sound captured electrically and stored using digital techniques"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Digital storage",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/13 - d"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mcapturestorage/collection_mcapturestorage,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcapturestorage,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Digital storage",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-20T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcapturestorage/dist,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Sound captured electrically and stored using digital techniques"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/13 - d"},
   :skos/inScheme :loc.vocabulary/mcapturestorage,
   :skos/notation "dist",
   :skos/prefLabel "Electrical capture, Digital storage",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Digital storage"}})

(def dsna
  "Sound captured using electrical equipment like a microphone and stored directly on a master surface"
  {:db/ident :loc.mcapturestorage/dsna,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-20T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Electrical capture, Direct storage",
   :madsrdf/code "dsna",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Sound captured using electrical equipment like a microphone and stored directly on a master surface"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Direct storage, not acoustical",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/13 - b"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mcapturestorage/collection_mcapturestorage,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcapturestorage,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Direct storage, not acoustical",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-20T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcapturestorage/dsna,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Sound captured using electrical equipment like a microphone and stored directly on a master surface"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/13 - b"},
   :skos/inScheme :loc.vocabulary/mcapturestorage,
   :skos/notation "dsna",
   :skos/prefLabel "Electrical capture, Direct storage",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Direct storage, not acoustical"}})

(def unk
  "Sound capture and storage technique are not known"
  {:db/ident :loc.mcapturestorage/unk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-20T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Unknown capture and storage",
   :madsrdf/code "unk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Sound capture and storage technique are not known"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/13 - u"},
   :madsrdf/isMemberOfMADSCollection
   :loc.mcapturestorage/collection_mcapturestorage,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcapturestorage,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-20T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcapturestorage/unk,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sound capture and storage technique are not known"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/13 - u"},
   :skos/inScheme :loc.vocabulary/mcapturestorage,
   :skos/notation "unk",
   :skos/prefLabel "Unknown capture and storage"})

(def ^{:private true} mcapturestorage
  "Specifies the sound capture and storage technique used when the sound recording resource was originally recorded"
  {:db/ident :loc.vocabulary/mcapturestorage,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-20T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Specifies the sound capture and storage technique used when the sound recording resource was originally recorded"},
   :madsrdf/hasMADSSchemeMember [:loc.mcapturestorage/aes
                                 :loc.mcapturestorage/unk
                                 :loc.mcapturestorage/dist
                                 :loc.mcapturestorage/dsna
                                 :loc.mcapturestorage/acds],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sound Capture and Storage"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-20T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mcapturestorage,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specifies the sound capture and storage technique used when the sound recording resource was originally recorded"}})