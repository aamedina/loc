(ns net.wikipunk.rdf.loc.preservation.relationshipSubType
  "http://id.loc.gov/vocabulary/preservation/relationshipSubType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/relationshipSubType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.relationshipSubType"
    "http://id.loc.gov/vocabulary/preservation/relationshipSubType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.relationshipSubType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/relationshipSubType/"}
  (:refer-clojure :exclude [inc]))

(def cmf
  "A relationship between an object that has been encoded in a way so that it can be stored or transmitted in significantly fewer bits. Has a reciprocal relationship of compressedTo."
  {:db/ident :loc.preservation.relationshipSubType/cmf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "compressed from",
   :madsrdf/code "cmf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an object that has been encoded in a way so that it can be stored or transmitted in significantly fewer bits. Has a reciprocal relationship of compressedTo."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/der,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/der,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2012-08-01T04:00:01.000-00:00",
                     :cs/creatorName :loc.preservation.relationshipSubType/dlc,
                     :cs/subjectOfChange
                     :loc.preservation.relationshipSubType/cmf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an object that has been encoded in a way so that it can be stored or transmitted in significantly fewer bits. Has a reciprocal relationship of compressedTo."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "cmf",
   :skos/prefLabel "compressed from"})

(def cmt
  "A relationship between an object and another object that is encoded it in a way that it can be stored or transmitted in signficantly fewer bits. Has a reciprocal relationship of compressedFrom"
  {:db/ident :loc.preservation.relationshipSubType/cmt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "compressed to",
   :madsrdf/code "cmt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an object and another object that is encoded it in a way that it can be stored or transmitted in signficantly fewer bits. Has a reciprocal relationship of compressedFrom"},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/der,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/der,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2012-08-01T04:00:01.000-00:00",
                     :cs/creatorName :loc.preservation.relationshipSubType/dlc,
                     :cs/subjectOfChange
                     :loc.preservation.relationshipSubType/cmt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an object and another object that is encoded it in a way that it can be stored or transmitted in signficantly fewer bits. Has a reciprocal relationship of compressedFrom"},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "cmt",
   :skos/prefLabel "compressed to"})

(def doc
  "A relationship between information about an environment object and the environment object itself. For instance, a user manual has a \"documents\" relationship to the Open Office software application. Has a reciprocal relationship of isDocumentedIn."
  {:db/ident :loc.preservation.relationshipSubType/doc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "documents",
   :madsrdf/code "doc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between information about an environment object and the environment object itself. For instance, a user manual has a \"documents\" relationship to the Open Office software application. Has a reciprocal relationship of isDocumentedIn."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/ref,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/ref,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/doc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/doc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between information about an environment object and the environment object itself. For instance, a user manual has a \"documents\" relationship to the Open Office software application. Has a reciprocal relationship of isDocumentedIn."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "doc",
   :skos/prefLabel "documents"})

(def dpe
  "A relationship between an environment object that is run on another environment object, e.g an operating system that runs a piece of software. Has a reciprocal relationship with isDeployedOn."
  {:db/ident :loc.preservation.relationshipSubType/dpe,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "deploys",
   :madsrdf/code "dpe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object that is run on another environment object, e.g an operating system that runs a piece of software. Has a reciprocal relationship with isDeployedOn."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/dep,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/dep,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/dpe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/dpe,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object that is run on another environment object, e.g an operating system that runs a piece of software. Has a reciprocal relationship with isDeployedOn."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "dpe",
   :skos/prefLabel "deploys"})

(def emu
  "A relationship between an environment object and another where the described environment is used to emulate another. For instance the environment \"QEMU version 1.2\" emulates \"IBM x86 PC\". Has a reciprocal relationship of isEmulatedBy."
  {:db/ident :loc.preservation.relationshipSubType/emu,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:02.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "emulates",
   :madsrdf/code "emu",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described environment is used to emulate another. For instance the environment \"QEMU version 1.2\" emulates \"IBM x86 PC\". Has a reciprocal relationship of isEmulatedBy."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/rep,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/rep,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:02.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/emu,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/emu,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described environment is used to emulate another. For instance the environment \"QEMU version 1.2\" emulates \"IBM x86 PC\". Has a reciprocal relationship of isEmulatedBy."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "emu",
   :skos/prefLabel "emulates"})

