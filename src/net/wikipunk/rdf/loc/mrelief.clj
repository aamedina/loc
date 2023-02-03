(ns net.wikipunk.rdf.loc.mrelief
  "http://id.loc.gov/vocabulary/mrelief/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mrelief.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mrelief" "http://id.loc.gov/vocabulary/mrelief/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mrelief",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mrelief/"})

(def bath
  "Underwater relief (depth) shown by soundings or spot depths"
  {:db/ident :loc.mrelief/bath,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bathymetry/soundings",
   :madsrdf/code "bath",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Underwater relief (depth) shown by soundings or spot depths"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/bath,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Underwater relief (depth) shown by soundings or spot depths"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - e"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "bath",
   :skos/prefLabel "Bathymetry/soundings"})

(def cont
  "Relief shown by contours"
  {:db/ident :loc.mrelief/cont,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Contours",
   :madsrdf/code "cont",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Relief shown by contours"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/cont,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Relief shown by contours"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - a"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "cont",
   :skos/prefLabel "Contours"})

(def form
  "Relief shown by form lines"
  {:db/ident :loc.mrelief/form,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Form lines",
   :madsrdf/code "form",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Relief shown by form lines"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - f"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/form,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Relief shown by form lines"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - f"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "form",
   :skos/prefLabel "Form lines"})

(def grad
  "Relief shown by gradient or bathymetric tints"
  {:db/ident :loc.mrelief/grad,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Gradient and bathymetric tints",
   :madsrdf/code "grad",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Relief shown by gradient or bathymetric tints"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/grad,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Relief shown by gradient or bathymetric tints"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - c"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "grad",
   :skos/prefLabel "Gradient and bathymetric tints"})

(def hach
  "Relief shown by hachures -- short lines which follow the direction of maximum slope"
  {:db/ident :loc.mrelief/hach,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Hachures",
   :madsrdf/code "hach",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Relief shown by hachures -- short lines which follow the direction of maximum slope"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - d"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/hach,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relief shown by hachures -- short lines which follow the direction of maximum slope"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - d"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "hach",
   :skos/prefLabel "Hachures"})

(def isol
  "Underwater relief (depth) shown by isolines -- lines that represent constant depths"
  {:db/ident :loc.mrelief/isol,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Bathymetry/isolines",
   :madsrdf/code "isol",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Underwater relief (depth) shown by isolines -- lines that represent constant depths"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - k"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/isol,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Underwater relief (depth) shown by isolines -- lines that represent constant depths"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - k"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "isol",
   :skos/prefLabel "Bathymetry/isolines"})

(def land
  "Relief shown by land forms"
  {:db/ident :loc.mrelief/land,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Land forms",
   :madsrdf/code "land",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Relief shown by land forms"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - j"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/land,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Relief shown by land forms"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - j"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "land",
   :skos/prefLabel "Land forms"})

(def pict
  "Land forms and other topographic features shown in the correct planimetric position by pictorial symbols representing their appearance from a high oblique view"
  {:db/ident :loc.mrelief/pict,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Pictorially",
   :madsrdf/code "pict",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Land forms and other topographic features shown in the correct planimetric position by pictorial symbols representing their appearance from a high oblique view"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - i"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/pict,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Land forms and other topographic features shown in the correct planimetric position by pictorial symbols representing their appearance from a high oblique view"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - i"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "pict",
   :skos/prefLabel "Pictorially"})

(def rock
  "Relief shown by rock drawings"
  {:db/ident :loc.mrelief/rock,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Rock drawings",
   :madsrdf/code "rock",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Relief shown by rock drawings"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - m"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/rock,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Relief shown by rock drawings"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - m"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "rock",
   :skos/prefLabel "Rock drawings"})

(def shad
  "Relief shown by shading -- generally of a single color"
  {:db/ident :loc.mrelief/shad,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Shading",
   :madsrdf/code "shad",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Relief shown by shading -- generally of a single color"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/shad,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Relief shown by shading -- generally of a single color"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - b"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "shad",
   :skos/prefLabel "Shading"})

(def spot
  "Relief shown by spot heights"
  {:db/ident :loc.mrelief/spot,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-29T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Spot heights",
   :madsrdf/code "spot",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Relief shown by spot heights"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 008map/18 - g"},
   :madsrdf/isMemberOfMADSCollection :loc.mrelief/collection_mrelief,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrelief,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-29T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrelief/spot,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Relief shown by spot heights"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 008map/18 - g"},
   :skos/inScheme :loc.vocabulary/mrelief,
   :skos/notation "spot",
   :skos/prefLabel "Spot heights"})

(def ^{:private true} mrelief
  "Relief type specified on the resource"
  {:db/ident              :loc.vocabulary/mrelief,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-04-29T04:00:00.000-00:00",
                           :ri/recordContentSource
                           "https://id.loc.gov/vocabulary/organizations/dlc",
                           :ri/recordStatus "new"},
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "Relief type specified on the resource"},
   :madsrdf/hasMADSSchemeMember [:loc.mrelief/rock
                                 :loc.mrelief/pict
                                 :loc.mrelief/shad
                                 :loc.mrelief/land
                                 :loc.mrelief/cont
                                 :loc.mrelief/isol
                                 :loc.mrelief/hach
                                 :loc.mrelief/spot
                                 :loc.mrelief/form
                                 :loc.mrelief/bath
                                 :loc.mrelief/grad],
   :rdf/type              [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment          "",
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Relief"},
   :skos/changeNote       {:cs/changeReason "new",
                           :cs/createdDate #inst
                                            "2019-04-29T04:00:00.000-00:00",
                           :cs/creatorName
                           "https://id.loc.gov/vocabulary/organizations/dlc",
                           :cs/subjectOfChange :loc.vocabulary/mrelief,
                           :rdf/type :cs/ChangeSet},
   :skos/definition       {:rdf/language "en",
                           :rdf/value "Relief type specified on the resource"}})