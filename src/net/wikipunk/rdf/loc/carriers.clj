(ns net.wikipunk.rdf.loc.carriers
  "http://id.loc.gov/vocabulary/carriers/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/carriers.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.carriers" "http://id.loc.gov/vocabulary/carriers/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.carriers",
   :rdfa/uri          "http://id.loc.gov/vocabulary/carriers/"})

(def ca
  "A cartridge containing a computer tape"
  {:db/ident :loc.carriers/ca,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer tape cartridge",
   :madsrdf/code "ca",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A cartridge containing a computer tape"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007er/01-a"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_ComputerCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/ca,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cartridge containing a computer tape"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007er/01-a"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "ca",
   :skos/prefLabel "computer tape cartridge"})

(def cb
  "A cartridge containing a miniaturized electronic circuit on a small wafer of semiconductor silicon designed to provide additional capacity"
  {:db/ident :loc.carriers/cb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer chip cartridge",
   :madsrdf/code "cb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A cartridge containing a miniaturized electronic circuit on a small wafer of semiconductor silicon designed to provide additional capacity"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007er/01-b "},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_ComputerCarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/cb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A cartridge containing a miniaturized electronic circuit on a small wafer of semiconductor silicon designed to provide additional capacity"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007er/01-b"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "cb",
   :skos/prefLabel "computer chip cartridge"})

(def cd
  "A disc containing digitally encoded data that is magnetically or optically recorded"
  {:db/ident :loc.carriers/cd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer disc",
   :madsrdf/code "cd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A disc containing digitally encoded data that is magnetically or optically recorded"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007er/01-d"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_ComputerCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/cd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A disc containing digitally encoded data that is magnetically or optically recorded"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007er/01-d"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "cd",
   :skos/prefLabel "computer disc"})

(def ce
  "A cartridge containing one or more computer discs"
  {:db/ident :loc.carriers/ce,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer disc cartridge",
   :madsrdf/code "ce",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A cartridge containing one or more computer discs"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007er/01-e"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_ComputerCarriers
                                      :loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/ce,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A cartridge containing one or more computer discs"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007er/01-e"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "ce",
   :skos/prefLabel "computer disc cartridge"})

(def cf
  "A cassette containing a computer tape"
  {:db/ident :loc.carriers/cf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer tape cassette",
   :madsrdf/code "cf",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "A cassette containing a computer tape"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007er/01-f"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_ComputerCarriers
                                      :loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/cf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cassette containing a computer tape"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007er/01-f"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "cf",
   :skos/prefLabel "computer tape cassette"})

(def ch
  "An open reel holding a length of compter tape to be used with a computer tape drive"
  {:db/ident :loc.carriers/ch,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer tape reel",
   :madsrdf/code "ch",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a length of compter tape to be used with a computer tape drive"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007er/01-h"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_Carriers
                                      :loc.carriers/collection_ComputerCarriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/ch,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a length of compter tape to be used with a computer tape drive"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007er/01-h"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "ch",
   :skos/prefLabel "computer tape reel"})

(def ck
  "A card containing digitally encoded data desgined for use with a computer"
  {:db/ident :loc.carriers/ck,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "computer card",
   :madsrdf/code "ck",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A card containing digitally encoded data desgined for use with a computer"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007er/01-k "},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_ComputerCarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/ck,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A card containing digitally encoded data desgined for use with a computer"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007er/01-k"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "ck",
   :skos/prefLabel "computer card"})

(def cr
  "A digital resource accessed by means of hardware and software connections to a communications network"
  {:db/ident :loc.carriers/cr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "online resource",
   :madsrdf/code "cr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A digital resource accessed by means of hardware and software connections to a communications network"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007er/01-r"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_Carriers
                                      :loc.carriers/collection_ComputerCarriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/cr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A digital resource accessed by means of hardware and software connections to a communications network"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007er/01-r"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "cr",
   :skos/prefLabel "online resource"})

(def cz
  "A computer carrier not represented by existing carrier types"
  {:db/ident :loc.carriers/cz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other computer carrier",
   :madsrdf/code "cz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A computer carrier not represented by existing carrier types"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007er/01-z"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_ComputerCarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/cz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A computer carrier not represented by existing carrier types"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007er/01-z"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "cz",
   :skos/prefLabel "other computer carrier"})

