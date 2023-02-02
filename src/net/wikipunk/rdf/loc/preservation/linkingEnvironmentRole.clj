(ns net.wikipunk.rdf.loc.preservation.linkingEnvironmentRole
  "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.linkingEnvironmentRole"
    "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.linkingEnvironmentRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/linkingEnvironmentRole/"})

(def byt
  "byte code"
  {:db/ident :loc.preservation.linkingEnvironmentRole/byt,
   :madsrdf/authoritativeLabel "byte code",
   :rdf/type :madsrdf/Authority})

(def dis
  "disk image"
  {:db/ident :loc.preservation.linkingEnvironmentRole/dis,
   :madsrdf/authoritativeLabel "disk image",
   :rdf/type :madsrdf/Authority})

(def sou
  "source code"
  {:db/ident :loc.preservation.linkingEnvironmentRole/sou,
   :madsrdf/authoritativeLabel "source code",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} linkingEnvironmentRole
  "The role of the environment object associated with the agent, which allows one to record in what form the software or hardware has been preserved in the repository."
  {:db/ident :loc.preservation/linkingEnvironmentRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.linkingEnvironmentRole/sou
                                 :loc.preservation.linkingEnvironmentRole/dis
                                 :loc.preservation.linkingEnvironmentRole/byt],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment
   "The role of the environment object associated with the agent, which allows one to record in what form the software or hardware has been preserved in the repository.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Linking Environment Role"},
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/linkingEnvironmentRole,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2016-01-21T05:00:01.000-00:00",
     :cs/creatorName     :loc.preservation/dlc,
     :cs/subjectOfChange :loc.preservation/linkingEnvironmentRole,
     :rdf/type           :cs/ChangeSet}]})