(ns net.wikipunk.rdf.loc.iso639-1
  "http://id.loc.gov/vocabulary/iso639-1/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/iso639-1.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.iso639-1" "http://id.loc.gov/vocabulary/iso639-1/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.iso639-1",
   :rdfa/uri          "http://id.loc.gov/vocabulary/iso639-1/"}
  (:refer-clojure :exclude [or]))

(def aa
  "Afar"
  {:db/ident :loc.iso639-1/aa,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Danakil-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "afar"}
                                {:rdf/language "en",
                                 :rdf/value    "Afar"}],
   :madsrdf/code "aa",
   :madsrdf/hasExactExternalAuthority [:loc.languages/aar :loc.iso639-2/aar],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Afar"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Danakil-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "afar"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Afar"}
                   {:rdf/language "fr",
                    :rdf/value    "afar"}
                   {:rdf/language "de",
                    :rdf/value    "Danakil-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/aa,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/aar :loc.languages/aar],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "aa",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Danakil-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "afar"}
                    {:rdf/language "en",
                     :rdf/value    "Afar"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Afar"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Danakil-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "afar"}}]})

(def ab
  "Abkhazian"
  {:db/ident :loc.iso639-1/ab,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Abchasisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "abkhaze"}
                                {:rdf/language "en",
                                 :rdf/value    "Abkhazian"}],
   :madsrdf/code "ab",
   :madsrdf/hasExactExternalAuthority [:loc.languages/abk :loc.iso639-2/abk],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Abkhazian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Abchasisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "abkhaze"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "abkhaze"}
                   {:rdf/language "en",
                    :rdf/value    "Abkhazian"}
                   {:rdf/language "de",
                    :rdf/value    "Abchasisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ab,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/abk :loc.iso639-2/abk],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ab",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Abchasisch"}
                    {:rdf/language "fr",
                     :rdf/value    "abkhaze"}
                    {:rdf/language "en",
                     :rdf/value    "Abkhazian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Abchasisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "abkhaze"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Abkhazian"}}]})

(def ae
  "Avestan"
  {:db/ident :loc.iso639-1/ae,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Avestisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "avestique"}
                                {:rdf/language "en",
                                 :rdf/value    "Avestan"}],
   :madsrdf/code "ae",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ave :loc.languages/ave],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "avestique"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Avestisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Avestan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Avestan"}
                   {:rdf/language "fr",
                    :rdf/value    "avestique"}
                   {:rdf/language "de",
                    :rdf/value    "Avestisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ae,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ave :loc.iso639-2/ave],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ae",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Avestisch"}
                    {:rdf/language "fr",
                     :rdf/value    "avestique"}
                    {:rdf/language "en",
                     :rdf/value    "Avestan"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Avestisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Avestan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "avestique"}}]})

(def af
  "Afrikaans"
  {:db/ident :loc.iso639-1/af,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Afrikaans"}
                                {:rdf/language "fr",
                                 :rdf/value    "afrikaans"}
                                {:rdf/language "en",
                                 :rdf/value    "Afrikaans"}],
   :madsrdf/code "af",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/afr :loc.languages/afr],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "afrikaans"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Afrikaans"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Afrikaans"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "afrikaans"}
                   {:rdf/language "de",
                    :rdf/value    "Afrikaans"}
                   {:rdf/language "en",
                    :rdf/value    "Afrikaans"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/af,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/afr :loc.iso639-2/afr],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "af",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Afrikaans"}
                    {:rdf/language "fr",
                     :rdf/value    "afrikaans"}
                    {:rdf/language "en",
                     :rdf/value    "Afrikaans"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Afrikaans"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Afrikaans"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "afrikaans"}}]})

(def ak
  "Akan"
  {:db/ident :loc.iso639-1/ak,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Akan-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "akan"}
                                {:rdf/language "en",
                                 :rdf/value    "Akan"}],
   :madsrdf/code "ak",
   :madsrdf/hasExactExternalAuthority [:loc.languages/aka :loc.iso639-2/aka],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Akan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Akan-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "akan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Akan"}
                   {:rdf/language "fr",
                    :rdf/value    "akan"}
                   {:rdf/language "de",
                    :rdf/value    "Akan-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ak,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/aka :loc.iso639-2/aka],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ak",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Akan-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "akan"}
                    {:rdf/language "en",
                     :rdf/value    "Akan"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Akan-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "akan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Akan"}}]})

(def am
  "Amharic"
  {:db/ident :loc.iso639-1/am,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Amharisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "amharique"}
                                {:rdf/language "en",
                                 :rdf/value    "Amharic"}],
   :madsrdf/code "am",
   :madsrdf/hasExactExternalAuthority [:loc.languages/amh :loc.iso639-2/amh],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Amharisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Amharic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "amharique"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Amharic"}
                   {:rdf/language "de",
                    :rdf/value    "Amharisch"}
                   {:rdf/language "fr",
                    :rdf/value    "amharique"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/am,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/amh :loc.iso639-2/amh],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "am",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Amharisch"}
                    {:rdf/language "fr",
                     :rdf/value    "amharique"}
                    {:rdf/language "en",
                     :rdf/value    "Amharic"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Amharic"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "amharique"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Amharisch"}}]})

(def an
  "Aragonese"
  {:db/ident :loc.iso639-1/an,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2002-12-23T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Aragonesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "aragonais"}
                                {:rdf/language "en",
                                 :rdf/value    "Aragonese"}],
   :madsrdf/code "an",
   :madsrdf/hasExactExternalAuthority [:loc.languages/arg :loc.iso639-2/arg],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Aragonesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "aragonais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Aragonese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Aragonesisch"}
                   {:rdf/language "en",
                    :rdf/value    "Aragonese"}
                   {:rdf/language "fr",
                    :rdf/value    "aragonais"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2002-12-23T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/an,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/arg :loc.languages/arg],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "an",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Aragonesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "aragonais"}
                    {:rdf/language "en",
                     :rdf/value    "Aragonese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Aragonesisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "aragonais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Aragonese"}}]})

(def ar
  "Arabic"
  {:db/ident :loc.iso639-1/ar,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Arabisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "arabe"}
                                {:rdf/language "en",
                                 :rdf/value    "Arabic"}],
   :madsrdf/code "ar",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ara :loc.languages/ara],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Arabic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Arabisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "arabe"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Arabic"}
                   {:rdf/language "de",
                    :rdf/value    "Arabisch"}
                   {:rdf/language "fr",
                    :rdf/value    "arabe"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ar,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ara :loc.iso639-2/ara],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ar",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Arabisch"}
                    {:rdf/language "fr",
                     :rdf/value    "arabe"}
                    {:rdf/language "en",
                     :rdf/value    "Arabic"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Arabisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "arabe"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Arabic"}}]})

(def as
  "Assamese"
  {:db/ident :loc.iso639-1/as,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Assamesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "assamais"}
                                {:rdf/language "en",
                                 :rdf/value    "Assamese"}],
   :madsrdf/code "as",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/asm :loc.languages/asm],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Assamese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Assamesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "assamais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "assamais"}
                   {:rdf/language "en",
                    :rdf/value    "Assamese"}
                   {:rdf/language "de",
                    :rdf/value    "Assamesisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/as,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/asm :loc.iso639-2/asm],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "as",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Assamesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "assamais"}
                    {:rdf/language "en",
                     :rdf/value    "Assamese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Assamesisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "assamais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Assamese"}}]})

(def av
  "Avaric"
  {:db/ident :loc.iso639-1/av,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Awarisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "avar"}
                                {:rdf/language "en",
                                 :rdf/value    "Avaric"}],
   :madsrdf/code "av",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ava :loc.languages/ava],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Avaric"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "avar"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Awarisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Avaric"}
                   {:rdf/language "fr",
                    :rdf/value    "avar"}
                   {:rdf/language "de",
                    :rdf/value    "Awarisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/av,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ava :loc.iso639-2/ava],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "av",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Awarisch"}
                    {:rdf/language "fr",
                     :rdf/value    "avar"}
                    {:rdf/language "en",
                     :rdf/value    "Avaric"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Avaric"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Awarisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "avar"}}]})

(def ay
  "Aymara"
  {:db/ident :loc.iso639-1/ay,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Aymará-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "aymara"}
                                {:rdf/language "en",
                                 :rdf/value    "Aymara"}],
   :madsrdf/code "ay",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/aym :loc.languages/aym],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Aymara"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Aymará-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "aymara"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "aymara"}
                   {:rdf/language "de",
                    :rdf/value    "Aymará-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Aymara"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ay,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/aym :loc.iso639-2/aym],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ay",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Aymará-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "aymara"}
                    {:rdf/language "en",
                     :rdf/value    "Aymara"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "aymara"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Aymará-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Aymara"}}]})

(def az
  "Azerbaijani"
  {:db/ident :loc.iso639-1/az,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Aserbeidschanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "azéri"}
                                {:rdf/language "en",
                                 :rdf/value    "Azerbaijani"}],
   :madsrdf/code "az",
   :madsrdf/hasExactExternalAuthority [:loc.languages/aze :loc.iso639-2/aze],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Aserbeidschanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "azéri"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Azerbaijani"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Aserbeidschanisch"}
                   {:rdf/language "en",
                    :rdf/value    "Azerbaijani"}
                   {:rdf/language "fr",
                    :rdf/value    "azéri"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/az,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/aze :loc.iso639-2/aze],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "az",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Aserbeidschanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "azéri"}
                    {:rdf/language "en",
                     :rdf/value    "Azerbaijani"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Aserbeidschanisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Azerbaijani"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "azéri"}}]})

(def ba
  "Bashkir"
  {:db/ident :loc.iso639-1/ba,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Baschkirisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "bachkir"}
                                {:rdf/language "en",
                                 :rdf/value    "Bashkir"}],
   :madsrdf/code "ba",
   :madsrdf/hasExactExternalAuthority [:loc.languages/bak :loc.iso639-2/bak],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "bachkir"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Baschkirisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Bashkir"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "bachkir"}
                   {:rdf/language "en",
                    :rdf/value    "Bashkir"}
                   {:rdf/language "de",
                    :rdf/value    "Baschkirisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ba,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/bak :loc.languages/bak],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ba",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Baschkirisch"}
                    {:rdf/language "fr",
                     :rdf/value    "bachkir"}
                    {:rdf/language "en",
                     :rdf/value    "Bashkir"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Baschkirisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bashkir"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "bachkir"}}]})

(def be
  "Belarusian"
  {:db/ident :loc.iso639-1/be,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Weißrussisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "biélorusse"}
                                {:rdf/language "en",
                                 :rdf/value    "Belarusian"}],
   :madsrdf/code "be",
   :madsrdf/hasExactExternalAuthority [:loc.languages/bel :loc.iso639-2/bel],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "biélorusse"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Weißrussisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Belarusian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Belarusian"}
                   {:rdf/language "fr",
                    :rdf/value    "biélorusse"}
                   {:rdf/language "de",
                    :rdf/value    "Weißrussisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/be,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/bel :loc.iso639-2/bel],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "be",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Weißrussisch"}
                    {:rdf/language "fr",
                     :rdf/value    "biélorusse"}
                    {:rdf/language "en",
                     :rdf/value    "Belarusian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Belarusian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "biélorusse"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Weißrussisch"}}]})

(def bg
  "Bulgarian"
  {:db/ident :loc.iso639-1/bg,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Bulgarisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "bulgare"}
                                {:rdf/language "en",
                                 :rdf/value    "Bulgarian"}],
   :madsrdf/code "bg",
   :madsrdf/hasExactExternalAuthority [:loc.languages/bul :loc.iso639-2/bul],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "bulgare"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Bulgarian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Bulgarisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "bulgare"}
                   {:rdf/language "en",
                    :rdf/value    "Bulgarian"}
                   {:rdf/language "de",
                    :rdf/value    "Bulgarisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/bg,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/bul :loc.languages/bul],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "bg",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Bulgarisch"}
                    {:rdf/language "fr",
                     :rdf/value    "bulgare"}
                    {:rdf/language "en",
                     :rdf/value    "Bulgarian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "bulgare"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Bulgarisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bulgarian"}}]})

(def bh
  "Bihari languages"
  {:db/ident :loc.iso639-1/bh,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2009-09-01T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Name change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Bihari (Andere)"}
                                {:rdf/language "fr",
                                 :rdf/value    "langues biharis"}
                                {:rdf/language "en",
                                 :rdf/value    "Bihari languages"}],
   :madsrdf/code "bh",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/bih :loc.languages/bih],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Bihari (Andere)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value "langues biharis"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Bihari languages"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Changed from Bihari; bihari"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Bihari languages"}
                   {:rdf/language "fr",
                    :rdf/value    "langues biharis"}
                   {:rdf/language "de",
                    :rdf/value    "Bihari (Andere)"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2009-09-01T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/bh,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/bh,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/bih :loc.iso639-2/bih],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Changed from Bihari; bihari"},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "bh",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Bihari (Andere)"}
                    {:rdf/language "fr",
                     :rdf/value    "langues biharis"}
                    {:rdf/language "en",
                     :rdf/value    "Bihari languages"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "langues biharis"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Bihari (Andere)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bihari languages"}}]})

(def bi
  "Bislama"
  {:db/ident :loc.iso639-1/bi,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Beach-la-mar"}
                                {:rdf/language "fr",
                                 :rdf/value    "bichlamar"}
                                {:rdf/language "en",
                                 :rdf/value    "Bislama"}],
   :madsrdf/code "bi",
   :madsrdf/hasExactExternalAuthority [:loc.languages/bis :loc.iso639-2/bis],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Beach-la-mar"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "bichlamar"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Bislama"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "bichlamar"}
                   {:rdf/language "en",
                    :rdf/value    "Bislama"}
                   {:rdf/language "de",
                    :rdf/value    "Beach-la-mar"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/bi,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/bis :loc.iso639-2/bis],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "bi",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Beach-la-mar"}
                    {:rdf/language "fr",
                     :rdf/value    "bichlamar"}
                    {:rdf/language "en",
                     :rdf/value    "Bislama"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "bichlamar"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bislama"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Beach-la-mar"}}]})

(def bm
  "Bambara"
  {:db/ident :loc.iso639-1/bm,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Bambara-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "bambara"}
                                {:rdf/language "en",
                                 :rdf/value    "Bambara"}],
   :madsrdf/code "bm",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/bam :loc.languages/bam],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Bambara-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Bambara"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "bambara"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Bambara-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "bambara"}
                   {:rdf/language "en",
                    :rdf/value    "Bambara"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/bm,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/bam :loc.languages/bam],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "bm",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Bambara-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "bambara"}
                    {:rdf/language "en",
                     :rdf/value    "Bambara"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bambara"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Bambara-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "bambara"}}]})

(def bn
  "Bengali"
  {:db/ident :loc.iso639-1/bn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Bengali"}
                                {:rdf/language "fr",
                                 :rdf/value    "bengali"}
                                {:rdf/language "en",
                                 :rdf/value    "Bengali"}],
   :madsrdf/code "bn",
   :madsrdf/hasExactExternalAuthority [:loc.languages/ben :loc.iso639-2/ben],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "bengali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Bengali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Bengali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "bengali"}
                   {:rdf/language "de",
                    :rdf/value    "Bengali"}
                   {:rdf/language "en",
                    :rdf/value    "Bengali"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/bn,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ben :loc.languages/ben],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "bn",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Bengali"}
                    {:rdf/language "fr",
                     :rdf/value    "bengali"}
                    {:rdf/language "en",
                     :rdf/value    "Bengali"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bengali"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Bengali"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "bengali"}}]})

(def bo
  "Tibetan"
  {:db/ident :loc.iso639-1/bo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tibetisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "tibétain"}
                                {:rdf/language "en",
                                 :rdf/value    "Tibetan"}],
   :madsrdf/code "bo",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/bod :loc.iso639-2/tib :loc.languages/tib],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tibetan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tibetisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tibétain"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Tibetan"}
                   {:rdf/language "de",
                    :rdf/value    "Tibetisch"}
                   {:rdf/language "fr",
                    :rdf/value    "tibétain"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/bo,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/bod :loc.languages/tib :loc.iso639-2/tib],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "bo",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tibetisch"}
                    {:rdf/language "fr",
                     :rdf/value    "tibétain"}
                    {:rdf/language "en",
                     :rdf/value    "Tibetan"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tibetan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tibetisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tibétain"}}]})

(def br
  "Breton"
  {:db/ident :loc.iso639-1/br,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Bretonisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "breton"}
                                {:rdf/language "en",
                                 :rdf/value    "Breton"}],
   :madsrdf/code "br",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/bre :loc.languages/bre],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Bretonisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Breton"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "breton"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Breton"}
                   {:rdf/language "fr",
                    :rdf/value    "breton"}
                   {:rdf/language "de",
                    :rdf/value    "Bretonisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/br,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/bre :loc.iso639-2/bre],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "br",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Bretonisch"}
                    {:rdf/language "fr",
                     :rdf/value    "breton"}
                    {:rdf/language "en",
                     :rdf/value    "Breton"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "breton"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Bretonisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Breton"}}]})

(def bs
  "Bosnian"
  {:db/ident :loc.iso639-1/bs,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Bosnisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "bosniaque"}
                                {:rdf/language "en",
                                 :rdf/value    "Bosnian"}],
   :madsrdf/code "bs",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/bos :loc.languages/bos],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "bosniaque"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Bosnian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Bosnisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Bosnian"}
                   {:rdf/language "fr",
                    :rdf/value    "bosniaque"}
                   {:rdf/language "de",
                    :rdf/value    "Bosnisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/bs,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/bos :loc.iso639-2/bos],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "bs",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Bosnisch"}
                    {:rdf/language "fr",
                     :rdf/value    "bosniaque"}
                    {:rdf/language "en",
                     :rdf/value    "Bosnian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bosnian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "bosniaque"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Bosnisch"}}]})

(def ca
  "Catalan | Valencian"
  {:db/ident :loc.iso639-1/ca,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Katalanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "catalan |  valencien"}
                                {:rdf/language "en",
                                 :rdf/value    "Catalan |  Valencian"}],
   :madsrdf/code "ca",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/cat :loc.languages/cat],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Catalan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "valencien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Valencian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "catalan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Katalanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "catalan"}
                   {:rdf/language "fr",
                    :rdf/value    "valencien"}
                   {:rdf/language "en",
                    :rdf/value    "Catalan"}
                   {:rdf/language "en",
                    :rdf/value    "Valencian"}
                   {:rdf/language "de",
                    :rdf/value    "Katalanisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ca,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/cat :loc.iso639-2/cat],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ca",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Katalanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "catalan | valencien"}
                    {:rdf/language "en",
                     :rdf/value    "Catalan | Valencian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Valencian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "catalan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Catalan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Katalanisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "valencien"}}]})

(def ce
  "Chechen"
  {:db/ident :loc.iso639-1/ce,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tschetschenisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "tchétchène"}
                                {:rdf/language "en",
                                 :rdf/value    "Chechen"}],
   :madsrdf/code "ce",
   :madsrdf/hasExactExternalAuthority [:loc.languages/che :loc.iso639-2/che],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Chechen"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Tschetschenisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tchétchène"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Chechen"}
                   {:rdf/language "de",
                    :rdf/value    "Tschetschenisch"}
                   {:rdf/language "fr",
                    :rdf/value    "tchétchène"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ce,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/che :loc.languages/che],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ce",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tschetschenisch"}
                    {:rdf/language "fr",
                     :rdf/value    "tchétchène"}
                    {:rdf/language "en",
                     :rdf/value    "Chechen"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tschetschenisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Chechen"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tchétchène"}}]})

(def ch
  "Chamorro"
  {:db/ident :loc.iso639-1/ch,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Chamorro-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "chamorro"}
                                {:rdf/language "en",
                                 :rdf/value    "Chamorro"}],
   :madsrdf/code "ch",
   :madsrdf/hasExactExternalAuthority [:loc.languages/cha :loc.iso639-2/cha],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Chamorro"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "chamorro"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Chamorro-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "chamorro"}
                   {:rdf/language "de",
                    :rdf/value    "Chamorro-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Chamorro"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ch,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/cha :loc.iso639-2/cha],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ch",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Chamorro-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "chamorro"}
                    {:rdf/language "en",
                     :rdf/value    "Chamorro"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "chamorro"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Chamorro"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Chamorro-Sprache"}}]})

(def co
  "Corsican"
  {:db/ident :loc.iso639-1/co,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Korsisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "corse"}
                                {:rdf/language "en",
                                 :rdf/value    "Corsican"}],
   :madsrdf/code "co",
   :madsrdf/hasExactExternalAuthority [:loc.languages/cos :loc.iso639-2/cos],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Korsisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "corse"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Corsican"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Korsisch"}
                   {:rdf/language "en",
                    :rdf/value    "Corsican"}
                   {:rdf/language "fr",
                    :rdf/value    "corse"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/co,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/cos :loc.languages/cos],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "co",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Korsisch"}
                    {:rdf/language "fr",
                     :rdf/value    "corse"}
                    {:rdf/language "en",
                     :rdf/value    "Corsican"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Korsisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Corsican"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "corse"}}]})

(def cr
  "Cree"
  {:db/ident :loc.iso639-1/cr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Cree-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "cree"}
                                {:rdf/language "en",
                                 :rdf/value    "Cree"}],
   :madsrdf/code "cr",
   :madsrdf/hasExactExternalAuthority [:loc.languages/cre :loc.iso639-2/cre],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "cree"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Cree-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Cree"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Cree"}
                   {:rdf/language "de",
                    :rdf/value    "Cree-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "cree"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/cr,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/cre :loc.languages/cre],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "cr",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Cree-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "cree"}
                    {:rdf/language "en",
                     :rdf/value    "Cree"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Cree"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "cree"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Cree-Sprache"}}]})

