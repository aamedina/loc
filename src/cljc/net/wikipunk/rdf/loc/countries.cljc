(ns net.wikipunk.rdf.loc.countries
  "http://id.loc.gov/vocabulary/countries/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/countries.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.countries"
                       "http://id.loc.gov/vocabulary/countries/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.countries",
   :rdfa/uri          "http://id.loc.gov/vocabulary/countries/"}
  (:refer-clojure :exclude [pr]))

(def aa
  "Albania"
  {:db/ident :loc.countries/aa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Albania"},
   :madsrdf/code "aa",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-aa,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ALBANIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ALBANIA"}],
                                 :madsrdf/code "AL",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/aa",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/aa,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-aa,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "aa",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Albania"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AL",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ALBANIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ALBANIA"}]}})

(def abc
  "Alberta"
  {:db/ident :loc.countries/abc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Alberta"},
   :madsrdf/code "abc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-ab,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/abc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/abc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-ab,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "abc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Alberta"}})

(def aca
  "Australian Capital Territory"
  {:db/ident :loc.countries/aca,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Australian Capital Territory"},
   :madsrdf/code "aca",
   :madsrdf/hasBroaderAuthority :loc.countries/at,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-at-ac,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [at] (Australia) before Sept. 2005"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/aca",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/broader :loc.countries/at,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/aca,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-at-ac,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [at] (Australia) before Sept. 2005"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "aca",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Australian Capital Territory"}})

(def ae
  "Algeria"
  {:db/ident :loc.countries/ae,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Algeria"},
   :madsrdf/code "ae",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ae,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ALGÉRIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ALGERIA"}],
                                 :madsrdf/code "DZ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ae",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ae,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ae,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ae",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Algeria"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "DZ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ALGÉRIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ALGERIA"}]}})

(def af
  "Afghanistan"
  {:db/ident :loc.countries/af,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Afghanistan"},
   :madsrdf/code "af",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-af,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "AFGHANISTAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "AFGHANISTAN"}],
                                 :madsrdf/code "AF",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/af",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/af,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-af,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "af",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Afghanistan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AF",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "AFGHANISTAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "AFGHANISTAN"}]}})

(def ag
  "Argentina"
  {:db/ident :loc.countries/ag,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Argentina"},
   :madsrdf/code "ag",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-ag,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ARGENTINE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ARGENTINA"}],
                                 :madsrdf/code "AR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ag",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ag,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-ag,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ag",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Argentina"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ARGENTINE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ARGENTINA"}]}})

(def ai
  "Armenia (Republic)"
  {:db/ident :loc.countries/ai,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Armenia (Republic)"},
   :madsrdf/code "ai",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ai,
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [air] Armenia (Republic) before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [air] Armenian S.S.R. before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [ur] Soviet Union before 1988-03"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/ur :loc.countries/air :loc.countries/xxr],
   :owl/sameAs "info:lc/vocabulary/countries/ai",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ai,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ai,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [air] Armenia (Republic) before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [air] Armenian S.S.R. before 1992-06"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ai",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Armenia (Republic)"}})

(def aj
  "Azerbaijan"
  {:db/ident :loc.countries/aj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Azerbaijan"},
   :madsrdf/code "aj",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-aj,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "AZERBAÏDJAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "AZERBAIJAN"}],
                                 :madsrdf/code "AZ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value "Coded [ur] Soviet Union before 1988-03"}
                         {:rdf/language "en",
                          :rdf/value "Coded [xxr] Soviet Union before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [ajr] Azerbaijan before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value
                          "Coded [ajr] Azerbaijan S.S.R. before 1992-06"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/ur :loc.countries/ajr :loc.countries/xxr],
   :owl/sameAs "info:lc/vocabulary/countries/aj",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/aj,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-aj,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value
                       "Coded [ajr] Azerbaijan S.S.R. before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ajr] Azerbaijan before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value "Coded [xxr] Soviet Union before 1992-06"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "aj",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Azerbaijan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AZ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "AZERBAÏDJAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "AZERBAIJAN"}]}})

(def aku
  "Alaska"
  {:db/ident :loc.countries/aku,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Alaska"},
   :madsrdf/code "aku",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ak,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/aku",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/aku,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ak,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "aku",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Alaska"}})

(def alu
  "Alabama"
  {:db/ident :loc.countries/alu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Alabama"},
   :madsrdf/code "alu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-al,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/alu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/alu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-al,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "alu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Alabama"}})

(def am
  "Anguilla"
  {:db/ident :loc.countries/am,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Anguilla"},
   :madsrdf/code "am",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwxa,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ANGUILLA"}
                                  {:rdf/language "en",
                                   :rdf/value    "ANGUILLA"}],
                                 :madsrdf/code "AI",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Sombrero Island"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [xi] Anguilla before 1985-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [xi] Saint Kitts-Nevis-Anguilla before 1985-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/xi,
   :owl/sameAs "info:lc/vocabulary/countries/am",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Sombrero Island"},
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/am,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwxa,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value
                       "Coded [xi] Saint Kitts-Nevis-Anguilla before 1985-01"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [xi] Anguilla before 1985-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "am",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Anguilla"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AI",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ANGUILLA"}
                                            {:rdf/language "en",
                                             :rdf/value    "ANGUILLA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Sombrero Island"}}})

(def an
  "Andorra"
  {:db/ident :loc.countries/an,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Andorra"},
   :madsrdf/code "an",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-an,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ANDORRE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ANDORRA"}],
                                 :madsrdf/code "AD",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/an",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/an,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-an,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "an",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Andorra"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AD",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ANDORRE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ANDORRA"}]}})

(def ao
  "Angola"
  {:db/ident :loc.countries/ao,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Angola"},
   :madsrdf/code "ao",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ao,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ANGOLA"}
                                  {:rdf/language "en",
                                   :rdf/value    "ANGOLA"}],
                                 :madsrdf/code "AO",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Cabinda"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ao",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Cabinda"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ao,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ao,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ao",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Angola"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AO",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ANGOLA"}
                                            {:rdf/language "en",
                                             :rdf/value    "ANGOLA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Cabinda"}}})

(def aq
  "Antigua and Barbuda"
  {:db/ident :loc.countries/aq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Antigua and Barbuda"},
   :madsrdf/code "aq",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwaq,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ANTIGUA-ET-BARBUDA"}
                                  {:rdf/language "en",
                                   :rdf/value    "ANTIGUA AND BARBUDA"}],
                                 :madsrdf/code "AG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Antigua"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Redonda"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Barbuda"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/aq",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Barbuda"}
                   {:rdf/language "en",
                    :rdf/value    "Antigua"}
                   {:rdf/language "en",
                    :rdf/value    "Redonda"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/aq,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwaq,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "aq",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Antigua and Barbuda"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ANTIGUA-ET-BARBUDA"}
                                            {:rdf/language "en",
                                             :rdf/value
                                             "ANTIGUA AND BARBUDA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Redonda"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Barbuda"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Antigua"}}]})

(def aru
  "Arkansas"
  {:db/ident :loc.countries/aru,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Arkansas"},
   :madsrdf/code "aru",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ar,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/aru",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/aru,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ar,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "aru",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Arkansas"}})

(def as
  "American Samoa"
  {:db/ident :loc.countries/as,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "American Samoa"},
   :madsrdf/code "as",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/poas,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SAMOA AMÉRICAINES"}
                                  {:rdf/language "en",
                                   :rdf/value    "AMERICAN SAMOA"}],
                                 :madsrdf/code "AS",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Eastern Samoa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Samoa, American"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/as",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Eastern Samoa"}
                   {:rdf/language "en",
                    :rdf/value    "Samoa, American"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/as,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/poas,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "as",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "American Samoa"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AS",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SAMOA AMÉRICAINES"}
                                            {:rdf/language "en",
                                             :rdf/value    "AMERICAN SAMOA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Samoa, American"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Eastern Samoa"}}]})

(def at
  "Australia"
  {:db/ident :loc.countries/at,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Australia"},
   :madsrdf/code "at",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-at,
   :madsrdf/hasNarrowerAuthority [:loc.countries/aca
                                  :loc.countries/xna
                                  :loc.countries/vra
                                  :loc.countries/qea
                                  :loc.countries/xga
                                  :loc.countries/tma
                                  :loc.countries/wea
                                  :loc.countries/xoa
                                  :loc.countries/xra],
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "AUSTRALIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "AUSTRALIA"}],
                                 :madsrdf/code "AU",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value "Macquarie Island"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "Coded [ac] Ashmore and Cartier Islands before 1978-01"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/ac,
   :owl/sameAs "info:lc/vocabulary/countries/at",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Macquarie Island"},
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/at,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-at,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "Coded [ac] Ashmore and Cartier Islands before 1978-01"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/narrower [:loc.countries/wea
                   :loc.countries/aca
                   :loc.countries/xoa
                   :loc.countries/vra
                   :loc.countries/xra
                   :loc.countries/xga
                   :loc.countries/tma
                   :loc.countries/xna
                   :loc.countries/qea],
   :skos/notation "at",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Australia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AU",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "AUSTRALIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "AUSTRALIA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Macquarie Island"}}})

(def au
  "Austria"
  {:db/ident :loc.countries/au,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Austria"},
   :madsrdf/code "au",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-au,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "AUTRICHE"}
                                  {:rdf/language "en",
                                   :rdf/value    "AUSTRIA"}],
                                 :madsrdf/code "AT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/au",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/au,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-au,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "au",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Austria"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "AUTRICHE"}
                                            {:rdf/language "en",
                                             :rdf/value    "AUSTRIA"}]}})

(def aw
  "Aruba"
  {:db/ident :loc.countries/aw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Aruba"},
   :madsrdf/code "aw",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwaw,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ARUBA"}
                                  {:rdf/language "en",
                                   :rdf/value    "ARUBA"}],
                                 :madsrdf/code "AW",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [na] Aruba before 1988-03"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/na,
   :owl/sameAs "info:lc/vocabulary/countries/aw",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/aw,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwaw,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [na] Aruba before 1988-03"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "aw",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Aruba"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AW",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ARUBA"}
                                            {:rdf/language "en",
                                             :rdf/value    "ARUBA"}]}})

(def ay
  "Antarctica"
  {:db/ident :loc.countries/ay,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Antarctica"},
   :madsrdf/code "ay",
   :madsrdf/hasExactExternalAuthority [:loc.geographicAreas/t
                                       :loc.authorities/sh85005490concept],
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ANTARCTIQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ANTARCTICA"}],
                                 :madsrdf/code "AQ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ay",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ay,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch [:loc.authorities/sh85005490concept :loc.geographicAreas/t],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ay",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Antarctica"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AQ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ANTARCTIQUE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ANTARCTICA"}]}})

(def azu
  "Arizona"
  {:db/ident :loc.countries/azu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Arizona"},
   :madsrdf/code "azu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-az,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/azu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/azu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-az,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "azu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Arizona"}})

(def ba
  "Bahrain"
  {:db/ident :loc.countries/ba,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Bahrain"},
   :madsrdf/code "ba",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ba,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BAHREÏN"}
                                  {:rdf/language "en",
                                   :rdf/value    "BAHRAIN"}],
                                 :madsrdf/code "BH",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Bahrein"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ba",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Bahrein"},
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ba,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ba,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ba",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Bahrain"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BH",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BAHREÏN"}
                                            {:rdf/language "en",
                                             :rdf/value    "BAHRAIN"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Bahrein"}}})

(def bb
  "Barbados"
  {:db/ident :loc.countries/bb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Barbados"},
   :madsrdf/code "bb",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwbb,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BARBADE"}
                                  {:rdf/language "en",
                                   :rdf/value    "BARBADOS"}],
                                 :madsrdf/code "BB",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bb",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bb,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwbb,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bb",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Barbados"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BB",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BARBADE"}
                                            {:rdf/language "en",
                                             :rdf/value    "BARBADOS"}]}})

(def bcc
  "British Columbia"
  {:db/ident :loc.countries/bcc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "British Columbia"},
   :madsrdf/code "bcc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-bc,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bcc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bcc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-bc,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bcc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "British Columbia"}})

(def bd
  "Burundi"
  {:db/ident :loc.countries/bd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Burundi"},
   :madsrdf/code "bd",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-bd,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BURUNDI"}
                                  {:rdf/language "en",
                                   :rdf/value    "BURUNDI"}],
                                 :madsrdf/code "BI",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bd",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bd,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-bd,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bd",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Burundi"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BI",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BURUNDI"}
                                            {:rdf/language "en",
                                             :rdf/value    "BURUNDI"}]}})

(def be
  "Belgium"
  {:db/ident :loc.countries/be,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Belgium"},
   :madsrdf/code "be",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-be,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BELGIQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "BELGIUM"}],
                                 :madsrdf/code "BE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/be",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/be,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-be,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "be",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Belgium"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BELGIQUE"}
                                            {:rdf/language "en",
                                             :rdf/value    "BELGIUM"}]}})

(def bf
  "Bahamas"
  {:db/ident :loc.countries/bf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Bahamas"},
   :madsrdf/code "bf",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwbf,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BAHAMAS"}
                                  {:rdf/language "en",
                                   :rdf/value    "BAHAMAS"}],
                                 :madsrdf/code "BS",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bf",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bf,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwbf,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bf",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Bahamas"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BS",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BAHAMAS"}
                                            {:rdf/language "en",
                                             :rdf/value    "BAHAMAS"}]}})

(def bg
  "Bangladesh"
  {:db/ident :loc.countries/bg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Bangladesh"},
   :madsrdf/code "bg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-bg,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BANGLADESH"}
                                  {:rdf/language "en",
                                   :rdf/value    "BANGLADESH"}],
                                 :madsrdf/code "BD",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "East Pakistan"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "East Pakistan"},
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-bg,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Bangladesh"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BD",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BANGLADESH"}
                                            {:rdf/language "en",
                                             :rdf/value    "BANGLADESH"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "East Pakistan"}}})

(def bh
  "Belize"
  {:db/ident :loc.countries/bh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Belize"},
   :madsrdf/code "bh",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nc,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/ncbh,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BELIZE"}
                                  {:rdf/language "en",
                                   :rdf/value    "BELIZE"}],
                                 :madsrdf/code "BZ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value "British Honduras"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bh",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "British Honduras"},
   :skos/broadMatch :loc.geographicAreas/nc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bh,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/ncbh,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bh",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Belize"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BZ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BELIZE"}
                                            {:rdf/language "en",
                                             :rdf/value    "BELIZE"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "British Honduras"}}})

(def bi
  "British Indian Ocean Territory"
  {:db/ident :loc.countries/bi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "British Indian Ocean Territory"},
   :madsrdf/code "bi",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-bi,
   :madsrdf/hasRelatedAuthority
   {:madsrdf/authoritativeLabel [{:rdf/language "fr",
                                  :rdf/value
                                  "OCÉAN INDIEN, TERRITOIRE BRITANNIQUE DE L'"}
                                 {:rdf/language "en",
                                  :rdf/value "BRITISH INDIAN OCEAN TERRITORY"}],
    :madsrdf/code "IO",
    :madsrdf/note "This is the ISO 3166 match",
    :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Chagos Archipelago"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Diego Garcia Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useInstead :loc.countries/se,
   :owl/sameAs "info:lc/vocabulary/countries/bi",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/countries/se"],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Chagos Archipelago"}
                   {:rdf/language "en",
                    :rdf/value    "Diego Garcia Island"}],
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bi,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-bi,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bi",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "British Indian Ocean Territory"},
   :skos/semanticRelation
   {:rdf/type       :skos/Concept,
    :skos/notation  "IO",
    :skos/note      "This is the ISO 3166 match",
    :skos/prefLabel [{:rdf/language "fr",
                      :rdf/value "OCÉAN INDIEN, TERRITOIRE BRITANNIQUE DE L'"}
                     {:rdf/language "en",
                      :rdf/value    "BRITISH INDIAN OCEAN TERRITORY"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Chagos Archipelago"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Diego Garcia Island"}}]})

(def bl
  "Brazil"
  {:db/ident :loc.countries/bl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Brazil"},
   :madsrdf/code "bl",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-bl,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BRÉSIL"}
                                  {:rdf/language "en",
                                   :rdf/value    "BRAZIL"}],
                                 :madsrdf/code "BR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Rocas"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Penedos de São Pedro e São Paulo"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Fernando de Noronha"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Trindade, Ilha da"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ilhas Martim Vaz"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Martim Vaz, Ilhas"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ilha da Trindade"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bl",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Ilha da Trindade"}
                   {:rdf/language "en",
                    :rdf/value    "Martim Vaz, Ilhas"}
                   {:rdf/language "en",
                    :rdf/value    "Ilhas Martim Vaz"}
                   {:rdf/language "en",
                    :rdf/value    "Fernando de Noronha"}
                   {:rdf/language "en",
                    :rdf/value    "Penedos de São Pedro e São Paulo"}
                   {:rdf/language "en",
                    :rdf/value    "Trindade, Ilha da"}
                   {:rdf/language "en",
                    :rdf/value    "Rocas"}],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bl,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-bl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bl",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Brazil"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BRÉSIL"}
                                            {:rdf/language "en",
                                             :rdf/value    "BRAZIL"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Rocas"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Trindade, Ilha da"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Fernando de Noronha"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ilhas Martim Vaz"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ilha da Trindade"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Martim Vaz, Ilhas"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      {:rdf/language "en",
                       :rdf/value    "Penedos de São Pedro e São Paulo"}}]})

(def bm
  "Bermuda Islands"
  {:db/ident :loc.countries/bm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Bermuda Islands"},
   :madsrdf/code "bm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/l,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/lnbm,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/l,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/lnbm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Bermuda Islands"}})

(def bn
  "Bosnia and Herzegovina"
  {:db/ident :loc.countries/bn,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource
     :loc.organizations/dlcmrc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2015-02-13T05:00:00.000-00:00",
     :ri/recordChangeNote
     "Preferred label changed from to Bosnia and Hercegovina to Bosnia and Herzegovina ",
     :ri/recordContentSource
     :loc.organizations/dlcmrc,
     :ri/recordStatus "updated"}],
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Bosnia and Herzegovina"},
   :madsrdf/code "bn",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-bn,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BOSNIE-HERZÉGOVINE"}
                                  {:rdf/language "en",
                                   :rdf/value    "BOSNIA AND HERZEGOVINA"}],
                                 :madsrdf/code "BA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Herzegovina"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Hercegovina"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Bosnia and Hercegovina"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "Coded [yu] Bosnia and Herzegovina before 1992-10"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/yu,
   :owl/sameAs "info:lc/vocabulary/countries/bn",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Herzegovina"}
                   {:rdf/language "en",
                    :rdf/value    "Hercegovina"}
                   {:rdf/language "en",
                    :rdf/value    "Bosnia and Hercegovina"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote
   [{:cs/changeReason    "updated",
     :cs/createdDate     #inst "2015-02-13T05:00:00.000-00:00",
     :cs/creatorName     :loc.organizations/dlcmrc,
     :cs/subjectOfChange :loc.countries/bn,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
     :cs/creatorName     :loc.organizations/dlcmrc,
     :cs/subjectOfChange :loc.countries/bn,
     :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch :loc.geographicAreas/e-bn,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "Coded [yu] Bosnia and Herzegovina before 1992-10"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bn",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Bosnia and Herzegovina"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BOSNIE-HERZÉGOVINE"}
                                            {:rdf/language "en",
                                             :rdf/value
                                             "BOSNIA AND HERZEGOVINA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Bosnia and Hercegovina"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Herzegovina"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Hercegovina"}}]})

(def bo
  "Bolivia"
  {:db/ident :loc.countries/bo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Bolivia"},
   :madsrdf/code "bo",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-bo,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bo",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bo,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-bo,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bo",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Bolivia"}})

(def bp
  "Solomon Islands"
  {:db/ident :loc.countries/bp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Solomon Islands"},
   :madsrdf/code "bp",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/pobp,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SALOMON, ÎLES"}
                                  {:rdf/language "en",
                                   :rdf/value    "SOLOMON ISLANDS"}],
                                 :madsrdf/code "SB",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "British Solomon Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Guadalcanal"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Santa Isabel"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Malaita"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Solomon Islands Protectorate"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Choiseul"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "San Cristóbal"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bp",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Malaita"}
                   {:rdf/language "en",
                    :rdf/value    "British Solomon Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Guadalcanal"}
                   {:rdf/language "en",
                    :rdf/value    "Choiseul"}
                   {:rdf/language "en",
                    :rdf/value    "Solomon Islands Protectorate"}
                   {:rdf/language "en",
                    :rdf/value    "Santa Isabel"}
                   {:rdf/language "en",
                    :rdf/value    "San Cristóbal"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bp,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/pobp,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bp",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Solomon Islands"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SB",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SALOMON, ÎLES"}
                                            {:rdf/language "en",
                                             :rdf/value    "SOLOMON ISLANDS"}]},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Choiseul"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "San Cristóbal"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Solomon Islands Protectorate"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Santa Isabel"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Malaita"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "British Solomon Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Guadalcanal"}}]})

(def br
  "Burma"
  {:db/ident :loc.countries/br,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Burma"},
   :madsrdf/code "br",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-br,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Myanmar"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/br",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Myanmar"},
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/br,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-br,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "br",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Burma"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Myanmar"}}})

(def bs
  "Botswana"
  {:db/ident :loc.countries/bs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Botswana"},
   :madsrdf/code "bs",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-bs,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BOTSWANA"}
                                  {:rdf/language "en",
                                   :rdf/value    "BOTSWANA"}],
                                 :madsrdf/code "BW",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Bechuanaland"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bs",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Bechuanaland"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bs,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-bs,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bs",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Botswana"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BW",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BOTSWANA"}
                                            {:rdf/language "en",
                                             :rdf/value    "BOTSWANA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Bechuanaland"}}})

(def bt
  "Bhutan"
  {:db/ident :loc.countries/bt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Bhutan"},
   :madsrdf/code "bt",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-bt,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BHOUTAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "BHUTAN"}],
                                 :madsrdf/code "BT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bt",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bt,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-bt,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bt",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Bhutan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BHOUTAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "BHUTAN"}]}})

(def bu
  "Bulgaria"
  {:db/ident :loc.countries/bu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Bulgaria"},
   :madsrdf/code "bu",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-bu,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BULGARIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "BULGARIA"}],
                                 :madsrdf/code "BG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-bu,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Bulgaria"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BULGARIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "BULGARIA"}]}})

(def bv
  "Bouvet Island"
  {:db/ident :loc.countries/bv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Bouvet Island"},
   :madsrdf/code "bv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/l,
   :madsrdf/hasExactExternalAuthority [:loc.authorities/sh87007247concept
                                       :loc.geographicAreas/lsbv],
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BOUVET, ÎLE"}
                                  {:rdf/language "en",
                                   :rdf/value    "BOUVET ISLAND"}],
                                 :madsrdf/code "BV",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/l,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch [:loc.authorities/sh87007247concept
                     :loc.geographicAreas/lsbv],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Bouvet Island"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BV",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BOUVET, ÎLE"}
                                            {:rdf/language "en",
                                             :rdf/value    "BOUVET ISLAND"}]}})

(def bw
  "Belarus"
  {:db/ident :loc.countries/bw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Belarus"},
   :madsrdf/code "bw",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-bw,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BÉLARUS"}
                                  {:rdf/language "en",
                                   :rdf/value    "BELARUS"}],
                                 :madsrdf/code "BY",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Belorussian S.S.R."},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Byelarus"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value "Coded [xxr] Soviet Union before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [ur] Soviet Union before 1988-03"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [bwr] Belarus before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value
                          "Coded [bwr] Byeolorussian S.S.R. before 1992-06"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/bwr :loc.countries/xxr :loc.countries/ur],
   :owl/sameAs "info:lc/vocabulary/countries/bw",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Belorussian S.S.R."}
                   {:rdf/language "en",
                    :rdf/value    "Byelarus"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bw,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-bw,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [bwr] Belarus before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value
                       "Coded [bwr] Byeolorussian S.S.R. before 1992-06"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bw",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Belarus"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BY",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BÉLARUS"}
                                            {:rdf/language "en",
                                             :rdf/value    "BELARUS"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Belorussian S.S.R."}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Byelarus"}}]})

(def bx
  "Brunei"
  {:db/ident :loc.countries/bx,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Brunei"},
   :madsrdf/code "bx",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-bx,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/bx",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/bx,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-bx,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "bx",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Brunei"}})

(def ca
  "Caribbean Netherlands"
  {:db/ident :loc.countries/ca,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Caribbean Netherlands"},
   :madsrdf/code "ca",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "BES Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Dutch Caribbean"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Statia (Netherlands Antilles)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value "Sint Eustatius (Netherlands Antilles)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Bonaire (Netherlands Antilles)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Saba (Netherlands Antilles)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Bonaire, Saint Eustatius, and Saba"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Saint Eustatius"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [na] Caribbean Netherlands before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Sint Eustatius before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Saba before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Bonaire before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Netherlands Antilles before 2011-12"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/na,
   :owl/sameAs "info:lc/vocabulary/countries/ca",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "BES Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Saba (Netherlands Antilles)"}
                   {:rdf/language "en",
                    :rdf/value    "Bonaire (Netherlands Antilles)"}
                   {:rdf/language "en",
                    :rdf/value    "Dutch Caribbean"}
                   {:rdf/language "en",
                    :rdf/value    "Statia (Netherlands Antilles)"}
                   {:rdf/language "en",
                    :rdf/value    "Sint Eustatius (Netherlands Antilles)"}
                   {:rdf/language "en",
                    :rdf/value    "Bonaire, Saint Eustatius, and Saba"}
                   {:rdf/language "en",
                    :rdf/value    "Saint Eustatius"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ca,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [na] Netherlands Antilles before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Saba before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Caribbean Netherlands before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Bonaire before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Sint Eustatius before 2011-12"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ca",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Caribbean Netherlands"},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Bonaire (Netherlands Antilles)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Bonaire, Saint Eustatius, and Saba"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Saba (Netherlands Antilles)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Statia (Netherlands Antilles)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value "Sint Eustatius (Netherlands Antilles)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Saint Eustatius"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Dutch Caribbean"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "BES Islands"}}]})

(def cau
  "California"
  {:db/ident :loc.countries/cau,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "California"},
   :madsrdf/code "cau",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ca,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cau",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cau,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ca,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cau",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "California"}})

(def cb
  "Cambodia"
  {:db/ident :loc.countries/cb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Cambodia"},
   :madsrdf/code "cb",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-cb,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CAMBODGE"}
                                  {:rdf/language "en",
                                   :rdf/value    "CAMBODIA"}],
                                 :madsrdf/code "KH",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Democratic Kampuchea"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Khmer Republic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kampuchea"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cb",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Khmer Republic"}
                   {:rdf/language "en",
                    :rdf/value    "Democratic Kampuchea"}
                   {:rdf/language "en",
                    :rdf/value    "Kampuchea"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cb,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-cb,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cb",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Cambodia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "KH",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CAMBODGE"}
                                            {:rdf/language "en",
                                             :rdf/value    "CAMBODIA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kampuchea"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Democratic Kampuchea"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Khmer Republic"}}]})

(def cc
  "China"
  {:db/ident :loc.countries/cc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "China"},
   :madsrdf/code "cc",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-cc,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CHINE"}
                                  {:rdf/language "en",
                                   :rdf/value    "CHINA"}],
                                 :madsrdf/code "CN",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tibet"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Macao"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "New Territories"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Hainan Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Manchuria"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sinkiang"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kowloon"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Inner Mongolia"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "Coded [mh] Taipa before 2000-05"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [mh] Macau before 2000-05"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [hk] Hong Kong before 1997-10"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/hk :loc.countries/mh],
   :owl/sameAs "info:lc/vocabulary/countries/cc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Inner Mongolia"}
                   {:rdf/language "en",
                    :rdf/value    "Tibet"}
                   {:rdf/language "en",
                    :rdf/value    "Manchuria"}
                   {:rdf/language "en",
                    :rdf/value    "New Territories"}
                   {:rdf/language "en",
                    :rdf/value    "Sinkiang"}
                   {:rdf/language "en",
                    :rdf/value    "Macao"}
                   {:rdf/language "en",
                    :rdf/value    "Kowloon"}
                   {:rdf/language "en",
                    :rdf/value    "Hainan Island"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-cc,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [hk] Hong Kong before 1997-10"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [mh] Macau before 2000-05"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [mh] Taipa before 2000-05"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "China"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CN",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CHINE"}
                                            {:rdf/language "en",
                                             :rdf/value    "CHINA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Manchuria"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kowloon"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Inner Mongolia"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Hainan Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tibet"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sinkiang"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "New Territories"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Macao"}}]})

(def cd
  "Chad"
  {:db/ident :loc.countries/cd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Chad"},
   :madsrdf/code "cd",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-cd,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TCHAD"}
                                  {:rdf/language "en",
                                   :rdf/value    "CHAD"}],
                                 :madsrdf/code "TD",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cd",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cd,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-cd,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cd",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Chad"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TD",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TCHAD"}
                                            {:rdf/language "en",
                                             :rdf/value    "CHAD"}]}})

