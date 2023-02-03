(ns net.wikipunk.rdf.loc.mproduction
  "http://id.loc.gov/vocabulary/mproduction/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mproduction.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "cs" "http://purl.org/vocab/changeset/schema#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mproduction"
                       "http://id.loc.gov/vocabulary/mproduction/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "ri" "http://id.loc.gov/ontologies/RecordInfo#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mproduction",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mproduction/"}
  (:refer-clojure :exclude [print]))

(def blueline
  "Production method consisting of a contact printing process based on diazonium salt and azo dye chemical reactions that renders all opaque tones or colours as blue on a neutral background"
  {:db/ident :loc.mproduction/blueline,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "blueline process",
   :madsrdf/code "blueline",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a contact printing process based on diazonium salt and azo dye chemical reactions that renders all opaque tones or colours as blue on a neutral background"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d; 007mp/06-a"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/blueline,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a contact printing process based on diazonium salt and azo dye chemical reactions that renders all opaque tones or colours as blue on a neutral background"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d; 007mp/06-a"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "blueline",
   :skos/prefLabel "blueline process"})

(def blueprint
  "Production method consisting of a contact printing process based on iron salt chemical reactions that renders all opaque tones or colours as white on a blue background"
  {:db/ident :loc.mproduction/blueprint,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "blueprint process",
   :madsrdf/code "blueprint",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a contact printing process based on iron salt chemical reactions that renders all opaque tones or colours as white on a blue background"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/blueprint,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a contact printing process based on iron salt chemical reactions that renders all opaque tones or colours as white on a blue background"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "blueprint",
   :skos/prefLabel "blueprint process"})

(def burn
  "Production method consisting of the application of heat to mark the surface of a material"
  {:db/ident :loc.mproduction/burn,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "burning",
   :madsrdf/code "burn",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of the application of heat to mark the surface of a material"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/burn,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of the application of heat to mark the surface of a material"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "burn",
   :skos/prefLabel "burning"})

(def collo
  "Production method consisting of a contact printing process using a dichromate chemical reaction that hardens gelatin on exposure to ultraviolet light to produce a positive master that is subsequently used in a lithographic process"
  {:db/ident :loc.mproduction/collo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "collotype",
   :madsrdf/code "collo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a contact printing process using a dichromate chemical reaction that hardens gelatin on exposure to ultraviolet light to produce a positive master that is subsequently used in a lithographic process"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/collo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a contact printing process using a dichromate chemical reaction that hardens gelatin on exposure to ultraviolet light to produce a positive master that is subsequently used in a lithographic process"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "collo",
   :skos/prefLabel "collotype"})

(def daguerre
  "Production method consisting of a photographic process using a silver-coated copper plate that is exposed in a camera and subsequently developed, usually using mercury vapour, and fixed with salt to create a positive image"
  {:db/ident :loc.mproduction/daguerre,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "daguerreotype process",
   :madsrdf/code "daguerre",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a photographic process using a silver-coated copper plate that is exposed in a camera and subsequently developed, usually using mercury vapour, and fixed with salt to create a positive image"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/daguerre,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a photographic process using a silver-coated copper plate that is exposed in a camera and subsequently developed, usually using mercury vapour, and fixed with salt to create a positive image"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "daguerre",
   :skos/prefLabel "daguerreotype process"})

(def duallayer
  "Production method for a recording technology that creates two individual layers on a single-sided DVD disc and doubles the amount of recording space on the disc"
  {:db/ident :loc.mproduction/duallayer,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2019-08-09T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "dual layer",
   :madsrdf/code "duallayer",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method for a recording technology that creates two individual layers on a single-sided DVD disc and doubles the amount of recording space on the disc"},
   :madsrdf/hasVariant {:madsrdf/variantLabel "double layer",
                        :rdf/type :madsrdf/Variant},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/altLabel "double layer",
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2019-08-09T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/duallayer,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method for a recording technology that creates two individual layers on a single-sided DVD disc and doubles the amount of recording space on the disc"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "duallayer",
   :skos/prefLabel "dual layer",
   :skosxl/altLabel {:rdf/type :skosxl/Label,
                     :skosxl/literalForm "double layer"}})

(def emboss
  "Production method consisting of the use of either a metal or plastic sheet as a master with specialized equipment to produce copies for a manifestation of a tactile expresssion"
  {:db/ident :loc.mproduction/emboss,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "embossing",
   :madsrdf/code "emboss",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of the use of either a metal or plastic sheet as a master with specialized equipment to produce copies for a manifestation of a tactile expresssion"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/emboss,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of the use of either a metal or plastic sheet as a master with specialized equipment to produce copies for a manifestation of a tactile expresssion"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "emboss",
   :skos/prefLabel "embossing"})

(def engrav
  "Production method consisting of the incision of marks on the surface of a hard material using a sharp tool"
  {:db/ident :loc.mproduction/engrav,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "engraving",
   :madsrdf/code "engrav",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of the incision of marks on the surface of a hard material using a sharp tool"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/engrav,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of the incision of marks on the surface of a hard material using a sharp tool"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "engrav",
   :skos/prefLabel "engraving"})

