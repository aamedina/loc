(ns net.wikipunk.rdf.loc.mtechnique
  "http://id.loc.gov/vocabulary/mtechnique/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mtechnique.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mtechnique"
                       "http://id.loc.gov/vocabulary/mtechnique/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mtechnique",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mtechnique/"})

(def anim
  "Animated films are produced using a variety of techniques including 1) cartoons; 2) graphic film (with paint or other media directly applied to the surface of the film); 3) model, clay, or puppet animation (where three-dimensional objects are photographed one frame at a time to achieve the effect of animation); and 4) other techniques."
  {:db/ident :loc.mtechnique/anim,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-04-27T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "animation",
   :madsrdf/code "anim",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Animated films are produced using a variety of techniques including 1) cartoons; 2) graphic film (with paint or other media directly applied to the surface of the film); 3) model, clay, or puppet animation (where three-dimensional objects are photographed one frame at a time to achieve the effect of animation); and 4) other techniques."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008v/34-a"},
   :madsrdf/isMemberOfMADSCollection :loc.mtechnique/collection_mtechnique,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtechnique,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-04-27T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtechnique/anim,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Animated films are produced using a variety of techniques including 1) cartoons; 2) graphic film (with paint or other media directly applied to the surface of the film); 3) model, clay, or puppet animation (where three-dimensional objects are photographed one frame at a time to achieve the effect of animation); and 4) other techniques."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008v/34-a"},
   :skos/inScheme :loc.vocabulary/mtechnique,
   :skos/notation "anim",
   :skos/prefLabel "animation"})

(def animlive
  "Combination of animation and live action."
  {:db/ident :loc.mtechnique/animlive,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-04-27T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "animation and live action",
   :madsrdf/code "animlive",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Combination of animation and live action."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008v/34-c"},
   :madsrdf/isMemberOfMADSCollection :loc.mtechnique/collection_mtechnique,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtechnique,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-04-27T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtechnique/animlive,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Combination of animation and live action."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008v/34-c"},
   :skos/inScheme :loc.vocabulary/mtechnique,
   :skos/notation "animlive",
   :skos/prefLabel "animation and live action"})

(def live
  "If no information is found in the cataloging record and accompanying material that indicates otherwise, it is assumed that the motion picture or videorecording is live action"
  {:db/ident :loc.mtechnique/live,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-04-27T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "live action",
   :madsrdf/code "live",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "If no information is found in the cataloging record and accompanying material that indicates otherwise, it is assumed that the motion picture or videorecording is live action"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008v/34-l"},
   :madsrdf/isMemberOfMADSCollection :loc.mtechnique/collection_mtechnique,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtechnique,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-04-27T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtechnique/live,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "If no information is found in the cataloging record and accompanying material that indicates otherwise, it is assumed that the motion picture or videorecording is live action"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008v/34-l"},
   :skos/inScheme :loc.vocabulary/mtechnique,
   :skos/notation "live",
   :skos/prefLabel "live action"})

(def other
  "Primarily of special techniques which are neither animation nor live action. These include microcinematography, time lapse cinematography, trick cinematography, and other techniques. Also used for videorecordings and motion pictures which were made from still image slide sets or filmstrips without adding animation to the images."
  {:db/ident :loc.mtechnique/other,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-04-27T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other",
   :madsrdf/code "other",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Primarily of special techniques which are neither animation nor live action. These include microcinematography, time lapse cinematography, trick cinematography, and other techniques. Also used for videorecordings and motion pictures which were made from still image slide sets or filmstrips without adding animation to the images."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008v/34-z"},
   :madsrdf/isMemberOfMADSCollection :loc.mtechnique/collection_mtechnique,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mtechnique,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-04-27T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mtechnique/other,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Primarily of special techniques which are neither animation nor live action. These include microcinematography, time lapse cinematography, trick cinematography, and other techniques. Also used for videorecordings and motion pictures which were made from still image slide sets or filmstrips without adding animation to the images."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008v/34-z"},
   :skos/inScheme :loc.vocabulary/mtechnique,
   :skos/notation "other",
   :skos/prefLabel "other"})

(def ^{:private true} mtechnique
  "Technique used in creating motion in motion pictures or videorecordings"
  {:db/ident :loc.vocabulary/mtechnique,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2018-04-27T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Technique used in creating motion in motion pictures or videorecordings"},
   :madsrdf/hasMADSSchemeMember [:loc.mtechnique/other
                                 :loc.mtechnique/anim
                                 :loc.mtechnique/animlive
                                 :loc.mtechnique/live],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "008v/34-a"},
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technique"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2018-04-27T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mtechnique,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Technique used in creating motion in motion pictures or videorecordings"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "008v/34-a"}})