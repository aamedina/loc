(ns net.wikipunk.rdf.loc.mlayout
  "http://id.loc.gov/vocabulary/mlayout/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mlayout.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mlayout" "http://id.loc.gov/vocabulary/mlayout/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mlayout",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mlayout/"}
  (:refer-clojure :exclude [short]))

(def backto
  "Layout in which the same image is represented in more than one language on each side of a sheet."
  {:db/ident :loc.mlayout/backto,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "back to back",
   :madsrdf/code "backto",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout in which the same image is represented in more than one language on each side of a sheet."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/backto,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout in which the same image is represented in more than one language on each side of a sheet."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "backto",
   :skos/prefLabel "back to back"})

(def barby
  "Layout consisting of music displayed in indented paragraphs with all of the parts for each measure written consecutively"
  {:db/ident :loc.mlayout/barby,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "bar by bar",
   :madsrdf/code "barby",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of music displayed in indented paragraphs with all of the parts for each measure written consecutively"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/barby,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of music displayed in indented paragraphs with all of the parts for each measure written consecutively"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "barby",
   :skos/prefLabel "bar by bar"})

(def barover
  "Layout consisting of measures displayed in units called parallels and that the beginning of each part's measure is vertically aligned with the beginning of the same measure for the other part or parts"
  {:db/ident :loc.mlayout/barover,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "bar over bar",
   :madsrdf/code "barover",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of measures displayed in units called parallels and that the beginning of each part's measure is vertically aligned with the beginning of the same measure for the other part or parts"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/barover,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of measures displayed in units called parallels and that the beginning of each part's measure is vertically aligned with the beginning of the same measure for the other part or parts"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "barover",
   :skos/prefLabel "bar over bar"})

(def both
  "Layout that is continued at the same scale on both sides of a sheet or sheets"
  {:db/ident :loc.mlayout/both,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "both sides",
   :madsrdf/code "both",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout that is continued at the same scale on both sides of a sheet or sheets"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/both,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout that is continued at the same scale on both sides of a sheet or sheets"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "both",
   :skos/prefLabel "both sides"})

(def dblsd
  "Layout that uses both sides of a sheet"
  {:db/ident :loc.mlayout/dblsd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "double sided",
   :madsrdf/code "dblsd",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Layout that uses both sides of a sheet"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/dblsd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Layout that uses both sides of a sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "dblsd",
   :skos/prefLabel "double sided"})

(def dblsp
  "Layout containing a full blank line between lines of text"
  {:db/ident :loc.mlayout/dblsp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "double line spacing",
   :madsrdf/code "dblsp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Layout containing a full blank line between lines of text"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/dblsp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Layout containing a full blank line between lines of text"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "dblsp",
   :skos/prefLabel "double line spacing"})

(def lineby
  "Layout consisting of lines of text that alternate with lines of music for the preceding text"
  {:db/ident :loc.mlayout/lineby,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "line by line",
   :madsrdf/code "lineby",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of lines of text that alternate with lines of music for the preceding text"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/lineby,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of lines of text that alternate with lines of music for the preceding text"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "lineby",
   :skos/prefLabel "line by line"})

(def lineover
  "Layout consisting of measures displayed in parallels, but the measures are not necessarily aligned"
  {:db/ident :loc.mlayout/lineover,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "line over line",
   :madsrdf/code "lineover",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of measures displayed in parallels, but the measures are not necessarily aligned"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/lineover,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of measures displayed in parallels, but the measures are not necessarily aligned"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "lineover",
   :skos/prefLabel "line over line"})

(def melcho
  "Layout consisting of chord symbols and melody presented in paragraphs with music braille used for the chord symbols"
  {:db/ident :loc.mlayout/melcho,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "melody chord system",
   :madsrdf/code "melcho",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of chord symbols and melody presented in paragraphs with music braille used for the chord symbols"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/melcho,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of chord symbols and melody presented in paragraphs with music braille used for the chord symbols"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "melcho",
   :skos/prefLabel "melody chord system"})

