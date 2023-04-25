(ns net.wikipunk.rdf.loc.geographicAreas
  "http://id.loc.gov/vocabulary/geographicAreas/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/geographicAreas.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.geographicAreas"
                       "http://id.loc.gov/vocabulary/geographicAreas/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.geographicAreas",
   :rdfa/uri          "http://id.loc.gov/vocabulary/geographicAreas/"})

(def a
  "Asia"
  {:db/ident :loc.geographicAreas/a,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Asia"},
   :madsrdf/code "a",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85008606concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/ay
                                  :loc.geographicAreas/a-mp
                                  :loc.geographicAreas/ac
                                  :loc.geographicAreas/au
                                  :loc.geographicAreas/a-jo
                                  :loc.geographicAreas/ai
                                  :loc.geographicAreas/a-bg
                                  :loc.geographicAreas/a-ir
                                  :loc.geographicAreas/a-np
                                  :loc.geographicAreas/ap
                                  :loc.geographicAreas/a-kz
                                  :loc.geographicAreas/a-cck
                                  :loc.geographicAreas/ae
                                  :loc.geographicAreas/a-th
                                  :loc.geographicAreas/a-af
                                  :loc.geographicAreas/at
                                  :loc.geographicAreas/a-cc
                                  :loc.geographicAreas/a-ph
                                  :loc.geographicAreas/a-cy
                                  :loc.geographicAreas/az
                                  :loc.geographicAreas/a-ai
                                  :loc.geographicAreas/aw
                                  :loc.geographicAreas/a-cb
                                  :loc.geographicAreas/a-bn
                                  :loc.geographicAreas/a-io
                                  :loc.geographicAreas/a-ts
                                  :loc.geographicAreas/a-ls
                                  :loc.geographicAreas/ag
                                  :loc.geographicAreas/a-ce
                                  :loc.geographicAreas/a-ii
                                  :loc.geographicAreas/ab
                                  :loc.geographicAreas/a-tu
                                  :loc.geographicAreas/a-bx
                                  :loc.geographicAreas/a-bt
                                  :loc.geographicAreas/a-aj
                                  :loc.geographicAreas/ak
                                  :loc.geographicAreas/a-nw
                                  :loc.geographicAreas/a-kg
                                  :loc.geographicAreas/a-kn
                                  :loc.geographicAreas/a-gs
                                  :loc.geographicAreas/a-ccs
                                  :loc.geographicAreas/a-ye
                                  :loc.geographicAreas/aa
                                  :loc.geographicAreas/a-ba
                                  :loc.geographicAreas/ah
                                  :loc.geographicAreas/a-qa
                                  :loc.geographicAreas/a-kr
                                  :loc.geographicAreas/ar
                                  :loc.geographicAreas/am
                                  :loc.geographicAreas/a-br
                                  :loc.geographicAreas/a-is
                                  :loc.geographicAreas/a-sy
                                  :loc.geographicAreas/a-pp
                                  :loc.geographicAreas/a-ta
                                  :loc.geographicAreas/a-su
                                  :loc.geographicAreas/a-ku
                                  :loc.geographicAreas/af
                                  :loc.geographicAreas/a-ja
                                  :loc.geographicAreas/a-ccg
                                  :loc.geographicAreas/a-mk
                                  :loc.geographicAreas/a-ch
                                  :loc.geographicAreas/a-ccp
                                  :loc.geographicAreas/a-iq
                                  :loc.geographicAreas/a-ko
                                  :loc.geographicAreas/a-tk
                                  :loc.geographicAreas/ao
                                  :loc.geographicAreas/an
                                  :loc.geographicAreas/a-my
                                  :loc.geographicAreas/a-pk
                                  :loc.geographicAreas/a-si
                                  :loc.geographicAreas/a-ccy
                                  :loc.geographicAreas/as
                                  :loc.geographicAreas/a-vt
                                  :loc.geographicAreas/a-uz
                                  :loc.geographicAreas/a-le
                                  :loc.geographicAreas/a-em],
   :madsrdf/hasNarrowerExternalAuthority [:loc.countries/tu
                                          :loc.countries/ch
                                          :loc.countries/gz
                                          :loc.countries/jo
                                          :loc.countries/cb
                                          :loc.countries/my
                                          :loc.countries/ku
                                          :loc.countries/ph
                                          :loc.countries/ko
                                          :loc.countries/sy
                                          :loc.countries/mk
                                          :loc.countries/mp
                                          :loc.countries/uz
                                          :loc.countries/vm
                                          :loc.countries/su
                                          :loc.countries/bx
                                          :loc.countries/th
                                          :loc.countries/bt
                                          :loc.countries/is
                                          :loc.countries/kz
                                          :loc.countries/ls
                                          :loc.countries/pp
                                          :loc.countries/br
                                          :loc.countries/em
                                          :loc.countries/wj
                                          :loc.countries/gs
                                          :loc.countries/bg
                                          :loc.countries/ii
                                          :loc.countries/ba
                                          :loc.countries/ja
                                          :loc.countries/cc
                                          :loc.countries/kg
                                          :loc.countries/ce
                                          :loc.countries/ts
                                          :loc.countries/ai
                                          :loc.countries/pf
                                          :loc.countries/xp
                                          :loc.countries/aj
                                          :loc.countries/pk
                                          :loc.countries/le
                                          :loc.countries/ye
                                          :loc.countries/af
                                          :loc.countries/si
                                          :loc.countries/kn
                                          :loc.countries/np
                                          :loc.countries/tk
                                          :loc.countries/io
                                          :loc.countries/iq
                                          :loc.countries/ta
                                          :loc.countries/cy
                                          :loc.countries/qa
                                          :loc.countries/ir
                                          :loc.countries/iy],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor [{:madsrdf/authoritativeLabel {:rdf/language "en",
                                                  :rdf/value    "Orient"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
                    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                                  :rdf/value
                                                  "Islamic countries"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}],
   :owl/sameAs "info:lc/vocabulary/gacs/a",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/a,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85008606concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrowMatch [:loc.countries/kg
                      :loc.countries/iy
                      :loc.countries/np
                      :loc.countries/tk
                      :loc.countries/mk
                      :loc.countries/gz
                      :loc.countries/le
                      :loc.countries/gs
                      :loc.countries/bt
                      :loc.countries/si
                      :loc.countries/su
                      :loc.countries/io
                      :loc.countries/mp
                      :loc.countries/em
                      :loc.countries/bg
                      :loc.countries/my
                      :loc.countries/ba
                      :loc.countries/tu
                      :loc.countries/ja
                      :loc.countries/cc
                      :loc.countries/ye
                      :loc.countries/ku
                      :loc.countries/ch
                      :loc.countries/ko
                      :loc.countries/kz
                      :loc.countries/cb
                      :loc.countries/ts
                      :loc.countries/kn
                      :loc.countries/br
                      :loc.countries/wj
                      :loc.countries/uz
                      :loc.countries/th
                      :loc.countries/cy
                      :loc.countries/ii
                      :loc.countries/is
                      :loc.countries/af
                      :loc.countries/ta
                      :loc.countries/pk
                      :loc.countries/pf
                      :loc.countries/bx
                      :loc.countries/aj
                      :loc.countries/ce
                      :loc.countries/xp
                      :loc.countries/ir
                      :loc.countries/vm
                      :loc.countries/sy
                      :loc.countries/ai
                      :loc.countries/ls
                      :loc.countries/iq
                      :loc.countries/qa
                      :loc.countries/pp
                      :loc.countries/jo
                      :loc.countries/ph],
   :skos/narrower [:loc.geographicAreas/a-uz
                   :loc.geographicAreas/as
                   :loc.geographicAreas/a-ai
                   :loc.geographicAreas/ah
                   :loc.geographicAreas/ap
                   :loc.geographicAreas/a-ko
                   :loc.geographicAreas/a-qa
                   :loc.geographicAreas/a-mk
                   :loc.geographicAreas/a-cb
                   :loc.geographicAreas/a-ye
                   :loc.geographicAreas/a-nw
                   :loc.geographicAreas/a-ph
                   :loc.geographicAreas/a-kg
                   :loc.geographicAreas/a-tu
                   :loc.geographicAreas/a-iq
                   :loc.geographicAreas/at
                   :loc.geographicAreas/a-aj
                   :loc.geographicAreas/ay
                   :loc.geographicAreas/a-pp
                   :loc.geographicAreas/a-ta
                   :loc.geographicAreas/a-my
                   :loc.geographicAreas/a-af
                   :loc.geographicAreas/ae
                   :loc.geographicAreas/a-ii
                   :loc.geographicAreas/a-mp
                   :loc.geographicAreas/aa
                   :loc.geographicAreas/a-cc
                   :loc.geographicAreas/a-br
                   :loc.geographicAreas/am
                   :loc.geographicAreas/ai
                   :loc.geographicAreas/a-bn
                   :loc.geographicAreas/a-cy
                   :loc.geographicAreas/a-ir
                   :loc.geographicAreas/a-cck
                   :loc.geographicAreas/au
                   :loc.geographicAreas/az
                   :loc.geographicAreas/a-ba
                   :loc.geographicAreas/a-ccg
                   :loc.geographicAreas/a-ku
                   :loc.geographicAreas/af
                   :loc.geographicAreas/a-gs
                   :loc.geographicAreas/a-kz
                   :loc.geographicAreas/a-ch
                   :loc.geographicAreas/ar
                   :loc.geographicAreas/a-ccs
                   :loc.geographicAreas/ab
                   :loc.geographicAreas/a-ja
                   :loc.geographicAreas/an
                   :loc.geographicAreas/a-ls
                   :loc.geographicAreas/a-tk
                   :loc.geographicAreas/a-is
                   :loc.geographicAreas/a-np
                   :loc.geographicAreas/a-jo
                   :loc.geographicAreas/a-em
                   :loc.geographicAreas/a-ts
                   :loc.geographicAreas/a-io
                   :loc.geographicAreas/ag
                   :loc.geographicAreas/a-sy
                   :loc.geographicAreas/a-si
                   :loc.geographicAreas/a-bx
                   :loc.geographicAreas/a-kr
                   :loc.geographicAreas/ac
                   :loc.geographicAreas/a-su
                   :loc.geographicAreas/a-ccy
                   :loc.geographicAreas/a-ce
                   :loc.geographicAreas/a-bt
                   :loc.geographicAreas/a-ccp
                   :loc.geographicAreas/ao
                   :loc.geographicAreas/a-kn
                   :loc.geographicAreas/ak
                   :loc.geographicAreas/a-pk
                   :loc.geographicAreas/a-le
                   :loc.geographicAreas/a-bg
                   :loc.geographicAreas/a-th
                   :loc.geographicAreas/a-vt
                   :loc.geographicAreas/aw],
   :skos/notation "a",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Asia"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def b
  "Commonwealth countries"
  {:db/ident :loc.geographicAreas/b,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Commonwealth countries"},
   :madsrdf/code "b",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85029004concept,
   :madsrdf/hasVariant
   [{:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "Commonwealth nations"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "British Dominions"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
    {:madsrdf/variantLabel {:rdf/language "en",
                            :rdf/value    "British Commonwealth countries"},
     :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/b",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "British Commonwealth countries"}
                   {:rdf/language "en",
                    :rdf/value    "British Dominions"}
                   {:rdf/language "en",
                    :rdf/value    "Commonwealth nations"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/b,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85029004concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "b",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Commonwealth countries"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas,
   :skosxl/altLabel
   [{:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "British Dominions"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "British Commonwealth countries"}}
    {:rdf/type :skosxl/Label,
     :skosxl/literalForm {:rdf/language "en",
                          :rdf/value    "Commonwealth nations"}}]})

(def c
  "Intercontinental areas (Western Hemisphere)"
  {:db/ident :loc.geographicAreas/c,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value
                                "Intercontinental areas (Western Hemisphere)"},
   :madsrdf/code "c",
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/cl
                                  :loc.geographicAreas/cc],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/c",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/c,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrower [:loc.geographicAreas/cl :loc.geographicAreas/cc],
   :skos/notation "c",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value "Intercontinental areas (Western Hemisphere)"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def d
  "Developing countries"
  {:db/ident :loc.geographicAreas/d,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Developing countries"},
   :madsrdf/code "d",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85037341concept,
   :madsrdf/hasNarrowerAuthority :loc.geographicAreas/dd,
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Underdeveloped areas"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Emerging nations"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Third World"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/d",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Emerging nations"}
                   {:rdf/language "en",
                    :rdf/value    "Underdeveloped areas"}
                   {:rdf/language "en",
                    :rdf/value    "Third World"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/d,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85037341concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrower :loc.geographicAreas/dd,
   :skos/notation "d",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Developing countries"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value "Underdeveloped areas"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Third World"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Emerging nations"}}]})

(def e
  "Europe"
  {:db/ident :loc.geographicAreas/e,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Europe"},
   :madsrdf/code "e",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85045631concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/e-mc
                                  :loc.geographicAreas/e-rm
                                  :loc.geographicAreas/e-bn
                                  :loc.geographicAreas/ev
                                  :loc.geographicAreas/e-aa
                                  :loc.geographicAreas/er
                                  :loc.geographicAreas/e-gw
                                  :loc.geographicAreas/e-urw
                                  :loc.geographicAreas/eo
                                  :loc.geographicAreas/e-ne
                                  :loc.geographicAreas/e-ci
                                  :loc.geographicAreas/e-vc
                                  :loc.geographicAreas/e-sp
                                  :loc.geographicAreas/e-xo
                                  :loc.geographicAreas/e-gx
                                  :loc.geographicAreas/e-fr
                                  :loc.geographicAreas/ec
                                  :loc.geographicAreas/e-kv
                                  :loc.geographicAreas/e-un
                                  :loc.geographicAreas/e-bw
                                  :loc.geographicAreas/e-dk
                                  :loc.geographicAreas/e-gg
                                  :loc.geographicAreas/e-ic
                                  :loc.geographicAreas/e-sm
                                  :loc.geographicAreas/el
                                  :loc.geographicAreas/e-hu
                                  :loc.geographicAreas/e-sw
                                  :loc.geographicAreas/e-cs
                                  :loc.geographicAreas/e-urs
                                  :loc.geographicAreas/e-be
                                  :loc.geographicAreas/e-xr
                                  :loc.geographicAreas/e-xn
                                  :loc.geographicAreas/e-rb
                                  :loc.geographicAreas/e-je
                                  :loc.geographicAreas/e-lu
                                  :loc.geographicAreas/ew
                                  :loc.geographicAreas/e-ie
                                  :loc.geographicAreas/e-fi
                                  :loc.geographicAreas/e-sz
                                  :loc.geographicAreas/e-urf
                                  :loc.geographicAreas/e-it
                                  :loc.geographicAreas/e-uru
                                  :loc.geographicAreas/e-au
                                  :loc.geographicAreas/e-li
                                  :loc.geographicAreas/e-urc
                                  :loc.geographicAreas/e-urp
                                  :loc.geographicAreas/e-lh
                                  :loc.geographicAreas/e-er
                                  :loc.geographicAreas/e-ur
                                  :loc.geographicAreas/e-po
                                  :loc.geographicAreas/e-im
                                  :loc.geographicAreas/e-pl
                                  :loc.geographicAreas/es
                                  :loc.geographicAreas/e-gi
                                  :loc.geographicAreas/e-ure
                                  :loc.geographicAreas/en
                                  :loc.geographicAreas/e-xv
                                  :loc.geographicAreas/e-mm
                                  :loc.geographicAreas/e-gr
                                  :loc.geographicAreas/e-urn
                                  :loc.geographicAreas/e-an
                                  :loc.geographicAreas/ee
                                  :loc.geographicAreas/eb
                                  :loc.geographicAreas/e-mv
                                  :loc.geographicAreas/ea
                                  :loc.geographicAreas/e-lv
                                  :loc.geographicAreas/e-urk
                                  :loc.geographicAreas/e-no
                                  :loc.geographicAreas/e-bu
                                  :loc.geographicAreas/e-ge
                                  :loc.geographicAreas/ep
                                  :loc.geographicAreas/e-uk
                                  :loc.geographicAreas/e-mo
                                  :loc.geographicAreas/e-ru
                                  :loc.geographicAreas/e-yu
                                  :loc.geographicAreas/e-urr
                                  :loc.geographicAreas/ed],
   :madsrdf/hasNarrowerExternalAuthority [:loc.countries/lv
                                          :loc.countries/fi
                                          :loc.countries/sp
                                          :loc.countries/fr
                                          :loc.countries/rm
                                          :loc.countries/un
                                          :loc.countries/gi
                                          :loc.countries/ci
                                          :loc.countries/po
                                          :loc.countries/vc
                                          :loc.countries/mc
                                          :loc.countries/au
                                          :loc.countries/no
                                          :loc.countries/rb
                                          :loc.countries/ru
                                          :loc.countries/xxk
                                          :loc.countries/stk
                                          :loc.countries/bn
                                          :loc.countries/dk
                                          :loc.countries/enk
                                          :loc.countries/lu
                                          :loc.countries/im
                                          :loc.countries/wlk
                                          :loc.countries/xn
                                          :loc.countries/sm
                                          :loc.countries/er
                                          :loc.countries/hu
                                          :loc.countries/sw
                                          :loc.countries/lh
                                          :loc.countries/xo
                                          :loc.countries/gr
                                          :loc.countries/pl
                                          :loc.countries/ic
                                          :loc.countries/li
                                          :loc.countries/mo
                                          :loc.countries/ne
                                          :loc.countries/it
                                          :loc.countries/ie
                                          :loc.countries/gg
                                          :loc.countries/xv
                                          :loc.countries/an
                                          :loc.countries/mm
                                          :loc.countries/bw
                                          :loc.countries/je
                                          :loc.countries/nik
                                          :loc.countries/aa
                                          :loc.countries/kv
                                          :loc.countries/be
                                          :loc.countries/sz
                                          :loc.countries/mv
                                          :loc.countries/gw
                                          :loc.countries/xr
                                          :loc.countries/bu],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor
   [{:madsrdf/authoritativeLabel {:rdf/language "en",
                                  :rdf/value    "European Union countries"},
     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                  :rdf/value    "Rome"},
     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                  :rdf/value    "Holy Roman Empire"},
     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                  :rdf/value
                                  "European Economic Community countries"},
     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}],
   :owl/sameAs "info:lc/vocabulary/gacs/e",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/e,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85045631concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrowMatch [:loc.countries/an
                      :loc.countries/ci
                      :loc.countries/je
                      :loc.countries/fi
                      :loc.countries/ne
                      :loc.countries/dk
                      :loc.countries/au
                      :loc.countries/aa
                      :loc.countries/rb
                      :loc.countries/mm
                      :loc.countries/sz
                      :loc.countries/lv
                      :loc.countries/ie
                      :loc.countries/no
                      :loc.countries/gg
                      :loc.countries/lh
                      :loc.countries/wlk
                      :loc.countries/pl
                      :loc.countries/enk
                      :loc.countries/xo
                      :loc.countries/gr
                      :loc.countries/xv
                      :loc.countries/it
                      :loc.countries/stk
                      :loc.countries/xn
                      :loc.countries/bn
                      :loc.countries/gi
                      :loc.countries/po
                      :loc.countries/lu
                      :loc.countries/bu
                      :loc.countries/er
                      :loc.countries/ru
                      :loc.countries/hu
                      :loc.countries/gw
                      :loc.countries/rm
                      :loc.countries/mv
                      :loc.countries/sw
                      :loc.countries/un
                      :loc.countries/nik
                      :loc.countries/im
                      :loc.countries/li
                      :loc.countries/sm
                      :loc.countries/mc
                      :loc.countries/sp
                      :loc.countries/kv
                      :loc.countries/xr
                      :loc.countries/vc
                      :loc.countries/bw
                      :loc.countries/fr
                      :loc.countries/be
                      :loc.countries/xxk
                      :loc.countries/ic
                      :loc.countries/mo],
   :skos/narrower [:loc.geographicAreas/e-lv
                   :loc.geographicAreas/e-ur
                   :loc.geographicAreas/ev
                   :loc.geographicAreas/e-urr
                   :loc.geographicAreas/e-urw
                   :loc.geographicAreas/eb
                   :loc.geographicAreas/e-un
                   :loc.geographicAreas/er
                   :loc.geographicAreas/e-sp
                   :loc.geographicAreas/e-urs
                   :loc.geographicAreas/e-mv
                   :loc.geographicAreas/en
                   :loc.geographicAreas/e-gi
                   :loc.geographicAreas/e-cs
                   :loc.geographicAreas/e-ic
                   :loc.geographicAreas/e-bw
                   :loc.geographicAreas/e-je
                   :loc.geographicAreas/e-lh
                   :loc.geographicAreas/e-uru
                   :loc.geographicAreas/ep
                   :loc.geographicAreas/e-urn
                   :loc.geographicAreas/e-sm
                   :loc.geographicAreas/e-sz
                   :loc.geographicAreas/e-ge
                   :loc.geographicAreas/e-urf
                   :loc.geographicAreas/e-urk
                   :loc.geographicAreas/e-fr
                   :loc.geographicAreas/e-rm
                   :loc.geographicAreas/ew
                   :loc.geographicAreas/e-sw
                   :loc.geographicAreas/es
                   :loc.geographicAreas/e-mm
                   :loc.geographicAreas/e-urc
                   :loc.geographicAreas/e-xo
                   :loc.geographicAreas/el
                   :loc.geographicAreas/e-uk
                   :loc.geographicAreas/e-no
                   :loc.geographicAreas/eo
                   :loc.geographicAreas/e-kv
                   :loc.geographicAreas/e-ru
                   :loc.geographicAreas/e-be
                   :loc.geographicAreas/e-it
                   :loc.geographicAreas/e-au
                   :loc.geographicAreas/e-li
                   :loc.geographicAreas/ed
                   :loc.geographicAreas/e-an
                   :loc.geographicAreas/e-rb
                   :loc.geographicAreas/e-ci
                   :loc.geographicAreas/e-ure
                   :loc.geographicAreas/e-po
                   :loc.geographicAreas/e-xv
                   :loc.geographicAreas/ee
                   :loc.geographicAreas/e-dk
                   :loc.geographicAreas/e-gw
                   :loc.geographicAreas/e-lu
                   :loc.geographicAreas/e-xr
                   :loc.geographicAreas/ea
                   :loc.geographicAreas/e-bn
                   :loc.geographicAreas/e-pl
                   :loc.geographicAreas/e-im
                   :loc.geographicAreas/e-xn
                   :loc.geographicAreas/e-yu
                   :loc.geographicAreas/e-bu
                   :loc.geographicAreas/e-gr
                   :loc.geographicAreas/ec
                   :loc.geographicAreas/e-fi
                   :loc.geographicAreas/e-vc
                   :loc.geographicAreas/e-er
                   :loc.geographicAreas/e-hu
                   :loc.geographicAreas/e-urp
                   :loc.geographicAreas/e-mc
                   :loc.geographicAreas/e-ne
                   :loc.geographicAreas/e-aa
                   :loc.geographicAreas/e-ie
                   :loc.geographicAreas/e-mo
                   :loc.geographicAreas/e-gg
                   :loc.geographicAreas/e-gx],
   :skos/notation "e",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Europe"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def f
  "Africa"
  {:db/ident :loc.geographicAreas/f,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Africa"},
   :madsrdf/code "f",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85001531concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/f-cx
                                  :loc.geographicAreas/fl
                                  :loc.geographicAreas/f-mr
                                  :loc.geographicAreas/fi
                                  :loc.geographicAreas/f-eg
                                  :loc.geographicAreas/f-lb
                                  :loc.geographicAreas/f-ss
                                  :loc.geographicAreas/fz
                                  :loc.geographicAreas/f-ug
                                  :loc.geographicAreas/f-sh
                                  :loc.geographicAreas/fd
                                  :loc.geographicAreas/f-et
                                  :loc.geographicAreas/fa
                                  :loc.geographicAreas/fu
                                  :loc.geographicAreas/fr
                                  :loc.geographicAreas/f-ng
                                  :loc.geographicAreas/f-gh
                                  :loc.geographicAreas/f-cm
                                  :loc.geographicAreas/f-sj
                                  :loc.geographicAreas/ff
                                  :loc.geographicAreas/f-bs
                                  :loc.geographicAreas/f-rw
                                  :loc.geographicAreas/fc
                                  :loc.geographicAreas/f-tg
                                  :loc.geographicAreas/f-rh
                                  :loc.geographicAreas/fw
                                  :loc.geographicAreas/f-ke
                                  :loc.geographicAreas/f-ua
                                  :loc.geographicAreas/f-gm
                                  :loc.geographicAreas/f-so
                                  :loc.geographicAreas/fh
                                  :loc.geographicAreas/f-ti
                                  :loc.geographicAreas/f-cg
                                  :loc.geographicAreas/f-sg
                                  :loc.geographicAreas/f-go
                                  :loc.geographicAreas/f-sq
                                  :loc.geographicAreas/fq
                                  :loc.geographicAreas/f-tz
                                  :loc.geographicAreas/f-ml
                                  :loc.geographicAreas/f-sx
                                  :loc.geographicAreas/f-sl
                                  :loc.geographicAreas/fe
                                  :loc.geographicAreas/fb
                                  :loc.geographicAreas/f-mg
                                  :loc.geographicAreas/f-za
                                  :loc.geographicAreas/fv
                                  :loc.geographicAreas/f-uv
                                  :loc.geographicAreas/f-ae
                                  :loc.geographicAreas/f-cd
                                  :loc.geographicAreas/f-sd
                                  :loc.geographicAreas/f-pg
                                  :loc.geographicAreas/fs
                                  :loc.geographicAreas/f-sa
                                  :loc.geographicAreas/f-mu
                                  :loc.geographicAreas/f-dm
                                  :loc.geographicAreas/f-nr
                                  :loc.geographicAreas/f-iv
                                  :loc.geographicAreas/f-ao
                                  :loc.geographicAreas/fn
                                  :loc.geographicAreas/f-gv
                                  :loc.geographicAreas/fg
                                  :loc.geographicAreas/f-lo
                                  :loc.geographicAreas/f-ea
                                  :loc.geographicAreas/f-ft
                                  :loc.geographicAreas/f-cf
                                  :loc.geographicAreas/f-sf
                                  :loc.geographicAreas/f-mz
                                  :loc.geographicAreas/f-ly
                                  :loc.geographicAreas/f-mw
                                  :loc.geographicAreas/f-bd],
   :madsrdf/hasNarrowerExternalAuthority [:loc.countries/ng
                                          :loc.countries/ao
                                          :loc.countries/nr
                                          :loc.countries/lb
                                          :loc.countries/so
                                          :loc.countries/ml
                                          :loc.countries/dm
                                          :loc.countries/lo
                                          :loc.countries/sl
                                          :loc.countries/cm
                                          :loc.countries/sh
                                          :loc.countries/ly
                                          :loc.countries/go
                                          :loc.countries/mg
                                          :loc.countries/ea
                                          :loc.countries/sd
                                          :loc.countries/rh
                                          :loc.countries/sj
                                          :loc.countries/uv
                                          :loc.countries/cg
                                          :loc.countries/ss
                                          :loc.countries/iv
                                          :loc.countries/ae
                                          :loc.countries/gh
                                          :loc.countries/et
                                          :loc.countries/eg
                                          :loc.countries/mw
                                          :loc.countries/tg
                                          :loc.countries/bd
                                          :loc.countries/rw
                                          :loc.countries/sx
                                          :loc.countries/cf
                                          :loc.countries/tz
                                          :loc.countries/sa
                                          :loc.countries/mz
                                          :loc.countries/sg
                                          :loc.countries/gm
                                          :loc.countries/mu
                                          :loc.countries/za
                                          :loc.countries/ua
                                          :loc.countries/ke
                                          :loc.countries/ti
                                          :loc.countries/gv
                                          :loc.countries/bs
                                          :loc.countries/mr
                                          :loc.countries/sq
                                          :loc.countries/pg
                                          :loc.countries/ug
                                          :loc.countries/cd
                                          :loc.countries/cx
                                          :loc.countries/sf
                                          :loc.countries/ft],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor [{:madsrdf/authoritativeLabel {:rdf/language "en",
                                                  :rdf/value
                                                  "Islamic countries"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
                    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                                  :rdf/value    "Sahel"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}],
   :owl/sameAs "info:lc/vocabulary/gacs/f",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/f,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85001531concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrowMatch [:loc.countries/et
                      :loc.countries/ft
                      :loc.countries/sx
                      :loc.countries/ug
                      :loc.countries/sa
                      :loc.countries/cd
                      :loc.countries/ua
                      :loc.countries/za
                      :loc.countries/mz
                      :loc.countries/go
                      :loc.countries/ao
                      :loc.countries/cx
                      :loc.countries/nr
                      :loc.countries/bs
                      :loc.countries/ng
                      :loc.countries/ke
                      :loc.countries/sh
                      :loc.countries/rh
                      :loc.countries/ml
                      :loc.countries/bd
                      :loc.countries/sl
                      :loc.countries/lb
                      :loc.countries/gm
                      :loc.countries/rw
                      :loc.countries/sg
                      :loc.countries/gv
                      :loc.countries/eg
                      :loc.countries/so
                      :loc.countries/sf
                      :loc.countries/pg
                      :loc.countries/ss
                      :loc.countries/mw
                      :loc.countries/sj
                      :loc.countries/ea
                      :loc.countries/mr
                      :loc.countries/ae
                      :loc.countries/lo
                      :loc.countries/gh
                      :loc.countries/ti
                      :loc.countries/iv
                      :loc.countries/cg
                      :loc.countries/ly
                      :loc.countries/sq
                      :loc.countries/mg
                      :loc.countries/mu
                      :loc.countries/uv
                      :loc.countries/cf
                      :loc.countries/tg
                      :loc.countries/sd
                      :loc.countries/tz
                      :loc.countries/dm
                      :loc.countries/cm],
   :skos/narrower [:loc.geographicAreas/f-so
                   :loc.geographicAreas/fs
                   :loc.geographicAreas/f-gm
                   :loc.geographicAreas/fu
                   :loc.geographicAreas/f-ss
                   :loc.geographicAreas/ff
                   :loc.geographicAreas/f-ea
                   :loc.geographicAreas/f-bs
                   :loc.geographicAreas/f-et
                   :loc.geographicAreas/f-sa
                   :loc.geographicAreas/f-lb
                   :loc.geographicAreas/fq
                   :loc.geographicAreas/f-rh
                   :loc.geographicAreas/f-mu
                   :loc.geographicAreas/fl
                   :loc.geographicAreas/f-rw
                   :loc.geographicAreas/f-ke
                   :loc.geographicAreas/f-sl
                   :loc.geographicAreas/fh
                   :loc.geographicAreas/f-ug
                   :loc.geographicAreas/f-gv
                   :loc.geographicAreas/f-ml
                   :loc.geographicAreas/f-za
                   :loc.geographicAreas/f-cf
                   :loc.geographicAreas/f-eg
                   :loc.geographicAreas/fc
                   :loc.geographicAreas/fw
                   :loc.geographicAreas/f-ti
                   :loc.geographicAreas/f-cx
                   :loc.geographicAreas/f-pg
                   :loc.geographicAreas/f-mg
                   :loc.geographicAreas/fr
                   :loc.geographicAreas/f-sj
                   :loc.geographicAreas/f-mw
                   :loc.geographicAreas/fn
                   :loc.geographicAreas/f-sf
                   :loc.geographicAreas/f-ua
                   :loc.geographicAreas/f-mr
                   :loc.geographicAreas/f-ng
                   :loc.geographicAreas/fe
                   :loc.geographicAreas/f-gh
                   :loc.geographicAreas/f-iv
                   :loc.geographicAreas/f-nr
                   :loc.geographicAreas/fa
                   :loc.geographicAreas/f-go
                   :loc.geographicAreas/f-tz
                   :loc.geographicAreas/f-sg
                   :loc.geographicAreas/f-cm
                   :loc.geographicAreas/f-uv
                   :loc.geographicAreas/fg
                   :loc.geographicAreas/fz
                   :loc.geographicAreas/f-sx
                   :loc.geographicAreas/f-ae
                   :loc.geographicAreas/fb
                   :loc.geographicAreas/fv
                   :loc.geographicAreas/f-dm
                   :loc.geographicAreas/f-sq
                   :loc.geographicAreas/f-cd
                   :loc.geographicAreas/f-lo
                   :loc.geographicAreas/f-mz
                   :loc.geographicAreas/fi
                   :loc.geographicAreas/f-ft
                   :loc.geographicAreas/f-sh
                   :loc.geographicAreas/f-ao
                   :loc.geographicAreas/f-cg
                   :loc.geographicAreas/f-bd
                   :loc.geographicAreas/fd
                   :loc.geographicAreas/f-ly
                   :loc.geographicAreas/f-tg
                   :loc.geographicAreas/f-sd],
   :skos/notation "f",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Africa"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def h
  "French Community"
  {:db/ident :loc.geographicAreas/h,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "French Community"},
   :madsrdf/code "h",
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value
                                                "Communauté francaise"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "French Union"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/h",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Communauté francaise"}
                   {:rdf/language "en",
                    :rdf/value    "French Union"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/h,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "h",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "French Community"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "French Union"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value
                                           "Communauté francaise"}}]})