(def ce
  "Sri Lanka"
  {:db/ident :loc.countries/ce,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Sri Lanka"},
   :madsrdf/code "ce",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ce,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SRI LANKA"}
                                  {:rdf/language "en",
                                   :rdf/value    "SRI LANKA"}],
                                 :madsrdf/code "LK",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Ceylon"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ce",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Ceylon"},
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ce,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ce,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ce",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Sri Lanka"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "LK",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SRI LANKA"}
                                            {:rdf/language "en",
                                             :rdf/value    "SRI LANKA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Ceylon"}}})

(def cf
  "Congo (Brazzaville)"
  {:db/ident :loc.countries/cf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Congo (Brazzaville)"},
   :madsrdf/code "cf",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-cf,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Middle Congo"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cf",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Middle Congo"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cf,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-cf,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cf",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Congo (Brazzaville)"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Middle Congo"}}})

(def cg
  "Congo (Democratic Republic)"
  {:db/ident :loc.countries/cg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Congo (Democratic Republic)"},
   :madsrdf/code "cg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-cg,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Zaire"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Congo (Kinshasa)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel
                         {:rdf/language "en",
                          :rdf/value    "Democratic Republic of the Congo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Belgian Congo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Belgian Congo"}
                   {:rdf/language "en",
                    :rdf/value    "Democratic Republic of the Congo"}
                   {:rdf/language "en",
                    :rdf/value    "Congo (Kinshasa)"}
                   {:rdf/language "en",
                    :rdf/value    "Zaire"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-cg,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Congo (Democratic Republic)"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Congo (Kinshasa)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Zaire"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Democratic Republic of the Congo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Belgian Congo"}}]})

(def ch
  "China (Republic : 1949- )"
  {:db/ident :loc.countries/ch,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "China (Republic : 1949- )"},
   :madsrdf/code "ch",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Pescadores Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Nationalist China"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Formosa Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Taiwan Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "P'eng-hu Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ch",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Pescadores Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Nationalist China"}
                   {:rdf/language "en",
                    :rdf/value    "P'eng-hu Island"}
                   {:rdf/language "en",
                    :rdf/value    "Formosa Island"}
                   {:rdf/language "en",
                    :rdf/value    "Taiwan Island"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ch,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ch",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "China (Republic : 1949- )"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pescadores Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Taiwan Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "P'eng-hu Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nationalist China"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Formosa Island"}}]})

(def ci
  "Croatia"
  {:db/ident :loc.countries/ci,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Croatia"},
   :madsrdf/code "ci",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-ci,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CROATIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "CROATIA"}],
                                 :madsrdf/code "HR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [yu] Croatia before 1992-10"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/yu,
   :owl/sameAs "info:lc/vocabulary/countries/ci",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ci,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-ci,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [yu] Croatia before 1992-10"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ci",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Croatia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "HR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CROATIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "CROATIA"}]}})

(def cj
  "Cayman Islands"
  {:db/ident :loc.countries/cj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Cayman Islands"},
   :madsrdf/code "cj",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwcj,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CAÏMANES, ÎLES"}
                                  {:rdf/language "en",
                                   :rdf/value    "CAYMAN ISLANDS"}],
                                 :madsrdf/code "KY",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Grand Cayman Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Cayman Brac Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Little Cayman Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cj",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Little Cayman Island"}
                   {:rdf/language "en",
                    :rdf/value    "Cayman Brac Island"}
                   {:rdf/language "en",
                    :rdf/value    "Grand Cayman Island"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cj,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwcj,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cj",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Cayman Islands"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "KY",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CAÏMANES, ÎLES"}
                                            {:rdf/language "en",
                                             :rdf/value    "CAYMAN ISLANDS"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Cayman Brac Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Grand Cayman Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Little Cayman Island"}}]})

(def ck
  "Colombia"
  {:db/ident :loc.countries/ck,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Colombia"},
   :madsrdf/code "ck",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-ck,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "COLOMBIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "COLOMBIA"}],
                                 :madsrdf/code "CO",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Isla de Malpelo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "San Andrés y Providencia"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Malpelo, Isla de"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value "Coded [uc] Serrana Bank before 1978-01"}
                         {:rdf/language "en",
                          :rdf/value
                          "Coded [uc] Serranilla Bank before 1978-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/uc,
   :owl/sameAs "info:lc/vocabulary/countries/ck",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "San Andrés y Providencia"}
                   {:rdf/language "en",
                    :rdf/value    "Malpelo, Isla de"}
                   {:rdf/language "en",
                    :rdf/value    "Isla de Malpelo"}],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ck,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-ck,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value "Coded [uc] Serranilla Bank before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [uc] Serrana Bank before 1978-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ck",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Colombia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CO",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "COLOMBIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "COLOMBIA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Isla de Malpelo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "San Andrés y Providencia"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Malpelo, Isla de"}}]})

(def cl
  "Chile"
  {:db/ident :loc.countries/cl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Chile"},
   :madsrdf/code "cl",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-cl,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CHILI"}
                                  {:rdf/language "en",
                                   :rdf/value    "CHILE"}],
                                 :madsrdf/code "CL",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Islas Juan Fernández"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Isla Sala y Gómez"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Isla de Pasqua"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Easter Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pasqua, Isla de"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Juan Fernández, Islas"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "San Félix"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Sala y Gómez, Isla"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cl",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Easter Island"}
                   {:rdf/language "en",
                    :rdf/value    "Isla Sala y Gómez"}
                   {:rdf/language "en",
                    :rdf/value    "Juan Fernández, Islas"}
                   {:rdf/language "en",
                    :rdf/value    "Pasqua, Isla de"}
                   {:rdf/language "en",
                    :rdf/value    "Sala y Gómez, Isla"}
                   {:rdf/language "en",
                    :rdf/value    "Islas Juan Fernández"}
                   {:rdf/language "en",
                    :rdf/value    "San Félix"}
                   {:rdf/language "en",
                    :rdf/value    "Isla de Pasqua"}],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cl,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-cl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cl",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Chile"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CL",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CHILI"}
                                            {:rdf/language "en",
                                             :rdf/value    "CHILE"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Easter Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Isla de Pasqua"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pasqua, Isla de"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Isla Sala y Gómez"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "San Félix"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Juan Fernández, Islas"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Islas Juan Fernández"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Sala y Gómez, Isla"}}]})

(def cm
  "Cameroon"
  {:db/ident :loc.countries/cm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Cameroon"},
   :madsrdf/code "cm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-cm,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CAMEROUN"}
                                  {:rdf/language "en",
                                   :rdf/value    "CAMEROON"}],
                                 :madsrdf/code "CM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Southern Cameroons"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "West Cameroon"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "German Cameroons"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "French Cameroons"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "British Cameroons"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "East Cameroon"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Southern Cameroons"}
                   {:rdf/language "en",
                    :rdf/value    "German Cameroons"}
                   {:rdf/language "en",
                    :rdf/value    "East Cameroon"}
                   {:rdf/language "en",
                    :rdf/value    "West Cameroon"}
                   {:rdf/language "en",
                    :rdf/value    "French Cameroons"}
                   {:rdf/language "en",
                    :rdf/value    "British Cameroons"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-cm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Cameroon"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CAMEROUN"}
                                            {:rdf/language "en",
                                             :rdf/value    "CAMEROON"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "West Cameroon"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Southern Cameroons"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "French Cameroons"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "British Cameroons"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "German Cameroons"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "East Cameroon"}}]})

(def co
  "Curaçao"
  {:db/ident :loc.countries/co,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Curaçao"},
   :madsrdf/code "co",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwco,
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        {:rdf/language "en",
                         :rdf/value    "Curaçao (Netherlands Antilles)"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "Coded [na] Curaçao before 2011-12"}
                         {:rdf/language "en",
                          :rdf/value
                          "Coded [na] Netherlands Antilles before 2011-12"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/na,
   :owl/sameAs "info:lc/vocabulary/countries/co",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Curaçao (Netherlands Antilles)"},
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/co,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwco,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [na] Curaçao before 2011-12"}
                      {:rdf/language "en",
                       :rdf/value
                       "Coded [na] Netherlands Antilles before 2011-12"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "co",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Curaçao"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value
                                          "Curaçao (Netherlands Antilles)"}}})

(def cou
  "Colorado"
  {:db/ident :loc.countries/cou,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Colorado"},
   :madsrdf/code "cou",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-co,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cou",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cou,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-co,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cou",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Colorado"}})

(def cq
  "Comoros"
  {:db/ident :loc.countries/cq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Comoros"},
   :madsrdf/code "cq",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-cq,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "COMORES"}
                                  {:rdf/language "en",
                                   :rdf/value    "COMOROS"}],
                                 :madsrdf/code "KM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Moheli Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Comores"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Anjouan Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Grande Comore Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useInstead :loc.countries/ot,
   :owl/sameAs "info:lc/vocabulary/countries/cq",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/countries/ot"],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Anjouan Island"}
                   {:rdf/language "en",
                    :rdf/value    "Moheli Island"}
                   {:rdf/language "en",
                    :rdf/value    "Grande Comore Island"}
                   {:rdf/language "en",
                    :rdf/value    "Comores"}],
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cq,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-cq,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cq",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Comoros"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "KM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "COMORES"}
                                            {:rdf/language "en",
                                             :rdf/value    "COMOROS"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Moheli Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Anjouan Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Grande Comore Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Comores"}}]})

(def cr
  "Costa Rica"
  {:db/ident :loc.countries/cr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Costa Rica"},
   :madsrdf/code "cr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nc,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nccr,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "COSTA RICA"}
                                  {:rdf/language "en",
                                   :rdf/value    "COSTA RICA"}],
                                 :madsrdf/code "CR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Cocos Island"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Cocos Island"},
   :skos/broadMatch :loc.geographicAreas/nc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cr,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nccr,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Costa Rica"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "COSTA RICA"}
                                            {:rdf/language "en",
                                             :rdf/value    "COSTA RICA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Cocos Island"}}})

(def ctu
  "Connecticut"
  {:db/ident :loc.countries/ctu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Connecticut"},
   :madsrdf/code "ctu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ctu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ctu,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ctu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Connecticut"}})

(def cu
  "Cuba"
  {:db/ident :loc.countries/cu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Cuba"},
   :madsrdf/code "cu",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwcu,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CUBA"}
                                  {:rdf/language "en",
                                   :rdf/value    "CUBA"}],
                                 :madsrdf/code "CU",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pines, Isle of (Caribbean)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Isle of Pines (Caribbean)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Pines, Isle of (Caribbean)"}
                   {:rdf/language "en",
                    :rdf/value    "Isle of Pines (Caribbean)"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwcu,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Cuba"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CU",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CUBA"}
                                            {:rdf/language "en",
                                             :rdf/value    "CUBA"}]},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Isle of Pines (Caribbean)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Pines, Isle of (Caribbean)"}}]})

(def cv
  "Cabo Verde"
  {:db/ident :loc.countries/cv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Cabo Verde"},
   :madsrdf/code "cv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/l,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/lncv,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Cape Verde"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Santo Antao"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "São Tiago"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Maio"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Fogo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sal"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Boa Vista"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "São Vicente"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "São Nicolau"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Brava"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "São Vicente"}
                   {:rdf/language "en",
                    :rdf/value    "Maio"}
                   {:rdf/language "en",
                    :rdf/value    "Sal"}
                   {:rdf/language "en",
                    :rdf/value    "São Tiago"}
                   {:rdf/language "en",
                    :rdf/value    "Santo Antao"}
                   {:rdf/language "en",
                    :rdf/value    "Cape Verde"}
                   {:rdf/language "en",
                    :rdf/value    "Brava"}
                   {:rdf/language "en",
                    :rdf/value    "São Nicolau"}
                   {:rdf/language "en",
                    :rdf/value    "Boa Vista"}
                   {:rdf/language "en",
                    :rdf/value    "Fogo"}],
   :skos/broadMatch :loc.geographicAreas/l,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/lncv,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Cabo Verde"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Brava"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Maio"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Santo Antao"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "São Vicente"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Cape Verde"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Boa Vista"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "São Nicolau"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "São Tiago"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Fogo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sal"}}]})

(def cw
  "Cook Islands"
  {:db/ident :loc.countries/cw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Cook Islands"},
   :madsrdf/code "cw",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/pocw,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "COOK, ÎLES"}
                                  {:rdf/language "en",
                                   :rdf/value    "COOK ISLANDS"}],
                                 :madsrdf/code "CK",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Danger Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Penrhyn Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Manihiki Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Rakahanga Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cw",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Rakahanga Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Penrhyn Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Danger Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Manihiki Atoll"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cw,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/pocw,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cw",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Cook Islands"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CK",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "COOK, ÎLES"}
                                            {:rdf/language "en",
                                             :rdf/value    "COOK ISLANDS"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Rakahanga Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Penrhyn Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Manihiki Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Danger Atoll"}}]})

(def cx
  "Central African Republic"
  {:db/ident :loc.countries/cx,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Central African Republic"},
   :madsrdf/code "cx",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-cx,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CENTRAFRICAINE, RÉPUBLIQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "CENTRAL AFRICAN REPUBLIC"}],
                                 :madsrdf/code "CF",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Central African Empire"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ubangi-Shari"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cx",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Ubangi-Shari"}
                   {:rdf/language "en",
                    :rdf/value    "Central African Empire"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cx,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-cx,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cx",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Central African Republic"},
   :skos/semanticRelation
   {:rdf/type       :skos/Concept,
    :skos/notation  "CF",
    :skos/note      "This is the ISO 3166 match",
    :skos/prefLabel [{:rdf/language "fr",
                      :rdf/value    "CENTRAFRICAINE, RÉPUBLIQUE"}
                     {:rdf/language "en",
                      :rdf/value    "CENTRAL AFRICAN REPUBLIC"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ubangi-Shari"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Central African Empire"}}]})

(def cy
  "Cyprus"
  {:db/ident :loc.countries/cy,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Cyprus"},
   :madsrdf/code "cy",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-cy,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CHYPRE"}
                                  {:rdf/language "en",
                                   :rdf/value    "CYPRUS"}],
                                 :madsrdf/code "CY",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/cy",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/cy,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-cy,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "cy",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Cyprus"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CY",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CHYPRE"}
                                            {:rdf/language "en",
                                             :rdf/value    "CYPRUS"}]}})

(def dcu
  "District of Columbia"
  {:db/ident :loc.countries/dcu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "District of Columbia"},
   :madsrdf/code "dcu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/dcu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/dcu,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "dcu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "District of Columbia"}})

(def deu
  "Delaware"
  {:db/ident :loc.countries/deu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Delaware"},
   :madsrdf/code "deu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-de,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/deu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/deu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-de,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "deu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Delaware"}})

(def dk
  "Denmark"
  {:db/ident :loc.countries/dk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Denmark"},
   :madsrdf/code "dk",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-dk,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "DANEMARK"}
                                  {:rdf/language "en",
                                   :rdf/value    "DENMARK"}],
                                 :madsrdf/code "DK",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Bornholm Island"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/dk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Bornholm Island"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/dk,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-dk,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "dk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Denmark"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "DK",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "DANEMARK"}
                                            {:rdf/language "en",
                                             :rdf/value    "DENMARK"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Bornholm Island"}}})

(def dm
  "Benin"
  {:db/ident :loc.countries/dm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Benin"},
   :madsrdf/code "dm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-dm,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BÉNIN"}
                                  {:rdf/language "en",
                                   :rdf/value    "BENIN"}],
                                 :madsrdf/code "BJ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Dahomey"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/dm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Dahomey"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/dm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-dm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "dm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Benin"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BJ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BÉNIN"}
                                            {:rdf/language "en",
                                             :rdf/value    "BENIN"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Dahomey"}}})

(def dq
  "Dominica"
  {:db/ident :loc.countries/dq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Dominica"},
   :madsrdf/code "dq",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwdq,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "DOMINIQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "DOMINICA"}],
                                 :madsrdf/code "DM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/dq",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/dq,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwdq,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "dq",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Dominica"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "DM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "DOMINIQUE"}
                                            {:rdf/language "en",
                                             :rdf/value    "DOMINICA"}]}})

(def dr
  "Dominican Republic"
  {:db/ident :loc.countries/dr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Dominican Republic"},
   :madsrdf/code "dr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwdr,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "DOMINICAINE, RÉPUBLIQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "DOMINICAN REPUBLIC"}],
                                 :madsrdf/code "DO",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/dr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/dr,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwdr,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "dr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Dominican Republic"},
   :skos/semanticRelation
   {:rdf/type       :skos/Concept,
    :skos/notation  "DO",
    :skos/note      "This is the ISO 3166 match",
    :skos/prefLabel [{:rdf/language "fr",
                      :rdf/value    "DOMINICAINE, RÉPUBLIQUE"}
                     {:rdf/language "en",
                      :rdf/value    "DOMINICAN REPUBLIC"}]}})

(def ea
  "Eritrea"
  {:db/ident :loc.countries/ea,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Eritrea"},
   :madsrdf/code "ea",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ea,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ÉRYTHRÉE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ERITREA"}],
                                 :madsrdf/code "ER",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [et] Eritrea before 1993-11"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/et,
   :owl/sameAs "info:lc/vocabulary/countries/ea",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ea,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ea,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [et] Eritrea before 1993-11"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ea",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Eritrea"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ER",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ÉRYTHRÉE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ERITREA"}]}})

(def ec
  "Ecuador"
  {:db/ident :loc.countries/ec,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Ecuador"},
   :madsrdf/code "ec",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-ec,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ÉQUATEUR"}
                                  {:rdf/language "en",
                                   :rdf/value    "ECUADOR"}],
                                 :madsrdf/code "EC",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Colón, Archipiélago de"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Galapagos Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Archipiélago de Colón"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ec",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Galapagos Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Colón, Archipiélago de"}
                   {:rdf/language "en",
                    :rdf/value    "Archipiélago de Colón"}],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ec,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-ec,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ec",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Ecuador"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "EC",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ÉQUATEUR"}
                                            {:rdf/language "en",
                                             :rdf/value    "ECUADOR"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Archipiélago de Colón"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Colón, Archipiélago de"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Galapagos Islands"}}]})

(def eg
  "Equatorial Guinea"
  {:db/ident :loc.countries/eg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Equatorial Guinea"},
   :madsrdf/code "eg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-eg,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GUINÉE ÉQUATORIALE"}
                                  {:rdf/language "en",
                                   :rdf/value    "EQUATORIAL GUINEA"}],
                                 :madsrdf/code "GQ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Elobey, Great"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pagalu"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Macias Nguema Biyogo"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Elobey, Small"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Fernando Po Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Corisco Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Rio Muni"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Bioko"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Annobón"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/eg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Bioko"}
                   {:rdf/language "en",
                    :rdf/value    "Annobón"}
                   {:rdf/language "en",
                    :rdf/value    "Macias Nguema Biyogo"}
                   {:rdf/language "en",
                    :rdf/value    "Elobey, Great"}
                   {:rdf/language "en",
                    :rdf/value    "Pagalu"}
                   {:rdf/language "en",
                    :rdf/value    "Elobey, Small"}
                   {:rdf/language "en",
                    :rdf/value    "Fernando Po Island"}
                   {:rdf/language "en",
                    :rdf/value    "Rio Muni"}
                   {:rdf/language "en",
                    :rdf/value    "Corisco Island"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/eg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-eg,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "eg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Equatorial Guinea"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GQ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GUINÉE ÉQUATORIALE"}
                                            {:rdf/language "en",
                                             :rdf/value "EQUATORIAL GUINEA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Elobey, Small"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bioko"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Fernando Po Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Corisco Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Macias Nguema Biyogo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Rio Muni"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pagalu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Annobón"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Elobey, Great"}}]})

(def em
  "Timor-Leste"
  {:db/ident :loc.countries/em,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
     :ri/recordContentSource
     :loc.organizations/dlcmrc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2013-11-25T05:00:00.000-00:00",
     :ri/recordChangeNote
     "Preferred label changed from East Timor to Timor-Leste",
     :ri/recordContentSource
     :loc.organizations/dlcmrc,
     :ri/recordStatus "updated"}],
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Timor-Leste"},
   :madsrdf/code "em",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-em,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TIMOR-LESTE"}
                                  {:rdf/language "en",
                                   :rdf/value    "TIMOR-LESTE"}],
                                 :madsrdf/code "TL",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Timor, East"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "East Timor"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [pt] Ilha de Atauro before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [pt] Ilheu de Jaco before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [pt] Atauro, Ilha de before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [pt] Portuguese Timor before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [pt] Oe-Cussi before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [pt] Jaco, Ilheu de before 1978-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/pt,
   :owl/sameAs "info:lc/vocabulary/countries/em",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "East Timor"}
                   {:rdf/language "en",
                    :rdf/value    "Timor, East"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
     :cs/creatorName     :loc.organizations/dlcmrc,
     :cs/subjectOfChange :loc.countries/em,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "updated",
     :cs/createdDate     #inst "2013-11-25T05:00:00.000-00:00",
     :cs/creatorName     :loc.organizations/dlcmrc,
     :cs/subjectOfChange :loc.countries/em,
     :rdf/type           :cs/ChangeSet}],
   :skos/exactMatch :loc.geographicAreas/a-em,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [pt] Jaco, Ilheu de before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value "Coded [pt] Portuguese Timor before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [pt] Ilheu de Jaco before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value "Coded [pt] Atauro, Ilha de before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [pt] Oe-Cussi before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value "Coded [pt] Ilha de Atauro before 1978-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "em",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Timor-Leste"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TL",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TIMOR-LESTE"}
                                            {:rdf/language "en",
                                             :rdf/value    "TIMOR-LESTE"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Timor, East"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "East Timor"}}]})

(def enk
  "England"
  {:db/ident :loc.countries/enk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "England"},
   :madsrdf/code "enk",
   :madsrdf/hasBroaderAuthority :loc.countries/xxk,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-uk-en,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/enk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/broader :loc.countries/xxk,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/enk,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-uk-en,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "enk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "England"}})

(def er
  "Estonia"
  {:db/ident :loc.countries/er,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Estonia"},
   :madsrdf/code "er",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-er,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ESTONIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ESTONIA"}],
                                 :madsrdf/code "EE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [err] Estonia before 1992-10"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/err,
   :owl/sameAs "info:lc/vocabulary/countries/er",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/er,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-er,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [err] Estonia before 1992-10"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "er",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Estonia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "EE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ESTONIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ESTONIA"}]}})

(def es
  "El Salvador"
  {:db/ident :loc.countries/es,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "El Salvador"},
   :madsrdf/code "es",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nc,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nces,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "EL SALVADOR"}
                                  {:rdf/language "en",
                                   :rdf/value    "EL SALVADOR"}],
                                 :madsrdf/code "SV",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Salvador"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/es",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Salvador"},
   :skos/broadMatch :loc.geographicAreas/nc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/es,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nces,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "es",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "El Salvador"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SV",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "EL SALVADOR"}
                                            {:rdf/language "en",
                                             :rdf/value    "EL SALVADOR"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Salvador"}}})

(def et
  "Ethiopia"
  {:db/ident :loc.countries/et,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Ethiopia"},
   :madsrdf/code "et",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-et,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ÉTHIOPIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ETHIOPIA"}],
                                 :madsrdf/code "ET",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useInstead :loc.countries/ea,
   :owl/sameAs "info:lc/vocabulary/countries/et",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/countries/ea"],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/et,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-et,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "et",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Ethiopia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ET",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ÉTHIOPIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ETHIOPIA"}]}})

(def fa
  "Faroe Islands"
  {:db/ident :loc.countries/fa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Faroe Islands"},
   :madsrdf/code "fa",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/l,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/lnfa,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "FÉROÉ, ÎLES"}
                                  {:rdf/language "en",
                                   :rdf/value    "FAROE ISLANDS"}],
                                 :madsrdf/code "FO",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Færoe Islands"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/fa",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Færoe Islands"},
   :skos/broadMatch :loc.geographicAreas/l,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/fa,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/lnfa,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "fa",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Faroe Islands"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "FO",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "FÉROÉ, ÎLES"}
                                            {:rdf/language "en",
                                             :rdf/value    "FAROE ISLANDS"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Færoe Islands"}}})

(def fg
  "French Guiana"
  {:db/ident :loc.countries/fg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "French Guiana"},
   :madsrdf/code "fg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-fg,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GUYANE FRANÇAISE"}
                                  {:rdf/language "en",
                                   :rdf/value    "FRENCH GUIANA"}],
                                 :madsrdf/code "GF",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Guiana, French"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/fg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Guiana, French"},
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/fg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-fg,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "fg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "French Guiana"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GF",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GUYANE FRANÇAISE"}
                                            {:rdf/language "en",
                                             :rdf/value    "FRENCH GUIANA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Guiana, French"}}})

(def fi
  "Finland"
  {:db/ident :loc.countries/fi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Finland"},
   :madsrdf/code "fi",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-fi,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "FINLANDE"}
                                  {:rdf/language "en",
                                   :rdf/value    "FINLAND"}],
                                 :madsrdf/code "FI",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ahvenanmaa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Åland Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/fi",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Ahvenanmaa"}
                   {:rdf/language "en",
                    :rdf/value    "Åland Islands"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/fi,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-fi,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "fi",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Finland"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "FI",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "FINLANDE"}
                                            {:rdf/language "en",
                                             :rdf/value    "FINLAND"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Åland Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ahvenanmaa"}}]})

(def fj
  "Fiji"
  {:db/ident :loc.countries/fj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Fiji"},
   :madsrdf/code "fj",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/pofj,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "FIDJI"}
                                  {:rdf/language "en",
                                   :rdf/value    "FIJI"}],
                                 :madsrdf/code "FJ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Rotuma Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Vanua Levu Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Viti Levu Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/fj",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Rotuma Island"}
                   {:rdf/language "en",
                    :rdf/value    "Viti Levu Island"}
                   {:rdf/language "en",
                    :rdf/value    "Vanua Levu Island"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/fj,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/pofj,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "fj",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Fiji"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "FJ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "FIDJI"}
                                            {:rdf/language "en",
                                             :rdf/value    "FIJI"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Vanua Levu Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Viti Levu Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Rotuma Island"}}]})

(def fk
  "Falkland Islands"
  {:db/ident :loc.countries/fk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Falkland Islands"},
   :madsrdf/code "fk",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/l,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/lsfk,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "West Falkland Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Islas Malvinas"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "East Falkland Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Malvinas, Islas"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useInstead :loc.countries/xs,
   :owl/sameAs "info:lc/vocabulary/countries/fk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/countries/xs"],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Islas Malvinas"}
                   {:rdf/language "en",
                    :rdf/value    "Malvinas, Islas"}
                   {:rdf/language "en",
                    :rdf/value    "West Falkland Island"}
                   {:rdf/language "en",
                    :rdf/value    "East Falkland Island"}],
   :skos/broadMatch :loc.geographicAreas/l,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/fk,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/lsfk,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "fk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Falkland Islands"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Islas Malvinas"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Malvinas, Islas"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "East Falkland Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "West Falkland Island"}}]})

(def flu
  "Florida"
  {:db/ident :loc.countries/flu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Florida"},
   :madsrdf/code "flu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-fl,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/flu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/flu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-fl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "flu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Florida"}})

(def fm
  "Micronesia (Federated States)"
  {:db/ident :loc.countries/fm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Micronesia (Federated States)"},
   :madsrdf/code "fm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/pomi,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ngulu Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pulap Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Kosrae (Micronesia)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Senyavin Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pulusak Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Hall Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Federated States of Micronesia"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Nukuoru Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Oroluk Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Yap (Micronesia)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ascension Island (Micronesia)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Truk (Micronesia)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Puluwat Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "West Fayu Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Eauripik Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ulithi Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Kapingamarangi Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Faraulep Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Satawal Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pingelap Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Fais Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pohnpei"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ponape (Micronesia)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Woleai Atolls"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ngatik Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Kusaie (Micronesia)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ifalik Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Mortlock Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Namonuito Atoll"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Gaferut Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value
     "Coded [tt] Trust Territory of the Pacific Islands before 1988-03"}
    {:rdf/language "en",
     :rdf/value "Coded [tt] Pacific Islands (Trust Territory) before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [tt] Micronesia (Federated States) before 1988-03"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/tt,
   :owl/sameAs "info:lc/vocabulary/countries/fm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Satawal Island"}
                   {:rdf/language "en",
                    :rdf/value    "Ifalik Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Senyavin Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Faraulep Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Eauripik Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Hall Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Namonuito Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Truk (Micronesia)"}
                   {:rdf/language "en",
                    :rdf/value    "Yap (Micronesia)"}
                   {:rdf/language "en",
                    :rdf/value    "Pulap Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Fais Island"}
                   {:rdf/language "en",
                    :rdf/value    "Pingelap Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "West Fayu Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Woleai Atolls"}
                   {:rdf/language "en",
                    :rdf/value    "Mortlock Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Kosrae (Micronesia)"}
                   {:rdf/language "en",
                    :rdf/value    "Pohnpei"}
                   {:rdf/language "en",
                    :rdf/value    "Oroluk Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Puluwat Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Kusaie (Micronesia)"}
                   {:rdf/language "en",
                    :rdf/value    "Pulusak Island"}
                   {:rdf/language "en",
                    :rdf/value    "Kapingamarangi Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Ascension Island (Micronesia)"}
                   {:rdf/language "en",
                    :rdf/value    "Gaferut Island"}
                   {:rdf/language "en",
                    :rdf/value    "Ngulu Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Ngatik Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Ulithi Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Nukuoru Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Ponape (Micronesia)"}
                   {:rdf/language "en",
                    :rdf/value    "Federated States of Micronesia"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/fm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/pomi,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value "Coded [tt] Pacific Islands (Trust Territory) before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [tt] Micronesia (Federated States) before 1988-03"}
    {:rdf/language "en",
     :rdf/value
     "Coded [tt] Trust Territory of the Pacific Islands before 1988-03"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "fm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Micronesia (Federated States)"},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Senyavin Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Woleai Atolls"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ifalik Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Mortlock Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Truk (Micronesia)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Gaferut Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Faraulep Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Hall Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ponape (Micronesia)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Pulusak Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Satawal Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Oroluk Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Pingelap Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ascension Island (Micronesia)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Kosrae (Micronesia)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ngatik Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Kapingamarangi Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "West Fayu Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Eauripik Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Kusaie (Micronesia)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Federated States of Micronesia"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Pohnpei"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Pulap Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Namonuito Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Fais Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Nukuoru Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ngulu Atoll"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ulithi Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Yap (Micronesia)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Puluwat Atoll"}}]})

(def fp
  "French Polynesia"
  {:db/ident :loc.countries/fp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "French Polynesia"},
   :madsrdf/code "fp",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/pofp,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "POLYNÉSIE FRANÇAISE"}
                                  {:rdf/language "en",
                                   :rdf/value    "FRENCH POLYNESIA"}],
                                 :madsrdf/code "PF",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Sous le Vent, Iles"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Polynesia, French"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Clipperton Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Tahiti"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Tuamotu Archipelago"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Iles Australes"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Marquesas Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Iles Sous le Vent"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Gambier Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Society Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Vent, Iles du"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Austral Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Iles du Vent"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/fp",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Iles Sous le Vent"}
                   {:rdf/language "en",
                    :rdf/value    "Iles Australes"}
                   {:rdf/language "en",
                    :rdf/value    "Austral Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Polynesia, French"}
                   {:rdf/language "en",
                    :rdf/value    "Gambier Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Tuamotu Archipelago"}
                   {:rdf/language "en",
                    :rdf/value    "Vent, Iles du"}
                   {:rdf/language "en",
                    :rdf/value    "Society Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Iles du Vent"}
                   {:rdf/language "en",
                    :rdf/value    "Sous le Vent, Iles"}
                   {:rdf/language "en",
                    :rdf/value    "Marquesas Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Tahiti"}
                   {:rdf/language "en",
                    :rdf/value    "Clipperton Island"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/fp,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/pofp,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "fp",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "French Polynesia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PF",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value "POLYNÉSIE FRANÇAISE"}
                                            {:rdf/language "en",
                                             :rdf/value "FRENCH POLYNESIA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tuamotu Archipelago"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tahiti"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Iles du Vent"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Clipperton Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Gambier Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sous le Vent, Iles"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Austral Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Marquesas Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Society Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Iles Sous le Vent"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Vent, Iles du"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Iles Australes"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Polynesia, French"}}]})

(def fr
  "France"
  {:db/ident :loc.countries/fr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "France"},
   :madsrdf/code "fr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-fr,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "FRANCE"}
                                  {:rdf/language "en",
                                   :rdf/value    "FRANCE"}],
                                 :madsrdf/code "FR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Corsica"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/fr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Corsica"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/fr,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-fr,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "fr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "France"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "FR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "FRANCE"}
                                            {:rdf/language "en",
                                             :rdf/value    "FRANCE"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Corsica"}}})

(def fs
  "Terres australes et antarctiques françaises"
  {:db/ident :loc.countries/fs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value
                                "Terres australes et antarctiques françaises"},
   :madsrdf/code "fs",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-fs,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "T.A.A.F."},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Crozet Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Saint Paul Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Amsterdam Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Kerguelen Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel
                         {:rdf/language "en",
                          :rdf/value    "French Southern and Antarctic Lands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/fs",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Kerguelen Island"}
                   {:rdf/language "en",
                    :rdf/value    "Saint Paul Island"}
                   {:rdf/language "en",
                    :rdf/value    "T.A.A.F."}
                   {:rdf/language "en",
                    :rdf/value    "French Southern and Antarctic Lands"}
                   {:rdf/language "en",
                    :rdf/value    "Amsterdam Island"}
                   {:rdf/language "en",
                    :rdf/value    "Crozet Island"}],
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/fs,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-fs,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "fs",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value "Terres australes et antarctiques françaises"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "T.A.A.F."}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      {:rdf/language "en",
                       :rdf/value    "French Southern and Antarctic Lands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Saint Paul Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Amsterdam Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Crozet Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kerguelen Island"}}]})

