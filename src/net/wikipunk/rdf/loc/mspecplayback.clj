(ns net.wikipunk.rdf.loc.mspecplayback
  "http://id.loc.gov/vocabulary/mspecplayback/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mspecplayback.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mspecplayback"
                       "http://id.loc.gov/vocabulary/mspecplayback/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mspecplayback",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mspecplayback/"})

(def ccir
  "Special playback characteristic of sound that is a standard originally issued in 1982 by the CCIR for encoding interlaced analog video signals in digital video form"
  {:db/ident :loc.mspecplayback/ccir,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CCIR encoded",
   :madsrdf/code "ccir",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a standard originally issued in 1982 by the CCIR for encoding interlaced analog video signals in digital video form",
   :madsrdf/historyNote "MARC bib: 344 $h; 007sr/12 - b",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/ccir,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a standard originally issued in 1982 by the CCIR for encoding interlaced analog video signals in digital video form",
   :skos/historyNote "MARC bib: 344 $h; 007sr/12 - b",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "ccir",
   :skos/prefLabel "CCIR encoded"})

(def cx
  "Special playback characteristic of sound that is a noise reduction system for recorded analog audio developed by CBS Laboratories in the late 1970s"
  {:db/ident :loc.mspecplayback/cx,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CX encoded",
   :madsrdf/code "cx",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a noise reduction system for recorded analog audio developed by CBS Laboratories in the late 1970s",
   :madsrdf/historyNote "MARC bib: 344 $h; 007sr/12 - h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/cx,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a noise reduction system for recorded analog audio developed by CBS Laboratories in the late 1970s",
   :skos/historyNote "MARC bib: 344 $h; 007sr/12 - h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "cx",
   :skos/prefLabel "CX encoded"})

(def dbx
  "Special playback characteristic of sound that is a family of noise reduction systems developed by dbx"
  {:db/ident :loc.mspecplayback/dbx,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "dbx encoded",
   :madsrdf/code "dbx",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a family of noise reduction systems developed by dbx",
   :madsrdf/historyNote "MARC bib: 344 $h; 007sr/12 - d",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dbx,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a family of noise reduction systems developed by dbx",
   :skos/historyNote "MARC bib: 344 $h; 007sr/12 - d",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dbx",
   :skos/prefLabel "dbx encoded"})

(def dolby
  "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in analog magnetic tape recording"
  {:db/ident :loc.mspecplayback/dolby,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dolby",
   :madsrdf/code "dolby",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in analog magnetic tape recording",
   :madsrdf/historyNote "MARC bib: 344 $h; (Note: MARC uses Dolby-B)",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dolby,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in analog magnetic tape recording",
   :skos/historyNote "MARC bib: 344 $h; (Note: MARC uses Dolby-B)",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dolby",
   :skos/prefLabel "Dolby"})

(def dolbya
  "Special playback characteristic of sound that is a noise reduction system developed by Dolby Laboratories for professional use in analog magnetic tape recording"
  {:db/ident :loc.mspecplayback/dolbya,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dolby-A encoded",
   :madsrdf/code "dolbya",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a noise reduction system developed by Dolby Laboratories for professional use in analog magnetic tape recording",
   :madsrdf/historyNote "MARC bib: 344 $h; 007sr/12 - f",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dolbya,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a noise reduction system developed by Dolby Laboratories for professional use in analog magnetic tape recording",
   :skos/historyNote "MARC bib: 344 $h; 007sr/12 - f",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dolbya",
   :skos/prefLabel "Dolby-A encoded"})

(def dolbyb
  "Special playback characteristic of sound that is a noise reduction system developed by Dolby Laboratories as a simplified version of Dolby-A for consumer use in analog magnetic tape recording"
  {:db/ident :loc.mspecplayback/dolbyb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dolby-B encoded",
   :madsrdf/code "dolbyb",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a noise reduction system developed by Dolby Laboratories as a simplified version of Dolby-A for consumer use in analog magnetic tape recording",
   :madsrdf/historyNote "MARC bib: 344 $h; 007sr/12 - c",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dolbyb,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a noise reduction system developed by Dolby Laboratories as a simplified version of Dolby-A for consumer use in analog magnetic tape recording",
   :skos/historyNote "MARC bib: 344 $h; 007sr/12 - c",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dolbyb",
   :skos/prefLabel "Dolby-B encoded"})

(def dolbyc
  "Special playback characteristic of sound that is a noise reduction system developed by Dolby Laboratories in 1980 as a combined version of Dolby-A and Dolby-B for use in analog magnetic tape recording"
  {:db/ident :loc.mspecplayback/dolbyc,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dolby-C encoded",
   :madsrdf/code "dolbyc",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a noise reduction system developed by Dolby Laboratories in 1980 as a combined version of Dolby-A and Dolby-B for use in analog magnetic tape recording",
   :madsrdf/historyNote "MARC bib: 344 $h; 007sr/12 - g",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dolbyc,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a noise reduction system developed by Dolby Laboratories in 1980 as a combined version of Dolby-A and Dolby-B for use in analog magnetic tape recording",
   :skos/historyNote "MARC bib: 344 $h; 007sr/12 - g",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dolbyc",
   :skos/prefLabel "Dolby-C encoded"})

(def dolbydig
  "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording"
  {:db/ident :loc.mspecplayback/dolbydig,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-06-12T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dolby Digital",
   :madsrdf/code "dolbydig",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-06-12T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dolbydig,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dolbydig",
   :skos/prefLabel "Dolby Digital"})

(def dolbydig1
  "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording using one channel"
  {:db/ident :loc.mspecplayback/dolbydig1,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dolby Digital 1.0",
   :madsrdf/code "dolbydig1",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording using one channel",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dolbydig1,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording using one channel",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dolbydig1",
   :skos/prefLabel "Dolby Digital 1.0"})

(def dolbydig2
  "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording using two channels"
  {:db/ident :loc.mspecplayback/dolbydig2,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dolby Digital 2.0",
   :madsrdf/code "dolbydig2",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording using two channels",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dolbydig2,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording using two channels",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dolbydig2",
   :skos/prefLabel "Dolby Digital 2.0"})

(def dolbydig51
  "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording using five channels"
  {:db/ident :loc.mspecplayback/dolbydig51,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dolby Digital 5.1",
   :madsrdf/code "dolbydig51",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording using five channels",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dolbydig51,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a series of noise reduction systems developed by Dolby Laboratories for use in digital recording using five channels",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dolbydig51",
   :skos/prefLabel "Dolby Digital 5.1"})

(def dts
  "Special playback characteristic of sound that is a multichannel audio technology developed by DTS (originally Digital Theater Systems)"
  {:db/ident :loc.mspecplayback/dts,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-08-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DTS",
   :madsrdf/code "dts",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a multichannel audio technology developed by DTS (originally Digital Theater Systems)",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-08-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dts,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a multichannel audio technology developed by DTS (originally Digital Theater Systems)",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dts",
   :skos/prefLabel "DTS"})

(def dts50
  "Special playback characteristic of sound that is a multichannel audio technology developed by DTS (originally Digital Theater Systems) using five channels"
  {:db/ident :loc.mspecplayback/dts50,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DTS 5.0",
   :madsrdf/code "dts50",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a multichannel audio technology developed by DTS (originally Digital Theater Systems) using five channels",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dts50,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a multichannel audio technology developed by DTS (originally Digital Theater Systems) using five channels",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dts50",
   :skos/prefLabel "DTS 5.0"})

(def dts51
  "Special playback characteristic of sound that is a multichannel audio technology developed by DTS (originally Digital Theater Systems) using the 5.1 channel configuration"
  {:db/ident :loc.mspecplayback/dts51,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DTS 5.1",
   :madsrdf/code "dts51",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a multichannel audio technology developed by DTS (originally Digital Theater Systems) using the 5.1 channel configuration",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dts51,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a multichannel audio technology developed by DTS (originally Digital Theater Systems) using the 5.1 channel configuration",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dts51",
   :skos/prefLabel "DTS 5.1"})

(def dtshd
  "Special playback characteristic of sound that is a high definition digital surround sound encoding format developed by DTS for home theater use"
  {:db/ident :loc.mspecplayback/dtshd,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DTS-HD Master Audio",
   :madsrdf/code "dtshd",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format developed by DTS for home theater use",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dtshd,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format developed by DTS for home theater use",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dtshd",
   :skos/prefLabel "DTS-HD Master Audio"})

(def dtshd51
  "Special playback characteristic of sound that is a high definition digital surround sound encoding format developed by DTS for home theater use that utilizes the 5.1 channel configuration"
  {:db/ident :loc.mspecplayback/dtshd51,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DTS-HD Master Audio 5.1",
   :madsrdf/code "dtshd51",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format developed by DTS for home theater use that utilizes the 5.1 channel configuration",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dtshd51,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format developed by DTS for home theater use that utilizes the 5.1 channel configuration",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dtshd51",
   :skos/prefLabel "DTS-HD Master Audio 5.1"})

(def dtshd71
  "Special playback characteristic of sound that is a high definition digital surround sound encoding format developed by DTS for home theater use that utilizes the 7.1 channel configuration"
  {:db/ident :loc.mspecplayback/dtshd71,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-06-12T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DTS-HD Master Audio 7.1",
   :madsrdf/code "dtshd71",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format developed by DTS for home theater use that utilizes the 7.1 channel configuration",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-06-12T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/dtshd71,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format developed by DTS for home theater use that utilizes the 7.1 channel configuration",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "dtshd71",
   :skos/prefLabel "DTS-HD Master Audio 7.1"})

(def lpcm
  "Special playback characteristic of sound that is a digital sampling of analog sound based on the pulse-code modulation method that is linearly uniform"
  {:db/ident :loc.mspecplayback/lpcm,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LPCM",
   :madsrdf/code "lpcm",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a digital sampling of analog sound based on the pulse-code modulation method that is linearly uniform",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/lpcm,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a digital sampling of analog sound based on the pulse-code modulation method that is linearly uniform",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "lpcm",
   :skos/prefLabel "LPCM"})

(def lpcm2
  "Special playback characteristic of sound that is a digital sampling of stereo sound based on the pulse-code modulation method that is linearly uniform"
  {:db/ident :loc.mspecplayback/lpcm2,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "LPCM 2.0",
   :madsrdf/code "lpcm2",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a digital sampling of stereo sound based on the pulse-code modulation method that is linearly uniform",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/lpcm2,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a digital sampling of stereo sound based on the pulse-code modulation method that is linearly uniform",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "lpcm2",
   :skos/prefLabel "LPCM 2.0"})

(def nab
  "Special playback characteristic of sound that follows the standards of the National Association of Broadcasters"
  {:db/ident :loc.mspecplayback/nab,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "NAB standard",
   :madsrdf/code "nab",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that follows the standards of the National Association of Broadcasters",
   :madsrdf/historyNote "MARC bib: 344 $h; 007sr/12 - a",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/nab,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that follows the standards of the National Association of Broadcasters",
   :skos/historyNote "MARC bib: 344 $h; 007sr/12 - a",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "nab",
   :skos/prefLabel "NAB standard"})

(def pcm
  "Special playback characteristic of sound that is a digital sampling of analog sound based on the pulse-code modulation method"
  {:db/ident :loc.mspecplayback/pcm,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "PCM",
   :madsrdf/code "pcm",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a digital sampling of analog sound based on the pulse-code modulation method",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/pcm,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a digital sampling of analog sound based on the pulse-code modulation method",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "pcm",
   :skos/prefLabel "PCM"})

(def pcm51
  "Special playback characteristic of sound that is a high definition digital surround sound encoding format based on the pulse-code modulation method"
  {:db/ident :loc.mspecplayback/pcm51,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "PCM 5.1",
   :madsrdf/code "pcm51",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format based on the pulse-code modulation method",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/pcm51,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format based on the pulse-code modulation method",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "pcm51",
   :skos/prefLabel "PCM 5.1"})

(def pcm51uc
  "Special playback characteristic of sound that is a high definition digital surround sound encoding format based on the pulse-code modulation method and uncompressed"
  {:db/ident :loc.mspecplayback/pcm51uc,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "PCM 5.1 uncompressed",
   :madsrdf/code "pcm51uc",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format based on the pulse-code modulation method and uncompressed",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/pcm51uc,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a high definition digital surround sound encoding format based on the pulse-code modulation method and uncompressed",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "pcm51uc",
   :skos/prefLabel "PCM 5.1 uncompressed"})

(def pcmunc
  "Special playback characteristic of sound that is a digital sampling of analog sound based on the pulse-code modulation method and uncompressed"
  {:db/ident :loc.mspecplayback/pcmunc,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-22T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mspecplayback/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "PCM uncompressed",
   :madsrdf/code "pcmunc",
   :madsrdf/definitionNote
   "Special playback characteristic of sound that is a digital sampling of analog sound based on the pulse-code modulation method and uncompressed",
   :madsrdf/historyNote "MARC bib: 344 $h",
   :madsrdf/isMemberOfMADSCollection
   :loc.mspecplayback/collection_mspecplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mspecplayback,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mspecplayback/dlc,
                     :cs/subjectOfChange :loc.mspecplayback/pcmunc,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Special playback characteristic of sound that is a digital sampling of analog sound based on the pulse-code modulation method and uncompressed",
   :skos/historyNote "MARC bib: 344 $h",
   :skos/inScheme :loc.vocabulary/mspecplayback,
   :skos/notation "pcmunc",
   :skos/prefLabel "PCM uncompressed"})

(def ^{:private true} mspecplayback
  "Equalization system, noise reduction system, etc., used in the making of an audio recording"
  {:db/ident :loc.vocabulary/mspecplayback,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2019-06-12T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/definitionNote
   "Equalization system, noise reduction system, etc., used in the making of an audio recording",
   :madsrdf/hasMADSSchemeMember [:loc.mspecplayback/dts51
                                 :loc.mspecplayback/ccir
                                 :loc.mspecplayback/dolbydig1
                                 :loc.mspecplayback/pcm51uc
                                 :loc.mspecplayback/dtshd
                                 :loc.mspecplayback/lpcm2
                                 :loc.mspecplayback/dtshd71
                                 :loc.mspecplayback/dolbyb
                                 :loc.mspecplayback/dolby
                                 :loc.mspecplayback/dts
                                 :loc.mspecplayback/dolbydig51
                                 :loc.mspecplayback/dolbyc
                                 :loc.mspecplayback/pcmunc
                                 :loc.mspecplayback/pcm
                                 :loc.mspecplayback/nab
                                 :loc.mspecplayback/dolbydig
                                 :loc.mspecplayback/dtshd51
                                 :loc.mspecplayback/dbx
                                 :loc.mspecplayback/pcm51
                                 :loc.mspecplayback/cx
                                 :loc.mspecplayback/dts50
                                 :loc.mspecplayback/dolbydig2
                                 :loc.mspecplayback/lpcm
                                 :loc.mspecplayback/dolbya],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/label "Special Playback Characteristics",
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2019-06-12T04:00:00.000-00:00",
                      :cs/creatorName     "https://id.loc.gov/vocabulary/dlc",
                      :cs/subjectOfChange :loc.vocabulary/mspecplayback,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
                      :cs/creatorName     "https://id.loc.gov/vocabulary/dlc",
                      :cs/subjectOfChange :loc.vocabulary/mspecplayback,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   "Equalization system, noise reduction system, etc., used in the making of an audio recording"})