(ns net.wikipunk.rdf.loc.mrecmedium
  "http://id.loc.gov/vocabulary/mrecmedium/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mrecmedium.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mrecmedium"
                       "http://id.loc.gov/vocabulary/mrecmedium/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mrecmedium",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mrecmedium/"})

(def mag
  "Recording medium that relies on pole reversal in a ferromagnetic medium, typically ferromagnetic oxide particles bound to a tape or a disc"
  {:db/ident :loc.mrecmedium/mag,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "magnetic",
   :madsrdf/code "mag",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Recording medium that relies on pole reversal in a ferromagnetic medium, typically ferromagnetic oxide particles bound to a tape or a disc"},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 344 $b; 007el/01 - j; 007mpic/vi/06 - b, c,e,f"},
   :madsrdf/isMemberOfMADSCollection :loc.mrecmedium/collection_mrecmedium,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrecmedium,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrecmedium/mag,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Recording medium that relies on pole reversal in a ferromagnetic medium, typically ferromagnetic oxide particles bound to a tape or a disc"},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 344 $b; 007el/01 - j; 007mpic/vi/06 - b, c,e,f"},
   :skos/inScheme :loc.vocabulary/mrecmedium,
   :skos/notation "mag",
   :skos/prefLabel "magnetic"})

(def magopt
  "Recording medium that uses a combination of laser heating with a varying magnetic field to write data to a disc"
  {:db/ident :loc.mrecmedium/magopt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "magneto-optical",
   :madsrdf/code "magopt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Recording medium that uses a combination of laser heating with a varying magnetic field to write data to a disc"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 344 $b; 007el/01 - m; 007mpic/vi/06 - g"},
   :madsrdf/isMemberOfMADSCollection :loc.mrecmedium/collection_mrecmedium,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrecmedium,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrecmedium/magopt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Recording medium that uses a combination of laser heating with a varying magnetic field to write data to a disc"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 344 $b; 007el/01 - m; 007mpic/vi/06 - g"},
   :skos/inScheme :loc.vocabulary/mrecmedium,
   :skos/notation "magopt",
   :skos/prefLabel "magneto-optical"})

(def opt
  "Recording medium for recording binary encoded data in a transparent medium with a reflective backing. A laser is used to read the changes in reflectivity as a binary data stream"
  {:db/ident :loc.mrecmedium/opt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "optical",
   :madsrdf/code "opt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Recording medium for recording binary encoded data in a transparent medium with a reflective backing. A laser is used to read the changes in reflectivity as a binary data stream"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 344 $b; 007el/01 - o; 007mpic/vi/06 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mrecmedium/collection_mrecmedium,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrecmedium,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrecmedium/opt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Recording medium for recording binary encoded data in a transparent medium with a reflective backing. A laser is used to read the changes in reflectivity as a binary data stream"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value
                      "MARC bib: 344 $b; 007el/01 - o; 007mpic/vi/06 - a"},
   :skos/inScheme :loc.vocabulary/mrecmedium,
   :skos/notation "opt",
   :skos/prefLabel "optical"})

(def ^{:private true} mrecmedium
  "Type of medium used to record sound on an audio carrier"
  {:db/ident :loc.vocabulary/mrecmedium,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Type of medium used to record sound on an audio carrier"},
   :madsrdf/hasMADSSchemeMember
   [:loc.mrecmedium/magopt :loc.mrecmedium/opt :loc.mrecmedium/mag],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib: 344 $b; 007el/01; 007mpic/vi/06"},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Recording Medium"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mrecmedium,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Type of medium used to record sound on an audio carrier"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value "MARC bib: 344 $b; 007el/01; 007mpic/vi/06"}})