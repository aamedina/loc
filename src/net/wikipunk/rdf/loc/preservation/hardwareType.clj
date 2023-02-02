(ns net.wikipunk.rdf.loc.preservation.hardwareType
  "http://id.loc.gov/vocabulary/preservation/hardwareType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/hardwareType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.hardwareType"
    "http://id.loc.gov/vocabulary/preservation/hardwareType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.hardwareType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/hardwareType/"})

(def inp
  "input/output device"
  {:db/ident :loc.preservation.hardwareType/inp,
   :madsrdf/authoritativeLabel "input/output device",
   :rdf/type :madsrdf/Authority})

(def mem
  "memory"
  {:db/ident :loc.preservation.hardwareType/mem,
   :madsrdf/authoritativeLabel "memory",
   :rdf/type :madsrdf/Authority})

(def pro
  "processor"
  {:db/ident :loc.preservation.hardwareType/pro,
   :madsrdf/authoritativeLabel "processor",
   :rdf/type :madsrdf/Authority})

(def sto
  "storage device"
  {:db/ident :loc.preservation.hardwareType/sto,
   :madsrdf/authoritativeLabel "storage device",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} hardwareType
  ""
  {:db/ident :loc.preservation/hardwareType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/hardwareType.rdf,
     :ri/recordStatus "deprecated"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.hardwareType/pro
                                 :loc.preservation.hardwareType/mem
                                 :loc.preservation.hardwareType/sto
                                 :loc.preservation.hardwareType/inp],
   :madsrdf/useInstead :loc.preservation/environmentFunctionType,
   :rdf/type
   [:skos/ConceptScheme :madsrdf/DeprecatedAuthority :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hardware Type (DEPRECATED)"},
   :rdfs/seeAlso
   ["http://id.loc.gov/vocabulary/preservation/environmentFunctionType"],
   :skos/changeNote [{:cs/changeReason    "deprecated",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/hardwareType.rdf,
                      :cs/subjectOfChange :loc.preservation/hardwareType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/hardwareType,
                      :rdf/type           :cs/ChangeSet}]})