(ns net.wikipunk.rdf.loc.msoundcontent
  "http://id.loc.gov/vocabulary/msoundcontent/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/msoundcontent.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.msoundcontent"
                       "http://id.loc.gov/vocabulary/msoundcontent/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.msoundcontent",
   :rdfa/uri          "http://id.loc.gov/vocabulary/msoundcontent/"})

(def silent
  "Sound content indicator for a resource that does not contain sound"
  {:db/ident :loc.msoundcontent/silent,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-10-12T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.msoundcontent/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "silent",
   :madsrdf/code "silent",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Sound content indicator for a resource that does not contain sound"},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 300 $b; 007el/mpic/pg/vi/05 - #; 007mpic/pg/vi/06 - #"},
   :madsrdf/isMemberOfMADSCollection
   :loc.msoundcontent/collection_msoundcontent,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msoundcontent,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName     :loc.msoundcontent/dlc,
                     :cs/subjectOfChange :loc.msoundcontent/silent,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Sound content indicator for a resource that does not contain sound"},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 300 $b; 007el/mpic/pg/vi/05 - #; 007mpic/pg/vi/06 - #"},
   :skos/inScheme :loc.vocabulary/msoundcontent,
   :skos/notation "silent",
   :skos/prefLabel "silent"})

(def sound
  "Sound content indicator for a resource that contains sound"
  {:db/ident :loc.msoundcontent/sound,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-10-12T04:00:00.000-00:00",
                           :ri/recordContentSource :loc.msoundcontent/dlc,
                           :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "sound",
   :madsrdf/code "sound",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Sound content indicator for a resource that contains sound"},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 300 $b; 007el/05 - a; 007mpic/pg/vi/05 - a,b; 007mpic/pg/vi/06 - a,b,c,d,e,f,g,h,i"},
   :madsrdf/isMemberOfMADSCollection
   :loc.msoundcontent/collection_msoundcontent,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/msoundcontent,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName     :loc.msoundcontent/dlc,
                     :cs/subjectOfChange :loc.msoundcontent/sound,
                     :rdf/type           :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Sound content indicator for a resource that contains sound"},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value
    "MARC bib: 300 $b; 007el/05 - a; 007mpic/pg/vi/05 - a,b; 007mpic/pg/vi/06 - a,b,c,d,e,f,g,h,i"},
   :skos/inScheme :loc.vocabulary/msoundcontent,
   :skos/notation "sound",
   :skos/prefLabel "sound"})

(def ^{:private true} msoundcontent
  "Presence or absence of sound."
  {:db/ident        :loc.vocabulary/msoundcontent,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/dlc",
    :ri/recordStatus "new"},
   :madsrdf/hasMADSSchemeMember [:loc.msoundcontent/silent
                                 :loc.msoundcontent/sound],
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "Presence or absence of sound.",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "MARC Sound Content List"},
   :skos/changeNote {:cs/changeReason    "new",
                     :cs/createdDate     #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName     "https://id.loc.gov/vocabulary/dlc",
                     :cs/subjectOfChange :loc.vocabulary/msoundcontent,
                     :rdf/type           :cs/ChangeSet}})