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
  "The object can be rendered in this environment (i.e.the object is supported by the described environment but the repository doesn't know if it is minimum or recommended)."
  {:db/ident :loc.preservation.environmentCharacteristic/kno,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentCharacteristic/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentCharacteristic/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "known to work",
   :madsrdf/code "kno",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The object can be rendered in this environment (i.e.the object is supported by the described environment but the repository doesn't know if it is minimum or recommended)."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentCharacteristic/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentCharacteristic
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentCharacteristic/dlc,
     :cs/subjectOfChange :loc.preservation.environmentCharacteristic/kno,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentCharacteristic/dlc,
     :cs/subjectOfChange :loc.preservation.environmentCharacteristic/kno,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The object can be rendered in this environment (i.e.the object is supported by the described environment but the repository doesn't know if it is minimum or recommended)."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentCharacteristic],
   :skos/notation "kno",
   :skos/prefLabel "known to work"})

(def min
  "The least demanding (in terms of components or resources needed) environment known to work by the repository."
  {:db/ident :loc.preservation.environmentCharacteristic/min,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentCharacteristic/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentCharacteristic/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "minimum",
   :madsrdf/code "min",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The least demanding (in terms of components or resources needed) environment known to work by the repository."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentCharacteristic/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentCharacteristic
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentCharacteristic/dlc,
     :cs/subjectOfChange :loc.preservation.environmentCharacteristic/min,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentCharacteristic/dlc,
     :cs/subjectOfChange :loc.preservation.environmentCharacteristic/min,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The least demanding (in terms of components or resources needed) environment known to work by the repository."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/environmentCharacteristic],
   :skos/notation "min",
   :skos/prefLabel "minimum"})

(def rec
  "An environment preferred for optional rendering."
  {:db/ident :loc.preservation.environmentCharacteristic/rec,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentCharacteristic/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentCharacteristic/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "recommended",
   :madsrdf/code "rec",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "An environment preferred for optional rendering."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentCharacteristic/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentCharacteristic
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentCharacteristic/dlc,
     :cs/subjectOfChange :loc.preservation.environmentCharacteristic/rec,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentCharacteristic/dlc,
     :cs/subjectOfChange :loc.preservation.environmentCharacteristic/rec,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An environment preferred for optional rendering."},
   :skos/inScheme [:loc.preservation/environmentCharacteristic
                   :loc.vocabulary/preservation],
   :skos/notation "rec",
   :skos/prefLabel "recommended"})

(def uns
  "No attempt was made to provide this value."
  {:db/ident :loc.preservation.environmentCharacteristic/uns,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentCharacteristic/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.environmentCharacteristic/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "unspecified",
   :madsrdf/code "uns",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "No attempt was made to provide this value."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.environmentCharacteristic/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/environmentCharacteristic
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentCharacteristic/dlc,
     :cs/subjectOfChange :loc.preservation.environmentCharacteristic/uns,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.environmentCharacteristic/dlc,
     :cs/subjectOfChange :loc.preservation.environmentCharacteristic/uns,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value "No attempt was made to provide this value."},
   :skos/inScheme [:loc.preservation/environmentCharacteristic
                   :loc.vocabulary/preservation],
   :skos/notation "uns",
   :skos/prefLabel "unspecified"})

(def ^{:private true} environmentCharacteristic
  "Hardware/software combinations supporting use of the object."
  {:db/ident :loc.preservation/environmentCharacteristic,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
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