(def ft
  "Djibouti"
  {:db/ident :loc.countries/ft,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Djibouti"},
   :madsrdf/code "ft",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ft,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "DJIBOUTI"}
                                  {:rdf/language "en",
                                   :rdf/value    "DJIBOUTI"}],
                                 :madsrdf/code "DJ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "French Somaliland"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel
                         {:rdf/language "en",
                          :rdf/value "French Territory of the Afars and Issas"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Afars"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Issas"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ft",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Afars"}
                   {:rdf/language "en",
                    :rdf/value    "French Territory of the Afars and Issas"}
                   {:rdf/language "en",
                    :rdf/value    "French Somaliland"}
                   {:rdf/language "en",
                    :rdf/value    "Issas"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ft,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ft,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ft",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Djibouti"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "DJ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "DJIBOUTI"}
                                            {:rdf/language "en",
                                             :rdf/value    "DJIBOUTI"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Issas"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Afars"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      {:rdf/language "en",
                       :rdf/value    "French Territory of the Afars and Issas"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "French Somaliland"}}]})

(def gau
  "Georgia"
  {:db/ident :loc.countries/gau,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Georgia"},
   :madsrdf/code "gau",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ga,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GÉORGIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "GEORGIA"}],
                                 :madsrdf/code "GE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gau",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gau,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ga,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gau",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Georgia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GÉORGIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "GEORGIA"}]}})

(def gb
  "Kiribati"
  {:db/ident :loc.countries/gb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Kiribati"},
   :madsrdf/code "gb",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/pokb,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "KIRIBATI"}
                                  {:rdf/language "en",
                                   :rdf/value    "KIRIBATI"}],
                                 :madsrdf/code "KI",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [gn] Kiribati before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Christmas Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Washington Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Sydney Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [cp] Canton Island before 1993-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [cp] Enderbury Island after 1993-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Malden Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value "Coded [ln] Central and Southern Line Islands before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Orona Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] McKean Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Phoenix Islands before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Kiribati before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Line Islands (Southern) before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Starbuck Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Tabuarean Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Ocean Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Gardner Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Caroline Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Rawaki before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Gilbert Islands before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Banaba before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Phoenix Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Kiritimati before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Flint Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Vostok Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Manra Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Nikomaroro Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Hull Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Fanning Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Birnie Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Gilbert and Ellice Islands before 1978-10"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/gn :loc.countries/ln :loc.countries/cp],
   :owl/sameAs "info:lc/vocabulary/countries/gb",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gb,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/pokb,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [gn] Birnie Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [cp] Canton Island before 1993-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Sydney Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Starbuck Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] McKean Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Kiribati before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Caroline Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Nikomaroro Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [cp] Enderbury Island after 1993-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Malden Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Washington Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Hull Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Gilbert and Ellice Islands before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Phoenix Islands before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Line Islands (Southern) before 1978-10"}
    {:rdf/language "en",
     :rdf/value "Coded [ln] Central and Southern Line Islands before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Manra Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Flint Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Gilbert Islands before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Rawaki before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [ln] Vostok Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Tabuarean Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Gardner Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Ocean Island before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Phoenix Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Christmas Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Orona Atoll before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Kiribati before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Banaba before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Kiritimati before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Fanning Atoll before 1978-10"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gb",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Kiribati"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "KI",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "KIRIBATI"}
                                            {:rdf/language "en",
                                             :rdf/value    "KIRIBATI"}]}})

(def gd
  "Grenada"
  {:db/ident :loc.countries/gd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Grenada"},
   :madsrdf/code "gd",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwgd,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GRENADE"}
                                  {:rdf/language "en",
                                   :rdf/value    "GRENADA"}],
                                 :madsrdf/code "GD",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value
                                               "Grenadine Islands, Southern"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gd",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Grenadine Islands, Southern"},
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gd,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwgd,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gd",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Grenada"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GD",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GRENADE"}
                                            {:rdf/language "en",
                                             :rdf/value    "GRENADA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value
                                          "Grenadine Islands, Southern"}}})

(def gg
  "Guernsey"
  {:db/ident :loc.countries/gg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Guernsey"},
   :madsrdf/code "gg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-gg,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GUERNESEY"}
                                  {:rdf/language "en",
                                   :rdf/value    "GUERNSEY"}],
                                 :madsrdf/code "GG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Herm"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sark Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Herm Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Lihou"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Channel Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Alderney"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sark"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Jethou"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Brecqhou"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Guernsey Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Brechou"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [uik] United Kingdom Misc. Islands before 2018-04"}
    {:rdf/language "en",
     :rdf/value    "Coded [uik] Guernsey before 2018-04"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/uik,
   :owl/sameAs "info:lc/vocabulary/countries/gg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Channel Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Alderney"}
                   {:rdf/language "en",
                    :rdf/value    "Brechou"}
                   {:rdf/language "en",
                    :rdf/value    "Lihou"}
                   {:rdf/language "en",
                    :rdf/value    "Jethou"}
                   {:rdf/language "en",
                    :rdf/value    "Guernsey Island"}
                   {:rdf/language "en",
                    :rdf/value    "Sark"}
                   {:rdf/language "en",
                    :rdf/value    "Herm Island"}
                   {:rdf/language "en",
                    :rdf/value    "Sark Island"}
                   {:rdf/language "en",
                    :rdf/value    "Herm"}
                   {:rdf/language "en",
                    :rdf/value    "Brecqhou"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-gg,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [uik] United Kingdom Misc. Islands before 2018-04"}
    {:rdf/language "en",
     :rdf/value    "Coded [uik] Guernsey before 2018-04"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Guernsey"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GUERNESEY"}
                                            {:rdf/language "en",
                                             :rdf/value    "GUERNSEY"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sark"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Herm Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Alderney"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Lihou"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sark Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Jethou"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Brechou"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Channel Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Guernsey Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Herm"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Brecqhou"}}]})

(def gh
  "Ghana"
  {:db/ident :loc.countries/gh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Ghana"},
   :madsrdf/code "gh",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-gh,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GHANA"}
                                  {:rdf/language "en",
                                   :rdf/value    "GHANA"}],
                                 :madsrdf/code "GH",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Togoland"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Gold Coast"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Northern Territories"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ashanti"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gh",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Togoland"}
                   {:rdf/language "en",
                    :rdf/value    "Gold Coast"}
                   {:rdf/language "en",
                    :rdf/value    "Ashanti"}
                   {:rdf/language "en",
                    :rdf/value    "Northern Territories"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gh,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-gh,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gh",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Ghana"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GH",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GHANA"}
                                            {:rdf/language "en",
                                             :rdf/value    "GHANA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ashanti"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Togoland"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Northern Territories"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Gold Coast"}}]})

(def gi
  "Gibraltar"
  {:db/ident :loc.countries/gi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Gibraltar"},
   :madsrdf/code "gi",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-gi,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GIBRALTAR"}
                                  {:rdf/language "en",
                                   :rdf/value    "GIBRALTAR"}],
                                 :madsrdf/code "GI",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gi",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gi,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-gi,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gi",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Gibraltar"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GI",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GIBRALTAR"}
                                            {:rdf/language "en",
                                             :rdf/value    "GIBRALTAR"}]}})

(def gl
  "Greenland"
  {:db/ident :loc.countries/gl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Greenland"},
   :madsrdf/code "gl",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-gl,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GROENLAND"}
                                  {:rdf/language "en",
                                   :rdf/value    "GREENLAND"}],
                                 :madsrdf/code "GL",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gl",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gl,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-gl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gl",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Greenland"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GL",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GROENLAND"}
                                            {:rdf/language "en",
                                             :rdf/value    "GREENLAND"}]}})

(def gm
  "Gambia"
  {:db/ident :loc.countries/gm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Gambia"},
   :madsrdf/code "gm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GAMBIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "GAMBIA"}],
                                 :madsrdf/code "GM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gm,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Gambia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GAMBIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "GAMBIA"}]}})

(def go
  "Gabon"
  {:db/ident :loc.countries/go,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Gabon"},
   :madsrdf/code "go",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GABON"}
                                  {:rdf/language "en",
                                   :rdf/value    "GABON"}],
                                 :madsrdf/code "GA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/go",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/go,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "go",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Gabon"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GABON"}
                                            {:rdf/language "en",
                                             :rdf/value    "GABON"}]}})

(def gp
  "Guadeloupe"
  {:db/ident :loc.countries/gp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Guadeloupe"},
   :madsrdf/code "gp",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwgp,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GUADELOUPE"}
                                  {:rdf/language "en",
                                   :rdf/value    "GUADELOUPE"}],
                                 :madsrdf/code "GP",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Saintes, Iles des"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Grande-Terre"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Iles de la Petite Terre"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Petite Terre, Iles de"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Iles des Saintes"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Basse-Terre"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "La Désirade"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Marie-Galante"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gp",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "La Désirade"}
                   {:rdf/language "en",
                    :rdf/value    "Basse-Terre"}
                   {:rdf/language "en",
                    :rdf/value    "Marie-Galante"}
                   {:rdf/language "en",
                    :rdf/value    "Iles de la Petite Terre"}
                   {:rdf/language "en",
                    :rdf/value    "Petite Terre, Iles de"}
                   {:rdf/language "en",
                    :rdf/value    "Saintes, Iles des"}
                   {:rdf/language "en",
                    :rdf/value    "Iles des Saintes"}
                   {:rdf/language "en",
                    :rdf/value    "Grande-Terre"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gp,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwgp,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gp",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Guadeloupe"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GP",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GUADELOUPE"}
                                            {:rdf/language "en",
                                             :rdf/value    "GUADELOUPE"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Petite Terre, Iles de"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Basse-Terre"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Marie-Galante"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Iles de la Petite Terre"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Grande-Terre"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Saintes, Iles des"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Iles des Saintes"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "La Désirade"}}]})

(def gr
  "Greece"
  {:db/ident :loc.countries/gr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Greece"},
   :madsrdf/code "gr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-gr,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GRÈCE"}
                                  {:rdf/language "en",
                                   :rdf/value    "GREECE"}],
                                 :madsrdf/code "GR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Dodecanese"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Crete"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Aegean Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Mount Athos"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ionian Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Ionian Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Crete"}
                   {:rdf/language "en",
                    :rdf/value    "Aegean Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Mount Athos"}
                   {:rdf/language "en",
                    :rdf/value    "Dodecanese"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gr,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-gr,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Greece"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GRÈCE"}
                                            {:rdf/language "en",
                                             :rdf/value    "GREECE"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Dodecanese"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Crete"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ionian Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Mount Athos"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Aegean Islands"}}]})

(def gs
  "Georgia (Republic)"
  {:db/ident :loc.countries/gs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Georgia (Republic)"},
   :madsrdf/code "gs",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-gs,
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [gsr] Georgia (Republic) before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [gsr] Georgian S.S.R. before 1992-06"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/gsr :loc.countries/ur :loc.countries/xxr],
   :owl/sameAs "info:lc/vocabulary/countries/gs",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gs,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-gs,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
                      {:rdf/language "en",
                       :rdf/value "Coded [gsr] Georgian S.S.R. before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value
                       "Coded [gsr] Georgia (Republic) before 1992-06"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gs",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Georgia (Republic)"}})

(def gt
  "Guatemala"
  {:db/ident :loc.countries/gt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Guatemala"},
   :madsrdf/code "gt",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nc,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/ncgt,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GUATEMALA"}
                                  {:rdf/language "en",
                                   :rdf/value    "GUATEMALA"}],
                                 :madsrdf/code "GT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gt",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gt,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/ncgt,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gt",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Guatemala"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GUATEMALA"}
                                            {:rdf/language "en",
                                             :rdf/value    "GUATEMALA"}]}})

(def gu
  "Guam"
  {:db/ident :loc.countries/gu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Guam"},
   :madsrdf/code "gu",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/pogu,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GUAM"}
                                  {:rdf/language "en",
                                   :rdf/value    "GUAM"}],
                                 :madsrdf/code "GU",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/pogu,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Guam"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GU",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GUAM"}
                                            {:rdf/language "en",
                                             :rdf/value    "GUAM"}]}})

(def gv
  "Guinea"
  {:db/ident :loc.countries/gv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Guinea"},
   :madsrdf/code "gv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-gv,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GUINÉE"}
                                  {:rdf/language "en",
                                   :rdf/value    "GUINEA"}],
                                 :madsrdf/code "GN",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "French Guinea"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "French Guinea"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-gv,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Guinea"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GN",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GUINÉE"}
                                            {:rdf/language "en",
                                             :rdf/value    "GUINEA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "French Guinea"}}})

(def gw
  "Germany"
  {:db/ident :loc.countries/gw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Germany"},
   :madsrdf/code "gw",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-gx,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ALLEMAGNE"}
                                  {:rdf/language "en",
                                   :rdf/value    "GERMANY"}],
                                 :madsrdf/code "DE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Germany (West)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Germany, Federal Republic of"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [ge] Germany (East) before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ge] Germany, Democratic Republic of before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [wb] West Berlin before 1990-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ge] East Berlin before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ge] Berlin, East before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [wb] Berlin, West before 1990-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/ge :loc.countries/wb],
   :owl/sameAs "info:lc/vocabulary/countries/gw",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Germany (West)"}
                   {:rdf/language "en",
                    :rdf/value    "Germany, Federal Republic of"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gw,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-gx,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [wb] West Berlin before 1990-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ge] East Berlin before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ge] Berlin, East before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ge] Germany (East) before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ge] Germany, Democratic Republic of before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [wb] Berlin, West before 1990-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gw",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Germany"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "DE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ALLEMAGNE"}
                                            {:rdf/language "en",
                                             :rdf/value    "GERMANY"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Germany, Federal Republic of"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Germany (West)"}}]})

(def gy
  "Guyana"
  {:db/ident :loc.countries/gy,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Guyana"},
   :madsrdf/code "gy",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-gy,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GUYANA"}
                                  {:rdf/language "en",
                                   :rdf/value    "GUYANA"}],
                                 :madsrdf/code "GY",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "British Guiana"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Guiana, British"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gy",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Guiana, British"}
                   {:rdf/language "en",
                    :rdf/value    "British Guiana"}],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gy,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-gy,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gy",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Guyana"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GY",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GUYANA"}
                                            {:rdf/language "en",
                                             :rdf/value    "GUYANA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "British Guiana"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Guiana, British"}}]})

(def gz
  "Gaza Strip"
  {:db/ident :loc.countries/gz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Gaza Strip"},
   :madsrdf/code "gz",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority [:loc.geographicAreas/awgz
                                       :loc.authorities/sh85053589concept],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/gz",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/gz,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch [:loc.geographicAreas/awgz
                     :loc.authorities/sh85053589concept],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "gz",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Gaza Strip"}})

(def hiu
  "Hawaii"
  {:db/ident :loc.countries/hiu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Hawaii"},
   :madsrdf/code "hiu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-hi,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/hiu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/hiu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-hi,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "hiu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Hawaii"}})

(def hm
  "Heard and McDonald Islands"
  {:db/ident :loc.countries/hm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Heard and McDonald Islands"},
   :madsrdf/code "hm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-hm,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/hm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/hm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-hm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "hm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Heard and McDonald Islands"}})

(def ho
  "Honduras"
  {:db/ident :loc.countries/ho,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Honduras"},
   :madsrdf/code "ho",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nc,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/ncho,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "HONDURAS"}
                                  {:rdf/language "en",
                                   :rdf/value    "HONDURAS"}],
                                 :madsrdf/code "HN",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [sv] Swan Islands before 1978-01"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/sv,
   :owl/sameAs "info:lc/vocabulary/countries/ho",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ho,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/ncho,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [sv] Swan Islands before 1978-01"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ho",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Honduras"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "HN",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "HONDURAS"}
                                            {:rdf/language "en",
                                             :rdf/value    "HONDURAS"}]}})

(def ht
  "Haiti"
  {:db/ident :loc.countries/ht,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Haiti"},
   :madsrdf/code "ht",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwht,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "HAÏTI"}
                                  {:rdf/language "en",
                                   :rdf/value    "HAITI"}],
                                 :madsrdf/code "HT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ht",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ht,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwht,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ht",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Haiti"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "HT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "HAÏTI"}
                                            {:rdf/language "en",
                                             :rdf/value    "HAITI"}]}})

(def hu
  "Hungary"
  {:db/ident :loc.countries/hu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Hungary"},
   :madsrdf/code "hu",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-hu,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "HONGRIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "HUNGARY"}],
                                 :madsrdf/code "HU",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/hu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/hu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-hu,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "hu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Hungary"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "HU",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "HONGRIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "HUNGARY"}]}})

(def iau
  "Iowa"
  {:db/ident :loc.countries/iau,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Iowa"},
   :madsrdf/code "iau",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ia,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/iau",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/iau,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ia,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "iau",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Iowa"}})

(def ic
  "Iceland"
  {:db/ident :loc.countries/ic,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Iceland"},
   :madsrdf/code "ic",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-ic,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ISLANDE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ICELAND"}],
                                 :madsrdf/code "IS",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ic",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ic,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-ic,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ic",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Iceland"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "IS",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ISLANDE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ICELAND"}]}})

(def idu
  "Idaho"
  {:db/ident :loc.countries/idu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Idaho"},
   :madsrdf/code "idu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-id,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/idu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/idu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-id,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "idu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Idaho"}})

(def ie
  "Ireland"
  {:db/ident :loc.countries/ie,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Ireland"},
   :madsrdf/code "ie",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority [:loc.authorities/sh85067964concept
                                       :loc.geographicAreas/e-ie],
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "IRLANDE"}
                                  {:rdf/language "en",
                                   :rdf/value    "IRELAND"}],
                                 :madsrdf/code "IE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Eire"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ie",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Eire"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ie,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch [:loc.authorities/sh85067964concept
                     :loc.geographicAreas/e-ie],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ie",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Ireland"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "IE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "IRLANDE"}
                                            {:rdf/language "en",
                                             :rdf/value    "IRELAND"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Eire"}}})

(def ii
  "India"
  {:db/ident :loc.countries/ii,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "India"},
   :madsrdf/code "ii",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ii,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "INDE"}
                                  {:rdf/language "en",
                                   :rdf/value    "INDIA"}],
                                 :madsrdf/code "IN",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Minicoy Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Amindivi Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Goa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Diu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Laccadive Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Daman"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Andaman Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Nicobar Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [sk] Sikkim before 1978-01"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/sk,
   :owl/sameAs "info:lc/vocabulary/countries/ii",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Andaman Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Laccadive Island"}
                   {:rdf/language "en",
                    :rdf/value    "Diu"}
                   {:rdf/language "en",
                    :rdf/value    "Nicobar Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Goa"}
                   {:rdf/language "en",
                    :rdf/value    "Minicoy Island"}
                   {:rdf/language "en",
                    :rdf/value    "Amindivi Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Daman"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ii,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ii,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [sk] Sikkim before 1978-01"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ii",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "India"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "IN",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "INDE"}
                                            {:rdf/language "en",
                                             :rdf/value    "INDIA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Daman"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Minicoy Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nicobar Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Andaman Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Laccadive Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Amindivi Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Goa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Diu"}}]})

(def ilu
  "Illinois"
  {:db/ident :loc.countries/ilu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Illinois"},
   :madsrdf/code "ilu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-il,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ilu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ilu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-il,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ilu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Illinois"}})

(def im
  "Isle of Man"
  {:db/ident :loc.countries/im,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Isle of Man"},
   :madsrdf/code "im",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-im,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ÎLE DE MAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "ISLE OF MAN"}],
                                 :madsrdf/code "IM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Calf of Man"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [uik] United Kingdom Misc. Islands before 2018-04"}
    {:rdf/language "en",
     :rdf/value    "Coded [uik] Isle of Man before 2018-04"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/uik,
   :owl/sameAs "info:lc/vocabulary/countries/im",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Calf of Man"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/im,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-im,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [uik] United Kingdom Misc. Islands before 2018-04"}
    {:rdf/language "en",
     :rdf/value    "Coded [uik] Isle of Man before 2018-04"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "im",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Isle of Man"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "IM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ÎLE DE MAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "ISLE OF MAN"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Calf of Man"}}})

(def inu
  "Indiana"
  {:db/ident :loc.countries/inu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Indiana"},
   :madsrdf/code "inu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-in,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/inu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/inu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-in,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "inu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Indiana"}})

(def io
  "Indonesia"
  {:db/ident :loc.countries/io,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Indonesia"},
   :madsrdf/code "io",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-io,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "INDONÉSIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "INDONESIA"}],
                                 :madsrdf/code "ID",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Netherlands New Guinea"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Irian Barat"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "West New Guinea"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/io",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Netherlands New Guinea"}
                   {:rdf/language "en",
                    :rdf/value    "Irian Barat"}
                   {:rdf/language "en",
                    :rdf/value    "West New Guinea"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/io,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-io,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "io",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Indonesia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ID",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "INDONÉSIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "INDONESIA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Irian Barat"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "West New Guinea"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Netherlands New Guinea"}}]})

(def iq
  "Iraq"
  {:db/ident :loc.countries/iq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Iraq"},
   :madsrdf/code "iq",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-iq,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "IRAQ"}
                                  {:rdf/language "en",
                                   :rdf/value    "IRAQ"}],
                                 :madsrdf/code "IQ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/iq",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/iq,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-iq,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "iq",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Iraq"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "IQ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "IRAQ"}
                                            {:rdf/language "en",
                                             :rdf/value    "IRAQ"}]}})

(def ir
  "Iran"
  {:db/ident :loc.countries/ir,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Iran"},
   :madsrdf/code "ir",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ir,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ir",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ir,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ir,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ir",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Iran"}})

(def is
  "Israel"
  {:db/ident :loc.countries/is,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Israel"},
   :madsrdf/code "is",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-is,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ISRAËL"}
                                  {:rdf/language "en",
                                   :rdf/value    "ISRAEL"}],
                                 :madsrdf/code "IL",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value "Coded [iw] Israel-Jordan Demilitarized Zones before 1978-01"}
    {:rdf/language "en",
     :rdf/value "Coded [iu] Israel-Syria Demilitarized Zones before 1978-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/iw :loc.countries/iu],
   :owl/sameAs "info:lc/vocabulary/countries/is",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/is,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-is,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value "Coded [iw] Israel-Jordan Demilitarized Zones before 1978-01"}
    {:rdf/language "en",
     :rdf/value "Coded [iu] Israel-Syria Demilitarized Zones before 1978-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "is",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Israel"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "IL",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ISRAËL"}
                                            {:rdf/language "en",
                                             :rdf/value    "ISRAEL"}]}})

(def it
  "Italy"
  {:db/ident :loc.countries/it,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Italy"},
   :madsrdf/code "it",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-it,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ITALIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ITALY"}],
                                 :madsrdf/code "IT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Pantelleria"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sardinia"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sicily"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/it",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Sardinia"}
                   {:rdf/language "en",
                    :rdf/value    "Pantelleria"}
                   {:rdf/language "en",
                    :rdf/value    "Sicily"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/it,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-it,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "it",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Italy"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "IT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ITALIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ITALY"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pantelleria"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sicily"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sardinia"}}]})

(def iv
  "Côte d'Ivoire"
  {:db/ident :loc.countries/iv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Côte d'Ivoire"},
   :madsrdf/code "iv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-iv,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CÔTE D'IVOIRE"}
                                  {:rdf/language "en",
                                   :rdf/value    "CÔTE D'IVOIRE"}],
                                 :madsrdf/code "CI",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Ivory Coast"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/iv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Ivory Coast"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/iv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-iv,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "iv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Côte d'Ivoire"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CI",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CÔTE D'IVOIRE"}
                                            {:rdf/language "en",
                                             :rdf/value    "CÔTE D'IVOIRE"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Ivory Coast"}}})

(def iy
  "Iraq-Saudi Arabia Neutral Zone"
  {:db/ident :loc.countries/iy,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Iraq-Saudi Arabia Neutral Zone"},
   :madsrdf/code "iy",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/iy",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/iy,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "iy",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Iraq-Saudi Arabia Neutral Zone"}})