(def cs
  "Czech"
  {:db/ident :loc.iso639-1/cs,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tschechisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "tchèque"}
                                {:rdf/language "en",
                                 :rdf/value    "Czech"}],
   :madsrdf/code "cs",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/ces :loc.iso639-2/cze :loc.languages/cze],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Czech"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tschechisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tchèque"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Tschechisch"}
                   {:rdf/language "fr",
                    :rdf/value    "tchèque"}
                   {:rdf/language "en",
                    :rdf/value    "Czech"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/cs,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/cze :loc.iso639-2/ces :loc.languages/cze],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "cs",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tschechisch"}
                    {:rdf/language "fr",
                     :rdf/value    "tchèque"}
                    {:rdf/language "en",
                     :rdf/value    "Czech"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tchèque"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Czech"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tschechisch"}}]})

(def cu
  "Church Slavic | Old Slavonic | Church Slavonic | Old Bulgarian | Old Church Slavonic"
  {:db/ident :loc.iso639-1/cu,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   [{:rdf/language "de",
     :rdf/value    "Kirchenslawisch"}
    {:rdf/language "fr",
     :rdf/value
     "slavon d'église |  vieux slave |  slavon liturgique |  vieux bulgare"}
    {:rdf/language "en",
     :rdf/value
     "Church Slavic |  Old Slavonic |  Church Slavonic |  Old Bulgarian |  Old Church Slavonic"}],
   :madsrdf/code "cu",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/chu :loc.languages/chu],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Old Slavonic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Kirchenslawisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value "slavon d'église"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "vieux slave"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value "slavon liturgique"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Old Church Slavonic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Old Bulgarian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Church Slavic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "vieux bulgare"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Church Slavonic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Old Slavonic"}
                   {:rdf/language "fr",
                    :rdf/value    "vieux bulgare"}
                   {:rdf/language "en",
                    :rdf/value    "Old Church Slavonic"}
                   {:rdf/language "en",
                    :rdf/value    "Old Bulgarian"}
                   {:rdf/language "fr",
                    :rdf/value    "slavon liturgique"}
                   {:rdf/language "en",
                    :rdf/value    "Church Slavic"}
                   {:rdf/language "de",
                    :rdf/value    "Kirchenslawisch"}
                   {:rdf/language "en",
                    :rdf/value    "Church Slavonic"}
                   {:rdf/language "fr",
                    :rdf/value    "slavon d'église"}
                   {:rdf/language "fr",
                    :rdf/value    "vieux slave"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/cu,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/chu :loc.iso639-2/chu],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "cu",
   :skos/prefLabel
   [{:rdf/language "de",
     :rdf/value    "Kirchenslawisch"}
    {:rdf/language "fr",
     :rdf/value
     "slavon d'église | vieux slave | slavon liturgique | vieux bulgare"}
    {:rdf/language "en",
     :rdf/value
     "Church Slavic | Old Slavonic | Church Slavonic | Old Bulgarian | Old Church Slavonic"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "vieux slave"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "vieux bulgare"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "slavon liturgique"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "slavon d'église"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Church Slavonic"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kirchenslawisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Church Slavic"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Old Church Slavonic"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Old Slavonic"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Old Bulgarian"}}]})

(def cv
  "Chuvash"
  {:db/ident :loc.iso639-1/cv,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tschuwaschisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "tchouvache"}
                                {:rdf/language "en",
                                 :rdf/value    "Chuvash"}],
   :madsrdf/code "cv",
   :madsrdf/hasExactExternalAuthority [:loc.languages/chv :loc.iso639-2/chv],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tschuwaschisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Chuvash"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tchouvache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Tschuwaschisch"}
                   {:rdf/language "fr",
                    :rdf/value    "tchouvache"}
                   {:rdf/language "en",
                    :rdf/value    "Chuvash"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/cv,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/chv :loc.languages/chv],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "cv",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tschuwaschisch"}
                    {:rdf/language "fr",
                     :rdf/value    "tchouvache"}
                    {:rdf/language "en",
                     :rdf/value    "Chuvash"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Chuvash"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tschuwaschisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tchouvache"}}]})

(def cy
  "Welsh"
  {:db/ident :loc.iso639-1/cy,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kymrisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "gallois"}
                                {:rdf/language "en",
                                 :rdf/value    "Welsh"}],
   :madsrdf/code "cy",
   :madsrdf/hasExactExternalAuthority
   [:loc.languages/wel :loc.iso639-2/cym :loc.iso639-2/wel],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "gallois"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kymrisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Welsh"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "gallois"}
                   {:rdf/language "de",
                    :rdf/value    "Kymrisch"}
                   {:rdf/language "en",
                    :rdf/value    "Welsh"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/cy,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/cym :loc.languages/wel :loc.iso639-2/wel],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "cy",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kymrisch"}
                    {:rdf/language "fr",
                     :rdf/value    "gallois"}
                    {:rdf/language "en",
                     :rdf/value    "Welsh"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "gallois"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kymrisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Welsh"}}]})

(def da
  "Danish"
  {:db/ident :loc.iso639-1/da,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Dänisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "danois"}
                                {:rdf/language "en",
                                 :rdf/value    "Danish"}],
   :madsrdf/code "da",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/dan :loc.languages/dan],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "danois"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Dänisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Danish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "danois"}
                   {:rdf/language "en",
                    :rdf/value    "Danish"}
                   {:rdf/language "de",
                    :rdf/value    "Dänisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/da,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/dan :loc.iso639-2/dan],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "da",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Dänisch"}
                    {:rdf/language "fr",
                     :rdf/value    "danois"}
                    {:rdf/language "en",
                     :rdf/value    "Danish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Danish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Dänisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "danois"}}]})

(def de
  "German"
  {:db/ident :loc.iso639-1/de,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Deutsch"}
                                {:rdf/language "fr",
                                 :rdf/value    "allemand"}
                                {:rdf/language "en",
                                 :rdf/value    "German"}],
   :madsrdf/code "de",
   :madsrdf/hasExactExternalAuthority
   [:loc.languages/ger :loc.iso639-2/ger :loc.iso639-2/deu],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Deutsch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "German"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "allemand"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Deutsch"}
                   {:rdf/language "en",
                    :rdf/value    "German"}
                   {:rdf/language "fr",
                    :rdf/value    "allemand"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/de,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ger :loc.languages/ger :loc.iso639-2/deu],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "de",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Deutsch"}
                    {:rdf/language "fr",
                     :rdf/value    "allemand"}
                    {:rdf/language "en",
                     :rdf/value    "German"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "allemand"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Deutsch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "German"}}]})

(def dv
  "Divehi | Dhivehi | Maldivian"
  {:db/ident :loc.iso639-1/dv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1999-08-16T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2006-06-07T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Variant added"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Maledivisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "maldivien"}
                                {:rdf/language "en",
                                 :rdf/value "Divehi |  Dhivehi |  Maldivian"}],
   :madsrdf/code "dv",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/div :loc.languages/div],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Maledivisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Maldivian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "maldivien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Divehi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Dhivehi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value
     "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included.\r\nDhivehi, Maldivian added 2006-06-07"}
    {:rdf/language "en",
     :rdf/value    "Dhivehi, Maldivian added"}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Maldivian"}
                   {:rdf/language "de",
                    :rdf/value    "Maledivisch"}
                   {:rdf/language "en",
                    :rdf/value    "Divehi"}
                   {:rdf/language "en",
                    :rdf/value    "Dhivehi"}
                   {:rdf/language "fr",
                    :rdf/value    "maldivien"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2006-06-07T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/dv,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/dv,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/div :loc.iso639-2/div],
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Dhivehi, Maldivian added"}
    {:rdf/language "en",
     :rdf/value
     "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included. Dhivehi, Maldivian added 2006-06-07"}],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "dv",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Maledivisch"}
                    {:rdf/language "fr",
                     :rdf/value    "maldivien"}
                    {:rdf/language "en",
                     :rdf/value    "Divehi | Dhivehi | Maldivian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Divehi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Maledivisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Dhivehi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "maldivien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Maldivian"}}]})

(def dz
  "Dzongkha"
  {:db/ident :loc.iso639-1/dz,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Dzongkha"}
                                {:rdf/language "fr",
                                 :rdf/value    "dzongkha"}
                                {:rdf/language "en",
                                 :rdf/value    "Dzongkha"}],
   :madsrdf/code "dz",
   :madsrdf/hasExactExternalAuthority [:loc.languages/dzo :loc.iso639-2/dzo],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "dzongkha"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Dzongkha"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Dzongkha"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "dzongkha"}
                   {:rdf/language "de",
                    :rdf/value    "Dzongkha"}
                   {:rdf/language "en",
                    :rdf/value    "Dzongkha"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/dz,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/dzo :loc.languages/dzo],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "dz",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Dzongkha"}
                    {:rdf/language "fr",
                     :rdf/value    "dzongkha"}
                    {:rdf/language "en",
                     :rdf/value    "Dzongkha"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "dzongkha"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Dzongkha"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Dzongkha"}}]})

(def ee
  "Ewe"
  {:db/ident :loc.iso639-1/ee,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ewe-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "éwé"}
                                {:rdf/language "en",
                                 :rdf/value    "Ewe"}],
   :madsrdf/code "ee",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ewe :loc.languages/ewe],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "éwé"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ewe-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ewe"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Ewe-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "éwé"}
                   {:rdf/language "en",
                    :rdf/value    "Ewe"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ee,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ewe :loc.languages/ewe],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ee",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ewe-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "éwé"}
                    {:rdf/language "en",
                     :rdf/value    "Ewe"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ewe"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ewe-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "éwé"}}]})

(def el
  "Greek, Modern (1453-)"
  {:db/ident :loc.iso639-1/el,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Neugriechisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "grec moderne (après 1453)"}
                                {:rdf/language "en",
                                 :rdf/value    "Greek, Modern (1453-)"}],
   :madsrdf/code "el",
   :madsrdf/hasExactExternalAuthority
   [:loc.languages/gre :loc.iso639-2/ell :loc.iso639-2/gre],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "de",
                            :rdf/value    "Neugriechisch"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Greek, Modern (1453-)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "fr",
                            :rdf/value    "grec moderne (après 1453)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "grec moderne (après 1453)"}
                   {:rdf/language "de",
                    :rdf/value    "Neugriechisch"}
                   {:rdf/language "en",
                    :rdf/value    "Greek, Modern (1453-)"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/el,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/gre :loc.languages/gre :loc.iso639-2/ell],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "el",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Neugriechisch"}
                    {:rdf/language "fr",
                     :rdf/value    "grec moderne (après 1453)"}
                    {:rdf/language "en",
                     :rdf/value    "Greek, Modern (1453-)"}],
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "de",
                          :rdf/value    "Neugriechisch"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "fr",
                          :rdf/value    "grec moderne (après 1453)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Greek, Modern (1453-)"}}]})

(def en
  "English"
  {:db/ident :loc.iso639-1/en,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Englisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "anglais"}
                                {:rdf/language "en",
                                 :rdf/value    "English"}],
   :madsrdf/code "en",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/eng :loc.languages/eng],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Englisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "anglais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "English"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "English"}
                   {:rdf/language "fr",
                    :rdf/value    "anglais"}
                   {:rdf/language "de",
                    :rdf/value    "Englisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/en,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/eng :loc.languages/eng],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "en",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Englisch"}
                    {:rdf/language "fr",
                     :rdf/value    "anglais"}
                    {:rdf/language "en",
                     :rdf/value    "English"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "anglais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Englisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "English"}}]})

(def eo
  "Esperanto"
  {:db/ident :loc.iso639-1/eo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Esperanto"}
                                {:rdf/language "fr",
                                 :rdf/value    "espéranto"}
                                {:rdf/language "en",
                                 :rdf/value    "Esperanto"}],
   :madsrdf/code "eo",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/epo :loc.languages/epo],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Esperanto"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Esperanto"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "espéranto"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Esperanto"}
                   {:rdf/language "en",
                    :rdf/value    "Esperanto"}
                   {:rdf/language "fr",
                    :rdf/value    "espéranto"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/eo,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/epo :loc.languages/epo],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "eo",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Esperanto"}
                    {:rdf/language "fr",
                     :rdf/value    "espéranto"}
                    {:rdf/language "en",
                     :rdf/value    "Esperanto"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "espéranto"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Esperanto"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Esperanto"}}]})

(def es
  "Spanish | Castilian"
  {:db/ident :loc.iso639-1/es,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Spanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "espagnol |  castillan"}
                                {:rdf/language "en",
                                 :rdf/value    "Spanish |  Castilian"}],
   :madsrdf/code "es",
   :madsrdf/hasExactExternalAuthority [:loc.languages/spa :loc.iso639-2/spa],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "espagnol"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Castilian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Spanish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "castillan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Spanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Castilian"}
                   {:rdf/language "de",
                    :rdf/value    "Spanisch"}
                   {:rdf/language "fr",
                    :rdf/value    "castillan"}
                   {:rdf/language "fr",
                    :rdf/value    "espagnol"}
                   {:rdf/language "en",
                    :rdf/value    "Spanish"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/es,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/spa :loc.iso639-2/spa],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "es",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Spanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "espagnol | castillan"}
                    {:rdf/language "en",
                     :rdf/value    "Spanish | Castilian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Spanisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "espagnol"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Castilian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "castillan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Spanish"}}]})

(def et
  "Estonian"
  {:db/ident :loc.iso639-1/et,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Estnisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "estonien"}
                                {:rdf/language "en",
                                 :rdf/value    "Estonian"}],
   :madsrdf/code "et",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/est :loc.languages/est],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Estnisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "estonien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Estonian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "estonien"}
                   {:rdf/language "en",
                    :rdf/value    "Estonian"}
                   {:rdf/language "de",
                    :rdf/value    "Estnisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/et,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/est :loc.languages/est],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "et",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Estnisch"}
                    {:rdf/language "fr",
                     :rdf/value    "estonien"}
                    {:rdf/language "en",
                     :rdf/value    "Estonian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Estonian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "estonien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Estnisch"}}]})

(def eu
  "Basque"
  {:db/ident :loc.iso639-1/eu,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Baskisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "basque"}
                                {:rdf/language "en",
                                 :rdf/value    "Basque"}],
   :madsrdf/code "eu",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/eus :loc.languages/baq :loc.iso639-2/baq],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Baskisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "basque"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Basque"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Basque"}
                   {:rdf/language "de",
                    :rdf/value    "Baskisch"}
                   {:rdf/language "fr",
                    :rdf/value    "basque"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/eu,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/eus :loc.languages/baq :loc.iso639-2/baq],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "eu",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Baskisch"}
                    {:rdf/language "fr",
                     :rdf/value    "basque"}
                    {:rdf/language "en",
                     :rdf/value    "Basque"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "basque"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Baskisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Basque"}}]})

(def fa
  "Persian"
  {:db/ident :loc.iso639-1/fa,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Persisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "persan"}
                                {:rdf/language "en",
                                 :rdf/value    "Persian"}],
   :madsrdf/code "fa",
   :madsrdf/hasExactExternalAuthority
   [:loc.languages/per :loc.iso639-2/per :loc.iso639-2/fas],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Persisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Persian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "persan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Persisch"}
                   {:rdf/language "en",
                    :rdf/value    "Persian"}
                   {:rdf/language "fr",
                    :rdf/value    "persan"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/fa,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/per :loc.languages/per :loc.iso639-2/fas],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "fa",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Persisch"}
                    {:rdf/language "fr",
                     :rdf/value    "persan"}
                    {:rdf/language "en",
                     :rdf/value    "Persian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Persisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "persan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Persian"}}]})

(def ff
  "Fulah"
  {:db/ident :loc.iso639-1/ff,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ful"}
                                {:rdf/language "fr",
                                 :rdf/value    "peul"}
                                {:rdf/language "en",
                                 :rdf/value    "Fulah"}],
   :madsrdf/code "ff",
   :madsrdf/hasExactExternalAuthority [:loc.languages/ful :loc.iso639-2/ful],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ful"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "peul"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Fulah"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Ful"}
                   {:rdf/language "en",
                    :rdf/value    "Fulah"}
                   {:rdf/language "fr",
                    :rdf/value    "peul"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ff,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ful :loc.iso639-2/ful],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ff",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ful"}
                    {:rdf/language "fr",
                     :rdf/value    "peul"}
                    {:rdf/language "en",
                     :rdf/value    "Fulah"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Fulah"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ful"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "peul"}}]})

(def fi
  "Finnish"
  {:db/ident :loc.iso639-1/fi,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Finnisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "finnois"}
                                {:rdf/language "en",
                                 :rdf/value    "Finnish"}],
   :madsrdf/code "fi",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/fin :loc.languages/fin],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "finnois"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Finnisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Finnish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "finnois"}
                   {:rdf/language "de",
                    :rdf/value    "Finnisch"}
                   {:rdf/language "en",
                    :rdf/value    "Finnish"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/fi,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/fin :loc.iso639-2/fin],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "fi",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Finnisch"}
                    {:rdf/language "fr",
                     :rdf/value    "finnois"}
                    {:rdf/language "en",
                     :rdf/value    "Finnish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Finnisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "finnois"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Finnish"}}]})

(def fj
  "Fijian"
  {:db/ident :loc.iso639-1/fj,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Fidschi-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "fidjien"}
                                {:rdf/language "en",
                                 :rdf/value    "Fijian"}],
   :madsrdf/code "fj",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/fij :loc.languages/fij],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Fijian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Fidschi-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "fidjien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Fidschi-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Fijian"}
                   {:rdf/language "fr",
                    :rdf/value    "fidjien"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/fj,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/fij :loc.languages/fij],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "fj",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Fidschi-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "fidjien"}
                    {:rdf/language "en",
                     :rdf/value    "Fijian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "fidjien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Fijian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Fidschi-Sprache"}}]})

(def fo
  "Faroese"
  {:db/ident :loc.iso639-1/fo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Färöisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "féroïen"}
                                {:rdf/language "en",
                                 :rdf/value    "Faroese"}],
   :madsrdf/code "fo",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/fao :loc.languages/fao],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Faroese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "féroïen"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Färöisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Färöisch"}
                   {:rdf/language "fr",
                    :rdf/value    "féroïen"}
                   {:rdf/language "en",
                    :rdf/value    "Faroese"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/fo,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/fao :loc.languages/fao],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "fo",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Färöisch"}
                    {:rdf/language "fr",
                     :rdf/value    "féroïen"}
                    {:rdf/language "en",
                     :rdf/value    "Faroese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Färöisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "féroïen"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Faroese"}}]})

(def fr
  "French"
  {:db/ident :loc.iso639-1/fr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Französisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "français"}
                                {:rdf/language "en",
                                 :rdf/value    "French"}],
   :madsrdf/code "fr",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/fra :loc.iso639-2/fre :loc.languages/fre],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "French"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Französisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "français"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "French"}
                   {:rdf/language "fr",
                    :rdf/value    "français"}
                   {:rdf/language "de",
                    :rdf/value    "Französisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/fr,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/fra :loc.languages/fre :loc.iso639-2/fre],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "fr",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Französisch"}
                    {:rdf/language "fr",
                     :rdf/value    "français"}
                    {:rdf/language "en",
                     :rdf/value    "French"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Französisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "French"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "français"}}]})

