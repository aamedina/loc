(ns net.wikipunk.rdf.loc.preservation.signatureEncoding
  "http://id.loc.gov/vocabulary/preservation/signatureEncoding/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/signatureEncoding.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.signatureEncoding"
    "http://id.loc.gov/vocabulary/preservation/signatureEncoding/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.signatureEncoding",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/signatureEncoding/"})

(def bas
  "base64"
  {:db/ident :loc.preservation.signatureEncoding/bas,
   :madsrdf/authoritativeLabel "base64",
   :rdf/type :madsrdf/Authority})

(def dsc
  "ds:CryptoBinary"
  {:db/ident :loc.preservation.signatureEncoding/dsc,
   :madsrdf/authoritativeLabel "ds:CryptoBinary",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} signatureEncoding
  "The type of encoding used in a digital signature."
  {:db/ident        :loc.preservation/signatureEncoding,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2011-06-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.signatureEncoding/bas
                                 :loc.preservation.signatureEncoding/dsc],
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "The type of encoding used in a digital signature.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Signature Encoding"},
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/signatureEncoding,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/signatureEncoding,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2011-06-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/signatureEncoding,
                      :rdf/type           :cs/ChangeSet}]})