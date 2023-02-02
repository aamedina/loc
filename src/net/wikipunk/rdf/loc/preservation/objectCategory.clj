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
  "bitstream"
  {:db/ident :loc.preservation.objectCategory/bit,
   :madsrdf/authoritativeLabel "bitstream",
   :rdf/type :madsrdf/Authority})

(def fil
  "file"
  {:db/ident :loc.preservation.objectCategory/fil,
   :madsrdf/authoritativeLabel "file",
   :rdf/type :madsrdf/Authority})

(def int
  "intellectual entity"
  {:db/ident :loc.preservation.objectCategory/int,
   :madsrdf/authoritativeLabel "intellectual entity",
   :rdf/type :madsrdf/Authority})

(def rep
  "representation"
  {:db/ident :loc.preservation.objectCategory/rep,
   :madsrdf/authoritativeLabel "representation",
   :rdf/type :madsrdf/Authority})

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