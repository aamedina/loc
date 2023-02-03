(ns net.wikipunk.rdf.loc.iso639-5
  "http://id.loc.gov/vocabulary/iso639-5/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/iso639-5.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.iso639-5" "http://id.loc.gov/vocabulary/iso639-5/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.iso639-5",
   :rdfa/uri          "http://id.loc.gov/vocabulary/iso639-5/"}
  (:refer-clojure :exclude [map]))

(def aav
  "Austro-Asiatic languages"
  {:db/ident :loc.iso639-5/aav,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "austro-asiatiques, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Austro-Asiatic languages"}],
   :madsrdf/code "aav",
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/mun :loc.iso639-5/mkh],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Austro-Asiatic languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "austro-asiatiques, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Austro-Asiatic languages"}
                   {:rdf/language "en",
                    :rdf/value    "austro-asiatiques, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/aav,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/mkh :loc.iso639-5/mun],
   :skos/notation "aav",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "austro-asiatiques, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Austro-Asiatic languages"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "austro-asiatiques, langues"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Austro-Asiatic languages"}}]})

(def afa
  "Afro-Asiatic languages"
  {:db/ident :loc.iso639-5/afa,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "afro-asiatiques, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Afro-Asiatic languages"}],
   :madsrdf/code "afa",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/afa :loc.languages/afa],
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/sem
                                  :loc.iso639-5/cdc
                                  :loc.iso639-5/omv
                                  :loc.iso639-5/egx
                                  :loc.iso639-5/cus
                                  :loc.iso639-5/ber],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "afro-asiatiques, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Afro-Asiatic languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}
                       {:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Afro-Asiatic languages"}
                   {:rdf/language "en",
                    :rdf/value    "afro-asiatiques, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/afa,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/afa :loc.iso639-2/afa],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/cus
                   :loc.iso639-5/sem
                   :loc.iso639-5/egx
                   :loc.iso639-5/ber
                   :loc.iso639-5/omv
                   :loc.iso639-5/cdc],
   :skos/notation "afa",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "afro-asiatiques, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Afro-Asiatic languages"}],
   :skos/scopeNote [{:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}
                    {:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "afro-asiatiques, langues"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Afro-Asiatic languages"}}]})

(def art
  "Artificial languages"
  {:db/ident :loc.iso639-5/art,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "artificielles, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Artificial languages"}],
   :madsrdf/code "art",
   :madsrdf/hasExactExternalAuthority [:loc.languages/art :loc.iso639-2/art],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Artificial languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "artificielles, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "artificielles, langues"}
                   {:rdf/language "en",
                    :rdf/value    "Artificial languages"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/art,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/art :loc.languages/art],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "art",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "artificielles, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Artificial languages"}],
   :skos/scopeNote [{:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}
                    {:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Artificial languages"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "artificielles, langues"}}]})

(def aus
  "Australian languages"
  {:db/ident :loc.iso639-5/aus,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "australiennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Australian languages"}],
   :madsrdf/code "aus",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/aus :loc.languages/aus],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "australiennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Australian languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value    "ISO-639-2 Type: groupe de langues"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: language group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "australiennes, langues"}
                   {:rdf/language "en",
                    :rdf/value    "Australian languages"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/aus,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/aus :loc.languages/aus],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "aus",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "australiennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Australian languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value    "ISO-639-2 Type: groupe de langues"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: language group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "australiennes, langues"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Australian languages"}}]})

(def cai
  "Central American Indian languages"
  {:db/ident :loc.iso639-5/cai,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2009-02-17T05:00:00.000-00:00",
     :ri/recordChangeNote
     {:rdf/language "en",
      :rdf/value
      "Name change, French only (from indiennes d'Amérique centrale, autres lang and indiennes d'Amérique centrale, langues)"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel
   [{:rdf/language "fr",
     :rdf/value    "amérindiennes de l'Amérique centrale, langues"}
    {:rdf/language "en",
     :rdf/value    "Central American Indian languages"}],
   :madsrdf/code "cai",
   :madsrdf/hasExactExternalAuthority [:loc.languages/cai :loc.iso639-2/cai],
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/omq :loc.iso639-5/myn],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value
                            "amérindiennes de l'Amérique centrale, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Central American Indian languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "Name change, French only (from indiennes d'Amérique centrale, autres lang and indiennes d'Amérique centrale, langues)"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Central American Indian languages"}
                   {:rdf/language "en",
                    :rdf/value
                    "amérindiennes de l'Amérique centrale, langues"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2009-02-17T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-5/cai,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-5/cai,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.iso639-2/cai :loc.languages/cai],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "Name change, French only (from indiennes d'Amérique centrale, autres lang and indiennes d'Amérique centrale, langues)"},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/omq :loc.iso639-5/myn],
   :skos/notation "cai",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value "amérindiennes de l'Amérique centrale, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Central American Indian languages"}],
   :skos/scopeNote [{:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}
                    {:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Central American Indian languages"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value
                          "amérindiennes de l'Amérique centrale, langues"}}]})

