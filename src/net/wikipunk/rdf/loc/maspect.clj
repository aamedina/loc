(ns net.wikipunk.rdf.loc.maspect
  "http://id.loc.gov/vocabulary/maspect/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/maspect.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.maspect" "http://id.loc.gov/vocabulary/maspect/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.maspect",
   :rdfa/uri          "http://id.loc.gov/vocabulary/maspect/"})

(def ana
  "Cinematography technique of shooting a widescreen picture on standard 35 mm film or other visual recording media with a non-widescreen native aspect ratio. It also refers to the projection format in which a distorted image is \"stretched\" by an anamorphic projection lens to recreate the original aspect ratio on the viewing screen."
  {:db/ident :loc.maspect/ana,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-12-08T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-12-20T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "anamorphic",
   :madsrdf/code "ana",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Cinematography technique of shooting a widescreen picture on standard 35 mm film or other visual recording media with a non-widescreen native aspect ratio. It also refers to the projection format in which a distorted image is \"stretched\" by an anamorphic projection lens to recreate the original aspect ratio on the viewing screen."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "007mpic/04-d"},
   :madsrdf/isMemberOfMADSCollection :loc.maspect/collection_maspect,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maspect,
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Wide-screen process in which the filmed images have been optically compressed or  \"squeezed\" in width but not in height.  During projection the images are restored to their normal proportions.  Both filming and projection are accomplished using special lenses.  A frequent aspect ratio is 2.35:1.  Some trade names of anamorphic processes include CinemaScope, Grandscope, Megascope, Naturama, Panavision, and Techniscope."},
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-12-20T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/ana,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-12-08T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/ana,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Cinematography technique of shooting a widescreen picture on standard 35 mm film or other visual recording media with a non-widescreen native aspect ratio. It also refers to the projection format in which a distorted image is \"stretched\" by an anamorphic projection lens to recreate the original aspect ratio on the viewing screen."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "007mpic/04-d"},
   :skos/inScheme :loc.vocabulary/maspect,
   :skos/notation "ana",
   :skos/prefLabel "anamorphic",
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Wide-screen process in which the filmed images have been optically compressed or  \"squeezed\" in width but not in height.  During projection the images are restored to their normal proportions.  Both filming and projection are accomplished using special lenses.  A frequent aspect ratio is 2.35:1.  Some trade names of anamorphic processes include CinemaScope, Grandscope, Megascope, Naturama, Panavision, and Techniscope."}})

(def full
  "Moving image resource of less than 1.5:1"
  {:db/ident :loc.maspect/full,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-12-20T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "full screen",
   :madsrdf/code "full",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Moving image resource of less than 1.5:1"},
   :madsrdf/isMemberOfMADSCollection :loc.maspect/collection_maspect,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maspect,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-12-20T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/full,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/full,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Moving image resource of less than 1.5:1"},
   :skos/inScheme :loc.vocabulary/maspect,
   :skos/notation "full",
   :skos/prefLabel "full screen"})

(def fullfra
  "fullframe"
  {:db/ident :loc.maspect/fullfra,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-12-08T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-12-20T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "fullframe",
   :madsrdf/code "fullfra",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "007mpic/04-f"},
   :madsrdf/isMemberOfMADSCollection :loc.maspect/collection_maspect,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maspect,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-12-08T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/fullfra,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-12-20T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/fullfra,
     :rdf/type           :cs/ChangeSet}],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "007mpic/04-f"},
   :skos/inScheme :loc.vocabulary/maspect,
   :skos/notation "fullfra",
   :skos/prefLabel "fullframe"})

(def letbox
  "Process of formatting a wide-screen film onto video in which the entire width of the image is visible and there are blank bands above and below the image in order to accommodate the different aspect ratios of wide-screen film and the television screen."
  {:db/ident :loc.maspect/letbox,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-12-08T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-12-20T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "letterboxed",
   :madsrdf/code "letbox",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Process of formatting a wide-screen film onto video in which the entire width of the image is visible and there are blank bands above and below the image in order to accommodate the different aspect ratios of wide-screen film and the television screen."},
   :madsrdf/isMemberOfMADSCollection :loc.maspect/collection_maspect,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maspect,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-12-20T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/letbox,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-12-08T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/letbox,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Process of formatting a wide-screen film onto video in which the entire width of the image is visible and there are blank bands above and below the image in order to accommodate the different aspect ratios of wide-screen film and the television screen."},
   :skos/inScheme :loc.vocabulary/maspect,
   :skos/notation "letbox",
   :skos/prefLabel "letterboxed"})