(def fy
  "Western Frisian"
  {:db/ident :loc.iso639-1/fy,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2005-11-16T05:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Name change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Friesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "frison occidental"}
                                {:rdf/language "en",
                                 :rdf/value    "Western Frisian"}],
   :madsrdf/code "fy",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/fry :loc.languages/fry],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Friesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value "frison occidental"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Western Frisian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "Previous usage of code has been for Western Frisian, although language name was \"Frisian\""},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "frison occidental"}
                   {:rdf/language "de",
                    :rdf/value    "Friesisch"}
                   {:rdf/language "en",
                    :rdf/value    "Western Frisian"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/fy,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2005-11-16T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/fy,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/fry :loc.languages/fry],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "Previous usage of code has been for Western Frisian, although language name was \"Frisian\""},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "fy",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Friesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "frison occidental"}
                    {:rdf/language "en",
                     :rdf/value    "Western Frisian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Friesisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Western Frisian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value "frison occidental"}}]})

(def ga
  "Irish"
  {:db/ident :loc.iso639-1/ga,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Irisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "irlandais"}
                                {:rdf/language "en",
                                 :rdf/value    "Irish"}],
   :madsrdf/code "ga",
   :madsrdf/hasExactExternalAuthority [:loc.languages/gle :loc.iso639-2/gle],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Irisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Irish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "irlandais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Irish"}
                   {:rdf/language "fr",
                    :rdf/value    "irlandais"}
                   {:rdf/language "de",
                    :rdf/value    "Irisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ga,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/gle :loc.iso639-2/gle],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ga",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Irisch"}
                    {:rdf/language "fr",
                     :rdf/value    "irlandais"}
                    {:rdf/language "en",
                     :rdf/value    "Irish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Irish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "irlandais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Irisch"}}]})

(def gd
  "Gaelic | Scottish Gaelic"
  {:db/ident :loc.iso639-1/gd,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Gälisch-Schottisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "gaélique |  gaélique écossais"}
                                {:rdf/language "en",
                                 :rdf/value    "Gaelic |  Scottish Gaelic"}],
   :madsrdf/code "gd",
   :madsrdf/hasExactExternalAuthority [:loc.languages/gla :loc.iso639-2/gla],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "gaélique"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Scottish Gaelic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value "gaélique écossais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value
                                                "Gälisch-Schottisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Gaelic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Gaelic"}
                   {:rdf/language "en",
                    :rdf/value    "Scottish Gaelic"}
                   {:rdf/language "de",
                    :rdf/value    "Gälisch-Schottisch"}
                   {:rdf/language "fr",
                    :rdf/value    "gaélique"}
                   {:rdf/language "fr",
                    :rdf/value    "gaélique écossais"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/gd,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/gla :loc.iso639-2/gla],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "gd",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Gälisch-Schottisch"}
                    {:rdf/language "fr",
                     :rdf/value    "gaélique | gaélique écossais"}
                    {:rdf/language "en",
                     :rdf/value    "Gaelic | Scottish Gaelic"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "gaélique"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Gaelic"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Gälisch-Schottisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "gaélique écossais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Scottish Gaelic"}}]})

(def gl
  "Galician"
  {:db/ident :loc.iso639-1/gl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2005-07-25T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Name change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Galicisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "galicien"}
                                {:rdf/language "en",
                                 :rdf/value    "Galician"}],
   :madsrdf/code "gl",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/glg :loc.languages/glg],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Galicisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "galicien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Galician"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "Incorrect form of English name (Gallegan) corrected"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "galicien"}
                   {:rdf/language "de",
                    :rdf/value    "Galicisch"}
                   {:rdf/language "en",
                    :rdf/value    "Galician"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/gl,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2005-07-25T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/gl,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/glg :loc.iso639-2/glg],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "Incorrect form of English name (Gallegan) corrected"},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "gl",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Galicisch"}
                    {:rdf/language "fr",
                     :rdf/value    "galicien"}
                    {:rdf/language "en",
                     :rdf/value    "Galician"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "galicien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Galician"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Galicisch"}}]})

(def gn
  "Guarani"
  {:db/ident :loc.iso639-1/gn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Guaraní-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "guarani"}
                                {:rdf/language "en",
                                 :rdf/value    "Guarani"}],
   :madsrdf/code "gn",
   :madsrdf/hasExactExternalAuthority [:loc.languages/grn :loc.iso639-2/grn],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "guarani"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Guaraní-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Guarani"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "guarani"}
                   {:rdf/language "en",
                    :rdf/value    "Guarani"}
                   {:rdf/language "de",
                    :rdf/value    "Guaraní-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/gn,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/grn :loc.languages/grn],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "gn",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Guaraní-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "guarani"}
                    {:rdf/language "en",
                     :rdf/value    "Guarani"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Guaraní-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "guarani"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Guarani"}}]})

(def gu
  "Gujarati"
  {:db/ident :loc.iso639-1/gu,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Gujarati-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "goudjrati"}
                                {:rdf/language "en",
                                 :rdf/value    "Gujarati"}],
   :madsrdf/code "gu",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/guj :loc.languages/guj],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Gujarati"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Gujarati-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "goudjrati"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "goudjrati"}
                   {:rdf/language "en",
                    :rdf/value    "Gujarati"}
                   {:rdf/language "de",
                    :rdf/value    "Gujarati-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/gu,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/guj :loc.iso639-2/guj],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "gu",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Gujarati-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "goudjrati"}
                    {:rdf/language "en",
                     :rdf/value    "Gujarati"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "goudjrati"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Gujarati-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Gujarati"}}]})

(def gv
  "Manx"
  {:db/ident :loc.iso639-1/gv,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1998-08-10T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Manx"}
                                {:rdf/language "fr",
                                 :rdf/value    "manx |  mannois"}
                                {:rdf/language "en",
                                 :rdf/value    "Manx"}],
   :madsrdf/code "gv",
   :madsrdf/hasExactExternalAuthority [:loc.languages/glv :loc.iso639-2/glv],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Manx"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Manx"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "manx"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "mannois"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "manx"}
                   {:rdf/language "de",
                    :rdf/value    "Manx"}
                   {:rdf/language "en",
                    :rdf/value    "Manx"}
                   {:rdf/language "fr",
                    :rdf/value    "mannois"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1998-08-10T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/gv,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/glv :loc.languages/glv],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "gv",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Manx"}
                    {:rdf/language "fr",
                     :rdf/value    "manx | mannois"}
                    {:rdf/language "en",
                     :rdf/value    "Manx"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Manx"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "manx"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Manx"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "mannois"}}]})

(def ha
  "Hausa"
  {:db/ident :loc.iso639-1/ha,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Haussa-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "haoussa"}
                                {:rdf/language "en",
                                 :rdf/value    "Hausa"}],
   :madsrdf/code "ha",
   :madsrdf/hasExactExternalAuthority [:loc.languages/hau :loc.iso639-2/hau],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "haoussa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Haussa-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Hausa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Hausa"}
                   {:rdf/language "fr",
                    :rdf/value    "haoussa"}
                   {:rdf/language "de",
                    :rdf/value    "Haussa-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ha,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/hau :loc.languages/hau],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ha",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Haussa-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "haoussa"}
                    {:rdf/language "en",
                     :rdf/value    "Hausa"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "haoussa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Haussa-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Hausa"}}]})

(def he
  "Hebrew"
  {:db/ident :loc.iso639-1/he,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1989-03-11T05:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Code change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Hebräisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "hébreu"}
                                {:rdf/language "en",
                                 :rdf/value    "Hebrew"}],
   :madsrdf/code "he",
   :madsrdf/hasExactExternalAuthority [:loc.languages/heb :loc.iso639-2/heb],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "hébreu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Hebräisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Hebrew"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :madsrdf/useFor :loc.iso639-1/iw,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "hébreu"}
                   {:rdf/language "en",
                    :rdf/value    "Hebrew"}
                   {:rdf/language "de",
                    :rdf/value    "Hebräisch"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "1989-03-11T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/he,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/he,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/heb :loc.languages/heb],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "he",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Hebräisch"}
                    {:rdf/language "fr",
                     :rdf/value    "hébreu"}
                    {:rdf/language "en",
                     :rdf/value    "Hebrew"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "hébreu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Hebrew"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Hebräisch"}}]})

(def hi
  "Hindi"
  {:db/ident :loc.iso639-1/hi,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Hindi"}
                                {:rdf/language "fr",
                                 :rdf/value    "hindi"}
                                {:rdf/language "en",
                                 :rdf/value    "Hindi"}],
   :madsrdf/code "hi",
   :madsrdf/hasExactExternalAuthority [:loc.languages/hin :loc.iso639-2/hin],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Hindi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Hindi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "hindi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "hindi"}
                   {:rdf/language "de",
                    :rdf/value    "Hindi"}
                   {:rdf/language "en",
                    :rdf/value    "Hindi"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/hi,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/hin :loc.languages/hin],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "hi",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Hindi"}
                    {:rdf/language "fr",
                     :rdf/value    "hindi"}
                    {:rdf/language "en",
                     :rdf/value    "Hindi"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Hindi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "hindi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Hindi"}}]})

(def ho
  "Hiri Motu"
  {:db/ident :loc.iso639-1/ho,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Hiri-Motu"}
                                {:rdf/language "fr",
                                 :rdf/value    "hiri motu"}
                                {:rdf/language "en",
                                 :rdf/value    "Hiri Motu"}],
   :madsrdf/code "ho",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/hmo :loc.languages/hmo],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Hiri-Motu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "hiri motu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Hiri Motu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Hiri Motu"}
                   {:rdf/language "fr",
                    :rdf/value    "hiri motu"}
                   {:rdf/language "de",
                    :rdf/value    "Hiri-Motu"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ho,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/hmo :loc.iso639-2/hmo],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ho",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Hiri-Motu"}
                    {:rdf/language "fr",
                     :rdf/value    "hiri motu"}
                    {:rdf/language "en",
                     :rdf/value    "Hiri Motu"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Hiri Motu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "hiri motu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Hiri-Motu"}}]})

(def hr
  "Croatian"
  {:db/ident :loc.iso639-1/hr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2008-06-28T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Code change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kroatisch "}
                                {:rdf/language "fr",
                                 :rdf/value    "croate"}
                                {:rdf/language "en",
                                 :rdf/value    "Croatian"}],
   :madsrdf/code "hr",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/hrv :loc.languages/hrv],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Croatian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "croate"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kroatisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Kroatisch"}
                   {:rdf/language "en",
                    :rdf/value    "Croatian"}
                   {:rdf/language "fr",
                    :rdf/value    "croate"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2008-06-28T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/hr,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/hr,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/hrv :loc.languages/hrv],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "hr",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kroatisch"}
                    {:rdf/language "fr",
                     :rdf/value    "croate"}
                    {:rdf/language "en",
                     :rdf/value    "Croatian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "croate"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Croatian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kroatisch"}}]})

(def ht
  "Haitian | Haitian Creole"
  {:db/ident :loc.iso639-1/ht,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2003-02-26T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Haïtien (Haiti-Kreolisch)"}
                                {:rdf/language "fr",
                                 :rdf/value    "haïtien |  créole haïtien"}
                                {:rdf/language "en",
                                 :rdf/value    "Haitian |  Haitian Creole"}],
   :madsrdf/code "ht",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/hat :loc.languages/hat],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Haitian Creole"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "créole haïtien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Haitian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "haïtien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value
                                                "Haïtien (Haiti-Kreolisch)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "créole haïtien"}
                   {:rdf/language "fr",
                    :rdf/value    "haïtien"}
                   {:rdf/language "en",
                    :rdf/value    "Haitian Creole"}
                   {:rdf/language "de",
                    :rdf/value    "Haïtien (Haiti-Kreolisch)"}
                   {:rdf/language "en",
                    :rdf/value    "Haitian"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2003-02-26T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ht,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/hat :loc.languages/hat],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ht",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Haïtien (Haiti-Kreolisch)"}
                    {:rdf/language "fr",
                     :rdf/value    "haïtien | créole haïtien"}
                    {:rdf/language "en",
                     :rdf/value    "Haitian | Haitian Creole"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "haïtien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Haitian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "créole haïtien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Haitian Creole"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value
                                           "Haïtien (Haiti-Kreolisch)"}}]})

(def hu
  "Hungarian"
  {:db/ident :loc.iso639-1/hu,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ungarisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "hongrois"}
                                {:rdf/language "en",
                                 :rdf/value    "Hungarian"}],
   :madsrdf/code "hu",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/hun :loc.languages/hun],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Hungarian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ungarisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "hongrois"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Ungarisch"}
                   {:rdf/language "fr",
                    :rdf/value    "hongrois"}
                   {:rdf/language "en",
                    :rdf/value    "Hungarian"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/hu,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/hun :loc.languages/hun],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "hu",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ungarisch"}
                    {:rdf/language "fr",
                     :rdf/value    "hongrois"}
                    {:rdf/language "en",
                     :rdf/value    "Hungarian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ungarisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Hungarian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "hongrois"}}]})

(def hy
  "Armenian"
  {:db/ident :loc.iso639-1/hy,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Armenisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "arménien"}
                                {:rdf/language "en",
                                 :rdf/value    "Armenian"}],
   :madsrdf/code "hy",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/arm :loc.languages/arm :loc.iso639-2/hye],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "arménien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Armenisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Armenian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Armenisch"}
                   {:rdf/language "en",
                    :rdf/value    "Armenian"}
                   {:rdf/language "fr",
                    :rdf/value    "arménien"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/hy,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/hye :loc.iso639-2/arm :loc.languages/arm],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "hy",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Armenisch"}
                    {:rdf/language "fr",
                     :rdf/value    "arménien"}
                    {:rdf/language "en",
                     :rdf/value    "Armenian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Armenian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Armenisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "arménien"}}]})

(def hz
  "Herero"
  {:db/ident :loc.iso639-1/hz,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Herero-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "herero"}
                                {:rdf/language "en",
                                 :rdf/value    "Herero"}],
   :madsrdf/code "hz",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/her :loc.languages/her],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Herero-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "herero"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Herero"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Herero-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "herero"}
                   {:rdf/language "en",
                    :rdf/value    "Herero"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/hz,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/her :loc.languages/her],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "hz",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Herero-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "herero"}
                    {:rdf/language "en",
                     :rdf/value    "Herero"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Herero"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "herero"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Herero-Sprache"}}]})

(def ia
  "Interlingua (International Auxiliary Language Association)"
  {:db/ident :loc.iso639-1/ia,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   [{:rdf/language "de",
     :rdf/value    "Interlingua"}
    {:rdf/language "fr",
     :rdf/value    "interlingua (langue auxiliaire internationale)"}
    {:rdf/language "en",
     :rdf/value "Interlingua (International Auxiliary Language Association)"}],
   :madsrdf/code "ia",
   :madsrdf/hasExactExternalAuthority [:loc.languages/ina :loc.iso639-2/ina],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel
     {:rdf/language "en",
      :rdf/value "Interlingua (International Auxiliary Language Association)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "de",
                            :rdf/value    "Interlingua"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "fr",
                            :rdf/value
                            "interlingua (langue auxiliaire internationale)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel
   [{:rdf/language "fr",
     :rdf/value    "interlingua (langue auxiliaire internationale)"}
    {:rdf/language "en",
     :rdf/value    "Interlingua (International Auxiliary Language Association)"}
    {:rdf/language "de",
     :rdf/value    "Interlingua"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ia,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ina :loc.iso639-2/ina],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ia",
   :skos/prefLabel
   [{:rdf/language "de",
     :rdf/value    "Interlingua"}
    {:rdf/language "fr",
     :rdf/value    "interlingua (langue auxiliaire internationale)"}
    {:rdf/language "en",
     :rdf/value "Interlingua (International Auxiliary Language Association)"}],
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "de",
                          :rdf/value    "Interlingua"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm
     {:rdf/language "en",
      :rdf/value "Interlingua (International Auxiliary Language Association)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "fr",
                          :rdf/value
                          "interlingua (langue auxiliaire internationale)"}}]})

(def id
  "Indonesian"
  {:db/ident :loc.iso639-1/id,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1989-03-11T05:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Code change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Bahasa Indonesia"}
                                {:rdf/language "fr",
                                 :rdf/value    "indonésien"}
                                {:rdf/language "en",
                                 :rdf/value    "Indonesian"}],
   :madsrdf/code "id",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ind :loc.languages/ind],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "indonésien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Bahasa Indonesia"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Indonesian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :madsrdf/useFor :loc.iso639-1/in,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "indonésien"}
                   {:rdf/language "de",
                    :rdf/value    "Bahasa Indonesia"}
                   {:rdf/language "en",
                    :rdf/value    "Indonesian"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/id,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "1989-03-11T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/id,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/ind :loc.languages/ind],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "id",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Bahasa Indonesia"}
                    {:rdf/language "fr",
                     :rdf/value    "indonésien"}
                    {:rdf/language "en",
                     :rdf/value    "Indonesian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Indonesian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "indonésien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Bahasa Indonesia"}}]})

(def ie
  "Interlingue | Occidental"
  {:db/ident :loc.iso639-1/ie,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2007-10-18T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Variant added"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Interlingue"}
                                {:rdf/language "fr",
                                 :rdf/value    "interlingue"}
                                {:rdf/language "en",
                                 :rdf/value    "Interlingue |  Occidental"}],
   :madsrdf/code "ie",
   :madsrdf/hasExactExternalAuthority [:loc.languages/ile :loc.iso639-2/ile],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Interlingue"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Interlingue"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "interlingue"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Occidental"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "interlingue"}
                   {:rdf/language "en",
                    :rdf/value    "Occidental"}
                   {:rdf/language "de",
                    :rdf/value    "Interlingue"}
                   {:rdf/language "en",
                    :rdf/value    "Interlingue"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2007-10-18T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ie,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ie,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/ile :loc.languages/ile],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ie",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Interlingue"}
                    {:rdf/language "fr",
                     :rdf/value    "interlingue"}
                    {:rdf/language "en",
                     :rdf/value    "Interlingue | Occidental"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Interlingue"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "interlingue"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Occidental"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Interlingue"}}]})

(def ig
  "Igbo"
  {:db/ident :loc.iso639-1/ig,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ibo-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "igbo"}
                                {:rdf/language "en",
                                 :rdf/value    "Igbo"}],
   :madsrdf/code "ig",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ibo :loc.languages/ibo],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ibo-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Igbo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "igbo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "igbo"}
                   {:rdf/language "de",
                    :rdf/value    "Ibo-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Igbo"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ig,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ibo :loc.languages/ibo],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ig",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ibo-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "igbo"}
                    {:rdf/language "en",
                     :rdf/value    "Igbo"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ibo-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "igbo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Igbo"}}]})

(def ii
  "Sichuan Yi | Nuosu"
  {:db/ident :loc.iso639-1/ii,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2007-10-18T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Variant added"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2002-10-14T04:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Lalo-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "yi de Sichuan"}
                                {:rdf/language "en",
                                 :rdf/value    "Sichuan Yi |  Nuosu"}],
   :madsrdf/code "ii",
   :madsrdf/hasExactExternalAuthority [:loc.languages/iii :loc.iso639-2/iii],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Nuosu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sichuan Yi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "yi de Sichuan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Lalo-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "yi de Sichuan"}
                   {:rdf/language "en",
                    :rdf/value    "Nuosu"}
                   {:rdf/language "en",
                    :rdf/value    "Sichuan Yi"}
                   {:rdf/language "de",
                    :rdf/value    "Lalo-Sprache"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2002-10-14T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ii,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2007-10-18T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ii,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/iii :loc.iso639-2/iii],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ii",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Lalo-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "yi de Sichuan"}
                    {:rdf/language "en",
                     :rdf/value    "Sichuan Yi | Nuosu"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sichuan Yi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Lalo-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nuosu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "yi de Sichuan"}}]})

(def ik
  "Inupiaq"
  {:db/ident :loc.iso639-1/ik,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Inupik"}
                                {:rdf/language "fr",
                                 :rdf/value    "inupiaq"}
                                {:rdf/language "en",
                                 :rdf/value    "Inupiaq"}],
   :madsrdf/code "ik",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ipk :loc.languages/ipk],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Inupik"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "inupiaq"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Inupiaq"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Inupiaq"}
                   {:rdf/language "fr",
                    :rdf/value    "inupiaq"}
                   {:rdf/language "de",
                    :rdf/value    "Inupik"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ik,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ipk :loc.iso639-2/ipk],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ik",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Inupik"}
                    {:rdf/language "fr",
                     :rdf/value    "inupiaq"}
                    {:rdf/language "en",
                     :rdf/value    "Inupiaq"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Inupik"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Inupiaq"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "inupiaq"}}]})

(def io
  "Ido"
  {:db/ident :loc.iso639-1/io,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2002-01-15T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ido"}
                                {:rdf/language "fr",
                                 :rdf/value    "ido"}
                                {:rdf/language "en",
                                 :rdf/value    "Ido"}],
   :madsrdf/code "io",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ido :loc.languages/ido],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ido"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ido"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ido"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Ido"}
                   {:rdf/language "en",
                    :rdf/value    "Ido"}
                   {:rdf/language "fr",
                    :rdf/value    "ido"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2002-01-15T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/io,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ido :loc.languages/ido],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "io",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ido"}
                    {:rdf/language "fr",
                     :rdf/value    "ido"}
                    {:rdf/language "en",
                     :rdf/value    "Ido"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ido"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ido"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ido"}}]})

(def is
  "Icelandic"
  {:db/ident :loc.iso639-1/is,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Isländisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "islandais"}
                                {:rdf/language "en",
                                 :rdf/value    "Icelandic"}],
   :madsrdf/code "is",
   :madsrdf/hasExactExternalAuthority
   [:loc.languages/ice :loc.iso639-2/isl :loc.iso639-2/ice],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "islandais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Icelandic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Isländisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Isländisch"}
                   {:rdf/language "fr",
                    :rdf/value    "islandais"}
                   {:rdf/language "en",
                    :rdf/value    "Icelandic"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/is,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ice :loc.iso639-2/isl :loc.iso639-2/ice],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "is",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Isländisch"}
                    {:rdf/language "fr",
                     :rdf/value    "islandais"}
                    {:rdf/language "en",
                     :rdf/value    "Icelandic"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Isländisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "islandais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Icelandic"}}]})

(def it
  "Italian"
  {:db/ident :loc.iso639-1/it,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Italienisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "italien"}
                                {:rdf/language "en",
                                 :rdf/value    "Italian"}],
   :madsrdf/code "it",
   :madsrdf/hasExactExternalAuthority [:loc.languages/ita :loc.iso639-2/ita],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Italian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Italienisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "italien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "italien"}
                   {:rdf/language "de",
                    :rdf/value    "Italienisch"}
                   {:rdf/language "en",
                    :rdf/value    "Italian"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/it,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ita :loc.languages/ita],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "it",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Italienisch"}
                    {:rdf/language "fr",
                     :rdf/value    "italien"}
                    {:rdf/language "en",
                     :rdf/value    "Italian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Italian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Italienisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "italien"}}]})

(def iu
  "Inuktitut"
  {:db/ident :loc.iso639-1/iu,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1989-03-11T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Inuktitut"}
                                {:rdf/language "fr",
                                 :rdf/value    "inuktitut"}
                                {:rdf/language "en",
                                 :rdf/value    "Inuktitut"}],
   :madsrdf/code "iu",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/iku :loc.languages/iku],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "inuktitut"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Inuktitut"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Inuktitut"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Inuktitut"}
                   {:rdf/language "en",
                    :rdf/value    "Inuktitut"}
                   {:rdf/language "fr",
                    :rdf/value    "inuktitut"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1989-03-11T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/iu,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/iku :loc.languages/iku],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "iu",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Inuktitut"}
                    {:rdf/language "fr",
                     :rdf/value    "inuktitut"}
                    {:rdf/language "en",
                     :rdf/value    "Inuktitut"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Inuktitut"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "inuktitut"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Inuktitut"}}]})

