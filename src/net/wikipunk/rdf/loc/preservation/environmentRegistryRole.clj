(ns net.wikipunk.rdf.loc.preservation.environmentRegistryRole
  "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.environmentRegistryRole"
    "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.environmentRegistryRole",
   :rdfa/uri
   "http://id.loc.gov/vocabulary/preservation/environmentRegistryRole/"})

(def com
  "compatibility check"
  {:db/ident :loc.preservation.environmentRegistryRole/com,
   :madsrdf/authoritativeLabel "compatibility check",
   :rdf/type :madsrdf/Authority})

(def gen
  "generalization"
  {:db/ident :loc.preservation.environmentRegistryRole/gen,
   :madsrdf/authoritativeLabel "generalization",
   :rdf/type :madsrdf/Authority})

(def ide
  "identification"
  {:db/ident :loc.preservation.environmentRegistryRole/ide,
   :madsrdf/authoritativeLabel "identification",
   :rdf/type :madsrdf/Authority})

(def spe
  "specification"
  {:db/ident :loc.preservation.environmentRegistryRole/spe,
   :madsrdf/authoritativeLabel "specification",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} environmentRegistryRole
  "The purpose or expected use of the environment registry."
  {:db/ident        :loc.preservation/environmentRegistryRole,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2016-01-21T05:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.environmentRegistryRole/ide
                                 :loc.preservation.environmentRegistryRole/com
                                 :loc.preservation.environmentRegistryRole/spe
                                 :loc.preservation.environmentRegistryRole/gen],
   :madsrdf/hasRelatedAuthority :loc.preservation/formatRegistryRole,
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "The purpose or expected use of the environment registry.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Environment Registry Role"},
   :skos/changeNote [{:cs/changeReason "modified",
                      :cs/createdDate #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/dlc,
                      :cs/subjectOfChange
                      :loc.preservation/environmentRegistryRole,
                      :rdf/type :cs/ChangeSet}
                     {:cs/changeReason "new",
                      :cs/createdDate #inst "2016-01-21T05:00:01.000-00:00",
                      :cs/creatorName :loc.preservation/dlc,
                      :cs/subjectOfChange
                      :loc.preservation/environmentRegistryRole,
                      :rdf/type :cs/ChangeSet}],
   :skos/semanticRelation :loc.preservation/formatRegistryRole})