(def enf
  "A relationship between an object and another object from which it was derived that is encoded it in a way that it is in an unrecognizable (encrypted) form. Has a reciprocal relationship of encryptedTo."
  {:db/ident :loc.preservation.relationshipSubType/enf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "encrypted from",
   :madsrdf/code "enf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an object and another object from which it was derived that is encoded it in a way that it is in an unrecognizable (encrypted) form. Has a reciprocal relationship of encryptedTo."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/der,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/der,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2012-08-01T04:00:01.000-00:00",
                     :cs/creatorName :loc.preservation.relationshipSubType/dlc,
                     :cs/subjectOfChange
                     :loc.preservation.relationshipSubType/enf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an object and another object from which it was derived that is encoded it in a way that it is in an unrecognizable (encrypted) form. Has a reciprocal relationship of encryptedTo."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "enf",
   :skos/prefLabel "encrypted from"})

(def ent
  "A relationship between an object and another object in an encrypted form, which is encoded it in a way that it is in an unrecognizable form. Has a reciprocal relationship of encryptedFrom."
  {:db/ident :loc.preservation.relationshipSubType/ent,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
    :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "encrypted to",
   :madsrdf/code "ent",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an object and another object in an encrypted form, which is encoded it in a way that it is in an unrecognizable form. Has a reciprocal relationship of encryptedFrom."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/der,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/der,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2012-08-01T04:00:01.000-00:00",
                     :cs/creatorName :loc.preservation.relationshipSubType/dlc,
                     :cs/subjectOfChange
                     :loc.preservation.relationshipSubType/ent,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an object and another object in an encrypted form, which is encoded it in a way that it is in an unrecognizable form. Has a reciprocal relationship of encryptedFrom."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "ent",
   :skos/prefLabel "encrypted to"})

(def gen
  "A relationship between an environment object and another where the described object is a more general description than the more specific related environment. Has a reciprocal relationship of specializes."
  {:db/ident :loc.preservation.relationshipSubType/gen,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "generalizes",
   :madsrdf/code "gen",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object is a more general description than the more specific related environment. Has a reciprocal relationship of specializes."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/log,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/log,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/gen,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/gen,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object is a more general description than the more specific related environment. Has a reciprocal relationship of specializes."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "gen",
   :skos/prefLabel "generalizes"})

(def hsi
  "The object shares a common parent with the related object. For example, a word-processing document could have been used to create derivative files in PDF and XML formats; these objects are different representations of the same Intellectual Entity with parent-child relationships to the source word-processing file. The PDF and XML have a sibling relationship."
  {:db/ident :loc.preservation.relationshipSubType/hsi,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "has Sibling",
   :madsrdf/code "hsi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The object shares a common parent with the related object. For example, a word-processing document could have been used to create derivative files in PDF and XML formats; these objects are different representations of the same Intellectual Entity with parent-child relationships to the source word-processing file. The PDF and XML have a sibling relationship."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/str,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/str,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hsi,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hsi,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hsi,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The object shares a common parent with the related object. For example, a word-processing document could have been used to create derivative files in PDF and XML formats; these objects are different representations of the same Intellectual Entity with parent-child relationships to the source word-processing file. The PDF and XML have a sibling relationship."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "hsi",
   :skos/prefLabel "has Sibling"})