(def cau
  "Caucasian languages"
  {:db/ident :loc.iso639-5/cau,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "caucasiennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Caucasian languages"}],
   :madsrdf/code "cau",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/cau :loc.languages/cau],
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/ccn :loc.iso639-5/ccs],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Caucasian languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "caucasiennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/note
   [{:rdf/language "fr",
     :rdf/value
     "Dans de nombreuses classifications, les langues caucasiennes (comprenant les langues caucasiennes du Nord et les langues caucasiennes du Sud) ne sont pas considérées comme une famille de langues; les langues caucasiennes du Nord et les langues caucasiennes du Sud sont traitées comme des familles de langues distinctes."}
    {:rdf/language "en",
     :rdf/value
     "In many classifications, Caucasian (encompassing North Caucasian and South Caucasian) is not considered to be a language family; rather, North Caucasian and South Caucasian are considered to be separate, unrelated language families."}],
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "caucasiennes, langues"}
                   {:rdf/language "en",
                    :rdf/value    "Caucasian languages"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/cau,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/cau :loc.languages/cau],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/ccs :loc.iso639-5/ccn],
   :skos/notation "cau",
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     "In many classifications, Caucasian (encompassing North Caucasian and South Caucasian) is not considered to be a language family; rather, North Caucasian and South Caucasian are considered to be separate, unrelated language families."}
    {:rdf/language "fr",
     :rdf/value
     "Dans de nombreuses classifications, les langues caucasiennes (comprenant les langues caucasiennes du Nord et les langues caucasiennes du Sud) ne sont pas considérées comme une famille de langues; les langues caucasiennes du Nord et les langues caucasiennes du Sud sont traitées comme des familles de langues distinctes."}],
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "caucasiennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Caucasian languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "caucasiennes, langues"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Caucasian languages"}}]})

(def crp
  "Creoles and pidgins"
  {:db/ident :loc.iso639-5/crp,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "créoles et pidgins"}
                                {:rdf/language "en",
                                 :rdf/value    "Creoles and pidgins"}],
   :madsrdf/code "crp",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/crp :loc.languages/crp],
   :madsrdf/hasNarrowerAuthority
   [:loc.iso639-5/cpp :loc.iso639-5/cpf :loc.iso639-5/cpe],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Creoles and pidgins"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "créoles et pidgins"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}
                       {:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Creoles and pidgins"}
                   {:rdf/language "en",
                    :rdf/value    "créoles et pidgins"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/crp,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/crp :loc.languages/crp],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/cpp :loc.iso639-5/cpf :loc.iso639-5/cpe],
   :skos/notation "crp",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "créoles et pidgins"}
                    {:rdf/language "en",
                     :rdf/value    "Creoles and pidgins"}],
   :skos/scopeNote [{:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}
                    {:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "créoles et pidgins"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Creoles and pidgins"}}]})

(def day
  "Land Dayak languages"
  {:db/ident :loc.iso639-5/day,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2009-02-19T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "dayak, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Land Dayak languages"}],
   :madsrdf/code "day",
   :madsrdf/hasExactExternalAuthority [:loc.languages/day :loc.iso639-2/day],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "dayak, langues"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Land Dayak languages"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: language group"}
                       {:rdf/language "fr",
                        :rdf/value    "ISO-639-2 Type: groupe de langues"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Land Dayak languages"}
                   {:rdf/language "en",
                    :rdf/value    "dayak, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2009-02-19T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/day,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/day :loc.iso639-2/day],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "day",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "dayak, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Land Dayak languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value    "ISO-639-2 Type: groupe de langues"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: language group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "dayak, langues"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Land Dayak languages"}}]})

(def dra
  "Dravidian languages"
  {:db/ident :loc.iso639-5/dra,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "dravidiennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Dravidian languages"}],
   :madsrdf/code "dra",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/dra :loc.languages/dra],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "dravidiennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Dravidian languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}
                       {:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Dravidian languages"}
                   {:rdf/language "en",
                    :rdf/value    "dravidiennes, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/dra,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/dra :loc.iso639-2/dra],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "dra",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "dravidiennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Dravidian languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "dravidiennes, langues"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Dravidian languages"}}]})

(def esx
  "Eskimo-Aleut languages"
  {:db/ident :loc.iso639-5/esx,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value "esquimaudes-aléoutiennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Eskimo-Aleut languages"}],
   :madsrdf/code "esx",
   :madsrdf/hasNarrowerAuthority :loc.iso639-5/ypk,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Eskimo-Aleut languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "esquimaudes-aléoutiennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Eskimo-Aleut languages"}
                   {:rdf/language "en",
                    :rdf/value    "esquimaudes-aléoutiennes, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/esx,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower :loc.iso639-5/ypk,
   :skos/notation "esx",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "esquimaudes-aléoutiennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Eskimo-Aleut languages"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Eskimo-Aleut languages"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      {:rdf/language "en",
                       :rdf/value    "esquimaudes-aléoutiennes, langues"}}]})

