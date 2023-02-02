(ns net.wikipunk.rdf.loc.preservation.inhibitorType
  "http://id.loc.gov/vocabulary/preservation/inhibitorType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/inhibitorType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.inhibitorType"
    "http://id.loc.gov/vocabulary/preservation/inhibitorType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.inhibitorType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/inhibitorType/"})

(def blo
  "A keyed, symmetric block cipher included in a large number of cipher suites and encryption."
  {:db/ident :loc.preservation.inhibitorType/blo,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Blowfish",
   :madsrdf/code "blo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A keyed, symmetric block cipher included in a large number of cipher suites and encryption."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.inhibitorType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/inhibitorType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Inhibitor,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorType/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorType/blo,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorType/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorType/blo,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A keyed, symmetric block cipher included in a large number of cipher suites and encryption."},
   :skos/inScheme [:loc.preservation/inhibitorType
                   :loc.vocabulary/preservation],
   :skos/notation "blo",
   :skos/prefLabel "Blowfish"})

(def des
  "Data Encryption Standard (DES), a block cipher that uses shared secret encryption based on a symmetric-key algorithm that uses a 56-bit key."
  {:db/ident :loc.preservation.inhibitorType/des,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "DES",
   :madsrdf/code "des",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Data Encryption Standard (DES), a block cipher that uses shared secret encryption based on a symmetric-key algorithm that uses a 56-bit key."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.inhibitorType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/inhibitorType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Inhibitor,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorType/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorType/des,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorType/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorType/des,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Data Encryption Standard (DES), a block cipher that uses shared secret encryption based on a symmetric-key algorithm that uses a 56-bit key."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/inhibitorType],
   :skos/notation "des",
   :skos/prefLabel "DES"})

(def pas
  "The ability to protect a system, data or object using a password."
  {:db/ident :loc.preservation.inhibitorType/pas,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "Password protection",
   :madsrdf/code "pas",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The ability to protect a system, data or object using a password."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.inhibitorType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/inhibitorType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Inhibitor,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorType/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorType/pas,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorType/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorType/pas,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The ability to protect a system, data or object using a password."},
   :skos/inScheme [:loc.preservation/inhibitorType
                   :loc.vocabulary/preservation],
   :skos/notation "pas",
   :skos/prefLabel "Password protection"})

(def pgp
  "Pretty Good Privacy (PGP), a data encryption and decryption computer program that provides cryptographic privacy and authentication for data communication, primarily used for signing, encrypting and decrypting e-mails."
  {:db/ident :loc.preservation.inhibitorType/pgp,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.inhibitorType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "PGP",
   :madsrdf/code "pgp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Pretty Good Privacy (PGP), a data encryption and decryption computer program that provides cryptographic privacy and authentication for data communication, primarily used for signing, encrypting and decrypting e-mails."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.inhibitorType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/inhibitorType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Inhibitor,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorType/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorType/pgp,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.inhibitorType/dlc,
                      :cs/subjectOfChange :loc.preservation.inhibitorType/pgp,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Pretty Good Privacy (PGP), a data encryption and decryption computer program that provides cryptographic privacy and authentication for data communication, primarily used for signing, encrypting and decrypting e-mails."},
   :skos/inScheme [:loc.preservation/inhibitorType
                   :loc.vocabulary/preservation],
   :skos/notation "pgp",
   :skos/prefLabel "PGP"})

(def ^{:private true} inhibitorType
  "The inhibitor method employed."
  {:db/ident        :loc.preservation/inhibitorType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.inhibitorType/pas
                                 :loc.preservation.inhibitorType/blo
                                 :loc.preservation.inhibitorType/pgp
                                 :loc.preservation.inhibitorType/des],
   :rdf/type        [:madsrdf/MADSScheme
                     :madsrdf/DeprecatedAuthority
                     :skos/ConceptScheme],
   :rdfs/comment    "The inhibitor method employed.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Inhibitor Type"},
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/inhibitorType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/inhibitorType,
                      :rdf/type           :cs/ChangeSet}]})