(def hsp
  "The object contains the related object when these are the same object category. For instance, a larger Intellectual Entity has another Intellectual Entity as a part, or a compound file (e.g. archive.tar) contains another file (e.g. text.xml). Has the reciprocal relationship of isPartOf."
  {:db/ident :loc.preservation.relationshipSubType/hsp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "has Part",
   :madsrdf/code "hsp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The object contains the related object when these are the same object category. For instance, a larger Intellectual Entity has another Intellectual Entity as a part, or a compound file (e.g. archive.tar) contains another file (e.g. text.xml). Has the reciprocal relationship of isPartOf."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/str,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/str,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hsp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hsp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hsp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The object contains the related object when these are the same object category. For instance, a larger Intellectual Entity has another Intellectual Entity as a part, or a compound file (e.g. archive.tar) contains another file (e.g. text.xml). Has the reciprocal relationship of isPartOf."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "hsp",
   :skos/prefLabel "has Part"})

(def hsr
  "For a representation only, the related object is the file that must be processed first in order to render the representation. It implies that a compound object (i.e. one made up of multiple files) requires that one file be picked up first as its root to render it."
  {:db/ident :loc.preservation.relationshipSubType/hsr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "has Root",
   :madsrdf/code "hsr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "For a representation only, the related object is the file that must be processed first in order to render the representation. It implies that a compound object (i.e. one made up of multiple files) requires that one file be picked up first as its root to render it."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/str,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/str,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hsr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hsr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hsr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "For a representation only, the related object is the file that must be processed first in order to render the representation. It implies that a compound object (i.e. one made up of multiple files) requires that one file be picked up first as its root to render it."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "hsr",
   :skos/prefLabel "has Root"})

(def hss
  "A relationship in which the object is derived from the related object as a result of a transformation. For instance, an HTML file that is the product of a migration from a file encoded in the WordStar format has that Wordstar file as its source. Also applies to the relationship between the original and a disk image. Has a reciprocal relationship of isSourceOf."
  {:db/ident :loc.preservation.relationshipSubType/hss,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "has Source",
   :madsrdf/code "hss",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship in which the object is derived from the related object as a result of a transformation. For instance, an HTML file that is the product of a migration from a file encoded in the WordStar format has that Wordstar file as its source. Also applies to the relationship between the original and a disk image. Has a reciprocal relationship of isSourceOf."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/der,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/der,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hss,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hss,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/hss,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship in which the object is derived from the related object as a result of a transformation. For instance, an HTML file that is the product of a migration from a file encoded in the WordStar format has that Wordstar file as its source. Also applies to the relationship between the original and a disk image. Has a reciprocal relationship of isSourceOf."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "hss",
   :skos/prefLabel "has Source"})

(def icw
  "A relationship between an environment object and another where the described object is compatible with another environment. An environment may be deployed on another environment but it may also be compatible with other environments."
  {:db/ident :loc.preservation.relationshipSubType/icw,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "is Compatible With",
   :madsrdf/code "icw",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object is compatible with another environment. An environment may be deployed on another environment but it may also be compatible with other environments."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/dep,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/dep,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/icw,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/icw,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object is compatible with another environment. An environment may be deployed on another environment but it may also be compatible with other environments."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "icw",
   :skos/prefLabel "is Compatible With"})

(def idc
  "A relationship between an environment object and the information that documents it. Has a reciprocal relationship with documents."
  {:db/ident :loc.preservation.relationshipSubType/idc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "is Documented In",
   :madsrdf/code "idc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and the information that documents it. Has a reciprocal relationship with documents."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/ref,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/ref,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/idc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/idc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and the information that documents it. Has a reciprocal relationship with documents."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "idc",
   :skos/prefLabel "is Documented In"})

(def idp
  "A relationship between an environment object that runs on another environment object, e.g. a piece of software running on an operating system. Has a reciprocal relationship of deploys."
  {:db/ident :loc.preservation.relationshipSubType/idp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "is Deployed On",
   :madsrdf/code "idp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object that runs on another environment object, e.g. a piece of software running on an operating system. Has a reciprocal relationship of deploys."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/dep,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/dep,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/idp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/idp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object that runs on another environment object, e.g. a piece of software running on an operating system. Has a reciprocal relationship of deploys."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "idp",
   :skos/prefLabel "is Deployed On"})

