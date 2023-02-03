(ns net.wikipunk.rdf.loc.mpolarity
  "http://id.loc.gov/vocabulary/mpolarity/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mpolarity.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mpolarity"
                       "http://id.loc.gov/vocabulary/mpolarity/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mpolarity",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mpolarity/"})

(def mix
  "Mixture of positive and negative resources."
  {:db/ident :loc.mpolarity/mix,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "mixed",
   :madsrdf/code "mix",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Mixture of positive and negative resources."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "MARC bib: 007mp/07, mi/03, mpic/10 - m"},
   :madsrdf/isMemberOfMADSCollection :loc.mpolarity/collection_mpolarity,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpolarity,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpolarity/mix,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "Mixture of positive and negative resources."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mp/07, mi/03, mpic/10 - m"},
   :skos/inScheme :loc.vocabulary/mpolarity,
   :skos/notation "mix",
   :skos/prefLabel "mixed"})

(def neg
  "Polarity is negative. For a black-and-white film, tonal values are the opposite of those in the original subject matter. For a color film, tonal values are the complements of the original subject matter (e.g., red appears as green in a color negative). Lines and characters appear light against a dark background."
  {:db/ident :loc.mpolarity/neg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "negative",
   :madsrdf/code "neg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Polarity is negative. For a black-and-white film, tonal values are the opposite of those in the original subject matter. For a color film, tonal values are the complements of the original subject matter (e.g., red appears as green in a color negative). Lines and characters appear light against a dark background."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "MARC bib: 007mp/07, mi/03, mpic/10 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mpolarity/collection_mpolarity,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpolarity,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpolarity/neg,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Polarity is negative. For a black-and-white film, tonal values are the opposite of those in the original subject matter. For a color film, tonal values are the complements of the original subject matter (e.g., red appears as green in a color negative). Lines and characters appear light against a dark background."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mp/07, mi/03, mpic/10 - b"},
   :skos/inScheme :loc.vocabulary/mpolarity,
   :skos/notation "neg",
   :skos/prefLabel "negative"})

(def pos
  "Polarity is positive. Colors and/or tonal values are the same as the original subject matter. Lines and characters appear dark against a light background."
  {:db/ident :loc.mpolarity/pos,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "positive",
   :madsrdf/code "pos",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Polarity is positive. Colors and/or tonal values are the same as the original subject matter. Lines and characters appear dark against a light background."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value "MARC bib: 007mp/07, mi/03, mpic/10 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpolarity/collection_mpolarity,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpolarity,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpolarity/pos,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Polarity is positive. Colors and/or tonal values are the same as the original subject matter. Lines and characters appear dark against a light background."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mp/07, mi/03, mpic/10 - a"},
   :skos/inScheme :loc.vocabulary/mpolarity,
   :skos/notation "pos",
   :skos/prefLabel "positive"})

(def ^{:private true} mpolarity
  "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."
  {:db/ident :loc.vocabulary/mpolarity,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."},
   :madsrdf/hasMADSSchemeMember
   [:loc.mpolarity/pos :loc.mpolarity/mix :loc.mpolarity/neg],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Polarity"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mpolarity,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relationship of the colors and tones in an image to the colors and tones of the object reproduced."}})