(def ja
  "Japanese"
  {:db/ident :loc.iso639-1/ja,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Japanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "japonais"}
                                {:rdf/language "en",
                                 :rdf/value    "Japanese"}],
   :madsrdf/code "ja",
   :madsrdf/hasExactExternalAuthority [:loc.languages/jpn :loc.iso639-2/jpn],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Japanese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Japanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "japonais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "japonais"}
                   {:rdf/language "en",
                    :rdf/value    "Japanese"}
                   {:rdf/language "de",
                    :rdf/value    "Japanisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ja,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/jpn :loc.iso639-2/jpn],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ja",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Japanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "japonais"}
                    {:rdf/language "en",
                     :rdf/value    "Japanese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "japonais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Japanese"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Japanisch"}}]})

(def jv
  "Javanese"
  {:db/ident :loc.iso639-1/jv,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2001-08-13T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Code change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Javanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "javanais"}
                                {:rdf/language "en",
                                 :rdf/value    "Javanese"}],
   :madsrdf/code "jv",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/jav :loc.languages/jav],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "javanais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Javanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Javanese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :madsrdf/useFor :loc.iso639-1/jw,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Javanese"}
                   {:rdf/language "fr",
                    :rdf/value    "javanais"}
                   {:rdf/language "de",
                    :rdf/value    "Javanisch"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/jv,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2001-08-13T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/jv,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/jav :loc.languages/jav],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "jv",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Javanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "javanais"}
                    {:rdf/language "en",
                     :rdf/value    "Javanese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Javanisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "javanais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Javanese"}}]})

(def ka
  "Georgian"
  {:db/ident :loc.iso639-1/ka,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Georgisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "géorgien"}
                                {:rdf/language "en",
                                 :rdf/value    "Georgian"}],
   :madsrdf/code "ka",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/geo :loc.languages/geo :loc.iso639-2/kat],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Georgisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "géorgien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Georgian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Georgian"}
                   {:rdf/language "fr",
                    :rdf/value    "géorgien"}
                   {:rdf/language "de",
                    :rdf/value    "Georgisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ka,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/geo :loc.iso639-2/kat :loc.languages/geo],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ka",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Georgisch"}
                    {:rdf/language "fr",
                     :rdf/value    "géorgien"}
                    {:rdf/language "en",
                     :rdf/value    "Georgian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "géorgien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Georgisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Georgian"}}]})

(def kg
  "Kongo"
  {:db/ident :loc.iso639-1/kg,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kongo-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "kongo"}
                                {:rdf/language "en",
                                 :rdf/value    "Kongo"}],
   :madsrdf/code "kg",
   :madsrdf/hasExactExternalAuthority [:loc.languages/kon :loc.iso639-2/kon],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kongo-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kongo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kongo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Kongo"}
                   {:rdf/language "de",
                    :rdf/value    "Kongo-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "kongo"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/kg,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/kon :loc.iso639-2/kon],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "kg",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kongo-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "kongo"}
                    {:rdf/language "en",
                     :rdf/value    "Kongo"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kongo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kongo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kongo-Sprache"}}]})

(def ki
  "Kikuyu | Gikuyu"
  {:db/ident :loc.iso639-1/ki,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kikuyu-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "kikuyu"}
                                {:rdf/language "en",
                                 :rdf/value    "Kikuyu |  Gikuyu"}],
   :madsrdf/code "ki",
   :madsrdf/hasExactExternalAuthority [:loc.languages/kik :loc.iso639-2/kik],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kikuyu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Gikuyu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kikuyu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kikuyu-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Kikuyu-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Kikuyu"}
                   {:rdf/language "fr",
                    :rdf/value    "kikuyu"}
                   {:rdf/language "en",
                    :rdf/value    "Gikuyu"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ki,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/kik :loc.languages/kik],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ki",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kikuyu-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "kikuyu"}
                    {:rdf/language "en",
                     :rdf/value    "Kikuyu | Gikuyu"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kikuyu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kikuyu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Gikuyu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kikuyu-Sprache"}}]})

(def kj
  "Kuanyama | Kwanyama"
  {:db/ident :loc.iso639-1/kj,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kwanyama-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "kuanyama |  kwanyama"}
                                {:rdf/language "en",
                                 :rdf/value    "Kuanyama |  Kwanyama"}],
   :madsrdf/code "kj",
   :madsrdf/hasExactExternalAuthority [:loc.languages/kua :loc.iso639-2/kua],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kwanyama"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kwanyama"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Kwanyama-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kuanyama"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kuanyama"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "kuanyama"}
                   {:rdf/language "en",
                    :rdf/value    "Kwanyama"}
                   {:rdf/language "de",
                    :rdf/value    "Kwanyama-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "kwanyama"}
                   {:rdf/language "en",
                    :rdf/value    "Kuanyama"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/kj,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/kua :loc.languages/kua],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "kj",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kwanyama-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "kuanyama | kwanyama"}
                    {:rdf/language "en",
                     :rdf/value    "Kuanyama | Kwanyama"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kwanyama"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kwanyama-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kuanyama"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kuanyama"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kwanyama"}}]})

(def kk
  "Kazakh"
  {:db/ident :loc.iso639-1/kk,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kasachisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "kazakh"}
                                {:rdf/language "en",
                                 :rdf/value    "Kazakh"}],
   :madsrdf/code "kk",
   :madsrdf/hasExactExternalAuthority [:loc.languages/kaz :loc.iso639-2/kaz],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kasachisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kazakh"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kazakh"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Kasachisch"}
                   {:rdf/language "fr",
                    :rdf/value    "kazakh"}
                   {:rdf/language "en",
                    :rdf/value    "Kazakh"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/kk,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/kaz :loc.iso639-2/kaz],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "kk",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kasachisch"}
                    {:rdf/language "fr",
                     :rdf/value    "kazakh"}
                    {:rdf/language "en",
                     :rdf/value    "Kazakh"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kazakh"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kazakh"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kasachisch"}}]})

(def kl
  "Kalaallisut | Greenlandic"
  {:db/ident :loc.iso639-1/kl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Grönländisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "groenlandais"}
                                {:rdf/language "en",
                                 :rdf/value    "Kalaallisut |  Greenlandic"}],
   :madsrdf/code "kl",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/kal :loc.languages/kal],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Grönländisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kalaallisut"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Greenlandic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "groenlandais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Kalaallisut"}
                   {:rdf/language "en",
                    :rdf/value    "Greenlandic"}
                   {:rdf/language "fr",
                    :rdf/value    "groenlandais"}
                   {:rdf/language "de",
                    :rdf/value    "Grönländisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/kl,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/kal :loc.iso639-2/kal],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "kl",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Grönländisch"}
                    {:rdf/language "fr",
                     :rdf/value    "groenlandais"}
                    {:rdf/language "en",
                     :rdf/value    "Kalaallisut | Greenlandic"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Grönländisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "groenlandais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kalaallisut"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Greenlandic"}}]})

(def km
  "Central Khmer"
  {:db/ident :loc.iso639-1/km,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2006-10-27T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Name change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kambodschanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "khmer central"}
                                {:rdf/language "en",
                                 :rdf/value    "Central Khmer"}],
   :madsrdf/code "km",
   :madsrdf/hasExactExternalAuthority [:loc.languages/khm :loc.iso639-2/khm],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Central Khmer"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Kambodschanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "khmer central"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Name changed from \"Khmer\""},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "khmer central"}
                   {:rdf/language "en",
                    :rdf/value    "Central Khmer"}
                   {:rdf/language "de",
                    :rdf/value    "Kambodschanisch"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/km,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2006-10-27T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/km,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/khm :loc.languages/khm],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Name changed from \"Khmer\""},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "km",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kambodschanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "khmer central"}
                    {:rdf/language "en",
                     :rdf/value    "Central Khmer"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "khmer central"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Central Khmer"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kambodschanisch"}}]})

(def kn
  "Kannada"
  {:db/ident :loc.iso639-1/kn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kannada"}
                                {:rdf/language "fr",
                                 :rdf/value    "kannada"}
                                {:rdf/language "en",
                                 :rdf/value    "Kannada"}],
   :madsrdf/code "kn",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/kan :loc.languages/kan],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kannada"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kannada"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kannada"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Kannada"}
                   {:rdf/language "en",
                    :rdf/value    "Kannada"}
                   {:rdf/language "fr",
                    :rdf/value    "kannada"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/kn,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/kan :loc.iso639-2/kan],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "kn",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kannada"}
                    {:rdf/language "fr",
                     :rdf/value    "kannada"}
                    {:rdf/language "en",
                     :rdf/value    "Kannada"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kannada"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kannada"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kannada"}}]})

(def ko
  "Korean"
  {:db/ident :loc.iso639-1/ko,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Koreanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "coréen"}
                                {:rdf/language "en",
                                 :rdf/value    "Korean"}],
   :madsrdf/code "ko",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/kor :loc.languages/kor],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Koreanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "coréen"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Korean"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Koreanisch"}
                   {:rdf/language "en",
                    :rdf/value    "Korean"}
                   {:rdf/language "fr",
                    :rdf/value    "coréen"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ko,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/kor :loc.languages/kor],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ko",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Koreanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "coréen"}
                    {:rdf/language "en",
                     :rdf/value    "Korean"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Koreanisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "coréen"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Korean"}}]})

(def kr
  "Kanuri"
  {:db/ident :loc.iso639-1/kr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kanuri-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "kanouri"}
                                {:rdf/language "en",
                                 :rdf/value    "Kanuri"}],
   :madsrdf/code "kr",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/kau :loc.languages/kau],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kanuri"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kanouri"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kanuri-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Kanuri-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "kanouri"}
                   {:rdf/language "en",
                    :rdf/value    "Kanuri"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/kr,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/kau :loc.languages/kau],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "kr",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kanuri-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "kanouri"}
                    {:rdf/language "en",
                     :rdf/value    "Kanuri"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kanouri"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kanuri"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kanuri-Sprache"}}]})

(def ks
  "Kashmiri"
  {:db/ident :loc.iso639-1/ks,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kaschmiri"}
                                {:rdf/language "fr",
                                 :rdf/value    "kashmiri"}
                                {:rdf/language "en",
                                 :rdf/value    "Kashmiri"}],
   :madsrdf/code "ks",
   :madsrdf/hasExactExternalAuthority [:loc.languages/kas :loc.iso639-2/kas],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kashmiri"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kaschmiri"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kashmiri"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Kashmiri"}
                   {:rdf/language "de",
                    :rdf/value    "Kaschmiri"}
                   {:rdf/language "fr",
                    :rdf/value    "kashmiri"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ks,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/kas :loc.iso639-2/kas],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ks",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kaschmiri"}
                    {:rdf/language "fr",
                     :rdf/value    "kashmiri"}
                    {:rdf/language "en",
                     :rdf/value    "Kashmiri"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kashmiri"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kaschmiri"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kashmiri"}}]})

(def ku
  "Kurdish"
  {:db/ident :loc.iso639-1/ku,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kurdisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "kurde"}
                                {:rdf/language "en",
                                 :rdf/value    "Kurdish"}],
   :madsrdf/code "ku",
   :madsrdf/hasExactExternalAuthority [:loc.languages/kur :loc.iso639-2/kur],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kurdish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kurdisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kurde"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Kurdish"}
                   {:rdf/language "fr",
                    :rdf/value    "kurde"}
                   {:rdf/language "de",
                    :rdf/value    "Kurdisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ku,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/kur :loc.languages/kur],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ku",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kurdisch"}
                    {:rdf/language "fr",
                     :rdf/value    "kurde"}
                    {:rdf/language "en",
                     :rdf/value    "Kurdish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kurdisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kurde"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kurdish"}}]})

(def kv
  "Komi"
  {:db/ident :loc.iso639-1/kv,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Komi-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "kom"}
                                {:rdf/language "en",
                                 :rdf/value    "Komi"}],
   :madsrdf/code "kv",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/kom :loc.languages/kom],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Komi-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Komi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kom"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Komi-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "kom"}
                   {:rdf/language "en",
                    :rdf/value    "Komi"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/kv,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/kom :loc.iso639-2/kom],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "kv",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Komi-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "kom"}
                    {:rdf/language "en",
                     :rdf/value    "Komi"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Komi-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Komi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kom"}}]})

(def kw
  "Cornish"
  {:db/ident :loc.iso639-1/kw,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1998-08-10T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kornisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "cornique"}
                                {:rdf/language "en",
                                 :rdf/value    "Cornish"}],
   :madsrdf/code "kw",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/cor :loc.languages/cor],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Cornish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "cornique"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kornisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Cornish"}
                   {:rdf/language "de",
                    :rdf/value    "Kornisch"}
                   {:rdf/language "fr",
                    :rdf/value    "cornique"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1998-08-10T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/kw,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/cor :loc.languages/cor],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "kw",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kornisch"}
                    {:rdf/language "fr",
                     :rdf/value    "cornique"}
                    {:rdf/language "en",
                     :rdf/value    "Cornish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "cornique"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Cornish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kornisch"}}]})

(def ky
  "Kirghiz | Kyrgyz"
  {:db/ident :loc.iso639-1/ky,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2006-10-02T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Name change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Kirgisisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "kirghiz"}
                                {:rdf/language "en",
                                 :rdf/value    "Kirghiz |  Kyrgyz"}],
   :madsrdf/code "ky",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/kir :loc.languages/kir],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kirghiz"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "kirghiz"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Kirgisisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kyrgyz"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Kyrgyz added"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Kirgisisch"}
                   {:rdf/language "fr",
                    :rdf/value    "kirghiz"}
                   {:rdf/language "en",
                    :rdf/value    "Kyrgyz"}
                   {:rdf/language "en",
                    :rdf/value    "Kirghiz"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2006-10-02T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ky,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ky,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/kir :loc.languages/kir],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Kyrgyz added"},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ky",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Kirgisisch"}
                    {:rdf/language "fr",
                     :rdf/value    "kirghiz"}
                    {:rdf/language "en",
                     :rdf/value    "Kirghiz | Kyrgyz"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "kirghiz"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Kirgisisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kyrgyz"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kirghiz"}}]})

(def la
  "Latin"
  {:db/ident :loc.iso639-1/la,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Latein"}
                                {:rdf/language "fr",
                                 :rdf/value    "latin"}
                                {:rdf/language "en",
                                 :rdf/value    "Latin"}],
   :madsrdf/code "la",
   :madsrdf/hasExactExternalAuthority [:loc.languages/lat :loc.iso639-2/lat],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Latein"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "latin"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Latin"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Latein"}
                   {:rdf/language "fr",
                    :rdf/value    "latin"}
                   {:rdf/language "en",
                    :rdf/value    "Latin"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/la,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/lat :loc.iso639-2/lat],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "la",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Latein"}
                    {:rdf/language "fr",
                     :rdf/value    "latin"}
                    {:rdf/language "en",
                     :rdf/value    "Latin"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Latein"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Latin"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "latin"}}]})

(def lb
  "Luxembourgish | Letzeburgesch"
  {:db/ident :loc.iso639-1/lb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1998-08-10T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Luxemburgisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "luxembourgeois"}
                                {:rdf/language "en",
                                 :rdf/value "Luxembourgish |  Letzeburgesch"}],
   :madsrdf/code "lb",
   :madsrdf/hasExactExternalAuthority [:loc.languages/ltz :loc.iso639-2/ltz],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Letzeburgesch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Luxemburgisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Luxembourgish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "luxembourgeois"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Letzeburgesch"}
                   {:rdf/language "en",
                    :rdf/value    "Luxembourgish"}
                   {:rdf/language "de",
                    :rdf/value    "Luxemburgisch"}
                   {:rdf/language "fr",
                    :rdf/value    "luxembourgeois"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1998-08-10T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/lb,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ltz :loc.languages/ltz],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "lb",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Luxemburgisch"}
                    {:rdf/language "fr",
                     :rdf/value    "luxembourgeois"}
                    {:rdf/language "en",
                     :rdf/value    "Luxembourgish | Letzeburgesch"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Luxembourgish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Luxemburgisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "luxembourgeois"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Letzeburgesch"}}]})

(def lg
  "Ganda"
  {:db/ident :loc.iso639-1/lg,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ganda-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "ganda"}
                                {:rdf/language "en",
                                 :rdf/value    "Ganda"}],
   :madsrdf/code "lg",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/lug :loc.languages/lug],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ganda"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ganda-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ganda"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Ganda"}
                   {:rdf/language "fr",
                    :rdf/value    "ganda"}
                   {:rdf/language "de",
                    :rdf/value    "Ganda-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/lg,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/lug :loc.iso639-2/lug],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "lg",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ganda-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "ganda"}
                    {:rdf/language "en",
                     :rdf/value    "Ganda"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ganda"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ganda-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ganda"}}]})

(def li
  "Limburgan | Limburger | Limburgish"
  {:db/ident :loc.iso639-1/li,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2002-08-02T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Limburgisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "limbourgeois"}
                                {:rdf/language "en",
                                 :rdf/value
                                 "Limburgan |  Limburger |  Limburgish"}],
   :madsrdf/code "li",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/lim :loc.languages/lim],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Limburgisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Limburgish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "limbourgeois"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Limburger"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Limburgan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Limburgisch"}
                   {:rdf/language "fr",
                    :rdf/value    "limbourgeois"}
                   {:rdf/language "en",
                    :rdf/value    "Limburgan"}
                   {:rdf/language "en",
                    :rdf/value    "Limburger"}
                   {:rdf/language "en",
                    :rdf/value    "Limburgish"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2002-08-02T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/li,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/lim :loc.languages/lim],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "li",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Limburgisch"}
                    {:rdf/language "fr",
                     :rdf/value    "limbourgeois"}
                    {:rdf/language "en",
                     :rdf/value    "Limburgan | Limburger | Limburgish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Limburger"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "limbourgeois"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Limburgish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Limburgisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Limburgan"}}]})

(def ln
  "Lingala"
  {:db/ident :loc.iso639-1/ln,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Lingala"}
                                {:rdf/language "fr",
                                 :rdf/value    "lingala"}
                                {:rdf/language "en",
                                 :rdf/value    "Lingala"}],
   :madsrdf/code "ln",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/lin :loc.languages/lin],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Lingala"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Lingala"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "lingala"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "lingala"}
                   {:rdf/language "de",
                    :rdf/value    "Lingala"}
                   {:rdf/language "en",
                    :rdf/value    "Lingala"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ln,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/lin :loc.iso639-2/lin],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ln",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Lingala"}
                    {:rdf/language "fr",
                     :rdf/value    "lingala"}
                    {:rdf/language "en",
                     :rdf/value    "Lingala"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Lingala"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "lingala"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Lingala"}}]})

(def lo
  "Lao"
  {:db/ident :loc.iso639-1/lo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Laotisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "lao"}
                                {:rdf/language "en",
                                 :rdf/value    "Lao"}],
   :madsrdf/code "lo",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/lao :loc.languages/lao],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Laotisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Lao"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "lao"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Laotisch"}
                   {:rdf/language "en",
                    :rdf/value    "Lao"}
                   {:rdf/language "fr",
                    :rdf/value    "lao"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/lo,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/lao :loc.iso639-2/lao],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "lo",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Laotisch"}
                    {:rdf/language "fr",
                     :rdf/value    "lao"}
                    {:rdf/language "en",
                     :rdf/value    "Lao"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Laotisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "lao"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Lao"}}]})

(def lt
  "Lithuanian"
  {:db/ident :loc.iso639-1/lt,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Litauisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "lituanien"}
                                {:rdf/language "en",
                                 :rdf/value    "Lithuanian"}],
   :madsrdf/code "lt",
   :madsrdf/hasExactExternalAuthority [:loc.languages/lit :loc.iso639-2/lit],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "lituanien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Litauisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Lithuanian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "lituanien"}
                   {:rdf/language "de",
                    :rdf/value    "Litauisch"}
                   {:rdf/language "en",
                    :rdf/value    "Lithuanian"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/lt,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/lit :loc.iso639-2/lit],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "lt",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Litauisch"}
                    {:rdf/language "fr",
                     :rdf/value    "lituanien"}
                    {:rdf/language "en",
                     :rdf/value    "Lithuanian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "lituanien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Lithuanian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Litauisch"}}]})

(def lu
  "Luba-Katanga"
  {:db/ident :loc.iso639-1/lu,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Luba-Katanga-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "luba-katanga"}
                                {:rdf/language "en",
                                 :rdf/value    "Luba-Katanga"}],
   :madsrdf/code "lu",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/lub :loc.languages/lub],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "luba-katanga"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value
                                                "Luba-Katanga-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Luba-Katanga"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "luba-katanga"}
                   {:rdf/language "en",
                    :rdf/value    "Luba-Katanga"}
                   {:rdf/language "de",
                    :rdf/value    "Luba-Katanga-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/lu,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/lub :loc.languages/lub],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "lu",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Luba-Katanga-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "luba-katanga"}
                    {:rdf/language "en",
                     :rdf/value    "Luba-Katanga"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "luba-katanga"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Luba-Katanga"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value
                                           "Luba-Katanga-Sprache"}}]})

(def lv
  "Latvian"
  {:db/ident :loc.iso639-1/lv,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Lettisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "letton"}
                                {:rdf/language "en",
                                 :rdf/value    "Latvian"}],
   :madsrdf/code "lv",
   :madsrdf/hasExactExternalAuthority [:loc.languages/lav :loc.iso639-2/lav],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Lettisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "letton"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Latvian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Latvian"}
                   {:rdf/language "fr",
                    :rdf/value    "letton"}
                   {:rdf/language "de",
                    :rdf/value    "Lettisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/lv,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/lav :loc.languages/lav],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "lv",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Lettisch"}
                    {:rdf/language "fr",
                     :rdf/value    "letton"}
                    {:rdf/language "en",
                     :rdf/value    "Latvian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Latvian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "letton"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Lettisch"}}]})

