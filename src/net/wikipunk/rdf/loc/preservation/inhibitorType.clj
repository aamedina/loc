(ns net.wikipunk.rdf.loc.preservation.inhibitorType
  "http://id.loc.gov/vocabulary/preservation/inhibitorType/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/inhibitorType.rdf",
   :rdf/ns-prefix-map
   {"bf"      "http://id.loc.gov/ontologies/bibframe/",
    "bflc"    "http://id.loc.gov/ontologies/bflc/",
    "cc"      "http://creativecommons.org/ns#",
    "cs"      "http://purl.org/vocab/changeset/schema#",
    "dcterms" "http://purl.org/dc/terms/",
    "foaf"    "http://xmlns.com/foaf/0.1/",
    "loc.preservation.inhibitorType"
    "http://id.loc.gov/vocabulary/preservation/inhibitorType/",
    "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.inhibitorType",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/inhibitorType/"})

(def blo
  "Blowfish"
  {:db/ident :loc.preservation.inhibitorType/blo,
   :madsrdf/authoritativeLabel "Blowfish",
   :rdf/type :madsrdf/Authority})

(def des
  "DES"
  {:db/ident :loc.preservation.inhibitorType/des,
   :madsrdf/authoritativeLabel "DES",
   :rdf/type :madsrdf/Authority})

(def pas
  "Password protection"
  {:db/ident :loc.preservation.inhibitorType/pas,
   :madsrdf/authoritativeLabel "Password protection",
   :rdf/type :madsrdf/Authority})

(def pgp
  "PGP"
  {:db/ident :loc.preservation.inhibitorType/pgp,
   :madsrdf/authoritativeLabel "PGP",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} inhibitorType
  "The inhibitor method employed."
  {:db/ident        :loc.preservation/inhibitorType,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.inhibitorType/pas
                                 :loc.preservation.inhibitorType/blo
                                 :loc.preservation.inhibitorType/pgp
                                 :loc.preservation.inhibitorType/des],
   :rdf/type        [:madsrdf/MADSScheme
                     :madsrdf/DeprecatedAuthority
                     :skos/ConceptScheme],
   :rdfs/comment    "The inhibitor method employed.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Inhibitor Type"},
   :skos/changeNote [{:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/inhibitorType,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/inhibitorType,
                      :rdf/type           :cs/ChangeSet}]})