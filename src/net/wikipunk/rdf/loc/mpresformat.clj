(ns net.wikipunk.rdf.loc.mpresformat
  "http://id.loc.gov/vocabulary/mpresformat/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mpresformat.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mpresformat"
                       "http://id.loc.gov/vocabulary/mpresformat/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mpresformat",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mpresformat/"})

(def cinem
  "Presentation format of a motion picture film that presents an aspect ratio of 2.59:1 using three synchronized projectors"
  {:db/ident :loc.mpresformat/cinem,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Cinemiracle",
   :madsrdf/code "cinem",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that presents an aspect ratio of 2.59:1 using three synchronized projectors"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/cinem,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that presents an aspect ratio of 2.59:1 using three synchronized projectors"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "cinem",
   :skos/prefLabel "Cinemiracle"})

(def ciner
  "Presentation format of a motion picture film that presents an aspect ratio of up to 2.76:1, originally using three synchronized projectors"
  {:db/ident :loc.mpresformat/ciner,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Cinerama",
   :madsrdf/code "ciner",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that presents an aspect ratio of up to 2.76:1, originally using three synchronized projectors"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/ciner,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that presents an aspect ratio of up to 2.76:1, originally using three synchronized projectors"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "ciner",
   :skos/prefLabel "Cinerama"})

(def circa
  "Presentation format of a motion picture film that uses nine projectors for screens arranged in a circle"
  {:db/ident :loc.mpresformat/circa,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Circarama",
   :madsrdf/code "circa",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that uses nine projectors for screens arranged in a circle"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/circa,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that uses nine projectors for screens arranged in a circle"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "circa",
   :skos/prefLabel "Circarama"})

(def imax
  "Presentation format of a motion picture film that projects images of far greater size and resolution than conventional film systems"
  {:db/ident :loc.mpresformat/imax,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "IMAX",
   :madsrdf/code "imax",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that projects images of far greater size and resolution than conventional film systems"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/imax,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that projects images of far greater size and resolution than conventional film systems"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "imax",
   :skos/prefLabel "IMAX"})

(def mproj
  "Presentation format of a motion picture film using multiple synchronized projectors"
  {:db/ident :loc.mpresformat/mproj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "multiprojector",
   :madsrdf/code "mproj",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film using multiple synchronized projectors"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/mproj,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film using multiple synchronized projectors"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "mproj",
   :skos/prefLabel "multiprojector"})

(def mscreen
  "Presentation format of a motion picture film using multiple screens"
  {:db/ident :loc.mpresformat/mscreen,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "multiscreen",
   :madsrdf/code "mscreen",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film using multiple screens"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/mscreen,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film using multiple screens"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "mscreen",
   :skos/prefLabel "multiscreen"})

(def pana
  "Presentation format of a motion picture film that presents a wide-screen aspect ratio using Panavision anamorphic lenses"
  {:db/ident :loc.mpresformat/pana,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Panavision",
   :madsrdf/code "pana",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that presents a wide-screen aspect ratio using Panavision anamorphic lenses"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/pana,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that presents a wide-screen aspect ratio using Panavision anamorphic lenses"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "pana",
   :skos/prefLabel "Panavision"})

(def silent
  "Presentation format of a motion picture film that uses a standard projector aperture for silent film"
  {:db/ident :loc.mpresformat/silent,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "standard silent aperture",
   :madsrdf/code "silent",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that uses a standard projector aperture for silent film"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a ; 007mpic/04 - f"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/silent,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that uses a standard projector aperture for silent film"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a ; 007mpic/04 - f"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "silent",
   :skos/prefLabel "standard silent aperture"})

(def sound
  "Presentation format of a motion picture film that uses a standard projector aperture for film with a sound-track"
  {:db/ident :loc.mpresformat/sound,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "standard sound aperture",
   :madsrdf/code "sound",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that uses a standard projector aperture for film with a sound-track"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a ; 007mpic/04 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/sound,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that uses a standard projector aperture for film with a sound-track"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a ; 007mpic/04 - a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "sound",
   :skos/prefLabel "standard sound aperture"})

(def stereo
  "Presentation format of a motion picture film that gives the illusion of three dimensions by using stereoscopic images"
  {:db/ident :loc.mpresformat/stereo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "stereoscopic",
   :madsrdf/code "stereo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that gives the illusion of three dimensions by using stereoscopic images"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/stereo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that gives the illusion of three dimensions by using stereoscopic images"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "stereo",
   :skos/prefLabel "stereoscopic"})

(def tech
  "Presentation format of a motion picture film that presents an aspect ratio of 2.33:1 using 35 mm film"
  {:db/ident :loc.mpresformat/tech,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Techniscope",
   :madsrdf/code "tech",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that presents an aspect ratio of 2.33:1 using 35 mm film"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/tech,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that presents an aspect ratio of 2.33:1 using 35 mm film"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "tech",
   :skos/prefLabel "Techniscope"})

(def |3d|
  "Presentation format of a motion picture film that gives the illusion of three dimensions"
  {:db/ident :loc.mpresformat/|3d|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "3D",
   :madsrdf/code "3d",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that gives the illusion of three dimensions"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "three dimensional",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a ; 007mpic/04 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.mpresformat/collection_mpresformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mpresformat,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "three dimensional",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mpresformat/|3d|,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Presentation format of a motion picture film that gives the illusion of three dimensions"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a ; 007mpic/04 - c"},
   :skos/inScheme :loc.vocabulary/mpresformat,
   :skos/notation "3d",
   :skos/prefLabel "3D",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "three dimensional"}})

(def ^{:private true} mpresformat
  "Format used in the production of a projected image"
  {:db/ident :loc.vocabulary/mpresformat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-11-16T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Format used in the production of a projected image"},
   :madsrdf/hasMADSSchemeMember [:loc.mpresformat/ciner
                                 :loc.mpresformat/circa
                                 :loc.mpresformat/cinem
                                 :loc.mpresformat/tech
                                 :loc.mpresformat/silent
                                 :loc.mpresformat/mscreen
                                 :loc.mpresformat/stereo
                                 :loc.mpresformat/imax
                                 :loc.mpresformat/mproj
                                 :loc.mpresformat/sound
                                 :loc.mpresformat/|3d|
                                 :loc.mpresformat/pana],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 345 $a; 007mpic/04"},
   :rdf/type [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Presentation Format"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-11-16T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/mpresformat,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Format used in the production of a projected image"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 345 $a; 007mpic/04"}})