(ns net.wikipunk.rdf.loc.preservation.objectCategory
  "http://id.loc.gov/vocabulary/preservation/objectCategory/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/objectCategory.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.objectCategory"
    "http://id.loc.gov/vocabulary/preservation/objectCategory/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.objectCategory",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/objectCategory/"}
  (:refer-clojure :exclude [int]))

(def bit
  "Contiguous or non-contiguous data within a file that has meaningful properties for preservation purposes."
  {:db/ident :loc.preservation.objectCategory/bit,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.objectCategory/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.objectCategory/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "bitstream",
   :madsrdf/code "bit",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Contiguous or non-contiguous data within a file that has meaningful properties for preservation purposes."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.objectCategory/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/objectCategory
                                  :loc.vocabulary/preservation],
   :owl/sameAs :premis/Bitstream,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Object,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.objectCategory/dlc,
                      :cs/subjectOfChange :loc.preservation.objectCategory/bit,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.objectCategory/dlc,
                      :cs/subjectOfChange :loc.preservation.objectCategory/bit,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Contiguous or non-contiguous data within a file that has meaningful properties for preservation purposes."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/objectCategory],
   :skos/notation "bit",
   :skos/prefLabel "bitstream"})

(def fil
  "A named and ordered sequence of bytes that is known to the operating system"
  {:db/ident :loc.preservation.objectCategory/fil,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.objectCategory/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.objectCategory/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "file",
   :madsrdf/code "fil",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A named and ordered sequence of bytes that is known to the operating system"},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.objectCategory/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/objectCategory
                                  :loc.vocabulary/preservation],
   :owl/sameAs :premis/File,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Object,
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.objectCategory/dlc,
                      :cs/subjectOfChange :loc.preservation.objectCategory/fil,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.objectCategory/dlc,
                      :cs/subjectOfChange :loc.preservation.objectCategory/fil,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A named and ordered sequence of bytes that is known to the operating system"},
   :skos/inScheme [:loc.preservation/objectCategory
                   :loc.vocabulary/preservation],
   :skos/notation "fil",
   :skos/prefLabel "file"})

(def int
  "Coherent set of content that is described as a unit: for example, a book, a map, a photograph, a serial."
  {:db/ident :loc.preservation.objectCategory/int,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.objectCategory/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.objectCategory/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "intellectual entity",
   :madsrdf/code "int",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Coherent set of content that is described as a unit: for example, a book, a map, a photograph, a serial."},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.objectCategory/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/objectCategory
                                  :loc.vocabulary/preservation],
   :owl/sameAs :premis/IntellectualEntity,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Object,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.objectCategory/dlc,
                      :cs/subjectOfChange :loc.preservation.objectCategory/int,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.objectCategory/dlc,
                      :cs/subjectOfChange :loc.preservation.objectCategory/int,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Coherent set of content that is described as a unit: for example, a book, a map, a photograph, a serial."},
   :skos/inScheme [:loc.vocabulary/preservation
                   :loc.preservation/objectCategory],
   :skos/notation "int",
   :skos/prefLabel "intellectual entity"})

(def rep
  "The set of files, including structural metadata, needed for a complete and reasonable rendition of an Intellectual Entity"
  {:db/ident :loc.preservation.objectCategory/rep,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.objectCategory/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation.objectCategory/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "representation",
   :madsrdf/code "rep",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "The set of files, including structural metadata, needed for a complete and reasonable rendition of an Intellectual Entity"},
   :madsrdf/isMemberOfMADSCollection
   :loc.preservation.objectCategory/collection_PREMIS,
   :madsrdf/isMemberOfMADSScheme [:loc.preservation/objectCategory
                                  :loc.vocabulary/preservation],
   :owl/sameAs :premis/Representation,
   :rdf/type :madsrdf/Authority,
   :rdfs/subClassOf :premis/Object,
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.objectCategory/dlc,
                      :cs/subjectOfChange :loc.preservation.objectCategory/rep,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation.objectCategory/dlc,
                      :cs/subjectOfChange :loc.preservation.objectCategory/rep,
                      :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The set of files, including structural metadata, needed for a complete and reasonable rendition of an Intellectual Entity"},
   :skos/inScheme [:loc.preservation/objectCategory
                   :loc.vocabulary/preservation],
   :skos/notation "rep",
   :skos/prefLabel "representation"})

(def ^{:private true} objectCategory
  "The category of object to which the metadata applies."
  {:db/ident :loc.preservation/objectCategory,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.objectCategory/int
                                 :loc.preservation.objectCategory/rep
                                 :loc.preservation.objectCategory/fil
                                 :loc.preservation.objectCategory/bit],
   :owl/sameAs :premis/Object,
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "The category of object to which the metadata applies.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Object Category"},
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/objectCategory,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/objectCategory,
                      :rdf/type           :cs/ChangeSet}]})