(def ja
  "Japan"
  {:db/ident :loc.countries/ja,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Japan"},
   :madsrdf/code "ja",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ja,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "JAPON"}
                                  {:rdf/language "en",
                                   :rdf/value    "JAPAN"}],
                                 :madsrdf/code "JP",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Namposhoto (Northern)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Nishinoshima Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ryukyu Islands, Northern"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Volcano Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Marcus Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Namposhoto (Southern)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Bonin Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Parece Vela Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value
                          "Coded [ry] Ryukyu Islands, Southern before 1978-01"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [ry] Daitojima before 1978-01"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [ry] Okinawa before 1978-01"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [ry] Torishima before 1978-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/ry,
   :owl/sameAs "info:lc/vocabulary/countries/ja",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Bonin Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Parece Vela Island"}
                   {:rdf/language "en",
                    :rdf/value    "Namposhoto (Southern)"}
                   {:rdf/language "en",
                    :rdf/value    "Marcus Island"}
                   {:rdf/language "en",
                    :rdf/value    "Volcano Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Namposhoto (Northern)"}
                   {:rdf/language "en",
                    :rdf/value    "Nishinoshima Island"}
                   {:rdf/language "en",
                    :rdf/value    "Ryukyu Islands, Northern"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ja,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ja,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [ry] Okinawa before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ry] Torishima before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ry] Daitojima before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value
                       "Coded [ry] Ryukyu Islands, Southern before 1978-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ja",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Japan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "JP",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "JAPON"}
                                            {:rdf/language "en",
                                             :rdf/value    "JAPAN"}]},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Parece Vela Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Volcano Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Namposhoto (Northern)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Marcus Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Bonin Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ryukyu Islands, Northern"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Nishinoshima Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Namposhoto (Southern)"}}]})

(def je
  "Jersey"
  {:db/ident :loc.countries/je,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Jersey"},
   :madsrdf/code "je",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-je,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "JERSEY"}
                                  {:rdf/language "en",
                                   :rdf/value    "JERSEY"}],
                                 :madsrdf/code "JE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Channel Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Jersey (Island)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [uik] United Kingdom Misc. Islands before 2018-04"}
    {:rdf/language "en",
     :rdf/value    "Coded [uik] Jersey before 2018-04"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/uik,
   :owl/sameAs "info:lc/vocabulary/countries/je",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Jersey (Island)"}
                   {:rdf/language "en",
                    :rdf/value    "Channel Islands"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/je,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-je,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [uik] United Kingdom Misc. Islands before 2018-04"}
    {:rdf/language "en",
     :rdf/value    "Coded [uik] Jersey before 2018-04"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "je",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Jersey"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "JE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "JERSEY"}
                                            {:rdf/language "en",
                                             :rdf/value    "JERSEY"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Channel Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Jersey (Island)"}}]})

(def ji
  "Johnston Atoll"
  {:db/ident :loc.countries/ji,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Johnston Atoll"},
   :madsrdf/code "ji",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh90005900concept,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Sand Island"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ji",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Sand Island"},
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ji,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh90005900concept,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ji",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Johnston Atoll"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Sand Island"}}})

(def jm
  "Jamaica"
  {:db/ident :loc.countries/jm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Jamaica"},
   :madsrdf/code "jm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwjm,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "JAMAÏQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "JAMAICA"}],
                                 :madsrdf/code "JM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Pedro Cays"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Morant Cays"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/jm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Pedro Cays"}
                   {:rdf/language "en",
                    :rdf/value    "Morant Cays"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/jm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwjm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "jm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Jamaica"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "JM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "JAMAÏQUE"}
                                            {:rdf/language "en",
                                             :rdf/value    "JAMAICA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Morant Cays"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pedro Cays"}}]})

(def jo
  "Jordan"
  {:db/ident :loc.countries/jo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Jordan"},
   :madsrdf/code "jo",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-jo,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "JORDANIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "JORDAN"}],
                                 :madsrdf/code "JO",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/jo",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/jo,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-jo,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "jo",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Jordan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "JO",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "JORDANIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "JORDAN"}]}})

(def ke
  "Kenya"
  {:db/ident :loc.countries/ke,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Kenya"},
   :madsrdf/code "ke",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ke,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "KENYA"}
                                  {:rdf/language "en",
                                   :rdf/value    "KENYA"}],
                                 :madsrdf/code "KE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ke",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ke,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ke,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ke",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Kenya"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "KE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "KENYA"}
                                            {:rdf/language "en",
                                             :rdf/value    "KENYA"}]}})

(def kg
  "Kyrgyzstan"
  {:db/ident :loc.countries/kg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Kyrgyzstan"},
   :madsrdf/code "kg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-kg,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "KIRGHIZISTAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "KYRGYZSTAN"}],
                                 :madsrdf/code "KG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "Coded [kgr] Kirghizia before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value
                          "Coded [kgr] Kirghiz S.S.R. before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [xxr] Soviet Union before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [ur] Soviet Union before 1988-03"}
                         {:rdf/language "en",
                          :rdf/value "Coded [kgr] Kyrgyzstan before 1992-06"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/kgr :loc.countries/ur :loc.countries/xxr],
   :owl/sameAs "info:lc/vocabulary/countries/kg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/kg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-kg,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [kgr] Kirghizia before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [kgr] Kyrgyzstan before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
                      {:rdf/language "en",
                       :rdf/value "Coded [kgr] Kirghiz S.S.R. before 1992-06"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "kg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Kyrgyzstan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "KG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "KIRGHIZISTAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "KYRGYZSTAN"}]}})

(def kn
  "Korea (North)"
  {:db/ident :loc.countries/kn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Korea (North)"},
   :madsrdf/code "kn",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-kn,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "North Korea"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel
                         {:rdf/language "en",
                          :rdf/value "Democratic People's Republic of Korea"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/kn",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "North Korea"}
                   {:rdf/language "en",
                    :rdf/value    "Democratic People's Republic of Korea"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/kn,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-kn,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "kn",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Korea (North)"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      {:rdf/language "en",
                       :rdf/value    "Democratic People's Republic of Korea"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "North Korea"}}]})

(def ko
  "Korea (South)"
  {:db/ident :loc.countries/ko,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Korea (South)"},
   :madsrdf/code "ko",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ko,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "South Korea"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Korea, Republic of"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ko",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Korea, Republic of"}
                   {:rdf/language "en",
                    :rdf/value    "South Korea"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ko,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ko,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ko",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Korea (South)"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Korea, Republic of"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "South Korea"}}]})

(def ksu
  "Kansas"
  {:db/ident :loc.countries/ksu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Kansas"},
   :madsrdf/code "ksu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ks,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ksu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ksu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ks,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ksu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Kansas"}})

(def ku
  "Kuwait"
  {:db/ident :loc.countries/ku,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Kuwait"},
   :madsrdf/code "ku",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "KOWEÏT"}
                                  {:rdf/language "en",
                                   :rdf/value    "KUWAIT"}],
                                 :madsrdf/code "KW",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ku",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ku,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ku",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Kuwait"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "KW",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "KOWEÏT"}
                                            {:rdf/language "en",
                                             :rdf/value    "KUWAIT"}]}})

(def kv
  "Kosovo"
  {:db/ident :loc.countries/kv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Kosovo"},
   :madsrdf/code "kv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-kv,
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "Coded [rb] for Serbia from February 2007-May 2008. From 1992-April 2007 it was\r\n               coded [yu] for Serbia and Montenegro"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/kv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/kv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-kv,
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "Coded [rb] for Serbia from February 2007-May 2008. From 1992-April 2007 it was coded [yu] for Serbia and Montenegro"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "kv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Kosovo"}})

(def kyu
  "Kentucky"
  {:db/ident :loc.countries/kyu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Kentucky"},
   :madsrdf/code "kyu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/kyu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/kyu,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "kyu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Kentucky"}})

(def kz
  "Kazakhstan"
  {:db/ident :loc.countries/kz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Kazakhstan"},
   :madsrdf/code "kz",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-kz,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "KAZAKHSTAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "KAZAKHSTAN"}],
                                 :madsrdf/code "KZ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value "Coded [kzr] Kazakh S.S.R. before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [xxr] Soviet Union before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [kzr] Kazakhstan before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [ur] Soviet Union before 1988-03"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/xxr :loc.countries/kzr :loc.countries/ur],
   :owl/sameAs "info:lc/vocabulary/countries/kz",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/kz,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-kz,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [kzr] Kazakhstan before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
                      {:rdf/language "en",
                       :rdf/value "Coded [kzr] Kazakh S.S.R. before 1992-06"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "kz",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Kazakhstan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "KZ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "KAZAKHSTAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "KAZAKHSTAN"}]}})

(def lau
  "Louisiana"
  {:db/ident :loc.countries/lau,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Louisiana"},
   :madsrdf/code "lau",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-la,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/lau",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/lau,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-la,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "lau",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Louisiana"}})

(def lb
  "Liberia"
  {:db/ident :loc.countries/lb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Liberia"},
   :madsrdf/code "lb",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-lb,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "LIBÉRIA"}
                                  {:rdf/language "en",
                                   :rdf/value    "LIBERIA"}],
                                 :madsrdf/code "LR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/lb",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/lb,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-lb,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "lb",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Liberia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "LR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "LIBÉRIA"}
                                            {:rdf/language "en",
                                             :rdf/value    "LIBERIA"}]}})

(def le
  "Lebanon"
  {:db/ident :loc.countries/le,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Lebanon"},
   :madsrdf/code "le",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-le,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "LIBAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "LEBANON"}],
                                 :madsrdf/code "LB",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/le",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/le,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-le,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "le",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Lebanon"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "LB",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "LIBAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "LEBANON"}]}})

(def lh
  "Liechtenstein"
  {:db/ident :loc.countries/lh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Liechtenstein"},
   :madsrdf/code "lh",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-lh,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "LIECHTENSTEIN"}
                                  {:rdf/language "en",
                                   :rdf/value    "LIECHTENSTEIN"}],
                                 :madsrdf/code "LI",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/lh",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/lh,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-lh,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "lh",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Liechtenstein"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "LI",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "LIECHTENSTEIN"}
                                            {:rdf/language "en",
                                             :rdf/value    "LIECHTENSTEIN"}]}})

(def li
  "Lithuania"
  {:db/ident :loc.countries/li,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Lithuania"},
   :madsrdf/code "li",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-li,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "LITUANIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "LITHUANIA"}],
                                 :madsrdf/code "LT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [lir] Lithuania before 1992-06"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/lir,
   :owl/sameAs "info:lc/vocabulary/countries/li",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/li,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-li,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [lir] Lithuania before 1992-06"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "li",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Lithuania"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "LT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "LITUANIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "LITHUANIA"}]}})

(def lo
  "Lesotho"
  {:db/ident :loc.countries/lo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Lesotho"},
   :madsrdf/code "lo",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-lo,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "LESOTHO"}
                                  {:rdf/language "en",
                                   :rdf/value    "LESOTHO"}],
                                 :madsrdf/code "LS",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Basutoland"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/lo",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Basutoland"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/lo,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-lo,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "lo",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Lesotho"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "LS",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "LESOTHO"}
                                            {:rdf/language "en",
                                             :rdf/value    "LESOTHO"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Basutoland"}}})

(def ls
  "Laos"
  {:db/ident :loc.countries/ls,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Laos"},
   :madsrdf/code "ls",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ls,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ls",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ls,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ls,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ls",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Laos"}})

(def lu
  "Luxembourg"
  {:db/ident :loc.countries/lu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Luxembourg"},
   :madsrdf/code "lu",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-lu,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "LUXEMBOURG"}
                                  {:rdf/language "en",
                                   :rdf/value    "LUXEMBOURG"}],
                                 :madsrdf/code "LU",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/lu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/lu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-lu,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "lu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Luxembourg"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "LU",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "LUXEMBOURG"}
                                            {:rdf/language "en",
                                             :rdf/value    "LUXEMBOURG"}]}})

(def lv
  "Latvia"
  {:db/ident :loc.countries/lv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Latvia"},
   :madsrdf/code "lv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-lv,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "LETTONIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "LATVIA"}],
                                 :madsrdf/code "LV",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [lvr] Latvia before 1992-06"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/lvr,
   :owl/sameAs "info:lc/vocabulary/countries/lv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/lv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-lv,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [lvr] Latvia before 1992-06"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "lv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Latvia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "LV",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "LETTONIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "LATVIA"}]}})

(def ly
  "Libya"
  {:db/ident :loc.countries/ly,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Libya"},
   :madsrdf/code "ly",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ly,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ly",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ly,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ly,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ly",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Libya"}})

(def mau
  "Massachusetts"
  {:db/ident :loc.countries/mau,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Massachusetts"},
   :madsrdf/code "mau",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ma,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mau",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mau,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ma,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mau",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Massachusetts"}})

(def mbc
  "Manitoba"
  {:db/ident :loc.countries/mbc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Manitoba"},
   :madsrdf/code "mbc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-mb,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mbc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mbc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-mb,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mbc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Manitoba"}})

(def mc
  "Monaco"
  {:db/ident :loc.countries/mc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Monaco"},
   :madsrdf/code "mc",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-mc,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MONACO"}
                                  {:rdf/language "en",
                                   :rdf/value    "MONACO"}],
                                 :madsrdf/code "MC",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-mc,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Monaco"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MC",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MONACO"}
                                            {:rdf/language "en",
                                             :rdf/value    "MONACO"}]}})

(def mdu
  "Maryland"
  {:db/ident :loc.countries/mdu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Maryland"},
   :madsrdf/code "mdu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-md,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mdu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mdu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-md,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mdu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Maryland"}})

(def meu
  "Maine"
  {:db/ident :loc.countries/meu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Maine"},
   :madsrdf/code "meu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-me,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/meu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/meu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-me,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "meu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Maine"}})

(def mf
  "Mauritius"
  {:db/ident :loc.countries/mf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mauritius"},
   :madsrdf/code "mf",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-mf,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MAURICE"}
                                  {:rdf/language "en",
                                   :rdf/value    "MAURITIUS"}],
                                 :madsrdf/code "MU",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Agalega Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Saint Brandon"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Rodrigues Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Cargados Carajos Shoals"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mf",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Rodrigues Island"}
                   {:rdf/language "en",
                    :rdf/value    "Saint Brandon"}
                   {:rdf/language "en",
                    :rdf/value    "Cargados Carajos Shoals"}
                   {:rdf/language "en",
                    :rdf/value    "Agalega Islands"}],
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mf,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-mf,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mf",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mauritius"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MU",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MAURICE"}
                                            {:rdf/language "en",
                                             :rdf/value    "MAURITIUS"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Agalega Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Rodrigues Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Saint Brandon"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Cargados Carajos Shoals"}}]})

(def mg
  "Madagascar"
  {:db/ident :loc.countries/mg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Madagascar"},
   :madsrdf/code "mg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-mg,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MADAGASCAR"}
                                  {:rdf/language "en",
                                   :rdf/value    "MADAGASCAR"}],
                                 :madsrdf/code "MG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value "Malagasy Republic"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Malagasy Republic"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-mg,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Madagascar"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MADAGASCAR"}
                                            {:rdf/language "en",
                                             :rdf/value    "MADAGASCAR"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Malagasy Republic"}}})

(def miu
  "Michigan"
  {:db/ident :loc.countries/miu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Michigan"},
   :madsrdf/code "miu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-mi,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/miu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/miu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-mi,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "miu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Michigan"}})

(def mj
  "Montserrat"
  {:db/ident :loc.countries/mj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Montserrat"},
   :madsrdf/code "mj",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwmj,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MONTSERRAT"}
                                  {:rdf/language "en",
                                   :rdf/value    "MONTSERRAT"}],
                                 :madsrdf/code "MS",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mj",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mj,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwmj,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mj",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Montserrat"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MS",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MONTSERRAT"}
                                            {:rdf/language "en",
                                             :rdf/value    "MONTSERRAT"}]}})

(def mk
  "Oman"
  {:db/ident :loc.countries/mk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Oman"},
   :madsrdf/code "mk",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-mk,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "OMAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "OMAN"}],
                                 :madsrdf/code "OM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Kuria Muria Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Muscat and Oman"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Kuria Muria Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Muscat and Oman"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mk,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-mk,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Oman"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "OM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "OMAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "OMAN"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kuria Muria Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Muscat and Oman"}}]})

(def ml
  "Mali"
  {:db/ident :loc.countries/ml,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mali"},
   :madsrdf/code "ml",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ml,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MALI"}
                                  {:rdf/language "en",
                                   :rdf/value    "MALI"}],
                                 :madsrdf/code "ML",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sudan, French"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "French Sudan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Soudan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ml",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Soudan"}
                   {:rdf/language "en",
                    :rdf/value    "Sudan, French"}
                   {:rdf/language "en",
                    :rdf/value    "French Sudan"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ml,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ml,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ml",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mali"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ML",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MALI"}
                                            {:rdf/language "en",
                                             :rdf/value    "MALI"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "French Sudan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Soudan"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sudan, French"}}]})

(def mm
  "Malta"
  {:db/ident :loc.countries/mm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Malta"},
   :madsrdf/code "mm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-mm,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MALTE"}
                                  {:rdf/language "en",
                                   :rdf/value    "MALTA"}],
                                 :madsrdf/code "MT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Comino Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Gozo Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Comino Island"}
                   {:rdf/language "en",
                    :rdf/value    "Gozo Island"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-mm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Malta"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MALTE"}
                                            {:rdf/language "en",
                                             :rdf/value    "MALTA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Gozo Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Comino Island"}}]})

(def mnu
  "Minnesota"
  {:db/ident :loc.countries/mnu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Minnesota"},
   :madsrdf/code "mnu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-mn,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mnu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mnu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-mn,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mnu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Minnesota"}})

(def mo
  "Montenegro"
  {:db/ident :loc.countries/mo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Montenegro"},
   :madsrdf/code "mo",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-mo,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MONTÉNÉGRO"}
                                  {:rdf/language "en",
                                   :rdf/value    "MONTENEGRO"}],
                                 :madsrdf/code "ME",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [yu] for Serbia and Montenegro from 1992-April 2007"}
    {:rdf/language "en",
     :rdf/value    "Coded [yu] Yugoslavia before 1992-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/yu,
   :owl/sameAs "info:lc/vocabulary/countries/mo",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mo,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-mo,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [yu] for Serbia and Montenegro from 1992-April 2007"}
    {:rdf/language "en",
     :rdf/value    "Coded [yu] Yugoslavia before 1992-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mo",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Montenegro"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ME",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MONTÉNÉGRO"}
                                            {:rdf/language "en",
                                             :rdf/value    "MONTENEGRO"}]}})

(def mou
  "Missouri"
  {:db/ident :loc.countries/mou,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Missouri"},
   :madsrdf/code "mou",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-mo,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mou",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mou,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-mo,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mou",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Missouri"}})

(def mp
  "Mongolia"
  {:db/ident :loc.countries/mp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mongolia"},
   :madsrdf/code "mp",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-mp,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MONGOLIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "MONGOLIA"}],
                                 :madsrdf/code "MN",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Outer Mongolia"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Mongolian People's Republic"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mp",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Outer Mongolia"}
                   {:rdf/language "en",
                    :rdf/value    "Mongolian People's Republic"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mp,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-mp,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mp",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mongolia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MN",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MONGOLIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "MONGOLIA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Mongolian People's Republic"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Outer Mongolia"}}]})

(def mq
  "Martinique"
  {:db/ident :loc.countries/mq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Martinique"},
   :madsrdf/code "mq",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwmq,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MARTINIQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "MARTINIQUE"}],
                                 :madsrdf/code "MQ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mq",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mq,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwmq,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mq",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Martinique"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MQ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MARTINIQUE"}
                                            {:rdf/language "en",
                                             :rdf/value    "MARTINIQUE"}]}})

(def mr
  "Morocco"
  {:db/ident :loc.countries/mr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Morocco"},
   :madsrdf/code "mr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-mr,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MAROC"}
                                  {:rdf/language "en",
                                   :rdf/value    "MOROCCO"}],
                                 :madsrdf/code "MA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Spanish Morocco"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "French Morocco"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ifni"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel
                         {:rdf/language "en",
                          :rdf/value "Zona Sur del Protectorado de Marruecos"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tangier Zone"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Zona Sur del Protectorado de Marruecos"}
                   {:rdf/language "en",
                    :rdf/value    "French Morocco"}
                   {:rdf/language "en",
                    :rdf/value    "Tangier Zone"}
                   {:rdf/language "en",
                    :rdf/value    "Spanish Morocco"}
                   {:rdf/language "en",
                    :rdf/value    "Ifni"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mr,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-mr,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Morocco"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MAROC"}
                                            {:rdf/language "en",
                                             :rdf/value    "MOROCCO"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ifni"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "French Morocco"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      {:rdf/language "en",
                       :rdf/value    "Zona Sur del Protectorado de Marruecos"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Spanish Morocco"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tangier Zone"}}]})

(def msu
  "Mississippi"
  {:db/ident :loc.countries/msu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mississippi"},
   :madsrdf/code "msu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ms,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/msu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/msu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ms,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "msu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mississippi"}})

(def mtu
  "Montana"
  {:db/ident :loc.countries/mtu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Montana"},
   :madsrdf/code "mtu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-mt,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mtu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mtu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-mt,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mtu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Montana"}})

(def mu
  "Mauritania"
  {:db/ident :loc.countries/mu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mauritania"},
   :madsrdf/code "mu",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-mu,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MAURITANIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "MAURITANIA"}],
                                 :madsrdf/code "MR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-mu,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mauritania"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MAURITANIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "MAURITANIA"}]}})

(def mv
  "Moldova"
  {:db/ident :loc.countries/mv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Moldova"},
   :madsrdf/code "mv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-mv,
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value "Coded [xxr] Soviet Union before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value
                          "Coded [mvr] Moldavian S.S.R. before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [ur] Soviet Union before 1988-03"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [mvr] Moldova before 1992-06"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/xxr :loc.countries/mvr :loc.countries/ur],
   :owl/sameAs "info:lc/vocabulary/countries/mv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-mv,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value "Coded [mvr] Moldavian S.S.R. before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [mvr] Moldova before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Moldova"}})

(def mw
  "Malawi"
  {:db/ident :loc.countries/mw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Malawi"},
   :madsrdf/code "mw",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-mw,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MALAWI"}
                                  {:rdf/language "en",
                                   :rdf/value    "MALAWI"}],
                                 :madsrdf/code "MW",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Nyasaland"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mw",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Nyasaland"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mw,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-mw,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mw",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Malawi"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MW",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MALAWI"}
                                            {:rdf/language "en",
                                             :rdf/value    "MALAWI"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Nyasaland"}}})

(def mx
  "Mexico"
  {:db/ident :loc.countries/mx,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mexico"},
   :madsrdf/code "mx",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-mx,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MEXIQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "MEXICO"}],
                                 :madsrdf/code "MX",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Islas de Revillagigedo"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Revillagigedo, Islas de"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mx",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Islas de Revillagigedo"}
                   {:rdf/language "en",
                    :rdf/value    "Revillagigedo, Islas de"}],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mx,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-mx,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mx",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mexico"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MX",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MEXIQUE"}
                                            {:rdf/language "en",
                                             :rdf/value    "MEXICO"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Islas de Revillagigedo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Revillagigedo, Islas de"}}]})

(def my
  "Malaysia"
  {:db/ident :loc.countries/my,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Malaysia"},
   :madsrdf/code "my",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority [:loc.authorities/sh85080109concept
                                       :loc.geographicAreas/a-my],
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MALAISIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "MALAYSIA"}],
                                 :madsrdf/code "MY",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sarawak"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sabah"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Borneo, North"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "North Borneo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Malaya"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/my",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "North Borneo"}
                   {:rdf/language "en",
                    :rdf/value    "Sarawak"}
                   {:rdf/language "en",
                    :rdf/value    "Borneo, North"}
                   {:rdf/language "en",
                    :rdf/value    "Sabah"}
                   {:rdf/language "en",
                    :rdf/value    "Malaya"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/my,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch [:loc.geographicAreas/a-my
                     :loc.authorities/sh85080109concept],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "my",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Malaysia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MY",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MALAISIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "MALAYSIA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "North Borneo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sarawak"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Malaya"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sabah"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Borneo, North"}}]})

(def mz
  "Mozambique"
  {:db/ident :loc.countries/mz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mozambique"},
   :madsrdf/code "mz",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-mz,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MOZAMBIQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "MOZAMBIQUE"}],
                                 :madsrdf/code "MZ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/mz",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/mz,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-mz,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "mz",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mozambique"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MZ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MOZAMBIQUE"}
                                            {:rdf/language "en",
                                             :rdf/value    "MOZAMBIQUE"}]}})

(def nbu
  "Nebraska"
  {:db/ident :loc.countries/nbu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Nebraska"},
   :madsrdf/code "nbu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-nb,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nbu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nbu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-nb,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nbu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Nebraska"}})

(def ncu
  "North Carolina"
  {:db/ident :loc.countries/ncu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "North Carolina"},
   :madsrdf/code "ncu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-nc,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ncu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ncu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-nc,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ncu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "North Carolina"}})

(def ndu
  "North Dakota"
  {:db/ident :loc.countries/ndu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "North Dakota"},
   :madsrdf/code "ndu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-nd,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ndu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ndu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-nd,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ndu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "North Dakota"}})

(def ne
  "Netherlands"
  {:db/ident :loc.countries/ne,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Netherlands"},
   :madsrdf/code "ne",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-ne,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PAYS-BAS"}
                                  {:rdf/language "en",
                                   :rdf/value    "NETHERLANDS"}],
                                 :madsrdf/code "NL",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Holland"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ne",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Holland"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ne,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-ne,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ne",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Netherlands"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NL",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "PAYS-BAS"}
                                            {:rdf/language "en",
                                             :rdf/value    "NETHERLANDS"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Holland"}}})

(def nfc
  "Newfoundland and Labrador"
  {:db/ident :loc.countries/nfc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Newfoundland and Labrador"},
   :madsrdf/code "nfc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-nf,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Newfoundland"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Labrador"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nfc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Newfoundland"}
                   {:rdf/language "en",
                    :rdf/value    "Labrador"}],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nfc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-nf,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nfc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Newfoundland and Labrador"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Newfoundland"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Labrador"}}]})

(def ng
  "Niger"
  {:db/ident :loc.countries/ng,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Niger"},
   :madsrdf/code "ng",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ng,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NIGER"}
                                  {:rdf/language "en",
                                   :rdf/value    "NIGER"}],
                                 :madsrdf/code "NE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ng",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ng,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ng,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ng",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Niger"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NIGER"}
                                            {:rdf/language "en",
                                             :rdf/value    "NIGER"}]}})

(def nhu
  "New Hampshire"
  {:db/ident :loc.countries/nhu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "New Hampshire"},
   :madsrdf/code "nhu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-nh,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nhu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nhu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-nh,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nhu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "New Hampshire"}})

(def nik
  "Northern Ireland"
  {:db/ident :loc.countries/nik,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Northern Ireland"},
   :madsrdf/code "nik",
   :madsrdf/hasBroaderAuthority :loc.countries/xxk,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-uk-ni,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value "Ireland, Northern"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nik",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Ireland, Northern"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/broader :loc.countries/xxk,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nik,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-uk-ni,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nik",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Northern Ireland"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Ireland, Northern"}}})

(def nju
  "New Jersey"
  {:db/ident :loc.countries/nju,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "New Jersey"},
   :madsrdf/code "nju",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-nj,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nju",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nju,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-nj,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nju",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "New Jersey"}})

(def nkc
  "New Brunswick"
  {:db/ident :loc.countries/nkc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "New Brunswick"},
   :madsrdf/code "nkc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-nk,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nkc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nkc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-nk,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nkc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "New Brunswick"}})

(def nl
  "New Caledonia"
  {:db/ident :loc.countries/nl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "New Caledonia"},
   :madsrdf/code "nl",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/ponl,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NOUVELLE-CALÉDONIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "NEW CALEDONIA"}],
                                 :madsrdf/code "NC",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ile Walpole"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Belep Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Walpole, Ile"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Chesterfield, Iles"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Isle of Pines (Pacific Ocean)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Uvea (New Caledonia)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Huon, Ile"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Loyalty Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pins, Ile des"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ile Huon"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pines, Isle of (Pacific Ocean)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ile Uvea (New Caledonia)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ile des Pins"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Iles Chesterfield"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Iles Belep"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nl",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Pins, Ile des"}
                   {:rdf/language "en",
                    :rdf/value    "Uvea (New Caledonia)"}
                   {:rdf/language "en",
                    :rdf/value    "Ile des Pins"}
                   {:rdf/language "en",
                    :rdf/value    "Ile Huon"}
                   {:rdf/language "en",
                    :rdf/value    "Chesterfield, Iles"}
                   {:rdf/language "en",
                    :rdf/value    "Loyalty Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Belep Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Ile Walpole"}
                   {:rdf/language "en",
                    :rdf/value    "Huon, Ile"}
                   {:rdf/language "en",
                    :rdf/value    "Iles Belep"}
                   {:rdf/language "en",
                    :rdf/value    "Pines, Isle of (Pacific Ocean)"}
                   {:rdf/language "en",
                    :rdf/value    "Ile Uvea (New Caledonia)"}
                   {:rdf/language "en",
                    :rdf/value    "Isle of Pines (Pacific Ocean)"}
                   {:rdf/language "en",
                    :rdf/value    "Walpole, Ile"}
                   {:rdf/language "en",
                    :rdf/value    "Iles Chesterfield"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nl,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/ponl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nl",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "New Caledonia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NC",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NOUVELLE-CALÉDONIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "NEW CALEDONIA"}]},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ile des Pins"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ile Walpole"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Belep Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Huon, Ile"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Iles Belep"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Pins, Ile des"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Chesterfield, Iles"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ile Huon"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Iles Chesterfield"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Loyalty Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Isle of Pines (Pacific Ocean)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ile Uvea (New Caledonia)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Uvea (New Caledonia)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Pines, Isle of (Pacific Ocean)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Walpole, Ile"}}]})

