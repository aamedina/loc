(ns net.wikipunk.rdf.loc.msupplcont
  "http://id.loc.gov/vocabulary/msupplcont/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/msupplcont.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.msupplcont"
                       "http://id.loc.gov/vocabulary/msupplcont/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.msupplcont",
   :rdfa/uri          "http://id.loc.gov/vocabulary/msupplcont/"})

(def bibliography
  "Includes a bibliography"
  {:db/ident :loc.msupplcont/bibliography,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-07-08T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "bibliography",
   :madsrdf/code "bibliography",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Includes a bibliography"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008BK,MU/24 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-01-23T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.msupplcont/bibliography,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2021-07-08T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.msupplcont/bibliography,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Includes a bibliography"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008BK,MU/24 - b"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "bibliography",
   :skos/prefLabel "bibliography"})

(def creatorbio
  "Includes significant biographical information on a creator"
  {:db/ident :loc.msupplcont/creatorbio,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "biography of creator",
   :madsrdf/code "creatorbio",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Includes significant biographical information on a creator"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/creatorbio,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Includes significant biographical information on a creator"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - e"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "creatorbio",
   :skos/prefLabel "biography of creator"})

(def discography
  "Includes a discography or other bibliography of recorded sound"
  {:db/ident :loc.msupplcont/discography,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2021-07-08T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "discography",
   :madsrdf/code "discography",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Includes a discography or other bibliography of recorded sound"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - a; 008BK/24 - k"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2010-01-23T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.msupplcont/discography,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2021-07-08T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.msupplcont/discography,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Includes a discography or other bibliography of recorded sound"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - a; 008BK/24 - k"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "discography",
   :skos/prefLabel "discography"})

(def ethnologicinfo
  "Includes significant ethnologic information that relates to the musical part of the item"
  {:db/ident :loc.msupplcont/ethnologicinfo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ethnologic information",
   :madsrdf/code "ethnologicinfo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Includes significant ethnologic information that relates to the musical part of the item"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - k"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/ethnologicinfo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Includes significant ethnologic information that relates to the musical part of the item"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - k"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "ethnologicinfo",
   :skos/prefLabel "ethnologic information"})

(def historicalinfo
  "Includes significant historical information"
  {:db/ident :loc.msupplcont/historicalinfo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "historical information",
   :madsrdf/code "historicalinfo",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Includes significant historical information"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - i"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/historicalinfo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Includes significant historical information"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - i"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "historicalinfo",
   :skos/prefLabel "historical information"})

(def index
  "Includes an index to its own contents"
  {:db/ident :loc.msupplcont/index,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "index",
   :madsrdf/code "index",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Includes an index to its own contents"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008BK/31 - 1"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/index,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Includes an index to its own contents"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008BK/31 - 1"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "index",
   :skos/prefLabel "index"})

(def instructmaterial
  "Includes instructional materials"
  {:db/ident :loc.msupplcont/instructmaterial,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "instructional materials",
   :madsrdf/code "instructmaterial",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Includes instructional materials"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - r"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/instructmaterial,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Includes instructional materials"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - r"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "instructmaterial",
   :skos/prefLabel "instructional materials"})

(def libretto
  "Includes a printed transcription of the libretto or other text"
  {:db/ident :loc.msupplcont/libretto,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "libretto or text",
   :madsrdf/code "libretto",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Includes a printed transcription of the libretto or other text"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - d"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/libretto,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Includes a printed transcription of the libretto or other text"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - d"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "libretto",
   :skos/prefLabel "libretto or text"})

(def music
  "Includes a score or other music format than that of the main item"
  {:db/ident :loc.msupplcont/music,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "music",
   :madsrdf/code "music",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Includes a score or other music format than that of the main item"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - s"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/music,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Includes a score or other music format than that of the main item"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - s"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "music",
   :skos/prefLabel "music"})

(def performerhistory
  "Includes significant biographical information on a performer or a history of an ensemble"
  {:db/ident :loc.msupplcont/performerhistory,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "history of performer or ensemble",
   :madsrdf/code "performerhistory",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Includes significant biographical information on a performer or a history of an ensemble"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - f"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/performerhistory,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Includes significant biographical information on a performer or a history of an ensemble"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - f"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "performerhistory",
   :skos/prefLabel "history of performer or ensemble"})

(def techinstruments
  "Includes technical and/or historical information on instruments"
  {:db/ident :loc.msupplcont/techinstruments,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "technical/historical information on instruments",
   :madsrdf/code "techinstruments",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Includes technical and/or historical information on instruments"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - g"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/techinstruments,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Includes technical and/or historical information on instruments"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - g"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "techinstruments",
   :skos/prefLabel "technical/historical information on instruments"})

(def techmusic
  "Includes significant technical information, including instructions for performance"
  {:db/ident :loc.msupplcont/techmusic,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "technical information on music",
   :madsrdf/code "techmusic",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Includes significant technical information, including instructions for performance"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - h"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/techmusic,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Includes significant technical information, including instructions for performance"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - h"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "techmusic",
   :skos/prefLabel "technical information on music"})

(def thematicindex
  "Includes a thematic index"
  {:db/ident :loc.msupplcont/thematicindex,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "thematic index",
   :madsrdf/code "thematicindex",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Includes a thematic index"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008MU/24 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.msupplcont/collection_msupplcont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msupplcont,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.msupplcont/thematicindex,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Includes a thematic index"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008MU/24 - c"},
   :skos/inScheme :loc.vocabulary/msupplcont,
   :skos/notation "thematicindex",
   :skos/prefLabel "thematic index"})

(def ^{:private true} msupplcont
  "The types of content that complement the primary content of the resource. It may accompany or be inside the resource"
  {:db/ident :loc.vocabulary/msupplcont,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2010-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The types of content that complement the primary content of the resource. It may accompany or be inside the resource"},
   :madsrdf/hasMADSSchemeMember [:loc.msupplcont/techinstruments
                                 :loc.msupplcont/ethnologicinfo
                                 :loc.msupplcont/bibliography
                                 :loc.msupplcont/techmusic
                                 :loc.msupplcont/thematicindex
                                 :loc.msupplcont/creatorbio
                                 :loc.msupplcont/instructmaterial
                                 :loc.msupplcont/performerhistory
                                 :loc.msupplcont/libretto
                                 :loc.msupplcont/discography
                                 :loc.msupplcont/historicalinfo
                                 :loc.msupplcont/index
                                 :loc.msupplcont/music],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Supplementary Content"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2010-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/msupplcont,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The types of content that complement the primary content of the resource. It may accompany or be inside the resource"}})