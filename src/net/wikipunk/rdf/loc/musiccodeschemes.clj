(ns net.wikipunk.rdf.loc.musiccodeschemes
  "http://id.loc.gov/vocabulary/musiccodeschemes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/musiccodeschemes.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.musiccodeschemes"
                       "http://id.loc.gov/vocabulary/musiccodeschemes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.musiccodeschemes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/musiccodeschemes/"})

(def emnmus
  "Norwegian Directorate for Public and School Libraries code list"
  {:db/ident :loc.musiccodeschemes/emnmus,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-02-06T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.musiccodeschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Emneord for musikkdokument I EDB-kataloger",
   :madsrdf/code "emnmus",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Norwegian Directorate for Public and School Libraries code list"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.musiccodeschemes/collection_musiccodeschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/musiccodeschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2020-02-06T05:00:00.000-00:00",
                     :cs/creatorName     :loc.musiccodeschemes/dlc,
                     :cs/subjectOfChange :loc.musiccodeschemes/emnmus,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Norwegian Directorate for Public and School Libraries code list"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :skos/inScheme :loc.vocabulary/musiccodeschemes,
   :skos/notation "emnmus",
   :skos/prefLabel "Emneord for musikkdokument I EDB-kataloger"})

(def gnd
  "Deutsche Nationalbibliothek code list"
  {:db/ident :loc.musiccodeschemes/gnd,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-02-06T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.musiccodeschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gemeinsame Normdatei",
   :madsrdf/code "gnd",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Deutsche Nationalbibliothek code list"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.musiccodeschemes/collection_musiccodeschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/musiccodeschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2020-02-06T05:00:00.000-00:00",
                     :cs/creatorName     :loc.musiccodeschemes/dlc,
                     :cs/subjectOfChange :loc.musiccodeschemes/gnd,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Deutsche Nationalbibliothek code list"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :skos/inScheme :loc.vocabulary/musiccodeschemes,
   :skos/notation "gnd",
   :skos/prefLabel "Gemeinsame Normdatei"})

(def iamlmp
  "International Association of Music Libraries medium of performance code list"
  {:db/ident :loc.musiccodeschemes/iamlmp,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-02-06T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.musiccodeschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "International Association of Music Libraries medium of performance codes",
   :madsrdf/code "iamlmp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "International Association of Music Libraries medium of performance code list"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.musiccodeschemes/collection_musiccodeschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/musiccodeschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2020-02-06T05:00:00.000-00:00",
                     :cs/creatorName     :loc.musiccodeschemes/dlc,
                     :cs/subjectOfChange :loc.musiccodeschemes/iamlmp,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "International Association of Music Libraries medium of performance code list"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :skos/inScheme :loc.vocabulary/musiccodeschemes,
   :skos/notation "iamlmp",
   :skos/prefLabel
   "International Association of Music Libraries medium of performance codes"})

(def lcmpt
  "Library of Congress medium of performance thesaurus for music"
  {:db/ident :loc.musiccodeschemes/lcmpt,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-02-06T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.musiccodeschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Library of Congress medium of performance thesaurus for music",
   :madsrdf/code "lcmpt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Library of Congress medium of performance thesaurus for music"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.musiccodeschemes/collection_musiccodeschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/musiccodeschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2020-02-06T05:00:00.000-00:00",
                     :cs/creatorName     :loc.musiccodeschemes/dlc,
                     :cs/subjectOfChange :loc.musiccodeschemes/lcmpt,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Library of Congress medium of performance thesaurus for music"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :skos/inScheme :loc.vocabulary/musiccodeschemes,
   :skos/notation "lcmpt",
   :skos/prefLabel
   "Library of Congress medium of performance thesaurus for music"})

(def marcmusperf
  "MARC instruments and voices code list"
  {:db/ident :loc.musiccodeschemes/marcmusperf,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-02-06T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.musiccodeschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MARC instruments and voices codes list",
   :madsrdf/code "marcmusperf",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "MARC instruments and voices code list"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.musiccodeschemes/collection_musiccodeschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/musiccodeschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2020-02-06T05:00:00.000-00:00",
                     :cs/creatorName     :loc.musiccodeschemes/dlc,
                     :cs/subjectOfChange :loc.musiccodeschemes/marcmusperf,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "MARC instruments and voices code list"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :skos/inScheme :loc.vocabulary/musiccodeschemes,
   :skos/notation "marcmusperf",
   :skos/prefLabel "MARC instruments and voices codes list"})

(def rvmmem
  "Thésaurus des moyens d'exécution en musique de l'Université Laval code list"
  {:db/ident :loc.musiccodeschemes/rvmmem,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-02-06T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.musiccodeschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Thésaurus des moyens d'exécution en musique de l'Université Laval",
   :madsrdf/code "rvmmem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Thésaurus des moyens d'exécution en musique de l'Université Laval code list"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.musiccodeschemes/collection_musiccodeschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/musiccodeschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2020-02-06T05:00:00.000-00:00",
                     :cs/creatorName     :loc.musiccodeschemes/dlc,
                     :cs/subjectOfChange :loc.musiccodeschemes/rvmmem,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Thésaurus des moyens d'exécution en musique de l'Université Laval code list"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :skos/inScheme :loc.vocabulary/musiccodeschemes,
   :skos/notation "rvmmem",
   :skos/prefLabel
   "Thésaurus des moyens d'exécution en musique de l'Université Laval"})

(def seko
  "Finnish Performance Composition Vocabulary code list"
  {:db/ident :loc.musiccodeschemes/seko,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2020-02-06T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.musiccodeschemes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Suomalainen esityskokoonpanosanasto",
   :madsrdf/code "seko",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Finnish Performance Composition Vocabulary code list"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :madsrdf/isMemberOfMADSCollection
   :loc.musiccodeschemes/collection_musiccodeschemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/musiccodeschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2020-02-06T05:00:00.000-00:00",
                     :cs/creatorName     :loc.musiccodeschemes/dlc,
                     :cs/subjectOfChange :loc.musiccodeschemes/seko,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Finnish Performance Composition Vocabulary code list"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 048 $2, 382 $2"},
   :skos/inScheme :loc.vocabulary/musiccodeschemes,
   :skos/notation "seko",
   :skos/prefLabel "Suomalainen esityskokoonpanosanasto"})

(def ^{:private true} musiccodeschemes
  ""
  {:db/ident        :loc.vocabulary/musiccodeschemes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-02-06T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/dlc",
    :ri/recordStatus "new"},
   :madsrdf/hasMADSSchemeMember [:loc.musiccodeschemes/emnmus
                                 :loc.musiccodeschemes/marcmusperf
                                 :loc.musiccodeschemes/lcmpt
                                 :loc.musiccodeschemes/gnd
                                 :loc.musiccodeschemes/seko
                                 :loc.musiccodeschemes/rvmmem
                                 :loc.musiccodeschemes/iamlmp],
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value
                     "Musical Instrumentation and Voice Code Source Codes"},
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2020-02-06T05:00:00.000-00:00",
                     :cs/creatorName     "https://id.loc.gov/vocabulary/dlc",
                     :cs/subjectOfChange :loc.vocabulary/musiccodeschemes,
                     :rdf/type           :cs/ChangeSet}})