(def mg
  "Malagasy"
  {:db/ident :loc.iso639-1/mg,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Malagassi-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "malgache"}
                                {:rdf/language "en",
                                 :rdf/value    "Malagasy"}],
   :madsrdf/code "mg",
   :madsrdf/hasExactExternalAuthority [:loc.languages/mlg :loc.iso639-2/mlg],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "malgache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Malagasy"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Malagassi-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Malagassi-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "malgache"}
                   {:rdf/language "en",
                    :rdf/value    "Malagasy"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/mg,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/mlg :loc.iso639-2/mlg],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "mg",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Malagassi-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "malgache"}
                    {:rdf/language "en",
                     :rdf/value    "Malagasy"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "malgache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Malagasy"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value "Malagassi-Sprache"}}]})

(def mh
  "Marshallese"
  {:db/ident :loc.iso639-1/mh,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Marschallesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "marshall"}
                                {:rdf/language "en",
                                 :rdf/value    "Marshallese"}],
   :madsrdf/code "mh",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/mah :loc.languages/mah],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "marshall"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Marschallesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Marshallese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Marschallesisch"}
                   {:rdf/language "fr",
                    :rdf/value    "marshall"}
                   {:rdf/language "en",
                    :rdf/value    "Marshallese"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/mh,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/mah :loc.iso639-2/mah],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "mh",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Marschallesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "marshall"}
                    {:rdf/language "en",
                     :rdf/value    "Marshallese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Marshallese"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "marshall"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Marschallesisch"}}]})

(def mi
  "Maori"
  {:db/ident :loc.iso639-1/mi,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Maori-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "maori"}
                                {:rdf/language "en",
                                 :rdf/value    "Maori"}],
   :madsrdf/code "mi",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/mao :loc.languages/mao :loc.iso639-2/mri],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "maori"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Maori"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Maori-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Maori-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Maori"}
                   {:rdf/language "fr",
                    :rdf/value    "maori"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/mi,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/mao :loc.iso639-2/mri :loc.languages/mao],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "mi",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Maori-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "maori"}
                    {:rdf/language "en",
                     :rdf/value    "Maori"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "maori"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Maori-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Maori"}}]})

(def mk
  "Macedonian"
  {:db/ident :loc.iso639-1/mk,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Makedonisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "macédonien"}
                                {:rdf/language "en",
                                 :rdf/value    "Macedonian"}],
   :madsrdf/code "mk",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/mac :loc.languages/mac :loc.iso639-2/mkd],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "macédonien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Macedonian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Makedonisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "macédonien"}
                   {:rdf/language "en",
                    :rdf/value    "Macedonian"}
                   {:rdf/language "de",
                    :rdf/value    "Makedonisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/mk,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/mkd :loc.languages/mac :loc.iso639-2/mac],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "mk",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Makedonisch"}
                    {:rdf/language "fr",
                     :rdf/value    "macédonien"}
                    {:rdf/language "en",
                     :rdf/value    "Macedonian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Macedonian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "macédonien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Makedonisch"}}]})

(def ml
  "Malayalam"
  {:db/ident :loc.iso639-1/ml,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Malayalam"}
                                {:rdf/language "fr",
                                 :rdf/value    "malayalam"}
                                {:rdf/language "en",
                                 :rdf/value    "Malayalam"}],
   :madsrdf/code "ml",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/mal :loc.languages/mal],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Malayalam"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "malayalam"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Malayalam"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Malayalam"}
                   {:rdf/language "en",
                    :rdf/value    "Malayalam"}
                   {:rdf/language "fr",
                    :rdf/value    "malayalam"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ml,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/mal :loc.iso639-2/mal],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ml",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Malayalam"}
                    {:rdf/language "fr",
                     :rdf/value    "malayalam"}
                    {:rdf/language "en",
                     :rdf/value    "Malayalam"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Malayalam"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Malayalam"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "malayalam"}}]})

(def mn
  "Mongolian"
  {:db/ident :loc.iso639-1/mn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Mongolisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "mongol"}
                                {:rdf/language "en",
                                 :rdf/value    "Mongolian"}],
   :madsrdf/code "mn",
   :madsrdf/hasExactExternalAuthority [:loc.languages/mon :loc.iso639-2/mon],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Mongolian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Mongolisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "mongol"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "mongol"}
                   {:rdf/language "en",
                    :rdf/value    "Mongolian"}
                   {:rdf/language "de",
                    :rdf/value    "Mongolisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/mn,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/mon :loc.iso639-2/mon],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "mn",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Mongolisch"}
                    {:rdf/language "fr",
                     :rdf/value    "mongol"}
                    {:rdf/language "en",
                     :rdf/value    "Mongolian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Mongolian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "mongol"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Mongolisch"}}]})

(def mr
  "Marathi"
  {:db/ident :loc.iso639-1/mr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Marathi"}
                                {:rdf/language "fr",
                                 :rdf/value    "marathe"}
                                {:rdf/language "en",
                                 :rdf/value    "Marathi"}],
   :madsrdf/code "mr",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/mar :loc.languages/mar],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "marathe"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Marathi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Marathi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Marathi"}
                   {:rdf/language "en",
                    :rdf/value    "Marathi"}
                   {:rdf/language "fr",
                    :rdf/value    "marathe"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/mr,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/mar :loc.iso639-2/mar],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "mr",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Marathi"}
                    {:rdf/language "fr",
                     :rdf/value    "marathe"}
                    {:rdf/language "en",
                     :rdf/value    "Marathi"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Marathi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "marathe"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Marathi"}}]})

(def ms
  "Malay"
  {:db/ident :loc.iso639-1/ms,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Malaiisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "malais"}
                                {:rdf/language "en",
                                 :rdf/value    "Malay"}],
   :madsrdf/code "ms",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/may :loc.languages/may :loc.iso639-2/msa],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Malaiisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "malais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Malay"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "malais"}
                   {:rdf/language "de",
                    :rdf/value    "Malaiisch"}
                   {:rdf/language "en",
                    :rdf/value    "Malay"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ms,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/msa :loc.languages/may :loc.iso639-2/may],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ms",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Malaiisch"}
                    {:rdf/language "fr",
                     :rdf/value    "malais"}
                    {:rdf/language "en",
                     :rdf/value    "Malay"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "malais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Malaiisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Malay"}}]})

(def mt
  "Maltese"
  {:db/ident :loc.iso639-1/mt,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Maltesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "maltais"}
                                {:rdf/language "en",
                                 :rdf/value    "Maltese"}],
   :madsrdf/code "mt",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/mlt :loc.languages/mlt],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "maltais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Maltesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Maltese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Maltesisch"}
                   {:rdf/language "en",
                    :rdf/value    "Maltese"}
                   {:rdf/language "fr",
                    :rdf/value    "maltais"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/mt,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/mlt :loc.languages/mlt],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "mt",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Maltesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "maltais"}
                    {:rdf/language "en",
                     :rdf/value    "Maltese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Maltese"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "maltais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Maltesisch"}}]})

(def my
  "Burmese"
  {:db/ident :loc.iso639-1/my,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Birmanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "birman"}
                                {:rdf/language "en",
                                 :rdf/value    "Burmese"}],
   :madsrdf/code "my",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/mya :loc.iso639-2/bur :loc.languages/bur],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "birman"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Burmese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Birmanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Burmese"}
                   {:rdf/language "de",
                    :rdf/value    "Birmanisch"}
                   {:rdf/language "fr",
                    :rdf/value    "birman"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/my,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/bur :loc.iso639-2/bur :loc.iso639-2/mya],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "my",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Birmanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "birman"}
                    {:rdf/language "en",
                     :rdf/value    "Burmese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Burmese"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Birmanisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "birman"}}]})

(def na
  "Nauru"
  {:db/ident :loc.iso639-1/na,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Nauruanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "nauruan"}
                                {:rdf/language "en",
                                 :rdf/value    "Nauru"}],
   :madsrdf/code "na",
   :madsrdf/hasExactExternalAuthority [:loc.languages/nau :loc.iso639-2/nau],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "nauruan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Nauruanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Nauru"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "nauruan"}
                   {:rdf/language "de",
                    :rdf/value    "Nauruanisch"}
                   {:rdf/language "en",
                    :rdf/value    "Nauru"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/na,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/nau :loc.iso639-2/nau],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "na",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Nauruanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "nauruan"}
                    {:rdf/language "en",
                     :rdf/value    "Nauru"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nauru"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "nauruan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Nauruanisch"}}]})

(def nb
  "Bokmål, Norwegian | Norwegian Bokmål"
  {:db/ident :loc.iso639-1/nb,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Bokmål"}
                                {:rdf/language "fr",
                                 :rdf/value    "norvégien bokmål"}
                                {:rdf/language "en",
                                 :rdf/value
                                 "Bokmål, Norwegian |  Norwegian Bokmål"}],
   :madsrdf/code "nb",
   :madsrdf/hasExactExternalAuthority [:loc.languages/nob :loc.iso639-2/nob],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Bokmål, Norwegian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Bokmål"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value "norvégien bokmål"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Norwegian Bokmål"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Bokmål"}
                   {:rdf/language "en",
                    :rdf/value    "Bokmål, Norwegian"}
                   {:rdf/language "en",
                    :rdf/value    "Norwegian Bokmål"}
                   {:rdf/language "fr",
                    :rdf/value    "norvégien bokmål"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/nb,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/nob :loc.iso639-2/nob],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "nb",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Bokmål"}
                    {:rdf/language "fr",
                     :rdf/value    "norvégien bokmål"}
                    {:rdf/language "en",
                     :rdf/value    "Bokmål, Norwegian | Norwegian Bokmål"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bokmål, Norwegian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Bokmål"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Norwegian Bokmål"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "norvégien bokmål"}}]})

(def nd
  "Ndebele, North | North Ndebele"
  {:db/ident :loc.iso639-1/nd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2000-08-14T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Name change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ndebele-Sprache (Simbabwe)"}
                                {:rdf/language "fr",
                                 :rdf/value    "ndébélé du Nord"}
                                {:rdf/language "en",
                                 :rdf/value "Ndebele, North |  North Ndebele"}],
   :madsrdf/code "nd",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/nde :loc.languages/nde],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value
                                                "Ndebele-Sprache (Simbabwe)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "North Ndebele"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value "ndébélé du Nord"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ndebele, North"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "North Ndebele"}
                   {:rdf/language "fr",
                    :rdf/value    "ndébélé du Nord"}
                   {:rdf/language "de",
                    :rdf/value    "Ndebele-Sprache (Simbabwe)"}
                   {:rdf/language "en",
                    :rdf/value    "Ndebele, North"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2000-08-14T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/nd,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/nd,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/nde :loc.iso639-2/nde],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "nd",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ndebele-Sprache (Simbabwe)"}
                    {:rdf/language "fr",
                     :rdf/value    "ndébélé du Nord"}
                    {:rdf/language "en",
                     :rdf/value    "Ndebele, North | North Ndebele"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ndebele, North"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value
                                           "Ndebele-Sprache (Simbabwe)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "North Ndebele"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ndébélé du Nord"}}]})

(def ne
  "Nepali"
  {:db/ident :loc.iso639-1/ne,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Nepali"}
                                {:rdf/language "fr",
                                 :rdf/value    "népalais"}
                                {:rdf/language "en",
                                 :rdf/value    "Nepali"}],
   :madsrdf/code "ne",
   :madsrdf/hasExactExternalAuthority [:loc.languages/nep :loc.iso639-2/nep],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Nepali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "népalais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Nepali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "népalais"}
                   {:rdf/language "de",
                    :rdf/value    "Nepali"}
                   {:rdf/language "en",
                    :rdf/value    "Nepali"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ne,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/nep :loc.languages/nep],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ne",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Nepali"}
                    {:rdf/language "fr",
                     :rdf/value    "népalais"}
                    {:rdf/language "en",
                     :rdf/value    "Nepali"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "népalais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Nepali"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nepali"}}]})

(def ng
  "Ndonga"
  {:db/ident :loc.iso639-1/ng,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ndonga"}
                                {:rdf/language "fr",
                                 :rdf/value    "ndonga"}
                                {:rdf/language "en",
                                 :rdf/value    "Ndonga"}],
   :madsrdf/code "ng",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ndo :loc.languages/ndo],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ndonga"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ndonga"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ndonga"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Ndonga"}
                   {:rdf/language "en",
                    :rdf/value    "Ndonga"}
                   {:rdf/language "fr",
                    :rdf/value    "ndonga"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ng,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ndo :loc.iso639-2/ndo],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ng",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ndonga"}
                    {:rdf/language "fr",
                     :rdf/value    "ndonga"}
                    {:rdf/language "en",
                     :rdf/value    "Ndonga"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ndonga"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ndonga"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ndonga"}}]})

(def nl
  "Dutch | Flemish"
  {:db/ident :loc.iso639-1/nl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Niederländisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "néerlandais |  flamand"}
                                {:rdf/language "en",
                                 :rdf/value    "Dutch |  Flemish"}],
   :madsrdf/code "nl",
   :madsrdf/hasExactExternalAuthority
   [:loc.languages/dut :loc.iso639-2/nld :loc.iso639-2/dut],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Dutch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "néerlandais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Niederländisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Flemish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "flamand"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Flemish"}
                   {:rdf/language "de",
                    :rdf/value    "Niederländisch"}
                   {:rdf/language "fr",
                    :rdf/value    "néerlandais"}
                   {:rdf/language "en",
                    :rdf/value    "Dutch"}
                   {:rdf/language "fr",
                    :rdf/value    "flamand"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/nl,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/dut :loc.iso639-2/nld :loc.iso639-2/dut],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "nl",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Niederländisch"}
                    {:rdf/language "fr",
                     :rdf/value    "néerlandais | flamand"}
                    {:rdf/language "en",
                     :rdf/value    "Dutch | Flemish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "flamand"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Dutch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Flemish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Niederländisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "néerlandais"}}]})

(def nn
  "Norwegian Nynorsk | Nynorsk, Norwegian"
  {:db/ident :loc.iso639-1/nn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   [{:rdf/language "de",
     :rdf/value    "Nynorsk"}
    {:rdf/language "fr",
     :rdf/value    "norvégien nynorsk |  nynorsk, norvégien"}
    {:rdf/language "en",
     :rdf/value    "Norwegian Nynorsk |  Nynorsk, Norwegian"}],
   :madsrdf/code "nn",
   :madsrdf/hasExactExternalAuthority [:loc.languages/nno :loc.iso639-2/nno],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Nynorsk, Norwegian"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "fr",
                            :rdf/value    "norvégien nynorsk"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Norwegian Nynorsk"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "de",
                            :rdf/value    "Nynorsk"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "fr",
                            :rdf/value    "nynorsk, norvégien"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Nynorsk, Norwegian"}
                   {:rdf/language "de",
                    :rdf/value    "Nynorsk"}
                   {:rdf/language "fr",
                    :rdf/value    "norvégien nynorsk"}
                   {:rdf/language "en",
                    :rdf/value    "Norwegian Nynorsk"}
                   {:rdf/language "fr",
                    :rdf/value    "nynorsk, norvégien"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/nn,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/nno :loc.iso639-2/nno],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "nn",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Nynorsk"}
                    {:rdf/language "fr",
                     :rdf/value    "norvégien nynorsk | nynorsk, norvégien"}
                    {:rdf/language "en",
                     :rdf/value    "Norwegian Nynorsk | Nynorsk, Norwegian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Nynorsk"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Norwegian Nynorsk"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "norvégien nynorsk"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nynorsk, Norwegian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value "nynorsk, norvégien"}}]})

(def no
  "Norwegian"
  {:db/ident :loc.iso639-1/no,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Norwegisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "norvégien"}
                                {:rdf/language "en",
                                 :rdf/value    "Norwegian"}],
   :madsrdf/code "no",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/nor :loc.languages/nor],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "norvégien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Norwegisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Norwegian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Norwegian"}
                   {:rdf/language "de",
                    :rdf/value    "Norwegisch"}
                   {:rdf/language "fr",
                    :rdf/value    "norvégien"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/no,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/nor :loc.languages/nor],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "no",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Norwegisch"}
                    {:rdf/language "fr",
                     :rdf/value    "norvégien"}
                    {:rdf/language "en",
                     :rdf/value    "Norwegian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Norwegian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Norwegisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "norvégien"}}]})

(def nr
  "Ndebele, South | South Ndebele"
  {:db/ident :loc.iso639-1/nr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-08-14T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ndebele-Sprache (Transvaal)"}
                                {:rdf/language "fr",
                                 :rdf/value    "ndébélé du Sud"}
                                {:rdf/language "en",
                                 :rdf/value "Ndebele, South |  South Ndebele"}],
   :madsrdf/code "nr",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/nbl :loc.languages/nbl],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ndébélé du Sud"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ndebele, South"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "South Ndebele"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value
                                                "Ndebele-Sprache (Transvaal)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "ndébélé du Sud"}
                   {:rdf/language "de",
                    :rdf/value    "Ndebele-Sprache (Transvaal)"}
                   {:rdf/language "en",
                    :rdf/value    "Ndebele, South"}
                   {:rdf/language "en",
                    :rdf/value    "South Ndebele"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-08-14T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/nr,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/nbl :loc.iso639-2/nbl],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "nr",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ndebele-Sprache (Transvaal)"}
                    {:rdf/language "fr",
                     :rdf/value    "ndébélé du Sud"}
                    {:rdf/language "en",
                     :rdf/value    "Ndebele, South | South Ndebele"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "South Ndebele"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value
                                           "Ndebele-Sprache (Transvaal)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ndébélé du Sud"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ndebele, South"}}]})

(def nv
  "Navajo | Navaho"
  {:db/ident :loc.iso639-1/nv,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Navajo-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "navaho"}
                                {:rdf/language "en",
                                 :rdf/value    "Navajo |  Navaho"}],
   :madsrdf/code "nv",
   :madsrdf/hasExactExternalAuthority [:loc.languages/nav :loc.iso639-2/nav],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Navaho"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Navajo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Navajo-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "navaho"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Navajo"}
                   {:rdf/language "fr",
                    :rdf/value    "navaho"}
                   {:rdf/language "de",
                    :rdf/value    "Navajo-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Navaho"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/nv,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/nav :loc.iso639-2/nav],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "nv",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Navajo-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "navaho"}
                    {:rdf/language "en",
                     :rdf/value    "Navajo | Navaho"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Navaho"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Navajo-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "navaho"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Navajo"}}]})

(def ny
  "Chichewa | Chewa | Nyanja"
  {:db/ident :loc.iso639-1/ny,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2000-02-18T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2000-02-18T05:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Variant added"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Nyanja-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "chichewa |  chewa |  nyanja"}
                                {:rdf/language "en",
                                 :rdf/value    "Chichewa |  Chewa |  Nyanja"}],
   :madsrdf/code "ny",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/nya :loc.languages/nya],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "nyanja"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Nyanja"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Chewa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "chichewa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Nyanja-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "chewa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Chichewa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Nyanja-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "nyanja"}
                   {:rdf/language "en",
                    :rdf/value    "Chewa"}
                   {:rdf/language "en",
                    :rdf/value    "Nyanja"}
                   {:rdf/language "fr",
                    :rdf/value    "chichewa"}
                   {:rdf/language "fr",
                    :rdf/value    "chewa"}
                   {:rdf/language "en",
                    :rdf/value    "Chichewa"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ny,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ny,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/nya :loc.iso639-2/nya],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ny",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Nyanja-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "chichewa | chewa | nyanja"}
                    {:rdf/language "en",
                     :rdf/value    "Chichewa | Chewa | Nyanja"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Nyanja-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "nyanja"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "chichewa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "chewa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Chewa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Chichewa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nyanja"}}]})

(def oc
  "Occitan (post 1500)"
  {:db/ident :loc.iso639-1/oc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2008-07-08T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Name change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Okzitanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "occitan (après 1500)"}
                                {:rdf/language "en",
                                 :rdf/value    "Occitan (post 1500)"}],
   :madsrdf/code "oc",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/oci :loc.languages/oci],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Occitan (post 1500)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "de",
                            :rdf/value    "Okzitanisch"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "fr",
                            :rdf/value    "occitan (après 1500)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Provençal removed"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "occitan (après 1500)"}
                   {:rdf/language "de",
                    :rdf/value    "Okzitanisch"}
                   {:rdf/language "en",
                    :rdf/value    "Occitan (post 1500)"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/oc,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2008-07-08T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/oc,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/oci :loc.iso639-2/oci],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Provençal removed"},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "oc",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Okzitanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "occitan (après 1500)"}
                    {:rdf/language "en",
                     :rdf/value    "Occitan (post 1500)"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Okzitanisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value "occitan (après 1500)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Occitan (post 1500)"}}]})