(def nmu
  "New Mexico"
  {:db/ident :loc.countries/nmu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "New Mexico"},
   :madsrdf/code "nmu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-nm,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nmu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nmu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-nm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nmu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "New Mexico"}})

(def nn
  "Vanuatu"
  {:db/ident :loc.countries/nn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Vanuatu"},
   :madsrdf/code "nn",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/ponn,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "VANUATU"}
                                  {:rdf/language "en",
                                   :rdf/value    "VANUATU"}],
                                 :madsrdf/code "VU",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Torres Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "New Hebrides"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Banks Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nn",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Banks Islands"}
                   {:rdf/language "en",
                    :rdf/value    "New Hebrides"}
                   {:rdf/language "en",
                    :rdf/value    "Torres Islands"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nn,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/ponn,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nn",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Vanuatu"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "VU",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "VANUATU"}
                                            {:rdf/language "en",
                                             :rdf/value    "VANUATU"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "New Hebrides"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Banks Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Torres Islands"}}]})

(def no
  "Norway"
  {:db/ident :loc.countries/no,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Norway"},
   :madsrdf/code "no",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NORVÈGE"}
                                  {:rdf/language "en",
                                   :rdf/value    "NORWAY"}],
                                 :madsrdf/code "NO",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Spitsbergen"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Bear Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value
                          "Coded [sb] Svalbard (Norway) before 1988-03"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [jn] Jan Mayen before 1988-03"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/sb :loc.countries/jn],
   :owl/sameAs "info:lc/vocabulary/countries/no",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Spitsbergen"}
                   {:rdf/language "en",
                    :rdf/value    "Bear Island"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/no,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [jn] Jan Mayen before 1988-03"}
                      {:rdf/language "en",
                       :rdf/value
                       "Coded [sb] Svalbard (Norway) before 1988-03"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "no",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Norway"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NO",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NORVÈGE"}
                                            {:rdf/language "en",
                                             :rdf/value    "NORWAY"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bear Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Spitsbergen"}}]})

(def np
  "Nepal"
  {:db/ident :loc.countries/np,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Nepal"},
   :madsrdf/code "np",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-np,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NÉPAL"}
                                  {:rdf/language "en",
                                   :rdf/value    "NEPAL"}],
                                 :madsrdf/code "NP",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/np",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/np,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-np,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "np",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Nepal"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NP",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NÉPAL"}
                                            {:rdf/language "en",
                                             :rdf/value    "NEPAL"}]}})

(def nq
  "Nicaragua"
  {:db/ident :loc.countries/nq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Nicaragua"},
   :madsrdf/code "nq",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nc,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/ncnq,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NICARAGUA"}
                                  {:rdf/language "en",
                                   :rdf/value    "NICARAGUA"}],
                                 :madsrdf/code "NI",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Corn Islands"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nq",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Corn Islands"},
   :skos/broadMatch :loc.geographicAreas/nc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nq,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/ncnq,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nq",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Nicaragua"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NI",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NICARAGUA"}
                                            {:rdf/language "en",
                                             :rdf/value    "NICARAGUA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Corn Islands"}}})

(def nr
  "Nigeria"
  {:db/ident :loc.countries/nr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Nigeria"},
   :madsrdf/code "nr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-nr,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NIGÉRIA"}
                                  {:rdf/language "en",
                                   :rdf/value    "NIGERIA"}],
                                 :madsrdf/code "NG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value
                                               "British Cameroons, Northern"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "British Cameroons, Northern"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nr,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-nr,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Nigeria"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NIGÉRIA"}
                                            {:rdf/language "en",
                                             :rdf/value    "NIGERIA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value
                                          "British Cameroons, Northern"}}})

(def nsc
  "Nova Scotia"
  {:db/ident :loc.countries/nsc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Nova Scotia"},
   :madsrdf/code "nsc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-ns,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nsc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nsc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-ns,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nsc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Nova Scotia"}})

(def ntc
  "Northwest Territories"
  {:db/ident :loc.countries/ntc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Northwest Territories"},
   :madsrdf/code "ntc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-nt,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ntc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ntc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-nt,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ntc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Northwest Territories"}})

(def nu
  "Nauru"
  {:db/ident :loc.countries/nu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Nauru"},
   :madsrdf/code "nu",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/ponu,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NAURU"}
                                  {:rdf/language "en",
                                   :rdf/value    "NAURU"}],
                                 :madsrdf/code "NR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/ponu,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Nauru"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NAURU"}
                                            {:rdf/language "en",
                                             :rdf/value    "NAURU"}]}})

(def nuc
  "Nunavut"
  {:db/ident :loc.countries/nuc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Nunavut"},
   :madsrdf/code "nuc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nuc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nuc,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nuc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Nunavut"}})

(def nvu
  "Nevada"
  {:db/ident :loc.countries/nvu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Nevada"},
   :madsrdf/code "nvu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-nv,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nvu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nvu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-nv,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nvu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Nevada"}})

(def nw
  "Northern Mariana Islands"
  {:db/ident :loc.countries/nw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Northern Mariana Islands"},
   :madsrdf/code "nw",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MARIANNES DU NORD, ÎLES"}
                                  {:rdf/language "en",
                                   :rdf/value    "NORTHERN MARIANA ISLANDS"}],
                                 :madsrdf/code "MP",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Asuncion Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Rota Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Saipan Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Aguijan Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Tinian Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Farallon de Pajaros Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Sarigan Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Mariana Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Pagan Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Anatahan Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Agrihan Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Maug Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Farallon de Medinilla Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Guguan Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Alamagan Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value "Coded [tt] Pacific Islands (Trust Territory) before 1988-03"}
    {:rdf/language "en",
     :rdf/value
     "Coded [tt] Trust Territory of the Pacific Islands before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [nm] Northern Mariana Islands before 1987-07"}
    {:rdf/language "en",
     :rdf/value    "Coded [tt] Northern Mariana Islands before 1985-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/tt :loc.countries/nm],
   :owl/sameAs "info:lc/vocabulary/countries/nw",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Pagan Island"}
                   {:rdf/language "en",
                    :rdf/value    "Mariana Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Saipan Island"}
                   {:rdf/language "en",
                    :rdf/value    "Rota Island"}
                   {:rdf/language "en",
                    :rdf/value    "Anatahan Island"}
                   {:rdf/language "en",
                    :rdf/value    "Guguan Island"}
                   {:rdf/language "en",
                    :rdf/value    "Alamagan Island"}
                   {:rdf/language "en",
                    :rdf/value    "Sarigan Island"}
                   {:rdf/language "en",
                    :rdf/value    "Agrihan Island"}
                   {:rdf/language "en",
                    :rdf/value    "Farallon de Pajaros Island"}
                   {:rdf/language "en",
                    :rdf/value    "Asuncion Island"}
                   {:rdf/language "en",
                    :rdf/value    "Aguijan Island"}
                   {:rdf/language "en",
                    :rdf/value    "Farallon de Medinilla Island"}
                   {:rdf/language "en",
                    :rdf/value    "Tinian Island"}
                   {:rdf/language "en",
                    :rdf/value    "Maug Islands"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nw,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [nm] Northern Mariana Islands before 1987-07"}
    {:rdf/language "en",
     :rdf/value    "Coded [tt] Northern Mariana Islands before 1985-01"}
    {:rdf/language "en",
     :rdf/value
     "Coded [tt] Trust Territory of the Pacific Islands before 1988-03"}
    {:rdf/language "en",
     :rdf/value "Coded [tt] Pacific Islands (Trust Territory) before 1988-03"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nw",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Northern Mariana Islands"},
   :skos/semanticRelation
   {:rdf/type       :skos/Concept,
    :skos/notation  "MP",
    :skos/note      "This is the ISO 3166 match",
    :skos/prefLabel [{:rdf/language "fr",
                      :rdf/value    "MARIANNES DU NORD, ÎLES"}
                     {:rdf/language "en",
                      :rdf/value    "NORTHERN MARIANA ISLANDS"}]},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Tinian Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Sarigan Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Guguan Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Maug Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Saipan Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Pagan Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Asuncion Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Anatahan Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Mariana Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Farallon de Medinilla Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Agrihan Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Alamagan Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Aguijan Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Rota Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Farallon de Pajaros Island"}}]})

(def nx
  "Norfolk Island"
  {:db/ident :loc.countries/nx,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Norfolk Island"},
   :madsrdf/code "nx",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nx",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nx,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nx",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Norfolk Island"}})

(def nyu
  "New York (State)"
  {:db/ident :loc.countries/nyu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "New York (State)"},
   :madsrdf/code "nyu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ny,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nyu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nyu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ny,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nyu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "New York (State)"}})

(def nz
  "New Zealand"
  {:db/ident :loc.countries/nz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "New Zealand"},
   :madsrdf/code "nz",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-nz,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NOUVELLE-ZÉLANDE"}
                                  {:rdf/language "en",
                                   :rdf/value    "NEW ZEALAND"}],
                                 :madsrdf/code "NZ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Chatham Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "South Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Stewart Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Kermadec Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "North Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/nz",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "North Island"}
                   {:rdf/language "en",
                    :rdf/value    "Chatham Islands"}
                   {:rdf/language "en",
                    :rdf/value    "South Island"}
                   {:rdf/language "en",
                    :rdf/value    "Stewart Island"}
                   {:rdf/language "en",
                    :rdf/value    "Kermadec Islands"}],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/nz,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-nz,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "nz",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "New Zealand"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NZ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NOUVELLE-ZÉLANDE"}
                                            {:rdf/language "en",
                                             :rdf/value    "NEW ZEALAND"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "North Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kermadec Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Chatham Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Stewart Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "South Island"}}]})

(def ohu
  "Ohio"
  {:db/ident :loc.countries/ohu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Ohio"},
   :madsrdf/code "ohu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ohu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ohu,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ohu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Ohio"}})

(def oku
  "Oklahoma"
  {:db/ident :loc.countries/oku,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Oklahoma"},
   :madsrdf/code "oku",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ok,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/oku",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/oku,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ok,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "oku",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Oklahoma"}})

(def onc
  "Ontario"
  {:db/ident :loc.countries/onc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Ontario"},
   :madsrdf/code "onc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-on,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/onc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/onc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-on,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "onc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Ontario"}})

(def oru
  "Oregon"
  {:db/ident :loc.countries/oru,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Oregon"},
   :madsrdf/code "oru",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-or,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/oru",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/oru,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-or,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "oru",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Oregon"}})

(def ot
  "Mayotte"
  {:db/ident :loc.countries/ot,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mayotte"},
   :madsrdf/code "ot",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-my,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MAYOTTE"}
                                  {:rdf/language "en",
                                   :rdf/value    "MAYOTTE"}],
                                 :madsrdf/code "YT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [cq] Mayotte before 1987-07"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/cq,
   :owl/sameAs "info:lc/vocabulary/countries/ot",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ot,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-my,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [cq] Mayotte before 1987-07"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ot",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mayotte"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "YT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MAYOTTE"}
                                            {:rdf/language "en",
                                             :rdf/value    "MAYOTTE"}]}})

(def pau
  "Pennsylvania"
  {:db/ident :loc.countries/pau,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Pennsylvania"},
   :madsrdf/code "pau",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-pa,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pau",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pau,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-pa,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pau",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Pennsylvania"}})

(def pc
  "Pitcairn Island"
  {:db/ident :loc.countries/pc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Pitcairn Island"},
   :madsrdf/code "pc",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/popc,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ducie Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Oeno Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Henderson Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Ducie Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Henderson Island"}
                   {:rdf/language "en",
                    :rdf/value    "Oeno Atoll"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/popc,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Pitcairn Island"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Oeno Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Henderson Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ducie Atoll"}}]})

(def pe
  "Peru"
  {:db/ident :loc.countries/pe,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Peru"},
   :madsrdf/code "pe",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-pe,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PÉROU"}
                                  {:rdf/language "en",
                                   :rdf/value    "PERU"}],
                                 :madsrdf/code "PE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pe",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pe,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-pe,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pe",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Peru"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "PÉROU"}
                                            {:rdf/language "en",
                                             :rdf/value    "PERU"}]}})

(def pf
  "Paracel Islands]"
  {:db/ident :loc.countries/pf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Paracel Islands]"},
   :madsrdf/code "pf",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pf",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pf,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pf",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Paracel Islands]"}})

(def pg
  "Guinea-Bissau"
  {:db/ident :loc.countries/pg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Guinea-Bissau"},
   :madsrdf/code "pg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-pg,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "GUINÉE-BISSAU"}
                                  {:rdf/language "en",
                                   :rdf/value    "GUINEA-BISSAU"}],
                                 :madsrdf/code "GW",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Guinea, Portuguese"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Bissagos Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Bijagós, Arquipélago dos"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Portuguese Guinea"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Arquipélago dos Bijagós"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Portuguese Guinea"}
                   {:rdf/language "en",
                    :rdf/value    "Arquipélago dos Bijagós"}
                   {:rdf/language "en",
                    :rdf/value    "Bijagós, Arquipélago dos"}
                   {:rdf/language "en",
                    :rdf/value    "Guinea, Portuguese"}
                   {:rdf/language "en",
                    :rdf/value    "Bissagos Islands"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-pg,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Guinea-Bissau"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GW",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "GUINÉE-BISSAU"}
                                            {:rdf/language "en",
                                             :rdf/value    "GUINEA-BISSAU"}]},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Bissagos Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Bijagós, Arquipélago dos"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Arquipélago dos Bijagós"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Guinea, Portuguese"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Portuguese Guinea"}}]})

(def ph
  "Philippines"
  {:db/ident :loc.countries/ph,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Philippines"},
   :madsrdf/code "ph",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ph,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PHILIPPINES"}
                                  {:rdf/language "en",
                                   :rdf/value    "PHILIPPINES"}],
                                 :madsrdf/code "PH",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ph",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ph,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ph,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ph",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Philippines"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PH",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "PHILIPPINES"}
                                            {:rdf/language "en",
                                             :rdf/value    "PHILIPPINES"}]}})

(def pic
  "Prince Edward Island"
  {:db/ident :loc.countries/pic,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Prince Edward Island"},
   :madsrdf/code "pic",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-pi,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pic",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pic,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-pi,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pic",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Prince Edward Island"}})

(def pk
  "Pakistan"
  {:db/ident :loc.countries/pk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Pakistan"},
   :madsrdf/code "pk",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-pk,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PAKISTAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "PAKISTAN"}],
                                 :madsrdf/code "PK",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "West Pakistan"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Gwadar"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Gwadar"}
                   {:rdf/language "en",
                    :rdf/value    "West Pakistan"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pk,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-pk,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Pakistan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PK",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "PAKISTAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "PAKISTAN"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Gwadar"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "West Pakistan"}}]})

(def pl
  "Poland"
  {:db/ident :loc.countries/pl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Poland"},
   :madsrdf/code "pl",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-pl,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "POLOGNE"}
                                  {:rdf/language "en",
                                   :rdf/value    "POLAND"}],
                                 :madsrdf/code "PL",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pl",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pl,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-pl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pl",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Poland"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PL",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "POLOGNE"}
                                            {:rdf/language "en",
                                             :rdf/value    "POLAND"}]}})

(def pn
  "Panama"
  {:db/ident :loc.countries/pn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Panama"},
   :madsrdf/code "pn",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nc,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/ncpn,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PANAMA"}
                                  {:rdf/language "en",
                                   :rdf/value    "PANAMA"}],
                                 :madsrdf/code "PA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [cz] Canal Zone before 1985-01"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/cz,
   :owl/sameAs "info:lc/vocabulary/countries/pn",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pn,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/ncpn,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [cz] Canal Zone before 1985-01"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pn",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Panama"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "PANAMA"}
                                            {:rdf/language "en",
                                             :rdf/value    "PANAMA"}]}})

(def po
  "Portugal"
  {:db/ident :loc.countries/po,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Portugal"},
   :madsrdf/code "po",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-po,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PORTUGAL"}
                                  {:rdf/language "en",
                                   :rdf/value    "PORTUGAL"}],
                                 :madsrdf/code "PT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Azores"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Madeira Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/po",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Azores"}
                   {:rdf/language "en",
                    :rdf/value    "Madeira Island"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/po,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-po,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "po",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Portugal"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "PORTUGAL"}
                                            {:rdf/language "en",
                                             :rdf/value    "PORTUGAL"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Madeira Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Azores"}}]})

(def pp
  "Papua New Guinea"
  {:db/ident :loc.countries/pp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Papua New Guinea"},
   :madsrdf/code "pp",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-pp,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PAPOUASIE-NOUVELLE-GUINÉE"}
                                  {:rdf/language "en",
                                   :rdf/value    "PAPUA NEW GUINEA"}],
                                 :madsrdf/code "PG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "New Guinea"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "New Ireland Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Trobriand Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Solomon Islands, Northern"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "New Britain Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Bismarck Archipelago"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Admiralty Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Woodlark Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "D'Entrecasteaux Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Louisiada Archipelago"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "North East New Guinea"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pp",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Solomon Islands, Northern"}
                   {:rdf/language "en",
                    :rdf/value    "Bismarck Archipelago"}
                   {:rdf/language "en",
                    :rdf/value    "North East New Guinea"}
                   {:rdf/language "en",
                    :rdf/value    "New Guinea"}
                   {:rdf/language "en",
                    :rdf/value    "New Britain Island"}
                   {:rdf/language "en",
                    :rdf/value    "Admiralty Islands"}
                   {:rdf/language "en",
                    :rdf/value    "D'Entrecasteaux Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Louisiada Archipelago"}
                   {:rdf/language "en",
                    :rdf/value    "Woodlark Island"}
                   {:rdf/language "en",
                    :rdf/value    "New Ireland Island"}
                   {:rdf/language "en",
                    :rdf/value    "Trobriand Islands"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pp,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-pp,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pp",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Papua New Guinea"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value
                                             "PAPOUASIE-NOUVELLE-GUINÉE"}
                                            {:rdf/language "en",
                                             :rdf/value "PAPUA NEW GUINEA"}]},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Trobriand Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "D'Entrecasteaux Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Admiralty Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "New Guinea"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Solomon Islands, Northern"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "New Ireland Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Woodlark Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Bismarck Archipelago"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "New Britain Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Louisiada Archipelago"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "North East New Guinea"}}]})

(def pr
  "Puerto Rico"
  {:db/ident :loc.countries/pr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Puerto Rico"},
   :madsrdf/code "pr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwpr,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PORTO RICO"}
                                  {:rdf/language "en",
                                   :rdf/value    "PUERTO RICO"}],
                                 :madsrdf/code "PR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/pr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pr,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwpr,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Puerto Rico"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "PORTO RICO"}
                                            {:rdf/language "en",
                                             :rdf/value    "PUERTO RICO"}]}})

(def pw
  "Palau"
  {:db/ident :loc.countries/pw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Palau"},
   :madsrdf/code "pw",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/popl,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PALAOS"}
                                  {:rdf/language "en",
                                   :rdf/value    "PALAU"}],
                                 :madsrdf/code "PW",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Babelthuap Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Peleliu Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tobi Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Helen Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Belau"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Merir Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Pulo Anna Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Angaur Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Pelew"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Sonsoral Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value
     "Coded [tt] Trust Territory of the Pacific Islands before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [tt] Palau before 1988-03"}
    {:rdf/language "en",
     :rdf/value "Coded [tt] Pacific Islands (Trust Territory) before 1988-03"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/tt,
   :owl/sameAs "info:lc/vocabulary/countries/pw",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Helen Island"}
                   {:rdf/language "en",
                    :rdf/value    "Peleliu Island"}
                   {:rdf/language "en",
                    :rdf/value    "Angaur Island"}
                   {:rdf/language "en",
                    :rdf/value    "Tobi Island"}
                   {:rdf/language "en",
                    :rdf/value    "Merir Island"}
                   {:rdf/language "en",
                    :rdf/value    "Belau"}
                   {:rdf/language "en",
                    :rdf/value    "Babelthuap Island"}
                   {:rdf/language "en",
                    :rdf/value    "Pulo Anna Island"}
                   {:rdf/language "en",
                    :rdf/value    "Pelew"}
                   {:rdf/language "en",
                    :rdf/value    "Sonsoral Islands"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/pw,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/popl,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value "Coded [tt] Pacific Islands (Trust Territory) before 1988-03"}
    {:rdf/language "en",
     :rdf/value
     "Coded [tt] Trust Territory of the Pacific Islands before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [tt] Palau before 1988-03"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "pw",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Palau"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PW",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "PALAOS"}
                                            {:rdf/language "en",
                                             :rdf/value    "PALAU"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Helen Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Angaur Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pulo Anna Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pelew"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sonsoral Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Babelthuap Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tobi Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Merir Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Peleliu Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Belau"}}]})

(def py
  "Paraguay"
  {:db/ident :loc.countries/py,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Paraguay"},
   :madsrdf/code "py",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-py,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "PARAGUAY"}
                                  {:rdf/language "en",
                                   :rdf/value    "PARAGUAY"}],
                                 :madsrdf/code "PY",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/py",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/py,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-py,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "py",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Paraguay"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "PY",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "PARAGUAY"}
                                            {:rdf/language "en",
                                             :rdf/value    "PARAGUAY"}]}})

(def qa
  "Qatar"
  {:db/ident :loc.countries/qa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Qatar"},
   :madsrdf/code "qa",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-qa,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "QATAR"}
                                  {:rdf/language "en",
                                   :rdf/value    "QATAR"}],
                                 :madsrdf/code "QA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/qa",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/qa,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-qa,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "qa",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Qatar"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "QA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "QATAR"}
                                            {:rdf/language "en",
                                             :rdf/value    "QATAR"}]}})

(def qea
  "Queensland"
  {:db/ident :loc.countries/qea,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Queensland"},
   :madsrdf/code "qea",
   :madsrdf/hasBroaderAuthority :loc.countries/at,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-at-qn,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [at] (Australia) before Sept. 2005"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/qea",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/broader :loc.countries/at,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/qea,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-at-qn,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [at] (Australia) before Sept. 2005"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "qea",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Queensland"}})

(def quc
  "Québec (Province)"
  {:db/ident :loc.countries/quc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Québec (Province)"},
   :madsrdf/code "quc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-qu,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/quc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/quc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-qu,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "quc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Québec (Province)"}})

(def rb
  "Serbia"
  {:db/ident :loc.countries/rb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Serbia"},
   :madsrdf/code "rb",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-rb,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SERBIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SERBIA"}],
                                 :madsrdf/code "RS",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [yu] for Serbia and Montenegro from 1992-April 2007"}
    {:rdf/language "en",
     :rdf/value    "Coded [yu] Yugoslavia before 1992-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/yu,
   :owl/sameAs "info:lc/vocabulary/countries/rb",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/rb,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-rb,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [yu] for Serbia and Montenegro from 1992-April 2007"}
    {:rdf/language "en",
     :rdf/value    "Coded [yu] Yugoslavia before 1992-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "rb",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Serbia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "RS",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SERBIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SERBIA"}]}})

(def re
  "Réunion"
  {:db/ident :loc.countries/re,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Réunion"},
   :madsrdf/code "re",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-re,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Europa, Ile"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Ile Juan de Nova"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tromelin, Ile"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ile Europa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Iles Glorieuses"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ile Tromelin"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Juan de Nova, Ile"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Glorieuses, Iles"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Bassas da India"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/re",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Iles Glorieuses"}
                   {:rdf/language "en",
                    :rdf/value    "Ile Europa"}
                   {:rdf/language "en",
                    :rdf/value    "Glorieuses, Iles"}
                   {:rdf/language "en",
                    :rdf/value    "Juan de Nova, Ile"}
                   {:rdf/language "en",
                    :rdf/value    "Bassas da India"}
                   {:rdf/language "en",
                    :rdf/value    "Europa, Ile"}
                   {:rdf/language "en",
                    :rdf/value    "Tromelin, Ile"}
                   {:rdf/language "en",
                    :rdf/value    "Ile Juan de Nova"}
                   {:rdf/language "en",
                    :rdf/value    "Ile Tromelin"}],
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/re,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-re,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "re",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Réunion"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ile Tromelin"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bassas da India"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Glorieuses, Iles"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Europa, Ile"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tromelin, Ile"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Juan de Nova, Ile"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ile Europa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Iles Glorieuses"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ile Juan de Nova"}}]})

(def rh
  "Zimbabwe"
  {:db/ident :loc.countries/rh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Zimbabwe"},
   :madsrdf/code "rh",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ZIMBABWE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ZIMBABWE"}],
                                 :madsrdf/code "ZW",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Zimbabwe Rhodesia"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Rhodesia"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Southern Rhodesia"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/rh",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Rhodesia"}
                   {:rdf/language "en",
                    :rdf/value    "Zimbabwe Rhodesia"}
                   {:rdf/language "en",
                    :rdf/value    "Southern Rhodesia"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/rh,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "rh",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Zimbabwe"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ZW",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ZIMBABWE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ZIMBABWE"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Southern Rhodesia"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Rhodesia"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Zimbabwe Rhodesia"}}]})

(def riu
  "Rhode Island"
  {:db/ident :loc.countries/riu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Rhode Island"},
   :madsrdf/code "riu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ri,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/riu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/riu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ri,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "riu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Rhode Island"}})

(def rm
  "Romania"
  {:db/ident :loc.countries/rm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Romania"},
   :madsrdf/code "rm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-rm,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ROUMANIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ROMANIA"}],
                                 :madsrdf/code "RO",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Rumania"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/rm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Rumania"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/rm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-rm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "rm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Romania"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "RO",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ROUMANIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ROMANIA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Rumania"}}})

(def ru
  "Russia (Federation)"
  {:db/ident :loc.countries/ru,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Russia (Federation)"},
   :madsrdf/code "ru",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "New Siberian Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Severnaya Zemlya"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Habomai Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Wrangel Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Kuril Islands (Southern)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Franz Josef Land"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Sakhalin (Southern)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Novaya Zemlya"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [rur] Russia (Federation) before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [rur] Russian S.F.S.R. before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [ur] Soviet Union before 1988-03"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/xxr :loc.countries/rur :loc.countries/ur],
   :owl/sameAs "info:lc/vocabulary/countries/ru",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Habomai Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Franz Josef Land"}
                   {:rdf/language "en",
                    :rdf/value    "Sakhalin (Southern)"}
                   {:rdf/language "en",
                    :rdf/value    "Novaya Zemlya"}
                   {:rdf/language "en",
                    :rdf/value    "Severnaya Zemlya"}
                   {:rdf/language "en",
                    :rdf/value    "Wrangel Island"}
                   {:rdf/language "en",
                    :rdf/value    "New Siberian Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Kuril Islands (Southern)"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ru,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value
                       "Coded [rur] Russia (Federation) before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value "Coded [rur] Russian S.F.S.R. before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ru",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Russia (Federation)"},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Sakhalin (Southern)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Habomai Islands"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Kuril Islands (Southern)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Wrangel Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Severnaya Zemlya"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Franz Josef Land"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Novaya Zemlya"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "New Siberian Islands"}}]})

(def rw
  "Rwanda"
  {:db/ident :loc.countries/rw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Rwanda"},
   :madsrdf/code "rw",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-rw,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "RWANDA"}
                                  {:rdf/language "en",
                                   :rdf/value    "RWANDA"}],
                                 :madsrdf/code "RW",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/rw",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/rw,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-rw,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "rw",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Rwanda"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "RW",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "RWANDA"}
                                            {:rdf/language "en",
                                             :rdf/value    "RWANDA"}]}})

(def sa
  "South Africa"
  {:db/ident :loc.countries/sa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "South Africa"},
   :madsrdf/code "sa",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority [:loc.geographicAreas/f-sa
                                       :loc.authorities/sh85125452concept],
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "AFRIQUE DU SUD"}
                                  {:rdf/language "en",
                                   :rdf/value    "SOUTH AFRICA"}],
                                 :madsrdf/code "ZA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Tswana"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Bophuthatswana"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ciskei"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Transkei"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Marion Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Machangana"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Zulu"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Walvis Bay Enclave"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "South Sotho"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Prince Edward Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Lebowa"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Venda"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sa",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Venda"}
                   {:rdf/language "en",
                    :rdf/value    "South Sotho"}
                   {:rdf/language "en",
                    :rdf/value    "Bophuthatswana"}
                   {:rdf/language "en",
                    :rdf/value    "Lebowa"}
                   {:rdf/language "en",
                    :rdf/value    "Prince Edward Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Marion Island"}
                   {:rdf/language "en",
                    :rdf/value    "Walvis Bay Enclave"}
                   {:rdf/language "en",
                    :rdf/value    "Zulu"}
                   {:rdf/language "en",
                    :rdf/value    "Machangana"}
                   {:rdf/language "en",
                    :rdf/value    "Tswana"}
                   {:rdf/language "en",
                    :rdf/value    "Ciskei"}
                   {:rdf/language "en",
                    :rdf/value    "Transkei"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sa,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch [:loc.authorities/sh85125452concept
                     :loc.geographicAreas/f-sa],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sa",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "South Africa"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ZA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "AFRIQUE DU SUD"}
                                            {:rdf/language "en",
                                             :rdf/value    "SOUTH AFRICA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Zulu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tswana"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ciskei"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bophuthatswana"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Lebowa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Venda"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Walvis Bay Enclave"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Machangana"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "South Sotho"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Prince Edward Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Marion Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Transkei"}}]})

