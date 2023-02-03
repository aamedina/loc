(ns net.wikipunk.rdf.loc.mediaTypes
  "http://id.loc.gov/vocabulary/mediaTypes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mediaTypes.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mediaTypes"
                       "http://id.loc.gov/vocabulary/mediaTypes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mediaTypes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mediaTypes/"})

(def c
  "Used to store electronic files and designed for use with a computer."
  {:db/ident :loc.mediaTypes/c,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer",
   :madsrdf/code "c",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Used to store electronic files and designed for use with a computer."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "electronic resource",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007/00, 337 $b - c"},
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "electronic resource",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/c,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to store electronic files and designed for use with a computer."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007/00, 337 $b - c"},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "c",
   :skos/prefLabel "computer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "electronic resource"}})

(def e
  "Used to store pairs of still images and designed for use with a viewer to give the effect of three dimensions."
  {:db/ident :loc.mediaTypes/e,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "stereographic",
   :madsrdf/code "e",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Used to store pairs of still images and designed for use with a viewer to give the effect of three dimensions."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 337 $b - e"},
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/e,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to store pairs of still images and designed for use with a viewer to give the effect of three dimensions."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 337 $b - e"},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "e",
   :skos/prefLabel "stereographic"})

(def g
  "Used to store moving or still images and designed for use with a projection device."
  {:db/ident :loc.mediaTypes/g,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "projected",
   :madsrdf/code "g",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Used to store moving or still images and designed for use with a projection device."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "projected graphic",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "motion picture",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007/00, 337 $b - g ; 007/00 - m"},
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["projected graphic" "motion picture"],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/g,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to store moving or still images and designed for use with a projection device."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value "MARC bib: 007/00, 337 $b - g ; 007/00 - m"},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "g",
   :skos/prefLabel "projected",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "projected graphic"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "motion picture"}]})

(def h
  "Used to store reduced-size images not readable to the human eye and designed for use with a reader."
  {:db/ident :loc.mediaTypes/h,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microform",
   :madsrdf/code "h",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Used to store reduced-size images not readable to the human eye and designed for use with a reader."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007/00, 337 $b - h"},
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/h,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to store reduced-size images not readable to the human eye and designed for use with a reader."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007/00, 337 $b - h"},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "h",
   :skos/prefLabel "microform"})

(def n
  "Used to store content designed to be perceived directly without the aid of an intermediating device."
  {:db/ident :loc.mediaTypes/n,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "unmediated",
   :madsrdf/code "n",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Used to store content designed to be perceived directly without the aid of an intermediating device."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "text",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "non-projected graphic",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 007/00 - t ; 007/00 - k ; 337 $b - n"},
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["text" "non-projected graphic"],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/n,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to store content designed to be perceived directly without the aid of an intermediating device."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 007/00 - t ; 007/00 - k ; 337 $b - n"},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "n",
   :skos/prefLabel "unmediated",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "text"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "non-projected graphic"}]})

(def p
  "Used to store minute objects and designed for use with a magnifying device to reveal details invisible to the naked eye."
  {:db/ident :loc.mediaTypes/p,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microscopic",
   :madsrdf/code "p",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Used to store minute objects and designed for use with a magnifying device to reveal details invisible to the naked eye."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 337 $b - p"},
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/p,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to store minute objects and designed for use with a magnifying device to reveal details invisible to the naked eye."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 337 $b - p"},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "p",
   :skos/prefLabel "microscopic"})

(def s
  "Used to store recorded sound and designed for use with an audio playback device."
  {:db/ident :loc.mediaTypes/s,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "audio",
   :madsrdf/code "s",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Used to store recorded sound and designed for use with an audio playback device."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "sound recording",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007/00, 337 $b - s"},
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "sound recording",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/s,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to store recorded sound and designed for use with an audio playback device."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007/00, 337 $b - s"},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "s",
   :skos/prefLabel "audio",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "sound recording"}})

(def v
  "Used to store moving or still images and designed for use with a playback device."
  {:db/ident :loc.mediaTypes/v,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "video",
   :madsrdf/code "v",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Used to store moving or still images and designed for use with a playback device."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "videorecording",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007/00, 337 $b - v"},
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "videorecording",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/v,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to store moving or still images and designed for use with a playback device."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007/00, 337 $b - v"},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "v",
   :skos/prefLabel "video",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "videorecording"}})

(def x
  "other"
  {:db/ident :loc.mediaTypes/x,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other",
   :madsrdf/code "x",
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/x,
    :rdf/type :cs/ChangeSet},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "x",
   :skos/prefLabel "other"})

(def z
  "unspecified"
  {:db/ident :loc.mediaTypes/z,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "unspecified",
   :madsrdf/code "z",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007/00, 337 $b - z"},
   :madsrdf/isMemberOfMADSCollection :loc.mediaTypes/collection_MediaTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mediaTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.mediaTypes/z,
    :rdf/type :cs/ChangeSet},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007/00, 337 $b - z"},
   :skos/inScheme :loc.vocabulary/mediaTypes,
   :skos/notation "z",
   :skos/prefLabel "unspecified"})

(def ^{:private true} mediaTypes
  "The Media Types Scheme is derived from a controlled list of values reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource, which is principally used in RDA cataloging."
  {:db/ident :loc.vocabulary/mediaTypes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The Media Types Scheme is derived from a controlled list of values reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource, which is principally used in RDA cataloging."},
   :madsrdf/hasMADSSchemeMember [:loc.mediaTypes/c
                                 :loc.mediaTypes/e
                                 :loc.mediaTypes/n
                                 :loc.mediaTypes/s
                                 :loc.mediaTypes/h
                                 :loc.mediaTypes/p
                                 :loc.mediaTypes/v
                                 :loc.mediaTypes/z
                                 :loc.mediaTypes/g
                                 :loc.mediaTypes/x],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Media Types Schemes"},
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2021-08-13T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2021-08-13T00:00:00/dlc",
    :cs/subjectOfChange :loc.vocabulary/mediaTypes,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The Media Types Scheme is derived from a controlled list of values reflecting the general type of intermediation device required to view, play, run, etc., the content of a resource, which is principally used in RDA cataloging."}})