(def oj
  "Ojibwa"
  {:db/ident :loc.iso639-1/oj,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ojibwa-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "ojibwa"}
                                {:rdf/language "en",
                                 :rdf/value    "Ojibwa"}],
   :madsrdf/code "oj",
   :madsrdf/hasExactExternalAuthority [:loc.languages/oji :loc.iso639-2/oji],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ojibwa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ojibwa-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ojibwa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "ojibwa"}
                   {:rdf/language "de",
                    :rdf/value    "Ojibwa-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Ojibwa"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/oj,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/oji :loc.iso639-2/oji],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "oj",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ojibwa-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "ojibwa"}
                    {:rdf/language "en",
                     :rdf/value    "Ojibwa"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ojibwa-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ojibwa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ojibwa"}}]})

(def om
  "Oromo"
  {:db/ident :loc.iso639-1/om,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Galla-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "galla"}
                                {:rdf/language "en",
                                 :rdf/value    "Oromo"}],
   :madsrdf/code "om",
   :madsrdf/hasExactExternalAuthority [:loc.languages/orm :loc.iso639-2/orm],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Oromo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Galla-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "galla"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "galla"}
                   {:rdf/language "en",
                    :rdf/value    "Oromo"}
                   {:rdf/language "de",
                    :rdf/value    "Galla-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/om,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/orm :loc.languages/orm],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "om",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Galla-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "galla"}
                    {:rdf/language "en",
                     :rdf/value    "Oromo"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Oromo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "galla"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Galla-Sprache"}}]})

(def or
  "Oriya"
  {:db/ident :loc.iso639-1/or,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Oriya-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "oriya"}
                                {:rdf/language "en",
                                 :rdf/value    "Oriya"}],
   :madsrdf/code "or",
   :madsrdf/hasExactExternalAuthority [:loc.languages/ori :loc.iso639-2/ori],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Oriya"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "oriya"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Oriya-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "oriya"}
                   {:rdf/language "de",
                    :rdf/value    "Oriya-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Oriya"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/or,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ori :loc.iso639-2/ori],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "or",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Oriya-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "oriya"}
                    {:rdf/language "en",
                     :rdf/value    "Oriya"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "oriya"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Oriya-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Oriya"}}]})

(def os
  "Ossetian | Ossetic"
  {:db/ident :loc.iso639-1/os,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2000-02-18T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2000-02-18T05:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Variant added"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ossetisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "ossète"}
                                {:rdf/language "en",
                                 :rdf/value    "Ossetian |  Ossetic"}],
   :madsrdf/code "os",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/oss :loc.languages/oss],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ossetisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ossetic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ossète"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ossetian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Ossetian added"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Ossetisch"}
                   {:rdf/language "en",
                    :rdf/value    "Ossetic"}
                   {:rdf/language "en",
                    :rdf/value    "Ossetian"}
                   {:rdf/language "fr",
                    :rdf/value    "ossète"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/os,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/os,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/oss :loc.languages/oss],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Ossetian added"},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "os",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ossetisch"}
                    {:rdf/language "fr",
                     :rdf/value    "ossète"}
                    {:rdf/language "en",
                     :rdf/value    "Ossetian | Ossetic"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ossète"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ossetic"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ossetian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ossetisch"}}]})

(def pa
  "Panjabi | Punjabi"
  {:db/ident :loc.iso639-1/pa,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Pandschabi-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "pendjabi"}
                                {:rdf/language "en",
                                 :rdf/value    "Panjabi |  Punjabi"}],
   :madsrdf/code "pa",
   :madsrdf/hasExactExternalAuthority [:loc.languages/pan :loc.iso639-2/pan],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Punjabi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value
                                                "Pandschabi-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Panjabi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "pendjabi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Punjabi"}
                   {:rdf/language "fr",
                    :rdf/value    "pendjabi"}
                   {:rdf/language "en",
                    :rdf/value    "Panjabi"}
                   {:rdf/language "de",
                    :rdf/value    "Pandschabi-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/pa,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/pan :loc.languages/pan],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "pa",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Pandschabi-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "pendjabi"}
                    {:rdf/language "en",
                     :rdf/value    "Panjabi | Punjabi"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Punjabi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Pandschabi-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Panjabi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "pendjabi"}}]})

(def pi
  "Pali"
  {:db/ident :loc.iso639-1/pi,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Pali"}
                                {:rdf/language "fr",
                                 :rdf/value    "pali"}
                                {:rdf/language "en",
                                 :rdf/value    "Pali"}],
   :madsrdf/code "pi",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/pli :loc.languages/pli],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Pali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "pali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Pali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Pali"}
                   {:rdf/language "en",
                    :rdf/value    "Pali"}
                   {:rdf/language "fr",
                    :rdf/value    "pali"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/pi,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/pli :loc.languages/pli],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "pi",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Pali"}
                    {:rdf/language "fr",
                     :rdf/value    "pali"}
                    {:rdf/language "en",
                     :rdf/value    "Pali"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "pali"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Pali"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pali"}}]})

(def pl
  "Polish"
  {:db/ident :loc.iso639-1/pl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Polnisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "polonais"}
                                {:rdf/language "en",
                                 :rdf/value    "Polish"}],
   :madsrdf/code "pl",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/pol :loc.languages/pol],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Polish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "polonais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Polnisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Polish"}
                   {:rdf/language "de",
                    :rdf/value    "Polnisch"}
                   {:rdf/language "fr",
                    :rdf/value    "polonais"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/pl,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/pol :loc.iso639-2/pol],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "pl",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Polnisch"}
                    {:rdf/language "fr",
                     :rdf/value    "polonais"}
                    {:rdf/language "en",
                     :rdf/value    "Polish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "polonais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Polish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Polnisch"}}]})

(def ps
  "Pushto | Pashto"
  {:db/ident :loc.iso639-1/ps,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2007-12-17T05:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Variant added"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Paschtu"}
                                {:rdf/language "fr",
                                 :rdf/value    "pachto"}
                                {:rdf/language "en",
                                 :rdf/value    "Pushto |  Pashto"}],
   :madsrdf/code "ps",
   :madsrdf/hasExactExternalAuthority [:loc.languages/pus :loc.iso639-2/pus],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Pushto"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Pashto"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Paschtu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "pachto"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "pachto"}
                   {:rdf/language "de",
                    :rdf/value    "Paschtu"}
                   {:rdf/language "en",
                    :rdf/value    "Pushto"}
                   {:rdf/language "en",
                    :rdf/value    "Pashto"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2007-12-17T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ps,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/ps,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/pus :loc.languages/pus],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ps",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Paschtu"}
                    {:rdf/language "fr",
                     :rdf/value    "pachto"}
                    {:rdf/language "en",
                     :rdf/value    "Pushto | Pashto"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pushto"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pashto"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Paschtu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "pachto"}}]})

(def pt
  "Portuguese"
  {:db/ident :loc.iso639-1/pt,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Portugiesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "portugais"}
                                {:rdf/language "en",
                                 :rdf/value    "Portuguese"}],
   :madsrdf/code "pt",
   :madsrdf/hasExactExternalAuthority [:loc.languages/por :loc.iso639-2/por],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "portugais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Portugiesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Portuguese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Portuguese"}
                   {:rdf/language "fr",
                    :rdf/value    "portugais"}
                   {:rdf/language "de",
                    :rdf/value    "Portugiesisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/pt,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/por :loc.iso639-2/por],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "pt",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Portugiesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "portugais"}
                    {:rdf/language "en",
                     :rdf/value    "Portuguese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Portuguese"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Portugiesisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "portugais"}}]})

(def qu
  "Quechua"
  {:db/ident :loc.iso639-1/qu,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Quechua-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "quechua"}
                                {:rdf/language "en",
                                 :rdf/value    "Quechua"}],
   :madsrdf/code "qu",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/que :loc.languages/que],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Quechua"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Quechua-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "quechua"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "quechua"}
                   {:rdf/language "de",
                    :rdf/value    "Quechua-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Quechua"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/qu,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/que :loc.languages/que],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "qu",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Quechua-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "quechua"}
                    {:rdf/language "en",
                     :rdf/value    "Quechua"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "quechua"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Quechua-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Quechua"}}]})

(def rm
  "Romansh"
  {:db/ident :loc.iso639-1/rm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2006-10-25T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Name change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Rätoromanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "romanche"}
                                {:rdf/language "en",
                                 :rdf/value    "Romansh"}],
   :madsrdf/code "rm",
   :madsrdf/hasExactExternalAuthority [:loc.languages/roh :loc.iso639-2/roh],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Romansh"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Rätoromanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "romanche"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Name changed from \"Raeto-Romance\""},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "romanche"}
                   {:rdf/language "de",
                    :rdf/value    "Rätoromanisch"}
                   {:rdf/language "en",
                    :rdf/value    "Romansh"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2006-10-25T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/rm,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/rm,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/roh :loc.iso639-2/roh],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Name changed from \"Raeto-Romance\""},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "rm",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Rätoromanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "romanche"}
                    {:rdf/language "en",
                     :rdf/value    "Romansh"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "romanche"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Rätoromanisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Romansh"}}]})

(def rn
  "Rundi"
  {:db/ident :loc.iso639-1/rn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Rundi-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "rundi"}
                                {:rdf/language "en",
                                 :rdf/value    "Rundi"}],
   :madsrdf/code "rn",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/run :loc.languages/run],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Rundi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "rundi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Rundi-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "rundi"}
                   {:rdf/language "de",
                    :rdf/value    "Rundi-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Rundi"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/rn,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/run :loc.languages/run],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "rn",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Rundi-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "rundi"}
                    {:rdf/language "en",
                     :rdf/value    "Rundi"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Rundi-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Rundi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "rundi"}}]})

(def ro
  "Romanian | Moldavian | Moldovan"
  {:db/ident :loc.iso639-1/ro,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Rumänisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "roumain |  moldave"}
                                {:rdf/language "en",
                                 :rdf/value
                                 "Romanian |  Moldavian |  Moldovan"}],
   :madsrdf/code "ro",
   :madsrdf/hasExactExternalAuthority
   [:loc.languages/rum :loc.iso639-2/rum :loc.iso639-2/ron],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Moldavian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "roumain"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Moldovan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "moldave"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Rumänisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Romanian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Moldavian"}
                   {:rdf/language "en",
                    :rdf/value    "Romanian"}
                   {:rdf/language "fr",
                    :rdf/value    "moldave"}
                   {:rdf/language "en",
                    :rdf/value    "Moldovan"}
                   {:rdf/language "fr",
                    :rdf/value    "roumain"}
                   {:rdf/language "de",
                    :rdf/value    "Rumänisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ro,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/rum :loc.iso639-2/rum :loc.iso639-2/ron],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ro",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Rumänisch"}
                    {:rdf/language "fr",
                     :rdf/value    "roumain | moldave"}
                    {:rdf/language "en",
                     :rdf/value    "Romanian | Moldavian | Moldovan"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "moldave"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Moldavian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "roumain"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Rumänisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Romanian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Moldovan"}}]})

(def ru
  "Russian"
  {:db/ident :loc.iso639-1/ru,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Russisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "russe"}
                                {:rdf/language "en",
                                 :rdf/value    "Russian"}],
   :madsrdf/code "ru",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/rus :loc.languages/rus],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Russian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Russisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "russe"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Russian"}
                   {:rdf/language "de",
                    :rdf/value    "Russisch"}
                   {:rdf/language "fr",
                    :rdf/value    "russe"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ru,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/rus :loc.iso639-2/rus],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ru",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Russisch"}
                    {:rdf/language "fr",
                     :rdf/value    "russe"}
                    {:rdf/language "en",
                     :rdf/value    "Russian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "russe"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Russisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Russian"}}]})

(def rw
  "Kinyarwanda"
  {:db/ident :loc.iso639-1/rw,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Rwanda-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "rwanda"}
                                {:rdf/language "en",
                                 :rdf/value    "Kinyarwanda"}],
   :madsrdf/code "rw",
   :madsrdf/hasExactExternalAuthority [:loc.languages/kin :loc.iso639-2/kin],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Rwanda-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "rwanda"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kinyarwanda"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "rwanda"}
                   {:rdf/language "de",
                    :rdf/value    "Rwanda-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Kinyarwanda"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/rw,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/kin :loc.iso639-2/kin],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "rw",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Rwanda-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "rwanda"}
                    {:rdf/language "en",
                     :rdf/value    "Kinyarwanda"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kinyarwanda"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "rwanda"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Rwanda-Sprache"}}]})

(def sa
  "Sanskrit"
  {:db/ident :loc.iso639-1/sa,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Sanskrit"}
                                {:rdf/language "fr",
                                 :rdf/value    "sanskrit"}
                                {:rdf/language "en",
                                 :rdf/value    "Sanskrit"}],
   :madsrdf/code "sa",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/san :loc.languages/san],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "sanskrit"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Sanskrit"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sanskrit"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Sanskrit"}
                   {:rdf/language "en",
                    :rdf/value    "Sanskrit"}
                   {:rdf/language "fr",
                    :rdf/value    "sanskrit"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sa,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/san :loc.languages/san],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sa",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Sanskrit"}
                    {:rdf/language "fr",
                     :rdf/value    "sanskrit"}
                    {:rdf/language "en",
                     :rdf/value    "Sanskrit"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Sanskrit"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sanskrit"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "sanskrit"}}]})

(def sc
  "Sardinian"
  {:db/ident :loc.iso639-1/sc,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Sardisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "sarde"}
                                {:rdf/language "en",
                                 :rdf/value    "Sardinian"}],
   :madsrdf/code "sc",
   :madsrdf/hasExactExternalAuthority [:loc.languages/srd :loc.iso639-2/srd],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sardinian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Sardisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "sarde"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Sardinian"}
                   {:rdf/language "de",
                    :rdf/value    "Sardisch"}
                   {:rdf/language "fr",
                    :rdf/value    "sarde"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sc,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/srd :loc.iso639-2/srd],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sc",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Sardisch"}
                    {:rdf/language "fr",
                     :rdf/value    "sarde"}
                    {:rdf/language "en",
                     :rdf/value    "Sardinian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "sarde"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Sardisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sardinian"}}]})

(def sd
  "Sindhi"
  {:db/ident :loc.iso639-1/sd,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Sindhi-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "sindhi"}
                                {:rdf/language "en",
                                 :rdf/value    "Sindhi"}],
   :madsrdf/code "sd",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/snd :loc.languages/snd],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "sindhi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Sindhi-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sindhi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "sindhi"}
                   {:rdf/language "en",
                    :rdf/value    "Sindhi"}
                   {:rdf/language "de",
                    :rdf/value    "Sindhi-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sd,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/snd :loc.languages/snd],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sd",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Sindhi-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "sindhi"}
                    {:rdf/language "en",
                     :rdf/value    "Sindhi"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sindhi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Sindhi-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "sindhi"}}]})

(def se
  "Northern Sami"
  {:db/ident :loc.iso639-1/se,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Nordsaamisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "sami du Nord"}
                                {:rdf/language "en",
                                 :rdf/value    "Northern Sami"}],
   :madsrdf/code "se",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/sme :loc.languages/sme],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "sami du Nord"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Nordsaamisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Northern Sami"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "sami du Nord"}
                   {:rdf/language "en",
                    :rdf/value    "Northern Sami"}
                   {:rdf/language "de",
                    :rdf/value    "Nordsaamisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/se,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/sme :loc.languages/sme],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "se",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Nordsaamisch"}
                    {:rdf/language "fr",
                     :rdf/value    "sami du Nord"}
                    {:rdf/language "en",
                     :rdf/value    "Northern Sami"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Nordsaamisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "sami du Nord"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Northern Sami"}}]})

(def sg
  "Sango"
  {:db/ident :loc.iso639-1/sg,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Sango-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "sango"}
                                {:rdf/language "en",
                                 :rdf/value    "Sango"}],
   :madsrdf/code "sg",
   :madsrdf/hasExactExternalAuthority [:loc.languages/sag :loc.iso639-2/sag],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Sango-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sango"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "sango"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "sango"}
                   {:rdf/language "en",
                    :rdf/value    "Sango"}
                   {:rdf/language "de",
                    :rdf/value    "Sango-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sg,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/sag :loc.iso639-2/sag],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sg",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Sango-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "sango"}
                    {:rdf/language "en",
                     :rdf/value    "Sango"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sango"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "sango"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Sango-Sprache"}}]})

(def si
  "Sinhala | Sinhalese"
  {:db/ident :loc.iso639-1/si,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2004-10-19T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Variant added"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Singhalesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "singhalais"}
                                {:rdf/language "en",
                                 :rdf/value    "Sinhala |  Sinhalese"}],
   :madsrdf/code "si",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/sin :loc.languages/sin],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "singhalais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Singhalesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sinhala"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sinhalese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Sinhala added"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Singhalesisch"}
                   {:rdf/language "en",
                    :rdf/value    "Sinhalese"}
                   {:rdf/language "en",
                    :rdf/value    "Sinhala"}
                   {:rdf/language "fr",
                    :rdf/value    "singhalais"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2004-10-19T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/si,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/si,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/sin :loc.languages/sin],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Sinhala added"},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "si",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Singhalesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "singhalais"}
                    {:rdf/language "en",
                     :rdf/value    "Sinhala | Sinhalese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sinhala"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sinhalese"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "singhalais"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Singhalesisch"}}]})

(def sk
  "Slovak"
  {:db/ident :loc.iso639-1/sk,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Slowakisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "slovaque"}
                                {:rdf/language "en",
                                 :rdf/value    "Slovak"}],
   :madsrdf/code "sk",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/slk :loc.languages/slo :loc.iso639-2/slo],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Slovak"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Slowakisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "slovaque"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Slowakisch"}
                   {:rdf/language "fr",
                    :rdf/value    "slovaque"}
                   {:rdf/language "en",
                    :rdf/value    "Slovak"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sk,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/slo :loc.iso639-2/slk :loc.iso639-2/slo],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sk",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Slowakisch"}
                    {:rdf/language "fr",
                     :rdf/value    "slovaque"}
                    {:rdf/language "en",
                     :rdf/value    "Slovak"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Slowakisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "slovaque"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Slovak"}}]})

(def sl
  "Slovenian"
  {:db/ident :loc.iso639-1/sl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Slowenisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "slovène"}
                                {:rdf/language "en",
                                 :rdf/value    "Slovenian"}],
   :madsrdf/code "sl",
   :madsrdf/hasExactExternalAuthority [:loc.languages/slv :loc.iso639-2/slv],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Slowenisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Slovenian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "slovène"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Slovenian"}
                   {:rdf/language "de",
                    :rdf/value    "Slowenisch"}
                   {:rdf/language "fr",
                    :rdf/value    "slovène"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sl,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/slv :loc.languages/slv],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sl",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Slowenisch"}
                    {:rdf/language "fr",
                     :rdf/value    "slovène"}
                    {:rdf/language "en",
                     :rdf/value    "Slovenian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Slowenisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "slovène"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Slovenian"}}]})

(def sm
  "Samoan"
  {:db/ident :loc.iso639-1/sm,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Samoanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "samoan"}
                                {:rdf/language "en",
                                 :rdf/value    "Samoan"}],
   :madsrdf/code "sm",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/smo :loc.languages/smo],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "samoan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Samoan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Samoanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Samoan"}
                   {:rdf/language "de",
                    :rdf/value    "Samoanisch"}
                   {:rdf/language "fr",
                    :rdf/value    "samoan"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sm,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/smo :loc.iso639-2/smo],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sm",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Samoanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "samoan"}
                    {:rdf/language "en",
                     :rdf/value    "Samoan"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Samoan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "samoan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Samoanisch"}}]})

(def sn
  "Shona"
  {:db/ident :loc.iso639-1/sn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Schona-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "shona"}
                                {:rdf/language "en",
                                 :rdf/value    "Shona"}],
   :madsrdf/code "sn",
   :madsrdf/hasExactExternalAuthority [:loc.languages/sna :loc.iso639-2/sna],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Shona"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "shona"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Schona-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Schona-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "shona"}
                   {:rdf/language "en",
                    :rdf/value    "Shona"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sn,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/sna :loc.languages/sna],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sn",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Schona-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "shona"}
                    {:rdf/language "en",
                     :rdf/value    "Shona"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Schona-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "shona"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Shona"}}]})

(def so
  "Somali"
  {:db/ident :loc.iso639-1/so,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Somali"}
                                {:rdf/language "fr",
                                 :rdf/value    "somali"}
                                {:rdf/language "en",
                                 :rdf/value    "Somali"}],
   :madsrdf/code "so",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/som :loc.languages/som],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Somali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "somali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Somali"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Somali"}
                   {:rdf/language "en",
                    :rdf/value    "Somali"}
                   {:rdf/language "fr",
                    :rdf/value    "somali"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/so,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/som :loc.languages/som],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "so",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Somali"}
                    {:rdf/language "fr",
                     :rdf/value    "somali"}
                    {:rdf/language "en",
                     :rdf/value    "Somali"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Somali"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Somali"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "somali"}}]})

(def sq
  "Albanian"
  {:db/ident :loc.iso639-1/sq,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Albanisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "albanais"}
                                {:rdf/language "en",
                                 :rdf/value    "Albanian"}],
   :madsrdf/code "sq",
   :madsrdf/hasExactExternalAuthority
   [:loc.languages/alb :loc.iso639-2/sqi :loc.iso639-2/alb],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "albanais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Albanian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Albanisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Albanisch"}
                   {:rdf/language "fr",
                    :rdf/value    "albanais"}
                   {:rdf/language "en",
                    :rdf/value    "Albanian"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sq,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/alb :loc.iso639-2/sqi :loc.iso639-2/alb],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sq",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Albanisch"}
                    {:rdf/language "fr",
                     :rdf/value    "albanais"}
                    {:rdf/language "en",
                     :rdf/value    "Albanian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Albanian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Albanisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "albanais"}}]})

(def sr
  "Serbian"
  {:db/ident :loc.iso639-1/sr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2008-06-28T04:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Code change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Serbisch "}
                                {:rdf/language "fr",
                                 :rdf/value    "serbe"}
                                {:rdf/language "en",
                                 :rdf/value    "Serbian"}],
   :madsrdf/code "sr",
   :madsrdf/hasExactExternalAuthority [:loc.languages/srp :loc.iso639-2/srp],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "serbe"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Serbian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Serbisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "serbe"}
                   {:rdf/language "de",
                    :rdf/value    "Serbisch"}
                   {:rdf/language "en",
                    :rdf/value    "Serbian"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2008-06-28T04:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/sr,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/sr,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/srp :loc.iso639-2/srp],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sr",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Serbisch"}
                    {:rdf/language "fr",
                     :rdf/value    "serbe"}
                    {:rdf/language "en",
                     :rdf/value    "Serbian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "serbe"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Serbian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Serbisch"}}]})

