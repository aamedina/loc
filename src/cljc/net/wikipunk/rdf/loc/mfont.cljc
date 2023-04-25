(ns net.wikipunk.rdf.loc.mfont
  "http://id.loc.gov/vocabulary/mfont/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mfont.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mfont" "http://id.loc.gov/vocabulary/mfont/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mfont",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mfont/"})

(def gp
  "A font size that is designed to aid readers who experience difficulty reading large print"
  {:db/ident :loc.mfont/gp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "giant print",
   :madsrdf/code "gp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A font size that is designed to aid readers who experience difficulty reading large print"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $n"},
   :madsrdf/isMemberOfMADSCollection :loc.mfont/collection_mfont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mfont,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mfont/gp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A font size that is designed to aid readers who experience difficulty reading large print"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $n"},
   :skos/inScheme :loc.vocabulary/mfont,
   :skos/notation "gp",
   :skos/prefLabel "giant print"})

(def jb
  "A font size of braille text where the individual cells are expanded to give wider spacing between standard size dots or between dots larger than standard size"
  {:db/ident :loc.mfont/jb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "jumbo braille",
   :madsrdf/code "jb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A font size of braille text where the individual cells are expanded to give wider spacing between standard size dots or between dots larger than standard size"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007tactile/09 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mfont/collection_mfont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mfont,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mfont/jb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A font size of braille text where the individual cells are expanded to give wider spacing between standard size dots or between dots larger than standard size"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007tactile/09 - b"},
   :skos/inScheme :loc.vocabulary/mfont,
   :skos/notation "jb",
   :skos/prefLabel "jumbo braille"})

(def lp
  "A font size that is designed to aid readers who experience difficulty reading regular print"
  {:db/ident :loc.mfont/lp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "large print",
   :madsrdf/code "lp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A font size that is designed to aid readers who experience difficulty reading regular print"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "large type",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007text/01 - b ; 340 $n"},
   :madsrdf/isMemberOfMADSCollection :loc.mfont/collection_mfont,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mfont,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "large type",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mfont/lp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A font size that is designed to aid readers who experience difficulty reading regular print"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007text/01 - b ; 340 $n"},
   :skos/inScheme :loc.vocabulary/mfont,
   :skos/notation "lp",
   :skos/prefLabel "large print",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "large type"}})

(def ^{:private true} mfont
  "A size of the type used to represent the characters and symbols in a resoure"
  {:db/ident :loc.vocabulary/mfont,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-05-14T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A size of the type used to represent the characters and symbols in a resoure"},
   :madsrdf/hasMADSSchemeMember [:loc.mfont/lp :loc.mfont/jb :loc.mfont/gp],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Font Size"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-05-14T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mfont,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A size of the type used to represent the characters and symbols in a resoure"}})