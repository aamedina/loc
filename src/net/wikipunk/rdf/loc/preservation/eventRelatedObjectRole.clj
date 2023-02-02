(ns net.wikipunk.rdf.loc.preservation.eventRelatedObjectRole
  "http://id.loc.gov/vocabulary/preservation/eventRelatedObjectRole/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/eventRelatedObjectRole.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.eventRelatedObjectRole"
    "http://id.loc.gov/vocabulary/preservation/eventRelatedObjectRole/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.eventRelatedObjectRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/eventRelatedObjectRole/"})

(def out
  "outcome"
  {:db/ident :loc.preservation.eventRelatedObjectRole/out,
   :madsrdf/authoritativeLabel "outcome",
   :rdf/type :madsrdf/Authority})

(def sou
  "source"
  {:db/ident :loc.preservation.eventRelatedObjectRole/sou,
   :madsrdf/authoritativeLabel "source",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} eventRelatedObjectRole
  "The role of the object associated with an event."
  {:db/ident        :loc.preservation/eventRelatedObjectRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.eventRelatedObjectRole/sou
                                 :loc.preservation.eventRelatedObjectRole/out],
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "The role of the object associated with an event.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Event Related Object Role"},
   :skos/changeNote [{:cs/changeReason "modified",
                      :cs/createdDate #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/dlc,
                      :cs/subjectOfChange
                      :loc.preservation/eventRelatedObjectRole,
                      :rdf/type :cs/ChangeSet}
                     {:cs/changeReason "new",
                      :cs/createdDate #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/dlc,
                      :cs/subjectOfChange
                      :loc.preservation/eventRelatedObjectRole,
                      :rdf/type :cs/ChangeSet}]})