(def ss
  "Swati"
  {:db/ident :loc.iso639-1/ss,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Swasi-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "swati"}
                                {:rdf/language "en",
                                 :rdf/value    "Swati"}],
   :madsrdf/code "ss",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ssw :loc.languages/ssw],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Swasi-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "swati"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Swati"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Swasi-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Swati"}
                   {:rdf/language "fr",
                    :rdf/value    "swati"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ss,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ssw :loc.languages/ssw],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ss",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Swasi-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "swati"}
                    {:rdf/language "en",
                     :rdf/value    "Swati"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "swati"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Swasi-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Swati"}}]})

(def st
  "Sotho, Southern"
  {:db/ident :loc.iso639-1/st,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Süd-Sotho-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "sotho du Sud"}
                                {:rdf/language "en",
                                 :rdf/value    "Sotho, Southern"}],
   :madsrdf/code "st",
   :madsrdf/hasExactExternalAuthority [:loc.languages/sot :loc.iso639-2/sot],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "sotho du Sud"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Sotho, Southern"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Süd-Sotho-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Süd-Sotho-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "sotho du Sud"}
                   {:rdf/language "en",
                    :rdf/value    "Sotho, Southern"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/st,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/sot :loc.iso639-2/sot],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "st",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Süd-Sotho-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "sotho du Sud"}
                    {:rdf/language "en",
                     :rdf/value    "Sotho, Southern"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "sotho du Sud"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Süd-Sotho-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sotho, Southern"}}]})

(def su
  "Sundanese"
  {:db/ident :loc.iso639-1/su,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Sundanesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "soundanais"}
                                {:rdf/language "en",
                                 :rdf/value    "Sundanese"}],
   :madsrdf/code "su",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/sun :loc.languages/sun],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "soundanais"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Sundanesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sundanese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Sundanesisch"}
                   {:rdf/language "en",
                    :rdf/value    "Sundanese"}
                   {:rdf/language "fr",
                    :rdf/value    "soundanais"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/su,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/sun :loc.languages/sun],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "su",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Sundanesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "soundanais"}
                    {:rdf/language "en",
                     :rdf/value    "Sundanese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sundanese"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Sundanesisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "soundanais"}}]})

(def sv
  "Swedish"
  {:db/ident :loc.iso639-1/sv,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Schwedisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "suédois"}
                                {:rdf/language "en",
                                 :rdf/value    "Swedish"}],
   :madsrdf/code "sv",
   :madsrdf/hasExactExternalAuthority [:loc.languages/swe :loc.iso639-2/swe],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Swedish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Schwedisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "suédois"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "suédois"}
                   {:rdf/language "de",
                    :rdf/value    "Schwedisch"}
                   {:rdf/language "en",
                    :rdf/value    "Swedish"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sv,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/swe :loc.iso639-2/swe],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sv",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Schwedisch"}
                    {:rdf/language "fr",
                     :rdf/value    "suédois"}
                    {:rdf/language "en",
                     :rdf/value    "Swedish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Swedish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "suédois"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Schwedisch"}}]})

(def sw
  "Swahili"
  {:db/ident :loc.iso639-1/sw,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Swahili"}
                                {:rdf/language "fr",
                                 :rdf/value    "swahili"}
                                {:rdf/language "en",
                                 :rdf/value    "Swahili"}],
   :madsrdf/code "sw",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/swa :loc.languages/swa],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Swahili"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "swahili"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Swahili"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Swahili"}
                   {:rdf/language "en",
                    :rdf/value    "Swahili"}
                   {:rdf/language "fr",
                    :rdf/value    "swahili"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/sw,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/swa :loc.iso639-2/swa],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "sw",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Swahili"}
                    {:rdf/language "fr",
                     :rdf/value    "swahili"}
                    {:rdf/language "en",
                     :rdf/value    "Swahili"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Swahili"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Swahili"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "swahili"}}]})

(def ta
  "Tamil"
  {:db/ident :loc.iso639-1/ta,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tamil"}
                                {:rdf/language "fr",
                                 :rdf/value    "tamoul"}
                                {:rdf/language "en",
                                 :rdf/value    "Tamil"}],
   :madsrdf/code "ta",
   :madsrdf/hasExactExternalAuthority [:loc.languages/tam :loc.iso639-2/tam],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tamil"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tamoul"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tamil"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Tamil"}
                   {:rdf/language "en",
                    :rdf/value    "Tamil"}
                   {:rdf/language "fr",
                    :rdf/value    "tamoul"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ta,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/tam :loc.iso639-2/tam],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ta",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tamil"}
                    {:rdf/language "fr",
                     :rdf/value    "tamoul"}
                    {:rdf/language "en",
                     :rdf/value    "Tamil"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tamil"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tamoul"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tamil"}}]})

(def te
  "Telugu"
  {:db/ident :loc.iso639-1/te,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Telugu-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "télougou"}
                                {:rdf/language "en",
                                 :rdf/value    "Telugu"}],
   :madsrdf/code "te",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/tel :loc.languages/tel],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Telugu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "télougou"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Telugu-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "télougou"}
                   {:rdf/language "de",
                    :rdf/value    "Telugu-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Telugu"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/te,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/tel :loc.iso639-2/tel],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "te",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Telugu-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "télougou"}
                    {:rdf/language "en",
                     :rdf/value    "Telugu"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "télougou"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Telugu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Telugu-Sprache"}}]})

(def tg
  "Tajik"
  {:db/ident :loc.iso639-1/tg,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tadschikisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "tadjik"}
                                {:rdf/language "en",
                                 :rdf/value    "Tajik"}],
   :madsrdf/code "tg",
   :madsrdf/hasExactExternalAuthority [:loc.languages/tgk :loc.iso639-2/tgk],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tadschikisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tajik"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tadjik"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Tadschikisch"}
                   {:rdf/language "fr",
                    :rdf/value    "tadjik"}
                   {:rdf/language "en",
                    :rdf/value    "Tajik"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/tg,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/tgk :loc.languages/tgk],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "tg",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tadschikisch"}
                    {:rdf/language "fr",
                     :rdf/value    "tadjik"}
                    {:rdf/language "en",
                     :rdf/value    "Tajik"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tadschikisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tadjik"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tajik"}}]})

(def th
  "Thai"
  {:db/ident :loc.iso639-1/th,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Thailändisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "thaï"}
                                {:rdf/language "en",
                                 :rdf/value    "Thai"}],
   :madsrdf/code "th",
   :madsrdf/hasExactExternalAuthority [:loc.languages/tha :loc.iso639-2/tha],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Thai"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "thaï"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Thailändisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "thaï"}
                   {:rdf/language "en",
                    :rdf/value    "Thai"}
                   {:rdf/language "de",
                    :rdf/value    "Thailändisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/th,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/tha :loc.languages/tha],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "th",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Thailändisch"}
                    {:rdf/language "fr",
                     :rdf/value    "thaï"}
                    {:rdf/language "en",
                     :rdf/value    "Thai"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Thai"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "thaï"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Thailändisch"}}]})

(def ti
  "Tigrinya"
  {:db/ident :loc.iso639-1/ti,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tigrinja-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "tigrigna"}
                                {:rdf/language "en",
                                 :rdf/value    "Tigrinya"}],
   :madsrdf/code "ti",
   :madsrdf/hasExactExternalAuthority [:loc.languages/tir :loc.iso639-2/tir],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value "Tigrinja-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tigrinya"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tigrigna"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Tigrinja-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Tigrinya"}
                   {:rdf/language "fr",
                    :rdf/value    "tigrigna"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ti,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/tir :loc.iso639-2/tir],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ti",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tigrinja-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "tigrigna"}
                    {:rdf/language "en",
                     :rdf/value    "Tigrinya"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tigrinja-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tigrigna"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tigrinya"}}]})

(def tk
  "Turkmen"
  {:db/ident :loc.iso639-1/tk,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Turkmenisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "turkmène"}
                                {:rdf/language "en",
                                 :rdf/value    "Turkmen"}],
   :madsrdf/code "tk",
   :madsrdf/hasExactExternalAuthority [:loc.languages/tuk :loc.iso639-2/tuk],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "turkmène"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Turkmenisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Turkmen"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Turkmen"}
                   {:rdf/language "fr",
                    :rdf/value    "turkmène"}
                   {:rdf/language "de",
                    :rdf/value    "Turkmenisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/tk,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/tuk :loc.iso639-2/tuk],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "tk",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Turkmenisch"}
                    {:rdf/language "fr",
                     :rdf/value    "turkmène"}
                    {:rdf/language "en",
                     :rdf/value    "Turkmen"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Turkmenisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "turkmène"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Turkmen"}}]})

(def tl
  "Tagalog"
  {:db/ident :loc.iso639-1/tl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tagalog"}
                                {:rdf/language "fr",
                                 :rdf/value    "tagalog"}
                                {:rdf/language "en",
                                 :rdf/value    "Tagalog"}],
   :madsrdf/code "tl",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/tgl :loc.languages/tgl],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tagalog"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tagalog"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tagalog"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "tagalog"}
                   {:rdf/language "de",
                    :rdf/value    "Tagalog"}
                   {:rdf/language "en",
                    :rdf/value    "Tagalog"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/tl,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/tgl :loc.languages/tgl],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "tl",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tagalog"}
                    {:rdf/language "fr",
                     :rdf/value    "tagalog"}
                    {:rdf/language "en",
                     :rdf/value    "Tagalog"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tagalog"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tagalog"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tagalog"}}]})

(def tn
  "Tswana"
  {:db/ident :loc.iso639-1/tn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tswana-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "tswana"}
                                {:rdf/language "en",
                                 :rdf/value    "Tswana"}],
   :madsrdf/code "tn",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/tsn :loc.languages/tsn],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tswana"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tswana"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tswana-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "tswana"}
                   {:rdf/language "de",
                    :rdf/value    "Tswana-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Tswana"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/tn,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/tsn :loc.languages/tsn],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "tn",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tswana-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "tswana"}
                    {:rdf/language "en",
                     :rdf/value    "Tswana"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tswana"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tswana"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tswana-Sprache"}}]})

(def to
  "Tonga (Tonga Islands)"
  {:db/ident :loc.iso639-1/to,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tongaisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "tongan (Îles Tonga)"}
                                {:rdf/language "en",
                                 :rdf/value    "Tonga (Tonga Islands)"}],
   :madsrdf/code "to",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ton :loc.languages/ton],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "fr",
                            :rdf/value    "tongan (Îles Tonga)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Tonga (Tonga Islands)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}
    {:madsrdf/variantLabel {:rdf/language "de",
                            :rdf/value    "Tongaisch"},
     :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Tongaisch"}
                   {:rdf/language "en",
                    :rdf/value    "Tonga (Tonga Islands)"}
                   {:rdf/language "fr",
                    :rdf/value    "tongan (Îles Tonga)"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/to,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ton :loc.iso639-2/ton],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "to",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tongaisch"}
                    {:rdf/language "fr",
                     :rdf/value    "tongan (Îles Tonga)"}
                    {:rdf/language "en",
                     :rdf/value    "Tonga (Tonga Islands)"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tongan (Îles Tonga)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tongaisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Tonga (Tonga Islands)"}}]})

(def tr
  "Turkish"
  {:db/ident :loc.iso639-1/tr,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Türkisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "turc"}
                                {:rdf/language "en",
                                 :rdf/value    "Turkish"}],
   :madsrdf/code "tr",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/tur :loc.languages/tur],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Turkish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Türkisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "turc"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Türkisch"}
                   {:rdf/language "en",
                    :rdf/value    "Turkish"}
                   {:rdf/language "fr",
                    :rdf/value    "turc"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/tr,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/tur :loc.iso639-2/tur],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "tr",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Türkisch"}
                    {:rdf/language "fr",
                     :rdf/value    "turc"}
                    {:rdf/language "en",
                     :rdf/value    "Turkish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "turc"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Turkish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Türkisch"}}]})

(def ts
  "Tsonga"
  {:db/ident :loc.iso639-1/ts,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tsonga-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "tsonga"}
                                {:rdf/language "en",
                                 :rdf/value    "Tsonga"}],
   :madsrdf/code "ts",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/tso :loc.languages/tso],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tsonga"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tsonga-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tsonga"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Tsonga"}
                   {:rdf/language "fr",
                    :rdf/value    "tsonga"}
                   {:rdf/language "de",
                    :rdf/value    "Tsonga-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ts,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/tso :loc.iso639-2/tso],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ts",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tsonga-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "tsonga"}
                    {:rdf/language "en",
                     :rdf/value    "Tsonga"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tsonga"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tsonga"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tsonga-Sprache"}}]})

(def tt
  "Tatar"
  {:db/ident :loc.iso639-1/tt,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tatarisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "tatar"}
                                {:rdf/language "en",
                                 :rdf/value    "Tatar"}],
   :madsrdf/code "tt",
   :madsrdf/hasExactExternalAuthority [:loc.languages/tat :loc.iso639-2/tat],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tatar"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tatarisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tatar"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "tatar"}
                   {:rdf/language "de",
                    :rdf/value    "Tatarisch"}
                   {:rdf/language "en",
                    :rdf/value    "Tatar"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/tt,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/tat :loc.iso639-2/tat],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "tt",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tatarisch"}
                    {:rdf/language "fr",
                     :rdf/value    "tatar"}
                    {:rdf/language "en",
                     :rdf/value    "Tatar"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tatarisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tatar"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tatar"}}]})

(def tw
  "Twi"
  {:db/ident :loc.iso639-1/tw,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Twi-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "twi"}
                                {:rdf/language "en",
                                 :rdf/value    "Twi"}],
   :madsrdf/code "tw",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/twi :loc.languages/twi],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "twi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Twi-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Twi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Twi-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "twi"}
                   {:rdf/language "en",
                    :rdf/value    "Twi"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/tw,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/twi :loc.languages/twi],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "tw",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Twi-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "twi"}
                    {:rdf/language "en",
                     :rdf/value    "Twi"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "twi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Twi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Twi-Sprache"}}]})

(def ty
  "Tahitian"
  {:db/ident :loc.iso639-1/ty,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2000-02-18T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Tahitisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "tahitien"}
                                {:rdf/language "en",
                                 :rdf/value    "Tahitian"}],
   :madsrdf/code "ty",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/tah :loc.languages/tah],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tahitian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "tahitien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Tahitisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "tahitien"}
                   {:rdf/language "en",
                    :rdf/value    "Tahitian"}
                   {:rdf/language "de",
                    :rdf/value    "Tahitisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2000-02-18T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ty,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/tah :loc.languages/tah],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ty",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Tahitisch"}
                    {:rdf/language "fr",
                     :rdf/value    "tahitien"}
                    {:rdf/language "en",
                     :rdf/value    "Tahitian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Tahitisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tahitian"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "tahitien"}}]})

(def ug
  "Uighur | Uyghur"
  {:db/ident :loc.iso639-1/ug,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1989-03-11T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Uigurisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "ouïgour"}
                                {:rdf/language "en",
                                 :rdf/value    "Uighur |  Uyghur"}],
   :madsrdf/code "ug",
   :madsrdf/hasExactExternalAuthority [:loc.languages/uig :loc.iso639-2/uig],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Uigurisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ouïgour"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Uyghur"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Uighur"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "ouïgour"}
                   {:rdf/language "de",
                    :rdf/value    "Uigurisch"}
                   {:rdf/language "en",
                    :rdf/value    "Uighur"}
                   {:rdf/language "en",
                    :rdf/value    "Uyghur"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1989-03-11T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ug,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/uig :loc.iso639-2/uig],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ug",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Uigurisch"}
                    {:rdf/language "fr",
                     :rdf/value    "ouïgour"}
                    {:rdf/language "en",
                     :rdf/value    "Uighur | Uyghur"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Uighur"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ouïgour"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Uyghur"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Uigurisch"}}]})

(def uk
  "Ukrainian"
  {:db/ident :loc.iso639-1/uk,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Ukrainisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "ukrainien"}
                                {:rdf/language "en",
                                 :rdf/value    "Ukrainian"}],
   :madsrdf/code "uk",
   :madsrdf/hasExactExternalAuthority [:loc.languages/ukr :loc.iso639-2/ukr],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Ukrainisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ukrainian"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ukrainien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Ukrainian"}
                   {:rdf/language "de",
                    :rdf/value    "Ukrainisch"}
                   {:rdf/language "fr",
                    :rdf/value    "ukrainien"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/uk,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ukr :loc.iso639-2/ukr],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "uk",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Ukrainisch"}
                    {:rdf/language "fr",
                     :rdf/value    "ukrainien"}
                    {:rdf/language "en",
                     :rdf/value    "Ukrainian"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Ukrainisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ukrainien"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ukrainian"}}]})

(def ur
  "Urdu"
  {:db/ident :loc.iso639-1/ur,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Urdu"}
                                {:rdf/language "fr",
                                 :rdf/value    "ourdou"}
                                {:rdf/language "en",
                                 :rdf/value    "Urdu"}],
   :madsrdf/code "ur",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/urd :loc.languages/urd],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Urdu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Urdu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ourdou"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Urdu"}
                   {:rdf/language "en",
                    :rdf/value    "Urdu"}
                   {:rdf/language "fr",
                    :rdf/value    "ourdou"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ur,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/urd :loc.languages/urd],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ur",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Urdu"}
                    {:rdf/language "fr",
                     :rdf/value    "ourdou"}
                    {:rdf/language "en",
                     :rdf/value    "Urdu"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ourdou"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Urdu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Urdu"}}]})

(def uz
  "Uzbek"
  {:db/ident :loc.iso639-1/uz,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Usbekisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "ouszbek"}
                                {:rdf/language "en",
                                 :rdf/value    "Uzbek"}],
   :madsrdf/code "uz",
   :madsrdf/hasExactExternalAuthority [:loc.languages/uzb :loc.iso639-2/uzb],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Uzbek"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Usbekisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "ouszbek"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Uzbek"}
                   {:rdf/language "de",
                    :rdf/value    "Usbekisch"}
                   {:rdf/language "fr",
                    :rdf/value    "ouszbek"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/uz,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/uzb :loc.languages/uzb],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "uz",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Usbekisch"}
                    {:rdf/language "fr",
                     :rdf/value    "ouszbek"}
                    {:rdf/language "en",
                     :rdf/value    "Uzbek"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Uzbek"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Usbekisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "ouszbek"}}]})

(def ve
  "Venda"
  {:db/ident :loc.iso639-1/ve,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1999-08-16T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Venda-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "venda"}
                                {:rdf/language "en",
                                 :rdf/value    "Venda"}],
   :madsrdf/code "ve",
   :madsrdf/hasExactExternalAuthority [:loc.languages/ven :loc.iso639-2/ven],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Venda-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "venda"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Venda"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Venda"}
                   {:rdf/language "fr",
                    :rdf/value    "venda"}
                   {:rdf/language "de",
                    :rdf/value    "Venda-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1999-08-16T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/ve,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ven :loc.languages/ven],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "This alpha-2 ISO 639-1 code was approved in 1999 and included in ISO 639-1: 2002. It was mistakenly missing in earlier versions of the tables on the ISO639-2 web site. As of January 2003, it has been included."},
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "ve",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Venda-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "venda"}
                    {:rdf/language "en",
                     :rdf/value    "Venda"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "venda"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Venda"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Venda-Sprache"}}]})

(def vi
  "Vietnamese"
  {:db/ident :loc.iso639-1/vi,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Vietnamesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "vietnamien"}
                                {:rdf/language "en",
                                 :rdf/value    "Vietnamese"}],
   :madsrdf/code "vi",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/vie :loc.languages/vie],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Vietnamese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Vietnamesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "vietnamien"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Vietnamese"}
                   {:rdf/language "fr",
                    :rdf/value    "vietnamien"}
                   {:rdf/language "de",
                    :rdf/value    "Vietnamesisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/vi,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/vie :loc.iso639-2/vie],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "vi",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Vietnamesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "vietnamien"}
                    {:rdf/language "en",
                     :rdf/value    "Vietnamese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Vietnamese"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Vietnamesisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "vietnamien"}}]})

(def vo
  "Volapük"
  {:db/ident :loc.iso639-1/vo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Volapük"}
                                {:rdf/language "fr",
                                 :rdf/value    "volapük"}
                                {:rdf/language "en",
                                 :rdf/value    "Volapük"}],
   :madsrdf/code "vo",
   :madsrdf/hasExactExternalAuthority [:loc.languages/vol :loc.iso639-2/vol],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Volapük"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "volapük"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Volapük"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Volapük"}
                   {:rdf/language "en",
                    :rdf/value    "Volapük"}
                   {:rdf/language "fr",
                    :rdf/value    "volapük"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/vo,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/vol :loc.iso639-2/vol],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "vo",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Volapük"}
                    {:rdf/language "fr",
                     :rdf/value    "volapük"}
                    {:rdf/language "en",
                     :rdf/value    "Volapük"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "volapük"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Volapük"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Volapük"}}]})

(def wa
  "Walloon"
  {:db/ident :loc.iso639-1/wa,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2002-01-29T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Wallonisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "wallon"}
                                {:rdf/language "en",
                                 :rdf/value    "Walloon"}],
   :madsrdf/code "wa",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/wln :loc.languages/wln],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Walloon"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Wallonisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "wallon"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "wallon"}
                   {:rdf/language "en",
                    :rdf/value    "Walloon"}
                   {:rdf/language "de",
                    :rdf/value    "Wallonisch"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2002-01-29T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/wa,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/wln :loc.iso639-2/wln],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "wa",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Wallonisch"}
                    {:rdf/language "fr",
                     :rdf/value    "wallon"}
                    {:rdf/language "en",
                     :rdf/value    "Walloon"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Walloon"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "wallon"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Wallonisch"}}]})

