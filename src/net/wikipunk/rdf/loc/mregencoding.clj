(ns net.wikipunk.rdf.loc.mregencoding
  "http://id.loc.gov/vocabulary/mregencoding/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mregencoding.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mregencoding"
                       "http://id.loc.gov/vocabulary/mregencoding/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mregencoding",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mregencoding/"})

(def all
  "Regional encoding for videodisc or video game carrier, permitting playback on devices worldwide"
  {:db/ident :loc.mregencoding/all,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "all regions",
   :madsrdf/code "all",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for videodisc or video game carrier, permitting playback on devices worldwide"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/all,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for videodisc or video game carrier, permitting playback on devices worldwide"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "all",
   :skos/prefLabel "all regions"})

(def region1
  "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in the United States, Canada, Bermuda, and U.S. territories"
  {:db/ident :loc.mregencoding/region1,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region 1",
   :madsrdf/code "region1",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in the United States, Canada, Bermuda, and U.S. territories"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/region1,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in the United States, Canada, Bermuda, and U.S. territories"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "region1",
   :skos/prefLabel "region 1"})

(def region2
  "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Japan, Europe, South Africa, and the Middle East, including Egypt"
  {:db/ident :loc.mregencoding/region2,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region 2",
   :madsrdf/code "region2",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Japan, Europe, South Africa, and the Middle East, including Egypt"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/region2,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Japan, Europe, South Africa, and the Middle East, including Egypt"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "region2",
   :skos/prefLabel "region 2"})

(def region3
  "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Southeast Asiand East Asia, including Hong Kong"
  {:db/ident :loc.mregencoding/region3,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region 3",
   :madsrdf/code "region3",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Southeast Asiand East Asia, including Hong Kong"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/region3,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Southeast Asiand East Asia, including Hong Kong"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "region3",
   :skos/prefLabel "region 3"})

(def region4
  "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Australia, New Zealand, Pacific Islands, Central America, South America, and the Caribbean"
  {:db/ident :loc.mregencoding/region4,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region 4",
   :madsrdf/code "region4",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Australia, New Zealand, Pacific Islands, Central America, South America, and the Caribbean"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/region4,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Australia, New Zealand, Pacific Islands, Central America, South America, and the Caribbean"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "region4",
   :skos/prefLabel "region 4"})

(def region5
  "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Eastern Europe, Baltic States, Russia, Central and South Asia, Indian subcontinent, Africa, North Korea, and Mongolia"
  {:db/ident :loc.mregencoding/region5,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region 5",
   :madsrdf/code "region5",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Eastern Europe, Baltic States, Russia, Central and South Asia, Indian subcontinent, Africa, North Korea, and Mongolia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/region5,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in Eastern Europe, Baltic States, Russia, Central and South Asia, Indian subcontinent, Africa, North Korea, and Mongolia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "region5",
   :skos/prefLabel "region 5"})

(def region6
  "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in China"
  {:db/ident :loc.mregencoding/region6,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region 6",
   :madsrdf/code "region6",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in China"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/region6,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in China"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "region6",
   :skos/prefLabel "region 6"})

(def region7
  "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it for special uses, such as playing protected copies sent to film industry professionals or to the media"
  {:db/ident :loc.mregencoding/region7,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region 7",
   :madsrdf/code "region7",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it for special uses, such as playing protected copies sent to film industry professionals or to the media"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/region7,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it for special uses, such as playing protected copies sent to film industry professionals or to the media"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "region7",
   :skos/prefLabel "region 7"})

(def region8
  "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in international venues such as aircraft, cruise ships, spacecraft, etc"
  {:db/ident :loc.mregencoding/region8,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region 8",
   :madsrdf/code "region8",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in international venues such as aircraft, cruise ships, spacecraft, etc"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/region8,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for DVD videodisc encoded for playback by devices configured to decode it in international venues such as aircraft, cruise ships, spacecraft, etc"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "region8",
   :skos/prefLabel "region 8"})

(def regionA
  "Regional encoding for Blu-ray videodisc encoded for playback by devices configured to decode it in North America, Central America, South America, Japan, North Korea, South Korea, Taiwan, Hong Kong, and Southeast Asia"
  {:db/ident :loc.mregencoding/regionA,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region A",
   :madsrdf/code "regionA",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for Blu-ray videodisc encoded for playback by devices configured to decode it in North America, Central America, South America, Japan, North Korea, South Korea, Taiwan, Hong Kong, and Southeast Asia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/regionA,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for Blu-ray videodisc encoded for playback by devices configured to decode it in North America, Central America, South America, Japan, North Korea, South Korea, Taiwan, Hong Kong, and Southeast Asia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "regionA",
   :skos/prefLabel "region A"})

(def regionB
  "Regional encoding for Blu-ray videodisc encoded for playback by devices configured to decode it in Europe, Greenland, French territories, Middle East, Africa, Australia, and New Zealand"
  {:db/ident :loc.mregencoding/regionB,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region B",
   :madsrdf/code "regionB",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for Blu-ray videodisc encoded for playback by devices configured to decode it in Europe, Greenland, French territories, Middle East, Africa, Australia, and New Zealand"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/regionB,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for Blu-ray videodisc encoded for playback by devices configured to decode it in Europe, Greenland, French territories, Middle East, Africa, Australia, and New Zealand"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "regionB",
   :skos/prefLabel "region B"})

(def regionCblu
  "Regional encoding for Blu-ray videodisc encoded for playback by devices configured to decode it in India, Nepal, mainland China, Russia, Central Asia, and South Asia"
  {:db/ident :loc.mregencoding/regionCblu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region C (Blu-ray)",
   :madsrdf/code "regionCblu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for Blu-ray videodisc encoded for playback by devices configured to decode it in India, Nepal, mainland China, Russia, Central Asia, and South Asia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/regionCblu,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for Blu-ray videodisc encoded for playback by devices configured to decode it in India, Nepal, mainland China, Russia, Central Asia, and South Asia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "regionCblu",
   :skos/prefLabel "region C (Blu-ray)"})

(def regionCgame
  "Regional encoding for video game encoded for playback by devices configured to decode it in China"
  {:db/ident :loc.mregencoding/regionCgame,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region C (video game)",
   :madsrdf/code "regionCgame",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for video game encoded for playback by devices configured to decode it in China"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/regionCgame,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for video game encoded for playback by devices configured to decode it in China"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "regionCgame",
   :skos/prefLabel "region C (video game)"})

(def regionJ
  "Regional encoding for a video game carrier encoded for playback by devices configured to decode it in Japan, South Korea, Taiwan, Hong Kong, Macau, and Southeast Asia"
  {:db/ident :loc.mregencoding/regionJ,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region J",
   :madsrdf/code "regionJ",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for a video game carrier encoded for playback by devices configured to decode it in Japan, South Korea, Taiwan, Hong Kong, Macau, and Southeast Asia"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/regionJ,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for a video game carrier encoded for playback by devices configured to decode it in Japan, South Korea, Taiwan, Hong Kong, Macau, and Southeast Asia"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "regionJ",
   :skos/prefLabel "region J"})

(def regionU
  "Regional encoding for video game carrier encoded for playback by devices configured to decode it in the United States, Canada, Mexico, and South America"
  {:db/ident :loc.mregencoding/regionU,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "region U/C",
   :madsrdf/code "regionU",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for video game carrier encoded for playback by devices configured to decode it in the United States, Canada, Mexico, and South America"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :madsrdf/isMemberOfMADSCollection :loc.mregencoding/collection_mregencoding,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mregencoding,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mregencoding/regionU,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regional encoding for video game carrier encoded for playback by devices configured to decode it in the United States, Canada, Mexico, and South America"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :skos/inScheme :loc.vocabulary/mregencoding,
   :skos/notation "regionU",
   :skos/prefLabel "region U/C"})

(def ^{:private true} mregencoding
  "Designation for one or more regions of the world for which videodisc or video game carrier has been encoded, restricting playback to device configured to decode it."
  {:db/ident :loc.vocabulary/mregencoding,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Designation for one or more regions of the world for which videodisc or video game carrier has been encoded, restricting playback to device configured to decode it."},
   :madsrdf/hasMADSSchemeMember [:loc.mregencoding/regionJ
                                 :loc.mregencoding/region7
                                 :loc.mregencoding/region8
                                 :loc.mregencoding/regionU
                                 :loc.mregencoding/region1
                                 :loc.mregencoding/region2
                                 :loc.mregencoding/all
                                 :loc.mregencoding/region3
                                 :loc.mregencoding/regionB
                                 :loc.mregencoding/region5
                                 :loc.mregencoding/region4
                                 :loc.mregencoding/regionCgame
                                 :loc.mregencoding/region6
                                 :loc.mregencoding/regionCblu
                                 :loc.mregencoding/regionA],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Regional Encoding"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mregencoding,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Designation for one or more regions of the world for which videodisc or video game carrier has been encoded, restricting playback to device configured to decode it."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b ; 347 $b, $e"}})