(def euq
  "Basque (family)"
  {:db/ident :loc.iso639-5/euq,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "basque (famille)"}
                                {:rdf/language "en",
                                 :rdf/value    "Basque (family)"}],
   :madsrdf/code "euq",
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "basque (famille)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Basque (family)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/note
   [{:rdf/language "fr",
     :rdf/value
     "Le basque est inclus dans l'ISO 639 1 et l'ISO 639 2 comme langue individuelle (eu / eus / baq)."}
    {:rdf/language "en",
     :rdf/value
     "Basque is included in ISO 639-1 and ISO 639-2 as an individual language (eu / eus / baq)."}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "basque (famille)"}
                   {:rdf/language "en",
                    :rdf/value    "Basque (family)"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/euq,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "euq",
   :skos/note
   [{:rdf/language "fr",
     :rdf/value
     "Le basque est inclus dans l'ISO 639 1 et l'ISO 639 2 comme langue individuelle (eu / eus / baq)."}
    {:rdf/language "en",
     :rdf/value
     "Basque is included in ISO 639-1 and ISO 639-2 as an individual language (eu / eus / baq)."}],
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "basque (famille)"}
                    {:rdf/language "en",
                     :rdf/value    "Basque (family)"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Basque (family)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "basque (famille)"}}]})

(def hmx
  "Hmong-Mien languages"
  {:db/ident :loc.iso639-5/hmx,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "hmong-mien, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Hmong-Mien languages"}],
   :madsrdf/code "hmx",
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Hmong-Mien languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "hmong-mien, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "hmong-mien, langues"}
                   {:rdf/language "en",
                    :rdf/value    "Hmong-Mien languages"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/hmx,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "hmx",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "hmong-mien, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Hmong-Mien languages"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Hmong-Mien languages"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "hmong-mien, langues"}}]})

(def ine
  "Indo-European languages"
  {:db/ident :loc.iso639-5/ine,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "indo-européennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Indo-European languages"}],
   :madsrdf/code "ine",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ine :loc.languages/ine],
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/cel
                                  :loc.iso639-5/hyx
                                  :loc.iso639-5/iir
                                  :loc.iso639-5/gem
                                  :loc.iso639-5/bat
                                  :loc.iso639-5/sqj
                                  :loc.iso639-5/sla
                                  :loc.iso639-5/itc
                                  :loc.iso639-5/grk],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Indo-European languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "indo-européennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "indo-européennes, langues"}
                   {:rdf/language "en",
                    :rdf/value    "Indo-European languages"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/ine,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/ine :loc.languages/ine],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/itc
                   :loc.iso639-5/iir
                   :loc.iso639-5/sla
                   :loc.iso639-5/gem
                   :loc.iso639-5/cel
                   :loc.iso639-5/grk
                   :loc.iso639-5/hyx
                   :loc.iso639-5/sqj
                   :loc.iso639-5/bat],
   :skos/notation "ine",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "indo-européennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Indo-European languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Indo-European languages"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "indo-européennes, langues"}}]})

