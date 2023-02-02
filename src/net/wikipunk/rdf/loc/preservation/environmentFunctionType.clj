(ns net.wikipunk.rdf.loc.preservation.environmentFunctionType
  "http://id.loc.gov/vocabulary/preservation/environmentFunctionType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentFunctionType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.environmentFunctionType"
    "http://id.loc.gov/vocabulary/preservation/environmentFunctionType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.environmentFunctionType",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/environmentFunctionType/"})

(def anc
  "ancillary"
  {:db/ident :loc.preservation.environmentFunctionType/anc,
   :madsrdf/authoritativeLabel "ancillary",
   :rdf/type :madsrdf/Authority})

(def chi
  "chip"
  {:db/ident :loc.preservation.environmentFunctionType/chi,
   :madsrdf/authoritativeLabel "chip",
   :rdf/type :madsrdf/Authority})

(def dri
  "driver"
  {:db/ident :loc.preservation.environmentFunctionType/dri,
   :madsrdf/authoritativeLabel "driver",
   :rdf/type :madsrdf/Authority})

(def haa
  "hardware architecture"
  {:db/ident :loc.preservation.environmentFunctionType/haa,
   :madsrdf/authoritativeLabel "hardware architecture",
   :rdf/type :madsrdf/Authority})

(def hap
  "hardware peripheral"
  {:db/ident :loc.preservation.environmentFunctionType/hap,
   :madsrdf/authoritativeLabel "hardware peripheral",
   :rdf/type :madsrdf/Authority})

(def har
  "hardware"
  {:db/ident :loc.preservation.environmentFunctionType/har,
   :madsrdf/authoritativeLabel "hardware",
   :rdf/type :madsrdf/Authority})

(def inp
  "input/output device"
  {:db/ident :loc.preservation.environmentFunctionType/inp,
   :madsrdf/authoritativeLabel "input/output device",
   :rdf/type :madsrdf/Authority})

(def mem
  "memory"
  {:db/ident :loc.preservation.environmentFunctionType/mem,
   :madsrdf/authoritativeLabel "memory",
   :rdf/type :madsrdf/Authority})

(def ops
  "operating system"
  {:db/ident :loc.preservation.environmentFunctionType/ops,
   :madsrdf/authoritativeLabel "operating system",
   :rdf/type :madsrdf/Authority})

(def plu
  "plugin"
  {:db/ident :loc.preservation.environmentFunctionType/plu,
   :madsrdf/authoritativeLabel "plugin",
   :rdf/type :madsrdf/Authority})

(def pro
  "processor"
  {:db/ident :loc.preservation.environmentFunctionType/pro,
   :madsrdf/authoritativeLabel "processor",
   :rdf/type :madsrdf/Authority})

(def ren
  "renderer"
  {:db/ident :loc.preservation.environmentFunctionType/ren,
   :madsrdf/authoritativeLabel "renderer",
   :rdf/type :madsrdf/Authority})

(def soa
  "software application"
  {:db/ident :loc.preservation.environmentFunctionType/soa,
   :madsrdf/authoritativeLabel "software application",
   :rdf/type :madsrdf/Authority})

(def sof
  "software"
  {:db/ident :loc.preservation.environmentFunctionType/sof,
   :madsrdf/authoritativeLabel "software",
   :rdf/type :madsrdf/Authority})

(def sol
  "software library"
  {:db/ident :loc.preservation.environmentFunctionType/sol,
   :madsrdf/authoritativeLabel "software library",
   :rdf/type :madsrdf/Authority})

(def sto
  "storage device"
  {:db/ident :loc.preservation.environmentFunctionType/sto,
   :madsrdf/authoritativeLabel "storage device",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} environmentFunctionType
  "A description of the environment at a given level within the environmental stack."
  {:db/ident :loc.preservation/environmentFunctionType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.environmentFunctionType/pro
                                 :loc.preservation.environmentFunctionType/chi
                                 :loc.preservation.environmentFunctionType/mem
                                 :loc.preservation.environmentFunctionType/plu
                                 :loc.preservation.environmentFunctionType/har
                                 :loc.preservation.environmentFunctionType/ops
                                 :loc.preservation.environmentFunctionType/haa
                                 :loc.preservation.environmentFunctionType/hap
                                 :loc.preservation.environmentFunctionType/anc
                                 :loc.preservation.environmentFunctionType/sol
                                 :loc.preservation.environmentFunctionType/ren
                                 :loc.preservation.environmentFunctionType/sto
                                 :loc.preservation.environmentFunctionType/sof
                                 :loc.preservation.environmentFunctionType/inp
                                 :loc.preservation.environmentFunctionType/dri
                                 :loc.preservation.environmentFunctionType/soa],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "A description of the environment at a given level within the environmental stack.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Environment Function Type"},
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/environmentFunctionType,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/environmentFunctionType,
     :rdf/type           :cs/ChangeSet}]})