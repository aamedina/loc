(ns net.wikipunk.rdf.loc.preservation.environmentCharacteristic
  "http://id.loc.gov/vocabulary/preservation/environmentCharacteristic/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentCharacteristic.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.environmentCharacteristic"
    "http://id.loc.gov/vocabulary/preservation/environmentCharacteristic/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.environmentCharacteristic",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/environmentCharacteristic/"}
  (:refer-clojure :exclude [min]))

(def kno
  "known to work"
  {:db/ident :loc.preservation.environmentCharacteristic/kno,
   :madsrdf/authoritativeLabel "known to work",
   :rdf/type :madsrdf/Authority})

(def min
  "minimum"
  {:db/ident :loc.preservation.environmentCharacteristic/min,
   :madsrdf/authoritativeLabel "minimum",
   :rdf/type :madsrdf/Authority})

(def rec
  "recommended"
  {:db/ident :loc.preservation.environmentCharacteristic/rec,
   :madsrdf/authoritativeLabel "recommended",
   :rdf/type :madsrdf/Authority})

(def uns
  "unspecified"
  {:db/ident :loc.preservation.environmentCharacteristic/uns,
   :madsrdf/authoritativeLabel "unspecified",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} environmentCharacteristic
  "Hardware/software combinations supporting use of the object."
  {:db/ident :loc.preservation/environmentCharacteristic,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember
   [:loc.preservation.environmentCharacteristic/kno
    :loc.preservation.environmentCharacteristic/rec
    :loc.preservation.environmentCharacteristic/uns
    :loc.preservation.environmentCharacteristic/min],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "Hardware/software combinations supporting use of the object.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Environment Characteristic"},
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/environmentCharacteristic,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/environmentCharacteristic,
     :rdf/type           :cs/ChangeSet}]})