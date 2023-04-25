(ns net.wikipunk.rdf.loc.resourceTypes
  "http://id.loc.gov/vocabulary/resourceTypes/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/resourceTypes.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.resourceTypes"
                       "http://id.loc.gov/vocabulary/resourceTypes/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.resourceTypes",
   :rdfa/uri          "http://id.loc.gov/vocabulary/resourceTypes/"}
  (:refer-clojure :exclude [not]))

(def art
  "Resource in a form intended to be perceived visually in three dimensions. Includes man-made objects as well as naturally occurring objects such as specimens mounted for viewing."
  {:db/ident :loc.resourceTypes/art,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Artifact",
   :madsrdf/code "art",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource in a form intended to be perceived visually in three dimensions. Includes man-made objects as well as naturally occurring objects such as specimens mounted for viewing."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "3-dimensional object",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "3-D object",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Physical artifact",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Physical artifact" "3-D object" "3-dimensional object"],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/art,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource in a form intended to be perceived visually in three dimensions. Includes man-made objects as well as naturally occurring objects such as specimens mounted for viewing."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "art",
   :skos/prefLabel "Artifact",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "3-D object"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "3-dimensional object"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Physical artifact"}]})

(def aud
  "Resources expressed in an audible form, including music or other sounds."
  {:db/ident :loc.resourceTypes/aud,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Audio",
   :madsrdf/code "aud",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resources expressed in an audible form, including music or other sounds."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Sound recording",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Sound recording",
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/aud,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resources expressed in an audible form, including music or other sounds."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "aud",
   :skos/prefLabel "Audio",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Sound recording"}})

(def car
  "Resource that shows spatial information, including maps, atlases, globes, digital, and other cartographic resources."
  {:db/ident :loc.resourceTypes/car,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Cartographic",
   :madsrdf/code "car",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource that shows spatial information, including maps, atlases, globes, digital, and other cartographic resources."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Map/cartography",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Map/cartography",
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/car,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource that shows spatial information, including maps, atlases, globes, digital, and other cartographic resources."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "car",
   :skos/prefLabel "Cartographic",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Map/cartography"}})

(def col
  "Aggregation of resources, generally gathered together artificially."
  {:db/ident :loc.resourceTypes/col,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Collection",
   :madsrdf/code "col",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Aggregation of resources, generally gathered together artificially."},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/col,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Aggregation of resources, generally gathered together artificially."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "col",
   :skos/prefLabel "Collection"})

(def dat
  "Data encoded in a defined structure, but not normally displayed in its raw form."
  {:db/ident :loc.resourceTypes/dat,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Dataset",
   :madsrdf/code "dat",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Data encoded in a defined structure, but not normally displayed in its raw form."},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/dat,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Data encoded in a defined structure, but not normally displayed in its raw form."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "dat",
   :skos/prefLabel "Dataset"})

(def dig
  "Resource that is intended for manipulation by a computer, accessed either directly or remotely."
  {:db/ident :loc.resourceTypes/dig,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Digital",
   :madsrdf/code "dig",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource that is intended for manipulation by a computer, accessed either directly or remotely."},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/dig,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource that is intended for manipulation by a computer, accessed either directly or remotely."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "dig",
   :skos/prefLabel "Digital"})

(def img
  "Resource expressed through line, shape, shading, etc., intended to be perceived visually as a still image or images in two dimensions."
  {:db/ident :loc.resourceTypes/img,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-05-05T04:00:00.000-00:00",
     :ri/recordContentSource :loc.resourceTypes/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate
     "\"2020-09-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :ri/recordContentSource :loc.resourceTypes/img,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Still image",
   :madsrdf/code "img",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource expressed through line, shape, shading, etc., intended to be perceived visually as a still image or images in two dimensions."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Nonprojected graphic",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel
                         "2-dimensional nonprojected graphic",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Image",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel
   ["2-dimensional nonprojected graphic" "Nonprojected graphic" "Image"],
   :skos/changeNote
   [{:cs/changeReason "modified",
     :cs/createdDate
     "\"2020-09-28T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
     :cs/creatorName :loc.resourceTypes/img,
     :cs/subjectOfChange :loc.resourceTypes/img,
     :rdf/type :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
     :cs/creatorName     :loc.resourceTypes/dlc,
     :cs/subjectOfChange :loc.resourceTypes/img,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource expressed through line, shape, shading, etc., intended to be perceived visually as a still image or images in two dimensions."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "img",
   :skos/prefLabel "Still image",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Image"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Nonprojected graphic"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm
                      "2-dimensional nonprojected graphic"}]})

(def man
  "Resource that is written in handwriting or typescript. These are generally unique resources."
  {:db/ident :loc.resourceTypes/man,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Manuscript",
   :madsrdf/code "man",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource that is written in handwriting or typescript. These are generally unique resources."},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/man,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource that is written in handwriting or typescript. These are generally unique resources."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "man",
   :skos/prefLabel "Manuscript"})

(def mix
  "Resource comprised of multiple types which is not driven by software; for instance, a manuscript collection of text, photographs and sound recordings."
  {:db/ident :loc.resourceTypes/mix,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Mixed material",
   :madsrdf/code "mix",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource comprised of multiple types which is not driven by software; for instance, a manuscript collection of text, photographs and sound recordings."},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/mix,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource comprised of multiple types which is not driven by software; for instance, a manuscript collection of text, photographs and sound recordings."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "mix",
   :skos/prefLabel "Mixed material"})

(def mov
  "Images intended to be perceived as moving, including motion pictures and video recordings."
  {:db/ident :loc.resourceTypes/mov,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Moving image",
   :madsrdf/code "mov",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Images intended to be perceived as moving, including motion pictures and video recordings."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Film/video",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Film/video/slide",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Projected medium",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Projected medium" "Film/video/slide" "Film/video"],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/mov,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Images intended to be perceived as moving, including motion pictures and video recordings."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "mov",
   :skos/prefLabel "Moving image",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Film/video"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Projected medium"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Film/video/slide"}]})

(def mul
  "Electronic resource that is a computer program or which consists of multiple media types that are software driven."
  {:db/ident :loc.resourceTypes/mul,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Multimedia",
   :madsrdf/code "mul",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Electronic resource that is a computer program or which consists of multiple media types that are software driven."},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/mul,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Electronic resource that is a computer program or which consists of multiple media types that are software driven."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "mul",
   :skos/prefLabel "Multimedia"})

(def not
  "Graphic, non-realized representations of musical works intended to be perceived visually."
  {:db/ident :loc.resourceTypes/not,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Notated music",
   :madsrdf/code "not",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Graphic, non-realized representations of musical works intended to be perceived visually."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Printed music",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Music",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Sheet music",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Sheet music" "Music" "Printed music"],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/not,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Graphic, non-realized representations of musical works intended to be perceived visually."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "not",
   :skos/prefLabel "Notated music",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Music"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Sheet music"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Printed music"}]})

(def tac
  "Resource that is intended to be perceived by touch."
  {:db/ident :loc.resourceTypes/tac,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Tactile",
   :madsrdf/code "tac",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Resource that is intended to be perceived by touch."},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/tac,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Resource that is intended to be perceived by touch."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "tac",
   :skos/prefLabel "Tactile"})

(def txt
  "Resource intended to be perceived visually and understood through the use of language in written or spoken form."
  {:db/ident :loc.resourceTypes/txt,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Text",
   :madsrdf/code "txt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Resource intended to be perceived visually and understood through the use of language in written or spoken form."},
   :madsrdf/hasVariant {:madsrdf/variantLabel "Language material",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "Language material",
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/txt,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Resource intended to be perceived visually and understood through the use of language in written or spoken form."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "txt",
   :skos/prefLabel "Text",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "Language material"}})

(def unk
  "The type of resource is unknown or undetermined."
  {:db/ident :loc.resourceTypes/unk,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2012-05-05T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.resourceTypes/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Unspecified",
   :madsrdf/code "unk",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "The type of resource is unknown or undetermined."},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "Unknown",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "Undeterminable",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/isMemberOfMADSCollection
   :loc.resourceTypes/collection_ResourceTypes,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/resourceTypes,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["Unknown" "Undeterminable"],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     :loc.resourceTypes/dlc,
                     :cs/subjectOfChange :loc.resourceTypes/unk,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The type of resource is unknown or undetermined."},
   :skos/inScheme :loc.vocabulary/resourceTypes,
   :skos/notation "unk",
   :skos/prefLabel "Unspecified",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Unknown"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "Undeterminable"}]})

(def ^{:private true} resourceTypes
  ""
  {:db/ident        :loc.vocabulary/resourceTypes,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2012-05-05T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/dlc",
    :ri/recordStatus "new"},
   :madsrdf/hasMADSSchemeMember [:loc.resourceTypes/unk
                                 :loc.resourceTypes/txt
                                 :loc.resourceTypes/dat
                                 :loc.resourceTypes/man
                                 :loc.resourceTypes/tac
                                 :loc.resourceTypes/aud
                                 :loc.resourceTypes/mix
                                 :loc.resourceTypes/mul
                                 :loc.resourceTypes/img
                                 :loc.resourceTypes/car
                                 :loc.resourceTypes/not
                                 :loc.resourceTypes/dig
                                 :loc.resourceTypes/col
                                 :loc.resourceTypes/art
                                 :loc.resourceTypes/mov],
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Resource Types Scheme"},
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2012-05-05T04:00:00.000-00:00",
                     :cs/creatorName     "https://id.loc.gov/vocabulary/dlc",
                     :cs/subjectOfChange :loc.vocabulary/resourceTypes,
                     :rdf/type           :cs/ChangeSet}})