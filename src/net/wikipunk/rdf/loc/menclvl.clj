(ns net.wikipunk.rdf.loc.menclvl
  "http://id.loc.gov/vocabulary/menclvl/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/menclvl.rdf",
   :madsrdf/authoritativeLabel "full not examined",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.menclvl" "http://id.loc.gov/vocabulary/menclvl/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdf/uri           "http://id.loc.gov/vocabulary/menclvl/1",
   :rdfa/prefix       "loc.menclvl",
   :rdfa/uri          "http://id.loc.gov/vocabulary/menclvl/"})

(def f
  "Full level"
  {:db/ident :loc.menclvl/f,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-07-20T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "full",
   :madsrdf/code "f",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Full level"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: LDR/17"},
   :madsrdf/isMemberOfMADSCollection :loc.menclvl/collection_menclvl,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/menclvl,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-07-20T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.menclvl/f,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Full level"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: LDR/17"},
   :skos/inScheme :loc.vocabulary/menclvl,
   :skos/notation "f",
   :skos/prefLabel "full"})

(def ^{:private true} menclvl
  "Degree of completeness of the cataloging metadata."
  {:db/ident :loc.vocabulary/menclvl,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-07-20T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Degree of completeness of the cataloging metadata."},
   :madsrdf/hasMADSSchemeMember ["http://id.loc.gov/vocabulary/menclvl/7"
                                 "http://id.loc.gov/vocabulary/menclvl/8"
                                 "http://id.loc.gov/vocabulary/menclvl/5"
                                 "http://id.loc.gov/vocabulary/menclvl/1"
                                 "http://id.loc.gov/vocabulary/menclvl/3"
                                 :loc.menclvl/f
                                 "http://id.loc.gov/vocabulary/menclvl/4"],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Encoding Level"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-07-20T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/menclvl,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Degree of completeness of the cataloging metadata."}})