(def iem
  "A relationship between an environment object and another where the described environment is emulated by another. For instance the environment \"IBM x 86 PC\" is emulated by the environment \"QEMU version 1.2\". Has a reciprocal relationship of emulates."
  {:db/ident :loc.preservation.relationshipSubType/iem,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "is Emulated By",
   :madsrdf/code "iem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described environment is emulated by another. For instance the environment \"IBM x 86 PC\" is emulated by the environment \"QEMU version 1.2\". Has a reciprocal relationship of emulates."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/rep,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/rep,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/iem,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/iem,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described environment is emulated by another. For instance the environment \"IBM x 86 PC\" is emulated by the environment \"QEMU version 1.2\". Has a reciprocal relationship of emulates."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "iem",
   :skos/prefLabel "is Emulated By"})

(def inc
  "A relationship in which the described object includes the referenced object, when objects have different object categories. For instance, a representation includes files. Has a reciprocal relationship of isIncludedIn."
  {:db/ident :loc.preservation.relationshipSubType/inc,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "includes",
   :madsrdf/code "inc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship in which the described object includes the referenced object, when objects have different object categories. For instance, a representation includes files. Has a reciprocal relationship of isIncludedIn."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/str,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/str,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/inc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/inc,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/inc,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship in which the described object includes the referenced object, when objects have different object categories. For instance, a representation includes files. Has a reciprocal relationship of isIncludedIn."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "inc",
   :skos/prefLabel "includes"})

(def irq
  "The relationship of an environment object to a file or representation, where the environment is required by the other objects to render or run. Has a reciprocal relationship of isRequiredBy."
  {:db/ident :loc.preservation.relationshipSubType/irq,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "is Required By",
   :madsrdf/code "irq",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The relationship of an environment object to a file or representation, where the environment is required by the other objects to render or run. Has a reciprocal relationship of isRequiredBy."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/dep,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/dep,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/irq,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/irq,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The relationship of an environment object to a file or representation, where the environment is required by the other objects to render or run. Has a reciprocal relationship of isRequiredBy."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "irq",
   :skos/prefLabel "is Required By"})

(def isi
  "A relationship in which the described object is included in the referenced object, when the objects have different object categories, for instance, a bitstream to a file, a file to a representation. Has a reciprocal relationship of includes."
  {:db/ident :loc.preservation.relationshipSubType/isi,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "is Included In",
   :madsrdf/code "isi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship in which the described object is included in the referenced object, when the objects have different object categories, for instance, a bitstream to a file, a file to a representation. Has a reciprocal relationship of includes."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/str,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/str,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/isi,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/isi,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/isi,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship in which the described object is included in the referenced object, when the objects have different object categories, for instance, a bitstream to a file, a file to a representation. Has a reciprocal relationship of includes."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "isi",
   :skos/prefLabel "is Included In"})

(def iso
  "The related object is a version of the source object created by a transformation. For example, an HTML file that is the product of a migration from a file encoded in the WordStar format, the Wordstar file has a \"isSourceOf\" relationship to the HTML file. Also applies to the relationship between the original and a disk image. Has a reciprocal relationship of hasSource."
  {:db/ident :loc.preservation.relationshipSubType/iso,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "is Source Of",
   :madsrdf/code "iso",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The related object is a version of the source object created by a transformation. For example, an HTML file that is the product of a migration from a file encoded in the WordStar format, the Wordstar file has a \"isSourceOf\" relationship to the HTML file. Also applies to the relationship between the original and a disk image. Has a reciprocal relationship of hasSource."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/der,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/der,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/iso,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/iso,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/iso,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The related object is a version of the source object created by a transformation. For example, an HTML file that is the product of a migration from a file encoded in the WordStar format, the Wordstar file has a \"isSourceOf\" relationship to the HTML file. Also applies to the relationship between the original and a disk image. Has a reciprocal relationship of hasSource."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "iso",
   :skos/prefLabel "is Source Of"})

