(ns net.wikipunk.rdf.loc.preservation.copyrightStatus
  "http://id.loc.gov/vocabulary/preservation/copyrightStatus/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/copyrightStatus.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.copyrightStatus"
    "http://id.loc.gov/vocabulary/preservation/copyrightStatus/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.copyrightStatus",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/copyrightStatus/"})

(def cpr
  "copyrighted"
  {:db/ident :loc.preservation.copyrightStatus/cpr,
   :madsrdf/authoritativeLabel "copyrighted",
   :rdf/type :madsrdf/Authority})

(def pub
  "public domain"
  {:db/ident :loc.preservation.copyrightStatus/pub,
   :madsrdf/authoritativeLabel "public domain",
   :rdf/type :madsrdf/Authority})

(def unk
  "unknown"
  {:db/ident :loc.preservation.copyrightStatus/unk,
   :madsrdf/authoritativeLabel "unknown",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} copyrightStatus
  "A designation for the copyright status of the object at the time the rights statement is recorded."
  {:db/ident :loc.preservation/copyrightStatus,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/copyrightStatus.rdf,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.copyrightStatus/unk
                                 :loc.preservation.copyrightStatus/pub
                                 :loc.preservation.copyrightStatus/cpr],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment
   "A designation for the copyright status of the object at the time the rights statement is recorded.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Copyright Status"},
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/copyrightStatus,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/copyrightStatus.rdf,
                      :cs/subjectOfChange :loc.preservation/copyrightStatus,
                      :rdf/type           :cs/ChangeSet}]})