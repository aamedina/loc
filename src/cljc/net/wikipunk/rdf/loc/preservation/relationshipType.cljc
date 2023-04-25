(ns net.wikipunk.rdf.loc.preservation.relationshipType
  "http://id.loc.gov/vocabulary/preservation/relationshipType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/relationshipType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.relationshipType"
    "http://id.loc.gov/vocabulary/preservation/relationshipType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.relationshipType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/relationshipType/"}
  (:refer-clojure :exclude [ref str]))

(def dep
  "A relationship where one object is dependent on another object. This exists when an object requires another object to support its function, delivery, rendering, execution, or the coherence of its content. This may happen, for example, when a content file requires specific software or hardware to be rendered; similarly, when an environment object depends on other environment objects; or when a content file, depends on another file, such as its font definition or stylesheet"
  {:db/ident :loc.preservation.relationshipType/dep,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.relationshipType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "dependency",
   :madsrdf/code "dep",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship where one object is dependent on another object. This exists when an object requires another object to support its function, delivery, rendering, execution, or the coherence of its content. This may happen, for example, when a content file requires specific software or hardware to be rendered; similarly, when an environment object depends on other environment objects; or when a content file, depends on another file, such as its font definition or stylesheet"},
   :madsrdf/hasNarrowerAuthority [:loc.preservation.relationshipSubType/dpe
                                  :loc.preservation.relationshipSubType/idp
                                  :loc.preservation.relationshipSubType/icw
                                  :loc.preservation.relationshipSubType/req
                                  :loc.preservation.relationshipSubType/irq],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.relationshipType/dlc,
                     :cs/subjectOfChange :loc.preservation.relationshipType/dep,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship where one object is dependent on another object. This exists when an object requires another object to support its function, delivery, rendering, execution, or the coherence of its content. This may happen, for example, when a content file requires specific software or hardware to be rendered; similarly, when an environment object depends on other environment objects; or when a content file, depends on another file, such as its font definition or stylesheet"},
   :skos/inScheme [:loc.preservation/relationshipType
                   :loc.vocabulary/preservation],
   :skos/narrower [:loc.preservation.relationshipSubType/icw
                   :loc.preservation.relationshipSubType/idp
                   :loc.preservation.relationshipSubType/irq
                   :loc.preservation.relationshipSubType/dpe
                   :loc.preservation.relationshipSubType/req],
   :skos/notation "dep",
   :skos/prefLabel "dependency"})

(def der
  "A relationship in which one object is the result of a replication or transformation performed on the related object. The intellectual content of the resulting object is the same, but the object's instantiation, and possibly its format, are different. This also applies to disk images, which are replications of the contents of a disk."
  {:db/ident :loc.preservation.relationshipType/der,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "derivation",
   :madsrdf/code "der",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship in which one object is the result of a replication or transformation performed on the related object. The intellectual content of the resulting object is the same, but the object's instantiation, and possibly its format, are different. This also applies to disk images, which are replications of the contents of a disk."},
   :madsrdf/hasNarrowerAuthority [:loc.preservation.relationshipSubType/cmt
                                  :loc.preservation.relationshipSubType/ent
                                  :loc.preservation.relationshipSubType/cmf
                                  :loc.preservation.relationshipSubType/hss
                                  :loc.preservation.relationshipSubType/iso
                                  :loc.preservation.relationshipSubType/enf],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipType],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipType/der,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipType/der,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipType/der,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship in which one object is the result of a replication or transformation performed on the related object. The intellectual content of the resulting object is the same, but the object's instantiation, and possibly its format, are different. This also applies to disk images, which are replications of the contents of a disk."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipType],
   :skos/narrower [:loc.preservation.relationshipSubType/iso
                   :loc.preservation.relationshipSubType/enf
                   :loc.preservation.relationshipSubType/cmt
                   :loc.preservation.relationshipSubType/ent
                   :loc.preservation.relationshipSubType/hss
                   :loc.preservation.relationshipSubType/cmf],
   :skos/notation "der",
   :skos/prefLabel "derivation"})

(def log
  "A conceptual relationship between environments where one environment object is more or less specific than the other."
  {:db/ident :loc.preservation.relationshipType/log,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.relationshipType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "logical",
   :madsrdf/code "log",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A conceptual relationship between environments where one environment object is more or less specific than the other."},
   :madsrdf/hasNarrowerAuthority [:loc.preservation.relationshipSubType/gen
                                  :loc.preservation.relationshipSubType/spe],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.relationshipType/dlc,
                     :cs/subjectOfChange :loc.preservation.relationshipType/log,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A conceptual relationship between environments where one environment object is more or less specific than the other."},
   :skos/inScheme [:loc.preservation/relationshipType
                   :loc.vocabulary/preservation],
   :skos/narrower [:loc.preservation.relationshipSubType/spe
                   :loc.preservation.relationshipSubType/gen],
   :skos/notation "log",
   :skos/prefLabel "logical"})

