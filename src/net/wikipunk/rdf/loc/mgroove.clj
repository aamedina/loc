(ns net.wikipunk.rdf.loc.mgroove
  "http://id.loc.gov/vocabulary/mgroove/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mgroove.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mgroove" "http://id.loc.gov/vocabulary/mgroove/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mgroove",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mgroove/"})

(def coarse
  "Groove width for an analog disc typically around 40 grooves per cm or 100 grooves per inch"
  {:db/ident :loc.mgroove/coarse,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-10-03T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Coarse groove",
   :madsrdf/code "coarse",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Groove width for an analog disc typically around 40 grooves per cm or 100 grooves per inch"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 344 $d; 007sr/05 - s (007/01=d)"},
   :madsrdf/isMemberOfMADSCollection :loc.mgroove/collection_mgroove,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgroove,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-12-05T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mgroove/coarse,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-10-03T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mgroove/coarse,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Groove width for an analog disc typically around 40 grooves per cm or 100 grooves per inch"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value "MARC bib: 344 $d; 007sr/05 - s (007/01=d)"},
   :skos/inScheme :loc.vocabulary/mgroove,
   :skos/notation "coarse",
   :skos/prefLabel "Coarse groove"})

(def finepitch
  "Groove pitch for an analog cylinder in the range of 60-64 turns per cm, or 150 or 160 turns per inch, for 6 1/8 inch dictation format cylinders, or 200 TPI for 4-minute cylinders"
  {:db/ident :loc.mgroove/finepitch,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Fine pitch",
   :madsrdf/code "finepitch",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Groove pitch for an analog cylinder in the range of 60-64 turns per cm, or 150 or 160 turns per inch, for 6 1/8 inch dictation format cylinders, or 200 TPI for 4-minute cylinders"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 344 $d; 007sr/05 - m  (007/01=e)"},
   :madsrdf/isMemberOfMADSCollection :loc.mgroove/collection_mgroove,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgroove,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgroove/finepitch,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Groove pitch for an analog cylinder in the range of 60-64 turns per cm, or 150 or 160 turns per inch, for 6 1/8 inch dictation format cylinders, or 200 TPI for 4-minute cylinders"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value "MARC bib: 344 $d; 007sr/05 - m (007/01=e)"},
   :skos/inScheme :loc.vocabulary/mgroove,
   :skos/notation "finepitch",
   :skos/prefLabel "Fine pitch"})

(def micro
  "Groove width for an analog disc typically in the range 120 to 160 or more per cm or 300 to 400 or more grooves per inch, generally pressed into vinyl and in use post 1945"
  {:db/ident :loc.mgroove/micro,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-10-03T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Microgroove",
   :madsrdf/code "micro",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Groove width for an analog disc typically in the range 120 to 160 or more per cm or 300 to 400 or more grooves per inch, generally pressed into vinyl and in use post 1945"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 344 $d; 007sr/05 - m (007/01=d)"},
   :madsrdf/isMemberOfMADSCollection :loc.mgroove/collection_mgroove,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgroove,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-10-03T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mgroove/micro,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2017-12-05T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mgroove/micro,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Groove width for an analog disc typically in the range 120 to 160 or more per cm or 300 to 400 or more grooves per inch, generally pressed into vinyl and in use post 1945"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value "MARC bib: 344 $d; 007sr/05 - m (007/01=d)"},
   :skos/inScheme :loc.vocabulary/mgroove,
   :skos/notation "micro",
   :skos/prefLabel "Microgroove"})

(def stanpitch
  "Groove pitch for an analog cylinder of 40 turns per cm or 100 turns per inch"
  {:db/ident :loc.mgroove/stanpitch,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-12-05T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Standard pitch",
   :madsrdf/code "stanpitch",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Groove pitch for an analog cylinder of 40 turns per cm or 100 turns per inch"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 344 $d; 007sr/05 - s (007/01=e)"},
   :madsrdf/isMemberOfMADSCollection :loc.mgroove/collection_mgroove,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgroove,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-12-05T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgroove/stanpitch,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Groove pitch for an analog cylinder of 40 turns per cm or 100 turns per inch"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value "MARC bib: 344 $d; 007sr/05 - s (007/01=e)"},
   :skos/inScheme :loc.vocabulary/mgroove,
   :skos/notation "stanpitch",
   :skos/prefLabel "Standard pitch"})

(def vertical
  "Vertical cutting of cylinders and early discs, with no lateral information, intended for reproduction."
  {:db/ident :loc.mgroove/vertical,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-15T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Vertical cutting",
   :madsrdf/code "vertical",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Vertical cutting of cylinders and early discs, with no lateral information, intended for reproduction."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/11 - h"},
   :madsrdf/isMemberOfMADSCollection :loc.mgroove/collection_mgroove,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgroove,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-15T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mgroove/vertical,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Vertical cutting of cylinders and early discs, with no lateral information, intended for reproduction."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/11 - h"},
   :skos/inScheme :loc.vocabulary/mgroove,
   :skos/notation "vertical",
   :skos/prefLabel "Vertical cutting"})

(def ^{:private true} mgroove
  "Groove width of an analog disc, groove pitch of an analog cylinder, groove cutting"
  {:db/ident :loc.vocabulary/mgroove,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-03T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Groove width of an analog disc, groove pitch of an analog cylinder, groove cutting"},
   :madsrdf/hasMADSSchemeMember [:loc.mgroove/finepitch
                                 :loc.mgroove/stanpitch
                                 :loc.mgroove/micro
                                 :loc.mgroove/vertical
                                 :loc.mgroove/coarse],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 344 $d; 007sr/05; 007sr/11"},
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Groove Width/Pitch/Cutting"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-03T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mgroove,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Groove width of an analog disc, groove pitch of an analog cylinder, groove cutting"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 344 $d; 007sr/05; 007sr/11"}})