(def opensc
  "Layout consisting of music presented in parallels"
  {:db/ident :loc.mlayout/opensc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "open score",
   :madsrdf/code "opensc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Layout consisting of music presented in parallels"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/opensc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Layout consisting of music presented in parallels"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "opensc",
   :skos/prefLabel "open score"})

(def outl
  "Layout consisting of music in the outline format"
  {:db/ident :loc.mlayout/outl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "outline",
   :madsrdf/code "outl",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Layout consisting of music in the outline format"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/outl,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Layout consisting of music in the outline format"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "outl",
   :skos/prefLabel "outline"})

(def para
  "Layout in braille consisting of music displayed in paragraphs with one part per paragraph"
  {:db/ident :loc.mlayout/para,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "paragraph",
   :madsrdf/code "para",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout in braille consisting of music displayed in paragraphs with one part per paragraph"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/para,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout in braille consisting of music displayed in paragraphs with one part per paragraph"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "para",
   :skos/prefLabel "paragraph"})

(def sectby
  "Layout consisting of hand or part signs that are prominent in the left margin"
  {:db/ident :loc.mlayout/sectby,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "section by section",
   :madsrdf/code "sectby",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of hand or part signs that are prominent in the left margin"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/sectby,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of hand or part signs that are prominent in the left margin"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "sectby",
   :skos/prefLabel "section by section"})

(def short
  "Layout consisting of words, chord symbols, and melody presented in parallels with literary braille used for the chord symbols"
  {:db/ident :loc.mlayout/short,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "short form scoring",
   :madsrdf/code "short",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of words, chord symbols, and melody presented in parallels with literary braille used for the chord symbols"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/short,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of words, chord symbols, and melody presented in parallels with literary braille used for the chord symbols"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "short",
   :skos/prefLabel "short form scoring"})

(def singln
  "Layout consisting of music for single instrumental parts or solos presented in segments of two to five lines, the initial line displaying a measure number or rehearsal designation"
  {:db/ident :loc.mlayout/singln,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "single line",
   :madsrdf/code "singln",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of music for single instrumental parts or solos presented in segments of two to five lines, the initial line displaying a measure number or rehearsal designation"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/singln,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Layout consisting of music for single instrumental parts or solos presented in segments of two to five lines, the initial line displaying a measure number or rehearsal designation"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "singln",
   :skos/prefLabel "single line"})

(def singsd
  "Layout that uses only one side of a sheet"
  {:db/ident :loc.mlayout/singsd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "single sided",
   :madsrdf/code "singsd",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Layout that uses only one side of a sheet"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :madsrdf/isMemberOfMADSCollection :loc.mlayout/collection_mlayout,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mlayout,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mlayout/singsd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Layout that uses only one side of a sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"},
   :skos/inScheme :loc.vocabulary/mlayout,
   :skos/notation "singsd",
   :skos/prefLabel "single sided"})

(def ^{:private true} mlayout
  "Arrangement of text, images, tactile notation, etc. in a resource"
  {:db/ident :loc.vocabulary/mlayout,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Arrangement of text, images, tactile notation, etc. in a resource"},
   :madsrdf/hasMADSSchemeMember [:loc.mlayout/barby
                                 :loc.mlayout/opensc
                                 :loc.mlayout/lineover
                                 :loc.mlayout/dblsd
                                 :loc.mlayout/short
                                 :loc.mlayout/singln
                                 :loc.mlayout/para
                                 :loc.mlayout/lineby
                                 :loc.mlayout/singsd
                                 :loc.mlayout/dblsp
                                 :loc.mlayout/barover
                                 :loc.mlayout/both
                                 :loc.mlayout/sectby
                                 :loc.mlayout/outl
                                 :loc.mlayout/melcho
                                 :loc.mlayout/backto],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $k"},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Layout"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mlayout,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Arrangement of text, images, tactile notation, etc. in a resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $k"}})