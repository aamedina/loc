(ns net.wikipunk.rdf.loc.languageschemes
  "http://id.loc.gov/vocabulary/languageschemes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/languageschemes.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.languageschemes"
                       "http://id.loc.gov/vocabulary/languageschemes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.languageschemes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/languageschemes/"})

(def austlang
  "Published by: Australian Institute of Aboriginal and Torres Strait Islander Studies (AIATSIS))"
  {:db/ident :loc.languageschemes/austlang,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "AUSTLANG",
   :madsrdf/code "austlang",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by: Australian Institute of Aboriginal and Torres Strait Islander Studies (AIATSIS))"},
   :madsrdf/editorialNote "https://collection.aiatsis.gov.au/austlang/search",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/austlang,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by: Australian Institute of Aboriginal and Torres Strait Islander Studies (AIATSIS))"},
   :skos/editorial "https://collection.aiatsis.gov.au/austlang/search",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "austlang",
   :skos/prefLabel "AUSTLANG"})

(def din2335
  "Published by: Beuth, Berlin"
  {:db/ident :loc.languageschemes/din2335,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "DIN 2335",
   :madsrdf/code "din2335",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by: Beuth, Berlin"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Sprachenzeichen: DIN 2335",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Sprachenzeichen: DIN 2335",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/din2335,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by: Beuth, Berlin"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "din2335",
   :skos/prefLabel "DIN 2335",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Sprachenzeichen: DIN 2335"}})

(def glotto
  "Glottolog"
  {:db/ident :loc.languageschemes/glotto,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Glottolog",
   :madsrdf/code "glotto",
   :madsrdf/editorialNote "https://glottolog.org/",
   :madsrdf/hasVariant {:madsrdf/variantLabel "Glottolog 4.0",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Glottolog 4.0",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/glotto,
                     :rdf/type :cs/ChangeSet},
   :skos/editorial "https://glottolog.org/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "glotto",
   :skos/prefLabel "Glottolog",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Glottolog 4.0"}})

(def iso6391
  "Published by: International Organization for Standardization in Geneva"
  {:db/ident :loc.languageschemes/iso6391,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ISO639-1",
   :madsrdf/code "iso6391",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by: International Organization for Standardization in Geneva"},
   :madsrdf/editorialNote "https://www.loc.gov/standards/iso639-2/",
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Codes for the representation of names of languages--Part 1: Alpha-2 code",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Codes for the representation of names of languages--Part 1: Alpha-2 code (ISO 639-1:2002)",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["Codes for the representation of names of languages--Part 1: Alpha-2 code (ISO 639-1:2002)"
    "Codes for the representation of names of languages--Part 1: Alpha-2 code"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/iso6391,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by: International Organization for Standardization in Geneva"},
   :skos/editorial "https://www.loc.gov/standards/iso639-2/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "iso6391",
   :skos/prefLabel "ISO639-1",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Codes for the representation of names of languages--Part 1: Alpha-2 code"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Codes for the representation of names of languages--Part 1: Alpha-2 code (ISO 639-1:2002)"}]})

(def iso6392b
  "Published by: International Organization for Standardization in Geneva"
  {:db/ident :loc.languageschemes/iso6392b,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ISO639-2",
   :madsrdf/code "iso6392b",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by: International Organization for Standardization in Geneva"},
   :madsrdf/editorialNote "https://www.loc.gov/standards/iso639-2/",
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Codes for the representation of names of languages--Part 2: Alpha-3 code",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Codes for the representation of names of languages--Part 2: Alpha-3 code (ISO 639-2B:2002)",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["Codes for the representation of names of languages--Part 2: Alpha-3 code"
    "Codes for the representation of names of languages--Part 2: Alpha-3 code (ISO 639-2B:2002)"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/iso6392b,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by: International Organization for Standardization in Geneva"},
   :skos/editorial "https://www.loc.gov/standards/iso639-2/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "iso6392b",
   :skos/prefLabel "ISO639-2",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Codes for the representation of names of languages--Part 2: Alpha-3 code"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Codes for the representation of names of languages--Part 2: Alpha-3 code (ISO 639-2B:2002)"}]})

(def iso6393
  "Published by: International Organization for Standardization in Geneva"
  {:db/ident :loc.languageschemes/iso6393,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "ISO639-3",
   :madsrdf/code "iso6393",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by: International Organization for Standardization in Geneva"},
   :madsrdf/editorialNote "https://iso639-3.sil.org/",
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Codes for the representation of names of languages--Part 3: Alpha-3 code for comprehensive coverage of languages",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Codes for the representation of names of languages--Part 3: Alpha-3 code for comprehensive coverage of languages",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   "Codes for the representation of names of languages--Part 3: Alpha-3 code for comprehensive coverage of languages",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/iso6393,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by: International Organization for Standardization in Geneva"},
   :skos/editorial "https://iso639-3.sil.org/",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "iso6393",
   :skos/prefLabel "ISO639-3",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Codes for the representation of names of languages--Part 3: Alpha-3 code for comprehensive coverage of languages"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Codes for the representation of names of languages--Part 3: Alpha-3 code for comprehensive coverage of languages"}]})