(def jpx
  "Japanese (family)"
  {:db/ident :loc.iso639-5/jpx,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "japonais (famille)"}
                                {:rdf/language "en",
                                 :rdf/value    "Japanese (family)"}],
   :madsrdf/code "jpx",
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "japonais (famille)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Japanese (family)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/note
   [{:rdf/language "en",
     :rdf/value
     "Japanese is included in ISO 639-1 and ISO 639-2 as an individual language (ja / jpn)."}
    {:rdf/language "fr",
     :rdf/value
     "Le japonais est inclus dans l'ISO 639 1 et l'ISO 639 2 comme langue individuelle (ja / jpn)."}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "japonais (famille)"}
                   {:rdf/language "en",
                    :rdf/value    "Japanese (family)"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/jpx,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "jpx",
   :skos/note
   [{:rdf/language "en",
     :rdf/value
     "Japanese is included in ISO 639-1 and ISO 639-2 as an individual language (ja / jpn)."}
    {:rdf/language "fr",
     :rdf/value
     "Le japonais est inclus dans l'ISO 639 1 et l'ISO 639 2 comme langue individuelle (ja / jpn)."}],
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "japonais (famille)"}
                    {:rdf/language "en",
                     :rdf/value    "Japanese (family)"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Japanese (family)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "japonais (famille)"}}]})

(def khi
  "Khoisan languages"
  {:db/ident :loc.iso639-5/khi,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "khoïsan, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Khoisan languages"}],
   :madsrdf/code "khi",
   :madsrdf/hasExactExternalAuthority [:loc.languages/khi :loc.iso639-2/khi],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "khoïsan, langues"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Khoisan languages"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Khoisan languages"}
                   {:rdf/language "en",
                    :rdf/value    "khoïsan, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/khi,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/khi :loc.iso639-2/khi],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "khi",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "khoïsan, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Khoisan languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Khoisan languages"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "khoïsan, langues"}}]})

(def map
  "Austronesian languages"
  {:db/ident :loc.iso639-5/map,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "austronésiennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Austronesian languages"}],
   :madsrdf/code "map",
   :madsrdf/hasExactExternalAuthority [:loc.languages/map :loc.iso639-2/map],
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/fox :loc.iso639-5/poz],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "austronésiennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Austronesian languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}
                       {:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Austronesian languages"}
                   {:rdf/language "en",
                    :rdf/value    "austronésiennes, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/map,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/map :loc.languages/map],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/fox :loc.iso639-5/poz],
   :skos/notation "map",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "austronésiennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Austronesian languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "austronésiennes, langues"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Austronesian languages"}}]})

(def nai
  "North American Indian languages"
  {:db/ident :loc.iso639-5/nai,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2009-02-17T05:00:00.000-00:00",
     :ri/recordChangeNote
     {:rdf/language "en",
      :rdf/value
      "Name change, French only (from indiennes d'Amérique du Nord and autres langues indiennes d'Amérique du Nord, langues)"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "nord-amérindiennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value "North American Indian languages"}],
   :madsrdf/code "nai",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/nai :loc.languages/nai],
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/azc
                                  :loc.iso639-5/aql
                                  :loc.iso639-5/sal
                                  :loc.iso639-5/iro
                                  :loc.iso639-5/hok
                                  :loc.iso639-5/xnd
                                  :loc.iso639-5/sio
                                  :loc.iso639-5/cdd
                                  :loc.iso639-5/wak],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "North American Indian languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "nord-amérindiennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "Name change, French only (from indiennes d'Amérique du Nord and autres langues indiennes d'Amérique du Nord, langues)"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}
                       {:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "North American Indian languages"}
                   {:rdf/language "en",
                    :rdf/value    "nord-amérindiennes, langues"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-5/nai,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2009-02-17T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-5/nai,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/nai :loc.iso639-2/nai],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "Name change, French only (from indiennes d'Amérique du Nord and autres langues indiennes d'Amérique du Nord, langues)"},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/aql
                   :loc.iso639-5/cdd
                   :loc.iso639-5/iro
                   :loc.iso639-5/hok
                   :loc.iso639-5/wak
                   :loc.iso639-5/azc
                   :loc.iso639-5/sio
                   :loc.iso639-5/sal
                   :loc.iso639-5/xnd],
   :skos/notation "nai",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "nord-amérindiennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "North American Indian languages"}],
   :skos/scopeNote [{:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}
                    {:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "nord-amérindiennes, langues"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "North American Indian languages"}}]})