(def etch
  "Production method consisting of an intaglio process in which the design is worked into an acid-resistant substance coating the metal printing plate; the plate is then exposed to acid, which etches the plate where the metal is exposed, to create lines and dark areas"
  {:db/ident :loc.mproduction/etch,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "etching",
   :madsrdf/code "etch",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of an intaglio process in which the design is worked into an acid-resistant substance coating the metal printing plate; the plate is then exposed to acid, which etches the plate where the metal is exposed, to create lines and dark areas"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/etch,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of an intaglio process in which the design is worked into an acid-resistant substance coating the metal printing plate; the plate is then exposed to acid, which etches the plate where the metal is exposed, to create lines and dark areas"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "etch",
   :skos/prefLabel "etching"})

(def inscrib
  "Production method consisting of Process that fixes signs and symbols onto a base material by cutting into the surface"
  {:db/ident :loc.mproduction/inscrib,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "inscribing",
   :madsrdf/code "inscrib",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of Process that fixes signs and symbols onto a base material by cutting into the surface"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/inscrib,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of Process that fixes signs and symbols onto a base material by cutting into the surface"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "inscrib",
   :skos/prefLabel "inscribing"})

(def litho
  "Production method consisting of a planographic printing process in which a stone or plate is prepared using a water-repelling substance making parts of the plate receptive to ink"
  {:db/ident :loc.mproduction/litho,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "lithography",
   :madsrdf/code "litho",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a planographic printing process in which a stone or plate is prepared using a water-repelling substance making parts of the plate receptive to ink"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/litho,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a planographic printing process in which a stone or plate is prepared using a water-repelling substance making parts of the plate receptive to ink"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "litho",
   :skos/prefLabel "lithography"})

(def photocopy
  "Production method consisting of a macroform photoreproduction process using radiant energy in contact with or projected on opaque material"
  {:db/ident :loc.mproduction/photocopy,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "photocopying",
   :madsrdf/code "photocopy",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a macroform photoreproduction process using radiant energy in contact with or projected on opaque material"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d; 007mp/06-a,b"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/photocopy,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a macroform photoreproduction process using radiant energy in contact with or projected on opaque material"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d; 007mp/06-a,b"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "photocopy",
   :skos/prefLabel "photocopying"})

(def photoeng
  "Production method consisting of a photomechanical process for the preparation of chemically etched printing plates"
  {:db/ident :loc.mproduction/photoeng,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "photoengraving",
   :madsrdf/code "photoeng",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a photomechanical process for the preparation of chemically etched printing plates"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/photoeng,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a photomechanical process for the preparation of chemically etched printing plates"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "photoeng",
   :skos/prefLabel "photoengraving"})

(def photograv
  "Production method consisting of an intaglio process in which the metal printing plate is prepared using a dichromate process to leave a gelatin resist coating of varying thickness that is etched to form cells of varying depth able to hold different amounts of ink"
  {:db/ident :loc.mproduction/photograv,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "photogravure process",
   :madsrdf/code "photograv",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of an intaglio process in which the metal printing plate is prepared using a dichromate process to leave a gelatin resist coating of varying thickness that is etched to form cells of varying depth able to hold different amounts of ink"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/photograv,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of an intaglio process in which the metal printing plate is prepared using a dichromate process to leave a gelatin resist coating of varying thickness that is etched to form cells of varying depth able to hold different amounts of ink"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "photograv",
   :skos/prefLabel "photogravure process"})

(def print
  "Production method consisting of Process that transfers a pictorial or textual image from a master carrier to the surface of another carrier, often using a plate, block, stone, or screen coated with a transferable material. Includes the production of photographic prints and paper copies of stored computer data"
  {:db/ident :loc.mproduction/print,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "printing",
   :madsrdf/code "print",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of Process that transfers a pictorial or textual image from a master carrier to the surface of another carrier, often using a plate, block, stone, or screen coated with a transferable material. Includes the production of photographic prints and paper copies of stored computer data"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/print,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of Process that transfers a pictorial or textual image from a master carrier to the surface of another carrier, often using a plate, block, stone, or screen coated with a transferable material. Includes the production of photographic prints and paper copies of stored computer data"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "print",
   :skos/prefLabel "printing"})

(def solid
  "Production method for a manifestation of a tactile expression in which solid plastic dots are heat sealed onto the surface of thin but strong paper"
  {:db/ident :loc.mproduction/solid,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "solid dot",
   :madsrdf/code "solid",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method for a manifestation of a tactile expression in which solid plastic dots are heat sealed onto the surface of thin but strong paper"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/solid,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method for a manifestation of a tactile expression in which solid plastic dots are heat sealed onto the surface of thin but strong paper"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "solid",
   :skos/prefLabel "solid dot"})

