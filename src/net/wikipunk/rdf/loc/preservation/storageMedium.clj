(ns net.wikipunk.rdf.loc.preservation.storageMedium
  "http://id.loc.gov/vocabulary/preservation/storageMedium/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/storageMedium.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.storageMedium"
    "http://id.loc.gov/vocabulary/preservation/storageMedium/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.storageMedium",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/storageMedium/"})

(def har
  "A medium for storing and retrieving digital information, primarily computer data. It consists of one or more rigid (hence \"hard\") rapidly rotating discs (often referred to as platters), coated with magnetic material and with magnetic heads arranged to write data to the surfaces and read it from them."
  {:db/ident :loc.preservation.storageMedium/har,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.storageMedium/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.storageMedium/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "hard disk",
   :madsrdf/code "har",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A medium for storing and retrieving digital information, primarily computer data. It consists of one or more rigid (hence \"hard\") rapidly rotating discs (often referred to as platters), coated with magnetic material and with magnetic heads arranged to write data to the surfaces and read it from them."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.storageMedium/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/storageMedium],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageMedium,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.storageMedium/dlc,
                      :cs/subjectOfChange :loc.preservation.storageMedium/har,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.storageMedium/dlc,
                      :cs/subjectOfChange :loc.preservation.storageMedium/har,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A medium for storing and retrieving digital information, primarily computer data. It consists of one or more rigid (hence \"hard\") rapidly rotating discs (often referred to as platters), coated with magnetic material and with magnetic heads arranged to write data to the surfaces and read it from them."},
   :skos/inScheme [:loc.preservation/storageMedium
                   :loc.vocabulary/preservation],
   :skos/notation "har",
   :skos/prefLabel "hard disk"})

(def mag
  "A medium for magnetic recording, made of a thin magnetizable coating on a long, narrow strip of plastic."
  {:db/ident :loc.preservation.storageMedium/mag,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.storageMedium/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.storageMedium/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "magnetic tape",
   :madsrdf/code "mag",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A medium for magnetic recording, made of a thin magnetizable coating on a long, narrow strip of plastic."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.storageMedium/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.vocabulary/preservation
                                  :loc.preservation/storageMedium],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageMedium,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.storageMedium/dlc,
                      :cs/subjectOfChange :loc.preservation.storageMedium/mag,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.storageMedium/dlc,
                      :cs/subjectOfChange :loc.preservation.storageMedium/mag,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A medium for magnetic recording, made of a thin magnetizable coating on a long, narrow strip of plastic."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/storageMedium],
   :skos/notation "mag",
   :skos/prefLabel "magnetic tape"})

(def tsm
  "A storage medium (IBM Tivoli Storage Manager or TSM), which is a centralized, policy-based, enterprise class, data backup and recovery software."
  {:db/ident :loc.preservation.storageMedium/tsm,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.storageMedium/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.storageMedium/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "TSM",
   :madsrdf/code "tsm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A storage medium (IBM Tivoli Storage Manager or TSM), which is a centralized, policy-based, enterprise class, data backup and recovery software."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.storageMedium/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/storageMedium
                                  :loc.vocabulary/preservation],
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/StorageMedium,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.storageMedium/dlc,
                      :cs/subjectOfChange :loc.preservation.storageMedium/tsm,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.storageMedium/dlc,
                      :cs/subjectOfChange :loc.preservation.storageMedium/tsm,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A storage medium (IBM Tivoli Storage Manager or TSM), which is a centralized, policy-based, enterprise class, data backup and recovery software."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/storageMedium],
   :skos/notation "tsm",
   :skos/prefLabel "TSM"})

(def ^{:private true} storageMedium
  "The physical medium on which the object is stored."
  {:db/ident        :loc.preservation/storageMedium,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.storageMedium/tsm
                                 :loc.preservation.storageMedium/har
                                 :loc.preservation.storageMedium/mag],
   :rdf/type        [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment    "The physical medium on which the object is stored.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Storage Medium"},
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/storageMedium,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/storageMedium,
                      :rdf/type           :cs/ChangeSet}]})