(def mixed
  "Includes multiple aspect ratios within the same resource"
  {:db/ident :loc.maspect/mixed,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-12-20T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "mixed aspect",
   :madsrdf/code "mixed",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Includes multiple aspect ratios within the same resource"},
   :madsrdf/isMemberOfMADSCollection :loc.maspect/collection_maspect,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maspect,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/mixed,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-12-20T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/mixed,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Includes multiple aspect ratios within the same resource"},
   :skos/inScheme :loc.vocabulary/maspect,
   :skos/notation "mixed",
   :skos/prefLabel "mixed aspect"})

(def nonana
  "Film process that achieves the wide-screen effect without optically compressing the image or requiring the use of special projection techniques.  The image is wider than in the earlier standard aspect ratio of 1.33:1.  Typical aspect ratios are 1.66:1 and 1.85:1.  The image is expanded on a wide screen through the use of normal lenses and the appropriate aperture plate."
  {:db/ident :loc.maspect/nonana,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-12-20T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-12-08T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}],
   :madsrdf/authoritativeLabel "non-anamorphic",
   :madsrdf/code "nonana",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Film process that achieves the wide-screen effect without optically compressing the image or requiring the use of special projection techniques.  The image is wider than in the earlier standard aspect ratio of 1.33:1.  Typical aspect ratios are 1.66:1 and 1.85:1.  The image is expanded on a wide screen through the use of normal lenses and the appropriate aperture plate."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "007mpic/04-b"},
   :madsrdf/isMemberOfMADSCollection :loc.maspect/collection_maspect,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maspect,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-12-20T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/nonana,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-12-08T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/nonana,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Film process that achieves the wide-screen effect without optically compressing the image or requiring the use of special projection techniques.  The image is wider than in the earlier standard aspect ratio of 1.33:1.  Typical aspect ratios are 1.66:1 and 1.85:1.  The image is expanded on a wide screen through the use of normal lenses and the appropriate aperture plate."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "007mpic/04-b"},
   :skos/inScheme :loc.vocabulary/maspect,
   :skos/notation "nonana",
   :skos/prefLabel "non-anamorphic"})

(def redfra
  "reduced frame"
  {:db/ident :loc.maspect/redfra,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-12-08T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-12-20T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "reduced frame",
   :madsrdf/code "redfra",
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "007mpic/04-a"},
   :madsrdf/isMemberOfMADSCollection :loc.maspect/collection_maspect,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maspect,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-12-20T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/redfra,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-12-08T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/redfra,
     :rdf/type           :cs/ChangeSet}],
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "007mpic/04-a"},
   :skos/inScheme :loc.vocabulary/maspect,
   :skos/notation "redfra",
   :skos/prefLabel "reduced frame"})

(def wide
  "Moving image resource of 1.5:1 or greater. Motion picture with an aspect ratio greater than the older 35 mm. standard of four to three, or 1.33:1. Wide-screen films may have aspect ratios from 1.65:1 up to 2.55:1."
  {:db/ident :loc.maspect/wide,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2022-12-20T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "wide screen",
   :madsrdf/code "wide",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Moving image resource of 1.5:1 or greater. Motion picture with an aspect ratio greater than the older 35 mm. standard of four to three, or 1.33:1. Wide-screen films may have aspect ratios from 1.65:1 up to 2.55:1."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "007mpic/04-b,d,e"},
   :madsrdf/isMemberOfMADSCollection :loc.maspect/collection_maspect,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/maspect,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2022-12-20T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/wide,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2017-09-22T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.maspect/wide,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Moving image resource of 1.5:1 or greater. Motion picture with an aspect ratio greater than the older 35 mm. standard of four to three, or 1.33:1. Wide-screen films may have aspect ratios from 1.65:1 up to 2.55:1."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "007mpic/04-b,d,e"},
   :skos/inScheme :loc.vocabulary/maspect,
   :skos/notation "wide",
   :skos/prefLabel "wide screen"})

(def ^{:private true} maspect
  "Width of the screen image in relation to its height."
  {:db/ident :loc.vocabulary/maspect,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Width of the screen image in relation to its height."},
   :madsrdf/hasMADSSchemeMember [:loc.maspect/mixed
                                 :loc.maspect/full
                                 :loc.maspect/nonana
                                 :loc.maspect/letbox
                                 :loc.maspect/ana
                                 :loc.maspect/wide
                                 :loc.maspect/fullfra
                                 :loc.maspect/redfra],
   :madsrdf/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The older 35 mm. standard aspect ratio was 1.33:1 or four to three.  The early television industry adopted this ratio.  Some common aspect ratios for wide-screen films are 1.66:1, 1.85:1, and 2.35:1."},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Aspect Ratio Scheme"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/maspect,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Width of the screen image in relation to its height."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "The older 35 mm. standard aspect ratio was 1.33:1 or four to three.  The early television industry adopted this ratio.  Some common aspect ratios for wide-screen films are 1.66:1, 1.85:1, and 2.35:1."}})