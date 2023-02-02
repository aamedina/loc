(ns net.wikipunk.rdf.loc.preservation.rightsBasis
  "http://id.loc.gov/vocabulary/preservation/rightsBasis/"
  {:dcat/downloadURL
   "http://id.loc.gov/vocabulary/preservation/rightsBasis.rdf",
   :rdf/ns-prefix-map {"bf"      "http://id.loc.gov/ontologies/bibframe/",
                       "bflc"    "http://id.loc.gov/ontologies/bflc/",
                       "cc"      "http://creativecommons.org/ns#",
                       "cs"      "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "loc.preservation.rightsBasis"
                       "http://id.loc.gov/vocabulary/preservation/rightsBasis/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "ri"      "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "xhtml"   "http://www.w3.org/1999/xhtml"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "loc.preservation.rightsBasis",
   :rdfa/uri "http://id.loc.gov/vocabulary/preservation/rightsBasis/"})

(def cop
  "copyright"
  {:db/ident :loc.preservation.rightsBasis/cop,
   :madsrdf/authoritativeLabel "copyright",
   :rdf/type :madsrdf/Authority})

(def ins
  "institutional policy"
  {:db/ident :loc.preservation.rightsBasis/ins,
   :madsrdf/authoritativeLabel "institutional policy",
   :rdf/type :madsrdf/Authority})

(def lic
  "license"
  {:db/ident :loc.preservation.rightsBasis/lic,
   :madsrdf/authoritativeLabel "license",
   :rdf/type :madsrdf/Authority})

(def oth
  "other"
  {:db/ident :loc.preservation.rightsBasis/oth,
   :madsrdf/authoritativeLabel "other",
   :rdf/type :madsrdf/Authority})

(def sta
  "statute"
  {:db/ident :loc.preservation.rightsBasis/sta,
   :madsrdf/authoritativeLabel "statute",
   :rdf/type :madsrdf/Authority})

(def ^{:private true} rightsBasis
  "Designation of the basis for the right or permission."
  {:db/ident        :loc.preservation/rightsBasis,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2012-08-01T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2018-09-24T04:00:01.000-00:00",
     :ri/recordContentSource :loc.preservation/dlc,
     :ri/recordStatus "modified"}],
   :madsrdf/hasMADSSchemeMember [:loc.preservation.rightsBasis/sta
                                 :loc.preservation.rightsBasis/cop
                                 :loc.preservation.rightsBasis/lic
                                 :loc.preservation.rightsBasis/ins
                                 :loc.preservation.rightsBasis/oth],
   :rdf/type        [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment    "Designation of the basis for the right or permission.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Rights Basis"},
   :skos/changeNote [{:cs/changeReason    "modified",
                      :cs/createdDate     #inst "2018-09-24T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/rightsBasis,
                      :rdf/type           :cs/ChangeSet}
                     {:cs/changeReason    "new",
                      :cs/createdDate     #inst "2012-08-01T04:00:01.000-00:00",
                      :cs/creatorName     :loc.preservation/dlc,
                      :cs/subjectOfChange :loc.preservation/rightsBasis,
                      :rdf/type           :cs/ChangeSet}]})