(def eh
  "A card bearing stereographic images"
  {:db/ident :loc.carriers/eh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "stereograph card",
   :madsrdf/code "eh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "A card bearing stereographic images"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007npg/00-k"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_StereographicCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/eh,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A card bearing stereographic images"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007npg/00-k"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "eh",
   :skos/prefLabel "stereograph card"})

(def es
  "A disc with openings around the perimter holding pairs of still images designed for use with a stereograph viewer"
  {:db/ident :loc.carriers/es,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "stereograph disc",
   :madsrdf/code "es",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A disc with openings around the perimter holding pairs of still images designed for use with a stereograph viewer"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007pg/01-s"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_RDACarriers
    :loc.carriers/collection_Carriers
    :loc.carriers/collection_StereographicCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/es,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A disc with openings around the perimter holding pairs of still images designed for use with a stereograph viewer"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007pg/01-s"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "es",
   :skos/prefLabel "stereograph disc"})

(def ez
  "A stereographic carrier not represented by existing carrier types"
  {:db/ident :loc.carriers/ez,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other stereographic carrier",
   :madsrdf/code "ez",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A stereographic carrier not represented by existing carrier types"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007/01-no code"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_StereographicCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/ez,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A stereographic carrier not represented by existing carrier types"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007/01-no code"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "ez",
   :skos/prefLabel "other stereographic carrier"})

(def gc
  "A cartridge containing a filmstrip"
  {:db/ident :loc.carriers/gc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "filmstrip cartridge",
   :madsrdf/code "gc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A cartridge containing a filmstrip"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007pg/01-c"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_ProjectedImageCarriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/gc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cartridge containing a filmstrip"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007pg/01-c"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "gc",
   :skos/prefLabel "filmstrip cartridge"})

(def gd
  "A short stip of film usually in a rigid format rather than rolled"
  {:db/ident :loc.carriers/gd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "filmslip",
   :madsrdf/code "gd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A short stip of film usually in a rigid format rather than rolled"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007pg/01-d"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_ProjectedImageCarriers
    :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/gd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A short stip of film usually in a rigid format rather than rolled"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007pg/01-d"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "gd",
   :skos/prefLabel "filmslip"})

(def gf
  "A roll of film -- with or without recorded sound -- containing a succession of images intended for projection one at a time"
  {:db/ident :loc.carriers/gf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "filmstrip",
   :madsrdf/code "gf",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A roll of film -- with or without recorded sound -- containing a succession of images intended for projection one at a time"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007pg/01-f"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_ProjectedImageCarriers
    :loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/gf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A roll of film -- with or without recorded sound -- containing a succession of images intended for projection one at a time"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007pg/01-f"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "gf",
   :skos/prefLabel "filmstrip"})

(def gs
  "A small sheet of transparent material -- usually in a protective mount -- bearing an image designed for use with a slide projector or viewer"
  {:db/ident :loc.carriers/gs,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "slide",
   :madsrdf/code "gs",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A small sheet of transparent material -- usually in a protective mount -- bearing an image designed for use with a slide projector or viewer"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007pg/01-s"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_ProjectedImageCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/gs,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A small sheet of transparent material -- usually in a protective mount -- bearing an image designed for use with a slide projector or viewer"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007pg/01-s"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "gs",
   :skos/prefLabel "slide"})

(def gt
  "A sheet of transparent material -- with or without a protective mount -- bearing in image designed for use with an overhead projector"
  {:db/ident :loc.carriers/gt,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "overhead transparency",
   :madsrdf/code "gt",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A sheet of transparent material -- with or without a protective mount -- bearing in image designed for use with an overhead projector"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007pg/01-t"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_RDACarriers
    :loc.carriers/collection_ProjectedImageCarriers
    :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/gt,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A sheet of transparent material -- with or without a protective mount -- bearing in image designed for use with an overhead projector"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007pg/01-t"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "gt",
   :skos/prefLabel "overhead transparency"})

