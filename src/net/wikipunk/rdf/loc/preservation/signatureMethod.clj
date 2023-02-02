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
  "DSA-SHA1"
  {:db/ident :loc.preservation.signatureMethod/dsa,
   :madsrdf/authoritativeLabel "DSA-SHA1",
   :rdf/type :madsrdf/Authority})

(def rsa
  "RSA-SHA1"
  {:db/ident :loc.preservation.signatureMethod/rsa,
   :madsrdf/authoritativeLabel "RSA-SHA1",
   :rdf/type :madsrdf/Authority})

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