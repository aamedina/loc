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
  "An integer indicating the distance (displacement) from the beginning of the object up until a given element or point, presumably within the same object. It is used to index into a string or file, as a zero-based number of bytes."
  {:db/ident :loc.preservation.contentLocationType/byt,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "byte offset",
   :madsrdf/code "byt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An integer indicating the distance (displacement) from the beginning of the object up until a given element or point, presumably within the same object. It is used to index into a string or file, as a zero-based number of bytes."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.contentLocationType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/contentLocationType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageLocation,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:00.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/byt,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/byt,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An integer indicating the distance (displacement) from the beginning of the object up until a given element or point, presumably within the same object. It is used to index into a string or file, as a zero-based number of bytes."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/contentLocationType],
   :skos/notation "byt",
   :skos/prefLabel "byte offset"})

(def ext
  "Third extended file system, a journaled file system that is commonly used by the Linux kernel. It is the default file system for many popular Linux distributions."
  {:db/ident :loc.preservation.contentLocationType/ext,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:00.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "EXT3",
   :madsrdf/code "ext",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Third extended file system, a journaled file system that is commonly used by the Linux kernel. It is the default file system for many popular Linux distributions."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.contentLocationType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/contentLocationType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageLocation,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/ext,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:00.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/ext,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Third extended file system, a journaled file system that is commonly used by the Linux kernel. It is the default file system for many popular Linux distributions."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/contentLocationType],
   :skos/notation "ext",
   :skos/prefLabel "EXT3"})

(def hdl
  "Unique and persistent identifiers used in the Handle System. A handle is a character string that consists of a naming authority followed by a unique local name under the naming authority."
  {:db/ident :loc.preservation.contentLocationType/hdl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "handle",
   :madsrdf/code "hdl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Unique and persistent identifiers used in the Handle System. A handle is a character string that consists of a naming authority followed by a unique local name under the naming authority."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.contentLocationType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/contentLocationType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageLocation,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/hdl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/hdl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Unique and persistent identifiers used in the Handle System. A handle is a character string that consists of a naming authority followed by a unique local name under the naming authority."},
   :skos/inScheme [:loc.preservation/contentLocationType
                   :loc.vocabulary/preservation],
   :skos/notation "hdl",
   :skos/prefLabel "handle"})

(def ntf
  "New Technology File System, the standard file system of Windows NT, including its later versions Windows 2000, Windows XP, Windows Server 2003, Windows Server 2008, Windows Vista, and Windows 7."
  {:db/ident :loc.preservation.contentLocationType/ntf,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "NTFS",
   :madsrdf/code "ntf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "New Technology File System, the standard file system of Windows NT, including its later versions Windows 2000, Windows XP, Windows Server 2003, Windows Server 2008, Windows Vista, and Windows 7."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.contentLocationType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/contentLocationType],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageLocation,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/ntf,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/ntf,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "New Technology File System, the standard file system of Windows NT, including its later versions Windows 2000, Windows XP, Windows Server 2003, Windows Server 2008, Windows Vista, and Windows 7."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/contentLocationType],
   :skos/notation "ntf",
   :skos/prefLabel "NTFS"})

(def psl
  "Location of an object is not on a computer but in a physical space."
  {:db/ident :loc.preservation.contentLocationType/psl,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "physical storage location",
   :madsrdf/code "psl",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Location of an object is not on a computer but in a physical space."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.contentLocationType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/contentLocationType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageLocation,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/psl,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/psl,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Location of an object is not on a computer but in a physical space."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/contentLocationType],
   :skos/notation "psl",
   :skos/prefLabel "physical storage location"})

(def rfi
  "Location is indicated by a Radio-Frequency Identification number attached to a physical object."
  {:db/ident :loc.preservation.contentLocationType/rfi,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "RFID",
   :madsrdf/code "rfi",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Location is indicated by a Radio-Frequency Identification number attached to a physical object."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.contentLocationType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/contentLocationType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageLocation,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/rfi,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/rfi,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Location is indicated by a Radio-Frequency Identification number attached to a physical object."},
   :skos/inScheme [:loc.preservation/contentLocationType
                   :loc.vocabulary/preservation],
   :skos/notation "rfi",
   :skos/prefLabel "RFID"})

(def smk
  "Physical location, such as a call number or a special shelf/location indicator."
  {:db/ident :loc.preservation.contentLocationType/smk,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "shelfmark",
   :madsrdf/code "smk",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Physical location, such as a call number or a special shelf/location indicator."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.contentLocationType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/contentLocationType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageLocation,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/smk,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/smk,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Physical location, such as a call number or a special shelf/location indicator."},
   :skos/inScheme [:loc.preservation/contentLocationType
                   :loc.vocabulary/preservation],
   :skos/notation "smk",
   :skos/prefLabel "shelfmark"})

(def uri
  "A Uniform Resource Identifier (URI) is a string of characters used to identify a name or a resource on the Internet."
  {:db/ident :loc.preservation.contentLocationType/uri,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.contentLocationType/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "Uniform Resource Identifier",
   :madsrdf/code "uri",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A Uniform Resource Identifier (URI) is a string of characters used to identify a name or a resource on the Internet."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.contentLocationType/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/contentLocationType
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageLocation,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/uri,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation.contentLocationType/dlc,
     :cs/subjectOfChange :loc.preservation.contentLocationType/uri,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Uniform Resource Identifier (URI) is a string of characters used to identify a name or a resource on the Internet."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/contentLocationType],
   :skos/notation "uri",
   :skos/prefLabel "Uniform Resource Identifier"})

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
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/contentLocationType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:00.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/contentLocationType,
                      :rdf/type           :cs/ChangeSet}]})