(def ha
  "A card with one or more rectangular openings or apertures holding frames of microfilm"
  {:db/ident :loc.carriers/ha,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "aperture card",
   :madsrdf/code "ha",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A card with one or more rectangular openings or apertures holding frames of microfilm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-a"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_Carriers
                                      :loc.carriers/collection_MicroformCarriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/ha,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A card with one or more rectangular openings or apertures holding frames of microfilm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-a"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "ha",
   :skos/prefLabel "aperture card"})

(def hb
  "A cartridge containing a microfilm"
  {:db/ident :loc.carriers/hb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microfilm cartridge",
   :madsrdf/code "hb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A cartridge containing a microfilm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-b"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_Carriers
                                      :loc.carriers/collection_MicroformCarriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/hb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cartridge containing a microfilm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-b"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "hb",
   :skos/prefLabel "microfilm cartridge"})

(def hc
  "A cassette containing a microfilm"
  {:db/ident :loc.carriers/hc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microfilm cassette",
   :madsrdf/code "hc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A cassette containing a microfilm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-c"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_MicroformCarriers
                                      :loc.carriers/collection_Carriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/hc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cassette containing a microfilm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-c"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "hc",
   :skos/prefLabel "microfilm cassette"})

(def hd
  "An open reel holding a microfilm to be threaded into a microfilm reader"
  {:db/ident :loc.carriers/hd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microfilm reel",
   :madsrdf/code "hd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a microfilm to be threaded into a microfilm reader"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-d"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_Carriers
                                      :loc.carriers/collection_MicroformCarriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/hd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a microfilm to be threaded into a microfilm reader"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-d"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "hd",
   :skos/prefLabel "microfilm reel"})

(def he
  "A sheet of film bearing a number of microimages in a two-dimensional array"
  {:db/ident :loc.carriers/he,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microfiche",
   :madsrdf/code "he",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A sheet of film bearing a number of microimages in a two-dimensional array"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-e"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_MicroformCarriers
                                      :loc.carriers/collection_Carriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/he,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A sheet of film bearing a number of microimages in a two-dimensional array"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-e"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "he",
   :skos/prefLabel "microfiche"})

(def hf
  "A cassette containing uncut microfiches"
  {:db/ident :loc.carriers/hf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microfiche cassette",
   :madsrdf/code "hf",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A cassette containing uncut microfiches"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-f"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_MicroformCarriers
                                      :loc.carriers/collection_Carriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/hf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cassette containing uncut microfiches"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-f"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "hf",
   :skos/prefLabel "microfiche cassette"})

(def hg
  "A card or sheet of opaque material bering a umber of microimages in a two-diemnsional array"
  {:db/ident :loc.carriers/hg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microopaque",
   :madsrdf/code "hg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A card or sheet of opaque material bering a umber of microimages in a two-diemnsional array"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-g"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_MicroformCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/hg,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A card or sheet of opaque material bering a umber of microimages in a two-diemnsional array"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-g"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "hg",
   :skos/prefLabel "microopaque"})

(def hh
  "A short strip of microfilm cut from a roll"
  {:db/ident :loc.carriers/hh,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microfilm slip",
   :madsrdf/code "hh",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A short strip of microfilm cut from a roll"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-h"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_MicroformCarriers
                                      :loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/hh,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "A short strip of microfilm cut from a roll"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-h"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "hh",
   :skos/prefLabel "microfilm slip"})

(def hj
  "A wound length of microfilm"
  {:db/ident :loc.carriers/hj,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microfilm roll",
   :madsrdf/code "hj",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A wound length of microfilm"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-j"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_RDACarriers
    :loc.carriers/collection_Carriers
    :loc.carriers/collection_MicroformCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/hj,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A wound length of microfilm"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-j"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "hj",
   :skos/prefLabel "microfilm roll"})

(def hz
  "A microform carrier not represented by existing carrier types"
  {:db/ident :loc.carriers/hz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other microform carrier",
   :madsrdf/code "hz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A microform carrier not represented by existing carrier types"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mi/01-z"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_MicroformCarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/hz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A microform carrier not represented by existing carrier types"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mi/01-z"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "hz",
   :skos/prefLabel "other microform carrier"})

