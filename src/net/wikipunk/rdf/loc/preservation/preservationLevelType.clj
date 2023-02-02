(ns net.wikipunk.rdf.loc.preservation.preservationLevelType
  "http://id.loc.gov/vocabulary/preservation/preservationLevelType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/preservationLevelType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.preservationLevelType"
    "http://id.loc.gov/vocabulary/preservation/preservationLevelType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.preservationLevelType",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/preservationLevelType/"})

(def blp
  "Preservation of bits, i.e. the required preservation activities to ensure that the bits remain intact and readable (as sequences of 0's and 1's)."
  {:db/ident :loc.preservation.preservationLevelType/blp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.preservationLevelType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "bit level preservation",
   :madsrdf/code "blp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Preservation of bits, i.e. the required preservation activities to ensure that the bits remain intact and readable (as sequences of 0's and 1's)."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.preservationLevelType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/preservationLevelType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/PreservationPolicy,
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
    :cs/creatorName     :loc.preservation.preservationLevelType/dlc,
    :cs/subjectOfChange :loc.preservation.preservationLevelType/blp,
    :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Preservation of bits, i.e. the required preservation activities to ensure that the bits remain intact and readable (as sequences of 0's and 1's)."},
   :skos/inScheme [:loc.preservation/preservationLevelType
                   :loc.vocabulary/preservation],
   :skos/notation "blp",
   :skos/prefLabel "bit level preservation"})

(def lop
  "Preservation of the logical part, i.e. the part of digital preservation that ensures that the bits remain understandable and usable according to the preservation purposes."
  {:db/ident :loc.preservation.preservationLevelType/lop,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.preservationLevelType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "logical preservation",
   :madsrdf/code "lop",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Preservation of the logical part, i.e. the part of digital preservation that ensures that the bits remain understandable and usable according to the preservation purposes."},
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/preservationLevelType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/PreservationPolicy,
   :skos/changeNote
   {:cs/changeReason    "new",
    :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
    :cs/creatorName     :loc.preservation.preservationLevelType/dlc,
    :cs/subjectOfChange :loc.preservation.preservationLevelType/lop,
    :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Preservation of the logical part, i.e. the part of digital preservation that ensures that the bits remain understandable and usable according to the preservation purposes."},
   :skos/inScheme [:loc.preservation/preservationLevelType
                   :loc.vocabulary/preservation],
   :skos/notation "lop",
   :skos/prefLabel "logical preservation"})

(def ^{:private true} preservationLevelType
  "The type of preservation functions expected to be applied to the Object for the preservation level."
  {:db/ident :loc.preservation/preservationLevelType,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2018-09-24T04:00:01.000-00:00",
                           :ri/recordContentSource :loc.preservation/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/hasMADSSchemeMember [:loc.preservation.preservationLevelType/blp
                                 :loc.preservation.preservationLevelType/lop],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "The type of preservation functions expected to be applied to the Object for the preservation level.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preservation Level Type"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-09-24T04:00:01.000-00:00",
                     :cs/creatorName :loc.preservation/dlc,
                     :cs/subjectOfChange
                     :loc.preservation/preservationLevelType,
                     :rdf/type :cs/ChangeSet}})