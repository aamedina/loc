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
  "bit level preservation"
  {:db/ident :loc.preservation.preservationLevelType/blp,
   :madsrdf/authoritativeLabel "bit level preservation",
   :rdf/type :madsrdf/Authority})

(def lop
  "logical preservation"
  {:db/ident :loc.preservation.preservationLevelType/lop,
   :madsrdf/authoritativeLabel "logical preservation",
   :rdf/type :madsrdf/Authority})

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