(def mc
  "A cartridge containing a motion picture film"
  {:db/ident :loc.carriers/mc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "film cartridge",
   :madsrdf/code "mc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A cartridge containing a motion picture film"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mpic/01-c"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_ProjectedImageCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/mc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "A cartridge containing a motion picture film"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mpic/01-c"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "mc",
   :skos/prefLabel "film cartridge"})

(def mf
  "A cassette containing a motion picture film"
  {:db/ident :loc.carriers/mf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "film cassette",
   :madsrdf/code "mf",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A cassette containing a motion picture film"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mpic/01-f"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_ProjectedImageCarriers
    :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/mf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "A cassette containing a motion picture film"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mpic/01-f"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "mf",
   :skos/prefLabel "film cassette"})

(def mo
  "A wound length of film"
  {:db/ident :loc.carriers/mo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "film roll",
   :madsrdf/code "mo",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A wound length of film"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mpic/01-o"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_ProjectedImageCarriers
    :loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/mo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A wound length of film"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mpic/01-o"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "mo",
   :skos/prefLabel "film roll"})

(def mr
  "An open reel holding a motion picture film to be used with a motion picture film projector"
  {:db/ident :loc.carriers/mr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "film reel",
   :madsrdf/code "mr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a motion picture film to be used with a motion picture film projector"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mpic/01-r"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_RDACarriers
    :loc.carriers/collection_ProjectedImageCarriers
    :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/mr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a motion picture film to be used with a motion picture film projector"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mpic/01-r"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "mr",
   :skos/prefLabel "film reel"})

(def mz
  "A projected carrier not represented by existing carrier types"
  {:db/ident :loc.carriers/mz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other projected carrier",
   :madsrdf/code "mz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "A projected carrier not represented by existing carrier types"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007mpic/01-z ; 007pg/01-z"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_ProjectedImageCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/mz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A projected carrier not represented by existing carrier types"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007mpic/01-z ; 007pg/01-z"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "mz",
   :skos/prefLabel "other projected carrier"})

(def na
  "A wound length of paper, film, tape, etc."
  {:db/ident :loc.carriers/na,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "roll",
   :madsrdf/code "na",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A wound length of paper, film, tape, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007/01-no code"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_UnmediatedCarriers
    :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/na,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A wound length of paper, film, tape, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007/01-no code"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "na",
   :skos/prefLabel "roll"})

(def nb
  "A flat, thin piece of paper, plastic, etc."
  {:db/ident :loc.carriers/nb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "sheet",
   :madsrdf/code "nb",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "A flat, thin piece of paper, plastic, etc."},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007/01-no code"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_UnmediatedCarriers
    :loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/nb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value "A flat, thin piece of paper, plastic, etc."},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007/01-no code"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "nb",
   :skos/prefLabel "sheet"})

(def nc
  "One or more sheets bound or fastened together to form a single unit"
  {:db/ident :loc.carriers/nc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "volume",
   :madsrdf/code "nc",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "One or more sheets bound or fastened together to form a single unit"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007/01-no code"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_UnmediatedCarriers
    :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/nc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "One or more sheets bound or fastened together to form a single unit"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007/01-no code"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "nc",
   :skos/prefLabel "volume"})

(def nn
  "A hinging device holding two or more sheets designed for use on an easel"
  {:db/ident :loc.carriers/nn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "flipchart",
   :madsrdf/code "nn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A hinging device holding two or more sheets designed for use on an easel"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007npg/01-f"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_RDACarriers
    :loc.carriers/collection_UnmediatedCarriers
    :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/nn,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A hinging device holding two or more sheets designed for use on an easel"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007npg/01-f"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "nn",
   :skos/prefLabel "flipchart"})

(def no
  "A small sheet of opaque material"
  {:db/ident :loc.carriers/no,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "card",
   :madsrdf/code "no",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A small sheet of opaque material"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007npg/01-o"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_UnmediatedCarriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/no,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A small sheet of opaque material"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007npg/01-o"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "no",
   :skos/prefLabel "card"})

