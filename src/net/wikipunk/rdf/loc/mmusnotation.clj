(ns net.wikipunk.rdf.loc.mmusnotation
  "http://id.loc.gov/vocabulary/mmusnotation/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mmusnotation.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mmusnotation"
                       "http://id.loc.gov/vocabulary/mmusnotation/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mmusnotation",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mmusnotation/"})

(def graph
  "A form of musical notation that uses various suggestive lines, symbols, colour, etc."
  {:db/ident :loc.mmusnotation/graph,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "graphic notation",
   :madsrdf/code "graph",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation that uses various suggestive lines, symbols, colour, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusnotation/collection_mmusnotation,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusnotation,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/graph,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-08-10T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/graph,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation that uses various suggestive lines, symbols, colour, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :skos/inScheme :loc.vocabulary/mmusnotation,
   :skos/notation "graph",
   :skos/prefLabel "graphic notation"})

(def letter
  "A form of musical notation that uses the letters of the alphabet to designate pitches"
  {:db/ident :loc.mmusnotation/letter,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "letter notation",
   :madsrdf/code "letter",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation that uses the letters of the alphabet to designate pitches"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusnotation/collection_mmusnotation,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusnotation,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-08-10T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/letter,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/letter,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation that uses the letters of the alphabet to designate pitches"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :skos/inScheme :loc.vocabulary/mmusnotation,
   :skos/notation "letter",
   :skos/prefLabel "letter notation"})

(def mensu
  "A form of musical notation used between the years 1260-1600 that employed four principal note values and associated rests to notate duration"
  {:db/ident :loc.mmusnotation/mensu,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "mensural notation",
   :madsrdf/code "mensu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation used between the years 1260-1600 that employed four principal note values and associated rests to notate duration"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusnotation/collection_mmusnotation,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusnotation,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-08-10T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/mensu,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/mensu,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation used between the years 1260-1600 that employed four principal note values and associated rests to notate duration"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :skos/inScheme :loc.vocabulary/mmusnotation,
   :skos/notation "mensu",
   :skos/prefLabel "mensural notation"})

(def neuma
  "A form of musical notation using neumes (graphic signs) that represent the movement in pitch of a melody"
  {:db/ident :loc.mmusnotation/neuma,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "neumatic notation",
   :madsrdf/code "neuma",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation using neumes (graphic signs) that represent the movement in pitch of a melody"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusnotation/collection_mmusnotation,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusnotation,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/neuma,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-08-10T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/neuma,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation using neumes (graphic signs) that represent the movement in pitch of a melody"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :skos/inScheme :loc.vocabulary/mmusnotation,
   :skos/notation "neuma",
   :skos/prefLabel "neumatic notation"})

(def numb
  "A form of musical notation conveying pitch by use of numbers, assigned to the notes of a scale, the keys of a keyboard, the finger positions or frets of a string instrument, or to the holes or valves of a wind instrument"
  {:db/ident :loc.mmusnotation/numb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "number notation",
   :madsrdf/code "numb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation conveying pitch by use of numbers, assigned to the notes of a scale, the keys of a keyboard, the finger positions or frets of a string instrument, or to the holes or valves of a wind instrument"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusnotation/collection_mmusnotation,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusnotation,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-08-10T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/numb,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/numb,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation conveying pitch by use of numbers, assigned to the notes of a scale, the keys of a keyboard, the finger positions or frets of a string instrument, or to the holes or valves of a wind instrument"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :skos/inScheme :loc.vocabulary/mmusnotation,
   :skos/notation "numb",
   :skos/prefLabel "number notation"})

(def solmi
  "A form of musical notation that designates pitches by means of conventional syllables rather than letter names"
  {:db/ident :loc.mmusnotation/solmi,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "solmization",
   :madsrdf/code "solmi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation that designates pitches by means of conventional syllables rather than letter names"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusnotation/collection_mmusnotation,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusnotation,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/solmi,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-08-10T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/solmi,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation that designates pitches by means of conventional syllables rather than letter names"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :skos/inScheme :loc.vocabulary/mmusnotation,
   :skos/notation "solmi",
   :skos/prefLabel "solmization"})

(def staff
  "A form of musical notation widely used for Western art music, conveying pitch and duration using a staff of parallel lines, often in combination with other staves"
  {:db/ident :loc.mmusnotation/staff,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "staff notation",
   :madsrdf/code "staff",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation widely used for Western art music, conveying pitch and duration using a staff of parallel lines, often in combination with other staves"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusnotation/collection_mmusnotation,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusnotation,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-08-10T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/staff,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/staff,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation widely used for Western art music, conveying pitch and duration using a staff of parallel lines, often in combination with other staves"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :skos/inScheme :loc.vocabulary/mmusnotation,
   :skos/notation "staff",
   :skos/prefLabel "staff notation"})

(def syll
  "A form of musical notation that designates pitch by means of conventional syllables"
  {:db/ident :loc.mmusnotation/syll,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "syllabic notation",
   :madsrdf/code "syll",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation that designates pitch by means of conventional syllables"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusnotation/collection_mmusnotation,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusnotation,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-08-10T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusnotation/syll,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation that designates pitch by means of conventional syllables"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :skos/inScheme :loc.vocabulary/mmusnotation,
   :skos/notation "syll",
   :skos/prefLabel "syllabic notation"})

(def tabla
  "A form of musical notation used since 1300 that uses letters, numerals, or other signs as an alternative to conventional staff notation"
  {:db/ident :loc.mmusnotation/tabla,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "tablature",
   :madsrdf/code "tabla",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation used since 1300 that uses letters, numerals, or other signs as an alternative to conventional staff notation"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusnotation/collection_mmusnotation,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusnotation,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-08-10T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/tabla,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mmusnotation/tabla,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A form of musical notation used since 1300 that uses letters, numerals, or other signs as an alternative to conventional staff notation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :skos/inScheme :loc.vocabulary/mmusnotation,
   :skos/notation "tabla",
   :skos/prefLabel "tablature"})

(def ^{:private true} mmusnotation
  "Set of characters or symbols used to express musical content"
  {:db/ident :loc.vocabulary/mmusnotation,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-08-10T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Set of characters or symbols used to express musical content"},
   :madsrdf/hasMADSSchemeMember [:loc.mmusnotation/syll
                                 :loc.mmusnotation/numb
                                 :loc.mmusnotation/neuma
                                 :loc.mmusnotation/graph
                                 :loc.mmusnotation/solmi
                                 :loc.mmusnotation/letter
                                 :loc.mmusnotation/tabla
                                 :loc.mmusnotation/staff
                                 :loc.mmusnotation/mensu],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $c or 546 $b"},
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Music Notation"},
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-08-10T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.vocabulary/mmusnotation,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.vocabulary/mmusnotation,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Set of characters or symbols used to express musical content"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $c or 546 $b"}})