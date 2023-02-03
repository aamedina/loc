(ns net.wikipunk.rdf.loc.mgeneration
  "http://id.loc.gov/vocabulary/mgeneration/"
  {:dcat/downloadURL  "https://id.loc.gov/vocabulary/mgeneration.rdf",
   :rdf/ns-prefix-map {"bf" "http://id.loc.gov/ontologies/bibframe/",
                       "bflc" "http://id.loc.gov/ontologies/bflc/",
                       "cc" "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "loc.mgeneration"
                       "http://id.loc.gov/vocabulary/mgeneration/",
                       "madsrdf" "http://www.loc.gov/mads/rdf/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xhtml" "http://www.w3.org/1999/xhtml"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "loc.mgeneration",
   :rdfa/uri          "http://id.loc.gov/vocabulary/mgeneration/"})

(def dervmaster
  "Generation that is derived from the master"
  {:db/ident :loc.mgeneration/dervmaster,
   :madsrdf/authoritativeLabel "derivative master",
   :madsrdf/code "dervmaster",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Generation that is derived from the master"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $j"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Generation that is derived from the master"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $j"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "dervmaster",
   :skos/prefLabel "derivative master"})

(def discmaster
  ".Generation that is a negative metal copy of a recording cut typically onto a lacquer-coated disc by means of a disc lathe; the lacquer original is destroyed in the process"
  {:db/ident :loc.mgeneration/discmaster,
   :madsrdf/authoritativeLabel "disc master",
   :madsrdf/code "discmaster",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    ".Generation that is a negative metal copy of a recording cut typically onto a lacquer-coated disc by means of a disc lathe; the lacquer original is destroyed in the process"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/09 - d"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    ".Generation that is a negative metal copy of a recording cut typically onto a lacquer-coated disc by means of a disc lathe; the lacquer original is destroyed in the process"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/09 - d"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "discmaster",
   :skos/prefLabel "disc master"})

(def dupe
  "Generation that is a reproduction, usually with negative polarity, of the original picture or sound track, where a duplicate negative is made from a master positive, which in turn was made from an earlier negative"
  {:db/ident :loc.mgeneration/dupe,
   :madsrdf/authoritativeLabel "duplicate",
   :madsrdf/code "dupe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is a reproduction, usually with negative polarity, of the original picture or sound track, where a duplicate negative is made from a master positive, which in turn was made from an earlier negative"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/11 - d"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is a reproduction, usually with negative polarity, of the original picture or sound track, where a duplicate negative is made from a master positive, which in turn was made from an earlier negative"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/11 - d"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "dupe",
   :skos/prefLabel "duplicate"})

(def facsimile
  "Generation which resembles the original in all aspects possible, but it is not the original"
  {:db/ident :loc.mgeneration/facsimile,
   :madsrdf/authoritativeLabel "facsimile",
   :madsrdf/code "facsimile",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation which resembles the original in all aspects possible, but it is not the original"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007/map/05-f"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation which resembles the original in all aspects possible, but it is not the original"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007/map/05-f"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "facsimile",
   :skos/prefLabel "facsimile"})

(def firstgen
  "Generation that is the original camera film or videotape used to record the production"
  {:db/ident :loc.mgeneration/firstgen,
   :madsrdf/authoritativeLabel "first generation",
   :madsrdf/code "firstgen",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is the original camera film or videotape used to record the production"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mi/11 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is the original camera film or videotape used to record the production"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mi/11 - a"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "firstgen",
   :skos/prefLabel "first generation"})

(def master
  "Generation that is created from the process of digitization at the highest resolution and often used to make derivative copies"
  {:db/ident :loc.mgeneration/master,
   :madsrdf/authoritativeLabel "master",
   :madsrdf/code "master",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is created from the process of digitization at the highest resolution and often used to make derivative copies"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/11 -e"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is created from the process of digitization at the highest resolution and often used to make derivative copies"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/11 -e"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "master",
   :skos/prefLabel "master"})

(def masterpos
  "Generation that is a positive print made from an earlier generation negative film and used for the preparation of duplicate negatives rather than projection"
  {:db/ident :loc.mgeneration/masterpos,
   :madsrdf/authoritativeLabel "master positive",
   :madsrdf/code "masterpos",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is a positive print made from an earlier generation negative film and used for the preparation of duplicate negatives rather than projection"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $j"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is a positive print made from an earlier generation negative film and used for the preparation of duplicate negatives rather than projection"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $j"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "masterpos",
   :skos/prefLabel "master positive"})

(def mastertape
  "Generation that is the original recorded version of a tape from which copies can be made"
  {:db/ident :loc.mgeneration/mastertape,
   :madsrdf/authoritativeLabel "master tape",
   :madsrdf/code "mastertape",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is the original recorded version of a tape from which copies can be made"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/09 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is the original recorded version of a tape from which copies can be made"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/09 - a"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "mastertape",
   :skos/prefLabel "master tape"})

(def mixedgen
  "Generation that is a combination of generations for which it is not possible to assign more precise terms"
  {:db/ident :loc.mgeneration/mixedgen,
   :madsrdf/authoritativeLabel "mixed generation",
   :madsrdf/code "mixedgen",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is a combination of generations for which it is not possible to assign more precise terms"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mi/11 - m"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is a combination of generations for which it is not possible to assign more precise terms"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mi/11 - m"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "mixedgen",
   :skos/prefLabel "mixed generation"})

(def mother
  "Generation that is a positive metal copy of a disc master used to create one or more stampers"
  {:db/ident :loc.mgeneration/mother,
   :madsrdf/authoritativeLabel "mother",
   :madsrdf/code "mother",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is a positive metal copy of a disc master used to create one or more stampers"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mi/11 - a"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is a positive metal copy of a disc master used to create one or more stampers"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mi/11 - a"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "mother",
   :skos/prefLabel "mother"})

(def original
  "Generation that is the first of a resource created digitally"
  {:db/ident :loc.mgeneration/original,
   :madsrdf/authoritativeLabel "original",
   :madsrdf/code "original",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value "Generation that is the first of a resource created digitally"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mpic/11 - o"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Generation that is the first of a resource created digitally"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mpic/11 - o"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "original",
   :skos/prefLabel "original"})

(def originalneg
  "Generation usually of negative polarity for film exposed in a camera and thus of better quality than any subsequent generation or derivative"
  {:db/ident :loc.mgeneration/originalneg,
   :madsrdf/authoritativeLabel "original negative",
   :madsrdf/code "originalneg",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation usually of negative polarity for film exposed in a camera and thus of better quality than any subsequent generation or derivative"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $j"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation usually of negative polarity for film exposed in a camera and thus of better quality than any subsequent generation or derivative"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $j"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "originalneg",
   :skos/prefLabel "original negative"})

(def paperpos
  "Generation of a positive image on photographic paper stock used for copyright registration of motion pictures, ca. 1894-1912"
  {:db/ident :loc.mgeneration/paperpos,
   :madsrdf/authoritativeLabel "paper positive",
   :madsrdf/code "paperpos",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation of a positive image on photographic paper stock used for copyright registration of motion pictures, ca. 1894-1912"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $j"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation of a positive image on photographic paper stock used for copyright registration of motion pictures, ca. 1894-1912"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $j"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "paperpos",
   :skos/prefLabel "paper positive"})

(def printmaster
  "Generation that is used to produce subsequent generations of microforms"
  {:db/ident :loc.mgeneration/printmaster,
   :madsrdf/authoritativeLabel "printing master",
   :madsrdf/code "printmaster",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is used to produce subsequent generations of microforms"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mi/11 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is used to produce subsequent generations of microforms"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mi/11 - b"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "printmaster",
   :skos/prefLabel "printing master"})

(def refprint
  "Generation that is a release print approved by the producer and director of a film"
  {:db/ident :loc.mgeneration/refprint,
   :madsrdf/authoritativeLabel "reference print",
   :madsrdf/code "refprint",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is a release print approved by the producer and director of a film"},
   :madsrdf/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 007mpic/11 - r (used viewing copy in conversion)"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is a release print approved by the producer and director of a film"},
   :skos/historyNote
   {:rdf/language "en",
    :rdf/value    "MARC bib: 007mpic/11 - r (used viewing copy in conversion)"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "refprint",
   :skos/prefLabel "reference print"})

(def reversal
  "Generation of a film that has been made directly from exposure to another negative or positive film, or sometimes exposed in a camera"
  {:db/ident :loc.mgeneration/reversal,
   :madsrdf/authoritativeLabel "reversal",
   :madsrdf/code "reversal",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation of a film that has been made directly from exposure to another negative or positive film, or sometimes exposed in a camera"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 340 $j"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation of a film that has been made directly from exposure to another negative or positive film, or sometimes exposed in a camera"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 340 $j"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "reversal",
   :skos/prefLabel "reversal"})

(def servcopy
  "Generation that is intended primarily for use"
  {:db/ident :loc.mgeneration/servcopy,
   :madsrdf/authoritativeLabel "service copy",
   :madsrdf/code "servcopy",
   :madsrdf/definitionNote {:rdf/language "en",
                            :rdf/value
                            "Generation that is intended primarily for use"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007mi/11 - c"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Generation that is intended primarily for use"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007mi/11 - c"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "servcopy",
   :skos/prefLabel "service copy"})

(def stamper
  "Generation that is a hard metal negative copy of a disc master that can be mounted within a press and used to impress the groove pattern in a production run of discs"
  {:db/ident :loc.mgeneration/stamper,
   :madsrdf/authoritativeLabel "stamper",
   :madsrdf/code "stamper",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is a hard metal negative copy of a disc master that can be mounted within a press and used to impress the groove pattern in a production run of discs"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/09 - s"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is a hard metal negative copy of a disc master that can be mounted within a press and used to impress the groove pattern in a production run of discs"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/09 - s"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "stamper",
   :skos/prefLabel "stamper"})

(def tapedupe
  "Generation that is a tape copy, usually a first generation copy of the master, used for creating multiple copies of the content"
  {:db/ident :loc.mgeneration/tapedupe,
   :madsrdf/authoritativeLabel "tape duplication master",
   :madsrdf/code "tapedupe",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is a tape copy, usually a first generation copy of the master, used for creating multiple copies of the content"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/09 - b"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is a tape copy, usually a first generation copy of the master, used for creating multiple copies of the content"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/09 - b"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "tapedupe",
   :skos/prefLabel "tape duplication master"})

(def testpress
  "Generation that is one of a short run of pressings used to check for any flaws before running a full pressing"
  {:db/ident :loc.mgeneration/testpress,
   :madsrdf/authoritativeLabel "test pressing",
   :madsrdf/code "testpress",
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Generation that is one of a short run of pressings used to check for any flaws before running a full pressing"},
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value    "MARC bib: 007sr/09 - t"},
   :madsrdf/isMemberOfMADSCollection :loc.mgeneration/collection_mgeneration,
   :madsrdf/isMemberOfMADSScheme :loc.vocabulary/mgeneration,
   :rdf/type :madsrdf/Authority,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Generation that is one of a short run of pressings used to check for any flaws before running a full pressing"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value    "MARC bib: 007sr/09 - t"},
   :skos/inScheme :loc.vocabulary/mgeneration,
   :skos/notation "testpress",
   :skos/prefLabel "test pressing"})

(def ^{:private true} mgeneration
  "Relationship between an original carrier and the carrier of a reproduction made from the original"
  {:db/ident :loc.vocabulary/mgeneration,
   :madsrdf/definitionNote
   {:rdf/language "en",
    :rdf/value
    "Relationship between an original carrier and the carrier of a reproduction made from the original"},
   :madsrdf/hasMADSSchemeMember [:loc.mgeneration/firstgen
                                 :loc.mgeneration/testpress
                                 :loc.mgeneration/mother
                                 :loc.mgeneration/dupe
                                 :loc.mgeneration/stamper
                                 :loc.mgeneration/reversal
                                 :loc.mgeneration/refprint
                                 :loc.mgeneration/facsimile
                                 :loc.mgeneration/discmaster
                                 :loc.mgeneration/servcopy
                                 :loc.mgeneration/original
                                 :loc.mgeneration/paperpos
                                 :loc.mgeneration/mixedgen
                                 :loc.mgeneration/mastertape
                                 :loc.mgeneration/dervmaster
                                 :loc.mgeneration/originalneg
                                 :loc.mgeneration/tapedupe
                                 :loc.mgeneration/printmaster
                                 :loc.mgeneration/master
                                 :loc.mgeneration/masterpos],
   :madsrdf/historyNote {:rdf/language "en",
                         :rdf/value
                         "MARC bib ; 340 $j; 007sr/09; 007mpic/mi/11"},
   :rdf/type [:skos/ConceptScheme :madsrdf/MADSScheme],
   :rdfs/comment "",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Generation"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relationship between an original carrier and the carrier of a reproduction made from the original"},
   :skos/historyNote {:rdf/language "en",
                      :rdf/value "MARC bib ; 340 $j; 007sr/09; 007mpic/mi/11"}})