(def nr
  "A three-dimensional artifact, a replica of an artifact or a naturally-occurring object"
  {:db/ident :loc.carriers/nr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "object",
   :madsrdf/code "nr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A three-dimensional artifact, a replica of an artifact or a naturally-occurring object"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:Leader/06-r"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_UnmediatedCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/nr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A three-dimensional artifact, a replica of an artifact or a naturally-occurring object"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:Leader/06-r"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "nr",
   :skos/prefLabel "object"})

(def nz
  "An unmediated carrier not represented by existing carrier types"
  {:db/ident :loc.carriers/nz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other unmediated carrier",
   :madsrdf/code "nz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An unmediated carrier not represented by existing carrier types"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007/01-no code"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_UnmediatedCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/nz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An unmediated carrier not represented by existing carrier types"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007/01-no code"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "nz",
   :skos/prefLabel "other unmediated carrier"})

(def pp
  "A small sheet of transparent materials -- with or without a protective mount -- bearing a minute object"
  {:db/ident :loc.carriers/pp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "microscope slide",
   :madsrdf/code "pp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A small sheet of transparent materials -- with or without a protective mount -- bearing a minute object"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:008vm/33-p"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_MicroscopicCarriers
    :loc.carriers/collection_RDACarriers
    :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/pp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A small sheet of transparent materials -- with or without a protective mount -- bearing a minute object"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:008vm/33-p"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "pp",
   :skos/prefLabel "microscope slide"})

