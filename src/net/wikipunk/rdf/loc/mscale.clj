(ns net.wikipunk.rdf.loc.mscale
  "http://id.loc.gov/vocabulary/mscale/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mscale.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mscale" "http://id.loc.gov/vocabulary/mscale/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mscale",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mscale/"})

(def angular
  "A dimensionless scale designation used for celestial charts"
  {:db/ident :loc.mscale/angular,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2020-06-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "angular scale",
   :madsrdf/code "angular",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A dimensionless scale designation used for celestial charts"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "255 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mscale/collection_mscale,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscale,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2020-06-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscale/angular,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A dimensionless scale designation used for celestial charts"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "255 $a"},
   :skos/inScheme :loc.vocabulary/mscale,
   :skos/notation "angular",
   :skos/prefLabel "angular scale"})

(def diff
  "A scale designation for a resource consisting of more than one image, map, etc., with different scales"
  {:db/ident :loc.mscale/diff,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-12-14T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "scales differ",
   :madsrdf/code "diff",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A scale designation for a resource consisting of more than one image, map, etc., with different scales"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "255 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mscale/collection_mscale,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscale,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-12-14T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscale/diff,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A scale designation for a resource consisting of more than one image, map, etc., with different scales"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "255 $a"},
   :skos/inScheme :loc.vocabulary/mscale,
   :skos/notation "diff",
   :skos/prefLabel "scales differ"})

(def notdeterm
  "A scale designation for a resource that cannot be expressed as a representative fraction or that uses imaginary uits of measure"
  {:db/ident :loc.mscale/notdeterm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-04-26T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "scale not determined",
   :madsrdf/code "notdeterm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A scale designation for a resource that cannot be expressed as a representative fraction or that uses imaginary uits of measure"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "255 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mscale/collection_mscale,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscale,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-04-26T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscale/notdeterm,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A scale designation for a resource that cannot be expressed as a representative fraction or that uses imaginary uits of measure"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "255 $a"},
   :skos/inScheme :loc.vocabulary/mscale,
   :skos/notation "notdeterm",
   :skos/prefLabel "scale not determined"})

(def notdrawn
  "A scale designation for a still image or three-dimensional form that is not to scale"
  {:db/ident :loc.mscale/notdrawn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-12-14T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "not drawn to scale",
   :madsrdf/code "notdrawn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A scale designation for a still image or three-dimensional form that is not to scale"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "255 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mscale/collection_mscale,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscale,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-12-14T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscale/notdrawn,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A scale designation for a still image or three-dimensional form that is not to scale"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "255 $a"},
   :skos/inScheme :loc.vocabulary/mscale,
   :skos/notation "notdrawn",
   :skos/prefLabel "not drawn to scale"})

(def notgiven
  "A scale designation when no scale is found on the resource"
  {:db/ident :loc.mscale/notgiven,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-12-14T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "scale not given",
   :madsrdf/code "notgiven",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A scale designation when no scale is found on the resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "255 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mscale/collection_mscale,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscale,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-12-14T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscale/notgiven,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A scale designation when no scale is found on the resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "255 $a"},
   :skos/inScheme :loc.vocabulary/mscale,
   :skos/notation "notgiven",
   :skos/prefLabel "scale not given"})

(def varies
  "A scale designation for a resource whose scale is variable across the resource, when the range of values cannot be determined"
  {:db/ident :loc.mscale/varies,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-12-14T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "scale varies",
   :madsrdf/code "varies",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A scale designation for a resource whose scale is variable across the resource, when the range of values cannot be determined"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "255 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mscale/collection_mscale,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mscale,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-12-14T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mscale/varies,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A scale designation for a resource whose scale is variable across the resource, when the range of values cannot be determined"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "255 $a"},
   :skos/inScheme :loc.vocabulary/mscale,
   :skos/notation "varies",
   :skos/prefLabel "scale varies"})

(def ^{:private true} mscale
  "A general designation of the lack of a ratio of the dimensions of the content of an image or three-dimensional form to the dimensions of the thing it represents"
  {:db/ident :loc.vocabulary/mscale,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-12-14T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A general designation of the lack of a ratio of the dimensions of the content of an image or three-dimensional form to the dimensions of the thing it represents"},
   :madsrdf/hasMADSSchemeMember [:loc.mscale/diff
                                 :loc.mscale/notdrawn
                                 :loc.mscale/varies
                                 :loc.mscale/angular
                                 :loc.mscale/notgiven
                                 :loc.mscale/notdeterm],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scale"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-12-14T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mscale,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A general designation of the lack of a ratio of the dimensions of the content of an image or three-dimensional form to the dimensions of the thing it represents"}})