(def stamp
  "Production method consisting of the application of pressure to make an impression on the surface of a material"
  {:db/ident :loc.mproduction/stamp,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "stamping",
   :madsrdf/code "stamp",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of the application of pressure to make an impression on the surface of a material"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/stamp,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of the application of pressure to make an impression on the surface of a material"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "stamp",
   :skos/prefLabel "stamping"})

(def swell
  "Production method for a manifestation of a tactile expression in which an image is printed on a special type of paper with embedded microcapsules of alcohol which burst when exposed to heat to make the surface of the paper swell up"
  {:db/ident :loc.mproduction/swell,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "swell paper",
   :madsrdf/code "swell",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method for a manifestation of a tactile expression in which an image is printed on a special type of paper with embedded microcapsules of alcohol which burst when exposed to heat to make the surface of the paper swell up"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/swell,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method for a manifestation of a tactile expression in which an image is printed on a special type of paper with embedded microcapsules of alcohol which burst when exposed to heat to make the surface of the paper swell up"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "swell",
   :skos/prefLabel "swell paper"})

(def thermo
  "Production method for a manifestation of a tactile expression in which a collage master is covered with a sheet of plastic, which is heated and vacuumed to generate a copy of a model or diagram"
  {:db/ident :loc.mproduction/thermo,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "thermoform",
   :madsrdf/code "thermo",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method for a manifestation of a tactile expression in which a collage master is covered with a sheet of plastic, which is heated and vacuumed to generate a copy of a model or diagram"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/thermo,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method for a manifestation of a tactile expression in which a collage master is covered with a sheet of plastic, which is heated and vacuumed to generate a copy of a model or diagram"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "thermo",
   :skos/prefLabel "thermoform"})

(def white
  "Production method consisting of a contact printing process based on a light sensitive process that renders all opaque tones or colours as black or a colour on a white background"
  {:db/ident :loc.mproduction/white,
   :madsrdf/adminMetadata
   {:rdf/type :ri/RecordInfo,
    :ri/recordChangeDate #inst "2017-09-22T04:00:00.000-00:00",
    :ri/recordContentSource "https://id.loc.gov/vocabulary/organizations/dlc",
    :ri/recordStatus "new"},
   :madsrdf/authoritativeLabel "white print process",
   :madsrdf/code "white",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a contact printing process based on a light sensitive process that renders all opaque tones or colours as black or a colour on a white background"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $d"},
   :madsrdf/isMemberOfMADSCollection :loc.mproduction/collection_mproduction,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mproduction,
   :rdf/type :madsrdf/Authority,
   :skos/changeNote {:cs/changeReason "new",
                     :cs/createdDate #inst "2017-09-22T04:00:00.000-00:00",
                     :cs/creatorName
                     "https://id.loc.gov/vocabulary/organizations/dlc",
                     :cs/subjectOfChange :loc.mproduction/white,
                     :rdf/type :cs/ChangeSet},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Production method consisting of a contact printing process based on a light sensitive process that renders all opaque tones or colours as black or a colour on a white background"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $d"},
   :skos/inScheme :loc.vocabulary/mproduction,
   :skos/notation "white",
   :skos/prefLabel "white print process"})

(def ^{:private true} mproduction
  "A process used to produce a resource"
  {:db/ident              :loc.vocabulary/mproduction,
   :madsrdf/adminMetadata {:rdf/type :ri/RecordInfo,
                           :ri/recordChangeDate
                           #inst "2017-09-22T04:00:00.000-00:00",
                           :ri/recordContentSource
                           "https://id.loc.gov/vocabulary/organizations/dlc",
                           :ri/recordStatus "new"},
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value "A process used to produce a resource"},
   :madsrdf/hasMADSSchemeMember [:loc.mproduction/blueprint
                                 :loc.mproduction/print
                                 :loc.mproduction/photoeng
                                 :loc.mproduction/solid
                                 :loc.mproduction/photocopy
                                 :loc.mproduction/swell
                                 :loc.mproduction/stamp
                                 :loc.mproduction/collo
                                 :loc.mproduction/daguerre
                                 :loc.mproduction/thermo
                                 :loc.mproduction/burn
                                 :loc.mproduction/white
                                 :loc.mproduction/duallayer
                                 :loc.mproduction/litho
                                 :loc.mproduction/photograv
                                 :loc.mproduction/etch
                                 :loc.mproduction/blueline
                                 :loc.mproduction/inscrib
                                 :loc.mproduction/engrav
                                 :loc.mproduction/emboss],
   :rdf/type              [:madsrdf/MADSScheme :skos/ConceptScheme],
   :rdfs/comment          "",
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Production Method"},
   :skos/changeNote       {:cs/changeReason "new",
                           :cs/createdDate #inst
                                            "2017-09-22T04:00:00.000-00:00",
                           :cs/creatorName
                           "https://id.loc.gov/vocabulary/organizations/dlc",
                           :cs/subjectOfChange :loc.vocabulary/mproduction,
                           :rdf/type :cs/ChangeSet},
   :skos/definition       {:rdf/language "en",
                           :rdf/value "A process used to produce a resource"}})