(def i
  "Indian Ocean"
  {:db/ident :loc.geographicAreas/i,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Indian Ocean"},
   :madsrdf/code "i",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85064984concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/i-re
                                  :loc.geographicAreas/i-xb
                                  :loc.geographicAreas/i-se
                                  :loc.geographicAreas/i-xc
                                  :loc.geographicAreas/i-fs
                                  :loc.geographicAreas/i-my
                                  :loc.geographicAreas/i-hm
                                  :loc.geographicAreas/i-bi
                                  :loc.geographicAreas/i-mf
                                  :loc.geographicAreas/i-xa
                                  :loc.geographicAreas/i-cq],
   :madsrdf/hasNarrowerExternalAuthority [:loc.countries/xa
                                          :loc.countries/ot
                                          :loc.countries/mf
                                          :loc.countries/bi
                                          :loc.countries/se
                                          :loc.countries/xc
                                          :loc.countries/fs
                                          :loc.countries/cq
                                          :loc.countries/re
                                          :loc.countries/xb
                                          :loc.countries/hm],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor [{:madsrdf/authoritativeLabel
                     {:rdf/language "en",
                      :rdf/value    "Islands of the Indian Ocean"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
                    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                                  :rdf/value    "Timor Sea"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}],
   :owl/sameAs "info:lc/vocabulary/gacs/i",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/i,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85064984concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrowMatch [:loc.countries/xb
                      :loc.countries/xc
                      :loc.countries/bi
                      :loc.countries/mf
                      :loc.countries/ot
                      :loc.countries/re
                      :loc.countries/cq
                      :loc.countries/se
                      :loc.countries/hm
                      :loc.countries/xa
                      :loc.countries/fs],
   :skos/narrower [:loc.geographicAreas/i-hm
                   :loc.geographicAreas/i-mf
                   :loc.geographicAreas/i-se
                   :loc.geographicAreas/i-my
                   :loc.geographicAreas/i-bi
                   :loc.geographicAreas/i-xa
                   :loc.geographicAreas/i-fs
                   :loc.geographicAreas/i-xb
                   :loc.geographicAreas/i-re
                   :loc.geographicAreas/i-xc
                   :loc.geographicAreas/i-cq],
   :skos/notation "i",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Indian Ocean"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def l
  "Atlantic Ocean"
  {:db/ident :loc.geographicAreas/l,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Atlantic Ocean"},
   :madsrdf/code "l",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85009201concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/ln
                                  :loc.geographicAreas/ls],
   :madsrdf/hasNarrowerExternalAuthority [:loc.countries/xj
                                          :loc.countries/xs
                                          :loc.countries/fa
                                          :loc.countries/bv
                                          :loc.countries/bm
                                          :loc.countries/cv
                                          :loc.countries/fk],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor {:madsrdf/authoritativeLabel {:rdf/language "en",
                                                 :rdf/value
                                                 "Islands of the Atlantic"},
                    :rdf/type [:madsrdf/Authority :madsrdf/Geographic]},
   :owl/sameAs "info:lc/vocabulary/gacs/l",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/l,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85009201concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrowMatch [:loc.countries/xj
                      :loc.countries/bv
                      :loc.countries/fk
                      :loc.countries/cv
                      :loc.countries/fa
                      :loc.countries/xs
                      :loc.countries/bm],
   :skos/narrower [:loc.geographicAreas/ln :loc.geographicAreas/ls],
   :skos/notation "l",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Atlantic Ocean"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def m
  "Intercontinental areas (Eastern Hemisphere)"
  {:db/ident :loc.geographicAreas/m,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value
                                "Intercontinental areas (Eastern Hemisphere)"},
   :madsrdf/code "m",
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/ma
                                  :loc.geographicAreas/mr
                                  :loc.geographicAreas/mb
                                  :loc.geographicAreas/mm
                                  :loc.geographicAreas/me],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/m",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/m,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrower [:loc.geographicAreas/mr
                   :loc.geographicAreas/mm
                   :loc.geographicAreas/ma
                   :loc.geographicAreas/me
                   :loc.geographicAreas/mb],
   :skos/notation "m",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value "Intercontinental areas (Eastern Hemisphere)"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def n
  "North America"
  {:db/ident :loc.geographicAreas/n,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "North America"},
   :madsrdf/code "n",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85092455concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/n-usn
                                  :loc.geographicAreas/n-usu
                                  :loc.geographicAreas/n-ust
                                  :loc.geographicAreas/n-usm
                                  :loc.geographicAreas/n-usl
                                  :loc.geographicAreas/n-gl
                                  :loc.geographicAreas/n-uss
                                  :loc.geographicAreas/n-use
                                  :loc.geographicAreas/nw
                                  :loc.geographicAreas/n-usr
                                  :loc.geographicAreas/nm
                                  :loc.geographicAreas/n-cnm
                                  :loc.geographicAreas/n-cnp
                                  :loc.geographicAreas/n-usc
                                  :loc.geographicAreas/n-usp
                                  :loc.geographicAreas/nc
                                  :loc.geographicAreas/n-cnh
                                  :loc.geographicAreas/n-uso
                                  :loc.geographicAreas/n-usa
                                  :loc.geographicAreas/nl
                                  :loc.geographicAreas/nr
                                  :loc.geographicAreas/n-mx
                                  :loc.geographicAreas/np
                                  :loc.geographicAreas/n-xl
                                  :loc.geographicAreas/n-cn
                                  :loc.geographicAreas/n-us],
   :madsrdf/hasNarrowerExternalAuthority [:loc.countries/flu
                                          :loc.countries/idu
                                          :loc.countries/nvu
                                          :loc.countries/nyu
                                          :loc.countries/scu
                                          :loc.countries/mou
                                          :loc.countries/cau
                                          :loc.countries/ykc
                                          :loc.countries/nmu
                                          :loc.countries/xxu
                                          :loc.countries/bcc
                                          :loc.countries/snc
                                          :loc.countries/nkc
                                          :loc.countries/txu
                                          :loc.countries/kyu
                                          :loc.countries/mdu
                                          :loc.countries/miu
                                          :loc.countries/nuc
                                          :loc.countries/wvu
                                          :loc.countries/wyu
                                          :loc.countries/mau
                                          :loc.countries/nfc
                                          :loc.countries/dcu
                                          :loc.countries/quc
                                          :loc.countries/mbc
                                          :loc.countries/oru
                                          :loc.countries/oku
                                          :loc.countries/xl
                                          :loc.countries/ohu
                                          :loc.countries/lau
                                          :loc.countries/aru
                                          :loc.countries/ncu
                                          :loc.countries/azu
                                          :loc.countries/alu
                                          :loc.countries/hiu
                                          :loc.countries/mtu
                                          :loc.countries/xxc
                                          :loc.countries/cou
                                          :loc.countries/msu
                                          :loc.countries/aku
                                          :loc.countries/nsc
                                          :loc.countries/abc
                                          :loc.countries/meu
                                          :loc.countries/pau
                                          :loc.countries/tnu
                                          :loc.countries/vau
                                          :loc.countries/pic
                                          :loc.countries/nju
                                          :loc.countries/inu
                                          :loc.countries/wau
                                          :loc.countries/nhu
                                          :loc.countries/wiu
                                          :loc.countries/iau
                                          :loc.countries/riu
                                          :loc.countries/ntc
                                          :loc.countries/mx
                                          :loc.countries/nbu
                                          :loc.countries/onc
                                          :loc.countries/ilu
                                          :loc.countries/mnu
                                          :loc.countries/utu
                                          :loc.countries/gau
                                          :loc.countries/deu
                                          :loc.countries/ctu
                                          :loc.countries/vtu
                                          :loc.countries/ndu
                                          :loc.countries/sdu
                                          :loc.countries/ksu
                                          :loc.countries/gl],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor [{:madsrdf/authoritativeLabel {:rdf/language "en",
                                                  :rdf/value    "America"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
                    {:madsrdf/authoritativeLabel
                     {:rdf/language "en",
                      :rdf/value    "Pacific Coast (North America)"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
                    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                                  :rdf/value    "New France"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}],
   :owl/sameAs "info:lc/vocabulary/gacs/n",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/n,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85092455concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrowMatch [:loc.countries/inu
                      :loc.countries/ilu
                      :loc.countries/ctu
                      :loc.countries/xxc
                      :loc.countries/nyu
                      :loc.countries/cou
                      :loc.countries/oru
                      :loc.countries/tnu
                      :loc.countries/snc
                      :loc.countries/pic
                      :loc.countries/wyu
                      :loc.countries/kyu
                      :loc.countries/iau
                      :loc.countries/lau
                      :loc.countries/meu
                      :loc.countries/alu
                      :loc.countries/mtu
                      :loc.countries/bcc
                      :loc.countries/mou
                      :loc.countries/nmu
                      :loc.countries/nfc
                      :loc.countries/cau
                      :loc.countries/mdu
                      :loc.countries/nuc
                      :loc.countries/flu
                      :loc.countries/gau
                      :loc.countries/nvu
                      :loc.countries/wiu
                      :loc.countries/nju
                      :loc.countries/ohu
                      :loc.countries/nhu
                      :loc.countries/hiu
                      :loc.countries/mau
                      :loc.countries/utu
                      :loc.countries/aru
                      :loc.countries/nkc
                      :loc.countries/deu
                      :loc.countries/xxu
                      :loc.countries/mbc
                      :loc.countries/onc
                      :loc.countries/quc
                      :loc.countries/mnu
                      :loc.countries/vtu
                      :loc.countries/idu
                      :loc.countries/ykc
                      :loc.countries/scu
                      :loc.countries/ntc
                      :loc.countries/pau
                      :loc.countries/mx
                      :loc.countries/dcu
                      :loc.countries/riu
                      :loc.countries/ndu
                      :loc.countries/wvu
                      :loc.countries/vau
                      :loc.countries/nsc
                      :loc.countries/abc
                      :loc.countries/txu
                      :loc.countries/ncu
                      :loc.countries/gl
                      :loc.countries/ksu
                      :loc.countries/sdu
                      :loc.countries/aku
                      :loc.countries/oku
                      :loc.countries/xl
                      :loc.countries/miu
                      :loc.countries/azu
                      :loc.countries/msu
                      :loc.countries/wau
                      :loc.countries/nbu],
   :skos/narrower [:loc.geographicAreas/n-mx
                   :loc.geographicAreas/nm
                   :loc.geographicAreas/n-cnp
                   :loc.geographicAreas/n-usc
                   :loc.geographicAreas/n-usu
                   :loc.geographicAreas/n-xl
                   :loc.geographicAreas/n-cn
                   :loc.geographicAreas/n-usl
                   :loc.geographicAreas/n-usn
                   :loc.geographicAreas/nc
                   :loc.geographicAreas/n-usr
                   :loc.geographicAreas/nl
                   :loc.geographicAreas/np
                   :loc.geographicAreas/n-us
                   :loc.geographicAreas/n-usa
                   :loc.geographicAreas/nw
                   :loc.geographicAreas/n-use
                   :loc.geographicAreas/n-usp
                   :loc.geographicAreas/n-cnm
                   :loc.geographicAreas/n-ust
                   :loc.geographicAreas/nr
                   :loc.geographicAreas/n-uso
                   :loc.geographicAreas/n-uss
                   :loc.geographicAreas/n-cnh
                   :loc.geographicAreas/n-gl
                   :loc.geographicAreas/n-usm],
   :skos/notation "n",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "North America"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def p
  "Pacific Ocean"
  {:db/ident :loc.geographicAreas/p,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Pacific Ocean"},
   :madsrdf/code "p",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85096476concept,
   :madsrdf/hasNarrowerAuthority
   [:loc.geographicAreas/po :loc.geographicAreas/pn :loc.geographicAreas/ps],
   :madsrdf/hasNarrowerExternalAuthority [:loc.countries/xe
                                          :loc.countries/nn
                                          :loc.countries/fj
                                          :loc.countries/tl
                                          :loc.countries/pc
                                          :loc.countries/fp
                                          :loc.countries/cw
                                          :loc.countries/tv
                                          :loc.countries/nl
                                          :loc.countries/as
                                          :loc.countries/to
                                          :loc.countries/wf
                                          :loc.countries/up
                                          :loc.countries/xh
                                          :loc.countries/ws
                                          :loc.countries/pw
                                          :loc.countries/fm
                                          :loc.countries/ji
                                          :loc.countries/xf
                                          :loc.countries/gb
                                          :loc.countries/wk
                                          :loc.countries/nw
                                          :loc.countries/gu
                                          :loc.countries/bp
                                          :loc.countries/nu],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor {:madsrdf/authoritativeLabel {:rdf/language "en",
                                                 :rdf/value    "Pacific Area"},
                    :rdf/type [:madsrdf/Authority :madsrdf/Geographic]},
   :owl/sameAs "info:lc/vocabulary/gacs/p",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/p,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85096476concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrowMatch [:loc.countries/fm
                      :loc.countries/gb
                      :loc.countries/fp
                      :loc.countries/nu
                      :loc.countries/as
                      :loc.countries/ji
                      :loc.countries/to
                      :loc.countries/pc
                      :loc.countries/cw
                      :loc.countries/nn
                      :loc.countries/xh
                      :loc.countries/ws
                      :loc.countries/wk
                      :loc.countries/tl
                      :loc.countries/xe
                      :loc.countries/bp
                      :loc.countries/pw
                      :loc.countries/nl
                      :loc.countries/up
                      :loc.countries/fj
                      :loc.countries/gu
                      :loc.countries/tv
                      :loc.countries/wf
                      :loc.countries/nw
                      :loc.countries/xf],
   :skos/narrower
   [:loc.geographicAreas/po :loc.geographicAreas/ps :loc.geographicAreas/pn],
   :skos/notation "p",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Pacific Ocean"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def q
  "Cold regions"
  {:db/ident :loc.geographicAreas/q,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Cold regions"},
   :madsrdf/code "q",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85027923concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/q",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/q,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85027923concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "q",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Cold regions"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def r
  "Arctic Ocean | Arctic regions"
  {:db/ident :loc.geographicAreas/r,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Arctic Ocean | Arctic regions"},
   :madsrdf/code "r",
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "North Pole"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Arctic Ocean"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Arctic regions"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor
   [{:madsrdf/authoritativeLabel {:rdf/language "en",
                                  :rdf/value    "Beaufort Sea"},
     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                  :rdf/value    "Polar regions"},
     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                  :rdf/value    "Barents Sea"},
     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                  :rdf/value    "Northwest Passage"},
     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}
    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                  :rdf/value    "Northeast Passage"},
     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}],
   :owl/sameAs "info:lc/vocabulary/gacs/r",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "North Pole"}
                   {:rdf/language "en",
                    :rdf/value    "Arctic regions"}
                   {:rdf/language "en",
                    :rdf/value    "Arctic Ocean"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/r,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "r",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Arctic Ocean | Arctic regions"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Arctic Ocean"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Arctic regions"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "North Pole"}}]})

(def s
  "South America"
  {:db/ident :loc.geographicAreas/s,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "South America"},
   :madsrdf/code "s",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85125524concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/s-ag
                                  :loc.geographicAreas/s-fg
                                  :loc.geographicAreas/s-ec
                                  :loc.geographicAreas/sp
                                  :loc.geographicAreas/sn
                                  :loc.geographicAreas/s-ve
                                  :loc.geographicAreas/s-ck
                                  :loc.geographicAreas/s-sr
                                  :loc.geographicAreas/s-py
                                  :loc.geographicAreas/s-bl
                                  :loc.geographicAreas/s-pe
                                  :loc.geographicAreas/s-uy
                                  :loc.geographicAreas/s-gy
                                  :loc.geographicAreas/s-cl
                                  :loc.geographicAreas/s-bo
                                  :loc.geographicAreas/sa],
   :madsrdf/hasNarrowerExternalAuthority [:loc.countries/bl
                                          :loc.countries/fg
                                          :loc.countries/py
                                          :loc.countries/ve
                                          :loc.countries/cl
                                          :loc.countries/ck
                                          :loc.countries/ec
                                          :loc.countries/bo
                                          :loc.countries/sr
                                          :loc.countries/gy
                                          :loc.countries/ag
                                          :loc.countries/pe
                                          :loc.countries/uy],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor {:madsrdf/authoritativeLabel {:rdf/language "en",
                                                 :rdf/value    "America"},
                    :rdf/type [:madsrdf/Authority :madsrdf/Geographic]},
   :owl/sameAs "info:lc/vocabulary/gacs/s",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/s,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85125524concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrowMatch [:loc.countries/ck
                      :loc.countries/uy
                      :loc.countries/bo
                      :loc.countries/gy
                      :loc.countries/ag
                      :loc.countries/ve
                      :loc.countries/cl
                      :loc.countries/sr
                      :loc.countries/bl
                      :loc.countries/py
                      :loc.countries/fg
                      :loc.countries/ec
                      :loc.countries/pe],
   :skos/narrower [:loc.geographicAreas/s-bl
                   :loc.geographicAreas/s-ck
                   :loc.geographicAreas/s-pe
                   :loc.geographicAreas/sp
                   :loc.geographicAreas/sa
                   :loc.geographicAreas/s-ve
                   :loc.geographicAreas/s-ag
                   :loc.geographicAreas/s-bo
                   :loc.geographicAreas/s-gy
                   :loc.geographicAreas/s-ec
                   :loc.geographicAreas/s-cl
                   :loc.geographicAreas/sn
                   :loc.geographicAreas/s-uy
                   :loc.geographicAreas/s-sr
                   :loc.geographicAreas/s-py
                   :loc.geographicAreas/s-fg],
   :skos/notation "s",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "South America"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def t
  "Antarctic Ocean | Antarctica"
  {:db/ident :loc.geographicAreas/t,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Antarctic Ocean | Antarctica"},
   :madsrdf/code "t",
   :madsrdf/hasVariant [{:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Antarctic regions"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value "Antarctic Ocean"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "Antarctica"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}
                        {:madsrdf/variantLabel {:rdf/language "en",
                                                :rdf/value    "South Pole"},
                         :rdf/type [:madsrdf/Variant :madsrdf/Geographic]}],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor [:loc.geographicAreas/lsfk
                    {:madsrdf/authoritativeLabel {:rdf/language "en",
                                                  :rdf/value "Polar regions"},
                     :rdf/type [:madsrdf/Authority :madsrdf/Geographic]}],
   :owl/sameAs "info:lc/vocabulary/gacs/t",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel [{:rdf/language "en",
                    :rdf/value    "Antarctic Ocean"}
                   {:rdf/language "en",
                    :rdf/value    "Antarctic regions"}
                   {:rdf/language "en",
                    :rdf/value    "Antarctica"}
                   {:rdf/language "en",
                    :rdf/value    "South Pole"}],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/t,
                     :rdf/type           :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "t",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Antarctic Ocean | Antarctica"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas,
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Antarctic Ocean"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "South Pole"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Antarctic regions"}}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm {:rdf/language "en",
                                           :rdf/value    "Antarctica"}}]})