(def nic
  "Niger-Kordofanian languages"
  {:db/ident :loc.iso639-5/nic,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "nigéro-kordofaniennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Niger-Kordofanian languages"}],
   :madsrdf/code "nic",
   :madsrdf/hasExactExternalAuthority [:loc.languages/nic :loc.iso639-2/nic],
   :madsrdf/hasNarrowerAuthority
   [:loc.iso639-5/kdo :loc.iso639-5/alv :loc.iso639-5/dmn],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Niger-Kordofanian languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "nigéro-kordofaniennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Niger-Kordofanian languages"}
                   {:rdf/language "en",
                    :rdf/value    "nigéro-kordofaniennes, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/nic,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/nic :loc.languages/nic],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/dmn :loc.iso639-5/alv :loc.iso639-5/kdo],
   :skos/notation "nic",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "nigéro-kordofaniennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Niger-Kordofanian languages"}],
   :skos/scopeNote [{:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}
                    {:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "nigéro-kordofaniennes, langues"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Niger-Kordofanian languages"}}]})

(def paa
  "Papuan languages"
  {:db/ident :loc.iso639-5/paa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2009-02-17T05:00:00.000-00:00",
     :ri/recordChangeNote {:rdf/language "en",
                           :rdf/value
                           "Hierarchy changed to paa from ngf : paa"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "papoues, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Papuan languages"}],
   :madsrdf/code "paa",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/paa :loc.languages/paa],
   :madsrdf/hasNarrowerAuthority :loc.iso639-5/ngf,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "papoues, langues"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Papuan languages"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Hierarchy changed to paa from ngf : paa"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}
                       {:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "papoues, langues"}
                   {:rdf/language "en",
                    :rdf/value    "Papuan languages"}],
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-5/paa,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2009-02-17T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-5/paa,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/paa :loc.iso639-2/paa],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Hierarchy changed to paa from ngf : paa"},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower :loc.iso639-5/ngf,
   :skos/notation "paa",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "papoues, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Papuan languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Papuan languages"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "papoues, langues"}}]})

(def sai
  "South American Indian languages"
  {:db/ident :loc.iso639-5/sai,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2009-02-17T05:00:00.000-00:00",
     :ri/recordChangeNote
     {:rdf/language "en",
      :rdf/value
      "Name change, French only (from indiennes d'Amérique du Sud and autres langues indiennes d'Amérique du Sud, langues)"},
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource :loc.organizations/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "sud-amérindiennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value "South American Indian languages"}],
   :madsrdf/code "sai",
   :madsrdf/hasExactExternalAuthority [:loc.languages/sai :loc.iso639-2/sai],
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/aqa
                                  :loc.iso639-5/tup
                                  :loc.iso639-5/cba
                                  :loc.iso639-5/awd
                                  :loc.iso639-5/qwe],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "South American Indian languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "sud-amérindiennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "Name change, French only (from indiennes d'Amérique du Sud and autres langues indiennes d'Amérique du Sud, langues)"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}
                       {:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "South American Indian languages"}
                   {:rdf/language "en",
                    :rdf/value    "sud-amérindiennes, langues"}],
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2009-02-17T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-5/sai,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                      :cs/creatorName     :loc.organizations/dlc,
                      :cs/subjectOfChange :loc.iso639-5/sai,
                      :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch [:loc.languages/sai :loc.iso639-2/sai],
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "Name change, French only (from indiennes d'Amérique du Sud and autres langues indiennes d'Amérique du Sud, langues)"},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/qwe
                   :loc.iso639-5/awd
                   :loc.iso639-5/tup
                   :loc.iso639-5/cba
                   :loc.iso639-5/aqa],
   :skos/notation "sai",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "sud-amérindiennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "South American Indian languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "South American Indian languages"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "sud-amérindiennes, langues"}}]})

