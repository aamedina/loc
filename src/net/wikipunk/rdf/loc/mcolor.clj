(ns net.wikipunk.rdf.loc.mcolor
  "http://id.loc.gov/vocabulary/mcolor/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mcolor.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mcolor" "http://id.loc.gov/vocabulary/mcolor/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mcolor",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mcolor/"})

(def blw
  "Resource is printed or executed in black-and-white."
  {:db/ident :loc.mcolor/blw,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2019-04-28T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "black and white",
   :madsrdf/code "blw",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Resource is printed or executed in black-and-white."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "monochrome",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "monocolour",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mcolor/collection_mcolor,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcolor,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["monocolour" "monochrome"],
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-01-23T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mcolor/blw,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2019-04-28T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.mcolor/blw,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Resource is printed or executed in black-and-white."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - b"},
   :skos/inScheme :loc.vocabulary/mcolor,
   :skos/notation "blw",
   :skos/prefLabel "black and white",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "monochrome"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "monocolour"}]})

(def gry
  "Resource is produced with degrees of dark to light from black to gray to white."
  {:db/ident :loc.mcolor/gry,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "gray scale",
   :madsrdf/code "gry",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource is produced with degrees of dark to light from black to gray to white."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "grey scale",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - g"},
   :madsrdf/isMemberOfMADSCollection :loc.mcolor/collection_mcolor,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcolor,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "grey scale",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcolor/gry,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource is produced with degrees of dark to light from black to gray to white."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - g"},
   :skos/inScheme :loc.vocabulary/mcolor,
   :skos/notation "gry",
   :skos/prefLabel "gray scale",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "grey scale"}})

(def hnd
  "Resource image, produced by a printing or photographic process, is hand colored"
  {:db/ident :loc.mcolor/hnd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "hand colored",
   :madsrdf/code "hnd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource image, produced by a printing or photographic process, is hand colored"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "hand coloured",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - h"},
   :madsrdf/isMemberOfMADSCollection :loc.mcolor/collection_mcolor,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcolor,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "hand coloured",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcolor/hnd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource image, produced by a printing or photographic process, is hand colored"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - h"},
   :skos/inScheme :loc.vocabulary/mcolor,
   :skos/notation "hnd",
   :skos/prefLabel "hand colored",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "hand coloured"}})

(def mix
  "Collection is a combination of one color, black and white, multicolored, and/or hand colored resources."
  {:db/ident :loc.mcolor/mix,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "mixed color",
   :madsrdf/code "mix",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Collection is a combination of one color, black and white, multicolored, and/or hand colored resources."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "mixed colour",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - m"},
   :madsrdf/isMemberOfMADSCollection :loc.mcolor/collection_mcolor,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcolor,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "mixed colour",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcolor/mix,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Collection is a combination of one color, black and white, multicolored, and/or hand colored resources."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - m"},
   :skos/inScheme :loc.vocabulary/mcolor,
   :skos/notation "mix",
   :skos/prefLabel "mixed color",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "mixed colour"}})

(def mul
  "Resource is printed or executed in more than one color."
  {:db/ident :loc.mcolor/mul,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "color",
   :madsrdf/code "mul",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Resource is printed or executed in more than one color."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "multicolored",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "multicoloured",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.mcolor/collection_mcolor,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcolor,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["multicoloured" "multicolored"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcolor/mul,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Resource is printed or executed in more than one color."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - c"},
   :skos/inScheme :loc.vocabulary/mcolor,
   :skos/notation "mul",
   :skos/prefLabel "color",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "multicolored"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "multicoloured"}]})

(def one
  "Resource is printed or executed in a single color."
  {:db/ident :loc.mcolor/one,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "one color",
   :madsrdf/code "one",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Resource is printed or executed in a single color."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "one colour",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mcolor/collection_mcolor,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcolor,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "one colour",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mcolor/one,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Resource is printed or executed in a single color."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007mp/el/vi/gl/pg/mpic/03; 007mi/09 - a"},
   :skos/inScheme :loc.vocabulary/mcolor,
   :skos/notation "one",
   :skos/prefLabel "one color",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "one colour"}})

(def ^{:private true} mcolor
  "Presence of color, tone, etc., in the content of a resource."
  {:db/ident :loc.vocabulary/mcolor,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Presence of color, tone, etc., in the content of a resource."},
   :madsrdf/hasMADSSchemeMember [:loc.mcolor/mul
                                 :loc.mcolor/blw
                                 :loc.mcolor/one
                                 :loc.mcolor/gry
                                 :loc.mcolor/hnd
                                 :loc.mcolor/mix],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Color Content"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mcolor,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Presence of color, tone, etc., in the content of a resource."}})