(def u
  "Australasia"
  {:db/ident :loc.geographicAreas/u,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Australasia"},
   :madsrdf/code "u",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85009573concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/u-atn
                                  :loc.geographicAreas/u-atc
                                  :loc.geographicAreas/u-nz
                                  :loc.geographicAreas/u-cs
                                  :loc.geographicAreas/u-at
                                  :loc.geographicAreas/u-ate
                                  :loc.geographicAreas/u-ac],
   :madsrdf/hasNarrowerExternalAuthority [:loc.countries/at
                                          :loc.countries/nz
                                          :loc.countries/aca
                                          :loc.countries/xga
                                          :loc.countries/qea
                                          :loc.countries/tma
                                          :loc.countries/xna
                                          :loc.countries/xra
                                          :loc.countries/vra
                                          :loc.countries/wea
                                          :loc.countries/xoa
                                          :loc.countries/nx],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/u",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/u,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85009573concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrowMatch [:loc.countries/tma
                      :loc.countries/vra
                      :loc.countries/qea
                      :loc.countries/xoa
                      :loc.countries/nz
                      :loc.countries/xga
                      :loc.countries/xna
                      :loc.countries/at
                      :loc.countries/xra
                      :loc.countries/wea
                      :loc.countries/aca
                      :loc.countries/nx],
   :skos/narrower [:loc.geographicAreas/u-atn
                   :loc.geographicAreas/u-nz
                   :loc.geographicAreas/u-atc
                   :loc.geographicAreas/u-ate
                   :loc.geographicAreas/u-at
                   :loc.geographicAreas/u-cs
                   :loc.geographicAreas/u-ac],
   :skos/notation "u",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Australasia"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def w
  "Tropics"
  {:db/ident :loc.geographicAreas/w,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Tropics"},
   :madsrdf/code "w",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85138064concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/useFor {:madsrdf/authoritativeLabel {:rdf/language "en",
                                                 :rdf/value    "Equator"},
                    :rdf/type [:madsrdf/Authority :madsrdf/Geographic]},
   :owl/sameAs "info:lc/vocabulary/gacs/w",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/w,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85138064concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "w",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Tropics"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def x
  "Earth"
  {:db/ident :loc.geographicAreas/x,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Earth"},
   :madsrdf/code "x",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85040427concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/xb
                                  :loc.geographicAreas/xa
                                  :loc.geographicAreas/xc
                                  :loc.geographicAreas/xd],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/x",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/x,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85040427concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrower [:loc.geographicAreas/xa
                   :loc.geographicAreas/xb
                   :loc.geographicAreas/xc
                   :loc.geographicAreas/xd],
   :skos/notation "x",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Earth"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def zd
  "Deep space"
  {:db/ident :loc.geographicAreas/zd,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Deep space"},
   :madsrdf/code "zd",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh2008003313concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zd",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zd,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh2008003313concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zd",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Deep space"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def zju
  "Jupiter (Planet)"
  {:db/ident :loc.geographicAreas/zju,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Jupiter (Planet)"},
   :madsrdf/code "zju",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85071063concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zju",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zju,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85071063concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zju",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Jupiter (Planet)"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def zma
  "Mars (Planet)"
  {:db/ident :loc.geographicAreas/zma,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mars (Planet)"},
   :madsrdf/code "zma",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85081548concept,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Red Planet"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zma",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Red Planet"},
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zma,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85081548concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zma",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mars (Planet)"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas,
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Red Planet"}}})

(def zme
  "Mercury (Planet)"
  {:db/ident :loc.geographicAreas/zme,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Mercury (Planet)"},
   :madsrdf/code "zme",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85083791concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zme",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zme,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85083791concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zme",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Mercury (Planet)"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def zmo
  "Moon"
  {:db/ident :loc.geographicAreas/zmo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Moon"},
   :madsrdf/code "zmo",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85087107concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zmo",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zmo,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85087107concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zmo",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Moon"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def zne
  "Neptune (Planet)"
  {:db/ident :loc.geographicAreas/zne,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Neptune (Planet)"},
   :madsrdf/code "zne",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85090874concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zne",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zne,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85090874concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zne",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Neptune (Planet)"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def zo
  "Outer space"
  {:db/ident :loc.geographicAreas/zo,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Outer space"},
   :madsrdf/code "zo",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85096156concept,
   :madsrdf/hasVariant {:madsrdf/variantLabel {:rdf/language "en",
                                               :rdf/value    "Space, Outer"},
                        :rdf/type [:madsrdf/Variant :madsrdf/Geographic]},
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zo",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/altLabel {:rdf/language "en",
                   :rdf/value    "Space, Outer"},
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zo,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85096156concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zo",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Outer space"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas,
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm {:rdf/language "en",
                                          :rdf/value    "Space, Outer"}}})

(def zpl
  "Pluto (Planet)"
  {:db/ident :loc.geographicAreas/zpl,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Pluto (Planet)"},
   :madsrdf/code "zpl",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85103579concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zpl",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zpl,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85103579concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zpl",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Pluto (Planet)"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def zs
  "Solar system"
  {:db/ident :loc.geographicAreas/zs,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Solar system"},
   :madsrdf/code "zs",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85124544concept,
   :madsrdf/hasNarrowerAuthority [:loc.geographicAreas/zsa
                                  :loc.geographicAreas/zsu],
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zs",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zs,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85124544concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/narrower [:loc.geographicAreas/zsa :loc.geographicAreas/zsu],
   :skos/notation "zs",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Solar system"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def zur
  "Uranus (Planet)"
  {:db/ident :loc.geographicAreas/zur,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Uranus (Planet)"},
   :madsrdf/code "zur",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85141296concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zur",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zur,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85141296concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zur",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Uranus (Planet)"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def zve
  "Venus (Planet)"
  {:db/ident :loc.geographicAreas/zve,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "1970-01-01T05:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlcmrc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel {:rdf/language "en",
                                :rdf/value    "Venus (Planet)"},
   :madsrdf/code "zve",
   :madsrdf/hasExactExternalAuthority :loc.authorities/sh85142768concept,
   :madsrdf/isMemberOfMADSCollection
   :loc.geographicAreas/collection_PastPresentGACSEntries,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :madsrdf/isTopMemberOfMADSScheme :loc.vocabulary/geographicAreas,
   :owl/sameAs "info:lc/vocabulary/gacs/zve",
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "1970-01-01T05:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlcmrc,
                     :cs/subjectOfChange :loc.geographicAreas/zve,
                     :rdf/type           :cs/ChangeSet},
   :skos/exactMatch :loc.authorities/sh85142768concept,
   :skos/inScheme :loc.vocabulary/geographicAreas,
   :skos/notation "zve",
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Venus (Planet)"},
   :skos/topConceptOf :loc.vocabulary/geographicAreas})

(def ^{:private true} geographicAreas
  "Geographic Areas list identifies separate countries, first order political divisions of some countries, regions, geographic features, areas in outer space, and celestial bodies. The list's codes are one-to-seven lowercase alphabetic strings that serve as identifiers. The list contains over 550 discrete codes. This list is also available at: MARC Code List for Geographic Areas."
  {:db/ident :loc.vocabulary/geographicAreas,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2011-04-26T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.organizations/dlc,
                           :ri/recordStatus "modified"},
   :madsrdf/hasTopMemberOfMADSScheme [:loc.geographicAreas/x
                                      :loc.geographicAreas/n
                                      :loc.geographicAreas/l
                                      :loc.geographicAreas/zju
                                      :loc.geographicAreas/f
                                      :loc.geographicAreas/d
                                      :loc.geographicAreas/zo
                                      :loc.geographicAreas/q
                                      :loc.geographicAreas/i
                                      :loc.geographicAreas/t
                                      :loc.geographicAreas/zve
                                      :loc.geographicAreas/zne
                                      :loc.geographicAreas/zme
                                      :loc.geographicAreas/m
                                      :loc.geographicAreas/e
                                      :loc.geographicAreas/zpl
                                      :loc.geographicAreas/zur
                                      :loc.geographicAreas/u
                                      :loc.geographicAreas/zma
                                      :loc.geographicAreas/zd
                                      :loc.geographicAreas/b
                                      :loc.geographicAreas/w
                                      :loc.geographicAreas/c
                                      :loc.geographicAreas/r
                                      :loc.geographicAreas/p
                                      :loc.geographicAreas/h
                                      :loc.geographicAreas/zs
                                      :loc.geographicAreas/zmo
                                      :loc.geographicAreas/s
                                      :loc.geographicAreas/a],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "Geographic Areas list identifies separate countries, first order political divisions of some countries, regions, geographic features, areas in outer space, and celestial bodies. The list's codes are one-to-seven lowercase alphabetic strings that serve as identifiers. The list contains over 550 discrete codes. This list is also available at: MARC Code List for Geographic Areas.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MARC List for Geographic Areas"},
   :skos/changeNote {:cs/changeReason    "modified",
                     :cs/createdDate     #inst "2011-04-26T04:00:00.000-00:00",
                     :cs/creatorName     :loc.organizations/dlc,
                     :cs/subjectOfChange :loc.vocabulary/geographicAreas,
                     :rdf/type           :cs/ChangeSet},
   :skos/hasTopConcept [:loc.geographicAreas/zo
                        :loc.geographicAreas/h
                        :loc.geographicAreas/u
                        :loc.geographicAreas/q
                        :loc.geographicAreas/b
                        :loc.geographicAreas/zpl
                        :loc.geographicAreas/l
                        :loc.geographicAreas/zs
                        :loc.geographicAreas/zur
                        :loc.geographicAreas/zd
                        :loc.geographicAreas/e
                        :loc.geographicAreas/f
                        :loc.geographicAreas/s
                        :loc.geographicAreas/a
                        :loc.geographicAreas/t
                        :loc.geographicAreas/p
                        :loc.geographicAreas/zju
                        :loc.geographicAreas/zme
                        :loc.geographicAreas/zma
                        :loc.geographicAreas/zve
                        :loc.geographicAreas/i
                        :loc.geographicAreas/w
                        :loc.geographicAreas/x
                        :loc.geographicAreas/zmo
                        :loc.geographicAreas/zne
                        :loc.geographicAreas/c
                        :loc.geographicAreas/d
                        :loc.geographicAreas/r
                        :loc.geographicAreas/m
                        :loc.geographicAreas/n]})