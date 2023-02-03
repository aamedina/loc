(ns net.wikipunk.rdf.loc.mbroadstd
  "http://id.loc.gov/vocabulary/mbroadstd/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mbroadstd.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mbroadstd"
                       "http://id.loc.gov/vocabulary/mbroadstd/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mbroadstd",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mbroadstd/"})

(def HDTV
  "Broadcast standard that is an encoding system for digital broadcast television, named after High-definition television"
  {:db/ident :loc.mbroadstd/HDTV,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-07T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "HDTV",
   :madsrdf/code "HDTV",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Broadcast standard that is an encoding system for digital broadcast television, named after High-definition television"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mbroadstd/collection_mbroadstd,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mbroadstd,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-07T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mbroadstd/HDTV,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Broadcast standard that is an encoding system for digital broadcast television, named after High-definition television"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b"},
   :skos/inScheme :loc.vocabulary/mbroadstd,
   :skos/notation "HDTV",
   :skos/prefLabel "HDTV"})

(def NTSC
  "Broadcast standard that is an analogue broadcast television system that was used in most of the Americas and areas of the Far East, named after the National Television System Committee"
  {:db/ident :loc.mbroadstd/NTSC,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-07T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NTSC",
   :madsrdf/code "NTSC",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Broadcast standard that is an analogue broadcast television system that was used in most of the Americas and areas of the Far East, named after the National Television System Committee"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mbroadstd/collection_mbroadstd,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mbroadstd,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-07T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mbroadstd/NTSC,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Broadcast standard that is an analogue broadcast television system that was used in most of the Americas and areas of the Far East, named after the National Television System Committee"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b"},
   :skos/inScheme :loc.vocabulary/mbroadstd,
   :skos/notation "NTSC",
   :skos/prefLabel "NTSC"})

(def PAL
  "Broadcast standard that is colour encoding system for analogue broadcast television used in most countries broadcasting at 625-line / 25 frame per second, named after Phase Alternating Line"
  {:db/ident :loc.mbroadstd/PAL,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-07T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "PAL",
   :madsrdf/code "PAL",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Broadcast standard that is colour encoding system for analogue broadcast television used in most countries broadcasting at 625-line / 25 frame per second, named after Phase Alternating Line"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mbroadstd/collection_mbroadstd,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mbroadstd,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-07T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mbroadstd/PAL,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Broadcast standard that is colour encoding system for analogue broadcast television used in most countries broadcasting at 625-line / 25 frame per second, named after Phase Alternating Line"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b"},
   :skos/inScheme :loc.vocabulary/mbroadstd,
   :skos/notation "PAL",
   :skos/prefLabel "PAL"})

(def SECAM
  "Broadcast standard that is colour encoding system for analogue broadcast television first used in France, named after Séquentiel couleur avec mémoire"
  {:db/ident :loc.mbroadstd/SECAM,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-07T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "SECAM",
   :madsrdf/code "SECAM",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Broadcast standard that is colour encoding system for analogue broadcast television first used in France, named after Séquentiel couleur avec mémoire"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mbroadstd/collection_mbroadstd,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mbroadstd,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-07T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mbroadstd/SECAM,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Broadcast standard that is colour encoding system for analogue broadcast television first used in France, named after Séquentiel couleur avec mémoire"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b"},
   :skos/inScheme :loc.vocabulary/mbroadstd,
   :skos/notation "SECAM",
   :skos/prefLabel "SECAM"})

(def ^{:private true} mbroadstd
  "System used to format video resource for television broadcast."
  {:db/ident :loc.vocabulary/mbroadstd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-07T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "System used to format video resource for television broadcast."},
   :madsrdf/hasMADSSchemeMember [:loc.mbroadstd/SECAM
                                 :loc.mbroadstd/HDTV
                                 :loc.mbroadstd/NTSC
                                 :loc.mbroadstd/PAL],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $b"},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Broadcast Standard"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-07T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mbroadstd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "System used to format video resource for television broadcast."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $b"}})