(def pz
  "A microscopic carrier not represented by existing carrier types"
  {:db/ident :loc.carriers/pz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other microscopic carrier",
   :madsrdf/code "pz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A microscopic carrier not represented by existing carrier types"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007/01-no code"},
   :madsrdf/isMemberOfMADSCollection
   [:loc.carriers/collection_Carriers
    :loc.carriers/collection_MicroscopicCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/pz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A microscopic carrier not represented by existing carrier types"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007/01-no code"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "pz",
   :skos/prefLabel "other microscopic carrier"})

(def sb
  "A loop of flexible plastic or magnetic film on which audio signals are mechanically recorded"
  {:db/ident :loc.carriers/sb,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "audio belt",
   :madsrdf/code "sb",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A loop of flexible plastic or magnetic film on which audio signals are mechanically recorded"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007sr/01-no code"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_AudioCarriers
                                      :loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/sb,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A loop of flexible plastic or magnetic film on which audio signals are mechanically recorded"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007sr/01-no code"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "sb",
   :skos/prefLabel "audio belt"})

(def sd
  "A disc on which sound waves are incised or indented in a continuous spiral groove"
  {:db/ident :loc.carriers/sd,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-01-23T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "audio disc",
   :madsrdf/code "sd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A disc on which sound waves are incised or indented in a continuous spiral groove"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/01-d"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_Carriers
                                      :loc.carriers/collection_AudioCarriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2020-01-23T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.carriers/sd,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2014-01-23T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.carriers/sd,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A disc on which sound waves are incised or indented in a continuous spiral groove"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/01-d"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "sd",
   :skos/prefLabel "audio disc"})

(def se
  "A roller-shaped object on which sound waves are incised or indented in a continuous circular groove"
  {:db/ident :loc.carriers/se,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "audio cylinder",
   :madsrdf/code "se",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A roller-shaped object on which sound waves are incised or indented in a continuous circular groove"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/01-e"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_AudioCarriers
                                      :loc.carriers/collection_Carriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/se,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A roller-shaped object on which sound waves are incised or indented in a continuous circular groove"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/01-e"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "se",
   :skos/prefLabel "audio cylinder"})

(def sg
  "A cartridge containing an audio tape"
  {:db/ident :loc.carriers/sg,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "audio cartridge",
   :madsrdf/code "sg",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "A cartridge containing an audio tape"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/01-g"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_AudioCarriers
                                      :loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/sg,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cartridge containing an audio tape"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/01-g"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "sg",
   :skos/prefLabel "audio cartridge"})

(def si
  "An open reel holding a length of film on which sound is recorded"
  {:db/ident :loc.carriers/si,
   :madsrdf/adminMetadata
   [{:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "new"}
    {:rdf/type :ri/RecordInfo,
     :ri/recordChangeDate #inst "2020-08-14T04:00:00.000-00:00",
     :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
     :ri/recordStatus "modified"}],
   :madsrdf/authoritativeLabel "sound track reel",
   :madsrdf/code "si",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a length of film on which sound is recorded"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "sound-track reel",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/01-i"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_AudioCarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "sound-track reel",
   :skos/changeNote
   [{:cs/changeReason    "modified",
     :cs/createdDate     #inst "2020-08-14T04:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.carriers/si,
     :rdf/type           :cs/ChangeSet}
    {:cs/changeReason    "new",
     :cs/createdDate     #inst "2014-01-23T05:00:00.000-00:00",
     :cs/creatorName     "https://id.loc.gov/vocabulary/organizations/dlc",
     :cs/subjectOfChange :loc.carriers/si,
     :rdf/type           :cs/ChangeSet}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a length of film on which sound is recorded"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/01-i"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "si",
   :skos/prefLabel "sound track reel",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "sound-track reel"}})

(def sq
  "A roll of paper on which musical notes are represented by perforations"
  {:db/ident :loc.carriers/sq,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "audio roll",
   :madsrdf/code "sq",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A roll of paper on which musical notes are represented by perforations"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/01-q"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_AudioCarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/sq,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A roll of paper on which musical notes are represented by perforations"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/01-q"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "sq",
   :skos/prefLabel "audio roll"})

(def ss
  "A cassette containing an audiotape"
  {:db/ident :loc.carriers/ss,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "audiocassette",
   :madsrdf/code "ss",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A cassette containing an audiotape"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/01-s"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_AudioCarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/ss,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cassette containing an audiotape"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/01-s"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "ss",
   :skos/prefLabel "audiocassette"})

(def st
  "An open reel holding a length of audiotape to be used with reel-to-reel equipment"
  {:db/ident :loc.carriers/st,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "audiotape reel",
   :madsrdf/code "st",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a length of audiotape to be used with reel-to-reel equipment"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/01-t"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_AudioCarriers
                                      :loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/st,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a length of audiotape to be used with reel-to-reel equipment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/01-t"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "st",
   :skos/prefLabel "audiotape reel"})

(def sw
  "A reel or spool of steel or stainless steel wire upon which audio signals are magnetically recorded"
  {:db/ident :loc.carriers/sw,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "audio wire reel",
   :madsrdf/code "sw",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A reel or spool of steel or stainless steel wire upon which audio signals are magnetically recorded"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007sr/01-w"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_AudioCarriers
                                      :loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/sw,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A reel or spool of steel or stainless steel wire upon which audio signals are magnetically recorded"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007sr/01-w"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "sw",
   :skos/prefLabel "audio wire reel"})

(def sz
  "An audio carrier not represented by existing carrier types"
  {:db/ident :loc.carriers/sz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other audio carrier",
   :madsrdf/code "sz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "An audio carrier not represented by existing carrier types"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/01-z"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_Carriers
                                      :loc.carriers/collection_AudioCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/sz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "An audio carrier not represented by existing carrier types"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/01-z"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "sz",
   :skos/prefLabel "other audio carrier"})

(def vc
  "A cartridge containing a video tape"
  {:db/ident :loc.carriers/vc,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "video cartridge",
   :madsrdf/code "vc",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "A cartridge containing a video tape"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007vi/01-c"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_VideoCarriers
                                      :loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/vc,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cartridge containing a video tape"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007vi/01-c"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "vc",
   :skos/prefLabel "video cartridge"})

(def vd
  "A disc on which video signals, with or without sound, are recorded"
  {:db/ident :loc.carriers/vd,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "videodisc",
   :madsrdf/code "vd",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "A disc on which video signals, with or without sound, are recorded"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007vi/01-d"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_Carriers
                                      :loc.carriers/collection_VideoCarriers
                                      :loc.carriers/collection_RDACarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/vd,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A disc on which video signals, with or without sound, are recorded"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007vi/01-d"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "vd",
   :skos/prefLabel "videodisc"})

(def vf
  "A cassette containing a video tape"
  {:db/ident :loc.carriers/vf,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "videocassette",
   :madsrdf/code "vf",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value    "A cassette containing a video tape"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007vi/01-f"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers
                                      :loc.carriers/collection_VideoCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/vf,
                     :rdf/type :cs/ChangeSet},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A cassette containing a video tape"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007vi/01-f"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "vf",
   :skos/prefLabel "videocassette"})