(def wo
  "Wolof"
  {:db/ident :loc.iso639-1/wo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Wolof-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "wolof"}
                                {:rdf/language "en",
                                 :rdf/value    "Wolof"}],
   :madsrdf/code "wo",
   :madsrdf/hasExactExternalAuthority [:loc.languages/wol :loc.iso639-2/wol],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Wolof-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "wolof"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Wolof"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Wolof"}
                   {:rdf/language "fr",
                    :rdf/value    "wolof"}
                   {:rdf/language "de",
                    :rdf/value    "Wolof-Sprache"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/wo,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/wol :loc.iso639-2/wol],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "wo",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Wolof-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "wolof"}
                    {:rdf/language "en",
                     :rdf/value    "Wolof"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "wolof"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Wolof"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Wolof-Sprache"}}]})

(def xh
  "Xhosa"
  {:db/ident :loc.iso639-1/xh,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Xhosa-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "xhosa"}
                                {:rdf/language "en",
                                 :rdf/value    "Xhosa"}],
   :madsrdf/code "xh",
   :madsrdf/hasExactExternalAuthority [:loc.languages/xho :loc.iso639-2/xho],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Xhosa-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "xhosa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Xhosa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_iso639-1
    :loc.iso639-1/collection_PastPresentISO639-1Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Xhosa-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Xhosa"}
                   {:rdf/language "fr",
                    :rdf/value    "xhosa"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/xh,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/xho :loc.iso639-2/xho],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "xh",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Xhosa-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "xhosa"}
                    {:rdf/language "en",
                     :rdf/value    "Xhosa"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "xhosa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Xhosa-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Xhosa"}}]})

(def yi
  "Yiddish"
  {:db/ident :loc.iso639-1/yi,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1989-03-11T05:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value    "Code change"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Jiddisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "yiddish"}
                                {:rdf/language "en",
                                 :rdf/value    "Yiddish"}],
   :madsrdf/code "yi",
   :madsrdf/hasExactExternalAuthority [:loc.languages/yid :loc.iso639-2/yid],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Yiddish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Jiddisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "yiddish"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :madsrdf/useFor :loc.iso639-1/ji,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Yiddish"}
                   {:rdf/language "de",
                    :rdf/value    "Jiddisch"}
                   {:rdf/language "fr",
                    :rdf/value    "yiddish"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/yi,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "1989-03-11T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-1/yi,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/yid :loc.languages/yid],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "yi",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Jiddisch"}
                    {:rdf/language "fr",
                     :rdf/value    "yiddish"}
                    {:rdf/language "en",
                     :rdf/value    "Yiddish"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Jiddisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "yiddish"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Yiddish"}}]})

(def yo
  "Yoruba"
  {:db/ident :loc.iso639-1/yo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Yoruba-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "yoruba"}
                                {:rdf/language "en",
                                 :rdf/value    "Yoruba"}],
   :madsrdf/code "yo",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/yor :loc.languages/yor],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Yoruba-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Yoruba"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "yoruba"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "de",
                    :rdf/value    "Yoruba-Sprache"}
                   {:rdf/language "fr",
                    :rdf/value    "yoruba"}
                   {:rdf/language "en",
                    :rdf/value    "Yoruba"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/yo,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/yor :loc.iso639-2/yor],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "yo",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Yoruba-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "yoruba"}
                    {:rdf/language "en",
                     :rdf/value    "Yoruba"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Yoruba-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Yoruba"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "yoruba"}}]})

(def za
  "Zhuang | Chuang"
  {:db/ident :loc.iso639-1/za,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1989-03-11T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Zhuang"}
                                {:rdf/language "fr",
                                 :rdf/value    "zhuang |  chuang"}
                                {:rdf/language "en",
                                 :rdf/value    "Zhuang |  Chuang"}],
   :madsrdf/code "za",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/zha :loc.languages/zha],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "zhuang"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "chuang"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Zhuang"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Chuang"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Zhuang"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "chuang"}
                   {:rdf/language "en",
                    :rdf/value    "Zhuang"}
                   {:rdf/language "fr",
                    :rdf/value    "zhuang"}
                   {:rdf/language "en",
                    :rdf/value    "Chuang"}
                   {:rdf/language "de",
                    :rdf/value    "Zhuang"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1989-03-11T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/za,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/zha :loc.iso639-2/zha],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "za",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Zhuang"}
                    {:rdf/language "fr",
                     :rdf/value    "zhuang | chuang"}
                    {:rdf/language "en",
                     :rdf/value    "Zhuang | Chuang"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Zhuang"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "chuang"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "zhuang"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Zhuang"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Chuang"}}]})

(def zh
  "Chinese"
  {:db/ident :loc.iso639-1/zh,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Chinesisch"}
                                {:rdf/language "fr",
                                 :rdf/value    "chinois"}
                                {:rdf/language "en",
                                 :rdf/value    "Chinese"}],
   :madsrdf/code "zh",
   :madsrdf/hasExactExternalAuthority
   [:loc.iso639-2/zho :loc.iso639-2/chi :loc.languages/chi],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Chinesisch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "chinois"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Chinese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Chinese"}
                   {:rdf/language "de",
                    :rdf/value    "Chinesisch"}
                   {:rdf/language "fr",
                    :rdf/value    "chinois"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/zh,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/zho :loc.languages/chi :loc.iso639-2/chi],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "zh",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Chinesisch"}
                    {:rdf/language "fr",
                     :rdf/value    "chinois"}
                    {:rdf/language "en",
                     :rdf/value    "Chinese"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Chinesisch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "chinois"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Chinese"}}]})

(def zu
  "Zulu"
  {:db/ident :loc.iso639-1/zu,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "de",
                                 :rdf/value    "Zulu-Sprache"}
                                {:rdf/language "fr",
                                 :rdf/value    "zoulou"}
                                {:rdf/language "en",
                                 :rdf/value    "Zulu"}],
   :madsrdf/code "zu",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/zul :loc.languages/zul],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "de",
                                                :rdf/value    "Zulu-Sprache"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "fr",
                                                :rdf/value    "zoulou"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Zulu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Language]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-1/collection_PastPresentISO639-1Entries
    :loc.iso639-1/collection_iso639-1],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-1,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "fr",
                    :rdf/value    "zoulou"}
                   {:rdf/language "de",
                    :rdf/value    "Zulu-Sprache"}
                   {:rdf/language "en",
                    :rdf/value    "Zulu"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-1/zu,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/zul :loc.iso639-2/zul],
   :skos/inScheme :loc.vocabulary/iso639-1,
   :skos/notation "zu",
   :skos/prefLabel [{:rdf/language "de",
                     :rdf/value    "Zulu-Sprache"}
                    {:rdf/language "fr",
                     :rdf/value    "zoulou"}
                    {:rdf/language "en",
                     :rdf/value    "Zulu"}],
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Zulu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "de",
                                           :rdf/value    "Zulu-Sprache"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "fr",
                                           :rdf/value    "zoulou"}}]})

(def ^{:private true} iso639-1
  "ISO 639-1 is the first part of the ISO 639 international-standard language-code family. ISO 639-1 provides two-character lowercase alphabetic strings that serve as identifiers of languages. The list contains approximately 180 discrete codes. All ISO 639-1 languages also have ISO 639-2 three-character code representations. These codes are linked to codes for the same languages in ISO 639-2 and the MARC Language Codes."
  {:db/ident :loc.vocabulary/iso639-1,
   :madsrdf/hasTopMemberOfMADSScheme [:loc.iso639-1/gd
                                      :loc.iso639-1/fy
                                      :loc.iso639-1/es
                                      :loc.iso639-1/ln
                                      :loc.iso639-1/bm
                                      :loc.iso639-1/sv
                                      :loc.iso639-1/ng
                                      :loc.iso639-1/xh
                                      :loc.iso639-1/fo
                                      :loc.iso639-1/or
                                      :loc.iso639-1/nl
                                      :loc.iso639-1/wa
                                      :loc.iso639-1/hi
                                      :loc.iso639-1/ts
                                      :loc.iso639-1/gl
                                      :loc.iso639-1/kk
                                      :loc.iso639-1/tn
                                      :loc.iso639-1/ky
                                      :loc.iso639-1/sk
                                      :loc.iso639-1/hr
                                      :loc.iso639-1/tt
                                      :loc.iso639-1/no
                                      :loc.iso639-1/ny
                                      :loc.iso639-1/ms
                                      :loc.iso639-1/eo
                                      :loc.iso639-1/cr
                                      :loc.iso639-1/si
                                      :loc.iso639-1/ig
                                      :loc.iso639-1/de
                                      :loc.iso639-1/ff
                                      :loc.iso639-1/ar
                                      :loc.iso639-1/cs
                                      :loc.iso639-1/id
                                      :loc.iso639-1/ab
                                      :loc.iso639-1/ss
                                      :loc.iso639-1/ay
                                      :loc.iso639-1/bh
                                      :loc.iso639-1/zh
                                      :loc.iso639-1/rm
                                      :loc.iso639-1/vi
                                      :loc.iso639-1/ba
                                      :loc.iso639-1/ie
                                      :loc.iso639-1/ty
                                      :loc.iso639-1/cu
                                      :loc.iso639-1/lo
                                      :loc.iso639-1/ha
                                      :loc.iso639-1/br
                                      :loc.iso639-1/kr
                                      :loc.iso639-1/ce
                                      :loc.iso639-1/mk
                                      :loc.iso639-1/rn
                                      :loc.iso639-1/li
                                      :loc.iso639-1/nv
                                      :loc.iso639-1/ga
                                      :loc.iso639-1/ru
                                      :loc.iso639-1/my
                                      :loc.iso639-1/ks
                                      :loc.iso639-1/ta
                                      :loc.iso639-1/kl
                                      :loc.iso639-1/ch
                                      :loc.iso639-1/he
                                      :loc.iso639-1/os
                                      :loc.iso639-1/to
                                      :loc.iso639-1/am
                                      :loc.iso639-1/sl
                                      :loc.iso639-1/sc
                                      :loc.iso639-1/yi
                                      :loc.iso639-1/ku
                                      :loc.iso639-1/io
                                      :loc.iso639-1/om
                                      :loc.iso639-1/fa
                                      :loc.iso639-1/pl
                                      :loc.iso639-1/ht
                                      :loc.iso639-1/ti
                                      :loc.iso639-1/tw
                                      :loc.iso639-1/ps
                                      :loc.iso639-1/st
                                      :loc.iso639-1/fr
                                      :loc.iso639-1/zu
                                      :loc.iso639-1/az
                                      :loc.iso639-1/ii
                                      :loc.iso639-1/cy
                                      :loc.iso639-1/ae
                                      :loc.iso639-1/lg
                                      :loc.iso639-1/bi
                                      :loc.iso639-1/co
                                      :loc.iso639-1/hz
                                      :loc.iso639-1/fi
                                      :loc.iso639-1/pt
                                      :loc.iso639-1/el
                                      :loc.iso639-1/cv
                                      :loc.iso639-1/bs
                                      :loc.iso639-1/it
                                      :loc.iso639-1/sq
                                      :loc.iso639-1/ml
                                      :loc.iso639-1/hy
                                      :loc.iso639-1/ro
                                      :loc.iso639-1/ak
                                      :loc.iso639-1/fj
                                      :loc.iso639-1/mg
                                      :loc.iso639-1/ka
                                      :loc.iso639-1/iu
                                      :loc.iso639-1/da
                                      :loc.iso639-1/ko
                                      :loc.iso639-1/dv
                                      :loc.iso639-1/tg
                                      :loc.iso639-1/an
                                      :loc.iso639-1/sd
                                      :loc.iso639-1/rw
                                      :loc.iso639-1/gn
                                      :loc.iso639-1/so
                                      :loc.iso639-1/as
                                      :loc.iso639-1/yo
                                      :loc.iso639-1/kv
                                      :loc.iso639-1/ki
                                      :loc.iso639-1/na
                                      :loc.iso639-1/th
                                      :loc.iso639-1/hu
                                      :loc.iso639-1/lt
                                      :loc.iso639-1/ik
                                      :loc.iso639-1/kw
                                      :loc.iso639-1/av
                                      :loc.iso639-1/ug
                                      :loc.iso639-1/sa
                                      :loc.iso639-1/nb
                                      :loc.iso639-1/bn
                                      :loc.iso639-1/af
                                      :loc.iso639-1/sw
                                      :loc.iso639-1/vo
                                      :loc.iso639-1/lv
                                      :loc.iso639-1/kg
                                      :loc.iso639-1/be
                                      :loc.iso639-1/gu
                                      :loc.iso639-1/is
                                      :loc.iso639-1/pi
                                      :loc.iso639-1/sr
                                      :loc.iso639-1/km
                                      :loc.iso639-1/dz
                                      :loc.iso639-1/tk
                                      :loc.iso639-1/en
                                      :loc.iso639-1/sm
                                      :loc.iso639-1/mh
                                      :loc.iso639-1/wo
                                      :loc.iso639-1/mn
                                      :loc.iso639-1/la
                                      :loc.iso639-1/qu
                                      :loc.iso639-1/ia
                                      :loc.iso639-1/ne
                                      :loc.iso639-1/tl
                                      :loc.iso639-1/mi
                                      :loc.iso639-1/za
                                      :loc.iso639-1/sg
                                      :loc.iso639-1/et
                                      :loc.iso639-1/uk
                                      :loc.iso639-1/su
                                      :loc.iso639-1/kj
                                      :loc.iso639-1/lu
                                      :loc.iso639-1/jv
                                      :loc.iso639-1/tr
                                      :loc.iso639-1/eu
                                      :loc.iso639-1/ee
                                      :loc.iso639-1/bo
                                      :loc.iso639-1/ja
                                      :loc.iso639-1/mr
                                      :loc.iso639-1/ho
                                      :loc.iso639-1/lb
                                      :loc.iso639-1/ve
                                      :loc.iso639-1/nn
                                      :loc.iso639-1/ur
                                      :loc.iso639-1/gv
                                      :loc.iso639-1/mt
                                      :loc.iso639-1/te
                                      :loc.iso639-1/ca
                                      :loc.iso639-1/kn
                                      :loc.iso639-1/pa
                                      :loc.iso639-1/oc
                                      :loc.iso639-1/bg
                                      :loc.iso639-1/nr
                                      :loc.iso639-1/sn
                                      :loc.iso639-1/aa
                                      :loc.iso639-1/se
                                      :loc.iso639-1/oj
                                      :loc.iso639-1/uz
                                      :loc.iso639-1/nd],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "ISO 639-1 is the first part of the ISO 639 international-standard language-code family. ISO 639-1 provides two-character lowercase alphabetic strings that serve as identifiers of languages. The list contains approximately 180 discrete codes. All ISO 639-1 languages also have ISO 639-2 three-character code representations. These codes are linked to codes for the same languages in ISO 639-2 and the MARC Language Codes.",
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "ISO 639-1: Codes for the Representation of Names of Languages - Part 1: Two-letter codes for languages"},
   :skos/hasTopConcept [:loc.iso639-1/bs
                        :loc.iso639-1/lo
                        :loc.iso639-1/ks
                        :loc.iso639-1/an
                        :loc.iso639-1/fr
                        :loc.iso639-1/ja
                        :loc.iso639-1/ae
                        :loc.iso639-1/tr
                        :loc.iso639-1/fi
                        :loc.iso639-1/sm
                        :loc.iso639-1/de
                        :loc.iso639-1/km
                        :loc.iso639-1/tw
                        :loc.iso639-1/av
                        :loc.iso639-1/jv
                        :loc.iso639-1/hr
                        :loc.iso639-1/dv
                        :loc.iso639-1/om
                        :loc.iso639-1/io
                        :loc.iso639-1/es
                        :loc.iso639-1/su
                        :loc.iso639-1/mi
                        :loc.iso639-1/co
                        :loc.iso639-1/hu
                        :loc.iso639-1/it
                        :loc.iso639-1/lb
                        :loc.iso639-1/rn
                        :loc.iso639-1/sa
                        :loc.iso639-1/lt
                        :loc.iso639-1/ba
                        :loc.iso639-1/ml
                        :loc.iso639-1/ii
                        :loc.iso639-1/vo
                        :loc.iso639-1/lg
                        :loc.iso639-1/tk
                        :loc.iso639-1/bm
                        :loc.iso639-1/yo
                        :loc.iso639-1/sd
                        :loc.iso639-1/nn
                        :loc.iso639-1/br
                        :loc.iso639-1/xh
                        :loc.iso639-1/kr
                        :loc.iso639-1/gv
                        :loc.iso639-1/wa
                        :loc.iso639-1/si
                        :loc.iso639-1/ak
                        :loc.iso639-1/za
                        :loc.iso639-1/ia
                        :loc.iso639-1/pi
                        :loc.iso639-1/my
                        :loc.iso639-1/ab
                        :loc.iso639-1/ku
                        :loc.iso639-1/el
                        :loc.iso639-1/ff
                        :loc.iso639-1/id
                        :loc.iso639-1/pl
                        :loc.iso639-1/tt
                        :loc.iso639-1/so
                        :loc.iso639-1/ug
                        :loc.iso639-1/eo
                        :loc.iso639-1/ko
                        :loc.iso639-1/as
                        :loc.iso639-1/ty
                        :loc.iso639-1/ho
                        :loc.iso639-1/oj
                        :loc.iso639-1/az
                        :loc.iso639-1/sr
                        :loc.iso639-1/ne
                        :loc.iso639-1/ht
                        :loc.iso639-1/vi
                        :loc.iso639-1/pt
                        :loc.iso639-1/la
                        :loc.iso639-1/rm
                        :loc.iso639-1/ce
                        :loc.iso639-1/te
                        :loc.iso639-1/bi
                        :loc.iso639-1/hi
                        :loc.iso639-1/yi
                        :loc.iso639-1/eu
                        :loc.iso639-1/mk
                        :loc.iso639-1/sw
                        :loc.iso639-1/ch
                        :loc.iso639-1/th
                        :loc.iso639-1/or
                        :loc.iso639-1/cv
                        :loc.iso639-1/mn
                        :loc.iso639-1/lv
                        :loc.iso639-1/sc
                        :loc.iso639-1/ik
                        :loc.iso639-1/hz
                        :loc.iso639-1/li
                        :loc.iso639-1/ru
                        :loc.iso639-1/ms
                        :loc.iso639-1/bo
                        :loc.iso639-1/cy
                        :loc.iso639-1/nr
                        :loc.iso639-1/aa
                        :loc.iso639-1/tn
                        :loc.iso639-1/ln
                        :loc.iso639-1/kg
                        :loc.iso639-1/da
                        :loc.iso639-1/am
                        :loc.iso639-1/ts
                        :loc.iso639-1/qu
                        :loc.iso639-1/kw
                        :loc.iso639-1/en
                        :loc.iso639-1/ar
                        :loc.iso639-1/kj
                        :loc.iso639-1/sl
                        :loc.iso639-1/kl
                        :loc.iso639-1/ha
                        :loc.iso639-1/sq
                        :loc.iso639-1/ps
                        :loc.iso639-1/fy
                        :loc.iso639-1/nb
                        :loc.iso639-1/bh
                        :loc.iso639-1/et
                        :loc.iso639-1/mh
                        :loc.iso639-1/st
                        :loc.iso639-1/ng
                        :loc.iso639-1/dz
                        :loc.iso639-1/ro
                        :loc.iso639-1/tg
                        :loc.iso639-1/is
                        :loc.iso639-1/os
                        :loc.iso639-1/cs
                        :loc.iso639-1/bn
                        :loc.iso639-1/gd
                        :loc.iso639-1/ka
                        :loc.iso639-1/ur
                        :loc.iso639-1/be
                        :loc.iso639-1/se
                        :loc.iso639-1/no
                        :loc.iso639-1/rw
                        :loc.iso639-1/gu
                        :loc.iso639-1/gl
                        :loc.iso639-1/kv
                        :loc.iso639-1/oc
                        :loc.iso639-1/sk
                        :loc.iso639-1/ki
                        :loc.iso639-1/kk
                        :loc.iso639-1/uz
                        :loc.iso639-1/zu
                        :loc.iso639-1/ie
                        :loc.iso639-1/ky
                        :loc.iso639-1/af
                        :loc.iso639-1/fj
                        :loc.iso639-1/mr
                        :loc.iso639-1/sn
                        :loc.iso639-1/na
                        :loc.iso639-1/kn
                        :loc.iso639-1/zh
                        :loc.iso639-1/ee
                        :loc.iso639-1/ve
                        :loc.iso639-1/ca
                        :loc.iso639-1/ta
                        :loc.iso639-1/he
                        :loc.iso639-1/wo
                        :loc.iso639-1/mg
                        :loc.iso639-1/ss
                        :loc.iso639-1/uk
                        :loc.iso639-1/ay
                        :loc.iso639-1/nd
                        :loc.iso639-1/gn
                        :loc.iso639-1/nv
                        :loc.iso639-1/cr
                        :loc.iso639-1/ig
                        :loc.iso639-1/sv
                        :loc.iso639-1/ga
                        :loc.iso639-1/pa
                        :loc.iso639-1/ti
                        :loc.iso639-1/iu
                        :loc.iso639-1/ny
                        :loc.iso639-1/cu
                        :loc.iso639-1/lu
                        :loc.iso639-1/hy
                        :loc.iso639-1/mt
                        :loc.iso639-1/nl
                        :loc.iso639-1/tl
                        :loc.iso639-1/fa
                        :loc.iso639-1/bg
                        :loc.iso639-1/sg
                        :loc.iso639-1/to
                        :loc.iso639-1/fo]})