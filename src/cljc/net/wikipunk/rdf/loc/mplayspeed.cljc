(ns net.wikipunk.rdf.loc.mplayspeed
  "http://id.loc.gov/vocabulary/mplayspeed/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mplayspeed.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mplayspeed"
                       "http://id.loc.gov/vocabulary/mplayspeed/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mplayspeed",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mplayspeed/"})

(def a
  "Disc playback speed is 16 revolutions per minute"
  {:db/ident :loc.mplayspeed/a,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "16 rpm",
   :madsrdf/code "a",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Disc playback speed is 16 revolutions per minute"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/a,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Disc playback speed is 16 revolutions per minute"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - a"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "a",
   :skos/prefLabel "16 rpm"})

(def b
  "Disc playback speed is 33 1/3 revolutions per minute"
  {:db/ident :loc.mplayspeed/b,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "33 1/3 rpm",
   :madsrdf/code "b",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Disc playback speed is 33 1/3 revolutions per minute"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/b,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Disc playback speed is 33 1/3 revolutions per minute"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - b"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "b",
   :skos/prefLabel "33 1/3 rpm"})

(def c
  "Disc playback speed is 45 revolutions per minute"
  {:db/ident :loc.mplayspeed/c,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "45 rpm",
   :madsrdf/code "c",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Disc playback speed is 45 revolutions per minute"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/c,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Disc playback speed is 45 revolutions per minute"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - c"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "c",
   :skos/prefLabel "45 rpm"})

(def d
  "Disc playback speed is 78 revolutions per minute"
  {:db/ident :loc.mplayspeed/d,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "78 rpm",
   :madsrdf/code "d",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Disc playback speed is 78 revolutions per minute"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - d"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/d,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Disc playback speed is 78 revolutions per minute"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - d"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "d",
   :skos/prefLabel "78 rpm"})

(def e
  "Disc playback speed is 8 revolutions per minute"
  {:db/ident :loc.mplayspeed/e,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "8 rpm",
   :madsrdf/code "e",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Disc playback speed is 8 revolutions per minute"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/e,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Disc playback speed is 8 revolutions per minute"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - e"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "e",
   :skos/prefLabel "8 rpm"})

(def f
  "Disc playback mechanism covers 1.4 meters per second"
  {:db/ident :loc.mplayspeed/f,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "1.4 m/s",
   :madsrdf/code "f",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Disc playback mechanism covers 1.4 meters per second"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - f"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/f,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Disc playback mechanism covers 1.4 meters per second"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - f"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "f",
   :skos/prefLabel "1.4 m/s"})

(def h
  "Cylinder playback speed is 120 revolutions per minute"
  {:db/ident :loc.mplayspeed/h,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "120 rpm",
   :madsrdf/code "h",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Cylinder playback speed is 120 revolutions per minute"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - h"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/h,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Cylinder playback speed is 120 revolutions per minute"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - h"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "h",
   :skos/prefLabel "120 rpm"})

(def i
  "Cylinder playback speed is 160 revolutions per minute"
  {:db/ident :loc.mplayspeed/i,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "160 rpm",
   :madsrdf/code "i",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Cylinder playback speed is 160 revolutions per minute"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - i"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/i,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Cylinder playback speed is 160 revolutions per minute"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - i"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "i",
   :skos/prefLabel "160 rpm"})

(def k
  "Tape playback speed is 15/16 inches per second"
  {:db/ident :loc.mplayspeed/k,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "15/16 ips",
   :madsrdf/code "k",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Tape playback speed is 15/16 inches per second"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - k"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/k,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Tape playback speed is 15/16 inches per second"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - k"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "k",
   :skos/prefLabel "15/16 ips"})

(def l
  "Tape playback speed is 1 7/8 inches per second"
  {:db/ident :loc.mplayspeed/l,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "1 7/8 ips",
   :madsrdf/code "l",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Tape playback speed is 1 7/8 inches per second"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - l"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/l,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Tape playback speed is 1 7/8 inches per second"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - l"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "l",
   :skos/prefLabel "1 7/8 ips"})

(def m
  "Tape playback speed is 3 3/4 inches per second"
  {:db/ident :loc.mplayspeed/m,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "3 3/4 ips",
   :madsrdf/code "m",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Tape playback speed is 3 3/4 inches per second"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - m"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/m,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Tape playback speed is 3 3/4 inches per second"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - m"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "m",
   :skos/prefLabel "3 3/4 ips"})

(def o
  "Tape playback speed is 7 1/2 inches per second"
  {:db/ident :loc.mplayspeed/o,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "7 1/2 ips",
   :madsrdf/code "o",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Tape playback speed is 7 1/2 inches per second"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - o"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/o,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Tape playback speed is 7 1/2 inches per second"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - o"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "o",
   :skos/prefLabel "7 1/2 ips"})

(def p
  "Tape playback speed is 15 inches per second"
  {:db/ident :loc.mplayspeed/p,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "15 ips",
   :madsrdf/code "p",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Tape playback speed is 15 inches per second"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/03 - p"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayspeed/collection_mplayspeed,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayspeed,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mplayspeed/p,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Tape playback speed is 15 inches per second"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/03 - p"},
   :skos/inScheme :loc.vocabulary/mplayspeed,
   :skos/notation "p",
   :skos/prefLabel "15 ips"})

(def ^{:private true} mplayspeed
  "Playback speed of the sound recording rendered on a mechanical device. Speed is associated with the kind of item with which it is associated; either disc, cylinder, or tape."
  {:db/ident :loc.vocabulary/mplayspeed,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Playback speed of the sound recording rendered on a mechanical device. Speed is associated with the kind of item with which it is associated; either disc, cylinder, or tape."},
   :madsrdf/hasMADSSchemeMember [:loc.mplayspeed/b
                                 :loc.mplayspeed/o
                                 :loc.mplayspeed/h
                                 :loc.mplayspeed/e
                                 :loc.mplayspeed/p
                                 :loc.mplayspeed/k
                                 :loc.mplayspeed/f
                                 :loc.mplayspeed/m
                                 :loc.mplayspeed/c
                                 :loc.mplayspeed/i
                                 :loc.mplayspeed/d
                                 :loc.mplayspeed/a
                                 :loc.mplayspeed/l],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Playing Speed"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mplayspeed,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Playback speed of the sound recording rendered on a mechanical device. Speed is associated with the kind of item with which it is associated; either disc, cylinder, or tape."}})