(def sgn
  "sign languages"
  {:db/ident :loc.iso639-5/sgn,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "langues des signes"}
                                {:rdf/language "en",
                                 :rdf/value    "sign languages"}],
   :madsrdf/code "sgn",
   :madsrdf/hasExactExternalAuthority [:loc.languages/sgn :loc.iso639-2/sgn],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "sign languages"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "langues des signes"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value    "ISO-639-2 Type: groupe de langues"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: language group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "sign languages"}
                   {:rdf/language "en",
                    :rdf/value    "langues des signes"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/sgn,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/sgn :loc.iso639-2/sgn],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "sgn",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "langues des signes"}
                    {:rdf/language "en",
                     :rdf/value    "sign languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value    "ISO-639-2 Type: groupe de langues"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: language group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "langues des signes"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "sign languages"}}]})

(def sit
  "Sino-Tibetan languages"
  {:db/ident :loc.iso639-5/sit,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "sino-tibétaines, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Sino-Tibetan languages"}],
   :madsrdf/code "sit",
   :madsrdf/hasExactExternalAuthority [:loc.languages/sit :loc.iso639-2/sit],
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/zhx :loc.iso639-5/tbq],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Sino-Tibetan languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "sino-tibétaines, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "sino-tibétaines, langues"}
                   {:rdf/language "en",
                    :rdf/value    "Sino-Tibetan languages"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/sit,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/sit :loc.languages/sit],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/tbq :loc.iso639-5/zhx],
   :skos/notation "sit",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "sino-tibétaines, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Sino-Tibetan languages"}],
   :skos/scopeNote [{:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}
                    {:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Sino-Tibetan languages"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "sino-tibétaines, langues"}}]})

(def ssa
  "Nilo-Saharan languages"
  {:db/ident :loc.iso639-5/ssa,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "nilo-sahariennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Nilo-Saharan languages"}],
   :madsrdf/code "ssa",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/ssa :loc.languages/ssa],
   :madsrdf/hasNarrowerAuthority
   [:loc.iso639-5/sdv :loc.iso639-5/csu :loc.iso639-5/son],
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Nilo-Saharan languages"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "nilo-sahariennes, langues"},
     :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}
                       {:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Nilo-Saharan languages"}
                   {:rdf/language "en",
                    :rdf/value    "nilo-sahariennes, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/ssa,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.languages/ssa :loc.iso639-2/ssa],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/csu :loc.iso639-5/son :loc.iso639-5/sdv],
   :skos/notation "ssa",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "nilo-sahariennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Nilo-Saharan languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "nilo-sahariennes, langues"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Nilo-Saharan languages"}}]})

