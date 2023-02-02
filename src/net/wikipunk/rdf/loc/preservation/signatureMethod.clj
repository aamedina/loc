(ns net.wikipunk.rdf.loc.preservation.signatureMethod
  "http://id.loc.gov/vocabulary/preservation/signatureMethod/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/signatureMethod.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.signatureMethod"
    "http://id.loc.gov/vocabulary/preservation/signatureMethod/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.signatureMethod",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/signatureMethod/"})

(def dsa
  "Digital Signature Algorithm (DSA) is an algorithm developed by the United States Federal Government as a standard for digital signatures."
  {:db/ident :loc.preservation.signatureMethod/dsa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.signatureMethod/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.signatureMethod/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "DSA-SHA1",
   :madsrdf/code "dsa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Digital Signature Algorithm (DSA) is an algorithm developed by the United States Federal Government as a standard for digital signatures."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.signatureMethod/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/signatureMethod],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Signature,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.signatureMethod/dlc,
                      :cs/subjectOfChange :loc.preservation.signatureMethod/dsa,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.signatureMethod/dlc,
                      :cs/subjectOfChange :loc.preservation.signatureMethod/dsa,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Digital Signature Algorithm (DSA) is an algorithm developed by the United States Federal Government as a standard for digital signatures."},
   :skos/inScheme [:loc.preservation/signatureMethod
                   :loc.vocabulary/preservation],
   :skos/notation "dsa",
   :skos/prefLabel "DSA-SHA1"})

(def rsa
  "An algorithm for public-key cryptography that is based on the presumed difficulty of factoring large integers."
  {:db/ident :loc.preservation.signatureMethod/rsa,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.signatureMethod/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.signatureMethod/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "RSA-SHA1",
   :madsrdf/code "rsa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An algorithm for public-key cryptography that is based on the presumed difficulty of factoring large integers."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.signatureMethod/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/signatureMethod],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Signature,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.signatureMethod/dlc,
                      :cs/subjectOfChange :loc.preservation.signatureMethod/rsa,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.signatureMethod/dlc,
                      :cs/subjectOfChange :loc.preservation.signatureMethod/rsa,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An algorithm for public-key cryptography that is based on the presumed difficulty of factoring large integers."},
   :skos/inScheme [:loc.preservation/signatureMethod
                   :loc.vocabulary/preservation],
   :skos/notation "rsa",
   :skos/prefLabel "RSA-SHA1"})

(def ^{:private true} signatureMethod
  "A designation of the encryption and hash algorithms used for signature generation."
  {:db/ident :loc.preservation/signatureMethod,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.signatureMethod/rsa
                                 :loc.preservation.signatureMethod/dsa],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "A designation of the encryption and hash algorithms used for signature generation.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Signature Method"},
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/signatureMethod,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/signatureMethod,
                      :rdf/type           :cs/ChangeSet}]})