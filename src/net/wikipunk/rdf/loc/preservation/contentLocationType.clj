(ns net.wikipunk.rdf.loc.preservation.contentLocationType
  "http://id.loc.gov/vocabulary/preservation/contentLocationType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/contentLocationType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.contentLocationType"
    "http://id.loc.gov/vocabulary/preservation/contentLocationType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.contentLocationType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/contentLocationType/"})

(def byt
  "byte offset"
  {:db/ident :loc.preservation.contentLocationType/byt,
   :madsrdf/authoritativeLabel "byte offset",
   :rdf/type :madsrdf/Authority})

(def ext
  "EXT3"
  {:db/ident :loc.preservation.contentLocationType/ext,
   :madsrdf/authoritativeLabel "EXT3",
   :rdf/type :madsrdf/Authority})

(def hdl
  "handle"
  {:db/ident :loc.preservation.contentLocationType/hdl,
   :madsrdf/authoritativeLabel "handle",
   :rdf/type :madsrdf/Authority})

(def ntf
  "NTFS"
  {:db/ident :loc.preservation.contentLocationType/ntf,
   :madsrdf/authoritativeLabel "NTFS",
   :rdf/type :madsrdf/Authority})

(def psl
  "physical storage location"
  {:db/ident :loc.preservation.contentLocationType/psl,
   :madsrdf/authoritativeLabel "physical storage location",
   :rdf/type :madsrdf/Authority})

(def rfi
  "RFID"
  {:db/ident :loc.preservation.contentLocationType/rfi,
   :madsrdf/authoritativeLabel "RFID",
   :rdf/type :madsrdf/Authority})

(def smk
  "shelfmark"
  {:db/ident :loc.preservation.contentLocationType/smk,
   :madsrdf/authoritativeLabel "shelfmark",
   :rdf/type :madsrdf/Authority})

(def uri
  "Uniform Resource Identifier"
  {:db/ident :loc.preservation.contentLocationType/uri,
   :madsrdf/authoritativeLabel "Uniform Resource Identifier",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} contentLocationType
  "Information about how and where a file is stored in the storage system."
  {:db/ident :loc.preservation/contentLocationType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.contentLocationType/smk
                                 :loc.preservation.contentLocationType/uri
                                 :loc.preservation.contentLocationType/rfi
                                 :loc.preservation.contentLocationType/byt
                                 :loc.preservation.contentLocationType/ext
                                 :loc.preservation.contentLocationType/ntf
                                 :loc.preservation.contentLocationType/hdl
                                 :loc.preservation.contentLocationType/psl],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "Information about how and where a file is stored in the storage system.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Content Location Type"},
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:00.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/contentLocationType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/contentLocationType,
                      :rdf/type           :cs/ChangeSet}]})