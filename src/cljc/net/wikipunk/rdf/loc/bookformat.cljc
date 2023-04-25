(ns net.wikipunk.rdf.loc.bookformat
  "http://id.loc.gov/vocabulary/bookformat/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/bookformat.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.bookformat"
                       "http://id.loc.gov/vocabulary/bookformat/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.bookformat",
   :rdfa/uri          "http://id.loc.gov/vocabulary/bookformat/"})

(def folio
  "Leaves in the resource are 1/2 of the whole sheet"
  {:db/ident :loc.bookformat/folio,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "folio",
   :madsrdf/code "folio",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/2 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "folio format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "folio format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/folio,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/2 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "folio",
   :skos/prefLabel "folio",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "folio format"}})

(def full
  "Sheets in the resource have not been cut or folded"
  {:db/ident :loc.bookformat/full,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "full-sheet",
   :madsrdf/code "full",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Sheets in the resource have not been cut or folded"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "fullsheet format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "fullsheet format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/full,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Sheets in the resource have not been cut or folded"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "full",
   :skos/prefLabel "full-sheet",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "fullsheet format"}})

(def |128mo|
  "Leaves in the resource are 1/128 of the whole sheet"
  {:db/ident :loc.bookformat/|128mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "128mo",
   :madsrdf/code "128mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/128 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "one hundred twenty-eightmo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "one hundred twenty-eightmo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|128mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/128 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "128mo",
   :skos/prefLabel "128mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "one hundred twenty-eightmo format"}})

(def |12mo|
  "Leaves in the resource are 1/12 of the whole sheet"
  {:db/ident :loc.bookformat/|12mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "12mo",
   :madsrdf/code "12mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/12 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "duodecimo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "duodecimo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|12mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/12 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "12mo",
   :skos/prefLabel "12mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "duodecimo format"}})

(def |16mo|
  "Leaves in the resource are 1/16 of the whole sheet"
  {:db/ident :loc.bookformat/|16mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "16mo",
   :madsrdf/code "16mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/16 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "sixteenmo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "sixteenmo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|16mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/16 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "16mo",
   :skos/prefLabel "16mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "sixteenmo format"}})

(def |18mo|
  "Leaves in the resource are 1/18 of the whole sheet"
  {:db/ident :loc.bookformat/|18mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "18mo",
   :madsrdf/code "18mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/18 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "eighteenmo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "eighteenmo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|18mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/18 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "18mo",
   :skos/prefLabel "18mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "eighteenmo format"}})

(def |24mo|
  "Leaves in the resource are 1/24 of the whole sheet"
  {:db/ident :loc.bookformat/|24mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "24mo",
   :madsrdf/code "24mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/24 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "twenty-fourmo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "twenty-fourmo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|24mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/24 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "24mo",
   :skos/prefLabel "24mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "twenty-fourmo format"}})

(def |32mo|
  "Leaves in the resource are 1/32 of the whole sheet"
  {:db/ident :loc.bookformat/|32mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "32mo",
   :madsrdf/code "32mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/32 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "thirty-twomo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "thirty-twomo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|32mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/32 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "32mo",
   :skos/prefLabel "32mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "thirty-twomo format"}})

(def |36mo|
  "Leaves in the resource are 1/36 of the whole sheet"
  {:db/ident :loc.bookformat/|36mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "36mo",
   :madsrdf/code "36mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/36 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "thirty-sixmo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "thirty-sixmo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|36mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/36 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "36mo",
   :skos/prefLabel "36mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "thirty-sixmo format"}})

(def |48mo|
  "Leaves in the resource are 1/48 of the whole sheet"
  {:db/ident :loc.bookformat/|48mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "48mo",
   :madsrdf/code "48mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/48 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "forty-eightmo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "forty-eightmo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|48mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/48 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "48mo",
   :skos/prefLabel "48mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "forty-eightmo format"}})

(def |4to|
  "Leaves in the resource are 1/4 of the whole sheet"
  {:db/ident :loc.bookformat/|4to|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "4to",
   :madsrdf/code "4to",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/4 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "quarto format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "quarto format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|4to|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/4 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "4to",
   :skos/prefLabel "4to",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "quarto format"}})

(def |64mo|
  "Leaves in the resource are 1/64 of the whole sheet"
  {:db/ident :loc.bookformat/|64mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "64mo",
   :madsrdf/code "64mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/64 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "sixty-fourmo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "sixty-fourmo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|64mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/64 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "64mo",
   :skos/prefLabel "64mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "sixty-fourmo format"}})

(def |72mo|
  "Leaves in the resource are 1/72 of the whole sheet"
  {:db/ident :loc.bookformat/|72mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "72mo",
   :madsrdf/code "72mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/72 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "seventy-twomo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "seventy-twomo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|72mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/72 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "72mo",
   :skos/prefLabel "72mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "seventy-twomo format"}})

(def |8vo|
  "Leaves in the resource are 1/8 of the whole sheet"
  {:db/ident :loc.bookformat/|8vo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "8vo",
   :madsrdf/code "8vo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/8 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "octavo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "octavo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|8vo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/8 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "8vo",
   :skos/prefLabel "8vo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "octavo format"}})

(def |96mo|
  "Leaves in the resource are 1/96 of the whole sheet"
  {:db/ident :loc.bookformat/|96mo|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "96mo",
   :madsrdf/code "96mo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Leaves in the resource are 1/96 of the whole sheet"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "ninety-sixmo format",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :madsrdf/isMemberOfMADSCollection :loc.bookformat/collection_bookformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/bookformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "ninety-sixmo format",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.bookformat/|96mo|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Leaves in the resource are 1/96 of the whole sheet"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"},
   :skos/inScheme :loc.vocabulary/bookformat,
   :skos/notation "96mo",
   :skos/prefLabel "96mo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "ninety-sixmo format"}})

(def ^{:private true} bookformat
  "Relationship between a whole sheet and individual leaves in printing"
  {:db/ident :loc.vocabulary/bookformat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-05-24T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Relationship between a whole sheet and individual leaves in printing"},
   :madsrdf/hasMADSSchemeMember [:loc.bookformat/|4to|
                                 :loc.bookformat/|24mo|
                                 :loc.bookformat/|12mo|
                                 :loc.bookformat/full
                                 :loc.bookformat/|128mo|
                                 :loc.bookformat/|36mo|
                                 :loc.bookformat/folio
                                 :loc.bookformat/|72mo|
                                 :loc.bookformat/|48mo|
                                 :loc.bookformat/|16mo|
                                 :loc.bookformat/|32mo|
                                 :loc.bookformat/|8vo|
                                 :loc.bookformat/|96mo|
                                 :loc.bookformat/|18mo|
                                 :loc.bookformat/|64mo|],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $m"},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Book Format"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-05-24T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/bookformat,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relationship between a whole sheet and individual leaves in printing"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $m"}})