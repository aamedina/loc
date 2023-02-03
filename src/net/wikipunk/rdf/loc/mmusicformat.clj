(ns net.wikipunk.rdf.loc.mmusicformat
  "http://id.loc.gov/vocabulary/mmusicformat/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mmusicformat.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mmusicformat"
                       "http://id.loc.gov/vocabulary/mmusicformat/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mmusicformat",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mmusicformat/"})

(def choirbk
  "Large music book made to be placed on a stand in front of a choir"
  {:db/ident :loc.mmusicformat/choirbk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "choir book",
   :madsrdf/code "choirbk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Large music book made to be placed on a stand in front of a choir"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 348 $a; (Note: coded Other in MARC 008)"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/choirbk,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Large music book made to be placed on a stand in front of a choir"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 348 $a; (Note: coded Other in MARC 008)"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "choirbk",
   :skos/prefLabel "choir book"})

(def chscore
  "Score of a work for solo voices and chorus showing only the parts for chorus, at least in those portions of the work in which the chorus sings, with the instrumental accompaniment either arranged for keyboard or other chordal instruments or omitted"
  {:db/ident :loc.mmusicformat/chscore,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "chorus score",
   :madsrdf/code "chscore",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Score of a work for solo voices and chorus showing only the parts for chorus, at least in those portions of the work in which the chorus sings, with the instrumental accompaniment either arranged for keyboard or other chordal instruments or omitted"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a; 008MU/20 - h"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/chscore,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Score of a work for solo voices and chorus showing only the parts for chorus, at least in those portions of the work in which the chorus sings, with the instrumental accompaniment either arranged for keyboard or other chordal instruments or omitted"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a; 008MU/20 - h"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "chscore",
   :skos/prefLabel "chorus score"})

(def conscore
  "Score in which the number of staves is reduced to two or a few, generally organized by instrumental sections or vocal parts, and often with cues for individual parts"
  {:db/ident :loc.mmusicformat/conscore,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "condensed score",
   :madsrdf/code "conscore",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Score in which the number of staves is reduced to two or a few, generally organized by instrumental sections or vocal parts, and often with cues for individual parts"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a; 008MU/20 - i,g"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/conscore,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Score in which the number of staves is reduced to two or a few, generally organized by instrumental sections or vocal parts, and often with cues for individual parts"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a; 008MU/20 - i,g"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "conscore",
   :skos/prefLabel "condensed score"})

(def part
  "Music for the use of one or more, but not all, performers"
  {:db/ident :loc.mmusicformat/part,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "part",
   :madsrdf/code "part",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Music for the use of one or more, but not all, performers"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/part,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Music for the use of one or more, but not all, performers"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "part",
   :skos/prefLabel "part"})

(def perfconpt
  "Performance part for a single instrument in an ensemble, with cues for the other instruments that enable the performer of that part also to conduct."
  {:db/ident :loc.mmusicformat/perfconpt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "performer conductor part",
   :madsrdf/code "perfconpt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Performance part for a single instrument in an ensemble, with cues for the other instruments that enable the performer of that part also to conduct."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 348 $a; 008MU/20 - j; (Note: not in RDA)"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/perfconpt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Performance part for a single instrument in an ensemble, with cues for the other instruments that enable the performer of that part also to conduct."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 348 $a; 008MU/20 - j; (Note: not in RDA)"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "perfconpt",
   :skos/prefLabel "performer conductor part"})

(def pianoconpt
  "Performance part for a piano performer in an ensemble, with cues for the other instruments that enable the performer of that part also to conduct"
  {:db/ident :loc.mmusicformat/pianoconpt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "piano conductor part",
   :madsrdf/code "pianoconpt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Performance part for a piano performer in an ensemble, with cues for the other instruments that enable the performer of that part also to conduct"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a; 008MU/20 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/pianoconpt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Performance part for a piano performer in an ensemble, with cues for the other instruments that enable the performer of that part also to conduct"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a; 008MU/20 - e"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "pianoconpt",
   :skos/prefLabel "piano conductor part"})

(def pianoscore
  "Reduction of an instrumental work or a vocal work with instruments to a version for piano"
  {:db/ident :loc.mmusicformat/pianoscore,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "piano score",
   :madsrdf/code "pianoscore",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Reduction of an instrumental work or a vocal work with instruments to a version for piano"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a; 008MU/20 - p"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/pianoscore,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Reduction of an instrumental work or a vocal work with instruments to a version for piano"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a; 008MU/20 - p"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "pianoscore",
   :skos/prefLabel "piano score"})

(def score
  "Graphical, symbolic, or word-based musical notation representing the sounds of all the parts of an ensemble or a work for solo performer or electronic media"
  {:db/ident :loc.mmusicformat/score,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "score",
   :madsrdf/code "score",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Graphical, symbolic, or word-based musical notation representing the sounds of all the parts of an ensemble or a work for solo performer or electronic media"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a; 008MU/20 - a,l"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/score,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Graphical, symbolic, or word-based musical notation representing the sounds of all the parts of an ensemble or a work for solo performer or electronic media"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a; 008MU/20 - a,l"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "score",
   :skos/prefLabel "score"})

(def studyscore
  "Score issued in a musical image of reduced size, not primarily intended for use in performance"
  {:db/ident :loc.mmusicformat/studyscore,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "study score",
   :madsrdf/code "studyscore",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Score issued in a musical image of reduced size, not primarily intended for use in performance"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a; 008MU/20 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/studyscore,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Score issued in a musical image of reduced size, not primarily intended for use in performance"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a; 008MU/20 - b"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "studyscore",
   :skos/prefLabel "study score"})

(def tablebk
  "Music book made to be placed on a table and displayed in such a way that the performers can read their parts while seated or standing across or around the table"
  {:db/ident :loc.mmusicformat/tablebk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "table book",
   :madsrdf/code "tablebk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Music book made to be placed on a table and displayed in such a way that the performers can read their parts while seated or standing across or around the table"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 348 $a; (Note: coded Other in MARC 008)"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/tablebk,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Music book made to be placed on a table and displayed in such a way that the performers can read their parts while seated or standing across or around the table"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 348 $a; (Note: coded Other in MARC 008)"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "tablebk",
   :skos/prefLabel "table book"})

(def violconpart
  "Performance part for a violin performer in an ensemble, with cues for the other instruments that enable the performer of that part also to conduct."
  {:db/ident :loc.mmusicformat/violconpart,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "violin conductor part",
   :madsrdf/code "violconpart",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Performance part for a violin performer in an ensemble, with cues for the other instruments that enable the performer of that part also to conduct."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/violconpart,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Performance part for a violin performer in an ensemble, with cues for the other instruments that enable the performer of that part also to conduct."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "violconpart",
   :skos/prefLabel "violin conductor part"})

(def vocalscore
  "Score showing all vocal parts, with the instrumental accompaniment either omitted or arranged for a keyboard or other chordal instrument or instruments"
  {:db/ident :loc.mmusicformat/vocalscore,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "vocal score",
   :madsrdf/code "vocalscore",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Score showing all vocal parts, with the instrumental accompaniment either omitted or arranged for a keyboard or other chordal instrument or instruments"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a; 008MU/20 - k,d"},
   :madsrdf/isMemberOfMADSCollection :loc.mmusicformat/collection_mmusicformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mmusicformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mmusicformat/vocalscore,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Score showing all vocal parts, with the instrumental accompaniment either omitted or arranged for a keyboard or other chordal instrument or instruments"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a; 008MU/20 - k,d"},
   :skos/inScheme :loc.vocabulary/mmusicformat,
   :skos/notation "vocalscore",
   :skos/prefLabel "vocal score"})

(def ^{:private true} mmusicformat
  "Musical or physical layout of the content that is presented in the form of musical notation"
  {:db/ident :loc.vocabulary/mmusicformat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Musical or physical layout of the content that is presented in the form of musical notation"},
   :madsrdf/hasMADSSchemeMember [:loc.mmusicformat/choirbk
                                 :loc.mmusicformat/tablebk
                                 :loc.mmusicformat/part
                                 :loc.mmusicformat/conscore
                                 :loc.mmusicformat/violconpart
                                 :loc.mmusicformat/score
                                 :loc.mmusicformat/perfconpt
                                 :loc.mmusicformat/studyscore
                                 :loc.mmusicformat/pianoscore
                                 :loc.mmusicformat/pianoconpt
                                 :loc.mmusicformat/vocalscore
                                 :loc.mmusicformat/chscore],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 348 $a; 008MU/20"},
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "NOTATED MUSIC FORM"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mmusicformat,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Musical or physical layout of the content that is presented in the form of musical notation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 348 $a; 008MU/20"}})