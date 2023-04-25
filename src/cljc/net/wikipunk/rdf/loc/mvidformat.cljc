(ns net.wikipunk.rdf.loc.mvidformat
  "http://id.loc.gov/vocabulary/mvidformat/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mvidformat.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mvidformat"
                       "http://id.loc.gov/vocabulary/mvidformat/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mvidformat",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mvidformat/"})

(def betacam
  "Video format for analog tape developed for professional use by Sony in 1982"
  {:db/ident :loc.mvidformat/betacam,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Betacam",
   :madsrdf/code "betacam",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Sony in 1982"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - i"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/betacam,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Sony in 1982"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - i"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "betacam",
   :skos/prefLabel "Betacam"})

(def betamax
  "Video format for analog tape developed for consumer use by Sony in 1975"
  {:db/ident :loc.mvidformat/betamax,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Betamax",
   :madsrdf/code "betamax",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for consumer use by Sony in 1975"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/betamax,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for consumer use by Sony in 1975"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - a"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "betamax",
   :skos/prefLabel "Betamax"})

(def betasp
  "Video format for analog tape based on the Betacam format that increases horizontal resolution to 340 lines"
  {:db/ident :loc.mvidformat/betasp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Betacam SP",
   :madsrdf/code "betasp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape based on the Betacam format that increases horizontal resolution to 340 lines"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - j"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/betasp,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape based on the Betacam format that increases horizontal resolution to 340 lines"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - j"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "betasp",
   :skos/prefLabel "Betacam SP"})

(def ced
  "Video format for analog disc"
  {:db/ident :loc.mvidformat/ced,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "CED",
   :madsrdf/code "ced",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "Video format for analog disc"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - h"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/ced,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Video format for analog disc"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - h"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "ced",
   :skos/prefLabel "CED"})

(def d2
  "Video format for analog tape developed for professional use by Ampex in 1988"
  {:db/ident :loc.mvidformat/d2,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "D-2",
   :madsrdf/code "d2",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Ampex in 1988"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - o"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/d2,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Ampex in 1988"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - o"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "d2",
   :skos/prefLabel "D-2"})

(def eiaj
  "Video format for analog tape developed for professional use by the Electronic Industries Association of Japan in 1969"
  {:db/ident :loc.mvidformat/eiaj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "EIAJ",
   :madsrdf/code "eiaj",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by the Electronic Industries Association of Japan in 1969"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - d"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/eiaj,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by the Electronic Industries Association of Japan in 1969"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - d"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "eiaj",
   :skos/prefLabel "EIAJ"})

(def hi8mm
  "Video format for analog tape that is part of the 8 mm format"
  {:db/ident :loc.mvidformat/hi8mm,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Hi-8mm",
   :madsrdf/code "hi8mm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Video format for analog tape that is part of the 8 mm format"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - q"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/hi8mm,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Video format for analog tape that is part of the 8 mm format"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - q"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "hi8mm",
   :skos/prefLabel "Hi-8mm"})

(def laser
  "Video format for optical disc that is read by a laser"
  {:db/ident :loc.mvidformat/laser,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "laser optical",
   :madsrdf/code "laser",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "Video format for optical disc that is read by a laser"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - g"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/laser,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Video format for optical disc that is read by a laser"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - g"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "laser",
   :skos/prefLabel "laser optical"})

(def mii
  "Video format for analog tape developed for professional use by Panasonic in 1986"
  {:db/ident :loc.mvidformat/mii,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "M-II",
   :madsrdf/code "mii",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Panasonic in 1986"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - m"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/mii,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Panasonic in 1986"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - m"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "mii",
   :skos/prefLabel "M-II"})

(def quad
  "Video format for analog tape developed for professional use by Ampex in 1956"
  {:db/ident :loc.mvidformat/quad,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Quadruplex",
   :madsrdf/code "quad",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Ampex in 1956"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - f"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:skos/Concept :madsrdf/Authority],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/quad,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Ampex in 1956"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - f"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "quad",
   :skos/prefLabel "Quadruplex"})

(def svhs
  "Video format for analog tape based on VHS that increases horizontal resolution to 420 lines"
  {:db/ident :loc.mvidformat/svhs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Super-VHS",
   :madsrdf/code "svhs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape based on VHS that increases horizontal resolution to 420 lines"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - k"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/svhs,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape based on VHS that increases horizontal resolution to 420 lines"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - k"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "svhs",
   :skos/prefLabel "Super-VHS"})

(def typec
  "Video format for analog tape developed for professional use by Ampex and Sony in 1976"
  {:db/ident :loc.mvidformat/typec,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "Type C",
   :madsrdf/code "typec",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Ampex and Sony in 1976"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - e"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/typec,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Ampex and Sony in 1976"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - e"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "typec",
   :skos/prefLabel "Type C"})

(def umatic
  "Video format for analog tape developed for professional use by Sony in 1969"
  {:db/ident :loc.mvidformat/umatic,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "U-matic",
   :madsrdf/code "umatic",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Sony in 1969"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/umatic,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for professional use by Sony in 1969"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - c"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "umatic",
   :skos/prefLabel "U-matic"})

(def vhs
  "Video format for analog tape developed for consumer use by JVC in the 1970s"
  {:db/ident :loc.mvidformat/vhs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "VHS",
   :madsrdf/code "vhs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for consumer use by JVC in the 1970s"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/vhs,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog tape developed for consumer use by JVC in the 1970s"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - b"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "vhs",
   :skos/prefLabel "VHS"})

(def |8mm|
  "Video format for analog and digital tape that includes Video8, Hi-8, and Digital8 formats"
  {:db/ident :loc.mvidformat/|8mm|,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "8mm",
   :madsrdf/code "8mm",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Video format for analog and digital tape that includes Video8, Hi-8, and Digital8 formats"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 346 $a; 007vi/04 - p"},
   :madsrdf/isMemberOfMADSCollection :loc.mvidformat/collection_mvidformat,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mvidformat,
   :rdf/type [:madsrdf/Authority :skos/Concept],
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.mvidformat/|8mm|,
    :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Video format for analog and digital tape that includes Video8, Hi-8, and Digital8 formats"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 346 $a; 007vi/04 - p"},
   :skos/inScheme :loc.vocabulary/mvidformat,
   :skos/notation "8mm",
   :skos/prefLabel "8mm"})

(def ^{:private true} mvidformat
  "Used to encode the video content of a resource"
  {:db/ident :loc.vocabulary/mvidformat,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :ri/recordContentSource
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Used to encode the video content of a resource"},
   :madsrdf/hasMADSSchemeMember [:loc.mvidformat/vhs
                                 :loc.mvidformat/betasp
                                 :loc.mvidformat/quad
                                 :loc.mvidformat/typec
                                 :loc.mvidformat/ced
                                 :loc.mvidformat/svhs
                                 :loc.mvidformat/betacam
                                 :loc.mvidformat/|8mm|
                                 :loc.mvidformat/laser
                                 :loc.mvidformat/mii
                                 :loc.mvidformat/eiaj
                                 :loc.mvidformat/hi8mm
                                 :loc.mvidformat/betamax
                                 :loc.mvidformat/umatic
                                 :loc.mvidformat/d2],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Video Format"},
   :skos/changeNote
   {:cs/changeReason "new",
    :cs/createdDate
    "\"2017-11-17T00:00:00/dlc\"^^http://www.w3.org/2001/XMLSchema#dateTime",
    :cs/creatorName
    "https://id.loc.gov/vocabulary/organizations/2017-11-17T00:00:00/dlc",
    :cs/subjectOfChange :loc.vocabulary/mvidformat,
    :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Used to encode the video content of a resource"}})