(def vr
  "An open reel holding a video tape for use with reel-to-reel equipment"
  {:db/ident :loc.carriers/vr,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "videotape reel",
   :madsrdf/code "vr",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a video tape for use with reel-to-reel equipment"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007vi/01-r"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_RDACarriers
                                      :loc.carriers/collection_Carriers
                                      :loc.carriers/collection_VideoCarriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/vr,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An open reel holding a video tape for use with reel-to-reel equipment"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007vi/01-r"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "vr",
   :skos/prefLabel "videotape reel"})

(def vz
  "A video carrier not represented by existing carrier types"
  {:db/ident :loc.carriers/vz,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "other video carrier",
   :madsrdf/code "vz",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value    "A video carrier not represented by existing carrier types"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib:007vi/01-z"},
   :madsrdf/isMemberOfMADSCollection [:loc.carriers/collection_VideoCarriers
                                      :loc.carriers/collection_Carriers],
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/carriers,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.carriers/vz,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "A video carrier not represented by existing carrier types"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib:007vi/01-z"},
   :skos/inScheme :loc.vocabulary/carriers,
   :skos/notation "vz",
   :skos/prefLabel "other video carrier"})

(def ^{:private true} carriers
  "Values representing the format of the storage medium and housing of a carrier in combination with the type of intermediation device required to views, play, run, etc., the content of a resource"
  {:db/ident :loc.vocabulary/carriers,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2014-01-23T05:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Values representing the format of the storage medium and housing of a carrier in combination with the type of intermediation device required to views, play, run, etc., the content of a resource"},
   :madsrdf/hasMADSSchemeMember [:loc.carriers/mo
                                 :loc.carriers/vf
                                 :loc.carriers/hh
                                 :loc.carriers/vz
                                 :loc.carriers/hj
                                 :loc.carriers/hd
                                 :loc.carriers/sw
                                 :loc.carriers/cf
                                 :loc.carriers/cr
                                 :loc.carriers/gd
                                 :loc.carriers/cz
                                 :loc.carriers/nc
                                 :loc.carriers/hg
                                 :loc.carriers/no
                                 :loc.carriers/st
                                 :loc.carriers/gs
                                 :loc.carriers/hb
                                 :loc.carriers/sq
                                 :loc.carriers/es
                                 :loc.carriers/cd
                                 :loc.carriers/ca
                                 :loc.carriers/pp
                                 :loc.carriers/vc
                                 :loc.carriers/sb
                                 :loc.carriers/he
                                 :loc.carriers/vr
                                 :loc.carriers/hz
                                 :loc.carriers/se
                                 :loc.carriers/ch
                                 :loc.carriers/mf
                                 :loc.carriers/gt
                                 :loc.carriers/mr
                                 :loc.carriers/ha
                                 :loc.carriers/hc
                                 :loc.carriers/mc
                                 :loc.carriers/ez
                                 :loc.carriers/vd
                                 :loc.carriers/pz
                                 :loc.carriers/sg
                                 :loc.carriers/sz
                                 :loc.carriers/nr
                                 :loc.carriers/nz
                                 :loc.carriers/gf
                                 :loc.carriers/ck
                                 :loc.carriers/na
                                 :loc.carriers/sd
                                 :loc.carriers/gc
                                 :loc.carriers/mz
                                 :loc.carriers/eh
                                 :loc.carriers/nb
                                 :loc.carriers/hf
                                 :loc.carriers/nn
                                 :loc.carriers/ss
                                 :loc.carriers/cb
                                 :loc.carriers/si
                                 :loc.carriers/ce],
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Carriers Scheme"},
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2014-01-23T05:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.vocabulary/carriers,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Values representing the format of the storage medium and housing of a carrier in combination with the type of intermediation device required to views, play, run, etc., the content of a resource"}})