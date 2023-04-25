(ns net.wikipunk.rdf.loc.mtactile
  "http://id.loc.gov/vocabulary/mtactile/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mtactile.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mtactile" "http://id.loc.gov/vocabulary/mtactile/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mtactile",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mtactile/"}
  (:refer-clojure :exclude [comp]))

(def brail
  "Tactile notation for text using embossed characters formed by raised dots in six-dot cells"
  {:db/ident :loc.mtactile/brail,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-25T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "braille code",
   :madsrdf/code "brail",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Tactile notation for text using embossed characters formed by raised dots in six-dot cells"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008book/23 - f ; 341 $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mtactile/collection_tactile,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtactile,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-25T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtactile/brail,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Tactile notation for text using embossed characters formed by raised dots in six-dot cells"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008book/23 - f ; 341 $e"},
   :skos/inScheme :loc.vocabulary/mtactile,
   :skos/notation "brail",
   :skos/prefLabel "braille code"})

(def comp
  "Tactile notation for computer related materials which enables the representation of symbols and ASCII code"
  {:db/ident :loc.mtactile/comp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-25T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computing braille code",
   :madsrdf/code "comp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Tactile notation for computer related materials which enables the representation of symbols and ASCII code"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "341 $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mtactile/collection_tactile,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtactile,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-25T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtactile/comp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Tactile notation for computer related materials which enables the representation of symbols and ASCII code"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "341 $e"},
   :skos/inScheme :loc.vocabulary/mtactile,
   :skos/notation "comp",
   :skos/prefLabel "computing braille code"})

(def graph
  "Tactile notation using a raised version of a print graphic"
  {:db/ident :loc.mtactile/graph,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-25T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "tactile graphic",
   :madsrdf/code "graph",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Tactile notation using a raised version of a print graphic"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "341 $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mtactile/collection_tactile,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtactile,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-25T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtactile/graph,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Tactile notation using a raised version of a print graphic"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "341 $e"},
   :skos/inScheme :loc.vocabulary/mtactile,
   :skos/notation "graph",
   :skos/prefLabel "tactile graphic"})

(def math
  "Tactile notation used to transcribe mathematical and scientific information"
  {:db/ident :loc.mtactile/math,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-25T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "mathematics braille code",
   :madsrdf/code "math",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Tactile notation used to transcribe mathematical and scientific information"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "341 $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mtactile/collection_tactile,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtactile,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-25T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtactile/math,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Tactile notation used to transcribe mathematical and scientific information"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "341 $e"},
   :skos/inScheme :loc.vocabulary/mtactile,
   :skos/notation "math",
   :skos/prefLabel "mathematics braille code"})

(def moon
  "Tactile notation based on simplified letter forms"
  {:db/ident :loc.mtactile/moon,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-25T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Moon code",
   :madsrdf/code "moon",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Tactile notation based on simplified letter forms"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "341 $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mtactile/collection_tactile,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtactile,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-25T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtactile/moon,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Tactile notation based on simplified letter forms"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "341 $e"},
   :skos/inScheme :loc.vocabulary/mtactile,
   :skos/notation "moon",
   :skos/prefLabel "Moon code"})

(def music
  "Tactile notation for music using braille cells"
  {:db/ident :loc.mtactile/music,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-25T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "music braille code",
   :madsrdf/code "music",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Tactile notation for music using braille cells"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "341 $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mtactile/collection_tactile,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtactile,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-25T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtactile/music,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Tactile notation for music using braille cells"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "341 $e"},
   :skos/inScheme :loc.vocabulary/mtactile,
   :skos/notation "music",
   :skos/prefLabel "music braille code"})

(def tactm
  "Tactile notation for music"
  {:db/ident :loc.mtactile/tactm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-25T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "tactile music notation",
   :madsrdf/code "tactm",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Tactile notation for music"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "341 $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mtactile/collection_tactile,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtactile,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-25T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtactile/tactm,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Tactile notation for music"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "341 $e"},
   :skos/inScheme :loc.vocabulary/mtactile,
   :skos/notation "tactm",
   :skos/prefLabel "tactile music notation"})

(def ^{:private true} mtactile
  "A set of characters and/or symbols used to express the content of a resource in a form that can be perceived through touch"
  {:db/ident :loc.vocabulary/mtactile,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-25T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A set of characters and/or symbols used to express the content of a resource in a form that can be perceived through touch"},
   :madsrdf/hasMADSSchemeMember [:loc.mtactile/graph
                                 :loc.mtactile/moon
                                 :loc.mtactile/math
                                 :loc.mtactile/music
                                 :loc.mtactile/tactm
                                 :loc.mtactile/brail
                                 :loc.mtactile/comp],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tactile Notation"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-25T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mtactile,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A set of characters and/or symbols used to express the content of a resource in a form that can be perceived through touch"}})