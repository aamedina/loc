(ns net.wikipunk.rdf.loc.preservation.softwareType
  "http://id.loc.gov/vocabulary/preservation/softwareType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/softwareType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.softwareType"
    "http://id.loc.gov/vocabulary/preservation/softwareType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.softwareType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/softwareType/"})

(def anc
  "ancillary"
  {:db/ident :loc.preservation.softwareType/anc,
   :madsrdf/authoritativeLabel "ancillary",
   :rdf/type :madsrdf/Authority})

(def dri
  "driver"
  {:db/ident :loc.preservation.softwareType/dri,
   :madsrdf/authoritativeLabel "driver",
   :rdf/type :madsrdf/Authority})

(def ops
  "operating system"
  {:db/ident :loc.preservation.softwareType/ops,
   :madsrdf/authoritativeLabel "operating system",
   :rdf/type :madsrdf/Authority})

(def ren
  "renderer"
  {:db/ident :loc.preservation.softwareType/ren,
   :madsrdf/authoritativeLabel "renderer",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} softwareType
  "The class or category of software required to render or use the object."
  {:db/ident :loc.preservation/softwareType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/softwareType.rdf,
     :ri/recordStatus "deprecated"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.softwareType/anc
                                 :loc.preservation.softwareType/ren
                                 :loc.preservation.softwareType/ops
                                 :loc.preservation.softwareType/dri],
   :madsrdf/useInstead :loc.preservation/environmentFunctionType,
   :rdf/type
   [:madsrdf/DeprecatedAuthority :madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment
   "The class or category of software required to render or use the object.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Software Type (DEPRECATED)"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/softwareType.rdf,
                      :cs/subjectOfChange :loc.preservation/softwareType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/softwareType,
                      :rdf/type           :cs/ChangeSet}]})