(def sc
  "Saint-Barthélemy"
  {:db/ident :loc.countries/sc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Saint-Barthélemy"},
   :madsrdf/code "sc",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwsc,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Saint Barts"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Saint Bartholomew"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Ile Saint-Barthélemy"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "St. Barthélemy"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [gp] (Guadeloupe) before Dec. 2011"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Saint Barts"}
                   {:rdf/language "en",
                    :rdf/value    "Ile Saint-Barthélemy"}
                   {:rdf/language "en",
                    :rdf/value    "Saint Bartholomew"}
                   {:rdf/language "en",
                    :rdf/value    "St. Barthélemy"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwsc,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [gp] (Guadeloupe) before Dec. 2011"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Saint-Barthélemy"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Saint Bartholomew"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Ile Saint-Barthélemy"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "St. Barthélemy"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Saint Barts"}}]})

(def scu
  "South Carolina"
  {:db/ident :loc.countries/scu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "South Carolina"},
   :madsrdf/code "scu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-sc,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/scu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/scu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-sc,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "scu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "South Carolina"}})

(def sd
  "South Sudan"
  {:db/ident :loc.countries/sd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "South Sudan"},
   :madsrdf/code "sd",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-sd,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Sudan, South"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [sj] (Sudan) before Aug. 2011"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sd",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Sudan, South"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sd,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-sd,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [sj] (Sudan) before Aug. 2011"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sd",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "South Sudan"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Sudan, South"}}})

(def sdu
  "South Dakota"
  {:db/ident :loc.countries/sdu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "South Dakota"},
   :madsrdf/code "sdu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sdu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sdu,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sdu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "South Dakota"}})

(def se
  "Seychelles"
  {:db/ident :loc.countries/se,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Seychelles"},
   :madsrdf/code "se",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-se,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SEYCHELLES"}
                                  {:rdf/language "en",
                                   :rdf/value    "SEYCHELLES"}],
                                 :madsrdf/code "SC",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Saint Francois Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Bijoutier Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Cosmoledo Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Saint Pierre Islet"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "François Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Alphonse Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Amirante Isles"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [bi] Farquhar Atoll before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [bi] Desroches, Ile before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [bi] Aldabra Islands before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [bi] Ile Desroches before 1978-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/bi,
   :owl/sameAs "info:lc/vocabulary/countries/se",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "François Island"}
                   {:rdf/language "en",
                    :rdf/value    "Saint Pierre Islet"}
                   {:rdf/language "en",
                    :rdf/value    "Saint Francois Island"}
                   {:rdf/language "en",
                    :rdf/value    "Alphonse Island"}
                   {:rdf/language "en",
                    :rdf/value    "Cosmoledo Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Bijoutier Island"}
                   {:rdf/language "en",
                    :rdf/value    "Amirante Isles"}],
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/se,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-se,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [bi] Farquhar Atoll before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [bi] Ile Desroches before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [bi] Desroches, Ile before 1978-01"}
                      {:rdf/language "en",
                       :rdf/value "Coded [bi] Aldabra Islands before 1978-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "se",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Seychelles"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SC",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SEYCHELLES"}
                                            {:rdf/language "en",
                                             :rdf/value    "SEYCHELLES"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bijoutier Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Saint Francois Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Alphonse Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Amirante Isles"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "François Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Saint Pierre Islet"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Cosmoledo Islands"}}]})

(def sf
  "Sao Tome and Principe"
  {:db/ident :loc.countries/sf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Sao Tome and Principe"},
   :madsrdf/code "sf",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-sf,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SAO TOMÉ-ET-PRINCIPE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SAO TOME AND PRINCIPE"}],
                                 :madsrdf/code "ST",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sf",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sf,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-sf,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sf",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Sao Tome and Principe"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ST",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value "SAO TOMÉ-ET-PRINCIPE"}
                                            {:rdf/language "en",
                                             :rdf/value
                                             "SAO TOME AND PRINCIPE"}]}})

(def sg
  "Senegal"
  {:db/ident :loc.countries/sg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Senegal"},
   :madsrdf/code "sg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-sg,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SÉNÉGAL"}
                                  {:rdf/language "en",
                                   :rdf/value    "SENEGAL"}],
                                 :madsrdf/code "SN",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-sg,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Senegal"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SN",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SÉNÉGAL"}
                                            {:rdf/language "en",
                                             :rdf/value    "SENEGAL"}]}})

(def sh
  "Spanish North Africa"
  {:db/ident :loc.countries/sh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Spanish North Africa"},
   :madsrdf/code "sh",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-sh,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ceuta"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Chafarinas, Islas"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value
                            "Spanish Territories in Northern Morocco"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Peñón de Alhucemas"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Plazas de Soberania"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Peñón de Vélez de la Gomera"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Islas Chafarinas"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Melilla"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sh",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Peñón de Alhucemas"}
                   {:rdf/language "en",
                    :rdf/value    "Melilla"}
                   {:rdf/language "en",
                    :rdf/value    "Ceuta"}
                   {:rdf/language "en",
                    :rdf/value    "Chafarinas, Islas"}
                   {:rdf/language "en",
                    :rdf/value    "Plazas de Soberania"}
                   {:rdf/language "en",
                    :rdf/value    "Islas Chafarinas"}
                   {:rdf/language "en",
                    :rdf/value    "Spanish Territories in Northern Morocco"}
                   {:rdf/language "en",
                    :rdf/value    "Peñón de Vélez de la Gomera"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sh,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-sh,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sh",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Spanish North Africa"},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Chafarinas, Islas"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Plazas de Soberania"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value "Spanish Territories in Northern Morocco"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Islas Chafarinas"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Melilla"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Peñón de Alhucemas"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ceuta"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Peñón de Vélez de la Gomera"}}]})

(def si
  "Singapore"
  {:db/ident :loc.countries/si,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Singapore"},
   :madsrdf/code "si",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-si,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SINGAPOUR"}
                                  {:rdf/language "en",
                                   :rdf/value    "SINGAPORE"}],
                                 :madsrdf/code "SG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/si",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/si,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-si,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "si",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Singapore"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SINGAPOUR"}
                                            {:rdf/language "en",
                                             :rdf/value    "SINGAPORE"}]}})

(def sj
  "Sudan"
  {:db/ident :loc.countries/sj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Sudan"},
   :madsrdf/code "sj",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-sj,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SOUDAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "SUDAN"}],
                                 :madsrdf/code "SD",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sj",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sj,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-sj,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sj",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Sudan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SD",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SOUDAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "SUDAN"}]}})

(def sl
  "Sierra Leone"
  {:db/ident :loc.countries/sl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Sierra Leone"},
   :madsrdf/code "sl",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-sl,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SIERRA LEONE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SIERRA LEONE"}],
                                 :madsrdf/code "SL",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sl",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sl,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-sl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sl",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Sierra Leone"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SL",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SIERRA LEONE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SIERRA LEONE"}]}})

(def sm
  "San Marino"
  {:db/ident :loc.countries/sm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "San Marino"},
   :madsrdf/code "sm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-sm,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SAINT-MARIN"}
                                  {:rdf/language "en",
                                   :rdf/value    "SAN MARINO"}],
                                 :madsrdf/code "SM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-sm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "San Marino"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SAINT-MARIN"}
                                            {:rdf/language "en",
                                             :rdf/value    "SAN MARINO"}]}})

(def sn
  "Sint Maarten"
  {:db/ident :loc.countries/sn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Sint Maarten"},
   :madsrdf/code "sn",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwsn,
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        {:rdf/language "en",
                         :rdf/value    "Sint Maarten (Netherlands Antilles)"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [na] Netherlands Antilles before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Sint Maarten before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Saint Martin, Southern before 2011-12"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/na,
   :owl/sameAs "info:lc/vocabulary/countries/sn",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Sint Maarten (Netherlands Antilles)"},
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sn,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwsn,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [na] Saint Martin, Southern before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Netherlands Antilles before 2011-12"}
    {:rdf/language "en",
     :rdf/value    "Coded [na] Sint Maarten before 2011-12"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sn",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Sint Maarten"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     {:rdf/language "en",
                      :rdf/value    "Sint Maarten (Netherlands Antilles)"}}})

(def snc
  "Saskatchewan"
  {:db/ident :loc.countries/snc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Saskatchewan"},
   :madsrdf/code "snc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-sn,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/snc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/snc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-sn,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "snc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Saskatchewan"}})

(def so
  "Somalia"
  {:db/ident :loc.countries/so,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Somalia"},
   :madsrdf/code "so",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-so,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SOMALIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SOMALIA"}],
                                 :madsrdf/code "SO",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Somali Republic"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/so",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Somali Republic"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/so,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-so,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "so",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Somalia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SO",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SOMALIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SOMALIA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Somali Republic"}}})

(def sp
  "Spain"
  {:db/ident :loc.countries/sp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Spain"},
   :madsrdf/code "sp",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-sp,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ESPAGNE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SPAIN"}],
                                 :madsrdf/code "ES",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Canary Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Balearic Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sp",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Canary Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Balearic Islands"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sp,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-sp,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sp",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Spain"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ES",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ESPAGNE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SPAIN"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Balearic Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Canary Islands"}}]})

(def sq
  "Eswatini"
  {:db/ident :loc.countries/sq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Eswatini"},
   :madsrdf/code "sq",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-sq,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Swaziland"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sq",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Swaziland"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sq,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-sq,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sq",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Eswatini"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Swaziland"}}})

(def sr
  "Surinam"
  {:db/ident :loc.countries/sr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Surinam"},
   :madsrdf/code "sr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Netherlands Guiana"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Guiana, Dutch"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Dutch Guiana"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Dutch Guiana"}
                   {:rdf/language "en",
                    :rdf/value    "Netherlands Guiana"}
                   {:rdf/language "en",
                    :rdf/value    "Guiana, Dutch"}],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sr,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Surinam"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Guiana, Dutch"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Netherlands Guiana"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Dutch Guiana"}}]})

(def ss
  "Western Sahara"
  {:db/ident :loc.countries/ss,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Western Sahara"},
   :madsrdf/code "ss",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Spanish Sahara"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Río de Oro"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Saguia el Hamra"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ss",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Saguia el Hamra"}
                   {:rdf/language "en",
                    :rdf/value    "Spanish Sahara"}
                   {:rdf/language "en",
                    :rdf/value    "Río de Oro"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ss,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ss",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Western Sahara"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Saguia el Hamra"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Spanish Sahara"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Río de Oro"}}]})

(def st
  "Saint-Martin"
  {:db/ident :loc.countries/st,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Saint-Martin"},
   :madsrdf/code "st",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwst,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value "Saint-Martin (France: Collectivity)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Saint-Martin (Collectivity)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Collectivity of Saint Martin"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/st",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Collectivity of Saint Martin"}
                   {:rdf/language "en",
                    :rdf/value    "Saint-Martin (France: Collectivity)"}
                   {:rdf/language "en",
                    :rdf/value    "Saint-Martin (Collectivity)"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/st,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwst,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "st",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Saint-Martin"},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Saint-Martin (Collectivity)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Saint-Martin (France: Collectivity)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Collectivity of Saint Martin"}}]})

(def stk
  "Scotland"
  {:db/ident :loc.countries/stk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Scotland"},
   :madsrdf/code "stk",
   :madsrdf/hasBroaderAuthority :loc.countries/xxk,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Shetland Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Orkney Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "Coded [uik] United Kingdom Misc. Islands before 2018-04"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/uik,
   :owl/sameAs "info:lc/vocabulary/countries/stk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Shetland Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Orkney Islands"}],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/broader :loc.countries/xxk,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/stk,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value    "Coded [uik] United Kingdom Misc. Islands before 2018-04"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "stk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Scotland"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Shetland Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Orkney Islands"}}]})

(def su
  "Saudi Arabia"
  {:db/ident :loc.countries/su,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Saudi Arabia"},
   :madsrdf/code "su",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-su,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ARABIE SAOUDITE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SAUDI ARABIA"}],
                                 :madsrdf/code "SA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/su",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/su,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-su,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "su",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Saudi Arabia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ARABIE SAOUDITE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SAUDI ARABIA"}]}})

(def sw
  "Sweden"
  {:db/ident :loc.countries/sw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Sweden"},
   :madsrdf/code "sw",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-sw,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SUÈDE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SWEDEN"}],
                                 :madsrdf/code "SE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sw",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sw,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-sw,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sw",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Sweden"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SUÈDE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SWEDEN"}]}})

(def sx
  "Namibia"
  {:db/ident :loc.countries/sx,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Namibia"},
   :madsrdf/code "sx",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-sx,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NAMIBIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "NAMIBIA"}],
                                 :madsrdf/code "NA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value "South-West Africa"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sx",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "South-West Africa"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sx,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-sx,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sx",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Namibia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NAMIBIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "NAMIBIA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "South-West Africa"}}})

(def sy
  "Syria"
  {:db/ident :loc.countries/sy,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Syria"},
   :madsrdf/code "sy",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-sy,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value
                                               "Syrian Arab Republic"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sy",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Syrian Arab Republic"},
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sy,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-sy,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sy",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Syria"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value "Syrian Arab Republic"}}})

(def sz
  "Switzerland"
  {:db/ident :loc.countries/sz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Switzerland"},
   :madsrdf/code "sz",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-sz,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SUISSE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SWITZERLAND"}],
                                 :madsrdf/code "CH",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/sz",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/sz,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-sz,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "sz",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Switzerland"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CH",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SUISSE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SWITZERLAND"}]}})

(def ta
  "Tajikistan"
  {:db/ident :loc.countries/ta,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Tajikistan"},
   :madsrdf/code "ta",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ta,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TADJIKISTAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "TAJIKISTAN"}],
                                 :madsrdf/code "TJ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value "Coded [xxr] Soviet Union before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [tar] Tajik S.S.R. before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [tar] Tajikistan before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value
                          "Coded [tar] Tadzhik S.S.R. before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [ur] Soviet Union before 1988-03"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/ur :loc.countries/tar :loc.countries/xxr],
   :owl/sameAs "info:lc/vocabulary/countries/ta",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ta,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ta,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [tar] Tajik S.S.R. before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value "Coded [tar] Tadzhik S.S.R. before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [tar] Tajikistan before 1992-06"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ta",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Tajikistan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TJ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TADJIKISTAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "TAJIKISTAN"}]}})

(def tc
  "Turks and Caicos Islands"
  {:db/ident :loc.countries/tc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Turks and Caicos Islands"},
   :madsrdf/code "tc",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwtc,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TURKS ET CAÏQUES, ÎLES"}
                                  {:rdf/language "en",
                                   :rdf/value    "TURKS AND CAICOS ISLANDS"}],
                                 :madsrdf/code "TC",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Caicos Islands"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/tc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Caicos Islands"},
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwtc,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Turks and Caicos Islands"},
   :skos/semanticRelation
   {:rdf/type       :skos/Concept,
    :skos/notation  "TC",
    :skos/note      "This is the ISO 3166 match",
    :skos/prefLabel [{:rdf/language "fr",
                      :rdf/value    "TURKS ET CAÏQUES, ÎLES"}
                     {:rdf/language "en",
                      :rdf/value    "TURKS AND CAICOS ISLANDS"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Caicos Islands"}}})

(def tg
  "Togo"
  {:db/ident :loc.countries/tg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Togo"},
   :madsrdf/code "tg",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-tg,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TOGO"}
                                  {:rdf/language "en",
                                   :rdf/value    "TOGO"}],
                                 :madsrdf/code "TG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/tg",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tg,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-tg,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tg",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Togo"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TOGO"}
                                            {:rdf/language "en",
                                             :rdf/value    "TOGO"}]}})

