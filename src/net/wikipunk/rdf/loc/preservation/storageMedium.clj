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
  "hard disk"
  {:db/ident :loc.preservation.storageMedium/har,
   :madsrdf/authoritativeLabel "hard disk",
   :rdf/type :madsrdf/Authority})

(def mag
  "magnetic tape"
  {:db/ident :loc.preservation.storageMedium/mag,
   :madsrdf/authoritativeLabel "magnetic tape",
   :rdf/type :madsrdf/Authority})

(def tsm
  "TSM"
  {:db/ident :loc.preservation.storageMedium/tsm,
   :madsrdf/authoritativeLabel "TSM",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} storageMedium
  "The physical medium on which the object is stored."
  {:db/ident        :loc.preservation/storageMedium,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
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