(ns net.wikipunk.rdf.loc.mscript
  "http://id.loc.gov/vocabulary/mscript/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mscript.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mscript" "http://id.loc.gov/vocabulary/mscript/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mscript",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mscript/"})

(def a
  "Original alphabet of the resource is a Latin (Roman) alphabet that does not include diacritics or special characters"
  {:db/ident :loc.mscript/a,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Latin",
   :madsrdf/code "a",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Original alphabet of the resource is a Latin (Roman) alphabet that does not include diacritics or special characters"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Basic Roman @@ ASCII",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/altLabel "Basic Roman @@ ASCII",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/a,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Original alphabet of the resource is a Latin (Roman) alphabet that does not include diacritics or special characters"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - a"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "a",
   :skos/prefLabel "Latin",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Basic Roman @@ ASCII"}})

(def b
  "Original alphabet is a Latin (Roman) alphabet language that includes diacritics and special characters"
  {:db/ident :loc.mscript/b,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Extended Latin",
   :madsrdf/code "b",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Original alphabet is a Latin (Roman) alphabet language that includes diacritics and special characters"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Extended Roman @@ ANSEL",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel "Extended Roman @@ ANSEL",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/b,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Original alphabet is a Latin (Roman) alphabet language that includes diacritics and special characters"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - b"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "b",
   :skos/prefLabel "Extended Latin",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Extended Roman @@ ANSEL"}})

(def c
  "Original alphabet of the resource is Cyrillic"
  {:db/ident :loc.mscript/c,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Cyrillic",
   :madsrdf/code "c",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Original alphabet of the resource is Cyrillic"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/c,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Original alphabet of the resource is Cyrillic"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - c"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "c",
   :skos/prefLabel "Cyrillic"})

(def d
  "Language of the resource uses two syllabaries (Hiragana and Katakana) and Chinese ideographic characters"
  {:db/ident :loc.mscript/d,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Japanese",
   :madsrdf/code "d",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of the resource uses two syllabaries (Hiragana and Katakana) and Chinese ideographic characters"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - d"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/d,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of the resource uses two syllabaries (Hiragana and Katakana) and Chinese ideographic characters"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - d"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "d",
   :skos/prefLabel "Japanese"})

(def e
  "Language of the resource uses a system of ideographic characters to represent sounds and entire words"
  {:db/ident :loc.mscript/e,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Chinese",
   :madsrdf/code "e",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of the resource uses a system of ideographic characters to represent sounds and entire words"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Hani",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel "Hani",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/e,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of the resource uses a system of ideographic characters to represent sounds and entire words"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - e"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "e",
   :skos/prefLabel "Chinese",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Hani"}})

(def f
  "Original alphabet of the resource is Arabic"
  {:db/ident :loc.mscript/f,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Arabic",
   :madsrdf/code "f",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Original alphabet of the resource is Arabic"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - f"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/f,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Original alphabet of the resource is Arabic"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - f"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "f",
   :skos/prefLabel "Arabic"})

(def g
  "Original alphabet of the resource is Greek"
  {:db/ident :loc.mscript/g,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Greek",
   :madsrdf/code "g",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Original alphabet of the resource is Greek"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - g"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/g,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Original alphabet of the resource is Greek"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - g"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "g",
   :skos/prefLabel "Greek"})

(def h
  "Original alphabet of the resource is Hebrew"
  {:db/ident :loc.mscript/h,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Hebrew",
   :madsrdf/code "h",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Original alphabet of the resource is Hebrew"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - h"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/h,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Original alphabet of the resource is Hebrew"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - h"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "h",
   :skos/prefLabel "Hebrew"})

(def i
  "Original alphabet of the resource is Thai"
  {:db/ident :loc.mscript/i,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Thai",
   :madsrdf/code "i",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Original alphabet of the resource is Thai"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 -i"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/i,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Original alphabet of the resource is Thai"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 -i"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "i",
   :skos/prefLabel "Thai"})

(def j
  "Original alphabet of the resource is Devanagari"
  {:db/ident :loc.mscript/j,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Devanagari (Nagari)",
   :madsrdf/code "j",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Original alphabet of the resource is Devanagari"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Devanagari",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - j"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/altLabel "Devanagari",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/j,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Original alphabet of the resource is Devanagari"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - j"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "j",
   :skos/prefLabel "Devanagari (Nagari)",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Devanagari"}})

(def k
  "Language of the resource uses a system that forms characters representing words from syllabic components (Hangul) along with traditional Chinese ideographic characters"
  {:db/ident :loc.mscript/k,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Korean",
   :madsrdf/code "k",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Language of the resource uses a system that forms characters representing words from syllabic components (Hangul) along with traditional Chinese ideographic characters"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - k"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/k,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Language of the resource uses a system that forms characters representing words from syllabic components (Hangul) along with traditional Chinese ideographic characters"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - k"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "k",
   :skos/prefLabel "Korean"})

(def l
  "Original alphabet of the resource is Tamil"
  {:db/ident :loc.mscript/l,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Tamil",
   :madsrdf/code "l",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Original alphabet of the resource is Tamil"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008SE/33 - l"},
   :madsrdf/isMemberOfMADSCollection :loc.mscript/collection_mscript,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscript,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscript/l,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Original alphabet of the resource is Tamil"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008SE/33 - l"},
   :skos/inScheme :loc.vocabulary/mscript,
   :skos/notation "l",
   :skos/prefLabel "Tamil"})

(def ^{:private true} mscript
  "The original alphabet or script of the language of the resource"
  {:db/ident :loc.vocabulary/mscript,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-17T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The original alphabet or script of the language of the resource"},
   :madsrdf/hasMADSSchemeMember [:loc.mscript/a
                                 :loc.mscript/d
                                 :loc.mscript/c
                                 :loc.mscript/f
                                 :loc.mscript/j
                                 :loc.mscript/e
                                 :loc.mscript/i
                                 :loc.mscript/h
                                 :loc.mscript/l
                                 :loc.mscript/g
                                 :loc.mscript/k
                                 :loc.mscript/b],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Script"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-17T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mscript,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The original alphabet or script of the language of the resource"}})