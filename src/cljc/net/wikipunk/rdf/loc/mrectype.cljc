(ns net.wikipunk.rdf.loc.mrectype
  "http://id.loc.gov/vocabulary/mrectype/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mrectype.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mrectype" "http://id.loc.gov/vocabulary/mrectype/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mrectype",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mrectype/"})

(def analog
  "Type of recording in which the content is stored as continuous variable quantities in or on the media"
  {:db/ident :loc.mrectype/analog,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "analog",
   :madsrdf/code "analog",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Type of recording in which the content is stored as continuous variable quantities in or on the media"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "MARC bib: 344 $a; 007sr/13 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.mrectype/collection_mrectype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrectype,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrectype/analog,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Type of recording in which the content is stored as continuous variable quantities in or on the media"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "MARC bib: 344 $a; 007sr/13 - e"},
   :skos/inScheme :loc.vocabulary/mrectype,
   :skos/notation "analog",
   :skos/prefLabel "analog"})

(def digital
  "Type of recording in which the content is continuously sampled and a sequence of discrete binary values is stored to represent the amplitude of each sample in the waveform"
  {:db/ident :loc.mrectype/digital,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "digital",
   :madsrdf/code "digital",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Type of recording in which the content is continuously sampled and a sequence of discrete binary values is stored to represent the amplitude of each sample in the waveform"},
   :madsrdf/editorialNote {:rdf/language "en",
                           :rdf/value    "MARC bib: 344 $a; 007sr/12 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.mrectype/collection_mrectype,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mrectype,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mrectype/digital,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Type of recording in which the content is continuously sampled and a sequence of discrete binary values is stored to represent the amplitude of each sample in the waveform"},
   :skos/editorial {:rdf/language "en",
                    :rdf/value    "MARC bib: 344 $a; 007sr/12 - e"},
   :skos/inScheme :loc.vocabulary/mrectype,
   :skos/notation "digital",
   :skos/prefLabel "digital"})

(def ^{:private true} mrectype
  ""
  {:db/ident        :loc.vocabulary/mrectype,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-10-12T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/hasMADSSchemeMember [:loc.mrectype/digital :loc.mrectype/analog],
   :rdf/type        [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment    "",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Recording Type"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-10-12T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mrectype,
                     :rdf/type :cs/ChangeSet}})