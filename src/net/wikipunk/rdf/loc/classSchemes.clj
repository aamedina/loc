(ns net.wikipunk.rdf.loc.classSchemes
  "http://id.loc.gov/vocabulary/classSchemes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/classSchemes.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.classSchemes"
                       "http://id.loc.gov/vocabulary/classSchemes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.classSchemes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/classSchemes/"})

(def accs
  "Published by Kappa Delta Pi in West Lafayette, IN"
  {:db/ident :loc.classSchemes/accs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Annehurst curriculum classification system",
   :madsrdf/code "accs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Kappa Delta Pi in West Lafayette, IN"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/accs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/accs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Kappa Delta Pi in West Lafayette, IN"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "accs",
   :skos/prefLabel "Annehurst curriculum classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def acmccs
  "ACM computing classification system"
  {:db/ident :loc.classSchemes/acmccs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "ACM computing classification system",
   :madsrdf/code "acmccs",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/acmccs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/acmccs,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "acmccs",
   :skos/prefLabel "ACM computing classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def agricola
  "Published by Agriculture Network Information Center"
  {:db/ident :loc.classSchemes/agricola,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "AGRICOLA subject category codes",
   :madsrdf/code "agricola",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Agriculture Network Information Center"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/agricola,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/agricola,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Agriculture Network Information Center"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "agricola",
   :skos/prefLabel "AGRICOLA subject category codes",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def agrissc
  "Published by AGRIS Coordinating Centre in Rome"
  {:db/ident :loc.classSchemes/agrissc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "AGRIS: subject categories",
   :madsrdf/code "agrissc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by AGRIS Coordinating Centre in Rome"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/agrissc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/agrissc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by AGRIS Coordinating Centre in Rome"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "agrissc",
   :skos/prefLabel "AGRIS: subject categories",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def anscr
  "Published by Bro-Dart in Williamston, PA"
  {:db/ident :loc.classSchemes/anscr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "The Alpha-numeric system for classification of recordings",
   :madsrdf/code "anscr",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Bro-Dart in Williamston, PA"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/anscr,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/anscr,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Bro-Dart in Williamston, PA"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "anscr",
   :skos/prefLabel "The Alpha-numeric system for classification of recordings",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ardocs
  "Published by Arkansas State Library, Documents Services Section, State Publications Unit in Little Rock"
  {:db/ident :loc.classSchemes/ardocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Arkansas state documents classification scheme",
   :madsrdf/code "ardocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Arkansas State Library, Documents Services Section, State Publications Unit in Little Rock"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ardocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ardocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Arkansas State Library, Documents Services Section, State Publications Unit in Little Rock"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ardocs",
   :skos/prefLabel "Arkansas state documents classification scheme",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def asb
  "Published by Deutsches Bibliotheksinstitut in Berlin"
  {:db/ident :loc.classSchemes/asb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Allgemeine Systematik für öffentliche Bibliotheken (ASB)",
   :madsrdf/code "asb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Deutsches Bibliotheksinstitut in Berlin"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/asb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/asb,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Deutsches Bibliotheksinstitut in Berlin"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "asb",
   :skos/prefLabel "Allgemeine Systematik für öffentliche Bibliotheken (ASB)",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def azdocs
  "Published by State Documents Center, Arizona Dept. of Library, Archives and Public Records in Phoenix"
  {:db/ident :loc.classSchemes/azdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-02-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-02-14T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel "Arizona documents: KWOC manual",
   :madsrdf/code "azdocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by State Documents Center, Arizona Dept. of Library, Archives and Public Records in Phoenix"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-02-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-02-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/azdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/azdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by State Documents Center, Arizona Dept. of Library, Archives and Public Records in Phoenix"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "azdocs",
   :skos/prefLabel "Arizona documents: KWOC manual",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def bar
  "Published by H.K. Lewis in London"
  {:db/ident :loc.classSchemes/bar,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Barnard, Cyril C. A classification for medical and veterinary libraries",
   :madsrdf/code "bar",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by H.K. Lewis in London"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bar,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bar,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by H.K. Lewis in London"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "bar",
   :skos/prefLabel
   "Barnard, Cyril C. A classification for medical and veterinary libraries",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def bcl
  "Published by Koninklijke Bibliotheek in The Hague"
  {:db/ident :loc.classSchemes/bcl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Nederlandse Basisclassificatie = Dutch basic classification codes",
   :madsrdf/code "bcl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Koninklijke Bibliotheek in The Hague"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bcl,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bcl,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Koninklijke Bibliotheek in The Hague"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "bcl",
   :skos/prefLabel
   "Nederlandse Basisclassificatie = Dutch basic classification codes",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def bcmc
  "Published by Council of the British National Bibliography, London"
  {:db/ident :loc.classSchemes/bcmc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Coates, E.J. The British catalogue of music classification",
   :madsrdf/code "bcmc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Council of the British National Bibliography, London"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bcmc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bcmc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Council of the British National Bibliography, London"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "bcmc",
   :skos/prefLabel "Coates, E.J. The British catalogue of music classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def bisacsh
  "BISAC subject headings"
  {:db/ident :loc.classSchemes/bisacsh,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "BISAC subject headings",
   :madsrdf/code "bisacsh",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bisacsh,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bisacsh,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "bisacsh",
   :skos/prefLabel "BISAC subject headings",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def bizga
  "Published by Bibliothek der Friedrich-Ebert-Stiftung"
  {:db/ident :loc.classSchemes/bizga,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Bibliographie zur Geschichte der Deutschen Arbeiterbewegung",
   :madsrdf/code "bizga",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bibliothek der Friedrich-Ebert-Stiftung"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bizga,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bizga,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Bibliothek der Friedrich-Ebert-Stiftung"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "bizga",
   :skos/prefLabel
   "Bibliographie zur Geschichte der Deutschen Arbeiterbewegung",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def bkl
  "Basisklassification"
  {:db/ident :loc.classSchemes/bkl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Basisklassification",
   :madsrdf/code "bkl",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bkl,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bkl,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "bkl",
   :skos/prefLabel "Basisklassification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def bliss
  "Published by Butterworth in London"
  {:db/ident :loc.classSchemes/bliss,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "BLISS bibliographic classification",
   :madsrdf/code "bliss",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Butterworth in London"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bliss,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bliss,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Butterworth in London"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "bliss",
   :skos/prefLabel "BLISS bibliographic classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def blissc
  "Published by British Library in London"
  {:db/ident :loc.classSchemes/blissc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "British Library Inside service subject classification",
   :madsrdf/code "blissc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by British Library in London"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/blissc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/blissc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by British Library in London"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "blissc",
   :skos/prefLabel "British Library Inside service subject classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def blsrissc
  "Published by British Library in London"
  {:db/ident :loc.classSchemes/blsrissc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "British Library - Science reference information service subject classification",
   :madsrdf/code "blsrissc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by British Library in London"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/blsrissc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/blsrissc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by British Library in London"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "blsrissc",
   :skos/prefLabel
   "British Library - Science reference information service subject classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def bsbddc
  "Published by Bayerische Staatsbibliothek in München"
  {:db/ident :loc.classSchemes/bsbddc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Klassification für die Sacherschließung (BSB-DDC)",
   :madsrdf/code "bsbddc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bayerische Staatsbibliothek in München"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bsbddc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/bsbddc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Bayerische Staatsbibliothek in München"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "bsbddc",
   :skos/prefLabel "Klassification für die Sacherschließung (BSB-DDC)",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cacodoc
  "Published by Office of Library Coordination, Council of Ontario Universities in Toronto"
  {:db/ident :loc.classSchemes/cacodoc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "CODOC [Canadian federal and provincial government documents classification scheme]",
   :madsrdf/code "cacodoc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Office of Library Coordination, Council of Ontario Universities in Toronto"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cacodoc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cacodoc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Office of Library Coordination, Council of Ontario Universities in Toronto"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cacodoc",
   :skos/prefLabel
   "CODOC [Canadian federal and provincial government documents classification scheme]",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cadocs
  "Published by Government Publications Section, California State Library in Sacramento"
  {:db/ident :loc.classSchemes/cadocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "California state agency classification scheme",
   :madsrdf/code "cadocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Government Publications Section, California State Library in Sacramento"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cadocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cadocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Government Publications Section, California State Library in Sacramento"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cadocs",
   :skos/prefLabel "California state agency classification scheme",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ccpgq
  "Published by Bibliothèque et Archives nationales du Québec in Montréal"
  {:db/ident :loc.classSchemes/ccpgq,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Cadre de classement des publications gouvernementales du Québec",
   :madsrdf/code "ccpgq",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque et Archives nationales du Québec in Montréal"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ccpgq,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ccpgq,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque et Archives nationales du Québec in Montréal"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ccpgq",
   :skos/prefLabel
   "Cadre de classement des publications gouvernementales du Québec",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cddir
  "Classifiação decimal de direito (CDDIR)"
  {:db/ident :loc.classSchemes/cddir,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Classifiação decimal de direito (CDDIR)",
   :madsrdf/code "cddir",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cddir,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cddir,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cddir",
   :skos/prefLabel "Classifiação decimal de direito (CDDIR)",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def celex
  "Published by Office for Official Publications of the European Communities in Luxembourg"
  {:db/ident :loc.classSchemes/celex,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "CELEX document number",
   :madsrdf/code "celex",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Office for Official Publications of the European Communities in Luxembourg"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/celex,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/celex,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Office for Official Publications of the European Communities in Luxembourg"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "celex",
   :skos/prefLabel "CELEX document number",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def chfbn
  "Published by Bibliothèque nationale de France in Paris"
  {:db/ident :loc.classSchemes/chfbn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Classification de l'histoire de France",
   :madsrdf/code "chfbn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bibliothèque nationale de France in Paris"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/chfbn,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/chfbn,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Bibliothèque nationale de France in Paris"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "chfbn",
   :skos/prefLabel "Classification de l'histoire de France",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cidades
  "Published by IBGE in Brazil"
  {:db/ident :loc.classSchemes/cidades,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Cidades@",
   :madsrdf/code "cidades",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by IBGE in Brazil"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cidades,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cidades,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by IBGE in Brazil"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cidades",
   :skos/prefLabel "Cidades@",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cjurrom
  "Published by Swiss Institute of Comparative Law in Lausanne"
  {:db/ident :loc.classSchemes/cjurrom,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Classification juridique romande",
   :madsrdf/code "cjurrom",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Swiss Institute of Comparative Law in Lausanne"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cjurrom,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cjurrom,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Swiss Institute of Comparative Law in Lausanne"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cjurrom",
   :skos/prefLabel "Classification juridique romande",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def clc
  "Published by Beijing tu shu guan chu ban she in Beijung"
  {:db/ident :loc.classSchemes/clc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Zhongguo tu shu guan fen lei fa = Chinese library classification",
   :madsrdf/code "clc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Beijing tu shu guan chu ban she in Beijung"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/clc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/clc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Beijing tu shu guan chu ban she in Beijung"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "clc",
   :skos/prefLabel
   "Zhongguo tu shu guan fen lei fa = Chinese library classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def clutscny
  "Published by Union Theological Seminary in New York"
  {:db/ident :loc.classSchemes/clutscny,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Classification of the library of Union Theological Seminary in the City of New York",
   :madsrdf/code "clutscny",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Union Theological Seminary in New York"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/clutscny,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/clutscny,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Union Theological Seminary in New York"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "clutscny",
   :skos/prefLabel
   "Classification of the library of Union Theological Seminary in the City of New York",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cmedlit
  "Published by Vanderbilt University Press in Nashvill, Tenn."
  {:db/ident :loc.classSchemes/cmedlit,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Classification for medical literature by Eileen R. Cunningham",
   :madsrdf/code "cmedlit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Vanderbilt University Press in Nashvill, Tenn."},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cmedlit,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cmedlit,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Vanderbilt University Press in Nashvill, Tenn."},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cmedlit",
   :skos/prefLabel
   "Classification for medical literature by Eileen R. Cunningham",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def codocs
  "Published by Colorado State Library in Denver"
  {:db/ident :loc.classSchemes/codocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Colorado State Publications Depository and Distribution Center. Classification schedule",
   :madsrdf/code "codocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Colorado State Library in Denver"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/codocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/codocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Colorado State Library in Denver"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "codocs",
   :skos/prefLabel
   "Colorado State Publications Depository and Distribution Center. Classification schedule",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cscjb
  "Published by Committees on Far Eastern Studies, American Council of Learned Societies in Washington, D.C. in 1943"
  {:db/ident :loc.classSchemes/cscjb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "A Classification scheme for Chinese and Japanese books",
   :madsrdf/code "cscjb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Committees on Far Eastern Studies, American Council of Learned Societies in Washington, D.C. in 1943"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cscjb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cscjb,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Committees on Far Eastern Studies, American Council of Learned Societies in Washington, D.C. in 1943"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cscjb",
   :skos/prefLabel "A Classification scheme for Chinese and Japanese books",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cslj
  "Published by University Press of America in Lanham, MD"
  {:db/ident :loc.classSchemes/cslj,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Elazar, David H. & Elazar, Daniel J. A classification system for libraries of Judaica",
   :madsrdf/code "cslj",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by University Press of America in Lanham, MD"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cslj,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cslj,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by University Press of America in Lanham, MD"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cslj",
   :skos/prefLabel
   "Elazar, David H. & Elazar, Daniel J. A classification system for libraries of Judaica",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cstud
  "Published by Technische Universiteit Delft, Bibliotheek in Delft"
  {:db/ident :loc.classSchemes/cstud,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Classificatieschema's Bibliotheek TU Delft",
   :madsrdf/code "cstud",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Technische Universiteit Delft, Bibliotheek in Delft"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cstud,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cstud,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Technische Universiteit Delft, Bibliotheek in Delft"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cstud",
   :skos/prefLabel "Classificatieschema's Bibliotheek TU Delft",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def cutterec
  "Published by C.A. Cutter in Boston"
  {:db/ident :loc.classSchemes/cutterec,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Cutter, Charles Ammi. Expansive classification",
   :madsrdf/code "cutterec",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by C.A. Cutter in Boston"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cutterec,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/cutterec,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by C.A. Cutter in Boston"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "cutterec",
   :skos/prefLabel "Cutter, Charles Ammi. Expansive classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index",
   :madsrdf/code "ddc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc",
   :skos/prefLabel "Dewey decimal classification and relative index",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc1
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc1,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 01",
   :madsrdf/code "ddc1",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc1,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc1,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc1",
   :skos/prefLabel "Dewey decimal classification and relative index Edition 01",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc10
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc10,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 010",
   :madsrdf/code "ddc10",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc10,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc10,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc10",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 010",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc11
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc11,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 011",
   :madsrdf/code "ddc11",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc11,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc11,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc11",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 011",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc12
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc12,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 012",
   :madsrdf/code "ddc12",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc12,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc12,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc12",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 012",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc13
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc13,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 013",
   :madsrdf/code "ddc13",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc13,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc13,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc13",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 013",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc14
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc14,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 014",
   :madsrdf/code "ddc14",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc14,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc14,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc14",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 014",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc15
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc15,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 015",
   :madsrdf/code "ddc15",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc15,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc15,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc15",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 015",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc16
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc16,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 016",
   :madsrdf/code "ddc16",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc16,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc16,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc16",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 016",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc17
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc17,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 017",
   :madsrdf/code "ddc17",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc17,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc17,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc17",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 017",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc18
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc18,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 018",
   :madsrdf/code "ddc18",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc18,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc18,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc18",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 018",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc19
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc19,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 019",
   :madsrdf/code "ddc19",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc19,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc19,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc19",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 019",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc2
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc2,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 02",
   :madsrdf/code "ddc2",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc2,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc2,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc2",
   :skos/prefLabel "Dewey decimal classification and relative index Edition 02",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc20
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc20,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 020",
   :madsrdf/code "ddc20",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc20,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc20,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc20",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 020",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc21
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc21,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 021",
   :madsrdf/code "ddc21",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc21,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc21,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc21",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 021",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc22
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc22,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 022",
   :madsrdf/code "ddc22",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc22,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc22,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc22",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 022",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc23
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc23,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 023",
   :madsrdf/code "ddc23",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc23,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc23,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc23",
   :skos/prefLabel
   "Dewey decimal classification and relative index Edition 023",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc3
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc3,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 03",
   :madsrdf/code "ddc3",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc3,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc3,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc3",
   :skos/prefLabel "Dewey decimal classification and relative index Edition 03",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc4
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc4,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 04",
   :madsrdf/code "ddc4",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc4,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc4,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc4",
   :skos/prefLabel "Dewey decimal classification and relative index Edition 04",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc5
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc5,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 05",
   :madsrdf/code "ddc5",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc5,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc5,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc5",
   :skos/prefLabel "Dewey decimal classification and relative index Edition 05",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc6
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc6,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 06",
   :madsrdf/code "ddc6",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc6,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc6,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc6",
   :skos/prefLabel "Dewey decimal classification and relative index Edition 06",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc7
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc7,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 07",
   :madsrdf/code "ddc7",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc7,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc7,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc7",
   :skos/prefLabel "Dewey decimal classification and relative index Edition 07",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc8
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc8,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 08",
   :madsrdf/code "ddc8",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc8,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc8,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc8",
   :skos/prefLabel "Dewey decimal classification and relative index Edition 08",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ddc9
  "Published by OCLC Online Computer Center in Dublin, Ohio"
  {:db/ident :loc.classSchemes/ddc9,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Dewey decimal classification and relative index Edition 09",
   :madsrdf/code "ddc9",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc9,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ddc9,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by OCLC Online Computer Center in Dublin, Ohio"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ddc9",
   :skos/prefLabel "Dewey decimal classification and relative index Edition 09",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def dhb-jdgklass
  "Deutsche Historische Bibliografie - Jahresberichte für deutsche Geschichte - Klassifikation (Bibliography of German History - Annual Bibliography on German History - Classification)"
  {:db/ident :loc.classSchemes/dhb-jdgklass,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Deutsche Historische Bibliografie - Jahresberichte für deutsche Geschichte - Klassifikation (Bibliography of German History - Annual Bibliography on German History - Classification)",
   :madsrdf/code "dhb-jdgklass",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/dhb-jdgklass,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/dhb-jdgklass,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "dhb-jdgklass",
   :skos/prefLabel
   "Deutsche Historische Bibliografie - Jahresberichte für deutsche Geschichte - Klassifikation (Bibliography of German History - Annual Bibliography on German History - Classification)",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def dk5s
  "Published by Dansk BiblioteksCenter"
  {:db/ident :loc.classSchemes/dk5s,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "DK5 Systematik",
   :madsrdf/code "dk5s",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Dansk BiblioteksCenter"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/dk5s,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/dk5s,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Dansk BiblioteksCenter"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "dk5s",
   :skos/prefLabel "DK5 Systematik",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def dopaed
  "DOPAED der UB Erlangen"
  {:db/ident :loc.classSchemes/dopaed,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "DOPAED der UB Erlangen",
   :madsrdf/code "dopaed",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/dopaed,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/dopaed,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "dopaed",
   :skos/prefLabel "DOPAED der UB Erlangen",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def egedeklass
  "Egede-instituttets klassifikasjonsystem"
  {:db/ident :loc.classSchemes/egedeklass,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Egede-instituttets klassifikasjonsystem",
   :madsrdf/code "egedeklass",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/egedeklass,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/egedeklass,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "egedeklass",
   :skos/prefLabel "Egede-instituttets klassifikasjonsystem",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ekl
  "Eduskunnan kirjaston luokitus = Library of Parliament Classification"
  {:db/ident :loc.classSchemes/ekl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Eduskunnan kirjaston luokitus = Library of Parliament Classification",
   :madsrdf/code "ekl",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ekl,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ekl,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ekl",
   :skos/prefLabel
   "Eduskunnan kirjaston luokitus = Library of Parliament Classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def farl
  "Published by Frick Art Reference Library in New York, NY"
  {:db/ident :loc.classSchemes/farl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Frick Art Reference Library book classification system",
   :madsrdf/code "farl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Frick Art Reference Library in New York, NY"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/farl,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/farl,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Frick Art Reference Library in New York, NY"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "farl",
   :skos/prefLabel "Frick Art Reference Library book classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def farma
  "Published by Danmarks farmaceutiski bibliotek in København"
  {:db/ident :loc.classSchemes/farma,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Oversigt over systematisk catalog",
   :madsrdf/code "farma",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Danmarks farmaceutiski bibliotek in København"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/farma,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/farma,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Danmarks farmaceutiski bibliotek in København"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "farma",
   :skos/prefLabel "Oversigt over systematisk catalog",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def fcps
  "Published by Library and Archives Canada in Ottawa"
  {:db/ident :loc.classSchemes/fcps,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Class FC: a classification for Canadian history, Class PS8000: a classification for Canadian literature",
   :madsrdf/code "fcps",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Library and Archives Canada in Ottawa"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fcps,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fcps,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Library and Archives Canada in Ottawa"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "fcps",
   :skos/prefLabel
   "Class FC: a classification for Canadian history, Class PS8000: a classification for Canadian literature",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def fiaf
  "Published by International Federation of Film Archives in London"
  {:db/ident :loc.classSchemes/fiaf,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Moulds, Michael. Classification scheme for literature on film and television",
   :madsrdf/code "fiaf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by International Federation of Film Archives in London"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fiaf,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fiaf,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by International Federation of Film Archives in London"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "fiaf",
   :skos/prefLabel
   "Moulds, Michael. Classification scheme for literature on film and television",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def fid
  "Fachinformationsdienste für die Wissenschaft (FID)"
  {:db/ident :loc.classSchemes/fid,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Fachinformationsdienste für die Wissenschaft (FID)",
   :madsrdf/code "fid",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fid,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fid,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "fid",
   :skos/prefLabel "Fachinformationsdienste für die Wissenschaft (FID)",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def finagri
  "Published by Maatalouskirjasto - Agricultural Library in Helsinki"
  {:db/ident :loc.classSchemes/finagri,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Finagri-luokitus",
   :madsrdf/code "finagri",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Maatalouskirjasto - Agricultural Library in Helsinki"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/finagri,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/finagri,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Maatalouskirjasto - Agricultural Library in Helsinki"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "finagri",
   :skos/prefLabel "Finagri-luokitus",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def fivr
  "Published by Fachinformationsverbund Internationale Beziehungen und Länderkunde in Berlin"
  {:db/ident :loc.classSchemes/fivr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "FIV-Regionalklassifikation",
   :madsrdf/code "fivr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Fachinformationsverbund Internationale Beziehungen und Länderkunde in Berlin"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fivr,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fivr,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Fachinformationsverbund Internationale Beziehungen und Länderkunde in Berlin"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "fivr",
   :skos/prefLabel "FIV-Regionalklassifikation",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def fivs
  "Published by Fachinformationsverbund Internationale Beziehungen und Länderkunde in Berlin"
  {:db/ident :loc.classSchemes/fivs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "FIV-Sachklassifikation",
   :madsrdf/code "fivs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Fachinformationsverbund Internationale Beziehungen und Länderkunde in Berlin"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fivs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fivs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Fachinformationsverbund Internationale Beziehungen und Länderkunde in Berlin"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "fivs",
   :skos/prefLabel "FIV-Sachklassifikation",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def flarch
  "Published by Florida State Archives in Tallahassee, FL"
  {:db/ident :loc.classSchemes/flarch,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Florida State Archives arrangement and description procedures manual",
   :madsrdf/code "flarch",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Florida State Archives in Tallahassee, FL"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/flarch,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/flarch,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Florida State Archives in Tallahassee, FL"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "flarch",
   :skos/prefLabel
   "Florida State Archives arrangement and description procedures manual",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def fldocs
  "Published by Department of State, State Library in Tallahassee"
  {:db/ident :loc.classSchemes/fldocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "A Keyword-in-context to Florida public documents in the Florida Atlantic University Library",
   :madsrdf/code "fldocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Department of State, State Library in Tallahassee"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fldocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/fldocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Department of State, State Library in Tallahassee"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "fldocs",
   :skos/prefLabel
   "A Keyword-in-context to Florida public documents in the Florida Atlantic University Library",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def frtav
  "Published by Bibliothèque nationale de France in Paris"
  {:db/ident :loc.classSchemes/frtav,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Referentiel du format INTERMAC Bibliographique: Audiovisuel - Matière generale",
   :madsrdf/code "frtav",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bibliothèque nationale de France in Paris"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/frtav,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/frtav,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Bibliothèque nationale de France in Paris"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "frtav",
   :skos/prefLabel
   "Referentiel du format INTERMAC Bibliographique: Audiovisuel - Matière generale",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def gadocs
  "Published by University of Georgia Libraries, Government Documents Department in Athens, GA"
  {:db/ident :loc.classSchemes/gadocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Official publications of the State of Georgia: list of classes with index by name of agency and subject/keyword",
   :madsrdf/code "gadocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by University of Georgia Libraries, Government Documents Department in Athens, GA"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/gadocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/gadocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by University of Georgia Libraries, Government Documents Department in Athens, GA"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "gadocs",
   :skos/prefLabel
   "Official publications of the State of Georgia: list of classes with index by name of agency and subject/keyword",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def gccn
  "Published by Library and Archives Canada"
  {:db/ident :loc.classSchemes/gccn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Government of Canada catalogue number",
   :madsrdf/code "gccn",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Library and Archives Canada"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/gccn,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/gccn,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Library and Archives Canada"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "gccn",
   :skos/prefLabel "Government of Canada catalogue number",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def geothes
  "Published by Access Innovations, Inc. in Albuquerque, NM"
  {:db/ident :loc.classSchemes/geothes,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "GEOTHES geographical classification scheme",
   :madsrdf/code "geothes",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Access Innovations, Inc. in Albuquerque, NM"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/geothes,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/geothes,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Access Innovations, Inc. in Albuquerque, NM"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "geothes",
   :skos/prefLabel "GEOTHES geographical classification scheme",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def gestsk
  "Published by Kwei Li Press in Peking"
  {:db/ident :loc.classSchemes/gestsk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Title index to the catalogue of the Gest Oriental Library compiled by I.V. Gillis and Pai Ping-ch'i",
   :madsrdf/code "gestsk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Kwei Li Press in Peking"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/gestsk,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/gestsk,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kwei Li Press in Peking"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "gestsk",
   :skos/prefLabel
   "Title index to the catalogue of the Gest Oriental Library compiled by I.V. Gillis and Pai Ping-ch'i",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def gfdc
  "Published by IUFRO in Vienna"
  {:db/ident :loc.classSchemes/gfdc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Global forest decimal classification (GFDC)",
   :madsrdf/code "gfdc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by IUFRO in Vienna"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/gfdc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/gfdc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by IUFRO in Vienna"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "gfdc",
   :skos/prefLabel "Global forest decimal classification (GFDC)",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ghbs
  "GHB-Aufstellungssystematik: HBZ Köln"
  {:db/ident :loc.classSchemes/ghbs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "GHB-Aufstellungssystematik: HBZ Köln",
   :madsrdf/code "ghbs",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ghbs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ghbs,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ghbs",
   :skos/prefLabel "GHB-Aufstellungssystematik: HBZ Köln",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def iadocs
  "Published by State Library of Iowa in Des Moines"
  {:db/ident :loc.classSchemes/iadocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Classification of Iowa state documents",
   :madsrdf/code "iadocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by State Library of Iowa in Des Moines"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/iadocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/iadocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by State Library of Iowa in Des Moines"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "iadocs",
   :skos/prefLabel "Classification of Iowa state documents",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def iconclass
  "Iconclass"
  {:db/ident :loc.classSchemes/iconclass,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Iconclass",
   :madsrdf/code "iconclass",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/iconclass,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/iconclass,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "iconclass",
   :skos/prefLabel "Iconclass",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ics
  "Published by International Organization for Standardization"
  {:db/ident :loc.classSchemes/ics,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "International classification for standards",
   :madsrdf/code "ics",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by International Organization for Standardization"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ics,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ics,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by International Organization for Standardization"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ics",
   :skos/prefLabel "International classification for standards",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ifzs
  "Systematik der IfZ-Bibliothek"
  {:db/ident :loc.classSchemes/ifzs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Systematik der IfZ-Bibliothek",
   :madsrdf/code "ifzs",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ifzs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ifzs,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ifzs",
   :skos/prefLabel "Systematik der IfZ-Bibliothek",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def inspec
  "Published by INSPEC Inc. in Edison, NJ"
  {:db/ident :loc.classSchemes/inspec,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "INSPEC classification",
   :madsrdf/code "inspec",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by INSPEC Inc. in Edison, NJ"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/inspec,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/inspec,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by INSPEC Inc. in Edison, NJ"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "inspec",
   :skos/prefLabel "INSPEC classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ipc
  "International patent classification"
  {:db/ident :loc.classSchemes/ipc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "International patent classification",
   :madsrdf/code "ipc",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ipc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ipc,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ipc",
   :skos/prefLabel "International patent classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ivdcc
  "Published by intranda GmbH in Göttingen"
  {:db/ident :loc.classSchemes/ivdcc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "intranda viewer digital collection classification",
   :madsrdf/code "ivdcc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by intranda GmbH in Göttingen"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ivdcc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ivdcc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by intranda GmbH in Göttingen"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ivdcc",
   :skos/prefLabel "intranda viewer digital collection classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def jelc
  "Journal of Economic Literature (JEL) classification"
  {:db/ident :loc.classSchemes/jelc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Journal of Economic Literature (JEL) classification",
   :madsrdf/code "jelc",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/jelc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/jelc,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "jelc",
   :skos/prefLabel "Journal of Economic Literature (JEL) classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def jstormcs
  "JSTOR multidisciplinary classification scheme"
  {:db/ident :loc.classSchemes/jstormcs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "JSTOR multidisciplinary classification scheme",
   :madsrdf/code "jstormcs",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/jstormcs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/jstormcs,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "jstormcs",
   :skos/prefLabel "JSTOR multidisciplinary classification scheme",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def kab
  "Published by Bock und Herchen Verlag in Bad Honnef"
  {:db/ident :loc.classSchemes/kab,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Klassifikation für Allgemeinbibliotheken",
   :madsrdf/code "kab",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Bock und Herchen Verlag in Bad Honnef"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kab,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kab,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Bock und Herchen Verlag in Bad Honnef"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "kab",
   :skos/prefLabel "Klassifikation für Allgemeinbibliotheken",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def kfmod
  "Published by York University Law Library in Downsview, Ont."
  {:db/ident :loc.classSchemes/kfmod,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "KF classification, modified for use in Canadian law libraries",
   :madsrdf/code "kfmod",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by York University Law Library in Downsview, Ont."},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kfmod,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kfmod,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by York University Law Library in Downsview, Ont."},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "kfmod",
   :skos/prefLabel
   "KF classification, modified for use in Canadian law libraries",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def kktb
  "Published by National Diet Library in Tokyo"
  {:db/ident :loc.classSchemes/kktb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Kokuritsu kokkai toshokan bunruihyo = National Diet Library classification",
   :madsrdf/code "kktb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Diet Library in Tokyo"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kktb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kktb,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by National Diet Library in Tokyo"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "kktb",
   :skos/prefLabel
   "Kokuritsu kokkai toshokan bunruihyo = National Diet Library classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def knt
  "Published by Universitetsbiblioteke in Trondheim"
  {:db/ident :loc.classSchemes/knt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Klassifikasjonsnøkkel til norsk topografi",
   :madsrdf/code "knt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Universitetsbiblioteke in Trondheim"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/knt,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/knt,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Universitetsbiblioteke in Trondheim"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "knt",
   :skos/prefLabel "Klassifikasjonsnøkkel til norsk topografi",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ksdocs
  "Published by State Library of Kansas in Topeka"
  {:db/ident :loc.classSchemes/ksdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "State documents of Kansas: list of classes",
   :madsrdf/code "ksdocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by State Library of Kansas in Topeka"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ksdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ksdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by State Library of Kansas in Topeka"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ksdocs",
   :skos/prefLabel "State documents of Kansas: list of classes",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def kssb
  "Published by Bibliotekstjanst in Lund"
  {:db/ident :loc.classSchemes/kssb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Klassifikationssystem for svenska bibliotek",
   :madsrdf/code "kssb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by Bibliotekstjanst in Lund"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kssb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kssb,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Bibliotekstjanst in Lund"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "kssb",
   :skos/prefLabel "Klassifikationssystem for svenska bibliotek",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def kuvacs
  "Published by Kuvataideakatemian kirjasto in Helsinki"
  {:db/ident :loc.classSchemes/kuvacs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Kuvataideakatemian kirjaston luokitusjärjestelmä = Finnish Academy of Fine Arts Library Classification = Bildkonstakademins biblioteks klassifikationssystem",
   :madsrdf/code "kuvacs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Kuvataideakatemian kirjasto in Helsinki"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kuvacs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/kuvacs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Kuvataideakatemian kirjasto in Helsinki"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "kuvacs",
   :skos/prefLabel
   "Kuvataideakatemian kirjaston luokitusjärjestelmä = Finnish Academy of Fine Arts Library Classification = Bildkonstakademins biblioteks klassifikationssystem",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def laclaw
  "Published by County Law Library In Los Angeles"
  {:db/ident :loc.classSchemes/laclaw,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Los Angeles County Law Library, class K-Law",
   :madsrdf/code "laclaw",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by County Law Library In Los Angeles"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/laclaw,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/laclaw,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by County Law Library In Los Angeles"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "laclaw",
   :skos/prefLabel "Los Angeles County Law Library, class K-Law",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ladocs
  "Published by Louisiana State Library in Baton Rouge"
  {:db/ident :loc.classSchemes/ladocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Louisiana documents classification schedule",
   :madsrdf/code "ladocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Louisiana State Library in Baton Rouge"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ladocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ladocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Louisiana State Library in Baton Rouge"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ladocs",
   :skos/prefLabel "Louisiana documents classification schedule",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def lcc
  "Published by Library of Congress, CDS in Washington, D.C."
  {:db/ident :loc.classSchemes/lcc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Library of Congress classification",
   :madsrdf/code "lcc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Library of Congress, CDS in Washington, D.C."},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/lcc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/lcc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Library of Congress, CDS in Washington, D.C."},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "lcc",
   :skos/prefLabel "Library of Congress classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def lndn
  "League of Nations document numbers"
  {:db/ident :loc.classSchemes/lndn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "League of Nations document numbers",
   :madsrdf/code "lndn",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/lndn,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/lndn,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "lndn",
   :skos/prefLabel "League of Nations document numbers",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def loovs
  "Published by Kungliga biblioteket in Stockholm"
  {:db/ident :loc.classSchemes/loovs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Løøvs klassifikationssystem",
   :madsrdf/code "loovs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Kungliga biblioteket in Stockholm"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/loovs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/loovs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Kungliga biblioteket in Stockholm"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "loovs",
   :skos/prefLabel "Løøvs klassifikationssystem",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def methepp
  "Methode Eppelsheimer"
  {:db/ident :loc.classSchemes/methepp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Methode Eppelsheimer",
   :madsrdf/code "methepp",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/methepp,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/methepp,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "methepp",
   :skos/prefLabel "Methode Eppelsheimer",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def mf-klass
  "Klassifikasjonssystemet ved Menighetsfakultetes bibliotek"
  {:db/ident :loc.classSchemes/mf-klass,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Klassifikasjonssystemet ved Menighetsfakultetes bibliotek",
   :madsrdf/code "mf-klass",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mf-klass,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mf-klass,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "mf-klass",
   :skos/prefLabel "Klassifikasjonssystemet ved Menighetsfakultetes bibliotek",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def midocs
  "Published by Michigan Dept. of Education, State Library Services in Lansing"
  {:db/ident :loc.classSchemes/midocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Michigan documents classification scheme",
   :madsrdf/code "midocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Michigan Dept. of Education, State Library Services in Lansing"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/midocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/midocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Michigan Dept. of Education, State Library Services in Lansing"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "midocs",
   :skos/prefLabel "Michigan documents classification scheme",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def misklass
  "Published by Klassifikasjonsskjema in Stavenger"
  {:db/ident :loc.classSchemes/misklass,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Klassifikasjonsskjema",
   :madsrdf/code "misklass",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Klassifikasjonsskjema in Stavenger"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/misklass,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/misklass,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Klassifikasjonsskjema in Stavenger"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "misklass",
   :skos/prefLabel "Klassifikasjonsskjema",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def mmlcc
  "Published by Ministry of Defence in London"
  {:db/ident :loc.classSchemes/mmlcc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Manual of map library classification and cataloguing",
   :madsrdf/code "mmlcc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Ministry of Defence in London"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mmlcc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mmlcc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Ministry of Defence in London"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "mmlcc",
   :skos/prefLabel "Manual of map library classification and cataloguing",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def modocs
  "Published by Missouri State Library in Jefferson City"
  {:db/ident :loc.classSchemes/modocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Missouri state documents classification: post-reorganization agency codes and form divisions",
   :madsrdf/code "modocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Missouri State Library in Jefferson City"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/modocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/modocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Missouri State Library in Jefferson City"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "modocs",
   :skos/prefLabel
   "Missouri state documents classification: post-reorganization agency codes and form divisions",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def moys
  "Published by Bowker-Saur in London"
  {:db/ident :loc.classSchemes/moys,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Moys, Elizabeth M. Moys classification and thesaurus for legal materials",
   :madsrdf/code "moys",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Bowker-Saur in London"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/moys,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/moys,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Bowker-Saur in London"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "moys",
   :skos/prefLabel
   "Moys, Elizabeth M. Moys classification and thesaurus for legal materials",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def mpilcs
  "Published bu Max Planck Institute Luxembourg"
  {:db/ident :loc.classSchemes/mpilcs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "MPI Luxembourg classification system",
   :madsrdf/code "mpilcs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published bu Max Planck Institute Luxembourg"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mpilcs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mpilcs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published bu Max Planck Institute Luxembourg"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "mpilcs",
   :skos/prefLabel "MPI Luxembourg classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def mpkkl
  "Maanpuolustuskorkeakoulun kirjaston luokitusjärjestelmä"
  {:db/ident :loc.classSchemes/mpkkl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Maanpuolustuskorkeakoulun kirjaston luokitusjärjestelmä",
   :madsrdf/code "mpkkl",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mpkkl,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mpkkl,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "mpkkl",
   :skos/prefLabel "Maanpuolustuskorkeakoulun kirjaston luokitusjärjestelmä",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def msc
  "Published by American Mathematical Society in Providence, RI"
  {:db/ident :loc.classSchemes/msc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Mathematical subject classification",
   :madsrdf/code "msc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by American Mathematical Society in Providence, RI"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/msc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/msc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by American Mathematical Society in Providence, RI"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "msc",
   :skos/prefLabel "Mathematical subject classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def msdocs
  "Published by Mississippi Library Commission in Jackson"
  {:db/ident :loc.classSchemes/msdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Mississippi state government publications. Vol. 1, July 1975/June 1980",
   :madsrdf/code "msdocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Mississippi Library Commission in Jackson"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/msdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/msdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Mississippi Library Commission in Jackson"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "msdocs",
   :skos/prefLabel
   "Mississippi state government publications. Vol. 1, July 1975/June 1980",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def mu
  "Published by Biblioteca Nacional de España in Madrid"
  {:db/ident :loc.classSchemes/mu,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Clasificación musical de la Bibliografía Nacional de España",
   :madsrdf/code "mu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Biblioteca Nacional de España in Madrid"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mu,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/mu,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Biblioteca Nacional de España in Madrid"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "mu",
   :skos/prefLabel
   "Clasificación musical de la Bibliografía Nacional de España",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def naics
  "Published by North American industry classification system in Washington, DC"
  {:db/ident :loc.classSchemes/naics,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "North American industry classification system",
   :madsrdf/code "naics",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by North American industry classification system in Washington, DC"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/naics,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/naics,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by North American industry classification system in Washington, DC"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "naics",
   :skos/prefLabel "North American industry classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def nasasscg
  "Published by NASA, Scientific and Technical Information Program in Hanover, MD"
  {:db/ident :loc.classSchemes/nasasscg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "NASA scope and subject category guide",
   :madsrdf/code "nasasscg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by NASA, Scientific and Technical Information Program in Hanover, MD"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nasasscg,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nasasscg,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by NASA, Scientific and Technical Information Program in Hanover, MD"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "nasasscg",
   :skos/prefLabel "NASA scope and subject category guide",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def nbdocs
  "Published by Nebraska Publications Clearinghouse, Nebraska Library Commission in Lincoln"
  {:db/ident :loc.classSchemes/nbdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Guide to Nebraska state agencies: state publications classification and ordering directory",
   :madsrdf/code "nbdocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Nebraska Publications Clearinghouse, Nebraska Library Commission in Lincoln"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nbdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nbdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Nebraska Publications Clearinghouse, Nebraska Library Commission in Lincoln"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "nbdocs",
   :skos/prefLabel
   "Guide to Nebraska state agencies: state publications classification and ordering directory",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ncdocs
  "Published by The State Library in Raleigh"
  {:db/ident :loc.classSchemes/ncdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Classification scheme for North Carolina state publications: as applied to the documents collection of the N.C. Dept. of Cultural Resources",
   :madsrdf/code "ncdocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by The State Library in Raleigh"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ncdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ncdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by The State Library in Raleigh"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ncdocs",
   :skos/prefLabel
   "Classification scheme for North Carolina state publications: as applied to the documents collection of the N.C. Dept. of Cultural Resources",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ncsclt
  "Published by National Central Library in Taipei"
  {:db/ident :loc.classSchemes/ncsclt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "New classification scheme for Chinese libraries",
   :madsrdf/code "ncsclt",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by National Central Library in Taipei"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ncsclt,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ncsclt,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by National Central Library in Taipei"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ncsclt",
   :skos/prefLabel "New classification scheme for Chinese libraries",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def nhcp
  "Published by Art Libraries Society of North America in Ottowa, ON"
  {:db/ident :loc.classSchemes/nhcp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "NH classification for photography",
   :madsrdf/code "nhcp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Art Libraries Society of North America in Ottowa, ON"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nhcp,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nhcp,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Art Libraries Society of North America in Ottowa, ON"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "nhcp",
   :skos/prefLabel "NH classification for photography",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def nicem
  "Published by National Information Center for Educational Media in Albuquerque, NM"
  {:db/ident :loc.classSchemes/nicem,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "NICEM subject headings and classification system",
   :madsrdf/code "nicem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by National Information Center for Educational Media in Albuquerque, NM"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nicem,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nicem,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by National Information Center for Educational Media in Albuquerque, NM"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "nicem",
   :skos/prefLabel "NICEM subject headings and classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def niv
  "Published by Universitets- og høgskolerådet in Norway"
  {:db/ident :loc.classSchemes/niv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Norsk inndeling av vitenskapsdisipliner",
   :madsrdf/code "niv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Universitets- og høgskolerådet in Norway"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/niv,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/niv,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Universitets- og høgskolerådet in Norway"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "niv",
   :skos/prefLabel "Norsk inndeling av vitenskapsdisipliner",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def njb
  "Published by Nihon Toshokan Kyōkai in Tōkyō"
  {:db/ident :loc.classSchemes/njb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Nihon jisshin bunruihō = Nippon decimal classification",
   :madsrdf/code "njb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Nihon Toshokan Kyōkai in Tōkyō"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/njb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/njb,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Nihon Toshokan Kyōkai in Tōkyō"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "njb",
   :skos/prefLabel "Nihon jisshin bunruihō = Nippon decimal classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def nlm
  "Published by NLM in Bathesda, MD"
  {:db/ident :loc.classSchemes/nlm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "National Library of Medicine classification",
   :madsrdf/code "nlm",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by NLM in Bathesda, MD"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nlm,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nlm,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by NLM in Bathesda, MD"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "nlm",
   :skos/prefLabel "National Library of Medicine classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def nmdocs
  "Published by New Mexico State Library in Santa Fe"
  {:db/ident :loc.classSchemes/nmdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "New Mexico state documents classification system",
   :madsrdf/code "nmdocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by New Mexico State Library in Santa Fe"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nmdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nmdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by New Mexico State Library in Santa Fe"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "nmdocs",
   :skos/prefLabel "New Mexico state documents classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def no-ujur-cmr
  "Published by Norwegian Center for Human Rights, University of Oslo"
  {:db/ident :loc.classSchemes/no-ujur-cmr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Menneskerettighets-klassifikasjon",
   :madsrdf/code "no-ujur-cmr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Norwegian Center for Human Rights, University of Oslo"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ujur-cmr,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ujur-cmr,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Norwegian Center for Human Rights, University of Oslo"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "no-ujur-cmr",
   :skos/prefLabel "Menneskerettighets-klassifikasjon",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def no-ujur-cnip
  "NifsP-klassifikasjon"
  {:db/ident :loc.classSchemes/no-ujur-cnip,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "NifsP-klassifikasjon",
   :madsrdf/code "no-ujur-cnip",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ujur-cnip,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ujur-cnip,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "no-ujur-cnip",
   :skos/prefLabel "NifsP-klassifikasjon",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def no-ureal-ca
  "Astrofysikk"
  {:db/ident :loc.classSchemes/no-ureal-ca,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Astrofysikk",
   :madsrdf/code "no-ureal-ca",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ureal-ca,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ureal-ca,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "no-ureal-ca",
   :skos/prefLabel "Astrofysikk",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def no-ureal-cb
  "Biologisk hylleoppstilling"
  {:db/ident :loc.classSchemes/no-ureal-cb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Biologisk hylleoppstilling",
   :madsrdf/code "no-ureal-cb",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ureal-cb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ureal-cb,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "no-ureal-cb",
   :skos/prefLabel "Biologisk hylleoppstilling",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def no-ureal-cg
  "Geofysikk oppstillingssystem"
  {:db/ident :loc.classSchemes/no-ureal-cg,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Geofysikk oppstillingssystem",
   :madsrdf/code "no-ureal-cg",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ureal-cg,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/no-ureal-cg,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "no-ureal-cg",
   :skos/prefLabel "Geofysikk oppstillingssystem",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def noterlyd
  "Published by Norges musikkhgskole Biblioteket"
  {:db/ident :loc.classSchemes/noterlyd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Klassifikasjonssystem for noter og lydopptak = Music classification system (Sheet music and recordings)",
   :madsrdf/code "noterlyd",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Norges musikkhgskole Biblioteket"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/noterlyd,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/noterlyd,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Norges musikkhgskole Biblioteket"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "noterlyd",
   :skos/prefLabel
   "Klassifikasjonssystem for noter og lydopptak = Music classification system (Sheet music and recordings)",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def nvdocs
  "Published by Nevada State Library and Archives in Carson City"
  {:db/ident :loc.classSchemes/nvdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Nevada state documents",
   :madsrdf/code "nvdocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Nevada State Library and Archives in Carson City"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nvdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nvdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Nevada State Library and Archives in Carson City"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "nvdocs",
   :skos/prefLabel "Nevada state documents",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def nwbib
  "Published by hbz - Hochschulbibliothekszentrum NRW in Köln"
  {:db/ident :loc.classSchemes/nwbib,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Nordrhein-Westfälische Bibliographie",
   :madsrdf/code "nwbib",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by hbz - Hochschulbibliothekszentrum NRW in Köln"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nwbib,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nwbib,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by hbz - Hochschulbibliothekszentrum NRW in Köln"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "nwbib",
   :skos/prefLabel "Nordrhein-Westfälische Bibliographie",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def nydocs
  "Published by New York State Library in Albany"
  {:db/ident :loc.classSchemes/nydocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "New York state documents: an introductory manual",
   :madsrdf/code "nydocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by New York State Library in Albany"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nydocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/nydocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by New York State Library in Albany"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "nydocs",
   :skos/prefLabel "New York state documents: an introductory manual",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ohdocs
  "Published by State Library of Ohio in Columbus"
  {:db/ident :loc.classSchemes/ohdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Ohio documents classification scheme",
   :madsrdf/code "ohdocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by State Library of Ohio in Columbus"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ohdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ohdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by State Library of Ohio in Columbus"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ohdocs",
   :skos/prefLabel "Ohio documents classification scheme",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def okdocs
  "Published by Oklahoma Dept. of Libraries in Oklahoma City"
  {:db/ident :loc.classSchemes/okdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Oklahoma state documents classification and list of Oklahoma state agencies from statehood to the present",
   :madsrdf/code "okdocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Oklahoma Dept. of Libraries in Oklahoma City"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/okdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/okdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Oklahoma Dept. of Libraries in Oklahoma City"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "okdocs",
   :skos/prefLabel
   "Oklahoma state documents classification and list of Oklahoma state agencies from statehood to the present",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def oosk
  "Published by Universitetsbiblioteket i Bergen in Norway"
  {:db/ident :loc.classSchemes/oosk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Oversikt over systematisk katalog",
   :madsrdf/code "oosk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Universitetsbiblioteket i Bergen in Norway"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/oosk,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/oosk,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Universitetsbiblioteket i Bergen in Norway"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "oosk",
   :skos/prefLabel "Oversikt over systematisk katalog",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ordocs
  "Published by Oregon State Library in Salem"
  {:db/ident :loc.classSchemes/ordocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "OrDocs: history authority list and classification scheme for Oregon state agencies",
   :madsrdf/code "ordocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Oregon State Library in Salem"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ordocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ordocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Oregon State Library in Salem"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ordocs",
   :skos/prefLabel
   "OrDocs: history authority list and classification scheme for Oregon state agencies",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def padocs
  "Published by State Library of Pennsylvania in Harrisburg"
  {:db/ident :loc.classSchemes/padocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Classification scheme for Pennsylvania state publications",
   :madsrdf/code "padocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by State Library of Pennsylvania in Harrisburg"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/padocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/padocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by State Library of Pennsylvania in Harrisburg"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "padocs",
   :skos/prefLabel "Classification scheme for Pennsylvania state publications",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def pcesm
  "Published by Bibliothèque et Archives nationales du Québec in Montréal"
  {:db/ident :loc.classSchemes/pcesm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Plan de classement des enregistrements sonores musicaux",
   :madsrdf/code "pcesm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque et Archives nationales du Québec in Montréal"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pcesm,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pcesm,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque et Archives nationales du Québec in Montréal"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "pcesm",
   :skos/prefLabel "Plan de classement des enregistrements sonores musicaux",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def pcev
  "Published by Bibliothèque et Archives nationales du Québec in Montréal"
  {:db/ident :loc.classSchemes/pcev,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Plan de classement des enregistrements vidéo musicaux",
   :madsrdf/code "pcev",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque et Archives nationales du Québec in Montréal"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pcev,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pcev,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque et Archives nationales du Québec in Montréal"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "pcev",
   :skos/prefLabel "Plan de classement des enregistrements vidéo musicaux",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def pcjv
  "Published by Bibliothèque et Archives nationales du Québec in Montréal"
  {:db/ident :loc.classSchemes/pcjv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Plan de classement des jeux vidéo",
   :madsrdf/code "pcjv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque et Archives nationales du Québec in Montréal"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pcjv,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pcjv,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Bibliothèque et Archives nationales du Québec in Montréal"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "pcjv",
   :skos/prefLabel "Plan de classement des jeux vidéo",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def pim
  "Published by NBD Biblion in Zoetermeer"
  {:db/ident :loc.classSchemes/pim,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "PIM [Presentatiesysteem Informatieve Media]",
   :madsrdf/code "pim",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by NBD Biblion in Zoetermeer"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pim,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pim,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by NBD Biblion in Zoetermeer"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "pim",
   :skos/prefLabel "PIM [Presentatiesysteem Informatieve Media]",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def pssppbkj
  "Published by Nacionalna i Sveucilisna Biblioteka in Zagreb"
  {:db/ident :loc.classSchemes/pssppbkj,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Popis strucnih skupina i svih podskupina s podacima o broju kataloskih jedinica",
   :madsrdf/code "pssppbkj",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Nacionalna i Sveucilisna Biblioteka in Zagreb"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pssppbkj,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/pssppbkj,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Nacionalna i Sveucilisna Biblioteka in Zagreb"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "pssppbkj",
   :skos/prefLabel
   "Popis strucnih skupina i svih podskupina s podacima o broju kataloskih jedinica",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rich
  "Published by F S. Cook & Son in Yardley, Pa."
  {:db/ident :loc.classSchemes/rich,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Richardson classification system",
   :madsrdf/code "rich",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by F S. Cook & Son in Yardley, Pa."},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rich,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rich,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by F S. Cook & Son in Yardley, Pa."},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rich",
   :skos/prefLabel "Richardson classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ridocs
  "Published by Rhode Island State Library in Providence"
  {:db/ident :loc.classSchemes/ridocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Alphabetical list of state agencies and corresponding Swank classification",
   :madsrdf/code "ridocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Rhode Island State Library in Providence"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ridocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ridocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Rhode Island State Library in Providence"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ridocs",
   :skos/prefLabel
   "Alphabetical list of state agencies and corresponding Swank classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rilm
  "RILM classification system"
  {:db/ident :loc.classSchemes/rilm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "RILM classification system",
   :madsrdf/code "rilm",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rilm,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rilm,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rilm",
   :skos/prefLabel "RILM classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def roy
  "Published by Université de Montréal in Montréal"
  {:db/ident :loc.classSchemes/roy,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Classification Roy",
   :madsrdf/code "roy",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Université de Montréal in Montréal"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/roy,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/roy,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Université de Montréal in Montréal"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "roy",
   :skos/prefLabel "Classification Roy",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rpb
  "Rheinland-Pfälzische Bibliographie"
  {:db/ident :loc.classSchemes/rpb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Rheinland-Pfälzische Bibliographie",
   :madsrdf/code "rpb",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rpb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rpb,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rpb",
   :skos/prefLabel "Rheinland-Pfälzische Bibliographie",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rswk
  "Published by Deutsches Bibliotheksinstitut in Berlin"
  {:db/ident :loc.classSchemes/rswk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Regeln für den Schlagwortkatalog",
   :madsrdf/code "rswk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Deutsches Bibliotheksinstitut in Berlin"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rswk,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rswk,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Deutsches Bibliotheksinstitut in Berlin"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rswk",
   :skos/prefLabel "Regeln für den Schlagwortkatalog",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rubbk
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rubbk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà nauchnykh bibliotek v 30-ti tomakh",
   :madsrdf/code "rubbk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbk,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbk,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rubbk",
   :skos/prefLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà nauchnykh bibliotek v 30-ti tomakh",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rubbkd
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rubbkd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà detskikh bibliotek v 1 t.",
   :madsrdf/code "rubbkd",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkd,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkd,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rubbkd",
   :skos/prefLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà detskikh bibliotek v 1 t.",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rubbkk
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rubbkk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà kraevedcheskikh katalogov bibliotek",
   :madsrdf/code "rubbkk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkk,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkk,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rubbkk",
   :skos/prefLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà kraevedcheskikh katalogov bibliotek",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rubbkm
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rubbkm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà massovykh bibliotek v 1. t.",
   :madsrdf/code "rubbkm",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkm,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkm,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rubbkm",
   :skos/prefLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà massovykh bibliotek v 1. t.",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rubbkmv
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rubbkmv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà massovykh voennykh bibliotek",
   :madsrdf/code "rubbkmv",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkmv,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkmv,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rubbkmv",
   :skos/prefLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà massovykh voennykh bibliotek",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rubbkn
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rubbkn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà nauchnykh bibliotek v 4-kh tomakh",
   :madsrdf/code "rubbkn",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkn,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbkn,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rubbkn",
   :skos/prefLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà nauchnykh bibliotek v 4-kh tomakh",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rubbknp
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rubbknp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Pereizdanidiíà tablits bibliotechno-bibliograficheskoi klassifikatsii dlíà nauchnykh bibliotek v 30-ti tomakh",
   :madsrdf/code "rubbknp",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbknp,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbknp,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rubbknp",
   :skos/prefLabel
   "Pereizdanidiíà tablits bibliotechno-bibliograficheskoi klassifikatsii dlíà nauchnykh bibliotek v 30-ti tomakh",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rubbko
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rubbko,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà oblastvykh bibliotek v 4-kh tomakh",
   :madsrdf/code "rubbko",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbko,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbko,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rubbko",
   :skos/prefLabel
   "Tablitsy bibliotechno-bibliograficheskoi klassifikatsii dlíà oblastvykh bibliotek v 4-kh tomakh",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rubbks
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rubbks,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Bibliotechno-bibliograficheskaíà klassifikatsiíàe: Srednye tablitsy",
   :madsrdf/code "rubbks",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbks,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rubbks,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rubbks",
   :skos/prefLabel
   "Bibliotechno-bibliograficheskaíà klassifikatsiíàe: Srednye tablitsy",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rueskl
  "Published by Kniga in Movska"
  {:db/ident :loc.classSchemes/rueskl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Edinaíà skhema klassifikatsii literatury dlíà knigoizdaniíà v SSSR",
   :madsrdf/code "rueskl",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by Kniga in Movska"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rueskl,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rueskl,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Kniga in Movska"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rueskl",
   :skos/prefLabel
   "Edinaíà skhema klassifikatsii literatury dlíà knigoizdaniíà v SSSR",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rugasnti
  "Published by Vsesoíàznyi institut nauchnoi i tekhnicheskoi informatsii in Moskva"
  {:db/ident :loc.classSchemes/rugasnti,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Rubrikator Gosudarstvennoi avtomatizirovannoi sistemy nauchno-tekhnicheskoi informatsii",
   :madsrdf/code "rugasnti",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Vsesoíàznyi institut nauchnoi i tekhnicheskoi informatsii in Moskva"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rugasnti,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rugasnti,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Vsesoíàznyi institut nauchnoi i tekhnicheskoi informatsii in Moskva"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rugasnti",
   :skos/prefLabel
   "Rubrikator Gosudarstvennoi avtomatizirovannoi sistemy nauchno-tekhnicheskoi informatsii",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def rvk
  "Regensburger Verbundklassifikation (RVK)"
  {:db/ident :loc.classSchemes/rvk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Regensburger Verbundklassifikation (RVK)",
   :madsrdf/code "rvk",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rvk,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/rvk,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "rvk",
   :skos/prefLabel "Regensburger Verbundklassifikation (RVK)",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def sbb
  "Systematik der Bayerischen Bibliographie"
  {:db/ident :loc.classSchemes/sbb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Systematik der Bayerischen Bibliographie",
   :madsrdf/code "sbb",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sbb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sbb,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "sbb",
   :skos/prefLabel "Systematik der Bayerischen Bibliographie",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def scdocs
  "Published by State Library in Columbia"
  {:db/ident :loc.classSchemes/scdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "South Carolina state documents classification system",
   :madsrdf/code "scdocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by State Library in Columbia"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/scdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/scdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by State Library in Columbia"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "scdocs",
   :skos/prefLabel "South Carolina state documents classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def scia
  "Published by Centro nazionale di documentazione e analisi per l'infanzia e l'adolescenza"
  {:db/ident :loc.classSchemes/scia,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Schema di classificazione infanzia e adolescenza",
   :madsrdf/code "scia",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Centro nazionale di documentazione e analisi per l'infanzia e l'adolescenza"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/scia,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/scia,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Centro nazionale di documentazione e analisi per l'infanzia e l'adolescenza"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "scia",
   :skos/prefLabel "Schema di classificazione infanzia e adolescenza",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def sddocs
  "Published by South Dakota State Library in Pierre"
  {:db/ident :loc.classSchemes/sddocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "[South Dakota] State documents classification schedule",
   :madsrdf/code "sddocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by South Dakota State Library in Pierre"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sddocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sddocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by South Dakota State Library in Pierre"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "sddocs",
   :skos/prefLabel "[South Dakota] State documents classification schedule",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def sdnb
  "Systematik der Deutschen Nationalbibliographie"
  {:db/ident :loc.classSchemes/sdnb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Systematik der Deutschen Nationalbibliographie",
   :madsrdf/code "sdnb",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sdnb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sdnb,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "sdnb",
   :skos/prefLabel "Systematik der Deutschen Nationalbibliographie",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def sfb
  "Published by K.G. Saur in München"
  {:db/ident :loc.classSchemes/sfb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "SfB: Systematik für Bibliotheken",
   :madsrdf/code "sfb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by K.G. Saur in München"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sfb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sfb,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by K.G. Saur in München"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "sfb",
   :skos/prefLabel "SfB: Systematik für Bibliotheken",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def siblcs
  "Sibelius-Akatemian kirjaston luokitusjärjestelmä - kirjojen luokitus; Sibelius-Akatemian nuottien luokitus"
  {:db/ident :loc.classSchemes/siblcs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Sibelius-Akatemian kirjaston luokitusjärjestelmä - kirjojen luokitus; Sibelius-Akatemian nuottien luokitus",
   :madsrdf/code "siblcs",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/siblcs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/siblcs,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "siblcs",
   :skos/prefLabel
   "Sibelius-Akatemian kirjaston luokitusjärjestelmä - kirjojen luokitus; Sibelius-Akatemian nuottien luokitus",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def siso
  "Published by NBD Biblion in Zoetermeer"
  {:db/ident :loc.classSchemes/siso,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Schema voor de Indeling van de Systematische Catalogus in Openbare Bibliotheken",
   :madsrdf/code "siso",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by NBD Biblion in Zoetermeer"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/siso,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/siso,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by NBD Biblion in Zoetermeer"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "siso",
   :skos/prefLabel
   "Schema voor de Indeling van de Systematische Catalogus in Openbare Bibliotheken",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def skb
  "Published by St. Michaelsbund in München"
  {:db/ident :loc.classSchemes/skb,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Sachbuch-Systematik für Katholische öffentliche Büchereien",
   :madsrdf/code "skb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by St. Michaelsbund in München"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/skb,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/skb,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by St. Michaelsbund in München"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "skb",
   :skos/prefLabel "Sachbuch-Systematik für Katholische öffentliche Büchereien",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def smm
  "Published by Universitetetsbiblioteket i Bergen in Bergen"
  {:db/ident :loc.classSchemes/smm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Systematik des Musikschrifttums u.d. Musikalien fr ffentl. Musikbibliotheken SMM",
   :madsrdf/code "smm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Universitetetsbiblioteket i Bergen in Bergen"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/smm,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/smm,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Universitetetsbiblioteket i Bergen in Bergen"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "smm",
   :skos/prefLabel
   "Systematik des Musikschrifttums u.d. Musikalien fr ffentl. Musikbibliotheken SMM",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def srnlc
  "Taideyliopiston kirjaston Sörnäisten kampuksen luokitus = University of Arts Helsinki Library Sörnäinen Campus Classification"
  {:db/ident :loc.classSchemes/srnlc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Taideyliopiston kirjaston Sörnäisten kampuksen luokitus = University of Arts Helsinki Library Sörnäinen Campus Classification",
   :madsrdf/code "srnlc",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/srnlc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/srnlc,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "srnlc",
   :skos/prefLabel
   "Taideyliopiston kirjaston Sörnäisten kampuksen luokitus = University of Arts Helsinki Library Sörnäinen Campus Classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ssd
  "Published by Verlag Buch und Bibliothek in Reutlingen"
  {:db/ident :loc.classSchemes/ssd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Systematik: Stadtbücherei Duisburg: Buchaufstellung und Ordnung des systematischen Kataloges",
   :madsrdf/code "ssd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Verlag Buch und Bibliothek in Reutlingen"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ssd,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ssd,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by Verlag Buch und Bibliothek in Reutlingen"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ssd",
   :skos/prefLabel
   "Systematik: Stadtbücherei Duisburg: Buchaufstellung und Ordnung des systematischen Kataloges",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ssgn
  "Sondersammelgebiets-Nummer"
  {:db/ident :loc.classSchemes/ssgn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Sondersammelgebiets-Nummer",
   :madsrdf/code "ssgn",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ssgn,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ssgn,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ssgn",
   :skos/prefLabel "Sondersammelgebiets-Nummer",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def stub
  "Systematik der TUB München"
  {:db/ident :loc.classSchemes/stub,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Systematik der TUB München",
   :madsrdf/code "stub",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/stub,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/stub,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "stub",
   :skos/prefLabel "Systematik der TUB München",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def suaslc
  "Published by Seinäjoen korkeakoulukirjaston luokitus in Seinäjoki"
  {:db/ident :loc.classSchemes/suaslc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Seinäjoen korkeakoulukirjaston luokitus",
   :madsrdf/code "suaslc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Seinäjoen korkeakoulukirjaston luokitus in Seinäjoki"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/suaslc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/suaslc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Seinäjoen korkeakoulukirjaston luokitus in Seinäjoki"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "suaslc",
   :skos/prefLabel "Seinäjoen korkeakoulukirjaston luokitus",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def sudocs
  "Published by Government Printing Office in Washington, D.C."
  {:db/ident :loc.classSchemes/sudocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Superintendent of Documents classification system",
   :madsrdf/code "sudocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Published by Government Printing Office in Washington, D.C."},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sudocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/sudocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Published by Government Printing Office in Washington, D.C."},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "sudocs",
   :skos/prefLabel "Superintendent of Documents classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def swank
  "Published by University of Colorado Library in Boulder, CO"
  {:db/ident :loc.classSchemes/swank,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Swank, Raynard Coe. A classification for state, county, and municipal documents",
   :madsrdf/code "swank",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by University of Colorado Library in Boulder, CO"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/swank,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/swank,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by University of Colorado Library in Boulder, CO"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "swank",
   :skos/prefLabel
   "Swank, Raynard Coe. A classification for state, county, and municipal documents",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def taikclas
  "Taideteollisen korkeakoulun kirjaston luokitus = University of Art and Design Helsinki Library Classification"
  {:db/ident :loc.classSchemes/taikclas,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Taideteollisen korkeakoulun kirjaston luokitus = University of Art and Design Helsinki Library Classification",
   :madsrdf/code "taikclas",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/taikclas,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/taikclas,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "taikclas",
   :skos/prefLabel
   "Taideteollisen korkeakoulun kirjaston luokitus = University of Art and Design Helsinki Library Classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def taykl
  "Published by Tampereen yliopisto in Tampere"
  {:db/ident :loc.classSchemes/taykl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Tampereen yliopiston kirjaston luokitus: Systemaattinen osa & Aakkosellinen osa",
   :madsrdf/code "taykl",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Tampereen yliopisto in Tampere"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/taykl,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/taykl,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "Published by Tampereen yliopisto in Tampere"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "taykl",
   :skos/prefLabel
   "Tampereen yliopiston kirjaston luokitus: Systemaattinen osa & Aakkosellinen osa",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def teatkl
  "Teatterikorkeakoulun kirjaston luokitusopas = Theatre Academy classification guide = Teatterikorkeakoulun luokitusopas"
  {:db/ident :loc.classSchemes/teatkl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Teatterikorkeakoulun kirjaston luokitusopas = Theatre Academy classification guide = Teatterikorkeakoulun luokitusopas",
   :madsrdf/code "teatkl",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/teatkl,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/teatkl,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "teatkl",
   :skos/prefLabel
   "Teatterikorkeakoulun kirjaston luokitusopas = Theatre Academy classification guide = Teatterikorkeakoulun luokitusopas",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def txdocs
  "Published by Legislative Reference Library & Government Publications Library, Texas State Library in Austin"
  {:db/ident :loc.classSchemes/txdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Texas state documents classification & almost compleat [sic] list of Texas state agencies from statehood to the present",
   :madsrdf/code "txdocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Legislative Reference Library & Government Publications Library, Texas State Library in Austin"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/txdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/txdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Legislative Reference Library & Government Publications Library, Texas State Library in Austin"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "txdocs",
   :skos/prefLabel
   "Texas state documents classification & almost compleat [sic] list of Texas state agencies from statehood to the present",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def tykoma
  "Turun yliopiston kirjaston vanha luokitus"
  {:db/ident :loc.classSchemes/tykoma,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Turun yliopiston kirjaston vanha luokitus",
   :madsrdf/code "tykoma",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/tykoma,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/tykoma,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "tykoma",
   :skos/prefLabel "Turun yliopiston kirjaston vanha luokitus",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def udc
  "Published by British Standards Institution in London"
  {:db/ident :loc.classSchemes/udc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Universal decimal classification",
   :madsrdf/code "udc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by British Standards Institution in London"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/udc,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/udc,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by British Standards Institution in London"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "udc",
   :skos/prefLabel "Universal decimal classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def uef
  "Published by Itä-Suomen yliopisto in Joensuu, Kuopi & Savonlinnassa"
  {:db/ident :loc.classSchemes/uef,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-04-26T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-04-26T00:00:00/dlc",
     :ri/recordStatus "deprecated"}],
   :madsrdf/authoritativeLabel
   "Itä-Suomen yliopiston kokoelmaluokitus = Collection classification of The University of Eastern Finland",
   :madsrdf/code "uef",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Itä-Suomen yliopisto in Joensuu, Kuopi & Savonlinnassa"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/uef,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "deprecated",
     :cs/createdDate
     "\"2022-04-26T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-04-26T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/uef,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Itä-Suomen yliopisto in Joensuu, Kuopi & Savonlinnassa"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "uef",
   :skos/prefLabel
   "Itä-Suomen yliopiston kokoelmaluokitus = Collection classification of The University of Eastern Finland",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def undocs
  "Published by UN in New York"
  {:db/ident :loc.classSchemes/undocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "United Nations document series symbols: 1946-77 cumulative",
   :madsrdf/code "undocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by UN in New York"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/undocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/undocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by UN in New York"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "undocs",
   :skos/prefLabel "United Nations document series symbols: 1946-77 cumulative",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def upsylon
  "Published by La Faculté in Louvain-la-Neuve, Belgique"
  {:db/ident :loc.classSchemes/upsylon,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "UPSYLON: classification systématique de la Bibliothèque de la Faculté de psychologie et des sciences de l'éducation de l'Université catholique de Louvain",
   :madsrdf/code "upsylon",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by La Faculté in Louvain-la-Neuve, Belgique"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/upsylon,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/upsylon,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Published by La Faculté in Louvain-la-Neuve, Belgique"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "upsylon",
   :skos/prefLabel
   "UPSYLON: classification systématique de la Bibliothèque de la Faculté de psychologie et des sciences de l'éducation de l'Université catholique de Louvain",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def usgslcs
  "U.S. Geological Survey library classification"
  {:db/ident :loc.classSchemes/usgslcs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "U.S. Geological Survey library classification",
   :madsrdf/code "usgslcs",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/usgslcs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/usgslcs,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "usgslcs",
   :skos/prefLabel "U.S. Geological Survey library classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def utdocs
  "Published by Utah State Library Division in Salt Lake City"
  {:db/ident :loc.classSchemes/utdocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Utah documents classification schedules",
   :madsrdf/code "utdocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Published by Utah State Library Division in Salt Lake City"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/utdocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/utdocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Published by Utah State Library Division in Salt Lake City"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "utdocs",
   :skos/prefLabel "Utah documents classification schedules",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def utk
  "Published by Universitetet i Oslo in Oslo"
  {:db/ident :loc.classSchemes/utk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "University of Oslo Library classification",
   :madsrdf/code "utk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Universitetet i Oslo in Oslo"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/utk,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/utk,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Universitetet i Oslo in Oslo"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "utk",
   :skos/prefLabel "University of Oslo Library classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def utklklass
  "Published by Universitetet i Oslo in Oslo"
  {:db/ident :loc.classSchemes/utklklass,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "L-klassifikasjon",
   :madsrdf/code "utklklass",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Universitetet i Oslo in Oslo"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/utklklass,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/utklklass,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Universitetet i Oslo in Oslo"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "utklklass",
   :skos/prefLabel "L-klassifikasjon",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def utklklassex
  "Published by Universitetet i Oslo in Oslo"
  {:db/ident :loc.classSchemes/utklklassex,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "L-klassifikasjon with extensions",
   :madsrdf/code "utklklassex",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Published by Universitetet i Oslo in Oslo"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/utklklassex,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/utklklassex,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by Universitetet i Oslo in Oslo"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "utklklassex",
   :skos/prefLabel "L-klassifikasjon with extensions",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def veera
  "VEERA-luokitus = VEERA-классификация"
  {:db/ident :loc.classSchemes/veera,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "VEERA-luokitus = VEERA-классификация",
   :madsrdf/code "veera",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/veera,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/veera,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "veera",
   :skos/prefLabel "VEERA-luokitus = VEERA-классификация",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def vsiso
  "Published by VLABIN-VBC in Antwerpen"
  {:db/ident :loc.classSchemes/vsiso,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Vlaamse SISO [schema voor de indeling van de systematische catalogus in openbare bibliotheken]",
   :madsrdf/code "vsiso",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by VLABIN-VBC in Antwerpen"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/vsiso,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/vsiso,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by VLABIN-VBC in Antwerpen"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "vsiso",
   :skos/prefLabel
   "Vlaamse SISO [schema voor de indeling van de systematische catalogus in openbare bibliotheken]",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def wadocs
  "Published by State Library in Olympia"
  {:db/ident :loc.classSchemes/wadocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Washington State Library state documents collection: state documents call number",
   :madsrdf/code "wadocs",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by State Library in Olympia"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/wadocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/wadocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by State Library in Olympia"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "wadocs",
   :skos/prefLabel
   "Washington State Library state documents collection: state documents call number",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def widocs
  "Published by Division for Library Services, Bureau for Reference and Loan Services in Madison"
  {:db/ident :loc.classSchemes/widocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "Organizing Wisconsin public documents: cataloging and classification of documents at the State Historical Society Library",
   :madsrdf/code "widocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Division for Library Services, Bureau for Reference and Loan Services in Madison"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/widocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/widocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Division for Library Services, Bureau for Reference and Loan Services in Madison"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "widocs",
   :skos/prefLabel
   "Organizing Wisconsin public documents: cataloging and classification of documents at the State Historical Society Library",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def wydocs
  "Published by Department of Administration and Information, Wyoming State Library in Cheyenne, WY"
  {:db/ident :loc.classSchemes/wydocs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "WyDocs: the Wyoming state documents classification system",
   :madsrdf/code "wydocs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by Department of Administration and Information, Wyoming State Library in Cheyenne, WY"},
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/wydocs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/wydocs,
     :rdf/type :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by Department of Administration and Information, Wyoming State Library in Cheyenne, WY"},
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "wydocs",
   :skos/prefLabel "WyDocs: the Wyoming state documents classification system",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ykl
  "Yleisten kirjastojen luokitusjärjestelmä = Finnish public libraries classification system [former code: fplcs]"
  {:db/ident :loc.classSchemes/ykl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel
   "Yleisten kirjastojen luokitusjärjestelmä = Finnish public libraries classification system  [former code: fplcs]",
   :madsrdf/code "ykl",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ykl,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/ykl,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "ykl",
   :skos/prefLabel
   "Yleisten kirjastojen luokitusjärjestelmä = Finnish public libraries classification system [former code: fplcs]",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def z
  "other [used when a source code has not yet been assigned to a classification scheme]"
  {:db/ident :loc.classSchemes/z,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   "other [used when a source code has not yet been assigned to a classification scheme]",
   :madsrdf/code "z",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/z,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/z,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "z",
   :skos/prefLabel
   "other [used when a source code has not yet been assigned to a classification scheme]",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def zdbs
  "ZDB-Systematik = ZDB-Classification"
  {:db/ident :loc.classSchemes/zdbs,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "ZDB-Systematik = ZDB-Classification",
   :madsrdf/code "zdbs",
   :madsrdf/isMemberOfMADSCollection :loc.classSchemes/collection_classSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/classSchemes,
   :madsrdf/scopeNote {:rdf/language "en",
                       :rdf/value    "MARC bib: 055, 080, 082, 084 $2"},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason "new",
     :cs/createdDate
     "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/zdbs,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason "modified",
     :cs/createdDate
     "\"2022-12-06T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName
     "https://id.loc.gov/vocabulary/organizations/2022-12-06T00:00:00/dlc",
     :cs/subjectOfChange :loc.classSchemes/zdbs,
     :rdf/type :cs/ChangeSet}],
   :skos/inScheme :loc.vocabulary/classSchemes,
   :skos/notation "zdbs",
   :skos/prefLabel "ZDB-Systematik = ZDB-Classification",
   :skos/scopeNote {:rdf/language "en",
                    :rdf/value    "MARC bib: 055, 080, 082, 084 $2"}})

(def ^{:private true} classSchemes
  "Classification Schemes contains a list of classification schemes and assigns a URI to each scheme. The purpose of these properties is to permit users to associate classification numbers with the appropriate classification scheme. An individual URI has been assigned for each edition of Dewey."
  {:db/ident :loc.vocabulary/classSchemes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Classification Schemes contains a list of classification schemes and assigns a URI to each scheme. The purpose of these properties is to permit users to associate classification numbers with the appropriate classification scheme. An individual URI has been assigned for each edition of Dewey."},
   :madsrdf/hasMADSSchemeMember
   [:loc.classSchemes/laclaw
    :loc.classSchemes/cslj
    :loc.classSchemes/ddc16
    :loc.classSchemes/ddc1
    :loc.classSchemes/blissc
    :loc.classSchemes/ipc
    :loc.classSchemes/gfdc
    :loc.classSchemes/celex
    :loc.classSchemes/suaslc
    :loc.classSchemes/rswk
    :loc.classSchemes/utklklass
    :loc.classSchemes/ridocs
    :loc.classSchemes/bcmc
    :loc.classSchemes/undocs
    :loc.classSchemes/chfbn
    :loc.classSchemes/nydocs
    :loc.classSchemes/moys
    :loc.classSchemes/rubbknp
    :loc.classSchemes/codocs
    :loc.classSchemes/ddc13
    :loc.classSchemes/clc
    :loc.classSchemes/ddc20
    :loc.classSchemes/iadocs
    :loc.classSchemes/ddc18
    :loc.classSchemes/ddc17
    :loc.classSchemes/naics
    :loc.classSchemes/ykl
    :loc.classSchemes/njb
    :loc.classSchemes/nwbib
    :loc.classSchemes/scdocs
    :loc.classSchemes/mmlcc
    :loc.classSchemes/sudocs
    :loc.classSchemes/z
    :loc.classSchemes/cddir
    :loc.classSchemes/fivs
    :loc.classSchemes/rvk
    :loc.classSchemes/dopaed
    :loc.classSchemes/agricola
    :loc.classSchemes/ddc11
    :loc.classSchemes/ncsclt
    :loc.classSchemes/ddc
    :loc.classSchemes/wadocs
    :loc.classSchemes/mpilcs
    :loc.classSchemes/msdocs
    :loc.classSchemes/jelc
    :loc.classSchemes/ohdocs
    :loc.classSchemes/mf-klass
    :loc.classSchemes/gadocs
    :loc.classSchemes/scia
    :loc.classSchemes/sdnb
    :loc.classSchemes/ddc23
    :loc.classSchemes/methepp
    :loc.classSchemes/cjurrom
    :loc.classSchemes/ddc15
    :loc.classSchemes/okdocs
    :loc.classSchemes/ssd
    :loc.classSchemes/ladocs
    :loc.classSchemes/veera
    :loc.classSchemes/rilm
    :loc.classSchemes/usgslcs
    :loc.classSchemes/flarch
    :loc.classSchemes/midocs
    :loc.classSchemes/upsylon
    :loc.classSchemes/blsrissc
    :loc.classSchemes/ksdocs
    :loc.classSchemes/uef
    :loc.classSchemes/nbdocs
    :loc.classSchemes/farl
    :loc.classSchemes/taikclas
    :loc.classSchemes/ssgn
    :loc.classSchemes/niv
    :loc.classSchemes/mu
    :loc.classSchemes/kab
    :loc.classSchemes/egedeklass
    :loc.classSchemes/acmccs
    :loc.classSchemes/fiaf
    :loc.classSchemes/dk5s
    :loc.classSchemes/lndn
    :loc.classSchemes/no-ureal-cg
    :loc.classSchemes/rugasnti
    :loc.classSchemes/kuvacs
    :loc.classSchemes/ics
    :loc.classSchemes/cutterec
    :loc.classSchemes/ddc3
    :loc.classSchemes/fcps
    :loc.classSchemes/skb
    :loc.classSchemes/agrissc
    :loc.classSchemes/rubbkd
    :loc.classSchemes/fivr
    :loc.classSchemes/widocs
    :loc.classSchemes/cscjb
    :loc.classSchemes/kssb
    :loc.classSchemes/rubbkn
    :loc.classSchemes/padocs
    :loc.classSchemes/ccpgq
    :loc.classSchemes/bar
    :loc.classSchemes/ddc5
    :loc.classSchemes/sbb
    :loc.classSchemes/tykoma
    :loc.classSchemes/no-ureal-ca
    :loc.classSchemes/gestsk
    :loc.classSchemes/ddc22
    :loc.classSchemes/bliss
    :loc.classSchemes/farma
    :loc.classSchemes/accs
    :loc.classSchemes/msc
    :loc.classSchemes/ddc9
    :loc.classSchemes/bizga
    :loc.classSchemes/kfmod
    :loc.classSchemes/ddc19
    :loc.classSchemes/pcev
    :loc.classSchemes/ghbs
    :loc.classSchemes/pssppbkj
    :loc.classSchemes/nasasscg
    :loc.classSchemes/jstormcs
    :loc.classSchemes/rubbkk
    :loc.classSchemes/bkl
    :loc.classSchemes/loovs
    :loc.classSchemes/no-ureal-cb
    :loc.classSchemes/ncdocs
    :loc.classSchemes/wydocs
    :loc.classSchemes/noterlyd
    :loc.classSchemes/dhb-jdgklass
    :loc.classSchemes/swank
    :loc.classSchemes/rubbk
    :loc.classSchemes/nlm
    :loc.classSchemes/asb
    :loc.classSchemes/ddc7
    :loc.classSchemes/knt
    :loc.classSchemes/ddc2
    :loc.classSchemes/vsiso
    :loc.classSchemes/smm
    :loc.classSchemes/rubbkm
    :loc.classSchemes/lcc
    :loc.classSchemes/rueskl
    :loc.classSchemes/kktb
    :loc.classSchemes/gccn
    :loc.classSchemes/ddc4
    :loc.classSchemes/roy
    :loc.classSchemes/sfb
    :loc.classSchemes/clutscny
    :loc.classSchemes/rubbkmv
    :loc.classSchemes/ivdcc
    :loc.classSchemes/oosk
    :loc.classSchemes/cmedlit
    :loc.classSchemes/frtav
    :loc.classSchemes/ddc8
    :loc.classSchemes/no-ujur-cnip
    :loc.classSchemes/inspec
    :loc.classSchemes/cacodoc
    :loc.classSchemes/iconclass
    :loc.classSchemes/taykl
    :loc.classSchemes/stub
    :loc.classSchemes/fid
    :loc.classSchemes/bisacsh
    :loc.classSchemes/ifzs
    :loc.classSchemes/geothes
    :loc.classSchemes/ddc10
    :loc.classSchemes/pim
    :loc.classSchemes/utk
    :loc.classSchemes/cidades
    :loc.classSchemes/siso
    :loc.classSchemes/ddc14
    :loc.classSchemes/ddc21
    :loc.classSchemes/txdocs
    :loc.classSchemes/utdocs
    :loc.classSchemes/rpb
    :loc.classSchemes/rubbko
    :loc.classSchemes/teatkl
    "http://id.loc.gov/vocabulary/classSchemes/ubtkl/2"
    :loc.classSchemes/pcjv
    :loc.classSchemes/bsbddc
    :loc.classSchemes/pcesm
    :loc.classSchemes/ddc6
    :loc.classSchemes/ardocs
    :loc.classSchemes/cstud
    :loc.classSchemes/zdbs
    :loc.classSchemes/misklass
    :loc.classSchemes/finagri
    :loc.classSchemes/ordocs
    :loc.classSchemes/modocs
    :loc.classSchemes/rich
    :loc.classSchemes/azdocs
    :loc.classSchemes/fldocs
    :loc.classSchemes/cadocs
    :loc.classSchemes/rubbks
    :loc.classSchemes/bcl
    :loc.classSchemes/nicem
    :loc.classSchemes/nvdocs
    :loc.classSchemes/sddocs
    :loc.classSchemes/udc
    :loc.classSchemes/ekl
    :loc.classSchemes/no-ujur-cmr
    :loc.classSchemes/nhcp
    :loc.classSchemes/srnlc
    :loc.classSchemes/mpkkl
    :loc.classSchemes/ddc12
    :loc.classSchemes/anscr
    :loc.classSchemes/siblcs
    :loc.classSchemes/nmdocs
    :loc.classSchemes/utklklassex
    :loc.classSchemes/sswd],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Classification Schemes"},
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.vocabulary/classSchemes,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Classification Schemes contains a list of classification schemes and assigns a URI to each scheme. The purpose of these properties is to permit users to associate classification numbers with the appropriate classification scheme. An individual URI has been assigned for each edition of Dewey."}})