(def ref
  "A relationship in which one object provides documentation for another."
  {:db/ident :loc.preservation.relationshipType/ref,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.relationshipType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "reference",
   :madsrdf/code "ref",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship in which one object provides documentation for another."},
   :madsrdf/hasNarrowerAuthority [:loc.preservation.relationshipSubType/doc
                                  :loc.preservation.relationshipSubType/idc],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.relationshipType/dlc,
                     :cs/subjectOfChange :loc.preservation.relationshipType/ref,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship in which one object provides documentation for another."},
   :skos/inScheme [:loc.preservation/relationshipType
                   :loc.vocabulary/preservation],
   :skos/narrower [:loc.preservation.relationshipSubType/doc
                   :loc.preservation.relationshipSubType/idc],
   :skos/notation "ref",
   :skos/prefLabel "reference"})

(def rep
  "A relationship which shows the superseding of an environment object by a more recent one."
  {:db/ident :loc.preservation.relationshipType/rep,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.relationshipType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "replacement",
   :madsrdf/code "rep",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship which shows the superseding of an environment object by a more recent one."},
   :madsrdf/hasNarrowerAuthority [:loc.preservation.relationshipSubType/iss
                                  :loc.preservation.relationshipSubType/iem
                                  :loc.preservation.relationshipSubType/emu
                                  :loc.preservation.relationshipSubType/sup],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
                     :cs/creatorName     :loc.preservation.relationshipType/dlc,
                     :cs/subjectOfChange :loc.preservation.relationshipType/rep,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship which shows the superseding of an environment object by a more recent one."},
   :skos/inScheme [:loc.preservation/relationshipType
                   :loc.vocabulary/preservation],
   :skos/narrower [:loc.preservation.relationshipSubType/sup
                   :loc.preservation.relationshipSubType/emu
                   :loc.preservation.relationshipSubType/iss
                   :loc.preservation.relationshipSubType/iem],
   :skos/notation "rep",
   :skos/prefLabel "replacement"})

(def str
  "A relationship between parts of an object. This is essential preservation metadata, because if a preservation repository can't put the pieces of a digital object back together, it hasn't preserved the object."
  {:db/ident :loc.preservation.relationshipType/str,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "structural",
   :madsrdf/code "str",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between parts of an object. This is essential preservation metadata, because if a preservation repository can't put the pieces of a digital object back together, it hasn't preserved the object."},
   :madsrdf/hasNarrowerAuthority [:loc.preservation.relationshipSubType/hsi
                                  :loc.preservation.relationshipSubType/rep
                                  :loc.preservation.relationshipSubType/isp
                                  :loc.preservation.relationshipSubType/hsp
                                  :loc.preservation.relationshipSubType/isr
                                  :loc.preservation.relationshipSubType/inc
                                  :loc.preservation.relationshipSubType/isi
                                  :loc.preservation.relationshipSubType/hsr],
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipType/str,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipType/str,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between parts of an object. This is essential preservation metadata, because if a preservation repository can't put the pieces of a digital object back together, it hasn't preserved the object."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipType],
   :skos/narrower [:loc.preservation.relationshipSubType/isp
                   :loc.preservation.relationshipSubType/hsi
                   :loc.preservation.relationshipSubType/inc
                   :loc.preservation.relationshipSubType/hsr
                   :loc.preservation.relationshipSubType/hsp
                   :loc.preservation.relationshipSubType/rep
                   :loc.preservation.relationshipSubType/isr
                   :loc.preservation.relationshipSubType/isi],
   :skos/notation "str",
   :skos/prefLabel "structural"})

(def ^{:private true} relationshipType
  "A high level categorization of the nature of the relationship between this object and one or more other objects."
  {:db/ident :loc.preservation/relationshipType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.relationshipType/log
                                 :loc.preservation.relationshipType/str
                                 :loc.preservation.relationshipType/der
                                 :loc.preservation.relationshipType/rep
                                 :loc.preservation.relationshipType/ref
                                 :loc.preservation.relationshipType/dep],
   :madsrdf/hasNarrowerAuthority :loc.preservation/relationshipSubType,
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment
   "A high level categorization of the nature of the relationship between this object and one or more other objects.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship Type"},
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/relationshipType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/relationshipType,
                      :rdf/type           :cs/ChangeSet}],
   :skos/narrower :loc.preservation/relationshipSubType})