(def th
  "Thailand"
  {:db/ident :loc.countries/th,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Thailand"},
   :madsrdf/code "th",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-th,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "THAÏLANDE"}
                                  {:rdf/language "en",
                                   :rdf/value    "THAILAND"}],
                                 :madsrdf/code "TH",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Siam"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/th",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Siam"},
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/th,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-th,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "th",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Thailand"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TH",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "THAÏLANDE"}
                                            {:rdf/language "en",
                                             :rdf/value    "THAILAND"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Siam"}}})

(def ti
  "Tunisia"
  {:db/ident :loc.countries/ti,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Tunisia"},
   :madsrdf/code "ti",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ti,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TUNISIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "TUNISIA"}],
                                 :madsrdf/code "TN",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ti",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ti,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ti,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ti",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Tunisia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TN",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TUNISIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "TUNISIA"}]}})

(def tk
  "Turkmenistan"
  {:db/ident :loc.countries/tk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Turkmenistan"},
   :madsrdf/code "tk",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-tk,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TURKMÉNISTAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "TURKMENISTAN"}],
                                 :madsrdf/code "TM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [tkr] Turkmen S.S.R. before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [tkr] Turkmenistan before 1992-06"}
    {:rdf/language "en",
     :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/ur :loc.countries/tkr :loc.countries/xxr],
   :owl/sameAs "info:lc/vocabulary/countries/tk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tk,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-tk,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}
                      {:rdf/language "en",
                       :rdf/value "Coded [tkr] Turkmen S.S.R. before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value "Coded [tkr] Turkmenistan before 1992-06"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Turkmenistan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TURKMÉNISTAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "TURKMENISTAN"}]}})

(def tl
  "Tokelau"
  {:db/ident :loc.countries/tl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Tokelau"},
   :madsrdf/code "tl",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/potl,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TOKELAU"}
                                  {:rdf/language "en",
                                   :rdf/value    "TOKELAU"}],
                                 :madsrdf/code "TK",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Atafu Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Union Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Nukunono Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Fakaofu Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/tl",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Union Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Atafu Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Fakaofu Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Nukunono Atoll"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tl,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/potl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tl",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Tokelau"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TK",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TOKELAU"}
                                            {:rdf/language "en",
                                             :rdf/value    "TOKELAU"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Union Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Fakaofu Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Atafu Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nukunono Atoll"}}]})

(def tma
  "Tasmania"
  {:db/ident :loc.countries/tma,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Tasmania"},
   :madsrdf/code "tma",
   :madsrdf/hasBroaderAuthority :loc.countries/at,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-at-tm,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [at] (Australia) before Sept. 2005"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/tma",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/broader :loc.countries/at,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tma,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-at-tm,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [at] (Australia) before Sept. 2005"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tma",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Tasmania"}})

(def tnu
  "Tennessee"
  {:db/ident :loc.countries/tnu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Tennessee"},
   :madsrdf/code "tnu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-tn,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/tnu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tnu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-tn,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tnu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Tennessee"}})

(def to
  "Tonga"
  {:db/ident :loc.countries/to,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Tonga"},
   :madsrdf/code "to",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/poto,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TONGA"}
                                  {:rdf/language "en",
                                   :rdf/value    "TONGA"}],
                                 :madsrdf/code "TO",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Nomuka"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Haapai"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Vavau"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tongatapu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Lulunga"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Otu Tolu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Friendly Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/to",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Friendly Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Vavau"}
                   {:rdf/language "en",
                    :rdf/value    "Haapai"}
                   {:rdf/language "en",
                    :rdf/value    "Lulunga"}
                   {:rdf/language "en",
                    :rdf/value    "Otu Tolu"}
                   {:rdf/language "en",
                    :rdf/value    "Nomuka"}
                   {:rdf/language "en",
                    :rdf/value    "Tongatapu"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/to,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/poto,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "to",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Tonga"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TO",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TONGA"}
                                            {:rdf/language "en",
                                             :rdf/value    "TONGA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Friendly Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nomuka"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Otu Tolu"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Haapai"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Lulunga"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Vavau"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tongatapu"}}]})

(def tr
  "Trinidad and Tobago"
  {:db/ident :loc.countries/tr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Trinidad and Tobago"},
   :madsrdf/code "tr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwtr,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TRINITÉ-ET-TOBAGO"}
                                  {:rdf/language "en",
                                   :rdf/value    "TRINIDAD AND TOBAGO"}],
                                 :madsrdf/code "TT",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Tobago"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/tr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Tobago"},
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tr,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwtr,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Trinidad and Tobago"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TT",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TRINITÉ-ET-TOBAGO"}
                                            {:rdf/language "en",
                                             :rdf/value
                                             "TRINIDAD AND TOBAGO"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Tobago"}}})

(def ts
  "United Arab Emirates"
  {:db/ident :loc.countries/ts,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "United Arab Emirates"},
   :madsrdf/code "ts",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-ts,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ÉMIRATS ARABES UNIS"}
                                  {:rdf/language "en",
                                   :rdf/value    "UNITED ARAB EMIRATES"}],
                                 :madsrdf/code "AE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Trucial Oman"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Dubayy"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "`Ajman"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Umm al-Qaywayn"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Oman, Trucial"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Dubai"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Trucial Sheikdoms"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Ra's al-Khaymah"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Abu Zaby"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Shariqah"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Abu Dhabi"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kalba"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Sharjah"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Fujairah"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Umm al Qaiwain"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Trucial Coast"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ras al Khaimah"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Trucial States"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Fujayrah"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ts",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "`Ajman"}
                   {:rdf/language "en",
                    :rdf/value    "Abu Zaby"}
                   {:rdf/language "en",
                    :rdf/value    "Sharjah"}
                   {:rdf/language "en",
                    :rdf/value    "Ras al Khaimah"}
                   {:rdf/language "en",
                    :rdf/value    "Trucial Sheikdoms"}
                   {:rdf/language "en",
                    :rdf/value    "Kalba"}
                   {:rdf/language "en",
                    :rdf/value    "Trucial States"}
                   {:rdf/language "en",
                    :rdf/value    "Oman, Trucial"}
                   {:rdf/language "en",
                    :rdf/value    "Fujayrah"}
                   {:rdf/language "en",
                    :rdf/value    "Trucial Oman"}
                   {:rdf/language "en",
                    :rdf/value    "Trucial Coast"}
                   {:rdf/language "en",
                    :rdf/value    "Umm al-Qaywayn"}
                   {:rdf/language "en",
                    :rdf/value    "Dubai"}
                   {:rdf/language "en",
                    :rdf/value    "Fujairah"}
                   {:rdf/language "en",
                    :rdf/value    "Umm al Qaiwain"}
                   {:rdf/language "en",
                    :rdf/value    "Dubayy"}
                   {:rdf/language "en",
                    :rdf/value    "Abu Dhabi"}
                   {:rdf/language "en",
                    :rdf/value    "Ra's al-Khaymah"}
                   {:rdf/language "en",
                    :rdf/value    "Shariqah"}],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ts,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-ts,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ts",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "United Arab Emirates"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "AE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value "ÉMIRATS ARABES UNIS"}
                                            {:rdf/language "en",
                                             :rdf/value
                                             "UNITED ARAB EMIRATES"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Fujairah"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Dubai"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Sharjah"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Abu Dhabi"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Umm al Qaiwain"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ra's al-Khaymah"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Trucial Sheikdoms"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Trucial States"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ras al Khaimah"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Shariqah"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Trucial Coast"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kalba"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Abu Zaby"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Oman, Trucial"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Dubayy"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Fujayrah"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Umm al-Qaywayn"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "`Ajman"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Trucial Oman"}}]})

(def tu
  "Turkey"
  {:db/ident :loc.countries/tu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Turkey"},
   :madsrdf/code "tu",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-tu,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TURQUIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "TURKEY"}],
                                 :madsrdf/code "TR",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/tu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-tu,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Turkey"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TR",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TURQUIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "TURKEY"}]}})

(def tv
  "Tuvalu"
  {:db/ident :loc.countries/tv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Tuvalu"},
   :madsrdf/code "tv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/potv,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TUVALU"}
                                  {:rdf/language "en",
                                   :rdf/value    "TUVALU"}],
                                 :madsrdf/code "TV",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Nukulaelae Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ellice Islands"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Niulakita Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Nukufetau Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Nukulailai Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Funafuti Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Nurakita Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [gn] Tuvalu before 1978-10"}
    {:rdf/language "en",
     :rdf/value    "Coded [gn] Gilbert and Ellice Islands before 1978-10"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/gn,
   :owl/sameAs "info:lc/vocabulary/countries/tv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Nukulailai Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Nukufetau Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Nukulaelae Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Niulakita Island"}
                   {:rdf/language "en",
                    :rdf/value    "Ellice Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Funafuti Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Nurakita Island"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/potv,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [gn] Tuvalu before 1978-10"}
                      {:rdf/language "en",
                       :rdf/value
                       "Coded [gn] Gilbert and Ellice Islands before 1978-10"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Tuvalu"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "TV",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "TUVALU"}
                                            {:rdf/language "en",
                                             :rdf/value    "TUVALU"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ellice Islands"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nukufetau Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nurakita Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Funafuti Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Niulakita Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nukulailai Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Nukulaelae Atoll"}}]})

(def txu
  "Texas"
  {:db/ident :loc.countries/txu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Texas"},
   :madsrdf/code "txu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-tx,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/txu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/txu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-tx,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "txu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Texas"}})

(def tz
  "Tanzania"
  {:db/ident :loc.countries/tz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Tanzania"},
   :madsrdf/code "tz",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-tz,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Tanganyika"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Zanzibar"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Pemba"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/tz",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Zanzibar"}
                   {:rdf/language "en",
                    :rdf/value    "Tanganyika"}
                   {:rdf/language "en",
                    :rdf/value    "Pemba"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/tz,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-tz,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "tz",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Tanzania"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Tanganyika"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Zanzibar"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Pemba"}}]})

(def ua
  "Egypt"
  {:db/ident :loc.countries/ua,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Egypt"},
   :madsrdf/code "ua",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ua,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ÉGYPTE"}
                                  {:rdf/language "en",
                                   :rdf/value    "EGYPT"}],
                                 :madsrdf/code "EG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "United Arab Republic"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Arab Republic of Egypt"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ua",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Arab Republic of Egypt"}
                   {:rdf/language "en",
                    :rdf/value    "United Arab Republic"}],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ua,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ua,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ua",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Egypt"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "EG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ÉGYPTE"}
                                            {:rdf/language "en",
                                             :rdf/value    "EGYPT"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "United Arab Republic"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Arab Republic of Egypt"}}]})

(def uc
  "United States Misc. Caribbean Islands"
  {:db/ident :loc.countries/uc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value
                                "United States Misc. Caribbean Islands"},
   :madsrdf/code "uc",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Navassa Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Roncador Cay"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Quita Sueno Bank"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useInstead :loc.countries/ck,
   :owl/sameAs "info:lc/vocabulary/countries/uc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :rdfs/seeAlso ["http://id.loc.gov/vocabulary/countries/ck"],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Roncador Cay"}
                   {:rdf/language "en",
                    :rdf/value    "Navassa Island"}
                   {:rdf/language "en",
                    :rdf/value    "Quita Sueno Bank"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/uc,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "uc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "United States Misc. Caribbean Islands"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Roncador Cay"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Navassa Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Quita Sueno Bank"}}]})

(def ug
  "Uganda"
  {:db/ident :loc.countries/ug,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Uganda"},
   :madsrdf/code "ug",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-ug,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "OUGANDA"}
                                  {:rdf/language "en",
                                   :rdf/value    "UGANDA"}],
                                 :madsrdf/code "UG",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ug",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ug,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-ug,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ug",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Uganda"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "UG",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "OUGANDA"}
                                            {:rdf/language "en",
                                             :rdf/value    "UGANDA"}]}})

(def un
  "Ukraine"
  {:db/ident :loc.countries/un,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Ukraine"},
   :madsrdf/code "un",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-un,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "UKRAINE"}
                                  {:rdf/language "en",
                                   :rdf/value    "UKRAINE"}],
                                 :madsrdf/code "UA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [unr] Ukraine before 1992-06"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/unr,
   :owl/sameAs "info:lc/vocabulary/countries/un",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/un,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-un,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [unr] Ukraine before 1992-06"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "un",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Ukraine"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "UA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "UKRAINE"}
                                            {:rdf/language "en",
                                             :rdf/value    "UKRAINE"}]}})

(def up
  "United States Misc. Pacific Islands"
  {:db/ident :loc.countries/up,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value
                                "United States Misc. Pacific Islands"},
   :madsrdf/code "up",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Palmyra Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Jarvis Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kingman Reef"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Howland Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Baker Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/up",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Jarvis Island"}
                   {:rdf/language "en",
                    :rdf/value    "Baker Island"}
                   {:rdf/language "en",
                    :rdf/value    "Kingman Reef"}
                   {:rdf/language "en",
                    :rdf/value    "Palmyra Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Howland Island"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/up,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "up",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "United States Misc. Pacific Islands"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Palmyra Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kingman Reef"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Baker Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Jarvis Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Howland Island"}}]})

(def utu
  "Utah"
  {:db/ident :loc.countries/utu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Utah"},
   :madsrdf/code "utu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-ut,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/utu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/utu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-ut,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "utu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Utah"}})

(def uv
  "Burkina Faso"
  {:db/ident :loc.countries/uv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Burkina Faso"},
   :madsrdf/code "uv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-uv,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "BURKINA FASO"}
                                  {:rdf/language "en",
                                   :rdf/value    "BURKINA FASO"}],
                                 :madsrdf/code "BF",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Upper Volta"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/uv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Upper Volta"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/uv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-uv,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "uv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Burkina Faso"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "BF",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "BURKINA FASO"}
                                            {:rdf/language "en",
                                             :rdf/value    "BURKINA FASO"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Upper Volta"}}})

(def uy
  "Uruguay"
  {:db/ident :loc.countries/uy,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Uruguay"},
   :madsrdf/code "uy",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-uy,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "URUGUAY"}
                                  {:rdf/language "en",
                                   :rdf/value    "URUGUAY"}],
                                 :madsrdf/code "UY",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/uy",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/uy,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-uy,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "uy",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Uruguay"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "UY",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "URUGUAY"}
                                            {:rdf/language "en",
                                             :rdf/value    "URUGUAY"}]}})

(def uz
  "Uzbekistan"
  {:db/ident :loc.countries/uz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Uzbekistan"},
   :madsrdf/code "uz",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-uz,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "OUZBÉKISTAN"}
                                  {:rdf/language "en",
                                   :rdf/value    "UZBEKISTAN"}],
                                 :madsrdf/code "UZ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value "Coded [xxr] Soviet Union before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [uzr] Uzbek S.S.R. before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value    "Coded [uzr] Uzbekistan before 1992-06"}
                         {:rdf/language "en",
                          :rdf/value "Coded [ur] Soviet Union before 1988-03"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/xxr :loc.countries/ur :loc.countries/uzr],
   :owl/sameAs "info:lc/vocabulary/countries/uz",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/uz,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-uz,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [uzr] Uzbekistan before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [uzr] Uzbek S.S.R. before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [xxr] Soviet Union before 1992-06"}
                      {:rdf/language "en",
                       :rdf/value    "Coded [ur] Soviet Union before 1988-03"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "uz",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Uzbekistan"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "UZ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "OUZBÉKISTAN"}
                                            {:rdf/language "en",
                                             :rdf/value    "UZBEKISTAN"}]}})

(def vau
  "Virginia"
  {:db/ident :loc.countries/vau,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Virginia"},
   :madsrdf/code "vau",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-va,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/vau",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/vau,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-va,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "vau",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Virginia"}})

(def vb
  "British Virgin Islands"
  {:db/ident :loc.countries/vb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "British Virgin Islands"},
   :madsrdf/code "vb",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwvb,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Colony of the Virgin Islands"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Virgin Islands (British)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Anegada"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Virgin Gorda"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Tortola"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Jost Van Dyke"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/vb",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Colony of the Virgin Islands"}
                   {:rdf/language "en",
                    :rdf/value    "Virgin Gorda"}
                   {:rdf/language "en",
                    :rdf/value    "Tortola"}
                   {:rdf/language "en",
                    :rdf/value    "Jost Van Dyke"}
                   {:rdf/language "en",
                    :rdf/value    "Virgin Islands (British)"}
                   {:rdf/language "en",
                    :rdf/value    "Anegada"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/vb,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwvb,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "vb",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "British Virgin Islands"},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Jost Van Dyke"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Tortola"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Virgin Gorda"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Anegada"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Virgin Islands (British)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Colony of the Virgin Islands"}}]})

(def vc
  "Vatican City"
  {:db/ident :loc.countries/vc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Vatican City"},
   :madsrdf/code "vc",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-vc,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Holy See"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/vc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Holy See"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/vc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-vc,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "vc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Vatican City"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Holy See"}}})

(def ve
  "Venezuela"
  {:db/ident :loc.countries/ve,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Venezuela"},
   :madsrdf/code "ve",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/s,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/s-ve,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ve",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/s,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ve,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/s-ve,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ve",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Venezuela"}})

(def vi
  "Virgin Islands of the United States"
  {:db/ident :loc.countries/vi,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value
                                "Virgin Islands of the United States"},
   :madsrdf/code "vi",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwvi,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/vi",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/vi,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwvi,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "vi",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Virgin Islands of the United States"}})

(def vm
  "Vietnam"
  {:db/ident :loc.countries/vm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Vietnam"},
   :madsrdf/code "vm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/a-vt,
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [vs] South Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vs] Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vn] Vietnam, North before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vn] North Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value
     "Coded [vn] Democratic People's Republic of Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vn] Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vs] Vietnam, South before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vs] Vietnam, Republic of before 1978-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor [:loc.countries/vs :loc.countries/vn],
   :owl/sameAs "info:lc/vocabulary/countries/vm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/vm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/a-vt,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value
     "Coded [vn] Democratic People's Republic of Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vn] Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vs] Vietnam, Republic of before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vs] Vietnam, South before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vn] North Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vs] Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vs] South Vietnam before 1978-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [vn] Vietnam, North before 1978-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "vm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Vietnam"}})

(def vp
  "Various places"
  {:db/ident :loc.countries/vp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Various places"},
   :madsrdf/code "vp",
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/vp",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/vp,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "vp",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Various places"}})

(def vra
  "Victoria"
  {:db/ident :loc.countries/vra,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Victoria"},
   :madsrdf/code "vra",
   :madsrdf/hasBroaderAuthority :loc.countries/at,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-at-vi,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [at] (Australia) before Sept. 2005"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/vra",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/broader :loc.countries/at,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/vra,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-at-vi,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [at] (Australia) before Sept. 2005"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "vra",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Victoria"}})

(def vtu
  "Vermont"
  {:db/ident :loc.countries/vtu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Vermont"},
   :madsrdf/code "vtu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-vt,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/vtu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/vtu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-vt,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "vtu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Vermont"}})

(def wau
  "Washington (State)"
  {:db/ident :loc.countries/wau,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Washington (State)"},
   :madsrdf/code "wau",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-wa,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/wau",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/wau,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-wa,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "wau",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Washington (State)"}})

(def wea
  "Western Australia"
  {:db/ident :loc.countries/wea,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Western Australia"},
   :madsrdf/code "wea",
   :madsrdf/hasBroaderAuthority :loc.countries/at,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-at-we,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [at] (Australia) before Sept. 2005"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/wea",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/broader :loc.countries/at,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/wea,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-at-we,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [at] (Australia) before Sept. 2005"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "wea",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Western Australia"}})

(def wf
  "Wallis and Futuna"
  {:db/ident :loc.countries/wf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Wallis and Futuna"},
   :madsrdf/code "wf",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "WALLIS ET FUTUNA"}
                                  {:rdf/language "en",
                                   :rdf/value    "WALLIS AND FUTUNA"}],
                                 :madsrdf/code "WF",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ile Uvea (Wallis and Futuna)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Uvea (Wallis and Futuna)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Alofi"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Iles de Horne"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Horne, Iles de"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Futuna"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/wf",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Horne, Iles de"}
                   {:rdf/language "en",
                    :rdf/value    "Ile Uvea (Wallis and Futuna)"}
                   {:rdf/language "en",
                    :rdf/value    "Uvea (Wallis and Futuna)"}
                   {:rdf/language "en",
                    :rdf/value    "Alofi"}
                   {:rdf/language "en",
                    :rdf/value    "Iles de Horne"}
                   {:rdf/language "en",
                    :rdf/value    "Futuna"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/wf,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "wf",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Wallis and Futuna"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "WF",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "WALLIS ET FUTUNA"}
                                            {:rdf/language "en",
                                             :rdf/value "WALLIS AND FUTUNA"}]},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Alofi"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Uvea (Wallis and Futuna)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Iles de Horne"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ile Uvea (Wallis and Futuna)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Horne, Iles de"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Futuna"}}]})

(def wiu
  "Wisconsin"
  {:db/ident :loc.countries/wiu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Wisconsin"},
   :madsrdf/code "wiu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-wi,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/wiu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/wiu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-wi,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "wiu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Wisconsin"}})

(def wj
  "West Bank of the Jordan River"
  {:db/ident :loc.countries/wj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "West Bank of the Jordan River"},
   :madsrdf/code "wj",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85146164concept,
   :madsrdf/hasVariant {:madsrdf/variantLabel
                        {:rdf/language "en",
                         :rdf/value
                         "Jordan (Territory under Israeli occupation, 1967- )"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/wj",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value
                   "Jordan (Territory under Israeli occupation, 1967- )"},
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/wj,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85146164concept,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "wj",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "West Bank of the Jordan River"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm
                     {:rdf/language "en",
                      :rdf/value
                      "Jordan (Territory under Israeli occupation, 1967- )"}}})

(def wk
  "Wake Island"
  {:db/ident :loc.countries/wk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Wake Island"},
   :madsrdf/code "wk",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority [:loc.authorities/sh91003697concept
                                       :loc.geographicAreas/powk],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/wk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/wk,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch [:loc.authorities/sh91003697concept
                     :loc.geographicAreas/powk],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "wk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Wake Island"}})

(def wlk
  "Wales"
  {:db/ident :loc.countries/wlk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Wales"},
   :madsrdf/code "wlk",
   :madsrdf/hasBroaderAuthority :loc.countries/xxk,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-uk-wl,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/wlk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/broader :loc.countries/xxk,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/wlk,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-uk-wl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "wlk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Wales"}})

(def ws
  "Samoa"
  {:db/ident :loc.countries/ws,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Samoa"},
   :madsrdf/code "ws",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/pows,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SAMOA"}
                                  {:rdf/language "en",
                                   :rdf/value    "SAMOA"}],
                                 :madsrdf/code "WS",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Samoa, Western"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Samoa i Sisifo"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Upolu"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Western Samoa"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Savai'i"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ws",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Samoa, Western"}
                   {:rdf/language "en",
                    :rdf/value    "Upolu"}
                   {:rdf/language "en",
                    :rdf/value    "Savai'i"}
                   {:rdf/language "en",
                    :rdf/value    "Western Samoa"}
                   {:rdf/language "en",
                    :rdf/value    "Samoa i Sisifo"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ws,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/pows,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ws",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Samoa"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "WS",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SAMOA"}
                                            {:rdf/language "en",
                                             :rdf/value    "SAMOA"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Samoa i Sisifo"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Savai'i"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Western Samoa"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Samoa, Western"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Upolu"}}]})

(def wvu
  "West Virginia"
  {:db/ident :loc.countries/wvu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "West Virginia"},
   :madsrdf/code "wvu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-wv,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/wvu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/wvu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-wv,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "wvu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "West Virginia"}})

(def wyu
  "Wyoming"
  {:db/ident :loc.countries/wyu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Wyoming"},
   :madsrdf/code "wyu",
   :madsrdf/hasBroaderAuthority :loc.countries/xxu,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us-wy,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/wyu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxu,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/wyu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us-wy,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "wyu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Wyoming"}})

(def xa
  "Christmas Island (Indian Ocean)"
  {:db/ident :loc.countries/xa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value "Christmas Island (Indian Ocean)"},
   :madsrdf/code "xa",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-xa,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xa",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xa,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-xa,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xa",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Christmas Island (Indian Ocean)"}})

(def xb
  "Cocos (Keeling) Islands"
  {:db/ident :loc.countries/xb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Cocos (Keeling) Islands"},
   :madsrdf/code "xb",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-xb,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "COCOS (KEELING), ÎLES"}
                                  {:rdf/language "en",
                                   :rdf/value    "COCOS (KEELING) ISLANDS"}],
                                 :madsrdf/code "CC",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Keeling Islands"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xb",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Keeling Islands"},
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xb,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-xb,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xb",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Cocos (Keeling) Islands"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CC",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value "COCOS (KEELING), ÎLES"}
                                            {:rdf/language "en",
                                             :rdf/value
                                             "COCOS (KEELING) ISLANDS"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Keeling Islands"}}})

(def xc
  "Maldives"
  {:db/ident :loc.countries/xc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Maldives"},
   :madsrdf/code "xc",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/i,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/i-xc,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MALDIVES"}
                                  {:rdf/language "en",
                                   :rdf/value    "MALDIVES"}],
                                 :madsrdf/code "MV",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Maldive Islands"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Maldive Islands"},
   :skos/broadMatch :loc.geographicAreas/i,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/i-xc,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Maldives"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MV",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MALDIVES"}
                                            {:rdf/language "en",
                                             :rdf/value    "MALDIVES"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Maldive Islands"}}})

(def xd
  "Saint Kitts-Nevis"
  {:db/ident :loc.countries/xd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Saint Kitts-Nevis"},
   :madsrdf/code "xd",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "St. Christopher"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Saint Christopher"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [xi] Saint Kitts-Nevis-Anguilla before 1985-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [xi] Saint Kitts-Nevis before 1985-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/xi,
   :owl/sameAs "info:lc/vocabulary/countries/xd",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Saint Christopher"}
                   {:rdf/language "en",
                    :rdf/value    "St. Christopher"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xd,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [xi] Saint Kitts-Nevis-Anguilla before 1985-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [xi] Saint Kitts-Nevis before 1985-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xd",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Saint Kitts-Nevis"},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "St. Christopher"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Saint Christopher"}}]})

(def xe
  "Marshall Islands"
  {:db/ident :loc.countries/xe,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Marshall Islands"},
   :madsrdf/code "xe",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/poxe,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "MARSHALL, ÎLES"}
                                  {:rdf/language "en",
                                   :rdf/value    "MARSHALL ISLANDS"}],
                                 :madsrdf/code "MH",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Namorik Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Mili Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Bikini (Atoll)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Kili Island"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ebon Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Wotje Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Utirik Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Eniwetok Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Arno (Atoll)"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Taongi Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Kwajalein Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Ailinglapalap Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Rongelap Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ujelang Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ralik Chain"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Ratak Chains"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Majuro Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Jaluit Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Maloelap Atoll"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value
     "Coded [tt] Trust Territory of the Pacific Islands before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [tt] Marshall Islands before 1988-03"}
    {:rdf/language "en",
     :rdf/value "Coded [tt] Pacific Islands (Trust Territory) before 1988-03"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/tt,
   :owl/sameAs "info:lc/vocabulary/countries/xe",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Arno (Atoll)"}
                   {:rdf/language "en",
                    :rdf/value    "Maloelap Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Majuro Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Rongelap Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Mili Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Namorik Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Kili Island"}
                   {:rdf/language "en",
                    :rdf/value    "Taongi Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Bikini (Atoll)"}
                   {:rdf/language "en",
                    :rdf/value    "Kwajalein Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Wotje Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Jaluit Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Ailinglapalap Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Utirik Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Ralik Chain"}
                   {:rdf/language "en",
                    :rdf/value    "Eniwetok Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Ebon Atoll"}
                   {:rdf/language "en",
                    :rdf/value    "Ratak Chains"}
                   {:rdf/language "en",
                    :rdf/value    "Ujelang Atoll"}],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xe,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/poxe,
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value
     "Coded [tt] Trust Territory of the Pacific Islands before 1988-03"}
    {:rdf/language "en",
     :rdf/value    "Coded [tt] Marshall Islands before 1988-03"}
    {:rdf/language "en",
     :rdf/value "Coded [tt] Pacific Islands (Trust Territory) before 1988-03"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xe",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Marshall Islands"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "MH",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "MARSHALL, ÎLES"}
                                            {:rdf/language "en",
                                             :rdf/value "MARSHALL ISLANDS"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ebon Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Arno (Atoll)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Majuro Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Eniwetok Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Jaluit Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Mili Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Bikini (Atoll)"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Utirik Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Maloelap Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kwajalein Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Taongi Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Kili Island"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ailinglapalap Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ratak Chains"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ralik Chain"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Rongelap Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Wotje Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Namorik Atoll"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Ujelang Atoll"}}]})

(def xf
  "Midway Islands"
  {:db/ident :loc.countries/xf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Midway Islands"},
   :madsrdf/code "xf",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority [:loc.authorities/sh85085054concept
                                       :loc.geographicAreas/poxf],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xf",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xf,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch [:loc.geographicAreas/poxf
                     :loc.authorities/sh85085054concept],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xf",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Midway Islands"}})

(def xga
  "Coral Sea Islands Territory"
  {:db/ident :loc.countries/xga,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Coral Sea Islands Territory"},
   :madsrdf/code "xga",
   :madsrdf/hasBroaderAuthority :loc.countries/at,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [at] (Australia) before Sept. 2005"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xga",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/broader :loc.countries/at,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xga,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [at] (Australia) before Sept. 2005"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xga",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Coral Sea Islands Territory"}})

(def xh
  "Niue"
  {:db/ident :loc.countries/xh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Niue"},
   :madsrdf/code "xh",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/p,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/poxh,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "NIUÉ"}
                                  {:rdf/language "en",
                                   :rdf/value    "NIUE"}],
                                 :madsrdf/code "NU",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xh",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/p,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xh,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/poxh,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xh",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Niue"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "NU",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "NIUÉ"}
                                            {:rdf/language "en",
                                             :rdf/value    "NIUE"}]}})

(def xj
  "Saint Helena"
  {:db/ident :loc.countries/xj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Saint Helena"},
   :madsrdf/code "xj",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/l,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/lsxj,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Ascension Island (Atlantic Ocean)"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Inaccessible Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Tristan da Cunha Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Nightingale Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Gough Island"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xj",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Gough Island"}
                   {:rdf/language "en",
                    :rdf/value    "Inaccessible Island"}
                   {:rdf/language "en",
                    :rdf/value    "Tristan da Cunha Island"}
                   {:rdf/language "en",
                    :rdf/value    "Ascension Island (Atlantic Ocean)"}
                   {:rdf/language "en",
                    :rdf/value    "Nightingale Island"}],
   :skos/broadMatch :loc.geographicAreas/l,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xj,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/lsxj,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xj",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Saint Helena"},
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Nightingale Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Gough Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Tristan da Cunha Island"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Ascension Island (Atlantic Ocean)"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Inaccessible Island"}}]})

(def xk
  "Saint Lucia"
  {:db/ident :loc.countries/xk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Saint Lucia"},
   :madsrdf/code "xk",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwxk,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SAINTE-LUCIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SAINT LUCIA"}],
                                 :madsrdf/code "LC",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xk,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwxk,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Saint Lucia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "LC",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SAINTE-LUCIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SAINT LUCIA"}]}})

(def xl
  "Saint Pierre and Miquelon"
  {:db/ident :loc.countries/xl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Saint Pierre and Miquelon"},
   :madsrdf/code "xl",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-xl,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SAINT-PIERRE-ET-MIQUELON"}
                                  {:rdf/language "en",
                                   :rdf/value    "SAINT PIERRE AND MIQUELON"}],
                                 :madsrdf/code "PM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Miquelon"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xl",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Miquelon"},
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xl,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-xl,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xl",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Saint Pierre and Miquelon"},
   :skos/semanticRelation
   {:rdf/type       :skos/Concept,
    :skos/notation  "PM",
    :skos/note      "This is the ISO 3166 match",
    :skos/prefLabel [{:rdf/language "fr",
                      :rdf/value    "SAINT-PIERRE-ET-MIQUELON"}
                     {:rdf/language "en",
                      :rdf/value    "SAINT PIERRE AND MIQUELON"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Miquelon"}}})

(def xm
  "Saint Vincent and the Grenadines"
  {:db/ident :loc.countries/xm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value "Saint Vincent and the Grenadines"},
   :madsrdf/code "xm",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/nw,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/nwxm,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value "SAINT-VINCENT-ET-LES GRENADINES"}
                                  {:rdf/language "en",
                                   :rdf/value
                                   "SAINT VINCENT AND THE GRENADINES"}],
                                 :madsrdf/code "VC",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Saint Vincent"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Grenadine Islands, Northern"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xm",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Grenadine Islands, Northern"}
                   {:rdf/language "en",
                    :rdf/value    "Saint Vincent"}],
   :skos/broadMatch :loc.geographicAreas/nw,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xm,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/nwxm,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xm",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Saint Vincent and the Grenadines"},
   :skos/semanticRelation {:rdf/type :skos/Concept,
                           :skos/notation "VC",
                           :skos/note "This is the ISO 3166 match",
                           :skos/prefLabel
                           [{:rdf/language "fr",
                             :rdf/value    "SAINT-VINCENT-ET-LES GRENADINES"}
                            {:rdf/language "en",
                             :rdf/value "SAINT VINCENT AND THE GRENADINES"}]},
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Saint Vincent"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Grenadine Islands, Northern"}}]})

(def xn
  "North Macedonia"
  {:db/ident :loc.countries/xn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "North Macedonia"},
   :madsrdf/code "xn",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-xn,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value
                                               "Macedonia (Republic)"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "Coded [yu] North Macedonia before 1992-10"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/yu,
   :owl/sameAs "info:lc/vocabulary/countries/xn",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Macedonia (Republic)"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xn,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-xn,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value "Coded [yu] North Macedonia before 1992-10"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xn",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "North Macedonia"},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value "Macedonia (Republic)"}}})

(def xna
  "New South Wales"
  {:db/ident :loc.countries/xna,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "New South Wales"},
   :madsrdf/code "xna",
   :madsrdf/hasBroaderAuthority :loc.countries/at,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-at-ne,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [at] (Australia) before Sept. 2005"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xna",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/broader :loc.countries/at,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xna,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-at-ne,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [at] (Australia) before Sept. 2005"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xna",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "New South Wales"}})

(def xo
  "Slovakia"
  {:db/ident :loc.countries/xo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Slovakia"},
   :madsrdf/code "xo",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-xo,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SLOVAQUIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SLOVAKIA"}],
                                 :madsrdf/code "SK",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value
                                               "Slovak Socialist Republic"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value    "Coded [cs] Slovakia before 1993-06"}
                         {:rdf/language "en",
                          :rdf/value
                          "Coded [cs] Czechoslovakia before 1993-05"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/cs,
   :owl/sameAs "info:lc/vocabulary/countries/xo",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Slovak Socialist Republic"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xo,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-xo,
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [cs] Slovakia before 1993-06"}
                      {:rdf/language "en",
                       :rdf/value "Coded [cs] Czechoslovakia before 1993-05"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xo",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Slovakia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SK",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SLOVAQUIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SLOVAKIA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value
                                          "Slovak Socialist Republic"}}})

(def xoa
  "Northern Territory"
  {:db/ident :loc.countries/xoa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Northern Territory"},
   :madsrdf/code "xoa",
   :madsrdf/hasBroaderAuthority :loc.countries/at,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-at-no,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [at] (Australia) before Sept. 2005"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xoa",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/broader :loc.countries/at,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xoa,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-at-no,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [at] (Australia) before Sept. 2005"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xoa",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Northern Territory"}})

(def xp
  "Spratly Island"
  {:db/ident :loc.countries/xp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Spratly Island"},
   :madsrdf/code "xp",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xp",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xp,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xp",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Spratly Island"}})

(def xr
  "Czech Republic"
  {:db/ident :loc.countries/xr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Czech Republic"},
   :madsrdf/code "xr",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "TCHÈQUE, RÉPUBLIQUE"}
                                  {:rdf/language "en",
                                   :rdf/value    "CZECH REPUBLIC"}],
                                 :madsrdf/code "CZ",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote [{:rdf/language "en",
                          :rdf/value "Coded [cs] Czechoslovakia before 1993-05"}
                         {:rdf/language "en",
                          :rdf/value
                          "Coded [cs] Czech Republic before 1993-05"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/cs,
   :owl/sameAs "info:lc/vocabulary/countries/xr",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xr,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote [{:rdf/language "en",
                       :rdf/value    "Coded [cs] Czechoslovakia before 1993-05"}
                      {:rdf/language "en",
                       :rdf/value "Coded [cs] Czech Republic before 1993-05"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xr",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Czech Republic"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CZ",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value "TCHÈQUE, RÉPUBLIQUE"}
                                            {:rdf/language "en",
                                             :rdf/value    "CZECH REPUBLIC"}]}})

(def xra
  "South Australia"
  {:db/ident :loc.countries/xra,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "South Australia"},
   :madsrdf/code "xra",
   :madsrdf/hasBroaderAuthority :loc.countries/at,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/u,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/u-at-sa,
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [at] (Australia) before Sept. 2005"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xra",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/u,
   :skos/broader :loc.countries/at,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xra,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/u-at-sa,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [at] (Australia) before Sept. 2005"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xra",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "South Australia"}})

(def xs
  "South Georgia and the South Sandwich Islands"
  {:db/ident :loc.countries/xs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value
                                "South Georgia and the South Sandwich Islands"},
   :madsrdf/code "xs",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/l,
   :madsrdf/hasRelatedAuthority
   {:madsrdf/authoritativeLabel
    [{:rdf/language "fr",
      :rdf/value    "GÉORGIE DU SUD ET LES ÎLES SANDWICH DU SUD"}
     {:rdf/language "en",
      :rdf/value    "SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS"}],
    :madsrdf/code "GS",
    :madsrdf/note "This is the ISO 3166 match",
    :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [fk] South Georgia Island before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [fk] South Sandwich Islands before 1991-01"}
    {:rdf/language "en",
     :rdf/value
     "Coded [fk] South Georgia and the South Sandwich Islands before 1991-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/fk,
   :owl/sameAs "info:lc/vocabulary/countries/xs",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/l,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xs,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value
     "Coded [fk] South Georgia and the South Sandwich Islands before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [fk] South Sandwich Islands before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [fk] South Georgia Island before 1991-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xs",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value "South Georgia and the South Sandwich Islands"},
   :skos/semanticRelation
   {:rdf/type       :skos/Concept,
    :skos/notation  "GS",
    :skos/note      "This is the ISO 3166 match",
    :skos/prefLabel [{:rdf/language "fr",
                      :rdf/value "GÉORGIE DU SUD ET LES ÎLES SANDWICH DU SUD"}
                     {:rdf/language "en",
                      :rdf/value
                      "SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS"}]}})

(def xv
  "Slovenia"
  {:db/ident :loc.countries/xv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Slovenia"},
   :madsrdf/code "xv",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/e-xv,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "SLOVÉNIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "SLOVENIA"}],
                                 :madsrdf/code "SI",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [yu] Slovenia before 1992-10"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/yu,
   :owl/sameAs "info:lc/vocabulary/countries/xv",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xv,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/e-xv,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [yu] Slovenia before 1992-10"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xv",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Slovenia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "SI",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "SLOVÉNIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "SLOVENIA"}]}})

(def xx
  "No place, unknown, or undetermined"
  {:db/ident :loc.countries/xx,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value
                                "No place, unknown, or undetermined"},
   :madsrdf/code "xx",
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/xx",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xx,
                     :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "xx",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "No place, unknown, or undetermined"}})

(def xxc
  "Canada"
  {:db/ident :loc.countries/xxc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Canada"},
   :madsrdf/code "xxc",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn,
   :madsrdf/hasNarrowerAuthority [:loc.countries/nfc
                                  :loc.countries/nsc
                                  :loc.countries/mbc
                                  :loc.countries/onc
                                  :loc.countries/bcc
                                  :loc.countries/abc
                                  :loc.countries/ntc
                                  :loc.countries/ykc
                                  :loc.countries/nuc
                                  :loc.countries/quc
                                  :loc.countries/pic
                                  :loc.countries/nkc
                                  :loc.countries/snc],
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "CANADA"}
                                  {:rdf/language "en",
                                   :rdf/value    "CANADA"}],
                                 :madsrdf/code "CA",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "Coded [cn] Canada before 1988-03"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/cn,
   :owl/sameAs "info:lc/vocabulary/countries/xxc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xxc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [cn] Canada before 1988-03"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/narrower [:loc.countries/snc
                   :loc.countries/pic
                   :loc.countries/quc
                   :loc.countries/ykc
                   :loc.countries/ntc
                   :loc.countries/mbc
                   :loc.countries/nkc
                   :loc.countries/nfc
                   :loc.countries/onc
                   :loc.countries/nuc
                   :loc.countries/bcc
                   :loc.countries/abc
                   :loc.countries/nsc],
   :skos/notation "xxc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Canada"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "CA",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "CANADA"}
                                            {:rdf/language "en",
                                             :rdf/value    "CANADA"}]}})

(def xxk
  "United Kingdom"
  {:db/ident :loc.countries/xxk,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "United Kingdom"},
   :madsrdf/code "xxk",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/e,
   :madsrdf/hasNarrowerAuthority [:loc.countries/enk
                                  :loc.countries/nik
                                  :loc.countries/wlk
                                  :loc.countries/stk],
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ROYAUME-UNI"}
                                  {:rdf/language "en",
                                   :rdf/value    "UNITED KINGDOM"}],
                                 :madsrdf/code "GB",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Great Britain"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [uk] United Kingdom before 1988-03"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/uk,
   :owl/sameAs "info:lc/vocabulary/countries/xxk",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Great Britain"},
   :skos/broadMatch :loc.geographicAreas/e,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xxk,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [uk] United Kingdom before 1988-03"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/narrower [:loc.countries/wlk
                   :loc.countries/stk
                   :loc.countries/nik
                   :loc.countries/enk],
   :skos/notation "xxk",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "United Kingdom"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "GB",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ROYAUME-UNI"}
                                            {:rdf/language "en",
                                             :rdf/value    "UNITED KINGDOM"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Great Britain"}}})

(def xxu
  "United States"
  {:db/ident :loc.countries/xxu,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "United States"},
   :madsrdf/code "xxu",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-us,
   :madsrdf/hasNarrowerAuthority [:loc.countries/nyu
                                  :loc.countries/deu
                                  :loc.countries/cau
                                  :loc.countries/dcu
                                  :loc.countries/mau
                                  :loc.countries/wau
                                  :loc.countries/riu
                                  :loc.countries/ksu
                                  :loc.countries/nbu
                                  :loc.countries/vtu
                                  :loc.countries/wyu
                                  :loc.countries/mou
                                  :loc.countries/txu
                                  :loc.countries/mnu
                                  :loc.countries/inu
                                  :loc.countries/oku
                                  :loc.countries/iau
                                  :loc.countries/wvu
                                  :loc.countries/aru
                                  :loc.countries/msu
                                  :loc.countries/pau
                                  :loc.countries/oru
                                  :loc.countries/ndu
                                  :loc.countries/ncu
                                  :loc.countries/alu
                                  :loc.countries/wiu
                                  :loc.countries/lau
                                  :loc.countries/cou
                                  :loc.countries/scu
                                  :loc.countries/gau
                                  :loc.countries/aku
                                  :loc.countries/hiu
                                  :loc.countries/utu
                                  :loc.countries/flu
                                  :loc.countries/azu
                                  :loc.countries/nvu
                                  :loc.countries/ilu
                                  :loc.countries/mtu
                                  :loc.countries/meu
                                  :loc.countries/mdu
                                  :loc.countries/nmu
                                  :loc.countries/tnu
                                  :loc.countries/miu
                                  :loc.countries/nju
                                  :loc.countries/sdu
                                  :loc.countries/kyu
                                  :loc.countries/vau
                                  :loc.countries/idu
                                  :loc.countries/nhu
                                  :loc.countries/ctu
                                  :loc.countries/ohu],
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ÉTATS-UNIS"}
                                  {:rdf/language "en",
                                   :rdf/value    "UNITED STATES"}],
                                 :madsrdf/code "US",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "Coded [us] United States before 1988-03"},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/us,
   :owl/sameAs "info:lc/vocabulary/countries/xxu",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/xxu,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-us,
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "Coded [us] United States before 1988-03"},
   :skos/inScheme :loc.vocabulary/countries,
   :skos/narrower [:loc.countries/riu
                   :loc.countries/mtu
                   :loc.countries/mou
                   :loc.countries/wiu
                   :loc.countries/vtu
                   :loc.countries/inu
                   :loc.countries/mdu
                   :loc.countries/scu
                   :loc.countries/alu
                   :loc.countries/ncu
                   :loc.countries/kyu
                   :loc.countries/oku
                   :loc.countries/lau
                   :loc.countries/oru
                   :loc.countries/nmu
                   :loc.countries/miu
                   :loc.countries/ilu
                   :loc.countries/nju
                   :loc.countries/azu
                   :loc.countries/wvu
                   :loc.countries/nvu
                   :loc.countries/nhu
                   :loc.countries/iau
                   :loc.countries/pau
                   :loc.countries/cau
                   :loc.countries/mnu
                   :loc.countries/meu
                   :loc.countries/utu
                   :loc.countries/tnu
                   :loc.countries/ndu
                   :loc.countries/wau
                   :loc.countries/sdu
                   :loc.countries/dcu
                   :loc.countries/gau
                   :loc.countries/msu
                   :loc.countries/hiu
                   :loc.countries/ksu
                   :loc.countries/cou
                   :loc.countries/nyu
                   :loc.countries/ctu
                   :loc.countries/vau
                   :loc.countries/deu
                   :loc.countries/ohu
                   :loc.countries/mau
                   :loc.countries/aku
                   :loc.countries/idu
                   :loc.countries/txu
                   :loc.countries/nbu
                   :loc.countries/wyu
                   :loc.countries/flu
                   :loc.countries/aru],
   :skos/notation "xxu",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "United States"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "US",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ÉTATS-UNIS"}
                                            {:rdf/language "en",
                                             :rdf/value    "UNITED STATES"}]}})

(def ye
  "Yemen"
  {:db/ident :loc.countries/ye,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Yemen"},
   :madsrdf/code "ye",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/a,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "YÉMEN"}
                                  {:rdf/language "en",
                                   :rdf/value    "YEMEN"}],
                                 :madsrdf/code "YE",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value
                                               "Arab Republic of Yemen"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [ys] Federation of South Arabia before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Socotra before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Aden before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Perim before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Kamaran before 1991-01"}
    {:rdf/language "en",
     :rdf/value
     "Coded [ys] Yemen (People's Democratic Republic) before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] South Arabia before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Southern Yemen before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Aden (Protectorate) before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Protectorate of South Arabia before 1991-01"}],
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :madsrdf/useFor :loc.countries/ys,
   :owl/sameAs "info:lc/vocabulary/countries/ye",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Arab Republic of Yemen"},
   :skos/broadMatch :loc.geographicAreas/a,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ye,
                     :rdf/type :cs/ChangeSet},
   :skos/historyNote
   [{:rdf/language "en",
     :rdf/value    "Coded [ys] Protectorate of South Arabia before 1991-01"}
    {:rdf/language "en",
     :rdf/value
     "Coded [ys] Yemen (People's Democratic Republic) before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Federation of South Arabia before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Kamaran before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Aden before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] South Arabia before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Socotra before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Aden (Protectorate) before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Southern Yemen before 1991-01"}
    {:rdf/language "en",
     :rdf/value    "Coded [ys] Perim before 1991-01"}],
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ye",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Yemen"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "YE",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "YÉMEN"}
                                            {:rdf/language "en",
                                             :rdf/value    "YEMEN"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value
                                          "Arab Republic of Yemen"}}})

(def ykc
  "Yukon Territory"
  {:db/ident :loc.countries/ykc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Yukon Territory"},
   :madsrdf/code "ykc",
   :madsrdf/hasBroaderAuthority :loc.countries/xxc,
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/n,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/n-cn-yk,
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/ykc",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/broadMatch :loc.geographicAreas/n,
   :skos/broader :loc.countries/xxc,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/ykc,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/n-cn-yk,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "ykc",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Yukon Territory"}})

(def za
  "Zambia"
  {:db/ident :loc.countries/za,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "1970-01-01T05:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlcmrc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Zambia"},
   :madsrdf/code "za",
   :madsrdf/hasBroaderExternalAuthority :loc.geographicAreas/f,
   :madsrdf/hasExactExternalAuthority :loc.geographicAreas/f-za,
   :madsrdf/hasRelatedAuthority {:madsrdf/authoritativeLabel
                                 [{:rdf/language "fr",
                                   :rdf/value    "ZAMBIE"}
                                  {:rdf/language "en",
                                   :rdf/value    "ZAMBIA"}],
                                 :madsrdf/code "ZM",
                                 :madsrdf/note "This is the ISO 3166 match",
                                 :rdf/type     :madsrdf/Geographic},
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value "Northern Rhodesia"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.countries/collection_PastPresentCountriesEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/countries,
   :owl/sameAs "info:lc/vocabulary/countries/za",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Northern Rhodesia"},
   :skos/broadMatch :loc.geographicAreas/f,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.countries/za,
                     :rdf/type :cs/ChangeSet},
   :skos/exactMatch :loc.geographicAreas/f-za,
   :skos/inScheme :loc.vocabulary/countries,
   :skos/notation "za",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Zambia"},
   :skos/semanticRelation {:rdf/type       :skos/Concept,
                           :skos/notation  "ZM",
                           :skos/note      "This is the ISO 3166 match",
                           :skos/prefLabel [{:rdf/language "fr",
                                             :rdf/value    "ZAMBIE"}
                                            {:rdf/language "en",
                                             :rdf/value    "ZAMBIA"}]},
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Northern Rhodesia"}}})

(def ^{:private true} countries
  "MARC Countries list identifies current national entities, states of the United States, provinces and territories of Canada and Australia, divisions of the United Kingdom, and internationally recognized dependencies. The list's codes are two- or three-character lowercase alphabetic strings that serve as identifiers. The MARC country codes are not the same as the ISO 3166 country codes, although the lists are entity-compatible so that a simple translation could relate codes for the same entity. The records for the codes contain references to the equivalent ISO 3166 codes. The list contains over 350 discrete codes. This list is also searchable at: MARC Code List for Countries."
  {:db/ident :loc.vocabulary/countries,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2011-04-26T04:00:00.000-00:00",
    :ri/recordContentSource :loc.organizations/dlc,
    :ri/recordStatus "modified"},
   :madsrdf/hasTopMemberOfMADSScheme [:loc.countries/scu
                                      :loc.countries/wea
                                      :loc.countries/ck
                                      :loc.countries/xl
                                      :loc.countries/aw
                                      :loc.countries/mc
                                      :loc.countries/sm
                                      :loc.countries/nvu
                                      :loc.countries/enk
                                      :loc.countries/re
                                      :loc.countries/xa
                                      :loc.countries/gp
                                      :loc.countries/kz
                                      :loc.countries/pk
                                      :loc.countries/nq
                                      :loc.countries/hm
                                      :loc.countries/bi
                                      :loc.countries/fs
                                      :loc.countries/mtu
                                      :loc.countries/mbc
                                      :loc.countries/cou
                                      :loc.countries/bt
                                      :loc.countries/flu
                                      :loc.countries/ko
                                      :loc.countries/aa
                                      :loc.countries/cq
                                      :loc.countries/xr
                                      :loc.countries/miu
                                      :loc.countries/ss
                                      :loc.countries/deu
                                      :loc.countries/nfc
                                      :loc.countries/ot
                                      :loc.countries/cf
                                      :loc.countries/mz
                                      :loc.countries/gv
                                      :loc.countries/vm
                                      :loc.countries/ts
                                      :loc.countries/jm
                                      :loc.countries/nw
                                      :loc.countries/sh
                                      :loc.countries/bo
                                      :loc.countries/wj
                                      :loc.countries/up
                                      :loc.countries/za
                                      :loc.countries/nik
                                      :loc.countries/nmu
                                      :loc.countries/oru
                                      :loc.countries/nsc
                                      :loc.countries/ie
                                      :loc.countries/mo
                                      :loc.countries/xna
                                      :loc.countries/ku
                                      :loc.countries/ag
                                      :loc.countries/vb
                                      :loc.countries/pf
                                      :loc.countries/vra
                                      :loc.countries/cw
                                      :loc.countries/th
                                      :loc.countries/nl
                                      :loc.countries/xx
                                      :loc.countries/bd
                                      :loc.countries/nbu
                                      :loc.countries/tma
                                      :loc.countries/hiu
                                      :loc.countries/cl
                                      :loc.countries/iv
                                      :loc.countries/xm
                                      :loc.countries/pw
                                      :loc.countries/sn
                                      :loc.countries/uv
                                      :loc.countries/iau
                                      :loc.countries/ca
                                      :loc.countries/mu
                                      :loc.countries/xxu
                                      :loc.countries/xb
                                      :loc.countries/am
                                      :loc.countries/pl
                                      :loc.countries/nr
                                      :loc.countries/sc
                                      :loc.countries/ft
                                      :loc.countries/ndu
                                      :loc.countries/ksu
                                      :loc.countries/alu
                                      :loc.countries/qea
                                      :loc.countries/bu
                                      :loc.countries/mj
                                      :loc.countries/ilu
                                      :loc.countries/cr
                                      :loc.countries/tc
                                      :loc.countries/ng
                                      :loc.countries/xs
                                      :loc.countries/rw
                                      :loc.countries/fi
                                      :loc.countries/st
                                      :loc.countries/lau
                                      :loc.countries/tnu
                                      :loc.countries/nuc
                                      :loc.countries/ke
                                      :loc.countries/ea
                                      :loc.countries/cg
                                      :loc.countries/iq
                                      :loc.countries/sw
                                      :loc.countries/gw
                                      :loc.countries/xh
                                      :loc.countries/lb
                                      :loc.countries/as
                                      :loc.countries/pr
                                      :loc.countries/nx
                                      :loc.countries/ht
                                      :loc.countries/ye
                                      :loc.countries/si
                                      :loc.countries/bp
                                      :loc.countries/wk
                                      :loc.countries/oku
                                      :loc.countries/mou
                                      :loc.countries/mp
                                      :loc.countries/inu
                                      :loc.countries/gl
                                      :loc.countries/kv
                                      :loc.countries/er
                                      :loc.countries/vc
                                      :loc.countries/pg
                                      :loc.countries/cx
                                      :loc.countries/ti
                                      :loc.countries/ls
                                      :loc.countries/be
                                      :loc.countries/xga
                                      :loc.countries/mdu
                                      :loc.countries/eg
                                      :loc.countries/cm
                                      :loc.countries/wau
                                      :loc.countries/xn
                                      :loc.countries/lh
                                      :loc.countries/ay
                                      :loc.countries/tz
                                      :loc.countries/so
                                      :loc.countries/nhu
                                      :loc.countries/xra
                                      :loc.countries/xxk
                                      :loc.countries/dcu
                                      :loc.countries/riu
                                      :loc.countries/utu
                                      :loc.countries/cb
                                      :loc.countries/mv
                                      :loc.countries/gr
                                      :loc.countries/xc
                                      :loc.countries/an
                                      :loc.countries/vi
                                      :loc.countries/ji
                                      :loc.countries/to
                                      :loc.countries/ho
                                      :loc.countries/ly
                                      :loc.countries/sd
                                      :loc.countries/wf
                                      :loc.countries/cau
                                      :loc.countries/bv
                                      :loc.countries/mk
                                      :loc.countries/gg
                                      :loc.countries/em
                                      :loc.countries/fj
                                      :loc.countries/wyu
                                      :loc.countries/ua
                                      :loc.countries/kyu
                                      :loc.countries/bcc
                                      :loc.countries/ir
                                      :loc.countries/ch
                                      :loc.countries/sx
                                      :loc.countries/rm
                                      :loc.countries/at
                                      :loc.countries/jo
                                      :loc.countries/tu
                                      :loc.countries/hu
                                      :loc.countries/sj
                                      :loc.countries/mq
                                      :loc.countries/gm
                                      :loc.countries/rb
                                      :loc.countries/ai
                                      :loc.countries/es
                                      :loc.countries/ph
                                      :loc.countries/cy
                                      :loc.countries/nn
                                      :loc.countries/bf
                                      :loc.countries/fp
                                      :loc.countries/ug
                                      :loc.countries/nju
                                      :loc.countries/aru
                                      :loc.countries/msu
                                      :loc.countries/vau
                                      :loc.countries/sdu
                                      :loc.countries/gb
                                      :loc.countries/wlk
                                      :loc.countries/xo
                                      :loc.countries/li
                                      :loc.countries/py
                                      :loc.countries/dk
                                      :loc.countries/mf
                                      :loc.countries/sp
                                      :loc.countries/cc
                                      :loc.countries/im
                                      :loc.countries/mw
                                      :loc.countries/gs
                                      :loc.countries/xd
                                      :loc.countries/rh
                                      :loc.countries/ao
                                      :loc.countries/pn
                                      :loc.countries/se
                                      :loc.countries/bl
                                      :loc.countries/abc
                                      :loc.countries/bw
                                      :loc.countries/ml
                                      :loc.countries/gh
                                      :loc.countries/pc
                                      :loc.countries/lo
                                      :loc.countries/ba
                                      :loc.countries/fk
                                      :loc.countries/dq
                                      :loc.countries/nyu
                                      :loc.countries/kg
                                      :loc.countries/ec
                                      :loc.countries/is
                                      :loc.countries/ci
                                      :loc.countries/sy
                                      :loc.countries/gy
                                      :loc.countries/xj
                                      :loc.countries/au
                                      :loc.countries/vp
                                      :loc.countries/tv
                                      :loc.countries/nz
                                      :loc.countries/br
                                      :loc.countries/mr
                                      :loc.countries/aj
                                      :loc.countries/ve
                                      :loc.countries/et
                                      :loc.countries/je
                                      :loc.countries/tk
                                      :loc.countries/no
                                      :loc.countries/xoa
                                      :loc.countries/lu
                                      :loc.countries/bg
                                      :loc.countries/aku
                                      :loc.countries/ncu
                                      :loc.countries/ohu
                                      :loc.countries/wiu
                                      :loc.countries/uy
                                      :loc.countries/txu
                                      :loc.countries/co
                                      :loc.countries/iy
                                      :loc.countries/xp
                                      :loc.countries/mau
                                      :loc.countries/mg
                                      :loc.countries/sq
                                      :loc.countries/ws
                                      :loc.countries/snc
                                      :loc.countries/ntc
                                      :loc.countries/cd
                                      :loc.countries/mx
                                      :loc.countries/gt
                                      :loc.countries/xe
                                      :loc.countries/po
                                      :loc.countries/nu
                                      :loc.countries/aca
                                      :loc.countries/sf
                                      :loc.countries/bm
                                      :loc.countries/un
                                      :loc.countries/mnu
                                      :loc.countries/onc
                                      :loc.countries/bx
                                      :loc.countries/ic
                                      :loc.countries/mm
                                      :loc.countries/gi
                                      :loc.countries/ae
                                      :loc.countries/pau
                                      :loc.countries/cu
                                      :loc.countries/ykc
                                      :loc.countries/xv
                                      :loc.countries/bb
                                      :loc.countries/qa
                                      :loc.countries/dr
                                      :loc.countries/uc
                                      :loc.countries/ctu
                                      :loc.countries/cj
                                      :loc.countries/it
                                      :loc.countries/sz
                                      :loc.countries/wvu
                                      :loc.countries/gz
                                      :loc.countries/xk
                                      :loc.countries/le
                                      :loc.countries/fa
                                      :loc.countries/sl
                                      :loc.countries/bs
                                      :loc.countries/nkc
                                      :loc.countries/quc
                                      :loc.countries/vtu
                                      :loc.countries/ii
                                      :loc.countries/go
                                      :loc.countries/tl
                                      :loc.countries/np
                                      :loc.countries/lv
                                      :loc.countries/sa
                                      :loc.countries/bh
                                      :loc.countries/fr
                                      :loc.countries/meu
                                      :loc.countries/azu
                                      :loc.countries/stk
                                      :loc.countries/gd
                                      :loc.countries/kn
                                      :loc.countries/uz
                                      :loc.countries/ta
                                      :loc.countries/idu
                                      :loc.countries/ne
                                      :loc.countries/ru
                                      :loc.countries/fg
                                      :loc.countries/dm
                                      :loc.countries/sr
                                      :loc.countries/pic
                                      :loc.countries/io
                                      :loc.countries/ce
                                      :loc.countries/su
                                      :loc.countries/my
                                      :loc.countries/gu
                                      :loc.countries/xf
                                      :loc.countries/aq
                                      :loc.countries/pp
                                      :loc.countries/tr
                                      :loc.countries/gau
                                      :loc.countries/sg
                                      :loc.countries/bn
                                      :loc.countries/xxc
                                      :loc.countries/af
                                      :loc.countries/pe
                                      :loc.countries/ja
                                      :loc.countries/cv
                                      :loc.countries/tg
                                      :loc.countries/fm],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "MARC Countries list identifies current national entities, states of the United States, provinces and territories of Canada and Australia, divisions of the United Kingdom, and internationally recognized dependencies. The list's codes are two- or three-character lowercase alphabetic strings that serve as identifiers. The MARC country codes are not the same as the ISO 3166 country codes, although the lists are entity-compatible so that a simple translation could relate codes for the same entity. The records for the codes contain references to the equivalent ISO 3166 codes. The list contains over 350 discrete codes. This list is also searchable at: MARC Code List for Countries.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MARC List for Countries"},
   :skos/changeNote {:cs/changeReason "modified",
                     :cs/createdDate #inst "2011-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.vocabulary/countries,
                     :rdf/type :cs/ChangeSet},
   :skos/hasTopConcept [:loc.countries/sq
                        :loc.countries/mj
                        :loc.countries/sg
                        :loc.countries/rh
                        :loc.countries/ao
                        :loc.countries/nw
                        :loc.countries/gg
                        :loc.countries/fk
                        :loc.countries/wea
                        :loc.countries/xx
                        :loc.countries/qa
                        :loc.countries/gw
                        :loc.countries/ie
                        :loc.countries/vra
                        :loc.countries/ai
                        :loc.countries/vau
                        :loc.countries/quc
                        :loc.countries/wk
                        :loc.countries/fj
                        :loc.countries/iv
                        :loc.countries/stk
                        :loc.countries/ru
                        :loc.countries/flu
                        :loc.countries/idu
                        :loc.countries/ilu
                        :loc.countries/aca
                        :loc.countries/kyu
                        :loc.countries/xj
                        :loc.countries/xga
                        :loc.countries/pr
                        :loc.countries/sf
                        :loc.countries/mm
                        :loc.countries/po
                        :loc.countries/is
                        :loc.countries/aru
                        :loc.countries/up
                        :loc.countries/hiu
                        :loc.countries/vm
                        :loc.countries/mx
                        :loc.countries/sm
                        :loc.countries/nu
                        :loc.countries/gm
                        :loc.countries/oku
                        :loc.countries/wj
                        :loc.countries/tv
                        :loc.countries/ts
                        :loc.countries/cu
                        :loc.countries/cr
                        :loc.countries/nkc
                        :loc.countries/dr
                        :loc.countries/onc
                        :loc.countries/nl
                        :loc.countries/fp
                        :loc.countries/ir
                        :loc.countries/bi
                        :loc.countries/co
                        :loc.countries/mbc
                        :loc.countries/ykc
                        :loc.countries/pau
                        :loc.countries/ua
                        :loc.countries/sx
                        :loc.countries/cd
                        :loc.countries/nsc
                        :loc.countries/bw
                        :loc.countries/abc
                        :loc.countries/mz
                        :loc.countries/dq
                        :loc.countries/au
                        :loc.countries/xl
                        :loc.countries/to
                        :loc.countries/hm
                        :loc.countries/ph
                        :loc.countries/xxc
                        :loc.countries/su
                        :loc.countries/bt
                        :loc.countries/an
                        :loc.countries/nz
                        :loc.countries/ncu
                        :loc.countries/tl
                        :loc.countries/pc
                        :loc.countries/gy
                        :loc.countries/gv
                        :loc.countries/xb
                        :loc.countries/sc
                        :loc.countries/iy
                        :loc.countries/fi
                        :loc.countries/wyu
                        :loc.countries/miu
                        :loc.countries/ug
                        :loc.countries/mo
                        :loc.countries/sz
                        :loc.countries/tz
                        :loc.countries/gh
                        :loc.countries/ec
                        :loc.countries/mc
                        :loc.countries/cy
                        :loc.countries/wvu
                        :loc.countries/es
                        :loc.countries/aj
                        :loc.countries/meu
                        :loc.countries/aku
                        :loc.countries/xf
                        :loc.countries/tu
                        :loc.countries/pn
                        :loc.countries/ti
                        :loc.countries/io
                        :loc.countries/my
                        :loc.countries/ch
                        :loc.countries/iau
                        :loc.countries/vc
                        :loc.countries/si
                        :loc.countries/bp
                        :loc.countries/bf
                        :loc.countries/sp
                        :loc.countries/xp
                        :loc.countries/cau
                        :loc.countries/nfc
                        :loc.countries/am
                        :loc.countries/lau
                        :loc.countries/rw
                        :loc.countries/jm
                        :loc.countries/ce
                        :loc.countries/rm
                        :loc.countries/at
                        :loc.countries/ke
                        :loc.countries/ck
                        :loc.countries/enk
                        :loc.countries/xoa
                        :loc.countries/xna
                        :loc.countries/xk
                        :loc.countries/fs
                        :loc.countries/pg
                        :loc.countries/mtu
                        :loc.countries/azu
                        :loc.countries/ss
                        :loc.countries/ml
                        :loc.countries/aq
                        :loc.countries/fm
                        :loc.countries/bl
                        :loc.countries/tk
                        :loc.countries/lv
                        :loc.countries/ls
                        :loc.countries/cj
                        :loc.countries/msu
                        :loc.countries/np
                        :loc.countries/nuc
                        :loc.countries/ko
                        :loc.countries/xv
                        :loc.countries/sr
                        :loc.countries/gu
                        :loc.countries/vb
                        :loc.countries/le
                        :loc.countries/nvu
                        :loc.countries/ag
                        :loc.countries/cx
                        :loc.countries/ea
                        :loc.countries/uv
                        :loc.countries/er
                        :loc.countries/mr
                        :loc.countries/so
                        :loc.countries/aw
                        :loc.countries/go
                        :loc.countries/bcc
                        :loc.countries/xe
                        :loc.countries/sd
                        :loc.countries/gd
                        :loc.countries/pl
                        :loc.countries/kn
                        :loc.countries/ii
                        :loc.countries/ws
                        :loc.countries/gau
                        :loc.countries/nn
                        :loc.countries/ku
                        :loc.countries/fr
                        :loc.countries/be
                        :loc.countries/it
                        :loc.countries/af
                        :loc.countries/xr
                        :loc.countries/xo
                        :loc.countries/gz
                        :loc.countries/nhu
                        :loc.countries/pw
                        :loc.countries/sn
                        :loc.countries/mu
                        :loc.countries/oru
                        :loc.countries/bb
                        :loc.countries/fa
                        :loc.countries/nbu
                        :loc.countries/deu
                        :loc.countries/xa
                        :loc.countries/eg
                        :loc.countries/mg
                        :loc.countries/ndu
                        :loc.countries/za
                        :loc.countries/sw
                        :loc.countries/ji
                        :loc.countries/ca
                        :loc.countries/ft
                        :loc.countries/bv
                        :loc.countries/riu
                        :loc.countries/th
                        :loc.countries/pf
                        :loc.countries/lu
                        :loc.countries/cl
                        :loc.countries/qea
                        :loc.countries/inu
                        :loc.countries/ksu
                        :loc.countries/xd
                        :loc.countries/uz
                        :loc.countries/no
                        :loc.countries/mf
                        :loc.countries/ntc
                        :loc.countries/scu
                        :loc.countries/bh
                        :loc.countries/mnu
                        :loc.countries/st
                        :loc.countries/gt
                        :loc.countries/sh
                        :loc.countries/ot
                        :loc.countries/bu
                        :loc.countries/bo
                        :loc.countries/aa
                        :loc.countries/jo
                        :loc.countries/je
                        :loc.countries/dcu
                        :loc.countries/xc
                        :loc.countries/pk
                        :loc.countries/gb
                        :loc.countries/utu
                        :loc.countries/ve
                        :loc.countries/se
                        :loc.countries/mp
                        :loc.countries/br
                        :loc.countries/mw
                        :loc.countries/gp
                        :loc.countries/py
                        :loc.countries/dk
                        :loc.countries/ba
                        :loc.countries/ctu
                        :loc.countries/cg
                        :loc.countries/kg
                        :loc.countries/ohu
                        :loc.countries/xn
                        :loc.countries/sj
                        :loc.countries/cw
                        :loc.countries/un
                        :loc.countries/mv
                        :loc.countries/gs
                        :loc.countries/bn
                        :loc.countries/nik
                        :loc.countries/tg
                        :loc.countries/ye
                        :loc.countries/im
                        :loc.countries/pe
                        :loc.countries/lo
                        :loc.countries/cf
                        :loc.countries/nr
                        :loc.countries/hu
                        :loc.countries/wau
                        :loc.countries/wiu
                        :loc.countries/bg
                        :loc.countries/cm
                        :loc.countries/alu
                        :loc.countries/xs
                        :loc.countries/gr
                        :loc.countries/em
                        :loc.countries/ho
                        :loc.countries/nyu
                        :loc.countries/et
                        :loc.countries/as
                        :loc.countries/nju
                        :loc.countries/ay
                        :loc.countries/xra
                        :loc.countries/tr
                        :loc.countries/wf
                        :loc.countries/kz
                        :loc.countries/cq
                        :loc.countries/nmu
                        :loc.countries/vtu
                        :loc.countries/vp
                        :loc.countries/sy
                        :loc.countries/nx
                        :loc.countries/ja
                        :loc.countries/bx
                        :loc.countries/ta
                        :loc.countries/li
                        :loc.countries/mq
                        :loc.countries/dm
                        :loc.countries/lh
                        :loc.countries/sa
                        :loc.countries/ly
                        :loc.countries/fg
                        :loc.countries/ng
                        :loc.countries/sdu
                        :loc.countries/tnu
                        :loc.countries/xh
                        :loc.countries/xm
                        :loc.countries/bs
                        :loc.countries/ae
                        :loc.countries/pp
                        :loc.countries/sl
                        :loc.countries/snc
                        :loc.countries/cv
                        :loc.countries/gl
                        :loc.countries/ht
                        :loc.countries/iq
                        :loc.countries/kv
                        :loc.countries/pic
                        :loc.countries/xxk
                        :loc.countries/re
                        :loc.countries/cc
                        :loc.countries/bm
                        :loc.countries/ic
                        :loc.countries/mou
                        :loc.countries/mdu
                        :loc.countries/vi
                        :loc.countries/rb
                        :loc.countries/nq
                        :loc.countries/gi
                        :loc.countries/cou
                        :loc.countries/bd
                        :loc.countries/ne
                        :loc.countries/mau
                        :loc.countries/uc
                        :loc.countries/tc
                        :loc.countries/txu
                        :loc.countries/mk
                        :loc.countries/cb
                        :loc.countries/lb
                        :loc.countries/ci
                        :loc.countries/xxu
                        :loc.countries/tma
                        :loc.countries/uy
                        :loc.countries/wlk]})
