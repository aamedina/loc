(ns net.wikipunk.rdf.loc.frequencies
  "http://id.loc.gov/vocabulary/frequencies/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/frequencies.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.frequencies"
                       "http://id.loc.gov/vocabulary/frequencies/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.frequencies",
   :rdfa/uri          "http://id.loc.gov/vocabulary/frequencies/"}
  (:refer-clojure :exclude [frequencies]))

(def ann
  "Issued or updated once a year."
  {:db/ident :loc.frequencies/ann,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "annual",
   :madsrdf/code "ann",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Issued or updated once a year."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=a"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/ann,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/ann,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated once a year."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=a"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "ann",
   :skos/prefLabel "annual"})

(def bin
  "Issued or updated every two years."
  {:db/ident :loc.frequencies/bin,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "biennial",
   :madsrdf/code "bin",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Issued or updated every two years."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=g"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/bin,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/bin,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated every two years."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=g"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "bin",
   :skos/prefLabel "biennial"})

(def bmn
  "Issued or updated every two months."
  {:db/ident :loc.frequencies/bmn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "bimonthly",
   :madsrdf/code "bmn",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Issued or updated every two months."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=b"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/bmn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/bmn,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated every two months."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=b"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "bmn",
   :skos/prefLabel "bimonthly"})

(def bwk
  "Issued or updated every two weeks."
  {:db/ident :loc.frequencies/bwk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "biweekly",
   :madsrdf/code "bwk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Issued or updated every two weeks."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=k"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/bwk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/bwk,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated every two weeks."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=k"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "bwk",
   :skos/prefLabel "biweekly"})

(def con
  "Issued or updated more than once a day."
  {:db/ident :loc.frequencies/con,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "continuously updated",
   :madsrdf/code "con",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Issued or updated more than once a day."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=k"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/con,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/con,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated more than once a day."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=k"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "con",
   :skos/prefLabel "continuously updated"})

(def dyl
  "Issued or updated once a day."
  {:db/ident :loc.frequencies/dyl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "daily",
   :madsrdf/code "dyl",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Issued or updated once a day."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=d"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/dyl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/dyl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated once a day."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=d"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "dyl",
   :skos/prefLabel "daily"})

(def irr
  "Issued or updated with no consistent interval."
  {:db/ident :loc.frequencies/irr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "irregular",
   :madsrdf/code "irr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Issued or updated with no consistent interval."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/19=x"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/irr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/irr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Issued or updated with no consistent interval."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/19=x"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "irr",
   :skos/prefLabel "irregular"})

(def mon
  "Issued or updated once a month."
  {:db/ident :loc.frequencies/mon,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "monthly",
   :madsrdf/code "mon",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Issued or updated once a month."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=m"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/mon,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/mon,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated once a month."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=m"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "mon",
   :skos/prefLabel "monthly"})

(def oth
  "Other frequency."
  {:db/ident :loc.frequencies/oth,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "other",
   :madsrdf/code "oth",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Other frequency."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=z"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/oth,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/oth,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Other frequency."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=z"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "oth",
   :skos/prefLabel "other"})

(def qrt
  "Issued or updated every three months."
  {:db/ident :loc.frequencies/qrt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "quarterly",
   :madsrdf/code "qrt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Issued or updated every three months."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=q"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/qrt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/qrt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated every three months."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=q"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "qrt",
   :skos/prefLabel "quarterly"})

(def san
  "Issued or updated twice a year."
  {:db/ident :loc.frequencies/san,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "semiannual",
   :madsrdf/code "san",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Issued or updated twice a year."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=f"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/san,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/san,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated twice a year."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=f"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "san",
   :skos/prefLabel "semiannual"})

(def smn
  "Issued or updated twice a month."
  {:db/ident :loc.frequencies/smn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "semimonthly",
   :madsrdf/code "smn",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Issued or updated twice a month."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=s"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/smn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/smn,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated twice a month."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=s"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "smn",
   :skos/prefLabel "semimonthly"})

(def swk
  "Issued or updated twice a week."
  {:db/ident :loc.frequencies/swk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "semiweekly",
   :madsrdf/code "swk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Issued or updated twice a week."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=c"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/swk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/swk,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated twice a week."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=c"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "swk",
   :skos/prefLabel "semiweekly"})

(def ten
  "Issued or updated every three years."
  {:db/ident :loc.frequencies/ten,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "triennial",
   :madsrdf/code "ten",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Issued or updated every three years."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=h"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/ten,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/ten,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated every three years."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=h"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "ten",
   :skos/prefLabel "triennial"})

(def ttm
  "Issued or updated three times a month."
  {:db/ident :loc.frequencies/ttm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "three times a month",
   :madsrdf/code "ttm",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Issued or updated three times a month."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=j"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/ttm,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/ttm,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated three times a month."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=j"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "ttm",
   :skos/prefLabel "three times a month"})

(def ttw
  "Issued or updated three times a week."
  {:db/ident :loc.frequencies/ttw,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "three times a week",
   :madsrdf/code "ttw",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Issued or updated three times a week."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=i"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/ttw,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/ttw,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated three times a week."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=i"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "ttw",
   :skos/prefLabel "three times a week"})

(def tty
  "Issued or updated three times a year."
  {:db/ident :loc.frequencies/tty,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "three times a year",
   :madsrdf/code "tty",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Issued or updated three times a year."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=t"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/tty,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/tty,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated three times a year."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=t"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "tty",
   :skos/prefLabel "three times a year"})

(def unk
  "Unknown frequency."
  {:db/ident :loc.frequencies/unk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "unknown",
   :madsrdf/code "unk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Unknown frequency."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=u"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/unk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/unk,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Unknown frequency."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=u"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "unk",
   :skos/prefLabel "unknown"})

(def wkl
  "Issued or updated once a week."
  {:db/ident :loc.frequencies/wkl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "weekly",
   :madsrdf/code "wkl",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Issued or updated once a week."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008/18=w"},
   :madsrdf/isMemberOfMADSCollection :loc.frequencies/collection_frequencies,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/frequencies,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/wkl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.frequencies/wkl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Issued or updated once a week."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008/18=w"},
   :skos/inScheme :loc.vocabulary/frequencies,
   :skos/notation "wkl",
   :skos/prefLabel "weekly"})

(def ^{:private true} frequencies
  "The interval at which an issue or part of a serial, or the update to an integrating resource, is issued."
  {:db/ident :loc.vocabulary/frequencies,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-07T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-04-23T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The interval at which an issue or part of a serial, or the update to an integrating resource, is issued."},
   :madsrdf/hasMADSSchemeMember [:loc.frequencies/unk
                                 :loc.frequencies/ttw
                                 :loc.frequencies/con
                                 :loc.frequencies/swk
                                 :loc.frequencies/ttm
                                 :loc.frequencies/irr
                                 :loc.frequencies/oth
                                 :loc.frequencies/ten
                                 :loc.frequencies/bwk
                                 :loc.frequencies/smn
                                 :loc.frequencies/wkl
                                 :loc.frequencies/tty
                                 :loc.frequencies/ann
                                 :loc.frequencies/mon
                                 :loc.frequencies/qrt
                                 :loc.frequencies/san
                                 :loc.frequencies/bmn
                                 :loc.frequencies/dyl
                                 :loc.frequencies/bin],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Publication Frequency"},
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-07T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.vocabulary/frequencies,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2015-04-23T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.vocabulary/frequencies,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The interval at which an issue or part of a serial, or the update to an integrating resource, is issued."}})