(def knia
  "Published by: Mezhgosudarstvennyi sovet po standartizatsii, metrologii i sertifikatsii in Minsk"
  {:db/ident :loc.languageschemes/knia,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Kody naimenovanii íàzykov",
   :madsrdf/code "knia",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by: Mezhgosudarstvennyi sovet po standartizatsii, metrologii i sertifikatsii in Minsk"},
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        "Kody naimenovanii íàzykov: GOST 7.75-97",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Kody naimenovanii íàzykov: GOST 7.75-97",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/knia,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by: Mezhgosudarstvennyi sovet po standartizatsii, metrologii i sertifikatsii in Minsk"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "knia",
   :skos/prefLabel "Kody naimenovanii íàzykov",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     "Kody naimenovanii íàzykov: GOST 7.75-97"}})

(def lrwl
  "Published by: Observatoire Linguistique by Linguasphere Press, 1999/2000) in Hebren, Wales, UK"
  {:db/ident :loc.languageschemes/lrwl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2022-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "Dalby, David. The Linguasphere Register of the World's Languages and Speech Communities",
   :madsrdf/code "lrwl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Published by: Observatoire Linguistique by Linguasphere Press, 1999/2000) in Hebren, Wales, UK"},
   :madsrdf/editorialNote
   "http://www.linguasphere.info/jr/index.php?l1=home&l2=welcome",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2022-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/lrwl,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Published by: Observatoire Linguistique by Linguasphere Press, 1999/2000) in Hebren, Wales, UK"},
   :skos/editorial
   "http://www.linguasphere.info/jr/index.php?l1=home&l2=welcome",
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "lrwl",
   :skos/prefLabel
   "Dalby, David. The Linguasphere Register of the World's Languages and Speech Communities"})

(def rfc3066
  "Published by: The Internet Society\\"
  {:db/ident :loc.languageschemes/rfc3066,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RFC3066",
   :madsrdf/code "rfc3066",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Published by: The Internet Society\\"},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     "Tags for the identification of languages (January 2001)",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel
     "Tags for the identification of languages (January 2001)",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Tags for the identification of languages (January 2001)",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/rfc3066,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by: The Internet Society\\"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "rfc3066",
   :skos/prefLabel "RFC3066",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Tags for the identification of languages (January 2001)"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     "Tags for the identification of languages (January 2001)"}]})

(def rfc4646
  "Published by: The Internet Society"
  {:db/ident :loc.languageschemes/rfc4646,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RFC4646",
   :madsrdf/code "rfc4646",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by: The Internet Society"},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Tags for identifying languages  (September 2006)",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Tags for identifying languages (September 2006)",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Tags for identifying languages (September 2006)"
                   "Tags for identifying languages  (September 2006)"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/rfc4646,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by: The Internet Society"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "rfc4646",
   :skos/prefLabel "RFC4646",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Tags for identifying languages  (September 2006)"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Tags for identifying languages (September 2006)"}]})

(def rfc5646
  "Published by: The Internet Society"
  {:db/ident :loc.languageschemes/rfc5646,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "RFC5646",
   :madsrdf/code "rfc5646",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Published by: The Internet Society"},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel "Tags for Identifying Languages (September 2009)",
     :rdf/type :madsrdf/Variant}
    {:madsrdf/variantLabel "Tags for Identifying Languages  (September 2009)",
     :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :madsrdf/isMemberOfMADSCollection
   :loc.languageschemes/collection_languageSchemes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/languageschemes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Tags for Identifying Languages  (September 2009)"
                   "Tags for Identifying Languages (September 2009)"],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.languageschemes/rfc5646,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Published by: The Internet Society"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"},
   :skos/inScheme :loc.vocabulary/languageschemes,
   :skos/notation "rfc5646",
   :skos/prefLabel "RFC5646",
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm "Tags for Identifying Languages  (September 2009)"}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm "Tags for Identifying Languages (September 2009)"}]})

(def ^{:private true} languageschemes
  "Identifies and enables the source of language codes or terms contained in metadata records to be identified"
  {:db/ident :loc.vocabulary/languageschemes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2021-08-02T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Identifies and enables the source of language codes or terms contained in metadata records to be identified"},
   :madsrdf/hasMADSSchemeMember [:loc.languageschemes/glotto
                                 :loc.languageschemes/austlang
                                 :loc.languageschemes/iso6391
                                 :loc.languageschemes/din2335
                                 :loc.languageschemes/knia
                                 :loc.languageschemes/lrwl
                                 :loc.languageschemes/rfc3066
                                 :loc.languageschemes/iso6393
                                 :loc.languageschemes/rfc5646
                                 :loc.languageschemes/rfc4646
                                 :loc.languageschemes/iso6392b],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 040 $e"},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Language Code and Term Source Codes"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2021-08-02T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/languageschemes,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Identifies and enables the source of language codes or terms contained in metadata records to be identified"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 040 $e"}})