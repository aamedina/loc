(ns net.wikipunk.rdf.loc.mcfcsc
  "http://id.loc.gov/vocabulary/mcfcsc/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mcfcsc.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mcfcsc" "http://id.loc.gov/vocabulary/mcfcsc/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mcfcsc",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mcfcsc/"})

(def iamlmf
  "International Association of Music Libraries musical forms codes"
  {:db/ident :loc.mcfcsc/iamlmf,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mcfcsc/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel
   "International Association of Music Libraries musical forms codes",
   :madsrdf/code "iamlmf",
   :madsrdf/definitionNote
   "International Association of Music Libraries musical forms codes",
   :madsrdf/historyNote "MARC bib: 047 $2",
   :madsrdf/isMemberOfMADSCollection :loc.mcfcsc/collection_mcfcsc,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcfcsc,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mcfcsc/dlc,
                     :cs/subjectOfChange :loc.mcfcsc/iamlmf,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "International Association of Music Libraries musical forms codes",
   :skos/historyNote "MARC bib: 047 $2",
   :skos/inScheme :loc.vocabulary/mcfcsc,
   :skos/notation "iamlmf",
   :skos/prefLabel
   "International Association of Music Libraries musical forms codes"})

(def marcmuscomp
  "MARC form of musical composition code list"
  {:db/ident :loc.mcfcsc/marcmuscomp,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2019-10-03T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.mcfcsc/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "MARC form of musical composition code list",
   :madsrdf/code "marcmuscomp",
   :madsrdf/definitionNote "MARC form of musical composition code list",
   :madsrdf/historyNote "MARC bib: 047 $2",
   :madsrdf/isMemberOfMADSCollection :loc.mcfcsc/collection_mcfcsc,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mcfcsc,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     :loc.mcfcsc/dlc,
                     :cs/subjectOfChange :loc.mcfcsc/marcmuscomp,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition "MARC form of musical composition code list",
   :skos/historyNote "MARC bib: 047 $2",
   :skos/inScheme :loc.vocabulary/mcfcsc,
   :skos/notation "marcmuscomp",
   :skos/prefLabel "MARC form of musical composition code list"})

(def ^{:private true} mcfcsc
  "Identifies and enables the source of a musical composition form code in metadata records to be identified by a code"
  {:db/ident :loc.vocabulary/mcfcsc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-10-03T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   "Identifies and enables the source of a musical composition form code in metadata records to be identified by a code",
   :madsrdf/hasMADSSchemeMember [:loc.mcfcsc/iamlmf :loc.mcfcsc/marcmuscomp],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/label "Musical Composition Form Code Source Codes",
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2019-10-03T04:00:00.000-00:00",
                     :cs/creatorName     "https://id.loc.gov/vocabulary/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mcfcsc,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   "Identifies and enables the source of a musical composition form code in metadata records to be identified by a code"})