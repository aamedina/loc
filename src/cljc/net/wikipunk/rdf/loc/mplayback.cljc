(ns net.wikipunk.rdf.loc.mplayback
  "http://id.loc.gov/vocabulary/mplayback/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mplayback.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mplayback"
                       "http://id.loc.gov/vocabulary/mplayback/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mplayback",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mplayback/"})

(def mix
  "More than one configuration of playback channels is available on a single resource"
  {:db/ident :loc.mplayback/mix,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "mixed",
   :madsrdf/code "mix",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "More than one configuration of playback channels is available on a single resource"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/vi/08; 007sr/04 - k"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayback/collection_mplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayback,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.mplayback/mix,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "More than one configuration of playback channels is available on a single resource"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/vi/08; 007sr/04 - k"},
   :skos/inScheme :loc.vocabulary/mplayback,
   :skos/notation "mix",
   :skos/prefLabel "mixed"})

(def mon
  "Configured to be played back on one channel"
  {:db/ident :loc.mplayback/mon,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "mono",
   :madsrdf/code "mon",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Configured to be played back on one channel"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "monaural",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/vi/08; 007sr/04 - m"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayback/collection_mplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayback,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "monaural",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.mplayback/mon,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Configured to be played back on one channel"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/vi/08; 007sr/04 - m"},
   :skos/inScheme :loc.vocabulary/mplayback,
   :skos/notation "mon",
   :skos/prefLabel "mono",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "monaural"}})

(def mul
  "Configured to be played back on more than two channels, such as Dolby surround sound tracks and other multichannel techniques"
  {:db/ident :loc.mplayback/mul,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "surround",
   :madsrdf/code "mul",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Configured to be played back on more than two channels, such as Dolby surround sound tracks and other multichannel techniques"},
   :madsrdf/hasVariant [{:madsrdf/variantLabel "multichannel",
                         :rdf/type :madsrdf/Variant}
                        {:madsrdf/variantLabel "quadraphonic",
                         :rdf/type :madsrdf/Variant}],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/vi/08; 007sr/04 - q"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayback/collection_mplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayback,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel ["multichannel" "quadraphonic"],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.mplayback/mul,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Configured to be played back on more than two channels, such as Dolby surround sound tracks and other multichannel techniques"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/vi/08; 007sr/04 - q"},
   :skos/inScheme :loc.vocabulary/mplayback,
   :skos/notation "mul",
   :skos/prefLabel "surround",
   :skosxl/altLabel [{:rdf/type :skosxl/Label,
                      :skosxl/literalForm "quadraphonic"}
                     {:rdf/type :skosxl/Label,
                      :skosxl/literalForm "multichannel"}]})

(def ste
  "Configured to be played back on two separate channels"
  {:db/ident :loc.mplayback/ste,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "stereo",
   :madsrdf/code "ste",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Configured to be played back on two separate channels"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "stereophonic",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/vi/08; 007sr/04 - s"},
   :madsrdf/isMemberOfMADSCollection :loc.mplayback/collection_mplayback,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mplayback,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "stereophonic",
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2020-10-14T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2020-10-14T00:00:00/dlc",
    :cs/subjectOfChange :loc.mplayback/ste,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Configured to be played back on two separate channels"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/vi/08; 007sr/04 - s"},
   :skos/inScheme :loc.vocabulary/mplayback,
   :skos/notation "ste",
   :skos/prefLabel "stereo",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "stereophonic"}})

(def ^{:private true} mplayback
  "Configuration of sound channels used to make a recording."
  {:db/ident :loc.vocabulary/mplayback,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-15T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-15T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Configuration of sound channels used to make a recording."},
   :madsrdf/hasMADSSchemeMember [:loc.mplayback/ste
                                 :loc.mplayback/mix
                                 :loc.mplayback/mon
                                 :loc.mplayback/mul],
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Playback Channels"},
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-15T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-15T00:00:00/dlc",
    :cs/subjectOfChange :loc.vocabulary/mplayback,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Configuration of sound channels used to make a recording."}})