(def tai
  "Tai languages"
  {:db/ident :loc.iso639-5/tai,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "tai, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Tai languages"}],
   :madsrdf/code "tai",
   :madsrdf/hasExactExternalAuthority [:loc.languages/tai :loc.iso639-2/tai],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tai languages"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "tai, langues"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}
                       {:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "tai, langues"}
                   {:rdf/language "en",
                    :rdf/value    "Tai languages"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/tai,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/tai :loc.languages/tai],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/notation "tai",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "tai, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Tai languages"}],
   :skos/scopeNote [{:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}
                    {:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tai languages"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "tai, langues"}}]})

(def tut
  "Altaic languages"
  {:db/ident :loc.iso639-5/tut,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "altaïques, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Altaic languages"}],
   :madsrdf/code "tut",
   :madsrdf/hasExactExternalAuthority [:loc.iso639-2/tut :loc.languages/tut],
   :madsrdf/hasNarrowerAuthority
   [:loc.iso639-5/tuw :loc.iso639-5/xgn :loc.iso639-5/trk],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "altaïques, langues"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Altaic languages"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PresentISO639-5Entries
    :loc.iso639-5/collection_PastPresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/scopeNote [{:rdf/language "en",
                        :rdf/value    "ISO-639-2 Type: remainder group"}
                       {:rdf/language "fr",
                        :rdf/value
                        "ISO-639-2 Type: groupe de langues restantes"}],
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Altaic languages"}
                   {:rdf/language "en",
                    :rdf/value    "altaïques, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/tut,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch [:loc.iso639-2/tut :loc.languages/tut],
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/xgn :loc.iso639-5/tuw :loc.iso639-5/trk],
   :skos/notation "tut",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "altaïques, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Altaic languages"}],
   :skos/scopeNote [{:rdf/language "fr",
                     :rdf/value "ISO-639-2 Type: groupe de langues restantes"}
                    {:rdf/language "en",
                     :rdf/value    "ISO-639-2 Type: remainder group"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Altaic languages"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "altaïques, langues"}}]})

(def urj
  "Uralic languages"
  {:db/ident :loc.iso639-5/urj,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel [{:rdf/language "fr",
                                 :rdf/value    "ouraliennes, langues"}
                                {:rdf/language "en",
                                 :rdf/value    "Uralic languages"}],
   :madsrdf/code "urj",
   :madsrdf/hasNarrowerAuthority [:loc.iso639-5/fiu :loc.iso639-5/syd],
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Uralic languages"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "ouraliennes, langues"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Topic]}],
   :madsrdf/isMemberOfMADSCollection
   [:loc.iso639-5/collection_PastPresentISO639-5Entries
    :loc.iso639-5/collection_PresentISO639-5Entries],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/iso639-5,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Uralic languages"}
                   {:rdf/language "en",
                    :rdf/value    "ouraliennes, langues"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.iso639-5/urj,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/iso639-5,
   :skos/narrower [:loc.iso639-5/syd :loc.iso639-5/fiu],
   :skos/notation "urj",
   :skos/prefLabel [{:rdf/language "fr",
                     :rdf/value    "ouraliennes, langues"}
                    {:rdf/language "en",
                     :rdf/value    "Uralic languages"}],
   :skos/topConceptOf :loc.vocabulary/iso639-5,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Uralic languages"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "ouraliennes, langues"}}]})

(def ^{:private true} iso639-5
  "ISO 639-5 provides three-character lowercase alphabetic strings that serve as identifiers for the representation of names of living and extinct language families and language groups. The list contains over 100 discrete codes. The codes on this list include all of the codes for language groups in the MARC Language Code scheme and over 40 additional groups. The codes are linked to their equivalent codes on the MARC Language Code list and ISO 639-2."
  {:db/ident :loc.vocabulary/iso639-5,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2011-05-12T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasTopMemberOfMADSScheme [:loc.iso639-5/nic
                                      :loc.iso639-5/day
                                      :loc.iso639-5/afa
                                      :loc.iso639-5/aus
                                      :loc.iso639-5/euq
                                      :loc.iso639-5/art
                                      :loc.iso639-5/paa
                                      :loc.iso639-5/cau
                                      :loc.iso639-5/sgn
                                      :loc.iso639-5/aav
                                      :loc.iso639-5/dra
                                      :loc.iso639-5/tut
                                      :loc.iso639-5/khi
                                      :loc.iso639-5/esx
                                      :loc.iso639-5/tai
                                      :loc.iso639-5/map
                                      :loc.iso639-5/sai
                                      :loc.iso639-5/ine
                                      :loc.iso639-5/nai
                                      :loc.iso639-5/cai
                                      :loc.iso639-5/crp
                                      :loc.iso639-5/sit
                                      :loc.iso639-5/urj
                                      :loc.iso639-5/jpx
                                      :loc.iso639-5/hmx
                                      :loc.iso639-5/ssa],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "ISO 639-5 provides three-character lowercase alphabetic strings that serve as identifiers for the representation of names of living and extinct language families and language groups. The list contains over 100 discrete codes. The codes on this list include all of the codes for language groups in the MARC Language Code scheme and over 40 additional groups. The codes are linked to their equivalent codes on the MARC Language Code list and ISO 639-2.",
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "ISO 639-5 Codes for the Representation of Names of Languages - Part 5: Alpha-3 Code for Language Families and Groups"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2011-05-12T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.vocabulary/iso639-5,
                     :rdf/type           :cs/ChangeSet},
   :skos/hasTopConcept [:loc.iso639-5/aav
                        :loc.iso639-5/sit
                        :loc.iso639-5/tut
                        :loc.iso639-5/urj
                        :loc.iso639-5/paa
                        :loc.iso639-5/nic
                        :loc.iso639-5/art
                        :loc.iso639-5/aus
                        :loc.iso639-5/sgn
                        :loc.iso639-5/dra
                        :loc.iso639-5/cau
                        :loc.iso639-5/ssa
                        :loc.iso639-5/jpx
                        :loc.iso639-5/crp
                        :loc.iso639-5/euq
                        :loc.iso639-5/cai
                        :loc.iso639-5/khi
                        :loc.iso639-5/nai
                        :loc.iso639-5/hmx
                        :loc.iso639-5/tai
                        :loc.iso639-5/ine
                        :loc.iso639-5/afa
                        :loc.iso639-5/sai
                        :loc.iso639-5/day
                        :loc.iso639-5/map
                        :loc.iso639-5/esx]})