(def isp
  "A relationship in which the object is contained in the related object when these are the same object category. For instance a Web page intellectual entity is part of a larger Web site intellectual entity. Has a reciprocal relationship of hasPart."
  {:db/ident :loc.preservation.relationshipSubType/isp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "is Part Of",
   :madsrdf/code "isp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship in which the object is contained in the related object when these are the same object category. For instance a Web page intellectual entity is part of a larger Web site intellectual entity. Has a reciprocal relationship of hasPart."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/str,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/relationshipSubType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/str,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/isp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/isp,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/isp,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship in which the object is contained in the related object when these are the same object category. For instance a Web page intellectual entity is part of a larger Web site intellectual entity. Has a reciprocal relationship of hasPart."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "isp",
   :skos/prefLabel "is Part Of"})

(def isr
  "A relationship in which an abstract intellectual entity is represented as a file or representation or a software agent is represented by an environment object. Has a reciprocal relationship of represents."
  {:db/ident :loc.preservation.relationshipSubType/isr,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "is Represented By",
   :madsrdf/code "isr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship in which an abstract intellectual entity is represented as a file or representation or a software agent is represented by an environment object. Has a reciprocal relationship of represents."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/str,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/str,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/isr,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/isr,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship in which an abstract intellectual entity is represented as a file or representation or a software agent is represented by an environment object. Has a reciprocal relationship of represents."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "isr",
   :skos/prefLabel "is Represented By"})

(def iss
  "A relationship between an environment object and another where the described object has been replaced by another. This allows for an audit trail of environments to be maintained. Has a reciprocal relationship of supersedes."
  {:db/ident :loc.preservation.relationshipSubType/iss,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "is Superseded By",
   :madsrdf/code "iss",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object has been replaced by another. This allows for an audit trail of environments to be maintained. Has a reciprocal relationship of supersedes."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/rep,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/rep,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/iss,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/iss,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object has been replaced by another. This allows for an audit trail of environments to be maintained. Has a reciprocal relationship of supersedes."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "iss",
   :skos/prefLabel "is Superseded By"})

(def rep
  "A relationship in which a file or representation is captured in an abstract intellectual entity description that it represents. It is a statement of what can depict or stand for the Intellectual Entity. Has a reciprocal relationship of isRepresentedBy."
  {:db/ident :loc.preservation.relationshipSubType/rep,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "represents",
   :madsrdf/code "rep",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship in which a file or representation is captured in an abstract intellectual entity description that it represents. It is a statement of what can depict or stand for the Intellectual Entity. Has a reciprocal relationship of isRepresentedBy."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/str,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/str,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/rep,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/rep,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship in which a file or representation is captured in an abstract intellectual entity description that it represents. It is a statement of what can depict or stand for the Intellectual Entity. Has a reciprocal relationship of isRepresentedBy."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "rep",
   :skos/prefLabel "represents"})

(def req
  "The relationship of an object to another object, where it requires a particular environment or non-environment object to be rendered or to be run. For instance, a file of format Word 97, requires MS Word 1997 to render it. Has a reciprocal relationship of isRequiredBy."
  {:db/ident :loc.preservation.relationshipSubType/req,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "requires",
   :madsrdf/code "req",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The relationship of an object to another object, where it requires a particular environment or non-environment object to be rendered or to be run. For instance, a file of format Word 97, requires MS Word 1997 to render it. Has a reciprocal relationship of isRequiredBy."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/dep,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/dep,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/req,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/req,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The relationship of an object to another object, where it requires a particular environment or non-environment object to be rendered or to be run. For instance, a file of format Word 97, requires MS Word 1997 to render it. Has a reciprocal relationship of isRequiredBy."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "req",
   :skos/prefLabel "requires"})

(def spe
  "A relationship between an environment object and another where the described object provides specific characteristics, while the related environment is more generic. Has a reciprocal relationship of generalizes."
  {:db/ident :loc.preservation.relationshipSubType/spe,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "specializes",
   :madsrdf/code "spe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object provides specific characteristics, while the related environment is more generic. Has a reciprocal relationship of generalizes."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/log,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/log,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/spe,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/spe,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object provides specific characteristics, while the related environment is more generic. Has a reciprocal relationship of generalizes."},
   :skos/inScheme [:loc.preservation/relationshipSubType
                   :loc.vocabulary/preservation],
   :skos/notation "spe",
   :skos/prefLabel "specializes"})

(def sup
  "A relationship between an environment object and another where the described object replaces another. This allows for an audit trail of environments to be maintained. Has a reciprocal relationship of isSupersededBy."
  {:db/ident :loc.preservation.relationshipSubType/sup,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-03-15T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.relationshipSubType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "supersedes",
   :madsrdf/code "sup",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object replaces another. This allows for an audit trail of environments to be maintained. Has a reciprocal relationship of isSupersededBy."},
   :madsrdf/hasBroaderAuthority :loc.preservation.relationshipType/rep,
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.relationshipSubType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/relationshipSubType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subPropertyOf :premis/relationship,
   :skos/broader :loc.preservation.relationshipType/rep,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/sup,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-03-15T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.relationshipSubType/dlc,
     :cs/subjectOfChange :loc.preservation.relationshipSubType/sup,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relationship between an environment object and another where the described object replaces another. This allows for an audit trail of environments to be maintained. Has a reciprocal relationship of isSupersededBy."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/relationshipSubType],
   :skos/notation "sup",
   :skos/prefLabel "supersedes"})

(def ^{:private true} relationshipSubType
  "A specific characterization of the nature of the relationship between this object and one or more other objects."
  {:db/ident :loc.preservation/relationshipSubType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasBroaderAuthority :loc.preservation/relationshipType,
   :madsrdf/hasMADSSchemeMember [:loc.preservation.relationshipSubType/sup
                                 :loc.preservation.relationshipSubType/rep
                                 :loc.preservation.relationshipSubType/inc
                                 :loc.preservation.relationshipSubType/hsr
                                 :loc.preservation.relationshipSubType/dpe
                                 :loc.preservation.relationshipSubType/isr
                                 :loc.preservation.relationshipSubType/isi
                                 :loc.preservation.relationshipSubType/irq
                                 :loc.preservation.relationshipSubType/cmt
                                 :loc.preservation.relationshipSubType/iem
                                 :loc.preservation.relationshipSubType/hss
                                 :loc.preservation.relationshipSubType/ent
                                 :loc.preservation.relationshipSubType/iso
                                 :loc.preservation.relationshipSubType/iss
                                 :loc.preservation.relationshipSubType/hsi
                                 :loc.preservation.relationshipSubType/icw
                                 :loc.preservation.relationshipSubType/gen
                                 :loc.preservation.relationshipSubType/idc
                                 :loc.preservation.relationshipSubType/spe
                                 :loc.preservation.relationshipSubType/idp
                                 :loc.preservation.relationshipSubType/hsp
                                 :loc.preservation.relationshipSubType/cmf
                                 :loc.preservation.relationshipSubType/isp
                                 :loc.preservation.relationshipSubType/req
                                 :loc.preservation.relationshipSubType/emu
                                 :loc.preservation.relationshipSubType/enf
                                 :loc.preservation.relationshipSubType/doc],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "A specific characterization of the nature of the relationship between this object and one or more other objects.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship Subtype"},
   :skos/broader :loc.preservation/relationshipType,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/relationshipSubType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/relationshipSubType,
                      :rdf/type           :cs/ChangeSet}]})